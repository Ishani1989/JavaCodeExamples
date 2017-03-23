package javacollections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {

		Map<String, Double> linkedHashMap = new LinkedHashMap<String, Double>();
		linkedHashMap.put("Apple", new Double(91.98));
		linkedHashMap.put("Sony", new Double(16.76));
		linkedHashMap.put("Dell", new Double(30.47));
		linkedHashMap.put("HP", new Double(33.91));
		linkedHashMap.put("IBM", new Double(181.71));

		System.out.println("Contents of LinkedHashMap : " + linkedHashMap);

		System.out.println("\nValues of map after iterating over it : ");
		for (String key : linkedHashMap.keySet()) {
			System.out.println(key + ":\t" + linkedHashMap.get(key));
		}

		System.out
				.println("\nThe size of the LinkedHashMap is : " + linkedHashMap.size());

		System.out.println("\nIs LinkedHashMap empty? : " + linkedHashMap.isEmpty());

		System.out.println("\nLinkedHashMap contains Sony as key? : " + linkedHashMap.containsKey("Sony"));
		System.out.println("LinkedHashMap contains 999.0 as value? : " + linkedHashMap.containsValue(999.0));
		
		System.out.println("\nRemove entry for Dell : " + linkedHashMap.remove("Dell"));
		System.out.println("Content of LinkedHashMap removing Dell: " + linkedHashMap);

		linkedHashMap.clear();
		System.out.println("\nContent of LinkedHashMap after clearing: " + linkedHashMap);
	}
}
