package job;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:738348954@qq.com
 * @date    创建时间：2017年11月28日 下午7:07:18 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class job1 {
	public static void main(String[] args) {
		//从键盘接收10个数，并存入数组中，然后循环遍历
		//数组中的元素
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个数：");
			a[i] = sc.nextInt();
		}
		
			System.out.println(Arrays.toString(a));
		

		sc.close();

	}

}
