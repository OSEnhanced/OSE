package core.Jagex;
public class Class117_Sub22_Sub13 extends Class117_Sub22 {

	public static Class106 aClass106_2347;
	public int anInt2380;
	public static final int anInt2388 = 64;
	public static final int anInt2395 = 85;
	public static final int anInt2397 = 99;
	public String aString2356 = "null";
	int[] anIntArray2359;
	int[] anIntArray2354;
	public int anInt2346 = -1335056461;
	public int anInt2396 = -1189354349;
	public int anInt2355 = -581704746;
	public boolean aBool2364 = true;
	public int anInt2361 = 198782145;
	int anInt2390 = 674634307;
	boolean aBool2352 = false;
	public boolean aBool2368 = false;
	public int anInt2367 = -1415986697;
	public int anInt2370 = -709266704;
	int anInt2363 = 0;
	int anInt2372 = 0;
	short[] aShortArray2369;
	short[] aShortArray2358;
	short[] aShortArray2365;
	short[] aShortArray2360;
	public int anInt2374 = 925326455;
	boolean aBool2362 = false;
	public boolean aBool2377 = true;
	int anInt2366 = -519320960;
	int anInt2379 = 182558336;
	int anInt2392 = 300452224;
	public int anInt2376 = -1719629053;
	int anInt2381 = 0;
	int anInt2382 = 0;
	int anInt2383 = 0;
	public boolean aBool2384 = false;
	boolean aBool2385 = false;
	public int anInt2386 = 1773435363;
	int anInt2348 = 871278899;
	public int anInt2357 = 1415406211;
	public int anInt2391 = 0;
	int anInt2389 = 1553785637;
	public int anInt2375 = 0;
	public int anInt2393 = 0;
	public int[] anIntArray2394;
	public int[] anIntArray2387;
	public static boolean aBool2353 = false;
	public static Class115 aClass115_2378 = new Class115(64);
	public static Class115 aClass115_2349 = new Class115(500);
	public static Class115 aClass115_2350 = new Class115(30);
	public static Class115 aClass115_2351 = new Class115(30);
	static Class117_Sub22_Sub18_Sub4[] aClass117_Sub22_Sub18_Sub4Array2371 = new Class117_Sub22_Sub18_Sub4[4];
	public String[] aStringArray2373 = new String[5];

	void method2592(Class117_Sub14 var1, short var2) {
		while (true) {
			int var3 = var1.method2010(-1439707937);
			if (var3 == 0) {
				return;
			}

			method2593(var1, var3, (byte) -23);
		}
	}

	void method2593(Class117_Sub14 var1, int var2, byte var3) {
		int var4;
		int var5;
		if (var2 == 1) {
			var5 = var1.method2010(-1439707937);
			if (var5 > 0) {
				if (anIntArray2354 != null && !aBool2353) {
					var1.anInt1880 += var5 * -1942685261;
				} else {
					anIntArray2359 = new int[var5];
					anIntArray2354 = new int[var5];

					for (var4 = 0; var4 < var5; var4++) {
						anIntArray2354[var4] = var1.method2012(1053511631);
						anIntArray2359[var4] = var1.method2010(-1439707937);
					}
				}
			}
		} else if (var2 == 2) {
			aString2356 = var1.method2018((byte) -5);
		} else if (var2 == 5) {
			var5 = var1.method2010(-1439707937);
			if (var5 > 0) {
				if (anIntArray2354 != null && !aBool2353) {
					var1.anInt1880 += var5 * 136532258;
				} else {
					anIntArray2359 = null;
					anIntArray2354 = new int[var5];

					for (var4 = 0; var4 < var5; var4++) {
						anIntArray2354[var4] = var1.method2012(1053511631);
					}
				}
			}
		} else if (var2 == 14) {
			anInt2346 = var1.method2010(-1439707937) * -1335056461;
		} else if (var2 == 15) {
			anInt2396 = var1.method2010(-1439707937) * -1189354349;
		} else if (var2 == 17) {
			anInt2355 = 0;
			aBool2364 = false;
		} else if (var2 == 18) {
			aBool2364 = false;
		} else if (var2 == 19) {
			anInt2361 = var1.method2010(-1439707937) * -198782145;
		} else if (var2 == 21) {
			anInt2390 = 0;
		} else if (var2 == 22) {
			aBool2352 = true;
		} else if (var2 != 23) {
			if (var2 == 24) {
				anInt2367 = var1.method2012(1053511631) * 1415986697;
				if (anInt2367 * 1533456441 == 65535) {
					anInt2367 = -1415986697;
				}
			} else if (var2 == 27) {
				anInt2355 = 1856631275;
			} else if (var2 == 28) {
				anInt2370 = var1.method2010(-1439707937) * -581200081;
			} else if (var2 == 29) {
				anInt2363 = var1.method1997(-555831712) * -1641463335;
			} else if (var2 == 39) {
				anInt2372 = var1.method1997(368001170) * -1666143791;
			} else if (var2 >= 30 && var2 < 35) {
				aStringArray2373[var2 - 30] = var1.method2018((byte) -69);
				if (aStringArray2373[var2 - 30].equalsIgnoreCase(Class108.aString1392)) {
					aStringArray2373[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				var5 = var1.method2010(-1439707937);
				aShortArray2369 = new short[var5];
				aShortArray2358 = new short[var5];

				for (var4 = 0; var4 < var5; var4++) {
					aShortArray2369[var4] = (short) var1.method2012(1053511631);
					aShortArray2358[var4] = (short) var1.method2012(1053511631);
				}
			} else if (var2 == 41) {
				var5 = var1.method2010(-1439707937);
				aShortArray2365 = new short[var5];
				aShortArray2360 = new short[var5];

				for (var4 = 0; var4 < var5; var4++) {
					aShortArray2365[var4] = (short) var1.method2012(1053511631);
					aShortArray2360[var4] = (short) var1.method2012(1053511631);
				}
			} else if (var2 == 60) {
				anInt2374 = var1.method2012(1053511631) * -925326455;
			} else if (var2 == 62) {
				aBool2362 = true;
			} else if (var2 == 64) {
				aBool2377 = false;
			} else if (var2 == 65) {
				anInt2366 = var1.method2012(1053511631) * -1983768683;
			} else if (var2 == 66) {
				anInt2379 = var1.method2012(1053511631) * -166345923;
			} else if (var2 == 67) {
				anInt2392 = var1.method2012(1053511631) * -98316013;
			} else if (var2 == 68) {
				anInt2376 = var1.method2012(1053511631) * 1719629053;
			} else if (var2 == 69) {
				var1.method2010(-1439707937);
			} else if (var2 == 70) {
				anInt2381 = var1.method2013(1511075930) * 1168551381;
			} else if (var2 == 71) {
				anInt2382 = var1.method2013(1511075930) * -437416991;
			} else if (var2 == 72) {
				anInt2383 = var1.method2013(1511075930) * 1008761687;
			} else if (var2 == 73) {
				aBool2384 = true;
			} else if (var2 == 74) {
				aBool2385 = true;
			} else if (var2 == 75) {
				anInt2386 = var1.method2010(-1439707937) * -1773435363;
			} else if (var2 == 77) {
				anInt2348 = var1.method2012(1053511631) * -871278899;
				if (anInt2348 * 220366341 == 65535) {
					anInt2348 = 871278899;
				}

				anInt2389 = var1.method2012(1053511631) * -1553785637;
				if (anInt2389 * 565673811 == 65535) {
					anInt2389 = 1553785637;
				}

				var5 = var1.method2010(-1439707937);
				anIntArray2387 = new int[var5 + 1];

				for (var4 = 0; var4 <= var5; var4++) {
					anIntArray2387[var4] = var1.method2012(1053511631);
					if (anIntArray2387[var4] == 65535) {
						anIntArray2387[var4] = -1;
					}
				}
			} else if (var2 == 78) {
				anInt2357 = var1.method2012(1053511631) * -1415406211;
				anInt2391 = var1.method2010(-1439707937) * 2062549009;
			} else if (var2 == 79) {
				anInt2375 = var1.method2012(1053511631) * -1164265971;
				anInt2393 = var1.method2012(1053511631) * 15479251;
				anInt2391 = var1.method2010(-1439707937) * 2062549009;
				var5 = var1.method2010(-1439707937);
				anIntArray2394 = new int[var5];

				for (var4 = 0; var4 < var5; var4++) {
					anIntArray2394[var4] = var1.method2012(1053511631);
				}
			} else if (var2 == 81) {
				anInt2390 = var1.method2010(-1439707937) * -907690752;
			}
		} else {
			aBool2368 = true;
		}

	}

	public final boolean method2595(int var1) {
		if (anIntArray2354 == null) {
			return true;
		} else {
			boolean var3 = true;

			for (int var2 = 0; var2 < anIntArray2354.length; var2++) {
				var3 &= aClass106_2347.method1382(anIntArray2354[var2] & 65535, 0, (byte) -6);
			}

			return var3;
		}
	}

	public final Class117_Sub22_Sub18 method2596(int var1, int var2, int[][] var3, int var4, int var5, int var6, int var7) {
		long var9;
		if (anIntArray2359 == null) {
			var9 = (long) (var2 + (anInt2380 * -669809987 << 10));
		} else {
			var9 = (long) ((anInt2380 * -669809987 << 10) + (var1 << 3) + var2);
		}

		Object var11 = (Class117_Sub22_Sub18) aClass115_2350.method1515(var9);
		if (var11 == null) {
			Class117_Sub22_Sub18_Sub4 var8 = method2599(var1, var2, 189574070);
			if (var8 == null) {
				return null;
			}

			if (!aBool2352) {
				var11 = var8.method3183(anInt2363 * 2060922473 + 64, anInt2372 * -636503095 + 768, -50, -10, -50);
			} else {
				var8.aShort2689 = (short) (anInt2363 * 2060922473 + 64);
				var8.aShort2681 = (short) (768 + anInt2372 * -636503095);
				var8.method3188();
				var11 = var8;
			}

			aClass115_2350.method1517((Class117_Sub22) var11, var9);
		}

		if (aBool2352) {
			var11 = ((Class117_Sub22_Sub18_Sub4) var11).method3160();
		}

		if (anInt2390 * 2022735253 >= 0) {
			if (var11 instanceof Class117_Sub22_Sub18_Sub7) {
				var11 = ((Class117_Sub22_Sub18_Sub7) var11).method3363(var3, var4, var5, var6, true, anInt2390 * 2022735253);
			} else if (var11 instanceof Class117_Sub22_Sub18_Sub4) {
				var11 = ((Class117_Sub22_Sub18_Sub4) var11).method3161(var3, var4, var5, var6, true, anInt2390 * 2022735253);
			}
		}

		return (Class117_Sub22_Sub18) var11;
	}

	final Class117_Sub22_Sub18_Sub4 method2599(int var1, int var2, int var3) {
		Class117_Sub22_Sub18_Sub4 var4 = null;
		int var5;
		int var6;
		boolean var7;
		if (anIntArray2359 == null) {
			if (var1 != 10) {
				return null;
			}

			if (anIntArray2354 == null) {
				return null;
			}

			var7 = aBool2362;
			if (var1 == 2 && var2 > 3) {
				var7 = !var7;
			}

			var6 = anIntArray2354.length;

			for (int var8 = 0; var8 < var6; var8++) {
				var5 = anIntArray2354[var8];
				if (var7) {
					var5 += 65536;
				}

				var4 = (Class117_Sub22_Sub18_Sub4) aClass115_2349.method1515((long) var5);
				if (var4 == null) {
					var4 = Class117_Sub22_Sub18_Sub4.method3155(aClass106_2347, var5 & 65535, 0);
					if (var4 == null) {
						return null;
					}

					if (var7) {
						var4.method3170();
					}

					aClass115_2349.method1517(var4, (long) var5);
				}

				if (var6 > 1) {
					aClass117_Sub22_Sub18_Sub4Array2371[var8] = var4;
				}
			}

			if (var6 > 1) {
				var4 = new Class117_Sub22_Sub18_Sub4(aClass117_Sub22_Sub18_Sub4Array2371, var6);
			}
		} else {
			int var9 = -1;

			for (var6 = 0; var6 < anIntArray2359.length; var6++) {
				if (var1 == anIntArray2359[var6]) {
					var9 = var6;
					break;
				}
			}

			if (var9 == -1) {
				return null;
			}

			var6 = anIntArray2354[var9];
			boolean var11 = aBool2362 ^ var2 > 3;
			if (var11) {
				var6 += 65536;
			}

			var4 = (Class117_Sub22_Sub18_Sub4) aClass115_2349.method1515((long) var6);
			if (var4 == null) {
				var4 = Class117_Sub22_Sub18_Sub4.method3155(aClass106_2347, var6 & 65535, 0);
				if (var4 == null) {
					return null;
				}

				if (var11) {
					var4.method3170();
				}

				aClass115_2349.method1517(var4, (long) var6);
			}
		}

		if (anInt2366 * -924812355 == 128 && anInt2379 * -1110266859 == 128 && anInt2392 * -1126915813 == 128) {
			var7 = false;
		} else {
			var7 = true;
		}

		boolean var10;
		if (anInt2381 * -67820675 == 0 && anInt2382 * -524290015 == 0 && anInt2383 * 1038655591 == 0) {
			var10 = false;
		} else {
			var10 = true;
		}

		Class117_Sub22_Sub18_Sub4 var12 = new Class117_Sub22_Sub18_Sub4(var4, var2 == 0 && !var7 && !var10, aShortArray2369 == null, aShortArray2365 == null, true);
		if (var1 == 4 && var2 > 3) {
			var12.method3166(256);
			var12.method3167(45, 0, -45);
		}

		var2 &= 3;
		if (var2 == 1) {
			var12.method3163();
		} else if (var2 == 2) {
			var12.method3196();
		} else if (var2 == 3) {
			var12.method3165();
		}

		if (aShortArray2369 != null) {
			for (var5 = 0; var5 < aShortArray2369.length; var5++) {
				var12.method3168(aShortArray2369[var5], aShortArray2358[var5]);
			}
		}

		if (aShortArray2365 != null) {
			for (var5 = 0; var5 < aShortArray2365.length; var5++) {
				var12.method3220(aShortArray2365[var5], aShortArray2360[var5]);
			}
		}

		if (var7) {
			var12.method3228(anInt2366 * -924812355, anInt2379 * -1110266859, anInt2392 * -1126915813);
		}

		if (var10) {
			var12.method3167(anInt2381 * -67820675, anInt2382 * -524290015, anInt2383 * 1038655591);
		}

		return var12;
	}

	public final Class117_Sub22_Sub13 method2600(int var1) {
		int var2 = -1;
		if (anInt2348 * 220366341 != -1) {
			var2 = Class35.method507(anInt2348 * 220366341, -1093262677);
		} else if (anInt2389 * 565673811 != -1) {
			var2 = Class97.anIntArray1129[anInt2389 * 565673811];
		}

		return var2 >= 0 && var2 < anIntArray2387.length && anIntArray2387[var2] != -1 ? Class63.method928(anIntArray2387[var2], 848634417) : null;
	}

	public final boolean method2601(int var1, int var2) {
		if (anIntArray2359 != null) {
			for (int var5 = 0; var5 < anIntArray2359.length; var5++) {
				if (var1 == anIntArray2359[var5]) {
					return aClass106_2347.method1382(anIntArray2354[var5] & 65535, 0, (byte) 29);
				}
			}

			return true;
		} else if (anIntArray2354 == null) {
			return true;
		} else if (var1 != 10) {
			return true;
		} else {
			boolean var4 = true;

			for (int var3 = 0; var3 < anIntArray2354.length; var3++) {
				var4 &= aClass106_2347.method1382(anIntArray2354[var3] & 65535, 0, (byte) 54);
			}

			return var4;
		}
	}

	void method2612(int var1) {
		if (anInt2361 * 338861247 == -1) {
			anInt2361 = 0;
			if (anIntArray2354 != null && (anIntArray2359 == null || anIntArray2359[0] == 10)) {
				anInt2361 = -198782145;
			}

			for (int var2 = 0; var2 < 5; var2++) {
				if (aStringArray2373[var2] != null) {
					anInt2361 = -198782145;
				}
			}
		}

		if (anInt2386 * -23237579 == -1) {
			anInt2386 = -1773435363 * (anInt2355 * 1067298499 != 0 ? 1 : 0);
		}

	}

	public final Class117_Sub22_Sub18_Sub7 method2618(int var1, int var2, int[][] var3, int var4, int var5, int var6, int var7) {
		long var8;
		if (anIntArray2359 == null) {
			var8 = (long) (var2 + (anInt2380 * -669809987 << 10));
		} else {
			var8 = (long) (var2 + (var1 << 3) + (anInt2380 * -669809987 << 10));
		}

		Class117_Sub22_Sub18_Sub7 var10 = (Class117_Sub22_Sub18_Sub7) aClass115_2351.method1515(var8);
		if (var10 == null) {
			Class117_Sub22_Sub18_Sub4 var11 = method2599(var1, var2, -1701531266);
			if (var11 == null) {
				return null;
			}

			var10 = var11.method3183(64 + anInt2363 * 2060922473, anInt2372 * -636503095 + 768, -50, -10, -50);
			aClass115_2351.method1517(var10, var8);
		}

		if (anInt2390 * 2022735253 >= 0) {
			var10 = var10.method3363(var3, var4, var5, var6, true, anInt2390 * 2022735253);
		}

		return var10;
	}

	public boolean method2623(int var1) {
		if (anIntArray2387 == null) {
			return anInt2357 * 1112310741 != -1 || anIntArray2394 != null;
		} else {
			for (int var2 = 0; var2 < anIntArray2387.length; var2++) {
				if (anIntArray2387[var2] != -1) {
					Class117_Sub22_Sub13 var3 = Class63.method928(anIntArray2387[var2], 1364548082);
					if (var3.anInt2357 * 1112310741 != -1 || var3.anIntArray2394 != null) {
						return true;
					}
				}
			}

			return false;
		}
	}

	public final Class117_Sub22_Sub18_Sub7 method2626(int var1, int var2, int[][] var3, int var4, int var5, int var6, Class117_Sub22_Sub14 var7, int var8, int var9) {
		long var11;
		if (anIntArray2359 == null) {
			var11 = (long) ((anInt2380 * -669809987 << 10) + var2);
		} else {
			var11 = (long) (var2 + (var1 << 3) + (anInt2380 * -669809987 << 10));
		}

		Class117_Sub22_Sub18_Sub7 var13 = (Class117_Sub22_Sub18_Sub7) aClass115_2351.method1515(var11);
		if (var13 == null) {
			Class117_Sub22_Sub18_Sub4 var10 = method2599(var1, var2, 49044629);
			if (var10 == null) {
				return null;
			}

			var13 = var10.method3183(64 + anInt2363 * 2060922473, anInt2372 * -636503095 + 768, -50, -10, -50);
			aClass115_2351.method1517(var13, var11);
		}

		if (var7 == null && anInt2390 * 2022735253 == -1) {
			return var13;
		} else {
			if (var7 != null) {
				var13 = var7.method2637(var13, var8, var2, (byte) 1);
			} else {
				var13 = var13.method3406(true);
			}

			if (anInt2390 * 2022735253 >= 0) {
				var13 = var13.method3363(var3, var4, var5, var6, false, anInt2390 * 2022735253);
			}

			return var13;
		}
	}

	static void method2630(int var0) {
		for (Class117_Sub6 var1 = (Class117_Sub6) Class117_Sub6.aClass120_1769.method1577(); var1 != null; var1 = (Class117_Sub6) Class117_Sub6.aClass120_1769.method1582()) {
			if (var1.aClass117_Sub2_Sub2_1767 != null) {
				Class117_Sub13.aClass117_Sub2_Sub1_1871.method2679(var1.aClass117_Sub2_Sub2_1767);
				var1.aClass117_Sub2_Sub2_1767 = null;
			}

			if (var1.aClass117_Sub2_Sub2_1764 != null) {
				Class117_Sub13.aClass117_Sub2_Sub1_1871.method2679(var1.aClass117_Sub2_Sub2_1764);
				var1.aClass117_Sub2_Sub2_1764 = null;
			}
		}

		Class117_Sub6.aClass120_1769.method1574();
	}

	static void method2631(int var0, byte var1) {
		Class43.method726(-1798393114);

		for (Class117_Sub6 var3 = (Class117_Sub6) Class117_Sub6.aClass120_1769.method1577(); var3 != null; var3 = (Class117_Sub6) Class117_Sub6.aClass120_1769.method1582()) {
			if (var3.aClass117_Sub22_Sub13_1768 != null) {
				var3.method1938(-1736982935);
			}
		}

		int var5 = Class117_Sub22_Sub4.method2386(var0, 1493434311).anInt2449 * 1253724907;
		if (var5 != 0) {
			int var4 = Class97.anIntArray1129[var0];
			if (var5 == 1) {
				if (var4 == 1) {
					Class117_Sub22_Sub17_Sub1.method3098(0.9D);
					((Class37) Class117_Sub22_Sub17_Sub1.anInterface2_2650).method509(0.9D);
				}

				if (var4 == 2) {
					Class117_Sub22_Sub17_Sub1.method3098(0.8D);
					((Class37) Class117_Sub22_Sub17_Sub1.anInterface2_2650).method509(0.8D);
				}

				if (var4 == 3) {
					Class117_Sub22_Sub17_Sub1.method3098(0.7D);
					((Class37) Class117_Sub22_Sub17_Sub1.anInterface2_2650).method509(0.7D);
				}

				if (var4 == 4) {
					Class117_Sub22_Sub17_Sub1.method3098(0.6D);
					((Class37) Class117_Sub22_Sub17_Sub1.anInterface2_2650).method509(0.6D);
				}

				Class117_Sub22_Sub6.aClass115_2225.method1518();
			}

			if (var5 == 3) {
				short var2 = 0;
				if (var4 == 0) {
					var2 = 255;
				}

				if (var4 == 1) {
					var2 = 192;
				}

				if (var4 == 2) {
					var2 = 128;
				}

				if (var4 == 3) {
					var2 = 64;
				}

				if (var4 == 4) {
					var2 = 0;
				}

				if (GameClient.anInt3156 * 206554627 != var2) {
					if (GameClient.anInt3156 * 206554627 == 0 && GameClient.anInt3021 * 1034748741 != -1) {
						Class93.method1236(Class57.aClass106_Sub1_749, GameClient.anInt3021 * 1034748741, 0, var2, false, -839299798);
						GameClient.aBool3158 = false;
					} else if (var2 == 0) {
						Class121.aClass117_Sub2_Sub4_1514.method2980((byte) 60);
						Class121.anInt1515 = -793599395;
						Class54_Sub1.aClass106_1728 = null;
						GameClient.aBool3158 = false;
					} else {
						Class35.method494(var2, 1045801601);
					}

					GameClient.anInt3156 = var2 * -1530948437;
				}
			}

			if (var5 == 4) {
				if (var4 == 0) {
					GameClient.anInt3047 = -905714169;
				}

				if (var4 == 1) {
					GameClient.anInt3047 = -1631556256;
				}

				if (var4 == 2) {
					GameClient.anInt3047 = 1775607360;
				}

				if (var4 == 3) {
					GameClient.anInt3047 = 887803680;
				}

				if (var4 == 4) {
					GameClient.anInt3047 = 0;
				}
			}

			if (var5 == 5) {
				GameClient.anInt3149 = var4 * -1606006663;
			}

			if (var5 == 6) {
				GameClient.anInt3081 = var4 * -957815953;
			}

			if (var5 == 9) {
				GameClient.anInt3082 = var4 * 1043851545;
			}

			if (var5 == 10) {
				if (var4 == 0) {
					GameClient.anInt2948 = -132556803;
				}

				if (var4 == 1) {
					GameClient.anInt2948 = 440897824;
				}

				if (var4 == 2) {
					GameClient.anInt2948 = 1725587648;
				}

				if (var4 == 3) {
					GameClient.anInt2948 = -1284689824;
				}

				if (var4 == 4) {
					GameClient.anInt2948 = 0;
				}
			}

			if (var5 == 17) {
				GameClient.anInt2983 = (var4 & 65535) * -875598665;
			}

			if (var5 == 18) {
				Class36[] var6 = new Class36[]{Class36.aClass36_446, Class36.aClass36_448, Class36.aClass36_451};
				GameClient.aClass36_3077 = (Class36) Class117_Sub10.method1970(var6, var4, 1606676135);
				if (GameClient.aClass36_3077 == null) {
					GameClient.aClass36_3077 = Class36.aClass36_451;
				}
			}

			if (var5 == 19) {
				if (var4 == -1) {
					GameClient.anInt3084 = 1428519581;
				} else {
					GameClient.anInt3084 = (var4 & 2047) * -1428519581;
				}
			}

		}
	}

}
