
//1.2) Create class Product (pid, price, quantity) with parameterized constructor.
//Create a main function in different class (say XYZ) and perform following task:
//a. Accept five product information from user and store in an array,
//b. Find Pid of the product with the highest price,
//c. Create method (with array of product's object as argument) in XYZ class to calculate 
//and return the total amount spent on all products (amount spent on single product= price of product * quantity of product).

package com.demo.task.two;
import java.util.Scanner;

	class Product {
	    private int pid;
	    private double price;
	    private int quantity;

	    
	    public Product(int pid, double price, int quantity) {
	        this.pid = pid;
	        this.price = price;
	        this.quantity = quantity;
	    }

	   
	    public int getPid() {
	        return pid;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public int getQuantity() {
	        return quantity;
	    }
	}

	public class TaskTwo {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        
	        Product[] products = new Product[5];
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Enter Product " + (i + 1) + " Information:");
	            System.out.print("Enter PID: ");
	            int pid = sc.nextInt();
	            System.out.print("Enter Price: ");
	            double price = sc.nextDouble();
	            System.out.print("Enter Quantity: ");
	            int quantity = sc.nextInt();
	            products[i] = new Product(pid, price, quantity);
	        }

	        
	        int maxPricePid = products[0].getPid();
	        double maxPrice = products[0].getPrice();
	        for (int i = 1; i < products.length; i++) {
	            if (products[i].getPrice() > maxPrice) {
	                maxPrice = products[i].getPrice();
	                maxPricePid = products[i].getPid();
	            }
	        }
	        System.out.println("PID of the product with the highest price: " + maxPricePid);

	        
	        double totalAmount = TotalAmount(products);
	        System.out.println("Total amount spent on all products: " + totalAmount);
	    }

	    
	    public static double TotalAmount(Product[] products) {
	        double totalAmount = 0;
	        for (Product product : products) {
	            totalAmount += product.getPrice() * product.getQuantity();
	        }
	        return totalAmount;
	    }
	}



