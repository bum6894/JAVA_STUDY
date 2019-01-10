package icehs.science.chapter03;

public class CastEx {

	public static void main(String[] args) {
		double large = 1000000000000.251778229789;
		long middle = (long)large;
		int small = (int)middle;
				
		System.out.println(large);
		System.out.println(middle);
		System.out.println(small);

	}

}
