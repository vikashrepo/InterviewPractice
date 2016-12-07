package Datatypes.LinkedList;

public class ListNodeInteger {
	public int val;
	public ListNodeInteger next;
	public ListNodeInteger() {
		// TODO Auto-generated constructor stub
	}
	public ListNodeInteger(int x) {
		val = x;
	}
	public ListNodeInteger(ListNodeInteger next) {
		this.next = next;
	}
	public ListNodeInteger(int x, ListNodeInteger next) {
		val = x;
		this.next = next;
	}
	public void setVal(int x) {
		val = x;
	}
	public void setNext(ListNodeInteger next) {
		this.next = next;
	}
}
