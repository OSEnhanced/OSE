package core.Jagex;
public final class Player extends Class117_Sub22_Sub18_Sub1 {

	int anInt2870;
	int anInt2875;
	int anInt2876;
	int anInt2881;
	int anInt2884;
	int anInt2885;
	int anInt2886;
	int anInt2889;
	int anInt2890;
	int anInt2891;
	int anInt2893;
	int anInt2894;
	int anInt2872 = 1459841763;
	int anInt2877 = 209926757;
	int anInt2888 = 0;
	String playerName = "";
	int anInt2874 = 0;
	int anInt2873 = 0;
	boolean aBool2883 = false;
	Class91 aClass91_2871;
	int anInt2892 = 0;
	int anInt2878 = 0;
	boolean aBool2887 = false;
	boolean aBool2879 = false;
	Class117_Sub22_Sub18_Sub7 aClass117_Sub22_Sub18_Sub7_2882;

	int method3540(byte var1) {
		return aClass91_2871 != null && aClass91_2871.anInt1077 * -130829785 != -1 ? Class117_Sub7.method1952(aClass91_2871.anInt1077 * -130829785, (byte) 0).anInt2198 * -1941498503 : 1;
	}

	final void method3541(Class117_Sub14 var1, int var2) {
		var1.anInt1880 = 0;
		int var9 = var1.method2010(-1439707937);
		anInt2872 = var1.method1997(450115856) * -1459841763;
		anInt2877 = var1.method1997(184223767) * -209926757;
		int var3 = -1;
		anInt2888 = 0;
		int[] var4 = new int[12];

		int var7;
		int var8;
		for (int var5 = 0; var5 < 12; var5++) {
			var7 = var1.method2010(-1439707937);
			if (var7 == 0) {
				var4[var5] = 0;
			} else {
				var8 = var1.method2010(-1439707937);
				var4[var5] = var8 + (var7 << 8);
				if (var5 == 0 && var4[0] == 65535) {
					var3 = var1.method2012(1053511631);
					break;
				}

				if (var4[var5] >= 512) {
					int var6 = Class117_Sub13.method1992(var4[var5] - 512, -1280472751).anInt2265 * 1266751669;
					if (var6 != 0) {
						anInt2888 = var6 * 1370370095;
					}
				}
			}
		}

		int[] var10 = new int[5];

		for (var7 = 0; var7 < 5; var7++) {
			var8 = var1.method2010(-1439707937);
			if (var8 < 0 || var8 >= Class87.aShortArrayArray1019[var7].length) {
				var8 = 0;
			}

			var10[var7] = var8;
		}

		anInt2544 = var1.method2012(1053511631) * 267833319;
		if (anInt2544 * 1732563927 == 65535) {
			anInt2544 = -267833319;
		}

		anInt2595 = var1.method2012(1053511631) * -773381413;
		if (anInt2595 * -1906177709 == 65535) {
			anInt2595 = 773381413;
		}

		anInt2547 = anInt2595 * 485841207;
		anInt2548 = var1.method2012(1053511631) * 1360303815;
		if (anInt2548 * -250918153 == 65535) {
			anInt2548 = -1360303815;
		}

		anInt2599 = var1.method2012(1053511631) * -1841347657;
		if (anInt2599 * -178255353 == 65535) {
			anInt2599 = 1841347657;
		}

		anInt2574 = var1.method2012(1053511631) * -1087411893;
		if (anInt2574 * 647616611 == 65535) {
			anInt2574 = 1087411893;
		}

		anInt2553 = var1.method2012(1053511631) * 1208012505;
		if (anInt2553 * 1571606889 == 65535) {
			anInt2553 = -1208012505;
		}

		anInt2552 = var1.method2012(1053511631) * 865322311;
		if (anInt2552 * -2083761033 == 65535) {
			anInt2552 = -865322311;
		}

		playerName = var1.method2018((byte) -6);
		if (Class31.player == this) {
			RuntimeException_Sub1.aString2831 = playerName;
		}

		anInt2874 = var1.method2010(-1439707937) * -2016700893;
		anInt2873 = var1.method2012(1053511631) * -419602753;
		aBool2883 = var1.method2010(-1439707937) == 1;
		if (GameClient.anInt2918 * -553019157 == 0 && GameClient.anInt3073 * -296746775 >= 2) {
			aBool2883 = false;
		}

		if (aClass91_2871 == null) {
			aClass91_2871 = new Class91();
		}

		aClass91_2871.method1189(var4, var10, var9 == 1, var3, (byte) 61);
	}

	static void method3543(int var0, int var1, int var2) {
		if (Class4.method85(var0, -1258160670)) {
			Class117_Sub22_Sub21.method2960(Class117_Sub19.aClass117_Sub19ArrayArray2032[var0], var1, (byte) -92);
		}
	}

	final void method3544(int var1, int var2, byte var3, int var4) {
		if (anInt2558 * -919017135 != -1 && Class114_Sub1.method1838(anInt2558 * -919017135, (byte) -17).anInt2415 * 1618076415 == 1) {
			anInt2558 = -1804599217;
		}

		anInt2592 = -184454383;
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (anIntArray2594[0] >= 0 && anIntArray2594[0] < 104 && anIntArray2541[0] >= 0 && anIntArray2541[0] < 104) {
				if (var3 == 2) {
					Class89.method1184(this, var1, var2, (byte) 2, (byte) 21);
				}

				method3557(var1, var2, var3, -756611095);
			} else {
				method3545(var1, var2, (byte) -12);
			}
		} else {
			method3545(var1, var2, (byte) -12);
		}

	}

	void method3545(int var1, int var2, byte var3) {
		anInt2593 = 0;
		anInt2598 = 0;
		anInt2597 = 0;
		anIntArray2594[0] = var1;
		anIntArray2541[0] = var2;
		int var4 = method3540((byte) -35);
		anInt2577 = var4 * -619112512 + anIntArray2594[0] * -1238225024;
		anInt2567 = anIntArray2541[0] * -243062400 + var4 * -121531200;
	}

	final boolean method3074(int var1) {
		return aClass91_2871 != null;
	}

	public static byte method3548(char var0, int var1) {
		byte var2;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
			var2 = (byte) var0;
		} else if (var0 == 8364) {
			var2 = -128;
		} else if (var0 == 8218) {
			var2 = -126;
		} else if (var0 == 402) {
			var2 = -125;
		} else if (var0 == 8222) {
			var2 = -124;
		} else if (var0 == 8230) {
			var2 = -123;
		} else if (var0 == 8224) {
			var2 = -122;
		} else if (var0 == 8225) {
			var2 = -121;
		} else if (var0 == 710) {
			var2 = -120;
		} else if (var0 == 8240) {
			var2 = -119;
		} else if (var0 == 352) {
			var2 = -118;
		} else if (var0 == 8249) {
			var2 = -117;
		} else if (var0 == 338) {
			var2 = -116;
		} else if (var0 == 381) {
			var2 = -114;
		} else if (var0 == 8216) {
			var2 = -111;
		} else if (var0 == 8217) {
			var2 = -110;
		} else if (var0 == 8220) {
			var2 = -109;
		} else if (var0 == 8221) {
			var2 = -108;
		} else if (var0 == 8226) {
			var2 = -107;
		} else if (var0 == 8211) {
			var2 = -106;
		} else if (var0 == 8212) {
			var2 = -105;
		} else if (var0 == 732) {
			var2 = -104;
		} else if (var0 == 8482) {
			var2 = -103;
		} else if (var0 == 353) {
			var2 = -102;
		} else if (var0 == 8250) {
			var2 = -101;
		} else if (var0 == 339) {
			var2 = -100;
		} else if (var0 == 382) {
			var2 = -98;
		} else if (var0 == 376) {
			var2 = -97;
		} else {
			var2 = 63;
		}

		return var2;
	}

	public static Class117_Sub22_Sub17_Sub4_Sub1 method3549(Class106 var0, Class106 var1, String var2, String var3, int var4) {
		int var5 = var0.method1391(var2, -1739042832);
		int var7 = var0.method1383(var5, var3, (byte) 19);
		Class117_Sub22_Sub17_Sub4_Sub1 var6;
		if (!Class14.method295(var0, var5, var7, 1263602870)) {
			var6 = null;
		} else {
			byte[] var8 = var1.method1380(var5, var7, (byte) 47);
			Class117_Sub22_Sub17_Sub4_Sub1 var9;
			if (var8 == null) {
				var9 = null;
			} else {
				Class117_Sub22_Sub17_Sub4_Sub1 var10 = new Class117_Sub22_Sub17_Sub4_Sub1(var8, Class98.anIntArray1133, Class13.anIntArray147, Class13.anIntArray148, Class26.anIntArray324, Class13.anIntArray149, Class13.aByteArrayArray150);
				Class117_Sub22_Sub18_Sub3.method3083(-578517745);
				var9 = var10;
			}

			var6 = var9;
		}

		return var6;
	}

	final void method3557(int var1, int var2, byte var3, int var4) {
		if (anInt2593 * 1000346769 < 9) {
			anInt2593 += 1290677361;
		}

		for (int var5 = anInt2593 * 1000346769; var5 > 0; --var5) {
			anIntArray2594[var5] = anIntArray2594[var5 - 1];
			anIntArray2541[var5] = anIntArray2541[var5 - 1];
			aByteArray2596[var5] = aByteArray2596[var5 - 1];
		}

		anIntArray2594[0] = var1;
		anIntArray2541[0] = var2;
		aByteArray2596[0] = var3;
	}

	protected final Class117_Sub22_Sub18_Sub7 method2921(byte var1) {
		if (aClass91_2871 == null) {
			return null;
		} else {
			Class117_Sub22_Sub14 var2 = anInt2558 * -919017135 != -1 && anInt2543 * 341825591 == 0 ? Class114_Sub1.method1838(anInt2558 * -919017135, (byte) -50) : null;
			Class117_Sub22_Sub14 var6 = anInt2568 * -2098720445 == -1 || aBool2887 || anInt2544 * 1732563927 == anInt2568 * -2098720445 && var2 != null ? null : Class114_Sub1.method1838(anInt2568 * -2098720445, (byte) -62);
			Class117_Sub22_Sub18_Sub7 var3 = aClass91_2871.method1221(var2, anInt2572 * -1717673467, var6, anInt2569 * 1646089229, 1014180574);
			if (var3 == null) {
				return null;
			} else {
				var3.method3410();
				anInt2589 = var3.anInt2466 * -1993620481;
				Class117_Sub22_Sub18_Sub7 var4;
				Class117_Sub22_Sub18_Sub7[] var5;
				if (!aBool2887 && anInt2550 * -1214866767 != -1 && anInt2571 * -1581587247 != -1) {
					var4 = Class80.method1085(anInt2550 * -1214866767, (byte) 124).method2562(anInt2571 * -1581587247, 553464185);
					if (var4 != null) {
						var4.method3362(0, -(anInt2551 * 901442701), 0);
						var5 = new Class117_Sub22_Sub18_Sub7[]{var3, var4};
						var3 = new Class117_Sub22_Sub18_Sub7(var5, 2);
					}
				}

				if (!aBool2887 && aClass117_Sub22_Sub18_Sub7_2882 != null) {
					if (GameClient.anInt2923 * -488599663 >= anInt2878 * -1347311997) {
						aClass117_Sub22_Sub18_Sub7_2882 = null;
					}

					if (GameClient.anInt2923 * -488599663 >= anInt2892 * -1054032987 && GameClient.anInt2923 * -488599663 < anInt2878 * -1347311997) {
						var4 = aClass117_Sub22_Sub18_Sub7_2882;
						var4.method3362(anInt2893 * -1655350759 - anInt2577 * 1961555871, anInt2875 * -1458020159 - anInt2870 * 959559437, anInt2881 * -1379616173 - anInt2567 * -184603173);
						if (anInt2590 * 965827843 == 512) {
							var4.method3372();
							var4.method3372();
							var4.method3372();
						} else if (anInt2590 * 965827843 == 1024) {
							var4.method3372();
							var4.method3372();
						} else if (anInt2590 * 965827843 == 1536) {
							var4.method3372();
						}

						var5 = new Class117_Sub22_Sub18_Sub7[]{var3, var4};
						var3 = new Class117_Sub22_Sub18_Sub7(var5, 2);
						if (anInt2590 * 965827843 == 512) {
							var4.method3372();
						} else if (anInt2590 * 965827843 == 1024) {
							var4.method3372();
							var4.method3372();
						} else if (anInt2590 * 965827843 == 1536) {
							var4.method3372();
							var4.method3372();
							var4.method3372();
						}

						var4.method3362(anInt2577 * 1961555871 - anInt2893 * -1655350759, anInt2870 * 959559437 - anInt2875 * -1458020159, anInt2567 * -184603173 - anInt2881 * -1379616173);
					}
				}

				var3.aBool2826 = true;
				return var3;
			}
		}
	}

	static void method3560(int var0) {
		for (int var1 = 0; var1 < GameClient.anInt3162 * 1572335207; var1++) {
			--GameClient.anIntArray3165[var1];
			if (GameClient.anIntArray3165[var1] >= -10) {
				Class10 var10 = GameClient.aClass10Array3067[var1];
				if (var10 == null) {
					Class10 var10000 = (Class10) null;
					var10 = Class10.method162(Class58.aClass106_Sub1_753, GameClient.anIntArray3163[var1], 0);
					if (var10 == null) {
						continue;
					}

					GameClient.anIntArray3165[var1] += var10.method161();
					GameClient.aClass10Array3067[var1] = var10;
				}

				if (GameClient.anIntArray3165[var1] < 0) {
					int var6;
					if (GameClient.anIntArray2959[var1] != 0) {
						int var7 = (GameClient.anIntArray2959[var1] & 255) * 128;
						int var5 = GameClient.anIntArray2959[var1] >> 16 & 255;
						int var8 = var5 * 128 + 64 - Class31.player.anInt2577 * 1961555871;
						if (var8 < 0) {
							var8 = -var8;
						}

						int var2 = GameClient.anIntArray2959[var1] >> 8 & 255;
						int var3 = 64 + var2 * 128 - Class31.player.anInt2567 * -184603173;
						if (var3 < 0) {
							var3 = -var3;
						}

						int var9 = var3 + var8 - 128;
						if (var9 > var7) {
							GameClient.anIntArray3165[var1] = -100;
							continue;
						}

						if (var9 < 0) {
							var9 = 0;
						}

						var6 = (var7 - var9) * GameClient.anInt2948 * 1581116715 / var7;
					} else {
						var6 = GameClient.anInt3047 * -2084883511;
					}

					if (var6 > 0) {
						Class117_Sub4_Sub1 var12 = var10.method150().method2674(Class117_Sub7.aClass20_1789);
						Class117_Sub2_Sub2 var11 = Class117_Sub2_Sub2.method2706(var12, 100, var6);
						var11.method2709(GameClient.anIntArray3164[var1] - 1);
						Class117_Sub13.aClass117_Sub2_Sub1_1871.method2678(var11);
					}

					GameClient.anIntArray3165[var1] = -100;
				}
			} else {
				GameClient.anInt3162 -= 1850690903;

				for (int var4 = var1; var4 < GameClient.anInt3162 * 1572335207; var4++) {
					GameClient.anIntArray3163[var4] = GameClient.anIntArray3163[1 + var4];
					GameClient.aClass10Array3067[var4] = GameClient.aClass10Array3067[var4 + 1];
					GameClient.anIntArray3164[var4] = GameClient.anIntArray3164[var4 + 1];
					GameClient.anIntArray3165[var4] = GameClient.anIntArray3165[var4 + 1];
					GameClient.anIntArray2959[var4] = GameClient.anIntArray2959[var4 + 1];
				}

				--var1;
			}
		}

		if (GameClient.aBool3158 && !Class81.method1108(-862889665)) {
			if (GameClient.anInt3156 * 206554627 != 0 && GameClient.anInt3021 * 1034748741 != -1) {
				Class93.method1236(Class57.aClass106_Sub1_749, GameClient.anInt3021 * 1034748741, 0, GameClient.anInt3156 * 206554627, false, 537715610);
			}

			GameClient.aBool3158 = false;
		}

	}

	static int method3562(int var0, int var1, int var2) {
		int var3 = var1 * 57 + var0;
		var3 ^= var3 << 13;
		int var4 = var3 * (789221 + var3 * var3 * 15731) + 1376312589 & Integer.MAX_VALUE;
		return var4 >> 19 & 255;
	}

	public static char method3564(char var0, int var1, int var2) {
		if (var0 >= 192 && var0 <= 255) {
			if (var0 >= 192 && var0 <= 198) {
				return 'A';
			}

			if (var0 == 199) {
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) {
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) {
				return 'I';
			}

			if (var0 >= 210 && var0 <= 214) {
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) {
				return 'U';
			}

			if (var0 == 221) {
				return 'Y';
			}

			if (var0 == 223) {
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) {
				return 'a';
			}

			if (var0 == 231) {
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i';
			}

			if (var0 >= 242 && var0 <= 246) {
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) {
				return 'u';
			}

			if (var0 == 253 || var0 == 255) {
				return 'y';
			}
		}

		if (var0 == 338) {
			return 'O';
		} else if (var0 == 339) {
			return 'o';
		} else if (var0 == 376) {
			return 'Y';
		} else {
			return var0;
		}
	}

}
