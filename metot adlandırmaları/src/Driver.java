import sun.jvm.hotspot.HelloWorld;

public class Driver {
	
	private void helloworld () {
		
		
		System.out.println("hello world");
	}
	private  int topla(int x ,int y) {
		int toplam =x+y;
		return toplam;
	}
	public static void main(String[] args) {
		Driver driver =new Driver();	
		new Driver().helloworld();	
		System.out.println(new Driver().topla(5, 7));
		
	}

}
