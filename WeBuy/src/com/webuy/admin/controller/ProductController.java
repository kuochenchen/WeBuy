package com.webuy.admin.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.webuy.admin.pojo.Product;
import com.webuy.admin.service.ProductService;

@Controller
@RequestMapping(value="/admin")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping(value="/productList.action")
	public ModelAndView productList(){
		List<Product> list =productService.getAllProducts();
		ModelAndView maView=new ModelAndView();
		maView.addObject("list",list);
		maView.setViewName("productList");
		return maView;
	}
	@RequestMapping(value="editProduct.action")
	public void 
}
