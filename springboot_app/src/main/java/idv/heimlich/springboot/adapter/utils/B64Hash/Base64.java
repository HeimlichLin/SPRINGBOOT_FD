package idv.heimlich.springboot.adapter.utils.B64Hash;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

@SuppressWarnings("restriction")
public class Base64 {

	public static byte[] decode(String src) {
		try {
			return (new BASE64Decoder()).decodeBuffer(src);
		} catch (final Exception var2) {
			return src.getBytes();
		}
	}

	public static String encode(byte[] src) {
		return (new BASE64Encoder()).encode(src);
	}

	public static void main(String[] args) {
		new Base64();
	}

}
