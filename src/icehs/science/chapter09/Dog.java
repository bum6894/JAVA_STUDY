package icehs.science.chapter09;

public class Dog extends Animal {
	private String name;
	
	public Dog(int age, String kind, String name) {
		super(age,kind);
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public void hunt() {
		System.out.println("시속 40km로 뛰어!!");
	}
	@Override
	public void play() {
		System.out.println("순록을 잡아요~");
	}
	public void printDongInfo() {
		System.out.println("이름 : " + this.name);
		super.printAnimalInfo();
	}
}
