/**
 * 
 */
package zerocell;

import com.creditdatamw.zerocell.converter.Converter;

/**
 * @author P.Dhamanaskar
 *
 */
public class PhoneNumberProcessor implements Converter<String>{

	@Override
	public String convert(String value, String columnName, int row) {
		return value.startsWith("+91")?value:"+91"+ value;
	}

}
