package test;

import java.util.Scanner;

/*Author：刘龑聪
 *E-mail：15539919713@163.com
 */
public class Test02 {
	public static void main(String[] args) {

		System.out.print("请输入一个三位数：");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("该数的十位数是" + a / 10 % 10);
	}
}
