package com.cohart20.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cohart20.entity.Product;
import com.cohart20.service.productDetailService;

@Controller
public class ProductController {
	@Autowired
	productDetailService productdetailservice;
	@RequestMapping ("/productDetail")
	public ModelAndView productDetail() {
		System.out.println("product detail");
		ModelAndView mav = new ModelAndView("productDetail");
		List<Product> product =productdetailservice.getAllProduct();
		mav.addObject("allproduct",product);
		
		return mav;
	}

}
