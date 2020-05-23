package com.bridgelabz.bookstoreselenium.csv;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class writesheet {
	public static void main(String[] args) throws IOException {
		//Set HTML reporting file location
        String workingDir = System.getProperty("user.dir");
		FileWriter csvWriter = new FileWriter(workingDir + "\\xlsxSheet\\ExcelSheet.csv");
		csvWriter.append("firstName");
		csvWriter.append(",");
		csvWriter.append("lastName");
		csvWriter.append(",");
		csvWriter.append("email");
		csvWriter.append(",");
		csvWriter.append("phone");
		csvWriter.append(",");
		csvWriter.append("password");
		csvWriter.append("\n");
		@SuppressWarnings("unchecked")
		List<List<String>> rows = Arrays.asList(
				Arrays.asList("sai", "kiran", "Sai@","96666","Sai"),
				Arrays.asList(" ", " ", " "," "," "), 
				Arrays.asList("Saik", "Kiran", "Sai@gmail.com","9666672152","Saikira"));
		for (List<String> rowData : rows) {
			csvWriter.append(String.join(",", rowData));
			csvWriter.append("\n");
		}
		System.out.println("Details sucessfully stored...");
		csvWriter.flush();
		csvWriter.close();
	}
	
}