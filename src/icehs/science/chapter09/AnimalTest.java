package icehs.science.chapter09;

public class AnimalTest {

	public static void main(String[] args) {
		Cat cat = new Cat(3, "�߿���","�丣�þ�");
		Dog dog = new Dog(2, "�ú������㽺Ű", "�۸���");
		/*
		 * cat.setName("�߿���"); cat.setAge(3); cat.setKind("�丣�þ�");
		 */
		cat.printCatInfo();
		cat.run();
		cat.hunt();
		cat.play();
		
		System.out.println();
		
		dog.printDongInfo();
		dog.run();
		dog.hunt();
		dog.play();
		
	}

}
