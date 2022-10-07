package Pdf_1_2;

import java.util.Scanner;

public class MinMax_6 {

	public static void main(String[] args) {
		
/*------------------------------------------------------------------------------------------------------------------------
6) Given an array A of size N of integers. Your task is to find the minimum
and maximum elements in the array.

	Example 1:
	
	Input:
	
	N = 6
	A[] = {3, 2, 1, 56, 10000, 167}
	
	Output:
	min = 1, max = 10000
	
	Example 2:
	
	Input:
	
	N = 5
	
	A[] = {1, 345, 234, 21, 56789}
	Output:
	min = 1, max = 56789
-----------------------------------------------------------------------------------------------------------------------------------*/
		Scanner in=new Scanner(System.in);
		System.out.println("Enter N Valude : ");
		int n =in.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=in.nextInt();
		}
		//ALGORITHM:
		int flag=0;
		int min=0;
		int max=0;
		for(int i=0;i<n;i++) {
			if(flag==0) {
				min=A[i];
				max=A[i];
				flag++;
			}
			if(max < A[i]) {
				max=A[i];
				
			}
			if(min > A[i]) {
				min=A[i];
			}
		}
		System.out.println("Min : " + min);
		System.out.println("Max : " + max);
		
	}

/*static void programsss() { //ANOTHER SUM
		
			Scanner scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			int n = str.length();
			String result="";
			
			
			for(int i=n-1;i>=0;i--) {
				result += str.charAt(i);
			}
			
			//hello.world  -->   d l r o w . o l l e h
					//			 0 1 2 3 4 5 6 7 8 9 10
			//result :  j=5,6 , Length- 11
			
			//System.out.println(result);
			int j=0,count=0;
			String str1="";
			int nnn=result.length();
			for(int i=0;i<result.length();i++) {
				if(result.charAt(i)!='.') {
					j++;
					count++;
//					if(i==(nnn-1)) {
//						for(int k=i-1;k>=i-count-1;k--) {
//							System.out.println(str1.charAt(k));
//						}
//					}
				}
			   else {
					System.out.println(j);
					//for(int k=j-1;k>=0;k--) {
					for(int k=i-1;k>=i-count;k--) {
						str1 += result.charAt(k);
					}
					count=0;
					str1 +=".";
					j += 1;
					System.out.println(  "check : " + str1);
				}
			}
			
			
			
			System.out.println(str1);
		    for(int i=str1.length()-2;i>=0;i--) {
		    	if(str1.charAt(i)=='.') {
		    		break;
		    	}
		    	System.out.print(str1.charAt(i));
		    }
			scanner.close();
			}	
			*/

}
