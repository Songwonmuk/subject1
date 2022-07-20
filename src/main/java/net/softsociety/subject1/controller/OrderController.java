package net.softsociety.subject1.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;
import net.softsociety.subject1.service.OrderService;
import net.softsociety.subject1.vo.order;

@Slf4j
@Controller
public class OrderController {

	@Autowired
	OrderService service;
	
	@GetMapping("/orderlist")
	public String orderlist(Model model) {
		
		ArrayList<order> list = service.selectAll();
		
		model.addAttribute("orderList", list);
		
		return "orderlist";
	}
}
