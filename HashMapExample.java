package javacollections;

import java.util.*;

public class HashMapExample {
	public static void main(String args[]) {

		Map<Integer, String> h1 = new HashMap<Integer, String>();
		h1.put(1, "Manas");
		h1.put(2, "Ishani");
		h1.put(3, "Deepti");
		
		System.out.println(h1.containsKey(3));
	}
	
}
