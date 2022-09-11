/*

Given an integer array, replace each element with the product of every other element without using the division operator.

Input : [1, 2, 3, 4, 5]
Output: [120, 60, 40, 30, 24]

Input : [5, 3, 4, 2, 6, 8]
Output: [1152, 1920, 1440, 2880, 960, 720]

*/

class Solution
{
	public static void rearrange(int[] nums)
	{
		// Write your code here...
		int n = nums.length;
		if(n == 0)
		{
			return;
		}
		int left[] = new int[n];
		int right[] = new int[n];
		left[0] = 1;
		for(int i=1;i<n;i++)
		{
			left[i] = left[i-1] * nums[i-1];
		}
		right[n -1] =1;
		for(int j = n-2;j>=0;j--)
		{
			right[j] = right[j+1] * nums[j+1];
		}
		for(int i=0;i<n;i++)
		{
			nums[i] = left[i] * right[i];
		}
	}
}
