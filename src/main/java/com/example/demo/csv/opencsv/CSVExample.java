package com.example.demo.csv.opencsv;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import com.opencsv.CSVWriter;

public class CSVExample {

	public static void main(String[] args) {
		try {
			String fileName = System.getProperty("user.home") + "/employee.csv";

			CSVWriter csvWriter = new CSVWriter(new FileWriter("src\\data\\abc.csv"));
		/*	csvWriter.writeNext(new String[] { "1", "jan", "Male", "20" });
			csvWriter.writeNext(new String[] { "2", "con", "Male", "24" });
			csvWriter.writeNext(new String[] { "3", "jane", "Female", "18" });
			csvWriter.writeNext(new String[] { "4", "ryo", "Male", "28" });

			System.out.println("file saved!");
			csvWriter.close(); // closing the csv writer
*/
			List<String[]> rows = new LinkedList<String[]>();
			rows.add(new String[] { "1", "jan1", "Male", "20" });
			rows.add(new String[] { "2", "con2", "Male", "24" });
			rows.add(new String[] { "3", "jane3", "Female", "18" });
			rows.add(new String[] { "4", "ryo4", "Male", "28" });
			csvWriter.writeAll(rows);
			csvWriter.close(); // closing the csv writer

		} catch (IOException e) {
			System.out.println("Error while saving file!");

			e.printStackTrace();
		}
	}
}
