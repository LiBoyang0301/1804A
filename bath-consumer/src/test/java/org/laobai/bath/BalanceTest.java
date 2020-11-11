package org.laobai.bath;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BalanceTest {

    @Resource
    private RibbonLoadBalancerClient client;

    @Test
    public void test1(){
        for (int i = 0; i < 100; i++) {
            ServiceInstance instance = client.choose("bath-service");
            System.out.println(instance.getHost() + ":" + instance.getPort());
        }
    }
}
