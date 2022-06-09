/**
 * 
 */
package zerocell;

import com.creditdatamw.zerocell.converter.Converter;

/**
 * @author P.Dhamanaskar
 *
 */
public class StringToIntegerConverter implements Converter<Integer>{

	@Override
	public Integer convert(String value, String columnName, int row) {
		return Integer.parseInt(value);
	}
	
	

}
