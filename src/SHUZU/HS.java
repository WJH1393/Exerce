package SHUZU;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*HashSet:��һ�����������ӻ�ɾ��Ԫ�أ��ص�����ӵ�Ԫ������
 * ���Ҳ��ظ�,��������ͬ����������ֻ�ᱣ��һ��
 * 
 * set.add();
 * set.remove();
 * set.clear();
 * set.contains() �ж��ǲ������ض�Ԫ��
 * set.size(); ���ص������鳤��
 * Iterator iterator=new Iterator();   // ����ѭ���������
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
