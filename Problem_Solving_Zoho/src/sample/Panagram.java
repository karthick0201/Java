package sample;

import java.util.Arrays;

public class Panagram {
	public static void main(String[] args) {
		String str1 = "catch got tea eat";
		String str2 = "ate";
		int n1 = str1.length();
		int n2 = str2.length();
		char A[] = str1.toCharArray();
		// char B[]=str2.toCharArray();
		int count = 0;

		for (int i = 0; i < n1; i++) {
			if (A[i] != ' ') {
				count++;
				if(i==n1-1) {
					if (count == n2) {
						//System.out.println("\nIndex : i=" + i +" : count : " + count  );
						boolean panagramCheck = panagramCheck(A, str2, i-count, n1);
						// if true Print String
						if (panagramCheck) {
							printWord(A, i - count, i);
						}
					} 
				}
			} else {
				if (count == n2) {
					//System.out.println("\nIndex : i=" + i +" : count : " + count  );
					boolean panagramCheck = panagramCheck(A, str2, i - count, i);
					// if true Print String
					if (panagramCheck) {
						printWord(A, i - count, i);
					}
				} 
				count=0;
			}
		}

	}

	private static void printWord(char[] A, int start, int end) {  
		for (int i = start; i < end; i++) {
			System.out.print(A[i]);
		}
		System.out.println(" ,");
	}

	private static boolean panagramCheck(char[] A, String str, int start, int end) { 
		
		char B[] = str.toCharArray();
		
		for (int i = start; i < end; i++) {
			for (int j = 0; j < B.length; j++) {
				if (A[i] == B[j]) {
					B[j] = '0';					
					break;
				}
			}
		}
		// CHECK 2ND ARRAY
		int flag = 0;
		for (int i = 0; i < B.length; i++) {
			if (B[i] != '0') {
				flag++;
				break;
			}
		}

		if (flag == 0) {
			//System.out.println("True");
			return true;
		} else {
		//	System.out.println("False");
			return false;
		}

	}

}
