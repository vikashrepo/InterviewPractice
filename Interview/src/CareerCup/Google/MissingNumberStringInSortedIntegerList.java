/**
 * 
 */
package CareerCup.Google;

/**
 * @author vikash
 *Given a function getRandom that returns a random double in [0,1). Write a function getRandomPermutation(int n) that takes a positive integer n as argument and returns a random permutation of first n natural numbers.
 */
public class MissingNumberStringInSortedIntegerList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{1,2,50,52,75,89,98};
		String ans = missingRanges(nums, 99);
		System.out.println(ans);

	}
	
	public static String missingRanges(int[] nums, int last) {
		StringBuilder ranges = new StringBuilder();
		if (nums[0]-0 > 1) {
			int end = nums[0]-1;
			ranges.append("0-" +end+",");
		} else if (nums[0]-0 > 0) {
			ranges.append("0,");
		}	
		for (int i = 0; i < nums.length-1 ; i++) {
			int st = nums[i]+1;
			if (nums[i+1] - nums[i] > 2) {				 
				 int end = nums[i+1] - 1;
				 ranges.append(st+"-"+end+",");
			}
			else if (nums[i+1] - nums[i] > 1){
				ranges.append(st+",");
			}
		}
		if (99 - nums[nums.length-1] > 1) {
			int st = nums[nums.length-1]+1;
			ranges.append(st + "-99,");
		} else if (99 - nums[nums.length-1] > 0) {
			ranges.append("99,");
		}
		ranges.setLength(ranges.length()-1);
		return ranges.toString();
		
	}

}
