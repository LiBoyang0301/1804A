package org.laobai.bath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GateWayStarter {
    public static void main(String[] args) {
        SpringApplication.run(GateWayStarter.class, args);
    }
}
