package icehs.science.chapter06;

public class Overloading {
	void addition(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	void addition(double num1, double num2) {
		System.out.println(num1 + num2);
	}
	void addition(String str1, String str2 ) {
		System.out.println(str1 + str2);
	}
	//int addition(int a, int b) {
		//System.out.println("오류 메소드");
		
	//}
	void addition(String str1, int str2) {
		System.out.println("순서예제 1 : " + str1 + str2);
	}
	void addition(int str2, String str1) {
		System.out.println("순서예제 2 : " + str1 + str2);
	}
	
}
