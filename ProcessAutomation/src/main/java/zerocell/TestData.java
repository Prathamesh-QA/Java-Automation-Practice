/**
 * 
 */
package zerocell;

import java.time.LocalDate;

import com.creditdatamw.zerocell.annotation.Column;

import utils.enums.BrowserType;

/**
 * @author P.Dhamanaskar
 *
 */
public class TestData {
	
	//POJO
	@Column(name = "testcase",index = 0)	
	private String testcase;
	
	@Column(name = "browser",index = 1,converterClass = StringToBrowserTypeConverter.class)
	private BrowserType browser;
	
	@Column(name = "firstName",index = 2)
	private String firstName;
	
	@Column(name="password",index = 3)
	private String password;
	
	@Column(name = "isFTE",index = 4,converterClass = StringToBooleanConverter.class)
	private boolean isFTE;
	
	@Column(name = "age",index = 5,converterClass = StringToIntegerConverter.class)
	private int age;
	
	@Column(name = "date",index = 6,converterClass = StringToLocalDateConverter.class)
	private LocalDate date;
	
	@Column(name = "phoneNumber",index = 7,converterClass = PhoneNumberProcessor.class)
	private String phoneNumber;
	
	public String getTestcase() {
		return testcase;
	}

	public BrowserType getBrowser() {
		return browser;
	}

	public String getFirstName() {
		return firstName;
	}

	public boolean isFTE() {
		return isFTE;
	}

	public int getAge() {
		return age;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "TestData [testcase=" + testcase + ", browser=" + browser + ", firstName=" + firstName + ", password="
				+ password + ", isFTE=" + isFTE + ", age=" + age + ", date=" + date + ", phoneNumber=" + phoneNumber
				+ "]";
	}
	
	
}
