package com.acme.testing;

import java.math.BigDecimal;

import com.acme.utils.ConversionServiceBig;

public class TestConversionServiceBig {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigDecimal thirty = new BigDecimal(30);
		BigDecimal fifty = new BigDecimal(50);
		BigDecimal sevenSeven = new BigDecimal(7.7);
		System.out.println(ConversionServiceBig.fluidOunces(1.1f));
		System.out.println(ConversionServiceBig.gallons(2.2f));
		System.out.println(ConversionServiceBig.grams(thirty));		
		System.out.println(ConversionServiceBig.milliliters(40));
		System.out.println(ConversionServiceBig.ounces(fifty));
		System.out.println(ConversionServiceBig.pints(6.6f));
		System.out.println(ConversionServiceBig.pounds(sevenSeven));

		 // can you figure out why these do not compile
		 ConversionServiceBig.fluidOunces((float)1.1);
		 ConversionServiceBig.grams(thirty);
		 ConversionServiceBig.milliliters((int)4.0);
		 //short grams = (short)ConversionService.grams(thirty);
		 //byte byteGrams = (byte) ConversionService.grams(thirty));
		 
		 //System.out.println("Printing out grams " + grams);
		 //System.out.println("Printing out byteGrams " + byteGrams);
		 
		 

		// why do these still work even though the types are different
		/*
		System.out.println("------------------------------------");
		double ounces = ConversionService.fluidOunces(1.1f);
		System.out.println(ounces);
		long milliliters = ConversionService.milliliters(40);
		System.out.println(milliliters);
		double decimalmilliliters = ConversionService.milliliters(40);
		System.out.println(decimalmilliliters);
		short s = 30;
		System.out.println(ConversionService.grams(s));
		byte b = 4;
		System.out.println(ConversionService.milliliters(b));
		char z = 'z';
		System.out.println(ConversionService.milliliters(z));
		System.out.println(ConversionService.gallons(200));
		System.out.println(ConversionService.ounces(50.5f));
		System.out.println(ConversionService.pints(6L));
		System.out.println(ConversionService.pounds(7L));
		*/

		// compare these results.  Can you tell why they are different?
		
		System.out.println("------------------------------------");
		float bigGallons = ConversionServiceBig.gallons(123456789123456789L);
		System.out.println(bigGallons);
		double bigGallons2 = 123456789123456789L * 0.2642;
		System.out.println(bigGallons2);
		

		
		System.out.println("------------------------------------");
		BigDecimal oneTwoThree = new BigDecimal(1234567890);
		BigDecimal bigGrams = ConversionServiceBig.grams(oneTwoThree);
		System.out.println(bigGrams);
		long bigGrams2 = 1234567890L * 1000L;
		System.out.println(bigGrams2);
		
	}

}
