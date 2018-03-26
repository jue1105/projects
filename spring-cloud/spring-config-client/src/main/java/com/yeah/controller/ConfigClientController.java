/**
 * @作者：杨珩
 * @日期：2018年3月25日 下午9:15:28
 */
package com.yeah.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @描述： 分布式配置中心客户端测试接口API
 * @作者： 杨珩
 * @日期： 2018年3月25日 下午9:15:28
 */
@RestController
public class ConfigClientController {
	@Value("${test}")
    String test;//git仓库配置文件属性
    /**
     * @描述： 调用接口
     * @作者： 杨珩
     * @日期： 2018年3月25日 下午9:17:09
     * @return
     * String
     */
    @GetMapping(value = "/hi")
    public String hi(){
        return "成功获取git仓库配置文件属性test="+test;
    }
}
