package core.Jagex;
public class Class97 {

	static int[] anIntArray1128;
	static int[] anIntArray1126 = new int[32];
	public static int[] anIntArray1127;
	public static int[] anIntArray1129;

	Class97() throws Throwable {
		throw new Error();
	}

	static {
		int var1 = 2;

		for (int var0 = 0; var0 < 32; var0++) {
			anIntArray1126[var0] = var1 - 1;
			var1 += var1;
		}

		anIntArray1127 = new int[2000];
		anIntArray1129 = new int[2000];
	}

	static void method1256(int var0) {
		if (GameClient.anInt3160 * 1964479469 != Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421) {
			GameClient.anInt3160 = Class117_Sub22_Sub18_Sub3.anInt2629 * -1678398801;
			int var2 = Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421;
			int[] var3 = Class54.aClass117_Sub22_Sub17_Sub3_734.anIntArray2713;
			int var4 = var3.length;

			int var6;
			for (var6 = 0; var6 < var4; var6++) {
				var3[var6] = 0;
			}

			int var1;
			int var5;
			for (var6 = 1; var6 < 103; var6++) {
				var5 = 24628 + (103 - var6) * 2048;

				for (var1 = 1; var1 < 103; var1++) {
					if ((Class31.aByteArrayArrayArray401[var2][var1][var6] & 24) == 0) {
						Class117_Sub13.aClass42_1875.method571(var3, var5, 512, var2, var1, var6);
					}

					if (var2 < 3 && (Class31.aByteArrayArrayArray401[var2 + 1][var1][var6] & 8) != 0) {
						Class117_Sub13.aClass42_1875.method571(var3, var5, 512, var2 + 1, var1, var6);
					}

					var5 += 4;
				}
			}

			var6 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
			var5 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
			Class54.aClass117_Sub22_Sub17_Sub3_734.method3245();

			int var8;
			for (var1 = 1; var1 < 103; var1++) {
				for (var8 = 1; var8 < 103; var8++) {
					if ((Class31.aByteArrayArrayArray401[var2][var8][var1] & 24) == 0) {
						Class15.method315(var2, var8, var1, var6, var5, -675353951);
					}

					if (var2 < 3 && (Class31.aByteArrayArrayArray401[1 + var2][var8][var1] & 8) != 0) {
						Class15.method315(1 + var2, var8, var1, var6, var5, -489519626);
					}
				}
			}

			GameClient.anInt2968 = 0;

			for (var1 = 0; var1 < 104; var1++) {
				for (var8 = 0; var8 < 104; var8++) {
					int var12 = Class117_Sub13.aClass42_1875.method568(Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, var1, var8);
					if (var12 != 0) {
						var12 = var12 >> 14 & 32767;
						int var9 = Class63.method928(var12, 1822487515).anInt2374 * -563821895;
						if (var9 >= 0) {
							int var7 = var1;
							int var11 = var8;
							if (var9 != 22 && var9 != 29 && var9 != 34 && var9 != 36 && var9 != 46 && var9 != 47 && var9 != 48) {
								int[][] var14 = GameClient.aClass51Array3174[Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421].anIntArrayArray704;

								for (int var13 = 0; var13 < 10; var13++) {
									int var10 = (int) (Math.random() * 4.0D);
									if (var10 == 0 && var7 > 0 && var7 > var1 - 3 && (var14[var7 - 1][var11] & 19136776) == 0) {
										--var7;
									}

									if (var10 == 1 && var7 < 103 && var7 < var1 + 3 && (var14[1 + var7][var11] & 19136896) == 0) {
										++var7;
									}

									if (var10 == 2 && var11 > 0 && var11 > var8 - 3 && (var14[var7][var11 - 1] & 19136770) == 0) {
										--var11;
									}

									if (var10 == 3 && var11 < 103 && var11 < var8 + 3 && (var14[var7][var11 + 1] & 19136800) == 0) {
										++var11;
									}
								}
							}

							GameClient.aClass117_Sub22_Sub17_Sub3Array3152[GameClient.anInt2968 * 1159091691] = Class46.aClass117_Sub22_Sub17_Sub3Array626[var9];
							GameClient.anIntArray3150[GameClient.anInt2968 * 1159091691] = var7;
							GameClient.anIntArray3127[GameClient.anInt2968 * 1159091691] = var11;
							GameClient.anInt2968 -= 190043453;
						}
					}
				}
			}

			Class82.aClass8_979.method126(2112247700);
		}

	}

	public static String method1263(Class117_Sub14 var0, int var1) {
		String var5;
		try {
			int var2 = var0.method2111((byte) 55);
			if (var2 > 32767) {
				var2 = 32767;
			}

			byte[] var3 = new byte[var2];
			var0.anInt1880 += Class146.aClass61_1663.method917(var0.aByteArray1885, var0.anInt1880 * 561453169, var3, 0, var2, 558993674) * -2079217519;
			String var4 = Class117_Sub22_Sub9.method2518(var3, 0, var2, -2131097412);
			var5 = var4;
		} catch (Exception var6) {
			var5 = "Cabbage";
		}

		return var5;
	}

}
