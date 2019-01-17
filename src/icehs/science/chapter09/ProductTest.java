package icehs.science.chapter09;

public class ProductTest {

	public static void main(String[] args) {
		Product laundry = new Product("통돌이", 450000, 8);
		Television tv = new Television("씨네마 TV", 3500000, 10, "화면크기 151cm");
		
		laundry.printProductInfo();
		System.out.println("------------------------------------------------");
		tv.printProductInfo();
		System.out.println("비고 : "  + tv.getDescription());
	
		System.out.println("[공지] 할인율을 모두 15%로 변경합니다.");
		laundry.setDiscountRate(15);
		tv.setDiscountRate(15);
		
		System.out.println("통돌이 판매가 : " + laundry.calculateDiscountPrice());
		System.out.println("시네마 TV 할인가 : "+ tv.calculateDiscountPrice());
		
	}

}
