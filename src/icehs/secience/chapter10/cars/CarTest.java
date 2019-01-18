package icehs.secience.chapter10.cars;

public class CarTest {

	public static void main(String[] args) {
		Car[] cars = {
				new Taxi(),
				new Truck()
		};
		
		
		cars[0].wash();
		System.out.println("택시 : ");
		cars[0].wash();
		System.out.println("트럭 : ");
		cars[0].wash();

	}
}
