package com.cybage.serviceimplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.cybage.dao.JDBCUtility;
import com.cybage.model.Product;
import com.cybage.service.ProductService;

public class ProductServiceImplementation implements ProductService{
	private Connection con=JDBCUtility.getConnection();
	Statement stmt;
	PreparedStatement	pstmt;
	public Product getProductById(int productId) throws SQLException {
	  pstmt=con.prepareStatement("select * from products where id=?");
	  pstmt.setInt(1, productId);
	  ResultSet rs=pstmt.executeQuery();
	  while(rs.next()) {
			System.out.println(+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
		}
		
		return null;
	}

	public void addProduct(int id, String name, double price) throws SQLException {
		pstmt=con.prepareStatement("insert into products values(?,?,?)");
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setDouble(3, price);
		int res=pstmt.executeUpdate();
		if(res>0) {
			System.out.println("Product is added");
		}
		System.out.println();
	}

	public List<Product> getAllProduct() throws Exception {
	    stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from products");
		while(rs.next()) {
			System.out.println(+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
		}
		System.out.println();
		return null;
	}

	public void deleteProduct(int productId) throws SQLException {
		pstmt=con.prepareStatement("delete from products where id=?");
		pstmt.setInt(1, productId);
		int productDelete=pstmt.executeUpdate();
		if(productDelete>0) {
			System.out.println(productId+ ":is deleted..");
		}
		System.out.println();
		
	}

}
