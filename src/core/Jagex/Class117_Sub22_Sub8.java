package core.Jagex;
public class Class117_Sub22_Sub8 extends Class117_Sub22 {

	public static Class106 aClass106_2281;
	static final int anInt2282 = 48;
	static final int anInt2284 = 128;
	public static final int anInt2285 = 123;
	public boolean aBool2283 = false;
	public static Class115 aClass115_2286 = new Class115(64);

	void method2483(Class117_Sub14 var1, int var2, byte var3) {
		if (var2 == 2) {
			if (var3 >= 1) {
				return;
			}

			aBool2283 = true;
		}

	}

	static Class117_Sub19 method2489(Class117_Sub19 var0, byte var1) {
		int var2 = Class83.method1138(Class67.method961(var0, -876821474), (byte) 1);
		if (var2 == 0) {
			return null;
		} else {
			for (int var3 = 0; var3 < var2; var3++) {
				var0 = Class74.method1010(var0.anInt2027 * 1264631563, -1314912562);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}

	public static boolean method2491(int var0, int var1) {
		return (var0 >> 31 & 1) != 0;
	}

	public void method2492(Class117_Sub14 var1, int var2) {
		while (true) {
			int var3 = var1.method2010(-1439707937);
			if (var3 == 0) {
				return;
			}

			method2483(var1, var3, (byte) -116);
		}
	}

}
