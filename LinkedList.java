package linkedList;

public class LinkedList {
	private All elements;
	private int size;
	private int sum;
	
	public LinkedList() {
		
	}
	
	public void addLast(int elemento){
		if (this.elements == null)
			this.elements = new All(elemento);
			this.size++;
			this.sum += elemento;
		this.elements.add(this.elements, elemento);	
		this.size++;
		this.sum += elemento;
	}
	
	public int size(){
		return this.size;
	}
	
	public int soma(){
		return this.sum;
	}
	
	public boolean isSorted(){
		if (this.elements == null)
			return true;
		return elements.ordered(this.elements);
	}
	
	public void add(int index, int elemento){
		if (this.elements == null)
			this.elements = new All(elemento);
		this.elements.addIdex(this.elements, index, elemento);
	}
	
	public void remove(int index){
		this.elements.removeIndex(this.elements, index);
	}

}