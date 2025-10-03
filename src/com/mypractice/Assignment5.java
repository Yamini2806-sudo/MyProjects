package com.mypractice;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		System.out.println("Enter the target operation");
		char ch = sc.next().charAt(0);
		switch(ch) {
		case '+':
			System.out.println("Result is "+(num1+num2));
			break;
		case '-':
			System.out.println("Result is"+(num1-num2));
			break;
		case '*':
			System.out.println("Result is"+(num1*num2));
			break;
		case '/':
			System.out.println("Result is"+(num1/num2));
			break;
			default:
				System.err.println("Invalid operation");
				break;
			
		}
		sc.close();

	}

}
