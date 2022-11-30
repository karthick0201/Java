package com.ballBrick;

public class Task_1 extends BallBrick{

	@Override
	public void ballCount(char[][] board, int n,int ballCount) {
		
		System.out.println("Your Ball count is : " + ballCount);
		BallBrick.printMatrix(board, n);
		
	}

	@Override
	public void ballDirection() {
		// TODO Auto-generated method stub
		
	}

}
