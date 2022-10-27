package Diwali_Questions;

import java.util.Scanner;

public class Sudoku_17 {
	// DATA MEMEBERS
	static final int N = '9';

	public static boolean isVaild(char board[][],int row,int col,char k){
		
		for(int i=0;i<=N;i++){
			//check row
			if(board[i][col]==k){
				return false;
			}
			//check col
			if(board[row][i]==k){
				return false;
			}
			//3x3 - box check
			if(board[3 * (row/3) + i/3][3 * (col/3) + i%3] == k){
				return false;
			}
		}
		return true;
	}

	public static boolean solveSoduko(char board[][]) {

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (board[i][j] == '.') {
					for (char k = '1'; k <= 'N'; k++) {
						// do
						if (isVaild(board, i, j, k)) {
							board[i][j] = k;
							// Recur
							if (solveSoduko(board))
								return true;
							else
								board[i][j] = '.';
						}
					}
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[][] board = {  { '9', '5', '7', '.', '1', '3', '.', '8', '4' },
							{ '4', '8', '3', '.', '5', '7', '1', '.', '6' }, 
							{ '.', '1', '2', '.', '4', '9', '5', '3', '7' },
							{ '1', '7', '.', '3', '.', '4', '9', '.', '2' }, 
							{ '5', '.', '4', '9', '7', '.', '3', '6', '.' },
							{ '3', '.', '9', '5', '.', '8', '7', '.', '1' }, 
							{ '8', '4', '5', '7', '9', '.', '6', '1', '3' },
							{ '.', '9', '1', '.', '3', '6', '.', '7', '5' },
							{ '7', '.', '6', '1', '8', '5', '4', '.', '9' } };

		solveSoduko(board);
	}

}
