package com;

import java.util.Scanner;



public class Nine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("数值不可大于10000");
		int a = sc.nextInt();
		if (a > 10000) {
			System.out.println("错误");
		} else {
			for (int i = 1; i < a; i++) {
				if (i % 7 == 0 || i %1000 == 7 || i % 100 == 7
						|| i / 10 % 10 == 7 || i % 10 == 7) {

					System.out.println("输出7的倍数和含7的数字" + i);
				}

			}

		}

	}
}
