
public class Driver {
public static void main(String[] args) {
	
	Araba araba =new Araba("x marka ","y model",2012);
	System.out.println(araba.toString());
	araba.setMarka("q marka");
	System.out.println(araba.toString());
}
}
