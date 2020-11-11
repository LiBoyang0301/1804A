package org.laobai.bath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
//开启代理
@EnableZuulProxy
public class ZuulStarter {
    public static void main(String[] args) {
        SpringApplication.run(ZuulStarter.class, args);
    }
}
