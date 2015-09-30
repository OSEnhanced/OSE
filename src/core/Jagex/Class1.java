package core.Jagex;
public class Class1 {

	static int[] anIntArray2;
	public static final int anInt4 = 119;
	static final int anInt5 = 26;
	static final int anInt6 = 100;
	static final int anInt7 = 14;
	public static final int anInt8 = 172;
	Class117_Sub22_Sub7[] aClass117_Sub22_Sub7Array1 = new Class117_Sub22_Sub7[100];
	int anInt3;

	Class117_Sub22_Sub7 method43(int var1, String var2, String var3, String var4, int var5) {
		Class117_Sub22_Sub7 var6 = aClass117_Sub22_Sub7Array1[99];

		for (int var7 = anInt3 * -1441038767; var7 > 0; --var7) {
			if (var7 != 100) {
				aClass117_Sub22_Sub7Array1[var7] = aClass117_Sub22_Sub7Array1[var7 - 1];
			}
		}

		if (var6 == null) {
			var6 = new Class117_Sub22_Sub7(var1, var2, var4, var3);
		} else {
			var6.method1532();
			var6.method2339();
			var6.method2469(var1, var2, var4, var3, 2033533639);
		}

		aClass117_Sub22_Sub7Array1[0] = var6;
		if (anInt3 * -1441038767 < 100) {
			anInt3 += 721849009;
		}

		return var6;
	}

	int method45(int var1) {
		return anInt3 * -1441038767;
	}

	Class117_Sub22_Sub7 method46(int var1, byte var2) {
		return var1 >= 0 && var1 < anInt3 * -1441038767 ? aClass117_Sub22_Sub7Array1[var1] : null;
	}

	static Class117_Sub22_Sub17_Sub3[] method52(byte var0) {
		Class117_Sub22_Sub17_Sub3[] var1 = new Class117_Sub22_Sub17_Sub3[Class13.anInt152 * -764616363];

		for (int var3 = 0; var3 < Class13.anInt152 * -764616363; var3++) {
			Class117_Sub22_Sub17_Sub3 var2 = var1[var3] = new Class117_Sub22_Sub17_Sub3();
			var2.anInt2715 = Class13.anInt145 * -1559182453;
			var2.anInt2720 = Class13.anInt146 * -1301976433;
			var2.anInt2714 = Class98.anIntArray1133[var3];
			var2.anInt2719 = Class13.anIntArray147[var3];
			var2.anInt2712 = Class13.anIntArray148[var3];
			var2.anInt2716 = Class26.anIntArray324[var3];
			int var4 = var2.anInt2716 * var2.anInt2712;
			byte[] var6 = Class13.aByteArrayArray150[var3];
			var2.anIntArray2713 = new int[var4];

			for (int var5 = 0; var5 < var4; var5++) {
				var2.anIntArray2713[var5] = Class13.anIntArray149[var6[var5] & 255];
			}
		}

		Class117_Sub22_Sub18_Sub3.method3083(-578517745);
		return var1;
	}

	public static void method53(byte[] var0, int var1) {
		Class117_Sub14 var2 = new Class117_Sub14(var0);
		var2.anInt1880 = (var0.length - 2) * -2079217519;
		Class13.anInt152 = var2.method2012(1053511631) * -1896082435;
		Class98.anIntArray1133 = new int[Class13.anInt152 * -764616363];
		Class13.anIntArray147 = new int[Class13.anInt152 * -764616363];
		Class13.anIntArray148 = new int[Class13.anInt152 * -764616363];
		Class26.anIntArray324 = new int[Class13.anInt152 * -764616363];
		Class13.aByteArrayArray150 = new byte[Class13.anInt152 * -764616363][];
		var2.anInt1880 = (var0.length - 7 - Class13.anInt152 * -1821963608) * -2079217519;
		Class13.anInt145 = var2.method2012(1053511631) * 1693994019;
		Class13.anInt146 = var2.method2012(1053511631) * 694318191;
		int var8 = (var2.method2010(-1439707937) & 255) + 1;

		int var3;
		for (var3 = 0; var3 < Class13.anInt152 * -764616363; var3++) {
			Class98.anIntArray1133[var3] = var2.method2012(1053511631);
		}

		for (var3 = 0; var3 < Class13.anInt152 * -764616363; var3++) {
			Class13.anIntArray147[var3] = var2.method2012(1053511631);
		}

		for (var3 = 0; var3 < Class13.anInt152 * -764616363; var3++) {
			Class13.anIntArray148[var3] = var2.method2012(1053511631);
		}

		for (var3 = 0; var3 < Class13.anInt152 * -764616363; var3++) {
			Class26.anIntArray324[var3] = var2.method2012(1053511631);
		}

		var2.anInt1880 = (var0.length - 7 - Class13.anInt152 * -1821963608 - (var8 - 1) * 3) * -2079217519;
		Class13.anIntArray149 = new int[var8];

		for (var3 = 1; var3 < var8; var3++) {
			Class13.anIntArray149[var3] = var2.method2014(452289394);
			if (Class13.anIntArray149[var3] == 0) {
				Class13.anIntArray149[var3] = 1;
			}
		}

		var2.anInt1880 = 0;

		for (var3 = 0; var3 < Class13.anInt152 * -764616363; var3++) {
			int var6 = Class13.anIntArray148[var3];
			int var9 = Class26.anIntArray324[var3];
			int var10 = var9 * var6;
			byte[] var4 = new byte[var10];
			Class13.aByteArrayArray150[var3] = var4;
			int var11 = var2.method2010(-1439707937);
			int var5;
			if (var11 == 0) {
				for (var5 = 0; var5 < var10; var5++) {
					var4[var5] = var2.method1997(-2136271358);
				}
			} else if (var11 == 1) {
				for (var5 = 0; var5 < var6; var5++) {
					for (int var7 = 0; var7 < var9; var7++) {
						var4[var5 + var6 * var7] = var2.method1997(90110128);
					}
				}
			}
		}

	}

	static int method54(Class117_Sub14_Sub1 var0, int var1) {
		int var2 = var0.method2931(2, -1320315244);
		int var3;
		if (var2 != 0) {
			if (var2 == 1) {
				var3 = var0.method2931(5, -1320315244);
			} else if (var2 == 2) {
				var3 = var0.method2931(8, -1320315244);
			} else {
				var3 = var0.method2931(11, -1320315244);
			}
		} else {
			var3 = 0;
		}

		return var3;
	}

}
