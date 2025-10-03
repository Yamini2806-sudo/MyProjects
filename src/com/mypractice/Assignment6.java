package com.mypractice;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day");
		String day = sc.nextLine();
		switch (day) {
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday":
			System.out.println("Uff, It's a weekday");
			break;
		case "Saturday":
		case"Sunday":
			System.out.println("Yayy, It's a weekend");
			break;
			default:
				System.err.println("Invalid input");
				break;
				
		}
		sc.close();


	}

}
