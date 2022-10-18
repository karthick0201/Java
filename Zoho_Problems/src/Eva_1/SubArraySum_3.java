package Eva_1;

import java.util.Scanner;

public class SubArraySum_3 {
	
	static int print(int A[],int start,int end) {
		System.out.print("{ ");
		for(int i=start;i<=end;i++) {
			System.out.print(A[i] + " ");
		}
		System.out.print(" }  ");
		return 1;
		
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//INPUT 
		//System.out.print("Enter N : ");
//		int n=in.nextInt();
//		int A[]=new int[n];
//		System.out.println("Enter Array Element : ");
//		for(int i=0;i<n;i++) {
//			A[i]=in.nextInt();
//		}
//		System.out.println("Enter K Value : ");
//		int k=in.nextInt();
//---------TEST CASE 1 --------------------------------------------------------------------		
		//int n=10;
		//int A[]= {2,6,0,9,7,3,1,4,1,10};
		//int k=15;
//-----------------------------------------------------------------------------
//---------TEST CASE 1 --------------------------------------------------------------------		
		int n=11;
		int A[]= {0,5,-7,1,-4,7,6,1,4,1,10};
		int k=-3;
//-----------------------------------------------------------------------------
		//ALGORITHM
		int sum=0;
		int count=0;
		int start,end;
		for(int i=0;i<n-1;i++) {
			sum=A[i];
			for(int j=i+1;j<n;j++) {
				sum=sum+A[j];
				if(sum==k) {
					start=i;
					end=j;
					count=print(A,start,end);
					
				}
				if(sum>k) {
					break;
				}
			}
			sum=0;
			//if(count==1) {
				//break;
			//}
		}
	}

}
