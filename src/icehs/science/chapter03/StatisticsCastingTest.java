package icehs.science.chapter03;

public class StatisticsCastingTest {
	
	public static void main(String[] args) {
		double lottoProbalility = 0.0000001235;
		int intLottoProbalility = (int)lottoProbalility;
		
		long population = 6973738433L;
		int intPopulation = (int)population;
		
		System.out.println("�ζǿ� ��÷�� Ȯ�� : " + lottoProbalility);
		System.out.println("�ζǿ� ��÷�� Ȯ�� int ��ȯ : " + intLottoProbalility);
		System.out.println("�� ������ �α� �� : " + population);
		System.out.println("�� ������ �α� �� int ��ȯ : " + intPopulation);
	}
}
