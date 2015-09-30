package core.Jagex;
import java.net.URL;

public class Class4 {

	static final int anInt40 = 24;
	static final int anInt48 = 2;
	static final int anInt50 = 18;
	static final int anInt51 = 1;
	static final int anInt52 = 1;
	static byte[] aByteArray37 = new byte[2048];
	static byte[] aByteArray38 = new byte[2048];
	static Class117_Sub14[] aClass117_Sub14Array39 = new Class117_Sub14[2048];
	static int anInt46 = 0;
	static int[] anIntArray41 = new int[2048];
	static int anInt42 = 0;
	static int[] anIntArray43 = new int[2048];
	static int[] anIntArray44 = new int[2048];
	static int[] anIntArray45 = new int[2048];
	static int[] anIntArray35 = new int[2048];
	static int anInt36 = 0;
	static int[] anIntArray47 = new int[2048];
	static Class117_Sub14 aClass117_Sub14_49 = new Class117_Sub14(new byte[5000]);

	static void method73(Class117_Sub2 var0, byte var1) {
		var0.aBool1680 = false;
		if (var0.aClass117_Sub4_1682 != null) {
			var0.aClass117_Sub4_1682.anInt1727 = 0;
		}

		for (Class117_Sub2 var2 = var0.method1859(); var2 != null; var2 = var0.method1848()) {
			method73(var2, (byte) -128);
		}

	}

	Class4() throws Throwable {
		throw new Error();
	}

	static boolean method82(short var0) {
		try {
			if (Class78.aClass41_935 == null) {
				Class78.aClass41_935 = new Class41(Class84.aClass77_989, new URL(Class117_Sub22_Sub18_Sub2.aString2602));
			} else {
				byte[] var1 = Class78.aClass41_935.method531(1406883188);
				if (var1 != null) {
					Class117_Sub14 var2 = new Class117_Sub14(var1);
					Class24.anInt293 = var2.method2012(1053511631) * -1544688193;
					Class24.aClass24Array290 = new Class24[Class24.anInt293 * -2027355585];

					for (int var3 = 0; var3 < Class24.anInt293 * -2027355585; var3++) {
						Class24 var4 = Class24.aClass24Array290[var3] = new Class24();
						var4.anInt294 = var2.method2012(1053511631) * -2143429379;
						var4.anInt299 = var2.method2015((byte) 46) * -750310725;
						var4.aString301 = var2.method2018((byte) 71);
						var4.aString302 = var2.method2018((byte) 17);
						var4.anInt303 = var2.method2010(-1439707937) * 430566201;
						var4.anInt300 = var2.method2013(1511075930) * 2085009921;
						var4.anInt296 = var3 * 2084707103;
					}

					Class117_Sub22_Sub2.method2363(Class24.aClass24Array290, 0, Class24.aClass24Array290.length - 1, Class24.anIntArray297, Class24.anIntArray304, -823785876);
					Class78.aClass41_935 = null;
					return true;
				}
			}
		} catch (Exception var5) {
			var5.printStackTrace();
			Class78.aClass41_935 = null;
		}

		return false;
	}

	static int method84(int var0) {
		return 8;
	}

	public static boolean method85(int var0, int var1) {
		if (Class117_Sub19.aBoolArray1962[var0]) {
			return true;
		} else if (!Class117_Sub19.aClass106_2093.method1464(var0, (byte) -56)) {
			return false;
		} else {
			int var2 = Class117_Sub19.aClass106_2093.method1399(var0, 2133678255);
			if (var2 == 0) {
				Class117_Sub19.aBoolArray1962[var0] = true;
				return true;
			} else {
				if (Class117_Sub19.aClass117_Sub19ArrayArray2032[var0] == null) {
					Class117_Sub19.aClass117_Sub19ArrayArray2032[var0] = new Class117_Sub19[var2];
				}

				for (int var4 = 0; var4 < var2; var4++) {
					if (Class117_Sub19.aClass117_Sub19ArrayArray2032[var0][var4] == null) {
						byte[] var3 = Class117_Sub19.aClass106_2093.method1380(var0, var4, (byte) 43);
						if (var3 != null) {
							Class117_Sub19.aClass117_Sub19ArrayArray2032[var0][var4] = new Class117_Sub19();
							Class117_Sub19.aClass117_Sub19ArrayArray2032[var0][var4].anInt1973 = (var4 + (var0 << 16)) * -2132461253;
							if (var3[0] == -1) {
								Class117_Sub19.aClass117_Sub19ArrayArray2032[var0][var4].method2321(new Class117_Sub14(var3), (byte) 16);
							} else {
								Class117_Sub19.aClass117_Sub19ArrayArray2032[var0][var4].method2282(new Class117_Sub14(var3), -1211120419);
							}
						}
					}
				}

				Class117_Sub19.aBoolArray1962[var0] = true;
				return true;
			}
		}
	}

	static void method86(Class117_Sub22_Sub5 var0, int var1, int var2, int var3, int var4) {
		if (GameClient.anInt3060 * 1223430109 < 400) {
			if (var0.anIntArray2210 != null) {
				var0 = var0.method2394(-1476055363);
			}

			if (var0 != null) {
				if (var0.aBool2213) {
					if (!var0.aBool2215 || var1 == GameClient.anInt2983 * -2019348217) {
						String var6 = var0.aString2208;
						if (var0.anInt2196 * -1316966379 != 0) {
							var6 = var6 + Class83.method1139(var0.anInt2196 * -1316966379, Class31.player.anInt2874 * -1654863477, -1873348047) + " " + Class39.aString479 + Class108.aString1356 + var0.anInt2196 * -1316966379 + Class39.aString480;
						}

						if (GameClient.anInt3071 * -339828245 == 1) {
							Class81.method1109(Class108.aString1326, GameClient.aString3058 + " " + Class39.aString481 + " " + Class117_Sub22_Sub12.method2584(16776960, 668388556) + var6, 7, var1, var2, var3, -2069703813);
						} else if (!GameClient.aBool3074) {
							String[] var7 = var0.aStringArray2200;
							if (GameClient.aBool3090) {
								var7 = Class69.method968(var7, (short) 25397);
							}

							int var8;
							if (var7 != null) {
								for (var8 = 4; var8 >= 0; --var8) {
									if (var7[var8] != null && !var7[var8].equalsIgnoreCase(Class108.aString1352)) {
										byte var5 = 0;
										if (var8 == 0) {
											var5 = 9;
										}

										if (var8 == 1) {
											var5 = 10;
										}

										if (var8 == 2) {
											var5 = 11;
										}

										if (var8 == 3) {
											var5 = 12;
										}

										if (var8 == 4) {
											var5 = 13;
										}

										Class81.method1109(var7[var8], Class117_Sub22_Sub12.method2584(16776960, 668388556) + var6, var5, var1, var2, var3, -1549478227);
									}
								}
							}

							if (var7 != null) {
								for (var8 = 4; var8 >= 0; --var8) {
									if (var7[var8] != null && var7[var8].equalsIgnoreCase(Class108.aString1352)) {
										short var10 = 0;
										if (Class36.aClass36_446 == GameClient.aClass36_3077 || GameClient.aClass36_3077 == Class36.aClass36_451 && var0.anInt2196 * -1316966379 > Class31.player.anInt2874 * -1654863477) {
											var10 = 2000;
										}

										int var9 = 0;
										if (var8 == 0) {
											var9 = 9 + var10;
										}

										if (var8 == 1) {
											var9 = var10 + 10;
										}

										if (var8 == 2) {
											var9 = 11 + var10;
										}

										if (var8 == 3) {
											var9 = var10 + 12;
										}

										if (var8 == 4) {
											var9 = 13 + var10;
										}

										Class81.method1109(var7[var8], Class117_Sub22_Sub12.method2584(16776960, 668388556) + var6, var9, var1, var2, var3, -1903314433);
									}
								}
							}

							Class81.method1109(Class108.aString1351, Class117_Sub22_Sub12.method2584(16776960, 668388556) + var6, 1003, var1, var2, var3, -1489257520);
						} else if ((Class25.anInt311 * 746665735 & 2) == 2) {
							Class81.method1109(GameClient.aString2931, GameClient.aString3078 + " " + Class39.aString481 + " " + Class117_Sub22_Sub12.method2584(16776960, 668388556) + var6, 8, var1, var2, var3, -1184392032);
						}

					}
				}
			}
		}
	}

}
