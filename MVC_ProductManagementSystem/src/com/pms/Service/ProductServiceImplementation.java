package com.pms.Service;

import java.util.List;

import com.pms.DAO.ProductDAOImplentation;
import com.pms.Model.Product;

public class ProductServiceImplementation implements ProductService
{
	ProductDAOImplentation productDao = new ProductDAOImplentation();

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return productDao.getProductById(id);
	}

	@Override
	public void addProduct(Product addProduct) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		
	}

}
