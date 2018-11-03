package javaLearnInheritence;

public class childClass2 extends parentClass {

	public static void main(String[] args) {
		parentClass obj = new childClass2();

		obj.car();
		obj.parentClass();
		//obj.gear();
		obj.wheels();

	}

	public childClass2() {
		System.out.println("this is child calss 2");
	}

	public void gear() {
		System.out.println("This is gear");
	}
	
	public void wheels() {
		System.out.println("This is a child class 2 wheels");
	}
}
