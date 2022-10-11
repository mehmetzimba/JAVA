import java.util.Iterator;

public class Ogrenci implements Iterable<Integer>{
private String isim;
private int[] notlar;
private int index=0;

public Ogrenci() {
	
}

public Ogrenci(String isim,int[] notlar) {
	this.isim=isim;
	this.notlar=notlar;
}

public String getIsim() {
	return isim;
}
public int[] getNotlar() {
	return notlar;
}
public void setIsim(String isim) {
	this.isim = isim;
}
public void setNotlar(int[] notlar) {
	this.notlar = notlar;
}

@Override
public Iterator<Integer> iterator() {
	// TODO Auto-generated method stub
	return new Iterator<Integer>() {

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return index<notlar.length;
		}

		@Override
		public Integer next() {
			// TODO Auto-generated method stub
			return notlar[index++];
		}
	};
}


}
