
public class Driver {
	public static void main(String[] args) {
		Daire daire =new Daire(); //yeni bir nesne oluşturduk
		daire.r=2;
		System.out.println(daire.alan());
		System.out.println(daire.cevre());
		Daire daire2 =new Daire(); // bir nesne daha oluşturduk
		daire2.r =3;
		System.out.println(daire2.alan());
		System.out.println(daire2.cevre());
	}

}
