import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	
	ArrayList<String> arrayList =new ArrayList<>();
	Scanner scanner =new Scanner(System.in);
	String line=null;
	while (!(line=scanner.nextLine()).equals("exit")) {
		arrayList.add(line);
	}
	/* Iterator<String > iterator  =arrayList.iterator();
	 while (iterator.hasNext()) {
		String next = iterator.next();
		System.out.println(next);
	}
	 */ // ya da aşağıdaki iterator görevi görür
	 for(int i=0;i<arrayList.size();i++) {
		 
		 System.out.println(arrayList.get(i));
	 }
	 
}
}
