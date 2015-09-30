package core.Jagex;
public class Class114_Sub1 extends Class114 {

	static final int anInt1666 = 68;
	static final int anInt1667 = 22;
	static final int anInt1669 = 21;
	static final int anInt1670 = 2;
	static final int anInt1671 = 8;
	static Class117_Sub22_Sub17_Sub3 aClass117_Sub22_Sub17_Sub3_1672;
	static int anInt1673;
	static final int anInt1674 = 131072;
	int anInt1668 = (int) (Class47.method774(-357952431) / 1000L) * 38533323;
	String aString1665;
	short aShort1664;

	static int method1837(int var0, int var1, int var2) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = var1 * (var0 & 127) / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	public static Class117_Sub22_Sub14 method1838(int var0, byte var1) {
		Class117_Sub22_Sub14 var2 = (Class117_Sub22_Sub14) Class117_Sub22_Sub14.aClass115_2401.method1515((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Class117_Sub22_Sub14.aClass106_2419.method1380(12, var0, (byte) 83);
			var2 = new Class117_Sub22_Sub14();
			if (var3 != null) {
				var2.method2633(new Class117_Sub14(var3), (short) 8192);
			}

			var2.method2668(-1033229170);
			Class117_Sub22_Sub14.aClass115_2401.method1517(var2, (long) var0);
			return var2;
		}
	}

	Class114_Sub1(String var1, int var2) {
		aString1665 = var1;
		aShort1664 = (short) var2;
	}

	static void method1839(int var0) {
		for (int var1 = 0; var1 < GameClient.anInt2956 * -434472087; var1++) {
			int var2 = GameClient.anIntArray2957[var1];
			Class117_Sub22_Sub18_Sub1_Sub1 var3 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[var2];
			if (var3 != null) {
				Class7.method116(var3, var3.aClass117_Sub22_Sub5_2864.anInt2198 * -1941498503, 364860238);
			}
		}

	}

	static void method1840(String var0, int var1) {
		if (var0 != null) {
			if ((GameClient.anInt3198 * -1278614973 < 200 || GameClient.anInt3043 * 1688753487 == 1) && GameClient.anInt3198 * -1278614973 < 400) {
				String var3 = Class32.method472(var0, Class54.aClass137_729, 1538480085);
				if (var3 != null) {
					String var2;
					int var4;
					String var6;
					for (var4 = 0; var4 < GameClient.anInt3198 * -1278614973; var4++) {
						Class49 var5 = GameClient.aClass49Array3098[var4];
						var2 = Class32.method472(var5.aString660, Class54.aClass137_729, 1538480085);
						if (var2 != null && var2.equals(var3)) {
							Class117_Sub22_Sub1.method2353(30, "", var0 + Class108.aString1412, 421423739);
							return;
						}

						if (var5.aString656 != null) {
							var6 = Class32.method472(var5.aString656, Class54.aClass137_729, 1538480085);
							if (var6 != null && var6.equals(var3)) {
								Class117_Sub22_Sub1.method2353(30, "", var0 + Class108.aString1412, 1846286714);
								return;
							}
						}
					}

					for (var4 = 0; var4 < GameClient.anInt2976 * -178563241; var4++) {
						Class43 var7 = GameClient.aClass43Array3192[var4];
						var2 = Class32.method472(var7.aString581, Class54.aClass137_729, 1538480085);
						if (var2 != null && var2.equals(var3)) {
							Class117_Sub22_Sub1.method2353(30, "", Class108.aString1372 + var0 + Class108.aString1293, 1163720697);
							return;
						}

						if (var7.aString588 != null) {
							var6 = Class32.method472(var7.aString588, Class54.aClass137_729, 1538480085);
							if (var6 != null && var6.equals(var3)) {
								Class117_Sub22_Sub1.method2353(30, "", Class108.aString1372 + var0 + Class108.aString1293, 1955671316);
								return;
							}
						}
					}

					if (Class32.method472(Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.getPlayerName(), Class54.aClass137_729, 1538480085).equals(var3)) {
						Class117_Sub22_Sub1.method2353(30, "", Class108.aString1350, 1120962196);
					} else {
						GameClient.aClass117_Sub14_Sub1_2961.method2932(21, 2068981613);
						GameClient.aClass117_Sub14_Sub1_2961.method2126(Class37.method517(var0, -1137267761), 744626191);
						GameClient.aClass117_Sub14_Sub1_2961.method2001(var0, 1436630097);
					}
				}
			} else {
				Class117_Sub22_Sub1.method2353(30, "", Class108.aString1444, 444187502);
			}
		}
	}

}
