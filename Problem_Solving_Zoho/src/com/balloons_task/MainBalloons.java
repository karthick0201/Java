package com.balloons_task;
import java.util.*;
public class MainBalloons {
	
	//static char board[][];
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		/*OBJECT CREATION*/
		AbstractBalloons t1,t2,t3,t4,t5;
/*		AbstractBalloons t1=new Task_1();
		AbstractBalloons t1=new Task_1();
		AbstractBalloons t1=new Task_1();
		AbstractBalloons t1=new Task_1();*/
		
		
		
		
		System.out.println("\tWelcome!!!\n");
		boolean check=true;
		int choice;
		while(check) {
			System.out.println("\n--------------------");
			System.out.println("1. Task-1 \n2. Task-2\n3. Task-3\n4. Task-4\n5. Task-5\n6. Exit");
			System.out.print("--------------------\n Enter Your choice : ");
			
			choice=in.nextInt();
			switch(choice) {
			case 1:
				//TASK-1 CLASS OBJECT CREATION:
				t1=new Task_1();
				reception(t1);
				break;
			case 2:
				//TASK-2 CLASS OBJECT CREATION:
				t2=new Task_2();
				reception(t2);
				break;
			case 3:
				t3=new Task_3();
				reception(t3);
				break;
			case 4:
				t4=new Task_4();
				reception(t4);
				break;
			case 5:
				t5=new Task_5();
				reception(t5);
				break;
			case 6:
				System.out.println("\tThankYou!!!");
				check=false;
				break;
				default:
					System.out.println("Worng OPtion!!!");
			}
			
			
		}
	}

	private static void reception(AbstractBalloons t1) {
		Scanner in=new Scanner(System.in);
		Scanner inn=new Scanner(System.in);
		System.out.println("Enter Matrix Size(M,N) : ");
		int m=in.nextInt();
		int n=in.nextInt();
		char A[][] = new char[m][n];
		System.out.println("Print : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				A[i][j] ='.';
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		int position;
		char color;
		char check = 'y';
		while(check=='y') {
			System.out.print("Enter Column Number : ");
			position=in.nextInt();
			System.out.print("Enter Balloon Color : ");
			color = inn.next().charAt(0);
			int col=position;
			int row=m;
			
			t1.dropBalloons(A,col,row-1,color);
			if(t1.isBalloonCheck(A,m,n)) {				
				break;
			}
			t1.printMatrix(A);
			System.out.print("Do you wish to continue(Y/N) : ");
			check=inn.next().charAt(0);
		}
		
	}
}
