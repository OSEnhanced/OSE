package core.Jagex;
import java.awt.*;

public final class Class117_Sub22_Sub18_Sub1_Sub1 extends Class117_Sub22_Sub18_Sub1 {

	static final int anInt2863 = 1;
	Class117_Sub22_Sub5 aClass117_Sub22_Sub5_2864;
	static byte[][] aByteArrayArray2865;
	static final int anInt2866 = 54;
	public static final int anInt2867 = 208;
	static Class117_Sub18 aClass117_Sub18_2868;
	static int[] anIntArray2869;

	protected final Class117_Sub22_Sub18_Sub7 method2921(byte var1) {
		if (aClass117_Sub22_Sub5_2864 == null) {
			return null;
		} else {
			Class117_Sub22_Sub14 var5 = anInt2558 * -919017135 != -1 && anInt2543 * 341825591 == 0 ? Class114_Sub1.method1838(anInt2558 * -919017135, (byte) -33) : null;
			Class117_Sub22_Sub14 var6 = anInt2568 * -2098720445 != -1 && (anInt2568 * -2098720445 != anInt2544 * 1732563927 || var5 == null) ? Class114_Sub1.method1838(anInt2568 * -2098720445, (byte) -24) : null;
			Class117_Sub22_Sub18_Sub7 var2 = aClass117_Sub22_Sub5_2864.method2392(var5, anInt2572 * -1717673467, var6, anInt2569 * 1646089229, 1318925477);
			if (var2 == null) {
				return null;
			} else {
				var2.method3410();
				anInt2589 = var2.anInt2466 * -1993620481;
				if (anInt2550 * -1214866767 != -1 && anInt2571 * -1581587247 != -1) {
					Class117_Sub22_Sub18_Sub7 var3 = Class80.method1085(anInt2550 * -1214866767, (byte) 30).method2562(anInt2571 * -1581587247, 553464185);
					if (var3 != null) {
						var3.method3362(0, -(anInt2551 * 901442701), 0);
						Class117_Sub22_Sub18_Sub7[] var4 = new Class117_Sub22_Sub18_Sub7[]{var2, var3};
						var2 = new Class117_Sub22_Sub18_Sub7(var4, 2);
					}
				}

				if (aClass117_Sub22_Sub5_2864.anInt2198 * -1941498503 == 1) {
					var2.aBool2826 = true;
				}

				return var2;
			}
		}
	}

	final void method3532(int var1, byte var2, byte var3) {
		int var4 = anIntArray2594[0];
		int var5 = anIntArray2541[0];
		if (var1 == 0) {
			--var4;
			++var5;
		}

		if (var1 == 1) {
			++var5;
		}

		if (var1 == 2) {
			++var4;
			++var5;
		}

		if (var1 == 3) {
			--var4;
		}

		if (var1 == 4) {
			++var4;
		}

		if (var1 == 5) {
			--var4;
			--var5;
		}

		if (var1 == 6) {
			--var5;
		}

		if (var1 == 7) {
			++var4;
			--var5;
		}

		if (anInt2558 * -919017135 != -1 && Class114_Sub1.method1838(anInt2558 * -919017135, (byte) -21).anInt2415 * 1618076415 == 1) {
			anInt2558 = -1804599217;
		}

		if (anInt2593 * 1000346769 < 9) {
			anInt2593 += 1290677361;
		}

		for (int var6 = anInt2593 * 1000346769; var6 > 0; --var6) {
			anIntArray2594[var6] = anIntArray2594[var6 - 1];
			anIntArray2541[var6] = anIntArray2541[var6 - 1];
			aByteArray2596[var6] = aByteArray2596[var6 - 1];
		}

		anIntArray2594[0] = var4;
		anIntArray2541[0] = var5;
		aByteArray2596[0] = var2;
	}

	final boolean method3074(int var1) {
		return aClass117_Sub22_Sub5_2864 != null;
	}

	public static void method3534(Component var0, byte var1) {
		var0.addMouseListener(Class75.aClass75_912);
		var0.addMouseMotionListener(Class75.aClass75_912);
		var0.addFocusListener(Class75.aClass75_912);
	}

	final void method3535(int var1, int var2, boolean var3, int var4) {
		if (anInt2558 * -919017135 != -1 && Class114_Sub1.method1838(anInt2558 * -919017135, (byte) -128).anInt2415 * 1618076415 == 1) {
			anInt2558 = -1804599217;
		}

		if (!var3) {
			int var5 = var1 - anIntArray2594[0];
			int var6 = var2 - anIntArray2541[0];
			if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
				if (anInt2593 * 1000346769 < 9) {
					anInt2593 += 1290677361;
				}

				for (int var7 = anInt2593 * 1000346769; var7 > 0; --var7) {
					anIntArray2594[var7] = anIntArray2594[var7 - 1];
					anIntArray2541[var7] = anIntArray2541[var7 - 1];
					aByteArray2596[var7] = aByteArray2596[var7 - 1];
				}

				anIntArray2594[0] = var1;
				anIntArray2541[0] = var2;
				aByteArray2596[0] = 1;
				return;
			}
		}

		anInt2593 = 0;
		anInt2598 = 0;
		anInt2597 = 0;
		anIntArray2594[0] = var1;
		anIntArray2541[0] = var2;
		anInt2577 = anInt2545 * 1342752448 + anIntArray2594[0] * -1238225024;
		anInt2567 = anIntArray2541[0] * -243062400 + anInt2545 * 1998780352;
	}

	public static void method3539(int var0) {
		Class89 var1 = Class89.aClass89_1055;
		synchronized (var1) {
			Class89.anInt1059 += 1656979741;
			Class89.anInt1035 = Class89.anInt1058 * -26893987;
			Class89.anInt1039 = 0;
			int var2;
			if (Class89.anInt1051 * 2008718371 < 0) {
				for (var2 = 0; var2 < 112; var2++) {
					Class89.aBoolArray1050[var2] = false;
				}

				Class89.anInt1051 = Class89.anInt1052 * -499352781;
			} else {
				while (Class89.anInt1052 * 23456761 != Class89.anInt1051 * 2008718371) {
					var2 = Class89.anIntArray1049[Class89.anInt1052 * 23456761];
					Class89.anInt1052 = (Class89.anInt1052 * 23456761 + 1 & 127) * 383706697;
					if (var2 < 0) {
						Class89.aBoolArray1050[~var2] = false;
					} else {
						if (!Class89.aBoolArray1050[var2] && Class89.anInt1039 * 383306105 < Class89.anIntArray1054.length - 1) {
							Class89.anIntArray1054[(Class89.anInt1039 -= 1233891127) * 383306105 - 1] = var2;
						}

						Class89.aBoolArray1050[var2] = true;
					}
				}
			}

			Class89.anInt1058 = Class89.anInt1057 * 1424223325;
		}
	}

}
