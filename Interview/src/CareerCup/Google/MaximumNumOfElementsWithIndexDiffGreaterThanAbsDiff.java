/**
 * 
 */
package CareerCup.Google;

/**
 * @author vikash
 * https://www.careercup.com/question?id=5753656306565120
 * Given an Array A with n elements. Pick maximum number of elements from given array following the rule: 
1. We cannot pick A[i] and A[j] if absolute value of (A[i] - A[j]) > absolute value of (i - j) 

Example: {13,5,4} 
Ans: 2 
Pick 5 and 4.
 *
 */
public class MaximumNumOfElementsWithIndexDiffGreaterThanAbsDiff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxNumOfElements(new int[] {13,5,4,15,16}));
	}
	
	public static int maxNumOfElements(int[] a) {
		int[] dp = new int[a.length];
		dp[0] = 1;
		int max = 0;
		for(int i = 1; i < a.length; i++) {
			int curMax = 1;
			for (int j = i-1; j >= 0; j--) {
				if (Math.abs(a[i] - a[j]) <= Math.abs(i-j)) {
					curMax = Math.max(curMax, 1 + dp[j]);					
				}
			}
			dp[i] = curMax;
			max = Math.max(curMax, max);
		}
		return max;
	}

}
