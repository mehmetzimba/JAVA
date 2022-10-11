package ödev;

import java.util.Scanner;

public class Odev {
public static void main(String[] args) {
 double indeks;
 double kilo;
 double boy;
 Scanner scanner = new Scanner(System.in);
 System.out.println("kilo değerini ondalıklı giriniz");
 kilo = scanner.nextDouble();
 System.out.println("boy değerini ondalıklı giriniz");
 boy = scanner.nextDouble();
 indeks=kilo/((boy/100)*(boy/100));
 if (indeks<15) 
	 System.out.println("cok  ciddi düşük kilo");
 if (15<indeks&& indeks<=16) 
	 System.out.println("cok düşük kilo");
 if (16<indeks&& indeks<=18.5) 
	 System.out.println(" düşük kilo");
 if (18.5<indeks&& indeks<=25) 
	 System.out.println("normal kilo");
 if (25<indeks&& indeks<=30) 
	 System.out.println("fazla kilo");
 if (30<indeks&& indeks<=35) 
	 System.out.println("1. derece obez");
 if (35<indeks&& indeks<=40) 
	 System.out.println("2. derece obez");
 if (indeks>40) 
	 System.out.println("3. derece obez");
 
 
 
}


}

