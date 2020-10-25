package com.javalec2.base;

public class Calc {
	
	
	public Calc() {
		// TODO Auto-generated constructor stub
	}
//method	
	public void calc(int input , int output) {
		
		for (int i = input; i <= output; i++) {
			for (int j = 1; j <= 9 ; j++) {
				System.out.println(i + " X " + j + " = " +String.format("%3s" ,  i*j));
			}//for
		
		}//for
		System.out.println("----------------------");
	}//method
	
	public void oneCalc(int input) {
		for (int j = input; j <= input; j++) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(j + " X " + i + " = " +String.format("%3s" ,  i*j));
				
			}
			
		}
		System.out.println("----------------------");
		
	}//method
	public void nothing() {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " +String.format("%3s" ,  i*j));
			}
			
		}
		System.out.println("----------------------");
		
	}
	
}//public
	
	
		

