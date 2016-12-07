package Datatypes.LinkedList.Tree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NaryTreeNode<T> implements Iterable<NaryTreeNode<T>>{
	T val;
    Set<NaryTreeNode<T>> childs;
    
    public NaryTreeNode() {
    	childs = new HashSet<NaryTreeNode<T>>();
    }
	
	public NaryTreeNode(T val) {
		this.val = val;
		childs = new HashSet<NaryTreeNode<T>>();
	}
	
	public boolean addChild(NaryTreeNode<T> n) {
	    return childs.add(n);
	}

    public boolean removeChild(NaryTreeNode<T> n) {
        return childs.remove(n);
    }
    
    public Iterator<NaryTreeNode<T>> iterator() {
        return childs.iterator();
    }
}
