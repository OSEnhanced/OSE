package core.Jagex;
public final class Class117_Sub14_Sub1 extends Class117_Sub14 {

	static final int anInt2481 = 4;
	public static Class15 aClass15_2484;
	public static final int anInt2485 = 66;
	int anInt2482;
	Class70 aClass70_2483;
	static int[] anIntArray2480 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};

	public void method2930(int var1) {
		anInt2482 = anInt1880 * 466368200;
	}

	public int method2931(int var1, int var2) {
		int var3 = anInt2482 * -763064487 >> 3;
		int var5 = 8 - (anInt2482 * -763064487 & 7);
		int var4 = 0;

		for (anInt2482 += var1 * 280807657; var1 > var5; var5 = 8) {
			var4 += (aByteArray1885[var3++] & anIntArray2480[var5]) << var1 - var5;
			var1 -= var5;
		}

		if (var5 == var1) {
			var4 += aByteArray1885[var3] & anIntArray2480[var5];
		} else {
			var4 += aByteArray1885[var3] >> var5 - var1 & anIntArray2480[var1];
		}

		return var4;
	}

	public void method2932(int var1, int var2) {
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) (var1 + aClass70_2483.method975(-1775089118));
	}

	public int method2933(int var1) {
		return aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] - aClass70_2483.method975(530423582) & 255;
	}

	public void method2935(int[] var1, int var2) {
		aClass70_2483 = new Class70(var1);
	}

	public int method2937(int var1, int var2) {
		return var1 * 8 - anInt2482 * -763064487;
	}

	public void method2945(int var1) {
		anInt1880 = (anInt2482 * -763064487 + 7) / 8 * -2079217519;
	}

	public static Class117_Sub22_Sub2 method2946(int var0, byte var1) {
		Class117_Sub22_Sub2 var2 = (Class117_Sub22_Sub2) Class117_Sub22_Sub2.aClass115_2157.method1515((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Class92.aClass106_1088.method1380(5, var0, (byte) 74);
			var2 = new Class117_Sub22_Sub2();
			if (var3 != null) {
				var2.method2356(new Class117_Sub14(var3), (short) 250);
			}

			Class117_Sub22_Sub2.aClass115_2157.method1517(var2, (long) var0);
			return var2;
		}
	}

	public Class117_Sub14_Sub1(int var1) {
		super(var1);
	}

	static void method2953(int var0, int var1) {
		if (GameClient.anInt2924 * 935215971 != var0) {
			if (GameClient.anInt2924 * 935215971 == 0) {
				Class65.method947(-104301942);
			}

			if (var0 == 20 || var0 == 40 || var0 == 45) {
				GameClient.anInt2985 = 0;
				GameClient.anInt2950 = 0;
				GameClient.anInt3106 = 0;
			}

			if (var0 != 20 && var0 != 40 && GameClient.aClass81_2960 != null) {
				GameClient.aClass81_2960.method1088((byte) 0);
				GameClient.aClass81_2960 = null;
			}

			if (GameClient.anInt2924 * 935215971 == 25) {
				GameClient.anInt2978 = 0;
				GameClient.anInt2974 = 0;
				GameClient.anInt2975 = -1661099375;
				GameClient.anInt3199 = 0;
				GameClient.anInt2977 = -519437017;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					Class117_Sub22_Sub9.method2510(Class91.aCanvas1085, GameClient.aClass106_Sub1_2947, Class117_Sub13.aClass106_Sub1_1868, true, GameClient.anInt2924 * 935215971 == 11 ? 4 : 0, -1890192473);
				} else if (var0 == 11) {
					Class117_Sub22_Sub9.method2510(Class91.aCanvas1085, GameClient.aClass106_Sub1_2947, Class117_Sub13.aClass106_Sub1_1868, false, 4, -1890192473);
				} else if (Class6.aBool83) {
					Class6.aClass117_Sub22_Sub17_Sub2_84 = null;
					Class6.aClass117_Sub22_Sub17_Sub2_60 = null;
					Class138.aClass117_Sub22_Sub17_Sub2Array1621 = null;
					Class114_Sub1.aClass117_Sub22_Sub17_Sub3_1672 = null;
					Class29.aClass117_Sub22_Sub17_Sub3_374 = null;
					Class117_Sub15.aClass117_Sub22_Sub17_Sub2_1901 = null;
					Class29.aClass117_Sub22_Sub17_Sub2Array364 = null;
					Class46.aClass117_Sub22_Sub17_Sub2_628 = null;
					Class29.aClass117_Sub22_Sub17_Sub2_367 = null;
					Class40.aClass117_Sub22_Sub17_Sub3Array497 = null;
					Class20.aClass117_Sub22_Sub17_Sub2Array231 = null;
					Class46.aClass117_Sub22_Sub17_Sub2Array629 = null;
					Class28.aClass117_Sub22_Sub17_Sub2Array356 = null;
					Class117_Sub9.aClass117_Sub22_Sub17_Sub2_1812 = null;
					Class43.anIntArray583 = null;
					Class117_Sub7.anIntArray1787 = null;
					Class117_Sub22_Sub4.anIntArray2178 = null;
					Class97.anIntArray1128 = null;
					Class3.anIntArray30 = null;
					Class117_Sub10.anIntArray1830 = null;
					Class35.anIntArray444 = null;
					Class1.anIntArray2 = null;
					Class121.anInt1515 = -793599395;
					Class54_Sub1.aClass106_1728 = null;
					Class117_Sub11.anInt1851 = -366489035;
					Class117_Sub22_Sub18_Sub2.anInt2605 = -1519237447;
					Class138.anInt1620 = 0;
					Class82.aBool972 = false;
					Class39.anInt488 = 123400454;
					Class73_Sub2.method2218(true, (byte) 110);
					Class6.aBool83 = false;
				}
			} else {
				Class117_Sub22_Sub9.method2510(Class91.aCanvas1085, GameClient.aClass106_Sub1_2947, Class117_Sub13.aClass106_Sub1_1868, true, 0, -1890192473);
			}

			GameClient.anInt2924 = var0 * -661301685;
		}
	}

	static void method2955(Class117_Sub19[] var0, int var1, byte var2) {
		for (int var3 = 0; var3 < var0.length; var3++) {
			Class117_Sub19 var4 = var0[var3];
			if (var4 != null && var4.anInt2027 * 1264631563 == var1 && (!var4.aBool2061 || !Class117_Sub22_Sub18_Sub6.method3356(var4, -520570826))) {
				int var6;
				if (var4.anInt1975 * 657737235 == 0) {
					if (!var4.aBool2061 && Class117_Sub22_Sub18_Sub6.method3356(var4, -1130730282) && var4 != Class117_Sub22_Sub6.aClass117_Sub19_2271) {
						continue;
					}

					method2955(var0, var4.anInt1973 * -1955776525, (byte) 101);
					if (var4.aClass117_Sub19Array2095 != null) {
						method2955(var4.aClass117_Sub19Array2095, var4.anInt1973 * -1955776525, (byte) 103);
					}

					Class117_Sub10 var5 = (Class117_Sub10) GameClient.aClass127_3080.method1675((long) (var4.anInt1973 * -1955776525));
					if (var5 != null) {
						var6 = var5.anInt1831 * -2090327687;
						if (Class4.method85(var6, 1390080417)) {
							method2955(Class117_Sub19.aClass117_Sub19ArrayArray2032[var6], -1, (byte) 104);
						}
					}
				}

				if (var4.anInt1975 * 657737235 == 6) {
					if (var4.anInt2102 * 1339652199 != -1 || var4.anInt2019 * 946586839 != -1) {
						boolean var8 = Class2.method62(var4, (short) 2048);
						if (var8) {
							var6 = var4.anInt2019 * 946586839;
						} else {
							var6 = var4.anInt2102 * 1339652199;
						}

						if (var6 != -1) {
							Class117_Sub22_Sub14 var7 = Class114_Sub1.method1838(var6, (byte) -126);

							for (var4.anInt2101 += GameClient.anInt3092 * -914501697; var4.anInt2101 * 1752524935 > var7.anIntArray2405[var4.anInt2082 * -816117465]; Class54.method850(var4, (byte) 0)) {
								var4.anInt2101 -= var7.anIntArray2405[var4.anInt2082 * -816117465] * 883350839;
								var4.anInt2082 += 226612887;
								if (var4.anInt2082 * -816117465 >= var7.anIntArray2403.length) {
									var4.anInt2082 -= var7.anInt2407 * 881271361;
									if (var4.anInt2082 * -816117465 < 0 || var4.anInt2082 * -816117465 >= var7.anIntArray2403.length) {
										var4.anInt2082 = 0;
									}
								}
							}
						}
					}

					if (var4.anInt1982 * -947326009 != 0 && !var4.aBool2061) {
						int var9 = var4.anInt1982 * -947326009 >> 16;
						var6 = var4.anInt1982 * -947326009 << 16 >> 16;
						var9 *= GameClient.anInt3092 * -402053703;
						var6 *= GameClient.anInt3092 * -402053703;
						var4.anInt1966 = (var4.anInt1966 * -1133280755 + var9 & 2047) * -1995334459;
						var4.anInt2023 = (var6 + var4.anInt2023 * -1569228799 & 2047) * 633899009;
						Class54.method850(var4, (byte) 0);
					}
				}
			}
		}

	}

}
