package com.javalec2.base;

public class Classification {
	Calc calc = new Calc();
	int first = 0;
	public Classification() {
		// TODO Auto-generated constructor stub
	}
	public void classifcation(String input) {
		switch (input.length()) {
		case 0 :
			calc.nothing();
			break;
		case 1 : 
			first =Integer.parseInt(input);
			calc.oneCalc(first);
			break;
		case 2 :
			first =Integer.parseInt(input);
			//앞자리 뒷자리 따지기
			int head = first/10;
			int tail = first%10;
			
			if (head>tail) {
				int temp;
				temp = head;
				head = tail;
				tail = temp;
			}
			else {
			}
			calc.calc(head, tail);
			break;
		default :
		System.out.println("잘못된 입력입니다");
			break;
		}
		
			
	
		
	}
	
	
	
}
