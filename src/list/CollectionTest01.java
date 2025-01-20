package list;

import java.util.ArrayList;

class AAA{}
public class CollectionTest01 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		//기본적으로 모든타입을 저장가능
		list.add(10);//매개변수의 다형성
		list.add(3.14);
		list.add("문자열");
		list.add(new AAA());
		list.add(null);
		
		System.out.println(list);
		//Object obj=null;
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		
	}

}
