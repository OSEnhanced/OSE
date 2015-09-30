package core.Jagex;
import java.awt.*;

public final class Canvas_Sub1 extends Canvas {

	public static final int anInt2486 = 245;
	public static final int anInt2487 = 5;
	public static final int anInt2488 = 17;
	static int[] anIntArray2489;
	public static final int anInt2490 = 1;
	Component aComponent2491;

	static void method2956(int var0, int var1, int var2, int var3, byte var4) {
		GameClient.anInt3025 -= 1146099319;
		Class24.method398(Class5.aClass5_53, -2128055654);
		boolean var7 = false;
		int var9;
		int var15;
		if (GameClient.anInt3084 * 833823819 >= 0) {
			var15 = Class4.anInt46 * -1915182763;
			int[] var14 = Class4.anIntArray41;

			for (var9 = 0; var9 < var15; var9++) {
				if (var14[var9] == GameClient.anInt3084 * 833823819) {
					var7 = true;
					break;
				}
			}
		}

		if (var7) {
			Class24.method398(Class5.aClass5_54, -1433632245);
		}

		Class117_Sub18.method2267(true, -106283212);
		Class24.method398(var7 ? Class5.aClass5_55 : Class5.aClass5_56, -1311891210);
		Class117_Sub18.method2267(false, -106283212);

		for (Class117_Sub22_Sub18_Sub5 var32 = (Class117_Sub22_Sub18_Sub5) GameClient.aClass120_3186.method1577(); var32 != null; var32 = (Class117_Sub22_Sub18_Sub5) GameClient.aClass120_3186.method1582()) {
			if (Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421 == var32.anInt2723 * 1692484329 && GameClient.anInt2923 * -488599663 <= var32.anInt2729 * -1381906559) {
				if (GameClient.anInt2923 * -488599663 >= var32.anInt2728 * 813905381) {
					if (var32.anInt2736 * 635811343 > 0) {
						Class117_Sub22_Sub18_Sub1_Sub1 var30 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[var32.anInt2736 * 635811343 - 1];
						if (var30 != null && var30.anInt2577 * 1961555871 >= 0 && var30.anInt2577 * 1961555871 < 13312 && var30.anInt2567 * -184603173 >= 0 && var30.anInt2567 * -184603173 < 13312) {
							var32.method3345(var30.anInt2577 * 1961555871, var30.anInt2567 * -184603173, Class44.method729(var30.anInt2577 * 1961555871, var30.anInt2567 * -184603173, var32.anInt2723 * 1692484329, 1086811367) - var32.anInt2750 * 1192981865, GameClient.anInt2923 * -488599663, 1735103578);
						}
					}

					if (var32.anInt2736 * 635811343 < 0) {
						var9 = -(var32.anInt2736 * 635811343) - 1;
						Class117_Sub22_Sub18_Sub1_Sub2 var31;
						if (var9 == GameClient.anInt3042 * 610133147) {
							var31 = Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393;
						} else {
							var31 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var9];
						}

						if (var31 != null && var31.anInt2577 * 1961555871 >= 0 && var31.anInt2577 * 1961555871 < 13312 && var31.anInt2567 * -184603173 >= 0 && var31.anInt2567 * -184603173 < 13312) {
							var32.method3345(var31.anInt2577 * 1961555871, var31.anInt2567 * -184603173, Class44.method729(var31.anInt2577 * 1961555871, var31.anInt2567 * -184603173, var32.anInt2723 * 1692484329, -1494801216) - var32.anInt2750 * 1192981865, GameClient.anInt2923 * -488599663, 1564161176);
						}
					}

					var32.method3346(GameClient.anInt3092 * -402053703, (byte) 1);
					Class117_Sub13.aClass42_1875.method673(Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, (int) var32.aDouble2734, (int) var32.aDouble2731, (int) var32.aDouble2744, 60, var32, var32.anInt2732 * -2027208911, -1, false);
				}
			} else {
				var32.method1532();
			}
		}

		Class117_Sub22_Sub12.method2585((byte) 0);
		Class117_Sub12.method1982(var0, var1, var2, var3, true, (short) 8381);
		var0 = GameClient.anInt3126 * -530424257;
		var1 = GameClient.anInt3183 * 49932261;
		var2 = GameClient.anInt3142 * -910791425;
		var3 = GameClient.anInt3185 * -278001619;
		Class117_Sub22_Sub17.method2871(var0, var1, var0 + var2, var3 + var1);
		Class117_Sub22_Sub17_Sub1.method3095();
		int var33;
		if (!GameClient.aBool3168) {
			var15 = GameClient.anInt3004 * -1836712259;
			if (GameClient.anInt3063 * -488679193 / 256 > var15) {
				var15 = GameClient.anInt3063 * -488679193 / 256;
			}

			if (GameClient.aBoolArray3169[4] && GameClient.anIntArray3180[4] + 128 > var15) {
				var15 = GameClient.anIntArray3180[4] + 128;
			}

			var33 = GameClient.anInt2987 * 826775265 + GameClient.anInt3005 * -1204229987 & 2047;
			Class117_Sub22_Sub6.method2452(Class117_Sub12.anInt1854 * 1354878175, Class44.method729(Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2577 * 1961555871, Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2567 * -184603173, Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, 202704696) - GameClient.anInt3010 * -1599348097, Class54.anInt737 * -815988555, var15, var33, var15 * 3 + 600, (byte) 8);
		}

		int var8;
		int var12;
		int var13;
		int var16;
		int var18;
		int var19;
		int var21;
		if (!GameClient.aBool3168) {
			if (Class117_Sub22_Sub21.aClass33_2499.aBool418) {
				var33 = Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421;
			} else {
				label647:
				{
					var9 = 3;
					if (Class117_Sub5.anInt1758 * -1894076819 < 310) {
						var18 = Class76.anInt916 * 1355759835 >> 7;
						var19 = Class49.anInt665 * 1784829965 >> 7;
						var16 = Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2577 * 1961555871 >> 7;
						var8 = Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2567 * -184603173 >> 7;
						if (var18 < 0 || var19 < 0 || var18 >= 104 || var19 >= 104) {
							var33 = Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421;
							break label647;
						}

						if ((Class31.aByteArrayArrayArray401[Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421][var18][var19] & 4) != 0) {
							var9 = Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421;
						}

						if (var16 > var18) {
							var12 = var16 - var18;
						} else {
							var12 = var18 - var16;
						}

						if (var8 > var19) {
							var21 = var8 - var19;
						} else {
							var21 = var19 - var8;
						}

						int var22;
						if (var12 > var21) {
							var22 = var21 * 65536 / var12;
							var13 = 32768;

							while (var18 != var16) {
								if (var18 < var16) {
									++var18;
								} else if (var18 > var16) {
									--var18;
								}

								if ((Class31.aByteArrayArrayArray401[Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421][var18][var19] & 4) != 0) {
									var9 = Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421;
								}

								var13 += var22;
								if (var13 >= 65536) {
									var13 -= 65536;
									if (var19 < var8) {
										++var19;
									} else if (var19 > var8) {
										--var19;
									}

									if ((Class31.aByteArrayArrayArray401[Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421][var18][var19] & 4) != 0) {
										var9 = Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421;
									}
								}
							}
						} else {
							var22 = var12 * 65536 / var21;
							var13 = 32768;

							while (var19 != var8) {
								if (var19 < var8) {
									++var19;
								} else if (var19 > var8) {
									--var19;
								}

								if ((Class31.aByteArrayArrayArray401[Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421][var18][var19] & 4) != 0) {
									var9 = Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421;
								}

								var13 += var22;
								if (var13 >= 65536) {
									var13 -= 65536;
									if (var18 < var16) {
										++var18;
									} else if (var18 > var16) {
										--var18;
									}

									if ((Class31.aByteArrayArrayArray401[Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421][var18][var19] & 4) != 0) {
										var9 = Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421;
									}
								}
							}
						}
					}

					if (Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2577 * 1961555871 >= 0 && Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2567 * -184603173 >= 0 && Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2577 * 1961555871 < 13312 && Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2567 * -184603173 < 13312) {
						if ((Class31.aByteArrayArrayArray401[Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421][Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2577 * 1961555871 >> 7][Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2567 * -184603173 >> 7] & 4) != 0) {
							var9 = Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421;
						}

						var33 = var9;
					} else {
						var33 = Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421;
					}
				}
			}

			var15 = var33;
		} else {
			if (Class117_Sub22_Sub21.aClass33_2499.aBool418) {
				var33 = Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421;
			} else {
				var9 = Class44.method729(Class76.anInt916 * 1355759835, Class49.anInt665 * 1784829965, Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, -1538227746);
				if (var9 - Class117_Sub22_Sub1.anInt2143 * 716978923 < 800 && (Class31.aByteArrayArrayArray401[Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421][Class76.anInt916 * 1355759835 >> 7][Class49.anInt665 * 1784829965 >> 7] & 4) != 0) {
					var33 = Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421;
				} else {
					var33 = 3;
				}
			}

			var15 = var33;
		}

		var33 = Class76.anInt916 * 1355759835;
		var9 = Class117_Sub22_Sub1.anInt2143 * 716978923;
		var18 = Class49.anInt665 * 1784829965;
		var19 = Class117_Sub5.anInt1758 * -1894076819;
		var16 = RuntimeException_Sub1.anInt2838 * -1774046803;

		for (var8 = 0; var8 < 5; var8++) {
			if (GameClient.aBoolArray3169[var8]) {
				var12 = (int) (Math.random() * (double) (GameClient.anIntArray3170[var8] * 2 + 1) - (double) GameClient.anIntArray3170[var8] + Math.sin((double) GameClient.anIntArray3173[var8] * ((double) GameClient.anIntArray2946[var8] / 100.0D)) * (double) GameClient.anIntArray3180[var8]);
				if (var8 == 0) {
					Class76.anInt916 += var12 * 900381523;
				}

				if (var8 == 1) {
					Class117_Sub22_Sub1.anInt2143 += var12 * -1908957757;
				}

				if (var8 == 2) {
					Class49.anInt665 += var12 * 1734194885;
				}

				if (var8 == 3) {
					RuntimeException_Sub1.anInt2838 = (var12 + RuntimeException_Sub1.anInt2838 * -1774046803 & 2047) * -1646765531;
				}

				if (var8 == 4) {
					Class117_Sub5.anInt1758 += var12 * -631993499;
					if (Class117_Sub5.anInt1758 * -1894076819 < 128) {
						Class117_Sub5.anInt1758 = 709210752;
					}

					if (Class117_Sub5.anInt1758 * -1894076819 > 383) {
						Class117_Sub5.anInt1758 = -1535341541;
					}
				}
			}
		}

		var8 = Class75.anInt903 * -456706193;
		var12 = Class75.anInt904 * 1381104939;
		if (Class75.anInt909 * -393851667 != 0) {
			var8 = Class75.anInt915 * -664246003;
			var12 = Class75.anInt901 * 1538480085;
		}

		if (var8 >= var0 && var8 < var2 + var0 && var12 >= var1 && var12 < var3 + var1) {
			Class117_Sub22_Sub18_Sub7.aBool2774 = true;
			Class117_Sub22_Sub18_Sub7.anInt2772 = 0;
			Class117_Sub22_Sub18_Sub7.anInt2806 = var8 - var0;
			Class117_Sub22_Sub18_Sub7.anInt2820 = var12 - var1;
		} else {
			Class117_Sub22_Sub18_Sub7.aBool2774 = false;
			Class117_Sub22_Sub18_Sub7.anInt2772 = 0;
		}

		Class117_Sub13.method1989(-1001075450);
		Class117_Sub22_Sub17.method2877(var0, var1, var2, var3, 0);
		Class117_Sub13.method1989(-1001075450);
		var21 = Class117_Sub22_Sub17_Sub1.anInt2639;
		Class117_Sub22_Sub17_Sub1.anInt2639 = GameClient.anInt2944 * 1370366911;
		Class117_Sub13.aClass42_1875.method577(Class76.anInt916 * 1355759835, Class117_Sub22_Sub1.anInt2143 * 716978923, Class49.anInt665 * 1784829965, Class117_Sub5.anInt1758 * -1894076819, RuntimeException_Sub1.anInt2838 * -1774046803, var15);
		Class117_Sub22_Sub17_Sub1.anInt2639 = var21;
		Class117_Sub13.method1989(-1001075450);
		Class117_Sub13.aClass42_1875.method553();
		GameClient.anInt3014 = 0;
		boolean var35 = false;
		var13 = -1;
		int var17 = Class4.anInt46 * -1915182763;
		int[] var10 = Class4.anIntArray41;

		int var11;
		for (var11 = 0; var11 < GameClient.anInt2956 * -434472087 + var17; var11++) {
			Object var23;
			if (var11 < var17) {
				var23 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var10[var11]];
				if (var10[var11] == GameClient.anInt3084 * 833823819) {
					var35 = true;
					var13 = var11;
					continue;
				}
			} else {
				var23 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[GameClient.anIntArray2957[var11 - var17]];
			}

			Class8_Sub1.method1882((Class117_Sub22_Sub18_Sub1) var23, var11, var0, var1, var2, var3, 1293754438);
		}

		if (var35) {
			Class8_Sub1.method1882(GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[GameClient.anInt3084 * 833823819], var13, var0, var1, var2, var3, 2026416114);
		}

		for (var11 = 0; var11 < GameClient.anInt3014 * 1004179943; var11++) {
			int var36 = GameClient.anIntArray3016[var11];
			int var5 = GameClient.anIntArray3017[var11];
			int var24 = GameClient.anIntArray3007[var11];
			int var26 = GameClient.anIntArray3018[var11];
			boolean var27 = true;

			while (var27) {
				var27 = false;

				for (int var6 = 0; var6 < var11; var6++) {
					if (var5 + 2 > GameClient.anIntArray3017[var6] - GameClient.anIntArray3018[var6] && var5 - var26 < 2 + GameClient.anIntArray3017[var6] && var36 - var24 < GameClient.anIntArray3016[var6] + GameClient.anIntArray3007[var6] && var24 + var36 > GameClient.anIntArray3016[var6] - GameClient.anIntArray3007[var6] && GameClient.anIntArray3017[var6] - GameClient.anIntArray3018[var6] < var5) {
						var5 = GameClient.anIntArray3017[var6] - GameClient.anIntArray3018[var6];
						var27 = true;
					}
				}
			}

			GameClient.anInt2941 = GameClient.anIntArray3016[var11] * -1326843327;
			GameClient.anInt3187 = (GameClient.anIntArray3017[var11] = var5) * 1281930195;
			String var29 = GameClient.aStringArray3023[var11];
			if (GameClient.anInt3081 * -1145578609 == 0) {
				int var20 = 16776960;
				if (GameClient.anIntArray3020[var11] < 6) {
					var20 = GameClient.anIntArray3136[GameClient.anIntArray3020[var11]];
				}

				if (GameClient.anIntArray3020[var11] == 6) {
					var20 = GameClient.anInt3025 * -1063560007 % 20 < 10 ? 16711680 : 16776960;
				}

				if (GameClient.anIntArray3020[var11] == 7) {
					var20 = GameClient.anInt3025 * -1063560007 % 20 < 10 ? 255 : 65535;
				}

				if (GameClient.anIntArray3020[var11] == 8) {
					var20 = GameClient.anInt3025 * -1063560007 % 20 < 10 ? 45056 : 8454016;
				}

				int var25;
				if (GameClient.anIntArray3020[var11] == 9) {
					var25 = 150 - GameClient.anIntArray2940[var11];
					if (var25 < 50) {
						var20 = var25 * 1280 + 16711680;
					} else if (var25 < 100) {
						var20 = 16776960 - (var25 - 50) * 327680;
					} else if (var25 < 150) {
						var20 = 65280 + (var25 - 100) * 5;
					}
				}

				if (GameClient.anIntArray3020[var11] == 10) {
					var25 = 150 - GameClient.anIntArray2940[var11];
					if (var25 < 50) {
						var20 = var25 * 5 + 16711680;
					} else if (var25 < 100) {
						var20 = 16711935 - (var25 - 50) * 327680;
					} else if (var25 < 150) {
						var20 = (var25 - 100) * 327680 + 255 - (var25 - 100) * 5;
					}
				}

				if (GameClient.anIntArray3020[var11] == 11) {
					var25 = 150 - GameClient.anIntArray2940[var11];
					if (var25 < 50) {
						var20 = 16777215 - var25 * 327685;
					} else if (var25 < 100) {
						var20 = (var25 - 50) * 327685 + 65280;
					} else if (var25 < 150) {
						var20 = 16777215 - (var25 - 100) * 327680;
					}
				}

				if (GameClient.anIntArray3189[var11] == 0) {
					Class54_Sub1.aClass117_Sub22_Sub17_Sub4_Sub1_1729.method3530(var29, var0 + GameClient.anInt2941 * -1957489215, var1 + GameClient.anInt3187 * 1733237851, var20, 0);
				}

				if (GameClient.anIntArray3189[var11] == 1) {
					Class54_Sub1.aClass117_Sub22_Sub17_Sub4_Sub1_1729.method3524(var29, var0 + GameClient.anInt2941 * -1957489215, GameClient.anInt3187 * 1733237851 + var1, var20, 0, GameClient.anInt3025 * -1063560007);
				}

				if (GameClient.anIntArray3189[var11] == 2) {
					Class54_Sub1.aClass117_Sub22_Sub17_Sub4_Sub1_1729.method3463(var29, GameClient.anInt2941 * -1957489215 + var0, GameClient.anInt3187 * 1733237851 + var1, var20, 0, GameClient.anInt3025 * -1063560007);
				}

				if (GameClient.anIntArray3189[var11] == 3) {
					Class54_Sub1.aClass117_Sub22_Sub17_Sub4_Sub1_1729.method3464(var29, GameClient.anInt2941 * -1957489215 + var0, var1 + GameClient.anInt3187 * 1733237851, var20, 0, GameClient.anInt3025 * -1063560007, 150 - GameClient.anIntArray2940[var11]);
				}

				if (GameClient.anIntArray3189[var11] == 4) {
					var25 = (150 - GameClient.anIntArray2940[var11]) * (Class54_Sub1.aClass117_Sub22_Sub17_Sub4_Sub1_1729.method3454(var29) + 100) / 150;
					Class117_Sub22_Sub17.method2915(var0 + GameClient.anInt2941 * -1957489215 - 50, var1, 50 + var0 + GameClient.anInt2941 * -1957489215, var3 + var1);
					Class54_Sub1.aClass117_Sub22_Sub17_Sub4_Sub1_1729.method3471(var29, 50 + var0 + GameClient.anInt2941 * -1957489215 - var25, GameClient.anInt3187 * 1733237851 + var1, var20, 0);
					Class117_Sub22_Sub17.method2871(var0, var1, var2 + var0, var3 + var1);
				}

				if (GameClient.anIntArray3189[var11] == 5) {
					var25 = 150 - GameClient.anIntArray2940[var11];
					int var28 = 0;
					if (var25 < 25) {
						var28 = var25 - 25;
					} else if (var25 > 125) {
						var28 = var25 - 125;
					}

					Class117_Sub22_Sub17.method2915(var0, GameClient.anInt3187 * 1733237851 + var1 - Class54_Sub1.aClass117_Sub22_Sub17_Sub4_Sub1_1729.anInt2854 - 1, var2 + var0, 5 + var1 + GameClient.anInt3187 * 1733237851);
					Class54_Sub1.aClass117_Sub22_Sub17_Sub4_Sub1_1729.method3530(var29, var0 + GameClient.anInt2941 * -1957489215, var28 + var1 + GameClient.anInt3187 * 1733237851, var20, 0);
					Class117_Sub22_Sub17.method2871(var0, var1, var0 + var2, var1 + var3);
				}
			} else {
				Class54_Sub1.aClass117_Sub22_Sub17_Sub4_Sub1_1729.method3530(var29, GameClient.anInt2941 * -1957489215 + var0, GameClient.anInt3187 * 1733237851 + var1, 16776960, 0);
			}
		}

		if (GameClient.anInt3095 * -949450207 == 2) {
			Class82.method1118(GameClient.anInt3171 * 701871213 + (GameClient.anInt2937 * -1437498083 - Class117_Sub22_Sub20.anInt2497 * 544615727 << 7), GameClient.anInt2927 * 1795947133 + (GameClient.anInt2938 * -192375795 - Class117_Sub22_Sub19.anInt2468 * -771797447 << 7), GameClient.anInt2934 * -241819326, -1359836381);
			if (GameClient.anInt2941 * -1957489215 > -1 && GameClient.anInt2923 * -488599663 % 20 < 10) {
				Class112.aClass117_Sub22_Sub17_Sub3Array1484[0].method3290(GameClient.anInt2941 * -1957489215 + var0 - 12, var1 + GameClient.anInt3187 * 1733237851 - 28);
			}
		}

		((Class37) Class117_Sub22_Sub17_Sub1.anInterface2_2650).method510(GameClient.anInt3092 * -402053703, -371627817);
		if (GameClient.anInt3031 * -814638571 == 1) {
			GameClient.aClass117_Sub22_Sub17_Sub3Array2997[GameClient.anInt3049 * 2066478329 / 100].method3290(GameClient.anInt3028 * 92435079 - 8, GameClient.anInt3140 * -1637747425 - 8);
		}

		if (GameClient.anInt3031 * -814638571 == 2) {
			GameClient.aClass117_Sub22_Sub17_Sub3Array2997[4 + GameClient.anInt3049 * 2066478329 / 100].method3290(GameClient.anInt3028 * 92435079 - 8, GameClient.anInt3140 * -1637747425 - 8);
		}

		Class73_Sub2.method2220(-1890642952);
		Class76.anInt916 = var33 * 900381523;
		Class117_Sub22_Sub1.anInt2143 = var9 * -1908957757;
		Class49.anInt665 = var18 * 1734194885;
		Class117_Sub5.anInt1758 = var19 * -631993499;
		RuntimeException_Sub1.anInt2838 = var16 * -1646765531;
		if (GameClient.aBool2935) {
			byte var34 = 0;
			var13 = var34 + Class96.anInt1109 * 174207063 + Class96.anInt1110 * -144797449;
			if (var13 == 0) {
				GameClient.aBool2935 = false;
			}
		}

		if (GameClient.aBool2935) {
			Class117_Sub22_Sub17.method2877(var0, var1, var2, var3, 0);
			Class117_Sub22_Sub12.method2586(Class108.aString1209, false, (byte) -57);
		}

	}

	Canvas_Sub1(Component var1) {
		aComponent2491 = var1;
	}

	public final void paint(Graphics var1) {
		aComponent2491.paint(var1);
	}

	public final void update(Graphics var1) {
		aComponent2491.update(var1);
	}

	public static void method2959(int var0) {
		Class117_Sub22_Sub5.aClass115_2182.method1518();
		Class117_Sub22_Sub5.aClass115_2186.method1518();
	}

}
