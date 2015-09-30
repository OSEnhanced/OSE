package core.Jagex;
public class Class117_Sub22_Sub1 extends Class117_Sub22 {

	static int anInt2143;
	public static Class106 aClass106_2144;
	static int anInt2153;
	static final int anInt2154 = 3;
	public String aString2147 = "null";
	public int anInt2149 = 0;
	public static Class115 aClass115_2155 = new Class115(64);
	public char aChar2145;
	public char aChar2150;
	public int anInt2148;
	public int[] anIntArray2152;
	public String[] aStringArray2146;
	public int[] anIntArray2151;

	public void method2344(Class117_Sub14 var1, int var2) {
		while (true) {
			int var3 = var1.method2010(-1439707937);
			if (var3 == 0) {
				return;
			}

			method2346(var1, var3, 1965790881);
		}
	}

	void method2346(Class117_Sub14 var1, int var2, int var3) {
		if (var2 == 1) {
			aChar2145 = (char) var1.method2010(-1439707937);
		} else if (var2 == 2) {
			aChar2150 = (char) var1.method2010(-1439707937);
		} else if (var2 == 3) {
			aString2147 = var1.method2018((byte) -9);
		} else if (var2 == 4) {
			anInt2148 = var1.method2015((byte) 73) * 1668599919;
		} else {
			int var4;
			if (var2 == 5) {
				anInt2149 = var1.method2012(1053511631) * 1361996935;
				anIntArray2152 = new int[anInt2149 * -754542281];
				aStringArray2146 = new String[anInt2149 * -754542281];

				for (var4 = 0; var4 < anInt2149 * -754542281; var4++) {
					anIntArray2152[var4] = var1.method2015((byte) 20);
					aStringArray2146[var4] = var1.method2018((byte) 85);
				}
			} else if (var2 == 6) {
				anInt2149 = var1.method2012(1053511631) * 1361996935;
				anIntArray2152 = new int[anInt2149 * -754542281];
				anIntArray2151 = new int[anInt2149 * -754542281];

				for (var4 = 0; var4 < anInt2149 * -754542281; var4++) {
					anIntArray2152[var4] = var1.method2015((byte) 107);
					anIntArray2151[var4] = var1.method2015((byte) 110);
				}
			}
		}

	}

	static void method2353(int var0, String var1, String var2, int var3) {
		Class13.method239(var0, var1, var2, (String) null, 1459445398);
	}

	public static int method2354(char var0, int var1, byte var2) {
		int var3 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var3 = (var0 << 4) + 1;
		}

		return var3;
	}

}
