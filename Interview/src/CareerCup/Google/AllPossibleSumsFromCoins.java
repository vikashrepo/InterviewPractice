
package CareerCup.Google;

/**
 * Given a list of coin values, and quantity of each type of coin. Write a 
program to return the set of all possible sums which can be made using those 
coins. 
ex. coins = [10, 50, 100, 500] 
quantity = [5, 3, 2, 2] 
sum could be 400 , 300 ,200 , 100
 */

import java.util.ArrayList;

public class AllPossibleSumsFromCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> sums = new ArrayList<Integer>();
		int[] coins = new int[] {10, 50, 100, 500};
		int[] quantities = new int[] {5, 3, 2, 2};
		possibleSums(0, coins, quantities, sums);
		
		for (int sum: sums) {
			System.out.println(sum);
		}
	}
	
	public static void possibleSums(int i, int[] coins, int[] quantities, ArrayList<Integer> possibleSumList) {
		if (i == coins.length) {
			possibleSumList.add(0);
			return;
		}
		possibleSums(i+1, coins, quantities, possibleSumList); 
		for (int q = 0; q<= quantities[i]; q++) {
			ArrayList<Integer> currList = new ArrayList<Integer>();
			for (int next_sum : possibleSumList) {
				int curr = next_sum + q*coins[i];
				if (!possibleSumList.contains(curr)) {
					currList.add(curr);
				}
			}
			possibleSumList.addAll(currList);
		}
		
	}

}
