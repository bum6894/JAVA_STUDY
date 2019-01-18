package icehs.science.chapter10.animals;

public class AnimalTest {
	
	public static void main(String[] args) {
		Bird bird = new Bird ("독수리", 3, "바위산 등");
		System.out.println(bird.getKind() + "(" + bird.getAge() + "살) : " + bird.getHabitat());
		bird.spreadWings();
		bird.fly();
	}
}
