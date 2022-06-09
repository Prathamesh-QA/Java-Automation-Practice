package demo;

public class LombokBuilderTest {

	public static void main(String[] args) {
		
		User u1 = User.builder()
					.name("Hasha")
						.age(52)
							.build();
		System.out.println(u1.getName() + " " + u1.getAge());
		
	}

}
