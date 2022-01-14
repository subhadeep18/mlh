package com.java.lhd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RandomNumberGenerator {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the min range for random number:");
		int min = Integer.parseInt(br.readLine());
		System.out.println("Enter the max range for random number:");
		int max = Integer.parseInt(br.readLine());
		System.out.println("Random generated number:");
		System.out.println((int)(Math.random()*(max-min+1)+min));
	}

}
