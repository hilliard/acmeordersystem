package com.acme.domain;

import com.acme.utils.HolidayOrdersNotAllowedException;
import com.acme.utils.MyDate;

public class Order {
	public enum Size {SMALL, MEDIUM, LARGE, XTRALARGE}
	
	// public static double taxRate;
	private MyDate orderDate;
	private double orderAmount = 0.00;
	private String customer;
	private Product product;
	private int quantity;
	private static Rushable rushable;
	/*{
		taxRate = 0.5;
	} */
	
	public Order(MyDate d, double amt, String c, Product p, int q){
		try {
		//orderDate=d;
		setOrderDate(d);
		} catch (HolidayOrdersNotAllowedException e) {
			System.out.println("The order date for an order cannot be a holiday! Application Closing.");
			System.exit(0);
		}
		orderAmount=amt;
		customer=c;
		product=p;
		quantity=q;
	}
	
	public MyDate getOrderDate(){
		return orderDate;
	}
	
	public double getOrderAmount(){
		return orderAmount;
	}
	
	public void setOrderAmount(double orderAmount){
		if (orderAmount > 0) {
			this.orderAmount = orderAmount;
		} else {
			  System.out.println("Attempting to set the orderAmount to a value less than or equal to zero");
		     
		}
	}
	
	public String getCustomer(){
		return customer;
	}
	
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Good product){
		this.product = product;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public void setQuantity(int quantity){
		if (quantity > 0) {
			this.quantity = quantity;
		} else {
			System.out.println("Attemting to set the quantity to a value less than or equal to zero");
		}
	}
	
	public static double getTaxRate(){
		return taxRate;
	}
	
	public static double taxRate = 0.05;
	
	
	
	public String toString(){
		return quantity + " ea. " + product + " for " + customer; 
	}
	
	public static void setTaxRate(double newRate) {
		taxRate = newRate;
	}
	
	public static void computeTaxOn(double anAmount){
		System.out.println("The tax for " + anAmount + " is: " +
	anAmount * Order.taxRate);
	}
	
	public double computeTax() {
		System.out.println("The tax for this order is: " + orderAmount
				* Order.taxRate);
		return orderAmount * Order.taxRate;
	}
	
	public Order(MyDate d, double amt, String c){
		 orderDate = d;
		 orderAmount = amt;
		 customer = c;
		 // product = p;
		 quantity = 1;
	} 
	
	public char jobSize() {
		
		// add code here to compute and 
		// return the order size for an order
	
		if (quantity <= 25) {
			return 'S';
		} else if (quantity <= 75) {
			return 'M';
		} else if (quantity <= 150) {
			return 'L';
		}
		return 'X';
		
	} // end jobsize
	
	public double computeTotal() {
		double total = orderAmount;
		switch (jobSize()) 
		{
		case 'S':
			System.out.println("Order is Small");
			break;
				
		case 'M':
			System.out.println("Order is Medium");
			total = total - (orderAmount * 0.01);
			break;
			
		case 'L':
			System.out.println("Order is Large");
			total = total - (orderAmount * 0.02);
			break;
			
		case 'X':
			System.out.println("Order is XtraLarge");
			total = total - (orderAmount * 0.04);
			break;
		}
		if (orderAmount <= 1500) {
			total = total + computeTax();
		}
		return total;
	}
	
	
	public static Rushable getRushable(){
		return rushable;
	}
    public static void setRushable(Rushable rushable){
    	Order.rushable = rushable;
    }
    
    public boolean isPriorityOrder(){
    	boolean priorityOrder = false;
    	if (rushable != null) {
    		priorityOrder = rushable.isRushable(orderDate, orderAmount);
    	}
    	return priorityOrder;
    }
    
    public boolean isHoliday(MyDate proposedDate){
    	boolean result = false; 
    	for (MyDate holiday : MyDate.getHolidays()) {
    		if (holiday.equals(proposedDate)) {
    			result = true;
    		}
      	}
    	return result;
    }
    
    public void setOrderDate(MyDate orderDate) throws HolidayOrdersNotAllowedException {
    	if (isHoliday(orderDate)) {
    		System.out.println("Order date, " + orderDate + ", cannot be set to a holiday!");
    		throw new HolidayOrdersNotAllowedException(orderDate);
    	} else {
    		this.orderDate = orderDate;
        }
    }
}
