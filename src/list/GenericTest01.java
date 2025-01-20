package list;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
class A{
	int x;
	int y;
	public A(int x, int y) {
		this.x=x;
		this.y=y;
	}
}
public class GenericTest01 {

	public static void main(String[] args) {
		
		List list=new ArrayList();
		list.add("제목");//0
		list.add("내용");//1
		list.add(0);//2
		list.add(LocalDateTime.now());//3
		list.add(new A(10,20));//4
		
		//조회수를 증가시킬께요
		int readCount=(int) list.get(2);
		list.set(2, ++readCount);
		System.out.println(list);
		//0번수정
		String title=(String) list.get(0);
		title += list.get(2);
		list.set(0, title);
	
		System.out.println(list);
		Object obj=list.get(4);
		//부모는 자식클래스의 멤버에는 접근불가
		//obj.x //불가능
		if(obj instanceof A) {
			A a=(A) list.get(4);
			System.out.println(a.x);
			System.out.println(a.y);
		}
		//결론 : 콜렉션을 제네릭 없이 사용시 불편한점이 있는가?
		//사용시 강제캐스팅해야하므로 동일한 객체가 아니면 if문을 통해서 처리해야하는등
		//불편사항이 발생한다.: 이를 해결하기위해 제네릭을 사용한다.
		
		

	}

}
