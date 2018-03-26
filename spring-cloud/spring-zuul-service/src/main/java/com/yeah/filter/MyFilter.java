package com.yeah.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
/**
 * @描述： 路由过滤器
 * @作者： 杨珩
 * @日期： 2018年3月23日 下午10:48:15
 */
@Component
public class MyFilter extends ZuulFilter {
	private static Logger log = LoggerFactory.getLogger(MyFilter.class);
	/**
	 * @描述： 过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。
	 * @作者： 杨珩
	 * @日期： 2018年3月23日 下午10:53:16
	 * @return
	 * @throws ZuulException
	 * @see com.netflix.zuul.IZuulFilter#run()
	 */
	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("token");
        if(accessToken == null) {
            log.warn("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            }catch (Exception e){}

            return null;
        }
        log.info("ok");
        return null;
	}

	/**
	 * @描述： 这里可以写逻辑判断，是否要过滤，本文true,永远过滤。
	 * @作者： 杨珩
	 * @日期： 2018年3月23日 下午10:52:41
	 * @return
	 * @see com.netflix.zuul.IZuulFilter#shouldFilter()
	 */
	@Override
	public boolean shouldFilter() {
		return true;
	}

	/** 
	 * @描述： 过滤的顺序
	 * @作者： 杨珩
	 * @日期： 2018年3月23日 下午10:51:54
	 * @return
	 * @see com.netflix.zuul.ZuulFilter#filterOrder()
	 */
	@Override
	public int filterOrder() {
		return 0;
	}
	/** 
	 * @描述： 返回一个字符串代表过滤器的类型。因此不同类型的过滤器代表不同的生命周期的一环。
	 * pre：路由之前
	 * routing：路由之时
	 * post： 路由之后
	 * error：发送错误调用
	 * @作者： 杨珩
	 * @日期： 2018年3月23日 下午10:54:51
	 * @return
	 * @see com.netflix.zuul.ZuulFilter#filterType()
	 */
	@Override
	public String filterType() {
		return "pre";
	}

}
