package net.softsociety.subject1.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;
import net.softsociety.subject1.service.ShoppingService;
import net.softsociety.subject1.vo.item;

@Slf4j
@Controller
public class ShoppingController {

	@Autowired
	ShoppingService service;
	
	@GetMapping("/shopping")
	public String shopping(Model model) {
		
		ArrayList<item> list = service.selectItem();
		
		model.addAttribute("list", list);
		
		return "shopping";
	}
	
	@GetMapping("/detail")
	public String detail(int p_num, Model model) {
		
		item tem = service.selectOne(p_num);
		
		model.addAttribute("item", tem);
		
		return "detail";
	}
}
