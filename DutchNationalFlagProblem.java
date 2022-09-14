/*

Given an array containing only 0’s, 1’s, and 2’s, sort it in linear time and using constant space.

Input : [0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2]

*/

class Solution
{
	public static void sortArray(int[] num)
	{
		// Write your code here...
		int i=0,mid=0;
		int p = 1;
		int j = num.length - 1;
		while(mid<=j)
		{
			if(num[mid] > p)
			{
				swap(num,mid,j);
				--j;
			}
			else if(num[mid] < p)
			{
				swap(num ,i,mid);
				mid++;
				i++;
			}
			else
			{
				mid++;	
			}
		}
		for(int k=0;k<num.length;k++)
		{
			System.out.print(" " +num[k]);
		}
		
	}
	public static void swap(int []num,int a, int b)
	{
		int temp = num[a];
		num[a] = num[b];
		num[b] = temp;
	}
}
