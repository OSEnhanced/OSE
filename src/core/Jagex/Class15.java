package core.Jagex;
public class Class15 {

	static final int anInt179 = 19;
	static final int anInt181 = 44;
	static final int anInt182 = 8;
	static Class81 aClass81_184;
	static final int anInt185 = 1024;
	static final int anInt186 = 19136992;
	public static String aString187;
	public static final int anInt190 = 33;
	static final int anInt191 = 400;
	static final int anInt192 = 20;
	public static final int anInt193 = 38;
	Class127 aClass127_188 = new Class127(256);
	Class127 aClass127_183 = new Class127(256);
	Class106 aClass106_189;
	Class106 aClass106_180;

	Class117_Sub4_Sub1 method299(int var1, int var2, int[] var3, int var4) {
		int var5 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
		var5 |= var1 << 16;
		long var7 = (long) var5 ^ 4294967296L;
		Class117_Sub4_Sub1 var6 = (Class117_Sub4_Sub1) aClass127_183.method1675(var7);
		if (var6 != null) {
			return var6;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			Class117_Sub3 var9 = (Class117_Sub3) aClass127_188.method1675(var7);
			if (var9 == null) {
				var9 = Class117_Sub3.method1910(aClass106_180, var1, var2);
				if (var9 == null) {
					return null;
				}

				aClass127_188.method1666(var9, var7);
			}

			var6 = var9.method1903(var3);
			if (var6 == null) {
				return null;
			} else {
				var9.method1532();
				aClass127_183.method1666(var6, var7);
				return var6;
			}
		}
	}

	public Class117_Sub4_Sub1 method302(int var1, int[] var2, int var3) {
		if (aClass106_189.method1390((byte) -29) != 1) {
			if (aClass106_189.method1399(var1, 2132273846) != 1) {
				throw new RuntimeException();
			} else {
				return method316(var1, 0, var2, 442960649);
			}
		} else {
			return method316(0, var1, var2, 442960649);
		}
	}

	public Class117_Sub4_Sub1 method303(int var1, int[] var2, int var3) {
		if (aClass106_180.method1390((byte) -21) == 1) {
			return method299(0, var1, var2, 1192098402);
		} else if (aClass106_180.method1399(var1, 2131304815) == 1) {
			return method299(var1, 0, var2, 748084473);
		} else {
			throw new RuntimeException();
		}
	}

	public Class15(Class106 var1, Class106 var2) {
		aClass106_189 = var1;
		aClass106_180 = var2;
	}

	static int method311(int var0, int var1, int var2, int var3) {
		return (Class31.aByteArrayArrayArray401[var0][var1][var2] & 8) != 0 ? 0 : (var0 > 0 && (Class31.aByteArrayArrayArray401[1][var1][var2] & 2) != 0 ? var0 - 1 : var0);
	}

	static void method313(Class117_Sub14_Sub1 var0, int var1) {
		var0.method2930(1848760424);
		int var4 = GameClient.anInt3042 * 610133147;
		Player var5 = Class31.player = GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var4] = new Player();
		var5.anInt2894 = var4 * -743481251;
		int var3 = var0.method2931(30, -1320315244);
		byte var6 = (byte) (var3 >> 28);
		int var7 = var3 >> 14 & 16383;
		int var8 = var3 & 16383;
		var5.anIntArray2594[0] = var7 - Class117_Sub22_Sub20.anInt2497 * 544615727;
		var5.anInt2577 = ((var5.anIntArray2594[0] << 7) + (var5.method3540((byte) -26) << 6)) * -2090048417;
		var5.anIntArray2541[0] = var8 - Class117_Sub22_Sub19.anInt2468 * -771797447;
		var5.anInt2567 = ((var5.anIntArray2541[0] << 7) + (var5.method3540((byte) 53) << 6)) * -672987565;
		Class117_Sub22_Sub18_Sub3.anInt2629 = (var5.anInt2890 = var6 * 1587543155) * -67313687;
		if (Class4.aClass117_Sub14Array39[var4] != null) {
			var5.method3541(Class4.aClass117_Sub14Array39[var4], -2084894013);
		}

		Class4.anInt46 = 0;
		Class4.anIntArray41[(Class4.anInt46 -= 902671363) * -1915182763 - 1] = var4;
		Class4.aByteArray37[var4] = 0;
		Class4.anInt42 = 0;

		for (int var9 = 1; var9 < 2048; var9++) {
			if (var9 != var4) {
				int var2 = var0.method2931(18, -1320315244);
				int var12 = var2 >> 16;
				int var11 = var2 >> 8 & 255;
				int var10 = var2 & 255;
				Class4.anIntArray44[var9] = var10 + (var11 << 14) + (var12 << 28);
				Class4.anIntArray45[var9] = 0;
				Class4.anIntArray35[var9] = -1;
				Class4.anIntArray43[(Class4.anInt42 += 550872323) * -1037177429 - 1] = var9;
				Class4.aByteArray37[var9] = 0;
			}
		}

		var0.method2945(107545999);
	}

	public static int method314(CharSequence var0, byte var1) {
		int var2 = var0.length();
		int var3 = 0;

		for (int var4 = 0; var4 < var2; var4++) {
			var3 = (var3 << 5) - var3 + Player.method3548(var0.charAt(var4), -252301105);
		}

		return var3;
	}

	static void method315(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = Class117_Sub13.aClass42_1875.method706(var0, var1, var2);
		int var7;
		int var8;
		int var10;
		int var11;
		int var12;
		int var13;
		if (var6 != 0) {
			var8 = Class117_Sub13.aClass42_1875.method569(var0, var1, var2, var6);
			var12 = var8 >> 6 & 3;
			var11 = var8 & 31;
			var7 = var3;
			if (var6 > 0) {
				var7 = var4;
			}

			int[] var9 = Class54.aClass117_Sub22_Sub17_Sub3_734.anIntArray2713;
			var10 = (103 - var2) * 2048 + 24624 + var1 * 4;
			var13 = var6 >> 14 & 32767;
			Class117_Sub22_Sub13 var14 = Class63.method928(var13, -984638881);
			if (var14.anInt2376 * 806570069 != -1) {
				Class117_Sub22_Sub17_Sub2 var15 = Class117_Sub22_Sub2.aClass117_Sub22_Sub17_Sub2Array2162[var14.anInt2376 * 806570069];
				if (var15 != null) {
					int var17 = (var14.anInt2346 * -1597932052 - var15.anInt2707) / 2;
					int var16 = (var14.anInt2396 * -1026333076 - var15.anInt2705) / 2;
					var15.method3239(var17 + var1 * 4 + 48, (104 - var2 - var14.anInt2396 * 817158555) * 4 + 48 + var16);
				}
			} else {
				if (var11 == 0 || var11 == 2) {
					if (var12 == 0) {
						var9[var10] = var7;
						var9[var10 + 512] = var7;
						var9[1024 + var10] = var7;
						var9[var10 + 1536] = var7;
					} else if (var12 == 1) {
						var9[var10] = var7;
						var9[1 + var10] = var7;
						var9[var10 + 2] = var7;
						var9[3 + var10] = var7;
					} else if (var12 == 2) {
						var9[var10 + 3] = var7;
						var9[512 + var10 + 3] = var7;
						var9[var10 + 3 + 1024] = var7;
						var9[var10 + 3 + 1536] = var7;
					} else if (var12 == 3) {
						var9[1536 + var10] = var7;
						var9[1 + 1536 + var10] = var7;
						var9[2 + var10 + 1536] = var7;
						var9[var10 + 1536 + 3] = var7;
					}
				}

				if (var11 == 3) {
					if (var12 == 0) {
						var9[var10] = var7;
					} else if (var12 == 1) {
						var9[3 + var10] = var7;
					} else if (var12 == 2) {
						var9[1536 + var10 + 3] = var7;
					} else if (var12 == 3) {
						var9[1536 + var10] = var7;
					}
				}

				if (var11 == 2) {
					if (var12 == 3) {
						var9[var10] = var7;
						var9[512 + var10] = var7;
						var9[var10 + 1024] = var7;
						var9[var10 + 1536] = var7;
					} else if (var12 == 0) {
						var9[var10] = var7;
						var9[1 + var10] = var7;
						var9[var10 + 2] = var7;
						var9[var10 + 3] = var7;
					} else if (var12 == 1) {
						var9[3 + var10] = var7;
						var9[512 + var10 + 3] = var7;
						var9[1024 + 3 + var10] = var7;
						var9[1536 + var10 + 3] = var7;
					} else if (var12 == 2) {
						var9[var10 + 1536] = var7;
						var9[1 + var10 + 1536] = var7;
						var9[2 + 1536 + var10] = var7;
						var9[1536 + var10 + 3] = var7;
					}
				}
			}
		}

		var6 = Class117_Sub13.aClass42_1875.method664(var0, var1, var2);
		if (var6 != 0) {
			var8 = Class117_Sub13.aClass42_1875.method569(var0, var1, var2, var6);
			var12 = var8 >> 6 & 3;
			var11 = var8 & 31;
			var7 = var6 >> 14 & 32767;
			Class117_Sub22_Sub13 var18 = Class63.method928(var7, -711393350);
			int var24;
			if (var18.anInt2376 * 806570069 != -1) {
				Class117_Sub22_Sub17_Sub2 var20 = Class117_Sub22_Sub2.aClass117_Sub22_Sub17_Sub2Array2162[var18.anInt2376 * 806570069];
				if (var20 != null) {
					var13 = (var18.anInt2346 * -1597932052 - var20.anInt2707) / 2;
					var24 = (var18.anInt2396 * -1026333076 - var20.anInt2705) / 2;
					var20.method3239(var13 + var1 * 4 + 48, var24 + (104 - var2 - var18.anInt2396 * 817158555) * 4 + 48);
				}
			} else if (var11 == 9) {
				var10 = 15658734;
				if (var6 > 0) {
					var10 = 15597568;
				}

				int[] var23 = Class54.aClass117_Sub22_Sub17_Sub3_734.anIntArray2713;
				var24 = var1 * 4 + 24624 + (103 - var2) * 2048;
				if (var12 != 0 && var12 != 2) {
					var23[var24] = var10;
					var23[512 + var24 + 1] = var10;
					var23[var24 + 1024 + 2] = var10;
					var23[var24 + 1536 + 3] = var10;
				} else {
					var23[var24 + 1536] = var10;
					var23[var24 + 1024 + 1] = var10;
					var23[2 + 512 + var24] = var10;
					var23[3 + var24] = var10;
				}
			}
		}

		var6 = Class117_Sub13.aClass42_1875.method568(var0, var1, var2);
		if (var6 != 0) {
			var8 = var6 >> 14 & 32767;
			Class117_Sub22_Sub13 var22 = Class63.method928(var8, 442793370);
			if (var22.anInt2376 * 806570069 != -1) {
				Class117_Sub22_Sub17_Sub2 var21 = Class117_Sub22_Sub2.aClass117_Sub22_Sub17_Sub2Array2162[var22.anInt2376 * 806570069];
				if (var21 != null) {
					var7 = (var22.anInt2346 * -1597932052 - var21.anInt2707) / 2;
					int var19 = (var22.anInt2396 * -1026333076 - var21.anInt2705) / 2;
					var21.method3239(var7 + 48 + var1 * 4, var19 + (104 - var2 - var22.anInt2396 * 817158555) * 4 + 48);
				}
			}
		}

	}

	Class117_Sub4_Sub1 method316(int var1, int var2, int[] var3, int var4) {
		int var5 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
		var5 |= var1 << 16;
		long var7 = (long) var5;
		Class117_Sub4_Sub1 var9 = (Class117_Sub4_Sub1) aClass127_183.method1675(var7);
		if (var9 != null) {
			return var9;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			Class10 var6 = Class10.method162(aClass106_189, var1, var2);
			if (var6 == null) {
				return null;
			} else {
				var9 = var6.method150();
				aClass127_183.method1666(var9, var7);
				if (var3 != null) {
					var3[0] -= var9.aByteArray2423.length;
				}

				return var9;
			}
		}
	}

	public static Class117_Sub22_Sub17_Sub3 method317(int var0, int var1, int var2, int var3, int var4, boolean var5, short var6) {
		if (var1 == -1) {
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) {
			var4 = 1;
		}

		long var8 = ((long) var3 << 42) + ((long) var2 << 38) + (long) var0 + ((long) var1 << 16) + ((long) var4 << 40);
		Class117_Sub22_Sub17_Sub3 var10;
		if (!var5) {
			var10 = (Class117_Sub22_Sub17_Sub3) Class117_Sub22_Sub6.aClass115_2225.method1515(var8);
			if (var10 != null) {
				return var10;
			}
		}

		Class117_Sub22_Sub6 var11 = Class117_Sub13.method1992(var0, -824042043);
		if (var1 > 1 && var11.anIntArray2256 != null) {
			int var12 = -1;

			for (int var7 = 0; var7 < 10; var7++) {
				if (var1 >= var11.anIntArray2230[var7] && var11.anIntArray2230[var7] != 0) {
					var12 = var11.anIntArray2256[var7];
				}
			}

			if (var12 != -1) {
				var11 = Class117_Sub13.method1992(var12, 882861912);
			}
		}

		Class117_Sub22_Sub18_Sub7 var23 = var11.method2423(1, 559197989);
		if (var23 == null) {
			return null;
		} else {
			Class117_Sub22_Sub17_Sub3 var22 = null;
			if (var11.anInt2259 * -1574477923 != -1) {
				var22 = method317(var11.anInt2258 * -98750407, 10, 1, 0, 0, true, (short) 4687);
				if (var22 == null) {
					return null;
				}
			} else if (var11.anInt2268 * -725283813 != -1) {
				var22 = method317(var11.anInt2267 * 1858327633, var1, var2, var3, 0, false, (short) -8346);
				if (var22 == null) {
					return null;
				}
			}

			int[] var15 = Class117_Sub22_Sub17.anIntArray2459;
			int var16 = Class117_Sub22_Sub17.anInt2462;
			int var17 = Class117_Sub22_Sub17.anInt2461;
			int[] var13 = new int[4];
			Class117_Sub22_Sub17.method2880(var13);
			var10 = new Class117_Sub22_Sub17_Sub3(36, 32);
			Class117_Sub22_Sub17.method2862(var10.anIntArray2713, 36, 32);
			Class117_Sub22_Sub17.method2883();
			Class117_Sub22_Sub17_Sub1.method3095();
			Class117_Sub22_Sub17_Sub1.method3096(16, 16);
			Class117_Sub22_Sub17_Sub1.aBool2630 = false;
			int var14 = var11.anInt2239 * -502008719;
			if (var5) {
				var14 = (int) ((double) var14 * 1.5D);
			} else if (var2 == 2) {
				var14 = (int) (1.04D * (double) var14);
			}

			int var19 = Class117_Sub22_Sub17_Sub1.anIntArray2653[var11.anInt2234 * -2096538391] * var14 >> 16;
			int var20 = Class117_Sub22_Sub17_Sub1.anIntArray2654[var11.anInt2234 * -2096538391] * var14 >> 16;
			var23.method3410();
			var23.method3378(0, var11.anInt2235 * 341411607, var11.anInt2236 * -66680407, var11.anInt2234 * -2096538391, var11.anInt2237 * 1723120955, var11.anInt2238 * -979741083 + var23.anInt2466 * 1871917943 / 2 + var19, var11.anInt2238 * -979741083 + var20);
			if (var11.anInt2268 * -725283813 != -1) {
				var22.method3290(0, 0);
			}

			if (var2 >= 1) {
				var10.method3278(1);
			}

			if (var2 >= 2) {
				var10.method3278(16777215);
			}

			if (var3 != 0) {
				var10.method3252(var3);
			}

			Class117_Sub22_Sub17.method2862(var10.anIntArray2713, 36, 32);
			if (var11.anInt2259 * -1574477923 != -1) {
				var22.method3290(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var11.anInt2222 * -1106690991 == 1) {
				Class117_Sub22_Sub17_Sub4_Sub1 var21 = Class83.aClass117_Sub22_Sub17_Sub4_Sub1_983;
				String var18;
				if (var1 < 100000) {
					var18 = "<col=ffff00>" + var1 + "</col>";
				} else if (var1 < 10000000) {
					var18 = "<col=ffffff>" + var1 / 1000 + Class108.aString1364 + "</col>";
				} else {
					var18 = "<col=00ff80>" + var1 / 1000000 + Class108.aString1384 + "</col>";
				}

				var21.method3471(var18, 0, 9, 16776960, 1);
			}

			if (!var5) {
				Class117_Sub22_Sub6.aClass115_2225.method1517(var10, var8);
			}

			Class117_Sub22_Sub17.method2862(var15, var16, var17);
			Class117_Sub22_Sub17.method2868(var13);
			Class117_Sub22_Sub17_Sub1.method3095();
			Class117_Sub22_Sub17_Sub1.aBool2630 = true;
			return var10;
		}
	}

}
