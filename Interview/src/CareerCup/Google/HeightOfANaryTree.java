/**
 * 
 */
package CareerCup.Google;

import java.util.Iterator;

import Datatypes.LinkedList.Tree.NaryTreeNode;

/**
 * @author vikash
 * Create a function to calculate the height of an n-ary tree.
 */
public class HeightOfANaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int heightOfANaryTree(NaryTreeNode<Integer> root) {		
		return calculateTreeNodeHeight(root);
	}
	
	public static int calculateTreeNodeHeight(NaryTreeNode<Integer> node) {
		int height = 0;
		if (node == null) return height;
		Iterator<NaryTreeNode<Integer>> iterator = node.iterator();
		while (iterator.hasNext()) {
			NaryTreeNode<Integer> child = iterator.next();
			height = Math.max(height,calculateTreeNodeHeight(child));				
		}
		return height+1;
	}

}
