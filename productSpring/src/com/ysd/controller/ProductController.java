package com.ysd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ysd.servise.ProductServise;

@Controller
public class ProductController {

	@Autowired
	private ProductServise productServise;
	
	public String selectProduct() {
		return productServise.selectProduct();
	}
}
