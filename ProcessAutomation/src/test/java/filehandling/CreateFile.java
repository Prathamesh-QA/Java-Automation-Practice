package filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {

		String path = "C:\\Users\\p.dhamanaskar\\Documents\\sample.txt";
		
		File file = new File(path);
		try {
			boolean flag = file.createNewFile();
			if(flag) {
				System.out.println("File created");
			}else {
				System.out.println("File not created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
