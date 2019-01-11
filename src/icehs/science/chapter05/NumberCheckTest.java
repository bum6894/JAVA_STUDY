package icehs.science.chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {
		int first = 2 ;
		int second = 3;
		int third = 4;
		int fourth = 5;
		int fifth = 23;
		int sixth = 96;
		
		int result = first * second;
		System.out.println(first + " * " + second + " : ");
		if(result > 100) {
			System.out.println("세 자리 수 이상입니다.");
		} else if (result > 10) {
			System.out.println("두 자리 수 입니다.");
		} else if(result > 0) {
			System.out.println("한 자리 수 입니다.");
		} else {
			System.out.println("음수는 확인하지 않습니다.");
		}

		result = third * fourth;
		System.out.println(third + " * " + fourth + " : ");
		if(result > 100) {
			System.out.println("세 자리 수 이상입니다.");
		} else if (result > 10) {
			System.out.println("두 자리 수 입니다.");
		} else if(result > 0) {
			System.out.println("한 자리 수 입니다.");
		} else {
			System.out.println("음수는 확인하지 않습니다.");
	}
		result = fifth * sixth;
		System.out.println(fifth + " * " + sixth + " : ");
		if(result > 100) {
			System.out.println("세 자리 수 이상입니다.");
		} else if (result > 10) {
			System.out.println("두 자리 수 입니다.");
		} else if(result > 0) {
			System.out.println("한 자리 수 입니다.");
		} else {
			System.out.println("음수는 확인하지 않습니다.");
	}
		result = third * -second;
		System.out.println(third + " * " + -second + " : ");
		if(result > 100) {
			System.out.println("세 자리 수 이상입니다.");
		} else if (result > 10) {
			System.out.println("두 자리 수 입니다.");
		} else if(result > 0) {
			System.out.println("한 자리 수 입니다.");
		} else {
			System.out.println("음수는 확인하지 않습니다.");
	}
}

}
