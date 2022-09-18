/*

Given an integer array of size `n`, return the element which appears more than `n/2` times. Assume that the input always contain the majority element.

Input : [2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2]
Output: 2

Input : [1, 3, 1, 1]
Output: 1

*/

class Solution
{
	public static int findMajorityElement(int[] nums)
	{
		// Write your code here...
		int m = -1;
		int i =0;
		for(int j= 0 ; j<nums.length;j++)
		{
			if(i == 0)
			{
				m = nums[j];
				i =1;
			}
			else if( m == nums[j])
			{
				i++;
			}
			else
			{
				i--;
			}
		}
		return m;
	}
}
