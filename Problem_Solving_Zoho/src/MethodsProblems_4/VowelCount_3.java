package MethodsProblems_4;

import java.util.Scanner;

public class VowelCount_3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter String : ");
		String sen=in.next();
		
		int count=vowelCount(sen);
		System.out.println("Vowel Count : " + count);

	}

	private static int vowelCount(String sen) {
		char A[] = sen.toCharArray();
		int n=A.length;
		int count=0;
		for(int i=0;i<n;i++) {
			if(A[i]=='a' || A[i]=='e' || A[i]=='i' || A[i]=='o' || A[i]=='u' || A[i]=='A' || A[i]=='E' || A[i]=='I' || A[i]=='O' ||A[i]=='U') {
				count++;
			}
		}
	
		return count;
	}

}
