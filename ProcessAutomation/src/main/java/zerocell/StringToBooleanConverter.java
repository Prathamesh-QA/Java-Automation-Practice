/**
 * 
 */
package zerocell;

import com.creditdatamw.zerocell.converter.Converter;

/**
 * @author P.Dhamanaskar
 *
 */
public class StringToBooleanConverter implements Converter<Boolean>{

	@Override
	public Boolean convert(String value, String columnName, int row) {
		return value.equalsIgnoreCase("true");
	}
	
}
