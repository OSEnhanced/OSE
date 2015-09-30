package core.Jagex;
public class Class42 {

	static final int anInt523 = 25;
	static final int anInt529 = 128;
	static final int anInt530 = 64;
	static final int anInt532 = 50;
	static final int anInt551 = 128;
	static final int anInt573 = 32;
	int anInt526 = 0;
	int anInt525 = 0;
	static boolean aBool550 = false;
	static int anInt556 = 0;
	static int anInt552 = 0;
	static int anInt553 = 0;
	public static int anInt580 = -1;
	public static int anInt555 = -1;
	static int anInt535;
	static int anInt545;
	static int anInt546;
	static int anInt547;
	static int anInt548;
	static boolean[][] aBoolArrayArray574;
	static int anInt542;
	static int anInt543;
	static int anInt544;
	static int anInt540;
	static int anInt541;
	static int anInt576 = 0;
	static int anInt536;
	static int anInt538;
	static int anInt557;
	static int anInt539;
	static int anInt533 = 0;
	public static boolean aBool554 = true;
	static Class23[] aClass23Array578 = new Class23[100];
	static int anInt569 = 4;
	static int[] anIntArray559;
	static Class45[][] aClass45ArrayArray560;
	static int anInt558;
	static Class45[] aClass45Array562;
	static Class120 aClass120_563;
	static int[] anIntArray564;
	static int[] anIntArray565;
	static int[] anIntArray561;
	static int[] anIntArray567;
	static int[] anIntArray568;
	static int[] anIntArray570;
	static int[] anIntArray571;
	static boolean[][][][] aBoolArrayArrayArrayArray572;
	static int anInt521;
	static int anInt577;
	static int anInt579;
	static int anInt566;
	static int anInt575;
	static int anInt519;
	Class23[] aClass23Array527 = new Class23[5000];
	int[][] anIntArrayArray520 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
	int[][] anIntArrayArray549 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
	int anInt531;
	int anInt534;
	int anInt522;
	Class117_Sub5[][][] aClass117_Sub5ArrayArrayArray524;
	int[][][] anIntArrayArrayArray528;
	int[][][] anIntArrayArrayArray537;

	public void method539() {
		int var1;
		int var2;
		for (var1 = 0; var1 < anInt531; var1++) {
			for (var2 = 0; var2 < anInt534; var2++) {
				for (int var3 = 0; var3 < anInt522; var3++) {
					aClass117_Sub5ArrayArrayArray524[var1][var2][var3] = null;
				}
			}
		}

		for (var1 = 0; var1 < anInt569; var1++) {
			for (var2 = 0; var2 < anIntArray559[var1]; var2++) {
				aClass45ArrayArray560[var1][var2] = null;
			}

			anIntArray559[var1] = 0;
		}

		for (var1 = 0; var1 < anInt526; var1++) {
			aClass23Array527[var1] = null;
		}

		anInt526 = 0;

		for (var1 = 0; var1 < aClass23Array578.length; var1++) {
			aClass23Array578[var1] = null;
		}

	}

	public void method540(int var1) {
		anInt525 = var1;

		for (int var3 = 0; var3 < anInt534; var3++) {
			for (int var2 = 0; var2 < anInt522; var2++) {
				if (aClass117_Sub5ArrayArrayArray524[var1][var3][var2] == null) {
					aClass117_Sub5ArrayArrayArray524[var1][var3][var2] = new Class117_Sub5(var1, var3, var2);
				}
			}
		}

	}

	public void method541(int var1, int var2) {
		Class117_Sub5 var3 = aClass117_Sub5ArrayArrayArray524[0][var1][var2];

		for (int var7 = 0; var7 < 3; var7++) {
			Class117_Sub5 var4 = aClass117_Sub5ArrayArrayArray524[var7][var1][var2] = aClass117_Sub5ArrayArrayArray524[var7 + 1][var1][var2];
			if (var4 != null) {
				var4.anInt1736 += 1807869281;

				for (int var5 = 0; var5 < var4.anInt1745 * 713824851; var5++) {
					Class23 var6 = var4.aClass23Array1744[var5];
					if ((var6.anInt289 * -1026555351 >> 29 & 3) == 2 && var6.anInt278 * -289575239 == var1 && var6.anInt272 * -1901202587 == var2) {
						var6.anInt277 += 1040886667;
					}
				}
			}
		}

		if (aClass117_Sub5ArrayArrayArray524[0][var1][var2] == null) {
			aClass117_Sub5ArrayArrayArray524[0][var1][var2] = new Class117_Sub5(0, var1, var2);
		}

		aClass117_Sub5ArrayArrayArray524[0][var1][var2].aClass117_Sub5_1743 = var3;
		aClass117_Sub5ArrayArrayArray524[3][var1][var2] = null;
	}

	public void method544(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
		int var21;
		Class25 var22;
		if (var4 == 0) {
			var22 = new Class25(var11, var12, var13, var14, -1, var19, false);

			for (var21 = var1; var21 >= 0; --var21) {
				if (aClass117_Sub5ArrayArrayArray524[var21][var2][var3] == null) {
					aClass117_Sub5ArrayArrayArray524[var21][var2][var3] = new Class117_Sub5(var21, var2, var3);
				}
			}

			aClass117_Sub5ArrayArrayArray524[var1][var2][var3].aClass25_1741 = var22;
		} else if (var4 != 1) {
			Class50 var23 = new Class50(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

			for (var21 = var1; var21 >= 0; --var21) {
				if (aClass117_Sub5ArrayArrayArray524[var21][var2][var3] == null) {
					aClass117_Sub5ArrayArrayArray524[var21][var2][var3] = new Class117_Sub5(var21, var2, var3);
				}
			}

			aClass117_Sub5ArrayArrayArray524[var1][var2][var3].aClass50_1738 = var23;
		} else {
			var22 = new Class25(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

			for (var21 = var1; var21 >= 0; --var21) {
				if (aClass117_Sub5ArrayArrayArray524[var21][var2][var3] == null) {
					aClass117_Sub5ArrayArrayArray524[var21][var2][var3] = new Class117_Sub5(var21, var2, var3);
				}
			}

			aClass117_Sub5ArrayArrayArray524[var1][var2][var3].aClass25_1741 = var22;
		}
	}

	public void method546(int var1, int var2, int var3, int var4, Class117_Sub22_Sub18 var5, int var6, Class117_Sub22_Sub18 var7, Class117_Sub22_Sub18 var8) {
		Class47 var9 = new Class47();
		var9.aClass117_Sub22_Sub18_638 = var5;
		var9.anInt636 = var2 * 1294379136 + 647189568;
		var9.anInt637 = var3 * 2041274240 - 1126846528;
		var9.anInt635 = var4 * 147196065;
		var9.anInt641 = var6 * 1346819009;
		var9.aClass117_Sub22_Sub18_642 = var7;
		var9.aClass117_Sub22_Sub18_640 = var8;
		int var12 = 0;
		Class117_Sub5 var13 = aClass117_Sub5ArrayArrayArray524[var1][var2][var3];
		if (var13 != null) {
			for (int var10 = 0; var10 < var13.anInt1745 * 713824851; var10++) {
				if ((var13.aClass23Array1744[var10].anInt284 * 1358183693 & 256) == 256 && var13.aClass23Array1744[var10].aClass117_Sub22_Sub18_276 instanceof Class117_Sub22_Sub18_Sub7) {
					Class117_Sub22_Sub18_Sub7 var11 = (Class117_Sub22_Sub18_Sub7) var13.aClass23Array1744[var10].aClass117_Sub22_Sub18_276;
					var11.method3410();
					if (var11.anInt2466 * 1871917943 > var12) {
						var12 = var11.anInt2466 * 1871917943;
					}
				}
			}
		}

		var9.anInt639 = var12 * -282929921;
		if (aClass117_Sub5ArrayArrayArray524[var1][var2][var3] == null) {
			aClass117_Sub5ArrayArrayArray524[var1][var2][var3] = new Class117_Sub5(var1, var2, var3);
		}

		aClass117_Sub5ArrayArrayArray524[var1][var2][var3].aClass47_1742 = var9;
	}

	public void method547(int var1, int var2, int var3, int var4, Class117_Sub22_Sub18 var5, Class117_Sub22_Sub18 var6, int var7, int var8, int var9, int var10) {
		if (var5 != null || var6 != null) {
			Class34 var12 = new Class34();
			var12.anInt434 = var9 * 1007146021;
			var12.anInt433 = var10 * -1975964817;
			var12.anInt426 = var2 * -788739200 - 394369600;
			var12.anInt427 = var3 * 1980554624 + 990277312;
			var12.anInt435 = var4 * 813251595;
			var12.aClass117_Sub22_Sub18_430 = var5;
			var12.aClass117_Sub22_Sub18_431 = var6;
			var12.anInt428 = var7 * 927023913;
			var12.anInt429 = var8 * 1571064401;

			for (int var11 = var1; var11 >= 0; --var11) {
				if (aClass117_Sub5ArrayArrayArray524[var11][var2][var3] == null) {
					aClass117_Sub5ArrayArrayArray524[var11][var2][var3] = new Class117_Sub5(var11, var2, var3);
				}
			}

			aClass117_Sub5ArrayArrayArray524[var1][var2][var3].aClass34_1739 = var12;
		}
	}

	public boolean method549(int var1, int var2, int var3, int var4, int var5, int var6, Class117_Sub22_Sub18 var7, int var8, int var9, int var10) {
		if (var7 == null) {
			return true;
		} else {
			int var11 = var2 * 128 + var5 * 64;
			int var12 = var3 * 128 + var6 * 64;
			return method552(var1, var2, var3, var5, var6, var11, var12, var4, var7, var8, false, var9, var10);
		}
	}

	public boolean method551(int var1, int var2, int var3, int var4, int var5, Class117_Sub22_Sub18 var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		return var6 != null ? method552(var1, var9, var10, var11 - var9 + 1, var12 - var10 + 1, var2, var3, var4, var6, var7, true, var8, 0) : true;
	}

	boolean method552(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Class117_Sub22_Sub18 var9, int var10, boolean var11, int var12, int var13) {
		int var15;
		for (int var14 = var2; var14 < var2 + var4; var14++) {
			for (var15 = var3; var15 < var3 + var5; var15++) {
				if (var14 < 0 || var15 < 0 || var14 >= anInt534 || var15 >= anInt522) {
					return false;
				}

				Class117_Sub5 var16 = aClass117_Sub5ArrayArrayArray524[var1][var14][var15];
				if (var16 != null && var16.anInt1745 * 713824851 >= 5) {
					return false;
				}
			}
		}

		Class23 var20 = new Class23();
		var20.anInt289 = var12 * -420562407;
		var20.anInt284 = var13 * -599664187;
		var20.anInt277 = var1 * -1040886667;
		var20.anInt274 = var6 * -840071865;
		var20.anInt275 = var7 * 797878053;
		var20.anInt273 = var8 * -533237935;
		var20.aClass117_Sub22_Sub18_276 = var9;
		var20.anInt280 = var10 * -2048844511;
		var20.anInt278 = var2 * -1115277431;
		var20.anInt272 = var3 * 924780141;
		var20.anInt279 = (var2 + var4 - 1) * -177854989;
		var20.anInt281 = (var3 + var5 - 1) * 1976946021;

		for (var15 = var2; var15 < var2 + var4; var15++) {
			for (int var21 = var3; var21 < var3 + var5; var21++) {
				int var17 = 0;
				if (var15 > var2) {
					++var17;
				}

				if (var15 < var2 + var4 - 1) {
					var17 += 4;
				}

				if (var21 > var3) {
					var17 += 8;
				}

				if (var21 < var3 + var5 - 1) {
					var17 += 2;
				}

				for (int var18 = var1; var18 >= 0; --var18) {
					if (aClass117_Sub5ArrayArrayArray524[var18][var15][var21] == null) {
						aClass117_Sub5ArrayArrayArray524[var18][var15][var21] = new Class117_Sub5(var18, var15, var21);
					}
				}

				Class117_Sub5 var22 = aClass117_Sub5ArrayArrayArray524[var1][var15][var21];
				var22.aClass23Array1744[var22.anInt1745 * 713824851] = var20;
				var22.anIntArray1737[var22.anInt1745 * 713824851] = var17;
				var22.anInt1746 = (var22.anInt1746 * -923705921 | var17) * 1503498815;
				var22.anInt1745 += 2004040155;
			}
		}

		if (var11) {
			aClass23Array527[anInt526++] = var20;
		}

		return true;
	}

	public void method553() {
		for (int var1 = 0; var1 < anInt526; var1++) {
			Class23 var2 = aClass23Array527[var1];
			method554(var2);
			aClass23Array527[var1] = null;
		}

		anInt526 = 0;
	}

	void method554(Class23 var1) {
		for (int var2 = var1.anInt278 * -289575239; var2 <= var1.anInt279 * -591332549; var2++) {
			for (int var3 = var1.anInt272 * -1901202587; var3 <= var1.anInt281 * -1581867923; var3++) {
				Class117_Sub5 var5 = aClass117_Sub5ArrayArrayArray524[var1.anInt277 * 1499388893][var2][var3];
				if (var5 != null) {
					int var4;
					for (var4 = 0; var4 < var5.anInt1745 * 713824851; var4++) {
						if (var5.aClass23Array1744[var4] == var1) {
							var5.anInt1745 -= 2004040155;

							for (int var6 = var4; var6 < var5.anInt1745 * 713824851; var6++) {
								var5.aClass23Array1744[var6] = var5.aClass23Array1744[var6 + 1];
								var5.anIntArray1737[var6] = var5.anIntArray1737[var6 + 1];
							}

							var5.aClass23Array1744[var5.anInt1745 * 713824851] = null;
							break;
						}
					}

					var5.anInt1746 = 0;

					for (var4 = 0; var4 < var5.anInt1745 * 713824851; var4++) {
						var5.anInt1746 = (var5.anInt1746 * -923705921 | var5.anIntArray1737[var4]) * 1503498815;
					}
				}
			}
		}

	}

	public void method556(int var1, int var2, int var3) {
		Class117_Sub5 var4 = aClass117_Sub5ArrayArrayArray524[var1][var2][var3];
		if (var4 != null) {
			var4.aClass34_1739 = null;
		}
	}

	public void method559(int var1, int var2, int var3) {
		Class117_Sub5 var4 = aClass117_Sub5ArrayArrayArray524[var1][var2][var3];
		if (var4 != null) {
			var4.aClass27_1757 = null;
		}
	}

	public void method560(int var1, int var2, int var3) {
		Class117_Sub5 var4 = aClass117_Sub5ArrayArrayArray524[var1][var2][var3];
		if (var4 != null) {
			var4.aClass47_1742 = null;
		}
	}

	public Class34 method561(int var1, int var2, int var3) {
		Class117_Sub5 var4 = aClass117_Sub5ArrayArrayArray524[var1][var2][var3];
		return var4 != null ? var4.aClass34_1739 : null;
	}

	public Class40 method562(int var1, int var2, int var3) {
		Class117_Sub5 var4 = aClass117_Sub5ArrayArrayArray524[var1][var2][var3];
		return var4 == null ? null : var4.aClass40_1740;
	}

	public Class23 method563(int var1, int var2, int var3) {
		Class117_Sub5 var4 = aClass117_Sub5ArrayArrayArray524[var1][var2][var3];
		if (var4 == null) {
			return null;
		} else {
			for (int var5 = 0; var5 < var4.anInt1745 * 713824851; var5++) {
				Class23 var6 = var4.aClass23Array1744[var5];
				if ((var6.anInt289 * -1026555351 >> 29 & 3) == 2 && var6.anInt278 * -289575239 == var2 && var6.anInt272 * -1901202587 == var3) {
					return var6;
				}
			}

			return null;
		}
	}

	public Class27 method564(int var1, int var2, int var3) {
		Class117_Sub5 var4 = aClass117_Sub5ArrayArrayArray524[var1][var2][var3];
		return var4 != null && var4.aClass27_1757 != null ? var4.aClass27_1757 : null;
	}

	public int method568(int var1, int var2, int var3) {
		Class117_Sub5 var4 = aClass117_Sub5ArrayArrayArray524[var1][var2][var3];
		return var4 != null && var4.aClass27_1757 != null ? var4.aClass27_1757.anInt340 * 1337438803 : 0;
	}

	public int method569(int var1, int var2, int var3, int var4) {
		Class117_Sub5 var5 = aClass117_Sub5ArrayArrayArray524[var1][var2][var3];
		if (var5 == null) {
			return -1;
		} else if (var5.aClass34_1739 != null && var5.aClass34_1739.anInt434 * -1198250067 == var4) {
			return var5.aClass34_1739.anInt433 * -606039153 & 255;
		} else if (var5.aClass40_1740 != null && var5.aClass40_1740.anInt500 * -53022023 == var4) {
			return var5.aClass40_1740.anInt506 * -1171048915 & 255;
		} else if (var5.aClass27_1757 != null && var5.aClass27_1757.anInt340 * 1337438803 == var4) {
			return var5.aClass27_1757.anInt341 * 1299350065 & 255;
		} else {
			for (int var6 = 0; var6 < var5.anInt1745 * 713824851; var6++) {
				if (var5.aClass23Array1744[var6].anInt289 * -1026555351 == var4) {
					return var5.aClass23Array1744[var6].anInt284 * 1358183693 & 255;
				}
			}

			return -1;
		}
	}

	public void method571(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		Class117_Sub5 var7 = aClass117_Sub5ArrayArrayArray524[var4][var5][var6];
		if (var7 != null) {
			Class25 var10 = var7.aClass25_1741;
			int var11;
			if (var10 != null) {
				int var18 = var10.anInt314 * -1570725475;
				if (var18 != 0) {
					for (var11 = 0; var11 < 4; var11++) {
						var1[var2] = var18;
						var1[var2 + 1] = var18;
						var1[var2 + 2] = var18;
						var1[var2 + 3] = var18;
						var2 += var3;
					}

				}
			} else {
				Class50 var8 = var7.aClass50_1738;
				if (var8 != null) {
					var11 = var8.anInt684;
					int var17 = var8.anInt685;
					int var9 = var8.anInt681;
					int var16 = var8.anInt682;
					int[] var12 = anIntArrayArray520[var11];
					int[] var13 = anIntArrayArray549[var17];
					int var14 = 0;
					int var15;
					if (var9 != 0) {
						for (var15 = 0; var15 < 4; var15++) {
							var1[var2] = var12[var13[var14++]] == 0 ? var9 : var16;
							var1[var2 + 1] = var12[var13[var14++]] == 0 ? var9 : var16;
							var1[var2 + 2] = var12[var13[var14++]] == 0 ? var9 : var16;
							var1[var2 + 3] = var12[var13[var14++]] == 0 ? var9 : var16;
							var2 += var3;
						}
					} else {
						for (var15 = 0; var15 < 4; var15++) {
							if (var12[var13[var14++]] != 0) {
								var1[var2] = var16;
							}

							if (var12[var13[var14++]] != 0) {
								var1[var2 + 1] = var16;
							}

							if (var12[var13[var14++]] != 0) {
								var1[var2 + 2] = var16;
							}

							if (var12[var13[var14++]] != 0) {
								var1[var2 + 3] = var16;
							}

							var2 += var3;
						}
					}

				}
			}
		}
	}

	void method572(Class117_Sub22_Sub18_Sub4 var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		int var17 = var3;
		int var19 = var3 + var5;
		int var11 = var4 - 1;
		int var12 = var4 + var6;

		for (int var13 = var2; var13 <= var2 + 1; var13++) {
			if (var13 != anInt531) {
				for (int var18 = var17; var18 <= var19; var18++) {
					if (var18 >= 0 && var18 < anInt534) {
						for (int var14 = var11; var14 <= var12; var14++) {
							if (var14 >= 0 && var14 < anInt522 && (!var7 || var18 >= var19 || var14 >= var12 || var14 < var4 && var18 != var3)) {
								Class117_Sub5 var10 = aClass117_Sub5ArrayArrayArray524[var13][var18][var14];
								if (var10 != null) {
									int var20 = (anIntArrayArrayArray537[var13][var18][var14] + anIntArrayArrayArray537[var13][var18 + 1][var14] + anIntArrayArrayArray537[var13][var18][var14 + 1] + anIntArrayArrayArray537[var13][var18 + 1][var14 + 1]) / 4 - (anIntArrayArrayArray537[var2][var3][var4] + anIntArrayArrayArray537[var2][var3 + 1][var4] + anIntArrayArrayArray537[var2][var3][var4 + 1] + anIntArrayArrayArray537[var2][var3 + 1][var4 + 1]) / 4;
									Class34 var8 = var10.aClass34_1739;
									if (var8 != null) {
										Class117_Sub22_Sub18_Sub4 var9;
										if (var8.aClass117_Sub22_Sub18_430 instanceof Class117_Sub22_Sub18_Sub4) {
											var9 = (Class117_Sub22_Sub18_Sub4) var8.aClass117_Sub22_Sub18_430;
											Class117_Sub22_Sub18_Sub4.method3175(var1, var9, (var18 - var3) * 128 + (1 - var5) * 64, var20, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}

										if (var8.aClass117_Sub22_Sub18_431 instanceof Class117_Sub22_Sub18_Sub4) {
											var9 = (Class117_Sub22_Sub18_Sub4) var8.aClass117_Sub22_Sub18_431;
											Class117_Sub22_Sub18_Sub4.method3175(var1, var9, (var18 - var3) * 128 + (1 - var5) * 64, var20, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}
									}

									for (int var23 = 0; var23 < var10.anInt1745 * 713824851; var23++) {
										Class23 var15 = var10.aClass23Array1744[var23];
										if (var15 != null && var15.aClass117_Sub22_Sub18_276 instanceof Class117_Sub22_Sub18_Sub4) {
											Class117_Sub22_Sub18_Sub4 var21 = (Class117_Sub22_Sub18_Sub4) var15.aClass117_Sub22_Sub18_276;
											int var22 = var15.anInt279 * -591332549 - var15.anInt278 * -289575239 + 1;
											int var16 = var15.anInt281 * -1581867923 - var15.anInt272 * -1901202587 + 1;
											Class117_Sub22_Sub18_Sub4.method3175(var1, var21, (var15.anInt278 * -289575239 - var3) * 128 + (var22 - var5) * 64, var20, (var15.anInt272 * -1901202587 - var4) * 128 + (var16 - var6) * 64, var7);
										}
									}
								}
							}
						}
					}
				}

				--var17;
				var7 = false;
			}
		}

	}

	public void method576(int var1, int var2, int var3) {
		aBool550 = true;
		anInt556 = var1;
		anInt552 = var2;
		anInt553 = var3;
		anInt580 = -1;
		anInt555 = -1;
	}

	public void method577(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 < 0) {
			var1 = 0;
		} else if (var1 >= anInt534 * 128) {
			var1 = anInt534 * 128 - 1;
		}

		if (var3 < 0) {
			var3 = 0;
		} else if (var3 >= anInt522 * 128) {
			var3 = anInt522 * 128 - 1;
		}

		++anInt535;
		anInt545 = Class117_Sub22_Sub17_Sub1.anIntArray2653[var4];
		anInt546 = Class117_Sub22_Sub17_Sub1.anIntArray2654[var4];
		anInt547 = Class117_Sub22_Sub17_Sub1.anIntArray2653[var5];
		anInt548 = Class117_Sub22_Sub17_Sub1.anIntArray2654[var5];
		aBoolArrayArray574 = aBoolArrayArrayArrayArray572[(var4 - 128) / 32][var5 / 64];
		anInt542 = var1;
		anInt543 = var2;
		anInt544 = var3;
		anInt540 = var1 / 128;
		anInt541 = var3 / 128;
		anInt576 = var6;
		anInt536 = anInt540 - 25;
		if (anInt536 < 0) {
			anInt536 = 0;
		}

		anInt538 = anInt541 - 25;
		if (anInt538 < 0) {
			anInt538 = 0;
		}

		anInt557 = anInt540 + 25;
		if (anInt557 > anInt534) {
			anInt557 = anInt534;
		}

		anInt539 = anInt541 + 25;
		if (anInt539 > anInt522) {
			anInt539 = anInt522;
		}

		method663();
		anInt533 = 0;

		int var7;
		int var9;
		Class117_Sub5[][] var13;
		int var14;
		for (var7 = anInt525; var7 < anInt531; var7++) {
			var13 = aClass117_Sub5ArrayArrayArray524[var7];

			for (var14 = anInt536; var14 < anInt557; var14++) {
				for (var9 = anInt538; var9 < anInt539; var9++) {
					Class117_Sub5 var10 = var13[var14][var9];
					if (var10 != null) {
						if (var10.anInt1747 * 1494906213 <= var6 && (aBoolArrayArray574[var14 - anInt540 + 25][var9 - anInt541 + 25] || anIntArrayArrayArray537[var7][var14][var9] - var2 >= 2000)) {
							var10.aBool1748 = true;
							var10.aBool1733 = true;
							if (var10.anInt1745 * 713824851 > 0) {
								var10.aBool1750 = true;
							} else {
								var10.aBool1750 = false;
							}

							++anInt533;
						} else {
							var10.aBool1748 = false;
							var10.aBool1733 = false;
							var10.anInt1756 = 0;
						}
					}
				}
			}
		}

		Class117_Sub5 var8;
		int var11;
		int var12;
		int var15;
		int var16;
		for (var7 = anInt525; var7 < anInt531; var7++) {
			var13 = aClass117_Sub5ArrayArrayArray524[var7];

			for (var14 = -25; var14 <= 0; var14++) {
				var9 = anInt540 + var14;
				var16 = anInt540 - var14;
				if (var9 >= anInt536 || var16 < anInt557) {
					for (var11 = -25; var11 <= 0; var11++) {
						var15 = anInt541 + var11;
						var12 = anInt541 - var11;
						if (var9 >= anInt536) {
							if (var15 >= anInt538) {
								var8 = var13[var9][var15];
								if (var8 != null && var8.aBool1748) {
									method578(var8, true);
								}
							}

							if (var12 < anInt539) {
								var8 = var13[var9][var12];
								if (var8 != null && var8.aBool1748) {
									method578(var8, true);
								}
							}
						}

						if (var16 < anInt557) {
							if (var15 >= anInt538) {
								var8 = var13[var16][var15];
								if (var8 != null && var8.aBool1748) {
									method578(var8, true);
								}
							}

							if (var12 < anInt539) {
								var8 = var13[var16][var12];
								if (var8 != null && var8.aBool1748) {
									method578(var8, true);
								}
							}
						}

						if (anInt533 == 0) {
							aBool550 = false;
							return;
						}
					}
				}
			}
		}

		for (var7 = anInt525; var7 < anInt531; var7++) {
			var13 = aClass117_Sub5ArrayArrayArray524[var7];

			for (var14 = -25; var14 <= 0; var14++) {
				var9 = anInt540 + var14;
				var16 = anInt540 - var14;
				if (var9 >= anInt536 || var16 < anInt557) {
					for (var11 = -25; var11 <= 0; var11++) {
						var15 = anInt541 + var11;
						var12 = anInt541 - var11;
						if (var9 >= anInt536) {
							if (var15 >= anInt538) {
								var8 = var13[var9][var15];
								if (var8 != null && var8.aBool1748) {
									method578(var8, false);
								}
							}

							if (var12 < anInt539) {
								var8 = var13[var9][var12];
								if (var8 != null && var8.aBool1748) {
									method578(var8, false);
								}
							}
						}

						if (var16 < anInt557) {
							if (var15 >= anInt538) {
								var8 = var13[var16][var15];
								if (var8 != null && var8.aBool1748) {
									method578(var8, false);
								}
							}

							if (var12 < anInt539) {
								var8 = var13[var16][var12];
								if (var8 != null && var8.aBool1748) {
									method578(var8, false);
								}
							}
						}

						if (anInt533 == 0) {
							aBool550 = false;
							return;
						}
					}
				}
			}
		}

		aBool550 = false;
	}

	void method578(Class117_Sub5 var1, boolean var2) {
		aClass120_563.method1575(var1);

		while (true) {
			Class117_Sub5 var3;
			int var4;
			int var5;
			int var6;
			int var7;
			Class117_Sub5[][] var8;
			Class117_Sub5 var9;
			int var11;
			int var14;
			int var15;
			int var16;
			int var24;
			int var26;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										Class34 var10;
										Class23 var12;
										int var17;
										int var18;
										int var21;
										boolean var22;
										Class117_Sub5 var33;
										while (true) {
											do {
												var3 = (Class117_Sub5) aClass120_563.method1594();
												if (var3 == null) {
													return;
												}
											} while (!var3.aBool1733);

											var4 = var3.anInt1734 * 1566235033;
											var5 = var3.anInt1735 * -280257993;
											var6 = var3.anInt1736 * 1815511391;
											var7 = var3.anInt1755 * -497786999;
											var8 = aClass117_Sub5ArrayArrayArray524[var6];
											if (!var3.aBool1748) {
												break;
											}

											if (var2) {
												if (var6 > 0) {
													var9 = aClass117_Sub5ArrayArrayArray524[var6 - 1][var4][var5];
													if (var9 != null && var9.aBool1733) {
														continue;
													}
												}

												if (var4 <= anInt540 && var4 > anInt536) {
													var9 = var8[var4 - 1][var5];
													if (var9 != null && var9.aBool1733 && (var9.aBool1748 || (var3.anInt1746 * -923705921 & 1) == 0)) {
														continue;
													}
												}

												if (var4 >= anInt540 && var4 < anInt557 - 1) {
													var9 = var8[var4 + 1][var5];
													if (var9 != null && var9.aBool1733 && (var9.aBool1748 || (var3.anInt1746 * -923705921 & 4) == 0)) {
														continue;
													}
												}

												if (var5 <= anInt541 && var5 > anInt538) {
													var9 = var8[var4][var5 - 1];
													if (var9 != null && var9.aBool1733 && (var9.aBool1748 || (var3.anInt1746 * -923705921 & 8) == 0)) {
														continue;
													}
												}

												if (var5 >= anInt541 && var5 < anInt539 - 1) {
													var9 = var8[var4][var5 + 1];
													if (var9 != null && var9.aBool1733 && (var9.aBool1748 || (var3.anInt1746 * -923705921 & 2) == 0)) {
														continue;
													}
												}
											} else {
												var2 = true;
											}

											var3.aBool1748 = false;
											if (var3.aClass117_Sub5_1743 != null) {
												var9 = var3.aClass117_Sub5_1743;
												if (var9.aClass25_1741 != null) {
													if (!method584(0, var4, var5)) {
														method579(var9.aClass25_1741, 0, anInt545, anInt546, anInt547, anInt548, var4, var5);
													}
												} else if (var9.aClass50_1738 != null && !method584(0, var4, var5)) {
													method580(var9.aClass50_1738, anInt545, anInt546, anInt547, anInt548, var4, var5);
												}

												var10 = var9.aClass34_1739;
												if (var10 != null) {
													var10.aClass117_Sub22_Sub18_430.method2924(0, anInt545, anInt546, anInt547, anInt548, var10.anInt426 * 1814042151 - anInt542, var10.anInt435 * -1424855133 - anInt543, var10.anInt427 * -32128141 - anInt544, var10.anInt434 * -1198250067);
												}

												for (var11 = 0; var11 < var9.anInt1745 * 713824851; var11++) {
													var12 = var9.aClass23Array1744[var11];
													if (var12 != null) {
														var12.aClass117_Sub22_Sub18_276.method2924(var12.anInt280 * -503142687, anInt545, anInt546, anInt547, anInt548, var12.anInt274 * -349793161 - anInt542, var12.anInt273 * 2029205937 - anInt543, var12.anInt275 * -1396892499 - anInt544, var12.anInt289 * -1026555351);
													}
												}
											}

											var22 = false;
											if (var3.aClass25_1741 != null) {
												if (!method584(var7, var4, var5)) {
													var22 = true;
													if (var3.aClass25_1741.anInt310 * 2010923695 != 12345678 || aBool550 && var6 <= anInt556) {
														method579(var3.aClass25_1741, var7, anInt545, anInt546, anInt547, anInt548, var4, var5);
													}
												}
											} else if (var3.aClass50_1738 != null && !method584(var7, var4, var5)) {
												var22 = true;
												method580(var3.aClass50_1738, anInt545, anInt546, anInt547, anInt548, var4, var5);
											}

											var21 = 0;
											var11 = 0;
											Class34 var23 = var3.aClass34_1739;
											Class40 var13 = var3.aClass40_1740;
											if (var23 != null || var13 != null) {
												if (anInt540 == var4) {
													++var21;
												} else if (anInt540 < var4) {
													var21 += 2;
												}

												if (anInt541 == var5) {
													var21 += 3;
												} else if (anInt541 > var5) {
													var21 += 6;
												}

												var11 = anIntArray564[var21];
												var3.anInt1754 = anIntArray561[var21] * 1802319183;
											}

											if (var23 != null) {
												if ((var23.anInt428 * 564398361 & anIntArray565[var21]) != 0) {
													if (var23.anInt428 * 564398361 == 16) {
														var3.anInt1756 = 2030180749;
														var3.anInt1752 = anIntArray567[var21] * 972231535;
														var3.anInt1753 = -1517134167 - var3.anInt1752 * -1753027635;
													} else if (var23.anInt428 * 564398361 == 32) {
														var3.anInt1756 = -234605798;
														var3.anInt1752 = anIntArray568[var21] * 972231535;
														var3.anInt1753 = 1260698962 - var3.anInt1752 * -1753027635;
													} else if (var23.anInt428 * 564398361 == 64) {
														var3.anInt1756 = -469211596;
														var3.anInt1752 = anIntArray570[var21] * 972231535;
														var3.anInt1753 = -1773569372 - var3.anInt1752 * -1753027635;
													} else {
														var3.anInt1756 = 1795574951;
														var3.anInt1752 = anIntArray571[var21] * 972231535;
														var3.anInt1753 = -256435205 - var3.anInt1752 * -1753027635;
													}
												} else {
													var3.anInt1756 = 0;
												}

												if ((var23.anInt428 * 564398361 & var11) != 0 && !method652(var7, var4, var5, var23.anInt428 * 564398361)) {
													var23.aClass117_Sub22_Sub18_430.method2924(0, anInt545, anInt546, anInt547, anInt548, var23.anInt426 * 1814042151 - anInt542, var23.anInt435 * -1424855133 - anInt543, var23.anInt427 * -32128141 - anInt544, var23.anInt434 * -1198250067);
												}

												if ((var23.anInt429 * 65201 & var11) != 0 && !method652(var7, var4, var5, var23.anInt429 * 65201)) {
													var23.aClass117_Sub22_Sub18_431.method2924(0, anInt545, anInt546, anInt547, anInt548, var23.anInt426 * 1814042151 - anInt542, var23.anInt435 * -1424855133 - anInt543, var23.anInt427 * -32128141 - anInt544, var23.anInt434 * -1198250067);
												}
											}

											if (var13 != null && !method586(var7, var4, var5, var13.aClass117_Sub22_Sub18_496.anInt2466 * 1871917943)) {
												if ((var13.anInt494 * 782616575 & var11) != 0) {
													var13.aClass117_Sub22_Sub18_496.method2924(0, anInt545, anInt546, anInt547, anInt548, var13.anInt492 * 1133734183 - anInt542 + var13.anInt491 * 855354017, var13.anInt498 * -1410218845 - anInt543, var13.anInt499 * 1305821455 - anInt544 + var13.anInt493 * 1294723617, var13.anInt500 * -53022023);
												} else if (var13.anInt494 * 782616575 == 256) {
													var14 = var13.anInt492 * 1133734183 - anInt542;
													var15 = var13.anInt498 * -1410218845 - anInt543;
													var16 = var13.anInt499 * 1305821455 - anInt544;
													var17 = var13.anInt495 * 1792721241;
													if (var17 != 1 && var17 != 2) {
														var18 = var14;
													} else {
														var18 = -var14;
													}

													int var19;
													if (var17 != 2 && var17 != 3) {
														var19 = var16;
													} else {
														var19 = -var16;
													}

													if (var19 < var18) {
														var13.aClass117_Sub22_Sub18_496.method2924(0, anInt545, anInt546, anInt547, anInt548, var14 + var13.anInt491 * 855354017, var15, var16 + var13.anInt493 * 1294723617, var13.anInt500 * -53022023);
													} else if (var13.aClass117_Sub22_Sub18_501 != null) {
														var13.aClass117_Sub22_Sub18_501.method2924(0, anInt545, anInt546, anInt547, anInt548, var14, var15, var16, var13.anInt500 * -53022023);
													}
												}
											}

											if (var22) {
												Class27 var27 = var3.aClass27_1757;
												if (var27 != null) {
													var27.aClass117_Sub22_Sub18_339.method2924(0, anInt545, anInt546, anInt547, anInt548, var27.anInt343 * 386044161 - anInt542, var27.anInt346 * -589077343 - anInt543, var27.anInt338 * -1698464605 - anInt544, var27.anInt340 * 1337438803);
												}

												Class47 var31 = var3.aClass47_1742;
												if (var31 != null && var31.anInt639 * 1587817215 == 0) {
													if (var31.aClass117_Sub22_Sub18_642 != null) {
														var31.aClass117_Sub22_Sub18_642.method2924(0, anInt545, anInt546, anInt547, anInt548, var31.anInt636 * 576265137 - anInt542, var31.anInt635 * 309713761 - anInt543, var31.anInt637 * 261822783 - anInt544, var31.anInt641 * 1361263681);
													}

													if (var31.aClass117_Sub22_Sub18_640 != null) {
														var31.aClass117_Sub22_Sub18_640.method2924(0, anInt545, anInt546, anInt547, anInt548, var31.anInt636 * 576265137 - anInt542, var31.anInt635 * 309713761 - anInt543, var31.anInt637 * 261822783 - anInt544, var31.anInt641 * 1361263681);
													}

													if (var31.aClass117_Sub22_Sub18_638 != null) {
														var31.aClass117_Sub22_Sub18_638.method2924(0, anInt545, anInt546, anInt547, anInt548, var31.anInt636 * 576265137 - anInt542, var31.anInt635 * 309713761 - anInt543, var31.anInt637 * 261822783 - anInt544, var31.anInt641 * 1361263681);
													}
												}
											}

											var14 = var3.anInt1746 * -923705921;
											if (var14 != 0) {
												if (var4 < anInt540 && (var14 & 4) != 0) {
													var33 = var8[var4 + 1][var5];
													if (var33 != null && var33.aBool1733) {
														aClass120_563.method1575(var33);
													}
												}

												if (var5 < anInt541 && (var14 & 2) != 0) {
													var33 = var8[var4][var5 + 1];
													if (var33 != null && var33.aBool1733) {
														aClass120_563.method1575(var33);
													}
												}

												if (var4 > anInt540 && (var14 & 1) != 0) {
													var33 = var8[var4 - 1][var5];
													if (var33 != null && var33.aBool1733) {
														aClass120_563.method1575(var33);
													}
												}

												if (var5 > anInt541 && (var14 & 8) != 0) {
													var33 = var8[var4][var5 - 1];
													if (var33 != null && var33.aBool1733) {
														aClass120_563.method1575(var33);
													}
												}
											}
											break;
										}

										if (var3.anInt1756 * -991988785 != 0) {
											var22 = true;

											for (var21 = 0; var21 < var3.anInt1745 * 713824851; var21++) {
												if (var3.aClass23Array1744[var21].anInt287 * -1354890291 != anInt535 && (var3.anIntArray1737[var21] & var3.anInt1756 * -991988785) == var3.anInt1752 * 1309911951) {
													var22 = false;
													break;
												}
											}

											if (var22) {
												var10 = var3.aClass34_1739;
												if (!method652(var7, var4, var5, var10.anInt428 * 564398361)) {
													var10.aClass117_Sub22_Sub18_430.method2924(0, anInt545, anInt546, anInt547, anInt548, var10.anInt426 * 1814042151 - anInt542, var10.anInt435 * -1424855133 - anInt543, var10.anInt427 * -32128141 - anInt544, var10.anInt434 * -1198250067);
												}

												var3.anInt1756 = 0;
											}
										}

										if (!var3.aBool1750) {
											break;
										}

										try {
											int var25 = var3.anInt1745 * 713824851;
											var3.aBool1750 = false;
											var21 = 0;

											label561:
											for (var11 = 0; var11 < var25; var11++) {
												var12 = var3.aClass23Array1744[var11];
												if (var12.anInt287 * -1354890291 != anInt535) {
													for (var26 = var12.anInt278 * -289575239; var26 <= var12.anInt279 * -591332549; var26++) {
														for (var14 = var12.anInt272 * -1901202587; var14 <= var12.anInt281 * -1581867923; var14++) {
															var33 = var8[var26][var14];
															if (var33.aBool1748) {
																var3.aBool1750 = true;
																continue label561;
															}

															if (var33.anInt1756 * -991988785 != 0) {
																var16 = 0;
																if (var26 > var12.anInt278 * -289575239) {
																	++var16;
																}

																if (var26 < var12.anInt279 * -591332549) {
																	var16 += 4;
																}

																if (var14 > var12.anInt272 * -1901202587) {
																	var16 += 8;
																}

																if (var14 < var12.anInt281 * -1581867923) {
																	var16 += 2;
																}

																if ((var16 & var33.anInt1756 * -991988785) == var3.anInt1753 * -1149407029) {
																	var3.aBool1750 = true;
																	continue label561;
																}
															}
														}
													}

													aClass23Array578[var21++] = var12;
													var26 = anInt540 - var12.anInt278 * -289575239;
													var14 = var12.anInt279 * -591332549 - anInt540;
													if (var14 > var26) {
														var26 = var14;
													}

													var15 = anInt541 - var12.anInt272 * -1901202587;
													var16 = var12.anInt281 * -1581867923 - anInt541;
													if (var16 > var15) {
														var12.anInt285 = (var26 + var16) * 192989291;
													} else {
														var12.anInt285 = (var26 + var15) * 192989291;
													}
												}
											}

											while (var21 > 0) {
												var11 = -50;
												var24 = -1;

												for (var26 = 0; var26 < var21; var26++) {
													Class23 var34 = aClass23Array578[var26];
													if (var34.anInt287 * -1354890291 != anInt535) {
														if (var34.anInt285 * -1401576381 > var11) {
															var11 = var34.anInt285 * -1401576381;
															var24 = var26;
														} else if (var34.anInt285 * -1401576381 == var11) {
															var15 = var34.anInt274 * -349793161 - anInt542;
															var16 = var34.anInt275 * -1396892499 - anInt544;
															var17 = aClass23Array578[var24].anInt274 * -349793161 - anInt542;
															var18 = aClass23Array578[var24].anInt275 * -1396892499 - anInt544;
															if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
																var24 = var26;
															}
														}
													}
												}

												if (var24 == -1) {
													break;
												}

												Class23 var35 = aClass23Array578[var24];
												var35.anInt287 = anInt535 * 117350661;
												if (!method587(var7, var35.anInt278 * -289575239, var35.anInt279 * -591332549, var35.anInt272 * -1901202587, var35.anInt281 * -1581867923, var35.aClass117_Sub22_Sub18_276.anInt2466 * 1871917943)) {
													var35.aClass117_Sub22_Sub18_276.method2924(var35.anInt280 * -503142687, anInt545, anInt546, anInt547, anInt548, var35.anInt274 * -349793161 - anInt542, var35.anInt273 * 2029205937 - anInt543, var35.anInt275 * -1396892499 - anInt544, var35.anInt289 * -1026555351);
												}

												for (var14 = var35.anInt278 * -289575239; var14 <= var35.anInt279 * -591332549; var14++) {
													for (var15 = var35.anInt272 * -1901202587; var15 <= var35.anInt281 * -1581867923; var15++) {
														Class117_Sub5 var36 = var8[var14][var15];
														if (var36.anInt1756 * -991988785 != 0) {
															aClass120_563.method1575(var36);
														} else if ((var14 != var4 || var15 != var5) && var36.aBool1733) {
															aClass120_563.method1575(var36);
														}
													}
												}
											}

											if (!var3.aBool1750) {
												break;
											}
										} catch (Exception var20) {
											var3.aBool1750 = false;
											break;
										}
									}
								} while (!var3.aBool1733);
							} while (var3.anInt1756 * -991988785 != 0);

							if (var4 > anInt540 || var4 <= anInt536) {
								break;
							}

							var9 = var8[var4 - 1][var5];
						} while (var9 != null && var9.aBool1733);

						if (var4 < anInt540 || var4 >= anInt557 - 1) {
							break;
						}

						var9 = var8[var4 + 1][var5];
					} while (var9 != null && var9.aBool1733);

					if (var5 > anInt541 || var5 <= anInt538) {
						break;
					}

					var9 = var8[var4][var5 - 1];
				} while (var9 != null && var9.aBool1733);

				if (var5 < anInt541 || var5 >= anInt539 - 1) {
					break;
				}

				var9 = var8[var4][var5 + 1];
			} while (var9 != null && var9.aBool1733);

			var3.aBool1733 = false;
			--anInt533;
			Class47 var29 = var3.aClass47_1742;
			if (var29 != null && var29.anInt639 * 1587817215 != 0) {
				if (var29.aClass117_Sub22_Sub18_642 != null) {
					var29.aClass117_Sub22_Sub18_642.method2924(0, anInt545, anInt546, anInt547, anInt548, var29.anInt636 * 576265137 - anInt542, var29.anInt635 * 309713761 - anInt543 - var29.anInt639 * 1587817215, var29.anInt637 * 261822783 - anInt544, var29.anInt641 * 1361263681);
				}

				if (var29.aClass117_Sub22_Sub18_640 != null) {
					var29.aClass117_Sub22_Sub18_640.method2924(0, anInt545, anInt546, anInt547, anInt548, var29.anInt636 * 576265137 - anInt542, var29.anInt635 * 309713761 - anInt543 - var29.anInt639 * 1587817215, var29.anInt637 * 261822783 - anInt544, var29.anInt641 * 1361263681);
				}

				if (var29.aClass117_Sub22_Sub18_638 != null) {
					var29.aClass117_Sub22_Sub18_638.method2924(0, anInt545, anInt546, anInt547, anInt548, var29.anInt636 * 576265137 - anInt542, var29.anInt635 * 309713761 - anInt543 - var29.anInt639 * 1587817215, var29.anInt637 * 261822783 - anInt544, var29.anInt641 * 1361263681);
				}
			}

			if (var3.anInt1754 * -1739013713 != 0) {
				Class40 var30 = var3.aClass40_1740;
				if (var30 != null && !method586(var7, var4, var5, var30.aClass117_Sub22_Sub18_496.anInt2466 * 1871917943)) {
					if ((var30.anInt494 * 782616575 & var3.anInt1754 * -1739013713) != 0) {
						var30.aClass117_Sub22_Sub18_496.method2924(0, anInt545, anInt546, anInt547, anInt548, var30.anInt492 * 1133734183 - anInt542 + var30.anInt491 * 855354017, var30.anInt498 * -1410218845 - anInt543, var30.anInt499 * 1305821455 - anInt544 + var30.anInt493 * 1294723617, var30.anInt500 * -53022023);
					} else if (var30.anInt494 * 782616575 == 256) {
						var11 = var30.anInt492 * 1133734183 - anInt542;
						var24 = var30.anInt498 * -1410218845 - anInt543;
						var26 = var30.anInt499 * 1305821455 - anInt544;
						var14 = var30.anInt495 * 1792721241;
						if (var14 != 1 && var14 != 2) {
							var15 = var11;
						} else {
							var15 = -var11;
						}

						if (var14 != 2 && var14 != 3) {
							var16 = var26;
						} else {
							var16 = -var26;
						}

						if (var16 >= var15) {
							var30.aClass117_Sub22_Sub18_496.method2924(0, anInt545, anInt546, anInt547, anInt548, var11 + var30.anInt491 * 855354017, var24, var26 + var30.anInt493 * 1294723617, var30.anInt500 * -53022023);
						} else if (var30.aClass117_Sub22_Sub18_501 != null) {
							var30.aClass117_Sub22_Sub18_501.method2924(0, anInt545, anInt546, anInt547, anInt548, var11, var24, var26, var30.anInt500 * -53022023);
						}
					}
				}

				Class34 var28 = var3.aClass34_1739;
				if (var28 != null) {
					if ((var28.anInt429 * 65201 & var3.anInt1754 * -1739013713) != 0 && !method652(var7, var4, var5, var28.anInt429 * 65201)) {
						var28.aClass117_Sub22_Sub18_431.method2924(0, anInt545, anInt546, anInt547, anInt548, var28.anInt426 * 1814042151 - anInt542, var28.anInt435 * -1424855133 - anInt543, var28.anInt427 * -32128141 - anInt544, var28.anInt434 * -1198250067);
					}

					if ((var28.anInt428 * 564398361 & var3.anInt1754 * -1739013713) != 0 && !method652(var7, var4, var5, var28.anInt428 * 564398361)) {
						var28.aClass117_Sub22_Sub18_430.method2924(0, anInt545, anInt546, anInt547, anInt548, var28.anInt426 * 1814042151 - anInt542, var28.anInt435 * -1424855133 - anInt543, var28.anInt427 * -32128141 - anInt544, var28.anInt434 * -1198250067);
					}
				}
			}

			Class117_Sub5 var32;
			if (var6 < anInt531 - 1) {
				var32 = aClass117_Sub5ArrayArrayArray524[var6 + 1][var4][var5];
				if (var32 != null && var32.aBool1733) {
					aClass120_563.method1575(var32);
				}
			}

			if (var4 < anInt540) {
				var32 = var8[var4 + 1][var5];
				if (var32 != null && var32.aBool1733) {
					aClass120_563.method1575(var32);
				}
			}

			if (var5 < anInt541) {
				var32 = var8[var4][var5 + 1];
				if (var32 != null && var32.aBool1733) {
					aClass120_563.method1575(var32);
				}
			}

			if (var4 > anInt540) {
				var32 = var8[var4 - 1][var5];
				if (var32 != null && var32.aBool1733) {
					aClass120_563.method1575(var32);
				}
			}

			if (var5 > anInt541) {
				var32 = var8[var4][var5 - 1];
				if (var32 != null && var32.aBool1733) {
					aClass120_563.method1575(var32);
				}
			}
		}
	}

	void method579(Class25 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9;
		int var10 = var9 = (var7 << 7) - anInt542;
		int var12;
		int var15 = var12 = (var8 << 7) - anInt544;
		int var14;
		int var11 = var14 = var10 + 128;
		int var16;
		int var17 = var16 = var15 + 128;
		int var26 = anIntArrayArrayArray537[var2][var7][var8] - anInt543;
		int var27 = anIntArrayArrayArray537[var2][var7 + 1][var8] - anInt543;
		int var23 = anIntArrayArrayArray537[var2][var7 + 1][var8 + 1] - anInt543;
		int var24 = anIntArrayArrayArray537[var2][var7][var8 + 1] - anInt543;
		int var25 = var15 * var5 + var10 * var6 >> 16;
		var15 = var15 * var6 - var10 * var5 >> 16;
		var10 = var25;
		var25 = var26 * var4 - var15 * var3 >> 16;
		var15 = var26 * var3 + var15 * var4 >> 16;
		var26 = var25;
		if (var15 >= 50) {
			var25 = var12 * var5 + var11 * var6 >> 16;
			var12 = var12 * var6 - var11 * var5 >> 16;
			var11 = var25;
			var25 = var27 * var4 - var12 * var3 >> 16;
			var12 = var27 * var3 + var12 * var4 >> 16;
			var27 = var25;
			if (var12 >= 50) {
				var25 = var17 * var5 + var14 * var6 >> 16;
				var17 = var17 * var6 - var14 * var5 >> 16;
				var14 = var25;
				var25 = var23 * var4 - var17 * var3 >> 16;
				var17 = var23 * var3 + var17 * var4 >> 16;
				var23 = var25;
				if (var17 >= 50) {
					var25 = var16 * var5 + var9 * var6 >> 16;
					var16 = var16 * var6 - var9 * var5 >> 16;
					var9 = var25;
					var25 = var24 * var4 - var16 * var3 >> 16;
					var16 = var24 * var3 + var16 * var4 >> 16;
					if (var16 >= 50) {
						int var21 = Class117_Sub22_Sub17_Sub1.anInt2649 + var10 * Class117_Sub22_Sub17_Sub1.anInt2639 / var15;
						int var18 = Class117_Sub22_Sub17_Sub1.anInt2637 + var26 * Class117_Sub22_Sub17_Sub1.anInt2639 / var15;
						int var13 = Class117_Sub22_Sub17_Sub1.anInt2649 + var11 * Class117_Sub22_Sub17_Sub1.anInt2639 / var12;
						int var19 = Class117_Sub22_Sub17_Sub1.anInt2637 + var27 * Class117_Sub22_Sub17_Sub1.anInt2639 / var12;
						int var29 = Class117_Sub22_Sub17_Sub1.anInt2649 + var14 * Class117_Sub22_Sub17_Sub1.anInt2639 / var17;
						int var30 = Class117_Sub22_Sub17_Sub1.anInt2637 + var23 * Class117_Sub22_Sub17_Sub1.anInt2639 / var17;
						int var22 = Class117_Sub22_Sub17_Sub1.anInt2649 + var9 * Class117_Sub22_Sub17_Sub1.anInt2639 / var16;
						int var20 = Class117_Sub22_Sub17_Sub1.anInt2637 + var25 * Class117_Sub22_Sub17_Sub1.anInt2639 / var16;
						Class117_Sub22_Sub17_Sub1.anInt2634 = 0;
						int var28;
						if ((var29 - var22) * (var19 - var20) - (var30 - var20) * (var13 - var22) > 0) {
							Class117_Sub22_Sub17_Sub1.aBool2640 = false;
							if (var29 < 0 || var22 < 0 || var13 < 0 || var29 > Class117_Sub22_Sub17_Sub1.anInt2642 || var22 > Class117_Sub22_Sub17_Sub1.anInt2642 || var13 > Class117_Sub22_Sub17_Sub1.anInt2642) {
								Class117_Sub22_Sub17_Sub1.aBool2640 = true;
							}

							if (aBool550 && method616(anInt552, anInt553, var30, var20, var19, var29, var22, var13)) {
								anInt580 = var7;
								anInt555 = var8;
							}

							if (var1.anInt312 * 1244937345 == -1) {
								if (var1.anInt310 * 2010923695 != 12345678) {
									Class117_Sub22_Sub17_Sub1.method3153(var30, var20, var19, var29, var22, var13, var1.anInt310 * 2010923695, var1.anInt309 * 466787195, var1.anInt308 * -1830765877);
								}
							} else if (!aBool554) {
								if (var1.aBool313) {
									Class117_Sub22_Sub17_Sub1.method3146(var30, var20, var19, var29, var22, var13, var1.anInt310 * 2010923695, var1.anInt309 * 466787195, var1.anInt308 * -1830765877, var10, var11, var9, var26, var27, var25, var15, var12, var16, var1.anInt312 * 1244937345);
								} else {
									Class117_Sub22_Sub17_Sub1.method3146(var30, var20, var19, var29, var22, var13, var1.anInt310 * 2010923695, var1.anInt309 * 466787195, var1.anInt308 * -1830765877, var14, var9, var11, var23, var25, var27, var17, var16, var12, var1.anInt312 * 1244937345);
								}
							} else {
								var28 = Class117_Sub22_Sub17_Sub1.anInterface2_2650.method24(var1.anInt312 * 1244937345, (byte) 1);
								Class117_Sub22_Sub17_Sub1.method3153(var30, var20, var19, var29, var22, var13, method594(var28, var1.anInt310 * 2010923695), method594(var28, var1.anInt309 * 466787195), method594(var28, var1.anInt308 * -1830765877));
							}
						}

						if ((var21 - var13) * (var20 - var19) - (var18 - var19) * (var22 - var13) > 0) {
							Class117_Sub22_Sub17_Sub1.aBool2640 = false;
							if (var21 < 0 || var13 < 0 || var22 < 0 || var21 > Class117_Sub22_Sub17_Sub1.anInt2642 || var13 > Class117_Sub22_Sub17_Sub1.anInt2642 || var22 > Class117_Sub22_Sub17_Sub1.anInt2642) {
								Class117_Sub22_Sub17_Sub1.aBool2640 = true;
							}

							if (aBool550 && method616(anInt552, anInt553, var18, var19, var20, var21, var13, var22)) {
								anInt580 = var7;
								anInt555 = var8;
							}

							if (var1.anInt312 * 1244937345 == -1) {
								if (var1.anInt320 * -1719299937 != 12345678) {
									Class117_Sub22_Sub17_Sub1.method3153(var18, var19, var20, var21, var13, var22, var1.anInt320 * -1719299937, var1.anInt308 * -1830765877, var1.anInt309 * 466787195);
								}
							} else if (!aBool554) {
								Class117_Sub22_Sub17_Sub1.method3146(var18, var19, var20, var21, var13, var22, var1.anInt320 * -1719299937, var1.anInt308 * -1830765877, var1.anInt309 * 466787195, var10, var11, var9, var26, var27, var25, var15, var12, var16, var1.anInt312 * 1244937345);
							} else {
								var28 = Class117_Sub22_Sub17_Sub1.anInterface2_2650.method24(var1.anInt312 * 1244937345, (byte) 1);
								Class117_Sub22_Sub17_Sub1.method3153(var18, var19, var20, var21, var13, var22, method594(var28, var1.anInt320 * -1719299937), method594(var28, var1.anInt308 * -1830765877), method594(var28, var1.anInt309 * 466787195));
							}
						}

					}
				}
			}
		}
	}

	void method580(Class50 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var1.anIntArray675.length;

		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		for (var10 = 0; var10 < var8; var10++) {
			var11 = var1.anIntArray675[var10] - anInt542;
			var12 = var1.anIntArray669[var10] - anInt543;
			var9 = var1.anIntArray670[var10] - anInt544;
			var13 = var9 * var4 + var11 * var5 >> 16;
			var9 = var9 * var5 - var11 * var4 >> 16;
			var11 = var13;
			var13 = var12 * var3 - var9 * var2 >> 16;
			var9 = var12 * var2 + var9 * var3 >> 16;
			if (var9 < 50) {
				return;
			}

			if (var1.anIntArray688 != null) {
				Class50.anIntArray676[var10] = var11;
				Class50.anIntArray686[var10] = var13;
				Class50.anIntArray687[var10] = var9;
			}

			Class50.anIntArray683[var10] = Class117_Sub22_Sub17_Sub1.anInt2649 + var11 * Class117_Sub22_Sub17_Sub1.anInt2639 / var9;
			Class50.anIntArray680[var10] = Class117_Sub22_Sub17_Sub1.anInt2637 + var13 * Class117_Sub22_Sub17_Sub1.anInt2639 / var9;
		}

		Class117_Sub22_Sub17_Sub1.anInt2634 = 0;
		var8 = var1.anIntArray674.length;

		for (var10 = 0; var10 < var8; var10++) {
			var11 = var1.anIntArray674[var10];
			var12 = var1.anIntArray679[var10];
			var9 = var1.anIntArray678[var10];
			var13 = Class50.anIntArray683[var11];
			int var17 = Class50.anIntArray683[var12];
			int var18 = Class50.anIntArray683[var9];
			int var14 = Class50.anIntArray680[var11];
			int var15 = Class50.anIntArray680[var12];
			int var16 = Class50.anIntArray680[var9];
			if ((var13 - var17) * (var16 - var15) - (var14 - var15) * (var18 - var17) > 0) {
				Class117_Sub22_Sub17_Sub1.aBool2640 = false;
				if (var13 < 0 || var17 < 0 || var18 < 0 || var13 > Class117_Sub22_Sub17_Sub1.anInt2642 || var17 > Class117_Sub22_Sub17_Sub1.anInt2642 || var18 > Class117_Sub22_Sub17_Sub1.anInt2642) {
					Class117_Sub22_Sub17_Sub1.aBool2640 = true;
				}

				if (aBool550 && method616(anInt552, anInt553, var14, var15, var16, var13, var17, var18)) {
					anInt580 = var6;
					anInt555 = var7;
				}

				if (var1.anIntArray688 != null && var1.anIntArray688[var10] != -1) {
					if (!aBool554) {
						if (var1.aBool668) {
							Class117_Sub22_Sub17_Sub1.method3146(var14, var15, var16, var13, var17, var18, var1.anIntArray671[var10], var1.anIntArray672[var10], var1.anIntArray673[var10], Class50.anIntArray676[0], Class50.anIntArray676[1], Class50.anIntArray676[3], Class50.anIntArray686[0], Class50.anIntArray686[1], Class50.anIntArray686[3], Class50.anIntArray687[0], Class50.anIntArray687[1], Class50.anIntArray687[3], var1.anIntArray688[var10]);
						} else {
							Class117_Sub22_Sub17_Sub1.method3146(var14, var15, var16, var13, var17, var18, var1.anIntArray671[var10], var1.anIntArray672[var10], var1.anIntArray673[var10], Class50.anIntArray676[var11], Class50.anIntArray676[var12], Class50.anIntArray676[var9], Class50.anIntArray686[var11], Class50.anIntArray686[var12], Class50.anIntArray686[var9], Class50.anIntArray687[var11], Class50.anIntArray687[var12], Class50.anIntArray687[var9], var1.anIntArray688[var10]);
						}
					} else {
						int var19 = Class117_Sub22_Sub17_Sub1.anInterface2_2650.method24(var1.anIntArray688[var10], (byte) 1);
						Class117_Sub22_Sub17_Sub1.method3153(var14, var15, var16, var13, var17, var18, method594(var19, var1.anIntArray671[var10]), method594(var19, var1.anIntArray672[var10]), method594(var19, var1.anIntArray673[var10]));
					}
				} else if (var1.anIntArray671[var10] != 12345678) {
					Class117_Sub22_Sub17_Sub1.method3153(var14, var15, var16, var13, var17, var18, var1.anIntArray671[var10], var1.anIntArray672[var10], var1.anIntArray673[var10]);
				}
			}
		}

	}

	boolean method584(int var1, int var2, int var3) {
		int var4 = anIntArrayArrayArray528[var1][var2][var3];
		if (var4 == -anInt535) {
			return false;
		} else if (var4 == anInt535) {
			return true;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			if (method588(var5 + 1, anIntArrayArrayArray537[var1][var2][var3], var6 + 1) && method588(var5 + 128 - 1, anIntArrayArrayArray537[var1][var2 + 1][var3], var6 + 1) && method588(var5 + 128 - 1, anIntArrayArrayArray537[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && method588(var5 + 1, anIntArrayArrayArray537[var1][var2][var3 + 1], var6 + 128 - 1)) {
				anIntArrayArrayArray528[var1][var2][var3] = anInt535;
				return true;
			} else {
				anIntArrayArrayArray528[var1][var2][var3] = -anInt535;
				return false;
			}
		}
	}

	boolean method586(int var1, int var2, int var3, int var4) {
		if (!method584(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			return method588(var5 + 1, anIntArrayArrayArray537[var1][var2][var3] - var4, var6 + 1) && method588(var5 + 128 - 1, anIntArrayArrayArray537[var1][var2 + 1][var3] - var4, var6 + 1) && method588(var5 + 128 - 1, anIntArrayArrayArray537[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && method588(var5 + 1, anIntArrayArrayArray537[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
		}
	}

	boolean method587(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		int var8;
		if (var2 == var3 && var4 == var5) {
			if (!method584(var1, var2, var4)) {
				return false;
			} else {
				var7 = var2 << 7;
				var8 = var4 << 7;
				return method588(var7 + 1, anIntArrayArrayArray537[var1][var2][var4] - var6, var8 + 1) && method588(var7 + 128 - 1, anIntArrayArrayArray537[var1][var2 + 1][var4] - var6, var8 + 1) && method588(var7 + 128 - 1, anIntArrayArrayArray537[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && method588(var7 + 1, anIntArrayArrayArray537[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
			}
		} else {
			for (var7 = var2; var7 <= var3; var7++) {
				for (var8 = var4; var8 <= var5; var8++) {
					if (anIntArrayArrayArray528[var1][var7][var8] == -anInt535) {
						return false;
					}
				}
			}

			var7 = (var2 << 7) + 1;
			var8 = (var4 << 7) + 2;
			int var10 = anIntArrayArrayArray537[var1][var2][var4] - var6;
			if (!method588(var7, var10, var8)) {
				return false;
			} else {
				int var9 = (var3 << 7) - 1;
				if (!method588(var9, var10, var8)) {
					return false;
				} else {
					int var11 = (var5 << 7) - 1;
					if (!method588(var7, var10, var11)) {
						return false;
					} else if (!method588(var9, var10, var11)) {
						return false;
					} else {
						return true;
					}
				}
			}
		}
	}

	boolean method588(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < anInt558; var4++) {
			Class45 var6 = aClass45Array562[var4];
			int var5;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var6.anInt609 * -1119603057 != 1) {
				if (var6.anInt609 * -1119603057 == 2) {
					var7 = var1 - var6.anInt603 * -1134177747;
					if (var7 > 0) {
						var9 = var6.anInt605 * -663440895 + (var6.anInt612 * -846064295 * var7 >> 8);
						var8 = var6.anInt618 * 1130659951 + (var6.anInt613 * -776693289 * var7 >> 8);
						var10 = var6.anInt607 * -1621413135 + (var6.anInt614 * -662081389 * var7 >> 8);
						var5 = var6.anInt608 * -1516223931 + (var6.anInt617 * -838010337 * var7 >> 8);
						if (var3 >= var9 && var3 <= var8 && var2 >= var10 && var2 <= var5) {
							return true;
						}
					}
				} else if (var6.anInt609 * -1119603057 == 3) {
					var7 = var6.anInt605 * -663440895 - var3;
					if (var7 > 0) {
						var9 = var6.anInt603 * -1134177747 + (var6.anInt598 * 1113993551 * var7 >> 8);
						var8 = var6.anInt604 * -654892737 + (var6.anInt611 * 935364803 * var7 >> 8);
						var10 = var6.anInt607 * -1621413135 + (var6.anInt614 * -662081389 * var7 >> 8);
						var5 = var6.anInt608 * -1516223931 + (var6.anInt617 * -838010337 * var7 >> 8);
						if (var1 >= var9 && var1 <= var8 && var2 >= var10 && var2 <= var5) {
							return true;
						}
					}
				} else if (var6.anInt609 * -1119603057 == 4) {
					var7 = var3 - var6.anInt605 * -663440895;
					if (var7 > 0) {
						var9 = var6.anInt603 * -1134177747 + (var6.anInt598 * 1113993551 * var7 >> 8);
						var8 = var6.anInt604 * -654892737 + (var6.anInt611 * 935364803 * var7 >> 8);
						var10 = var6.anInt607 * -1621413135 + (var6.anInt614 * -662081389 * var7 >> 8);
						var5 = var6.anInt608 * -1516223931 + (var6.anInt617 * -838010337 * var7 >> 8);
						if (var1 >= var9 && var1 <= var8 && var2 >= var10 && var2 <= var5) {
							return true;
						}
					}
				} else if (var6.anInt609 * -1119603057 == 5) {
					var7 = var2 - var6.anInt607 * -1621413135;
					if (var7 > 0) {
						var9 = var6.anInt603 * -1134177747 + (var6.anInt598 * 1113993551 * var7 >> 8);
						var8 = var6.anInt604 * -654892737 + (var6.anInt611 * 935364803 * var7 >> 8);
						var10 = var6.anInt605 * -663440895 + (var6.anInt612 * -846064295 * var7 >> 8);
						var5 = var6.anInt618 * 1130659951 + (var6.anInt613 * -776693289 * var7 >> 8);
						if (var1 >= var9 && var1 <= var8 && var3 >= var10 && var3 <= var5) {
							return true;
						}
					}
				}
			} else {
				var7 = var6.anInt603 * -1134177747 - var1;
				if (var7 > 0) {
					var9 = var6.anInt605 * -663440895 + (var6.anInt612 * -846064295 * var7 >> 8);
					var8 = var6.anInt618 * 1130659951 + (var6.anInt613 * -776693289 * var7 >> 8);
					var10 = var6.anInt607 * -1621413135 + (var6.anInt614 * -662081389 * var7 >> 8);
					var5 = var6.anInt608 * -1516223931 + (var6.anInt617 * -838010337 * var7 >> 8);
					if (var3 >= var9 && var3 <= var8 && var2 >= var10 && var2 <= var5) {
						return true;
					}
				}
			}
		}

		return false;
	}

	static {
		anIntArray559 = new int[anInt569];
		aClass45ArrayArray560 = new Class45[anInt569][500];
		anInt558 = 0;
		aClass45Array562 = new Class45[500];
		aClass120_563 = new Class120();
		anIntArray564 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
		anIntArray565 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
		anIntArray561 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
		anIntArray567 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
		anIntArray568 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
		anIntArray570 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
		anIntArray571 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
		aBoolArrayArrayArrayArray572 = new boolean[8][32][51][51];
	}

	public void method589(int var1, int var2, int var3, int var4, Class117_Sub22_Sub18 var5, int var6, int var7) {
		if (var5 != null) {
			Class27 var8 = new Class27();
			var8.aClass117_Sub22_Sub18_339 = var5;
			var8.anInt343 = var2 * 255295616 - 2019835840;
			var8.anInt338 = var3 * 915113344 + 457556672;
			var8.anInt346 = var4 * -1408532639;
			var8.anInt340 = var6 * -2005704229;
			var8.anInt341 = var7 * -13920559;
			if (aClass117_Sub5ArrayArrayArray524[var1][var2][var3] == null) {
				aClass117_Sub5ArrayArrayArray524[var1][var2][var3] = new Class117_Sub5(var1, var2, var3);
			}

			aClass117_Sub5ArrayArrayArray524[var1][var2][var3].aClass27_1757 = var8;
		}
	}

	static int method594(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	boolean method616(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var2 < var3 && var2 < var4 && var2 < var5) {
			return false;
		} else if (var2 > var3 && var2 > var4 && var2 > var5) {
			return false;
		} else if (var1 < var6 && var1 < var7 && var1 < var8) {
			return false;
		} else if (var1 > var6 && var1 > var7 && var1 > var8) {
			return false;
		} else {
			int var10 = (var2 - var3) * (var7 - var6) - (var1 - var6) * (var4 - var3);
			int var11 = (var2 - var5) * (var6 - var8) - (var1 - var8) * (var3 - var5);
			int var9 = (var2 - var4) * (var8 - var7) - (var1 - var7) * (var5 - var4);
			return var10 * var9 > 0 && var9 * var11 > 0;
		}
	}

	public void method619(int var1, int var2, int var3) {
		Class117_Sub5 var4 = aClass117_Sub5ArrayArrayArray524[var1][var2][var3];
		if (var4 != null) {
			var4.aClass40_1740 = null;
		}
	}

	public void method621(int var1, int var2, int var3, int var4) {
		Class117_Sub5 var5 = aClass117_Sub5ArrayArrayArray524[var1][var2][var3];
		if (var5 != null) {
			aClass117_Sub5ArrayArrayArray524[var1][var2][var3].anInt1747 = var4 * 1507701869;
		}
	}

	public int method623(int var1, int var2, int var3) {
		Class117_Sub5 var4 = aClass117_Sub5ArrayArrayArray524[var1][var2][var3];
		return var4 != null && var4.aClass40_1740 != null ? var4.aClass40_1740.anInt500 * -53022023 : 0;
	}

	public void method633(int var1, int var2, int var3) {
		Class117_Sub5 var4 = aClass117_Sub5ArrayArrayArray524[var1][var2][var3];
		if (var4 != null) {
			for (int var5 = 0; var5 < var4.anInt1745 * 713824851; var5++) {
				Class23 var6 = var4.aClass23Array1744[var5];
				if ((var6.anInt289 * -1026555351 >> 29 & 3) == 2 && var6.anInt278 * -289575239 == var2 && var6.anInt272 * -1901202587 == var3) {
					method554(var6);
					return;
				}
			}

		}
	}

	public void method638(int var1, int var2, int var3, int var4) {
		Class117_Sub5 var5 = aClass117_Sub5ArrayArrayArray524[var1][var2][var3];
		if (var5 != null) {
			Class40 var6 = var5.aClass40_1740;
			if (var6 != null) {
				var6.anInt491 = var6.anInt491 * 855354017 * var4 / 16 * 378976609;
				var6.anInt493 = var6.anInt493 * 1294723617 * var4 / 16 * -1790305823;
			}
		}
	}

	public void method639(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < anInt531; var4++) {
			for (int var5 = 0; var5 < anInt534; var5++) {
				for (int var6 = 0; var6 < anInt522; var6++) {
					Class117_Sub5 var8 = aClass117_Sub5ArrayArrayArray524[var4][var5][var6];
					if (var8 != null) {
						Class34 var11 = var8.aClass34_1739;
						Class117_Sub22_Sub18_Sub4 var9;
						if (var11 != null && var11.aClass117_Sub22_Sub18_430 instanceof Class117_Sub22_Sub18_Sub4) {
							Class117_Sub22_Sub18_Sub4 var7 = (Class117_Sub22_Sub18_Sub4) var11.aClass117_Sub22_Sub18_430;
							method572(var7, var4, var5, var6, 1, 1);
							if (var11.aClass117_Sub22_Sub18_431 instanceof Class117_Sub22_Sub18_Sub4) {
								var9 = (Class117_Sub22_Sub18_Sub4) var11.aClass117_Sub22_Sub18_431;
								method572(var9, var4, var5, var6, 1, 1);
								Class117_Sub22_Sub18_Sub4.method3175(var7, var9, 0, 0, 0, false);
								var11.aClass117_Sub22_Sub18_431 = var9.method3183(var9.aShort2689, var9.aShort2681, var1, var2, var3);
							}

							var11.aClass117_Sub22_Sub18_430 = var7.method3183(var7.aShort2689, var7.aShort2681, var1, var2, var3);
						}

						for (int var12 = 0; var12 < var8.anInt1745 * 713824851; var12++) {
							Class23 var14 = var8.aClass23Array1744[var12];
							if (var14 != null && var14.aClass117_Sub22_Sub18_276 instanceof Class117_Sub22_Sub18_Sub4) {
								Class117_Sub22_Sub18_Sub4 var10 = (Class117_Sub22_Sub18_Sub4) var14.aClass117_Sub22_Sub18_276;
								method572(var10, var4, var5, var6, var14.anInt279 * -591332549 - var14.anInt278 * -289575239 + 1, var14.anInt281 * -1581867923 - var14.anInt272 * -1901202587 + 1);
								var14.aClass117_Sub22_Sub18_276 = var10.method3183(var10.aShort2689, var10.aShort2681, var1, var2, var3);
							}
						}

						Class27 var13 = var8.aClass27_1757;
						if (var13 != null && var13.aClass117_Sub22_Sub18_339 instanceof Class117_Sub22_Sub18_Sub4) {
							var9 = (Class117_Sub22_Sub18_Sub4) var13.aClass117_Sub22_Sub18_339;
							method653(var9, var4, var5, var6);
							var13.aClass117_Sub22_Sub18_339 = var9.method3183(var9.aShort2689, var9.aShort2681, var1, var2, var3);
						}
					}
				}
			}
		}

	}

	boolean method652(int var1, int var2, int var3, int var4) {
		if (!method584(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var9 = var3 << 7;
			int var6 = anIntArrayArrayArray537[var1][var2][var3] - 1;
			int var10 = var6 - 120;
			int var7 = var6 - 230;
			int var8 = var6 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > anInt542) {
						if (!method588(var5, var6, var9)) {
							return false;
						}

						if (!method588(var5, var6, var9 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!method588(var5, var10, var9)) {
							return false;
						}

						if (!method588(var5, var10, var9 + 128)) {
							return false;
						}
					}

					if (!method588(var5, var7, var9)) {
						return false;
					}

					if (!method588(var5, var7, var9 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 2) {
					if (var9 < anInt544) {
						if (!method588(var5, var6, var9 + 128)) {
							return false;
						}

						if (!method588(var5 + 128, var6, var9 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!method588(var5, var10, var9 + 128)) {
							return false;
						}

						if (!method588(var5 + 128, var10, var9 + 128)) {
							return false;
						}
					}

					if (!method588(var5, var7, var9 + 128)) {
						return false;
					}

					if (!method588(var5 + 128, var7, var9 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 4) {
					if (var5 < anInt542) {
						if (!method588(var5 + 128, var6, var9)) {
							return false;
						}

						if (!method588(var5 + 128, var6, var9 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!method588(var5 + 128, var10, var9)) {
							return false;
						}

						if (!method588(var5 + 128, var10, var9 + 128)) {
							return false;
						}
					}

					if (!method588(var5 + 128, var7, var9)) {
						return false;
					}

					if (!method588(var5 + 128, var7, var9 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 8) {
					if (var9 > anInt544) {
						if (!method588(var5, var6, var9)) {
							return false;
						}

						if (!method588(var5 + 128, var6, var9)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!method588(var5, var10, var9)) {
							return false;
						}

						if (!method588(var5 + 128, var10, var9)) {
							return false;
						}
					}

					if (!method588(var5, var7, var9)) {
						return false;
					}

					if (!method588(var5 + 128, var7, var9)) {
						return false;
					}

					return true;
				}
			}

			return !method588(var5 + 64, var8, var9 + 64) ? false : (var4 == 16 ? method588(var5, var7, var9 + 128) : (var4 == 32 ? method588(var5 + 128, var7, var9 + 128) : (var4 == 64 ? method588(var5 + 128, var7, var9) : (var4 == 128 ? method588(var5, var7, var9) : true))));
		}
	}

	void method653(Class117_Sub22_Sub18_Sub4 var1, int var2, int var3, int var4) {
		Class117_Sub5 var5;
		Class117_Sub22_Sub18_Sub4 var6;
		if (var3 < anInt534) {
			var5 = aClass117_Sub5ArrayArrayArray524[var2][var3 + 1][var4];
			if (var5 != null && var5.aClass27_1757 != null && var5.aClass27_1757.aClass117_Sub22_Sub18_339 instanceof Class117_Sub22_Sub18_Sub4) {
				var6 = (Class117_Sub22_Sub18_Sub4) var5.aClass27_1757.aClass117_Sub22_Sub18_339;
				Class117_Sub22_Sub18_Sub4.method3175(var1, var6, 128, 0, 0, true);
			}
		}

		if (var4 < anInt534) {
			var5 = aClass117_Sub5ArrayArrayArray524[var2][var3][var4 + 1];
			if (var5 != null && var5.aClass27_1757 != null && var5.aClass27_1757.aClass117_Sub22_Sub18_339 instanceof Class117_Sub22_Sub18_Sub4) {
				var6 = (Class117_Sub22_Sub18_Sub4) var5.aClass27_1757.aClass117_Sub22_Sub18_339;
				Class117_Sub22_Sub18_Sub4.method3175(var1, var6, 0, 0, 128, true);
			}
		}

		if (var3 < anInt534 && var4 < anInt522) {
			var5 = aClass117_Sub5ArrayArrayArray524[var2][var3 + 1][var4 + 1];
			if (var5 != null && var5.aClass27_1757 != null && var5.aClass27_1757.aClass117_Sub22_Sub18_339 instanceof Class117_Sub22_Sub18_Sub4) {
				var6 = (Class117_Sub22_Sub18_Sub4) var5.aClass27_1757.aClass117_Sub22_Sub18_339;
				Class117_Sub22_Sub18_Sub4.method3175(var1, var6, 128, 0, 128, true);
			}
		}

		if (var3 < anInt534 && var4 > 0) {
			var5 = aClass117_Sub5ArrayArrayArray524[var2][var3 + 1][var4 - 1];
			if (var5 != null && var5.aClass27_1757 != null && var5.aClass27_1757.aClass117_Sub22_Sub18_339 instanceof Class117_Sub22_Sub18_Sub4) {
				var6 = (Class117_Sub22_Sub18_Sub4) var5.aClass27_1757.aClass117_Sub22_Sub18_339;
				Class117_Sub22_Sub18_Sub4.method3175(var1, var6, 128, 0, -128, true);
			}
		}

	}

	public void method659(int var1, int var2, int var3, int var4, Class117_Sub22_Sub18 var5, Class117_Sub22_Sub18 var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		if (var5 != null) {
			Class40 var13 = new Class40();
			var13.anInt500 = var11 * -2048429175;
			var13.anInt506 = var12 * 151030181;
			var13.anInt492 = var2 * 1908099968 + 954049984;
			var13.anInt499 = var3 * -557385856 - 278692928;
			var13.anInt498 = var4 * 1073549067;
			var13.aClass117_Sub22_Sub18_496 = var5;
			var13.aClass117_Sub22_Sub18_501 = var6;
			var13.anInt494 = var7 * 1696217087;
			var13.anInt495 = var8 * -2145421591;
			var13.anInt491 = var9 * 378976609;
			var13.anInt493 = var10 * -1790305823;

			for (int var14 = var1; var14 >= 0; --var14) {
				if (aClass117_Sub5ArrayArrayArray524[var14][var2][var3] == null) {
					aClass117_Sub5ArrayArrayArray524[var14][var2][var3] = new Class117_Sub5(var14, var2, var3);
				}
			}

			aClass117_Sub5ArrayArrayArray524[var1][var2][var3].aClass40_1740 = var13;
		}
	}

	void method663() {
		int var1 = anIntArray559[anInt576];
		Class45[] var10 = aClass45ArrayArray560[anInt576];
		anInt558 = 0;

		for (int var4 = 0; var4 < var1; var4++) {
			Class45 var2 = var10[var4];
			int var3;
			int var5;
			int var7;
			int var8;
			boolean var13;
			if (var2.anInt606 * 383182863 == 1) {
				var3 = var2.anInt615 * 1680080989 - anInt540 + 25;
				if (var3 >= 0 && var3 <= 50) {
					var7 = var2.anInt600 * -1525539265 - anInt541 + 25;
					if (var7 < 0) {
						var7 = 0;
					}

					var5 = var2.anInt601 * 1779632313 - anInt541 + 25;
					if (var5 > 50) {
						var5 = 50;
					}

					var13 = false;

					while (var7 <= var5) {
						if (aBoolArrayArray574[var3][var7++]) {
							var13 = true;
							break;
						}
					}

					if (var13) {
						var8 = anInt542 - var2.anInt603 * -1134177747;
						if (var8 > 32) {
							var2.anInt609 = -1380308881;
						} else {
							if (var8 >= -32) {
								continue;
							}

							var2.anInt609 = 1534349534;
							var8 = -var8;
						}

						var2.anInt612 = (var2.anInt605 * -663440895 - anInt544 << 8) / var8 * -662510871;
						var2.anInt613 = (var2.anInt618 * 1130659951 - anInt544 << 8) / var8 * -426743321;
						var2.anInt614 = (var2.anInt607 * -1621413135 - anInt543 << 8) / var8 * -1503318629;
						var2.anInt617 = (var2.anInt608 * -1516223931 - anInt543 << 8) / var8 * 1128792543;
						aClass45Array562[anInt558++] = var2;
					}
				}
			} else if (var2.anInt606 * 383182863 == 2) {
				var3 = var2.anInt600 * -1525539265 - anInt541 + 25;
				if (var3 >= 0 && var3 <= 50) {
					var7 = var2.anInt615 * 1680080989 - anInt540 + 25;
					if (var7 < 0) {
						var7 = 0;
					}

					var5 = var2.anInt616 * 1203319331 - anInt540 + 25;
					if (var5 > 50) {
						var5 = 50;
					}

					var13 = false;

					while (var7 <= var5) {
						if (aBoolArrayArray574[var7++][var3]) {
							var13 = true;
							break;
						}
					}

					if (var13) {
						var8 = anInt544 - var2.anInt605 * -663440895;
						if (var8 > 32) {
							var2.anInt609 = 154040653;
						} else {
							if (var8 >= -32) {
								continue;
							}

							var2.anInt609 = -1226268228;
							var8 = -var8;
						}

						var2.anInt598 = (var2.anInt603 * -1134177747 - anInt542 << 8) / var8 * 1191593391;
						var2.anInt611 = (var2.anInt604 * -654892737 - anInt542 << 8) / var8 * -468424725;
						var2.anInt614 = (var2.anInt607 * -1621413135 - anInt543 << 8) / var8 * -1503318629;
						var2.anInt617 = (var2.anInt608 * -1516223931 - anInt543 << 8) / var8 * 1128792543;
						aClass45Array562[anInt558++] = var2;
					}
				}
			} else if (var2.anInt606 * 383182863 == 4) {
				var3 = var2.anInt607 * -1621413135 - anInt543;
				if (var3 > 128) {
					var7 = var2.anInt600 * -1525539265 - anInt541 + 25;
					if (var7 < 0) {
						var7 = 0;
					}

					var5 = var2.anInt601 * 1779632313 - anInt541 + 25;
					if (var5 > 50) {
						var5 = 50;
					}

					if (var7 <= var5) {
						int var6 = var2.anInt615 * 1680080989 - anInt540 + 25;
						if (var6 < 0) {
							var6 = 0;
						}

						var8 = var2.anInt616 * 1203319331 - anInt540 + 25;
						if (var8 > 50) {
							var8 = 50;
						}

						boolean var11 = false;

						label177:
						for (int var12 = var6; var12 <= var8; var12++) {
							for (int var9 = var7; var9 <= var5; var9++) {
								if (aBoolArrayArray574[var12][var9]) {
									var11 = true;
									break label177;
								}
							}
						}

						if (var11) {
							var2.anInt609 = 1688390187;
							var2.anInt598 = (var2.anInt603 * -1134177747 - anInt542 << 8) / var3 * 1191593391;
							var2.anInt611 = (var2.anInt604 * -654892737 - anInt542 << 8) / var3 * -468424725;
							var2.anInt612 = (var2.anInt605 * -663440895 - anInt544 << 8) / var3 * -662510871;
							var2.anInt613 = (var2.anInt618 * 1130659951 - anInt544 << 8) / var3 * -426743321;
							aClass45Array562[anInt558++] = var2;
						}
					}
				}
			}
		}

	}

	public int method664(int var1, int var2, int var3) {
		Class117_Sub5 var4 = aClass117_Sub5ArrayArrayArray524[var1][var2][var3];
		if (var4 == null) {
			return 0;
		} else {
			for (int var6 = 0; var6 < var4.anInt1745 * 713824851; var6++) {
				Class23 var5 = var4.aClass23Array1744[var6];
				if ((var5.anInt289 * -1026555351 >> 29 & 3) == 2 && var5.anInt278 * -289575239 == var2 && var5.anInt272 * -1901202587 == var3) {
					return var5.anInt289 * -1026555351;
				}
			}

			return 0;
		}
	}

	public boolean method673(int var1, int var2, int var3, int var4, int var5, Class117_Sub22_Sub18 var6, int var7, int var8, boolean var9) {
		if (var6 == null) {
			return true;
		} else {
			int var10 = var2 - var5;
			int var12 = var3 - var5;
			int var11 = var2 + var5;
			int var13 = var3 + var5;
			if (var9) {
				if (var7 > 640 && var7 < 1408) {
					var13 += 128;
				}

				if (var7 > 1152 && var7 < 1920) {
					var11 += 128;
				}

				if (var7 > 1664 || var7 < 384) {
					var12 -= 128;
				}

				if (var7 > 128 && var7 < 896) {
					var10 -= 128;
				}
			}

			var10 /= 128;
			var12 /= 128;
			var11 /= 128;
			var13 /= 128;
			return method552(var1, var10, var12, var11 - var10 + 1, var13 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
		}
	}

	public static void method691(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		Class45 var8 = new Class45();
		var8.anInt615 = var2 / 128 * -901000203;
		var8.anInt616 = var3 / 128 * 1289883019;
		var8.anInt600 = var4 / 128 * 1958138303;
		var8.anInt601 = var5 / 128 * 301890953;
		var8.anInt606 = var1 * -1740437777;
		var8.anInt603 = var2 * 466111909;
		var8.anInt604 = var3 * -532459841;
		var8.anInt605 = var4 * -1420866047;
		var8.anInt618 = var5 * 1246027407;
		var8.anInt607 = var6 * -942703087;
		var8.anInt608 = var7 * -1253736307;
		aClass45ArrayArray560[var0][anIntArray559[var0]++] = var8;
	}

	public static void method694(int[] var0, int var1, int var2, int var3, int var4) {
		anInt521 = 0;
		anInt577 = 0;
		anInt579 = var3;
		anInt566 = var4;
		anInt575 = var3 / 2;
		anInt519 = var4 / 2;
		boolean[][][][] var11 = new boolean[9][32][53][53];

		int var5;
		int var7;
		int var9;
		int var12;
		int var13;
		int var14;
		for (var7 = 128; var7 <= 384; var7 += 32) {
			for (var9 = 0; var9 < 2048; var9 += 64) {
				anInt545 = Class117_Sub22_Sub17_Sub1.anIntArray2653[var7];
				anInt546 = Class117_Sub22_Sub17_Sub1.anIntArray2654[var7];
				anInt547 = Class117_Sub22_Sub17_Sub1.anIntArray2653[var9];
				anInt548 = Class117_Sub22_Sub17_Sub1.anIntArray2654[var9];
				var12 = (var7 - 128) / 32;
				var5 = var9 / 64;

				for (int var10 = -26; var10 <= 26; var10++) {
					for (var13 = -26; var13 <= 26; var13++) {
						var14 = var10 * 128;
						int var15 = var13 * 128;
						boolean var8 = false;

						for (int var6 = -var1; var6 <= var2; var6 += 128) {
							if (method697(var14, var0[var12] + var6, var15)) {
								var8 = true;
								break;
							}
						}

						var11[var12][var5][var10 + 25 + 1][var13 + 25 + 1] = var8;
					}
				}
			}
		}

		for (var7 = 0; var7 < 8; var7++) {
			for (var9 = 0; var9 < 32; var9++) {
				for (var12 = -25; var12 < 25; var12++) {
					for (var5 = -25; var5 < 25; var5++) {
						boolean var16 = false;

						label98:
						for (var13 = -1; var13 <= 1; var13++) {
							for (var14 = -1; var14 <= 1; var14++) {
								if (var11[var7][var9][var12 + var13 + 25 + 1][var5 + var14 + 25 + 1]) {
									var16 = true;
									break label98;
								}

								if (var11[var7][(var9 + 1) % 31][var12 + var13 + 25 + 1][var5 + var14 + 25 + 1]) {
									var16 = true;
									break label98;
								}

								if (var11[var7 + 1][var9][var12 + var13 + 25 + 1][var5 + var14 + 25 + 1]) {
									var16 = true;
									break label98;
								}

								if (var11[var7 + 1][(var9 + 1) % 31][var12 + var13 + 25 + 1][var5 + var14 + 25 + 1]) {
									var16 = true;
									break label98;
								}
							}
						}

						aBoolArrayArrayArrayArray572[var7][var9][var12 + 25][var5 + 25] = var16;
					}
				}
			}
		}

	}

	static boolean method697(int var0, int var1, int var2) {
		int var3 = var2 * anInt547 + var0 * anInt548 >> 16;
		int var6 = var2 * anInt548 - var0 * anInt547 >> 16;
		int var5 = var1 * anInt545 + var6 * anInt546 >> 16;
		int var7 = var1 * anInt546 - var6 * anInt545 >> 16;
		if (var5 >= 50 && var5 <= 3500) {
			int var4 = anInt575 + var3 * Class117_Sub22_Sub17_Sub1.anInt2639 / var5;
			int var8 = anInt519 + var7 * Class117_Sub22_Sub17_Sub1.anInt2639 / var5;
			return var4 >= anInt521 && var4 <= anInt579 && var8 >= anInt577 && var8 <= anInt566;
		} else {
			return false;
		}
	}

	public int method706(int var1, int var2, int var3) {
		Class117_Sub5 var4 = aClass117_Sub5ArrayArrayArray524[var1][var2][var3];
		return var4 != null && var4.aClass34_1739 != null ? var4.aClass34_1739.anInt434 * -1198250067 : 0;
	}

	public Class42(int var1, int var2, int var3, int[][][] var4) {
		anInt531 = var1;
		anInt534 = var2;
		anInt522 = var3;
		aClass117_Sub5ArrayArrayArray524 = new Class117_Sub5[var1][var2][var3];
		anIntArrayArrayArray528 = new int[var1][var2 + 1][var3 + 1];
		anIntArrayArrayArray537 = var4;
		method539();
	}

}
