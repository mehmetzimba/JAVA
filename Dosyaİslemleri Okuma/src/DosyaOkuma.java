import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
public class DosyaOkuma {
	public static void main(String[] args) {
		File  file =new File("C:/Users/PC-LENOVO/Desktop/ metin.txt");
		try {
			Scanner scanner= new Scanner(file);
			while (scanner.hasNextLine()) {
				String kelime=scanner.nextLine();
				System.out.println(kelime);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}