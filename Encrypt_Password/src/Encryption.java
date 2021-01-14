import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Scanner;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class Encryption {

	public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException {
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
		
		BigInteger bi = new BigInteger(1, hash);
        String hex = bi.toString(16);
        int paddingLength = (hash.length * 2) - hex.length();
        if(paddingLength > 0)
        {
        	encryptedPassword = String.format("%0"  +paddingLength + "d", 0) + hex;
        }else{
        	encryptedPassword = hex;
        }
		
		sc.close();
		System.out.println("The encrypted password is :"+ encryptedPassword);
	}

}
