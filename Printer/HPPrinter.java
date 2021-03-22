package s0322.abs02;

public abstract class HPPrinter extends Printer { // HPPrinter가 다시 abstract가 될 수도 있음

	@Override
	public void print() {
		System.out.println("HP프린터에서 출력중...");

	}

}

class HPLaserPrinter extends HPPrinter {

	@Override
	public void print() {
		System.out.println("HP레이저 프린터에서 출력중...");
	}

}

class HPInkjetPrinter extends HPPrinter {
	@Override
	public void print() {
		System.out.println("HP잉크젯 프린터에서 출력중...");
	}

}