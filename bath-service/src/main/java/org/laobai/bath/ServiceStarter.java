package org.laobai.bath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableDiscoveryClient
// 开启熔断支持
@EnableCircuitBreaker
public class ServiceStarter {

    public static void main(String[] args) {
        SpringApplication.run(ServiceStarter.class, args);
    }


}
