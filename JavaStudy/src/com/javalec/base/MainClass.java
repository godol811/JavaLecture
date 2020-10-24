package com.javalec.base;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("원하는 단까지 입력하기");
		int input = scanner.nextInt();
		int output = scanner.nextInt();
		
		
		SubClass1 subClass1 =new SubClass1();
		subClass1.test(input,output);
		//main method 에 직접 숫자를 넣어서 사용하는경우
		SubClass2 subClass2 =new SubClass2(input, output);
		subClass2.test();
		//Constructor에 숫자를 넣어 사용하는경우 (대부분 오버로딩을 사용)
		//예이 테스트
			
	}

}
