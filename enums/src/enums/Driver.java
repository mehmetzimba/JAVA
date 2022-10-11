package enums;

public class Driver {
	public static void main(String[] args) {
		aylar ay = aylar.ARALIK ;
		System.out.println(ay);
		aylar[] values = aylar.values();
		for(int i =0; i<values.length ; i++) {
			System.out.println(values[i]);
		}
	}

}
