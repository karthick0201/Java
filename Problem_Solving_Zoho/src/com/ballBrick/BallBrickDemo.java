package com.ballBrick;

import java.util.Scanner;



public class BallBrickDemo {
	final static char wall='w';
	final static char ball='b';
	final static char ground='g';
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

		//PRINT STATEMENT
		/* printMatrix(board,n); */
		
		BallBrick t1,t2,t3,t4;		
		
		boolean check=true;
		int choice;
		while(check) {
			System.out.println("\n--------------------");
			System.out.println("1. Task-1 \n2. Task-2\n3. Task-3\n4. Task-4\n5. Task-5\n6. Exit");
			System.out.print("--------------------\n Enter Your choice : ");
			
			choice=in.nextInt();
			switch(choice) {
			case 1:
				//TASK-1 CLASS OBJECT CREATION:
				t1=new Task_1();
				reception(t1);
				break;
			case 2:
				//TASK-2 CLASS OBJECT CREATION:
				t2=new Task_2();
				reception(t2);
				break;
			case 3:
				System.out.println("Case 3");
				break;
			case 4:
				System.out.println("Case 4");
				break;
			case 5:
				System.out.println("Case 5");
				
			case 6:
				System.out.println("\tThankYou!!!");
				check=false;
				break;
				default:
					System.out.println("Worng OPtion!!!");
			}
		}
		
		
		
		
		
	}
	private static void reception(BallBrick t1) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter N Value : ");
		int n=in.nextInt();
		
		char board[][] = setDefaultValue(n);
		char check = 'y';
		int M,N,ballCount;
		char btype;
		System.out.println("Bricks's Position & TYPE : ");
		while(check=='y') {
			System.out.print("Enter Row & Column Number : ");
			M=in.nextInt();
			N=in.nextInt();
			System.out.println("ENter Type : ");
			btype=in.next().charAt(0);
			board[M][N]=btype;
			
			System.out.print("Do you wish to continue(Y/N) : ");
			check=in.next().charAt(0);
			
		}
		System.out.println("---------------------------- /n ENter Ball COunt : ");
		ballCount=in.nextInt();
		
		t1.ballCount(board, n,ballCount);
		
		
		
	}



	private static char[][] setDefaultValue(int n) {  
		
		Scanner in=new Scanner(System.in);
		
		char board[][]=new char[n][n];
		for(int row=0;row<n;row++) {
			for(int col=0;col<n;col++) {
				board[row][col]='.';
				if(row==0) {
					board[row][col]=wall;
				}
				if(col==0 || col==(n-1)) {
					board[row][col]=wall;
				}
				if (row == (n - 1) && (col > 0 && col < n-1)/* ((col!=0) || (col!=n-1)) */) {
					board[row][col]=ground;
				}
			}
		}
		board[n-1][n/2]=ball;
		return board;
		
	}
}
