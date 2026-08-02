package CollectionsExamples;

import java.util.ArrayList;
import java.util.List;

public class CollectionExamples {

	public static void main(String[] args) {
		
		
		// Given range 1-100 do divisible by 3 or 7 . Print the numbers which are divisible by 7
		List<Integer> list = new ArrayList<>();
		for (int i=1; i<=100;i++) {
			if (i % 3 == 0 || i % 7 == 0) {
				list.add(i);
			}
		}
		for (int n : list) {
			if (String.valueOf(n).contains("7")) {
				System.out.println("The numbers from 1 to 100 which are divisible by 7");
				System.out.println(n);
			}
		}

	}

}
