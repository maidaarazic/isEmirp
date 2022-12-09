package assignments;

/*
 * this class is used to implement a linked list and contains methods needed 
 * for linked list to be applicable to functions in main class
 */


public class Node {

	Link head;
	
	static class Link {
		int data;
	    Link next;
	  
	    Link (int _data){
	    	data = _data;
	    	next = null;
	    }
	    
	}
	
	public void insert(int data) {
		
		Link new_link = new Link (data);
		
		new_link.next = head;
		head = new_link;
		
}
	
	 //returns number of elements in linked lists
	 public int getSize() {
	        Link temp = head;
	        int count = 0;
	        while (temp != null) {
	            count++;
	            temp = temp.next;
	        }
	        return count;
	    }
	
	
	 //accessing elements in linked lists 
	 public int accessElement(int i) {
		    int n = indexOf(head); 
		    Link current = head;
		    while (n > i) {
		        --n;
		        current = current.next;
		    }
		    return current.data;
		}

		private int indexOf(Link link) {
		    if (link == null) {
		        return -1;
		    }
		    return 1 + indexOf(link.next);
		}
	
}
