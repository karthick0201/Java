package com.ballBrick;

public class Task_2 extends BallBrick {


	@Override
	public void ballCount(char[][] board, int n,int ballCount) {
		System.out.println("Your Ball count is : " + ballCount);
		BallBrick.printMatrix(board, n);
		ballDirection();
	}

	@Override         
	public void ballDirection() {
		
		int n=7;
				
		
	}
	
}
