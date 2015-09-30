package core.Jagex;
import java.awt.*;

public class Class117_Sub22_Sub10 extends Class117_Sub22 {

	public static int anInt2299;
	static Class106 aClass106_2304;
	static Class117_Sub22_Sub17_Sub3[] aClass117_Sub22_Sub17_Sub3Array2307;
	static final int anInt2308 = 35;
	public static final int anInt2309 = 191;
	public static final int anInt2310 = 1;
	public int anInt2296 = -445461531;
	int[] anIntArray2300;
	public boolean aBool2297 = false;
	short[] aShortArray2301;
	short[] aShortArray2302;
	short[] aShortArray2303;
	short[] aShortArray2305;
	static Class115 aClass115_2298 = new Class115(64);
	int[] anIntArray2306 = new int[]{-1, -1, -1, -1, -1};

	public Class117_Sub22_Sub18_Sub4 method2520(int var1) {
		if (anIntArray2300 == null) {
			return null;
		} else {
			Class117_Sub22_Sub18_Sub4[] var2 = new Class117_Sub22_Sub18_Sub4[anIntArray2300.length];

			for (int var3 = 0; var3 < anIntArray2300.length; var3++) {
				var2[var3] = Class117_Sub22_Sub18_Sub4.method3155(Class59.aClass106_758, anIntArray2300[var3], 0);
			}

			Class117_Sub22_Sub18_Sub4 var5;
			if (var2.length == 1) {
				var5 = var2[0];
			} else {
				var5 = new Class117_Sub22_Sub18_Sub4(var2, var2.length);
			}

			int var4;
			if (aShortArray2301 != null) {
				for (var4 = 0; var4 < aShortArray2301.length; var4++) {
					var5.method3168(aShortArray2301[var4], aShortArray2302[var4]);
				}
			}

			if (aShortArray2303 != null) {
				for (var4 = 0; var4 < aShortArray2303.length; var4++) {
					var5.method3220(aShortArray2303[var4], aShortArray2305[var4]);
				}
			}

			return var5;
		}
	}

	void method2521(Class117_Sub14 var1, int var2, int var3) {
		if (var2 == 1) {
			anInt2296 = var1.method2010(-1439707937) * 445461531;
		} else {
			int var4;
			int var5;
			if (var2 == 2) {
				var5 = var1.method2010(-1439707937);
				anIntArray2300 = new int[var5];

				for (var4 = 0; var4 < var5; var4++) {
					anIntArray2300[var4] = var1.method2012(1053511631);
				}
			} else if (var2 == 3) {
				aBool2297 = true;
			} else if (var2 == 40) {
				var5 = var1.method2010(-1439707937);
				aShortArray2301 = new short[var5];
				aShortArray2302 = new short[var5];

				for (var4 = 0; var4 < var5; var4++) {
					aShortArray2301[var4] = (short) var1.method2012(1053511631);
					aShortArray2302[var4] = (short) var1.method2012(1053511631);
				}
			} else if (var2 == 41) {
				var5 = var1.method2010(-1439707937);
				aShortArray2303 = new short[var5];
				aShortArray2305 = new short[var5];

				for (var4 = 0; var4 < var5; var4++) {
					aShortArray2303[var4] = (short) var1.method2012(1053511631);
					aShortArray2305[var4] = (short) var1.method2012(1053511631);
				}
			} else if (var2 >= 60 && var2 < 70) {
				anIntArray2306[var2 - 60] = var1.method2012(1053511631);
			}
		}

	}

	public boolean method2522(byte var1) {
		if (anIntArray2300 != null) {
			boolean var2 = true;

			for (int var3 = 0; var3 < anIntArray2300.length; var3++) {
				if (!Class59.aClass106_758.method1382(anIntArray2300[var3], 0, (byte) 18)) {
					var2 = false;
				}
			}

			return var2;
		} else {
			return true;
		}
	}

	void method2523(Class117_Sub14 var1, byte var2) {
		while (true) {
			int var3 = var1.method2010(-1439707937);
			if (var3 == 0) {
				if (var2 >= 0) {
					return;
				}

				return;
			}

			method2521(var1, var3, 1447480722);
		}
	}

	public boolean method2524(int var1) {
		boolean var2 = true;

		for (int var3 = 0; var3 < 5; var3++) {
			if (anIntArray2306[var3] != -1 && !Class59.aClass106_758.method1382(anIntArray2306[var3], 0, (byte) -45)) {
				var2 = false;
			}
		}

		return var2;
	}

	public Class117_Sub22_Sub18_Sub4 method2525(int var1) {
		Class117_Sub22_Sub18_Sub4[] var2 = new Class117_Sub22_Sub18_Sub4[5];
		int var5 = 0;

		for (int var4 = 0; var4 < 5; var4++) {
			if (anIntArray2306[var4] != -1) {
				var2[var5++] = Class117_Sub22_Sub18_Sub4.method3155(Class59.aClass106_758, anIntArray2306[var4], 0);
			}
		}

		Class117_Sub22_Sub18_Sub4 var6 = new Class117_Sub22_Sub18_Sub4(var2, var5);
		int var3;
		if (aShortArray2301 != null) {
			for (var3 = 0; var3 < aShortArray2301.length; var3++) {
				var6.method3168(aShortArray2301[var3], aShortArray2302[var3]);
			}
		}

		if (aShortArray2303 != null) {
			for (var3 = 0; var3 < aShortArray2303.length; var3++) {
				var6.method3220(aShortArray2303[var3], aShortArray2305[var3]);
			}
		}

		return var6;
	}

	public static String method2538(byte[] var0, int var1, int var2, int var3) {
		StringBuilder var4 = new StringBuilder();

		for (int var5 = var1; var5 < var2 + var1; var5 += 3) {
			int var8 = var0[var5] & 255;
			var4.append(Class99.aCharArray1139[var8 >>> 2]);
			if (var5 < var2 - 1) {
				int var7 = var0[1 + var5] & 255;
				var4.append(Class99.aCharArray1139[(var8 & 3) << 4 | var7 >>> 4]);
				if (var5 < var2 - 2) {
					int var6 = var0[2 + var5] & 255;
					var4.append(Class99.aCharArray1139[(var7 & 15) << 2 | var6 >>> 6]).append(Class99.aCharArray1139[var6 & 63]);
				} else {
					var4.append(Class99.aCharArray1139[(var7 & 15) << 2]).append("=");
				}
			} else {
				var4.append(Class99.aCharArray1139[(var8 & 3) << 4]).append("==");
			}
		}

		return var4.toString();
	}

	static String method2542(String var0, Class117_Sub19 var1, int var2) {
		if (var0.indexOf("%") != -1) {
			int var3;
			for (var3 = 1; var3 <= 5; var3++) {
				while (true) {
					int var4 = var0.indexOf("%" + var3);
					if (var4 == -1) {
						break;
					}

					String var5 = var0.substring(0, var4);
					int var6 = Class62.method926(var1, var3 - 1, -2041144171);
					String var7;
					if (var6 < 999999999) {
						var7 = Integer.toString(var6);
					} else {
						var7 = "*";
					}

					var0 = var5 + var7 + var0.substring(var4 + 2);
				}
			}

			while (true) {
				var3 = var0.indexOf("%dns");
				if (var3 == -1) {
					break;
				}

				String var8 = "";
				if (Class41.aClass72_518 != null) {
					var8 = Class65.method950(Class41.aClass72_518.anInt872, 184523742);
					if (Class41.aClass72_518.anObject874 != null) {
						var8 = (String) Class41.aClass72_518.anObject874;
					}
				}

				var0 = var0.substring(0, var3) + var8 + var0.substring(var3 + 4);
			}
		}

		return var0;
	}

	public static Class14 method2545(Class77 var0, Component var1, int var2, int var3, int var4) {
		if (Class14.anInt170 * -1211689641 == 0) {
			throw new IllegalStateException();
		} else if (var2 >= 0 && var2 < 2) {
			if (var3 < 256) {
				var3 = 256;
			}

			try {
				Class14_Sub1 var8 = new Class14_Sub1();
				var8.anIntArray155 = new int[256 * (Class130.aBool1588 ? 2 : 1)];
				var8.anInt166 = var3 * 427217797;
				var8.method297(var1);
				var8.anInt163 = (1024 + (var3 & -1024)) * 532156321;
				if (var8.anInt163 * 1536791649 > 16384) {
					var8.anInt163 = 65552384;
				}

				var8.method250(var8.anInt163 * 1536791649);
				if (Class14.anInt156 * -2064433319 > 0 && Class32.aClass17_408 == null) {
					Class32.aClass17_408 = new Class17();
					Class32.aClass17_408.aClass77_211 = var0;
					var0.method1065(Class32.aClass17_408, Class14.anInt156 * -2064433319, -1485720289);
				}

				if (Class32.aClass17_408 != null) {
					if (Class32.aClass17_408.aClass14Array213[var2] != null) {
						throw new IllegalArgumentException();
					}

					Class32.aClass17_408.aClass14Array213[var2] = var8;
				}

				return var8;
			} catch (Throwable var7) {
				try {
					Class14_Sub2 var5 = new Class14_Sub2(var0, var2);
					var5.anIntArray155 = new int[256 * (Class130.aBool1588 ? 2 : 1)];
					var5.anInt166 = var3 * 427217797;
					var5.method297(var1);
					var5.anInt163 = 65552384;
					var5.method250(var5.anInt163 * 1536791649);
					if (Class14.anInt156 * -2064433319 > 0 && Class32.aClass17_408 == null) {
						Class32.aClass17_408 = new Class17();
						Class32.aClass17_408.aClass77_211 = var0;
						var0.method1065(Class32.aClass17_408, Class14.anInt156 * -2064433319, -1695551244);
					}

					if (Class32.aClass17_408 != null) {
						if (Class32.aClass17_408.aClass14Array213[var2] != null) {
							throw new IllegalArgumentException();
						}

						Class32.aClass17_408.aClass14Array213[var2] = var5;
					}

					return var5;
				} catch (Throwable var6) {
					return new Class14();
				}
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	static void method2546(int var0, int var1, int var2, int var3, byte var4) {
		if (GameClient.anInt3071 * -339828245 == 0 && !GameClient.aBool3074) {
			Class81.method1109(Class108.aString1370, "", 23, 0, var0 - var2, var1 - var3, -1073998897);
		}

		int var10 = -1;
		int var11 = -1;

		int var14;
		int var18;
		for (var18 = 0; var18 < Class117_Sub22_Sub18_Sub7.anInt2772; var18++) {
			var14 = Class117_Sub22_Sub18_Sub7.anIntArray2790[var18];
			int var8 = var14 & 127;
			int var9 = var14 >> 7 & 127;
			int var13 = var14 >> 29 & 3;
			int var15 = var14 >> 14 & 32767;
			if (var14 != var11) {
				var11 = var14;
				if (var13 == 2 && Class117_Sub13.aClass42_1875.method569(Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, var8, var9, var14) >= 0) {
					Class117_Sub22_Sub13 var16 = Class63.method928(var15, -1844137485);
					if (var16.anIntArray2387 != null) {
						var16 = var16.method2600(-1056012548);
					}

					if (var16 == null) {
						continue;
					}

					if (GameClient.anInt3071 * -339828245 == 1) {
						Class81.method1109(Class108.aString1326, GameClient.aString3058 + " " + Class39.aString481 + " " + Class117_Sub22_Sub12.method2584(65535, 668388556) + var16.aString2356, 1, var14, var8, var9, -1932997955);
					} else if (GameClient.aBool3074) {
						if ((Class25.anInt311 * 746665735 & 4) == 4) {
							Class81.method1109(GameClient.aString2931, GameClient.aString3078 + " " + Class39.aString481 + " " + Class117_Sub22_Sub12.method2584(65535, 668388556) + var16.aString2356, 2, var14, var8, var9, -1033930958);
						}
					} else {
						String[] var12 = var16.aStringArray2373;
						if (GameClient.aBool3090) {
							var12 = Class69.method968(var12, (short) 32368);
						}

						if (var12 != null) {
							for (int var6 = 4; var6 >= 0; --var6) {
								if (var12[var6] != null) {
									short var7 = 0;
									if (var6 == 0) {
										var7 = 3;
									}

									if (var6 == 1) {
										var7 = 4;
									}

									if (var6 == 2) {
										var7 = 5;
									}

									if (var6 == 3) {
										var7 = 6;
									}

									if (var6 == 4) {
										var7 = 1001;
									}

									Class81.method1109(var12[var6], Class117_Sub22_Sub12.method2584(65535, 668388556) + var16.aString2356, var7, var14, var8, var9, -1275332195);
								}
							}
						}

						Class81.method1109(Class108.aString1351, Class117_Sub22_Sub12.method2584(65535, 668388556) + var16.aString2356, 1002, var16.anInt2380 * -669809987 << 14, var8, var9, -1038402762);
					}
				}

				Class117_Sub22_Sub18_Sub1_Sub2 var5;
				Class117_Sub22_Sub18_Sub1_Sub1 var20;
				int[] var21;
				int var24;
				int var26;
				if (var13 == 1) {
					Class117_Sub22_Sub18_Sub1_Sub1 var28 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[var15];
					if (var28 == null) {
						continue;
					}

					if (var28.aClass117_Sub22_Sub5_2864.anInt2198 * -1941498503 == 1 && (var28.anInt2577 * 1961555871 & 127) == 64 && (var28.anInt2567 * -184603173 & 127) == 64) {
						for (var26 = 0; var26 < GameClient.anInt2956 * -434472087; var26++) {
							var20 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[GameClient.anIntArray2957[var26]];
							if (var20 != null && var20 != var28 && var20.aClass117_Sub22_Sub5_2864.anInt2198 * -1941498503 == 1 && var20.anInt2577 * 1961555871 == var28.anInt2577 * 1961555871 && var20.anInt2567 * -184603173 == var28.anInt2567 * -184603173) {
								Class4.method86(var20.aClass117_Sub22_Sub5_2864, GameClient.anIntArray2957[var26], var8, var9, 844048354);
							}
						}

						var26 = Class4.anInt46 * -1915182763;
						var21 = Class4.anIntArray41;

						for (var24 = 0; var24 < var26; var24++) {
							var5 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var21[var24]];
							if (var5 != null && var28.anInt2577 * 1961555871 == var5.anInt2577 * 1961555871 && var5.anInt2567 * -184603173 == var28.anInt2567 * -184603173) {
								Class32.method469(var5, var21[var24], var8, var9, (byte) 0);
							}
						}
					}

					Class4.method86(var28.aClass117_Sub22_Sub5_2864, var15, var8, var9, 784878866);
				}

				if (var13 == 0) {
					Class117_Sub22_Sub18_Sub1_Sub2 var29 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var15];
					if (var29 == null) {
						continue;
					}

					if ((var29.anInt2577 * 1961555871 & 127) == 64 && (var29.anInt2567 * -184603173 & 127) == 64) {
						for (var26 = 0; var26 < GameClient.anInt2956 * -434472087; var26++) {
							var20 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[GameClient.anIntArray2957[var26]];
							if (var20 != null && var20.aClass117_Sub22_Sub5_2864.anInt2198 * -1941498503 == 1 && var29.anInt2577 * 1961555871 == var20.anInt2577 * 1961555871 && var20.anInt2567 * -184603173 == var29.anInt2567 * -184603173) {
								Class4.method86(var20.aClass117_Sub22_Sub5_2864, GameClient.anIntArray2957[var26], var8, var9, -812273557);
							}
						}

						var26 = Class4.anInt46 * -1915182763;
						var21 = Class4.anIntArray41;

						for (var24 = 0; var24 < var26; var24++) {
							var5 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var21[var24]];
							if (var5 != null && var29 != var5 && var29.anInt2577 * 1961555871 == var5.anInt2577 * 1961555871 && var5.anInt2567 * -184603173 == var29.anInt2567 * -184603173) {
								Class32.method469(var5, var21[var24], var8, var9, (byte) 0);
							}
						}
					}

					if (var15 != GameClient.anInt3084 * 833823819) {
						Class32.method469(var29, var15, var8, var9, (byte) 0);
					} else {
						var10 = var14;
					}
				}

				if (var13 == 3) {
					Class120 var30 = GameClient.aClass120ArrayArrayArray3051[Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421][var8][var9];
					if (var30 != null) {
						for (Class117_Sub22_Sub18_Sub2 var27 = (Class117_Sub22_Sub18_Sub2) var30.method1573(); var27 != null; var27 = (Class117_Sub22_Sub18_Sub2) var30.method1583()) {
							Class117_Sub22_Sub6 var22 = Class117_Sub13.method1992(var27.anInt2607 * -604636939, -952901749);
							if (GameClient.anInt3071 * -339828245 == 1) {
								Class81.method1109(Class108.aString1326, GameClient.aString3058 + " " + Class39.aString481 + " " + Class117_Sub22_Sub12.method2584(16748608, 668388556) + var22.aString2264, 16, var27.anInt2607 * -604636939, var8, var9, -1754577797);
							} else if (GameClient.aBool3074) {
								if ((Class25.anInt311 * 746665735 & 1) == 1) {
									Class81.method1109(GameClient.aString2931, GameClient.aString3078 + " " + Class39.aString481 + " " + Class117_Sub22_Sub12.method2584(16748608, 668388556) + var22.aString2264, 17, var27.anInt2607 * -604636939, var8, var9, -1005457049);
								}
							} else {
								String[] var25 = var22.aStringArray2242;
								if (GameClient.aBool3090) {
									var25 = Class69.method968(var25, (short) 8680);
								}

								for (int var19 = 4; var19 >= 0; --var19) {
									if (var25 != null && var25[var19] != null) {
										byte var17 = 0;
										if (var19 == 0) {
											var17 = 18;
										}

										if (var19 == 1) {
											var17 = 19;
										}

										if (var19 == 2) {
											var17 = 20;
										}

										if (var19 == 3) {
											var17 = 21;
										}

										if (var19 == 4) {
											var17 = 22;
										}

										Class81.method1109(var25[var19], Class117_Sub22_Sub12.method2584(16748608, 668388556) + var22.aString2264, var17, var27.anInt2607 * -604636939, var8, var9, -1891628662);
									} else if (var19 == 2) {
										Class81.method1109(Class108.aString1246, Class117_Sub22_Sub12.method2584(16748608, 668388556) + var22.aString2264, 20, var27.anInt2607 * -604636939, var8, var9, -993372884);
									}
								}

								Class81.method1109(Class108.aString1351, Class117_Sub22_Sub12.method2584(16748608, 668388556) + var22.aString2264, 1004, var27.anInt2607 * -604636939, var8, var9, -858979079);
							}
						}
					}
				}
			}
		}

		if (var10 != -1) {
			var18 = var10 & 127;
			var14 = var10 >> 7 & 127;
			Class117_Sub22_Sub18_Sub1_Sub2 var23 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[GameClient.anInt3084 * 833823819];
			Class32.method469(var23, GameClient.anInt3084 * 833823819, var18, var14, (byte) 0);
		}

	}

	public static void method2547(boolean var0, byte var1) {
		if (Class7.aBool100 != var0) {
			Class77.method1069(-2146719429);
			Class7.aBool100 = var0;
		}

	}

	static void method2549(int var0) {
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var9;
		int var10;
		int var30;
		if (GameClient.incomingMessageId * 712029253 == 103) {
			var30 = GameClient.aClass117_Sub14_Sub1_2953.method2045((byte) 17);
			var2 = GameClient.aClass117_Sub14_Sub1_2953.method2038(-151205957);
			var5 = Class84.anInt991 * 513720477 + (var2 >> 4 & 7);
			var9 = Class44.anInt593 * 759182369 + (var2 & 7);
			var3 = GameClient.aClass117_Sub14_Sub1_2953.method2176(253851595);
			var4 = var3 >> 2;
			var6 = var3 & 3;
			var10 = GameClient.anIntArray3027[var4];
			if (var5 >= 0 && var9 >= 0 && var5 < 104 && var9 < 104) {
				Class20.method350(Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, var5, var9, var10, var30, var4, var6, 0, -1, 1611732647);
			}

		} else {
			int var11;
			int var12;
			int var13;
			if (GameClient.incomingMessageId * 712029253 == 163) {
				byte var1 = GameClient.aClass117_Sub14_Sub1_2953.method2041(-1338661409);
				var2 = GameClient.aClass117_Sub14_Sub1_2953.method2045((byte) 83);
				var5 = GameClient.aClass117_Sub14_Sub1_2953.method2050((byte) -1);
				var9 = var5 >> 2;
				var3 = var5 & 3;
				var4 = GameClient.anIntArray3027[var9];
				var6 = GameClient.aClass117_Sub14_Sub1_2953.method2045((byte) 29);
				var10 = GameClient.aClass117_Sub14_Sub1_2953.method2176(1044144466);
				var12 = Class84.anInt991 * 513720477 + (var10 >> 4 & 7);
				var13 = (var10 & 7) + Class44.anInt593 * 759182369;
				var11 = GameClient.aClass117_Sub14_Sub1_2953.method2045((byte) 115);
				byte var7 = GameClient.aClass117_Sub14_Sub1_2953.method1997(1576512744);
				byte var28 = GameClient.aClass117_Sub14_Sub1_2953.method1998((short) 27980);
				int var14 = GameClient.aClass117_Sub14_Sub1_2953.method2046(-2146381276);
				byte var8 = GameClient.aClass117_Sub14_Sub1_2953.method2110(1053511631);
				Class117_Sub22_Sub18_Sub1_Sub2 var15;
				if (GameClient.anInt3042 * 610133147 == var14) {
					var15 = Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393;
				} else {
					var15 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var14];
				}

				if (var15 != null) {
					Class117_Sub22_Sub13 var18 = Class63.method928(var6, 2071952709);
					int var16;
					int var19;
					if (var3 != 1 && var3 != 3) {
						var16 = var18.anInt2346 * -1473224837;
						var19 = var18.anInt2396 * 817158555;
					} else {
						var16 = var18.anInt2396 * 817158555;
						var19 = var18.anInt2346 * -1473224837;
					}

					int var17 = (var16 >> 1) + var12;
					int var20 = (var16 + 1 >> 1) + var12;
					int var21 = var13 + (var19 >> 1);
					int var29 = (var19 + 1 >> 1) + var13;
					int[][] var22 = Class31.anIntArrayArrayArray381[Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421];
					int var25 = var22[var20][var29] + var22[var17][var21] + var22[var20][var21] + var22[var17][var29] >> 2;
					int var23 = (var12 << 7) + (var16 << 6);
					int var24 = (var19 << 6) + (var13 << 7);
					Class117_Sub22_Sub18_Sub7 var26 = var18.method2618(var9, var3, var22, var23, var25, var24, 1540571401);
					if (var26 != null) {
						Class20.method350(Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, var12, var13, var4, -1, 0, 0, 1 + var2, var11 + 1, 788744286);
						var15.anInt2892 = (GameClient.anInt2923 * -488599663 + var2) * 1878504493;
						var15.anInt2878 = (GameClient.anInt2923 * -488599663 + var11) * 1084512299;
						var15.aClass117_Sub22_Sub18_Sub7_2882 = var26;
						var15.anInt2893 = var16 * 467176000 + var12 * 934352000;
						var15.anInt2881 = var13 * 298642816 + var19 * 149321408;
						var15.anInt2875 = var25 * -1911804095;
						byte var27;
						if (var8 > var7) {
							var27 = var8;
							var8 = var7;
							var7 = var27;
						}

						if (var1 > var28) {
							var27 = var1;
							var1 = var28;
							var28 = var27;
						}

						var15.anInt2889 = (var8 + var12) * 1916504119;
						var15.anInt2885 = (var7 + var12) * -1600137683;
						var15.anInt2884 = (var1 + var13) * -1488090665;
						var15.anInt2886 = (var28 + var13) * -1216070663;
					}
				}
			}

			if (GameClient.incomingMessageId * 712029253 == 106) {
				var30 = GameClient.aClass117_Sub14_Sub1_2953.method2010(-1439707937);
				var2 = Class84.anInt991 * 513720477 + (var30 >> 4 & 7);
				var5 = Class44.anInt593 * 759182369 + (var30 & 7);
				var9 = var2 + GameClient.aClass117_Sub14_Sub1_2953.method1997(-1115178656);
				var3 = var5 + GameClient.aClass117_Sub14_Sub1_2953.method1997(-16836612);
				var4 = GameClient.aClass117_Sub14_Sub1_2953.method2013(1511075930);
				var6 = GameClient.aClass117_Sub14_Sub1_2953.method2012(1053511631);
				var10 = GameClient.aClass117_Sub14_Sub1_2953.method2010(-1439707937) * 4;
				var12 = GameClient.aClass117_Sub14_Sub1_2953.method2010(-1439707937) * 4;
				var13 = GameClient.aClass117_Sub14_Sub1_2953.method2012(1053511631);
				var11 = GameClient.aClass117_Sub14_Sub1_2953.method2012(1053511631);
				int var35 = GameClient.aClass117_Sub14_Sub1_2953.method2010(-1439707937);
				int var42 = GameClient.aClass117_Sub14_Sub1_2953.method2010(-1439707937);
				if (var2 >= 0 && var5 >= 0 && var2 < 104 && var5 < 104 && var9 >= 0 && var3 >= 0 && var9 < 104 && var3 < 104 && var6 != 65535) {
					var2 = var2 * 128 + 64;
					var5 = var5 * 128 + 64;
					var9 = 64 + var9 * 128;
					var3 = var3 * 128 + 64;
					Class117_Sub22_Sub18_Sub5 var41 = new Class117_Sub22_Sub18_Sub5(var6, Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, var2, var5, Class44.method729(var2, var5, Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, -1780821098) - var10, var13 + GameClient.anInt2923 * -488599663, GameClient.anInt2923 * -488599663 + var11, var35, var42, var4, var12);
					var41.method3345(var9, var3, Class44.method729(var9, var3, Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, 248778109) - var12, var13 + GameClient.anInt2923 * -488599663, 1806258228);
					GameClient.aClass120_3186.method1575(var41);
				}

			} else {
				if (GameClient.incomingMessageId * 712029253 == 249) {
					var30 = GameClient.aClass117_Sub14_Sub1_2953.method2010(-1439707937);
					var2 = (var30 >> 4 & 7) + Class84.anInt991 * 513720477;
					var5 = (var30 & 7) + Class44.anInt593 * 759182369;
					var9 = GameClient.aClass117_Sub14_Sub1_2953.method2012(1053511631);
					var3 = GameClient.aClass117_Sub14_Sub1_2953.method2010(-1439707937);
					var4 = var3 >> 4 & 15;
					var6 = var3 & 7;
					var10 = GameClient.aClass117_Sub14_Sub1_2953.method2010(-1439707937);
					if (var2 >= 0 && var5 >= 0 && var2 < 104 && var5 < 104) {
						var12 = 1 + var4;
						if (Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anIntArray2594[0] >= var2 - var12 && Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anIntArray2594[0] <= var2 + var12 && Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anIntArray2541[0] >= var5 - var12 && Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anIntArray2541[0] <= var12 + var5 && GameClient.anInt2948 * 1581116715 != 0 && var6 > 0 && GameClient.anInt3162 * 1572335207 < 50) {
							GameClient.anIntArray3163[GameClient.anInt3162 * 1572335207] = var9;
							GameClient.anIntArray3164[GameClient.anInt3162 * 1572335207] = var6;
							GameClient.anIntArray3165[GameClient.anInt3162 * 1572335207] = var10;
							GameClient.aClass10Array3067[GameClient.anInt3162 * 1572335207] = null;
							GameClient.anIntArray2959[GameClient.anInt3162 * 1572335207] = var4 + (var5 << 8) + (var2 << 16);
							GameClient.anInt3162 += 1850690903;
						}
					}
				}

				Class117_Sub22_Sub18_Sub2 var32;
				if (GameClient.incomingMessageId * 712029253 == 156) {
					var30 = GameClient.aClass117_Sub14_Sub1_2953.method2176(-1835673478);
					var2 = (var30 >> 4 & 7) + Class84.anInt991 * 513720477;
					var5 = (var30 & 7) + Class44.anInt593 * 759182369;
					var9 = GameClient.aClass117_Sub14_Sub1_2953.method2186((byte) 41);
					var3 = GameClient.aClass117_Sub14_Sub1_2953.method2186((byte) 119);
					if (var2 >= 0 && var5 >= 0 && var2 < 104 && var5 < 104) {
						var32 = new Class117_Sub22_Sub18_Sub2();
						var32.anInt2607 = var3 * -2038107299;
						var32.anInt2608 = var9 * -21847889;
						if (GameClient.aClass120ArrayArrayArray3051[Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421][var2][var5] == null) {
							GameClient.aClass120ArrayArrayArray3051[Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421][var2][var5] = new Class120();
						}

						GameClient.aClass120ArrayArrayArray3051[Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421][var2][var5].method1575(var32);
						Class41.method534(var2, var5, 1728960765);
					}

				} else if (GameClient.incomingMessageId * 712029253 == 197) {
					var30 = GameClient.aClass117_Sub14_Sub1_2953.method2050((byte) -50);
					var2 = Class84.anInt991 * 513720477 + (var30 >> 4 & 7);
					var5 = Class44.anInt593 * 759182369 + (var30 & 7);
					var9 = GameClient.aClass117_Sub14_Sub1_2953.method2045((byte) 87);
					if (var2 >= 0 && var5 >= 0 && var2 < 104 && var5 < 104) {
						Class120 var31 = GameClient.aClass120ArrayArrayArray3051[Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421][var2][var5];
						if (var31 != null) {
							for (var32 = (Class117_Sub22_Sub18_Sub2) var31.method1577(); var32 != null; var32 = (Class117_Sub22_Sub18_Sub2) var31.method1582()) {
								if ((var9 & 32767) == var32.anInt2607 * -604636939) {
									var32.method1532();
									break;
								}
							}

							if (var31.method1577() == null) {
								GameClient.aClass120ArrayArrayArray3051[Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421][var2][var5] = null;
							}

							Class41.method534(var2, var5, 1728960765);
						}
					}

				} else if (GameClient.incomingMessageId * 712029253 == 101) {
					var30 = GameClient.aClass117_Sub14_Sub1_2953.method2010(-1439707937);
					var2 = Class84.anInt991 * 513720477 + (var30 >> 4 & 7);
					var5 = (var30 & 7) + Class44.anInt593 * 759182369;
					var9 = GameClient.aClass117_Sub14_Sub1_2953.method2012(1053511631);
					var3 = GameClient.aClass117_Sub14_Sub1_2953.method2010(-1439707937);
					var4 = GameClient.aClass117_Sub14_Sub1_2953.method2012(1053511631);
					if (var2 >= 0 && var5 >= 0 && var2 < 104 && var5 < 104) {
						var2 = var2 * 128 + 64;
						var5 = var5 * 128 + 64;
						Class117_Sub22_Sub18_Sub3 var34 = new Class117_Sub22_Sub18_Sub3(var9, Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, var2, var5, Class44.method729(var2, var5, Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, -1551788781) - var3, var4, GameClient.anInt2923 * -488599663);
						GameClient.aClass120_3054.method1575(var34);
					}

				} else if (GameClient.incomingMessageId * 712029253 == 88) {
					var30 = GameClient.aClass117_Sub14_Sub1_2953.method2038(320717727);
					var2 = var30 >> 2;
					var5 = var30 & 3;
					var9 = GameClient.anIntArray3027[var2];
					var3 = GameClient.aClass117_Sub14_Sub1_2953.method2038(35889081);
					var4 = Class84.anInt991 * 513720477 + (var3 >> 4 & 7);
					var6 = Class44.anInt593 * 759182369 + (var3 & 7);
					if (var4 >= 0 && var6 >= 0 && var4 < 104 && var6 < 104) {
						Class20.method350(Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, var4, var6, var9, -1, var2, var5, 0, -1, 688661024);
					}

				} else if (GameClient.incomingMessageId * 712029253 == 27) {
					var30 = GameClient.aClass117_Sub14_Sub1_2953.method2012(1053511631);
					var2 = GameClient.aClass117_Sub14_Sub1_2953.method2050((byte) -12);
					var5 = var2 >> 2;
					var9 = var2 & 3;
					var3 = GameClient.anIntArray3027[var5];
					var4 = GameClient.aClass117_Sub14_Sub1_2953.method2176(-1099152976);
					var6 = (var4 >> 4 & 7) + Class84.anInt991 * 513720477;
					var10 = Class44.anInt593 * 759182369 + (var4 & 7);
					if (var6 >= 0 && var10 >= 0 && var6 < 103 && var10 < 103) {
						if (var3 == 0) {
							Class34 var37 = Class117_Sub13.aClass42_1875.method561(Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, var6, var10);
							if (var37 != null) {
								var13 = var37.anInt434 * -1198250067 >> 14 & 32767;
								if (var5 == 2) {
									var37.aClass117_Sub22_Sub18_430 = new Class117_Sub22_Sub18_Sub6(var13, 2, var9 + 4, Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, var6, var10, var30, false, var37.aClass117_Sub22_Sub18_430);
									var37.aClass117_Sub22_Sub18_431 = new Class117_Sub22_Sub18_Sub6(var13, 2, 1 + var9 & 3, Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, var6, var10, var30, false, var37.aClass117_Sub22_Sub18_431);
								} else {
									var37.aClass117_Sub22_Sub18_430 = new Class117_Sub22_Sub18_Sub6(var13, var5, var9, Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, var6, var10, var30, false, var37.aClass117_Sub22_Sub18_430);
								}
							}
						}

						if (var3 == 1) {
							Class40 var38 = Class117_Sub13.aClass42_1875.method562(Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, var6, var10);
							if (var38 != null) {
								var13 = var38.anInt500 * -53022023 >> 14 & 32767;
								if (var5 != 4 && var5 != 5) {
									if (var5 == 6) {
										var38.aClass117_Sub22_Sub18_496 = new Class117_Sub22_Sub18_Sub6(var13, 4, var9 + 4, Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, var6, var10, var30, false, var38.aClass117_Sub22_Sub18_496);
									} else if (var5 == 7) {
										var38.aClass117_Sub22_Sub18_496 = new Class117_Sub22_Sub18_Sub6(var13, 4, 4 + (2 + var9 & 3), Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, var6, var10, var30, false, var38.aClass117_Sub22_Sub18_496);
									} else if (var5 == 8) {
										var38.aClass117_Sub22_Sub18_496 = new Class117_Sub22_Sub18_Sub6(var13, 4, 4 + var9, Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, var6, var10, var30, false, var38.aClass117_Sub22_Sub18_496);
										var38.aClass117_Sub22_Sub18_501 = new Class117_Sub22_Sub18_Sub6(var13, 4, 4 + (var9 + 2 & 3), Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, var6, var10, var30, false, var38.aClass117_Sub22_Sub18_501);
									}
								} else {
									var38.aClass117_Sub22_Sub18_496 = new Class117_Sub22_Sub18_Sub6(var13, 4, var9, Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, var6, var10, var30, false, var38.aClass117_Sub22_Sub18_496);
								}
							}
						}

						if (var3 == 2) {
							Class23 var39 = Class117_Sub13.aClass42_1875.method563(Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, var6, var10);
							if (var5 == 11) {
								var5 = 10;
							}

							if (var39 != null) {
								var39.aClass117_Sub22_Sub18_276 = new Class117_Sub22_Sub18_Sub6(var39.anInt289 * -1026555351 >> 14 & 32767, var5, var9, Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, var6, var10, var30, false, var39.aClass117_Sub22_Sub18_276);
							}
						}

						if (var3 == 3) {
							Class27 var40 = Class117_Sub13.aClass42_1875.method564(Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, var6, var10);
							if (var40 != null) {
								var40.aClass117_Sub22_Sub18_339 = new Class117_Sub22_Sub18_Sub6(var40.anInt340 * 1337438803 >> 14 & 32767, 22, var9, Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, var6, var10, var30, false, var40.aClass117_Sub22_Sub18_339);
							}
						}
					}

				} else if (GameClient.incomingMessageId * 712029253 == 80) {
					var30 = GameClient.aClass117_Sub14_Sub1_2953.method2010(-1439707937);
					var2 = (var30 >> 4 & 7) + Class84.anInt991 * 513720477;
					var5 = (var30 & 7) + Class44.anInt593 * 759182369;
					var9 = GameClient.aClass117_Sub14_Sub1_2953.method2012(1053511631);
					var3 = GameClient.aClass117_Sub14_Sub1_2953.method2012(1053511631);
					var4 = GameClient.aClass117_Sub14_Sub1_2953.method2012(1053511631);
					if (var2 >= 0 && var5 >= 0 && var2 < 104 && var5 < 104) {
						Class120 var33 = GameClient.aClass120ArrayArrayArray3051[Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421][var2][var5];
						if (var33 != null) {
							for (Class117_Sub22_Sub18_Sub2 var36 = (Class117_Sub22_Sub18_Sub2) var33.method1577(); var36 != null; var36 = (Class117_Sub22_Sub18_Sub2) var33.method1582()) {
								if ((var9 & 32767) == var36.anInt2607 * -604636939 && var36.anInt2608 * -493046193 == var3) {
									var36.anInt2608 = var4 * -21847889;
									break;
								}
							}

							Class41.method534(var2, var5, 1728960765);
						}
					}

				}
			}
		}
	}

}
