
public class Driver {
public static void main(String[] args) {
	Hayvan h1 =new Hayvan(4);
	Kopek k1 =new Kopek(4, "kangal");
	Kedi kedi1 = new Kedi(4, "van");
	adinisöyle(kedi1);
	adinisöyle(k1);
	adinisöyle(h1);
	
}


public static void adinisöyle(Hayvan hayvan) {
	  hayvan.adinisöyle();
}
}
