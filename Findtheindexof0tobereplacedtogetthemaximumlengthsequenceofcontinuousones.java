/*

Given a binary array, find the index of 0 to be replaced with 1 to get the maximum length sequence of continuous ones. The solution should return the index of first occurence of 0, when multiple continuous sequence of maximum length is possible.

Input : [0, 0, 1, 0, 1, 1, 1, 0, 1, 1]
Output: 7
Explanation: Replace index 7 to get the continuous sequence of length 6 containing all 1’s.

Input : [0, 1, 1, 0, 0]
Output: 0
Explanation: Replace index 0 or 3 to get the continuous sequence of length 3 containing all 1’s. The solution should return the first occurence.

Input : [1, 1]
Output: -1
Explanation: Invalid Input (all 1’s)

*/

class Solution
{
	public static int findIndexofZero(int[] nums)
	{
		// Write your code here...
		int countm =0;
		int index = -1;
		
		int prev =-1;
		int cou = 0;
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i] == 1)
			{
				cou++;
			}
			else
			{
				cou = i - prev;
				prev = i;
			}
			if(cou > countm)
			{
				countm = cou;
				index = prev;
			}
		}
		return index;
	}
}
