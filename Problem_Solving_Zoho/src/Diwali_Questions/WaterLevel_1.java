package Diwali_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class WaterLevel_1 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		//INPUT:
		System.out.println("ENter n Value: ");
		int n=in.nextInt();
		System.out.println("Enter Elements : ");
		int A[]=new int[n];
		int min=Integer.MAX_VALUE; int max=0;
		for(int i=0;i<n;i++) {
			A[i]=in.nextInt();
			if(min>A[i]) {
				min=A[i];
			}
			if(max<A[i]) {
				max=A[i];
			}
		}
		int cv=min-1;
		System.out.println("Cv  : " + cv);
		//ALGORITHM: //FInd 2nd Max:
		int k=2;
		int max1=0,max2=0;
		int index=0;
		while(k>0) {
			
			for(int i=0;i<n;i++) {
				if(max1<A[i]) {
					max1=A[i];
					index=i;
					
				}
			}
			max2=max1;
			A[index]=cv;
			max1=0;
			k--;
		}
		//Find water COunt: 
		int waterCount=0;
		
		for(int i=0;i<n;i++) {
			if(A[i]!=cv) {
				int temp=max2-A[i];
				waterCount += temp;
//				System.out.println( i +"-> Water COunt : " + waterCount);
//				System.out.println( i +"->Temp value  : " + temp);
			}
		}
		
		
		System.out.println("Water Lever : " + waterCount);
		
		System.out.println(Arrays.toString(A));
	}

}
