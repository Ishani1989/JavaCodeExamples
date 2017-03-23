package javacollections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	
	public static void main(String args[]){
		Map<Integer, String> myTree = new TreeMap<Integer, String>();
		myTree.put(4, "Ishani");
		myTree.put(8, "Laddu");
		myTree.put(5, "Manas");
		myTree.put(2, "Teddy");
		
		System.out.println(myTree);
	}
	
}
