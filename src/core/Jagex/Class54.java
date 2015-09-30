package core.Jagex;
public abstract class Class54 {

	public int anInt728;
	static Class137 aClass137_729;
	public int anInt730;
	public int anInt731;
	static final int anInt732 = 23;
	public static final int anInt733 = 138;
	static int anInt735;
	public int anInt736;
	static int anInt737;
	static Class117_Sub22_Sub17_Sub3 aClass117_Sub22_Sub17_Sub3_734;

	public static void method845(int var0) {
		try {
			Class74.aClass145_887.method1803((byte) -36);

			for (int var1 = 0; var1 < Class74.anInt884 * 1676709307; var1++) {
				Class117_Sub10.aClass145Array1839[var1].method1803((byte) -4);
			}

			Class74.aClass145_894.method1803((byte) -111);
			Class74.aClass145_886.method1803((byte) -73);
		} catch (Exception var2) {
			;
		}

	}

	protected abstract boolean method847(int var1, int var2, int var3, Class51 var4, int var5);

	static void method849(int var0) {
		int var1;
		if (GameClient.anInt2943 * 1744152389 == 0) {
			Class117_Sub13.aClass42_1875 = new Class42(4, 104, 104, Class31.anIntArrayArrayArray381);

			for (var1 = 0; var1 < 4; var1++) {
				GameClient.aClass51Array3174[var1] = new Class51(104, 104);
			}

			aClass117_Sub22_Sub17_Sub3_734 = new Class117_Sub22_Sub17_Sub3(512, 512);
			Class6.aString70 = Class108.aString1212;
			Class6.anInt69 = 2146850489;
			GameClient.anInt2943 = 1717864196;
		} else {
			int var4;
			int var5;
			int var21;
			int var24;
			if (GameClient.anInt2943 * 1744152389 == 20) {
				int[] var34 = new int[9];

				for (var21 = 0; var21 < 9; var21++) {
					var24 = var21 * 32 + 128 + 15;
					var5 = var24 * 3 + 600;
					var4 = Class117_Sub22_Sub17_Sub1.anIntArray2653[var24];
					var34[var21] = var4 * var5 >> 16;
				}

				Class42.method694(var34, 500, 800, 512, 334);
				Class6.aString70 = Class108.aString1213;
				Class6.anInt69 = -1266318;
				GameClient.anInt2943 = 429312646;
			} else if (GameClient.anInt2943 * 1744152389 == 30) {
				Class117_Sub22_Sub9.aClass106_Sub1_2287 = Class20.method354(0, false, true, true, -419376395);
				Class117_Sub10.aClass106_Sub1_1840 = Class20.method354(1, false, true, true, 2093501472);
				Class29.aClass106_Sub1_370 = Class20.method354(2, true, false, true, -520512550);
				Class117_Sub22_Sub5.aClass106_Sub1_2217 = Class20.method354(3, false, true, true, 1967952994);
				Class58.aClass106_Sub1_753 = Class20.method354(4, false, true, true, -1498500345);
				Class73_Sub2.aClass106_Sub1_1893 = Class20.method354(5, true, true, true, -160092239);
				Class57.aClass106_Sub1_749 = Class20.method354(6, true, true, false, -361708113);
				Class87.aClass106_Sub1_1020 = Class20.method354(7, false, true, true, -900521620);
				Class117_Sub13.aClass106_Sub1_1868 = Class20.method354(8, false, true, true, -377366625);
				GameClient.aClass106_Sub1_3137 = Class20.method354(9, false, true, true, 850783151);
				GameClient.aClass106_Sub1_2947 = Class20.method354(10, false, true, true, -1416006711);
				Class117_Sub22_Sub16.aClass106_Sub1_2457 = Class20.method354(11, false, true, true, -1773594006);
				Class32.aClass106_Sub1_410 = Class20.method354(12, false, true, true, -1854843427);
				Class32.aClass106_Sub1_412 = Class20.method354(13, true, false, true, 1290104686);
				Class90.aClass106_Sub1_1063 = Class20.method354(14, false, true, false, 331947216);
				Class129.aClass106_Sub1_1585 = Class20.method354(15, false, true, true, 1393475450);
				Class6.aString70 = Class108.aString1214;
				Class6.anInt69 = -2532636;
				GameClient.anInt2943 = -859238904;
			} else if (GameClient.anInt2943 * 1744152389 == 40) {
				byte var33 = 0;
				var1 = var33 + Class117_Sub22_Sub9.aClass106_Sub1_2287.method2231(751382239) * 4 / 100;
				var1 += Class117_Sub10.aClass106_Sub1_1840.method2231(751382239) * 4 / 100;
				var1 += Class29.aClass106_Sub1_370.method2231(751382239) * 2 / 100;
				var1 += Class117_Sub22_Sub5.aClass106_Sub1_2217.method2231(751382239) * 2 / 100;
				var1 += Class58.aClass106_Sub1_753.method2231(751382239) * 6 / 100;
				var1 += Class73_Sub2.aClass106_Sub1_1893.method2231(751382239) * 4 / 100;
				var1 += Class57.aClass106_Sub1_749.method2231(751382239) * 2 / 100;
				var1 += Class87.aClass106_Sub1_1020.method2231(751382239) * 60 / 100;
				var1 += Class117_Sub13.aClass106_Sub1_1868.method2231(751382239) * 2 / 100;
				var1 += GameClient.aClass106_Sub1_3137.method2231(751382239) * 2 / 100;
				var1 += GameClient.aClass106_Sub1_2947.method2231(751382239) * 2 / 100;
				var1 += Class117_Sub22_Sub16.aClass106_Sub1_2457.method2231(751382239) * 2 / 100;
				var1 += Class32.aClass106_Sub1_410.method2231(751382239) * 2 / 100;
				var1 += Class32.aClass106_Sub1_412.method2231(751382239) * 2 / 100;
				var1 += Class90.aClass106_Sub1_1063.method2231(751382239) * 2 / 100;
				var1 += Class129.aClass106_Sub1_1585.method2231(751382239) * 2 / 100;
				if (var1 != 100) {
					if (var1 != 0) {
						Class6.aString70 = Class108.aString1215 + var1 + "%";
					}

					Class6.anInt69 = -3798954;
				} else {
					Class6.aString70 = Class108.aString1216;
					Class6.anInt69 = -3798954;
					GameClient.anInt2943 = 643968969;
				}
			} else {
				Class106_Sub1 var3;
				Class106_Sub1 var27;
				if (GameClient.anInt2943 * 1744152389 == 45) {
					boolean var32 = !GameClient.aBool2921;
					Class14.anInt170 = 1423750062;
					Class130.aBool1588 = var32;
					Class14.anInt156 = -1488571950;
					Class117_Sub2_Sub4 var23 = new Class117_Sub2_Sub4();
					var23.method3069(9, 128, (byte) 26);
					Class17.aClass14_210 = Class117_Sub22_Sub10.method2545(Class84.aClass77_989, Class91.aCanvas1085, 0, 22050, 1984858002);
					Class17.aClass14_210.method291(var23, -1896191479);
					var3 = Class129.aClass106_Sub1_1585;
					var27 = Class90.aClass106_Sub1_1063;
					Class106_Sub1 var26 = Class58.aClass106_Sub1_753;
					Class121.aClass106_1516 = var3;
					Class121.aClass106_1513 = var27;
					Class44.aClass106_596 = var26;
					Class121.aClass117_Sub2_Sub4_1514 = var23;
					Class24.aClass14_305 = Class117_Sub22_Sub10.method2545(Class84.aClass77_989, Class91.aCanvas1085, 1, 2048, 2025959619);
					Class117_Sub13.aClass117_Sub2_Sub1_1871 = new Class117_Sub2_Sub1();
					Class24.aClass14_305.method291(Class117_Sub13.aClass117_Sub2_Sub1_1871, -1016910151);
					Class117_Sub7.aClass20_1789 = new Class20(22050, Class14.anInt170 * -1211689641);
					Class6.aString70 = Class108.aString1217;
					Class6.anInt69 = 2143051535;
					GameClient.anInt2943 = 2147176842;
				} else if (GameClient.anInt2943 * 1744152389 == 50) {
					var1 = 0;
					if (GameClient.aClass117_Sub22_Sub17_Sub4_Sub1_2973 == null) {
						GameClient.aClass117_Sub22_Sub17_Sub4_Sub1_2973 = Class117_Sub22_Sub18_Sub1_Sub2.method3549(Class117_Sub13.aClass106_Sub1_1868, Class32.aClass106_Sub1_412, "p11_full", "", 1405634691);
					} else {
						++var1;
					}

					if (Class39.aClass117_Sub22_Sub17_Sub4_Sub1_485 == null) {
						Class39.aClass117_Sub22_Sub17_Sub4_Sub1_485 = Class117_Sub22_Sub18_Sub1_Sub2.method3549(Class117_Sub13.aClass106_Sub1_1868, Class32.aClass106_Sub1_412, "p12_full", "", 1405634691);
					} else {
						++var1;
					}

					if (Class54_Sub1.aClass117_Sub22_Sub17_Sub4_Sub1_1729 == null) {
						Class54_Sub1.aClass117_Sub22_Sub17_Sub4_Sub1_1729 = Class117_Sub22_Sub18_Sub1_Sub2.method3549(Class117_Sub13.aClass106_Sub1_1868, Class32.aClass106_Sub1_412, "b12_full", "", 1405634691);
					} else {
						++var1;
					}

					if (var1 < 3) {
						Class6.aString70 = Class108.aString1218 + var1 * 100 / 3 + "%";
						Class6.anInt69 = -5065272;
					} else {
						Class117_Sub22_Sub18_Sub1_Sub1.aClass117_Sub18_2868 = new Class117_Sub18(true);
						Class6.aString70 = Class108.aString1440;
						Class6.anInt69 = -5065272;
						GameClient.anInt2943 = 858625292;
					}
				} else if (GameClient.anInt2943 * 1744152389 == 60) {
					var1 = Class76.method1042(GameClient.aClass106_Sub1_2947, Class117_Sub13.aClass106_Sub1_1868, -455950118);
					var21 = Class4.method84(2079694293);
					if (var1 < var21) {
						Class6.aString70 = Class108.aString1220 + var1 * 100 / var21 + "%";
						Class6.anInt69 = -6331590;
					} else {
						Class6.aString70 = Class108.aString1221;
						Class6.anInt69 = -6331590;
						Class117_Sub14_Sub1.method2953(5, 989292847);
						GameClient.anInt2943 = -429926258;
					}
				} else if (GameClient.anInt2943 * 1744152389 == 70) {
					if (!Class29.aClass106_Sub1_370.method1393(-279802178)) {
						Class6.aString70 = Class108.aString1222 + Class29.aClass106_Sub1_370.method2230(-1215631908) + "%";
						Class6.anInt69 = -7597908;
					} else {
						Class106_Sub1 var30 = Class29.aClass106_Sub1_370;
						Class117_Sub22_Sub12.aClass106_2332 = var30;
						Class106_Sub1 var22 = Class29.aClass106_Sub1_370;
						Class139.aClass106_1624 = var22;
						Class117_Sub6.method1949(Class29.aClass106_Sub1_370, Class87.aClass106_Sub1_1020, 570050515);
						var3 = Class29.aClass106_Sub1_370;
						var27 = Class87.aClass106_Sub1_1020;
						boolean var25 = GameClient.aBool2921;
						Class144.aClass106_1649 = var3;
						Class117_Sub22_Sub13.aClass106_2347 = var27;
						Class117_Sub22_Sub13.aBool2353 = var25;
						Class79.method1075(Class29.aClass106_Sub1_370, Class87.aClass106_Sub1_1020, -1834804176);
						Class106_Sub1 var31 = Class29.aClass106_Sub1_370;
						Class106_Sub1 var11 = Class87.aClass106_Sub1_1020;
						boolean var13 = GameClient.aBool2920;
						Class117_Sub22_Sub17_Sub4_Sub1 var10 = GameClient.aClass117_Sub22_Sub17_Sub4_Sub1_2973;
						Class117_Sub22_Sub6.aClass106_2220 = var31;
						Class38.aClass106_473 = var11;
						Class7.aBool100 = var13;
						Class117_Sub22_Sub6.anInt2250 = Class117_Sub22_Sub6.aClass106_2220.method1399(10, 2146106471) * -323103175;
						Class83.aClass117_Sub22_Sub17_Sub4_Sub1_983 = var10;
						Class106_Sub1 var14 = Class29.aClass106_Sub1_370;
						Class106_Sub1 var9 = Class117_Sub22_Sub9.aClass106_Sub1_2287;
						Class106_Sub1 var15 = Class117_Sub10.aClass106_Sub1_1840;
						Class117_Sub22_Sub14.aClass106_2419 = var14;
						Class117_Sub22_Sub14.aClass106_2410 = var9;
						Class117_Sub22_Sub14.aClass106_2408 = var15;
						Class106_Sub1 var16 = Class29.aClass106_Sub1_370;
						Class106_Sub1 var17 = Class87.aClass106_Sub1_1020;
						Class117_Sub22_Sub11.aClass106_2314 = var16;
						Class117_Sub22_Sub11.aClass106_2323 = var17;
						Class106_Sub1 var6 = Class29.aClass106_Sub1_370;
						Class117_Sub22_Sub3.aClass106_2172 = var6;
						Class117_Sub22_Sub12.method2575(Class29.aClass106_Sub1_370, 1963947318);
						Class106_Sub1 var7 = Class117_Sub22_Sub5.aClass106_Sub1_2217;
						Class106_Sub1 var18 = Class87.aClass106_Sub1_1020;
						Class106_Sub1 var19 = Class117_Sub13.aClass106_Sub1_1868;
						Class106_Sub1 var8 = Class32.aClass106_Sub1_412;
						Class117_Sub19.aClass106_2093 = var7;
						Class117_Sub19.aClass106_2062 = var18;
						Class87.aClass106_1018 = var19;
						Class117_Sub19.aClass106_1979 = var8;
						Class117_Sub19.aClass117_Sub19ArrayArray2032 = new Class117_Sub19[Class117_Sub19.aClass106_2093.method1390((byte) -115)][];
						Class117_Sub19.aBoolArray1962 = new boolean[Class117_Sub19.aClass106_2093.method1390((byte) -49)];
						Class106_Sub1 var20 = Class29.aClass106_Sub1_370;
						Class92.aClass106_1088 = var20;
						Class32.method470(Class29.aClass106_Sub1_370, 936095629);
						Class2.method55(Class29.aClass106_Sub1_370, (byte) 3);
						Class117_Sub22_Sub7.method2472(Class29.aClass106_Sub1_370, (byte) -58);
						Class69.aClass46_851 = new Class46();
						Class6.aString70 = Class108.aString1314;
						Class6.anInt69 = -7597908;
						GameClient.anInt2943 = -1718477808;
					}
				} else if (GameClient.anInt2943 * 1744152389 != 80) {
					if (GameClient.anInt2943 * 1744152389 == 90) {
						if (!GameClient.aClass106_Sub1_3137.method1393(2122298037)) {
							Class6.aString70 = Class108.aString1330 + GameClient.aClass106_Sub1_3137.method2230(-108910081) + "%";
							Class6.anInt69 = -11396862;
						} else {
							Class37 var29 = new Class37(GameClient.aClass106_Sub1_3137, Class117_Sub13.aClass106_Sub1_1868, 20, 0.8D, GameClient.aBool2921 ? 64 : 128);
							Class117_Sub22_Sub17_Sub1.method3097(var29);
							Class117_Sub22_Sub17_Sub1.method3098(0.8D);
							Class6.aString70 = Class108.aString1227;
							Class6.anInt69 = -11396862;
							GameClient.anInt2943 = -1289165162;
						}
					} else if (GameClient.anInt2943 * 1744152389 == 110) {
						Class70.aClass28_858 = new Class28();
						Class84.aClass77_989.method1065(Class70.aClass28_858, 10, -1388009075);
						Class6.aString70 = Class108.aString1228;
						Class6.anInt69 = 847090070;
						GameClient.anInt2943 = 1717250584;
					} else if (GameClient.anInt2943 * 1744152389 == 120) {
						if (!GameClient.aClass106_Sub1_2947.method1405("huffman", "", (byte) -53)) {
							Class6.aString70 = Class108.aString1229 + 0 + "%";
							Class6.anInt69 = -871150112;
						} else {
							Class61 var28 = new Class61(GameClient.aClass106_Sub1_2947.method1396("huffman", "", 2001991129));
							Class8_Sub1.method1881(var28, (byte) -72);
							Class6.aString70 = Class108.aString1382;
							Class6.anInt69 = -871150112;
							GameClient.anInt2943 = 428699034;
						}
					} else if (GameClient.anInt2943 * 1744152389 == 130) {
						if (!Class117_Sub22_Sub5.aClass106_Sub1_2217.method1393(-1071079817)) {
							Class6.aString70 = Class108.aString1231 + Class117_Sub22_Sub5.aClass106_Sub1_2217.method2230(-519984462) * 4 / 5 + "%";
							Class6.anInt69 = -12663180;
						} else if (!Class32.aClass106_Sub1_410.method1393(-54407279)) {
							Class6.aString70 = Class108.aString1231 + (80 + Class32.aClass106_Sub1_410.method2230(-89291727) / 6) + "%";
							Class6.anInt69 = -12663180;
						} else if (!Class32.aClass106_Sub1_412.method1393(-1450964293)) {
							Class6.aString70 = Class108.aString1231 + (96 + Class32.aClass106_Sub1_412.method2230(-599839434) / 20) + "%";
							Class6.anInt69 = -12663180;
						} else {
							Class6.aString70 = Class108.aString1263;
							Class6.anInt69 = -12663180;
							GameClient.anInt2943 = -859852516;
						}
					} else if (GameClient.anInt2943 * 1744152389 == 140) {
						Class117_Sub14_Sub1.method2953(10, 1787974241);
					}
				} else {
					var1 = 0;
					if (Class34.aClass117_Sub22_Sub17_Sub3_438 == null) {
						Class34.aClass117_Sub22_Sub17_Sub3_438 = Class117_Sub22_Sub15.method2853(Class117_Sub13.aClass106_Sub1_1868, "compass", "", 1873792302);
					} else {
						++var1;
					}

					if (Class125.aClass117_Sub22_Sub17_Sub3_1549 == null) {
						var3 = Class117_Sub13.aClass106_Sub1_1868;
						var5 = var3.method1391("mapedge", -910467101);
						var4 = var3.method1383(var5, "", (byte) 19);
						Class117_Sub22_Sub17_Sub3 var2 = Class117_Sub22_Sub3.method2369(var3, var5, var4, (short) -21859);
						Class125.aClass117_Sub22_Sub17_Sub3_1549 = var2;
					} else {
						++var1;
					}

					if (Class117_Sub22_Sub2.aClass117_Sub22_Sub17_Sub2Array2162 == null) {
						Class117_Sub22_Sub2.aClass117_Sub22_Sub17_Sub2Array2162 = Class17.method337(Class117_Sub13.aClass106_Sub1_1868, "mapscene", "", -1808904728);
					} else {
						++var1;
					}

					if (Class46.aClass117_Sub22_Sub17_Sub3Array626 == null) {
						Class46.aClass117_Sub22_Sub17_Sub3Array626 = GameClient.method3952(Class117_Sub13.aClass106_Sub1_1868, "mapfunction", "", 202878219);
					} else {
						++var1;
					}

					if (Class32.aClass117_Sub22_Sub17_Sub3Array409 == null) {
						Class32.aClass117_Sub22_Sub17_Sub3Array409 = GameClient.method3952(Class117_Sub13.aClass106_Sub1_1868, "hitmarks", "", 1414408136);
					} else {
						++var1;
					}

					if (Class117_Sub22_Sub18_Sub6.aClass117_Sub22_Sub17_Sub3Array2762 == null) {
						Class117_Sub22_Sub18_Sub6.aClass117_Sub22_Sub17_Sub3Array2762 = GameClient.method3952(Class117_Sub13.aClass106_Sub1_1868, "headicons_pk", "", -1350370163);
					} else {
						++var1;
					}

					if (Class117_Sub22_Sub10.aClass117_Sub22_Sub17_Sub3Array2307 == null) {
						Class117_Sub22_Sub10.aClass117_Sub22_Sub17_Sub3Array2307 = GameClient.method3952(Class117_Sub13.aClass106_Sub1_1868, "headicons_prayer", "", 1980960976);
					} else {
						++var1;
					}

					if (Class112.aClass117_Sub22_Sub17_Sub3Array1484 == null) {
						Class112.aClass117_Sub22_Sub17_Sub3Array1484 = GameClient.method3952(Class117_Sub13.aClass106_Sub1_1868, "headicons_hint", "", -844563545);
					} else {
						++var1;
					}

					if (GameClient.aClass117_Sub22_Sub17_Sub3Array2996 == null) {
						GameClient.aClass117_Sub22_Sub17_Sub3Array2996 = GameClient.method3952(Class117_Sub13.aClass106_Sub1_1868, "mapmarker", "", -910996738);
					} else {
						++var1;
					}

					if (GameClient.aClass117_Sub22_Sub17_Sub3Array2997 == null) {
						GameClient.aClass117_Sub22_Sub17_Sub3Array2997 = GameClient.method3952(Class117_Sub13.aClass106_Sub1_1868, "cross", "", 1921724824);
					} else {
						++var1;
					}

					if (Class52.aClass117_Sub22_Sub17_Sub3Array716 == null) {
						Class52.aClass117_Sub22_Sub17_Sub3Array716 = GameClient.method3952(Class117_Sub13.aClass106_Sub1_1868, "mapdots", "", 1754125680);
					} else {
						++var1;
					}

					if (Class117_Sub22_Sub5.aClass117_Sub22_Sub17_Sub2Array2218 == null) {
						Class117_Sub22_Sub5.aClass117_Sub22_Sub17_Sub2Array2218 = Class17.method337(Class117_Sub13.aClass106_Sub1_1868, "scrollbar", "", -1970641839);
					} else {
						++var1;
					}

					if (Class28.aClass117_Sub22_Sub17_Sub2Array354 == null) {
						Class28.aClass117_Sub22_Sub17_Sub2Array354 = Class17.method337(Class117_Sub13.aClass106_Sub1_1868, "mod_icons", "", -1936097412);
					} else {
						++var1;
					}

					if (var1 < 13) {
						Class6.aString70 = Class108.aString1224 + var1 * 100 / 13 + "%";
						Class6.anInt69 = -8864226;
					} else {
						Class117_Sub22_Sub17_Sub4.aClass117_Sub22_Sub17_Sub2Array2850 = Class28.aClass117_Sub22_Sub17_Sub2Array354;
						Class125.aClass117_Sub22_Sub17_Sub3_1549.method3247();
						var21 = (int) (Math.random() * 21.0D) - 10;
						var24 = (int) (Math.random() * 21.0D) - 10;
						var5 = (int) (Math.random() * 21.0D) - 10;
						var4 = (int) (Math.random() * 41.0D) - 20;

						for (int var12 = 0; var12 < Class46.aClass117_Sub22_Sub17_Sub3Array626.length; var12++) {
							Class46.aClass117_Sub22_Sub17_Sub3Array626[var12].method3246(var21 + var4, var24 + var4, var5 + var4);
						}

						Class117_Sub22_Sub2.aClass117_Sub22_Sub17_Sub2Array2162[0].method3233(var4 + var21, var24 + var4, var5 + var4);
						Class6.aString70 = Class108.aString1225;
						Class6.anInt69 = -8864226;
						GameClient.anInt2943 = 1287937938;
					}
				}
			}
		}
	}

	static void method850(Class117_Sub19 var0, byte var1) {
		if (GameClient.anInt3191 * 815669015 == var0.anInt2103 * 775443757) {
			GameClient.aBoolArray3124[var0.anInt2051 * 1082212775] = true;
		}

	}

}
