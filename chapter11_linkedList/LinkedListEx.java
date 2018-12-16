package chapter11_linkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(2, 10);
		list.print();
		System.out.println("remove item : " + list.remove(3));
		list.print();
		list.add(20);
		list.print();
		list.add(4, 30);
		list.print();
		System.out.println(list.getValue(0));
		
		int result = 0;
		for(int i = 0; i < list.getSize(); i++) {
			result += list.getValue(i);
		}
		System.out.println("result : " + result + ", avg : "+result/list.getSize());
	
	}

}
