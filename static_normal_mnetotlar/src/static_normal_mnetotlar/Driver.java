package static_normal_mnetotlar;

import java.util.Scanner;

public class Driver {
	private int x =20;
	
	
	public static void main(String[] args) {
		Driver driver =new Driver();// static olmadığı için instance aldık
		driver.normalMetod();
		Driver.statikmetot();  // statikmetot da static olduğu için instance almadık
		System.out.println(Math.pow(4, 3)); // Math içindeki tüm metotlar statik olduğundan instance almadık
	  System.out.println(  Driver.max(4, 6, 5));
	}
	public void normalMetod() {
		System.out.println(x);
	}
	public static void statikmetot() {
		System.out.println("naber");
	}
    public static int max(int x ,int y,int z) {
    	
   
    	int max =x;
    	if(y>max)
    	   max=y;
    	if (z>max)
    		max=z;
    	return max;
    }
}
