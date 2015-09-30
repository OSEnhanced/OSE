package core.Jagex;
public class Class117_Sub2_Sub4 extends Class117_Sub2 {

	static final int anInt2524 = 4;
	int anInt2513 = 251810560;
	int anInt2536;
	int anInt2515;
	long aLong2538;
	boolean aBool2537;
	long aLong2533;
	int anInt2514 = -1500700608;
	int[] anIntArray2534 = new int[16];
	int[] anIntArray2523 = new int[16];
	int[] anIntArray2517 = new int[16];
	int[] anIntArray2535 = new int[16];
	int[] anIntArray2519 = new int[16];
	int[] anIntArray2520 = new int[16];
	int[] anIntArray2521 = new int[16];
	int[] anIntArray2512 = new int[16];
	int[] anIntArray2525 = new int[16];
	int[] anIntArray2518 = new int[16];
	int[] anIntArray2526 = new int[16];
	int[] anIntArray2527 = new int[16];
	int[] anIntArray2528 = new int[16];
	int[] anIntArray2529 = new int[16];
	int[] anIntArray2530 = new int[16];
	Class117_Sub21[][] aClass117_Sub21ArrayArray2522 = new Class117_Sub21[16][128];
	Class117_Sub21[][] aClass117_Sub21ArrayArray2532 = new Class117_Sub21[16][128];
	Class103 aClass103_2516 = new Class103();
	Class117_Sub2_Sub3 aClass117_Sub2_Sub3_2539 = new Class117_Sub2_Sub3(this);
	Class127 aClass127_2531 = new Class127(128);

	protected synchronized Class117_Sub2 method1848() {
		return null;
	}

	public synchronized void method2974(int var1, int var2) {
		anInt2513 = var1 * -1106312621;
	}

	public int method2975(int var1) {
		return anInt2513 * -2000121381;
	}

	synchronized boolean method2976(Class117_Sub17 var1, Class106 var2, Class15 var3, int var4, int var5) {
		var1.method2258();
		boolean var6 = true;
		int[] var7 = null;
		if (var4 > 0) {
			var7 = new int[]{var4};
		}

		for (Class117_Sub23 var10 = (Class117_Sub23) var1.aClass127_1925.method1668(); var10 != null; var10 = (Class117_Sub23) var1.aClass127_1925.method1669()) {
			int var11 = (int) var10.aLong1503;
			Class117_Sub16 var9 = (Class117_Sub16) aClass127_2531.method1675((long) var11);
			if (var9 == null) {
				byte[] var12 = var2.method1384(var11, 635294511);
				Class117_Sub16 var8;
				if (var12 == null) {
					var8 = null;
				} else {
					var8 = new Class117_Sub16(var12);
				}

				var9 = var8;
				if (var8 == null) {
					var6 = false;
					continue;
				}

				aClass127_2531.method1666(var8, (long) var11);
			}

			if (!var9.method2254(var3, var10.aByteArray2134, var7, 1954894848)) {
				var6 = false;
			}
		}

		if (var6) {
			var1.method2266();
		}

		return var6;
	}

	synchronized void method2977(byte var1) {
		for (Class117_Sub16 var2 = (Class117_Sub16) aClass127_2531.method1668(); var2 != null; var2 = (Class117_Sub16) aClass127_2531.method1669()) {
			var2.method2253((byte) 8);
		}

	}

	public synchronized void method2978(byte var1) {
		for (Class117_Sub16 var2 = (Class117_Sub16) aClass127_2531.method1668(); var2 != null; var2 = (Class117_Sub16) aClass127_2531.method1669()) {
			var2.method1532();
		}

	}

	public synchronized boolean method2979(int var1) {
		return aClass103_2516.method1338();
	}

	public synchronized void method2980(byte var1) {
		aClass103_2516.method1301();
		method2999((byte) -3);
	}

	void method2981(int var1) {
		int var2 = anInt2536 * -573963955;
		int var3 = anInt2515 * -1981489699;

		long var4;
		for (var4 = aLong2538 * 4261544990416356371L; anInt2515 * -1981489699 == var3; var4 = aClass103_2516.method1311(var3)) {
			while (aClass103_2516.anIntArray1156[var2] == var3) {
				aClass103_2516.method1314(var2);
				int var6 = aClass103_2516.method1308(var2);
				if (var6 == 1) {
					aClass103_2516.method1306();
					aClass103_2516.method1305(var2);
					if (aClass103_2516.method1312()) {
						if (!aBool2537 || var3 == 0) {
							method2999((byte) -90);
							aClass103_2516.method1301();
							return;
						}

						aClass103_2516.method1300(var4);
					}
					break;
				}

				if ((var6 & 128) != 0) {
					method3023(var6, -831643469);
				}

				aClass103_2516.method1321(var2);
				aClass103_2516.method1305(var2);
			}

			var2 = aClass103_2516.method1318();
			var3 = aClass103_2516.anIntArray1156[var2];
		}

		anInt2536 = var2 * 1022959493;
		anInt2515 = var3 * -1478991243;
		aLong2538 = 1040754524903548443L * var4;
	}

	int method2982(Class117_Sub21 var1, int var2) {
		int var3 = anIntArray2523[var1.anInt2130 * -418354143];
		return var3 < 8192 ? var3 * var1.anInt2114 * 824915915 + 32 >> 6 : 16384 - ((16384 - var3) * (128 - var1.anInt2114 * 824915915) + 32 >> 6);
	}

	synchronized void method2983(Class117_Sub17 var1, boolean var2, int var3) {
		method2980((byte) 84);
		aClass103_2516.method1345(var1.aByteArray1924);
		aBool2537 = var2;
		aLong2533 = 0L;
		int var5 = aClass103_2516.method1303();

		for (int var4 = 0; var4 < var5; var4++) {
			aClass103_2516.method1314(var4);
			aClass103_2516.method1321(var4);
			aClass103_2516.method1305(var4);
		}

		anInt2536 = aClass103_2516.method1318() * 1022959493;
		anInt2515 = aClass103_2516.anIntArray1156[anInt2536 * -573963955] * -1478991243;
		aLong2538 = aClass103_2516.method1311(anInt2515 * -1981489699) * 1040754524903548443L;
	}

	void method2984(int var1, int var2, int var3) {
		if (var2 != anIntArray2519[var1]) {
			anIntArray2519[var1] = var2;

			for (int var4 = 0; var4 < 128; var4++) {
				aClass117_Sub21ArrayArray2532[var1][var4] = null;
			}
		}

	}

	void method2985(int var1, int var2, int var3, int var4) {
		method3011(var1, var2, 64, (byte) -1);
		if ((anIntArray2518[var1] & 2) != 0) {
			for (Class117_Sub21 var6 = (Class117_Sub21) aClass117_Sub2_Sub3_2539.aClass120_2505.method1573(); var6 != null; var6 = (Class117_Sub21) aClass117_Sub2_Sub3_2539.aClass120_2505.method1583()) {
				if (var6.anInt2130 * -418354143 == var1 && var6.anInt2118 * -1281961041 < 0) {
					aClass117_Sub21ArrayArray2522[var1][var6.anInt2112 * 1972048083] = null;
					aClass117_Sub21ArrayArray2522[var1][var2] = var6;
					int var7 = (var6.anInt2117 * -1035803067 * var6.anInt2116 * 1042195271 >> 12) + var6.anInt2121 * 272441199;
					var6.anInt2121 += (var2 - var6.anInt2112 * 1972048083 << 8) * 54730639;
					var6.anInt2116 = (var7 - var6.anInt2121 * 272441199) * 1836455543;
					var6.anInt2117 = 868798464;
					var6.anInt2112 = var2 * -1502623909;
					return;
				}
			}
		}

		Class117_Sub16 var9 = (Class117_Sub16) aClass127_2531.method1675((long) anIntArray2519[var1]);
		if (var9 != null) {
			Class117_Sub4_Sub1 var10 = var9.aClass117_Sub4_Sub1Array1915[var2];
			if (var10 != null) {
				Class117_Sub21 var5 = new Class117_Sub21();
				var5.anInt2130 = var1 * -979757087;
				var5.aClass117_Sub16_2108 = var9;
				var5.aClass117_Sub4_Sub1_2109 = var10;
				var5.aClass112_2125 = var9.aClass112Array1918[var2];
				var5.anInt2111 = var9.aByteArray1914[var2] * 2097872257;
				var5.anInt2112 = var2 * -1502623909;
				var5.anInt2115 = (1024 + var3 * var3 * var9.anInt1919 * 925319345 * var9.aByteArray1920[var2] >> 11) * -1890286085;
				var5.anInt2114 = (var9.aByteArray1917[var2] & 255) * 1934734819;
				var5.anInt2121 = ((var2 << 8) - (var9.aShortArray1916[var2] & 32767)) * 54730639;
				var5.anInt2107 = 0;
				var5.anInt2119 = 0;
				var5.anInt2120 = 0;
				var5.anInt2118 = 1226284209;
				var5.anInt2122 = 0;
				if (anIntArray2528[var1] == 0) {
					var5.aClass117_Sub2_Sub2_2113 = Class117_Sub2_Sub2.method2731(var10, method2998(var5, -2133871190), method3012(var5, (byte) 11), method2982(var5, -115903977));
				} else {
					var5.aClass117_Sub2_Sub2_2113 = Class117_Sub2_Sub2.method2731(var10, method2998(var5, -1536857857), 0, method2982(var5, -84425613));
					method3054(var5, var9.aShortArray1916[var2] < 0, 1837062353);
				}

				if (var9.aShortArray1916[var2] < 0) {
					var5.aClass117_Sub2_Sub2_2113.method2709(-1);
				}

				if (var5.anInt2111 * 731595393 >= 0) {
					Class117_Sub21 var8 = aClass117_Sub21ArrayArray2532[var1][var5.anInt2111 * 731595393];
					if (var8 != null && var8.anInt2118 * -1281961041 < 0) {
						aClass117_Sub21ArrayArray2522[var1][var8.anInt2112 * 1972048083] = null;
						var8.anInt2118 = 0;
					}

					aClass117_Sub21ArrayArray2532[var1][var5.anInt2111 * 731595393] = var5;
				}

				aClass117_Sub2_Sub3_2539.aClass120_2505.method1575(var5);
				aClass117_Sub21ArrayArray2522[var1][var2] = var5;
			}
		}
	}

	void method2986(int var1, int var2, int var3) {
	}

	void method2988(int var1, int var2, int var3, byte var4) {
	}

	void method2989(int var1, int var2, byte var3) {
		anIntArray2535[var1] = var2;
		anIntArray2520[var1] = var2 & -128;
		method2984(var1, var2, -112752833);
	}

	void method2990(int var1, int var2, byte var3) {
		anIntArray2521[var1] = var2;
	}

	void method2992(int var1, int var2) {
		if (var1 >= 0) {
			anIntArray2534[var1] = 12800;
			anIntArray2523[var1] = 8192;
			anIntArray2517[var1] = 16383;
			anIntArray2521[var1] = 8192;
			anIntArray2512[var1] = 0;
			anIntArray2525[var1] = 8192;
			method2994(var1, -2063082139);
			method2996(var1, (byte) 12);
			anIntArray2518[var1] = 0;
			anIntArray2526[var1] = 32767;
			anIntArray2527[var1] = 256;
			anIntArray2528[var1] = 0;
			method2997(var1, 8192, -1732993094);
		} else {
			for (var1 = 0; var1 < 16; var1++) {
				method2992(var1, -1003112515);
			}

		}
	}

	void method2993(int var1, int var2) {
		for (Class117_Sub21 var3 = (Class117_Sub21) aClass117_Sub2_Sub3_2539.aClass120_2505.method1577(); var3 != null; var3 = (Class117_Sub21) aClass117_Sub2_Sub3_2539.aClass120_2505.method1582()) {
			if ((var1 < 0 || var3.anInt2130 * -418354143 == var1) && var3.anInt2118 * -1281961041 < 0) {
				aClass117_Sub21ArrayArray2522[var3.anInt2130 * -418354143][var3.anInt2112 * 1972048083] = null;
				var3.anInt2118 = 0;
			}
		}

	}

	void method2994(int var1, int var2) {
		if ((anIntArray2518[var1] & 2) != 0) {
			for (Class117_Sub21 var3 = (Class117_Sub21) aClass117_Sub2_Sub3_2539.aClass120_2505.method1577(); var3 != null; var3 = (Class117_Sub21) aClass117_Sub2_Sub3_2539.aClass120_2505.method1582()) {
				if (var1 == var3.anInt2130 * -418354143 && aClass117_Sub21ArrayArray2522[var1][var3.anInt2112 * 1972048083] == null && var3.anInt2118 * -1281961041 < 0) {
					var3.anInt2118 = 0;
				}
			}
		}

	}

	void method2996(int var1, byte var2) {
		if ((anIntArray2518[var1] & 4) != 0) {
			for (Class117_Sub21 var3 = (Class117_Sub21) aClass117_Sub2_Sub3_2539.aClass120_2505.method1577(); var3 != null; var3 = (Class117_Sub21) aClass117_Sub2_Sub3_2539.aClass120_2505.method1582()) {
				if (var1 == var3.anInt2130 * -418354143) {
					var3.anInt2127 = 0;
				}
			}
		}

	}

	protected synchronized void method1851(int[] var1, int var2, int var3) {
		if (aClass103_2516.method1338()) {
			int var7 = aClass103_2516.anInt1153 * anInt2514 * 1813521545 / (Class14.anInt170 * -1211689641);

			do {
				long var5 = -2370105888621162561L * aLong2533 + (long) var3 * (long) var7;
				if (aLong2538 * 4261544990416356371L - var5 >= 0L) {
					aLong2533 = var5 * -5263993171299311553L;
					break;
				}

				int var4 = (int) (((long) var7 + (aLong2538 * 4261544990416356371L - aLong2533 * -2370105888621162561L) - 1L) / (long) var7);
				aLong2533 += -5263993171299311553L * (long) var7 * (long) var4;
				aClass117_Sub2_Sub3_2539.method1851(var1, var2, var4);
				var2 += var4;
				var3 -= var4;
				method2981(292180231);
			} while (aClass103_2516.method1338());
		}

		aClass117_Sub2_Sub3_2539.method1851(var1, var2, var3);
	}

	void method2997(int var1, int var2, int var3) {
		anIntArray2529[var1] = var2;
		anIntArray2530[var1] = (int) (2097152.0D * Math.pow(2.0D, (double) var2 * 5.4931640625E-4D) + 0.5D);
	}

	int method2998(Class117_Sub21 var1, int var2) {
		int var3 = var1.anInt2121 * 272441199 + (var1.anInt2116 * 1042195271 * var1.anInt2117 * -1035803067 >> 12);
		var3 += (anIntArray2521[var1.anInt2130 * -418354143] - 8192) * anIntArray2527[var1.anInt2130 * -418354143] >> 12;
		Class112 var4 = var1.aClass112_2125;
		int var6;
		if (var4.anInt1493 * -1349353809 > 0 && (var4.anInt1489 * 592695227 > 0 || anIntArray2512[var1.anInt2130 * -418354143] > 0)) {
			var6 = var4.anInt1489 * 592695227 << 2;
			int var5 = var4.anInt1490 * 1676047813 << 1;
			if (var1.anInt2123 * 2029989897 < var5) {
				var6 = var6 * var1.anInt2123 * 2029989897 / var5;
			}

			var6 += anIntArray2512[var1.anInt2130 * -418354143] >> 7;
			double var7 = Math.sin((double) (var1.anInt2124 * -1687011579 & 511) * 0.01227184630308513D);
			var3 += (int) (var7 * (double) var6);
		}

		var6 = (int) ((double) (var1.aClass117_Sub4_Sub1_2109.anInt2425 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) (Class14.anInt170 * -1211689641) + 0.5D);
		return var6 < 1 ? 1 : var6;
	}

	void method2999(byte var1) {
		method3002(-1, -1577043523);
		method2992(-1, -1003112515);

		int var2;
		for (var2 = 0; var2 < 16; var2++) {
			anIntArray2519[var2] = anIntArray2535[var2];
		}

		for (var2 = 0; var2 < 16; var2++) {
			anIntArray2520[var2] = anIntArray2535[var2] & -128;
		}

	}

	protected synchronized Class117_Sub2 method1859() {
		return aClass117_Sub2_Sub3_2539;
	}

	protected synchronized int method1869() {
		return 0;
	}

	void method3002(int var1, int var2) {
		for (Class117_Sub21 var3 = (Class117_Sub21) aClass117_Sub2_Sub3_2539.aClass120_2505.method1577(); var3 != null; var3 = (Class117_Sub21) aClass117_Sub2_Sub3_2539.aClass120_2505.method1582()) {
			if (var1 < 0 || var3.anInt2130 * -418354143 == var1) {
				if (var3.aClass117_Sub2_Sub2_2113 != null) {
					var3.aClass117_Sub2_Sub2_2113.method2782(Class14.anInt170 * -1211689641 / 100);
					if (var3.aClass117_Sub2_Sub2_2113.method2721()) {
						aClass117_Sub2_Sub3_2539.aClass117_Sub2_Sub1_2510.method2678(var3.aClass117_Sub2_Sub2_2113);
					}

					var3.method2334(324004548);
				}

				if (var3.anInt2118 * -1281961041 < 0) {
					aClass117_Sub21ArrayArray2522[var3.anInt2130 * -418354143][var3.anInt2112 * 1972048083] = null;
				}

				var3.method1532();
			}
		}

	}

	protected synchronized void method1852(int var1) {
		if (aClass103_2516.method1338()) {
			int var5 = aClass103_2516.anInt1153 * anInt2514 * 1813521545 / (Class14.anInt170 * -1211689641);

			do {
				long var3 = (long) var1 * (long) var5 + -2370105888621162561L * aLong2533;
				if (aLong2538 * 4261544990416356371L - var3 >= 0L) {
					aLong2533 = var3 * -5263993171299311553L;
					break;
				}

				int var2 = (int) ((4261544990416356371L * aLong2538 - -2370105888621162561L * aLong2533 + (long) var5 - 1L) / (long) var5);
				aLong2533 += -5263993171299311553L * (long) var5 * (long) var2;
				aClass117_Sub2_Sub3_2539.method1852(var2);
				var1 -= var2;
				method2981(-1358665716);
			} while (aClass103_2516.method1338());
		}

		aClass117_Sub2_Sub3_2539.method1852(var1);
	}

	boolean method3004(Class117_Sub21 var1, int var2) {
		if (var1.aClass117_Sub2_Sub2_2113 != null) {
			return false;
		} else {
			if (var1.anInt2118 * -1281961041 >= 0) {
				var1.method1532();
				if (var1.anInt2111 * 731595393 > 0 && var1 == aClass117_Sub21ArrayArray2532[var1.anInt2130 * -418354143][var1.anInt2111 * 731595393]) {
					aClass117_Sub21ArrayArray2532[var1.anInt2130 * -418354143][var1.anInt2111 * 731595393] = null;
				}
			}

			return true;
		}
	}

	boolean method3005(Class117_Sub21 var1, int[] var2, int var3, int var4, byte var5) {
		var1.anInt2126 = Class14.anInt170 * -1211689641 / 100 * 114552119;
		if (var1.anInt2118 * -1281961041 < 0 || var1.aClass117_Sub2_Sub2_2113 != null && !var1.aClass117_Sub2_Sub2_2113.method2813()) {
			int var7 = var1.anInt2117 * -1035803067;
			if (var7 > 0) {
				var7 -= (int) (16.0D * Math.pow(2.0D, (double) anIntArray2525[var1.anInt2130 * -418354143] * 4.921259842519685E-4D) + 0.5D);
				if (var7 < 0) {
					var7 = 0;
				}

				var1.anInt2117 = var7 * -723305331;
			}

			var1.aClass117_Sub2_Sub2_2113.method2703(method2998(var1, -1906342254));
			Class112 var6 = var1.aClass112_2125;
			boolean var8 = false;
			var1.anInt2123 += 1811111481;
			var1.anInt2124 += var6.anInt1493 * 1482698019;
			double var9 = (double) ((var1.anInt2112 * 1972048083 - 60 << 8) + (var1.anInt2117 * -1035803067 * var1.anInt2116 * 1042195271 >> 12)) * 5.086263020833333E-6D;
			if (var6.anInt1483 * 584742113 > 0) {
				if (var6.anInt1488 * -775462799 > 0) {
					var1.anInt2107 += (int) (128.0D * Math.pow(2.0D, (double) (var6.anInt1488 * -775462799) * var9) + 0.5D) * 1512996593;
				} else {
					var1.anInt2107 += 390035584;
				}
			}

			if (var6.aByteArray1492 != null) {
				if (var6.anInt1486 * 1515082251 > 0) {
					var1.anInt2119 += (int) (128.0D * Math.pow(2.0D, var9 * (double) (var6.anInt1486 * 1515082251)) + 0.5D) * -1424932337;
				} else {
					var1.anInt2119 -= 2002712704;
				}

				while (var1.anInt2120 * -1056377605 < var6.aByteArray1492.length - 2 && var1.anInt2119 * -307532561 > (var6.aByteArray1492[2 + var1.anInt2120 * -1056377605] & 255) << 8) {
					var1.anInt2120 += 1947593830;
				}

				if (var6.aByteArray1492.length - 2 == var1.anInt2120 * -1056377605 && var6.aByteArray1492[1 + var1.anInt2120 * -1056377605] == 0) {
					var8 = true;
				}
			}

			if (var1.anInt2118 * -1281961041 >= 0 && var6.aByteArray1491 != null && (anIntArray2518[var1.anInt2130 * -418354143] & 1) == 0 && (var1.anInt2111 * 731595393 < 0 || aClass117_Sub21ArrayArray2532[var1.anInt2130 * -418354143][var1.anInt2111 * 731595393] != var1)) {
				if (var6.anInt1487 * -1726620383 <= 0) {
					var1.anInt2118 += 1949411200;
				} else {
					var1.anInt2118 += (int) (128.0D * Math.pow(2.0D, var9 * (double) (var6.anInt1487 * -1726620383)) + 0.5D) * -1226284209;
				}

				while (var1.anInt2122 * -878466465 < var6.aByteArray1491.length - 2 && var1.anInt2118 * -1281961041 > (var6.aByteArray1491[2 + var1.anInt2122 * -878466465] & 255) << 8) {
					var1.anInt2122 += 583426878;
				}

				if (var6.aByteArray1491.length - 2 == var1.anInt2122 * -878466465) {
					var8 = true;
				}
			}

			if (var8) {
				var1.aClass117_Sub2_Sub2_2113.method2782(var1.anInt2126 * -1167763321);
				if (var2 != null) {
					var1.aClass117_Sub2_Sub2_2113.method1851(var2, var3, var4);
				} else {
					var1.aClass117_Sub2_Sub2_2113.method1852(var4);
				}

				if (var1.aClass117_Sub2_Sub2_2113.method2721()) {
					aClass117_Sub2_Sub3_2539.aClass117_Sub2_Sub1_2510.method2678(var1.aClass117_Sub2_Sub2_2113);
				}

				var1.method2334(1336158515);
				if (var1.anInt2118 * -1281961041 >= 0) {
					var1.method1532();
					if (var1.anInt2111 * 731595393 > 0 && aClass117_Sub21ArrayArray2532[var1.anInt2130 * -418354143][var1.anInt2111 * 731595393] == var1) {
						aClass117_Sub21ArrayArray2532[var1.anInt2130 * -418354143][var1.anInt2111 * 731595393] = null;
					}
				}

				return true;
			} else {
				var1.aClass117_Sub2_Sub2_2113.method2802(var1.anInt2126 * -1167763321, method3012(var1, (byte) 85), method2982(var1, -560285334));
				return false;
			}
		} else {
			var1.method2334(-1265603719);
			var1.method1532();
			if (var1.anInt2111 * 731595393 > 0 && aClass117_Sub21ArrayArray2532[var1.anInt2130 * -418354143][var1.anInt2111 * 731595393] == var1) {
				aClass117_Sub21ArrayArray2532[var1.anInt2130 * -418354143][var1.anInt2111 * 731595393] = null;
			}

			return true;
		}
	}

	void method3011(int var1, int var2, int var3, byte var4) {
		Class117_Sub21 var5 = aClass117_Sub21ArrayArray2522[var1][var2];
		if (var5 != null) {
			aClass117_Sub21ArrayArray2522[var1][var2] = null;
			if ((anIntArray2518[var1] & 2) != 0) {
				for (Class117_Sub21 var6 = (Class117_Sub21) aClass117_Sub2_Sub3_2539.aClass120_2505.method1577(); var6 != null; var6 = (Class117_Sub21) aClass117_Sub2_Sub3_2539.aClass120_2505.method1582()) {
					if (var6.anInt2130 * -418354143 == var5.anInt2130 * -418354143 && var6.anInt2118 * -1281961041 < 0 && var5 != var6) {
						var5.anInt2118 = 0;
						break;
					}
				}
			} else {
				var5.anInt2118 = 0;
			}

		}
	}

	int method3012(Class117_Sub21 var1, byte var2) {
		Class112 var3 = var1.aClass112_2125;
		int var4 = 4096 + anIntArray2534[var1.anInt2130 * -418354143] * anIntArray2517[var1.anInt2130 * -418354143] >> 13;
		var4 = 16384 + var4 * var4 >> 15;
		var4 = 16384 + var1.anInt2115 * -1064452813 * var4 >> 15;
		var4 = anInt2513 * -2000121381 * var4 + 128 >> 8;
		if (var3.anInt1483 * 584742113 > 0) {
			var4 = (int) ((double) var4 * Math.pow(0.5D, (double) (var3.anInt1483 * 584742113) * 1.953125E-5D * (double) (var1.anInt2107 * 84324881)) + 0.5D);
		}

		int var5;
		int var6;
		int var7;
		int var8;
		if (var3.aByteArray1492 != null) {
			var7 = var1.anInt2119 * -307532561;
			var6 = var3.aByteArray1492[1 + var1.anInt2120 * -1056377605];
			if (var1.anInt2120 * -1056377605 < var3.aByteArray1492.length - 2) {
				var5 = (var3.aByteArray1492[var1.anInt2120 * -1056377605] & 255) << 8;
				var8 = (var3.aByteArray1492[var1.anInt2120 * -1056377605 + 2] & 255) << 8;
				var6 += (var7 - var5) * (var3.aByteArray1492[var1.anInt2120 * -1056377605 + 3] - var6) / (var8 - var5);
			}

			var4 = var4 * var6 + 32 >> 6;
		}

		if (var1.anInt2118 * -1281961041 > 0 && var3.aByteArray1491 != null) {
			var7 = var1.anInt2118 * -1281961041;
			var6 = var3.aByteArray1491[var1.anInt2122 * -878466465 + 1];
			if (var1.anInt2122 * -878466465 < var3.aByteArray1491.length - 2) {
				var5 = (var3.aByteArray1491[var1.anInt2122 * -878466465] & 255) << 8;
				var8 = (var3.aByteArray1491[var1.anInt2122 * -878466465 + 2] & 255) << 8;
				var6 += (var3.aByteArray1491[var1.anInt2122 * -878466465 + 3] - var6) * (var7 - var5) / (var8 - var5);
			}

			var4 = 32 + var6 * var4 >> 6;
		}

		return var4;
	}

	public Class117_Sub2_Sub4() {
		method2999((byte) -52);
	}

	void method3023(int var1, int var2) {
		int var3 = var1 & 240;
		int var4;
		int var5;
		int var6;
		if (var3 == 128) {
			var4 = var1 & 15;
			var6 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			method3011(var4, var6, var5, (byte) 40);
		} else if (var3 == 144) {
			var4 = var1 & 15;
			var6 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				method2985(var4, var6, var5, 615099326);
			} else {
				method3011(var4, var6, 64, (byte) -8);
			}

		} else if (var3 == 160) {
			var4 = var1 & 15;
			var6 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			method2988(var4, var6, var5, (byte) -1);
		} else if (var3 == 176) {
			var4 = var1 & 15;
			var6 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var6 == 0) {
				anIntArray2520[var4] = (var5 << 14) + (anIntArray2520[var4] & -2080769);
			}

			if (var6 == 32) {
				anIntArray2520[var4] = (anIntArray2520[var4] & -16257) + (var5 << 7);
			}

			if (var6 == 1) {
				anIntArray2512[var4] = (var5 << 7) + (anIntArray2512[var4] & -16257);
			}

			if (var6 == 33) {
				anIntArray2512[var4] = var5 + (anIntArray2512[var4] & -128);
			}

			if (var6 == 5) {
				anIntArray2525[var4] = (var5 << 7) + (anIntArray2525[var4] & -16257);
			}

			if (var6 == 37) {
				anIntArray2525[var4] = (anIntArray2525[var4] & -128) + var5;
			}

			if (var6 == 7) {
				anIntArray2534[var4] = (var5 << 7) + (anIntArray2534[var4] & -16257);
			}

			if (var6 == 39) {
				anIntArray2534[var4] = var5 + (anIntArray2534[var4] & -128);
			}

			if (var6 == 10) {
				anIntArray2523[var4] = (anIntArray2523[var4] & -16257) + (var5 << 7);
			}

			if (var6 == 42) {
				anIntArray2523[var4] = var5 + (anIntArray2523[var4] & -128);
			}

			if (var6 == 11) {
				anIntArray2517[var4] = (anIntArray2517[var4] & -16257) + (var5 << 7);
			}

			if (var6 == 43) {
				anIntArray2517[var4] = var5 + (anIntArray2517[var4] & -128);
			}

			if (var6 == 64) {
				if (var5 < 64) {
					anIntArray2518[var4] &= -2;
				} else {
					anIntArray2518[var4] |= 1;
				}
			}

			if (var6 == 65) {
				if (var5 >= 64) {
					anIntArray2518[var4] |= 2;
				} else {
					method2994(var4, 361831987);
					anIntArray2518[var4] &= -3;
				}
			}

			if (var6 == 99) {
				anIntArray2526[var4] = (var5 << 7) + (anIntArray2526[var4] & 127);
			}

			if (var6 == 98) {
				anIntArray2526[var4] = (anIntArray2526[var4] & 16256) + var5;
			}

			if (var6 == 101) {
				anIntArray2526[var4] = (var5 << 7) + 16384 + (anIntArray2526[var4] & 127);
			}

			if (var6 == 100) {
				anIntArray2526[var4] = var5 + 16384 + (anIntArray2526[var4] & 16256);
			}

			if (var6 == 120) {
				method3002(var4, -1923826813);
			}

			if (var6 == 121) {
				method2992(var4, -1003112515);
			}

			if (var6 == 123) {
				method2993(var4, -1863985165);
			}

			int var7;
			if (var6 == 6) {
				var7 = anIntArray2526[var4];
				if (var7 == 16384) {
					anIntArray2527[var4] = (anIntArray2527[var4] & -16257) + (var5 << 7);
				}
			}

			if (var6 == 38) {
				var7 = anIntArray2526[var4];
				if (var7 == 16384) {
					anIntArray2527[var4] = var5 + (anIntArray2527[var4] & -128);
				}
			}

			if (var6 == 16) {
				anIntArray2528[var4] = (anIntArray2528[var4] & -16257) + (var5 << 7);
			}

			if (var6 == 48) {
				anIntArray2528[var4] = var5 + (anIntArray2528[var4] & -128);
			}

			if (var6 == 81) {
				if (var5 >= 64) {
					anIntArray2518[var4] |= 4;
				} else {
					method2996(var4, (byte) 12);
					anIntArray2518[var4] &= -5;
				}
			}

			if (var6 == 17) {
				method2997(var4, (anIntArray2529[var4] & -16257) + (var5 << 7), 1086349616);
			}

			if (var6 == 49) {
				method2997(var4, var5 + (anIntArray2529[var4] & -128), 504255855);
			}

		} else if (var3 == 192) {
			var4 = var1 & 15;
			var6 = var1 >> 8 & 127;
			method2984(var4, anIntArray2520[var4] + var6, 900847403);
		} else if (var3 == 208) {
			var4 = var1 & 15;
			var6 = var1 >> 8 & 127;
			method2986(var4, var6, -1426411188);
		} else if (var3 == 224) {
			var4 = var1 & 15;
			var6 = (var1 >> 9 & 16256) + (var1 >> 8 & 127);
			method2990(var4, var6, (byte) 9);
		} else {
			var3 = var1 & 255;
			if (var3 == 255) {
				method2999((byte) -30);
			}
		}
	}

	void method3054(Class117_Sub21 var1, boolean var2, int var3) {
		int var4 = var1.aClass117_Sub4_Sub1_2109.aByteArray2423.length;
		int var5;
		if (var2 && var1.aClass117_Sub4_Sub1_2109.aBool2426) {
			int var6 = var4 + var4 - var1.aClass117_Sub4_Sub1_2109.anInt2422;
			var5 = (int) ((long) anIntArray2528[var1.anInt2130 * -418354143] * (long) var6 >> 6);
			var4 <<= 8;
			if (var5 >= var4) {
				var5 = var4 + var4 - 1 - var5;
				var1.aClass117_Sub2_Sub2_2113.method2714(true);
			}
		} else {
			var5 = (int) ((long) var4 * (long) anIntArray2528[var1.anInt2130 * -418354143] >> 6);
		}

		var1.aClass117_Sub2_Sub2_2113.method2752(var5);
	}

	public synchronized void method3069(int var1, int var2, byte var3) {
		method2989(var1, var2, (byte) -1);
	}

}
