package javaLearnInterface;

public class childClass implements parentInterface {
	
	public static void main(String[] args) {
		parentInterface obj= new childClass();
		
		//you can not create object of an interface because it has abstract method
		//parentInterface obj1= new parentInterface();
		
		obj.car();
		obj.parentClass();
		obj.wheels();
		//obj.wheels(); //won't work
	}

	public childClass() {
		System.out.println("This is a child class");
	}
	
	public void wheels(){
		System.out.println("This is a child class wheel method");
	}
	
	public void gear() {
		System.out.println("This is gear");
	}

	@Override
	public void parentClass() {
		System.out.println("parentclass: implemented in child class");
		
	}

	@Override
	public void car() {
		System.out.println("car:implemented in child class");
		
	}
}
