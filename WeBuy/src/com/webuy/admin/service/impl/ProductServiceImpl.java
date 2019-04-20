package com.webuy.admin.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webuy.admin.dao.ProductMapper;
import com.webuy.admin.pojo.Product;
import com.webuy.admin.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductMapper productMapper;
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product> list = productMapper.selectByExample(null);
		return list;
	}
	
	
}
