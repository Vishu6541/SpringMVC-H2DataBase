package com.h2.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.h2.entity.service.ProductService;

@Controller
public class ProductMSVController {
	
	@Autowired
	ProductService productService;
	
	
	@GetMapping(value = "/mvc/product")
	public ModelAndView getProductForMvc() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		mv.addObject("products",productService.getAllProduct());
		return mv;
	}

}
