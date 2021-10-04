package idv.heimlich.springboot.usecase.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import idv.heimlich.springboot.entity.commons.exception.PclmsBusinessExecpetion;

public class DateUtlis {

	final static public String YYYY_MM_DD_HH_MM_SS = "yyyy/MM/dd HH:mm:ss";
	final static public String YYYMMDD = "yyyyMMdd";

	public static String getText() {
		return getText(YYYY_MM_DD_HH_MM_SS, new Date());
	}

	public static String getText(String format, Date date) {
		if (date == null) {
			return "";
		}
		final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		return simpleDateFormat.format(date);
	}

	public static Date parse(String yyyymmdd) {
		return parse("yyyy/MM/dd", yyyymmdd);
	}

	public static Date parse(String format, String yyyymmdd) {
		try {
			final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
			return simpleDateFormat.parse(yyyymmdd);
		} catch (final ParseException var2) {
			throw new PclmsBusinessExecpetion("日期格式錯誤:" + yyyymmdd);
		}
	}

	/**
	 * 取得今天日期
	 */
	public static String today() {
		final SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyyMMdd");
		final Date date = new Date();
		return sdf.format(date);
	}

}
