package idv.heimlich.springboot.usecase.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class YYYYMMDDUtils {

	protected static final SimpleDateFormat SDF = new SimpleDateFormat("yyyyMMdd");

	public static String getText(Date date) {
		try {
			return SDF.format(date);
		} catch (final Exception e) {
			return null;
		}

	}

	public static String getText() {
		return getText(new Date());
	}

	public static Date parse(String yyyymmdd) {
		try {
			return SDF.parse(yyyymmdd);
		} catch (final ParseException var2) {
			return null;
		}
	}

}
