package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {


		File inputFile = new File("C:\\Users\\p.dhamanaskar\\Documents\\12bb.pdf");
		File outputFile = new File("C:\\Users\\p.dhamanaskar\\Documents\\12bb-copy.pdf");
		
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		
		try {
			inputStream = new FileInputStream(inputFile);
			outputStream = new FileOutputStream(outputFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(inputStream.available());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int i=0;
		try {
			while((i = inputStream.read()) !=-1) {
				outputStream.write(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		

	}

}
