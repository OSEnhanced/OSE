package core.Jagex;
import java.awt.*;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Date;

public abstract class Class57 {

	static final int anInt748 = 1000;
	static Class106_Sub1 aClass106_Sub1_749;
	static final int anInt750 = 49;
	public static final int anInt751 = 76;
	public static final int anInt752 = 40;
	static boolean aBool747 = false;

	abstract byte[] method855(int var1);

	static void method867(Class117_Sub7 var0, int var1, int var2) {
		Object[] var3 = var0.anObjectArray1786;
		int var4 = ((Integer) var3[0]).intValue();
		Class117_Sub22_Sub19 var5 = Class98.method1272(var4, -888567376);
		if (var5 != null) {
			int var6 = 0;
			int var7 = 0;
			int var8 = -1;
			int[] var9 = var5.anIntArray2469;
			int[] var10 = var5.anIntArray2470;
			byte var11 = -1;
			Class2.anInt15 = 0;

			int var14;
			try {
				Class2.anIntArray20 = new int[var5.anInt2472 * 2006553709];
				int var12 = 0;
				Class2.aStringArray10 = new String[var5.anInt2474 * -1908983313];
				int var40 = 0;

				int var15;
				String var54;
				for (var14 = 1; var14 < var3.length; var14++) {
					if (var3[var14] instanceof Integer) {
						var15 = ((Integer) var3[var14]).intValue();
						if (var15 == -2147483647) {
							var15 = var0.anInt1781 * 2127593625;
						}

						if (var15 == -2147483646) {
							var15 = var0.anInt1791 * -1403586429;
						}

						if (var15 == -2147483645) {
							var15 = var0.aClass117_Sub19_1780 != null ? var0.aClass117_Sub19_1780.anInt1973 * -1955776525 : -1;
						}

						if (var15 == -2147483644) {
							var15 = var0.anInt1783 * -569236119;
						}

						if (var15 == -2147483643) {
							var15 = var0.aClass117_Sub19_1780 != null ? var0.aClass117_Sub19_1780.anInt1976 * 1710354431 : -1;
						}

						if (var15 == -2147483642) {
							var15 = var0.aClass117_Sub19_1784 != null ? var0.aClass117_Sub19_1784.anInt1973 * -1955776525 : -1;
						}

						if (var15 == -2147483641) {
							var15 = var0.aClass117_Sub19_1784 != null ? var0.aClass117_Sub19_1784.anInt1976 * 1710354431 : -1;
						}

						if (var15 == -2147483640) {
							var15 = var0.anInt1785 * -307472899;
						}

						if (var15 == -2147483639) {
							var15 = var0.anInt1782 * 119656631;
						}

						Class2.anIntArray20[var12++] = var15;
					} else if (var3[var14] instanceof String) {
						var54 = (String) var3[var14];
						if (var54.equals("event_opbase")) {
							var54 = var0.aString1778;
						}

						Class2.aStringArray10[var40++] = var54;
					}
				}

				var14 = 0;
				Class2.anInt21 = var0.anInt1788 * -1020893785;

				label2996:
				while (true) {
					++var14;
					if (var14 > var1) {
						throw new RuntimeException();
					}

					++var8;
					int var39 = var9[var8];
					int var16;
					int var18;
					int var20;
					int var21;
					int[] var41;
					String var45;
					int var46;
					int var53;
					String var61;
					String var66;
					String var72;
					String[] var85;
					if (var39 < 100) {
						if (var39 == 0) {
							Class2.anIntArray13[var6++] = var10[var8];
							continue;
						}

						if (var39 == 1) {
							var15 = var10[var8];
							Class2.anIntArray13[var6++] = Class97.anIntArray1129[var15];
							continue;
						}

						if (var39 == 2) {
							var15 = var10[var8];
							--var6;
							Class97.anIntArray1129[var15] = Class2.anIntArray13[var6];
							Class117_Sub22_Sub13.method2631(var15, (byte) 116);
							continue;
						}

						if (var39 == 3) {
							Class2.aStringArray14[var7++] = var5.aStringArray2473[var8];
							continue;
						}

						if (var39 == 6) {
							var8 += var10[var8];
							continue;
						}

						if (var39 == 7) {
							var6 -= 2;
							if (Class2.anIntArray13[var6] != Class2.anIntArray13[1 + var6]) {
								var8 += var10[var8];
							}
							continue;
						}

						if (var39 == 8) {
							var6 -= 2;
							if (Class2.anIntArray13[var6] == Class2.anIntArray13[var6 + 1]) {
								var8 += var10[var8];
							}
							continue;
						}

						if (var39 == 9) {
							var6 -= 2;
							if (Class2.anIntArray13[var6] < Class2.anIntArray13[var6 + 1]) {
								var8 += var10[var8];
							}
							continue;
						}

						if (var39 == 10) {
							var6 -= 2;
							if (Class2.anIntArray13[var6] > Class2.anIntArray13[1 + var6]) {
								var8 += var10[var8];
							}
							continue;
						}

						if (var39 == 21) {
							if (Class2.anInt15 * -1346777493 == 0) {
								return;
							}

							Class32 var86 = Class2.aClass32Array17[(Class2.anInt15 += 1001951677) * -1346777493];
							var5 = var86.aClass117_Sub22_Sub19_404;
							var9 = var5.anIntArray2469;
							var10 = var5.anIntArray2470;
							var8 = var86.anInt405 * -549461645;
							Class2.anIntArray20 = var86.anIntArray406;
							Class2.aStringArray10 = var86.aStringArray407;
							continue;
						}

						if (var39 == 25) {
							var15 = var10[var8];
							Class2.anIntArray13[var6++] = Class35.method507(var15, 1620589133);
							continue;
						}

						if (var39 == 27) {
							var15 = var10[var8];
							--var6;
							Class78.method1072(var15, Class2.anIntArray13[var6], -374738304);
							continue;
						}

						if (var39 == 31) {
							var6 -= 2;
							if (Class2.anIntArray13[var6] <= Class2.anIntArray13[var6 + 1]) {
								var8 += var10[var8];
							}
							continue;
						}

						if (var39 == 32) {
							var6 -= 2;
							if (Class2.anIntArray13[var6] >= Class2.anIntArray13[var6 + 1]) {
								var8 += var10[var8];
							}
							continue;
						}

						if (var39 == 33) {
							Class2.anIntArray13[var6++] = Class2.anIntArray20[var10[var8]];
							continue;
						}

						int var10001;
						if (var39 == 34) {
							var10001 = var10[var8];
							--var6;
							Class2.anIntArray20[var10001] = Class2.anIntArray13[var6];
							continue;
						}

						if (var39 == 35) {
							Class2.aStringArray14[var7++] = Class2.aStringArray10[var10[var8]];
							continue;
						}

						if (var39 == 36) {
							var10001 = var10[var8];
							--var7;
							Class2.aStringArray10[var10001] = Class2.aStringArray14[var7];
							continue;
						}

						if (var39 == 37) {
							var15 = var10[var8];
							var7 -= var15;
							String[] var105 = Class2.aStringArray14;
							if (var15 == 0) {
								var61 = "";
							} else if (var15 == 1) {
								var45 = var105[var7];
								if (var45 == null) {
									var61 = "null";
								} else {
									var61 = var45.toString();
								}
							} else {
								var18 = var15 + var7;
								var46 = 0;

								for (var20 = var7; var20 < var18; var20++) {
									var66 = var105[var20];
									if (var66 == null) {
										var46 += 4;
									} else {
										var46 += var66.length();
									}
								}

								StringBuilder var97 = new StringBuilder(var46);

								for (var21 = var7; var21 < var18; var21++) {
									var72 = var105[var21];
									if (var72 == null) {
										var97.append("null");
									} else {
										var97.append(var72);
									}
								}

								var61 = var97.toString();
							}

							Class2.aStringArray14[var7++] = var61;
							continue;
						}

						if (var39 == 38) {
							--var6;
							continue;
						}

						if (var39 == 39) {
							--var7;
							continue;
						}

						if (var39 == 40) {
							var15 = var10[var8];
							Class117_Sub22_Sub19 var109 = Class98.method1272(var15, 305027578);
							var41 = new int[var109.anInt2472 * 2006553709];
							var85 = new String[var109.anInt2474 * -1908983313];

							for (var46 = 0; var46 < var109.anInt2477 * -1087842383; var46++) {
								var41[var46] = Class2.anIntArray13[var46 + (var6 - var109.anInt2477 * -1087842383)];
							}

							for (var46 = 0; var46 < var109.anInt2476 * 1814655197; var46++) {
								var85[var46] = Class2.aStringArray14[var7 - var109.anInt2476 * 1814655197 + var46];
							}

							var6 -= var109.anInt2477 * -1087842383;
							var7 -= var109.anInt2476 * 1814655197;
							Class32 var106 = new Class32();
							var106.aClass117_Sub22_Sub19_404 = var5;
							var106.anInt405 = var8 * 1252535227;
							var106.anIntArray406 = Class2.anIntArray20;
							var106.aStringArray407 = Class2.aStringArray10;
							Class2.aClass32Array17[(Class2.anInt15 -= 1001951677) * -1346777493 - 1] = var106;
							var5 = var109;
							var9 = var109.anIntArray2469;
							var10 = var109.anIntArray2470;
							var8 = -1;
							Class2.anIntArray20 = var41;
							Class2.aStringArray10 = var85;
							continue;
						}

						if (var39 == 42) {
							Class2.anIntArray13[var6++] = Class69.aClass46_851.method743(var10[var8], -150177445);
							continue;
						}

						if (var39 == 43) {
							var10001 = var10[var8];
							--var6;
							Class69.aClass46_851.method742(var10001, Class2.anIntArray13[var6], 2136462129);
							continue;
						}

						if (var39 == 44) {
							var15 = var10[var8] >> 16;
							var53 = var10[var8] & 65535;
							--var6;
							var16 = Class2.anIntArray13[var6];
							if (var16 >= 0 && var16 <= 5000) {
								Class2.anIntArray9[var15] = var16;
								byte var98 = -1;
								if (var53 == 105) {
									var98 = 0;
								}

								var46 = 0;

								while (true) {
									if (var46 >= var16) {
										continue label2996;
									}

									Class2.anIntArrayArray12[var15][var46] = var98;
									++var46;
								}
							}

							throw new RuntimeException();
						}

						if (var39 == 45) {
							var15 = var10[var8];
							--var6;
							var53 = Class2.anIntArray13[var6];
							if (var53 >= 0 && var53 < Class2.anIntArray9[var15]) {
								Class2.anIntArray13[var6++] = Class2.anIntArrayArray12[var15][var53];
								continue;
							}

							throw new RuntimeException();
						}

						if (var39 == 46) {
							var15 = var10[var8];
							var6 -= 2;
							var53 = Class2.anIntArray13[var6];
							if (var53 >= 0 && var53 < Class2.anIntArray9[var15]) {
								Class2.anIntArrayArray12[var15][var53] = Class2.anIntArray13[var6 + 1];
								continue;
							}

							throw new RuntimeException();
						}

						if (var39 == 47) {
							var54 = Class69.aClass46_851.method763(var10[var8], (byte) 0);
							if (var54 == null) {
								var54 = "null";
							}

							Class2.aStringArray14[var7++] = var54;
							continue;
						}

						if (var39 == 48) {
							var10001 = var10[var8];
							--var7;
							Class69.aClass46_851.method757(var10001, Class2.aStringArray14[var7], 2125739098);
							continue;
						}
					}

					boolean var57;
					if (var10[var8] == 1) {
						var57 = true;
					} else {
						var57 = false;
					}

					Class117_Sub19 var17;
					Class117_Sub19 var47;
					boolean var48;
					Class117_Sub19 var49;
					boolean var69;
					Class117_Sub19 var103;
					if (var39 < 1000) {
						if (var39 == 100) {
							var6 -= 3;
							var53 = Class2.anIntArray13[var6];
							var16 = Class2.anIntArray13[1 + var6];
							var18 = Class2.anIntArray13[2 + var6];
							if (var16 == 0) {
								throw new RuntimeException();
							}

							var49 = Class74.method1010(var53, -1987099365);
							if (var49.aClass117_Sub19Array2095 == null) {
								var49.aClass117_Sub19Array2095 = new Class117_Sub19[var18 + 1];
							}

							if (var49.aClass117_Sub19Array2095.length <= var18) {
								Class117_Sub19[] var95 = new Class117_Sub19[var18 + 1];

								for (var21 = 0; var21 < var49.aClass117_Sub19Array2095.length; var21++) {
									var95[var21] = var49.aClass117_Sub19Array2095[var21];
								}

								var49.aClass117_Sub19Array2095 = var95;
							}

							if (var18 > 0 && var49.aClass117_Sub19Array2095[var18 - 1] == null) {
								throw new RuntimeException("" + (var18 - 1));
							}

							Class117_Sub19 var96 = new Class117_Sub19();
							var96.anInt1975 = var16 * 47477787;
							var96.anInt2027 = (var96.anInt1973 = var49.anInt1973 * 1) * 1496783801;
							var96.anInt1976 = var18 * -653389825;
							var96.aBool2061 = true;
							var49.aClass117_Sub19Array2095[var18] = var96;
							if (var57) {
								Class132.aClass117_Sub19_1590 = var96;
							} else {
								Class117_Sub22_Sub18_Sub2.aClass117_Sub19_2604 = var96;
							}

							Class54.method850(var49, (byte) 0);
							continue;
						}

						if (var39 == 101) {
							var17 = var57 ? Class132.aClass117_Sub19_1590 : Class117_Sub22_Sub18_Sub2.aClass117_Sub19_2604;
							var103 = Class74.method1010(var17.anInt1973 * -1955776525, -784555994);
							var103.aClass117_Sub19Array2095[var17.anInt1976 * 1710354431] = null;
							Class54.method850(var103, (byte) 0);
							continue;
						}

						if (var39 == 102) {
							--var6;
							var17 = Class74.method1010(Class2.anIntArray13[var6], -1689292350);
							var17.aClass117_Sub19Array2095 = null;
							Class54.method850(var17, (byte) 0);
							continue;
						}

						if (var39 == 200) {
							var6 -= 2;
							var53 = Class2.anIntArray13[var6];
							var16 = Class2.anIntArray13[1 + var6];
							var47 = Class23.method368(var53, var16, -300012166);
							if (var47 != null && var16 != -1) {
								Class2.anIntArray13[var6++] = 1;
								if (var57) {
									Class132.aClass117_Sub19_1590 = var47;
								} else {
									Class117_Sub22_Sub18_Sub2.aClass117_Sub19_2604 = var47;
								}
								continue;
							}

							Class2.anIntArray13[var6++] = 0;
							continue;
						}

						if (var39 == 201) {
							--var6;
							var17 = Class74.method1010(Class2.anIntArray13[var6], -1649902312);
							if (var17 != null) {
								Class2.anIntArray13[var6++] = 1;
								if (var57) {
									Class132.aClass117_Sub19_1590 = var17;
								} else {
									Class117_Sub22_Sub18_Sub2.aClass117_Sub19_2604 = var17;
								}
							} else {
								Class2.anIntArray13[var6++] = 0;
							}
							continue;
						}
					} else {
						boolean var70;
						if (var39 >= 1000 && var39 < 1100 || var39 >= 2000 && var39 < 2100) {
							var53 = -1;
							if (var39 >= 2000) {
								var39 -= 1000;
								--var6;
								var53 = Class2.anIntArray13[var6];
								var103 = Class74.method1010(var53, -1717450482);
							} else {
								var103 = var57 ? Class132.aClass117_Sub19_1590 : Class117_Sub22_Sub18_Sub2.aClass117_Sub19_2604;
							}

							if (var39 == 1000) {
								var6 -= 4;
								var103.anInt2026 = Class2.anIntArray13[var6] * -1965935617;
								var103.anInt1983 = Class2.anIntArray13[var6 + 1] * 768243199;
								var103.anInt1978 = Class2.anIntArray13[2 + var6] * -1413804435;
								var103.anInt2048 = Class2.anIntArray13[3 + var6] * -1853140971;
								Class54.method850(var103, (byte) 0);
								Class33.method474(var103, (byte) -115);
								if (var53 != -1 && var103.anInt1975 * 657737235 == 0) {
									Class95.method1245(Class117_Sub19.aClass117_Sub19ArrayArray2032[var53 >> 16], var103, false, (byte) 4);
								}
								continue;
							}

							if (var39 == 1001) {
								var6 -= 4;
								var103.anInt1984 = Class2.anIntArray13[var6] * 1632680573;
								var103.anInt1985 = Class2.anIntArray13[1 + var6] * -542281785;
								var103.anInt1980 = Class2.anIntArray13[2 + var6] * -413013645;
								var103.anInt1981 = Class2.anIntArray13[var6 + 3] * 1596214965;
								Class54.method850(var103, (byte) 0);
								Class33.method474(var103, (byte) -125);
								if (var53 != -1 && var103.anInt1975 * 657737235 == 0) {
									Class95.method1245(Class117_Sub19.aClass117_Sub19ArrayArray2032[var53 >> 16], var103, false, (byte) 4);
								}
								continue;
							}

							if (var39 == 1003) {
								--var6;
								var70 = Class2.anIntArray13[var6] == 1;
								if (var103.aBool1993 != var70) {
									var103.aBool1993 = var70;
									Class54.method850(var103, (byte) 0);
								}
								continue;
							}

							if (var39 == 1005) {
								--var6;
								var103.aBool1974 = Class2.anIntArray13[var6] == 1;
								continue;
							}

							if (var39 == 1006) {
								--var6;
								var103.aBool2105 = Class2.anIntArray13[var6] == 1;
								continue;
							}
						} else if (var39 >= 1100 && var39 < 1200 || var39 >= 2100 && var39 < 2200) {
							var16 = -1;
							if (var39 >= 2000) {
								var39 -= 1000;
								--var6;
								var16 = Class2.anIntArray13[var6];
								var17 = Class74.method1010(var16, -596981673);
							} else {
								var17 = var57 ? Class132.aClass117_Sub19_1590 : Class117_Sub22_Sub18_Sub2.aClass117_Sub19_2604;
							}

							if (var39 == 1100) {
								var6 -= 2;
								var17.anInt1994 = Class2.anIntArray13[var6] * -1486618531;
								if (var17.anInt1994 * 17552373 > var17.anInt1996 * -825850981 - var17.anInt1988 * 1854643179) {
									var17.anInt1994 = var17.anInt1996 * -1549152433 - var17.anInt1988 * 1568908383;
								}

								if (var17.anInt1994 * 17552373 < 0) {
									var17.anInt1994 = 0;
								}

								var17.anInt2060 = Class2.anIntArray13[1 + var6] * -1852047813;
								if (var17.anInt2060 * -400020749 > var17.anInt1997 * 1348115267 - var17.anInt1989 * 2747837) {
									var17.anInt2060 = var17.anInt1997 * 1602175601 - var17.anInt1989 * -1577430897;
								}

								if (var17.anInt2060 * -400020749 < 0) {
									var17.anInt2060 = 0;
								}

								Class54.method850(var17, (byte) 0);
								continue;
							}

							if (var39 == 1101) {
								--var6;
								var17.anInt1986 = Class2.anIntArray13[var6] * 1537973875;
								Class54.method850(var17, (byte) 0);
								continue;
							}

							if (var39 == 1102) {
								--var6;
								var17.aBool2002 = Class2.anIntArray13[var6] == 1;
								Class54.method850(var17, (byte) 0);
								continue;
							}

							if (var39 == 1103) {
								--var6;
								var17.anInt2013 = Class2.anIntArray13[var6] * 1584298683;
								Class54.method850(var17, (byte) 0);
								continue;
							}

							if (var39 == 1104) {
								--var6;
								var17.anInt2004 = Class2.anIntArray13[var6] * 2086677293;
								Class54.method850(var17, (byte) 0);
								continue;
							}

							if (var39 == 1105) {
								--var6;
								var17.anInt2021 = Class2.anIntArray13[var6] * 2131037801;
								Class54.method850(var17, (byte) 0);
								continue;
							}

							if (var39 == 1106) {
								--var6;
								var17.anInt1968 = Class2.anIntArray13[var6] * 1185651503;
								Class54.method850(var17, (byte) 0);
								continue;
							}

							if (var39 == 1107) {
								--var6;
								var17.aBool2009 = Class2.anIntArray13[var6] == 1;
								Class54.method850(var17, (byte) 0);
								continue;
							}

							if (var39 == 1108) {
								var17.anInt2080 = -1110399181;
								--var6;
								var17.anInt2015 = Class2.anIntArray13[var6] * -680726691;
								Class54.method850(var17, (byte) 0);
								continue;
							}

							if (var39 == 1109) {
								var6 -= 6;
								var17.anInt2020 = Class2.anIntArray13[var6] * 1273073269;
								var17.anInt2022 = Class2.anIntArray13[var6 + 1] * -423682285;
								var17.anInt1966 = Class2.anIntArray13[2 + var6] * -1995334459;
								var17.anInt2023 = Class2.anIntArray13[var6 + 3] * 633899009;
								var17.anInt2024 = Class2.anIntArray13[var6 + 4] * 1529051521;
								var17.anInt2025 = Class2.anIntArray13[var6 + 5] * -1145439295;
								Class54.method850(var17, (byte) 0);
								continue;
							}

							if (var39 == 1110) {
								--var6;
								var18 = Class2.anIntArray13[var6];
								if (var17.anInt2102 * 1339652199 != var18) {
									var17.anInt2102 = var18 * -1811012777;
									var17.anInt2082 = 0;
									var17.anInt2101 = 0;
									Class54.method850(var17, (byte) 0);
								}
								continue;
							}

							if (var39 == 1111) {
								--var6;
								var17.aBool2028 = Class2.anIntArray13[var6] == 1;
								Class54.method850(var17, (byte) 0);
								continue;
							}

							if (var39 == 1112) {
								--var7;
								var45 = Class2.aStringArray14[var7];
								if (!var45.equals(var17.aString2031)) {
									var17.aString2031 = var45;
									Class54.method850(var17, (byte) 0);
								}
								continue;
							}

							if (var39 == 1113) {
								--var6;
								var17.anInt2094 = Class2.anIntArray13[var6] * 377723963;
								Class54.method850(var17, (byte) 0);
								continue;
							}

							if (var39 == 1114) {
								var6 -= 3;
								var17.anInt2034 = Class2.anIntArray13[var6] * -752068701;
								var17.anInt2035 = Class2.anIntArray13[1 + var6] * 344901421;
								var17.anInt2033 = Class2.anIntArray13[var6 + 2] * -1665504751;
								Class54.method850(var17, (byte) 0);
								continue;
							}

							if (var39 == 1115) {
								--var6;
								var17.aBool2036 = Class2.anIntArray13[var6] == 1;
								Class54.method850(var17, (byte) 0);
								continue;
							}

							if (var39 == 1116) {
								--var6;
								var17.anInt2010 = Class2.anIntArray13[var6] * 1039334959;
								Class54.method850(var17, (byte) 0);
								continue;
							}

							if (var39 == 1117) {
								--var6;
								var17.anInt2011 = Class2.anIntArray13[var6] * -1782973843;
								Class54.method850(var17, (byte) 0);
								continue;
							}

							if (var39 == 1118) {
								--var6;
								var17.aBool2012 = Class2.anIntArray13[var6] == 1;
								Class54.method850(var17, (byte) 0);
								continue;
							}

							if (var39 == 1119) {
								--var6;
								var17.aBool2014 = Class2.anIntArray13[var6] == 1;
								Class54.method850(var17, (byte) 0);
								continue;
							}

							if (var39 == 1120) {
								var6 -= 2;
								var17.anInt1996 = Class2.anIntArray13[var6] * 24193683;
								var17.anInt1997 = Class2.anIntArray13[1 + var6] * 1065961835;
								Class54.method850(var17, (byte) 0);
								if (var16 != -1 && var17.anInt1975 * 657737235 == 0) {
									Class95.method1245(Class117_Sub19.aClass117_Sub19ArrayArray2032[var16 >> 16], var17, false, (byte) 4);
								}
								continue;
							}

							if (var39 == 1121) {
								var18 = var17.anInt1973 * -1955776525;
								var46 = var17.anInt1976 * 1710354431;
								GameClient.aClass117_Sub14_Sub1_2961.method2932(177, 624602749);
								GameClient.aClass117_Sub14_Sub1_2961.method2209(var46, -2069472551);
								GameClient.aClass117_Sub14_Sub1_2961.method2053(var18, 734640632);
								GameClient.aClass117_Sub19_3083 = var17;
								Class54.method850(var17, (byte) 0);
								continue;
							}

							if (var39 == 1122) {
								--var6;
								var17.anInt2081 = Class2.anIntArray13[var6] * -1228981055;
								Class54.method850(var17, (byte) 0);
								continue;
							}
						} else if ((var39 < 1200 || var39 >= 1300) && (var39 < 2200 || var39 >= 2300)) {
							if (var39 >= 1300 && var39 < 1400 || var39 >= 2300 && var39 < 2400) {
								if (var39 >= 2000) {
									var39 -= 1000;
									--var6;
									var17 = Class74.method1010(Class2.anIntArray13[var6], -1517165768);
								} else {
									var17 = var57 ? Class132.aClass117_Sub19_1590 : Class117_Sub22_Sub18_Sub2.aClass117_Sub19_2604;
								}

								if (var39 == 1300) {
									--var6;
									var16 = Class2.anIntArray13[var6] - 1;
									if (var16 >= 0 && var16 <= 9) {
										--var7;
										var17.method2286(var16, Class2.aStringArray14[var7], -1999817952);
										continue;
									}

									--var7;
									continue;
								}

								if (var39 == 1301) {
									var6 -= 2;
									var16 = Class2.anIntArray13[var6];
									var18 = Class2.anIntArray13[1 + var6];
									var17.aClass117_Sub19_2046 = Class23.method368(var16, var18, -943235779);
									continue;
								}

								if (var39 == 1302) {
									--var6;
									var17.aBool2052 = Class2.anIntArray13[var6] == 1;
									continue;
								}

								if (var39 == 1303) {
									--var6;
									var17.anInt2047 = Class2.anIntArray13[var6] * 516955727;
									continue;
								}

								if (var39 == 1304) {
									--var6;
									var17.anInt2003 = Class2.anIntArray13[var6] * -41180079;
									continue;
								}

								if (var39 == 1305) {
									--var7;
									var17.aString1964 = Class2.aStringArray14[var7];
									continue;
								}

								if (var39 == 1306) {
									--var7;
									var17.aString2050 = Class2.aStringArray14[var7];
									continue;
								}

								if (var39 == 1307) {
									var17.aStringArray2045 = null;
									continue;
								}
							} else {
								String var44;
								int[] var52;
								if (var39 >= 1400 && var39 < 1500 || var39 >= 2400 && var39 < 2500) {
									if (var39 >= 2000) {
										var39 -= 1000;
										--var6;
										var17 = Class74.method1010(Class2.anIntArray13[var6], -1536815567);
									} else {
										var17 = var57 ? Class132.aClass117_Sub19_1590 : Class117_Sub22_Sub18_Sub2.aClass117_Sub19_2604;
									}

									--var7;
									var44 = Class2.aStringArray14[var7];
									var52 = null;
									if (var44.length() > 0 && var44.charAt(var44.length() - 1) == 89) {
										--var6;
										var46 = Class2.anIntArray13[var6];
										if (var46 > 0) {
											for (var52 = new int[var46]; var46-- > 0; var52[var46] = Class2.anIntArray13[var6]) {
												--var6;
											}
										}

										var44 = var44.substring(0, var44.length() - 1);
									}

									Object[] var100 = new Object[var44.length() + 1];

									for (var20 = var100.length - 1; var20 >= 1; --var20) {
										if (var44.charAt(var20 - 1) == 115) {
											--var7;
											var100[var20] = Class2.aStringArray14[var7];
										} else {
											--var6;
											var100[var20] = new Integer(Class2.anIntArray13[var6]);
										}
									}

									--var6;
									var20 = Class2.anIntArray13[var6];
									if (var20 != -1) {
										var100[0] = new Integer(var20);
									} else {
										var100 = null;
									}

									if (var39 == 1400) {
										var17.anObjectArray2053 = var100;
									}

									if (var39 == 1401) {
										var17.anObjectArray2056 = var100;
									}

									if (var39 == 1402) {
										var17.anObjectArray2055 = var100;
									}

									if (var39 == 1403) {
										var17.anObjectArray2057 = var100;
									}

									if (var39 == 1404) {
										var17.anObjectArray1965 = var100;
									}

									if (var39 == 1405) {
										var17.anObjectArray1963 = var100;
									}

									if (var39 == 1406) {
										var17.anObjectArray2063 = var100;
									}

									if (var39 == 1407) {
										var17.anObjectArray2064 = var100;
										var17.anIntArray2065 = var52;
									}

									if (var39 == 1408) {
										var17.anObjectArray2070 = var100;
									}

									if (var39 == 1409) {
										var17.anObjectArray2071 = var100;
									}

									if (var39 == 1410) {
										var17.anObjectArray2001 = var100;
									}

									if (var39 == 1411) {
										var17.anObjectArray2054 = var100;
									}

									if (var39 == 1412) {
										var17.anObjectArray2083 = var100;
									}

									if (var39 == 1414) {
										var17.anObjectArray2066 = var100;
										var17.anIntArray2067 = var52;
									}

									if (var39 == 1415) {
										var17.anObjectArray2068 = var100;
										var17.anIntArray2069 = var52;
									}

									if (var39 == 1416) {
										var17.anObjectArray2042 = var100;
									}

									if (var39 == 1417) {
										var17.anObjectArray1971 = var100;
									}

									if (var39 == 1418) {
										var17.anObjectArray2073 = var100;
									}

									if (var39 == 1419) {
										var17.anObjectArray2074 = var100;
									}

									if (var39 == 1420) {
										var17.anObjectArray2075 = var100;
									}

									if (var39 == 1421) {
										var17.anObjectArray2076 = var100;
									}

									if (var39 == 1422) {
										var17.anObjectArray2077 = var100;
									}

									if (var39 == 1423) {
										var17.anObjectArray2078 = var100;
									}

									if (var39 == 1424) {
										var17.anObjectArray2079 = var100;
									}

									if (var39 == 1425) {
										var17.anObjectArray2090 = var100;
									}

									if (var39 == 1426) {
										var17.anObjectArray2006 = var100;
									}

									if (var39 == 1427) {
										var17.anObjectArray1977 = var100;
									}

									var17.aBool2044 = true;
									continue;
								}

								if (var39 < 1600) {
									var17 = var57 ? Class132.aClass117_Sub19_1590 : Class117_Sub22_Sub18_Sub2.aClass117_Sub19_2604;
									if (var39 == 1500) {
										Class2.anIntArray13[var6++] = var17.anInt2104 * -165844047;
										continue;
									}

									if (var39 == 1501) {
										Class2.anIntArray13[var6++] = var17.anInt1987 * 1372514967;
										continue;
									}

									if (var39 == 1502) {
										Class2.anIntArray13[var6++] = var17.anInt1988 * 1854643179;
										continue;
									}

									if (var39 == 1503) {
										Class2.anIntArray13[var6++] = var17.anInt1989 * 2747837;
										continue;
									}

									if (var39 == 1504) {
										Class2.anIntArray13[var6++] = var17.aBool1993 ? 1 : 0;
										continue;
									}

									if (var39 == 1505) {
										Class2.anIntArray13[var6++] = var17.anInt2027 * 1264631563;
										continue;
									}
								} else if (var39 < 1700) {
									var17 = var57 ? Class132.aClass117_Sub19_1590 : Class117_Sub22_Sub18_Sub2.aClass117_Sub19_2604;
									if (var39 == 1600) {
										Class2.anIntArray13[var6++] = var17.anInt1994 * 17552373;
										continue;
									}

									if (var39 == 1601) {
										Class2.anIntArray13[var6++] = var17.anInt2060 * -400020749;
										continue;
									}

									if (var39 == 1602) {
										Class2.aStringArray14[var7++] = var17.aString2031;
										continue;
									}

									if (var39 == 1603) {
										Class2.anIntArray13[var6++] = var17.anInt1996 * -825850981;
										continue;
									}

									if (var39 == 1604) {
										Class2.anIntArray13[var6++] = var17.anInt1997 * 1348115267;
										continue;
									}

									if (var39 == 1605) {
										Class2.anIntArray13[var6++] = var17.anInt2025 * -2061757375;
										continue;
									}

									if (var39 == 1606) {
										Class2.anIntArray13[var6++] = var17.anInt1966 * -1133280755;
										continue;
									}

									if (var39 == 1607) {
										Class2.anIntArray13[var6++] = var17.anInt2024 * -1708734847;
										continue;
									}

									if (var39 == 1608) {
										Class2.anIntArray13[var6++] = var17.anInt2023 * -1569228799;
										continue;
									}

									if (var39 == 1609) {
										Class2.anIntArray13[var6++] = var17.anInt2013 * -1578517901;
										continue;
									}
								} else if (var39 < 1800) {
									var17 = var57 ? Class132.aClass117_Sub19_1590 : Class117_Sub22_Sub18_Sub2.aClass117_Sub19_2604;
									if (var39 == 1700) {
										Class2.anIntArray13[var6++] = var17.anInt2091 * -828631679;
										continue;
									}

									if (var39 == 1701) {
										if (var17.anInt2091 * -828631679 != -1) {
											Class2.anIntArray13[var6++] = var17.anInt2092 * 1669652681;
										} else {
											Class2.anIntArray13[var6++] = 0;
										}
										continue;
									}

									if (var39 == 1702) {
										Class2.anIntArray13[var6++] = var17.anInt1976 * 1710354431;
										continue;
									}
								} else if (var39 < 1900) {
									var17 = var57 ? Class132.aClass117_Sub19_1590 : Class117_Sub22_Sub18_Sub2.aClass117_Sub19_2604;
									if (var39 == 1800) {
										var41 = Class2.anIntArray13;
										var18 = var6++;
										var20 = Class67.method961(var17, 25788164);
										var46 = var20 >> 11 & 63;
										var41[var18] = var46;
										continue;
									}

									if (var39 == 1801) {
										--var6;
										var16 = Class2.anIntArray13[var6];
										--var16;
										if (var17.aStringArray2045 != null && var16 < var17.aStringArray2045.length && var17.aStringArray2045[var16] != null) {
											Class2.aStringArray14[var7++] = var17.aStringArray2045[var16];
											continue;
										}

										Class2.aStringArray14[var7++] = "";
										continue;
									}

									if (var39 == 1802) {
										if (var17.aString1964 == null) {
											Class2.aStringArray14[var7++] = "";
										} else {
											Class2.aStringArray14[var7++] = var17.aString1964;
										}
										continue;
									}
								} else if ((var39 < 1900 || var39 >= 2000) && (var39 < 2900 || var39 >= 3000)) {
									if (var39 < 2600) {
										--var6;
										var17 = Class74.method1010(Class2.anIntArray13[var6], -1126191365);
										if (var39 == 2500) {
											Class2.anIntArray13[var6++] = var17.anInt2104 * -165844047;
											continue;
										}

										if (var39 == 2501) {
											Class2.anIntArray13[var6++] = var17.anInt1987 * 1372514967;
											continue;
										}

										if (var39 == 2502) {
											Class2.anIntArray13[var6++] = var17.anInt1988 * 1854643179;
											continue;
										}

										if (var39 == 2503) {
											Class2.anIntArray13[var6++] = var17.anInt1989 * 2747837;
											continue;
										}

										if (var39 == 2504) {
											Class2.anIntArray13[var6++] = var17.aBool1993 ? 1 : 0;
											continue;
										}

										if (var39 == 2505) {
											Class2.anIntArray13[var6++] = var17.anInt2027 * 1264631563;
											continue;
										}
									} else if (var39 < 2700) {
										--var6;
										var17 = Class74.method1010(Class2.anIntArray13[var6], -1225071520);
										if (var39 == 2600) {
											Class2.anIntArray13[var6++] = var17.anInt1994 * 17552373;
											continue;
										}

										if (var39 == 2601) {
											Class2.anIntArray13[var6++] = var17.anInt2060 * -400020749;
											continue;
										}

										if (var39 == 2602) {
											Class2.aStringArray14[var7++] = var17.aString2031;
											continue;
										}

										if (var39 == 2603) {
											Class2.anIntArray13[var6++] = var17.anInt1996 * -825850981;
											continue;
										}

										if (var39 == 2604) {
											Class2.anIntArray13[var6++] = var17.anInt1997 * 1348115267;
											continue;
										}

										if (var39 == 2605) {
											Class2.anIntArray13[var6++] = var17.anInt2025 * -2061757375;
											continue;
										}

										if (var39 == 2606) {
											Class2.anIntArray13[var6++] = var17.anInt1966 * -1133280755;
											continue;
										}

										if (var39 == 2607) {
											Class2.anIntArray13[var6++] = var17.anInt2024 * -1708734847;
											continue;
										}

										if (var39 == 2608) {
											Class2.anIntArray13[var6++] = var17.anInt2023 * -1569228799;
											continue;
										}

										if (var39 == 2609) {
											Class2.anIntArray13[var6++] = var17.anInt2013 * -1578517901;
											continue;
										}
									} else if (var39 < 2800) {
										if (var39 == 2700) {
											--var6;
											var17 = Class74.method1010(Class2.anIntArray13[var6], -1247292793);
											Class2.anIntArray13[var6++] = var17.anInt2091 * -828631679;
											continue;
										}

										if (var39 == 2701) {
											--var6;
											var17 = Class74.method1010(Class2.anIntArray13[var6], -1618343558);
											if (var17.anInt2091 * -828631679 != -1) {
												Class2.anIntArray13[var6++] = var17.anInt2092 * 1669652681;
											} else {
												Class2.anIntArray13[var6++] = 0;
											}
											continue;
										}

										if (var39 == 2702) {
											--var6;
											var53 = Class2.anIntArray13[var6];
											Class117_Sub10 var43 = (Class117_Sub10) GameClient.aClass127_3080.method1675((long) var53);
											if (var43 != null) {
												Class2.anIntArray13[var6++] = 1;
											} else {
												Class2.anIntArray13[var6++] = 0;
											}
											continue;
										}

										if (var39 == 2706) {
											Class2.anIntArray13[var6++] = GameClient.anInt3036 * -1635287017;
											continue;
										}
									} else if (var39 < 2900) {
										--var6;
										var17 = Class74.method1010(Class2.anIntArray13[var6], -1190525944);
										if (var39 == 2800) {
											var41 = Class2.anIntArray13;
											var18 = var6++;
											var20 = Class67.method961(var17, 317528371);
											var46 = var20 >> 11 & 63;
											var41[var18] = var46;
											continue;
										}

										if (var39 == 2801) {
											--var6;
											var16 = Class2.anIntArray13[var6];
											--var16;
											if (var17.aStringArray2045 != null && var16 < var17.aStringArray2045.length && var17.aStringArray2045[var16] != null) {
												Class2.aStringArray14[var7++] = var17.aStringArray2045[var16];
												continue;
											}

											Class2.aStringArray14[var7++] = "";
											continue;
										}

										if (var39 == 2802) {
											if (var17.aString1964 == null) {
												Class2.aStringArray14[var7++] = "";
											} else {
												Class2.aStringArray14[var7++] = var17.aString1964;
											}
											continue;
										}
									} else if (var39 < 3200) {
										if (var39 == 3100) {
											--var7;
											var61 = Class2.aStringArray14[var7];
											Class117_Sub22_Sub1.method2353(0, "", var61, -19548454);
											continue;
										}

										if (var39 == 3101) {
											var6 -= 2;
											Class61.method921(Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393, Class2.anIntArray13[var6], Class2.anIntArray13[1 + var6], 1757225379);
											continue;
										}

										if (var39 == 3103) {
											Class117_Sub22_Sub7.method2480(557389619);
											continue;
										}

										if (var39 == 3104) {
											--var7;
											var61 = Class2.aStringArray14[var7];
											var16 = 0;
											if (Class65.method948(var61, -636502637)) {
												var18 = Class5.method87(var61, 10, true, -198282231);
												var16 = var18;
											}

											GameClient.aClass117_Sub14_Sub1_2961.method2932(84, 443678668);
											GameClient.aClass117_Sub14_Sub1_2961.method2183(var16, (byte) 109);
											continue;
										}

										if (var39 == 3105) {
											--var7;
											var61 = Class2.aStringArray14[var7];
											GameClient.aClass117_Sub14_Sub1_2961.method2932(160, 1295185072);
											GameClient.aClass117_Sub14_Sub1_2961.method2126(var61.length() + 1, 76619981);
											GameClient.aClass117_Sub14_Sub1_2961.method2001(var61, 1835684365);
											continue;
										}

										if (var39 == 3106) {
											--var7;
											var61 = Class2.aStringArray14[var7];
											GameClient.aClass117_Sub14_Sub1_2961.method2932(238, 1239756192);
											GameClient.aClass117_Sub14_Sub1_2961.method2126(var61.length() + 1, 333771855);
											GameClient.aClass117_Sub14_Sub1_2961.method2001(var61, 1155205308);
											continue;
										}

										if (var39 == 3107) {
											--var6;
											var53 = Class2.anIntArray13[var6];
											--var7;
											var44 = Class2.aStringArray14[var7];
											var18 = Class4.anInt46 * -1915182763;
											int[] var50 = Class4.anIntArray41;
											boolean var51 = false;

											for (var21 = 0; var21 < var18; var21++) {
												Class117_Sub22_Sub18_Sub1_Sub2 var22 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var50[var21]];
												if (var22 != null && Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393 != var22 && var22.getPlayerName() != null && var22.getPlayerName().equalsIgnoreCase(var44)) {
													if (var53 == 1) {
														GameClient.aClass117_Sub14_Sub1_2961.method2932(208, 388406689);
														GameClient.aClass117_Sub14_Sub1_2961.method2024(0, -1325718011);
														GameClient.aClass117_Sub14_Sub1_2961.method1996(var50[var21], (byte) -102);
													} else if (var53 == 4) {
														GameClient.aClass117_Sub14_Sub1_2961.method2932(142, 350163471);
														GameClient.aClass117_Sub14_Sub1_2961.method2034(0, (byte) -111);
														GameClient.aClass117_Sub14_Sub1_2961.method2209(var50[var21], -2069472551);
													} else if (var53 == 6) {
														GameClient.aClass117_Sub14_Sub1_2961.method2932(153, 681989582);
														GameClient.aClass117_Sub14_Sub1_2961.method2034(0, (byte) -61);
														GameClient.aClass117_Sub14_Sub1_2961.method2209(var50[var21], -2069472551);
													} else if (var53 == 7) {
														GameClient.aClass117_Sub14_Sub1_2961.method2932(107, 665333686);
														GameClient.aClass117_Sub14_Sub1_2961.method2042(var50[var21], (byte) 8);
														GameClient.aClass117_Sub14_Sub1_2961.method2126(0, 57171460);
													}

													var51 = true;
													break;
												}
											}

											if (!var51) {
												Class117_Sub22_Sub1.method2353(4, "", Class108.aString1403 + var44, 1206525563);
											}
											continue;
										}

										if (var39 == 3108) {
											var6 -= 3;
											var53 = Class2.anIntArray13[var6];
											var16 = Class2.anIntArray13[1 + var6];
											var18 = Class2.anIntArray13[var6 + 2];
											var49 = Class74.method1010(var18, -1938173710);
											Class66.method958(var49, var53, var16, 1149749156);
											continue;
										}

										if (var39 == 3109) {
											var6 -= 2;
											var53 = Class2.anIntArray13[var6];
											var16 = Class2.anIntArray13[1 + var6];
											var47 = var57 ? Class132.aClass117_Sub19_1590 : Class117_Sub22_Sub18_Sub2.aClass117_Sub19_2604;
											Class66.method958(var47, var53, var16, 1887686659);
											continue;
										}

										if (var39 == 3110) {
											--var6;
											Class95.aBool1107 = Class2.anIntArray13[var6] == 1;
											continue;
										}

										if (var39 == 3111) {
											Class2.anIntArray13[var6++] = Class117_Sub22_Sub21.aClass33_2499.aBool418 ? 1 : 0;
											continue;
										}

										if (var39 == 3112) {
											--var6;
											Class117_Sub22_Sub21.aClass33_2499.aBool418 = Class2.anIntArray13[var6] == 1;
											Class117_Sub14.method2216(-1240097073);
											continue;
										}

										if (var39 == 3113) {
											--var7;
											var61 = Class2.aStringArray14[var7];
											--var6;
											var48 = Class2.anIntArray13[var6] == 1;
											if (!var48) {
												Class117_Sub22_Sub5.method2416(var61, 3, (byte) 0);
												continue;
											}

											if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
												try {
													Desktop.getDesktop().browse(new URI(var61));
													continue;
												} catch (Exception var37) {
													;
												}
											}

											if (Class80.aString957.startsWith("win")) {
												Class117_Sub22_Sub5.method2416(var61, 0, (byte) 0);
											} else if (Class80.aString957.startsWith("mac")) {
												Class117_Sub22_Sub15.method2834(var61, 1, "openjs", -1666400050);
											} else {
												Class117_Sub22_Sub5.method2416(var61, 2, (byte) 0);
											}
											continue;
										}

										if (var39 == 3115) {
											--var6;
											var53 = Class2.anIntArray13[var6];
											GameClient.aClass117_Sub14_Sub1_2961.method2932(76, 2141533844);
											GameClient.aClass117_Sub14_Sub1_2961.method1996(var53, (byte) 1);
											continue;
										}

										if (var39 == 3116) {
											--var6;
											var53 = Class2.anIntArray13[var6];
											var7 -= 2;
											var44 = Class2.aStringArray14[var7];
											var45 = Class2.aStringArray14[var7 + 1];
											if (var44.length() <= 500 && var45.length() <= 500) {
												GameClient.aClass117_Sub14_Sub1_2961.method2932(106, 1744437694);
												GameClient.aClass117_Sub14_Sub1_2961.method1996(1 + Class37.method517(var44, -113573221) + Class37.method517(var45, 1200487241), (byte) -16);
												GameClient.aClass117_Sub14_Sub1_2961.method2126(var53, 1299505889);
												GameClient.aClass117_Sub14_Sub1_2961.method2001(var44, 2077808665);
												GameClient.aClass117_Sub14_Sub1_2961.method2001(var45, 1385826856);
											}
											continue;
										}
									} else if (var39 < 3300) {
										if (var39 == 3200) {
											var6 -= 3;
											Class34.method487(Class2.anIntArray13[var6], Class2.anIntArray13[var6 + 1], Class2.anIntArray13[var6 + 2], (byte) -14);
											continue;
										}

										if (var39 == 3201) {
											--var6;
											Class106_Sub1.method2244(Class2.anIntArray13[var6], (byte) 105);
											continue;
										}

										if (var39 == 3202) {
											var6 -= 2;
											Class58.method874(Class2.anIntArray13[var6], Class2.anIntArray13[var6 + 1], (byte) 3);
											continue;
										}
									} else {
										int var23;
										int var56;
										if (var39 < 3400) {
											if (var39 == 3300) {
												Class2.anIntArray13[var6++] = GameClient.anInt2923 * -488599663;
												continue;
											}

											if (var39 == 3301) {
												var6 -= 2;
												var53 = Class2.anIntArray13[var6];
												var16 = Class2.anIntArray13[1 + var6];
												Class2.anIntArray13[var6++] = Class24.method399(var53, var16, (byte) -70);
												continue;
											}

											Class117_Sub12 var55;
											if (var39 == 3302) {
												var6 -= 2;
												var53 = Class2.anIntArray13[var6];
												var16 = Class2.anIntArray13[var6 + 1];
												var52 = Class2.anIntArray13;
												var46 = var6++;
												var55 = (Class117_Sub12) Class117_Sub12.aClass127_1862.method1675((long) var53);
												if (var55 == null) {
													var20 = 0;
												} else if (var16 >= 0 && var16 < var55.anIntArray1856.length) {
													var20 = var55.anIntArray1856[var16];
												} else {
													var20 = 0;
												}

												var52[var46] = var20;
												continue;
											}

											if (var39 == 3303) {
												var6 -= 2;
												var53 = Class2.anIntArray13[var6];
												var16 = Class2.anIntArray13[var6 + 1];
												var52 = Class2.anIntArray13;
												var46 = var6++;
												var55 = (Class117_Sub12) Class117_Sub12.aClass127_1862.method1675((long) var53);
												if (var55 == null) {
													var20 = 0;
												} else if (var16 == -1) {
													var20 = 0;
												} else {
													var56 = 0;

													for (var23 = 0; var23 < var55.anIntArray1856.length; var23++) {
														if (var16 == var55.anIntArray1855[var23]) {
															var56 += var55.anIntArray1856[var23];
														}
													}

													var20 = var56;
												}

												var52[var46] = var20;
												continue;
											}

											if (var39 == 3304) {
												--var6;
												var53 = Class2.anIntArray13[var6];
												Class2.anIntArray13[var6++] = Class117_Sub14_Sub1.method2946(var53, (byte) -18).anInt2158 * -1336530623;
												continue;
											}

											if (var39 == 3305) {
												--var6;
												var53 = Class2.anIntArray13[var6];
												Class2.anIntArray13[var6++] = GameClient.anIntArray3055[var53];
												continue;
											}

											if (var39 == 3306) {
												--var6;
												var53 = Class2.anIntArray13[var6];
												Class2.anIntArray13[var6++] = GameClient.anIntArray3056[var53];
												continue;
											}

											if (var39 == 3307) {
												--var6;
												var53 = Class2.anIntArray13[var6];
												Class2.anIntArray13[var6++] = GameClient.anIntArray3057[var53];
												continue;
											}

											if (var39 == 3308) {
												var53 = Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421;
												var16 = Class117_Sub22_Sub20.anInt2497 * 544615727 + (Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2577 * 1961555871 >> 7);
												var18 = (Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2567 * -184603173 >> 7) + Class117_Sub22_Sub19.anInt2468 * -771797447;
												Class2.anIntArray13[var6++] = (var16 << 14) + (var53 << 28) + var18;
												continue;
											}

											if (var39 == 3309) {
												--var6;
												var53 = Class2.anIntArray13[var6];
												Class2.anIntArray13[var6++] = var53 >> 14 & 16383;
												continue;
											}

											if (var39 == 3310) {
												--var6;
												var53 = Class2.anIntArray13[var6];
												Class2.anIntArray13[var6++] = var53 >> 28;
												continue;
											}

											if (var39 == 3311) {
												--var6;
												var53 = Class2.anIntArray13[var6];
												Class2.anIntArray13[var6++] = var53 & 16383;
												continue;
											}

											if (var39 == 3312) {
												Class2.anIntArray13[var6++] = GameClient.aBool2920 ? 1 : 0;
												continue;
											}

											if (var39 == 3313) {
												var6 -= 2;
												var53 = Class2.anIntArray13[var6] + 32768;
												var16 = Class2.anIntArray13[var6 + 1];
												Class2.anIntArray13[var6++] = Class24.method399(var53, var16, (byte) -36);
												continue;
											}

											if (var39 == 3314) {
												var6 -= 2;
												var53 = 32768 + Class2.anIntArray13[var6];
												var16 = Class2.anIntArray13[1 + var6];
												var52 = Class2.anIntArray13;
												var46 = var6++;
												var55 = (Class117_Sub12) Class117_Sub12.aClass127_1862.method1675((long) var53);
												if (var55 == null) {
													var20 = 0;
												} else if (var16 >= 0 && var16 < var55.anIntArray1856.length) {
													var20 = var55.anIntArray1856[var16];
												} else {
													var20 = 0;
												}

												var52[var46] = var20;
												continue;
											}

											if (var39 == 3315) {
												var6 -= 2;
												var53 = 32768 + Class2.anIntArray13[var6];
												var16 = Class2.anIntArray13[var6 + 1];
												var52 = Class2.anIntArray13;
												var46 = var6++;
												var55 = (Class117_Sub12) Class117_Sub12.aClass127_1862.method1675((long) var53);
												if (var55 == null) {
													var20 = 0;
												} else if (var16 == -1) {
													var20 = 0;
												} else {
													var56 = 0;

													for (var23 = 0; var23 < var55.anIntArray1856.length; var23++) {
														if (var55.anIntArray1855[var23] == var16) {
															var56 += var55.anIntArray1856[var23];
														}
													}

													var20 = var56;
												}

												var52[var46] = var20;
												continue;
											}

											if (var39 == 3316) {
												if (GameClient.anInt3073 * -296746775 >= 2) {
													Class2.anIntArray13[var6++] = GameClient.anInt3073 * -296746775;
												} else {
													Class2.anIntArray13[var6++] = 0;
												}
												continue;
											}

											if (var39 == 3317) {
												Class2.anIntArray13[var6++] = GameClient.anInt2933 * -1302201703;
												continue;
											}

											if (var39 == 3318) {
												Class2.anIntArray13[var6++] = GameClient.anInt2916 * 622074983;
												continue;
											}

											if (var39 == 3321) {
												Class2.anIntArray13[var6++] = GameClient.anInt2932 * 2064875789;
												continue;
											}

											if (var39 == 3322) {
												Class2.anIntArray13[var6++] = GameClient.anInt3085 * 1515954537;
												continue;
											}

											if (var39 == 3323) {
												if (GameClient.aBool3088) {
													Class2.anIntArray13[var6++] = 1;
												} else {
													Class2.anIntArray13[var6++] = 0;
												}
												continue;
											}

											if (var39 == 3324) {
												Class2.anIntArray13[var6++] = GameClient.anInt3087 * 1930087115;
												continue;
											}
										} else if (var39 < 3500) {
											if (var39 == 3400) {
												var6 -= 2;
												var53 = Class2.anIntArray13[var6];
												var16 = Class2.anIntArray13[1 + var6];
												Class117_Sub22_Sub1 var58 = (Class117_Sub22_Sub1) Class117_Sub22_Sub1.aClass115_2155.method1515((long) var53);
												Class117_Sub22_Sub1 var59;
												if (var58 != null) {
													var59 = var58;
												} else {
													byte[] var75 = Class117_Sub22_Sub1.aClass106_2144.method1380(8, var53, (byte) 90);
													var58 = new Class117_Sub22_Sub1();
													if (var75 != null) {
														var58.method2344(new Class117_Sub14(var75), 1988835426);
													}

													Class117_Sub22_Sub1.aClass115_2155.method1517(var58, (long) var53);
													var59 = var58;
												}

												var58 = var59;
												if (var59.aChar2150 != 115) {
													;
												}

												for (var20 = 0; var20 < var58.anInt2149 * -754542281; var20++) {
													if (var16 == var58.anIntArray2152[var20]) {
														Class2.aStringArray14[var7++] = var58.aStringArray2146[var20];
														var58 = null;
														break;
													}
												}

												if (var58 != null) {
													Class2.aStringArray14[var7++] = var58.aString2147;
												}
												continue;
											}

											if (var39 == 3408) {
												var6 -= 4;
												var53 = Class2.anIntArray13[var6];
												var16 = Class2.anIntArray13[var6 + 1];
												var18 = Class2.anIntArray13[2 + var6];
												var46 = Class2.anIntArray13[3 + var6];
												Class117_Sub22_Sub1 var60 = (Class117_Sub22_Sub1) Class117_Sub22_Sub1.aClass115_2155.method1515((long) var18);
												Class117_Sub22_Sub1 var73;
												if (var60 != null) {
													var73 = var60;
												} else {
													byte[] var62 = Class117_Sub22_Sub1.aClass106_2144.method1380(8, var18, (byte) 25);
													var60 = new Class117_Sub22_Sub1();
													if (var62 != null) {
														var60.method2344(new Class117_Sub14(var62), 1981677189);
													}

													Class117_Sub22_Sub1.aClass115_2155.method1517(var60, (long) var18);
													var73 = var60;
												}

												var60 = var73;
												if (var53 == var73.aChar2145 && var73.aChar2150 == var16) {
													for (var56 = 0; var56 < var60.anInt2149 * -754542281; var56++) {
														if (var46 == var60.anIntArray2152[var56]) {
															if (var16 == 115) {
																Class2.aStringArray14[var7++] = var60.aStringArray2146[var56];
															} else {
																Class2.anIntArray13[var6++] = var60.anIntArray2151[var56];
															}

															var60 = null;
															break;
														}
													}

													if (var60 != null) {
														if (var16 == 115) {
															Class2.aStringArray14[var7++] = var60.aString2147;
														} else {
															Class2.anIntArray13[var6++] = var60.anInt2148 * -1459712369;
														}
													}
													continue;
												}

												if (var16 == 115) {
													Class2.aStringArray14[var7++] = "null";
												} else {
													Class2.anIntArray13[var6++] = 0;
												}
												continue;
											}
										} else {
											String var79;
											if (var39 < 3700) {
												if (var39 == 3600) {
													if (GameClient.anInt3188 * -977780163 == 0) {
														Class2.anIntArray13[var6++] = -2;
													} else if (GameClient.anInt3188 * -977780163 == 1) {
														Class2.anIntArray13[var6++] = -1;
													} else {
														Class2.anIntArray13[var6++] = GameClient.anInt3198 * -1278614973;
													}
													continue;
												}

												if (var39 == 3601) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													if (GameClient.anInt3188 * -977780163 == 2 && var53 < GameClient.anInt3198 * -1278614973) {
														Class2.aStringArray14[var7++] = GameClient.aClass49Array3098[var53].aString660;
														Class2.aStringArray14[var7++] = GameClient.aClass49Array3098[var53].aString656;
														continue;
													}

													Class2.aStringArray14[var7++] = "";
													Class2.aStringArray14[var7++] = "";
													continue;
												}

												if (var39 == 3602) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													if (GameClient.anInt3188 * -977780163 == 2 && var53 < GameClient.anInt3198 * -1278614973) {
														Class2.anIntArray13[var6++] = GameClient.aClass49Array3098[var53].anInt662 * -2124244471;
														continue;
													}

													Class2.anIntArray13[var6++] = 0;
													continue;
												}

												if (var39 == 3603) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													if (GameClient.anInt3188 * -977780163 == 2 && var53 < GameClient.anInt3198 * -1278614973) {
														Class2.anIntArray13[var6++] = GameClient.aClass49Array3098[var53].anInt658 * -836879707;
														continue;
													}

													Class2.anIntArray13[var6++] = 0;
													continue;
												}

												if (var39 == 3604) {
													--var7;
													var61 = Class2.aStringArray14[var7];
													--var6;
													var16 = Class2.anIntArray13[var6];
													GameClient.aClass117_Sub14_Sub1_2961.method2932(44, 1641401996);
													GameClient.aClass117_Sub14_Sub1_2961.method2126(Class37.method517(var61, -920909437) + 1, 395224187);
													GameClient.aClass117_Sub14_Sub1_2961.method2035(var16, -1624222189);
													GameClient.aClass117_Sub14_Sub1_2961.method2001(var61, 2030401241);
													continue;
												}

												if (var39 == 3605) {
													--var7;
													var61 = Class2.aStringArray14[var7];
													Class114_Sub1.method1840(var61, -728197365);
													continue;
												}

												if (var39 == 3606) {
													--var7;
													var61 = Class2.aStringArray14[var7];
													if (var61 == null) {
														continue;
													}

													var44 = Class32.method472(var61, Class54.aClass137_729, 1538480085);
													if (var44 == null) {
														continue;
													}

													var18 = 0;

													while (true) {
														if (var18 >= GameClient.anInt3198 * -1278614973) {
															continue label2996;
														}

														Class49 var64 = GameClient.aClass49Array3098[var18];
														var79 = var64.aString660;
														var66 = Class32.method472(var79, Class54.aClass137_729, 1538480085);
														boolean var67;
														if (var61 != null && var79 != null) {
															if (!var61.startsWith("#") && !var79.startsWith("#")) {
																var67 = var44.equals(var66);
															} else {
																var67 = var61.equals(var79);
															}
														} else {
															var67 = false;
														}

														if (var67) {
															GameClient.anInt3198 -= 564394603;

															for (var23 = var18; var23 < GameClient.anInt3198 * -1278614973; var23++) {
																GameClient.aClass49Array3098[var23] = GameClient.aClass49Array3098[1 + var23];
															}

															GameClient.anInt3112 = GameClient.anInt3104 * -481597009;
															GameClient.aClass117_Sub14_Sub1_2961.method2932(251, 1514713819);
															GameClient.aClass117_Sub14_Sub1_2961.method2126(Class37.method517(var61, 2076611008), -22895259);
															GameClient.aClass117_Sub14_Sub1_2961.method2001(var61, 1193595192);
															continue label2996;
														}

														++var18;
													}
												}

												if (var39 == 3607) {
													--var7;
													var61 = Class2.aStringArray14[var7];
													Class117_Sub13.method1990(var61, false, 17905103);
													continue;
												}

												if (var39 == 3608) {
													--var7;
													var61 = Class2.aStringArray14[var7];
													Class54_Sub1.method1933(var61, -291334028);
													continue;
												}

												if (var39 == 3609) {
													--var7;
													var61 = Class2.aStringArray14[var7];
													Class90[] var65 = Class65.method941(-15493759);

													for (var18 = 0; var18 < var65.length; var18++) {
														Class90 var63 = var65[var18];
														if (var63.anInt1068 * 309306431 != -1 && var61.startsWith(Class44.method736(var63.anInt1068 * 309306431, -1833448948))) {
															var61 = var61.substring(6 + Integer.toString(var63.anInt1068 * 309306431).length());
															break;
														}
													}

													Class2.anIntArray13[var6++] = Class84.method1141(var61, false, 2006421320) ? 1 : 0;
													continue;
												}

												if (var39 == 3611) {
													if (GameClient.aString3146 != null) {
														Class2.aStringArray14[var7++] = Class30.method423(GameClient.aString3146, (byte) -72);
													} else {
														Class2.aStringArray14[var7++] = "";
													}
													continue;
												}

												if (var39 == 3612) {
													if (GameClient.aString3146 != null) {
														Class2.anIntArray13[var6++] = Class29.anInt362 * -562694677;
													} else {
														Class2.anIntArray13[var6++] = 0;
													}
													continue;
												}

												if (var39 == 3613) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													if (GameClient.aString3146 != null && var53 < Class29.anInt362 * -562694677) {
														Class2.aStringArray14[var7++] = Class117_Sub22_Sub18_Sub5.aClass117_Sub13Array2747[var53].aString1870;
														continue;
													}

													Class2.aStringArray14[var7++] = "";
													continue;
												}

												if (var39 == 3614) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													if (GameClient.aString3146 != null && var53 < Class29.anInt362 * -562694677) {
														Class2.anIntArray13[var6++] = Class117_Sub22_Sub18_Sub5.aClass117_Sub13Array2747[var53].anInt1866 * -265391575;
														continue;
													}

													Class2.anIntArray13[var6++] = 0;
													continue;
												}

												if (var39 == 3615) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													if (GameClient.aString3146 != null && var53 < Class29.anInt362 * -562694677) {
														Class2.anIntArray13[var6++] = Class117_Sub22_Sub18_Sub5.aClass117_Sub13Array2747[var53].aByte1867;
														continue;
													}

													Class2.anIntArray13[var6++] = 0;
													continue;
												}

												if (var39 == 3616) {
													Class2.anIntArray13[var6++] = Class134.aByte1604;
													continue;
												}

												if (var39 == 3617) {
													--var7;
													var61 = Class2.aStringArray14[var7];
													Class27.method410(var61, 1175506991);
													continue;
												}

												if (var39 == 3618) {
													Class2.anIntArray13[var6++] = Class56.aByte744;
													continue;
												}

												if (var39 == 3619) {
													--var7;
													var61 = Class2.aStringArray14[var7];
													if (!var61.equals("")) {
														GameClient.aClass117_Sub14_Sub1_2961.method2932(232, -49753194);
														GameClient.aClass117_Sub14_Sub1_2961.method2126(Class37.method517(var61, -557803577), 2038514263);
														GameClient.aClass117_Sub14_Sub1_2961.method2001(var61, 1182189052);
													}
													continue;
												}

												if (var39 == 3620) {
													Class117_Sub22_Sub5.method2388(-1010608009);
													continue;
												}

												if (var39 == 3621) {
													if (GameClient.anInt3188 * -977780163 == 0) {
														Class2.anIntArray13[var6++] = -1;
													} else {
														Class2.anIntArray13[var6++] = GameClient.anInt2976 * -178563241;
													}
													continue;
												}

												if (var39 == 3622) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													if (GameClient.anInt3188 * -977780163 != 0 && var53 < GameClient.anInt2976 * -178563241) {
														Class2.aStringArray14[var7++] = GameClient.aClass43Array3192[var53].aString581;
														Class2.aStringArray14[var7++] = GameClient.aClass43Array3192[var53].aString588;
														continue;
													}

													Class2.aStringArray14[var7++] = "";
													Class2.aStringArray14[var7++] = "";
													continue;
												}

												if (var39 == 3623) {
													--var7;
													var61 = Class2.aStringArray14[var7];
													if (var61.startsWith(Class44.method736(0, -438991007)) || var61.startsWith(Class44.method736(1, -352920227))) {
														var61 = var61.substring(7);
													}

													Class2.anIntArray13[var6++] = Class117_Sub7.method1951(var61, (byte) 106) ? 1 : 0;
													continue;
												}

												if (var39 == 3624) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													if (Class117_Sub22_Sub18_Sub5.aClass117_Sub13Array2747 != null && var53 < Class29.anInt362 * -562694677 && Class117_Sub22_Sub18_Sub5.aClass117_Sub13Array2747[var53].aString1870.equalsIgnoreCase(Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.getPlayerName())) {
														Class2.anIntArray13[var6++] = 1;
														continue;
													}

													Class2.anIntArray13[var6++] = 0;
													continue;
												}

												if (var39 == 3625) {
													if (GameClient.aString3147 != null) {
														Class2.aStringArray14[var7++] = Class30.method423(GameClient.aString3147, (byte) -72);
													} else {
														Class2.aStringArray14[var7++] = "";
													}
													continue;
												}
											} else if (var39 < 4000) {
												if (var39 == 3903) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													Class2.anIntArray13[var6++] = GameClient.aClass143Array3196[var53].method1773(-792517593);
													continue;
												}

												if (var39 == 3904) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													Class2.anIntArray13[var6++] = GameClient.aClass143Array3196[var53].anInt1643 * -1077382171;
													continue;
												}

												if (var39 == 3905) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													Class2.anIntArray13[var6++] = GameClient.aClass143Array3196[var53].anInt1644 * 645279987;
													continue;
												}

												if (var39 == 3906) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													Class2.anIntArray13[var6++] = GameClient.aClass143Array3196[var53].anInt1647 * -1358076039;
													continue;
												}

												if (var39 == 3907) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													Class2.anIntArray13[var6++] = GameClient.aClass143Array3196[var53].anInt1646 * 341197723;
													continue;
												}

												if (var39 == 3908) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													Class2.anIntArray13[var6++] = GameClient.aClass143Array3196[var53].anInt1642 * 1560430701;
													continue;
												}

												if (var39 == 3910) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													var16 = GameClient.aClass143Array3196[var53].method1792(-110580150);
													Class2.anIntArray13[var6++] = var16 == 0 ? 1 : 0;
													continue;
												}

												if (var39 == 3911) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													var16 = GameClient.aClass143Array3196[var53].method1792(-445143645);
													Class2.anIntArray13[var6++] = var16 == 2 ? 1 : 0;
													continue;
												}

												if (var39 == 3912) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													var16 = GameClient.aClass143Array3196[var53].method1792(-2022459638);
													Class2.anIntArray13[var6++] = var16 == 5 ? 1 : 0;
													continue;
												}

												if (var39 == 3913) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													var16 = GameClient.aClass143Array3196[var53].method1792(-364250102);
													Class2.anIntArray13[var6++] = var16 == 1 ? 1 : 0;
													continue;
												}

												boolean var101;
												if (var39 == 3914) {
													--var6;
													var101 = Class2.anIntArray13[var6] == 1;
													if (Class117_Sub12.aClass141_1858 != null) {
														Class117_Sub12.aClass141_1858.method1767(Class141.aComparator1633, var101, 1266526908);
													}
													continue;
												}

												if (var39 == 3915) {
													--var6;
													var101 = Class2.anIntArray13[var6] == 1;
													if (Class117_Sub12.aClass141_1858 != null) {
														Class117_Sub12.aClass141_1858.method1767(Class141.aComparator1632, var101, 1427917611);
													}
													continue;
												}

												if (var39 == 3916) {
													var6 -= 2;
													var101 = Class2.anIntArray13[var6] == 1;
													var48 = Class2.anIntArray13[1 + var6] == 1;
													if (Class117_Sub12.aClass141_1858 != null) {
														Class117_Sub12.aClass141_1858.method1767(new Class44(var48), var101, 1061282758);
													}
													continue;
												}

												if (var39 == 3917) {
													--var6;
													var101 = Class2.anIntArray13[var6] == 1;
													if (Class117_Sub12.aClass141_1858 != null) {
														Class117_Sub12.aClass141_1858.method1767(Class141.aComparator1636, var101, 1234477956);
													}
													continue;
												}

												if (var39 == 3918) {
													--var6;
													var101 = Class2.anIntArray13[var6] == 1;
													if (Class117_Sub12.aClass141_1858 != null) {
														Class117_Sub12.aClass141_1858.method1767(Class141.aComparator1630, var101, 1592671759);
													}
													continue;
												}

												if (var39 == 3919) {
													Class2.anIntArray13[var6++] = Class117_Sub12.aClass141_1858 == null ? 0 : Class117_Sub12.aClass141_1858.aList1631.size();
													continue;
												}

												Class133 var71;
												if (var39 == 3920) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													var71 = (Class133) Class117_Sub12.aClass141_1858.aList1631.get(var53);
													Class2.anIntArray13[var6++] = var71.anInt1601 * 2081643803;
													continue;
												}

												if (var39 == 3921) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													var71 = (Class133) Class117_Sub12.aClass141_1858.aList1631.get(var53);
													Class2.aStringArray14[var7++] = var71.method1719((short) 23963);
													continue;
												}

												if (var39 == 3922) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													var71 = (Class133) Class117_Sub12.aClass141_1858.aList1631.get(var53);
													Class2.aStringArray14[var7++] = var71.method1718(1042839908);
													continue;
												}

												if (var39 == 3923) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													var71 = (Class133) Class117_Sub12.aClass141_1858.aList1631.get(var53);
													long var24 = Class47.method774(1388458113) - Class117_Sub9.aLong1824 * 19670256500101599L - var71.aLong1597 * -423537625437241753L;
													var20 = (int) (var24 / 3600000L);
													var21 = (int) ((var24 - (long) (var20 * 3600000)) / 60000L);
													var56 = (int) ((var24 - (long) (var20 * 3600000) - (long) (var21 * 60000)) / 1000L);
													String var68 = var20 + ":" + var21 / 10 + var21 % 10 + ":" + var56 / 10 + var56 % 10;
													Class2.aStringArray14[var7++] = var68;
													continue;
												}

												if (var39 == 3924) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													var71 = (Class133) Class117_Sub12.aClass141_1858.aList1631.get(var53);
													Class2.anIntArray13[var6++] = var71.aClass143_1598.anInt1647 * -1358076039;
													continue;
												}

												if (var39 == 3925) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													var71 = (Class133) Class117_Sub12.aClass141_1858.aList1631.get(var53);
													Class2.anIntArray13[var6++] = var71.aClass143_1598.anInt1644 * 645279987;
													continue;
												}

												if (var39 == 3926) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													var71 = (Class133) Class117_Sub12.aClass141_1858.aList1631.get(var53);
													Class2.anIntArray13[var6++] = var71.aClass143_1598.anInt1643 * -1077382171;
													continue;
												}
											} else if (var39 < 4100) {
												if (var39 == 4000) {
													var6 -= 2;
													var53 = Class2.anIntArray13[var6];
													var16 = Class2.anIntArray13[var6 + 1];
													Class2.anIntArray13[var6++] = var16 + var53;
													continue;
												}

												if (var39 == 4001) {
													var6 -= 2;
													var53 = Class2.anIntArray13[var6];
													var16 = Class2.anIntArray13[1 + var6];
													Class2.anIntArray13[var6++] = var53 - var16;
													continue;
												}

												if (var39 == 4002) {
													var6 -= 2;
													var53 = Class2.anIntArray13[var6];
													var16 = Class2.anIntArray13[1 + var6];
													Class2.anIntArray13[var6++] = var53 * var16;
													continue;
												}

												if (var39 == 4003) {
													var6 -= 2;
													var53 = Class2.anIntArray13[var6];
													var16 = Class2.anIntArray13[1 + var6];
													Class2.anIntArray13[var6++] = var53 / var16;
													continue;
												}

												if (var39 == 4004) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													Class2.anIntArray13[var6++] = (int) (Math.random() * (double) var53);
													continue;
												}

												if (var39 == 4005) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													Class2.anIntArray13[var6++] = (int) (Math.random() * (double) (var53 + 1));
													continue;
												}

												if (var39 == 4006) {
													var6 -= 5;
													var53 = Class2.anIntArray13[var6];
													var16 = Class2.anIntArray13[var6 + 1];
													var18 = Class2.anIntArray13[2 + var6];
													var46 = Class2.anIntArray13[var6 + 3];
													var20 = Class2.anIntArray13[4 + var6];
													Class2.anIntArray13[var6++] = (var16 - var53) * (var20 - var18) / (var46 - var18) + var53;
													continue;
												}

												if (var39 == 4007) {
													var6 -= 2;
													var53 = Class2.anIntArray13[var6];
													var16 = Class2.anIntArray13[1 + var6];
													Class2.anIntArray13[var6++] = var53 * var16 / 100 + var53;
													continue;
												}

												if (var39 == 4008) {
													var6 -= 2;
													var53 = Class2.anIntArray13[var6];
													var16 = Class2.anIntArray13[1 + var6];
													Class2.anIntArray13[var6++] = var53 | 1 << var16;
													continue;
												}

												if (var39 == 4009) {
													var6 -= 2;
													var53 = Class2.anIntArray13[var6];
													var16 = Class2.anIntArray13[1 + var6];
													Class2.anIntArray13[var6++] = var53 & -1 - (1 << var16);
													continue;
												}

												if (var39 == 4010) {
													var6 -= 2;
													var53 = Class2.anIntArray13[var6];
													var16 = Class2.anIntArray13[1 + var6];
													Class2.anIntArray13[var6++] = (var53 & 1 << var16) != 0 ? 1 : 0;
													continue;
												}

												if (var39 == 4011) {
													var6 -= 2;
													var53 = Class2.anIntArray13[var6];
													var16 = Class2.anIntArray13[1 + var6];
													Class2.anIntArray13[var6++] = var53 % var16;
													continue;
												}

												if (var39 == 4012) {
													var6 -= 2;
													var53 = Class2.anIntArray13[var6];
													var16 = Class2.anIntArray13[1 + var6];
													if (var53 == 0) {
														Class2.anIntArray13[var6++] = 0;
													} else {
														Class2.anIntArray13[var6++] = (int) Math.pow((double) var53, (double) var16);
													}
													continue;
												}

												if (var39 == 4013) {
													var6 -= 2;
													var53 = Class2.anIntArray13[var6];
													var16 = Class2.anIntArray13[var6 + 1];
													if (var53 == 0) {
														Class2.anIntArray13[var6++] = 0;
													} else if (var16 == 0) {
														Class2.anIntArray13[var6++] = Integer.MAX_VALUE;
													} else {
														Class2.anIntArray13[var6++] = (int) Math.pow((double) var53, 1.0D / (double) var16);
													}
													continue;
												}

												if (var39 == 4014) {
													var6 -= 2;
													var53 = Class2.anIntArray13[var6];
													var16 = Class2.anIntArray13[var6 + 1];
													Class2.anIntArray13[var6++] = var53 & var16;
													continue;
												}

												if (var39 == 4015) {
													var6 -= 2;
													var53 = Class2.anIntArray13[var6];
													var16 = Class2.anIntArray13[var6 + 1];
													Class2.anIntArray13[var6++] = var53 | var16;
													continue;
												}
											} else if (var39 < 4200) {
												if (var39 == 4100) {
													--var7;
													var61 = Class2.aStringArray14[var7];
													--var6;
													var16 = Class2.anIntArray13[var6];
													Class2.aStringArray14[var7++] = var61 + var16;
													continue;
												}

												if (var39 == 4101) {
													var7 -= 2;
													var61 = Class2.aStringArray14[var7];
													var44 = Class2.aStringArray14[var7 + 1];
													Class2.aStringArray14[var7++] = var61 + var44;
													continue;
												}

												int var26;
												int var27;
												int var88;
												int var90;
												if (var39 == 4102) {
													--var7;
													var61 = Class2.aStringArray14[var7];
													--var6;
													var16 = Class2.anIntArray13[var6];
													var85 = Class2.aStringArray14;
													var46 = var7++;
													if (var16 < 0) {
														var66 = Integer.toString(var16);
													} else {
														var23 = var16;
														if (var16 < 0) {
															var72 = Integer.toString(var16, 10);
														} else {
															var26 = 2;

															for (var27 = var16 / 10; var27 != 0; var26++) {
																var27 /= 10;
															}

															char[] var78 = new char[var26];
															var78[0] = 43;

															for (int var81 = var26 - 1; var81 > 0; --var81) {
																var88 = var23;
																var23 /= 10;
																var90 = var88 - var23 * 10;
																if (var90 >= 10) {
																	var78[var81] = (char) (var90 + 87);
																} else {
																	var78[var81] = (char) (var90 + 48);
																}
															}

															var72 = new String(var78);
														}

														var66 = var72;
													}

													var85[var46] = var61 + var66;
													continue;
												}

												if (var39 == 4103) {
													--var7;
													var61 = Class2.aStringArray14[var7];
													Class2.aStringArray14[var7++] = var61.toLowerCase();
													continue;
												}

												if (var39 == 4104) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													long var32 = (11745L + (long) var53) * 86400000L;
													Class2.aCalendar19.setTime(new Date(var32));
													var46 = Class2.aCalendar19.get(5);
													var20 = Class2.aCalendar19.get(2);
													var21 = Class2.aCalendar19.get(1);
													Class2.aStringArray14[var7++] = var46 + "-" + Class2.aStringArray18[var20] + "-" + var21;
													continue;
												}

												if (var39 == 4105) {
													var7 -= 2;
													var61 = Class2.aStringArray14[var7];
													var44 = Class2.aStringArray14[var7 + 1];
													if (Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.aClass91_2871 != null && Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.aClass91_2871.aBool1076) {
														Class2.aStringArray14[var7++] = var44;
														continue;
													}

													Class2.aStringArray14[var7++] = var61;
													continue;
												}

												if (var39 == 4106) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													Class2.aStringArray14[var7++] = Integer.toString(var53);
													continue;
												}

												if (var39 == 4107) {
													var7 -= 2;
													int[] var107 = Class2.anIntArray13;
													var16 = var6++;
													String var76 = Class2.aStringArray14[var7];
													var79 = Class2.aStringArray14[var7 + 1];
													var21 = GameClient.anInt2922 * 1063005447;
													var56 = var76.length();
													var23 = var79.length();
													var26 = 0;
													var27 = 0;
													char var28 = 0;
													char var29 = 0;

													label2797:
													while (true) {
														if (var26 - var28 >= var56 && var27 - var29 >= var23) {
															var88 = Math.min(var56, var23);

															char var35;
															for (var90 = 0; var90 < var88; var90++) {
																char var34 = var76.charAt(var90);
																var35 = var79.charAt(var90);
																if (var35 != var34 && Character.toUpperCase(var34) != Character.toUpperCase(var35)) {
																	var34 = Character.toLowerCase(var34);
																	var35 = Character.toLowerCase(var35);
																	if (var34 != var35) {
																		var18 = Class117_Sub22_Sub1.method2354(var34, var21, (byte) 26) - Class117_Sub22_Sub1.method2354(var35, var21, (byte) 24);
																		break label2797;
																	}
																}
															}

															var90 = var56 - var23;
															if (var90 != 0) {
																var18 = var90;
															} else {
																for (int var93 = 0; var93 < var88; var93++) {
																	var35 = var76.charAt(var93);
																	char var36 = var79.charAt(var93);
																	if (var36 != var35) {
																		var18 = Class117_Sub22_Sub1.method2354(var35, var21, (byte) 107) - Class117_Sub22_Sub1.method2354(var36, var21, (byte) 95);
																		break label2797;
																	}
																}

																var18 = 0;
															}
															break;
														}

														if (var26 - var28 >= var56) {
															var18 = -1;
															break;
														}

														if (var27 - var29 >= var23) {
															var18 = 1;
															break;
														}

														char var30;
														if (var28 != 0) {
															var30 = var28;
															boolean var77 = false;
														} else {
															var30 = var76.charAt(var26++);
														}

														char var31;
														if (var29 != 0) {
															var31 = var29;
															boolean var80 = false;
														} else {
															var31 = var79.charAt(var27++);
														}

														var28 = Class3.method66(var30, (byte) 12);
														var29 = Class3.method66(var31, (byte) 12);
														var30 = Class117_Sub22_Sub18_Sub1_Sub2.method3564(var30, var21, -2077379620);
														var31 = Class117_Sub22_Sub18_Sub1_Sub2.method3564(var31, var21, 1661455120);
														if (var30 != var31 && Character.toUpperCase(var30) != Character.toUpperCase(var31)) {
															var30 = Character.toLowerCase(var30);
															var31 = Character.toLowerCase(var31);
															if (var30 != var31) {
																var18 = Class117_Sub22_Sub1.method2354(var30, var21, (byte) 76) - Class117_Sub22_Sub1.method2354(var31, var21, (byte) 113);
																break;
															}
														}
													}

													var107[var16] = Class117_Sub22_Sub11.method2566(var18, -2033778903);
													continue;
												}

												byte[] var74;
												Class117_Sub22_Sub17_Sub4_Sub1 var84;
												if (var39 == 4108) {
													--var7;
													var61 = Class2.aStringArray14[var7];
													var6 -= 2;
													var16 = Class2.anIntArray13[var6];
													var18 = Class2.anIntArray13[1 + var6];
													var74 = Class32.aClass106_Sub1_412.method1380(var18, 0, (byte) 2);
													var84 = new Class117_Sub22_Sub17_Sub4_Sub1(var74);
													Class2.anIntArray13[var6++] = var84.method3457(var61, var16);
													continue;
												}

												if (var39 == 4109) {
													--var7;
													var61 = Class2.aStringArray14[var7];
													var6 -= 2;
													var16 = Class2.anIntArray13[var6];
													var18 = Class2.anIntArray13[1 + var6];
													var74 = Class32.aClass106_Sub1_412.method1380(var18, 0, (byte) 6);
													var84 = new Class117_Sub22_Sub17_Sub4_Sub1(var74);
													Class2.anIntArray13[var6++] = var84.method3500(var61, var16);
													continue;
												}

												if (var39 == 4110) {
													var7 -= 2;
													var61 = Class2.aStringArray14[var7];
													var44 = Class2.aStringArray14[1 + var7];
													--var6;
													if (Class2.anIntArray13[var6] == 1) {
														Class2.aStringArray14[var7++] = var61;
													} else {
														Class2.aStringArray14[var7++] = var44;
													}
													continue;
												}

												if (var39 == 4111) {
													--var7;
													var61 = Class2.aStringArray14[var7];
													Class2.aStringArray14[var7++] = Class117_Sub22_Sub17_Sub4.method3458(var61);
													continue;
												}

												if (var39 == 4112) {
													--var7;
													var61 = Class2.aStringArray14[var7];
													--var6;
													var16 = Class2.anIntArray13[var6];
													Class2.aStringArray14[var7++] = var61 + (char) var16;
													continue;
												}

												char var82;
												if (var39 == 4113) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													var41 = Class2.anIntArray13;
													var18 = var6++;
													var82 = (char) var53;
													if (var82 >= 32 && var82 <= 126) {
														var69 = true;
													} else if (var82 >= 160 && var82 <= 255) {
														var69 = true;
													} else if (var82 != 8364 && var82 != 338 && var82 != 8212 && var82 != 339 && var82 != 376) {
														var69 = false;
													} else {
														var69 = true;
													}

													var41[var18] = var69 ? 1 : 0;
													continue;
												}

												if (var39 == 4114) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													Class2.anIntArray13[var6++] = Class117_Sub22_Sub7.method2471((char) var53, 1700498392) ? 1 : 0;
													continue;
												}

												if (var39 == 4115) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													var41 = Class2.anIntArray13;
													var18 = var6++;
													var82 = (char) var53;
													var69 = var82 >= 65 && var82 <= 90 || var82 >= 97 && var82 <= 122;
													var41[var18] = var69 ? 1 : 0;
													continue;
												}

												if (var39 == 4116) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													Class2.anIntArray13[var6++] = Class26.method405((char) var53, 13993284) ? 1 : 0;
													continue;
												}

												if (var39 == 4117) {
													--var7;
													var61 = Class2.aStringArray14[var7];
													if (var61 != null) {
														Class2.anIntArray13[var6++] = var61.length();
													} else {
														Class2.anIntArray13[var6++] = 0;
													}
													continue;
												}

												if (var39 == 4118) {
													--var7;
													var61 = Class2.aStringArray14[var7];
													var6 -= 2;
													var16 = Class2.anIntArray13[var6];
													var18 = Class2.anIntArray13[1 + var6];
													Class2.aStringArray14[var7++] = var61.substring(var16, var18);
													continue;
												}

												if (var39 == 4119) {
													--var7;
													var61 = Class2.aStringArray14[var7];
													StringBuilder var94 = new StringBuilder(var61.length());
													var70 = false;

													for (var46 = 0; var46 < var61.length(); var46++) {
														var82 = var61.charAt(var46);
														if (var82 == 60) {
															var70 = true;
														} else if (var82 == 62) {
															var70 = false;
														} else if (!var70) {
															var94.append(var82);
														}
													}

													Class2.aStringArray14[var7++] = var94.toString();
													continue;
												}

												if (var39 == 4120) {
													--var7;
													var61 = Class2.aStringArray14[var7];
													--var6;
													var16 = Class2.anIntArray13[var6];
													Class2.anIntArray13[var6++] = var61.indexOf(var16);
													continue;
												}

												if (var39 == 4121) {
													var7 -= 2;
													var61 = Class2.aStringArray14[var7];
													var44 = Class2.aStringArray14[var7 + 1];
													--var6;
													var18 = Class2.anIntArray13[var6];
													Class2.anIntArray13[var6++] = var61.indexOf(var44, var18);
													continue;
												}
											} else if (var39 < 4300) {
												if (var39 == 4200) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													Class2.aStringArray14[var7++] = Class117_Sub13.method1992(var53, 139745098).aString2264;
													continue;
												}

												Class117_Sub22_Sub6 var87;
												if (var39 == 4201) {
													var6 -= 2;
													var53 = Class2.anIntArray13[var6];
													var16 = Class2.anIntArray13[1 + var6];
													var87 = Class117_Sub13.method1992(var53, 825794788);
													if (var16 >= 1 && var16 <= 5 && var87.aStringArray2242[var16 - 1] != null) {
														Class2.aStringArray14[var7++] = var87.aStringArray2242[var16 - 1];
														continue;
													}

													Class2.aStringArray14[var7++] = "";
													continue;
												}

												if (var39 == 4202) {
													var6 -= 2;
													var53 = Class2.anIntArray13[var6];
													var16 = Class2.anIntArray13[var6 + 1];
													var87 = Class117_Sub13.method1992(var53, -1281425408);
													if (var16 >= 1 && var16 <= 5 && var87.aStringArray2243[var16 - 1] != null) {
														Class2.aStringArray14[var7++] = var87.aStringArray2243[var16 - 1];
														continue;
													}

													Class2.aStringArray14[var7++] = "";
													continue;
												}

												if (var39 == 4203) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													Class2.anIntArray13[var6++] = Class117_Sub13.method1992(var53, 1335282471).anInt2257 * 453407725;
													continue;
												}

												if (var39 == 4204) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													Class2.anIntArray13[var6++] = Class117_Sub13.method1992(var53, -163285460).anInt2222 * -1106690991 == 1 ? 1 : 0;
													continue;
												}

												Class117_Sub22_Sub6 var99;
												if (var39 == 4205) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													var99 = Class117_Sub13.method1992(var53, 1579721516);
													if (var99.anInt2259 * -1574477923 == -1 && var99.anInt2258 * -98750407 >= 0) {
														Class2.anIntArray13[var6++] = var99.anInt2258 * -98750407;
														continue;
													}

													Class2.anIntArray13[var6++] = var53;
													continue;
												}

												if (var39 == 4206) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													var99 = Class117_Sub13.method1992(var53, -526408752);
													if (var99.anInt2259 * -1574477923 >= 0 && var99.anInt2258 * -98750407 >= 0) {
														Class2.anIntArray13[var6++] = var99.anInt2258 * -98750407;
														continue;
													}

													Class2.anIntArray13[var6++] = var53;
													continue;
												}

												if (var39 == 4207) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													Class2.anIntArray13[var6++] = Class117_Sub13.method1992(var53, -1016441587).aBool2241 ? 1 : 0;
													continue;
												}

												if (var39 == 4210) {
													--var7;
													var61 = Class2.aStringArray14[var7];
													--var6;
													var16 = Class2.anIntArray13[var6];
													Class117_Sub14.method2217(var61, var16 == 1, (byte) 8);
													Class2.anIntArray13[var6++] = Class82.anInt977 * 1747122333;
													continue;
												}

												if (var39 == 4211) {
													if (Class59.aShortArray757 != null && Class117_Sub5.anInt1751 * 88848493 < Class82.anInt977 * 1747122333) {
														Class2.anIntArray13[var6++] = Class59.aShortArray757[(Class117_Sub5.anInt1751 += 247796069) * 88848493 - 1] & 65535;
														continue;
													}

													Class2.anIntArray13[var6++] = -1;
													continue;
												}

												if (var39 == 4212) {
													Class117_Sub5.anInt1751 = 0;
													continue;
												}
											} else if (var39 < 5100) {
												if (var39 == 5000) {
													Class2.anIntArray13[var6++] = GameClient.anInt3026 * -1711687437;
													continue;
												}

												if (var39 == 5001) {
													var6 -= 3;
													GameClient.anInt3026 = Class2.anIntArray13[var6] * 391913531;
													Class117_Sub22_Sub18_Sub3.aClass69_2625 = Class74.method1009(Class2.anIntArray13[1 + var6], 1938208902);
													if (Class117_Sub22_Sub18_Sub3.aClass69_2625 == null) {
														Class117_Sub22_Sub18_Sub3.aClass69_2625 = Class69.aClass69_850;
													}

													GameClient.anInt3138 = Class2.anIntArray13[2 + var6] * 2033389001;
													GameClient.aClass117_Sub14_Sub1_2961.method2932(70, 625258897);
													GameClient.aClass117_Sub14_Sub1_2961.method2126(GameClient.anInt3026 * -1711687437, 2097131283);
													GameClient.aClass117_Sub14_Sub1_2961.method2126(Class117_Sub22_Sub18_Sub3.aClass69_2625.anInt849 * -428394515, 314408474);
													GameClient.aClass117_Sub14_Sub1_2961.method2126(GameClient.anInt3138 * 582524025, 2115135955);
													continue;
												}

												if (var39 == 5002) {
													--var7;
													var61 = Class2.aStringArray14[var7];
													var6 -= 2;
													var16 = Class2.anIntArray13[var6];
													var18 = Class2.anIntArray13[var6 + 1];
													GameClient.aClass117_Sub14_Sub1_2961.method2932(198, 402646192);
													GameClient.aClass117_Sub14_Sub1_2961.method2126(Class37.method517(var61, -206407959) + 2, 1286381885);
													GameClient.aClass117_Sub14_Sub1_2961.method2001(var61, 1306645101);
													GameClient.aClass117_Sub14_Sub1_2961.method2126(var16 - 1, 96466180);
													GameClient.aClass117_Sub14_Sub1_2961.method2126(var18, 753602072);
													continue;
												}

												if (var39 == 5003) {
													var6 -= 2;
													var53 = Class2.anIntArray13[var6];
													var16 = Class2.anIntArray13[1 + var6];
													Class117_Sub22_Sub7 var92 = Class117_Sub22_Sub4.method2387(var53, var16, 767321622);
													if (var92 != null) {
														Class2.anIntArray13[var6++] = var92.anInt2279 * 1239720595;
														Class2.anIntArray13[var6++] = var92.anInt2274 * 2085983115;
														Class2.aStringArray14[var7++] = var92.aString2276 != null ? var92.aString2276 : "";
														Class2.aStringArray14[var7++] = var92.aString2277 != null ? var92.aString2277 : "";
														Class2.aStringArray14[var7++] = var92.aString2275 != null ? var92.aString2275 : "";
													} else {
														Class2.anIntArray13[var6++] = -1;
														Class2.anIntArray13[var6++] = 0;
														Class2.aStringArray14[var7++] = "";
														Class2.aStringArray14[var7++] = "";
														Class2.aStringArray14[var7++] = "";
													}
													continue;
												}

												if (var39 == 5004) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													Class117_Sub22_Sub7 var102 = Class85.method1142(var53, 1373799620);
													if (var102 != null) {
														Class2.anIntArray13[var6++] = var102.anInt2273 * -484423361;
														Class2.anIntArray13[var6++] = var102.anInt2274 * 2085983115;
														Class2.aStringArray14[var7++] = var102.aString2276 != null ? var102.aString2276 : "";
														Class2.aStringArray14[var7++] = var102.aString2277 != null ? var102.aString2277 : "";
														Class2.aStringArray14[var7++] = var102.aString2275 != null ? var102.aString2275 : "";
													} else {
														Class2.anIntArray13[var6++] = -1;
														Class2.anIntArray13[var6++] = 0;
														Class2.aStringArray14[var7++] = "";
														Class2.aStringArray14[var7++] = "";
														Class2.aStringArray14[var7++] = "";
													}
													continue;
												}

												if (var39 == 5005) {
													if (Class117_Sub22_Sub18_Sub3.aClass69_2625 == null) {
														Class2.anIntArray13[var6++] = -1;
													} else {
														Class2.anIntArray13[var6++] = Class117_Sub22_Sub18_Sub3.aClass69_2625.anInt849 * -428394515;
													}
													continue;
												}

												if (var39 == 5008) {
													--var7;
													var61 = Class2.aStringArray14[var7];
													--var6;
													var16 = Class2.anIntArray13[var6];
													var45 = var61.toLowerCase();
													byte var83 = 0;
													if (var45.startsWith(Class108.aString1376)) {
														var83 = 0;
														var61 = var61.substring(Class108.aString1376.length());
													} else if (var45.startsWith(Class108.aString1275)) {
														var83 = 1;
														var61 = var61.substring(Class108.aString1275.length());
													} else if (var45.startsWith(Class108.aString1232)) {
														var83 = 2;
														var61 = var61.substring(Class108.aString1232.length());
													} else if (var45.startsWith(Class108.aString1401)) {
														var83 = 3;
														var61 = var61.substring(Class108.aString1401.length());
													} else if (var45.startsWith(Class108.aString1334)) {
														var83 = 4;
														var61 = var61.substring(Class108.aString1334.length());
													} else if (var45.startsWith(Class108.aString1240)) {
														var83 = 5;
														var61 = var61.substring(Class108.aString1240.length());
													} else if (var45.startsWith(Class108.aString1388)) {
														var83 = 6;
														var61 = var61.substring(Class108.aString1388.length());
													} else if (var45.startsWith(Class108.aString1390)) {
														var83 = 7;
														var61 = var61.substring(Class108.aString1390.length());
													} else if (var45.startsWith(Class108.aString1430)) {
														var83 = 8;
														var61 = var61.substring(Class108.aString1430.length());
													} else if (var45.startsWith(Class108.aString1394)) {
														var83 = 9;
														var61 = var61.substring(Class108.aString1394.length());
													} else if (var45.startsWith(Class108.aString1396)) {
														var83 = 10;
														var61 = var61.substring(Class108.aString1396.length());
													} else if (var45.startsWith(Class108.aString1398)) {
														var83 = 11;
														var61 = var61.substring(Class108.aString1398.length());
													} else if (GameClient.anInt2922 * 1063005447 != 0) {
														if (var45.startsWith(Class108.aString1377)) {
															var83 = 0;
															var61 = var61.substring(Class108.aString1377.length());
														} else if (var45.startsWith(Class108.aString1346)) {
															var83 = 1;
															var61 = var61.substring(Class108.aString1346.length());
														} else if (var45.startsWith(Class108.aString1381)) {
															var83 = 2;
															var61 = var61.substring(Class108.aString1381.length());
														} else if (var45.startsWith(Class108.aString1432)) {
															var83 = 3;
															var61 = var61.substring(Class108.aString1432.length());
														} else if (var45.startsWith(Class108.aString1385)) {
															var83 = 4;
															var61 = var61.substring(Class108.aString1385.length());
														} else if (var45.startsWith(Class108.aString1387)) {
															var83 = 5;
															var61 = var61.substring(Class108.aString1387.length());
														} else if (var45.startsWith(Class108.aString1389)) {
															var83 = 6;
															var61 = var61.substring(Class108.aString1389.length());
														} else if (var45.startsWith(Class108.aString1391)) {
															var83 = 7;
															var61 = var61.substring(Class108.aString1391.length());
														} else if (var45.startsWith(Class108.aString1256)) {
															var83 = 8;
															var61 = var61.substring(Class108.aString1256.length());
														} else if (var45.startsWith(Class108.aString1395)) {
															var83 = 9;
															var61 = var61.substring(Class108.aString1395.length());
														} else if (var45.startsWith(Class108.aString1200)) {
															var83 = 10;
															var61 = var61.substring(Class108.aString1200.length());
														} else if (var45.startsWith(Class108.aString1399)) {
															var83 = 11;
															var61 = var61.substring(Class108.aString1399.length());
														}
													}

													var45 = var61.toLowerCase();
													byte var91 = 0;
													if (var45.startsWith(Class108.aString1269)) {
														var91 = 1;
														var61 = var61.substring(Class108.aString1269.length());
													} else if (var45.startsWith(Class108.aString1362)) {
														var91 = 2;
														var61 = var61.substring(Class108.aString1362.length());
													} else if (var45.startsWith(Class108.aString1404)) {
														var91 = 3;
														var61 = var61.substring(Class108.aString1404.length());
													} else if (var45.startsWith(Class108.aString1406)) {
														var91 = 4;
														var61 = var61.substring(Class108.aString1406.length());
													} else if (var45.startsWith(Class108.aString1274)) {
														var91 = 5;
														var61 = var61.substring(Class108.aString1274.length());
													} else if (GameClient.anInt2922 * 1063005447 != 0) {
														if (var45.startsWith(Class108.aString1446)) {
															var91 = 1;
															var61 = var61.substring(Class108.aString1446.length());
														} else if (var45.startsWith(Class108.aString1447)) {
															var91 = 2;
															var61 = var61.substring(Class108.aString1447.length());
														} else if (var45.startsWith(Class108.aString1405)) {
															var91 = 3;
															var61 = var61.substring(Class108.aString1405.length());
														} else if (var45.startsWith(Class108.aString1435)) {
															var91 = 4;
															var61 = var61.substring(Class108.aString1435.length());
														} else if (var45.startsWith(Class108.aString1397)) {
															var91 = 5;
															var61 = var61.substring(Class108.aString1397.length());
														}
													}

													GameClient.aClass117_Sub14_Sub1_2961.method2932(248, 212404005);
													GameClient.aClass117_Sub14_Sub1_2961.method2126(0, 902292052);
													var21 = GameClient.aClass117_Sub14_Sub1_2961.anInt1880 * 561453169;
													GameClient.aClass117_Sub14_Sub1_2961.method2126(var16, 1718923934);
													GameClient.aClass117_Sub14_Sub1_2961.method2126(var83, 997925035);
													GameClient.aClass117_Sub14_Sub1_2961.method2126(var91, 2059687810);
													Class32.method473(GameClient.aClass117_Sub14_Sub1_2961, var61, 1944314640);
													GameClient.aClass117_Sub14_Sub1_2961.method2007(GameClient.aClass117_Sub14_Sub1_2961.anInt1880 * 561453169 - var21, (byte) 1);
													continue;
												}

												if (var39 == 5009) {
													var7 -= 2;
													var61 = Class2.aStringArray14[var7];
													var44 = Class2.aStringArray14[var7 + 1];
													GameClient.aClass117_Sub14_Sub1_2961.method2932(137, -182544641);
													GameClient.aClass117_Sub14_Sub1_2961.method1996(0, (byte) -50);
													var18 = GameClient.aClass117_Sub14_Sub1_2961.anInt1880 * 561453169;
													GameClient.aClass117_Sub14_Sub1_2961.method2001(var61, 1024163708);
													Class32.method473(GameClient.aClass117_Sub14_Sub1_2961, var44, -539708318);
													GameClient.aClass117_Sub14_Sub1_2961.method2006(GameClient.aClass117_Sub14_Sub1_2961.anInt1880 * 561453169 - var18, 1222325315);
													continue;
												}

												if (var39 == 5015) {
													if (Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393 != null && Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.getPlayerName() != null) {
														var61 = Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.getPlayerName();
													} else {
														var61 = "";
													}

													Class2.aStringArray14[var7++] = var61;
													continue;
												}

												if (var39 == 5016) {
													Class2.anIntArray13[var6++] = GameClient.anInt3138 * 582524025;
													continue;
												}

												if (var39 == 5017) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													Class2.anIntArray13[var6++] = Class117_Sub7.method1950(var53, 261740920);
													continue;
												}

												if (var39 == 5018) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													Class2.anIntArray13[var6++] = Class24.method396(var53, 32768);
													continue;
												}

												if (var39 == 5019) {
													--var6;
													var53 = Class2.anIntArray13[var6];
													var41 = Class2.anIntArray13;
													var18 = var6++;
													Class117_Sub22_Sub7 var89 = (Class117_Sub22_Sub7) Class35.aClass118_442.method1540((long) var53);
													if (var89 == null) {
														var46 = -1;
													} else if (var89.aClass117_Sub22_2132 == Class35.aClass123_441.aClass117_Sub22_1529) {
														var46 = -1;
													} else {
														var46 = ((Class117_Sub22_Sub7) var89.aClass117_Sub22_2132).anInt2279 * 1239720595;
													}

													var41[var18] = var46;
													continue;
												}

												if (var39 == 5020) {
													--var7;
													var61 = Class2.aStringArray14[var7];
													if (var61.equalsIgnoreCase("toggleroof")) {
														Class117_Sub22_Sub21.aClass33_2499.aBool418 = !Class117_Sub22_Sub21.aClass33_2499.aBool418;
														Class117_Sub14.method2216(-1901099765);
														if (Class117_Sub22_Sub21.aClass33_2499.aBool418) {
															Class117_Sub22_Sub1.method2353(99, "", "Roofs are now all hidden", 2025919907);
														} else {
															Class117_Sub22_Sub1.method2353(99, "", "Roofs will only be removed selectively", 1594340230);
														}
													}

													if (var61.equalsIgnoreCase("displayfps")) {
														GameClient.aBool3182 = !GameClient.aBool3182;
													}

													if (GameClient.anInt3073 * -296746775 >= 2) {
														if (var61.equalsIgnoreCase("fpson")) {
															GameClient.aBool3182 = true;
														}

														if (var61.equalsIgnoreCase("fpsoff")) {
															GameClient.aBool3182 = false;
														}

														if (var61.equalsIgnoreCase("gc")) {
															System.gc();
														}

														if (var61.equalsIgnoreCase("clientdrop")) {
															Class117_Sub7.method1953(1035607511);
														}

														if (var61.equalsIgnoreCase("errortest") && GameClient.anInt2918 * -553019157 == 2) {
															throw new RuntimeException();
														}
													}

													GameClient.aClass117_Sub14_Sub1_2961.method2932(222, 961437390);
													GameClient.aClass117_Sub14_Sub1_2961.method2126(var61.length() + 1, 1746827028);
													GameClient.aClass117_Sub14_Sub1_2961.method2001(var61, 1493860033);
													continue;
												}

												if (var39 == 5021) {
													--var7;
													GameClient.aString3139 = Class2.aStringArray14[var7].toLowerCase().trim();
													continue;
												}

												if (var39 == 5022) {
													Class2.aStringArray14[var7++] = GameClient.aString3139;
													continue;
												}
											}
										}
									}
								} else {
									if (var39 >= 2000) {
										var39 -= 1000;
										--var6;
										var17 = Class74.method1010(Class2.anIntArray13[var6], -1355658326);
									} else {
										var17 = var57 ? Class132.aClass117_Sub19_1590 : Class117_Sub22_Sub18_Sub2.aClass117_Sub19_2604;
									}

									if (var39 == 1927) {
										if (Class2.anInt21 * -745409081 >= 10) {
											throw new RuntimeException();
										}

										if (var17.anObjectArray1977 == null) {
											return;
										}

										Class117_Sub7 var42 = new Class117_Sub7();
										var42.aClass117_Sub19_1780 = var17;
										var42.anObjectArray1786 = var17.anObjectArray1977;
										var42.anInt1788 = 972087601 + Class2.anInt21 * -2122059241;
										GameClient.aClass120_3118.method1575(var0);
										continue;
									}
								}
							}
						} else {
							if (var39 >= 2000) {
								var39 -= 1000;
								--var6;
								var17 = Class74.method1010(Class2.anIntArray13[var6], -1368781608);
							} else {
								var17 = var57 ? Class132.aClass117_Sub19_1590 : Class117_Sub22_Sub18_Sub2.aClass117_Sub19_2604;
							}

							Class54.method850(var17, (byte) 0);
							if (var39 == 1200 || var39 == 1205 || var39 == 1212) {
								var6 -= 2;
								var16 = Class2.anIntArray13[var6];
								var18 = Class2.anIntArray13[1 + var6];
								var17.anInt2091 = var16 * -1529730431;
								var17.anInt2092 = var18 * -1367524999;
								Class117_Sub22_Sub6 var19 = Class117_Sub13.method1992(var16, -1187236802);
								var17.anInt1966 = var19.anInt2234 * 1733000013;
								var17.anInt2023 = var19.anInt2235 * -2129281257;
								var17.anInt2024 = var19.anInt2236 * -76071127;
								var17.anInt2020 = var19.anInt2237 * -882100745;
								var17.anInt2022 = var19.anInt2238 * -1908038529;
								var17.anInt2025 = var19.anInt2239 * 845091889;
								if (var39 == 1205) {
									var17.anInt2043 = 0;
								} else if (var39 == 1212 | var19.anInt2222 * -1106690991 == 1) {
									var17.anInt2043 = -439106553;
								} else {
									var17.anInt2043 = -878213106;
								}

								if (var17.anInt1995 * -1445739571 > 0) {
									var17.anInt2025 = var17.anInt2025 * -1551726560 / (var17.anInt1995 * -1445739571) * -1145439295;
								} else if (var17.anInt1984 * 63573717 > 0) {
									var17.anInt2025 = var17.anInt2025 * -1551726560 / (var17.anInt1984 * 63573717) * -1145439295;
								}
								continue;
							}

							if (var39 == 1201) {
								var17.anInt2080 = 2074168934;
								--var6;
								var17.anInt2015 = Class2.anIntArray13[var6] * -680726691;
								continue;
							}

							if (var39 == 1202) {
								var17.anInt2080 = 963769753;
								var17.anInt2015 = Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.aClass91_2871.method1216(-1321735257) * -680726691;
								continue;
							}
						}
					}

					if (var39 < 5400) {
						if (var39 == 5306) {
							Class2.anIntArray13[var6++] = Class2.method63(-1025784981);
							continue;
						}

						if (var39 == 5307) {
							--var6;
							var53 = Class2.anIntArray13[var6];
							if (var53 == 1 || var53 == 2) {
								Class64.method938(var53, -972098521);
							}
							continue;
						}

						if (var39 == 5308) {
							Class2.anIntArray13[var6++] = Class117_Sub22_Sub21.aClass33_2499.anInt416 * 1703993515;
							continue;
						}

						if (var39 == 5309) {
							--var6;
							var53 = Class2.anIntArray13[var6];
							if (var53 == 1 || var53 == 2) {
								Class117_Sub22_Sub21.aClass33_2499.anInt416 = var53 * -512484861;
								Class117_Sub14.method2216(-1639053228);
							}
							continue;
						}
					}

					if (var39 < 5600) {
						if (var39 == 5504) {
							var6 -= 2;
							var53 = Class2.anIntArray13[var6];
							var16 = Class2.anIntArray13[1 + var6];
							if (!GameClient.aBool3168) {
								GameClient.anInt3004 = var53 * -454595435;
								GameClient.anInt3005 = var16 * 109370805;
							}
							continue;
						}

						if (var39 == 5505) {
							Class2.anIntArray13[var6++] = GameClient.anInt3004 * -1836712259;
							continue;
						}

						if (var39 == 5506) {
							Class2.anIntArray13[var6++] = GameClient.anInt3005 * -1204229987;
							continue;
						}

						if (var39 == 5530) {
							--var6;
							var53 = Class2.anIntArray13[var6];
							if (var53 < 0) {
								var53 = 0;
							}

							GameClient.anInt3010 = var53 * 944627071;
							continue;
						}

						if (var39 == 5531) {
							Class2.anIntArray13[var6++] = GameClient.anInt3010 * -1599348097;
							continue;
						}
					}

					if (var39 < 5700 && var39 == 5630) {
						GameClient.anInt3101 = -178972094;
					} else {
						if (var39 < 6300) {
							if (var39 == 6200) {
								var6 -= 2;
								GameClient.aShort3105 = (short) Class2.anIntArray13[var6];
								if (GameClient.aShort3105 <= 0) {
									GameClient.aShort3105 = 256;
								}

								GameClient.aShort3175 = (short) Class2.anIntArray13[1 + var6];
								if (GameClient.aShort3175 <= 0) {
									GameClient.aShort3175 = 205;
								}
								continue;
							}

							if (var39 == 6201) {
								var6 -= 2;
								GameClient.aShort3176 = (short) Class2.anIntArray13[var6];
								if (GameClient.aShort3176 <= 0) {
									GameClient.aShort3176 = 256;
								}

								GameClient.aShort3177 = (short) Class2.anIntArray13[var6 + 1];
								if (GameClient.aShort3177 <= 0) {
									GameClient.aShort3177 = 320;
								}
								continue;
							}

							if (var39 == 6202) {
								var6 -= 4;
								GameClient.aShort3178 = (short) Class2.anIntArray13[var6];
								if (GameClient.aShort3178 <= 0) {
									GameClient.aShort3178 = 1;
								}

								GameClient.aShort3094 = (short) Class2.anIntArray13[var6 + 1];
								if (GameClient.aShort3094 <= 0) {
									GameClient.aShort3094 = 32767;
								} else if (GameClient.aShort3094 < GameClient.aShort3178) {
									GameClient.aShort3094 = GameClient.aShort3178;
								}

								GameClient.aShort2955 = (short) Class2.anIntArray13[var6 + 2];
								if (GameClient.aShort2955 <= 0) {
									GameClient.aShort2955 = 1;
								}

								GameClient.aShort3181 = (short) Class2.anIntArray13[3 + var6];
								if (GameClient.aShort3181 <= 0) {
									GameClient.aShort3181 = 32767;
								} else if (GameClient.aShort3181 < GameClient.aShort2955) {
									GameClient.aShort3181 = GameClient.aShort2955;
								}
								continue;
							}

							if (var39 == 6203) {
								if (GameClient.aClass117_Sub19_3091 != null) {
									Class117_Sub12.method1982(0, 0, GameClient.aClass117_Sub19_3091.anInt1988 * 1854643179, GameClient.aClass117_Sub19_3091.anInt1989 * 2747837, false, (short) 5188);
									Class2.anIntArray13[var6++] = GameClient.anInt3142 * -910791425;
									Class2.anIntArray13[var6++] = GameClient.anInt3185 * -278001619;
								} else {
									Class2.anIntArray13[var6++] = -1;
									Class2.anIntArray13[var6++] = -1;
								}
								continue;
							}

							if (var39 == 6204) {
								Class2.anIntArray13[var6++] = GameClient.aShort3176;
								Class2.anIntArray13[var6++] = GameClient.aShort3177;
								continue;
							}

							if (var39 == 6205) {
								Class2.anIntArray13[var6++] = GameClient.aShort3105;
								Class2.anIntArray13[var6++] = GameClient.aShort3175;
								continue;
							}
						}

						if (var39 < 6600) {
							if (var39 == 6500) {
								Class2.anIntArray13[var6++] = Class4.method82((short) -26570) ? 1 : 0;
								continue;
							}

							Class24 var108;
							if (var39 == 6501) {
								var108 = Class117_Sub22_Sub19.method2927((byte) -96);
								if (var108 != null) {
									Class2.anIntArray13[var6++] = var108.anInt294 * 571351125;
									Class2.anIntArray13[var6++] = var108.anInt299 * 59607667;
									Class2.aStringArray14[var7++] = var108.aString302;
									Class2.anIntArray13[var6++] = var108.anInt303 * 1839043337;
									Class2.anIntArray13[var6++] = var108.anInt300 * -1696774655;
									Class2.aStringArray14[var7++] = var108.aString301;
								} else {
									Class2.anIntArray13[var6++] = -1;
									Class2.anIntArray13[var6++] = 0;
									Class2.aStringArray14[var7++] = "";
									Class2.anIntArray13[var6++] = 0;
									Class2.anIntArray13[var6++] = 0;
									Class2.aStringArray14[var7++] = "";
								}
								continue;
							}

							if (var39 == 6502) {
								if (Class24.anInt298 * -151522215 < Class24.anInt293 * -2027355585) {
									var108 = Class24.aClass24Array290[(Class24.anInt298 -= 189787159) * -151522215 - 1];
								} else {
									var108 = null;
								}

								if (var108 != null) {
									Class2.anIntArray13[var6++] = var108.anInt294 * 571351125;
									Class2.anIntArray13[var6++] = var108.anInt299 * 59607667;
									Class2.aStringArray14[var7++] = var108.aString302;
									Class2.anIntArray13[var6++] = var108.anInt303 * 1839043337;
									Class2.anIntArray13[var6++] = var108.anInt300 * -1696774655;
									Class2.aStringArray14[var7++] = var108.aString301;
								} else {
									Class2.anIntArray13[var6++] = -1;
									Class2.anIntArray13[var6++] = 0;
									Class2.aStringArray14[var7++] = "";
									Class2.anIntArray13[var6++] = 0;
									Class2.anIntArray13[var6++] = 0;
									Class2.aStringArray14[var7++] = "";
								}
								continue;
							}

							Class24 var104;
							if (var39 == 6506) {
								--var6;
								var53 = Class2.anIntArray13[var6];
								var104 = null;

								for (var18 = 0; var18 < Class24.anInt293 * -2027355585; var18++) {
									if (Class24.aClass24Array290[var18].anInt294 * 571351125 == var53) {
										var104 = Class24.aClass24Array290[var18];
										break;
									}
								}

								if (var104 != null) {
									Class2.anIntArray13[var6++] = var104.anInt294 * 571351125;
									Class2.anIntArray13[var6++] = var104.anInt299 * 59607667;
									Class2.aStringArray14[var7++] = var104.aString302;
									Class2.anIntArray13[var6++] = var104.anInt303 * 1839043337;
									Class2.anIntArray13[var6++] = var104.anInt300 * -1696774655;
									Class2.aStringArray14[var7++] = var104.aString301;
								} else {
									Class2.anIntArray13[var6++] = -1;
									Class2.anIntArray13[var6++] = 0;
									Class2.aStringArray14[var7++] = "";
									Class2.anIntArray13[var6++] = 0;
									Class2.anIntArray13[var6++] = 0;
									Class2.aStringArray14[var7++] = "";
								}
								continue;
							}

							if (var39 == 6507) {
								var6 -= 4;
								var53 = Class2.anIntArray13[var6];
								var48 = Class2.anIntArray13[1 + var6] == 1;
								var18 = Class2.anIntArray13[var6 + 2];
								var69 = Class2.anIntArray13[var6 + 3] == 1;
								if (Class24.aClass24Array290 != null) {
									Class58.method877(0, Class24.aClass24Array290.length - 1, var53, var48, var18, var69, -1356047211);
								}
								continue;
							}

							if (var39 == 6511) {
								--var6;
								var53 = Class2.anIntArray13[var6];
								if (var53 >= 0 && var53 < Class24.anInt293 * -2027355585) {
									var104 = Class24.aClass24Array290[var53];
									Class2.anIntArray13[var6++] = var104.anInt294 * 571351125;
									Class2.anIntArray13[var6++] = var104.anInt299 * 59607667;
									Class2.aStringArray14[var7++] = var104.aString302;
									Class2.anIntArray13[var6++] = var104.anInt303 * 1839043337;
									Class2.anIntArray13[var6++] = var104.anInt300 * -1696774655;
									Class2.aStringArray14[var7++] = var104.aString301;
									continue;
								}

								Class2.anIntArray13[var6++] = -1;
								Class2.anIntArray13[var6++] = 0;
								Class2.aStringArray14[var7++] = "";
								Class2.anIntArray13[var6++] = 0;
								Class2.anIntArray13[var6++] = 0;
								Class2.aStringArray14[var7++] = "";
								continue;
							}
						}

						throw new IllegalStateException();
					}
				}
			} catch (Exception var38) {
				StringBuilder var13 = new StringBuilder(30);
				var13.append("").append(var5.aLong1503).append(" ");

				for (var14 = Class2.anInt15 * -1346777493 - 1; var14 >= 0; --var14) {
					var13.append("").append(Class2.aClass32Array17[var14].aClass117_Sub22_Sub19_404.aLong1503).append(" ");
				}

				var13.append("").append(var11);
				Class117_Sub12.method1987(var13.toString(), var38, 27621381);
			}
		}
	}

	public static int method870(int var0, byte var1) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	public static Class117_Sub22_Sub16 method871(Class106 var0, Class106 var1, int var2, boolean var3, byte var4) {
		boolean var5 = true;
		int[] var6 = var0.method1439(var2, (byte) 32);

		for (int var7 = 0; var7 < var6.length; var7++) {
			byte[] var8 = var0.method1433(var2, var6[var7], (byte) 16);
			if (var8 == null) {
				var5 = false;
			} else {
				int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
				byte[] var10;
				if (var3) {
					var10 = var1.method1433(0, var9, (byte) 16);
				} else {
					var10 = var1.method1433(var9, 0, (byte) 16);
				}

				if (var10 == null) {
					var5 = false;
				}
			}
		}

		if (!var5) {
			return null;
		} else {
			try {
				return new Class117_Sub22_Sub16(var0, var1, var2, var3);
			} catch (Exception var11) {
				return null;
			}
		}
	}

	abstract void method872(byte[] var1, byte var2);

}
