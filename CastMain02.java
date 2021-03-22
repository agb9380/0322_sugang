package s0322.abs03;

public class CastMain02 {
	
	public static void main(String[] args) {
		
		
		Parent p = new Child02(); // 묵시적 형변환, Child02의 오버라이드된 메소드에는 접근이 가능함, 그렇지만 Child02의 개별 메소드에는 접근이 불가능함
		
		p.info(); // Child02에 info()는 오버라이드된 메소드이기 때문에, Child02의 info()가 출력됨
		
		
		 Child02 c = (Child02) p; //묵시적 형변환 후 명시적 형변환 ==> Child02의 개별 메소드에 접근할 수 있음!
		 
	}
	

}