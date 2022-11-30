package com.ballBrick;

public abstract class BallBrick {
	
	public abstract void ballCount(char board[][],int n, int ballCount);
	public abstract void ballDirection();
	
	
	
	
	
	protected static void printMatrix(char[][] board, int n) {  
		for(int row=0;row<n;row++) {
			for(int col=0;col<n;col++) {
				System.out.print(board[row][col] + " ");
			}
			System.out.println();
		}		
	}
	
}
