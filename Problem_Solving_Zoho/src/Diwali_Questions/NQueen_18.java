package Diwali_Questions;

import java.util.Scanner;

public class NQueen_18 {

	static int board[][];
	static int Count=1;

	private static boolean isPossible(int N, int row, int col) {

		// CHECK ROW Q IS PRESENT OR NOT
		for (int i = row; i >= 0; i--) {
			if (board[i][col] == 1) {
				return false;
			}
		}
		// check upper - left
		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}
		// Check upper - right
		for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++) {
			if (board[i][j] == 1) {
				return false;
			}
		}

		return true;
	}

	private static void placeNQueen(int N, int row) {

		if (row == N) {
			//Count++;
			System.out.println("Count : " + Count++);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(board[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("---------------------------");
			return;
		}

		for (int i = 0; i < N; i++) {// for column

			if (isPossible(N, row, i)) {
				board[row][i] = 1;
				placeNQueen(N, row + 1);
			}
			board[row][i] = 0;
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Input:
		System.out.print("Enter NQueen : ");
		//int N = 4;
		 int N=in.nextInt();
		board = new int[N][N];
		System.out.println("\n\tOutPut  \n\n");
		placeNQueen(N, 0); // TOtal Queen and which place

	}

}
