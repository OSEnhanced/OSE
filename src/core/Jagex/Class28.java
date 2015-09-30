package core.Jagex;
public class Class28 implements Runnable {

	static byte[][][] aByteArrayArrayArray347;
	static int anInt352;
	static final int anInt353 = 104;
	static Class117_Sub22_Sub17_Sub2[] aClass117_Sub22_Sub17_Sub2Array354;
	static final int anInt355 = 256;
	static Class117_Sub22_Sub17_Sub2[] aClass117_Sub22_Sub17_Sub2Array356;
	static int anInt358;
	static int anInt359;
	public static final int anInt360 = 3;
	int anInt351 = 0;
	boolean aBool348 = true;
	Object anObject349 = new Object();
	int[] anIntArray350 = new int[500];
	int[] anIntArray357 = new int[500];

	public void run() {
		for (; aBool348; Class38.method520(50L)) {
			Object var1 = anObject349;
			synchronized (var1) {
				if (anInt351 * -476391515 < 500) {
					anIntArray350[anInt351 * -476391515] = Class75.anInt903 * -456706193;
					anIntArray357[anInt351 * -476391515] = Class75.anInt904 * 1381104939;
					anInt351 -= 2123614163;
				}
			}
		}

	}

	static int method411(Class24 var0, Class24 var1, int var2, boolean var3, int var4, boolean var5, int var6) {
		int var7 = Class117_Sub19.method2331(var0, var1, var2, var3, 943702311);
		if (var7 != 0) {
			return var3 ? -var7 : var7;
		} else if (var4 == -1) {
			return 0;
		} else {
			int var8 = Class117_Sub19.method2331(var0, var1, var4, var5, 964451417);
			return var5 ? -var8 : var8;
		}
	}

	static void method414(Class117_Sub22_Sub18_Sub1 var0, short var1) {
		if (GameClient.anInt2923 * -488599663 == var0.anInt2586 * -1286160125 || var0.anInt2558 * -919017135 == -1 || var0.anInt2543 * 341825591 != 0 || 1 + var0.anInt2573 * -1029146819 > Class114_Sub1.method1838(var0.anInt2558 * -919017135, (byte) -34).anIntArray2405[var0.anInt2572 * -1717673467]) {
			int var3 = var0.anInt2586 * -1286160125 - var0.anInt2585 * -624254305;
			int var4 = GameClient.anInt2923 * -488599663 - var0.anInt2585 * -624254305;
			int var2 = var0.anInt2545 * -659115712 + var0.anInt2581 * 1351936128;
			int var5 = var0.anInt2545 * -659115712 + var0.anInt2583 * -422062464;
			int var7 = var0.anInt2582 * 1216807552 + var0.anInt2545 * -659115712;
			int var6 = var0.anInt2545 * -659115712 + var0.anInt2584 * -1762026368;
			var0.anInt2577 = (var2 * (var3 - var4) + var4 * var7) / var3 * -2090048417;
			var0.anInt2567 = ((var3 - var4) * var5 + var4 * var6) / var3 * -672987565;
		}

		var0.anInt2597 = 0;
		var0.anInt2590 = var0.anInt2587 * 1707749791;
		var0.anInt2542 = var0.anInt2590 * 1725515071;
	}

	static void method415(String var0, int var1) {
		Class117_Sub7.aString1790 = var0;

		try {
			String var2 = Class92.aGameClient1087.getParameter(Class125.aClass125_1545.aString1548);
			String var3 = Class92.aGameClient1087.getParameter(Class125.aClass125_1546.aString1548);
			String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
			if (var0.length() == 0) {
				var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var4 = var4 + "; Expires=" + Class98.method1273(Class47.method774(-300441017) + 94608000000L) + "; Max-Age=" + 94608000L;
			}

			Class71.method980(Class92.aGameClient1087, "document.cookie=\"" + var4 + "\"", 1158057450);
		} catch (Throwable var5) {
			;
		}

	}

	static byte[] method416(byte[] var0, int var1) {
		Class117_Sub14 var2 = new Class117_Sub14(var0);
		int var6 = var2.method2010(-1439707937);
		int var5 = var2.method2015((byte) 32);
		if (var5 >= 0 && (Class106.anInt1190 * -1645964677 == 0 || var5 <= Class106.anInt1190 * -1645964677)) {
			if (var6 == 0) {
				byte[] var7 = new byte[var5];
				var2.method2021(var7, 0, var5, 1658176429);
				return var7;
			} else {
				int var3 = var2.method2015((byte) 24);
				if (var3 >= 0 && (Class106.anInt1190 * -1645964677 == 0 || var3 <= Class106.anInt1190 * -1645964677)) {
					byte[] var4 = new byte[var3];
					if (var6 == 1) {
						Class53.method824(var4, var3, var0, var5, 9);
					} else {
						Class106.aClass64_1183.method940(var2, var4, (byte) 0);
					}

					return var4;
				} else {
					throw new RuntimeException();
				}
			}
		} else {
			throw new RuntimeException();
		}
	}

	static void method417(int var0, Class88 var1, Class106_Sub1 var2, short var3) {
		Class117_Sub15 var4 = new Class117_Sub15();
		var4.anInt1898 = -1244898937;
		var4.aLong1503 = (long) var0;
		var4.aClass88_1899 = var1;
		var4.aClass106_Sub1_1900 = var2;
		Class120 var5 = Class107.aClass120_1198;
		synchronized (var5) {
			Class107.aClass120_1198.method1575(var4);
		}

		Class117_Sub22_Sub11.method2553(1675882970);
	}

	static void method418(Class117_Sub9 var0, byte var1) {
		int var2 = 0;
		int var6 = -1;
		int var3 = 0;
		int var5 = 0;
		if (var0.anInt1818 * 516529391 == 0) {
			var2 = Class117_Sub13.aClass42_1875.method706(var0.anInt1820 * -1213240437, var0.anInt1810 * 358282887, var0.anInt1811 * -2131922755);
		}

		if (var0.anInt1818 * 516529391 == 1) {
			var2 = Class117_Sub13.aClass42_1875.method623(var0.anInt1820 * -1213240437, var0.anInt1810 * 358282887, var0.anInt1811 * -2131922755);
		}

		if (var0.anInt1818 * 516529391 == 2) {
			var2 = Class117_Sub13.aClass42_1875.method664(var0.anInt1820 * -1213240437, var0.anInt1810 * 358282887, var0.anInt1811 * -2131922755);
		}

		if (var0.anInt1818 * 516529391 == 3) {
			var2 = Class117_Sub13.aClass42_1875.method568(var0.anInt1820 * -1213240437, var0.anInt1810 * 358282887, var0.anInt1811 * -2131922755);
		}

		if (var2 != 0) {
			int var4 = Class117_Sub13.aClass42_1875.method569(var0.anInt1820 * -1213240437, var0.anInt1810 * 358282887, var0.anInt1811 * -2131922755, var2);
			var6 = var2 >> 14 & 32767;
			var3 = var4 & 31;
			var5 = var4 >> 6 & 3;
		}

		var0.anInt1813 = var6 * -770089691;
		var0.anInt1825 = var3 * 1141915283;
		var0.anInt1808 = var5 * -1073626743;
	}

}
