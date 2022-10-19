package Task_5;

import java.util.Scanner;


/*=========================================================
3. Given an integer array nums of length n and an integer target, find
three integers in nums such that the sum is closest to target.
Return the sum of the three integers.
You may assume that each input would have exactly one solution.
Example 1:
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 =
2).
Example 2:
Input: nums = [0,0,0], target = 1
Nibila Amutha
Output: 0
Constraints:
3 <= nums.length <= 1000
-1000 <= nums[i] <= 1000
-104 <= target <= 104
=========================================================
*/
public class ThreeSumClosestTarget_3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//INPUT
		System.out.println("Enter n Value: ");
		int n=in.nextInt();
		
		int A[]=new int[n];
		System.out.println("ENter Elements : ");
		for(int i=0;i<n;i++) {
			A[i]=in.nextInt();
		}
		System.out.println("Enter TargeT value: ");
		int target=in.nextInt();
		//ALGORITHM
		int sum=0 , flag=0 , value=0 , diff=0;
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					//FIND SUM:
					sum=A[i] + A[j] + A[k];
					if(flag==0) {
						diff=Math.abs(sum-target);
						//System.out.println("va;ue : diff : " + diff);
						flag++;
					}
					int temp=Math.abs(sum-target);
					if(diff>=temp) {
						diff=temp;
						value=sum;
					}
					
					
				}
			}
		}
		System.out.println("Closest Target : " + value);

	}

}
