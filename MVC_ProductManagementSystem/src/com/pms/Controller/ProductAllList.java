package com.pms.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pms.Model.Product;
import com.pms.Service.ProductServiceImplementation;

/**
 * Servlet implementation class ProductAllList
 */
@WebServlet("/ProductAllList")
public class ProductAllList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
		
		ProductServiceImplementation productService = new ProductServiceImplementation();
		

		List<Product> productListAll= productService.getAllProduct();
		
//		Product product = productService.getProductById(id);
		context.setAttribute("productListAll", productListAll);
		System.out.println(" in ProductAllList servlet");
		RequestDispatcher disp = getServletContext().getRequestDispatcher("/getRequirementFromUser.jsp");
		disp.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
