package demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Address {
	
	private String street;
	private String city;
	private int pincode;

}
