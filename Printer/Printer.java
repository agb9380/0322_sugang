package s0322.abs02;

public abstract class Printer { 
	
	//프린터는 기본적으로 프린터명~등등을 가짐
	
	String productName;
	
	public abstract void print();  // 추상 메소드를 가지면, 클래스도 반드시 추상 클래스가 되야함
	
	//public void print() {  //프린터의 기능 // lg와 samsung에게 print() 메소드를 사용하라는 것의 '강제성'을 부여하고 싶음
	//	System.out.println("출력중...");
	// }
	

}
