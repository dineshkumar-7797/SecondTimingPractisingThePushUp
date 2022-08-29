package org.sample;

import java.util.Scanner;

public class D4T1 {
	static int age;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		if(age>=18) {
			System.out.println("Eligible for voting");
		}
		else {
			System.out.println("Not Eligible for voting");	
			System.out.println("For the Git updation");
			}
		
	}


}
