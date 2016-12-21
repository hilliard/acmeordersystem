package com.acme.testing;

import com.acme.utils.MyDate;

public class PassByExperiment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date = new MyDate(1,20,2008);
		System.out.println("Before passing an object " + date);
		passObject(date);
		System.out.println("After passing an object " + date);
		
	//	System.out.println("Before passing a primitive " + date.year);
	//	passPrimitive(date.year);
	//	System.out.println("After passing a primitive " + date.year);
		
		String x = date.toString();
		System.out.println("Before passing a String " + x);
		passString(x);
		System.out.println("After passing a String " + x);	
		
		StringBuilder sb = new StringBuilder(date.toString());
		System.out.println("Before passing a StringBuilder " + sb);
		passStringBuilder(sb);
		System.out.println("After passing a StringBuilder " + sb);
		
	
	
	}
	
	public static void passObject(MyDate d) {
		//d.passString(2009);
	}
	
	public static void passPrimitive(int i) {
		i = 2010;
	}
	
	public static void passString(String s) {
		int yearSlash = s.lastIndexOf('/');
		s = s.substring(0, yearSlash + 1);
		s += "2012";
		System.out.println("New Date string: " + s);
	}
	
	public static void passStringBuilder(StringBuilder s){
		
		s.append(" Add Something");
	}
	

}
