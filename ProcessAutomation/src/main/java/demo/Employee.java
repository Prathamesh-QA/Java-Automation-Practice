package demo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Employee {
	
	private int id;
	private String firstName;
	private boolean isFTE;
	private Address address;
	private List<String> roles;
	

}
