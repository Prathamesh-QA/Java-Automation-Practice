/**
 * 
 */
package zerocell;
import java.time.LocalDate;

import com.creditdatamw.zerocell.converter.Converter;
/**
 * @author P.Dhamanaskar
 *
 */
public class StringToLocalDateConverter implements Converter<LocalDate>{

	@Override
	public LocalDate convert(String value, String columnName, int row) {
		//write the logic here using date time formater
		return LocalDate.now();
	}

}
