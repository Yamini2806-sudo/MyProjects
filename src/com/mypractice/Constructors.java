package com.mypractice;

public class Constructors {
	public int i;

	public static void main(String[] args) {
		Constructors cp = new Constructors(86);
		System.out.println(cp.i);
		
	}
	public Constructors() {
		i = 20;
	}
	public Constructors(int a) {
		i = a;
	}

}
