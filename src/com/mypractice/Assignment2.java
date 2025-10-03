package com.mypractice;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Marks:");
		int marks = scanner.nextInt();
		if(marks< 35) {
			System.err.println("Student is FAILED");
		}else {
			if(marks < 50) {
				System.out.println("Student secured THIRD CLASS");	
				
			}else {
				if(marks < 85) {
					System.out.println("Student secuered SECOND CLASS");
				}else {
				System.out.println("Student secured FIRST CLASS");
			}
				
			}
			
			
		}
		scanner.close();
    	
    	
	}

}
