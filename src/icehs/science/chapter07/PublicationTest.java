package icehs.science.chapter07;

public class PublicationTest {

	public static void main(String[] args) {
		Publication publ = new Publication();
		
		publ.setTitle("��ȭ�ﱹ��");
		publ.setPage(300);
		publ.setPrice(5000);
		
		System.out.println("===== ���ǹ� ������ �����մϴ�. =====");
		publ.setPage(-1000);
		publ.setPrice(-5000);
		// publ.printPublicationInfo();
		
		System.out.println("���ǹ� ���� : " + publ.getTitle() + " ( " + publ.getPrice() +" ��, " + publ.getPage() + " page )");

	}

}
