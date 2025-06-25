package kr.smhrd.lunch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.model.Model;
import kr.smhrd.lunch.dto.GoodsDto;
import kr.smhrd.lunch.service.GoodsService;

@CrossOrigin(origins = "http://3.34.40.94:5173")
@RestController
@RequestMapping("/api")
public class GoodsController {
	
	@Autowired
	GoodsService goodsService;
	
	@GetMapping("/goods_list/{id}")
	public GoodsDto getGoodsDetail(@PathVariable ("id") int id) {
		
		GoodsDto goodsDetail = goodsService.getGoodsDetail(id);
		
		return goodsDetail;
	}
	
	
	
	
	
	
	@GetMapping("/goods_list")
	public List<GoodsDto> getGoodsList(GoodsDto goodsDTO, Model model) {
		System.out.println("[list 출력 컨트롤러]");
		
		List<GoodsDto> list = goodsService.getGoodsList();
		// 2 Step -> Service -> Repository
		// -> Service 클래스 불러오기
		
		return list;
	
	
	}
}
