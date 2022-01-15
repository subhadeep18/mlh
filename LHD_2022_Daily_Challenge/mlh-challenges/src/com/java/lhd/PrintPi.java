package com.java.lhd;

import java.util.Scanner;

public class PrintPi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of digit of pi you want to see:");
		int n = sc.nextInt();
		double d = Math.pow(10, n);
		System.out.println("The value of pi upto : " + n + " digits of decimal is " + Math.round(Math.PI * d)/d);
		sc.close();
	}
}
