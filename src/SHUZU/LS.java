package SHUZU;

import java.util.ArrayList;
import java.util.List;
/**
 * List�ӿڣ��б�:�����Է�ʽ�洢�������ظ���Ԫ��
 * ��������У�
 * 1��ArrayList()���� ��LinkedList()������
 * 2������ʱ��forѭ����Iterator�������ķ�����ʵ��		
 * 3��set.add()���Ԫ��
 * 4��set.remove()��������ŵ����±�
 * 5�����Ҫ��������Ļ���Ҫ��forѭ��
 * 6�������Ҫ�ж�ĳԪ���Ƿ��ڸ�����������Ҫ
 * 	��list.contains(Ԫ��)�����������̨��
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
