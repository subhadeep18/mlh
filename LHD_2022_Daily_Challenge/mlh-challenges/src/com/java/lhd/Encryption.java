package com.java.lhd;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;
import java.util.Scanner;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class Encryption {

	public static void main(String[] args) throws InvalidKeySpecException, NoSuchAlgorithmException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your password:");
		String password = sc.nextLine();
		char chars[] = password.toCharArray();
		String encryptedPassword = "";
		
		//Generating salt
		SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
		byte[] salt = new byte[16];
		random.nextBytes(salt);
		
		//Encrypting
		int iterations = 1000;
		PBEKeySpec keySpec = new PBEKeySpec(chars, salt, iterations, 64*8);
		SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		byte hash[] = factory.generateSecret(keySpec).getEncoded();
		
		encryptedPassword = Base64.getEncoder().encodeToString(hash);
		
		sc.close();
		System.out.println("The encrypted password is :"+ encryptedPassword);
	}

}
