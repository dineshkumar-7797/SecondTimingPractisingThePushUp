package org.sample;

import java.util.Scanner;

public class D4T10 {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			int n=sc.nextInt();
			int copy=n,count=0, total=0;
			for(int i=n;i>0;i=(i/10)) {
				count++;
			}
			for(int i=n;i>0;i=(i/10)) {
				int q=n%10;
				n=n/10;
//				System.out.println(q);
				total=(int) (total+Math.pow(q, count));
			}
			System.out.println(total);
			if(copy==total) {
				System.out.println("Amstrong number");
			}
			else {
				System.out.println("Not an amstrong number");
			}
		}
	}

}
/*QUESTION 10:
-------------
Description: Find Amstrong number or not

Example:
--------
Input  = 153
Output = Amstrong number
*/