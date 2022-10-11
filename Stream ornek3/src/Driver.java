import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Driver {
public static void main(String[] args) {
	
	Stream.of(1,4,5,6,7)
	.filter(new Predicate<Integer>() {
	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		System.out.println("test");
		return t>2;
	}
	
	
	})
	.forEach(new Consumer<Integer>() {
		
		
		@Override
		public void accept(Integer t) {
			// TODO Auto-generated method stub
			System.out.println("accept");
			System.out.println(t);
		}
		
		
		
	});
	
	
	
}
}
