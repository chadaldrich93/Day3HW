package day3hw;

import java.io.File;

class DisplayDirectory{
	
	public static void main(String[] args) {
		File thisDirectory = new File("src/day3hw");
		listDirectoryContents(thisDirectory);
	}
	
	public static void listDirectoryContents(File directory) {
		String[] contents = directory.list();
		for (String item: contents) {
			System.out.println(item);
		}
	}
}