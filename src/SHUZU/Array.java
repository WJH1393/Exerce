package SHUZU;

import java.util.ArrayList;
import java.util.List;


public class Array {
	public static void main(String[] args){
		List list=new ArrayList();
		list.add(20);
		list.add(89);
		list.add(54);
		list.add(84);
		list.add(21);
		list.add(97);
		System.out.println(list.size());
		System.out.println(list);
		list.add(12);
		list.add(43);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(6));
	}

	
	
}
