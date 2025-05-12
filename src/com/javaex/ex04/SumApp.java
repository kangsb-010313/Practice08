package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		//코드를 작성하세요
		
		
		String[] sn = numLine.split(" "); //공백
		
		for(int i=0; i<sn.length; i++) {
		/*
			try {
				int num = Integer.parseInt(sn[i]); //문자열 -> 정수
				sum = sum + num;
			}catch(NumberFormatException e) { //오류 예외처리
				System.out.println("x");
			}
		*/
			int num = Integer.parseInt(sn[i]);
			sum = sum + num;
			
			
		}
		
		System.out.println("합:" + sum);
		
		sc.close();
	}

}
