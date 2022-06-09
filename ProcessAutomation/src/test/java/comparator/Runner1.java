package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner1 {

	public static void main(String[] args) {
		
		
		List<Laptop> laptops = new ArrayList<Laptop>();	
		laptops.add(new Laptop("Mac Air", 12, 3750));
		laptops.add(new Laptop("Dell", 16, 2300));
		laptops.add(new Laptop("Acer", 8, 1500));
		
		Comparator<Laptop> comp = new Comparator<Laptop>() {

			@Override
			public int compare(Laptop l1, Laptop l2) {
				if(l1.getPrize() < l2.getPrize()) {
					return 1;
				}else {
					return -1;
				}
			}
		};
		
		Collections.sort(laptops,comp);
		
		for(Laptop lap : laptops) {
			System.out.println(lap);
		}

	}

}
