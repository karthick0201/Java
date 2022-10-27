package com.balloons_task;

public abstract class AbstractBalloons {
	//ABSTRACT METHODS
	abstract public void dropBalloons(char[][] matrix, int col, int row, char color);
	abstract public boolean isBalloonCheck(char[][] matrix, int m, int n);
	//NORMAL METHODS
	public void printMatrix(char A[][]) {
		System.out.println("---------------------");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
	}
}
