package random;

import java.util.Arrays;
import java.util.Scanner;

public class SnehaFrdQuestion {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int totalSum=0;
		/* FIND TOTAL SUM: */
		System.out.println("Enter N : ");
		int n = in.nextInt();
		int A[]=new int[n];
		System.out.println("Enter Elements : ");
		for(int i=0;i<n;i++) {
			A[i]=in.nextInt();
			totalSum+=A[i];
		}
		System.out.println("Enter K value: ");
		int k=in.nextInt();
		int privousValue;
		int privousIndex;
		int temp;
		int sum=0;
		int flag=0;
		int cv=0;
		//ALGORTHM
		for(int i=0;i<n;i++) {
			if(flag==0) {

				temp=A[i]*k;
//				
//s				privousValue=A[i];
//				privousIndex=i;
				if(totalSum<=temp) {
					privousValue=A[i-1];
					privousIndex=i-1;
					for(int j=0;j<n;j++) {
						if(j!=privousIndex) {
							sum=sum+A[j];
						}
					}
					if(sum%k==0) {
						A[i-1]=cv;
						flag++;
						break;
					}
				}
			
			}
		}
		if(flag==0) {
			System.out.println("No Elements Removed!!!");
		}
		System.out.println(Arrays.toString(A));
		
	}

}
