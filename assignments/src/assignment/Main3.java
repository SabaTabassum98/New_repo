package assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main3 {
	  public static void findFile() {

	    File newFile = new File("F:\\Saba_Practice\\eclipse-workspace\\assignments\\test.txt");
	    try {
	    FileInputStream stream = new FileInputStream(newFile);
	    int i = 0;
	    while((i = stream.read())!=-1) {
	    	
	    	System.out.print((char)i);
	    }
	    System.out.println();
	    
	    }catch(FileNotFoundException e) {
	    	System.out.println("File is not found");
	    }
	    catch(IOException e) {
	    	System.out.println("IO Exception");
	    }
	    }

	  public static void main(String[] args) {
		  findFile();
	    System.out.println("Print the exception");
	  }
	}
