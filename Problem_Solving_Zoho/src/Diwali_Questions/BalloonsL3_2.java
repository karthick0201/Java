package Diwali_Questions;

import java.util.Scanner;

public class BalloonsL3_2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Scanner inn=new Scanner(System.in);
		System.out.println("Enter Matrix Size(M,N) : ");
		int m=in.nextInt();
		int n=in.nextInt();
		char A[][] = new char[m][n];
		System.out.println("Print : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				A[i][j] ='.';
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		int position;
		char color;
		char check = 'y';
		while(check=='y') {
			System.out.print("Enter Column Number : ");
			position=in.nextInt();
			System.out.print("Enter Balloon Color : ");
			color = inn.next().charAt(0);
			int col=position--;
			int row=m;
			
			insertBalloon(A,col,row-1,color);
			printMatrix(A);
			if(isColumnFilled(A,m,n)) {
				System.out.println("Column is filled completely. Program is terminated...");
				break;
			}
			System.out.print("Do you wish to continue(Y/N) : ");
			check=inn.next().charAt(0);
		}
		
	}

	private static boolean isColumnFilled(char[][] a, int m, int n) { //task 2
		for(int j=0;j<n;j++) {
			//boolean check =false;
			int flag=0;
			for(int i=m-1;i>=0;i--) {
				if(a[i][j]!='.') {
					flag++;
				}
			}
			if(flag==3) {
				return true;
			}
		}
		//return false;
		return false;
	}

	private static void insertBalloon(char[][] A, int col, int row,char color) {
		int i;
		for(i=row;i>=0;i--) {
			if(A[i][col-1]=='.') {
				A[i][col-1]=color;
//				printMatrix(A);
				/*if(i==0) {
					return 
					System.out.println("Program Terminated!!!");
				}*/
				break;
			}
		}
		
	}

	private static void printMatrix(char[][] A) {
		System.out.println("---------------------");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		
	}

}
