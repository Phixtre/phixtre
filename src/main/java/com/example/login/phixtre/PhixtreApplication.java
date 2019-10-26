package com.example.login.phixtre;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.example.login.phixtre.mapper")
@NacosPropertySource(dataId = "phixtre", autoRefreshed = true)
@EnableNacosConfig(globalProperties = @NacosProperties(serverAddr = "39.106.147.194:8848"))
public class PhixtreApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhixtreApplication.class, args);
    }

}
