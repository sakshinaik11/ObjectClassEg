package com.jsp.ObjectClass;

import java.util.Objects;

public class Car {
	
		
		String brand;
		String name;
		long price;
		

	public Car(String b, String n, long p) {
		this.brand = b;
		this.name = n;
		this.price = p;
			
	}
	
	// toString Method
	
	@Override  
	
	public String toString() {
		return "["+brand+", "+name+", "+price+"]" ;

	}
	
	// equals Method 
	
	@Override 
	
	public boolean equals(Object obj) {
		
		Car c = (Car) obj;
		
		if(this.brand == c.brand && this.name == c.name && this.price == c.price) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// hashCode Method
	
	@Override
	
	public int hashCode() {
		
		return Objects.hash(brand, name, price);
	}
	

}
