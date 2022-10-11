
public class Driver {
public static void main(String[] args) {
	Arac arac =new Arac("58","ford");
	YolcuArac yolcuArac=new  YolcuArac("55", "mercedes", 6);
	Kamyon kamyon =new Kamyon("50", "MAN", 8, 9);
	YukTasima yukTasima =new YukTasima("56", "MAN", 4);
	yolcuArac.yazdır();
	kamyon.yazdır();
	yukTasima.yazdır();
}
}
