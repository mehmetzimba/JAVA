import java.util.ArrayList;
import java.util.stream.Stream;

public class Driver {
public static void main(String[] args) {
ArrayList<String> arrayList  = new ArrayList<>();
arrayList.add("İstanbul");
arrayList.add("Ankara");
arrayList.add("Adana");
arrayList.add("Bursa");
arrayList.add("İzmir");



arrayList.stream() // arrayList üzerinden stream oluşturduk

.filter((s)-> s.startsWith("İ")) // stream üzerine i ile başlayan filtre uyguladık
.map((s)-> s.toUpperCase()) // filtreden dönen değerlerin büyük harfe çevirimi
.sorted((s1,s2)->s1.compareTo(s2))  // sıralaması
.forEach(System.out::println) // yazdırımı
;
}
}
