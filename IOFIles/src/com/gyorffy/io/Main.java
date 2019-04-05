package com.gyorffy.io;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		String[] data = {
				"Line 1"
				,"Line 2 2"
				,"line 3 3 3"
		};
		
		try (FileSystem zipFs = openZip(Paths.get("myData.zip"))) {
			
		} catch (Exception e) {
			System.out.println(e.getClass().getSimpleName() +  " - " + e.getMessage());
		}
	}
		
	private static FileSystem openZip(Path zipPath) throws IOException, URISyntaxException {
		Map<String, String> providerProps = new HashMap<>();
		//if it doesn't exists create it
		providerProps.put("create", "true");
		
		URI zipUri = new URI("jar:file", zipPath.toUri().getPath(), null);
		FileSystem zipFs = FileSystems.newFileSystem(zipUri, providerProps);
		
		return zipFs;
	}
	
	private static void copyToZip(FileSystem zipFs) throws IOException {
		
	}

}
