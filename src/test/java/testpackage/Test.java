package testpackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
	
 public static void main(String[] args) throws IOException {
	
	 
	 
	 BufferedReader br = new BufferedReader(new FileReader("C:/Users/Anurag/Downloads/tripwire.txt"));
	 try {
	     StringBuilder sb = new StringBuilder();
	     String line = br.readLine();

	     
	     while (line != null) {
	    	 if(line.contains("Element:")){
	         sb.append(line);
	         sb.append(System.lineSeparator());
	    	 }
	         line = br.readLine();
	    	 
	     }
	     String everything = sb.toString();
	     System.out.println(everything);
	 } finally {
	     br.close();
	 }
	 
	 
}
 

}
