package com.example.demo.csv;

public class CsvWriteReadTest {

	public static void main(String[] args) {
		//String fileName = System.getProperty("user.home") + "/student.csv";

		String fileName = "src\\data\\abc.csv";
		System.out.println("Write CSV file:");
		CsvFileWriter.writeCsvFile(fileName);

		System.out.println("\nRead CSV file:");
		CsvFileReader.readCsvFile(fileName);
	}
}
