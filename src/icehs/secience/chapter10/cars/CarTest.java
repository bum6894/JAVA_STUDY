package icehs.secience.chapter10.cars;

public class CarTest {

	public static void main(String[] args) {
		Car[] cars = {
				new Taxi(),
				new Truck()
		};
		
		
		cars[0].wash();
		System.out.println("�ý� : ");
		cars[0].wash();
		System.out.println("Ʈ�� : ");
		cars[0].wash();

	}
}
