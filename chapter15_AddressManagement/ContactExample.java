package chapter15_AddressManagement;

import java.util.Scanner;

import chapter11_linkedList.Double.DoubleLinkedList;

public class ContactExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Contact contact = createContact();
		System.out.println(contact.toString());*/
		
		DoubleLinkedList list = new DoubleLinkedList();
		list.add(new Contact("hotteok", "hong@naver.com", "000-000", "incheon"));
		list.add(new Contact("apple", "apple@naver.com", "111-111", "seoul"));
		list.add(new Contact("ramen", "ramen@naver.com", "222-222", "gwuanju"));
		list.add(new Contact("grape", "grape@naver.com", "222-222", "busan"));
		
		Contact c = find(list);
		if(c!=null) {
			System.out.println("name : " + c.getName());
			System.out.println("email : " + c.getEmail());
			System.out.println("phone : " + c.getEmail());
			System.out.println("addr : " + c.getAddr());
		}
	}
	
	public static Contact find(DoubleLinkedList list) {
		String name = Input.getString("이름 : ");
		for(int i = 0; i < list.getSize(); i++) {
			Contact c = list.get(i);
			if(name.equals(c.getName())) {
				return c;
			}
		}
		return null;
	}
	
	
	public static Contact createContact() {
		Contact contact = new Contact();
		contact.setName(Input.getString("이름: "));
		contact.setEmail(Input.getString("이메일: "));		 
		contact.setPhone(Input.getString("전화번호: "));	 
		contact.setAddr(Input.getString("주소: "));		
		 
		return contact;
	}
	

}
