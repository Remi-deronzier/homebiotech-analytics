package symptomAnalysis;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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

		// creating an instance of CountAndSortSymptomFromList
		CountAndSortSymptomFromList analyzingSymptomsFromList = new CountAndSortSymptomFromList(symptomList);
		// doing some operations
		Map<String, Integer> unsortedSymptoms = analyzingSymptomsFromList.GetSymptomsOccurrences();
		TreeMap<String, Integer> sortedSymptoms = analyzingSymptomsFromList
				.SortSymptomsAlphabetically(unsortedSymptoms);

		System.out.println(sortedSymptoms);
	}

}
