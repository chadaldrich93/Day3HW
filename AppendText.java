package day3hw;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

class AppendText{
	
	public static void main(String[] args) throws FileNotFoundException,
	                                              IOException{
		appendToFile(new File("src/day3hw/textFile"), "pls work");
	}
	
	public static void appendToFile(File target, String text)
	                                throws FileNotFoundException, IOException{
		BufferedWriter writer = new BufferedWriter(new FileWriter(target, true));
		writer.write(text);
		writer.close();
	}
}