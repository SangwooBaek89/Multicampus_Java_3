package chapter11_180907.people;

public class StudentEx {
	public static void main(String[] args) {
		Student student = new Student("hotteok", "123-123", 1);
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println((student.studentNo));
		
		Student student1 = new Student();
	}
}
