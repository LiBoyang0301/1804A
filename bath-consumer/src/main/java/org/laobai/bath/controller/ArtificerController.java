package org.laobai.bath.controller;


import org.laobai.bath.entity.Artificer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import org.laobai.bath.service.ArtificerService;

import java.util.List;

/**
 * <p>
 *  前端控制器
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

	//根据ID查询某数据
	@GetMapping("list")
	public List<Artificer> list(){
		return artificerService.list();
	}
	//查看技师列表
	@GetMapping("get-by-id")
	public Artificer getById(Long id){
		return artificerService.getById(id);
	}
}
