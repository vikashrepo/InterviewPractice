/**
 * 
 */
package Leetcode.Algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author vikash
 * 
 * 1. Two Sum
 * 
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

	You may assume that each input would have exactly one solution.
 *
 */
public class TwoSum_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}

}
