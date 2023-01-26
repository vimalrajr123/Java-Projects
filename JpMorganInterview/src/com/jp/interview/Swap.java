package com.jp.interview;

public class Swap {

	static int a = 5;
	static int b = 6;

	public static void main(String[] args) {

		swap(a, b);
		System.out.println(a + " " + b);

	}

	private static void swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;

		Swap.a = a;
		Swap.b = b;

	}

}
