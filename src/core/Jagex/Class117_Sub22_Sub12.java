package core.Jagex;
import java.applet.Applet;
import java.awt.*;

public class Class117_Sub22_Sub12 extends Class117_Sub22 {

	public static Class106 aClass106_2332;
	static final int anInt2333 = 512;
	static final int anInt2345 = 57;
	public int anInt2339 = 0;
	public int anInt2344 = 1374086137;
	public boolean aBool2336 = true;
	public int anInt2337 = 250075431;
	public int anInt2338;
	public int anInt2335;
	public int anInt2340;
	public static Class115 aClass115_2334 = new Class115(64);
	public int anInt2341;
	public int anInt2342;
	public int anInt2343;

	void method2569(Class117_Sub14 var1, int var2, int var3, byte var4) {
		if (var2 == 1) {
			anInt2339 = var1.method2014(1779583420) * 1721401685;
		} else if (var2 == 2) {
			anInt2344 = var1.method2010(-1439707937) * -1374086137;
		} else if (var2 == 5) {
			aBool2336 = false;
		} else if (var2 == 7) {
			anInt2337 = var1.method2014(-178180423) * -250075431;
		} else if (var2 == 8) {
			;
		}

	}

	void method2570(int var1, int var2) {
		double var3 = (double) (var1 >> 16 & 255) / 256.0D;
		double var5 = (double) (var1 >> 8 & 255) / 256.0D;
		double var13 = (double) (var1 & 255) / 256.0D;
		double var9 = var3;
		if (var5 < var3) {
			var9 = var5;
		}

		if (var13 < var9) {
			var9 = var13;
		}

		double var7 = var3;
		if (var5 > var3) {
			var7 = var5;
		}

		if (var13 > var7) {
			var7 = var13;
		}

		double var11 = 0.0D;
		double var15 = 0.0D;
		double var17 = (var7 + var9) / 2.0D;
		if (var9 != var7) {
			if (var17 < 0.5D) {
				var15 = (var7 - var9) / (var7 + var9);
			}

			if (var17 >= 0.5D) {
				var15 = (var7 - var9) / (2.0D - var7 - var9);
			}

			if (var3 == var7) {
				var11 = (var5 - var13) / (var7 - var9);
			} else if (var7 == var5) {
				var11 = (var13 - var3) / (var7 - var9) + 2.0D;
			} else if (var13 == var7) {
				var11 = 4.0D + (var3 - var5) / (var7 - var9);
			}
		}

		var11 /= 6.0D;
		anInt2338 = (int) (var11 * 256.0D) * 488584181;
		anInt2335 = (int) (var15 * 256.0D) * -1482777013;
		anInt2340 = (int) (256.0D * var17) * -300406129;
		if (anInt2335 * -887571613 < 0) {
			anInt2335 = 0;
		} else if (anInt2335 * -887571613 > 255) {
			anInt2335 = -151016267;
		}

		if (anInt2340 * 1096266863 < 0) {
			anInt2340 = 0;
		} else if (anInt2340 * 1096266863 > 255) {
			anInt2340 = 705848433;
		}

	}

	public static void method2571(Applet var0, String var1, int var2) {
		Class80.anApplet951 = var0;
		Class80.aString957 = var1;
	}

	public static void method2575(Class106 var0, int var1) {
		Class117_Sub22_Sub15.aClass106_2446 = var0;
		Class117_Sub22_Sub15.anInt2453 = Class117_Sub22_Sub15.aClass106_2446.method1399(16, 2129962967) * 1130256149;
	}

	static String method2584(int var0, int var1) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

	static void method2585(byte var0) {
		for (Class117_Sub22_Sub18_Sub3 var1 = (Class117_Sub22_Sub18_Sub3) GameClient.aClass120_3054.method1577(); var1 != null; var1 = (Class117_Sub22_Sub18_Sub3) GameClient.aClass120_3054.method1582()) {
			if (var1.anInt2618 * -640474937 == Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421 && !var1.aBool2623) {
				if (GameClient.anInt2923 * -488599663 >= var1.anInt2616 * 1478889431) {
					var1.method3084(GameClient.anInt3092 * -402053703, (byte) 7);
					if (var1.aBool2623) {
						var1.method1532();
					} else {
						Class117_Sub13.aClass42_1875.method673(var1.anInt2618 * -640474937, var1.anInt2619 * 859128481, var1.anInt2620 * 1417765259, var1.anInt2621 * -1194528027, 60, var1, 0, -1, false);
					}
				}
			} else {
				var1.method1532();
			}
		}

	}

	static void method2586(String var0, boolean var1, byte var2) {
		byte var3 = 4;
		int var4 = var3 + 6;
		int var5 = 6 + var3;
		int var6 = Class39.aClass117_Sub22_Sub17_Sub4_Sub1_485.method3500(var0, 250);
		int var7 = Class39.aClass117_Sub22_Sub17_Sub4_Sub1_485.method3457(var0, 250) * 13;
		Class117_Sub22_Sub17.method2877(var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var7 + var3, 0);
		Class117_Sub22_Sub17.method2872(var4 - var3, var5 - var3, var3 + var6 + var3, var3 + var7 + var3, 16777215);
		Class39.aClass117_Sub22_Sub17_Sub4_Sub1_485.method3461(var0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
		Class33.method486(var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var7 + var3, 1521969078);
		if (var1) {
			try {
				Graphics var8 = Class91.aCanvas1085.getGraphics();
				Class82.aClass8_979.method122(var8, 0, 0, 1281812644);
			} catch (Exception var9) {
				Class91.aCanvas1085.repaint();
			}
		} else {
			Class117_Sub22_Sub18_Sub5.method3353(var4, var5, var6, var7, -254455339);
		}

	}

	public void method2587(byte var1) {
		if (anInt2337 * 778565993 != -1) {
			method2570(anInt2337 * 778565993, -1877970720);
			anInt2341 = anInt2338 * 485339229;
			anInt2342 = anInt2335 * 1140105413;
			anInt2343 = anInt2340 * 946397507;
		}

		method2570(anInt2339 * 1885434877, -1850220576);
	}

	static String method2588(String var0, boolean var1, int var2) {
		String var4 = var1 ? "https://" : "http://";
		if (GameClient.anInt2918 * -553019157 == 1) {
			var0 = var0 + "-wtrc";
		} else if (GameClient.anInt2918 * -553019157 == 2) {
			var0 = var0 + "-wtqa";
		} else if (GameClient.anInt2918 * -553019157 == 3) {
			var0 = var0 + "-wtwip";
		} else if (GameClient.anInt2918 * -553019157 == 5) {
			var0 = var0 + "-wti";
		} else if (GameClient.anInt2918 * -553019157 == 4) {
			var0 = "local";
		}

		String var3 = "";
		if (Class117_Sub7.aString1790 != null) {
			var3 = "/p=" + Class117_Sub7.aString1790;
		}

		String var5 = "runescape.com";
		return var4 + var0 + "." + var5 + "/l=" + GameClient.anInt2922 * 1063005447 + "/a=" + Class51.anInt695 * 1036605231 + var3 + "/";
	}

	public void method2589(Class117_Sub14 var1, int var2, int var3) {
		while (true) {
			int var4 = var1.method2010(-1439707937);
			if (var4 == 0) {
				return;
			}

			method2569(var1, var4, var2, (byte) 28);
		}
	}

}
