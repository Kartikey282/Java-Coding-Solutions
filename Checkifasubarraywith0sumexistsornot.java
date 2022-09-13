/*

Given an integer array, check if it contains a contiguous subarray having zero-sum.

Input : [3, 4, -7, 3, 1, 3, 1, -4, -2, -2]
Output: true
Explanation: The subarrays with zero-sum are

[3, 4, -7]
[4, -7, 3]
[-7, 3, 1, 3]
[3, 1, -4]
[3, 1, 3, 1, -4, -2, -2]
[3, 4, -7, 3, 1, 3, 1, -4, -2, -2]

Input : [4, -7, 1, 2, -1]
Output: false
Explanation: The subarray with zero-sum doesn't exist.

*/

class Solution
{
	public static boolean hasZeroSumSubarray(int[] nums)
	{
		Set<Integer> set = new HashSet<>();
		set.add(0);
		int sum =0;
		for(int value: nums)
		{
			sum += value;
			if(set.contains(sum))
			{
				return true;
			}
			set.add(sum);
		}
		return false;
	}
}
