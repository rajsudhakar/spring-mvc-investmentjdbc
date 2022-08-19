package com.productapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.productapp.model.Product;
@Controller
public class ProductController {

	@RequestMapping("/showForm")
	public String formPage() {
		return "addform";
	}

	@RequestMapping("/addProduct")
	public String printPage(Product product) {
		return "success";
	}
}
