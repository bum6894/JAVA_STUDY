package icehs.science.chapter05;

public class MutipleFiveSumTest {

	public static void main(String[] args) {
		int sum = 0;
		int index = 1;
		while (sum < 100) {
			int number = 5*index;
			sum += number;
			
			System.out.println(index + ". (+" + (number) + ") " + sum);
			index++; 
		}

	}

}
