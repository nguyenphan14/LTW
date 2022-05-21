package com.th2.nhom10.service;

import java.util.List;

import com.th2.nhom10.entity.Product;
import org.springframework.ui.Model;

public interface ProductService {
	List<Product> getAlls();
	Product getById(Long id);
	Product post(Product product);
	Product update(Long id, Product product);
	void delete(Long id);
	public Boolean validate(Long id, String status, Model model, String code, String description, String price_raw);
}
