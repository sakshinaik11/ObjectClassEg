package com.jsp.ObjectClass;

public class CarDriver {

	public static void main(String args[]) {
		
		Car c1 = new Car("BMW", "X1", 2586914);
		Car c2 = new Car("BMW", "X1", 2586914);
		
		
		System.out.println(c1);
		
		System.out.println(c1.hashCode());
		
		System.out.println(c2.hashCode());
		
		System.out.println(c1.equals(c2));
		
	}

}
