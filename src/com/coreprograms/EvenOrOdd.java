package com.coreprograms;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = scan.nextInt();
		if(num%2==0) {
			System.out.println("Given number "+num+" is even");
		}
		else {
			System.out.println("Given number "+num+" is odd");
		}
	}

}
