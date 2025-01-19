package com.foo.example;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class MySha256 {

	public static void main(String[] args) {
		
		String str = "Alice gave 0.015BTC to James.";
		
		try {
			
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] encodedhash = digest.digest(str.getBytes(StandardCharsets.UTF_8));
			
			StringBuffer sb = new StringBuffer(); 

			for(int i = 0 ; i < encodedhash.length ; i++){
				sb.append(Integer.toString((encodedhash[i]&0xff) + 0x100, 16).substring(1));
			}
			
			System.out.println(sb.toString());
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}

}
