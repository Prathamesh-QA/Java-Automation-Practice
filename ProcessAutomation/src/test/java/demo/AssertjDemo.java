package demo;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.testng.annotations.Test;

public class AssertjDemo {

	
	@Test
	public void stringTest() {
		String temp = "Hello World";
		
		Assertions.assertThat(temp)
					.as("Entity is Null").isNotNull()
					.isNotBlank()
					.isEqualTo("Hello World")
					.contains("Hello")
					.doesNotContain("Earth")
					.containsWhitespaces();
		
		
	}
	
	@Test
	public void numberTest() {
		int value = 10;
		
		Assertions.assertThat(value)
					.as("Value is not 10").isEqualTo(10)
					.isCloseTo(14, Offset.offset(2));
	}

}
