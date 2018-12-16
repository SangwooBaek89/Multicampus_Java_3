package chapter11_linkedList;

public class Node {
	private int value;
	private Node next;
	//private Node prev (이중링크드리스트 시)
	public Node() {
		
	}
	
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
