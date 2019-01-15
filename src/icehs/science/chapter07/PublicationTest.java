package icehs.science.chapter07;

public class PublicationTest {

	public static void main(String[] args) {
		Publication publ = new Publication();
		
		publ.setTitle("만화삼국지");
		publ.setPage(300);
		publ.setPrice(5000);
		
		System.out.println("===== 출판물 정보를 세팅합니다. =====");
		publ.setPage(-1000);
		publ.setPrice(-5000);
		// publ.printPublicationInfo();
		
		System.out.println("출판물 정보 : " + publ.getTitle() + " ( " + publ.getPrice() +" 원, " + publ.getPage() + " page )");

	}

}
