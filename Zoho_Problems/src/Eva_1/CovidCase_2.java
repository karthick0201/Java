package Eva_1;

import java.util.Scanner;

public class CovidCase_2 {

	public static void main(String[] args) {
		//INPUT 
		Scanner in=new Scanner(System.in);
		System.out.print("Enter N : ");
		int n=in.nextInt();
		int A[]=new int[n];
		System.out.println("Enter Array Element : ");
		for(int i=0;i<n;i++) {
			A[i]=in.nextInt();
		}
		System.out.println("Enter K Value : ");
		int k=in.nextInt();
/*--------------------------------------------------------------------------*/
//		int n=9;
//		int A[]= {1,2,3,1,4,5,2,3,6};
//		int k=3;
/*--------------------------------------------------------------------------*/
		//ALGORITHM
		int day=1; int patients=0,max=0,days=0;
		
		for(int i=0;i<n;i++) {
			patients=patients+A[i];
			
			if(i-k>=0) {//
				patients=patients-A[i-k];
				System.out.println("Day " + day++ + "==>" + patients + "Patients");
				if(max<=patients) {
					max=patients;
					days=i;
				}
			}
			else {
				System.out.println("Day " + day++ + "==>" + patients + "Patients");
			}
		}
		while(k>1) {
			patients=patients-A[n-k];
			System.out.println("Day " + day++ + "==>" + patients + "Patients");
			k--;
		}
		System.out.println("Day " + day++ + "==> " + "The Hospital will be corona Free");
		
		//OUTPUT :
		
		System.out.println("\n\n OUTPUT \n\n");
		System.out.println("so the Hospital has treated "+max+ " patiens on Day "+(days+1));
		
		

	}

}
