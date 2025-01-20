package set;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetTest {

	public static void main(String[] args) {
		// HashSet: 해시기반, 가장많이 사용
		
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(100);
		set.add(10);
		set.add(1);
		
		System.out.println("set 크기 : "+set.size());
		set.add(100);
		set.add(100);
		set.add(100);
		System.out.println("set 크기 : "+set.size());
		System.out.println(set);
		set.remove(100);
		System.out.println("set 크기 : "+set.size());
		System.out.println(set);
		//수정의 기능이 없어요
		//단독으로 읽기기능이 없어요: itrator를 이용합니다.
		/*
		Iterator <Integer> it=set.iterator();
		while(it.hasNext()) {
			int num=it.next();
			System.out.println(num);
			
		}
		*/
		for(int num:set) {
			System.out.println(num);
		}
	}
}
