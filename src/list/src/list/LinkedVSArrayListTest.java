package list;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedVSArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> arrList=new ArrayList<String>();
		long start=0;
		long end=0;
		int size=100000;
		start=System.nanoTime();
		for(int i=0; i<size; i++) {
			arrList.add(0, ""+i);
		}
		end=System.nanoTime();
		System.out.println("Array List처리시간 : "+ (end-start) );
		System.out.println("-----");
		LinkedList<String> linkedList=new LinkedList<String>();
		
		start=System.nanoTime();
		for(int i=0; i<size; i++) {
			linkedList.add(0, ""+i);
		}
		end=System.nanoTime();
		System.out.println("LinkedList처리시간 : "+ (end-start) );
		System.out.println("중간 삽입(삭제)시 Linked 처리속도가 높다");
		
	}
}









