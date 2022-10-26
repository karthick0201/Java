package Diwali_Questions;

import java.util.Scanner;
import java.util.Stack;

public class StackPrintMinimum_14 { //NEW TECHNIC - WRITE THIS ON THAT NOTE
/*4. You are given an array A of size N. You need to first push the
elements of the array into a stack and then print minimum in the stack
at each pop.
Example 1:
Input:
N = 5
A = {1 2 3 4 5}
Output:
1 1 1 1 1
Explanation:
After pushing elements to the stack,
the stack will be "top -> 5, 4, 3, 2, 1".
Now, start popping elements from the stack
popping 5: min in the stack is 1.popped 5
popping 4: min in the stack is 1. popped 4
popping 3: min in the stack is 1. popped 3
popping 2: min in the stack is 1. popped 2
popping 1: min in the stack is 1. popped 1
Example 2:
Input:
N = 7
A = {1 6 43 1 2 0 5}
Output:
0 0 1 1 1 1 1*/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// INPUT:
		System.out.println("ENter n Value: ");
		int n = in.nextInt();
		int A[] = new int[n];
		System.out.println("Enter Elements : ");
		for (int i = 0; i < n; i++) {
			A[i] = in.nextInt();
		}
		
		pushStack(A,n);

	}

	private static void pushStack(int[] A, int n) {
		Stack s=new Stack();
		int min=A[0];
		
		for(int i=0;i<n;i++) {
			min=Math.min(min, A[i]);
			s.push(min);
		}
		
		popAndPrint(s);
		
		
	}

	private static void popAndPrint(Stack s) {
		while(s.isEmpty()==false) {
			System.out.print(s.pop() + " ");
		}
		
	}

}
