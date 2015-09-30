package core.Jagex;
public class Class11 {

	int anInt130;
	int anInt127;
	int[] anIntArray126;
	int[] anIntArray129;
	float[][] aFloatArrayArray128;
	int[] anIntArray131;

	Class11() {
		Class117_Sub3.method1908(24);
		anInt130 = Class117_Sub3.method1908(16);
		anInt127 = Class117_Sub3.method1908(24);
		anIntArray126 = new int[anInt127];
		boolean var6 = Class117_Sub3.method1911() != 0;
		int var1;
		int var2;
		int var3;
		if (var6) {
			var1 = 0;

			for (var2 = Class117_Sub3.method1908(5) + 1; var1 < anInt127; var2++) {
				int var7 = Class117_Sub3.method1908(Class117_Sub24.method2341(anInt127 - var1, -381115549));

				for (var3 = 0; var3 < var7; var3++) {
					anIntArray126[var1++] = var2;
				}
			}
		} else {
			boolean var14 = Class117_Sub3.method1911() != 0;

			for (var2 = 0; var2 < anInt127; var2++) {
				if (var14 && Class117_Sub3.method1911() == 0) {
					anIntArray126[var2] = 0;
				} else {
					anIntArray126[var2] = Class117_Sub3.method1908(5) + 1;
				}
			}
		}

		method179();
		var1 = Class117_Sub3.method1908(4);
		if (var1 > 0) {
			float var15 = Class117_Sub3.method1917(Class117_Sub3.method1908(32));
			float var16 = Class117_Sub3.method1917(Class117_Sub3.method1908(32));
			var3 = Class117_Sub3.method1908(4) + 1;
			boolean var9 = Class117_Sub3.method1911() != 0;
			int var11;
			if (var1 == 1) {
				var11 = method172(anInt127, anInt130);
			} else {
				var11 = anInt127 * anInt130;
			}

			anIntArray129 = new int[var11];

			int var4;
			for (var4 = 0; var4 < var11; var4++) {
				anIntArray129[var4] = Class117_Sub3.method1908(var3);
			}

			aFloatArrayArray128 = new float[anInt127][anInt130];
			int var5;
			int var8;
			float var12;
			if (var1 == 1) {
				for (var4 = 0; var4 < anInt127; var4++) {
					var12 = 0.0F;
					var5 = 1;

					for (var8 = 0; var8 < anInt130; var8++) {
						int var13 = var4 / var5 % var11;
						float var10 = (float) anIntArray129[var13] * var16 + var15 + var12;
						aFloatArrayArray128[var4][var8] = var10;
						if (var9) {
							var12 = var10;
						}

						var5 *= var11;
					}
				}
			} else {
				for (var4 = 0; var4 < anInt127; var4++) {
					var12 = 0.0F;
					var5 = var4 * anInt130;

					for (var8 = 0; var8 < anInt130; var8++) {
						float var17 = (float) anIntArray129[var5] * var16 + var15 + var12;
						aFloatArrayArray128[var4][var8] = var17;
						if (var9) {
							var12 = var17;
						}

						++var5;
					}
				}
			}
		}

	}

	float[] method170() {
		return aFloatArrayArray128[method171()];
	}

	int method171() {
		int var1;
		for (var1 = 0; anIntArray131[var1] >= 0; var1 = Class117_Sub3.method1911() == 0 ? var1 + 1 : anIntArray131[var1]) {
			;
		}

		return ~anIntArray131[var1];
	}

	static int method172(int var0, int var1) {
		int var2;
		for (var2 = (int) Math.pow((double) var0, 1.0D / (double) var1) + 1; Class32.method468(var2, var1, 2108500868) > var0; --var2) {
			;
		}

		return var2;
	}

	void method179() {
		int[] var1 = new int[anInt127];
		int[] var7 = new int[33];

		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var8;
		int var10;
		for (var3 = 0; var3 < anInt127; var3++) {
			var4 = anIntArray126[var3];
			if (var4 != 0) {
				var6 = 1 << 32 - var4;
				var5 = var7[var4];
				var1[var3] = var5;
				int var9;
				if ((var5 & var6) != 0) {
					var8 = var7[var4 - 1];
				} else {
					var8 = var5 | var6;

					for (var2 = var4 - 1; var2 >= 1; --var2) {
						var9 = var7[var2];
						if (var9 != var5) {
							break;
						}

						var10 = 1 << 32 - var2;
						if ((var9 & var10) != 0) {
							var7[var2] = var7[var2 - 1];
							break;
						}

						var7[var2] = var9 | var10;
					}
				}

				var7[var4] = var8;

				for (var2 = var4 + 1; var2 <= 32; var2++) {
					var9 = var7[var2];
					if (var9 == var5) {
						var7[var2] = var8;
					}
				}
			}
		}

		anIntArray131 = new int[8];
		int var11 = 0;

		for (var3 = 0; var3 < anInt127; var3++) {
			var4 = anIntArray126[var3];
			if (var4 != 0) {
				var6 = var1[var3];
				var5 = 0;

				for (var8 = 0; var8 < var4; var8++) {
					var2 = Integer.MIN_VALUE >>> var8;
					if ((var6 & var2) != 0) {
						if (anIntArray131[var5] == 0) {
							anIntArray131[var5] = var11;
						}

						var5 = anIntArray131[var5];
					} else {
						++var5;
					}

					if (var5 >= anIntArray131.length) {
						int[] var12 = new int[anIntArray131.length * 2];

						for (var10 = 0; var10 < anIntArray131.length; var10++) {
							var12[var10] = anIntArray131[var10];
						}

						anIntArray131 = var12;
					}

					var2 >>>= 1;
				}

				anIntArray131[var5] = ~var3;
				if (var5 >= var11) {
					var11 = var5 + 1;
				}
			}
		}

	}

}
