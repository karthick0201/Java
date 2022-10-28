package com.balloons_task;

public class Task_2 extends AbstractBalloons{

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
	public boolean isBalloonCheck(char[][] a, int m, int n) {
		for(int j=0;j<n;j++) {
			//boolean check =false;
			int flag=0;
			for(int i=m-1;i>=0;i--) {
				if(a[i][j]!='.') {
					flag++;
				}
			}
			if(flag==3) {
				System.out.println("Column is filled completely. Program is terminated...");
				return true;
			}
		}
		return false;
	}

}
