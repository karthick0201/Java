package Task_5;

import java.util.Scanner;

public class Rotation_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		//INPUT:
		System.out.print("Enter Row : ");
		int n=in.nextInt();
		System.out.print("Enter Col : ");
		int m=in.nextInt();
		int A[][] = new int[n][m];
		System.out.println("Enter Elements : ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				A[i][j]=in.nextInt();
				
			}
		}
		
		//ALGORITHM
		for(int j=0;j<m;j++) {
			for(int i=n-1;i>=0;i--) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
