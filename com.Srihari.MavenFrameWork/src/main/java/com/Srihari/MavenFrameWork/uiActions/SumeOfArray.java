package com.Srihari.MavenFrameWork.uiActions;

public class SumeOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 3, 4, 5, 6, 7, 8, 9 };

		int sum = 0;

		for (int i : a)
			sum += i;

		System.out.println("The sum of the arrary " + sum);

	}

}
