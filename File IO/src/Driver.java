import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("dosya yolu :");
	 String filePath = scanner.nextLine();
	 File file=new File(filePath);
	 if (file.exists() !=true) {
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	 
	 FileWriter fileWriter =null;
	 String line = null;
	 do {
		 line=scanner.nextLine();
		  try {
			fileWriter.write(line);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} while (line.equals("quit"));
	 
	 try {
		fileWriter =new FileWriter(file);
	} catch (IOException e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}finally {
		if(fileWriter !=null) {
			try {
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		scanner.close();
	}
	 
	 
	 
	 
}
}
