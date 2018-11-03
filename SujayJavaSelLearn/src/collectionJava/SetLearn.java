package collectionJava;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetLearn {

	public static void main(String[] args) {
		
		Set<String> st= new HashSet<>();
		
		st.add("Sujay");
		st.add("Bose");
		st.add("Birati");
		st.add("5");
		System.out.println("============HashSet============");
		//System.out.println(st);
		for(String val:st) {
			
			System.out.println(val);
		}
		
		Set<String> lst= new LinkedHashSet<>();
		
		lst.add("Sujay");
		lst.add("Bose");
		lst.add("Birati");
		lst.add("5");
		System.out.println("============LinkedHashSet============");
		//System.out.println(st);
		for(String val:lst) {
			
			System.out.println(val);
		}

	}

}
