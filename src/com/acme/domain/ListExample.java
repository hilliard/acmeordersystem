package com.acme.domain;

import java.util.*;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List languages = new ArrayList();
		languages.add("Java");
		languages.add("JavaScript");
		languages.add("Groovy");
		languages.add("Scala");
		languages.set(2,"C#");
		System.out.println(languages);
		
		Set orderedSet = new TreeSet();
		orderedSet.add("A");
		orderedSet.add("3");
		orderedSet.add("b");
	    System.out.println(orderedSet);
	}
	
	
}
