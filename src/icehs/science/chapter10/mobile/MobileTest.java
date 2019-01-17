package icehs.science.chapter10.mobile;

public class MobileTest {

	public static void main(String[] args) {
		Mobile[] mobiles = {
				new Galaxy(),
				new IPhone()
		};
		mobiles[0].setProduction("Galaxy");
		mobiles[1].setProduction("IPhone");
		((Galaxy)(mobiles[0])).setOsVersion("�ȵ���̵� ������");
		((IPhone)(mobiles[1])).setColor("���");
		
		System.out.println(mobiles[0].getProduction() + " : " + ((Galaxy)(mobiles[0])).getOsVersion());
		mobiles[0].call(5);
		mobiles[0].charge(30);
		System.out.println(mobiles[1].getProduction() + " : " + ((IPhone)(mobiles[1])).getColor());
		mobiles[1].call(10);
		mobiles[1].charge(15);
	}
}
