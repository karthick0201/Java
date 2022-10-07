package Pdf_1_1;

import java.util.Scanner;

public class Quadratic_Equations_1_T2_1 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int n = str.length();
		String result="";
		for(int i=n-1;i>=0;i--) {
			result += str.charAt(i);
		}
		//System.out.println(result);
		int j=0;
		String str1="";
		for(int i=0;i<result.length();i++) {
			if(result.charAt(i)!='.') {
				j++;
			}
		   else {
				System.out.println(j);
				for(int k=j-1;k>=0;k--) {
					str1 += result.charAt(k);
				}
				str1 +=".";
				j += 1;
			}
		}
		System.out.println(str1);
	    in.close();
	}
}
