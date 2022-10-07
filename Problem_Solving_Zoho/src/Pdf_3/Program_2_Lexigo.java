package Pdf_3;

import java.util.Arrays;
import java.util.Scanner;

public class Program_2_Lexigo { //COMPLETED
/*
2) Given a string s, remove duplicate letters so that every letter appears once and only once. You
must make sure your result is the smallest in lexicographical order among all possible results
Input: s = "bcabc"

Output: "abc"

Input: s = "cbacdcbc"

Output: "acdb"
 */ 
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter String : ");
		String sen=in.next();
		char A[]=sen.toCharArray();
		int n=A.length;
		//ALGORITHM
		//REMOVE DUPLICATE:
		for(int i=0;i<n;i++) {
			if(A[i]!='0') {
				for(int j=i+1;j<n;j++) {
					if(A[i]==A[j]) {
						A[j]='0';
					}
				}
			}
		}
		
		//SORTING:
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(A[i]>A[j] && A[i]!='0') {
					char temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}
		//PRINT STATEMENT:
		for(int i=0;i<n;i++) {
			if(A[i]!='0') {
				System.out.print(A[i] + " ");
			}
		}
		
	}

}
