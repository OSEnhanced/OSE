package core.Jagex;
import java.io.EOFException;

public class Class46 {

	static final int anInt620 = 1;
	static Class117_Sub19[] aClass117_Sub19Array621;
	public static final int anInt624 = 70;
	static Class117_Sub22_Sub17_Sub3[] aClass117_Sub22_Sub17_Sub3Array626;
	static final int anInt627 = 33;
	static Class117_Sub22_Sub17_Sub2 aClass117_Sub22_Sub17_Sub2_628;
	static Class117_Sub22_Sub17_Sub2[] aClass117_Sub22_Sub17_Sub2Array629;
	static int anInt631;
	public static final int anInt632 = 56;
	public static final int anInt633 = 95;
	boolean aBool619 = false;
	long aLong625;
	int[] anIntArray634;
	String[] aStringArray623;
	boolean[] aBoolArray622;
	boolean[] aBoolArray630;

	void method742(int var1, int var2, int var3) {
		anIntArray634[var1] = var2;
		if (aBoolArray622[var1]) {
			aBool619 = true;
		}

	}

	int method743(int var1, int var2) {
		return anIntArray634[var1];
	}

	void method744(int var1) {
		Class129 var2 = method747(true, (byte) 23);
		boolean var15 = false;

		try {
			label183:
			{
				try {
					var15 = true;
					int var3 = 3;
					int var4 = 0;

					int var5;
					for (var5 = 0; var5 < anIntArray634.length; var5++) {
						if (aBoolArray622[var5] && anIntArray634[var5] != -1) {
							var3 += 6;
							++var4;
						}
					}

					var3 += 2;
					var5 = 0;

					for (int var6 = 0; var6 < aStringArray623.length; var6++) {
						if (aBoolArray630[var6] && aStringArray623[var6] != null) {
							var3 += 2 + Class37.method517(aStringArray623[var6], 523081726);
							++var5;
						}
					}

					Class117_Sub14 var21 = new Class117_Sub14(var3);
					var21.method2126(1, -134040910);
					var21.method1996(var4, (byte) -9);

					int var7;
					for (var7 = 0; var7 < anIntArray634.length; var7++) {
						if (aBoolArray622[var7] && anIntArray634[var7] != -1) {
							var21.method1996(var7, (byte) -13);
							var21.method2183(anIntArray634[var7], (byte) 126);
						}
					}

					var21.method1996(var5, (byte) -55);
					var7 = 0;

					while (true) {
						if (var7 >= aStringArray623.length) {
							var2.method1693(var21.aByteArray1885, 0, var21.anInt1880 * 561453169, (byte) -69);
							break;
						}

						if (aBoolArray630[var7] && aStringArray623[var7] != null) {
							var21.method1996(var7, (byte) -1);
							var21.method2001(aStringArray623[var7], 1541581595);
						}

						++var7;
					}
				} catch (Exception var19) {
					try {
						var2.method1685(773563644);
						var15 = false;
					} catch (Exception var17) {
						var15 = false;
					}
					break label183;
				}

				try {
					var2.method1685(2130290157);
					var15 = false;
				} catch (Exception var18) {
					var15 = false;
				}
			}
		} finally {
			if (var15) {
				try {
					var2.method1685(1502544494);
				} catch (Exception var16) {
					;
				}

			}
		}

		aBool619 = false;
		aLong625 = Class47.method774(252200535) * 1608571354185004379L;
	}

	static void method746(Class117_Sub19[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte var8) {
		for (int var9 = 0; var9 < var0.length; var9++) {
			Class117_Sub19 var11 = var0[var9];
			if (var11 != null && (!var11.aBool2061 || var11.anInt1975 * 657737235 == 0 || var11.aBool2044 || Class67.method961(var11, -310516206) != 0 || var11 == GameClient.aClass117_Sub19_3157 || var11.anInt2018 * 2064823433 == 1338) && var11.anInt2027 * 1264631563 == var1 && (!var11.aBool2061 || !Class117_Sub22_Sub18_Sub6.method3356(var11, -740668795))) {
				int var12 = var6 + var11.anInt2104 * -165844047;
				int var13 = var11.anInt1987 * 1372514967 + var7;
				int var16;
				int var19;
				int var20;
				int var21;
				int var23;
				int var24;
				int var25;
				if (var11.anInt1975 * 657737235 == 2) {
					var24 = var2;
					var25 = var3;
					var19 = var4;
					var20 = var5;
				} else if (var11.anInt1975 * 657737235 == 9) {
					var21 = var12;
					var23 = var13;
					int var22 = var12 + var11.anInt1988 * 1854643179;
					var16 = var13 + var11.anInt1989 * 2747837;
					if (var22 < var12) {
						var21 = var22;
						var22 = var12;
					}

					if (var16 < var13) {
						var23 = var16;
						var16 = var13;
					}

					++var22;
					++var16;
					var24 = var21 > var2 ? var21 : var2;
					var25 = var23 > var3 ? var23 : var3;
					var19 = var22 < var4 ? var22 : var4;
					var20 = var16 < var5 ? var16 : var5;
				} else {
					var21 = var12 + var11.anInt1988 * 1854643179;
					var23 = var11.anInt1989 * 2747837 + var13;
					var24 = var12 > var2 ? var12 : var2;
					var25 = var13 > var3 ? var13 : var3;
					var19 = var21 < var4 ? var21 : var4;
					var20 = var23 < var5 ? var23 : var5;
				}

				if (GameClient.aClass117_Sub19_3019 == var11) {
					GameClient.aBool3100 = true;
					GameClient.anInt2951 = var12 * -1127763991;
					GameClient.anInt3102 = var13 * -310845641;
				}

				if (!var11.aBool2061 || var24 < var19 && var25 < var20) {
					var21 = Class75.anInt903 * -456706193;
					var23 = Class75.anInt904 * 1381104939;
					if (Class75.anInt909 * -393851667 != 0) {
						var21 = Class75.anInt915 * -664246003;
						var23 = Class75.anInt901 * 1538480085;
					}

					if (var11.anInt2018 * 2064823433 == 1337) {
						if (!GameClient.aBool2935 && !GameClient.aBool3059 && var21 >= var24 && var23 >= var25 && var21 < var19 && var23 < var20) {
							Class117_Sub22_Sub10.method2546(var21, var23, var24, var25, (byte) -115);
						}
					} else {
						int var15;
						int var17;
						int var29;
						if (var11.anInt2018 * 2064823433 == 1338) {
							if ((GameClient.anInt3155 * -1723858213 == 0 || GameClient.anInt3155 * -1723858213 == 3) && (Class75.anInt909 * -393851667 == 1 || !Class95.aBool1107 && Class75.anInt909 * -393851667 == 4)) {
								Class117_Sub22_Sub21 var38 = var11.method2285(true, 2075001646);
								if (var38 != null) {
									var16 = Class75.anInt915 * -664246003 - var12;
									int var30 = Class75.anInt901 * 1538480085 - var13;
									if (var38.method2963(var16, var30, -1063109304)) {
										var16 -= var38.anInt2502 * 707865929 / 2;
										var30 -= var38.anInt2500 * -1893173225 / 2;
										var29 = GameClient.anInt2990 * -1810209603 + GameClient.anInt3005 * -1204229987 & 2047;
										var15 = Class117_Sub22_Sub17_Sub1.anIntArray2653[var29];
										var17 = Class117_Sub22_Sub17_Sub1.anIntArray2654[var29];
										var15 = (GameClient.anInt3202 * 138652733 + 256) * var15 >> 8;
										var17 = (GameClient.anInt3202 * 138652733 + 256) * var17 >> 8;
										int var34 = var30 * var15 + var16 * var17 >> 11;
										int var26 = var30 * var17 - var16 * var15 >> 11;
										int var28 = Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2577 * 1961555871 + var34 >> 7;
										int var27 = Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2567 * -184603173 - var26 >> 7;
										GameClient.aClass117_Sub14_Sub1_2961.method2932(97, 975259594);
										GameClient.aClass117_Sub14_Sub1_2961.method2126(18, 1350491430);
										GameClient.aClass117_Sub14_Sub1_2961.method1996(var28 + Class117_Sub22_Sub20.anInt2497 * 544615727, (byte) -86);
										GameClient.aClass117_Sub14_Sub1_2961.method2126(Class89.aBoolArray1050[82] ? (Class89.aBoolArray1050[81] ? 2 : 1) : 0, 1909650666);
										GameClient.aClass117_Sub14_Sub1_2961.method2209(var27 + Class117_Sub22_Sub19.anInt2468 * -771797447, -2069472551);
										GameClient.aClass117_Sub14_Sub1_2961.method2126(var16, 416604165);
										GameClient.aClass117_Sub14_Sub1_2961.method2126(var30, 1925754803);
										GameClient.aClass117_Sub14_Sub1_2961.method1996(GameClient.anInt3005 * -1204229987, (byte) -32);
										GameClient.aClass117_Sub14_Sub1_2961.method2126(57, 820177298);
										GameClient.aClass117_Sub14_Sub1_2961.method2126(GameClient.anInt2990 * -1810209603, 1402120835);
										GameClient.aClass117_Sub14_Sub1_2961.method2126(GameClient.anInt3202 * 138652733, 2087707303);
										GameClient.aClass117_Sub14_Sub1_2961.method2126(89, 1294303755);
										GameClient.aClass117_Sub14_Sub1_2961.method1996(Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2577 * 1961555871, (byte) -47);
										GameClient.aClass117_Sub14_Sub1_2961.method1996(Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2567 * -184603173, (byte) -102);
										GameClient.aClass117_Sub14_Sub1_2961.method2126(63, 1209430067);
										GameClient.anInt3153 = var28 * 1748897489;
										GameClient.anInt3154 = var27 * -2025568851;
									}
								}
							}
						} else {
							if (!GameClient.aBool3059 && var21 >= var24 && var23 >= var25 && var21 < var19 && var23 < var20) {
								Class14.method290(var11, var21 - var12, var23 - var13, 632383919);
							}

							if (var11.anInt1975 * 657737235 == 0) {
								if (!var11.aBool2061 && Class117_Sub22_Sub18_Sub6.method3356(var11, -1101137547) && var11 != Class117_Sub22_Sub6.aClass117_Sub19_2271) {
									continue;
								}

								method746(var0, var11.anInt1973 * -1955776525, var24, var25, var19, var20, var12 - var11.anInt1994 * 17552373, var13 - var11.anInt2060 * -400020749, (byte) 5);
								if (var11.aClass117_Sub19Array2095 != null) {
									method746(var11.aClass117_Sub19Array2095, var11.anInt1973 * -1955776525, var24, var25, var19, var20, var12 - var11.anInt1994 * 17552373, var13 - var11.anInt2060 * -400020749, (byte) -3);
								}

								Class117_Sub10 var35 = (Class117_Sub10) GameClient.aClass127_3080.method1675((long) (var11.anInt1973 * -1955776525));
								if (var35 != null) {
									if (var35.anInt1828 * -611712165 == 0 && Class75.anInt903 * -456706193 >= var24 && Class75.anInt904 * 1381104939 >= var25 && Class75.anInt903 * -456706193 < var19 && Class75.anInt904 * 1381104939 < var20 && !GameClient.aBool3059 && !GameClient.aBool3072) {
										for (Class117_Sub7 var32 = (Class117_Sub7) GameClient.aClass120_3118.method1577(); var32 != null; var32 = (Class117_Sub7) GameClient.aClass120_3118.method1582()) {
											if (var32.aBool1779) {
												var32.method1532();
												var32.aClass117_Sub19_1780.aBool2096 = false;
											}
										}

										if (Class117_Sub22_Sub14.anInt2399 * -1345062819 == 0) {
											GameClient.aClass117_Sub19_3019 = null;
											GameClient.aClass117_Sub19_3157 = null;
										}

										if (!GameClient.aBool3059) {
											GameClient.aStringArray3065[0] = Class108.aString1367;
											GameClient.aStringArray3066[0] = "";
											GameClient.anIntArray2999[0] = 1006;
											GameClient.anInt3060 = 2032386165;
										}
									}

									var16 = var35.anInt1831 * -2090327687;
									if (Class4.method85(var16, 1457193338)) {
										method746(Class117_Sub19.aClass117_Sub19ArrayArray2032[var16], -1, var24, var25, var19, var20, var12, var13, (byte) -68);
									}
								}
							}

							if (var11.aBool2061) {
								Class117_Sub7 var36;
								if (!var11.aBool1974) {
									if (var11.aBool2105 && Class75.anInt903 * -456706193 >= var24 && Class75.anInt904 * 1381104939 >= var25 && Class75.anInt903 * -456706193 < var19 && Class75.anInt904 * 1381104939 < var20) {
										for (var36 = (Class117_Sub7) GameClient.aClass120_3118.method1577(); var36 != null; var36 = (Class117_Sub7) GameClient.aClass120_3118.method1582()) {
											if (var36.aBool1779 && var36.aClass117_Sub19_1780.anObjectArray1971 == var36.anObjectArray1786) {
												var36.method1532();
											}
										}
									}
								} else if (Class75.anInt903 * -456706193 >= var24 && Class75.anInt904 * 1381104939 >= var25 && Class75.anInt903 * -456706193 < var19 && Class75.anInt904 * 1381104939 < var20) {
									for (var36 = (Class117_Sub7) GameClient.aClass120_3118.method1577(); var36 != null; var36 = (Class117_Sub7) GameClient.aClass120_3118.method1582()) {
										if (var36.aBool1779) {
											var36.method1532();
											var36.aClass117_Sub19_1780.aBool2096 = false;
										}
									}

									if (Class117_Sub22_Sub14.anInt2399 * -1345062819 == 0) {
										GameClient.aClass117_Sub19_3019 = null;
										GameClient.aClass117_Sub19_3157 = null;
									}

									if (!GameClient.aBool3059) {
										GameClient.aStringArray3065[0] = Class108.aString1367;
										GameClient.aStringArray3066[0] = "";
										GameClient.anIntArray2999[0] = 1006;
										GameClient.anInt3060 = 2032386165;
									}
								}

								boolean var37;
								if (Class75.anInt903 * -456706193 >= var24 && Class75.anInt904 * 1381104939 >= var25 && Class75.anInt903 * -456706193 < var19 && Class75.anInt904 * 1381104939 < var20) {
									var37 = true;
								} else {
									var37 = false;
								}

								boolean var33 = false;
								if ((Class75.anInt911 * -1760033137 == 1 || !Class95.aBool1107 && Class75.anInt911 * -1760033137 == 4) && var37) {
									var33 = true;
								}

								boolean var14 = false;
								if ((Class75.anInt909 * -393851667 == 1 || !Class95.aBool1107 && Class75.anInt909 * -393851667 == 4) && Class75.anInt915 * -664246003 >= var24 && Class75.anInt901 * 1538480085 >= var25 && Class75.anInt915 * -664246003 < var19 && Class75.anInt901 * 1538480085 < var20) {
									var14 = true;
								}

								if (var14) {
									Class66.method958(var11, Class75.anInt915 * -664246003 - var12, Class75.anInt901 * 1538480085 - var13, 582903420);
								}

								if (GameClient.aClass117_Sub19_3019 != null && GameClient.aClass117_Sub19_3019 != var11 && var37 && Class5.method88(Class67.method961(var11, 403966456), -1546162127)) {
									GameClient.aClass117_Sub19_3096 = var11;
								}

								if (GameClient.aClass117_Sub19_3157 == var11) {
									GameClient.aBool3097 = true;
									GameClient.anInt3079 = var12 * 857877743;
									GameClient.anInt3099 = var13 * 141334049;
								}

								if (var11.aBool2044) {
									Class117_Sub7 var10;
									if (var37 && GameClient.anInt3117 * -1257555397 != 0 && var11.anObjectArray1971 != null) {
										var10 = new Class117_Sub7();
										var10.aBool1779 = true;
										var10.aClass117_Sub19_1780 = var11;
										var10.anInt1791 = GameClient.anInt3117 * -1122706967;
										var10.anObjectArray1786 = var11.anObjectArray1971;
										GameClient.aClass120_3118.method1575(var10);
									}

									if (GameClient.aClass117_Sub19_3019 != null || Class55.aClass117_Sub19_738 != null || GameClient.aBool3059) {
										var14 = false;
										var33 = false;
										var37 = false;
									}

									if (!var11.aBool2097 && var14) {
										var11.aBool2097 = true;
										if (var11.anObjectArray2053 != null) {
											var10 = new Class117_Sub7();
											var10.aBool1779 = true;
											var10.aClass117_Sub19_1780 = var11;
											var10.anInt1781 = (Class75.anInt915 * -664246003 - var12) * -2107255895;
											var10.anInt1791 = (Class75.anInt901 * 1538480085 - var13) * -1551690197;
											var10.anObjectArray1786 = var11.anObjectArray2053;
											GameClient.aClass120_3118.method1575(var10);
										}
									}

									if (var11.aBool2097 && var33 && var11.anObjectArray2054 != null) {
										var10 = new Class117_Sub7();
										var10.aBool1779 = true;
										var10.aClass117_Sub19_1780 = var11;
										var10.anInt1781 = (Class75.anInt903 * -456706193 - var12) * -2107255895;
										var10.anInt1791 = (Class75.anInt904 * 1381104939 - var13) * -1551690197;
										var10.anObjectArray1786 = var11.anObjectArray2054;
										GameClient.aClass120_3118.method1575(var10);
									}

									if (var11.aBool2097 && !var33) {
										var11.aBool2097 = false;
										if (var11.anObjectArray2055 != null) {
											var10 = new Class117_Sub7();
											var10.aBool1779 = true;
											var10.aClass117_Sub19_1780 = var11;
											var10.anInt1781 = (Class75.anInt903 * -456706193 - var12) * -2107255895;
											var10.anInt1791 = (Class75.anInt904 * 1381104939 - var13) * -1551690197;
											var10.anObjectArray1786 = var11.anObjectArray2055;
											GameClient.aClass120_3120.method1575(var10);
										}
									}

									if (var33 && var11.anObjectArray2056 != null) {
										var10 = new Class117_Sub7();
										var10.aBool1779 = true;
										var10.aClass117_Sub19_1780 = var11;
										var10.anInt1781 = (Class75.anInt903 * -456706193 - var12) * -2107255895;
										var10.anInt1791 = (Class75.anInt904 * 1381104939 - var13) * -1551690197;
										var10.anObjectArray1786 = var11.anObjectArray2056;
										GameClient.aClass120_3118.method1575(var10);
									}

									if (!var11.aBool2096 && var37) {
										var11.aBool2096 = true;
										if (var11.anObjectArray2057 != null) {
											var10 = new Class117_Sub7();
											var10.aBool1779 = true;
											var10.aClass117_Sub19_1780 = var11;
											var10.anInt1781 = (Class75.anInt903 * -456706193 - var12) * -2107255895;
											var10.anInt1791 = (Class75.anInt904 * 1381104939 - var13) * -1551690197;
											var10.anObjectArray1786 = var11.anObjectArray2057;
											GameClient.aClass120_3118.method1575(var10);
										}
									}

									if (var11.aBool2096 && var37 && var11.anObjectArray2083 != null) {
										var10 = new Class117_Sub7();
										var10.aBool1779 = true;
										var10.aClass117_Sub19_1780 = var11;
										var10.anInt1781 = (Class75.anInt903 * -456706193 - var12) * -2107255895;
										var10.anInt1791 = (Class75.anInt904 * 1381104939 - var13) * -1551690197;
										var10.anObjectArray1786 = var11.anObjectArray2083;
										GameClient.aClass120_3118.method1575(var10);
									}

									if (var11.aBool2096 && !var37) {
										var11.aBool2096 = false;
										if (var11.anObjectArray1965 != null) {
											var10 = new Class117_Sub7();
											var10.aBool1779 = true;
											var10.aClass117_Sub19_1780 = var11;
											var10.anInt1781 = (Class75.anInt903 * -456706193 - var12) * -2107255895;
											var10.anInt1791 = (Class75.anInt904 * 1381104939 - var13) * -1551690197;
											var10.anObjectArray1786 = var11.anObjectArray1965;
											GameClient.aClass120_3120.method1575(var10);
										}
									}

									if (var11.anObjectArray2070 != null) {
										var10 = new Class117_Sub7();
										var10.aClass117_Sub19_1780 = var11;
										var10.anObjectArray1786 = var11.anObjectArray2070;
										GameClient.aClass120_3119.method1575(var10);
									}

									Class117_Sub7 var18;
									if (var11.anObjectArray2064 != null && GameClient.anInt3093 * 348172025 > var11.anInt2099 * 1997174245) {
										if (var11.anIntArray2065 != null && GameClient.anInt3093 * 348172025 - var11.anInt2099 * 1997174245 <= 32) {
											label756:
											for (var29 = var11.anInt2099 * 1997174245; var29 < GameClient.anInt3093 * 348172025; var29++) {
												var15 = GameClient.anIntArray3050[var29 & 31];

												for (var17 = 0; var17 < var11.anIntArray2065.length; var17++) {
													if (var11.anIntArray2065[var17] == var15) {
														var18 = new Class117_Sub7();
														var18.aClass117_Sub19_1780 = var11;
														var18.anObjectArray1786 = var11.anObjectArray2064;
														GameClient.aClass120_3118.method1575(var18);
														break label756;
													}
												}
											}
										} else {
											var10 = new Class117_Sub7();
											var10.aClass117_Sub19_1780 = var11;
											var10.anObjectArray1786 = var11.anObjectArray2064;
											GameClient.aClass120_3118.method1575(var10);
										}

										var11.anInt2099 = GameClient.anInt3093 * -365640827;
									}

									if (var11.anObjectArray2066 != null && GameClient.anInt2971 * -1026070793 > var11.anInt2100 * 1812996353) {
										if (var11.anIntArray2067 != null && GameClient.anInt2971 * -1026070793 - var11.anInt2100 * 1812996353 <= 32) {
											label732:
											for (var29 = var11.anInt2100 * 1812996353; var29 < GameClient.anInt2971 * -1026070793; var29++) {
												var15 = GameClient.anIntArray3107[var29 & 31];

												for (var17 = 0; var17 < var11.anIntArray2067.length; var17++) {
													if (var15 == var11.anIntArray2067[var17]) {
														var18 = new Class117_Sub7();
														var18.aClass117_Sub19_1780 = var11;
														var18.anObjectArray1786 = var11.anObjectArray2066;
														GameClient.aClass120_3118.method1575(var18);
														break label732;
													}
												}
											}
										} else {
											var10 = new Class117_Sub7();
											var10.aClass117_Sub19_1780 = var11;
											var10.anObjectArray1786 = var11.anObjectArray2066;
											GameClient.aClass120_3118.method1575(var10);
										}

										var11.anInt2100 = GameClient.anInt2971 * -1529311241;
									}

									if (var11.anObjectArray2068 != null && GameClient.anInt3110 * 95161551 > var11.anInt2007 * 473766595) {
										if (var11.anIntArray2069 != null && GameClient.anInt3110 * 95161551 - var11.anInt2007 * 473766595 <= 32) {
											label708:
											for (var29 = var11.anInt2007 * 473766595; var29 < GameClient.anInt3110 * 95161551; var29++) {
												var15 = GameClient.anIntArray3109[var29 & 31];

												for (var17 = 0; var17 < var11.anIntArray2069.length; var17++) {
													if (var11.anIntArray2069[var17] == var15) {
														var18 = new Class117_Sub7();
														var18.aClass117_Sub19_1780 = var11;
														var18.anObjectArray1786 = var11.anObjectArray2068;
														GameClient.aClass120_3118.method1575(var18);
														break label708;
													}
												}
											}
										} else {
											var10 = new Class117_Sub7();
											var10.aClass117_Sub19_1780 = var11;
											var10.anObjectArray1786 = var11.anObjectArray2068;
											GameClient.aClass120_3118.method1575(var10);
										}

										var11.anInt2007 = GameClient.anInt3110 * -885199611;
									}

									if (GameClient.anInt3111 * -238226625 > var11.anInt2098 * -1715014863 && var11.anObjectArray2073 != null) {
										var10 = new Class117_Sub7();
										var10.aClass117_Sub19_1780 = var11;
										var10.anObjectArray1786 = var11.anObjectArray2073;
										GameClient.aClass120_3118.method1575(var10);
									}

									if (GameClient.anInt3112 * -804211493 > var11.anInt2098 * -1715014863 && var11.anObjectArray2075 != null) {
										var10 = new Class117_Sub7();
										var10.aClass117_Sub19_1780 = var11;
										var10.anObjectArray1786 = var11.anObjectArray2075;
										GameClient.aClass120_3118.method1575(var10);
									}

									if (GameClient.anInt3141 * 1755124885 > var11.anInt2098 * -1715014863 && var11.anObjectArray2076 != null) {
										var10 = new Class117_Sub7();
										var10.aClass117_Sub19_1780 = var11;
										var10.anObjectArray1786 = var11.anObjectArray2076;
										GameClient.aClass120_3118.method1575(var10);
									}

									if (GameClient.anInt3114 * 1594145291 > var11.anInt2098 * -1715014863 && var11.anObjectArray2090 != null) {
										var10 = new Class117_Sub7();
										var10.aClass117_Sub19_1780 = var11;
										var10.anObjectArray1786 = var11.anObjectArray2090;
										GameClient.aClass120_3118.method1575(var10);
									}

									if (GameClient.anInt3166 * 805464979 > var11.anInt2098 * -1715014863 && var11.anObjectArray2006 != null) {
										var10 = new Class117_Sub7();
										var10.aClass117_Sub19_1780 = var11;
										var10.anObjectArray1786 = var11.anObjectArray2006;
										GameClient.aClass120_3118.method1575(var10);
									}

									if (GameClient.anInt3116 * -886316119 > var11.anInt2098 * -1715014863 && var11.anObjectArray2077 != null) {
										var10 = new Class117_Sub7();
										var10.aClass117_Sub19_1780 = var11;
										var10.anObjectArray1786 = var11.anObjectArray2077;
										GameClient.aClass120_3118.method1575(var10);
									}

									var11.anInt2098 = GameClient.anInt3104 * -1664462651;
									if (var11.anObjectArray2074 != null) {
										for (var29 = 0; var29 < GameClient.anInt2925 * 1079234157; var29++) {
											Class117_Sub7 var31 = new Class117_Sub7();
											var31.aClass117_Sub19_1780 = var11;
											var31.anInt1785 = GameClient.anIntArray3144[var29] * 2069245781;
											var31.anInt1782 = GameClient.anIntArray3143[var29] * -816444153;
											var31.anObjectArray1786 = var11.anObjectArray2074;
											GameClient.aClass120_3118.method1575(var31);
										}
									}
								}
							}

							if (!var11.aBool2061 && GameClient.aClass117_Sub19_3019 == null && Class55.aClass117_Sub19_738 == null && !GameClient.aBool3059) {
								if ((var11.anInt2029 * -1031207675 >= 0 || var11.anInt2000 * -769732333 != 0) && Class75.anInt903 * -456706193 >= var24 && Class75.anInt904 * 1381104939 >= var25 && Class75.anInt903 * -456706193 < var19 && Class75.anInt904 * 1381104939 < var20) {
									if (var11.anInt2029 * -1031207675 >= 0) {
										Class117_Sub22_Sub6.aClass117_Sub19_2271 = var0[var11.anInt2029 * -1031207675];
									} else {
										Class117_Sub22_Sub6.aClass117_Sub19_2271 = var11;
									}
								}

								if (var11.anInt1975 * 657737235 == 8 && Class75.anInt903 * -456706193 >= var24 && Class75.anInt904 * 1381104939 >= var25 && Class75.anInt903 * -456706193 < var19 && Class75.anInt904 * 1381104939 < var20) {
									Class117_Sub5.aClass117_Sub19_1749 = var11;
								}

								if (var11.anInt1997 * 1348115267 > var11.anInt1989 * 2747837) {
									Class69.method967(var11, var11.anInt1988 * 1854643179 + var12, var13, var11.anInt1989 * 2747837, var11.anInt1997 * 1348115267, Class75.anInt903 * -456706193, Class75.anInt904 * 1381104939, -737161781);
								}
							}
						}
					}
				}
			}
		}

	}

	Class129 method747(boolean var1, byte var2) {
		return Class93.method1241("2", GameClient.aClass79_2919.aString947, var1, (byte) -42);
	}

	void method749(byte var1) {
		Class129 var2 = method747(false, (byte) -1);
		boolean var21 = false;

		try {
			label186:
			{
				try {
					var21 = true;
					byte[] var3 = new byte[(int) var2.method1686((byte) 0)];

					int var5;
					for (int var4 = 0; var4 < var3.length; var4 += var5) {
						var5 = var2.method1691(var3, var4, var3.length - var4, -1891193295);
						if (var5 == -1) {
							throw new EOFException();
						}
					}

					Class117_Sub14 var29 = new Class117_Sub14(var3);
					if (var29.aByteArray1885.length - var29.anInt1880 * 561453169 < 1) {
						try {
							var2.method1685(882680446);
						} catch (Exception var24) {
							;
						}

						return;
					}

					int var6 = var29.method2010(-1439707937);
					if (var6 < 0 || var6 > 1) {
						try {
							var2.method1685(1056199414);
						} catch (Exception var26) {
							;
						}

						return;
					}

					int var7 = var29.method2012(1053511631);

					int var8;
					int var9;
					int var10;
					for (var8 = 0; var8 < var7; var8++) {
						var9 = var29.method2012(1053511631);
						var10 = var29.method2015((byte) 26);
						if (aBoolArray622[var9]) {
							anIntArray634[var9] = var10;
						}
					}

					var8 = var29.method2012(1053511631);

					for (var9 = 0; var9 < var8; var9++) {
						var10 = var29.method2012(1053511631);
						String var11 = var29.method2018((byte) 70);
						if (aBoolArray630[var10]) {
							aStringArray623[var10] = var11;
						}
					}
				} catch (Exception var27) {
					try {
						var2.method1685(1079430190);
						var21 = false;
					} catch (Exception var23) {
						var21 = false;
					}
					break label186;
				}

				try {
					var2.method1685(1232499264);
					var21 = false;
				} catch (Exception var25) {
					var21 = false;
				}
			}
		} finally {
			if (var21) {
				try {
					var2.method1685(1520961982);
				} catch (Exception var22) {
					;
				}

			}
		}

		aBool619 = false;
	}

	void method750(int var1) {
		if (aBool619 && 8816836636704649939L * aLong625 < Class47.method774(1789255111) - 60000L) {
			method744(921127938);
		}

	}

	boolean method751(int var1) {
		return aBool619;
	}

	void method757(int var1, String var2, int var3) {
		aStringArray623[var1] = var2;
		if (aBoolArray630[var1]) {
			aBool619 = true;
		}

	}

	void method758(byte var1) {
		int var2;
		for (var2 = 0; var2 < anIntArray634.length; var2++) {
			if (!aBoolArray622[var2]) {
				anIntArray634[var2] = -1;
			}
		}

		for (var2 = 0; var2 < aStringArray623.length; var2++) {
			if (!aBoolArray630[var2]) {
				aStringArray623[var2] = null;
			}
		}

	}

	String method763(int var1, byte var2) {
		return aStringArray623[var1];
	}

	Class46() {
		anIntArray634 = new int[Class29.aClass106_Sub1_370.method1399(19, 2129071672)];
		aStringArray623 = new String[Class29.aClass106_Sub1_370.method1399(15, 2132603398)];
		aBoolArray622 = new boolean[anIntArray634.length];

		int var1;
		for (var1 = 0; var1 < anIntArray634.length; var1++) {
			Class117_Sub22_Sub8 var3 = (Class117_Sub22_Sub8) Class117_Sub22_Sub8.aClass115_2286.method1515((long) var1);
			Class117_Sub22_Sub8 var2;
			if (var3 != null) {
				var2 = var3;
			} else {
				byte[] var4 = Class117_Sub22_Sub8.aClass106_2281.method1380(19, var1, (byte) 62);
				var3 = new Class117_Sub22_Sub8();
				if (var4 != null) {
					var3.method2492(new Class117_Sub14(var4), -480352172);
				}

				Class117_Sub22_Sub8.aClass115_2286.method1517(var3, (long) var1);
				var2 = var3;
			}

			aBoolArray622[var1] = var2.aBool2283;
		}

		aBoolArray630 = new boolean[aStringArray623.length];

		for (var1 = 0; var1 < aStringArray623.length; var1++) {
			Class117_Sub22_Sub4 var5 = Class54_Sub1.method1934(var1, 1480773951);
			aBoolArray630[var1] = var5.aBool2179;
		}

		for (var1 = 0; var1 < anIntArray634.length; var1++) {
			anIntArray634[var1] = -1;
		}

		method749((byte) -11);
	}

}
