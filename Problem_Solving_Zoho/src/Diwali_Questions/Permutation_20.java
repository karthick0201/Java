package Diwali_Questions;

import java.util.Scanner;

public class Permutation_20 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter String : ");
		String s=in.next();
		
		int n=s.length();
		findPermutation(s,0,n-1);
		

	}

	private static void findPermutation(String s, int front, int back) {
		
		if(front==back) {
			System.out.println(s);
		}else {
			for(int i=front;i<=back;i++) {
				//1. do
				s= swap(s,front,i);
				//2. recur
				findPermutation(s,front+1,back);
				//3. undo
				s=swap(s,front,i);
			}
		}
		
	}

	private static String swap(String s, int i, int j) {
		char[] A=s.toCharArray();
		char temp=A[i];
		A[i]=A[j];
		A[j]=temp;
		
		return String.valueOf(A);
	}

}
