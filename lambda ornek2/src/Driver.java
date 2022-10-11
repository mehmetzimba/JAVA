
public class Driver {
public static void main(String[] args) {
	Merhaba merhaba=()-> "merhaba";
	System.out.println(merhaba.selam());
	Merhaba2 merhaba2 = (s)-> "naber"+s;
	System.out.println(merhaba2.selam("haciii"));
	Topla topla = (x,y)-> x+y;
	System.out.println(topla.topla(3, 4));
}
}
