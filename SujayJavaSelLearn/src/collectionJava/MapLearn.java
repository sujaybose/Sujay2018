package collectionJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapLearn {

	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<Integer, String>();

		mp.put(12, "BMW");
		mp.put(14, "Maruti");
		mp.put(16, "Honda");
		mp.put(23, "Chevolet");
		mp.put(54, "Ford");

		System.out.println(mp);

		// Using for each and Map.Entry
		for (Map.Entry<Integer, String> entry : mp.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

		// using iterators
		Iterator<Map.Entry<Integer, String>> itr = mp.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

	}

}
