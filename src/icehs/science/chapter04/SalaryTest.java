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
		
		System.out.println("연봉 : " + yearSalary + ", 세후 연봉 : " + yearSalaryMinusTax);
		System.out.println("보너스 : " + bonus + ", 세후 보너스 : " + BonusMinusTax);
		System.out.println("지급액 : " + (yearSalaryMinusTax + BonusMinusTax));
		
	}

}
