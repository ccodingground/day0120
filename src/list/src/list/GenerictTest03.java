package list;

import java.util.ArrayList;
import java.util.List;

class Person2{
	String name;
	int age;
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}
public class GenerictTest03 {

	public static void main(String[] args) {
		//콜레션을 사용시에는 기본형 타입의 집합은 잘사용하지 않아요
		//기준.웹개발자 기준
		List<Person2> list=new ArrayList<>();
		//Person2만 허용합니다. Person2의 모음
		Person2[] arr;
		//1. 강한 타입체크 :: Person2 타입을 넣으면 컴파일러가 체크해준다
		list.add(new Person2("이광수", 38));
		list.add(new Person2("도경수", 30));
		//2. 사용시 캐스팅할 필요없네요
		for(Person2 obj :list) {
			System.out.print("이름:"+obj.name);
			System.out.println(", 나이:"+obj.age);
		}

	}

}





