package core.Jagex;
import netscape.javascript.JSObject;

import java.applet.Applet;
import java.awt.*;
import java.net.URL;

public class Class117_Sub22_Sub15 extends Class117_Sub22 {

	static Class106 aClass106_2446;
	static final int anInt2447 = 87;
	static final int anInt2450 = 49;
	static Image anImage2451;
	public static final int anInt2452 = 28;
	public static int anInt2453;
	public int anInt2449 = 0;
	static Class115 aClass115_2448 = new Class115(64);

	public static boolean method2834(String var0, int var1, String var2, int var3) {
		if (var1 == 0) {
			try {
				if (!Class80.aString957.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var12 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var5 = 0; var5 < var0.length(); var5++) {
						if (var12.indexOf(var0.charAt(var5)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var6) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Object var11 = Class71.method985(Class80.anApplet951, var2, new Object[]{(new URL(Class80.anApplet951.getCodeBase(), var0)).toString()}, -1418648348);
				return var11 != null;
			} catch (Throwable var7) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				Class80.anApplet951.getAppletContext().showDocument(new URL(Class80.anApplet951.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var8) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				Applet var4 = Class80.anApplet951;
				JSObject.getWindow(var4).call("loggedout", (Object[]) null);
			} catch (Throwable var10) {
				;
			}

			try {
				Class80.anApplet951.getAppletContext().showDocument(new URL(Class80.anApplet951.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var9) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	void method2835(Class117_Sub14 var1, int var2) {
		while (true) {
			int var3 = var1.method2010(-1439707937);
			if (var3 == 0) {
				return;
			}

			method2836(var1, var3, -1691712382);
		}
	}

	void method2836(Class117_Sub14 var1, int var2, int var3) {
		if (var2 == 5) {
			anInt2449 = var1.method2012(1053511631) * 499959235;
		}

	}

	public static void method2840(byte var0) {
		if (Class75.aClass75_912 != null) {
			Class75 var1 = Class75.aClass75_912;
			synchronized (var1) {
				Class75.aClass75_912 = null;
			}
		}

	}

	public static int method2852(int var0) {
		return Class89.anInt1059 * 863586613;
	}

	public static Class117_Sub22_Sub17_Sub3 method2853(Class106 var0, String var1, String var2, int var3) {
		int var4 = var0.method1391(var1, -1077766803);
		int var5 = var0.method1383(var4, var2, (byte) 19);
		return Class117_Sub22_Sub3.method2369(var0, var4, var5, (short) -23219);
	}

}
