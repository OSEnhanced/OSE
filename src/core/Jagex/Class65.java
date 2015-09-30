package core.Jagex;
public class Class65 {

	static final int anInt782 = 128;
	static final int anInt784 = 128;
	static int anInt785;
	public static final int anInt786 = 55;
	public static final int anInt789 = 90;
	static final int anInt790 = 262144;
	static int[][] anIntArrayArray787 = new int[128][128];
	static int[][] anIntArrayArray781 = new int[128][128];
	static int[] anIntArray783 = new int[4096];
	static int[] anIntArray788 = new int[4096];

	public static Class90[] method941(int var0) {
		return new Class90[]{Class90.aClass90_1062, Class90.aClass90_1065, Class90.aClass90_1072, Class90.aClass90_1064, Class90.aClass90_1066};
	}

	Class65() throws Throwable {
		throw new Error();
	}

	static void method946(Class117_Sub22_Sub18_Sub1 var0, int var1, int var2) {
		Class82.method1118(var0.anInt2577 * 1961555871, var0.anInt2567 * -184603173, var1, -1442285956);
	}

	protected static void method947(int var0) {
		Class117_Sub22_Sub15.anImage2451 = null;
		Class117_Sub22_Sub18_Sub6.aFont2755 = null;
		Class31.aFontMetrics400 = null;
	}

	public static boolean method948(CharSequence var0, int var1) {
		boolean var2 = false;
		boolean var8 = false;
		int var4 = 0;
		int var3 = var0.length();
		int var5 = 0;

		boolean var9;
		while (true) {
			if (var5 >= var3) {
				var9 = var8;
				break;
			}

			label83:
			{
				char var7 = var0.charAt(var5);
				if (var5 == 0) {
					if (var7 == 45) {
						var2 = true;
						break label83;
					}

					if (var7 == 43) {
						break label83;
					}
				}

				int var10;
				if (var7 >= 48 && var7 <= 57) {
					var10 = var7 - 48;
				} else if (var7 >= 65 && var7 <= 90) {
					var10 = var7 - 55;
				} else {
					if (var7 < 97 || var7 > 122) {
						var9 = false;
						break;
					}

					var10 = var7 - 87;
				}

				if (var10 >= 10) {
					var9 = false;
					break;
				}

				if (var2) {
					var10 = -var10;
				}

				int var6 = var4 * 10 + var10;
				if (var4 != var6 / 10) {
					var9 = false;
					break;
				}

				var4 = var6;
				var8 = true;
			}

			++var5;
		}

		return var9;
	}

	static void method949(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (GameClient.aBool2921 && var0 != Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421) {
				return;
			}

			int var10 = 0;
			boolean var15 = true;
			boolean var12 = false;
			boolean var19 = false;
			if (var1 == 0) {
				var10 = Class117_Sub13.aClass42_1875.method706(var0, var2, var3);
			}

			if (var1 == 1) {
				var10 = Class117_Sub13.aClass42_1875.method623(var0, var2, var3);
			}

			if (var1 == 2) {
				var10 = Class117_Sub13.aClass42_1875.method664(var0, var2, var3);
			}

			if (var1 == 3) {
				var10 = Class117_Sub13.aClass42_1875.method568(var0, var2, var3);
			}

			int var18;
			if (var10 != 0) {
				var18 = Class117_Sub13.aClass42_1875.method569(var0, var2, var3, var10);
				int var36 = var10 >> 14 & 32767;
				int var33 = var18 & 31;
				int var37 = var18 >> 6 & 3;
				Class117_Sub22_Sub13 var13;
				if (var1 == 0) {
					Class117_Sub13.aClass42_1875.method556(var0, var2, var3);
					var13 = Class63.method928(var36, -1572060918);
					if (var13.anInt2355 * 1067298499 != 0) {
						GameClient.aClass51Array3174[var0].method782(var2, var3, var33, var37, var13.aBool2364, 561453169);
					}
				}

				if (var1 == 1) {
					Class117_Sub13.aClass42_1875.method619(var0, var2, var3);
				}

				if (var1 == 2) {
					Class117_Sub13.aClass42_1875.method633(var0, var2, var3);
					var13 = Class63.method928(var36, 2114886721);
					if (var13.anInt2346 * -1473224837 + var2 > 103 || var13.anInt2346 * -1473224837 + var3 > 103 || var2 + var13.anInt2396 * 817158555 > 103 || var13.anInt2396 * 817158555 + var3 > 103) {
						return;
					}

					if (var13.anInt2355 * 1067298499 != 0) {
						GameClient.aClass51Array3174[var0].method783(var2, var3, var13.anInt2346 * -1473224837, var13.anInt2396 * 817158555, var37, var13.aBool2364, (byte) 1);
					}
				}

				if (var1 == 3) {
					Class117_Sub13.aClass42_1875.method559(var0, var2, var3);
					var13 = Class63.method928(var36, 2091132862);
					if (var13.anInt2355 * 1067298499 == 1) {
						GameClient.aClass51Array3174[var0].method785(var2, var3, 1313693260);
					}
				}
			}

			if (var4 >= 0) {
				var18 = var0;
				if (var0 < 3 && (Class31.aByteArrayArrayArray401[1][var2][var3] & 2) == 2) {
					var18 = var0 + 1;
				}

				Class42 var34 = Class117_Sub13.aClass42_1875;
				Class51 var16 = GameClient.aClass51Array3174[var0];
				Class117_Sub22_Sub13 var11 = Class63.method928(var4, -287054773);
				int var8;
				int var26;
				if (var5 != 1 && var5 != 3) {
					var8 = var11.anInt2346 * -1473224837;
					var26 = var11.anInt2396 * 817158555;
				} else {
					var8 = var11.anInt2396 * 817158555;
					var26 = var11.anInt2346 * -1473224837;
				}

				int var9;
				int var29;
				if (var8 + var2 <= 104) {
					var9 = var2 + (var8 >> 1);
					var29 = (1 + var8 >> 1) + var2;
				} else {
					var9 = var2;
					var29 = 1 + var2;
				}

				int var31;
				int var32;
				if (var3 + var26 <= 104) {
					var32 = (var26 >> 1) + var3;
					var31 = (var26 + 1 >> 1) + var3;
				} else {
					var32 = var3;
					var31 = var3 + 1;
				}

				int[][] var20 = Class31.anIntArrayArrayArray381[var18];
				int var21 = var20[var9][var32] + var20[var29][var32] + var20[var9][var31] + var20[var29][var31] >> 2;
				int var17 = (var2 << 7) + (var8 << 6);
				int var22 = (var26 << 6) + (var3 << 7);
				int var27 = 1073741824 + (var3 << 7) + var2 + (var4 << 14);
				if (var11.anInt2361 * 338861247 == 0) {
					var27 += Integer.MIN_VALUE;
				}

				int var28 = var6 + (var5 << 6);
				if (var11.anInt2386 * -23237579 == 1) {
					var28 += 256;
				}

				Object var23;
				if (var6 == 22) {
					if (var11.anInt2367 * 1533456441 == -1 && var11.anIntArray2387 == null) {
						var23 = var11.method2618(22, var5, var20, var17, var21, var22, 1983361443);
					} else {
						var23 = new Class117_Sub22_Sub18_Sub6(var4, 22, var5, var18, var2, var3, var11.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
					}

					var34.method589(var0, var2, var3, var21, (Class117_Sub22_Sub18) var23, var27, var28);
					if (var11.anInt2355 * 1067298499 == 1) {
						var16.method780(var2, var3, -1992185922);
					}
				} else if (var6 != 10 && var6 != 11) {
					if (var6 >= 12) {
						if (var11.anInt2367 * 1533456441 == -1 && var11.anIntArray2387 == null) {
							var23 = var11.method2618(var6, var5, var20, var17, var21, var22, 1791609485);
						} else {
							var23 = new Class117_Sub22_Sub18_Sub6(var4, var6, var5, var18, var2, var3, var11.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
						}

						var34.method549(var0, var2, var3, var21, 1, 1, (Class117_Sub22_Sub18) var23, 0, var27, var28);
						if (var11.anInt2355 * 1067298499 != 0) {
							var16.method778(var2, var3, var8, var26, var11.aBool2364, 1010110971);
						}
					} else if (var6 == 0) {
						if (var11.anInt2367 * 1533456441 == -1 && var11.anIntArray2387 == null) {
							var23 = var11.method2618(0, var5, var20, var17, var21, var22, 1691780772);
						} else {
							var23 = new Class117_Sub22_Sub18_Sub6(var4, 0, var5, var18, var2, var3, var11.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
						}

						var34.method547(var0, var2, var3, var21, (Class117_Sub22_Sub18) var23, (Class117_Sub22_Sub18) null, Class31.anIntArray389[var5], 0, var27, var28);
						if (var11.anInt2355 * 1067298499 != 0) {
							var16.method777(var2, var3, var6, var5, var11.aBool2364, (byte) 22);
						}
					} else if (var6 == 1) {
						if (var11.anInt2367 * 1533456441 == -1 && var11.anIntArray2387 == null) {
							var23 = var11.method2618(1, var5, var20, var17, var21, var22, 1419089875);
						} else {
							var23 = new Class117_Sub22_Sub18_Sub6(var4, 1, var5, var18, var2, var3, var11.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
						}

						var34.method547(var0, var2, var3, var21, (Class117_Sub22_Sub18) var23, (Class117_Sub22_Sub18) null, Class31.anIntArray390[var5], 0, var27, var28);
						if (var11.anInt2355 * 1067298499 != 0) {
							var16.method777(var2, var3, var6, var5, var11.aBool2364, (byte) 18);
						}
					} else {
						Object var30;
						int var38;
						if (var6 == 2) {
							var38 = 1 + var5 & 3;
							Object var14;
							if (var11.anInt2367 * 1533456441 == -1 && var11.anIntArray2387 == null) {
								var14 = var11.method2618(2, var5 + 4, var20, var17, var21, var22, 2067068182);
								var30 = var11.method2618(2, var38, var20, var17, var21, var22, 2136485797);
							} else {
								var14 = new Class117_Sub22_Sub18_Sub6(var4, 2, 4 + var5, var18, var2, var3, var11.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
								var30 = new Class117_Sub22_Sub18_Sub6(var4, 2, var38, var18, var2, var3, var11.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
							}

							var34.method547(var0, var2, var3, var21, (Class117_Sub22_Sub18) var14, (Class117_Sub22_Sub18) var30, Class31.anIntArray389[var5], Class31.anIntArray389[var38], var27, var28);
							if (var11.anInt2355 * 1067298499 != 0) {
								var16.method777(var2, var3, var6, var5, var11.aBool2364, (byte) 29);
							}
						} else if (var6 == 3) {
							if (var11.anInt2367 * 1533456441 == -1 && var11.anIntArray2387 == null) {
								var23 = var11.method2618(3, var5, var20, var17, var21, var22, 1125764904);
							} else {
								var23 = new Class117_Sub22_Sub18_Sub6(var4, 3, var5, var18, var2, var3, var11.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
							}

							var34.method547(var0, var2, var3, var21, (Class117_Sub22_Sub18) var23, (Class117_Sub22_Sub18) null, Class31.anIntArray390[var5], 0, var27, var28);
							if (var11.anInt2355 * 1067298499 != 0) {
								var16.method777(var2, var3, var6, var5, var11.aBool2364, (byte) 125);
							}
						} else if (var6 == 9) {
							if (var11.anInt2367 * 1533456441 == -1 && var11.anIntArray2387 == null) {
								var23 = var11.method2618(var6, var5, var20, var17, var21, var22, 1873125965);
							} else {
								var23 = new Class117_Sub22_Sub18_Sub6(var4, var6, var5, var18, var2, var3, var11.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
							}

							var34.method549(var0, var2, var3, var21, 1, 1, (Class117_Sub22_Sub18) var23, 0, var27, var28);
							if (var11.anInt2355 * 1067298499 != 0) {
								var16.method778(var2, var3, var8, var26, var11.aBool2364, 1010110971);
							}
						} else if (var6 == 4) {
							if (var11.anInt2367 * 1533456441 == -1 && var11.anIntArray2387 == null) {
								var23 = var11.method2618(4, var5, var20, var17, var21, var22, 943101666);
							} else {
								var23 = new Class117_Sub22_Sub18_Sub6(var4, 4, var5, var18, var2, var3, var11.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
							}

							var34.method659(var0, var2, var3, var21, (Class117_Sub22_Sub18) var23, (Class117_Sub22_Sub18) null, Class31.anIntArray389[var5], 0, 0, 0, var27, var28);
						} else {
							int var35;
							if (var6 == 5) {
								var38 = 16;
								var35 = var34.method706(var0, var2, var3);
								if (var35 != 0) {
									var38 = Class63.method928(var35 >> 14 & 32767, -2101354595).anInt2370 * -1225060401;
								}

								if (var11.anInt2367 * 1533456441 == -1 && var11.anIntArray2387 == null) {
									var30 = var11.method2618(4, var5, var20, var17, var21, var22, 923647242);
								} else {
									var30 = new Class117_Sub22_Sub18_Sub6(var4, 4, var5, var18, var2, var3, var11.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
								}

								var34.method659(var0, var2, var3, var21, (Class117_Sub22_Sub18) var30, (Class117_Sub22_Sub18) null, Class31.anIntArray389[var5], 0, Class31.anIntArray391[var5] * var38, var38 * Class31.anIntArray392[var5], var27, var28);
							} else if (var6 == 6) {
								var38 = 8;
								var35 = var34.method706(var0, var2, var3);
								if (var35 != 0) {
									var38 = Class63.method928(var35 >> 14 & 32767, 1411483089).anInt2370 * -1225060401 / 2;
								}

								if (var11.anInt2367 * 1533456441 == -1 && var11.anIntArray2387 == null) {
									var30 = var11.method2618(4, 4 + var5, var20, var17, var21, var22, 1216622149);
								} else {
									var30 = new Class117_Sub22_Sub18_Sub6(var4, 4, 4 + var5, var18, var2, var3, var11.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
								}

								var34.method659(var0, var2, var3, var21, (Class117_Sub22_Sub18) var30, (Class117_Sub22_Sub18) null, 256, var5, var38 * Class31.anIntArray384[var5], Class31.anIntArray394[var5] * var38, var27, var28);
							} else if (var6 == 7) {
								var35 = var5 + 2 & 3;
								if (var11.anInt2367 * 1533456441 == -1 && var11.anIntArray2387 == null) {
									var23 = var11.method2618(4, var35 + 4, var20, var17, var21, var22, 1485298198);
								} else {
									var23 = new Class117_Sub22_Sub18_Sub6(var4, 4, var35 + 4, var18, var2, var3, var11.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
								}

								var34.method659(var0, var2, var3, var21, (Class117_Sub22_Sub18) var23, (Class117_Sub22_Sub18) null, 256, var35, 0, 0, var27, var28);
							} else if (var6 == 8) {
								var38 = 8;
								var35 = var34.method706(var0, var2, var3);
								if (var35 != 0) {
									var38 = Class63.method928(var35 >> 14 & 32767, 1554388003).anInt2370 * -1225060401 / 2;
								}

								int var24 = var5 + 2 & 3;
								Object var25;
								if (var11.anInt2367 * 1533456441 == -1 && var11.anIntArray2387 == null) {
									var30 = var11.method2618(4, var5 + 4, var20, var17, var21, var22, 1198479811);
									var25 = var11.method2618(4, 4 + var24, var20, var17, var21, var22, 1885381126);
								} else {
									var30 = new Class117_Sub22_Sub18_Sub6(var4, 4, 4 + var5, var18, var2, var3, var11.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
									var25 = new Class117_Sub22_Sub18_Sub6(var4, 4, 4 + var24, var18, var2, var3, var11.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
								}

								var34.method659(var0, var2, var3, var21, (Class117_Sub22_Sub18) var30, (Class117_Sub22_Sub18) var25, 256, var5, var38 * Class31.anIntArray384[var5], var38 * Class31.anIntArray394[var5], var27, var28);
							}
						}
					}
				} else {
					if (var11.anInt2367 * 1533456441 == -1 && var11.anIntArray2387 == null) {
						var23 = var11.method2618(10, var5, var20, var17, var21, var22, 2146114894);
					} else {
						var23 = new Class117_Sub22_Sub18_Sub6(var4, 10, var5, var18, var2, var3, var11.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
					}

					if (var23 != null) {
						var34.method549(var0, var2, var3, var21, var8, var26, (Class117_Sub22_Sub18) var23, var6 == 11 ? 256 : 0, var27, var28);
					}

					if (var11.anInt2355 * 1067298499 != 0) {
						var16.method778(var2, var3, var8, var26, var11.aBool2364, 1010110971);
					}
				}
			}
		}

	}

	public static String method950(int var0, int var1) {
		return (var0 >> 24 & 255) + "." + (var0 >> 16 & 255) + "." + (var0 >> 8 & 255) + "." + (var0 & 255);
	}

}
