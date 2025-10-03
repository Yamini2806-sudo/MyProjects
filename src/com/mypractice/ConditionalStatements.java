package com.mypractice;

public class ConditionalStatements {

	public static void main(String[] args) {
		String examStatus = "Pass";
		if(examStatus =="Pass") {
			System.out.println("Please wait for the next round");
			String round1Status = "Pass";
			if(round1Status =="Pass") {
				System.out.println("You have cleared Round1, Please wait for round 2");
			}
			else {
				System.out.println("You can go to home");
			}
			
				
				
			}
		
		

	}

}
