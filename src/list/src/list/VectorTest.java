package list;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// ArrayList와 사용방법이 동일
		// 차이점 : Vector에는 synchronized 메서드를 제공한다.
		// synchronized : 메서드 블록킹한다(동시처리 불가)
		Vector<String> list=new Vector<String>();
		//public synchronized boolean add(E e)
		//멀티스레스 상에서 동시처리를 막는다: 안전하게 데이터 처리가 가능: 처리속도는 느릴수있다
		list.add("이광수");//0
		list.add(new String("조인성"));//1
		System.out.println("사이즈: "+list.size());
		System.out.println("0 ==> "+list.get(0));
		System.out.println("1 ==> "+list.get(1));
		list.add(1, "차태현"); //1=>2
		System.out.println("사이즈: "+list.size());
		System.out.println(list);
		
		list.add(0, "도경수"); //기존데이터가 1칸씩 자동으로 이동 
		System.out.println("사이즈: "+list.size());
		System.out.println(list);
		
		list.remove(0);
		System.out.println("사이즈: "+list.size());
		System.out.println(list);
		list.add("조인성"); 
		list.add("조인성"); 
		System.out.println("사이즈: "+list.size());
		System.out.println(list);
		list.remove("조인성");
		System.out.println("사이즈: "+list.size());
		System.out.println(list);

	}

}
