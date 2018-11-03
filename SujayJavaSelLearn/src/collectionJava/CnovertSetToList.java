package collectionJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CnovertSetToList {

	public static void main(String[] args) {

		Set<String> st = new HashSet<>();

		st.add("Sujay");
		st.add("Bose");
		st.add("Birati");
		st.add("5");
		System.out.println("============HashSet============");
		System.out.println(st);

		System.out.println("============CovertedSetToList============");
		ArrayList<String> al = new ArrayList<>(st);
		System.out.println("Array"+ al);
		System.out.println(al.get(2));

	}

}
