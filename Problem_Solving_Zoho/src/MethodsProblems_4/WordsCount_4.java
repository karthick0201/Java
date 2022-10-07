package MethodsProblems_4;

import java.util.Scanner;

public class WordsCount_4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = in.nextLine();
		int count = wordCount(s);
		System.out.println("Count : "+count);
	}

	private static int wordCount(String s) {
		int count = 1;
		char[] A = s.toCharArray();
		int n=A.length;
		for(int i=0;i<n;i++) {
			if(A[i]==' ') {
				count++;	
			}
		}
		if(A[n-1]==' ') {
			count--;
		}
		return count;
	}

}

