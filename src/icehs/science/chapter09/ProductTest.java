package icehs.science.chapter09;

public class ProductTest {

	public static void main(String[] args) {
		Product laundry = new Product("�뵹��", 450000, 8);
		Television tv = new Television("���׸� TV", 3500000, 10, "ȭ��ũ�� 151cm");
		
		laundry.printProductInfo();
		System.out.println("------------------------------------------------");
		tv.printProductInfo();
		System.out.println("��� : "  + tv.getDescription());
	
		System.out.println("[����] �������� ��� 15%�� �����մϴ�.");
		laundry.setDiscountRate(15);
		tv.setDiscountRate(15);
		
		System.out.println("�뵹�� �ǸŰ� : " + laundry.calculateDiscountPrice());
		System.out.println("�ó׸� TV ���ΰ� : "+ tv.calculateDiscountPrice());
		
	}

}
