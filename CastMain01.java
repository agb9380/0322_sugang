package s0322.abs03;

public class CastMain01 {

//	public static void print (Child01 c) {
//		c.info();
//	}
//	
//	public static void print(Child02 c) {
//		c.info();
//	}

	public static void print(Parent p) { // instance of는 형변환이 가능한 지 해당 여부를 true 또는 false로 가르쳐줌

		p.info(); // 예외적으로 오버라이드 되어 있으니까 접근이 가능함, .sleep, .study는 접근이 불가능함
		System.out.println(p instanceof Child01); // true 확인

		if (p instanceof Child01) {

			Child01 c = (Child01) p;// parent p로 받으면(묵시적 형변환 안하면,) 하위 클래스의 개별 메소드(오버라이드 하지 않은)에는 접근할 수 없으니까 명시적 형변환
									// 한 뒤, 하위 클래스의 개별 메소드에 접근함
			c.sleep();
			c.study();
		} else if (p instanceof Child02) {
			Child02 c = (Child02) p;
			c.sing();
		}

		System.out.println("p instanceof Child01 : " + (p instanceof Child01));

	}

	public static void main(String[] args) {

		// Parent p = new Parent(); // 명시적 변환하기 전에 묵시적 형변환을 안하면? p.info()만 출력될 것임. 반복문
		// 안들어감(부모가 자식이 되려하면 안됨)
		Parent p = new Child02(); // 묵시적 형변환 위 print 메소드의 매개변수에 맞추고, 본질은 Child01임
		print(p);

//		Child01 c01 =new Child01();
//		print(c01);

//		Child02 c02 = new Child02();
//		print(c02);

//		Parent p = new Parent();
//		print(p);

		// Parent p = new Child01(); // 묵시적 형변환
		// System.out.println(p.name+", "+ p.age); //가리키는 것은 Child01(하위 클래스) 이지만 범위는
		// Parent

		// Child01 c01 = new Child01();
		// System.out.println(c01.name+", "+ c01.age); // Child01은 부모 클래스인 Parent를 상속받았기
		// 때문에, 부모 클래스의 메소드와 변수를 그대로 사용할 수 있음

	}

}
