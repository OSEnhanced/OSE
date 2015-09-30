package core.Jagex;
public final class Class117_Sub22_Sub18_Sub3 extends Class117_Sub22_Sub18 {

	static Class69 aClass69_2625;
	static final int anInt2627 = 52;
	public static final int anInt2628 = 8;
	static int anInt2629;
	int anInt2624 = 0;
	int anInt2617 = 0;
	boolean aBool2623 = false;
	int anInt2626;
	int anInt2618;
	int anInt2619;
	int anInt2620;
	int anInt2621;
	int anInt2616;
	Class117_Sub22_Sub14 aClass117_Sub22_Sub14_2622;

	public static void method3083(int var0) {
		Class98.anIntArray1133 = null;
		Class13.anIntArray147 = null;
		Class13.anIntArray148 = null;
		Class26.anIntArray324 = null;
		Class13.anIntArray149 = null;
		Class13.aByteArrayArray150 = (byte[][]) null;
	}

	protected final Class117_Sub22_Sub18_Sub7 method2921(byte var1) {
		Class117_Sub22_Sub11 var2 = Class80.method1085(anInt2626 * 852838973, (byte) 56);
		Class117_Sub22_Sub18_Sub7 var3;
		if (!aBool2623) {
			var3 = var2.method2562(anInt2617 * 1908550161, 553464185);
		} else {
			var3 = var2.method2562(-1, 553464185);
		}

		return var3 == null ? null : var3;
	}

	final void method3084(int var1, byte var2) {
		if (!aBool2623) {
			anInt2624 += var1 * -645282165;

			while (anInt2624 * -1545342685 > aClass117_Sub22_Sub14_2622.anIntArray2405[anInt2617 * 1908550161]) {
				anInt2624 -= aClass117_Sub22_Sub14_2622.anIntArray2405[anInt2617 * 1908550161] * -645282165;
				anInt2617 += 1033504497;
				if (anInt2617 * 1908550161 >= aClass117_Sub22_Sub14_2622.anIntArray2403.length) {
					aBool2623 = true;
					break;
				}
			}

		}
	}

	Class117_Sub22_Sub18_Sub3(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		anInt2626 = var1 * -1057481451;
		anInt2618 = var2 * 1203347703;
		anInt2619 = var3 * -1940184735;
		anInt2620 = var4 * -1945092573;
		anInt2621 = var5 * -765822227;
		anInt2616 = (var7 + var6) * -1459399705;
		int var8 = Class80.method1085(anInt2626 * 852838973, (byte) 44).anInt2317 * -1181614841;
		if (var8 != -1) {
			aBool2623 = false;
			aClass117_Sub22_Sub14_2622 = Class114_Sub1.method1838(var8, (byte) -50);
		} else {
			aBool2623 = true;
		}

	}

	static String method3088(Class117_Sub19 var0, int var1, int var2) {
		int var3 = Class67.method961(var0, -994104831);
		boolean var4 = (var3 >> var1 + 1 & 1) != 0;
		return !var4 && var0.anObjectArray2071 == null ? null : (var0.aStringArray2045 != null && var0.aStringArray2045.length > var1 && var0.aStringArray2045[var1] != null && var0.aStringArray2045[var1].trim().length() != 0 ? var0.aStringArray2045[var1] : null);
	}

	static void method3090(Class24 var0, byte var1) {
		if (var0.method371(1640588) != GameClient.aBool2920) {
			GameClient.aBool2920 = var0.method371(1640588);
			Class117_Sub22_Sub10.method2547(var0.method371(1640588), (byte) -117);
		}

		Class117_Sub22_Sub4.aString2177 = var0.aString301;
		GameClient.anInt2916 = var0.anInt294 * -928454685;
		GameClient.anInt3087 = var0.anInt299 * 1473937913;
		GameClient.anInt3012 = 1902900439 * (GameClient.anInt2918 * -553019157 == 0 ? 43594 : 40000 + var0.anInt294 * 571351125);
		Class117_Sub10.anInt1835 = (GameClient.anInt2918 * -553019157 == 0 ? 443 : 50000 + var0.anInt294 * 571351125) * -551158445;
		GameClient.anInt2954 = GameClient.anInt3012 * -1092817457;
	}

	static void method3091(int var0, byte var1) {
		if (var0 != -1) {
			if (Class4.method85(var0, 758674914)) {
				Class117_Sub19[] var3 = Class117_Sub19.aClass117_Sub19ArrayArray2032[var0];

				for (int var2 = 0; var2 < var3.length; var2++) {
					Class117_Sub19 var4 = var3[var2];
					if (var4.anObjectArray1992 != null) {
						Class117_Sub7 var5 = new Class117_Sub7();
						var5.aClass117_Sub19_1780 = var4;
						var5.anObjectArray1786 = var4.anObjectArray1992;
						Class57.method867(var5, 2000000, -1846681177);
					}
				}

			}
		}
	}

}
