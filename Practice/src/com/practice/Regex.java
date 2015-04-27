package com.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Pattern pattern=Pattern.compile("\\b(Gold|Silver|Iron)\\b");
		Matcher matcher=pattern.matcher("glob glob Silver is 34 Credits");
		while(matcher.find()){
			System.out.println(matcher.group()+" "+matcher.start()+" "+matcher.end());

		}
	
		BufferedReader reader=new BufferedReader(new FileReader(new File(args[0])));
		String line;
		ArrayList<String> lines=new ArrayList<String>();
		while ((line = reader.readLine()) != null) {
			// Ignore empty lines.
			if (line.trim().length() == 0)
				continue;
		
		}
		
		for (String string : args) {
			System.out.print(string);
			if(string.equalsIgnoreCase("\\n"))
				System.out.println();;

		}
	}

}
