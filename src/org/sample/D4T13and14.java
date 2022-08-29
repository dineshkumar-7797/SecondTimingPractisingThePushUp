package org.sample;

import java.util.Scanner;

public class D4T13and14 {
	public static void main(String[] args) {
		int f=1234512345;
		Scanner sc=new Scanner(System.in);
		while(true){
		int n=sc.nextInt();
		int entered=n;
		int total=0,q=0,reverse=0;
		for(int i=n;i>0;i=(i/10)) {
			q=n%10;
			reverse=(reverse*10)+q;
			total=total+q;
			n=n/10;
		}
		System.out.println("Reverse : "+reverse+"\nSum : "+total);
		
		if(reverse==entered) {
			System.out.println("--->Palindrome number");
		}
		else {
			System.out.println("--->Not a palindrome number");
		}
	}
	}

}
/*QUESTION 13:
-------------
Description: Sum of the number

Example:
--------
Input  = 123
Output = 6
*/
/*QUESTION 14:
--------------
Description: Verify the number is palindrome  number not

Example:
--------
Input  = 141
Output = Palindrome
*/