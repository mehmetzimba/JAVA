import java.util.Iterator;
import java.util.TreeSet;

public class Driver {
public static void main(String[] args) {
	
	TreeSet<String>  treeSet=new TreeSet<>();
	treeSet.add("ALİ");
	treeSet.add("mehmet");
	treeSet.add("osman");
	treeSet.add("tamer");
	treeSet.add("kaan");
	Iterator<String> iterator=treeSet.iterator();
	while (iterator.hasNext()) {
		String next =  iterator.next();
		System.out.println(next);
		
	}
	
	
}
}
