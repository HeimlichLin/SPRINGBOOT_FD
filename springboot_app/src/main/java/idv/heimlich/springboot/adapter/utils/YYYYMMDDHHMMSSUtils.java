package idv.heimlich.springboot.adapter.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import idv.heimlich.springboot.entity.commons.exception.PclmsBusinessExecpetion;

public class YYYYMMDDHHMMSSUtils {

	protected static final SimpleDateFormat SDF = new SimpleDateFormat("yyyyMMddhhmmss");

	public static String getText(Date date) {
		return SDF.format(date);
	}

	public static String getText() {
		return getText(new Date());
	}

	public static Date parse(String yyyyMMddmmss) {
		try {
			return SDF.parse(yyyyMMddmmss);
		} catch (final ParseException var2) {
			throw new PclmsBusinessExecpetion("日期格式錯誤:" + yyyyMMddmmss);
		}
	}

}
