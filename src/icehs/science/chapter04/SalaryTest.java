package icehs.science.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		int salary = 1000000;
		
		int yearSalary = salary * 12;
		int bonus = salary * 20/100 * 4;
		
		int salaryTax = salary * 10/100;
		int bonusTax = bonus * 55/1000;
		
		int yearSalaryMinusTax =  yearSalary - 12 * salaryTax;
		int BonusMinusTax = bonus - bonusTax;
		
		System.out.println("���� : " + yearSalary + ", ���� ���� : " + yearSalaryMinusTax);
		System.out.println("���ʽ� : " + bonus + ", ���� ���ʽ� : " + BonusMinusTax);
		System.out.println("���޾� : " + (yearSalaryMinusTax + BonusMinusTax));
		
	}

}
