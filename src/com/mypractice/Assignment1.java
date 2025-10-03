package com.mypractice;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		if(number % 2 == 0) {
			System.out.println("Given number is Even");
		}
		else {
			System.out.println("The given number is Odd");
		}
		
		scanner.close();
	}
	
	
	

}
