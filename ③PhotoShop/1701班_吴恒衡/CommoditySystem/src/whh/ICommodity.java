package whh;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:2421922506@QQ.com
 * @date    ����ʱ�䣺2017��12��7�� ����2:28:37 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface ICommodity {
	void helpInfo();
	void addCommodity(ArrayList<Commodity> arrayList,Scanner sc);
	void findCommodity(ArrayList<Commodity> arrayList,Scanner sc);
	void sellCommodity(ArrayList<Commodity> arrayList,Scanner sc);
	void lookCommodity(ArrayList<Commodity> arrayList);
}
