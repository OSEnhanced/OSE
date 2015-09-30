package core.Jagex;
import java.util.Comparator;

final class Class44 implements Comparator {

	static final int anInt590 = 3;
	static final int anInt591 = 1003;
	public static final int anInt592 = 223;
	static int anInt593;
	static final int anInt594 = 15;
	public static final int anInt595 = 116;
	public static Class106 aClass106_596;
	static final int anInt597 = 58;
	// $FF: synthetic field
	boolean val$preferOwnWorld;

	int method728(Class133 var1, Class133 var2, byte var3) {
		if (var1.anInt1601 * 2081643803 == var2.anInt1601 * 2081643803) {
			return 0;
		} else {
			if (val$preferOwnWorld) {
				if (var1.anInt1601 * 2081643803 == GameClient.anInt2916 * 622074983) {
					return -1;
				}

				if (var2.anInt1601 * 2081643803 == GameClient.anInt2916 * 622074983) {
					return 1;
				}
			}

			return var1.anInt1601 * 2081643803 < var2.anInt1601 * 2081643803 ? -1 : 1;
		}
	}

	Class44(boolean var1) {
		val$preferOwnWorld = var1;
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	static int method729(int var0, int var1, int var2, int var3) {
		int var4 = var0 >> 7;
		int var7 = var1 >> 7;
		if (var4 >= 0 && var7 >= 0 && var4 <= 103 && var7 <= 103) {
			int var6 = var2;
			if (var2 < 3 && (Class31.aByteArrayArrayArray401[1][var4][var7] & 2) == 2) {
				var6 = var2 + 1;
			}

			int var10 = var0 & 127;
			int var5 = var1 & 127;
			int var8 = var10 * Class31.anIntArrayArrayArray381[var6][var4 + 1][var7] + Class31.anIntArrayArrayArray381[var6][var4][var7] * (128 - var10) >> 7;
			int var9 = (128 - var10) * Class31.anIntArrayArrayArray381[var6][var4][1 + var7] + var10 * Class31.anIntArrayArrayArray381[var6][1 + var4][1 + var7] >> 7;
			return (128 - var5) * var8 + var9 * var5 >> 7;
		} else {
			return 0;
		}
	}

	public int compare(Object var1, Object var2) {
		return method728((Class133) var1, (Class133) var2, (byte) 17);
	}

	static String method736(int var0, int var1) {
		return "<img=" + var0 + ">";
	}

}
