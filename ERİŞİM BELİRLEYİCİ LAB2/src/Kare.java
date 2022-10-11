
public class Kare {
 private int x;
 private int y;
 private int uzunluk;
 public int getX() {
	 return x;
 }
 public void setX(int a) {
	 if(a>0) {
	 x=a;}
	 else
		 System.out.println("x pozitif değer giriniz");
 }
 public int getY() {
	 return y;
 }
 public void setY(int a) {
	if(a>0)
	{y=a;}
	else
		System.out.println(" y pozitif değer giriniz");
 }
 public int getUzunluk() {
	 return uzunluk;
 }
 public void setUzunluk(int a) {
	 if(a>0) {
		 uzunluk=a;}
		 else
			 System.out.println(" uzunluk pozitif değer giriniz");
	 }
 public void ekranabastır() {
	 System.out.println("x"+  x);
	 System.out.println("y" +  y);
	 System.out.println("uzunluk" +uzunluk);
 }
}

