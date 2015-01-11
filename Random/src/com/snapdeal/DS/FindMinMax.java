package com.snapdeal.DS;

public class FindMinMax {
	public static void main(String[] args) {
		int[] arr = { 4, 3, 5, 1, 2, 6, 9, 2, 10, 11, 15};
		int max = arr[0];
		int min = arr[0];
		int num1 = 0;
		int num2 = 0;
		int i;
		for (i = 0; i < arr.length / 2; i++) {
			num1 = arr[i * 2];
			num2 = arr[i * 2 + 1];
			if (num1 > num2) {
				if (num1 > max)
					max = num1;
				if (num2 < min)
					min = num2;
			} else {
				if (num2 > max)
					max = num2;
				if (num1 < min)
					min = num1;
			}
		}
		if (i * 2 < arr.length) {
			if (arr[i * 2] > max)
				max = arr[i * 2];
			else if (arr[i * 2] < min)
				min = arr[i * 2];
		}
		System.out.println("maximum element is" + max);
		System.out.println("minimum element is" + min);
	}
}
