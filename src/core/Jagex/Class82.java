package core.Jagex;
import java.awt.*;
import java.io.File;
import java.util.Hashtable;

public class Class82 {

	public static boolean aBool972;
	static File aFile973;
	static final int anInt975 = -306674912;
	static final int anInt976 = 67;
	static int anInt977;
	static int anInt978;
	public static Class8 aClass8_979;
	static boolean aBool974 = false;
	static Hashtable aHashtable980 = new Hashtable(16);

	Class82() throws Throwable {
		throw new Error();
	}

	static void method1115(Class117_Sub14_Sub1 var0, int var1, int var2) {
		boolean var4 = var0.method2931(1, -1320315244) == 1;
		if (var4) {
			Class4.anIntArray47[(Class4.anInt36 += 1741958109) * -1049459595 - 1] = var1;
		}

		int var5 = var0.method2931(2, -1320315244);
		Class117_Sub22_Sub18_Sub1_Sub2 var3 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var1];
		if (var5 == 0) {
			if (var4) {
				var3.aBool2879 = false;
			} else if (GameClient.anInt3042 * 610133147 == var1) {
				throw new RuntimeException();
			} else {
				Class4.anIntArray44[var1] = (var3.anIntArray2541[0] + Class117_Sub22_Sub19.anInt2468 * -771797447 >> 6) + (Class117_Sub22_Sub20.anInt2497 * 544615727 + var3.anIntArray2594[0] >> 6 << 14) + (var3.anInt2890 * -2130376517 << 28);
				if (var3.anInt2592 * -1249762801 != -1) {
					Class4.anIntArray45[var1] = var3.anInt2592 * -1249762801;
				} else {
					Class4.anIntArray45[var1] = var3.anInt2590 * 965827843;
				}

				Class4.anIntArray35[var1] = var3.anInt2565 * -771439697;
				GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var1] = null;
				if (var0.method2931(1, -1320315244) != 0) {
					Class74.method1005(var0, var1, 1001610797);
				}

			}
		} else {
			int var6;
			int var7;
			int var8;
			if (var5 == 1) {
				var6 = var0.method2931(3, -1320315244);
				var7 = var3.anIntArray2594[0];
				var8 = var3.anIntArray2541[0];
				if (var6 == 0) {
					--var7;
					--var8;
				} else if (var6 == 1) {
					--var8;
				} else if (var6 == 2) {
					++var7;
					--var8;
				} else if (var6 == 3) {
					--var7;
				} else if (var6 == 4) {
					++var7;
				} else if (var6 == 5) {
					--var7;
					++var8;
				} else if (var6 == 6) {
					++var8;
				} else if (var6 == 7) {
					++var7;
					++var8;
				}

				if (var1 != GameClient.anInt3042 * 610133147 || var3.anInt2577 * 1961555871 >= 1536 && var3.anInt2567 * -184603173 >= 1536 && var3.anInt2577 * 1961555871 < 11776 && var3.anInt2567 * -184603173 < 11776) {
					if (var4) {
						var3.aBool2879 = true;
						var3.anInt2891 = var7 * 1384422951;
						var3.anInt2876 = var8 * -1428082065;
					} else {
						var3.aBool2879 = false;
						var3.method3544(var7, var8, Class4.aByteArray38[var1], -1939401980);
					}
				} else {
					var3.method3545(var7, var8, (byte) -12);
					var3.aBool2879 = false;
				}

			} else if (var5 == 2) {
				var6 = var0.method2931(4, -1320315244);
				var7 = var3.anIntArray2594[0];
				var8 = var3.anIntArray2541[0];
				if (var6 == 0) {
					var7 -= 2;
					var8 -= 2;
				} else if (var6 == 1) {
					--var7;
					var8 -= 2;
				} else if (var6 == 2) {
					var8 -= 2;
				} else if (var6 == 3) {
					++var7;
					var8 -= 2;
				} else if (var6 == 4) {
					var7 += 2;
					var8 -= 2;
				} else if (var6 == 5) {
					var7 -= 2;
					--var8;
				} else if (var6 == 6) {
					var7 += 2;
					--var8;
				} else if (var6 == 7) {
					var7 -= 2;
				} else if (var6 == 8) {
					var7 += 2;
				} else if (var6 == 9) {
					var7 -= 2;
					++var8;
				} else if (var6 == 10) {
					var7 += 2;
					++var8;
				} else if (var6 == 11) {
					var7 -= 2;
					var8 += 2;
				} else if (var6 == 12) {
					--var7;
					var8 += 2;
				} else if (var6 == 13) {
					var8 += 2;
				} else if (var6 == 14) {
					++var7;
					var8 += 2;
				} else if (var6 == 15) {
					var7 += 2;
					var8 += 2;
				}

				if (var1 == GameClient.anInt3042 * 610133147 && (var3.anInt2577 * 1961555871 < 1536 || var3.anInt2567 * -184603173 < 1536 || var3.anInt2577 * 1961555871 >= 11776 || var3.anInt2567 * -184603173 >= 11776)) {
					var3.method3545(var7, var8, (byte) -12);
					var3.aBool2879 = false;
				} else if (var4) {
					var3.aBool2879 = true;
					var3.anInt2891 = var7 * 1384422951;
					var3.anInt2876 = var8 * -1428082065;
				} else {
					var3.aBool2879 = false;
					var3.method3544(var7, var8, Class4.aByteArray38[var1], -1833652349);
				}

			} else {
				var6 = var0.method2931(1, -1320315244);
				int var9;
				int var10;
				int var11;
				int var12;
				if (var6 == 0) {
					var7 = var0.method2931(12, -1320315244);
					var8 = var7 >> 10;
					var12 = var7 >> 5 & 31;
					if (var12 > 15) {
						var12 -= 32;
					}

					var10 = var7 & 31;
					if (var10 > 15) {
						var10 -= 32;
					}

					var9 = var3.anIntArray2594[0] + var12;
					var11 = var3.anIntArray2541[0] + var10;
					if (var1 == GameClient.anInt3042 * 610133147 && (var3.anInt2577 * 1961555871 < 1536 || var3.anInt2567 * -184603173 < 1536 || var3.anInt2577 * 1961555871 >= 11776 || var3.anInt2567 * -184603173 >= 11776)) {
						var3.method3545(var9, var11, (byte) -12);
						var3.aBool2879 = false;
					} else if (var4) {
						var3.aBool2879 = true;
						var3.anInt2891 = var9 * 1384422951;
						var3.anInt2876 = var11 * -1428082065;
					} else {
						var3.aBool2879 = false;
						var3.method3544(var9, var11, Class4.aByteArray38[var1], 1357185743);
					}

					var3.anInt2890 = (byte) (var8 + var3.anInt2890 * -2130376517 & 3) * 1587543155;
					if (var1 == GameClient.anInt3042 * 610133147) {
						Class117_Sub22_Sub18_Sub3.anInt2629 = var3.anInt2890 * -67313687;
					}

				} else {
					var7 = var0.method2931(30, -1320315244);
					var8 = var7 >> 28;
					var12 = var7 >> 14 & 16383;
					var10 = var7 & 16383;
					var9 = (var12 + Class117_Sub22_Sub20.anInt2497 * 544615727 + var3.anIntArray2594[0] & 16383) - Class117_Sub22_Sub20.anInt2497 * 544615727;
					var11 = (var10 + Class117_Sub22_Sub19.anInt2468 * -771797447 + var3.anIntArray2541[0] & 16383) - Class117_Sub22_Sub19.anInt2468 * -771797447;
					if (GameClient.anInt3042 * 610133147 != var1 || var3.anInt2577 * 1961555871 >= 1536 && var3.anInt2567 * -184603173 >= 1536 && var3.anInt2577 * 1961555871 < 11776 && var3.anInt2567 * -184603173 < 11776) {
						if (var4) {
							var3.aBool2879 = true;
							var3.anInt2891 = var9 * 1384422951;
							var3.anInt2876 = var11 * -1428082065;
						} else {
							var3.aBool2879 = false;
							var3.method3544(var9, var11, Class4.aByteArray38[var1], -42398027);
						}
					} else {
						var3.method3545(var9, var11, (byte) -12);
						var3.aBool2879 = false;
					}

					var3.anInt2890 = (byte) (var3.anInt2890 * -2130376517 + var8 & 3) * 1587543155;
					if (GameClient.anInt3042 * 610133147 == var1) {
						Class117_Sub22_Sub18_Sub3.anInt2629 = var3.anInt2890 * -67313687;
					}

				}
			}
		}
	}

	public static void method1116(Component var0, int var1) {
		var0.setFocusTraversalKeysEnabled(false);
		var0.addKeyListener(Class89.aClass89_1055);
		var0.addFocusListener(Class89.aClass89_1055);
	}

	protected static void method1117(int var0) {
		Class88.aClass73_1028.method987(-1194015096);

		int var1;
		for (var1 = 0; var1 < 32; var1++) {
			Applet_Sub1.aLongArray2903[var1] = 0L;
		}

		for (var1 = 0; var1 < 32; var1++) {
			Applet_Sub1.aLongArray2904[var1] = 0L;
		}

		Class117_Sub11.anInt1849 = 0;
	}

	static void method1118(int var0, int var1, int var2, int var3) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var4 = Class44.method729(var0, var1, Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, 1969904694) - var2;
			var0 -= Class76.anInt916 * 1355759835;
			var4 -= Class117_Sub22_Sub1.anInt2143 * 716978923;
			var1 -= Class49.anInt665 * 1784829965;
			int var7 = Class117_Sub22_Sub17_Sub1.anIntArray2653[Class117_Sub5.anInt1758 * -1894076819];
			int var8 = Class117_Sub22_Sub17_Sub1.anIntArray2654[Class117_Sub5.anInt1758 * -1894076819];
			int var9 = Class117_Sub22_Sub17_Sub1.anIntArray2653[RuntimeException_Sub1.anInt2838 * -1774046803];
			int var5 = Class117_Sub22_Sub17_Sub1.anIntArray2654[RuntimeException_Sub1.anInt2838 * -1774046803];
			int var6 = var9 * var1 + var0 * var5 >> 16;
			var1 = var1 * var5 - var9 * var0 >> 16;
			var0 = var6;
			var6 = var8 * var4 - var7 * var1 >> 16;
			var1 = var8 * var1 + var4 * var7 >> 16;
			if (var1 >= 50) {
				GameClient.anInt2941 = (var0 * GameClient.anInt2944 * 1370366911 / var1 + GameClient.anInt3142 * -910791425 / 2) * -1326843327;
				GameClient.anInt3187 = (GameClient.anInt2944 * 1370366911 * var6 / var1 + GameClient.anInt3185 * -278001619 / 2) * 1281930195;
			} else {
				GameClient.anInt2941 = 1326843327;
				GameClient.anInt3187 = -1281930195;
			}

		} else {
			GameClient.anInt2941 = 1326843327;
			GameClient.anInt3187 = -1281930195;
		}
	}

}
