package core.Jagex;
public class Class63 {

	static long aLong774;
	static int anInt775;
	static long aLong776;
	static int[][] anIntArrayArray777;

	Class63() throws Throwable {
		throw new Error();
	}

	public static Class117_Sub22_Sub13 method928(int var0, int var1) {
		Class117_Sub22_Sub13 var2 = (Class117_Sub22_Sub13) Class117_Sub22_Sub13.aClass115_2378.method1515((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Class144.aClass106_1649.method1380(6, var0, (byte) 16);
			var2 = new Class117_Sub22_Sub13();
			var2.anInt2380 = var0 * -348452715;
			if (var3 != null) {
				var2.method2592(new Class117_Sub14(var3), (short) 8369);
			}

			var2.method2612(1940368121);
			if (var2.aBool2385) {
				var2.anInt2355 = 0;
				var2.aBool2364 = false;
			}

			Class117_Sub22_Sub13.aClass115_2378.method1517(var2, (long) var0);
			return var2;
		}
	}

	static void method929(Class117_Sub19 var0, int var1, int var2, boolean var3, int var4) {
		int var5 = var0.anInt1988 * 1854643179;
		int var6 = var0.anInt1989 * 2747837;
		if (var0.anInt1980 * -935238725 == 0) {
			var0.anInt1988 = var0.anInt1984 * 1158680639;
		} else if (var0.anInt1980 * -935238725 == 1) {
			var0.anInt1988 = (var1 - var0.anInt1984 * 63573717) * 1465234627;
		} else if (var0.anInt1980 * -935238725 == 2) {
			var0.anInt1988 = (var1 * var0.anInt1984 * 63573717 >> 14) * 1465234627;
		}

		if (var0.anInt1981 * 1207349149 == 0) {
			var0.anInt1989 = var0.anInt1985 * -272701501;
		} else if (var0.anInt1981 * 1207349149 == 1) {
			var0.anInt1989 = (var2 - var0.anInt1985 * -625237513) * -1616202347;
		} else if (var0.anInt1981 * 1207349149 == 2) {
			var0.anInt1989 = (var2 * var0.anInt1985 * -625237513 >> 14) * -1616202347;
		}

		if (var0.anInt1980 * -935238725 == 4) {
			var0.anInt1988 = var0.anInt1990 * -1344942583 * var0.anInt1989 * 2747837 / (var0.anInt1991 * -961798703) * 1465234627;
		}

		if (var0.anInt1981 * 1207349149 == 4) {
			var0.anInt1989 = var0.anInt1991 * -961798703 * var0.anInt1988 * 1854643179 / (var0.anInt1990 * -1344942583) * -1616202347;
		}

		if (GameClient.aBool3072 && var0.anInt1975 * 657737235 == 0) {
			if (var0.anInt1989 * 2747837 < 5 && var0.anInt1988 * 1854643179 < 5) {
				var0.anInt1989 = 508922857;
				var0.anInt1988 = -1263761457;
			} else {
				if (var0.anInt1989 * 2747837 <= 0) {
					var0.anInt1989 = 508922857;
				}

				if (var0.anInt1988 * 1854643179 <= 0) {
					var0.anInt1988 = -1263761457;
				}
			}
		}

		if (var0.anInt2018 * 2064823433 == 1337) {
			GameClient.aClass117_Sub19_3091 = var0;
		}

		if (var3 && var0.anObjectArray1977 != null && (var5 != var0.anInt1988 * 1854643179 || var0.anInt1989 * 2747837 != var6)) {
			Class117_Sub7 var7 = new Class117_Sub7();
			var7.aClass117_Sub19_1780 = var0;
			var7.anObjectArray1786 = var0.anObjectArray1977;
			GameClient.aClass120_3118.method1575(var7);
		}

	}

	public static int method930(CharSequence var0, int var1) {
		int var2 = var0.length();
		int var4 = 0;

		for (int var3 = 0; var3 < var2; var3++) {
			var4 = (var4 << 5) - var4 + var0.charAt(var3);
		}

		return var4;
	}

	static void method931(Class117_Sub22_Sub17_Sub2 var0, int var1) {
		short var2 = 256;

		int var3;
		for (var3 = 0; var3 < Class3.anIntArray30.length; var3++) {
			Class3.anIntArray30[var3] = 0;
		}

		int var4;
		for (var3 = 0; var3 < 5000; var3++) {
			var4 = (int) (Math.random() * 128.0D * (double) var2);
			Class3.anIntArray30[var4] = (int) (Math.random() * 256.0D);
		}

		int var5;
		int var6;
		for (var3 = 0; var3 < 20; var3++) {
			for (var4 = 1; var4 < var2 - 1; var4++) {
				for (var5 = 1; var5 < 127; var5++) {
					var6 = (var4 << 7) + var5;
					Class117_Sub10.anIntArray1830[var6] = (Class3.anIntArray30[1 + var6] + Class3.anIntArray30[var6 - 1] + Class3.anIntArray30[var6 - 128] + Class3.anIntArray30[128 + var6]) / 4;
				}
			}

			int[] var9 = Class3.anIntArray30;
			Class3.anIntArray30 = Class117_Sub10.anIntArray1830;
			Class117_Sub10.anIntArray1830 = var9;
		}

		if (var0 != null) {
			var3 = 0;

			for (var4 = 0; var4 < var0.anInt2705; var4++) {
				for (var5 = 0; var5 < var0.anInt2707; var5++) {
					if (var0.aByteArray2703[var3++] != 0) {
						var6 = var0.anInt2706 + var5 + 16;
						int var8 = 16 + var4 + var0.anInt2708;
						int var7 = (var8 << 7) + var6;
						Class3.anIntArray30[var7] = 0;
					}
				}
			}
		}

	}

}
