package Diwali_Questions;

import java.util.Scanner;

public class StringArrayEqualOrNot_16 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Scanner inn=new Scanner(System.in);
		System.out.println("Enter N1 : ");
		int n1=inn.nextInt();
		System.out.println("Enter N2 : ");
		int n2=inn.nextInt();
		
		String A[]=new String[n1];
		System.out.println("ENter String A - Values : ");
		for(int i=0;i<n1;i++) {
			A[i]=in.next();
		}
		System.out.println("ENter String B - Values : ");
		String B[]=new String[n2];
		for(int i=0;i<n2;i++) {
			B[i]=in.next();
		}
		String word1=CombineString(A,n1);
		System.out.println("word1 : " + word1);
		String word2=CombineString(B,n2);
		System.out.println("word2 : " + word2);
		boolean result=CheckEqualOrNot(word1,word2);
		System.out.println(result);

	}

	private static boolean CheckEqualOrNot(String word1, String word2) {
		if(word1.equals(word2)) {
			return true;
		}
		return false;
	}

	private static String CombineString(String A[], int n) {
		
		String temp="";
		for(int i=0;i<n;i++) {
			temp += A[i];
		}
		
		
		return temp;
	}
	

	

}
