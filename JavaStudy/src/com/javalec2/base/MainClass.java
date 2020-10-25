package com.javalec2.base;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		String input;
		
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("원하는 단을 적어 내시오");
	
		input = scanner.nextLine();
		Classification classification = new Classification();
		classification.classifcation(input);
			}
}


