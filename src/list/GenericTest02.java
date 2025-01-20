package list;

import java.util.ArrayList;
import java.util.List;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}
public class GenericTest02 {

	public static void main(String[] args) {
		//콜레션을 사용시에는 기본형 타입의 집합은 잘사용하지 않아요
		//기준.웹개발자 기준
		List list=new ArrayList();
		list.add(new Person("도경수", 30));
		list.add(new Person("이광수", 38));
		list.add(10);
		
		for(Object obj : list) {
			if(obj instanceof Integer) {
				Integer num=(Integer) obj;
				System.out.println(num);
			}else if(obj instanceof Person) {
				Person person=(Person) obj;
				System.out.print(person.name+", ");
				System.out.println(person.age);
			}
			//캐스팅을 잘못해도 체크가 되지 않네요
			
			
		}

	}

}





