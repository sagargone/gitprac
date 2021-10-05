package com.prac;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		String rev="";
		System.out.println("Enter a string or number ");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		int len=name.length();
		//System.out.println(name.length());
        for(int i=len-1;i>=0;i--)
        {
        	rev=rev+name.charAt(i);
        }
        System.out.println("Reverse of string or number is : "+rev);
        
        if(name.equals(rev)) 
            System.out.println("The string or number is palindrome");
        else
            System.out.println("The string or number is not a palindrome");

	}
	
}
