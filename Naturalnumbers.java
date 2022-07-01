import java.util.ArrayList;

public class Naturalnumbers {

	public static void main (String[]args) {
		ArrayList<Integer>numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(50);
		numbers.add(80);
		numbers.add(100);
		numbers.add(20);
		//for(int i=0;i<numbers.size();i++) {
		//System.out.println(numbers.get(i));
	for(Integer i: numbers) {
		System.out.println(i);
	
	}
	
	}
}
