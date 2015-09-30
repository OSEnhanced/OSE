package core.Jagex;
public class Class18 {

	int anInt217 = Class117_Sub3.method1908(16);
	int anInt215 = Class117_Sub3.method1908(24);
	int anInt216 = Class117_Sub3.method1908(24);
	int anInt218 = Class117_Sub3.method1908(24) + 1;
	int anInt214 = Class117_Sub3.method1908(6) + 1;
	int anInt219 = Class117_Sub3.method1908(8);
	int[] anIntArray220;

	void method341(float[] var1, int var2, boolean var3) {
		int var4;
		for (var4 = 0; var4 < var2; var4++) {
			var1[var4] = 0.0F;
		}

		if (!var3) {
			var4 = Class117_Sub3.aClass11Array1704[anInt219].anInt130;
			int var6 = anInt216 - anInt215;
			int var9 = var6 / anInt218;
			int[] var10 = new int[var9];

			for (int var11 = 0; var11 < 8; var11++) {
				int var5 = 0;

				while (var5 < var9) {
					int var12;
					int var13;
					if (var11 == 0) {
						var13 = Class117_Sub3.aClass11Array1704[anInt219].method171();

						for (var12 = var4 - 1; var12 >= 0; --var12) {
							if (var5 + var12 < var9) {
								var10[var5 + var12] = var13 % anInt214;
							}

							var13 /= anInt214;
						}
					}

					for (var13 = 0; var13 < var4; var13++) {
						var12 = var10[var5];
						int var15 = anIntArray220[var12 * 8 + var11];
						if (var15 >= 0) {
							int var14 = anInt215 + var5 * anInt218;
							Class11 var7 = Class117_Sub3.aClass11Array1704[var15];
							int var16;
							if (anInt217 == 0) {
								var16 = anInt218 / var7.anInt130;

								for (int var20 = 0; var20 < var16; var20++) {
									float[] var19 = var7.method170();

									for (int var18 = 0; var18 < var7.anInt130; var18++) {
										var1[var14 + var20 + var18 * var16] += var19[var18];
									}
								}
							} else {
								var16 = 0;

								while (var16 < anInt218) {
									float[] var17 = var7.method170();

									for (int var8 = 0; var8 < var7.anInt130; var8++) {
										var1[var14 + var16] += var17[var8];
										++var16;
									}
								}
							}
						}

						++var5;
						if (var5 >= var9) {
							break;
						}
					}
				}
			}

		}
	}

	Class18() {
		int[] var2 = new int[anInt214];

		int var1;
		for (var1 = 0; var1 < anInt214; var1++) {
			int var5 = 0;
			int var3 = Class117_Sub3.method1908(3);
			boolean var4 = Class117_Sub3.method1911() != 0;
			if (var4) {
				var5 = Class117_Sub3.method1908(5);
			}

			var2[var1] = var5 << 3 | var3;
		}

		anIntArray220 = new int[anInt214 * 8];

		for (var1 = 0; var1 < anInt214 * 8; var1++) {
			anIntArray220[var1] = (var2[var1 >> 3] & 1 << (var1 & 7)) != 0 ? Class117_Sub3.method1908(8) : -1;
		}

	}

}
