package com.in28Minutes.FoldersAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {

	public static void main(String[] args) throws IOException {
		Path fileToWrite = Paths.get("./resources/fileCreatedByCode.text");

		List<String> contentToWrite = List.of("apple", "orange", "banana", "new");
		Files.write(fileToWrite, contentToWrite);

	}

}
