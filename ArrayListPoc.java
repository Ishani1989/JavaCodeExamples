package javacollections;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListPoc {

	ArrayList<String> arr = new ArrayList<String>();

	public static void main(String args[]) {
		ArrayListPoc obj = new ArrayListPoc();
		obj.readFileToArr();
		obj.sortArr();
		obj.writeArrToFile();

	}

	private void writeArrToFile() {
		try {
			FileWriter writer = new FileWriter(
					"D:/Ishani_study/workspace/projects/src/main/java/javacollections/ArrayListPoc-Output.txt");
			BufferedWriter bufWriter = new BufferedWriter(writer);

			Iterator<String> itr = arr.iterator();
			while (itr.hasNext()) {
				String item = itr.next();
				bufWriter.write(item);
				bufWriter.newLine();
			}

			bufWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void sortArr() {
		Collections.sort(arr);
	}

	private void readFileToArr() {
		FileReader inputFile = null;
		try {
			inputFile = new FileReader(
					"D:/Ishani_study/workspace/projects/src/main/java/javacollections/ArrayListPoc-Input.txt");

			BufferedReader bufferReader = new BufferedReader(inputFile);
			String line;
			while ((line = bufferReader.readLine()) != null) {
				this.arr.add(line);
				System.out.println(line);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
