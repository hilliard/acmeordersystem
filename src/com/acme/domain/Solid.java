package com.acme.domain;

import com.acme.domain.Good.UnitOfMeasureType;

public class Solid extends Good {
	private double width;
	private double length;
	
	public Solid(String name, int modelNumber, double height,
			UnitOfMeasureType uoM, boolean flammable, double wgtPerUofM,
			double width, double length) {
			 super(name, modelNumber, height, uoM, flammable, wgtPerUofM);
			 this.width = width;
			 this.length = length;
	}
	
	public double volume() {
		 return width * length * getHeight();
		}

	public String toString() {
		 return super.toString() + " that is " + volume() + " " +
		getUnitOfMeasure() + " in size";
		} 
	
}
