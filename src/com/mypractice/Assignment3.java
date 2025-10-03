package com.mypractice;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day");
		String day = sc.nextLine();
		if(day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
			System.out.println("Uff, It's a Weekday");
			
		}else {
			if(day.equals("Saturday") || day.equals("Sunday")) {
				System.out.println("Yayyy, It's a Weekend");
			}else {
				System.out.println("Invalid Day Entered");
			}
		}
		
		sc.close();

	}

}
