package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		List<Laptop> laptops = new ArrayList<Laptop>();	
		laptops.add(new Laptop("Mac Air", 12, 3750));
		laptops.add(new Laptop("Dell", 16, 2300));
		laptops.add(new Laptop("Acer", 8, 1500));
		
		Collections.sort(laptops);
		
		for(Laptop lap : laptops) {
			System.out.println(lap);
		}

	}

}
