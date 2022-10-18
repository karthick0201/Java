package Eva_1;

import java.util.Scanner;

public class ConsecutiveIntegers_1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//INPUT 
		System.out.print("Enter N : ");
		int n=in.nextInt();
		int A[]=new int[n];
		System.out.println("Enter Array Element : ");
		for(int i=0;i<n;i++) {
			A[i]=in.nextInt();
		}
//---------TEST CASE 1 --------------------------------------------------------------------		
		//int n=5;
		//int A[]= {4,2,4,3,1};
//-----------------------------------------------------------------------------
//---------TEST CASE 2 --------------------------------------------------------------------		
		//int n=7;
		//int A[]= {-1,5,4,2,0,3,1};
//-----------------------------------------------------------------------------
////---------TEST CASE 3 --------------------------------------------------------------------		
//		int n=7;
//		int A[]= {-1,4,4,2,0,3,1};
//-----------------------------------------------------------------------------

		
		//ALGORITHM
		int max=A[0];
		int min=A[0];
		for(int i=1;i<n;i++) {
			if(max<A[i]) {
				max=A[i];
			}
			if(min>A[i]) {
				min=A[i];
			}
		}
//		System.out.println("Max : " + max + "   " + min);
		int y=-min;
		int cv=min-1;
		
		int B[]=new int[max+y+1];
		
		for(int i=0;i<n;i++) {
			B[A[i]+y]++;
		}
		
		//VARIABLES:
		int n2=max+y+1;
		int flag=0;
		int repeat=cv;
		
		for(int i=0;i<n2;i++) {
			if(B[i]==0) {
				flag++;
				System.out.println("Check : " + flag);
				break;
			}
			if(B[i]>1) {
				repeat=i-y;
			}
		}
		//System.out.println("Flag : " + flag);
		if(flag==0) {
			if(repeat!=cv) {
				System.out.println("Element Repeated : " + repeat);
			}
			else {
				System.out.println("Consecutive Integers : " + (0-y) + "to" + /*((n2-1)-y)*/ max + " ");
			}
		}
		else {
			System.out.println("Not Consecutive");
		}
		

	}

}
