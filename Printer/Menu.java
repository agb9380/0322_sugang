package s0322.abs02;

import java.util.Scanner;

public class Menu {

	public int selectMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("LV2 프린터를 선택하세요.(1.LG 2.삼성 3.HP)=> ");
		int no = sc.nextInt();
		sc.nextLine();

		return no;

	}

	public void choice() {
		int type = selectMenu(); // type에 1,2가 들어옴, 이것에 따라서 출력하도록함
		print(type);

	}

	public void print(int no) {
		
		Printer p= null; //모두가 print()를 호출하고 있으니까 간단하게 만들어보자
		
		
		switch (no) {
		case 1:
			p = new LG_Printer(); //자식의 인스턴스 객체의 주소값을 부모가 가질 수 있음
			p.print();
			break;
		case 2:
			p= new Samsung_Printer();			//Samsung_Printer sam = new Samsung_Printer();
			p.print();
			break;
		case 3:
			p = new HPLaserPrinter();
			//p = new HPInkjetPrinter();
			p.print();
			break;

		} // 1,2,3 이외의 값을 입력하면 null값이 됨
		if(p != null) {
			p.print();
		}else {
			System.out.println("잘못 선택하셨습니다.");
		}
		

	}
}