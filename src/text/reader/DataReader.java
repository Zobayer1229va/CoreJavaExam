package text.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {
	public static void main(String[] args){ 
		 		/* Use java API to read a file from external sources(can be a text file  
		 		 * in your documents folder) 
		 		 * You must use Try...catch and finally block. 
		 		 * You must use while loop.Use String array for extra credit. 
		 		 *  
		 		 */ 
		 
		 
		 		FileReader txtFile = null; 
		 
		 
		 		try { 
		 			txtFile = new FileReader("sample.txt"); 
		 		} catch ( FileNotFoundException e ) { 
		 			System.out.println("File not found. Double check your file and its path."); 
		 		} 
		 		 
		 		BufferedReader reader = new BufferedReader(txtFile); 
		 		String strLine; 
		 		 
		 		try { 
		 			while(( strLine = reader.readLine() ) != null ) { 
						System.out.println(strLine); 
		 			} 
		 		} catch (IOException e) { 
		 			e.printStackTrace(); 
		 		} finally{ 
		 			try { 
		 				reader.close(); 
		 			} catch (IOException e) { 
		 				e.printStackTrace(); 
		 			} 
		 			try { 
		 				txtFile.close(); 
		 			} catch (IOException e) { 
		 				e.printStackTrace(); 
		 			} 
		 		} 
		 	} 


}

