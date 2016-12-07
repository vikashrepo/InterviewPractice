/**
 * 
 */
package CareerCup.Google;

/**
 * @author vikash
 * Given a string "2-4a0r7-4k", there are two dashes which we can split into 3 groups of length 1, 5, 2. 

If we want each group to be length 4, then we get "24A0-R74k" 

Given a String A and an int K, return a correctly formatted string. 

IF A is "2-4A0r7-4k" and B is 4, string is "24A0-R74K" 
IF K is 3, string is "24-A0R-74K" as the first grp could be shorter.
 *
 *https://www.careercup.com/question?id=5758287824814080
 */
public class CorrectlyForamttedString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reformat("2-4A0r7-4k", 3));

	}
	
	private static String reformat(String s, int k) {
		int len = s.length();
		StringBuilder res = new StringBuilder();
		
		int count = 0;
		for (int i= len - 1; i >= 0; i--) {
			char c = s.charAt(i);
			if (c != '-') {
				if (count == k) {
					res.append("-");
					count = 0 ;
					i++;
				} else {
					res.append(c);
					count++;
				}
			}
		}
		return res.reverse().toString();
	}

}
