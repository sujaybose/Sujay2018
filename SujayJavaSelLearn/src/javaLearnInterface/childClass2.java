package javaLearnInterface;

public class childClass2 implements parentInterface, parent2Interface {
//multiple inheritence
	public static void main(String[] args) {

		parentInterface obj = new childClass2();
		parent2Interface obj1 = new childClass2();
		
		System.out.println(abc);
		obj.car();
		obj.parentClass();
		// obj.gear();
		obj.wheels();
		obj1.wheels();

	}

/*	public childClass2() {
		System.out.println("this is child calss 2");
	}
*/
	public void gear() {
		System.out.println("This is gear");
	}

	public void wheels() {
		System.out.println("This is a child class 2 wheels");
	}

	@Override
	public void parentClass() {
		System.out.println("parentClass:implemented in child class");

	}

	@Override
	public void car() {
		System.out.println("car: implemented in child class");

	}

	@Override
	public void brake() {
		System.out.println("brake: This is parent2 interface implemented");
		
	}

	@Override
	public void window() {
		System.out.println("window: This is parent2 interface implemented");
		
	}
}
