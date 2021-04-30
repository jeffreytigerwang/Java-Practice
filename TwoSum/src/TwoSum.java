import java.lang.Integer;
import java.lang.String;
import java.lang.System;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (prevMap.containsKey(diff)) {
                return new int[]{ prevMap.get(diff), i };
            }
            prevMap.put(nums[i], i);
        }
        return new int[0]; // Guranteed solution, no need for return
    }
}



public class TwoSum {
    public static void main(String args[]) {

        int[] nums = {1, 2, 3, 4, 5};
        Solution test1 = new Solution();

        System.out.println(Arrays.toString(test1.twoSum(nums, 9)));


    }
}