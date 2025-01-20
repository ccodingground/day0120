package set;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(Integer.valueOf(9));
		set.add(Integer.valueOf(7));
		set.add(Integer.valueOf(16));
		set.add(Integer.valueOf(26));
		set.add(Integer.valueOf(1));
		set.add(Integer.valueOf(10));
		//set.add(null);//NullPointerException
		System.out.println(set);
		System.out.println(set.first());//오름차순 정렬후 첫번째 값
		System.out.println(set.last());//오름차순 정렬후 마지막 값
		System.out.println(set.lower(10));//지정한 객체보다 바로 아래 작은수
		System.out.println(set.higher(10));//지정한 객체보다 바로 위 높은수
		
		TreeSet<Integer> headSetResult= (TreeSet<Integer>) set.headSet(10);
		System.out.println(headSetResult);//지정한수 미포함 작은수들
		
		TreeSet<Integer> tailSetResult= (TreeSet<Integer>) set.tailSet(10);
		System.out.println(tailSetResult);//지정한수 포함하여 큰수들
		TreeSet<Integer> subSetResult=(TreeSet<Integer>) set.subSet(1, 10);
		System.out.println(subSetResult);//1포함 10작은수를 추출한 집합
		
		System.out.println(set.pollFirst());
		System.out.println(set);
		System.out.println(set.pollLast());
		System.out.println(set);

	}

}
