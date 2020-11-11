package org.laobai.bath.client;

import org.laobai.bath.entity.Artificer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@FeignClient(name = "bath-service",
        path = "artificer",
        fallback = ArtificerClientFallBack.class)
public interface ArtificerClient {
    @GetMapping("get-by-id")
    Artificer getById(@RequestParam("id")Long id);
    // 查询列表

    @GetMapping("list")
    List<Artificer> list();
}
