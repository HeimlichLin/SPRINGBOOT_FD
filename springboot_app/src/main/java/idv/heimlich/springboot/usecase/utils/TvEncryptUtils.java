package idv.heimlich.springboot.usecase.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import idv.heimlich.springboot.adapter.utils.B64Hash.TvEncrypt;

public class TvEncryptUtils {

	private static final Logger logger = LoggerFactory.getLogger(TvEncryptUtils.class);

	public static boolean decodeable(String value) {
		try {
			TvEncrypt.decode(URLDecoder.decode(value, "UTF-8"));
			return Boolean.TRUE;
		} catch (final UnsupportedEncodingException e) {
			logger.error(e.getMessage(), e);
		}
		return Boolean.FALSE;
	}

	public static String decode(String value) {
		try {
			return TvEncrypt.decode(URLDecoder.decode(value, "UTF-8"));
		} catch (final UnsupportedEncodingException e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}

	public static String encode(String value) {
		try {
			return TvEncrypt.encode(URLDecoder.decode(value, "UTF-8"));
		} catch (final UnsupportedEncodingException e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}

}
