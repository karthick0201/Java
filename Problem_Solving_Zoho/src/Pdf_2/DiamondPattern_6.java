package Pdf_2;

import java.util.Scanner;

/*
------------------------------------------------------------------------------------------------------
	Enter the value :
		4
				   1 
				  3 2 
				 6 5 4 
				10 9 8 7 
				10 9 8 7 
				 6 5 4 
				  3 2 
				   1           
				
------------------------------------------------------------------------------------------------------------
 * */


   
public class DiamondPattern_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value :");
		int t = 0, k = 1,row;
		int n = sc.nextInt();
		for (row = 1; row <= n; row++) {
			for (int j = 1; j <= n - row; j++) { 
				System.out.print(" ");
			}
			
			k = t + row;
			t = k;
			for (int j = 1; j <= row; j++) {
				System.out.print(k-- + " ");
			}
			System.out.println();
		}
		
		k = t + row;
		t = k;
		for (row = n; row >= 1; row--) {
			for (int j = row; j < n; j++) {
				System.out.print(" ");
			}
			k = t - row - 1;
			t = k;
			
			for (int j = 1; j <= row; j++) {
				System.out.print(k-- + " ");
			}
			System.out.println();
		}

	}
	

}
