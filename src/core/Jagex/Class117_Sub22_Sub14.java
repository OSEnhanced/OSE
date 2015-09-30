package core.Jagex;
public class Class117_Sub22_Sub14 extends Class117_Sub22 {

	static int anInt2399;
	public static Class106 aClass106_2408;
	public static Class106 aClass106_2410;
	public static final int anInt2412 = 224;
	public static final int anInt2417 = 19136770;
	static final int anInt2418 = 19136911;
	public static Class106 aClass106_2419;
	public static final int anInt2421 = 145;
	public int[] anIntArray2405;
	public int anInt2407 = 1715760425;
	int[] anIntArray2420;
	public int[] anIntArray2403;
	public boolean aBool2409 = false;
	public int anInt2400 = -102037599;
	public int anInt2398 = 105186101;
	public int anInt2411 = 2123236431;
	public int anInt2413 = 1849753979;
	public int anInt2414 = 971979097;
	public int anInt2415 = 1253761793;
	public int anInt2416 = -995385586;
	int[] anIntArray2404;
	public int[] anIntArray2406;
	static Class115 aClass115_2401 = new Class115(64);
	static Class115 aClass115_2402 = new Class115(100);

	void method2633(Class117_Sub14 var1, short var2) {
		while (true) {
			int var3 = var1.method2010(-1439707937);
			if (var3 == 0) {
				return;
			}

			method2634(var1, var3, (byte) -114);
		}
	}

	void method2634(Class117_Sub14 var1, int var2, byte var3) {
		int var4;
		int var5;
		if (var2 == 1) {
			var5 = var1.method2012(1053511631);
			anIntArray2405 = new int[var5];

			for (var4 = 0; var4 < var5; var4++) {
				anIntArray2405[var4] = var1.method2012(1053511631);
			}

			anIntArray2403 = new int[var5];

			for (var4 = 0; var4 < var5; var4++) {
				anIntArray2403[var4] = var1.method2012(1053511631);
			}

			for (var4 = 0; var4 < var5; var4++) {
				anIntArray2403[var4] += var1.method2012(1053511631) << 16;
			}
		} else if (var2 == 2) {
			anInt2407 = var1.method2012(1053511631) * -1715760425;
		} else if (var2 == 3) {
			var5 = var1.method2010(-1439707937);
			anIntArray2420 = new int[1 + var5];

			for (var4 = 0; var4 < var5; var4++) {
				anIntArray2420[var4] = var1.method2010(-1439707937);
			}

			anIntArray2420[var5] = 9999999;
		} else if (var2 == 4) {
			aBool2409 = true;
		} else if (var2 == 5) {
			anInt2400 = var1.method2010(-1439707937) * -879400979;
		} else if (var2 == 6) {
			anInt2398 = var1.method2012(1053511631) * -105186101;
		} else if (var2 == 7) {
			anInt2411 = var1.method2012(1053511631) * -2123236431;
		} else if (var2 == 8) {
			anInt2413 = var1.method2010(-1439707937) * 1493723657;
		} else if (var2 == 9) {
			anInt2414 = var1.method2010(-1439707937) * -971979097;
		} else if (var2 == 10) {
			anInt2415 = var1.method2010(-1439707937) * -1253761793;
		} else if (var2 == 11) {
			anInt2416 = var1.method2010(-1439707937) * 1649790855;
		} else if (var2 == 12) {
			var5 = var1.method2010(-1439707937);
			anIntArray2404 = new int[var5];

			for (var4 = 0; var4 < var5; var4++) {
				anIntArray2404[var4] = var1.method2012(1053511631);
			}

			for (var4 = 0; var4 < var5; var4++) {
				anIntArray2404[var4] += var1.method2012(1053511631) << 16;
			}
		} else if (var2 == 13) {
			var5 = var1.method2010(-1439707937);
			anIntArray2406 = new int[var5];

			for (var4 = 0; var4 < var5; var4++) {
				anIntArray2406[var4] = var1.method2014(1515514723);
			}
		}

	}

	public Class117_Sub22_Sub18_Sub7 method2636(Class117_Sub22_Sub18_Sub7 var1, int var2, int var3) {
		var2 = anIntArray2403[var2];
		Class117_Sub22_Sub16 var5 = Class24.method400(var2 >> 16, (byte) 105);
		var2 &= 65535;
		if (var5 == null) {
			return var1.method3406(true);
		} else {
			Class117_Sub22_Sub18_Sub7 var4 = var1.method3406(!var5.method2858(var2, -1621062891));
			var4.method3370(var5, var2);
			return var4;
		}
	}

	Class117_Sub22_Sub18_Sub7 method2637(Class117_Sub22_Sub18_Sub7 var1, int var2, int var3, byte var4) {
		var2 = anIntArray2403[var2];
		Class117_Sub22_Sub16 var6 = Class24.method400(var2 >> 16, (byte) 56);
		var2 &= 65535;
		if (var6 == null) {
			return var1.method3406(true);
		} else {
			Class117_Sub22_Sub18_Sub7 var5 = var1.method3406(!var6.method2858(var2, 1171645816));
			var3 &= 3;
			if (var3 == 1) {
				var5.method3374();
			} else if (var3 == 2) {
				var5.method3399();
			} else if (var3 == 3) {
				var5.method3372();
			}

			var5.method3370(var6, var2);
			if (var3 == 1) {
				var5.method3372();
			} else if (var3 == 2) {
				var5.method3399();
			} else if (var3 == 3) {
				var5.method3374();
			}

			return var5;
		}
	}

	Class117_Sub22_Sub18_Sub7 method2638(Class117_Sub22_Sub18_Sub7 var1, int var2, int var3) {
		var2 = anIntArray2403[var2];
		Class117_Sub22_Sub16 var4 = Class24.method400(var2 >> 16, (byte) 77);
		var2 &= 65535;
		if (var4 == null) {
			return var1.method3365(true);
		} else {
			Class117_Sub22_Sub18_Sub7 var5 = var1.method3365(!var4.method2858(var2, 485496180));
			var5.method3370(var4, var2);
			return var5;
		}
	}

	public Class117_Sub22_Sub18_Sub7 method2639(Class117_Sub22_Sub18_Sub7 var1, int var2, Class117_Sub22_Sub14 var3, int var4, int var5) {
		var2 = anIntArray2403[var2];
		Class117_Sub22_Sub16 var6 = Class24.method400(var2 >> 16, (byte) 32);
		var2 &= 65535;
		if (var6 == null) {
			return var3.method2636(var1, var4, -2111270997);
		} else {
			var4 = var3.anIntArray2403[var4];
			Class117_Sub22_Sub16 var8 = Class24.method400(var4 >> 16, (byte) 24);
			var4 &= 65535;
			Class117_Sub22_Sub18_Sub7 var7;
			if (var8 == null) {
				var7 = var1.method3406(!var6.method2858(var2, 3612510));
				var7.method3370(var6, var2);
				return var7;
			} else {
				var7 = var1.method3406(!var6.method2858(var2, -569459311) & !var8.method2858(var4, 781370926));
				var7.method3387(var6, var2, var8, var4, anIntArray2420);
				return var7;
			}
		}
	}

	public Class117_Sub22_Sub18_Sub7 method2640(Class117_Sub22_Sub18_Sub7 var1, int var2, int var3) {
		int var4 = anIntArray2403[var2];
		Class117_Sub22_Sub16 var5 = Class24.method400(var4 >> 16, (byte) 57);
		var4 &= 65535;
		if (var5 == null) {
			return var1.method3406(true);
		} else {
			Class117_Sub22_Sub16 var6 = null;
			int var8 = 0;
			if (anIntArray2404 != null && var2 < anIntArray2404.length) {
				var8 = anIntArray2404[var2];
				var6 = Class24.method400(var8 >> 16, (byte) 7);
				var8 &= 65535;
			}

			Class117_Sub22_Sub18_Sub7 var7;
			if (var6 != null && var8 != 65535) {
				var7 = var1.method3406(!var5.method2858(var4, 1342887712) & !var6.method2858(var8, -1137102561));
				var7.method3370(var5, var4);
				var7.method3370(var6, var8);
				return var7;
			} else {
				var7 = var1.method3406(!var5.method2858(var4, 791025864));
				var7.method3370(var5, var4);
				return var7;
			}
		}
	}

	public static Class79[] method2642(int var0) {
		return new Class79[]{Class79.aClass79_942, Class79.aClass79_941, Class79.aClass79_946, Class79.aClass79_944, Class79.aClass79_943, Class79.aClass79_945};
	}

	void method2668(int var1) {
		if (anInt2414 * -1392738025 == -1) {
			if (anIntArray2420 != null) {
				anInt2414 = -1943958194;
			} else {
				anInt2414 = 0;
			}
		}

		if (anInt2415 * 1618076415 == -1) {
			if (anIntArray2420 != null) {
				anInt2415 = 1787443710;
			} else {
				anInt2415 = 0;
			}
		}

	}

	static void method2672(Class106_Sub1 var0, int var1, int var2, int var3, byte var4, boolean var5, int var6) {
		long var7 = (long) (var2 + (var1 << 16));
		Class117_Sub22_Sub20 var9 = (Class117_Sub22_Sub20) Class96.aClass127_1108.method1675(var7);
		if (var9 == null) {
			var9 = (Class117_Sub22_Sub20) Class96.aClass127_1112.method1675(var7);
			if (var9 == null) {
				var9 = (Class117_Sub22_Sub20) Class96.aClass127_1113.method1675(var7);
				if (var9 != null) {
					if (var5) {
						var9.method2339();
						Class96.aClass127_1108.method1666(var9, var7);
						Class96.anInt1116 += 348267081;
						Class96.anInt1109 += 1995029351;
					}

				} else {
					if (!var5) {
						var9 = (Class117_Sub22_Sub20) Class96.aClass127_1117.method1675(var7);
						if (var9 != null) {
							return;
						}
					}

					var9 = new Class117_Sub22_Sub20();
					var9.aClass106_Sub1_2496 = var0;
					var9.anInt2493 = var3 * -1081532057;
					var9.aByte2492 = var4;
					if (var5) {
						Class96.aClass127_1108.method1666(var9, var7);
						Class96.anInt1109 += 1995029351;
					} else {
						Class96.aClass119_1114.method1555(var9);
						Class96.aClass127_1113.method1666(var9, var7);
						Class96.anInt1116 -= 348267081;
					}

				}
			}
		}
	}

}
