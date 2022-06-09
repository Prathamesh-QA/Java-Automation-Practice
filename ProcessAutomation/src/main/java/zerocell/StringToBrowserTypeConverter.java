/**
 * 
 */
package zerocell;

import com.creditdatamw.zerocell.converter.Converter;

import utils.enums.BrowserType;

/**
 * @author P.Dhamanaskar
 *
 */
public class StringToBrowserTypeConverter implements Converter<BrowserType>{

	@Override
	public BrowserType convert(String value, String columnName, int row) {
		return BrowserType.valueOf(value.toUpperCase());
	}
	
	
	
	

}
