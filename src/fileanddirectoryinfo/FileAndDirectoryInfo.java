package fileanddirectoryinfo;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FileAndDirectoryInfo {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in); // get input from the console window
		System.out.println("Enter the name of the file or the directory: "); // hint to enter
		Path path = Paths.get(input.nextLine()); // get the path entered by user 
		if (Files.exists(path)){
			System.out.printf("%n%s exists.%n", path.getFileName());
			System.out.printf("%s a directory.%n", Files.isDirectory(path) ? "Is" : "Isn't");
			System.out.printf("%s an absolute directory.%n", path.isAbsolute() ? "Is" : "Isn't");
			System.out.printf("Last modified: %s%n", Files.getLastModifiedTime(path));
			System.out.printf("Size: %s%n", Files.size(path));
			System.out.printf("Path: %s%n", path.toString());
			System.out.printf("Absolute Path: %s%n", path.toAbsolutePath());
			System.out.println();
			System.out.println();
			if (Files.isDirectory(path)){
				DirectoryStream<Path> paths = Files.newDirectoryStream(path);
				for (Path p : paths){
					System.out.println(p);
				}
			}
		} else {
			System.out.println(path.toString() + " doesn't exist.");
		}
		
		if (input != null) input.close();
	}
}
