/**
 * 
 */
package CareerCup.Google;

/**
 * @author vikash
 * 
 * Return the pivot index of the given array of numbers. The pivot index is the index where the sum of the numbers on the left is equal to the sum of the numbers on the right. Input Array {1,2,3,4,0,6}
 *
 */
public class PivotIndexOfTheArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = new int[]{0};
		System.out.println(findPivotIndex(a1));
		a1 = new int[]{0,1};
		System.out.println(findPivotIndex(a1));
		a1 = new int[]{0,0};
		System.out.println(findPivotIndex(a1));
		a1 = new int[]{1,2,3,4,0,6};
		System.out.println(findPivotIndex(a1));

	}
	
	public static int findPivotIndex(int[] a) {
		if (a.length == 0) { return -1;}
		if (a.length == 1) { return 0;}
		
		int leftSum = 0;
		int rightSum = 0;
		
		for (int i = 0; i < a.length; i++) {
			rightSum+=a[i];
		}
		
		for (int j=0; j < a.length; j++) {
			rightSum-=a[j];
			if (leftSum == rightSum) { return j;}
			leftSum+=a[j];
		}
		return -1;		
	}

}
