/**
 * 
 */
package CareerCup.Google;

/**
 * @author vikash
 * https://www.careercup.com/question?id=5737503739871232
 * 
 *Find the largest and smallest number in a list. The list is stored as two sections, one in ascending order and the other in descending order. 

input [ 2 3 4 5 6 7 10 9 8 7] 
smallest : 2 
Largest 10
 */
public class FindMinAndMaxInAscendingAndDescendingArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(getMax(new int[]{2,3,4,5,6,10,10,10, 9, 8, 7}));

	}
	
	public static int getMax(int[] arr) {
		int st = 0;
		int end = arr.length-1;
		int mid= 0;
		while (end >= st) {
			mid = st + (end-st)/2;
			if (arr[mid] >= arr[mid-1] && arr[mid] > arr[mid+1]) {
				break;
			}
			if (arr[mid+1] >= arr[mid]) {
				st = mid;				
			} else {
				end = mid;
			}
			
		}
		return arr[mid];
	}

}
