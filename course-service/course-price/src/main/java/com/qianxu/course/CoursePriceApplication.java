package com.qianxu.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 谦虚
 * @version 1.0
 * @date 2021/3/26 15:31
 * @describe
 */
@SpringBootApplication
//实现服务间调用
@EnableFeignClients
//添加断路器配置
@EnableCircuitBreaker
public class CoursePriceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoursePriceApplication.class, args);
    }
}
