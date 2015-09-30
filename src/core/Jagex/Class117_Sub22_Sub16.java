package core.Jagex;
public class Class117_Sub22_Sub16 extends Class117_Sub22 {

	public static final int anInt2455 = 101;
	public static final int anInt2456 = 68;
	static Class106_Sub1 aClass106_Sub1_2457;
	static final int anInt2458 = 12;
	Class48[] aClass48Array2454;

	Class117_Sub22_Sub16(Class106 var1, Class106 var2, int var3, boolean var4) {
		Class120 var6 = new Class120();
		int var9 = var1.method1399(var3, 2144421966);
		aClass48Array2454 = new Class48[var9];
		int[] var8 = var1.method1439(var3, (byte) 72);

		for (int var7 = 0; var7 < var8.length; var7++) {
			byte[] var10 = var1.method1380(var3, var8[var7], (byte) 34);
			Class117_Sub11 var5 = null;
			int var12 = (var10[0] & 255) << 8 | var10[1] & 255;

			for (Class117_Sub11 var11 = (Class117_Sub11) var6.method1577(); var11 != null; var11 = (Class117_Sub11) var6.method1582()) {
				if (var12 == var11.anInt1845 * 821301395) {
					var5 = var11;
					break;
				}
			}

			if (var5 == null) {
				byte[] var13;
				if (var4) {
					var13 = var2.method1433(0, var12, (byte) 16);
				} else {
					var13 = var2.method1433(var12, 0, (byte) 16);
				}

				var5 = new Class117_Sub11(var12, var13);
				var6.method1575(var5);
			}

			aClass48Array2454[var8[var7]] = new Class48(var10, var5);
		}

	}

	public boolean method2858(int var1, int var2) {
		return aClass48Array2454[var1].aBool654;
	}

	static void method2860(int var0, int var1, int var2, int var3, Class117_Sub22_Sub17_Sub3 var4, Class117_Sub22_Sub21 var5, int var6) {
		if (var4 != null) {
			int var10 = GameClient.anInt2990 * -1810209603 + GameClient.anInt3005 * -1204229987 & 2047;
			int var11 = var3 * var3 + var2 * var2;
			if (var11 <= 6400) {
				int var7 = Class117_Sub22_Sub17_Sub1.anIntArray2653[var10];
				int var12 = Class117_Sub22_Sub17_Sub1.anIntArray2654[var10];
				var7 = var7 * 256 / (256 + GameClient.anInt3202 * 138652733);
				var12 = var12 * 256 / (256 + GameClient.anInt3202 * 138652733);
				int var8 = var12 * var2 + var7 * var3 >> 16;
				int var9 = var12 * var3 - var7 * var2 >> 16;
				if (var11 > 2500) {
					var4.method3250(var8 + var5.anInt2502 * 707865929 / 2 - var4.anInt2715 / 2, var5.anInt2500 * -1893173225 / 2 - var9 - var4.anInt2720 / 2, var0, var1, var5.anInt2502 * 707865929, var5.anInt2500 * -1893173225, var5.anIntArray2503, var5.anIntArray2501);
				} else {
					var4.method3290(var5.anInt2502 * 707865929 / 2 + var0 + var8 - var4.anInt2715 / 2, var1 + var5.anInt2500 * -1893173225 / 2 - var9 - var4.anInt2720 / 2);
				}

			}
		}
	}

}
