package HEL;

import java.util.Arrays;
import java.util.Scanner;


public class HomeWork1127_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //从键盘输入10个数，并从大到小排序
		Scanner sc = new Scanner(System.in);
		int []a = new int [10];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			}
			
			for (int j = 0; j < a.length-1; j++) {
				boolean isSort;
				int temp;
				isSort = true;
				for (int k = 0; k < a.length-1; k++) {
					if (a[k]<a[k+1]) {
						temp = a[k];
						a[k] = a[k+1];
						a[k+1] = temp;
						isSort = false;
					}
				}
				System.out.println(Arrays.toString(a));
				if (isSort) {
					break;
				}
			}
		
	}

}
