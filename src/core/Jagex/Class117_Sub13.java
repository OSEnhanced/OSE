package core.Jagex;
import java.awt.*;

public class Class117_Sub13 extends Class117 {

	public static final int anInt1864 = 19;
	String aString1865;
	int anInt1866;
	byte aByte1867;
	static Class106_Sub1 aClass106_Sub1_1868;
	public static final int anInt1869 = 5000;
	String aString1870;
	static Class117_Sub2_Sub1 aClass117_Sub2_Sub1_1871;
	static final int anInt1872 = 103;
	protected static String aString1873;
	public static final int anInt1874 = 198;
	static Class42 aClass42_1875;
	public static final int anInt1876 = 251;

	static void method1989(int var0) {
		if (Class24.aClass14_305 != null) {
			Class24.aClass14_305.method242((short) -10339);
		}

		if (Class17.aClass14_210 != null) {
			Class17.aClass14_210.method242((short) -15555);
		}

	}

	static void method1990(String var0, boolean var1, int var2) {
		if (var0 != null) {
			if ((GameClient.anInt2976 * -178563241 < 100 || GameClient.anInt3043 * 1688753487 == 1) && GameClient.anInt2976 * -178563241 < 400) {
				String var5 = Class32.method472(var0, Class54.aClass137_729, 1538480085);
				if (var5 != null) {
					String var4;
					String var6;
					int var7;
					for (var7 = 0; var7 < GameClient.anInt2976 * -178563241; var7++) {
						Class43 var3 = GameClient.aClass43Array3192[var7];
						var6 = Class32.method472(var3.aString581, Class54.aClass137_729, 1538480085);
						if (var6 != null && var6.equals(var5)) {
							Class117_Sub22_Sub1.method2353(31, "", var0 + Class108.aString1369, 862292356);
							return;
						}

						if (var3.aString588 != null) {
							var4 = Class32.method472(var3.aString588, Class54.aClass137_729, 1538480085);
							if (var4 != null && var4.equals(var5)) {
								Class117_Sub22_Sub1.method2353(31, "", var0 + Class108.aString1369, 992538726);
								return;
							}
						}
					}

					for (var7 = 0; var7 < GameClient.anInt3198 * -1278614973; var7++) {
						Class49 var8 = GameClient.aClass49Array3098[var7];
						var6 = Class32.method472(var8.aString660, Class54.aClass137_729, 1538480085);
						if (var6 != null && var6.equals(var5)) {
							Class117_Sub22_Sub1.method2353(31, "", Class108.aString1374 + var0 + Class108.aString1375, 814283653);
							return;
						}

						if (var8.aString656 != null) {
							var4 = Class32.method472(var8.aString656, Class54.aClass137_729, 1538480085);
							if (var4 != null && var4.equals(var5)) {
								Class117_Sub22_Sub1.method2353(31, "", Class108.aString1374 + var0 + Class108.aString1375, 1855411446);
								return;
							}
						}
					}

					if (Class32.method472(Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.getPlayerName(), Class54.aClass137_729, 1538480085).equals(var5)) {
						Class117_Sub22_Sub1.method2353(31, "", Class108.aString1371, 1022850990);
					} else {
						GameClient.aClass117_Sub14_Sub1_2961.method2932(255, 1254148484);
						GameClient.aClass117_Sub14_Sub1_2961.method2126(Class37.method517(var0, 310016611), 2079149138);
						GameClient.aClass117_Sub14_Sub1_2961.method2001(var0, 1857025792);
					}
				}
			} else {
				Class117_Sub22_Sub1.method2353(31, "", Class108.aString1366, 1723081313);
			}
		}
	}

	static void method1991(Class117_Sub22_Sub17_Sub4_Sub1 var0, Class117_Sub22_Sub17_Sub4_Sub1 var1, Class117_Sub22_Sub17_Sub4_Sub1 var2, boolean var3, byte var4) {
		if (var3) {
			Class6.anInt79 = (Class80.anInt952 * 1566500665 - GameClient.anInt3134 * 1311467871) / 2 * -1528604881;
			Class6.anInt66 = Class6.anInt79 * 1173653371 - 1064817262;
		}

		int var6;
		int var8;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var28;
		int var32;
		int var34;
		byte var37;
		if (Class6.aBool58) {
			if (Class40.aClass117_Sub22_Sub17_Sub3Array497 == null) {
				Class40.aClass117_Sub22_Sub17_Sub3Array497 = GameClient.method3952(aClass106_Sub1_1868, "sl_back", "", -1494156856);
			}

			if (Class20.aClass117_Sub22_Sub17_Sub2Array231 == null) {
				Class20.aClass117_Sub22_Sub17_Sub2Array231 = Class17.method337(aClass106_Sub1_1868, "sl_flags", "", -1635416033);
			}

			if (Class46.aClass117_Sub22_Sub17_Sub2Array629 == null) {
				Class46.aClass117_Sub22_Sub17_Sub2Array629 = Class17.method337(aClass106_Sub1_1868, "sl_arrows", "", -1904161185);
			}

			if (Class28.aClass117_Sub22_Sub17_Sub2Array356 == null) {
				Class28.aClass117_Sub22_Sub17_Sub2Array356 = Class17.method337(aClass106_Sub1_1868, "sl_stars", "", -1778309231);
			}

			Class117_Sub22_Sub17.method2877(Class6.anInt79 * 1053511631, 23, 765, 480, 0);
			Class117_Sub22_Sub17.method2866(Class6.anInt79 * 1053511631, 0, 125, 23, 12425273, 9135624);
			Class117_Sub22_Sub17.method2866(Class6.anInt79 * 1053511631 + 125, 0, 640, 23, 5197647, 2697513);
			var0.method3530(Class108.aString1292, Class6.anInt79 * 1053511631 + 62, 15, 0, -1);
			if (Class28.aClass117_Sub22_Sub17_Sub2Array356 != null) {
				Class28.aClass117_Sub22_Sub17_Sub2Array356[1].method3239(140 + Class6.anInt79 * 1053511631, 1);
				var1.method3471(Class108.aString1226, Class6.anInt79 * 1053511631 + 152, 10, 16777215, -1);
				Class28.aClass117_Sub22_Sub17_Sub2Array356[0].method3239(140 + Class6.anInt79 * 1053511631, 12);
				var1.method3471(Class108.aString1465, 152 + Class6.anInt79 * 1053511631, 21, 16777215, -1);
			}

			if (Class46.aClass117_Sub22_Sub17_Sub2Array629 != null) {
				var28 = Class6.anInt79 * 1053511631 + 280;
				if (Class24.anIntArray297[0] == 0 && Class24.anIntArray304[0] == 0) {
					Class46.aClass117_Sub22_Sub17_Sub2Array629[2].method3239(var28, 4);
				} else {
					Class46.aClass117_Sub22_Sub17_Sub2Array629[0].method3239(var28, 4);
				}

				if (Class24.anIntArray297[0] == 0 && Class24.anIntArray304[0] == 1) {
					Class46.aClass117_Sub22_Sub17_Sub2Array629[3].method3239(var28 + 15, 4);
				} else {
					Class46.aClass117_Sub22_Sub17_Sub2Array629[1].method3239(var28 + 15, 4);
				}

				var0.method3471(Class108.aString1466, var28 + 32, 17, 16777215, -1);
				var6 = Class6.anInt79 * 1053511631 + 390;
				if (Class24.anIntArray297[0] == 1 && Class24.anIntArray304[0] == 0) {
					Class46.aClass117_Sub22_Sub17_Sub2Array629[2].method3239(var6, 4);
				} else {
					Class46.aClass117_Sub22_Sub17_Sub2Array629[0].method3239(var6, 4);
				}

				if (Class24.anIntArray297[0] == 1 && Class24.anIntArray304[0] == 1) {
					Class46.aClass117_Sub22_Sub17_Sub2Array629[3].method3239(15 + var6, 4);
				} else {
					Class46.aClass117_Sub22_Sub17_Sub2Array629[1].method3239(var6 + 15, 4);
				}

				var0.method3471(Class108.aString1467, var6 + 32, 17, 16777215, -1);
				var32 = Class6.anInt79 * 1053511631 + 500;
				if (Class24.anIntArray297[0] == 2 && Class24.anIntArray304[0] == 0) {
					Class46.aClass117_Sub22_Sub17_Sub2Array629[2].method3239(var32, 4);
				} else {
					Class46.aClass117_Sub22_Sub17_Sub2Array629[0].method3239(var32, 4);
				}

				if (Class24.anIntArray297[0] == 2 && Class24.anIntArray304[0] == 1) {
					Class46.aClass117_Sub22_Sub17_Sub2Array629[3].method3239(15 + var32, 4);
				} else {
					Class46.aClass117_Sub22_Sub17_Sub2Array629[1].method3239(var32 + 15, 4);
				}

				var0.method3471(Class108.aString1436, var32 + 32, 17, 16777215, -1);
				var8 = 610 + Class6.anInt79 * 1053511631;
				if (Class24.anIntArray297[0] == 3 && Class24.anIntArray304[0] == 0) {
					Class46.aClass117_Sub22_Sub17_Sub2Array629[2].method3239(var8, 4);
				} else {
					Class46.aClass117_Sub22_Sub17_Sub2Array629[0].method3239(var8, 4);
				}

				if (Class24.anIntArray297[0] == 3 && Class24.anIntArray304[0] == 1) {
					Class46.aClass117_Sub22_Sub17_Sub2Array629[3].method3239(var8 + 15, 4);
				} else {
					Class46.aClass117_Sub22_Sub17_Sub2Array629[1].method3239(15 + var8, 4);
				}

				var0.method3471(Class108.aString1469, var8 + 32, 17, 16777215, -1);
			}

			Class117_Sub22_Sub17.method2877(708 + Class6.anInt79 * 1053511631, 4, 50, 16, 0);
			var1.method3530(Class108.aString1367, Class6.anInt79 * 1053511631 + 708 + 25, 16, 16777215, -1);
			var28 = 0;
			var6 = 33554432;
			var32 = GameClient.anInt3087 * 1930087115 & var6;

			for (var8 = 0; var8 < Class24.anInt293 * -2027355585; var8++) {
				Class24 var35 = Class24.aClass24Array290[var8];
				if ((var35.anInt299 * 59607667 & var6) == var32 || (var35.anInt299 * 59607667 & var6) == 0) {
					++var28;
				}
			}

			Class6.anInt63 = -348926655;
			if (Class40.aClass117_Sub22_Sub17_Sub3Array497 != null) {
				var37 = 88;
				byte var36 = 19;
				var34 = 765 / (1 + var37);
				var11 = 480 / (1 + var36);

				do {
					var12 = var11;
					var13 = var34;
					if (var11 * (var34 - 1) >= var28) {
						--var34;
					}

					if (var34 * (var11 - 1) >= var28) {
						--var11;
					}

					if ((var11 - 1) * var34 >= var28) {
						--var11;
					}
				} while (var11 != var12 || var34 != var13);

				var12 = (765 - var34 * var37) / (1 + var34);
				if (var12 > 5) {
					var12 = 5;
				}

				var13 = (480 - var11 * var36) / (1 + var11);
				if (var13 > 5) {
					var13 = 5;
				}

				var14 = (765 - var37 * var34 - (var34 - 1) * var12) / 2;
				var15 = (480 - var11 * var36 - (var11 - 1) * var13) / 2;
				int var16 = 23 + var15;
				int var17 = Class6.anInt79 * 1053511631 + var14;
				int var18 = 0;
				boolean var19 = false;

				int var20;
				for (var20 = 0; var20 < Class24.anInt293 * -2027355585; var20++) {
					Class24 var21 = Class24.aClass24Array290[var20];
					if ((var21.anInt299 * 59607667 & var6) == var32 || (var21.anInt299 * 59607667 & var6) == 0) {
						boolean var22 = true;
						String var23 = Integer.toString(var21.anInt300 * -1696774655);
						if (var21.anInt300 * -1696774655 == -1) {
							var23 = Class108.aString1470;
							var22 = false;
						} else if (var21.anInt300 * -1696774655 > 1980) {
							var23 = Class108.aString1471;
							var22 = false;
						}

						byte var24;
						if (var21.method391(-483983822)) {
							if (var21.method371(1640588)) {
								var24 = 3;
							} else {
								var24 = 2;
							}
						} else if (var21.method371(1640588)) {
							var24 = 1;
						} else {
							var24 = 0;
						}

						if (Class75.anInt903 * -456706193 >= var17 && Class75.anInt904 * 1381104939 >= var16 && Class75.anInt903 * -456706193 < var37 + var17 && Class75.anInt904 * 1381104939 < var16 + var36 && var22) {
							Class6.anInt63 = var20 * 348926655;
							Class40.aClass117_Sub22_Sub17_Sub3Array497[var24].method3259(var17, var16, 128, 16777215);
							var19 = true;
						} else {
							Class40.aClass117_Sub22_Sub17_Sub3Array497[var24].method3242(var17, var16);
						}

						if (Class20.aClass117_Sub22_Sub17_Sub2Array231 != null) {
							Class20.aClass117_Sub22_Sub17_Sub2Array231[(var21.method371(1640588) ? 8 : 0) + var21.anInt303 * 1839043337].method3239(29 + var17, var16);
						}

						var0.method3530(Integer.toString(var21.anInt294 * 571351125), 15 + var17, var36 / 2 + var16 + 5, 0, -1);
						var1.method3530(var23, 60 + var17, var16 + var36 / 2 + 5, 268435455, -1);
						var16 += var13 + var36;
						++var18;
						if (var18 >= var11) {
							var16 = var15 + 23;
							var17 += var12 + var37;
							var18 = 0;
						}
					}
				}

				if (var19) {
					var20 = var1.method3454(Class24.aClass24Array290[Class6.anInt63 * 945306943].aString302) + 6;
					int var41 = var1.anInt2854 + 8;
					Class117_Sub22_Sub17.method2877(Class75.anInt903 * -456706193 - var20 / 2, 5 + Class75.anInt904 * 1381104939 + 20, var20, var41, 16777120);
					Class117_Sub22_Sub17.method2872(Class75.anInt903 * -456706193 - var20 / 2, Class75.anInt904 * 1381104939 + 20 + 5, var20, var41, 0);
					var1.method3530(Class24.aClass24Array290[Class6.anInt63 * 945306943].aString302, Class75.anInt903 * -456706193, 4 + var1.anInt2854 + 5 + Class75.anInt904 * 1381104939 + 20, 0, -1);
				}
			}

			try {
				Graphics var38 = Class91.aCanvas1085.getGraphics();
				Class82.aClass8_979.method122(var38, 0, 0, 2112330330);
			} catch (Exception var25) {
				Class91.aCanvas1085.repaint();
			}

		} else {
			if (var3) {
				Class114_Sub1.aClass117_Sub22_Sub17_Sub3_1672.method3242(Class6.anInt79 * 1053511631, 0);
				Class29.aClass117_Sub22_Sub17_Sub3_374.method3242(382 + Class6.anInt79 * 1053511631, 0);
				Class117_Sub15.aClass117_Sub22_Sub17_Sub2_1901.method3239(382 + Class6.anInt79 * 1053511631 - Class117_Sub15.aClass117_Sub22_Sub17_Sub2_1901.anInt2707 / 2, 18);
			}

			if (GameClient.anInt2924 * 935215971 == 0 || GameClient.anInt2924 * 935215971 == 5) {
				byte var5 = 20;
				var0.method3530(Class108.aString1410, Class6.anInt66 * -582828355 + 180, 245 - var5, 16777215, -1);
				var6 = 253 - var5;
				Class117_Sub22_Sub17.method2872(180 + Class6.anInt66 * -582828355 - 152, var6, 304, 34, 9179409);
				Class117_Sub22_Sub17.method2872(180 + Class6.anInt66 * -582828355 - 151, 1 + var6, 302, 32, 0);
				Class117_Sub22_Sub17.method2877(180 + Class6.anInt66 * -582828355 - 150, 2 + var6, Class6.anInt69 * 1063266567, 30, 9179409);
				Class117_Sub22_Sub17.method2877(Class6.anInt69 * 1063266567 + (Class6.anInt66 * -582828355 + 180 - 150), 2 + var6, 300 - Class6.anInt69 * 1063266567, 30, 0);
				var0.method3530(Class6.aString70, Class6.anInt66 * -582828355 + 180, 276 - var5, 16777215, -1);
			}

			String var7;
			short var27;
			short var29;
			if (GameClient.anInt2924 * 935215971 == 20) {
				Class6.aClass117_Sub22_Sub17_Sub2_84.method3239(Class6.anInt66 * -582828355 + 180 - Class6.aClass117_Sub22_Sub17_Sub2_84.anInt2707 / 2, 271 - Class6.aClass117_Sub22_Sub17_Sub2_84.anInt2705 / 2);
				var27 = 211;
				var0.method3530(Class6.aString59, Class6.anInt66 * -582828355 + 180, var27, 16776960, 0);
				var28 = var27 + 15;
				var0.method3530(Class6.aString73, Class6.anInt66 * -582828355 + 180, var28, 16776960, 0);
				var28 += 15;
				var0.method3530(Class6.aString74, Class6.anInt66 * -582828355 + 180, var28, 16776960, 0);
				var28 += 15;
				var28 += 10;
				if (Class6.anInt57 * 1863798165 != 4) {
					var0.method3471(Class108.aString1429, Class6.anInt66 * -582828355 + 180 - 110, var28, 16777215, 0);
					var29 = 200;

					for (var7 = Class6.aString75; var0.method3454(var7) > var29; var7 = var7.substring(0, var7.length() - 1)) {
						;
					}

					var0.method3471(Class117_Sub22_Sub17_Sub4.method3458(var7), 180 + Class6.anInt66 * -582828355 - 70, var28, 16777215, 0);
					var28 += 15;
					var0.method3471(Class108.aString1411 + Class73_Sub2.method2221(Class6.aString76, 1710781872), 180 + Class6.anInt66 * -582828355 - 108, var28, 16777215, 0);
					var28 += 15;
				}
			}

			int var33;
			if (GameClient.anInt2924 * 935215971 == 10 || GameClient.anInt2924 * 935215971 == 11) {
				Class6.aClass117_Sub22_Sub17_Sub2_84.method3239(Class6.anInt66 * -582828355, 171);
				short var30;
				if (Class6.anInt57 * 1863798165 == 0) {
					var27 = 251;
					var0.method3530(Class108.aString1271, Class6.anInt66 * -582828355 + 180, var27, 16776960, 0);
					var28 = var27 + 30;
					var6 = Class6.anInt66 * -582828355 + 180 - 80;
					var30 = 291;
					Class6.aClass117_Sub22_Sub17_Sub2_60.method3239(var6 - 73, var30 - 20);
					var0.method3461(Class108.aString1407, var6 - 73, var30 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var6 = Class6.anInt66 * -582828355 + 180 + 80;
					Class6.aClass117_Sub22_Sub17_Sub2_60.method3239(var6 - 73, var30 - 20);
					var0.method3461(Class108.aString1211, var6 - 73, var30 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Class6.anInt57 * 1863798165 == 1) {
					var0.method3530(Class108.aString1414, Class6.anInt66 * -582828355 + 180, 211, 16776960, 0);
					var27 = 236;
					var0.method3530(Class6.aString59, Class6.anInt66 * -582828355 + 180, var27, 16777215, 0);
					var28 = var27 + 15;
					var0.method3530(Class6.aString73, Class6.anInt66 * -582828355 + 180, var28, 16777215, 0);
					var28 += 15;
					var0.method3530(Class6.aString74, Class6.anInt66 * -582828355 + 180, var28, 16777215, 0);
					var28 += 15;
					var6 = Class6.anInt66 * -582828355 + 180 - 80;
					var30 = 321;
					Class6.aClass117_Sub22_Sub17_Sub2_60.method3239(var6 - 73, var30 - 20);
					var0.method3530(Class108.aString1205, var6, 5 + var30, 16777215, 0);
					var6 = 80 + Class6.anInt66 * -582828355 + 180;
					Class6.aClass117_Sub22_Sub17_Sub2_60.method3239(var6 - 73, var30 - 20);
					var0.method3530(Class108.aString1367, var6, var30 + 5, 16777215, 0);
				} else {
					short var9;
					if (Class6.anInt57 * 1863798165 == 2) {
						var27 = 211;
						var0.method3530(Class6.aString59, 180 + Class6.anInt66 * -582828355, var27, 16776960, 0);
						var28 = var27 + 15;
						var0.method3530(Class6.aString73, Class6.anInt66 * -582828355 + 180, var28, 16776960, 0);
						var28 += 15;
						var0.method3530(Class6.aString74, Class6.anInt66 * -582828355 + 180, var28, 16776960, 0);
						var28 += 15;
						var28 += 10;
						var0.method3471(Class108.aString1429, 180 + Class6.anInt66 * -582828355 - 110, var28, 16777215, 0);
						var29 = 200;

						for (var7 = Class6.aString75; var0.method3454(var7) > var29; var7 = var7.substring(1)) {
							;
						}

						var0.method3471(Class117_Sub22_Sub17_Sub4.method3458(var7) + (Class6.anInt72 * -491439835 == 0 & GameClient.anInt2923 * -488599663 % 40 < 20 ? Class117_Sub22_Sub12.method2584(16776960, 668388556) + Class39.aString477 : ""), 180 + Class6.anInt66 * -582828355 - 70, var28, 16777215, 0);
						var28 += 15;
						var0.method3471(Class108.aString1411 + Class73_Sub2.method2221(Class6.aString76, -936803394) + (Class6.anInt72 * -491439835 == 1 & GameClient.anInt2923 * -488599663 % 40 < 20 ? Class117_Sub22_Sub12.method2584(16776960, 668388556) + Class39.aString477 : ""), 180 + Class6.anInt66 * -582828355 - 108, var28, 16777215, 0);
						var28 += 15;
						var8 = Class6.anInt66 * -582828355 + 180 - 80;
						var9 = 321;
						Class6.aClass117_Sub22_Sub17_Sub2_60.method3239(var8 - 73, var9 - 20);
						var0.method3530(Class108.aString1383, var8, 5 + var9, 16777215, 0);
						var8 = Class6.anInt66 * -582828355 + 180 + 80;
						Class6.aClass117_Sub22_Sub17_Sub2_60.method3239(var8 - 73, var9 - 20);
						var0.method3530(Class108.aString1367, var8, var9 + 5, 16777215, 0);
						var27 = 357;
						var1.method3530(Class108.aString1437, 180 + Class6.anInt66 * -582828355, var27, 16776960, 0);
					} else if (Class6.anInt57 * 1863798165 == 4) {
						var0.method3530(Class108.aString1424, Class6.anInt66 * -582828355 + 180, 211, 16776960, 0);
						var27 = 236;
						var0.method3530(Class6.aString59, Class6.anInt66 * -582828355 + 180, var27, 16777215, 0);
						var28 = var27 + 15;
						var0.method3530(Class6.aString73, 180 + Class6.anInt66 * -582828355, var28, 16777215, 0);
						var28 += 15;
						var0.method3530(Class6.aString74, Class6.anInt66 * -582828355 + 180, var28, 16777215, 0);
						var28 += 15;
						var0.method3471(Class108.aString1431 + Class73_Sub2.method2221(Class6.aString80, 1832732317) + (GameClient.anInt2923 * -488599663 % 40 < 20 ? Class117_Sub22_Sub12.method2584(16776960, 668388556) + Class39.aString477 : ""), Class6.anInt66 * -582828355 + 180 - 108, var28, 16777215, 0);
						var28 -= 8;
						var0.method3471(Class108.aString1320, 180 + Class6.anInt66 * -582828355 - 9, var28, 16776960, 0);
						var28 += 15;
						var0.method3471(Class108.aString1208, Class6.anInt66 * -582828355 + 180 - 9, var28, 16776960, 0);
						var6 = 180 + Class6.anInt66 * -582828355 - 9 + var0.method3454(Class108.aString1208) + 15;
						var32 = var28 - var0.anInt2854;
						Class117_Sub22_Sub17_Sub2 var31;
						if (Class6.aBool78) {
							var31 = Class29.aClass117_Sub22_Sub17_Sub2_367;
						} else {
							var31 = Class46.aClass117_Sub22_Sub17_Sub2_628;
						}

						var31.method3239(var6, var32);
						var28 += 15;
						var33 = Class6.anInt66 * -582828355 + 180 - 80;
						short var10 = 321;
						Class6.aClass117_Sub22_Sub17_Sub2_60.method3239(var33 - 73, var10 - 20);
						var0.method3530(Class108.aString1205, var33, 5 + var10, 16777215, 0);
						var33 = Class6.anInt66 * -582828355 + 180 + 80;
						Class6.aClass117_Sub22_Sub17_Sub2_60.method3239(var33 - 73, var10 - 20);
						var0.method3530(Class108.aString1367, var33, var10 + 5, 16777215, 0);
						var1.method3530(Class108.aString1425, Class6.anInt66 * -582828355 + 180, var10 + 36, 255, 0);
					} else if (Class6.anInt57 * 1863798165 == 5) {
						var0.method3530(Class108.aString1438, Class6.anInt66 * -582828355 + 180, 201, 16776960, 0);
						var27 = 221;
						var2.method3530(Class6.aString59, Class6.anInt66 * -582828355 + 180, var27, 16776960, 0);
						var28 = var27 + 15;
						var2.method3530(Class6.aString73, Class6.anInt66 * -582828355 + 180, var28, 16776960, 0);
						var28 += 15;
						var2.method3530(Class6.aString74, 180 + Class6.anInt66 * -582828355, var28, 16776960, 0);
						var28 += 15;
						var28 += 14;
						var0.method3471(Class108.aString1299, 180 + Class6.anInt66 * -582828355 - 145, var28, 16777215, 0);
						var29 = 174;

						for (var7 = Class6.aString75; var0.method3454(var7) > var29; var7 = var7.substring(1)) {
							;
						}

						var0.method3471(Class117_Sub22_Sub17_Sub4.method3458(var7) + (GameClient.anInt2923 * -488599663 % 40 < 20 ? Class117_Sub22_Sub12.method2584(16776960, 668388556) + Class39.aString477 : ""), 180 + Class6.anInt66 * -582828355 - 34, var28, 16777215, 0);
						var28 += 15;
						var8 = 180 + Class6.anInt66 * -582828355 - 80;
						var9 = 321;
						Class6.aClass117_Sub22_Sub17_Sub2_60.method3239(var8 - 73, var9 - 20);
						var0.method3530(Class108.aString1459, var8, 5 + var9, 16777215, 0);
						var8 = 80 + 180 + Class6.anInt66 * -582828355;
						Class6.aClass117_Sub22_Sub17_Sub2_60.method3239(var8 - 73, var9 - 20);
						var0.method3530(Class108.aString1441, var8, 5 + var9, 16777215, 0);
					} else if (Class6.anInt57 * 1863798165 == 6) {
						var27 = 211;
						var0.method3530(Class6.aString59, 180 + Class6.anInt66 * -582828355, var27, 16776960, 0);
						var28 = var27 + 15;
						var0.method3530(Class6.aString73, 180 + Class6.anInt66 * -582828355, var28, 16776960, 0);
						var28 += 15;
						var0.method3530(Class6.aString74, 180 + Class6.anInt66 * -582828355, var28, 16776960, 0);
						var28 += 15;
						var6 = Class6.anInt66 * -582828355 + 180;
						var30 = 321;
						Class6.aClass117_Sub22_Sub17_Sub2_60.method3239(var6 - 73, var30 - 20);
						var0.method3530(Class108.aString1441, var6, 5 + var30, 16777215, 0);
					}
				}
			}

			if (Class6.anInt67 * 2066782945 > 0) {
				var28 = Class6.anInt67 * 2066782945;
				var29 = 256;
				Class6.anInt61 += var28 * 1163916672;
				if (Class6.anInt61 * 1305178307 > Class3.anIntArray30.length) {
					Class6.anInt61 -= Class3.anIntArray30.length * -1400193045;
					var32 = (int) (Math.random() * 12.0D);
					Class63.method931(Class138.aClass117_Sub22_Sub17_Sub2Array1621[var32], 2097355444);
				}

				var32 = 0;
				var8 = var28 * 128;
				var33 = (var29 - var28) * 128;

				for (var34 = 0; var34 < var33; var34++) {
					var11 = Class35.anIntArray444[var32 + var8] - var28 * Class3.anIntArray30[Class6.anInt61 * 1305178307 + var32 & Class3.anIntArray30.length - 1] / 6;
					if (var11 < 0) {
						var11 = 0;
					}

					Class35.anIntArray444[var32++] = var11;
				}

				for (var34 = var29 - var28; var34 < var29; var34++) {
					var11 = var34 * 128;

					for (var12 = 0; var12 < 128; var12++) {
						var13 = (int) (Math.random() * 100.0D);
						if (var13 < 50 && var12 > 10 && var12 < 118) {
							Class35.anIntArray444[var12 + var11] = 255;
						} else {
							Class35.anIntArray444[var12 + var11] = 0;
						}
					}
				}

				if (Class6.anInt71 * -351338959 > 0) {
					Class6.anInt71 -= var28 * -123311292;
				}

				if (Class6.anInt64 * 892642561 > 0) {
					Class6.anInt64 -= var28 * -2137953276;
				}

				if (Class6.anInt71 * -351338959 == 0 && Class6.anInt64 * 892642561 == 0) {
					var34 = (int) (Math.random() * (double) (2000 / var28));
					if (var34 == 0) {
						Class6.anInt71 = -1502919680;
					}

					if (var34 == 1) {
						Class6.anInt64 = -1855192064;
					}
				}

				for (var34 = 0; var34 < var29 - var28; var34++) {
					Class6.anIntArray62[var34] = Class6.anIntArray62[var28 + var34];
				}

				for (var34 = var29 - var28; var34 < var29; var34++) {
					Class6.anIntArray62[var34] = (int) (Math.sin((double) (Class6.anInt68 * -1511904477) / 14.0D) * 16.0D + Math.sin((double) (Class6.anInt68 * -1511904477) / 15.0D) * 14.0D + Math.sin((double) (Class6.anInt68 * -1511904477) / 16.0D) * 12.0D);
					Class6.anInt68 += 2057723019;
				}

				Class6.anInt65 += var28 * -56851743;
				var34 = ((GameClient.anInt2923 * -488599663 & 1) + var28) / 2;
				if (var34 > 0) {
					for (var11 = 0; var11 < Class6.anInt65 * -1887866652; var11++) {
						var12 = (int) (Math.random() * 124.0D) + 2;
						var13 = (int) (Math.random() * 128.0D) + 128;
						Class35.anIntArray444[(var13 << 7) + var12] = 192;
					}

					Class6.anInt65 = 0;
					var11 = 0;

					label527:
					while (true) {
						if (var11 >= var29) {
							var11 = 0;

							while (true) {
								if (var11 >= 128) {
									break label527;
								}

								var12 = 0;

								for (var13 = -var34; var13 < var29; var13++) {
									var14 = var13 * 128;
									if (var13 + var34 < var29) {
										var12 += Class1.anIntArray2[var11 + var14 + var34 * 128];
									}

									if (var13 - (var34 + 1) >= 0) {
										var12 -= Class1.anIntArray2[var14 + var11 - (var34 + 1) * 128];
									}

									if (var13 >= 0) {
										Class35.anIntArray444[var11 + var14] = var12 / (var34 * 2 + 1);
									}
								}

								++var11;
							}
						}

						var12 = 0;
						var13 = var11 * 128;

						for (var14 = -var34; var14 < 128; var14++) {
							if (var14 + var34 < 128) {
								var12 += Class35.anIntArray444[var34 + var13 + var14];
							}

							if (var14 - (1 + var34) >= 0) {
								var12 -= Class35.anIntArray444[var13 + var14 - (var34 + 1)];
							}

							if (var14 >= 0) {
								Class1.anIntArray2[var14 + var13] = var12 / (1 + var34 * 2);
							}
						}

						++var11;
					}
				}

				Class6.anInt67 = 0;
			}

			var27 = 256;
			if (Class6.anInt71 * -351338959 > 0) {
				for (var6 = 0; var6 < 256; var6++) {
					if (Class6.anInt71 * -351338959 > 768) {
						Class97.anIntArray1128[var6] = Class14.method243(Class43.anIntArray583[var6], Class117_Sub7.anIntArray1787[var6], 1024 - Class6.anInt71 * -351338959, 629596949);
					} else if (Class6.anInt71 * -351338959 > 256) {
						Class97.anIntArray1128[var6] = Class117_Sub7.anIntArray1787[var6];
					} else {
						Class97.anIntArray1128[var6] = Class14.method243(Class117_Sub7.anIntArray1787[var6], Class43.anIntArray583[var6], 256 - Class6.anInt71 * -351338959, 1612694688);
					}
				}
			} else if (Class6.anInt64 * 892642561 > 0) {
				for (var6 = 0; var6 < 256; var6++) {
					if (Class6.anInt64 * 892642561 > 768) {
						Class97.anIntArray1128[var6] = Class14.method243(Class43.anIntArray583[var6], Class117_Sub22_Sub4.anIntArray2178[var6], 1024 - Class6.anInt64 * 892642561, -803858248);
					} else if (Class6.anInt64 * 892642561 > 256) {
						Class97.anIntArray1128[var6] = Class117_Sub22_Sub4.anIntArray2178[var6];
					} else {
						Class97.anIntArray1128[var6] = Class14.method243(Class117_Sub22_Sub4.anIntArray2178[var6], Class43.anIntArray583[var6], 256 - Class6.anInt64 * 892642561, 1071436606);
					}
				}
			} else {
				for (var6 = 0; var6 < 256; var6++) {
					Class97.anIntArray1128[var6] = Class43.anIntArray583[var6];
				}
			}

			Class117_Sub22_Sub17.method2871(Class6.anInt79 * 1053511631, 9, Class6.anInt79 * 1053511631 + 128, var27 + 7);
			Class114_Sub1.aClass117_Sub22_Sub17_Sub3_1672.method3242(Class6.anInt79 * 1053511631, 0);
			Class117_Sub22_Sub17.method2863();
			var6 = 0;
			var32 = Class82.aClass8_979.anInt105 * 1105143371 + Class6.anInt79 * 1053511631;

			for (var8 = 1; var8 < var27 - 1; var8++) {
				var33 = Class6.anIntArray62[var8] * (var27 - var8) / var27;
				var34 = 22 + var33;
				if (var34 < 0) {
					var34 = 0;
				}

				var6 += var34;

				for (var11 = var34; var11 < 128; var11++) {
					var12 = Class35.anIntArray444[var6++];
					if (var12 != 0) {
						var13 = var12;
						var14 = 256 - var12;
						var12 = Class97.anIntArray1128[var12];
						var15 = Class82.aClass8_979.anIntArray107[var32];
						Class82.aClass8_979.anIntArray107[var32++] = (var13 * (var12 & 65280) + (var15 & 65280) * var14 & 16711680) + (var14 * (var15 & 16711935) + var13 * (var12 & 16711935) & -16711936) >> 8;
					} else {
						++var32;
					}
				}

				var32 += var34 + Class82.aClass8_979.anInt105 * -831643469 - 128;
			}

			Class117_Sub22_Sub17.method2871(765 + Class6.anInt79 * 1053511631 - 128, 9, Class6.anInt79 * 1053511631 + 765, var27 + 7);
			Class29.aClass117_Sub22_Sub17_Sub3_374.method3242(382 + Class6.anInt79 * 1053511631, 0);
			Class117_Sub22_Sub17.method2863();
			var6 = 0;
			var32 = Class6.anInt79 * 1053511631 + Class82.aClass8_979.anInt105 * 1105143371 + 24 + 637;

			for (var8 = 1; var8 < var27 - 1; var8++) {
				var33 = Class6.anIntArray62[var8] * (var27 - var8) / var27;
				var34 = 103 - var33;
				var32 += var33;

				for (var11 = 0; var11 < var34; var11++) {
					var12 = Class35.anIntArray444[var6++];
					if (var12 != 0) {
						var13 = var12;
						var14 = 256 - var12;
						var12 = Class97.anIntArray1128[var12];
						var15 = Class82.aClass8_979.anIntArray107[var32];
						Class82.aClass8_979.anIntArray107[var32++] = (var13 * (var12 & 16711935) + (var15 & 16711935) * var14 & -16711936) + (var14 * (var15 & 65280) + (var12 & 65280) * var13 & 16711680) >> 8;
					} else {
						++var32;
					}
				}

				var6 += 128 - var34;
				var32 += Class82.aClass8_979.anInt105 * -831643469 - var34 - var33;
			}

			Class29.aClass117_Sub22_Sub17_Sub2Array364[Class117_Sub22_Sub21.aClass33_2499.aBool420 ? 1 : 0].method3239(Class6.anInt79 * 1053511631 + 765 - 40, 463);
			if (GameClient.anInt2924 * 935215971 > 5 && GameClient.anInt2922 * 1063005447 == 0) {
				if (Class117_Sub9.aClass117_Sub22_Sub17_Sub2_1812 != null) {
					var28 = 5 + Class6.anInt79 * 1053511631;
					var29 = 463;
					byte var39 = 100;
					var37 = 35;
					Class117_Sub9.aClass117_Sub22_Sub17_Sub2_1812.method3239(var28, var29);
					var0.method3530(Class108.aString1365 + " " + GameClient.anInt2916 * 622074983, var39 / 2 + var28, var29 + var37 / 2 - 2, 16777215, 0);
					if (Class78.aClass41_935 != null) {
						var1.method3530(Class108.aString1472, var39 / 2 + var28, 12 + var37 / 2 + var29, 16777215, 0);
					} else {
						var1.method3530(Class108.aString1473, var28 + var39 / 2, var37 / 2 + var29 + 12, 16777215, 0);
					}
				} else {
					Class117_Sub9.aClass117_Sub22_Sub17_Sub2_1812 = Class58.method876(aClass106_Sub1_1868, "sl_button", "", (short) 1148);
				}
			}

			try {
				Graphics var40 = Class91.aCanvas1085.getGraphics();
				Class82.aClass8_979.method122(var40, 0, 0, 1107672971);
			} catch (Exception var26) {
				Class91.aCanvas1085.repaint();
			}

		}
	}

	public static Class117_Sub22_Sub6 method1992(int var0, int var1) {
		Class117_Sub22_Sub6 var2 = (Class117_Sub22_Sub6) Class117_Sub22_Sub6.aClass115_2247.method1515((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Class117_Sub22_Sub6.aClass106_2220.method1380(10, var0, (byte) 46);
			var2 = new Class117_Sub22_Sub6();
			var2.anInt2226 = var0 * -186496267;
			if (var3 != null) {
				var2.method2459(new Class117_Sub14(var3), -1061339178);
			}

			var2.method2418(-266516857);
			if (var2.anInt2259 * -1574477923 != -1) {
				var2.method2420(method1992(var2.anInt2259 * -1574477923, -1640414289), method1992(var2.anInt2258 * -98750407, 1900737308), -488599663);
			}

			if (var2.anInt2268 * -725283813 != -1) {
				var2.method2417(method1992(var2.anInt2268 * -725283813, 1853291061), method1992(var2.anInt2267 * 1858327633, 384922667), -1810289475);
			}

			if (!Class7.aBool100 && var2.aBool2241) {
				var2.aString2264 = Class108.aString1341;
				var2.aBool2228 = false;
				var2.aStringArray2242 = null;
				var2.aStringArray2243 = null;
				var2.anInt2265 = 0;
			}

			Class117_Sub22_Sub6.aClass115_2247.method1517(var2, (long) var0);
			return var2;
		}
	}

}
