/**
 * 
 */
package demo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author P.Dhamanaskar
 *
 */
@AllArgsConstructor
@Data
public class Customer {
	
	private String name;
	private int age;
	private String city;
	private boolean isFTE;
	private String dob;
	
}
