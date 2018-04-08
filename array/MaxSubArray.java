package com.as.mitt.javainterview.array;


/*Largest Sum Contiguous Subarray and also give the start and end index*/

public class MaxSubArray {

	static void maxSubArraySum(int a[], int size) {
		int max_so_far = Integer.MIN_VALUE;
		int max_ending_here = 0, s = 0, start = 0, end = 0;
		for (int i = 0; i < a.length; i++) {
			max_ending_here += a[i];
			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
				start = s;
				end = i;
			}
			if (max_ending_here < 0) {
				max_ending_here = 0;
				s = i + 1;
			}
		}

		System.out.println("maximum Subarray Sum: " + max_so_far);
		System.out.println("Start =" + start + "End= " + end);

	}

	public static void main(String[] args) {
		int a[] = { -2, -1, 1, 2 };
		int n = a.length;
		maxSubArraySum(a, n);
	}
}
