/**
 * 
 */
package zerocell;

import java.io.File;
import java.util.List;

import com.creditdatamw.zerocell.Reader;

/**
 * @author P.Dhamanaskar
 *
 */
public final class ExcelReader {
	
	
	private ExcelReader() {}
	
	private static List<TestData> testData;
	
	
	public static List<TestData> getTestData() {
		return testData;
	}


	static {
		testData = Reader
				.of(TestData.class)
				.from(new File("testdata.xlsx"))
				.sheet("UI-DATA")
				.skipHeaderRow(true).list();
		
	}

}
