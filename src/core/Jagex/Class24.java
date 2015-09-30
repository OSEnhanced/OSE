package core.Jagex;
public class Class24 {

	static Class24[] aClass24Array290;
	static final int anInt291 = 2;
	static final int anInt292 = 1;
	int anInt294;
	public static final int anInt295 = 81;
	int anInt296;
	int anInt299;
	int anInt300;
	String aString301;
	String aString302;
	int anInt303;
	static Class14 aClass14_305;
	static final int anInt306 = 3;
	public static final int anInt307 = 254;
	static int anInt293 = 0;
	static int anInt298 = 0;
	static int[] anIntArray304 = new int[]{1, 1, 1, 1};
	static int[] anIntArray297 = new int[]{0, 1, 2, 3};

	boolean method371(int var1) {
		return (1 & anInt299 * 59607667) != 0;
	}

	boolean method374(byte var1) {
		return (8 & anInt299 * 59607667) != 0;
	}

	public static void method381(int var0) {
		Class117_Sub22_Sub10.aClass115_2298.method1518();
	}

	boolean method384(int var1) {
		return (2 & anInt299 * 59607667) != 0;
	}

	boolean method391(int var1) {
		return (4 & anInt299 * 59607667) != 0;
	}

	static int method396(int var0, int var1) {
		Class117_Sub22_Sub7 var2 = (Class117_Sub22_Sub7) Class35.aClass118_442.method1540((long) var0);
		return var2 == null ? -1 : (var2.aClass117_Sub22_2133 != Class35.aClass123_441.aClass117_Sub22_1529 ? ((Class117_Sub22_Sub7) var2.aClass117_Sub22_2133).anInt2279 * 1239720595 : -1);
	}

	static void method398(Class5 var0, int var1) {
		if (GameClient.anInt3153 * -140834255 == Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2577 * 1961555871 >> 7 && Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2567 * -184603173 >> 7 == GameClient.anInt3154 * 45835813) {
			GameClient.anInt3153 = 0;
		}

		int var6 = Class4.anInt46 * -1915182763;
		int[] var2 = Class4.anIntArray41;
		int var8 = var6;
		if (var0 == Class5.aClass5_53 || var0 == Class5.aClass5_54) {
			var8 = 1;
		}

		for (int var3 = 0; var3 < var8; var3++) {
			Class117_Sub22_Sub18_Sub1_Sub2 var4;
			int var5;
			if (Class5.aClass5_53 == var0) {
				var4 = Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393;
				var5 = Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2894 * 577467381 << 14;
			} else if (Class5.aClass5_54 == var0) {
				var4 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[GameClient.anInt3084 * 833823819];
				var5 = GameClient.anInt3084 * 833823819 << 14;
			} else {
				var4 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var2[var3]];
				var5 = var2[var3] << 14;
				if (Class5.aClass5_55 == var0 && var2[var3] == GameClient.anInt3084 * 833823819) {
					continue;
				}
			}

			if (var4 != null && var4.method3074(-126706481) && !var4.aBool2883) {
				var4.aBool2887 = false;
				if ((GameClient.aBool2921 && var6 > 50 || var6 > 200) && var0 != Class5.aClass5_53 && var4.anInt2568 * -2098720445 == var4.anInt2544 * 1732563927) {
					var4.aBool2887 = true;
				}

				int var7 = var4.anInt2577 * 1961555871 >> 7;
				int var9 = var4.anInt2567 * -184603173 >> 7;
				if (var7 >= 0 && var7 < 104 && var9 >= 0 && var9 < 104) {
					if (var4.aClass117_Sub22_Sub18_Sub7_2882 != null && GameClient.anInt2923 * -488599663 >= var4.anInt2892 * -1054032987 && GameClient.anInt2923 * -488599663 < var4.anInt2878 * -1347311997) {
						var4.aBool2887 = false;
						var4.anInt2870 = Class44.method729(var4.anInt2577 * 1961555871, var4.anInt2567 * -184603173, Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, 24247699) * -1744965691;
						Class117_Sub13.aClass42_1875.method551(Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, var4.anInt2577 * 1961555871, var4.anInt2567 * -184603173, var4.anInt2870 * 959559437, 60, var4, var4.anInt2542 * 240902973, var5, var4.anInt2889 * 1910680967, var4.anInt2884 * 200178151, var4.anInt2885 * 1321003429, var4.anInt2886 * -1793092023);
					} else {
						if ((var4.anInt2577 * 1961555871 & 127) == 64 && (var4.anInt2567 * -184603173 & 127) == 64) {
							if (GameClient.anInt3025 * -1063560007 == GameClient.anIntArrayArray3024[var7][var9]) {
								continue;
							}

							GameClient.anIntArrayArray3024[var7][var9] = GameClient.anInt3025 * -1063560007;
						}

						var4.anInt2870 = Class44.method729(var4.anInt2577 * 1961555871, var4.anInt2567 * -184603173, Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, 936373100) * -1744965691;
						Class117_Sub13.aClass42_1875.method673(Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, var4.anInt2577 * 1961555871, var4.anInt2567 * -184603173, var4.anInt2870 * 959559437, 60, var4, var4.anInt2542 * 240902973, var5, var4.aBool2576);
					}
				}
			}
		}

	}

	static int method399(int var0, int var1, byte var2) {
		Class117_Sub12 var3 = (Class117_Sub12) Class117_Sub12.aClass127_1862.method1675((long) var0);
		return var3 == null ? -1 : (var1 >= 0 && var1 < var3.anIntArray1855.length ? var3.anIntArray1855[var1] : -1);
	}

	static Class117_Sub22_Sub16 method400(int var0, byte var1) {
		Class117_Sub22_Sub16 var2 = (Class117_Sub22_Sub16) Class117_Sub22_Sub14.aClass115_2402.method1515((long) var0);
		if (var2 == null) {
			var2 = Class57.method871(Class117_Sub22_Sub14.aClass106_2410, Class117_Sub22_Sub14.aClass106_2408, var0, false, (byte) 1);
			if (var2 != null) {
				Class117_Sub22_Sub14.aClass115_2402.method1517(var2, (long) var0);
			}

			return var2;
		} else {
			return var2;
		}
	}

}
