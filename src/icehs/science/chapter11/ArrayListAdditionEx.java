package icehs.science.chapter11;

import java.util.ArrayList;

public class ArrayListAdditionEx {

	public static void main(String[] args) {
		int number1= 5;
		int number2 = 10;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(number1);
		list.add(number2);
		list.add(50);
		list.add(70);
		list.add(100);
		
		System.out.println(list);
		
		System.out.println(list.get(3));
		
		for (int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		for (Integer i: list) {
			System.out.println(i);
		}
	}
}
