/**
 * 
 */
package CareerCup.Google;

/**
 * @author vikash
 * https://www.careercup.com/question?id=5759602621677568
 * Given an NxN grid with an array of lamp coordinates. Each lamp provides illumination to every square on their x axis, every square on their y axis, and every square that lies in their diagonal (think of a Queen in chess). Given an array of query coordinates, determine whether that point is illuminated or not. The catch is when checking a query all lamps adjacent to, or on,…
 *
 */
public class LampGridIllumination {

	private boolean[] columns, rows, diagonalsLeft, diagonalsRight;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public LampGridIllumination(int size, int[][] lamps){
		this.columns = new boolean[size];
		this.rows = new boolean[size];
		this.diagonalsLeft = new boolean[(size - 1) * 2 + 1];
		this.diagonalsRight = new boolean[(size - 1) * 2 + 1];

		
		for(int[] lampcoor : lamps){
			int x = lampcoor[0];
			int y = lampcoor[1];

			this.columns[x] = true;
			this.rows[y] = true;
			this.diagonalsLeft[x + y] = true;
			this.diagonalsRight[x - y] = true;
		}
	}

	public boolean query(int x, int y){
		if(columns[x] || rows[y] || diagonalsLeft[x + y] || this.diagonalsRight[x - y])
			return true;
		return false;
	}

}
