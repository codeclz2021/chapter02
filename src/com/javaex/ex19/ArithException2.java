package com.javaex.ex19;

import java.util.Scanner;

public class ArithException2 {

	public static void main(String[] args) {
		
		double result;
		int num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		try {
			result = 100/num;                   //ArithmeticException 발생
			System.out.println(result);         
		}catch(ArithmeticException e) {         //예외상황일때 처리할 로직 
			System.out.println(e.toString());
		}finally {
			//예외상황 유무 관계없이 처리됨
			System.out.println("finally영역");
		}
		
		
		
		sc.close();
		
	}
	
}
