package core.Jagex;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Class33 {

	static final int anInt417 = 10;
	public static final int anInt419 = 98;
	static final int anInt422 = 32;
	public static final int anInt423 = 19136800;
	int anInt416 = -512484861;
	LinkedHashMap aLinkedHashMap421 = new LinkedHashMap();
	boolean aBool418;
	boolean aBool420;
	static int anInt424 = -336652124;

	static void method474(Class117_Sub19 var0, byte var1) {
		Class117_Sub19 var4 = var0.anInt2027 * 1264631563 == -1 ? null : Class74.method1010(var0.anInt2027 * 1264631563, -1719500341);
		int var2;
		int var3;
		if (var4 == null) {
			var2 = Class80.anInt952 * 1566500665;
			var3 = Class117_Sub22_Sub18_Sub2.anInt2613 * 1325743505;
		} else {
			var2 = var4.anInt1988 * 1854643179;
			var3 = var4.anInt1989 * 2747837;
		}

		Class63.method929(var0, var2, var3, false, -1313381559);
		Class45.method739(var0, var2, var3, (byte) 14);
	}

	Class33(Class117_Sub14 var1) {
		if (var1 != null && var1.aByteArray1885 != null) {
			int var3 = var1.method2010(-1439707937);
			if (var3 >= 0 && var3 <= anInt424 * 1716860441) {
				if (var1.method2010(-1439707937) == 1) {
					aBool418 = true;
				}

				if (var3 > 1) {
					aBool420 = var1.method2010(-1439707937) == 1;
				}

				if (var3 > 3) {
					anInt416 = var1.method2010(-1439707937) * -512484861;
				}

				if (var3 > 2) {
					int var6 = var1.method2010(-1439707937);

					for (int var2 = 0; var2 < var6; var2++) {
						int var4 = var1.method2015((byte) 57);
						int var5 = var1.method2015((byte) 85);
						aLinkedHashMap421.put(Integer.valueOf(var4), Integer.valueOf(var5));
					}
				}
			} else {
				method483(true, 1457201498);
			}
		} else {
			method483(true, -803069364);
		}

	}

	Class117_Sub14 method476(int var1) {
		Class117_Sub14 var2 = new Class117_Sub14(100);
		var2.method2126(anInt424 * 1716860441, 1396762430);
		var2.method2126(aBool418 ? 1 : 0, 172421927);
		var2.method2126(aBool420 ? 1 : 0, 1190123864);
		var2.method2126(anInt416 * 1703993515, 533499168);
		var2.method2126(aLinkedHashMap421.size(), 1912226031);
		Iterator var3 = aLinkedHashMap421.entrySet().iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry) var3.next();
			var2.method2183(((Integer) var4.getKey()).intValue(), (byte) 76);
			var2.method2183(((Integer) var4.getValue()).intValue(), (byte) 11);
		}

		return var2;
	}

	Class33() {
		method483(true, -107115298);
	}

	void method483(boolean var1, int var2) {
	}

	public static Class83 method484(byte var0) {
		try {
			return new Class83_Sub1();
		} catch (Throwable var2) {
			return null;
		}
	}

	public static int method485(CharSequence var0, int var1) {
		return Class5.method87(var0, 10, true, 721383461);
	}

	static void method486(int var0, int var1, int var2, int var3, int var4) {
		for (int var5 = 0; var5 < GameClient.anInt3122 * -115854549; var5++) {
			if (GameClient.anIntArray3129[var5] + GameClient.anIntArray3022[var5] > var0 && GameClient.anIntArray3022[var5] < var2 + var0 && GameClient.anIntArray3130[var5] + GameClient.anIntArray3128[var5] > var1 && GameClient.anIntArray3128[var5] < var3 + var1) {
				GameClient.aBoolArray3124[var5] = true;
			}
		}

	}

}
