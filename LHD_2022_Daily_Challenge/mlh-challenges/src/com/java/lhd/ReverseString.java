package com.java.lhd;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(input);
		System.out.println("The reversed string is " + sb.reverse());
		sc.close();
	}

}
