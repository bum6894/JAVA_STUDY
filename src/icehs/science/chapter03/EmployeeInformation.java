package icehs.science.chapter03;

public class EmployeeInformation {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		String enterYear = "2002";
		int now = 2019;
		
		int intEnterYear = Integer.parseInt(enterYear);
		
		int employedYear = now - intEnterYear;
		
		System.out.println("�̸� : " + name);
		System.out.println("�Ի�⵵ : " + enterYear);
		System.out.println("�ٹ���� : " + employedYear);
		
	}

}
