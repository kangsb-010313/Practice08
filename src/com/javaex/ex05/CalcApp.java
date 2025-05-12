package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	
    	Add add = new Add();
    	add.setValue(5, 3);
    	//System.out.println(add.calculate());
    	
    	Sub sub = new Sub();
    	sub.setValue(8, 2);
    	//System.out.println(sub.calculate());
    	
    	Mul mul = new Mul();
    	mul.setValue(4, 5);
    	//System.out.println(mul.calculate());
    	
    	Div div = new Div();
    	div.setValue(15,7);
    	//System.out.println(div.calculate());
    	
    	/////////////////////////////////////////////////
    	
    	System.out.print(">>");
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	
    	add.setValue(a, b);
    	System.out.println(add.calculate());
    	sub.setValue(a, b);
    	System.out.println(sub.calculate());
    	mul.setValue(a, b);
    	System.out.println(mul.calculate());
    	div.setValue(a, b);
    	System.out.println(div.calculate());
    	
    	/*
    	try {
    		
    	}catch() {
    		System.out.println("알 수 없는 연산입니다.");
    	}finally {
    		System.out.println("종료합니다.");
    	}
    	*/
    	sc.close();
    	
    	
    }
}
