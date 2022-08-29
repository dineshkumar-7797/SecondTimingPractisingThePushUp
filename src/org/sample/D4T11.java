package org.sample;

import java.util.Scanner;

public class D4T11 {
	public static void main(String[] args) {
		while (true) {Scanner sc=new  Scanner(System.in);
		System.out.print("The nuber to reverse : ");
		int n = sc.nextInt();
	    int q=0,r=0;
	     
	    for(int i=n;i>0;i=(i/10) ) {
	    	q=n%10;
	    	r=(r*10)+q;
	    	n=n/10;  
	    }
		System.out.println("Reversed number :"+r+"\n");
		}
	}

}
/*QUESTION 11:
-------------
Description: Reverse the number

Example:
--------
Input  = 123
Output = 321
*/

