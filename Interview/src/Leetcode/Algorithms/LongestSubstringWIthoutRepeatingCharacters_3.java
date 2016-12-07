package Leetcode.Algorithms;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWIthoutRepeatingCharacters_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int lengthOfLongestSubstring(String s) {
		int ans = 0;
		if (s == null) return ans;
		int length = s.length();
		if (length == 0) return ans;
		
		Map<Character, Integer> map = new HashMap<>();
		
		for (int i=0,j=0;j < length;j++ ) {
			if (map.containsKey(s.charAt(j))) {
				i = Math.max(i, map.get(s.charAt(j)));
			}
			ans = Math.max(ans, j-i+1);	
			map.put(s.charAt(j), j+1);
		}
		return ans;		
	}

}
