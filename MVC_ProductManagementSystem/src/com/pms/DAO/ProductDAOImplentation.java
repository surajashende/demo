package com.pms.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pms.Model.Product;


public class ProductDAOImplentation implements ProductDAO
{
	
//	private String jdbcURL = "jdbc:mysql://localhost:3306/demodb?useSSL=false";
	private String jdbcURL = "jdbc:mysql://localhost:3306/demodb";
    private String jdbcUsername = "root";
    private String jdbcPassword = "root";
    
    private static final String SELECT_PRODUCT_BY_ID = "select * from product where id = ?";
    private static final String SELECT_ALL_PRODUCTS = "select * from product";
    
    protected Connection getConnection() {
        Connection connection = null;
        try {
        	Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }
		
	@Override
	public Product getProductById(int id) {
		Product product=null;
		try(Connection conn = getConnection();
	            PreparedStatement ps = conn.prepareStatement(SELECT_PRODUCT_BY_ID);) {
			ps.setInt(1, id);
			ResultSet rs= ps.executeQuery();
			rs.next();
			String name = rs.getString(2);
			double price = rs.getDouble(3);
			product = new Product(id, name, price);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return product;
	}


	@Override
	public void addProduct(Product addProduct) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> list = new ArrayList<Product>();
		try(Connection conn = getConnection();
	            PreparedStatement ps = conn.prepareStatement(SELECT_ALL_PRODUCTS);) {
			ResultSet rs = ps.executeQuery();
		
			while(rs.next()) {
//				System.out.println(rs.getString(2)+" "+rs.getDouble(3));
				Product product = new Product();
				product.setId(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setPrice(rs.getDouble(3));
				list.add(product);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		
	}

}
