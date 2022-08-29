package org.sample;

import java.util.Scanner;

public class D4T7 {
	public static void main(String[] args) {
		int n1=0,n2=1,n3=0;
		Scanner sc=new Scanner(System.in);
		int count = sc.nextInt();
		System.out.println(n1+"\n"+n2);
		for(int i=0;i<count-2;i++){
			n3=n2+n1;
			n1=n2;
			n2=n3;
			System.out.println(n3);
		}
		
	//1 2 3 4 5 6 7 8  9  10 11 12
	//0 1 1 2 3 5 8 13 21 34 55 89
	}
}
/*QUESTION 7:
------------
Description: Write a program to print the fibonacci series of a number 1 to 100.
*/

//-------------------------------------------------------------------------------


//fibonacci using the array
/*public static void main(String[] args) {
	int n=0,fib=0;
	Scanner sc=new Scanner(System.in);
	n = sc.nextInt();
    int[]a= new int[100];
    a[0]=0;
    a[1]=1;
    for(int i=2;i<n;i++) {
		a[i]=(a[i-1]+a[i-2]);
	}
    for (int i = 0; i < n; i++) {
    	System.out.println(a[i]+ "\t");
	}
//1 2 3 4 5 6 7 8  9  10 11 12
//0 1 1 2 3 5 8 13 21 34 55 89
}
*/