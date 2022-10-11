import java.util.Arrays;

public class driver {
public static void main(String[] args) {
	/*int[][] numbers = new int[2][3];//2x 3 dizi oluşturduk
	numbers[0][0] =1;
	numbers[0][1] =2;
	numbers[0][2] =3;
	 
	numbers[1][0] =4;
	numbers[1][1] =5;
	numbers[1][2] =6;
	
	
	System.out.println(numbers[1][0]);//
	System.out.println(Arrays.toString(numbers)); // 
	for(int i =0 ; i<2 ; i++ ) {
		for(int j=0; j<3; j++) {
			
			System.out.println(numbers[i][j]);
		}
	} */
	
	
	String[][] ogrenciler =new String[3][3];
	ogrenciler[0][0] ="ali";
	ogrenciler[0][1] ="veli";
	ogrenciler[0][2] ="can";

	ogrenciler[1][0] ="hasan";
	ogrenciler[1][1] ="mehmet";
	ogrenciler[1][2] ="ali";
	
	ogrenciler[2][0] ="yusuf";
	ogrenciler[2][1] ="kenan";
	ogrenciler[2][2] ="erdem";
	for(int i =0 ; i<ogrenciler.length ; i++ ) {
		for(int j=0; j<ogrenciler.length; j++) {
			
			System.out.println(ogrenciler[i][j]);
		}
	}
} 
	
}
