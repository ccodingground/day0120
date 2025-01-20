package list;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {
		// 
		ArrayList<Integer> list=new ArrayList<Integer>();
		//삽입,삭제,검색,중간삽입도 지원합니다.
		//인덱스를 제공합니다.:자동으로 순차적으로
		list.add(1);//0 번인덱스를 자동제공
		//public boolean add(E e)
		System.out.println(list.get(0));
		//System.out.println(list.get(1));//IndexOutOfBoundsException
		list.add(0, 10);//중간삽입 : 특정인덱스 위치에 데이터 삽입 가능
		System.out.println(list);
		System.out.println("0==> "+list.get(0));
		System.out.println("1==> "+list.get(1));
		
		list.add(100);//제일뒤에 추가 - 자동으로 처리
		System.out.println("list의 사이즈 : "+ list.size());
		System.out.println(list);
		
		list.remove(0);
		System.out.println("0번 삭제후");
		System.out.println(list);
		System.out.println("list의 사이즈 : "+ list.size());
		list.remove((Integer)100);
		System.out.println(list);
		System.out.println("list의 사이즈 : "+ list.size());
		
		list.removeAll(list);
		System.out.println("list의 사이즈 : "+ list.size());

	}

}





