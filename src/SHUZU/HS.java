package SHUZU;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*HashSet:给一个数组进行添加或删除元素，特点是添加的元素无序，
 * 并且不重复,即输入相同的数后最终只会保留一个
 * 
 * set.add();
 * set.remove();
 * set.clear();
 * set.contains() 判断是不是有特定元素
 * set.size(); 返回的是数组长度
 * Iterator iterator=new Iterator();   // 用来循环输出数组
 * while(iterator.hasNext()){
 * 		system.out.println(iterator.next);
 * }
 * */
public class HS {
	public static void main(String[] args){
		Set set=new HashSet();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("e");
		set.add("f");
		set.add("h");
		set.add("s");
		set.add("a");
		set.add("b");
		set.remove("a");
		/**
		 * for (Object obj : set) {
		System.out.print(obj+" ");
		}	
		 */
		 Iterator iterator = set.iterator();
	     while(iterator.hasNext()){
		System.out.print(iterator.next()+" ");
	}
	}
}
