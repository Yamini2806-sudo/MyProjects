package com.mypractice;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		switch(number%2) {
		case 0:
			System.out.println("The number is Even");
			break;
		case 1:
			System.out.println("The number is odd");
			break;
		}
		sc.close();
	}

}
