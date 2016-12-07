/**
 * 
 */
package CareerCup.Google;

/**
 * @author vikash
 * Let's say I have a word "I love chicken", I can break the number of characters in each word, like so: [1] [4] [7] 
[1,4] [4,7], [1,4,7]. 

Now let's say I have a max = 5. The phrases with equal or fever than 5 characters are "[I], [love], and [I, love]. The longest phrase is [I,love], which contains 2 words. 

Complete the Length function given. It has 2 parameters: 

1) An array of integers, named array 
2) A maximum number, named max. 

int Careercup( int [] array, int max) { 
} 

Example test case 1: 

[3,1,2,3] 
4 

Output expected : 2
 *
 */
public class LengthOfPhraseWithAtmostXChars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {1, 4, 7};
		System.out.println(lengthOfPhrase(a, 5));
		a = new int[] {3,1,2,3};
		System.out.println(lengthOfPhrase(a, 4));
		a = new int[] {2,5,2,7};
		System.out.println(lengthOfPhrase(a, 1));

	}
	
	public static int lengthOfPhrase(int[] chars, int x) {
		int ans=0;
		int curMax = 0;
		int numChars = 0;
		for(int st = 0, end =0; end < chars.length; end++){
			numChars = numChars+chars[end];
			curMax = curMax+1;
			while (numChars > x) {
				numChars = numChars - chars[st];
				st++;
				curMax--;
			}
			if (curMax > ans) {
				ans = curMax;
			}
		}
		
		return ans;
	}

}
