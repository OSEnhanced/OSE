package core.Jagex;
import java.awt.event.ActionEvent;

public class Class17 implements Runnable {

	public static final int anInt206 = 4;
	public static final int anInt207 = 27;
	static Class14 aClass14_210;
	Class77 aClass77_211;
	static final int anInt212 = 8;
	volatile Class14[] aClass14Array213 = new Class14[2];
	volatile boolean aBool208 = false;
	volatile boolean aBool209 = false;

	static void method335(int var0, int var1, int var2, int var3, int var4) {
		for (int var5 = var1; var5 <= var1 + var3; var5++) {
			for (int var6 = var0; var6 <= var0 + var2; var6++) {
				if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
					Class31.aByteArrayArrayArray385[0][var6][var5] = 127;
					if (var0 == var6 && var6 > 0) {
						Class31.anIntArrayArrayArray381[0][var6][var5] = Class31.anIntArrayArrayArray381[0][var6 - 1][var5];
					}

					if (var0 + var2 == var6 && var6 < 103) {
						Class31.anIntArrayArrayArray381[0][var6][var5] = Class31.anIntArrayArrayArray381[0][1 + var6][var5];
					}

					if (var5 == var1 && var5 > 0) {
						Class31.anIntArrayArrayArray381[0][var6][var5] = Class31.anIntArrayArrayArray381[0][var6][var5 - 1];
					}

					if (var1 + var3 == var5 && var5 < 103) {
						Class31.anIntArrayArrayArray381[0][var6][var5] = Class31.anIntArrayArrayArray381[0][var6][var5 + 1];
					}
				}
			}
		}

	}

	static void method336(Class117_Sub19 var0, int var1) {
		int var2 = var0.anInt2018 * 2064823433;
		if (var2 == 324) {
			if (GameClient.anInt3194 * 361435193 == -1) {
				GameClient.anInt3194 = var0.anInt2021 * 2091490977;
				GameClient.anInt3195 = var0.anInt2081 * 1139177681;
			}

			if (GameClient.aClass91_3193.aBool1076) {
				var0.anInt2021 = GameClient.anInt3194 * 151635297;
			} else {
				var0.anInt2021 = GameClient.anInt3195 * -1463991463;
			}

		} else if (var2 == 325) {
			if (GameClient.anInt3194 * 361435193 == -1) {
				GameClient.anInt3194 = var0.anInt2021 * 2091490977;
				GameClient.anInt3195 = var0.anInt2081 * 1139177681;
			}

			if (GameClient.aClass91_3193.aBool1076) {
				var0.anInt2021 = GameClient.anInt3195 * -1463991463;
			} else {
				var0.anInt2021 = GameClient.anInt3194 * 151635297;
			}

		} else if (var2 == 327) {
			var0.anInt1966 = 1347541870;
			var0.anInt2023 = ((int) (Math.sin((double) (GameClient.anInt2923 * -488599663) / 40.0D) * 256.0D) & 2047) * 633899009;
			var0.anInt2080 = -1257028609;
			var0.anInt2015 = 0;
		} else if (var2 == 328) {
			var0.anInt1966 = 1347541870;
			var0.anInt2023 = ((int) (Math.sin((double) (GameClient.anInt2923 * -488599663) / 40.0D) * 256.0D) & 2047) * 633899009;
			var0.anInt2080 = -1257028609;
			var0.anInt2015 = -680726691;
		}
	}

	public void run() {
		aBool209 = true;

		try {
			try {
				while (!aBool208) {
					Class14 var2;
					for (int var1 = 0; var1 < 2; var1++) {
						var2 = aClass14Array213[var1];
						if (var2 != null) {
							var2.method242((short) 54);
						}
					}

					Class38.method520(10L);
					Class77 var9 = aClass77_211;
					var2 = null;
					if (var9.anEventQueue927 != null) {
						for (int var3 = 0; var3 < 50 && var9.anEventQueue927.peekEvent() != null; var3++) {
							Class38.method520(1L);
						}

						if (var2 != null) {
							var9.anEventQueue927.postEvent(new ActionEvent(var2, 1001, "dummy"));
						}
					}
				}
			} catch (Exception var7) {
				Class117_Sub12.method1987((String) null, var7, -150048592);
				aBool209 = false;
				return;
			}

			aBool209 = false;
		} finally {
			aBool209 = false;
		}
	}

	public static Class117_Sub22_Sub17_Sub2[] method337(Class106 var0, String var1, String var2, int var3) {
		int var4 = var0.method1391(var1, -2119403665);
		int var5 = var0.method1383(var4, var2, (byte) 19);
		return Class108.method1479(var0, var4, var5, -1748303653);
	}

	public static boolean method339(byte var0) {
		try {
			if (Class121.anInt1515 * -704298507 == 2) {
				if (Class40.aClass117_Sub17_505 == null) {
					Class40.aClass117_Sub17_505 = Class117_Sub17.method2259(Class54_Sub1.aClass106_1728, Class117_Sub11.anInt1851 * -674131997, Class117_Sub22_Sub18_Sub2.anInt2605 * -2108022665);
					if (Class40.aClass117_Sub17_505 == null) {
						return false;
					}
				}

				if (Class117_Sub14_Sub1.aClass15_2484 == null) {
					Class117_Sub14_Sub1.aClass15_2484 = new Class15(Class44.aClass106_596, Class121.aClass106_1513);
				}

				if (Class121.aClass117_Sub2_Sub4_1514.method2976(Class40.aClass117_Sub17_505, Class121.aClass106_1516, Class117_Sub14_Sub1.aClass15_2484, 22050, -2098995434)) {
					Class121.aClass117_Sub2_Sub4_1514.method2977((byte) -70);
					Class121.aClass117_Sub2_Sub4_1514.method2974(Class138.anInt1620 * 1197496573, -5774888);
					Class121.aClass117_Sub2_Sub4_1514.method2983(Class40.aClass117_Sub17_505, Class82.aBool972, -1797822067);
					Class121.anInt1515 = 0;
					Class40.aClass117_Sub17_505 = null;
					Class117_Sub14_Sub1.aClass15_2484 = null;
					Class54_Sub1.aClass106_1728 = null;
					return true;
				}
			}
		} catch (Exception var2) {
			var2.printStackTrace();
			Class121.aClass117_Sub2_Sub4_1514.method2980((byte) -34);
			Class121.anInt1515 = 0;
			Class40.aClass117_Sub17_505 = null;
			Class117_Sub14_Sub1.aClass15_2484 = null;
			Class54_Sub1.aClass106_1728 = null;
		}

		return false;
	}

}
