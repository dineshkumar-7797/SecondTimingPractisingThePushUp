package org.sample;

import java.util.Scanner;

public class D4T8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			int remind=0;
			int n = sc.nextInt();
		for(int i=n-1;i>=2;i--) {
			if(n%i==0) {
				System.out.println("The given number is composite number");
				remind=1;
				break;
			}
		}
		if(!(remind==1))
			System.out.println("The given number is prime");
	}
	}
}
/*QUESTION 8:
-----------
Description: Find prime number or not.

*/