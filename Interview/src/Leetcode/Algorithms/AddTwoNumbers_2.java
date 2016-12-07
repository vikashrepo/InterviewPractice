package Leetcode.Algorithms;

import Datatypes.LinkedList.*;

public class AddTwoNumbers_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNodeInteger addTwoNumbers(ListNodeInteger l1, ListNodeInteger l2) {
		if (l1 == null) return l2;
		if (l2 == null) return l1;
		
		ListNodeInteger sum = new ListNodeInteger(0);
		ListNodeInteger cur = sum;
		int carry = 0;
		while ((l1 != null) || (l2 != null)) {
			int x = (l1 != null) ? l1.val:0;
			int y = (l2 != null) ? l2.val:0;
 			int newval = carry + x + y;
			carry = newval/10;
			cur.next = new ListNodeInteger(newval%10);;
			cur = cur.next;
			l1 = l1.next;
			l2 = l2.next;
		}
		if (carry != 0) {
			cur.next = new ListNodeInteger(carry);
			cur = cur.next;
		}
		
		return sum;
 	}
 
}
