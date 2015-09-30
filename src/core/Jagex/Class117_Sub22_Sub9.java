package core.Jagex;
import java.awt.*;

public class Class117_Sub22_Sub9 extends Class117_Sub22 {

	static Class106_Sub1 aClass106_Sub1_2287;
	public static final int anInt2294 = 43;
	public static final int anInt2295 = 120;
	int anInt2288 = 0;
	public int anInt2289;
	public int anInt2291;
	public int anInt2292;
	public int anInt2290;
	static Class115 aClass115_2293 = new Class115(64);

	void method2495(Class117_Sub14 var1, int var2, short var3) {
		while (true) {
			int var4 = var1.method2010(-1439707937);
			if (var4 == 0) {
				return;
			}

			method2496(var1, var4, var2, -877219423);
		}
	}

	void method2496(Class117_Sub14 var1, int var2, int var3, int var4) {
		if (var2 == 1) {
			anInt2288 = var1.method2014(-1577219806) * 1530157105;
		}

	}

	void method2497(int var1, int var2) {
		double var3 = (double) (var1 >> 16 & 255) / 256.0D;
		double var9 = (double) (var1 >> 8 & 255) / 256.0D;
		double var5 = (double) (var1 & 255) / 256.0D;
		double var7 = var3;
		if (var9 < var3) {
			var7 = var9;
		}

		if (var5 < var7) {
			var7 = var5;
		}

		double var11 = var3;
		if (var9 > var3) {
			var11 = var9;
		}

		if (var5 > var11) {
			var11 = var5;
		}

		double var13 = 0.0D;
		double var17 = 0.0D;
		double var15 = (var11 + var7) / 2.0D;
		if (var7 != var11) {
			if (var15 < 0.5D) {
				var17 = (var11 - var7) / (var11 + var7);
			}

			if (var15 >= 0.5D) {
				var17 = (var11 - var7) / (2.0D - var11 - var7);
			}

			if (var3 == var11) {
				var13 = (var9 - var5) / (var11 - var7);
			} else if (var11 != var9) {
				if (var5 == var11) {
					var13 = (var3 - var9) / (var11 - var7) + 4.0D;
				}
			} else {
				var13 = 2.0D + (var5 - var3) / (var11 - var7);
			}
		}

		var13 /= 6.0D;
		anInt2289 = (int) (256.0D * var17) * -2089531383;
		anInt2291 = (int) (256.0D * var15) * -2053423911;
		if (anInt2289 * 1736295993 < 0) {
			anInt2289 = 0;
		} else if (anInt2289 * 1736295993 > 255) {
			anInt2289 = -254557961;
		}

		if (anInt2291 * 572097385 < 0) {
			anInt2291 = 0;
		} else if (anInt2291 * 572097385 > 255) {
			anInt2291 = 362912807;
		}

		if (var15 > 0.5D) {
			anInt2292 = (int) (var17 * (1.0D - var15) * 512.0D) * 760320085;
		} else {
			anInt2292 = (int) (512.0D * var15 * var17) * 760320085;
		}

		if (anInt2292 * -1912673027 < 1) {
			anInt2292 = 760320085;
		}

		anInt2290 = (int) (var13 * (double) (anInt2292 * -1912673027)) * -379704725;
	}

	void method2506(byte var1) {
		method2497(anInt2288 * -511442735, -2129186887);
	}

	static void method2510(Component var0, Class106 var1, Class106 var2, boolean var3, int var4, int var5) {
		if (Class6.aBool83) {
			if (var4 == 4) {
				Class6.anInt57 = -1336781068;
			}

		} else {
			Class6.anInt57 = var4 * -334195267;
			Class117_Sub22_Sub17.method2883();
			byte[] var7 = var1.method1396("title.jpg", "", 2001991129);
			Class114_Sub1.aClass117_Sub22_Sub17_Sub3_1672 = new Class117_Sub22_Sub17_Sub3(var7, var0);
			Class29.aClass117_Sub22_Sub17_Sub3_374 = Class114_Sub1.aClass117_Sub22_Sub17_Sub3_1672.method3243();
			Class117_Sub15.aClass117_Sub22_Sub17_Sub2_1901 = Class58.method876(var2, "logo", "", (short) 10217);
			Class6.aClass117_Sub22_Sub17_Sub2_84 = Class58.method876(var2, "titlebox", "", (short) 18334);
			Class6.aClass117_Sub22_Sub17_Sub2_60 = Class58.method876(var2, "titlebutton", "", (short) 15207);
			Class138.aClass117_Sub22_Sub17_Sub2Array1621 = Class17.method337(var2, "runes", "", -1770253171);
			Class29.aClass117_Sub22_Sub17_Sub2Array364 = Class17.method337(var2, "title_mute", "", -1741842469);
			Class46.aClass117_Sub22_Sub17_Sub2_628 = Class58.method876(var2, "options_radio_buttons,0", "", (short) 7360);
			Class29.aClass117_Sub22_Sub17_Sub2_367 = Class58.method876(var2, "options_radio_buttons,2", "", (short) 31470);
			Class43.anIntArray583 = new int[256];

			int var6;
			for (var6 = 0; var6 < 64; var6++) {
				Class43.anIntArray583[var6] = var6 * 262144;
			}

			for (var6 = 0; var6 < 64; var6++) {
				Class43.anIntArray583[64 + var6] = 16711680 + var6 * 1024;
			}

			for (var6 = 0; var6 < 64; var6++) {
				Class43.anIntArray583[var6 + 128] = 16776960 + var6 * 4;
			}

			for (var6 = 0; var6 < 64; var6++) {
				Class43.anIntArray583[192 + var6] = 16777215;
			}

			Class117_Sub7.anIntArray1787 = new int[256];

			for (var6 = 0; var6 < 64; var6++) {
				Class117_Sub7.anIntArray1787[var6] = var6 * 1024;
			}

			for (var6 = 0; var6 < 64; var6++) {
				Class117_Sub7.anIntArray1787[var6 + 64] = var6 * 4 + 65280;
			}

			for (var6 = 0; var6 < 64; var6++) {
				Class117_Sub7.anIntArray1787[128 + var6] = var6 * 262144 + 65535;
			}

			for (var6 = 0; var6 < 64; var6++) {
				Class117_Sub7.anIntArray1787[192 + var6] = 16777215;
			}

			Class117_Sub22_Sub4.anIntArray2178 = new int[256];

			for (var6 = 0; var6 < 64; var6++) {
				Class117_Sub22_Sub4.anIntArray2178[var6] = var6 * 4;
			}

			for (var6 = 0; var6 < 64; var6++) {
				Class117_Sub22_Sub4.anIntArray2178[var6 + 64] = 255 + var6 * 262144;
			}

			for (var6 = 0; var6 < 64; var6++) {
				Class117_Sub22_Sub4.anIntArray2178[var6 + 128] = 16711935 + var6 * 1024;
			}

			for (var6 = 0; var6 < 64; var6++) {
				Class117_Sub22_Sub4.anIntArray2178[var6 + 192] = 16777215;
			}

			Class97.anIntArray1128 = new int[256];
			Class3.anIntArray30 = new int[32768];
			Class117_Sub10.anIntArray1830 = new int[32768];
			Class63.method931((Class117_Sub22_Sub17_Sub2) null, 2097355444);
			Class35.anIntArray444 = new int[32768];
			Class1.anIntArray2 = new int[32768];
			if (var3) {
				Class6.aString75 = "";
				Class6.aString76 = "";
			}

			Class105.anInt1168 = 0;
			Class6.aString80 = "";
			Class6.aBool78 = true;
			Class6.aBool58 = false;
			if (!Class117_Sub22_Sub21.aClass33_2499.aBool420) {
				Class84.method1140(2, Class57.aClass106_Sub1_749, "scape main", "", 255, false, 1123495467);
			} else {
				Class121.anInt1515 = -793599395;
				Class54_Sub1.aClass106_1728 = null;
				Class117_Sub11.anInt1851 = -366489035;
				Class117_Sub22_Sub18_Sub2.anInt2605 = -1519237447;
				Class138.anInt1620 = 0;
				Class82.aBool972 = false;
				Class39.anInt488 = 123400454;
			}

			Class73_Sub2.method2218(false, (byte) 121);
			Class6.aBool83 = true;
			Class6.anInt79 = (Class80.anInt952 * 1566500665 - GameClient.anInt3134 * 1311467871) / 2 * -1528604881;
			Class6.anInt66 = Class6.anInt79 * 1173653371 - 1064817262;
			Class114_Sub1.aClass117_Sub22_Sub17_Sub3_1672.method3242(Class6.anInt79 * 1053511631, 0);
			Class29.aClass117_Sub22_Sub17_Sub3_374.method3242(382 + Class6.anInt79 * 1053511631, 0);
			Class117_Sub15.aClass117_Sub22_Sub17_Sub2_1901.method3239(Class6.anInt79 * 1053511631 + 382 - Class117_Sub15.aClass117_Sub22_Sub17_Sub2_1901.anInt2707 / 2, 18);
		}
	}

	public static Class method2511(String var0, short var1) throws ClassNotFoundException {
		return var0.equals("B") ? Byte.TYPE : (var0.equals("I") ? Integer.TYPE : (!var0.equals("S") ? (var0.equals("J") ? Long.TYPE : (var0.equals("Z") ? Boolean.TYPE : (var0.equals("F") ? Float.TYPE : (var0.equals("D") ? Double.TYPE : (var0.equals("C") ? Character.TYPE : (var0.equals("void") ? Void.TYPE : Class.forName(var0))))))) : Short.TYPE));
	}

	public static String method2518(byte[] var0, int var1, int var2, int var3) {
		char[] var4 = new char[var2];
		int var8 = 0;

		for (int var6 = 0; var6 < var2; var6++) {
			int var5 = var0[var6 + var1] & 255;
			if (var5 != 0) {
				if (var5 >= 128 && var5 < 160) {
					char var7 = Class100.aCharArray1143[var5 - 128];
					if (var7 == 0) {
						var7 = 63;
					}

					var5 = var7;
				}

				var4[var8++] = (char) var5;
			}
		}

		return new String(var4, 0, var8);
	}

}
