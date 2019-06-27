package day3hw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class CountChar{
	
	public static void main(String[] args) throws FileNotFoundException,
	                                              IOException{
		if (args.length != 1) {
			System.out.println("Usage: CountChar character");
			return;
		}
		String targetAsString = args[0];
		if (targetAsString.length() != 1) {
			System.out.println("Usage: CountChar character");
			return;
		}
		char target = targetAsString.charAt(0);
		int targetAsInt = (int)target;
		File source = new File("textFile");
		System.out.println(countCharacter(source, targetAsInt));
	}
	
	public static int countCharacter(File source, int characterAsInt)
			                         throws FileNotFoundException, IOException{
		int count = 0;
		BufferedReader reader = new BufferedReader(new FileReader(source));
		int currentChar = reader.read();
		while (currentChar != -1) {
			if (currentChar == characterAsInt) {
				count++;
			}
		}
		return count;
	}
}