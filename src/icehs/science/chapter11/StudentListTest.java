package icehs.science.chapter11;

import java.util.ArrayList;

public class StudentListTest {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("이순신", 80, 90, 95));
		students.add(new Student("김유신", 95, 89, 92));
		students.add(new Student("강감찬", 88, 97, 94));
		
		for (Student student :  students) {
			System.out.println(student.getName() + " ( 국어 : " + student.getKorean() + ", 영어 : " + student.getEnglish() + ", 수학 : " + student.getMath() + " )");
			
		}
		

	}

}
