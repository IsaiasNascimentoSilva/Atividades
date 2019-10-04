package linkedList;

public class All {
	 int element;
	 All next;
	 All previous;
	
	public All(int newElement) {
		this.element = newElement;
		this.next = null;
		this.previous = null;
		
	}
	
	public void add(All element, int newElement){
		All all = new All(newElement);
		if (element.next == null)
			element.next = all;
			all.previous = element;
		add(element.next, newElement);
			
	}
	
	public boolean ordered(All element){
		if (element.next == null)
			return true;
		else if(element.element > element.next.element)
			return false;
		
		return ordered(element.next);
	}
	
	public void addIdex(All element, int index, int newElement){
		All all = new All(newElement);
		if (index == 1){
			all.next = element.next;
			element.previous = all;
			all.previous = element;
			element.next = all;
		}
		addIdex(element.next, index-1, newElement);
	}
	
	public void removeIndex(All all, int index){
		if (index == 0){
			all.next.previous = all.previous;
			all.previous.next = all.next;
		}
		removeIndex(all.next, index-1);
	}

}
