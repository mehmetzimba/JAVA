import java.util.ArrayList;

public class Driver {
public static void main(String[] args) {
	ArrayList<Integer> integers = new ArrayList<>();
	integers.add(3);
	integers.add(5);
	integers.add(12);
	
	// integers.forEach((i) -> System.out.println(i));// aşağıdaki ile aynı işi görüyor
	 integers.forEach( System.out :: println  );
	
	 
	 
	 
}
}
