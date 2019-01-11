package icehs.science.chapter05;

public class GuGuDanTest {

	public static void main(String[] args) {
		for (int dan = 2; dan < 10 ;  dan++) {
			for (int i = 1; i < 10; i ++) {
				if (i == 9) {
					System.out.print(dan + " * " + i + " = " + dan * i);
				}else {
					System.out.print(dan + " * " + i + " = " + dan * i + ", ");
				}
			}
			System.out.println();
		}
			

	}

}
