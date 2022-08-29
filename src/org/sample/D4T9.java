package org.sample;

public class D4T9 {

	public static void main(String[] args) {
		for(int i=1;i<8;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "+j+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n\n---------------------------------------------------\n\n");
		
		for(int i=0;i<5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(" *  ");
			}
			System.out.println();
		}
		
		System.out.println("\n\n---------------------------------------------------\n\n");
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		System.out.println("\n\n---------------------------------------------------\n\n");
	}
}
/*QUESTION 9:
-----------
Description : Print the below patterns using for loop.


Output:
-------
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
-----------------------
          *
        *  *
       *  *  *
     *  *  *  *
   *   *  *  *  * 
--------------------------
*
* *
* * *
* * * *
* * * * *
-----------------------------
*/