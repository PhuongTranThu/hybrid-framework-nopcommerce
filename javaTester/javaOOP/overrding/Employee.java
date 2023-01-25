package javaOOP.overrding;

public class Employee extends Person implements IWork {
	@Override
	public void eat() {
		System.out.println("Suất cơm 25k");
	}

	@Override
	public void sleep() {
		System.out.println("Ngủ 7h/ngày");

	}

	@Override
	public void workingTime() {
		System.out.println("Làm 7h/ngày");

	}

}
