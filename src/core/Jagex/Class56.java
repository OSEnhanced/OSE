package core.Jagex;
public final class Class56 {

	public static final String aString742 = "#";
	static final int anInt743 = 1;
	static byte aByte744;
	public static final int anInt745 = 84;
	public static final int anInt746 = 58;

	static void method852(Class117_Sub19 var0, int var1, int var2, int var3, int var4) {
		Class117_Sub13.method1989(-1001075450);
		Class117_Sub22_Sub21 var8 = var0.method2285(false, 1702698127);
		if (var8 != null) {
			Class117_Sub22_Sub17.method2871(var1, var2, var1 + var8.anInt2502 * 707865929, var8.anInt2500 * -1893173225 + var2);
			if (GameClient.anInt3155 * -1723858213 != 2 && GameClient.anInt3155 * -1723858213 != 5) {
				int var9 = GameClient.anInt2990 * -1810209603 + GameClient.anInt3005 * -1204229987 & 2047;
				int var10 = 48 + Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2577 * 1961555871 / 32;
				int var11 = 464 - Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2567 * -184603173 / 32;
				Class54.aClass117_Sub22_Sub17_Sub3_734.method3342(var1, var2, var8.anInt2502 * 707865929, var8.anInt2500 * -1893173225, var10, var11, var9, GameClient.anInt3202 * 138652733 + 256, var8.anIntArray2503, var8.anIntArray2501);

				int var5;
				int var12;
				int var14;
				for (var12 = 0; var12 < GameClient.anInt2968 * 1159091691; var12++) {
					var5 = 2 + GameClient.anIntArray3150[var12] * 4 - Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2577 * 1961555871 / 32;
					var14 = 2 + GameClient.anIntArray3127[var12] * 4 - Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2567 * -184603173 / 32;
					Class117_Sub22_Sub16.method2860(var1, var2, var5, var14, GameClient.aClass117_Sub22_Sub17_Sub3Array3152[var12], var8, -1951240720);
				}

				int var6;
				int var13;
				for (var12 = 0; var12 < 104; var12++) {
					for (var5 = 0; var5 < 104; var5++) {
						Class120 var21 = GameClient.aClass120ArrayArrayArray3051[Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421][var12][var5];
						if (var21 != null) {
							var13 = 2 + var12 * 4 - Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2577 * 1961555871 / 32;
							var6 = 2 + var5 * 4 - Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2567 * -184603173 / 32;
							Class117_Sub22_Sub16.method2860(var1, var2, var13, var6, Class52.aClass117_Sub22_Sub17_Sub3Array716[0], var8, -1717119516);
						}
					}
				}

				for (var12 = 0; var12 < GameClient.anInt2956 * -434472087; var12++) {
					Class117_Sub22_Sub18_Sub1_Sub1 var18 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[GameClient.anIntArray2957[var12]];
					if (var18 != null && var18.method3074(-126706481)) {
						Class117_Sub22_Sub5 var22 = var18.aClass117_Sub22_Sub5_2864;
						if (var22 != null && var22.anIntArray2210 != null) {
							var22 = var22.method2394(-1597878572);
						}

						if (var22 != null && var22.aBool2205 && var22.aBool2213) {
							var13 = var18.anInt2577 * 1961555871 / 32 - Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2577 * 1961555871 / 32;
							var6 = var18.anInt2567 * -184603173 / 32 - Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2567 * -184603173 / 32;
							Class117_Sub22_Sub16.method2860(var1, var2, var13, var6, Class52.aClass117_Sub22_Sub17_Sub3Array716[1], var8, -1898756259);
						}
					}
				}

				var12 = Class4.anInt46 * -1915182763;
				int[] var19 = Class4.anIntArray41;

				for (var14 = 0; var14 < var12; var14++) {
					Class117_Sub22_Sub18_Sub1_Sub2 var20 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var19[var14]];
					if (var20 != null && var20.method3074(-126706481) && !var20.aBool2883 && Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393 != var20) {
						var6 = var20.anInt2577 * 1961555871 / 32 - Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2577 * 1961555871 / 32;
						int var7 = var20.anInt2567 * -184603173 / 32 - Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2567 * -184603173 / 32;
						boolean var15 = false;
						if (Class84.method1141(var20.getPlayerName(), true, 2006421320)) {
							var15 = true;
						}

						boolean var16 = false;

						for (int var17 = 0; var17 < Class29.anInt362 * -562694677; var17++) {
							if (var20.getPlayerName().equals(Class117_Sub22_Sub18_Sub5.aClass117_Sub13Array2747[var17].aString1870)) {
								var16 = true;
								break;
							}
						}

						boolean var25 = false;
						if (Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2888 * 141366991 != 0 && var20.anInt2888 * 141366991 != 0 && var20.anInt2888 * 141366991 == Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2888 * 141366991) {
							var25 = true;
						}

						if (var15) {
							Class117_Sub22_Sub16.method2860(var1, var2, var6, var7, Class52.aClass117_Sub22_Sub17_Sub3Array716[3], var8, -2099173103);
						} else if (var25) {
							Class117_Sub22_Sub16.method2860(var1, var2, var6, var7, Class52.aClass117_Sub22_Sub17_Sub3Array716[4], var8, -2028725902);
						} else if (var16) {
							Class117_Sub22_Sub16.method2860(var1, var2, var6, var7, Class52.aClass117_Sub22_Sub17_Sub3Array716[5], var8, -1962726776);
						} else {
							Class117_Sub22_Sub16.method2860(var1, var2, var6, var7, Class52.aClass117_Sub22_Sub17_Sub3Array716[2], var8, -1684279547);
						}
					}
				}

				if (GameClient.anInt3095 * -949450207 != 0 && GameClient.anInt2923 * -488599663 % 20 < 10) {
					if (GameClient.anInt3095 * -949450207 == 1 && GameClient.anInt2914 * -488998301 >= 0 && GameClient.anInt2914 * -488998301 < GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942.length) {
						Class117_Sub22_Sub18_Sub1_Sub1 var23 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[GameClient.anInt2914 * -488998301];
						if (var23 != null) {
							var13 = var23.anInt2577 * 1961555871 / 32 - Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2577 * 1961555871 / 32;
							var6 = var23.anInt2567 * -184603173 / 32 - Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2567 * -184603173 / 32;
							Class117_Sub22_Sub18_Sub6.method3359(var1, var2, var13, var6, GameClient.aClass117_Sub22_Sub17_Sub3Array2996[1], var8, (byte) -53);
						}
					}

					if (GameClient.anInt3095 * -949450207 == 2) {
						var14 = GameClient.anInt2937 * -1455025036 - Class117_Sub22_Sub20.anInt2497 * -2116504388 + 2 - Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2577 * 1961555871 / 32;
						var13 = GameClient.anInt2938 * -769503180 - Class117_Sub22_Sub19.anInt2468 * 1207777508 + 2 - Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2567 * -184603173 / 32;
						Class117_Sub22_Sub18_Sub6.method3359(var1, var2, var14, var13, GameClient.aClass117_Sub22_Sub17_Sub3Array2996[1], var8, (byte) 64);
					}

					if (GameClient.anInt3095 * -949450207 == 10 && GameClient.anInt3167 * -2098929247 >= 0 && GameClient.anInt3167 * -2098929247 < GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041.length) {
						Class117_Sub22_Sub18_Sub1_Sub2 var24 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[GameClient.anInt3167 * -2098929247];
						if (var24 != null) {
							var13 = var24.anInt2577 * 1961555871 / 32 - Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2577 * 1961555871 / 32;
							var6 = var24.anInt2567 * -184603173 / 32 - Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2567 * -184603173 / 32;
							Class117_Sub22_Sub18_Sub6.method3359(var1, var2, var13, var6, GameClient.aClass117_Sub22_Sub17_Sub3Array2996[1], var8, (byte) -76);
						}
					}
				}

				if (GameClient.anInt3153 * -140834255 != 0) {
					var14 = GameClient.anInt3153 * -563337020 + 2 - Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2577 * 1961555871 / 32;
					var13 = 2 + GameClient.anInt3154 * 183343252 - Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2567 * -184603173 / 32;
					Class117_Sub22_Sub16.method2860(var1, var2, var14, var13, GameClient.aClass117_Sub22_Sub17_Sub3Array2996[0], var8, -1989413251);
				}

				if (!Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.aBool2883) {
					Class117_Sub22_Sub17.method2877(var8.anInt2502 * 707865929 / 2 + var1 - 1, var8.anInt2500 * -1893173225 / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Class117_Sub22_Sub17.method2879(var1, var2, 0, var8.anIntArray2503, var8.anIntArray2501);
			}

			GameClient.aBoolArray3062[var3] = true;
		}
	}

	Class56() throws Throwable {
		throw new Error();
	}

	static boolean method853(Class117_Sub19 var0, int var1) {
		int var2 = var0.anInt2018 * 2064823433;
		if (var2 == 205) {
			GameClient.anInt3101 = -178972094;
			return true;
		} else {
			int var3;
			int var4;
			if (var2 >= 300 && var2 <= 313) {
				var3 = (var2 - 300) / 2;
				var4 = var2 & 1;
				GameClient.aClass91_3193.method1190(var3, var4 == 1, (byte) 11);
			}

			if (var2 >= 314 && var2 <= 323) {
				var3 = (var2 - 314) / 2;
				var4 = var2 & 1;
				GameClient.aClass91_3193.method1191(var3, var4 == 1, 2046697728);
			}

			if (var2 == 324) {
				GameClient.aClass91_3193.method1192(false, (byte) -111);
			}

			if (var2 == 325) {
				GameClient.aClass91_3193.method1192(true, (byte) -44);
			}

			if (var2 == 326) {
				GameClient.aClass117_Sub14_Sub1_2961.method2932(7, -244676480);
				GameClient.aClass91_3193.method1210(GameClient.aClass117_Sub14_Sub1_2961, (short) -3554);
				return true;
			} else {
				return false;
			}
		}
	}

}
