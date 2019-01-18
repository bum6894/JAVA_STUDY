package icehs.science.chapter10;

public class SubClass extends SuperClass implements InterfaceOne, InterfaceTwo {

	@Override
	public void methodFirst() {
		System.out.println("반드시 구현!!");
	}
	public void methodSecond() {
		System.out.println("반드시 구현!!");
	}
}
