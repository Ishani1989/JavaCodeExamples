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

public class ObjectSortUsingComparator {

	ArrayList<Person> arr = new ArrayList<Person>();

	public static void main(String args[]) {
		ObjectSortUsingComparator obj = new ObjectSortUsingComparator();
		obj.readFileToArr();
		obj.sortArr();
		//obj.writeArrToFile();

	}

	private void writeArrToFile() {
		try {
			FileWriter writer = new FileWriter(
					"D:/Ishani_study/workspace/projects/src/main/java/javacollections/ArrayListPoc-Output.txt");
			BufferedWriter bufWriter = new BufferedWriter(writer);

			Iterator<Person> itr = arr.iterator();
			while (itr.hasNext()) {
				Person item = itr.next();
				bufWriter.write(item.getAge());
				bufWriter.newLine();
			}

			bufWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void sortArr() {
		PersonNameComparator name1 = new PersonNameComparator();
		Collections.sort(arr, name1);
		System.out.println("after sort - "+arr);
	}

	private void readFileToArr() {
		FileReader inputFile = null;
		try {
			inputFile = new FileReader(
					"D:/Ishani_study/workspace/projects/src/main/java/javacollections/JavaObjectSort-Input.txt");

			BufferedReader bufferReader = new BufferedReader(inputFile);
			String line;
			while ((line = bufferReader.readLine()) != null) {
				Person p1 = new Person();
				String data[]=line.split(" ");
				for (int i=0;i<data.length;i++){
					int y = Integer.parseInt(data[1]);
					p1.setAge(y);
					p1.setName(data[0]);
				}
				this.arr.add(p1);
			}
			System.out.println("this is first read : "+arr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
