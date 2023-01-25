package javaOOP.overrding;

public class Student extends Person implements IWork {
	@Override
	public void eat() {
		System.out.println("Suất cơm 15k");
	}

	@Override
	public void sleep() {
		System.out.println("Ngủ 12h/ngày");

	}

	@Override
	public void workingTime() {
		System.out.println("Học 3h/ngày");

	}

}
