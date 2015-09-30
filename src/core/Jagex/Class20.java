package core.Jagex;
public class Class20 {

	static final int anInt225 = 11;
	static final int anInt226 = 6;
	public static final int anInt228 = 81;
	static int[] anIntArray230;
	static Class117_Sub22_Sub17_Sub2[] aClass117_Sub22_Sub17_Sub2Array231;
	static final int anInt232 = 7;
	public static final int anInt233 = 97;
	public static final int anInt234 = 224;
	int anInt227;
	int anInt235;
	int[][] anIntArrayArray229;

	public Class20(int var1, int var2) {
		if (var1 != var2) {
			int var10 = var1;
			int var9 = var2;
			if (var2 > var1) {
				var10 = var2;
				var9 = var1;
			}

			while (var9 != 0) {
				int var13 = var10 % var9;
				var10 = var9;
				var9 = var13;
			}

			var1 /= var10;
			var2 /= var10;
			anInt227 = var1 * 1207518471;
			anInt235 = var2 * 32788763;
			anIntArrayArray229 = new int[var1][14];

			for (int var3 = 0; var3 < var1; var3++) {
				int[] var16 = anIntArrayArray229[var3];
				double var7 = (double) var3 / (double) var1 + 6.0D;
				int var6 = (int) Math.floor(1.0D + (var7 - 7.0D));
				if (var6 < 0) {
					var6 = 0;
				}

				int var14 = (int) Math.ceil(7.0D + var7);
				if (var14 > 14) {
					var14 = 14;
				}

				for (double var17 = (double) var2 / (double) var1; var6 < var14; var6++) {
					double var11 = ((double) var6 - var7) * 3.141592653589793D;
					double var4 = var17;
					if (var11 < -1.0E-4D || var11 > 1.0E-4D) {
						var4 = var17 * (Math.sin(var11) / var11);
					}

					var4 *= 0.54D + 0.46D * Math.cos(((double) var6 - var7) * 0.2243994752564138D);
					var16[var6] = (int) Math.floor(0.5D + 65536.0D * var4);
				}
			}

		}
	}

	byte[] method343(byte[] var1, int var2) {
		if (anIntArrayArray229 != null) {
			int var4 = 14 + (int) ((long) var1.length * (long) (anInt235 * 894738707) / (long) (anInt227 * 1211177143));
			int[] var5 = new int[var4];
			int var9 = 0;
			int var6 = 0;

			int var3;
			for (var3 = 0; var3 < var1.length; var3++) {
				byte var7 = var1[var3];
				int[] var10 = anIntArrayArray229[var6];

				int var8;
				for (var8 = 0; var8 < 14; var8++) {
					var5[var8 + var9] += var10[var8] * var7;
				}

				var6 += anInt235 * 894738707;
				var8 = var6 / (anInt227 * 1211177143);
				var9 += var8;
				var6 -= anInt227 * 1211177143 * var8;
			}

			var1 = new byte[var4];

			for (var3 = 0; var3 < var4; var3++) {
				int var11 = 32768 + var5[var3] >> 16;
				if (var11 < -128) {
					var1[var3] = -128;
				} else if (var11 > 127) {
					var1[var3] = 127;
				} else {
					var1[var3] = (byte) var11;
				}
			}
		}

		return var1;
	}

	int method345(int var1, byte var2) {
		if (anIntArrayArray229 != null) {
			var1 = 6 + (int) ((long) var1 * (long) (anInt235 * 894738707) / (long) (anInt227 * 1211177143));
		}

		return var1;
	}

	static void method350(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		Class117_Sub9 var10 = null;

		for (Class117_Sub9 var11 = (Class117_Sub9) GameClient.aClass120_3052.method1577(); var11 != null; var11 = (Class117_Sub9) GameClient.aClass120_3052.method1582()) {
			if (var0 == var11.anInt1820 * -1213240437 && var1 == var11.anInt1810 * 358282887 && var2 == var11.anInt1811 * -2131922755 && var11.anInt1818 * 516529391 == var3) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new Class117_Sub9();
			var10.anInt1820 = var0 * 2135319587;
			var10.anInt1818 = var3 * 189338127;
			var10.anInt1810 = var1 * -829690057;
			var10.anInt1811 = var2 * 308152981;
			Class28.method418(var10, (byte) -97);
			GameClient.aClass120_3052.method1575(var10);
		}

		var10.anInt1815 = var4 * -573927183;
		var10.anInt1817 = var5 * 1707255899;
		var10.anInt1816 = var6 * 1769411365;
		var10.anInt1822 = var7 * 1395029481;
		var10.anInt1819 = var8 * -1561603979;
	}

	int method352(int var1, int var2) {
		if (anIntArrayArray229 != null) {
			var1 = (int) ((long) var1 * (long) (anInt235 * 894738707) / (long) (anInt227 * 1211177143));
		}

		return var1;
	}

	static int method353(int var0) {
		return (Class35.anInt439 -= 1768980315) * 2025088813 - 1;
	}

	static Class106_Sub1 method354(int var0, boolean var1, boolean var2, boolean var3, int var4) {
		Class88 var5 = null;
		if (Class74.aClass145_887 != null) {
			var5 = new Class88(var0, Class74.aClass145_887, Class117_Sub10.aClass145Array1839[var0], 1000000);
		}

		return new Class106_Sub1(var5, Class7.aClass88_95, var0, var1, var2, var3);
	}

}
