package com.example.demo;

public class LongAdditionsDemo {

	private static final int[] A = { 2, 4, 9, 2 };
	private static final int[] B = { 9, 7, 5, 3 };

	public static void main(String[] args) {
		int[] Sum = new int[A.length + 1];
		Sum = LongAdditionsEqual(A, B);
		System.out.print("The sum is: ");
		for (int k = 0; k < Sum.length; k++) {
			System.out.print(Sum[Sum.length - 1] + " ");
		}
	}

	private static int[] LongAdditionsEqual(int[] a, int[] b) {
		int[] carry = new int[a.length + 1];
		int[] sum = new int[a.length + 1];

		carry[0] = 0;

		for (int i = 0; i < a.length; i++) {
			sum[i] = (a[i] + b[i] + carry[i]) % 10;
			carry[i] = (a[i] + b[i] + carry[i]) / 10;
		}
		sum[a.length + 1] = carry[a.length + 1];

		return sum;
	}
}