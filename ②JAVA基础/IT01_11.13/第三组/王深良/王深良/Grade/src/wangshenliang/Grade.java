package wangshenliang;

import java.util.Scanner;

/** 
 * @author  作者 王深良E-mail:793708547@QQ.com
 * @date    创建时间：2017年11月14日 下午7:16:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Grade {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩：");
		int i = sc.nextInt();

		if (i >= 90) 
			System.out.println("A");
		if (i >= 60 && i <= 89) 
			System.out.println("B");
		if (i < 60 && i >= 0) 
			System.out.println("C");
		
		

	}

	}


