import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;


public class Driver {
public static void main(String[] args) {
	File file =new File("C:\\\\Users\\\\PC-LENOVO\\\\Desktop\\\\sozluk.txt");
	FileReader fileReader =null; // dosya okuma sınıfı
	BufferedReader  bufferedReader =null;
	
	
	
	try {
		fileReader =new FileReader(file);
		bufferedReader =new  BufferedReader(fileReader);
		String line=null;
		SortedMap<String, String> sortedMap =new TreeMap<>();
		
		
		
		
		while ((line= bufferedReader.readLine()) != null) {
			//System.out.println(line);
			String[] strings = line.split(":");
		//	System.out.println(strings[0]);
		//	System.out.println(strings[1]);
			sortedMap.put(strings[0], strings[1]);
			
			Scanner scanner =new Scanner(System.in);
			String input=null;
			System.out.print("kelime:");
			while ((input=scanner.nextLine()).equals("exit")) {
				String value =sortedMap.get(input);
				if (value != null) {
					System.out.println(value);
				} else {
					System.err.println("kelime bulunmadı");
				}
			}
			System.out.print("kelime:");
			
			
		}
		/* System.out.println(sortedMap.size());
		Set<String> keySet =sortedMap.keySet();
		Iterator<String> iterator= keySet.iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			System.out.print(key+";");
			System.out.println(sortedMap.get(key));
		}  */
		
		
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if (bufferedReader !=null ) bufferedReader.close();
			if (fileReader !=null ) fileReader.close();
			
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
	}
	
	
	
	
}
}
