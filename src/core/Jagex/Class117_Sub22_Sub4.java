package core.Jagex;
public class Class117_Sub22_Sub4 extends Class117_Sub22 {

	static Class106 aClass106_2174;
	public static final int anInt2175 = 125;
	static final int anInt2176 = 8;
	static String aString2177;
	static int[] anIntArray2178;
	public boolean aBool2179 = false;
	static Class115 aClass115_2173 = new Class115(64);

	void method2373(Class117_Sub14 var1, int var2) {
		while (true) {
			int var3 = var1.method2010(-1439707937);
			if (var3 == 0) {
				return;
			}

			method2375(var1, var3, (byte) 67);
		}
	}

	void method2375(Class117_Sub14 var1, int var2, byte var3) {
		if (var2 == 2) {
			if (var3 <= 8) {
				return;
			}

			aBool2179 = true;
		}

	}

	static void method2377(Class117_Sub14 var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
		int var8;
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			Class31.aByteArrayArrayArray401[var1][var2][var3] = 0;

			while (true) {
				var8 = var0.method2010(-1439707937);
				if (var8 == 0) {
					if (var1 == 0) {
						Class31.anIntArrayArrayArray381[0][var2][var3] = -Class61.method923(932731 + var2 + var4, 556238 + var3 + var5, 256041678) * 8;
					} else {
						Class31.anIntArrayArrayArray381[var1][var2][var3] = Class31.anIntArrayArrayArray381[var1 - 1][var2][var3] - 240;
					}
					break;
				}

				if (var8 == 1) {
					int var9 = var0.method2010(-1439707937);
					if (var9 == 1) {
						var9 = 0;
					}

					if (var1 == 0) {
						Class31.anIntArrayArrayArray381[0][var2][var3] = -var9 * 8;
					} else {
						Class31.anIntArrayArrayArray381[var1][var2][var3] = Class31.anIntArrayArrayArray381[var1 - 1][var2][var3] - var9 * 8;
					}
					break;
				}

				if (var8 <= 49) {
					Class31.aByteArrayArrayArray382[var1][var2][var3] = var0.method1997(267333703);
					Class28.aByteArrayArrayArray347[var1][var2][var3] = (byte) ((var8 - 2) / 4);
					Class31.aByteArrayArrayArray383[var1][var2][var3] = (byte) (var8 - 2 + var6 & 3);
				} else if (var8 <= 81) {
					Class31.aByteArrayArrayArray401[var1][var2][var3] = (byte) (var8 - 49);
				} else {
					Class99.aByteArrayArrayArray1138[var1][var2][var3] = (byte) (var8 - 81);
				}
			}
		} else {
			while (true) {
				var8 = var0.method2010(-1439707937);
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					var0.method2010(-1439707937);
					break;
				}

				if (var8 <= 49) {
					var0.method2010(-1439707937);
				}
			}
		}

	}

	public static void method2385(int var0, byte var1) {
		Class75.anInt898 = var0 * 413953979;
	}

	public static Class117_Sub22_Sub15 method2386(int var0, int var1) {
		Class117_Sub22_Sub15 var2 = (Class117_Sub22_Sub15) Class117_Sub22_Sub15.aClass115_2448.method1515((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Class117_Sub22_Sub15.aClass106_2446.method1380(16, var0, (byte) 50);
			var2 = new Class117_Sub22_Sub15();
			if (var3 != null) {
				var2.method2835(new Class117_Sub14(var3), 1876105091);
			}

			Class117_Sub22_Sub15.aClass115_2448.method1517(var2, (long) var0);
			return var2;
		}
	}

	static Class117_Sub22_Sub7 method2387(int var0, int var1, int var2) {
		Class1 var3 = (Class1) Class35.aMap440.get(Integer.valueOf(var0));
		return var3.method46(var1, (byte) 119);
	}

}
