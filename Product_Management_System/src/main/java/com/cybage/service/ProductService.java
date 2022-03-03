package com.cybage.service;

import java.sql.SQLException;
import java.util.List;

import com.cybage.model.Product;
public interface ProductService {
	Product getProductById(int productId) throws SQLException;
	void addProduct(int id, String name, double price) throws SQLException;
	List<Product>getAllProduct() throws Exception;
	void deleteProduct(int productId) throws SQLException;

}
