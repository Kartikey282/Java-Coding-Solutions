import java.util.Map;
import java.util.HashMap;

class Main
{
	public static void findMaxLenSubarray(int[] nums, int S)
	{
		Map<Integer , Integer> map = new HashMap<>();
		map.put(0 , -1);
		int sum = 0;
		int len =0;
		int end = -1;
		for(int i=0;i<nums.length;i++)
		{
			sum += nums[i];
			map.putIfAbsent(sum , i);
			if(map.containsKey(sum - S) && len < i - map.get(sum - S))
			{
				len = i - map.get(sum - S);
				end =i;
			}
		}
		System.out.println("[" + (end -len +1) + "," + end + "]");
	}
	
	public static void main (String[] args)
    {
        int[] nums = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
        int target = 8;
 
        findMaxLenSubarray(nums, target);
    }
}