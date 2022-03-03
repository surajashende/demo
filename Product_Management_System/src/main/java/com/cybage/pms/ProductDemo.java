package com.cybage.pms;
import java.util.Scanner;

import com.cybage.model.Product;
import com.cybage.serviceimplementation.ProductServiceImplementation;

public class ProductDemo {
	public static void main(String[] args) throws Exception {
		int id;
		String name;
		double price;
		int choice;
		Scanner scanner;
		ProductServiceImplementation productImple=new ProductServiceImplementation();
		
		scanner= new Scanner(System.in);

        while(true) {
 
            //Creating menu
        	System.out.println();
            System.out.println("Press 1  getid by Product");
            System.out.println("Press 2  Add product");
            System.out.println("Press 3  Get All Product ");
            System.out.println("Press 4  delete Product");
            System.out.println("Press 5  to Exit");
 
            System.out.println("Make your choice");
            choice = scanner.nextInt();
 
            switch (choice) {
 
                case 1:
                    System.out.println("Enter id  ");
                    id = scanner.nextInt();
                    productImple.getProductById(id);
                    break;
                case 2:
                    System.out.println("Enter id number ");
                    id=scanner.nextInt();
                    System.out.println("Enter product name");
                    name=scanner.next();
                    System.out.println("Enter product price");
                    price=scanner.nextDouble();
                    productImple.addProduct(id, name, price);
                    break;
                case 3:
                    productImple.getAllProduct();
                 break;
                case 4:
                    System.out.println("Enter  id to delete product");
                     id=scanner.nextInt();
                     productImple.deleteProduct(id);
                break;
                case 5:
                    System.out.println("Exited..");
                    System.exit(0);
               
                default:
                    System.out.println("Invalid choice!!");
            }
		
	}
 
   }
}
