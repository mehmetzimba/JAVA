package encapsulation;

public class Ogrenci {

	public int numara;
	public String ad;
	public String soyad;
	private int yas ; //yas değerinin değerini - olmasın diye private yapptık
	public void setYas(int y) {
			if(y>= 0) {
				yas=y;
				
			}else
				System.out.println("yas değeri 0 olamaz");
	}
	public void bilgileriYazdır() {
		
		System.out.println("ad" +ad);
		System.out.println("soyad"+soyad);
		System.out.println("numara"+numara);
		System.out.println("yas"+yas);
	}
}
