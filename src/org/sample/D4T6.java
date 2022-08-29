package org.sample;

import java.util.Scanner;

public class D4T6 {
public static void main(String[] args) {
	int n=0;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int fact=1;
//for(int i=1;i<=n;i++)--->both will work in the same way 
		for(int i=n;i>=1;i--){
			fact=fact*i;
		}
		System.out.println("The Factorial is : "+fact);	
 	}
}

//--------------------------------------------------------------

	//with using recurrsion
/*public static void main(String[] args) {
	int n=0,fact=1;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	fact=factorial(n);
	System.out.println(fact);
}
static int factorial(int n) {
	if(n==0) {
		return 1;
	}
	else {
		System.out.println("*");
		return n*(factorial(n-1));
		
		}
	}
}*/

//-------------------------------------------------------------------





/*QUESTION 6:
-----------
Description: Write a program to find the factorial of a number.

Example:
--------
Input  = 5
Output = 120

*/
