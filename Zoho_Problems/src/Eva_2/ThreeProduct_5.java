package Eva_2;

import java.util.Scanner;

public class ThreeProduct_5 {

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
		//System.out.println(Arrays.toString(A));
		//SORT ALGORITHM
		int flag=0;
		int x=0,y=0,z=0;
		int product=0;
		int maxProduct=0;
		
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if(flag==0) {
						maxProduct=A[i]*A[j]*A[k];
						x=A[i];
						y=A[j];
						z=A[k];
						flag++;
					}
					product=A[i]*A[j]*A[k];
					//CHECKING CONDITION
					if(maxProduct<product) {
						maxProduct=product;
						x=A[i];
						y=A[j];
						z=A[k];
					}
				}
			}
		}
		//PRINT STATEMENT:
		System.out.println("Max Product : " + maxProduct);
		System.out.println(x + "," + y +"," + z);
		

	}

}
