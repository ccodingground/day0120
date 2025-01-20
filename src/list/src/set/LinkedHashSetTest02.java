package set;

import java.util.LinkedHashSet;

public class LinkedHashSetTest02 {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		set.add(16);
		set.add(19);
		set.add(26);
		set.add(1);
		set.add(9);
		set.add(45);
		System.out.println(set);
		System.out.println("---");
		for(int num:set) {
			System.out.println(num);
		}

	}

}
