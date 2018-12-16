package chapter11_linkedList.Double;

import chapter15_AddressManagement.Contact;

public class DoubleLinkedList {
	Node head;
	int size;
	
	//private 뜻 : 이 노드는 더블링크드리스트에서만 쓰겠다.
	//getter / setter 사용할 필요도 없다.
	private class Node{
		Contact value;
		Node next;
		Node prev;
		
		Node(Contact value){
			this.value = value;
			//Next와 Prev는 null
		}
	}
	
	public DoubleLinkedList() {
		head = new Node(null);
		head.prev = head;
		head.next = head;
	}
	
	//하나씩 삽입한다.
	public void add(Contact value) {
		Node node = new Node(value);
		// 1. 삽입을 원하는 노드부터 건들어야 한다.
		node.prev = head.prev;
		node.next = head;
		head.prev.next = node;
		head.prev = node;
		size++;
	}
	
	//리스트의 값을 출력한다.
	//리스트 값 확인 용도
	public void print() {
		Node t = head.next;
		while(t != head) {
			System.out.println(t.value.toString() + " ");
			t = t.next;
		}
		System.out.println();
	}
	
	// 노드 class의 접근제한자는 private!
	// 특정 노드를 반환한다.
	private Node getNode(int index) {
		Node t = head.next;
		for(int i = 0; i < index; i++) {
			t = t.next;
		}
		return t;
	}
	
	//특정 위치에 노드를 삽입한다.
	public void add(int index, Contact value) {
		Node t = getNode(index);
		Node node = new Node(value);
		t.prev.next = node;
		node.prev = t.prev;
		node.next = t;
		t.prev = node;
		size++;
	}
	
	public int getSize() {
		return size;
	}
	
	public void remove(int index) {
		Node t = getNode(index);
		t.prev.next = t.next;
		t.next.prev = t.prev;
	}
	
	public Contact get(int index) {
		Node t = getNode(index);
		return t.value;
	}
}
