package idv.heimlich.springboot.adapter.utils.B64Hash;

import java.util.Random;

public class TvEncrypt {

	public static String decode(String source) {
		if (source.length() == 0) {
			return "";
		} else {
			int insertNumber = source.length() / 4;
			if (source.length() % 4 != 0) {
				++insertNumber;
			}
			StringBuffer sb = new StringBuffer(source);
			for (int i = insertNumber - 1; i >= 0; --i) {
				sb = sb.deleteCharAt(4 * i);
			}

			final String s = new String(Base64.decode(sb.toString()));
			return s;
		}
	}

	public static String encode(String source) {
		if (source.length() == 0) {
			return "";
		} else {
			final String s = Base64.encode(source.getBytes());

			int insertNumber = s.length() / 3;
			if (s.length() % 3 != 0) {
				++insertNumber;
			}
			final StringBuffer sb = new StringBuffer(s);
			final Random random = new Random(System.currentTimeMillis());
			for (int i = 0; i < insertNumber; ++i) {
				final int Number = random.nextInt(26);
				final char c = (char) (Number + 65);
				sb.insert(4 * i, c);
			}

			return sb.toString();
		}
	}

}
