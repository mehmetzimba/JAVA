import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Driver { // kullanıcıdan sayı alalım kullanıcı -1 girene kadar sayıları linkedset dolduralım 
public static void main(String[] args) {
	
	Scanner scanner =new Scanner(System.in);
	System.out.println("ÇIKMAK İÇİN -1 GİRİNİZ");
	
	LinkedHashSet<Integer> integers =new LinkedHashSet<Integer>();
    int i=0;
    while ((i=scanner.nextInt())  !=-1) {
		integers.add(i);
	}
   System.out.println("sayı adedi  " +integers.size());
	 Iterator<Integer> iterator= integers.iterator();
	while (iterator.hasNext()) {
		Integer next = iterator.next();
		System.out.println(next);
	}
}
}
