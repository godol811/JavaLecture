package com.javalec.base;

public class SubClass2 {

	//field
	int a= 0; 
	int b = 0;
	//constructor
	public SubClass2(int start, int end) {
		 a = start;
		 b = end;
	}
	public void test() {
		for (int i = a; i <= b; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i +" x " + j + " = " + i*j);
			}
			
		} System.out.println("---------------------------------");
		
	}
	
	//method
	
	
	
	//V2-------------------
	
}
