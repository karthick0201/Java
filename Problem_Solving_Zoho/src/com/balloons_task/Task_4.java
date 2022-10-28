package com.balloons_task;

public class Task_4 extends AbstractBalloons {

	@Override
	public void dropBalloons(char[][] A, int col, int row, char color) {
		for(int i=row;i>=0;i--) { // row is constrant
			if(A[i][col-1]=='.') {
				A[i][col-1]=color;
				break;
			}
			//CHECK LEFT COL IS FREE OR NOT
			boolean temp1=false;
			for(int j=col-2;j>=0;j--) {
				if(A[i][j]=='.') {
					A[i][j]=color;
					temp1=true;
					break;
				}
			}
			if(temp1) {
				break;
			}
			//CHECK RIGHT COL IS FREE OR NOT
			boolean temp2=false;
			int n=A[0].length;
			for(int j=col;j<n;j++) {
				if(A[i][j]=='.') {
					A[i][j]=color;
					temp2=true;
					break;
				}
			}
			if(temp2) {
				break;
			}
			
		}

		
	}

	@Override
	public boolean isBalloonCheck(char[][] A, int m, int n) {
		for(int i=0;i<m;i++) {
			int flag=0;
			for(int j=0;j<n-1;j++) {
				if(A[i][j]!=A[i][j+1]) {
					flag++;
					//break;
				}
			}
			if(flag==0) {
				for(int j=0;j<n;j++) {
					A[i][j]='.';
				}
			}
		}
		return false;
	}

}
