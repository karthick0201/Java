package Pdf_2;

import java.util.Scanner;

public class Grampro_7 {

	public static void main(String[] args) {
		/*
------------------------------------------------------------------------------------------------------
Enter String :  PROGRAM

						            G
						          GR  
						        GRA    
						      GRAM      
						    GRAMP        
						  GRAMPR          
						GRAMPRO            
						
------------------------------------------------------------------------------------------------------------
		 * */
		Scanner in=new Scanner(System.in);
		System.out.print("Enter String :  ");
		String name=in.next();
		//PROGRAM TO GRAMPRO
		int n=name.length();
		char A[] = new char[n];
		
		int y=n/2; int k=0;
		for(int i=y;i<n;i++) {
			A[k]=name.charAt(i);
			k++;
		}
		for(int i=0;i<y;i++) {
			A[k]=name.charAt(i);
			k++;
		}
		//Patten Printing
		
		int h=(2*n)-2;
		int q=0; 
		for(int i=0;i<n;i++) {
			for(int j=0;j<(2*n)-1;j++) {
				if(j==h) {
					int p=0;
					for(int m=p;m<=q;m++) {
						System.out.print(A[m]);
						p++;
					}
					//j=j+p;
					p=0;
				}
				else {
					System.out.print(" ");
				}
			}
			q++; h=h-2; System.out.println();
		}
		
		
		
		

	}

}
