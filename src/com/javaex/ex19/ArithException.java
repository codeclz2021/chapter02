package com.javaex.ex19;

import java.util.Scanner;

public class ArithException {

	public static void main(String[] args) {
		
		double result;
		int num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num!=0) {
			result = 100/num;
			System.out.println(result);
		}else {
			System.out.println("0으로 나눌수 없습니다.");
		}
		
		sc.close();
		
	}
	
}
