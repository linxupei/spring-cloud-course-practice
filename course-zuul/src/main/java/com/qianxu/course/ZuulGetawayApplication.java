package com.qianxu.course;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author 谦虚
 * @version 1.0
 * @date 2021/3/26 20:15
 * @describe
 */
@EnableZuulProxy
@SpringCloudApplication
public class ZuulGetawayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulGetawayApplication.class, args);
    }
}
