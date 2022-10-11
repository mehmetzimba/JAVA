
public  class Ogrenci { // class ın önüne final yparsak UniOgrenci classı için derleme hatasıa lırız çünkü bundan türettik
 private final int numara=10;
 public int getNumara() {
	return numara;
}
 // set // ctrl+tab yaptığımızda set kısmında gözükmüyor çünkü finaldan dolayı numara değişkeni güncenlenmez
public void yazdır() { // METODUN BAŞINA FİNAL YAZILIRSA BURDAN uNİOgrenciedki yazdıor metodu miras alamaz
	System.out.println(numara);
}



}
