package core.Jagex;
import java.awt.*;
import java.lang.management.GarbageCollectorMXBean;

public class Class117_Sub10 extends Class117 {

	static final int anInt1827 = 40;
	int anInt1828;
	static int[] anIntArray1830;
	int anInt1831;
	static final int anInt1832 = 30;
	static final int anInt1833 = 37;
	static final int anInt1834 = 1004;
	static int anInt1835;
	public static final int anInt1836 = 16777216;
	static final int anInt1837 = 19136995;
	static final int anInt1838 = 20;
	public static Class145[] aClass145Array1839;
	static Class106_Sub1 aClass106_Sub1_1840;
	static final int anInt1841 = 16;
	static GarbageCollectorMXBean aGarbageCollectorMXBean1842;
	public static final int anInt1843 = 217;
	static final int anInt1844 = 0;
	boolean aBool1829 = false;

	static void method1969(int var0) {
		int var1 = GameClient.anInt2905 * -144834411;
		int var2 = GameClient.anInt2906 * -1191072495;
		int var3 = Class14.anInt177 * 715849079 - Class80.anInt952 * 1566500665 - var1;
		int var4 = Class117_Sub18.anInt1954 * 910153847 - Class117_Sub22_Sub18_Sub2.anInt2613 * 1325743505 - var2;
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
			try {
				Container var5 = Class92.aGameClient1087.method3576(1549154784);
				int var6 = 0;
				int var7 = 0;
				if (Class117_Sub22_Sub6.aFrame2269 == var5) {
					Insets var8 = Class117_Sub22_Sub6.aFrame2269.getInsets();
					var6 = var8.left;
					var7 = var8.top;
				}

				Graphics var10 = var5.getGraphics();
				var10.setColor(Color.black);
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, Class117_Sub18.anInt1954 * 910153847);
				}

				if (var2 > 0) {
					var10.fillRect(var6, var7, Class14.anInt177 * 715849079, var2);
				}

				if (var3 > 0) {
					var10.fillRect(var6 + Class14.anInt177 * 715849079 - var3, var7, var3, Class117_Sub18.anInt1954 * 910153847);
				}

				if (var4 > 0) {
					var10.fillRect(var6, var7 + Class117_Sub18.anInt1954 * 910153847 - var4, Class14.anInt177 * 715849079, var4);
				}
			} catch (Exception var9) {
				;
			}
		}

	}

	public static Interface4 method1970(Interface4[] var0, int var1, int var2) {
		Interface4[] var3 = var0;

		for (int var4 = 0; var4 < var3.length; var4++) {
			Interface4 var5 = var3[var4];
			if (var1 == var5.method40((byte) 8)) {
				return var5;
			}
		}

		return null;
	}

	public static String method1971(String var0, int var1) {
		int var2 = var0.length();
		char[] var5 = new char[var2];
		byte var4 = 2;

		for (int var6 = 0; var6 < var2; var6++) {
			char var3 = var0.charAt(var6);
			if (var4 == 0) {
				var3 = Character.toLowerCase(var3);
			} else if (var4 == 2 || Character.isUpperCase(var3)) {
				var3 = Applet_Sub1.method3648(var3, -1615556801);
			}

			if (Character.isLetter(var3)) {
				var4 = 0;
			} else if (var3 != 46 && var3 != 63 && var3 != 33) {
				if (Character.isSpaceChar(var3)) {
					if (var4 != 2) {
						var4 = 1;
					}
				} else {
					var4 = 1;
				}
			} else {
				var4 = 2;
			}

			var5[var6] = var3;
		}

		return new String(var5);
	}

	static int method1972(int var0, int var1, int var2) {
		long var3 = (long) ((var0 << 16) + var1);
		return Class40.aClass117_Sub22_Sub20_504 != null && var3 == Class40.aClass117_Sub22_Sub20_504.aLong1503 ? 1 + Class117_Sub14.aClass117_Sub14_1878.anInt1880 * -250711117 / (Class117_Sub14.aClass117_Sub14_1878.aByteArray1885.length - Class40.aClass117_Sub22_Sub20_504.aByte2492) : 0;
	}

}
