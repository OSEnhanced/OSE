package core.Jagex;
import java.util.Date;

public class Class98 {

	public static final int anInt1130 = 71;
	public static final int anInt1131 = 29;
	public static final int anInt1132 = 142;
	public static int[] anIntArray1133;
	static final int anInt1134 = 2048;

	Class98() throws Throwable {
		throw new Error();
	}

	static Class117_Sub22_Sub19 method1272(int var0, int var1) {
		Class117_Sub22_Sub19 var2 = (Class117_Sub22_Sub19) Class117_Sub22_Sub19.aClass115_2471.method1515((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var5 = Class32.aClass106_Sub1_410.method1380(var0, 0, (byte) 121);
			if (var5 == null) {
				return null;
			} else {
				var2 = new Class117_Sub22_Sub19();
				Class117_Sub14 var4 = new Class117_Sub14(var5);
				var4.anInt1880 = (var4.aByteArray1885.length - 12) * -2079217519;
				int var6 = var4.method2015((byte) 22);
				var2.anInt2472 = var4.method2012(1053511631) * -335964827;
				var2.anInt2474 = var4.method2012(1053511631) * 1278022927;
				var2.anInt2477 = var4.method2012(1053511631) * -351202991;
				var2.anInt2476 = var4.method2012(1053511631) * -1114052747;
				var4.anInt1880 = 0;
				var4.method2098(-734000518);
				var2.anIntArray2469 = new int[var6];
				var2.anIntArray2470 = new int[var6];
				var2.aStringArray2473 = new String[var6];

				int var7;
				for (int var3 = 0; var4.anInt1880 * 561453169 < var4.aByteArray1885.length - 12; var2.anIntArray2469[var3++] = var7) {
					var7 = var4.method2012(1053511631);
					if (var7 == 3) {
						var2.aStringArray2473[var3] = var4.method2018((byte) -22);
					} else if (var7 < 100 && var7 != 21 && var7 != 38 && var7 != 39) {
						var2.anIntArray2470[var3] = var4.method2015((byte) 58);
					} else {
						var2.anIntArray2470[var3] = var4.method2010(-1439707937);
					}
				}

				Class117_Sub22_Sub19.aClass115_2471.method1517(var2, (long) var0);
				return var2;
			}
		}
	}

	public static String method1273(long var0) {
		Class62.aCalendar771.setTime(new Date(var0));
		int var7 = Class62.aCalendar771.get(7);
		int var3 = Class62.aCalendar771.get(5);
		int var8 = Class62.aCalendar771.get(2);
		int var2 = Class62.aCalendar771.get(1);
		int var6 = Class62.aCalendar771.get(11);
		int var4 = Class62.aCalendar771.get(12);
		int var5 = Class62.aCalendar771.get(13);
		return Class62.aStringArray770[var7 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + Class62.aStringArrayArray773[0][var8] + "-" + var2 + " " + var6 / 10 + var6 % 10 + ":" + var4 / 10 + var4 % 10 + ":" + var5 / 10 + var5 % 10 + " GMT";
	}

}
