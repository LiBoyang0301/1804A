package org.laobai.bath.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.laobai.bath.entity.Artificer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.laobai.bath.service.ArtificerService;

import java.util.List;
import java.util.Objects;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author jiusan
 * @since 2020-11-06
 */
@RestController
@RequestMapping("/artificer")
public class ArtificerController {
    @Autowired
    private ArtificerService artificerService;

    // 根据ID查询
    @GetMapping("get-by-id")
	@HystrixCommand(fallbackMethod = "getFallback")
    public Artificer getById(Long id) {
        Artificer artificer = artificerService.getById(id);

        if (Objects.isNull(artificer)) {
            throw new RuntimeException();
        }

        return artificer;
    }

	public Artificer getFallback(Long id){
		Artificer artificer = new Artificer();
		artificer.setName("您找的技师不存在");
		return  artificer;
	}
    // 查询列表

    @GetMapping("list")
    public List<Artificer> list() {
        return artificerService.list();
    }
}
