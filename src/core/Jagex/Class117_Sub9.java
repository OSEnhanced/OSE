package core.Jagex;
public final class Class117_Sub9 extends Class117 {

	int anInt1808;
	public static final int anInt1809 = 117;
	int anInt1810;
	int anInt1811;
	static Class117_Sub22_Sub17_Sub2 aClass117_Sub22_Sub17_Sub2_1812;
	int anInt1813;
	static final int anInt1814 = 1536;
	int anInt1815;
	int anInt1816;
	int anInt1817;
	int anInt1818;
	int anInt1820;
	static final int anInt1821 = 26;
	static final int anInt1823 = 16;
	static long aLong1824;
	int anInt1825;
	int anInt1822 = 0;
	int anInt1819 = 1561603979;

	static void method1967(boolean var0, byte var1) {
		GameClient.anInt3044 = 0;
		GameClient.anInt2958 = 0;
		GameClient.aClass117_Sub14_Sub1_2953.method2930(1445833027);
		int var4 = GameClient.aClass117_Sub14_Sub1_2953.method2931(8, -1320315244);
		int var2;
		if (var4 < GameClient.anInt2956 * -434472087) {
			for (var2 = var4; var2 < GameClient.anInt2956 * -434472087; var2++) {
				GameClient.anIntArray2917[(GameClient.anInt3044 += 977145205) * 1514052317 - 1] = GameClient.anIntArray2957[var2];
			}
		}

		if (var4 > GameClient.anInt2956 * -434472087) {
			throw new RuntimeException("");
		} else {
			GameClient.anInt2956 = 0;

			int var5;
			int var7;
			int var8;
			int var9;
			for (var2 = 0; var2 < var4; var2++) {
				int var6 = GameClient.anIntArray2957[var2];
				Class117_Sub22_Sub18_Sub1_Sub1 var3 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[var6];
				var7 = GameClient.aClass117_Sub14_Sub1_2953.method2931(1, -1320315244);
				if (var7 == 0) {
					GameClient.anIntArray2957[(GameClient.anInt2956 -= 1217805095) * -434472087 - 1] = var6;
					var3.anInt2588 = GameClient.anInt2923 * 1299812965;
				} else {
					var5 = GameClient.aClass117_Sub14_Sub1_2953.method2931(2, -1320315244);
					if (var5 == 0) {
						GameClient.anIntArray2957[(GameClient.anInt2956 -= 1217805095) * -434472087 - 1] = var6;
						var3.anInt2588 = GameClient.anInt2923 * 1299812965;
						GameClient.anIntArray3125[(GameClient.anInt2958 -= 1918051799) * 857956889 - 1] = var6;
					} else if (var5 == 1) {
						GameClient.anIntArray2957[(GameClient.anInt2956 -= 1217805095) * -434472087 - 1] = var6;
						var3.anInt2588 = GameClient.anInt2923 * 1299812965;
						var8 = GameClient.aClass117_Sub14_Sub1_2953.method2931(3, -1320315244);
						var3.method3532(var8, (byte) 1, (byte) -91);
						var9 = GameClient.aClass117_Sub14_Sub1_2953.method2931(1, -1320315244);
						if (var9 == 1) {
							GameClient.anIntArray3125[(GameClient.anInt2958 -= 1918051799) * 857956889 - 1] = var6;
						}
					} else if (var5 == 2) {
						GameClient.anIntArray2957[(GameClient.anInt2956 -= 1217805095) * -434472087 - 1] = var6;
						var3.anInt2588 = GameClient.anInt2923 * 1299812965;
						var8 = GameClient.aClass117_Sub14_Sub1_2953.method2931(3, -1320315244);
						var3.method3532(var8, (byte) 2, (byte) -60);
						var9 = GameClient.aClass117_Sub14_Sub1_2953.method2931(3, -1320315244);
						var3.method3532(var9, (byte) 2, (byte) -50);
						int var10 = GameClient.aClass117_Sub14_Sub1_2953.method2931(1, -1320315244);
						if (var10 == 1) {
							GameClient.anIntArray3125[(GameClient.anInt2958 -= 1918051799) * 857956889 - 1] = var6;
						}
					} else if (var5 == 3) {
						GameClient.anIntArray2917[(GameClient.anInt3044 += 977145205) * 1514052317 - 1] = var6;
					}
				}
			}

			int var12;
			Class117_Sub22_Sub18_Sub1_Sub1 var13;
			while (GameClient.aClass117_Sub14_Sub1_2953.method2937(GameClient.anInt2964 * 1735245331, 652368495) >= 27) {
				var4 = GameClient.aClass117_Sub14_Sub1_2953.method2931(15, -1320315244);
				if (var4 == 32767) {
					break;
				}

				boolean var11 = false;
				if (GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[var4] == null) {
					GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[var4] = new Class117_Sub22_Sub18_Sub1_Sub1();
					var11 = true;
				}

				var13 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[var4];
				GameClient.anIntArray2957[(GameClient.anInt2956 -= 1217805095) * -434472087 - 1] = var4;
				var13.anInt2588 = GameClient.anInt2923 * 1299812965;
				var13.aClass117_Sub22_Sub5_2864 = Class117_Sub7.method1952(GameClient.aClass117_Sub14_Sub1_2953.method2931(14, -1320315244), (byte) 0);
				if (var0) {
					var12 = GameClient.aClass117_Sub14_Sub1_2953.method2931(8, -1320315244);
					if (var12 > 127) {
						var12 -= 256;
					}
				} else {
					var12 = GameClient.aClass117_Sub14_Sub1_2953.method2931(5, -1320315244);
					if (var12 > 15) {
						var12 -= 32;
					}
				}

				var7 = GameClient.aClass117_Sub14_Sub1_2953.method2931(1, -1320315244);
				if (var0) {
					var5 = GameClient.aClass117_Sub14_Sub1_2953.method2931(8, -1320315244);
					if (var5 > 127) {
						var5 -= 256;
					}
				} else {
					var5 = GameClient.aClass117_Sub14_Sub1_2953.method2931(5, -1320315244);
					if (var5 > 15) {
						var5 -= 32;
					}
				}

				var8 = GameClient.aClass117_Sub14_Sub1_2953.method2931(1, -1320315244);
				if (var8 == 1) {
					GameClient.anIntArray3125[(GameClient.anInt2958 -= 1918051799) * 857956889 - 1] = var4;
				}

				var9 = GameClient.anIntArray3151[GameClient.aClass117_Sub14_Sub1_2953.method2931(3, -1320315244)];
				if (var11) {
					var13.anInt2590 = (var13.anInt2542 = var9 * -905606123) * -1036571969;
				}

				var13.anInt2545 = var13.aClass117_Sub22_Sub5_2864.anInt2198 * -2102719707;
				var13.anInt2549 = var13.aClass117_Sub22_Sub5_2864.anInt2190 * -2127740621;
				if (var13.anInt2549 * -242447087 == 0) {
					var13.anInt2542 = 0;
				}

				var13.anInt2548 = var13.aClass117_Sub22_Sub5_2864.anInt2192 * 1911264107;
				var13.anInt2599 = var13.aClass117_Sub22_Sub5_2864.anInt2193 * 483381953;
				var13.anInt2574 = var13.aClass117_Sub22_Sub5_2864.anInt2194 * 2081211871;
				var13.anInt2553 = var13.aClass117_Sub22_Sub5_2864.anInt2195 * -245049047;
				var13.anInt2544 = var13.aClass117_Sub22_Sub5_2864.anInt2189 * 217254897;
				var13.anInt2595 = var13.aClass117_Sub22_Sub5_2864.anInt2188 * 1480559065;
				var13.anInt2547 = var13.aClass117_Sub22_Sub5_2864.anInt2191 * 913767589;
				var13.method3535(var12 + Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anIntArray2594[0], var5 + Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anIntArray2541[0], var7 == 1, -1184120092);
			}

			GameClient.aClass117_Sub14_Sub1_2953.method2945(1553654871);

			for (var4 = 0; var4 < GameClient.anInt2958 * 857956889; var4++) {
				var2 = GameClient.anIntArray3125[var4];
				var13 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[var2];
				var12 = GameClient.aClass117_Sub14_Sub1_2953.method2010(-1439707937);
				if ((var12 & 8) != 0) {
					var13.anInt2565 = GameClient.aClass117_Sub14_Sub1_2953.method2186((byte) 15) * -983534769;
					if (var13.anInt2565 * -771439697 == 65535) {
						var13.anInt2565 = 983534769;
					}
				}

				if ((var12 & 128) != 0) {
					var7 = GameClient.aClass117_Sub14_Sub1_2953.method2045((byte) 45);
					var5 = GameClient.aClass117_Sub14_Sub1_2953.method2012(1053511631);
					var8 = var13.anInt2577 * 1961555871 - (var7 - Class117_Sub22_Sub20.anInt2497 * 544615727 - Class117_Sub22_Sub20.anInt2497 * 544615727) * 64;
					var9 = var13.anInt2567 * -184603173 - (var5 - Class117_Sub22_Sub19.anInt2468 * -771797447 - Class117_Sub22_Sub19.anInt2468 * -771797447) * 64;
					if (var8 != 0 || var9 != 0) {
						var13.anInt2592 = ((int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047) * 184454383;
					}
				}

				if ((var12 & 1) != 0) {
					var7 = GameClient.aClass117_Sub14_Sub1_2953.method2038(1803907449);
					var5 = GameClient.aClass117_Sub14_Sub1_2953.method2038(1333804531);
					var13.method3075(var7, var5, GameClient.anInt2923 * -488599663, (byte) -50);
					var13.anInt2601 = GameClient.anInt2923 * 1605709651 - 2063579388;
					var13.anInt2563 = GameClient.aClass117_Sub14_Sub1_2953.method2012(1053511631) * 478458227;
					var13.anInt2564 = GameClient.aClass117_Sub14_Sub1_2953.method2045((byte) 25) * -906524193;
				}

				if ((var12 & 64) != 0) {
					var13.aClass117_Sub22_Sub5_2864 = Class117_Sub7.method1952(GameClient.aClass117_Sub14_Sub1_2953.method2046(-2146671694), (byte) 0);
					var13.anInt2545 = var13.aClass117_Sub22_Sub5_2864.anInt2198 * -2102719707;
					var13.anInt2549 = var13.aClass117_Sub22_Sub5_2864.anInt2190 * -2127740621;
					var13.anInt2548 = var13.aClass117_Sub22_Sub5_2864.anInt2192 * 1911264107;
					var13.anInt2599 = var13.aClass117_Sub22_Sub5_2864.anInt2193 * 483381953;
					var13.anInt2574 = var13.aClass117_Sub22_Sub5_2864.anInt2194 * 2081211871;
					var13.anInt2553 = var13.aClass117_Sub22_Sub5_2864.anInt2195 * -245049047;
					var13.anInt2544 = var13.aClass117_Sub22_Sub5_2864.anInt2189 * 217254897;
					var13.anInt2595 = var13.aClass117_Sub22_Sub5_2864.anInt2188 * 1480559065;
					var13.anInt2547 = var13.aClass117_Sub22_Sub5_2864.anInt2191 * 913767589;
				}

				if ((var12 & 2) != 0) {
					var13.aString2546 = GameClient.aClass117_Sub14_Sub1_2953.method2018((byte) 30);
					var13.anInt2556 = 1865219028;
				}

				if ((var12 & 32) != 0) {
					var7 = GameClient.aClass117_Sub14_Sub1_2953.method2010(-1439707937);
					var5 = GameClient.aClass117_Sub14_Sub1_2953.method2176(1334889679);
					var13.method3075(var7, var5, GameClient.anInt2923 * -488599663, (byte) -124);
					var13.anInt2601 = GameClient.anInt2923 * 1605709651 - 2063579388;
					var13.anInt2563 = GameClient.aClass117_Sub14_Sub1_2953.method2046(-2147150919) * 478458227;
					var13.anInt2564 = GameClient.aClass117_Sub14_Sub1_2953.method2045((byte) 83) * -906524193;
				}

				if ((var12 & 4) != 0) {
					var7 = GameClient.aClass117_Sub14_Sub1_2953.method2012(1053511631);
					if (var7 == 65535) {
						var7 = -1;
					}

					var5 = GameClient.aClass117_Sub14_Sub1_2953.method2010(-1439707937);
					if (var7 == var13.anInt2558 * -919017135 && var7 != -1) {
						var8 = Class114_Sub1.method1838(var7, (byte) -40).anInt2416 * -1912420809;
						if (var8 == 1) {
							var13.anInt2572 = 0;
							var13.anInt2573 = 0;
							var13.anInt2543 = var5 * -1461756537;
							var13.anInt2575 = 0;
						}

						if (var8 == 2) {
							var13.anInt2575 = 0;
						}
					} else if (var7 == -1 || var13.anInt2558 * -919017135 == -1 || Class114_Sub1.method1838(var7, (byte) -44).anInt2400 * -385937947 >= Class114_Sub1.method1838(var13.anInt2558 * -919017135, (byte) -5).anInt2400 * -385937947) {
						var13.anInt2558 = var7 * 1804599217;
						var13.anInt2572 = 0;
						var13.anInt2573 = 0;
						var13.anInt2543 = var5 * -1461756537;
						var13.anInt2575 = 0;
						var13.anInt2598 = var13.anInt2593 * 713807047;
					}
				}

				if ((var12 & 16) != 0) {
					var13.anInt2550 = GameClient.aClass117_Sub14_Sub1_2953.method2045((byte) 98) * -953061807;
					var7 = GameClient.aClass117_Sub14_Sub1_2953.method2057(-1340076937);
					var13.anInt2551 = (var7 >> 16) * 1253750341;
					var13.anInt2579 = (GameClient.anInt2923 * -488599663 + (var7 & 65535)) * -1189764379;
					var13.anInt2571 = 0;
					var13.anInt2578 = 0;
					if (var13.anInt2579 * -1506129171 > GameClient.anInt2923 * -488599663) {
						var13.anInt2571 = 72092623;
					}

					if (var13.anInt2550 * -1214866767 == 65535) {
						var13.anInt2550 = 953061807;
					}
				}
			}

			for (var4 = 0; var4 < GameClient.anInt3044 * 1514052317; var4++) {
				var2 = GameClient.anIntArray2917[var4];
				if (GameClient.anInt2923 * -488599663 != GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[var2].anInt2588 * 1960599485) {
					GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[var2].aClass117_Sub22_Sub5_2864 = null;
					GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[var2] = null;
				}
			}

			if (GameClient.aClass117_Sub14_Sub1_2953.anInt1880 * 561453169 != GameClient.anInt2964 * 1735245331) {
				throw new RuntimeException(GameClient.aClass117_Sub14_Sub1_2953.anInt1880 * 561453169 + Class39.aString478 + GameClient.anInt2964 * 1735245331);
			} else {
				for (var4 = 0; var4 < GameClient.anInt2956 * -434472087; var4++) {
					if (GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[GameClient.anIntArray2957[var4]] == null) {
						throw new RuntimeException(var4 + Class39.aString478 + GameClient.anInt2956 * -434472087);
					}
				}

			}
		}
	}

	static int method1968(int var0, int var1, int var2) {
		int var3 = Class117_Sub22_Sub18_Sub1_Sub2.method3562(var0 - 1, var1 - 1, 1894755836) + Class117_Sub22_Sub18_Sub1_Sub2.method3562(var0 + 1, var1 - 1, 2137965465) + Class117_Sub22_Sub18_Sub1_Sub2.method3562(var0 - 1, var1 + 1, 1164452250) + Class117_Sub22_Sub18_Sub1_Sub2.method3562(1 + var0, 1 + var1, 1393101439);
		int var5 = Class117_Sub22_Sub18_Sub1_Sub2.method3562(var0 - 1, var1, 892195166) + Class117_Sub22_Sub18_Sub1_Sub2.method3562(var0 + 1, var1, 1721348760) + Class117_Sub22_Sub18_Sub1_Sub2.method3562(var0, var1 - 1, 1731132968) + Class117_Sub22_Sub18_Sub1_Sub2.method3562(var0, 1 + var1, 1501639555);
		int var4 = Class117_Sub22_Sub18_Sub1_Sub2.method3562(var0, var1, 974642342);
		return var5 / 8 + var3 / 16 + var4 / 4;
	}

}
