package core.Jagex;
public class Class117_Sub22_Sub17 extends Class117_Sub22 {

	public static int[] anIntArray2459;
	public static int anInt2462;
	public static int anInt2461;
	protected static int anInt2464 = 0;
	public static int anInt2465 = 0;
	protected static int anInt2460 = 0;
	public static int anInt2463 = 0;

	public static void method2862(int[] var0, int var1, int var2) {
		anIntArray2459 = var0;
		anInt2462 = var1;
		anInt2461 = var2;
		method2871(0, 0, var1, var2);
	}

	public static void method2863() {
		anInt2464 = 0;
		anInt2465 = 0;
		anInt2460 = anInt2462;
		anInt2463 = anInt2461;
	}

	public static void method2866(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = 0;
		int var8 = 65536 / var3;
		if (var0 < anInt2464) {
			var2 -= anInt2464 - var0;
			var0 = anInt2464;
		}

		if (var1 < anInt2465) {
			var6 += (anInt2465 - var1) * var8;
			var3 -= anInt2465 - var1;
			var1 = anInt2465;
		}

		if (var0 + var2 > anInt2460) {
			var2 = anInt2460 - var0;
		}

		if (var1 + var3 > anInt2463) {
			var3 = anInt2463 - var1;
		}

		int var9 = anInt2462 - var2;
		int var14 = var0 + var1 * anInt2462;

		for (int var7 = -var3; var7 < 0; var7++) {
			int var11 = 65536 - var6 >> 8;
			int var12 = var6 >> 8;
			int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & 65280) * var11 + (var5 & 65280) * var12 & 16711680) >>> 8;

			for (int var10 = -var2; var10 < 0; var10++) {
				anIntArray2459[var14++] = var13;
			}

			var14 += var9;
			var6 += var8;
		}

	}

	public static void method2868(int[] var0) {
		anInt2464 = var0[0];
		anInt2465 = var0[1];
		anInt2460 = var0[2];
		anInt2463 = var0[3];
	}

	public static void method2869(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 < anInt2464) {
			var2 -= anInt2464 - var0;
			var0 = anInt2464;
		}

		if (var1 < anInt2465) {
			var3 -= anInt2465 - var1;
			var1 = anInt2465;
		}

		if (var0 + var2 > anInt2460) {
			var2 = anInt2460 - var0;
		}

		if (var1 + var3 > anInt2463) {
			var3 = anInt2463 - var1;
		}

		var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & 65280) * var5 >> 8 & 65280);
		int var8 = 256 - var5;
		int var11 = anInt2462 - var2;
		int var6 = var0 + var1 * anInt2462;

		for (int var9 = 0; var9 < var3; var9++) {
			for (int var7 = -var2; var7 < 0; var7++) {
				int var10 = anIntArray2459[var6];
				var10 = ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
				anIntArray2459[var6++] = var4 + var10;
			}

			var6 += var11;
		}

	}

	public static void method2871(int var0, int var1, int var2, int var3) {
		if (var0 < 0) {
			var0 = 0;
		}

		if (var1 < 0) {
			var1 = 0;
		}

		if (var2 > anInt2462) {
			var2 = anInt2462;
		}

		if (var3 > anInt2461) {
			var3 = anInt2461;
		}

		anInt2464 = var0;
		anInt2465 = var1;
		anInt2460 = var2;
		anInt2463 = var3;
	}

	public static void method2872(int var0, int var1, int var2, int var3, int var4) {
		method2916(var0, var1, var2, var4);
		method2916(var0, var1 + var3 - 1, var2, var4);
		method2876(var0, var1, var3, var4);
		method2876(var0 + var2 - 1, var1, var3, var4);
	}

	public static void method2873(int var0, int var1, int var2, int var3, int var4, int var5) {
		method2875(var0, var1, var2, var4, var5);
		method2875(var0, var1 + var3 - 1, var2, var4, var5);
		if (var3 >= 3) {
			method2890(var0, var1 + 1, var3 - 2, var4, var5);
			method2890(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
		}

	}

	static void method2875(int var0, int var1, int var2, int var3, int var4) {
		if (var1 >= anInt2465 && var1 < anInt2463) {
			if (var0 < anInt2464) {
				var2 -= anInt2464 - var0;
				var0 = anInt2464;
			}

			if (var0 + var2 > anInt2460) {
				var2 = anInt2460 - var0;
			}

			int var13 = 256 - var4;
			int var5 = (var3 >> 16 & 255) * var4;
			int var7 = (var3 >> 8 & 255) * var4;
			int var9 = (var3 & 255) * var4;
			int var12 = var0 + var1 * anInt2462;

			for (int var14 = 0; var14 < var2; var14++) {
				int var6 = (anIntArray2459[var12] >> 16 & 255) * var13;
				int var8 = (anIntArray2459[var12] >> 8 & 255) * var13;
				int var10 = (anIntArray2459[var12] & 255) * var13;
				int var11 = (var5 + var6 >> 8 << 16) + (var7 + var8 >> 8 << 8) + (var9 + var10 >> 8);
				anIntArray2459[var12++] = var11;
			}

		}
	}

	public static void method2876(int var0, int var1, int var2, int var3) {
		if (var0 >= anInt2464 && var0 < anInt2460) {
			if (var1 < anInt2465) {
				var2 -= anInt2465 - var1;
				var1 = anInt2465;
			}

			if (var1 + var2 > anInt2463) {
				var2 = anInt2463 - var1;
			}

			int var5 = var0 + var1 * anInt2462;

			for (int var4 = 0; var4 < var2; var4++) {
				anIntArray2459[var5 + var4 * anInt2462] = var3;
			}

		}
	}

	public static void method2877(int var0, int var1, int var2, int var3, int var4) {
		if (var0 < anInt2464) {
			var2 -= anInt2464 - var0;
			var0 = anInt2464;
		}

		if (var1 < anInt2465) {
			var3 -= anInt2465 - var1;
			var1 = anInt2465;
		}

		if (var0 + var2 > anInt2460) {
			var2 = anInt2460 - var0;
		}

		if (var1 + var3 > anInt2463) {
			var3 = anInt2463 - var1;
		}

		int var7 = anInt2462 - var2;
		int var6 = var0 + var1 * anInt2462;

		for (int var5 = -var3; var5 < 0; var5++) {
			for (int var8 = -var2; var8 < 0; var8++) {
				anIntArray2459[var6++] = var4;
			}

			var6 += var7;
		}

	}

	public static void method2879(int var0, int var1, int var2, int[] var3, int[] var4) {
		int var5 = var0 + var1 * anInt2462;

		for (var1 = 0; var1 < var3.length; var1++) {
			int var6 = var5 + var3[var1];

			for (var0 = -var4[var1]; var0 < 0; var0++) {
				anIntArray2459[var6++] = var2;
			}

			var5 += anInt2462;
		}

	}

	public static void method2880(int[] var0) {
		var0[0] = anInt2464;
		var0[1] = anInt2465;
		var0[2] = anInt2460;
		var0[3] = anInt2463;
	}

	public static void method2883() {
		int var0 = 0;

		int var1;
		for (var1 = anInt2462 * anInt2461 - 7; var0 < var1; anIntArray2459[var0++] = 0) {
			anIntArray2459[var0++] = 0;
			anIntArray2459[var0++] = 0;
			anIntArray2459[var0++] = 0;
			anIntArray2459[var0++] = 0;
			anIntArray2459[var0++] = 0;
			anIntArray2459[var0++] = 0;
			anIntArray2459[var0++] = 0;
		}

		for (var1 += 7; var0 < var1; anIntArray2459[var0++] = 0) {
			;
		}

	}

	static void method2890(int var0, int var1, int var2, int var3, int var4) {
		if (var0 >= anInt2464 && var0 < anInt2460) {
			if (var1 < anInt2465) {
				var2 -= anInt2465 - var1;
				var1 = anInt2465;
			}

			if (var1 + var2 > anInt2463) {
				var2 = anInt2463 - var1;
			}

			int var12 = 256 - var4;
			int var5 = (var3 >> 16 & 255) * var4;
			int var7 = (var3 >> 8 & 255) * var4;
			int var9 = (var3 & 255) * var4;
			int var13 = var0 + var1 * anInt2462;

			for (int var14 = 0; var14 < var2; var14++) {
				int var6 = (anIntArray2459[var13] >> 16 & 255) * var12;
				int var8 = (anIntArray2459[var13] >> 8 & 255) * var12;
				int var10 = (anIntArray2459[var13] & 255) * var12;
				int var11 = (var5 + var6 >> 8 << 16) + (var7 + var8 >> 8 << 8) + (var9 + var10 >> 8);
				anIntArray2459[var13] = var11;
				var13 += anInt2462;
			}

		}
	}

	public static void method2908(int var0, int var1, int var2, int var3, int var4) {
		var2 -= var0;
		var3 -= var1;
		if (var3 == 0) {
			if (var2 >= 0) {
				method2916(var0, var1, var2 + 1, var4);
			} else {
				method2916(var0 + var2, var1, -var2 + 1, var4);
			}

		} else if (var2 == 0) {
			if (var3 >= 0) {
				method2876(var0, var1, var3 + 1, var4);
			} else {
				method2876(var0, var1 + var3, -var3 + 1, var4);
			}

		} else {
			if (var2 + var3 < 0) {
				var0 += var2;
				var2 = -var2;
				var1 += var3;
				var3 = -var3;
			}

			int var5;
			int var6;
			if (var2 > var3) {
				var1 <<= 16;
				var1 += 32768;
				var3 <<= 16;
				var6 = (int) Math.floor((double) var3 / (double) var2 + 0.5D);
				var2 += var0;
				if (var0 < anInt2464) {
					var1 += var6 * (anInt2464 - var0);
					var0 = anInt2464;
				}

				if (var2 >= anInt2460) {
					var2 = anInt2460 - 1;
				}

				while (var0 <= var2) {
					var5 = var1 >> 16;
					if (var5 >= anInt2465 && var5 < anInt2463) {
						anIntArray2459[var0 + var5 * anInt2462] = var4;
					}

					var1 += var6;
					++var0;
				}
			} else {
				var0 <<= 16;
				var0 += 32768;
				var2 <<= 16;
				var6 = (int) Math.floor((double) var2 / (double) var3 + 0.5D);
				var3 += var1;
				if (var1 < anInt2465) {
					var0 += var6 * (anInt2465 - var1);
					var1 = anInt2465;
				}

				if (var3 >= anInt2463) {
					var3 = anInt2463 - 1;
				}

				while (var1 <= var3) {
					var5 = var0 >> 16;
					if (var5 >= anInt2464 && var5 < anInt2460) {
						anIntArray2459[var5 + var1 * anInt2462] = var4;
					}

					var0 += var6;
					++var1;
				}
			}

		}
	}

	public static void method2915(int var0, int var1, int var2, int var3) {
		if (anInt2464 < var0) {
			anInt2464 = var0;
		}

		if (anInt2465 < var1) {
			anInt2465 = var1;
		}

		if (anInt2460 > var2) {
			anInt2460 = var2;
		}

		if (anInt2463 > var3) {
			anInt2463 = var3;
		}

	}

	public static void method2916(int var0, int var1, int var2, int var3) {
		if (var1 >= anInt2465 && var1 < anInt2463) {
			if (var0 < anInt2464) {
				var2 -= anInt2464 - var0;
				var0 = anInt2464;
			}

			if (var0 + var2 > anInt2460) {
				var2 = anInt2460 - var0;
			}

			int var4 = var0 + var1 * anInt2462;

			for (int var5 = 0; var5 < var2; var5++) {
				anIntArray2459[var4 + var5] = var3;
			}

		}
	}

}
