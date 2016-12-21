package com.acme.utils;

// import java.math.BigDecimal;

public class ConversionService {
	/**
	* weight conversion rates
	*/
	// conversion rate for 1 kilogram to pounds
	//public static BigDecimal kilogramToPounds = new BigDecimal(2.2046);
	public static double kilogramToPounds = 2.2046;
	// conversion rate for 1 kilogram to grams
	
	//public static BigDecimal kilogramToGrams = new BigDecimal(1000);
	public static int kilogramToGrams = 1000;

	// conversion rate for 1 kilogram to weight ounces
	//public static BigDecimal kilogramToOunces = new BigDecimal(35.274);
	public static double kilogramToOunces = 35.274;
	/**
	* volume conversion rates
	*/
	// conversion rate for 1 liter to fluid ounces
	public static float literToFluidOunce = 33.814f;
	// conversion rate for 1 liter to gallons
	public static float literToGallon = 0.2642f;
	// conversion rate for 1 liter to pints
	public static float literToPints = 2.1134f;
	// conversion rate for 1 liter to milliliters
	public static short litertoMilliliters = 1_000;
	
	// The BigDecimal ones
	/*
	public static BigDecimal pounds (BigDecimal kilograms){
	      return kilograms.multiply(kilogramToPounds);
	}
	
	public static BigDecimal grams (BigDecimal kilograms){
		return kilograms.multiply(kilogramToGrams);
		}
	
	public static BigDecimal ounces (BigDecimal kilograms){
		return kilograms.multiply(kilogramToOunces);
		}
	*/
	public static double pounds (double kilograms){
		return kilograms * kilogramToPounds;
		}
	
	public static int grams (int kilograms){
		return kilograms * kilogramToGrams;
		}
	
	public static double ounces (double kilograms){
		return kilograms * kilogramToOunces;
		}
	
		
	public static float fluidOunces(float liters){
		return liters * literToFluidOunce;
		}
	
	public static float gallons(float liters){
		return liters * literToGallon;
		}
	
	public static float pints (float liters){
		return liters * literToPints;
		}
	
	public static int milliliters (int liters) {
		return liters * litertoMilliliters;
		}


}
