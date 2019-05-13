package com.scenarios.collection.streams.streambuild;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsFromFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			Stream<String> lines=Files.lines(Paths.get("sampleFile"));
			
			List<String> line3toUpperCase=lines.filter(line ->line.contains("line3"))
			.map(String::toUpperCase)
			.collect(Collectors.toList());
			line3toUpperCase.forEach(System.out::println);
			
			//lines.forEach(System.out::println);
			Files.newDirectoryStream(Paths.get(".")).forEach(System.out::println);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
