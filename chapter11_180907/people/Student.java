package chapter11_180907.people;

public class Student extends People{
	public int studentNo;

	public Student() {
		
	}
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
		// TODO Auto-generated constructor stub
	}
	
}
