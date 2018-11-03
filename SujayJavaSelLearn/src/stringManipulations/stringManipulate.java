package stringManipulations;

public class stringManipulate {


	public static void main(String[] args) {
		
		String actual= "Hi how are you";
		String expected= "Hi how are you";
		
		boolean x= actual.equals(expected);
		System.out.println("Status of string manipulation is "+x);
		
		String abc="car-bike-cycle";
		String[] xyz= abc.split("-");
		
		for(int i=0;i<xyz.length;i++) {
			System.out.println("Print: "+xyz[i]);
		}
	}

}
