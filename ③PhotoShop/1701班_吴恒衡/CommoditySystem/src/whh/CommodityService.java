package whh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:2421922506@QQ.com
 * @date    ����ʱ�䣺2017��12��7�� ����2:42:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class CommodityService implements ICommodity {

	@Override
	public void helpInfo() {
		System.out.println("--����ϵͳ--");
		System.out.println("[1]������Ʒ������1");
		System.out.println("[2]����������2");
		System.out.println("[3]����������3");
		System.out.println("[4]�ο����������4");
		System.out.println("[5]�˳�����������5");	
		
	}

	@Override
	public void addCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length!=5) {
			System.out.println("����������ݲ�����,������¼��");
		} else {
			Commodity commodity = new Commodity(a[0], a[1], Double.parseDouble(a[2]), Long.parseLong(a[3]));
			arrayList.add(commodity);
			System.out.println(commodity.toString());
		}
		
	}

	@Override
	public void findCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		
		String[] s = sc.next().split(",");
		boolean isSucc = false;
		if (s.length!=2) {
			System.out.println("���������Ϣ����ȷ,������¼��");
		} else {
			for (Commodity commodity : arrayList) {
			if (commodity.getId().equals(s[0])){
			long newNumber  =	commodity.getNumber() + Long.parseLong(s[1]);
			commodity.setNumber(newNumber);
			System.out.println(commodity.toString());
			isSucc = true;
			}
		}

		}if (!isSucc) {
			System.out.println("�޷�����");
			
		}
		
	}

	@Override
	public void sellCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String[] s = sc.next().split(",");
		boolean isSucc = false;
		if (s.length!=2) {
			System.out.println("���������Ϣ����ȷ,������¼��");
		} else {
			for (Commodity commodity : arrayList) {
			if (commodity.getId().equals(s[0])){
				if (commodity.getNumber() > Long.parseLong(s[1])) {
					
					long newnumber = commodity.getNumber() - Long.parseLong(s[1]);
					commodity.setNumber(newnumber);
					System.out.println(commodity.toString());
					isSucc = true;
				}
				
			
			}
		}

		}if (!isSucc) {
			System.out.println("�޷�����");
			
		}
		
		
	}

	@Override
	public void lookCommodity(ArrayList<Commodity> arrayList) {
		Iterator<Commodity> iterator = arrayList.iterator();
		for (Iterator iterator2 = arrayList.iterator(); iterator2.hasNext();) {
			Commodity commodity = (Commodity) iterator2.next();
			System.out.println(commodity.toString());
		}
		
	}

}
