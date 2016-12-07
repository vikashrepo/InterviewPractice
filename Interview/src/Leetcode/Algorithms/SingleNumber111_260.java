/**
 * 
 */
package Leetcode.Algorithms;

/**
 * @author vikash
 * 260. Single Number 111
 * 
 * Difficulty Level: Medium
 * Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

	For example:

	Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

	Note:
		The order of the result is not important. So in the above example, [5, 3] is also correct.
		Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
 */
public class SingleNumber111_260 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] singleNumber(int[] nums) {
		if (nums == null || nums.length == 0) {
			return new int[0];
		}
		
		int xor = 0;
		
		// Step 1: calculate the xor for all the numbers.
		// So the result is the xor of the two numbers.
		
		for (int num: nums) {
			xor ^= num;
		}
		
		int num1 = 0;
		int num2 = 0;
		
		// Find the first bit which is different in the two nums
		// from right hand side. (First bit which is 1 in xor)
		int mask = 1;
		while ((mask & xor) == 0) {
			mask = mask << 1;
		}
		
		// The masked bit is different in two numbers.So xor all the nums 
		// which are differ in that particular bit separately. One set of 
		// xor will give one number and other will give other num. Because 
		// each set will have all the nums twice except one.
		
		for (int num : nums) {
			if ((num & mask) == 0) {
				num1 ^= num;
			} else {
				num2 ^= num;
			}
		}
		
		int[] result = new int[]{num1, num2};
		
		return result;
	}

}
