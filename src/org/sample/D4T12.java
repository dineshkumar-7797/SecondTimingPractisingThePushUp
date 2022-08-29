package org.sample;

import java.util.Scanner;

public class D4T12 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.print("your number :");
		int n=sc.nextInt();
		int count=0;
		
		for(int i=n;i>0;i=(i/10)) {
			count++;
		}
		System.out.println("Count :"+count+"\n");
	}
}
}
/*QUESTION 12:
-------------
Description: Count of the number

Example:
--------
Input  = 123
Output = 3

*/