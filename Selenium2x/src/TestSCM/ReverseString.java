package TestSCM;

import TestSCM.ReverseStrings;
//this program to reverse the character
public class ReverseString {
	
		
	public static void main (String args[]) throws Exception {
		String input = " I am a string";
		String out = ReverseMe(input);
		System.out.println("Reversed characters:"+ out);
		ReverseStrings oString= new ReverseStrings();
		String rev= oString.Reverse();
		System.out.println(rev);
		
		
	}
	
	public static String ReverseMe(String input) {
		int i = input.length();
		
		
		if (i==0) {
				System.out.println("String is invalid");
				System.exit(0);
				  }
		if (i<=1) {
				System.out.println("Reversed character" + input);
				return input;
				
							
		
				  }
		else {
			System.out.println("It's a valid string");
			StringBuilder sb =  new StringBuilder();
			for(int j= i-1; j>=0; --j) 
				sb.append(input.charAt(j));
			//System.out.println(output);
			String out = sb.toString();
			return out;
							
		}
		
	
	}
	
}
	
	

