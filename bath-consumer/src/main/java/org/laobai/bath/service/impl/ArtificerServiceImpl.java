package org.laobai.bath.service.impl;

import org.laobai.bath.client.ArtificerClient;
import org.laobai.bath.entity.Artificer;
import org.laobai.bath.service.ArtificerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author jiusan
 * @since 2020-11-06
 */
@Service
public class ArtificerServiceImpl implements ArtificerService {
    @Autowired
    private ArtificerClient artificerClient;




    @Override
    public List<Artificer> list() {
        return artificerClient.list();
    }

    @Override
    public Artificer getById(Long id) {
        return artificerClient.getById(id);
    }
}
