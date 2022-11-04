package com.cohart20.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cohart20.entity.Product;
import com.cohart20.repository.ProductRepository;

import java.util.List;

@Service
public class productDetailService {

	@Autowired
	ProductRepository productrepository;

	public List<Product> getAllProduct() {

		List<Product> product = productrepository.findAll();

		return product;
	}

}
