import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {
	/*	int[] numbers = new int[5];
		numbers[0] = 5;
		numbers[1] = 10;
		numbers[2] = 20;
		numbers[3] = 30;
		numbers[4] = 40;
		System.out.println(Arrays.toString(numbers)); //Arrays.toString()  for kulanmadan hazır paket
		
		
		
		
		
		//ayrı bir örnek
/*		int toplam=0;
		int i;
		int[] sayilar = {3,4,5,7,8,9,10};
		
		for(i=0 ;i<sayilar.length ; i++ ) {
			
			toplam = toplam + sayilar[i];
			
		}
		System.out.println(toplam); */
		
		
		
		
		// ayrı bir örnek
		int toplam=0;
		int i;
		int[] numbers = {3,4,5,7,8,9,10};
		 
		int[] numbers2 = new int[numbers.length];
		
        for(i=0 ;i<numbers.length ; i++ ) {
			
			numbers2[i] =numbers[i];
			System.out.println(numbers2[i]);
			
		}
	}

}
