/**
 * 
 */
package jpMorganTradeImple;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author mohit
 * 
 */
public class TradeItem {

	public java.util.Date instructionSettlementDate(String settlementDate,
			String currencyCode) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy");
		java.util.Date date = dateFormat.parse(settlementDate.replaceAll(" ",
				"/"));
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		if (currencyCode.equalsIgnoreCase("AED")
				|| currencyCode.equalsIgnoreCase("SAR")) {
			if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
				calendar.add(Calendar.DATE, 2);
			} else if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
				calendar.add(Calendar.DATE, 1);
			} else {
				calendar.add(Calendar.DATE, 0);
			}
		}

		else {
			if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
				calendar.add(Calendar.DATE, 2);
			} else if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				calendar.add(Calendar.DATE, 1);
			} else {
				calendar.add(Calendar.DATE, 0);
			}
		}

		return calendar.getTime();

	}

}
