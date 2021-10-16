package symptomAnalysis;

import java.util.List;

/**
 * Main class to execute the whole program
 */

public class Main {

	final static String inputFilePath = "src/main/resources/symptoms.txt";

	public static void main(String[] args) {
		// creating an instance of ReadSymptomDataFromFile
		ReadSymptomDataFromFile readingSymptomsFromFile = new ReadSymptomDataFromFile(inputFilePath);
		// doing some operations
		List<String> symptomList = readingSymptomsFromFile.GetSymptoms();

		System.out.println(symptomList);
	}

}
