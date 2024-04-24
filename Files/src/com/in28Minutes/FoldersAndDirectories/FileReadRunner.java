package com.in28Minutes.FoldersAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path fileToRead = Paths.get("./resources/data.txt");

		List<String> list = Files.readAllLines(fileToRead);
		System.out.println(list);

		Files.lines(fileToRead).filter(str -> str.contains("a")).forEach(System.out::println);
	}

}
