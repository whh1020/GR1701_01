

import java.util.Arrays;
import java.util.Scanner;


public class Traverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("�������" + (i + 1) + "������");
			a[i] = sc.nextInt();
		}
		
			System.out.println(Arrays.toString(a));
		

		sc.close();
	}

}
