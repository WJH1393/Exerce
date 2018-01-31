package SHUZU;

import java.util.ArrayList;
import java.util.List;
/**
 * List接口（列表）:以线性方式存储，可以重复放元素
 * 下面的类有：
 * 1、ArrayList()线性 、LinkedList()链表型
 * 2、遍历时用for循环或Iterator迭代器的方法来实现		
 * 3、set.add()添加元素
 * 4、set.remove()括号里面放的是下标
 * 5、如果要遍历输出的话需要用for循环
 * 6、如果需要判断某元素是否在该数组内则需要
 * 	把list.contains(元素)放在输出控制台下
 * @author Administrator
 *
 */
public class LS {
	public static void main(String[] args){
		List list=new ArrayList();
		list.add(12);
		list.add(13);
		list.add(14);
		list.remove(2);
		for(Object obj:list){
			System.out.println(obj);
		}
		System.out.println(list.contains(13));
		System.out.println(list.size());
		
	}
}
