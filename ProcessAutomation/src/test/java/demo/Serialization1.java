package demo;

import java.util.ArrayList;
import java.util.List;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;

public class Serialization1 {

	public static void main(String[] args) {

		//Employee Objects
		//Template Creation  -> Now create multiple instances of same template
		List<String> roles = new ArrayList<String>();
		roles.add("Manager");
		List<String> roles1 = new ArrayList<String>();
		roles1.add("Tester");
		
		//Create Template
		Fixture.of(Employee.class).addTemplate("valid",new Rule() {{
			add("id", random(Integer.class, range(100, 1000)));
			add("firstName", random("Amuthan","Naveen","Raghav","Maged"));
			add("isFTE", uniqueRandom(true,false));
			add("address", random(new Address("Baker St","Chennai",435223),new Address("Highland Street","Bangalore",829542)));
			add("roles", uniqueRandom(roles,roles1));
		}});
		
		List<Employee> validEmp = Fixture.from(Employee.class).gimme(10, "valid");
		validEmp.forEach(System.out::println);
		

	}

}
