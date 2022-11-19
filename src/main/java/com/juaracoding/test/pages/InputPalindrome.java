package com.juaracoding.test.pages;

import java.util.Scanner;

public class InputPalindrome {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan Teks : ");
		
		String teks = input.nextLine();
		System.out.println("Inputan Teks adalah " + teks);
		
		String temp = "";
		for(int i=teks.length()-1; i>=0; i--) {
			char chr = teks.charAt(i);
			temp += String.valueOf(chr);
		}
		
		if(teks.toLowerCase().equals(temp.toLowerCase())) {
			System.out.println();
			System.out.println(teks + " Adalah Teks Palindrome");
		}else {
			System.out.println();
			System.out.println(teks + " Adalah Bukan Teks Palindrome");
		}
	}
}
