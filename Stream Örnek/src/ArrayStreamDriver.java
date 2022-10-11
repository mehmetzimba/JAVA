import java.util.Arrays;

public class ArrayStreamDriver {
public static void main(String[] args) {
	
	int[] numaralar = {2,1,6,4,7,5,9};
	Arrays.stream(numaralar)
	.filter((x)->x>3)
	.map((x)->x*2)
	.sorted()
	.forEach(System.out::println)
	;
	
	
	
	
	
	
}
}
