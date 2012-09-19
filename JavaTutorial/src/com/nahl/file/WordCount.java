package com.nahl.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class WordCount {
	String currentLine;
	String word = "";
	ArrayList wordList = new ArrayList();

	public ArrayList scanFile() throws IOException {
		ResourceBundle bundle = ResourceBundle.getBundle("Out");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(
					bundle.getString("Path")));

			while ((currentLine = reader.readLine()) != null) {

				for (int i = 0; i < currentLine.length(); i++) {
					if (currentLine.charAt(i) != '.'
							&& currentLine.charAt(i) != ','
							&& currentLine.charAt(i) != ';'
							&& currentLine.charAt(i) != ':') {
						if (currentLine.charAt(i) == ' ') {
							wordList.add(word);
							word = "";
						} else

							word = word + currentLine.charAt(i);

					}
				}
				
			}
			//System.out.println(wordList);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return wordList;

	}

	public static void main(String[] args) throws IOException {
		WordCount wc = new WordCount();
		ArrayList words = wc.scanFile();
	//	for()
	}

}
