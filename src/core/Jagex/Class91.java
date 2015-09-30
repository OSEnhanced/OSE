package core.Jagex;
import java.awt.*;

public class Class91 {

	public static short[] aShortArray1074;
	public static short[] aShortArray1080;
	public static final int anInt1084 = 10;
	public static Canvas aCanvas1085;
	int[] anIntArray1083;
	int[] anIntArray1081;
	public boolean aBool1076;
	public int anInt1077;
	long aLong1078;
	static int[] anIntArray1082 = new int[]{8, 11, 4, 6, 9, 7, 10};
	public static Class115 aClass115_1075 = new Class115(260);
	long aLong1079;

	public void method1189(int[] var1, int[] var2, boolean var3, int var4, byte var5) {
		if (var1 == null) {
			var1 = new int[12];

			for (int var8 = 0; var8 < 7; var8++) {
				for (int var6 = 0; var6 < Class117_Sub22_Sub10.anInt2299 * -1443656603; var6++) {
					Class117_Sub22_Sub10 var7 = Class6.method113(var6, -1510407238);
					if (var7 != null && !var7.aBool2297 && var7.anInt2296 * 950896147 == (var3 ? 7 : 0) + var8) {
						var1[anIntArray1082[var8]] = 256 + var6;
						break;
					}
				}
			}
		}

		anIntArray1083 = var1;
		anIntArray1081 = var2;
		aBool1076 = var3;
		anInt1077 = var4 * 2025889175;
		method1194(1514515030);
	}

	public void method1190(int var1, boolean var2, byte var3) {
		if (var1 != 1 || !aBool1076) {
			int var4 = anIntArray1083[anIntArray1082[var1]];
			if (var4 != 0) {
				var4 -= 256;

				Class117_Sub22_Sub10 var5;
				do {
					if (!var2) {
						--var4;
						if (var4 < 0) {
							var4 = Class117_Sub22_Sub10.anInt2299 * -1443656603 - 1;
						}
					} else {
						++var4;
						if (var4 >= Class117_Sub22_Sub10.anInt2299 * -1443656603) {
							var4 = 0;
						}
					}

					var5 = Class6.method113(var4, -1510407238);
				} while (var5 == null || var5.aBool2297 || var1 + (aBool1076 ? 7 : 0) != var5.anInt2296 * 950896147);

				anIntArray1083[anIntArray1082[var1]] = 256 + var4;
				method1194(1514515030);
			}
		}
	}

	public void method1191(int var1, boolean var2, int var3) {
		int var4 = anIntArray1081[var1];
		boolean var5;
		if (var2) {
			do {
				++var4;
				if (var4 >= Class87.aShortArrayArray1019[var1].length) {
					var4 = 0;
				}
			} while (!Class52.method822(var1, var4, -145749980));
		} else {
			do {
				--var4;
				if (var4 < 0) {
					var4 = Class87.aShortArrayArray1019[var1].length - 1;
				}

				if (var1 == 4 && var4 == 8) {
					var5 = false;
				} else {
					var5 = true;
				}
			} while (!var5);
		}

		anIntArray1081[var1] = var4;
		method1194(1514515030);
	}

	public void method1192(boolean var1, byte var2) {
		if (aBool1076 == var1) {
			if (var2 < 4) {
				;
			}
		} else {
			method1189((int[]) null, anIntArray1081, var1, -1, (byte) -63);
		}
	}

	void method1194(int var1) {
		long var2 = 1031547852720225145L * aLong1078;
		int var6 = anIntArray1083[5];
		int var4 = anIntArray1083[9];
		anIntArray1083[5] = var4;
		anIntArray1083[9] = var6;
		aLong1078 = 0L;

		int var5;
		for (var5 = 0; var5 < 12; var5++) {
			aLong1078 = -1173813545786294583L * (1031547852720225145L * aLong1078 << 4);
			if (anIntArray1083[var5] >= 256) {
				aLong1078 += -1173813545786294583L * (long) (anIntArray1083[var5] - 256);
			}
		}

		if (anIntArray1083[0] >= 256) {
			aLong1078 += (long) (anIntArray1083[0] - 256 >> 4) * -1173813545786294583L;
		}

		if (anIntArray1083[1] >= 256) {
			aLong1078 += -1173813545786294583L * (long) (anIntArray1083[1] - 256 >> 8);
		}

		for (var5 = 0; var5 < 5; var5++) {
			aLong1078 = (1031547852720225145L * aLong1078 << 3) * -1173813545786294583L;
			aLong1078 += (long) anIntArray1081[var5] * -1173813545786294583L;
		}

		aLong1078 = -1173813545786294583L * (aLong1078 * 1031547852720225145L << 1);
		aLong1078 += -1173813545786294583L * (long) (aBool1076 ? 1 : 0);
		anIntArray1083[5] = var6;
		anIntArray1083[9] = var4;
		if (var2 != 0L && aLong1078 * 1031547852720225145L != var2) {
			aClass115_1075.method1519(var2);
		}

	}

	Class117_Sub22_Sub18_Sub4 method1205(int var1) {
		if (anInt1077 * -130829785 != -1) {
			return Class117_Sub7.method1952(anInt1077 * -130829785, (byte) 0).method2393((byte) 103);
		} else {
			boolean var4 = false;

			int var2;
			for (int var3 = 0; var3 < 12; var3++) {
				var2 = anIntArray1083[var3];
				if (var2 >= 256 && var2 < 512 && !Class6.method113(var2 - 256, -1510407238).method2524(1304129099)) {
					var4 = true;
				}

				if (var2 >= 512 && !Class117_Sub13.method1992(var2 - 512, -1566938535).method2447(aBool1076, 2009425824)) {
					var4 = true;
				}
			}

			if (var4) {
				return null;
			} else {
				Class117_Sub22_Sub18_Sub4[] var8 = new Class117_Sub22_Sub18_Sub4[12];
				var2 = 0;

				int var5;
				for (int var6 = 0; var6 < 12; var6++) {
					var5 = anIntArray1083[var6];
					Class117_Sub22_Sub18_Sub4 var7;
					if (var5 >= 256 && var5 < 512) {
						var7 = Class6.method113(var5 - 256, -1510407238).method2525(2044250318);
						if (var7 != null) {
							var8[var2++] = var7;
						}
					}

					if (var5 >= 512) {
						var7 = Class117_Sub13.method1992(var5 - 512, -229251406).method2428(aBool1076, -2118023453);
						if (var7 != null) {
							var8[var2++] = var7;
						}
					}
				}

				Class117_Sub22_Sub18_Sub4 var9 = new Class117_Sub22_Sub18_Sub4(var8, var2);

				for (var5 = 0; var5 < 5; var5++) {
					if (anIntArray1081[var5] < Class87.aShortArrayArray1019[var5].length) {
						var9.method3168(aShortArray1080[var5], Class87.aShortArrayArray1019[var5][anIntArray1081[var5]]);
					}

					if (anIntArray1081[var5] < Class25.aShortArrayArray318[var5].length) {
						var9.method3168(aShortArray1074[var5], Class25.aShortArrayArray318[var5][anIntArray1081[var5]]);
					}
				}

				return var9;
			}
		}
	}

	public void method1210(Class117_Sub14 var1, short var2) {
		var1.method2126(aBool1076 ? 1 : 0, 1424051335);

		int var3;
		for (var3 = 0; var3 < 7; var3++) {
			int var4 = anIntArray1083[anIntArray1082[var3]];
			if (var4 == 0) {
				var1.method2126(-1, 2014115736);
			} else {
				var1.method2126(var4 - 256, 922686773);
			}
		}

		for (var3 = 0; var3 < 5; var3++) {
			var1.method2126(anIntArray1081[var3], 1965635370);
		}

	}

	public int method1216(int var1) {
		return anInt1077 * -130829785 == -1 ? anIntArray1083[1] + (anIntArray1083[11] << 5) + (anIntArray1083[0] << 15) + (anIntArray1081[4] << 20) + (anIntArray1081[0] << 25) + (anIntArray1083[8] << 10) : 305419896 + Class117_Sub7.method1952(anInt1077 * -130829785, (byte) 0).anInt2184 * -446840273;
	}

	public Class117_Sub22_Sub18_Sub7 method1221(Class117_Sub22_Sub14 var1, int var2, Class117_Sub22_Sub14 var3, int var4, int var5) {
		if (anInt1077 * -130829785 != -1) {
			return Class117_Sub7.method1952(anInt1077 * -130829785, (byte) 0).method2392(var1, var2, var3, var4, 468785319);
		} else {
			long var7 = 1031547852720225145L * aLong1078;
			int[] var9 = anIntArray1083;
			if (var1 != null && (var1.anInt2398 * -1544386333 >= 0 || var1.anInt2411 * 1096117585 >= 0)) {
				var9 = new int[12];

				for (int var12 = 0; var12 < 12; var12++) {
					var9[var12] = anIntArray1083[var12];
				}

				if (var1.anInt2398 * -1544386333 >= 0) {
					var7 += (long) (var1.anInt2398 * -1544386333 - anIntArray1083[5] << 40);
					var9[5] = var1.anInt2398 * -1544386333;
				}

				if (var1.anInt2411 * 1096117585 >= 0) {
					var7 += (long) (var1.anInt2411 * 1096117585 - anIntArray1083[3] << 48);
					var9[3] = var1.anInt2411 * 1096117585;
				}
			}

			Class117_Sub22_Sub18_Sub7 var17 = (Class117_Sub22_Sub18_Sub7) aClass115_1075.method1515(var7);
			if (var17 == null) {
				boolean var11 = false;

				int var6;
				for (int var14 = 0; var14 < 12; var14++) {
					var6 = var9[var14];
					if (var6 >= 256 && var6 < 512 && !Class6.method113(var6 - 256, -1510407238).method2522((byte) -93)) {
						var11 = true;
					}

					if (var6 >= 512 && !Class117_Sub13.method1992(var6 - 512, -1368989717).method2445(aBool1076, 1973751707)) {
						var11 = true;
					}
				}

				if (var11) {
					if (aLong1079 * -6395115381279365879L != -1L) {
						var17 = (Class117_Sub22_Sub18_Sub7) aClass115_1075.method1515(aLong1079 * -6395115381279365879L);
					}

					if (var17 == null) {
						return null;
					}
				}

				if (var17 == null) {
					Class117_Sub22_Sub18_Sub4[] var19 = new Class117_Sub22_Sub18_Sub4[12];
					var6 = 0;

					int var10;
					for (int var13 = 0; var13 < 12; var13++) {
						var10 = var9[var13];
						Class117_Sub22_Sub18_Sub4 var15;
						if (var10 >= 256 && var10 < 512) {
							var15 = Class6.method113(var10 - 256, -1510407238).method2520(836845024);
							if (var15 != null) {
								var19[var6++] = var15;
							}
						}

						if (var10 >= 512) {
							var15 = Class117_Sub13.method1992(var10 - 512, 1459145449).method2460(aBool1076, (byte) 0);
							if (var15 != null) {
								var19[var6++] = var15;
							}
						}
					}

					Class117_Sub22_Sub18_Sub4 var18 = new Class117_Sub22_Sub18_Sub4(var19, var6);

					for (var10 = 0; var10 < 5; var10++) {
						if (anIntArray1081[var10] < Class87.aShortArrayArray1019[var10].length) {
							var18.method3168(aShortArray1080[var10], Class87.aShortArrayArray1019[var10][anIntArray1081[var10]]);
						}

						if (anIntArray1081[var10] < Class25.aShortArrayArray318[var10].length) {
							var18.method3168(aShortArray1074[var10], Class25.aShortArrayArray318[var10][anIntArray1081[var10]]);
						}
					}

					var17 = var18.method3183(64, 850, -30, -50, -30);
					aClass115_1075.method1517(var17, var7);
					aLong1079 = 3860516262617168185L * var7;
				}
			}

			if (var1 == null && var3 == null) {
				return var17;
			} else {
				Class117_Sub22_Sub18_Sub7 var16;
				if (var1 != null && var3 != null) {
					var16 = var1.method2639(var17, var2, var3, var4, -1067518943);
				} else if (var1 != null) {
					var16 = var1.method2636(var17, var2, -1919271714);
				} else {
					var16 = var3.method2636(var17, var4, 1277053704);
				}

				return var16;
			}
		}
	}

}
