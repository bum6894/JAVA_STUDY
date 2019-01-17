package icehs.science.chapter09;

public class AccountTest {

	public static void main(String[] args) {
		FundAccount fund = new FundAccount();
		fund.setNumber("111-2222");
		fund.setName("ȫ�浿");
		fund.setBalance(5000000);
		fund.setEarningTate(4.7);
		fund.openAccount();
		fund.earnMoney();
		

	}

}
