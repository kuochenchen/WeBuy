package com.junit;

import java.util.List;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.webuy.admin.dao.ProductMapper;
import com.webuy.admin.pojo.Product;
import com.webuy.admin.service.ProductService;
import com.webuy.admin.service.impl.ProductServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml","classpath:springmvc.xml"})
public class JunitTest {

	@Autowired
	private ProductMapper productMapper;
	
	@Test
	public void test1(){
		Product product=productMapper.selectByPrimaryKey("10");
		System.out.println(product.getCid()+product.getPdesc());
	}
}
