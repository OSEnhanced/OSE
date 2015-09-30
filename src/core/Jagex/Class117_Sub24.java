package core.Jagex;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class117_Sub24 extends Class117 {

	public int[] anIntArray2135;
	public int anInt2136;
	public int[] anIntArray2137;
	public int[] anIntArray2138;
	public Method[] aMethodArray2139;
	public Field[] aFieldArray2140;
	public int anInt2141;
	public byte[][][] aByteArrayArrayArray2142;

	public static int method2341(int var0, int var1) {
		int var2 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var2 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var2 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var2 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var2 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var2;
		}

		return var0 + var2;
	}

	public static void method2342(int var0) {
		if (Class96.aClass81_1125 != null) {
			Class96.aClass81_1125.method1088((byte) 0);
		}

	}

}
