package test;

import java.util.Scanner;

/*作者：刘龑聪
 *E-mail：15539919713@163.com
 */
public class Test9 {
	public static void main(String[] args) {

		System.out.println("请输入一个不大于10000的正整数:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i <= 10000&&i>0) {
			for (int a = 1; a <= i; a++) {
				if (a % 7 == 0 || a / 1000 == 7 || a / 100 == 7 || a / 10 == 7) {
					System.out.println(a);
				}
			}
		} else {
			System.out.println("请输入一个正确的数!");
		}
		sc.close();
	}
}