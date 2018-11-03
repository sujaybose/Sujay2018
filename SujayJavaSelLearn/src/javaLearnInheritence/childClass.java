package javaLearnInheritence;

public class childClass extends parentClass {
	
	public static void main(String[] args) {
		parentClass obj= new parentClass();
		
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
}
