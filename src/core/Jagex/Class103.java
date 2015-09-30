package core.Jagex;
public class Class103 {

	static final int anInt1158 = 0;
	static final int anInt1159 = 500000;
	static final int anInt1162 = 3;
	static final int anInt1163 = 1;
	static final int anInt1164 = 2;
	Class117_Sub14 aClass117_Sub14_1154 = new Class117_Sub14((byte[]) null);
	long aLong1160;
	int[] anIntArray1165;
	int[] anIntArray1155;
	int[] anIntArray1156;
	int[] anIntArray1157;
	int anInt1152;
	static byte[] aByteArray1161 = new byte[]{(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
	int anInt1153;

	Class103(byte[] var1) {
		method1345(var1);
	}

	void method1300(long var1) {
		aLong1160 = var1;
		int var4 = anIntArray1155.length;

		for (int var3 = 0; var3 < var4; var3++) {
			anIntArray1156[var3] = 0;
			anIntArray1157[var3] = 0;
			aClass117_Sub14_1154.anInt1880 = anIntArray1165[var3] * -2079217519;
			method1321(var3);
			anIntArray1155[var3] = aClass117_Sub14_1154.anInt1880 * 561453169;
		}

	}

	void method1301() {
		aClass117_Sub14_1154.aByteArray1885 = null;
		anIntArray1165 = null;
		anIntArray1155 = null;
		anIntArray1156 = null;
		anIntArray1157 = null;
	}

	int method1303() {
		return anIntArray1155.length;
	}

	void method1305(int var1) {
		anIntArray1155[var1] = aClass117_Sub14_1154.anInt1880 * 561453169;
	}

	void method1306() {
		aClass117_Sub14_1154.anInt1880 = 2079217519;
	}

	int method1308(int var1) {
		int var2 = method1309(var1);
		return var2;
	}

	int method1309(int var1) {
		byte var2 = aClass117_Sub14_1154.aByteArray1885[aClass117_Sub14_1154.anInt1880 * 561453169];
		int var5;
		if (var2 < 0) {
			var5 = var2 & 255;
			anIntArray1157[var1] = var5;
			aClass117_Sub14_1154.anInt1880 -= 2079217519;
		} else {
			var5 = anIntArray1157[var1];
		}

		if (var5 != 240 && var5 != 247) {
			return method1329(var1, var5);
		} else {
			int var4 = aClass117_Sub14_1154.method2127(1766623526);
			if (var5 == 247 && var4 > 0) {
				int var3 = aClass117_Sub14_1154.aByteArray1885[aClass117_Sub14_1154.anInt1880 * 561453169] & 255;
				if (var3 >= 241 && var3 <= 243 || var3 == 246 || var3 == 248 || var3 >= 250 && var3 <= 252 || var3 == 254) {
					aClass117_Sub14_1154.anInt1880 -= 2079217519;
					anIntArray1157[var1] = var3;
					return method1329(var1, var3);
				}
			}

			aClass117_Sub14_1154.anInt1880 += var4 * -2079217519;
			return 0;
		}
	}

	long method1311(int var1) {
		return aLong1160 + (long) var1 * (long) anInt1152;
	}

	Class103() {
	}

	boolean method1312() {
		int var1 = anIntArray1155.length;

		for (int var2 = 0; var2 < var1; var2++) {
			if (anIntArray1155[var2] >= 0) {
				return false;
			}
		}

		return true;
	}

	void method1314(int var1) {
		aClass117_Sub14_1154.anInt1880 = anIntArray1155[var1] * -2079217519;
	}

	int method1318() {
		int var1 = anIntArray1155.length;
		int var2 = -1;
		int var4 = Integer.MAX_VALUE;

		for (int var3 = 0; var3 < var1; var3++) {
			if (anIntArray1155[var3] >= 0 && anIntArray1156[var3] < var4) {
				var2 = var3;
				var4 = anIntArray1156[var3];
			}
		}

		return var2;
	}

	void method1321(int var1) {
		int var2 = aClass117_Sub14_1154.method2127(962486364);
		anIntArray1156[var1] += var2;
	}

	int method1329(int var1, int var2) {
		int var3;
		if (var2 == 255) {
			int var7 = aClass117_Sub14_1154.method2010(-1439707937);
			var3 = aClass117_Sub14_1154.method2127(-1287960926);
			if (var7 == 47) {
				aClass117_Sub14_1154.anInt1880 += var3 * -2079217519;
				return 1;
			} else if (var7 == 81) {
				int var5 = aClass117_Sub14_1154.method2014(1866494386);
				var3 -= 3;
				int var6 = anIntArray1156[var1];
				aLong1160 += (long) var6 * (long) (anInt1152 - var5);
				anInt1152 = var5;
				aClass117_Sub14_1154.anInt1880 += var3 * -2079217519;
				return 2;
			} else {
				aClass117_Sub14_1154.anInt1880 += var3 * -2079217519;
				return 3;
			}
		} else {
			byte var4 = aByteArray1161[var2 - 128];
			var3 = var2;
			if (var4 >= 1) {
				var3 = var2 | aClass117_Sub14_1154.method2010(-1439707937) << 8;
			}

			if (var4 >= 2) {
				var3 |= aClass117_Sub14_1154.method2010(-1439707937) << 16;
			}

			return var3;
		}
	}

	boolean method1338() {
		return aClass117_Sub14_1154.aByteArray1885 != null;
	}

	void method1345(byte[] var1) {
		aClass117_Sub14_1154.aByteArray1885 = var1;
		aClass117_Sub14_1154.anInt1880 = 682661290;
		int var2 = aClass117_Sub14_1154.method2012(1053511631);
		anInt1153 = aClass117_Sub14_1154.method2012(1053511631);
		anInt1152 = 500000;
		anIntArray1165 = new int[var2];

		int var3;
		int var5;
		for (var3 = 0; var3 < var2; aClass117_Sub14_1154.anInt1880 += var5 * -2079217519) {
			int var4 = aClass117_Sub14_1154.method2015((byte) 104);
			var5 = aClass117_Sub14_1154.method2015((byte) 49);
			if (var4 == 1297379947) {
				anIntArray1165[var3] = aClass117_Sub14_1154.anInt1880 * 561453169;
				++var3;
			}
		}

		aLong1160 = 0L;
		anIntArray1155 = new int[var2];

		for (var3 = 0; var3 < var2; var3++) {
			anIntArray1155[var3] = anIntArray1165[var3];
		}

		anIntArray1156 = new int[var2];
		anIntArray1157 = new int[var2];
	}

}
