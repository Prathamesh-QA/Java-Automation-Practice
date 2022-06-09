package comparator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Laptop implements Comparable<Laptop>{
	
	private String brand;
	private int ramSize;
	private int prize;
	
	
	@Override
	public int compareTo(Laptop l1) {
		if(this.getRamSize() < l1.ramSize) {
			return 1;
		}else {
			return -1;
		}
	}

}
