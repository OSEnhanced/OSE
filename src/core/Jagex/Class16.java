package core.Jagex;
public class Class16 {

	static final float aFloat195 = 8.0F;
	static final float aFloat200 = 32.703197F;
	static final float aFloat203 = 100.0F;
	static final int anInt205 = 4;
	static float aFloat201;
	static int anInt196;
	static float[][] aFloatArrayArray194 = new float[2][8];
	static int[][] anIntArrayArray199 = new int[2][8];
	int[] anIntArray202 = new int[2];
	int[][][] anIntArrayArrayArray204 = new int[2][2][4];
	int[][][] anIntArrayArrayArray197 = new int[2][2][4];
	int[] anIntArray198 = new int[2];

	float method319(int var1, int var2, float var3) {
		float var4 = (float) anIntArrayArrayArray197[var1][0][var2] + var3 * (float) (anIntArrayArrayArray197[var1][1][var2] - anIntArrayArrayArray197[var1][0][var2]);
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-var4 / 20.0F));
	}

	int method321(int var1, float var2) {
		float var3;
		if (var1 == 0) {
			var3 = (float) anIntArray198[0] + (float) (anIntArray198[1] - anIntArray198[0]) * var2;
			var3 *= 0.0030517578F;
			aFloat201 = (float) Math.pow(0.1D, (double) (var3 / 20.0F));
			anInt196 = (int) (aFloat201 * 65536.0F);
		}

		if (anIntArray202[var1] == 0) {
			return 0;
		} else {
			var3 = method319(var1, 0, var2);
			aFloatArrayArray194[var1][0] = -2.0F * var3 * (float) Math.cos((double) method324(var1, 0, var2));
			aFloatArrayArray194[var1][1] = var3 * var3;

			int var5;
			for (var5 = 1; var5 < anIntArray202[var1]; var5++) {
				var3 = method319(var1, var5, var2);
				float var6 = -2.0F * var3 * (float) Math.cos((double) method324(var1, var5, var2));
				float var4 = var3 * var3;
				aFloatArrayArray194[var1][var5 * 2 + 1] = aFloatArrayArray194[var1][var5 * 2 - 1] * var4;
				aFloatArrayArray194[var1][var5 * 2] = aFloatArrayArray194[var1][var5 * 2 - 1] * var6 + aFloatArrayArray194[var1][var5 * 2 - 2] * var4;

				for (int var7 = var5 * 2 - 1; var7 >= 2; --var7) {
					aFloatArrayArray194[var1][var7] += aFloatArrayArray194[var1][var7 - 1] * var6 + aFloatArrayArray194[var1][var7 - 2] * var4;
				}

				aFloatArrayArray194[var1][1] += aFloatArrayArray194[var1][0] * var6 + var4;
				aFloatArrayArray194[var1][0] += var6;
			}

			if (var1 == 0) {
				for (var5 = 0; var5 < anIntArray202[0] * 2; var5++) {
					aFloatArrayArray194[0][var5] *= aFloat201;
				}
			}

			for (var5 = 0; var5 < anIntArray202[var1] * 2; var5++) {
				anIntArrayArray199[var1][var5] = (int) (aFloatArrayArray194[var1][var5] * 65536.0F);
			}

			return anIntArray202[var1] * 2;
		}
	}

	final void method323(Class117_Sub14 var1, Class9 var2) {
		int var3 = var1.method2010(-1439707937);
		anIntArray202[0] = var3 >> 4;
		anIntArray202[1] = var3 & 15;
		if (var3 != 0) {
			anIntArray198[0] = var1.method2012(1053511631);
			anIntArray198[1] = var1.method2012(1053511631);
			int var6 = var1.method2010(-1439707937);

			int var4;
			int var5;
			for (var5 = 0; var5 < 2; var5++) {
				for (var4 = 0; var4 < anIntArray202[var5]; var4++) {
					anIntArrayArrayArray204[var5][0][var4] = var1.method2012(1053511631);
					anIntArrayArrayArray197[var5][0][var4] = var1.method2012(1053511631);
				}
			}

			for (var5 = 0; var5 < 2; var5++) {
				for (var4 = 0; var4 < anIntArray202[var5]; var4++) {
					if ((var6 & 1 << var5 * 4 << var4) != 0) {
						anIntArrayArrayArray204[var5][1][var4] = var1.method2012(1053511631);
						anIntArrayArrayArray197[var5][1][var4] = var1.method2012(1053511631);
					} else {
						anIntArrayArrayArray204[var5][1][var4] = anIntArrayArrayArray204[var5][0][var4];
						anIntArrayArrayArray197[var5][1][var4] = anIntArrayArrayArray197[var5][0][var4];
					}
				}
			}

			if (var6 != 0 || anIntArray198[1] != anIntArray198[0]) {
				var2.method138(var1);
			}
		} else {
			int[] var7 = anIntArray198;
			anIntArray198[1] = 0;
			var7[0] = 0;
		}

	}

	float method324(int var1, int var2, float var3) {
		float var4 = (float) anIntArrayArrayArray204[var1][0][var2] + var3 * (float) (anIntArrayArrayArray204[var1][1][var2] - anIntArrayArrayArray204[var1][0][var2]);
		var4 *= 1.2207031E-4F;
		return method329(var4);
	}

	static float method329(float var0) {
		float var1 = 32.703197F * (float) Math.pow(2.0D, (double) var0);
		return var1 * 3.1415927F / 11025.0F;
	}

}
