package Eva_2;

import java.util.Arrays;
import java.util.Scanner;

public class IncrementPlusOne {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//INPUT 
				System.out.println("Enter n Value : ");
				int n=in.nextInt();
				int A[]=new int[n];
				System.out.println("Enter Elements: ");
				for(int i=0;i<n;i++) {
					A[i]=in.nextInt();
				}
				//int n=3;
				//int A[]= {1,2,3};
				
				//ALGORITHM
				//ARRAY TO INT
				int a=0;
				for(int i=0;i<n;i++) {
					a=(a*10) + A[i];
				}
				//System.out.println(Arrays.toString(A));
				//System.out.println(a);
				//INCREMENT BY 1
				a++;
				
				//find a count
				int b=a;
				//System.out.println(b);
				int n2=0;
				while(b>0) {
					n2++;
					b=b/10;
				}
				//System.out.println("n2 : "+n2);
				int B[]=new int[n2];
				
				int k=n2-1;
				//System.out.println(k);
			
				while(a>0) {
					int temp=a%10;
					B[k]=temp;
					k--;
					a=a/10;
				}
				//PRINT STATEMNET:
				for(int i=0;i<n2;i++) {
					System.out.print(B[i]+",");
				}
				
				
				
				

	}

}
