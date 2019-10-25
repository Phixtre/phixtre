package com.example.login.phixtre.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Description TODO
 * @Author WTL
 * @Date 2019/10/25
 **/
@RestController
public class NacosController {

    @NacosValue(value = "${service.name:原始配置}", autoRefreshed = true)
    private String serverName;

    @RequestMapping("/getConfig")
    public String getConfig() {
        return serverName;
    }
}
