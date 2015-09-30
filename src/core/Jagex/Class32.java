package core.Jagex;
public class Class32 {

	Class117_Sub22_Sub19 aClass117_Sub22_Sub19_404;
	int[] anIntArray406;
	String[] aStringArray407;
	static Class17 aClass17_408;
	static Class117_Sub22_Sub17_Sub3[] aClass117_Sub22_Sub17_Sub3Array409;
	static Class106_Sub1 aClass106_Sub1_410;
	public static final int anInt411 = 233;
	static Class106_Sub1 aClass106_Sub1_412;
	public static String aString413;
	public static final int anInt414 = 104;
	public static final int anInt415 = 185;
	int anInt405 = -1252535227;

	public static int method468(int var0, int var1, int var2) {
		int var3;
		for (var3 = 1; var1 > 1; var1 >>= 1) {
			if ((var1 & 1) != 0) {
				var3 *= var0;
			}

			var0 *= var0;
		}

		if (var1 == 1) {
			return var3 * var0;
		} else {
			return var3;
		}
	}
	public int getLevel() {
		return level;
	}
	static String name;
	public String otherPlayerInfo() {
		return name + " level->" +getLevel();
	}
	public String getOtherPlayer() {
		return name;
	}
	static int level;
	static void method469(Class117_Sub22_Sub18_Sub1_Sub2 var0, int var1, int var2, int var3, byte var4) {
		if (var0 != Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393) {
			if (GameClient.anInt3060 * 1223430109 < 400) {
				String var5;
				/**
				 * constructs the right click on player below.
				 */
				if (var0.anInt2873 * -849014465 == 0) {
					var5 = var0.getPlayerName() + Class83.method1139(var0.anInt2874 * -1654863477, Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2874 * -1654863477, 1440172605) + " " + Class39.aString479 + Class108.aString1356 + var0.anInt2874 * -1654863477 + Class39.aString480;
				} else {
					var5 = var0.getPlayerName() + " " + Class39.aString479 + Class108.aString1357 + var0.anInt2873 * -849014465 + Class39.aString480;
				}
				level = var0.anInt2874 * -1654863477;
				name = var0.getPlayerName();
				System.out.println(level);
				int var7;
				if (GameClient.anInt3071 * -339828245 == 1) {
					Class81.method1109(Class108.aString1326, GameClient.aString3058 + " " + Class39.aString481 + " " + Class117_Sub22_Sub12.method2584(16777215, 668388556) + var5, 14, var1, var2, var3, -1983857174);
				} else if (GameClient.aBool3074) {
					if ((Class25.anInt311 * 746665735 & 8) == 8) {
						Class81.method1109(GameClient.aString2931, GameClient.aString3078 + " " + Class39.aString481 + " " + Class117_Sub22_Sub12.method2584(16777215, 668388556) + var5, 15, var1, var2, var3, -995330121);
					}
				} else {
					for (var7 = 7; var7 >= 0; --var7) {
						if (GameClient.aStringArray2936[var7] != null) {
							short var6 = 0;
							if (GameClient.aStringArray2936[var7].equalsIgnoreCase(Class108.aString1352)) {
								if (GameClient.aClass36_3077 == Class36.aClass36_446 || GameClient.aClass36_3077 == Class36.aClass36_451 && var0.anInt2874 * -1654863477 > Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2874 * -1654863477) {
									var6 = 2000;
								}

								if (Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2888 * 141366991 != 0 && var0.anInt2888 * 141366991 != 0) {
									if (var0.anInt2888 * 141366991 == Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2888 * 141366991) {
										var6 = 2000;
									} else {
										var6 = 0;
									}
								}
							} else if (GameClient.aBoolArray2986[var7]) {
								var6 = 2000;
							}

							boolean var8 = false;
							int var9 = var6 + GameClient.anIntArray3046[var7];
							Class81.method1109(GameClient.aStringArray2936[var7], Class117_Sub22_Sub12.method2584(16777215, 668388556) + var5, var9, var1, var2, var3, -1035663094);
						}
					}
				}

				for (var7 = 0; var7 < GameClient.anInt3060 * 1223430109; var7++) {
					if (GameClient.anIntArray2999[var7] == 23) {
						GameClient.aStringArray3066[var7] = Class117_Sub22_Sub12.method2584(16777215, 668388556) + var5;
						break;
					}
				}

			}
		}
	}

	public static void method470(Class106 var0, int var1) {
		Class117_Sub22_Sub1.aClass106_2144 = var0;
	}

	static Class69[] method471(int var0) {
		return new Class69[]{Class69.aClass69_846, Class69.aClass69_850, Class69.aClass69_847};
	}

	public static String method472(CharSequence var0, Class137 var1, int var2) {
		if (var0 == null) {
			return null;
		} else {
			int var3 = 0;

			int var4;
			for (var4 = var0.length(); var3 < var4 && Class47.method771(var0.charAt(var3), (byte) 1); var3++) {
				;
			}

			while (var4 > var3 && Class47.method771(var0.charAt(var4 - 1), (byte) 1)) {
				--var4;
			}

			int var5 = var4 - var3;
			if (var5 >= 1) {
				byte var11;
				if (var1 == null) {
					var11 = 12;
				} else {
					switch (var1.anInt1608 * 1832451619) {
						case 5:
							var11 = 20;
							break;
						default:
							var11 = 12;
					}
				}

				if (var5 <= var11) {
					StringBuilder var6 = new StringBuilder(var5);

					for (int var14 = var3; var14 < var4; var14++) {
						char var10 = var0.charAt(var14);
						boolean var12;
						if (Character.isISOControl(var10)) {
							var12 = false;
						} else if (Class117_Sub22_Sub7.method2471(var10, 1683323046)) {
							var12 = true;
						} else {
							char[] var7 = Class102.aCharArray1148;
							int var8 = 0;

							label86:
							while (true) {
								char var9;
								if (var8 >= var7.length) {
									var7 = Class102.aCharArray1149;

									for (var8 = 0; var8 < var7.length; var8++) {
										var9 = var7[var8];
										if (var10 == var9) {
											var12 = true;
											break label86;
										}
									}

									var12 = false;
									break;
								}

								var9 = var7[var8];
								if (var10 == var9) {
									var12 = true;
									break;
								}

								++var8;
							}
						}

						if (var12) {
							char var13 = Class138.method1747(var10, -2022713873);
							if (var13 != 0) {
								var6.append(var13);
							}
						}
					}

					if (var6.length() == 0) {
						return null;
					}

					return var6.toString();
				}
			}

			return null;
		}
	}

	public static int method473(Class117_Sub14 var0, String var1, int var2) {
		int var3 = var0.anInt1880 * 561453169;
		int var4 = var1.length();
		byte[] var5 = new byte[var4];

		for (int var7 = 0; var7 < var4; var7++) {
			char var6 = var1.charAt(var7);
			if ((var6 <= 0 || var6 >= 128) && (var6 < 160 || var6 > 255)) {
				if (var6 == 8364) {
					var5[var7] = -128;
				} else if (var6 == 8218) {
					var5[var7] = -126;
				} else if (var6 == 402) {
					var5[var7] = -125;
				} else if (var6 == 8222) {
					var5[var7] = -124;
				} else if (var6 == 8230) {
					var5[var7] = -123;
				} else if (var6 == 8224) {
					var5[var7] = -122;
				} else if (var6 == 8225) {
					var5[var7] = -121;
				} else if (var6 == 710) {
					var5[var7] = -120;
				} else if (var6 == 8240) {
					var5[var7] = -119;
				} else if (var6 == 352) {
					var5[var7] = -118;
				} else if (var6 == 8249) {
					var5[var7] = -117;
				} else if (var6 == 338) {
					var5[var7] = -116;
				} else if (var6 == 381) {
					var5[var7] = -114;
				} else if (var6 == 8216) {
					var5[var7] = -111;
				} else if (var6 == 8217) {
					var5[var7] = -110;
				} else if (var6 == 8220) {
					var5[var7] = -109;
				} else if (var6 == 8221) {
					var5[var7] = -108;
				} else if (var6 == 8226) {
					var5[var7] = -107;
				} else if (var6 == 8211) {
					var5[var7] = -106;
				} else if (var6 == 8212) {
					var5[var7] = -105;
				} else if (var6 == 732) {
					var5[var7] = -104;
				} else if (var6 == 8482) {
					var5[var7] = -103;
				} else if (var6 == 353) {
					var5[var7] = -102;
				} else if (var6 == 8250) {
					var5[var7] = -101;
				} else if (var6 == 339) {
					var5[var7] = -100;
				} else if (var6 == 382) {
					var5[var7] = -98;
				} else if (var6 == 376) {
					var5[var7] = -97;
				} else {
					var5[var7] = 63;
				}
			} else {
				var5[var7] = (byte) var6;
			}
		}

		var0.method2008(var5.length, -1526005555);
		var0.anInt1880 += Class146.aClass61_1663.method916(var5, 0, var5.length, var0.aByteArray1885, var0.anInt1880 * 561453169, 789227247) * -2079217519;
		return var0.anInt1880 * 561453169 - var3;
	}

}
