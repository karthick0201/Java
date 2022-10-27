package com.balloons_task;

public class Task_1 extends AbstractBalloons{

	@Override
	public void dropBalloons(char[][] A, int col, int row, char color) {
		for(int i=row;i>=0;i--) {
			if(A[i][col-1]=='.') {
				A[i][col-1]=color;
				break;
			}
		}
	}

	@Override
	public boolean isBalloonCheck(char[][] matrix, int m, int n) {
		
		return false;
	}

	

}
