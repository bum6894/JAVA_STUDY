package icehs.science.chapter09;

public class InherTest {

	public static void main(String[] args) {
		Student student = new Student();
		Teacher teacher = new Teacher();
		
		System.out.println("=======Studnet=======");
		student.eat();
		student.study();
		
		System.out.println("=======Teacher=======");
		teacher.eat();
		teacher.teach();
		
	}

}
