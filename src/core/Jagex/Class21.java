package core.Jagex;
import java.util.Random;

public class Class21 {

	static final double aDouble256 = 1.0057929410678534D;
	Class9 aClass9_255;
	Class9 aClass9_248;
	Class9 aClass9_257;
	Class9 aClass9_239;
	Class9 aClass9_240;
	Class9 aClass9_241;
	Class9 aClass9_237;
	Class9 aClass9_243;
	int anInt242 = 0;
	int anInt238 = 100;
	int anInt251 = 500;
	int anInt254 = 0;
	Class16 aClass16_249;
	Class9 aClass9_250;
	static int[] anIntArray247 = new int[32768];
	static int[] anIntArray252;
	static int[] anIntArray253;
	static int[] anIntArray236;
	static int[] anIntArray258;
	static int[] anIntArray259;
	static int[] anIntArray260;
	static int[] anIntArray261;
	int[] anIntArray244 = new int[]{0, 0, 0, 0, 0};
	int[] anIntArray245 = new int[]{0, 0, 0, 0, 0};
	int[] anIntArray246 = new int[]{0, 0, 0, 0, 0};

	final int method357(int var1, int var2, int var3) {
		return var3 == 1 ? ((var1 & 32767) >= 16384 ? -var2 : var2) : (var3 == 2 ? anIntArray252[var1 & 32767] * var2 >> 14 : (var3 == 3 ? ((var1 & 32767) * var2 >> 14) - var2 : (var3 == 4 ? anIntArray247[var1 / 2607 & 32767] * var2 : 0)));
	}

	final void method359(Class117_Sub14 var1) {
		aClass9_255 = new Class9();
		aClass9_255.method143(var1);
		aClass9_248 = new Class9();
		aClass9_248.method143(var1);
		int var2 = var1.method2010(-1439707937);
		if (var2 != 0) {
			var1.anInt1880 += 2079217519;
			aClass9_257 = new Class9();
			aClass9_257.method143(var1);
			aClass9_239 = new Class9();
			aClass9_239.method143(var1);
		}

		var2 = var1.method2010(-1439707937);
		if (var2 != 0) {
			var1.anInt1880 += 2079217519;
			aClass9_240 = new Class9();
			aClass9_240.method143(var1);
			aClass9_241 = new Class9();
			aClass9_241.method143(var1);
		}

		var2 = var1.method2010(-1439707937);
		if (var2 != 0) {
			var1.anInt1880 += 2079217519;
			aClass9_237 = new Class9();
			aClass9_237.method143(var1);
			aClass9_243 = new Class9();
			aClass9_243.method143(var1);
		}

		for (int var3 = 0; var3 < 10; var3++) {
			int var4 = var1.method2111((byte) 8);
			if (var4 == 0) {
				break;
			}

			anIntArray244[var3] = var4;
			anIntArray245[var3] = var1.method2056(-1003847421);
			anIntArray246[var3] = var1.method2111((byte) 115);
		}

		anInt242 = var1.method2111((byte) 66);
		anInt238 = var1.method2111((byte) 44);
		anInt251 = var1.method2012(1053511631);
		anInt254 = var1.method2012(1053511631);
		aClass16_249 = new Class16();
		aClass9_250 = new Class9();
		aClass16_249.method323(var1, aClass9_250);
	}

	static {
		Random var1 = new Random(0L);

		int var0;
		for (var0 = 0; var0 < 32768; var0++) {
			anIntArray247[var0] = (var1.nextInt() & 2) - 1;
		}

		anIntArray252 = new int[32768];

		for (var0 = 0; var0 < 32768; var0++) {
			anIntArray252[var0] = (int) (Math.sin((double) var0 / 5215.1903D) * 16384.0D);
		}

		anIntArray253 = new int[220500];
		anIntArray236 = new int[5];
		anIntArray258 = new int[5];
		anIntArray259 = new int[5];
		anIntArray260 = new int[5];
		anIntArray261 = new int[5];
	}

	final int[] method363(int var1, int var2) {
		Class60.method911(anIntArray253, 0, var1);
		if (var2 < 10) {
			return anIntArray253;
		} else {
			double var11 = (double) var1 / ((double) var2 + 0.0D);
			aClass9_255.method139();
			aClass9_248.method139();
			int var13 = 0;
			int var9 = 0;
			int var10 = 0;
			if (aClass9_257 != null) {
				aClass9_257.method139();
				aClass9_239.method139();
				var13 = (int) ((double) (aClass9_257.anInt116 - aClass9_257.anInt114) * 32.768D / var11);
				var9 = (int) ((double) aClass9_257.anInt114 * 32.768D / var11);
			}

			int var17 = 0;
			int var15 = 0;
			int var16 = 0;
			if (aClass9_240 != null) {
				aClass9_240.method139();
				aClass9_241.method139();
				var17 = (int) ((double) (aClass9_240.anInt116 - aClass9_240.anInt114) * 32.768D / var11);
				var15 = (int) ((double) aClass9_240.anInt114 * 32.768D / var11);
			}

			int var3;
			for (var3 = 0; var3 < 5; var3++) {
				if (anIntArray244[var3] != 0) {
					anIntArray236[var3] = 0;
					anIntArray258[var3] = (int) ((double) anIntArray246[var3] * var11);
					anIntArray259[var3] = (anIntArray244[var3] << 14) / 100;
					anIntArray260[var3] = (int) ((double) (aClass9_255.anInt116 - aClass9_255.anInt114) * 32.768D * Math.pow(1.0057929410678534D, (double) anIntArray245[var3]) / var11);
					anIntArray261[var3] = (int) ((double) aClass9_255.anInt114 * 32.768D / var11);
				}
			}

			int var4;
			int var6;
			int var8;
			int var14;
			for (var3 = 0; var3 < var1; var3++) {
				var6 = aClass9_255.method147(var1);
				var8 = aClass9_248.method147(var1);
				if (aClass9_257 != null) {
					var4 = aClass9_257.method147(var1);
					var14 = aClass9_239.method147(var1);
					var6 += method357(var10, var14, aClass9_257.anInt113) >> 1;
					var10 += (var4 * var13 >> 16) + var9;
				}

				if (aClass9_240 != null) {
					var4 = aClass9_240.method147(var1);
					var14 = aClass9_241.method147(var1);
					var8 = var8 * ((method357(var16, var14, aClass9_240.anInt113) >> 1) + 32768) >> 15;
					var16 += (var4 * var17 >> 16) + var15;
				}

				for (var4 = 0; var4 < 5; var4++) {
					if (anIntArray244[var4] != 0) {
						var14 = var3 + anIntArray258[var4];
						if (var14 < var1) {
							anIntArray253[var14] += method357(anIntArray236[var4], var8 * anIntArray259[var4] >> 15, aClass9_255.anInt113);
							anIntArray236[var4] += (var6 * anIntArray260[var4] >> 16) + anIntArray261[var4];
						}
					}
				}
			}

			int var5;
			if (aClass9_237 != null) {
				aClass9_237.method139();
				aClass9_243.method139();
				var3 = 0;
				boolean var19 = false;
				boolean var20 = true;

				for (var4 = 0; var4 < var1; var4++) {
					var14 = aClass9_237.method147(var1);
					var5 = aClass9_243.method147(var1);
					if (var20) {
						var6 = aClass9_237.anInt114 + ((aClass9_237.anInt116 - aClass9_237.anInt114) * var14 >> 8);
					} else {
						var6 = aClass9_237.anInt114 + ((aClass9_237.anInt116 - aClass9_237.anInt114) * var5 >> 8);
					}

					var3 += 256;
					if (var3 >= var6) {
						var3 = 0;
						var20 = !var20;
					}

					if (var20) {
						anIntArray253[var4] = 0;
					}
				}
			}

			if (anInt242 > 0 && anInt238 > 0) {
				var3 = (int) ((double) anInt242 * var11);

				for (var6 = var3; var6 < var1; var6++) {
					anIntArray253[var6] += anIntArray253[var6 - var3] * anInt238 / 100;
				}
			}

			if (aClass16_249.anIntArray202[0] > 0 || aClass16_249.anIntArray202[1] > 0) {
				aClass9_250.method139();
				var3 = aClass9_250.method147(var1 + 1);
				var6 = aClass16_249.method321(0, (float) var3 / 65536.0F);
				var8 = aClass16_249.method321(1, (float) var3 / 65536.0F);
				if (var1 >= var6 + var8) {
					var4 = 0;
					var14 = var8;
					if (var8 > var1 - var6) {
						var14 = var1 - var6;
					}

					int var7;
					while (var4 < var14) {
						var5 = (int) ((long) anIntArray253[var4 + var6] * (long) Class16.anInt196 >> 16);

						for (var7 = 0; var7 < var6; var7++) {
							var5 += (int) ((long) anIntArray253[var4 + var6 - 1 - var7] * (long) Class16.anIntArrayArray199[0][var7] >> 16);
						}

						for (var7 = 0; var7 < var4; var7++) {
							var5 -= (int) ((long) anIntArray253[var4 - 1 - var7] * (long) Class16.anIntArrayArray199[1][var7] >> 16);
						}

						anIntArray253[var4] = var5;
						var3 = aClass9_250.method147(var1 + 1);
						++var4;
					}

					var14 = 128;

					while (true) {
						if (var14 > var1 - var6) {
							var14 = var1 - var6;
						}

						int var18;
						while (var4 < var14) {
							var7 = (int) ((long) anIntArray253[var4 + var6] * (long) Class16.anInt196 >> 16);

							for (var18 = 0; var18 < var6; var18++) {
								var7 += (int) ((long) anIntArray253[var4 + var6 - 1 - var18] * (long) Class16.anIntArrayArray199[0][var18] >> 16);
							}

							for (var18 = 0; var18 < var8; var18++) {
								var7 -= (int) ((long) anIntArray253[var4 - 1 - var18] * (long) Class16.anIntArrayArray199[1][var18] >> 16);
							}

							anIntArray253[var4] = var7;
							var3 = aClass9_250.method147(var1 + 1);
							++var4;
						}

						if (var4 >= var1 - var6) {
							while (var4 < var1) {
								var7 = 0;

								for (var18 = var4 + var6 - var1; var18 < var6; var18++) {
									var7 += (int) ((long) anIntArray253[var4 + var6 - 1 - var18] * (long) Class16.anIntArrayArray199[0][var18] >> 16);
								}

								for (var18 = 0; var18 < var8; var18++) {
									var7 -= (int) ((long) anIntArray253[var4 - 1 - var18] * (long) Class16.anIntArrayArray199[1][var18] >> 16);
								}

								anIntArray253[var4] = var7;
								aClass9_250.method147(var1 + 1);
								++var4;
							}
							break;
						}

						var6 = aClass16_249.method321(0, (float) var3 / 65536.0F);
						var8 = aClass16_249.method321(1, (float) var3 / 65536.0F);
						var14 += 128;
					}
				}
			}

			for (var3 = 0; var3 < var1; var3++) {
				if (anIntArray253[var3] < -32768) {
					anIntArray253[var3] = -32768;
				}

				if (anIntArray253[var3] > 32767) {
					anIntArray253[var3] = 32767;
				}
			}

			return anIntArray253;
		}
	}

}
