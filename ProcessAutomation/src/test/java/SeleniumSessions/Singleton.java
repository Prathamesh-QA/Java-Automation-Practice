package SeleniumSessions;

public class Singleton {
	
	
	/* In OOPs Singleton class is a special class which can have  only 1 object/instance of a class at a time
	 * If we are trying to create another object it will be pointing to the same object
	 * 
	 * How to Design Singleton Class
	 * 1. Constructor of Class should be private
	 * 2. Write a public static method that has written type object of this singleton class(Lazy Initialization)
	 * 3. Difference betn class and Singleton Class : Normal class can be instantiated through Constructor wheras
	 *    for singleton class we use getInstance public static method to instantiate
	 */
	
	private static Singleton singletonReference = null;
	public String str;
	
	private Singleton() {
		str = "Hey, I am using Singleton Class Pattern";
	}
	
	public static Singleton getInstance() {
		if(singletonReference == null) 
			singletonReference = new Singleton();
		return singletonReference;
	}
	

	public static void main(String[] args) {

		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		
		x.str = (x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		y.str = (y.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
	}

}
