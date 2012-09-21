package com.nahl.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Iterator;
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
			// System.out.println(wordList);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return wordList;

	}

	public static void main(String[] args) throws IOException {
		WordCount wc = new WordCount();
		ArrayList words = wc.scanFile();
		Iterator iterator = words.iterator();
		System.out.println(wc.scanFile());
	
//		while (iterator.hasNext()) {
			// System.out.println(wc.checkWord((String) iterator.next()));

	//	}
		
		//wc.checkDuplicate();
	}

	public int checkWord(String checkWords) throws IOException {
		int count = 0;
		ArrayList list = new WordCount().scanFile();

		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			if (checkWords == iterator.next()) {
				count++;
			}
		}

		return count;
	}

	public void checkDuplicate(ArrayList duplicateList) throws IOException {
		
		duplicateList = wordList;
		Iterator iterator1 = duplicateList.iterator();
		Iterator iterator2 = wordList.iterator();
		System.out.println(iterator1);
		while (iterator1.hasNext()) {
			String checkWord = (String) iterator1.next();
			while (iterator2.hasNext()) {
				if (checkWord == iterator2.next()) {
					
				}
				else {
					ArrayList newList = new ArrayList();
					
					System.out.println(newList.add(checkWord));
				}
			}
		}
	}

}
