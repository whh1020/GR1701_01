package com.gaojie.qhit01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年11月27日 下午3:51:09
 */
public class Exchange {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] a = new int[10];

		int b = 0;
		int c = 0;

		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个数\t ");
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			if (i == 1) {
				b = a[1];
				a[1] = a[5];
				a[5] = b;

			}
			if (i == 3) {
				c = a[3];
				a[3] = a[7];
				a[7] = c;
			}

		}
		System.out.println(Arrays.toString(a));

		sc.close();
	}

}
