package chapter11_linkedList;

public class LinkedList {
	private int size;
	private Node head;
	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public LinkedList() {
		head = new Node();
	}
	
	public void add(int value) {
		Node node = new Node(value);
		//시작 : head
		Node tail = head;
		while(tail.getNext() != null) {
			tail = tail.getNext();
			
		}
		tail.setNext(node);
		size++;
	}
	
	public void add(int index, int value) {
		Node node = new Node(value);
		Node tail = head;
		for(int i = 0; i < index; i ++) {
			tail = tail.getNext();
		}
		node.setNext(tail.getNext());
		tail.setNext(node);
		size++;
	}
	
	public int remove(int index) {
		Node tail = head;
		for(int i = 0; i < index - 1; i++) {
			tail = tail.getNext();
		}
		int item = tail.getNext().getValue();
		tail.setNext(tail.getNext().getNext());
		size--;
		return item;
	}
	
	public int getValue(int index) {
		Node tail = head.getNext();
		for(int i = 0; i < index; i++) {
			tail = tail.getNext();
		}
		return tail.getValue();
	}
	public int getSize() {
		return size;
	}
	public void print() {
		Node tail = head;
		while(tail.getNext() != null) {
			tail = tail.getNext();
			System.out.print(tail.getValue()+ " ");
		}
		System.out.println();
	}
}
