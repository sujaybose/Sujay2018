package collectionJava;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListLearn {

    public static void main(String[] args) {
    	
    	ArrayList ar= new ArrayList<>();
    	
    	ar.add(566);
    	ar.add("sujay");
    	ar.add(12.88);
    	
    	Iterator itr= ar.iterator();
    	while(itr.hasNext()) {
    		Object value=itr.next();
    		System.out.println(value);
    	}
    	
    	for (int i = 0; i < ar.size(); i++) {
    		System.out.println(ar.get(i));
			
		}
    	
    	
    }
}