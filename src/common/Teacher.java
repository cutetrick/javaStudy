package common;

import java.util.Objects;

public class Teacher extends Person{
	private String subject;
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	@Override
	public String toString() {
		return super.toString() +", 과목:" + subject;
	}

	/*
	 hashCode()
	 : 인스턴스가 가진 고유한 주소값을 정수형으로 반환해준다.
	 따라서 서로 다른 인스턴스라면 다른 해시값을 가지게 된다.
	 정수형 멤버변수는 그냥 사용하면되고, 인스턴스형 변수는
	 hashCode()를 통해 정수값으로 반환되는 해시값을 사용하면된다.
	 */
	@Override
	public int hashCode() {
		/*
		 방법1: 정수형변수와 인스턴스의 해시값을 합산 후 그대로 반환한다.
		 */
		int returnCode1 = super.getage() + this.subject.hashCode();
		System.out.println("returnCode=" + returnCode1);
		/*
		 방법2: 방법1이 번거롭다면 Objects 클래스의 정적메서드인 hash()를
		 사용해도 된다. 멤버변수의 갯수만큼 인수로 전달하면 위와 동일하게
		 고유한 주소값을 정수형으로 반환해준다.
		 */
		int returnCode2 = Objects.hash(super.getage(), this.subject);
		//1,2 둘 다 사용할 수 있다.
		return returnCode2;
	}
	/*
	 equals() : 인스턴스가 가진 멤버변수의 값을 비교한다. 값이 같을때는 true
	 다를때는 false를 반환하도록 오버라이딩 하면된다.
	 */
	
	/*
	 age는 int 형이므로 비교연산자를 통해 비교한다.
	 subject는 String이므로 equals() 메서드를 통해 비교해야한다.
	 */
	@Override
	public boolean equals(Object obj) {
		//매개변수로 전달받은 인스턴스를 다운캐스팅한다.
		Teacher teacher = (Teacher)obj;
		System.out.println("equals() 호출됨");
		if((teacher.getage()==super.getage())
				&&teacher.subject.equals(this.subject)) {
			/*
			 모든 내용이 일치하면 true를 반환한다. 그러면 set에는
			 추가되지 않는다.
			 */
			return true;
		}
		else {
			//내용이 다르면 정상적으로 추가된다.
			return false;
		}
	}
}
	