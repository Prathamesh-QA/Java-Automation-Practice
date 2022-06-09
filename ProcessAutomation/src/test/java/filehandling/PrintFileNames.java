package filehandling;

import java.io.File;
import java.util.Arrays;

public class PrintFileNames {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\p.dhamanaskar\\Documents\\Study\\ISTQB-Foundation\\Study Material";
		
		File folder = new File(path);
		File[] studyDirectory = folder.listFiles();
		Arrays.sort(studyDirectory);
		
		for(File file : studyDirectory) {
			if(file.isFile()) {
				System.out.println("File: " + file.getName());
			}else if(file.isDirectory()) {
				System.out.println("Directory: " + file.getName());
			}else {
				System.out.println("Not Unkown: " + file.getName());
			}
		}

	}

}
