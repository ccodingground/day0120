package set;

import java.util.HashSet;
import java.util.Objects;

class Person{
	String name;
	public Person(String name) {
		this.name=name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		return this.name.equals(((Person)obj).name);
	}
	
}
public class HashSetTest02 {

	public static void main(String[] args) {
		
		HashSet<Person> set=new HashSet<Person>();
		set.add(new Person("조인성"));
		set.add(new Person("조인성"));
		set.add(new Person("조인성"));
		set.add(new Person("조인성"));
		System.out.println(set.size());
		//동일객체로 판단하지 못하는 이유 비교연산시 단순비교(참조값 비교) 
		//hashCode(), equals(Object obj)

	}

}
