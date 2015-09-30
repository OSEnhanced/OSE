package core.Jagex;
public class Class117_Sub22_Sub3 extends Class117_Sub22 {

	static final int anInt2165 = 45;
	public static final int anInt2168 = 7;
	static final int anInt2171 = 2;
	public static Class106 aClass106_2172;
	public int anInt2167;
	public int anInt2170;
	public int anInt2169;
	public static Class115 aClass115_2166 = new Class115(64);

	static void method2367(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Class51[] var8, int var9) {
		int var11;
		for (int var10 = 0; var10 < 8; var10++) {
			for (var11 = 0; var11 < 8; var11++) {
				if (var2 + var10 > 0 && var2 + var10 < 103 && var11 + var3 > 0 && var3 + var11 < 103) {
					var8[var1].anIntArrayArray704[var2 + var10][var3 + var11] &= -16777217;
				}
			}
		}

		Class117_Sub14 var29 = new Class117_Sub14(var0);

		for (var11 = 0; var11 < 4; var11++) {
			for (int var13 = 0; var13 < 64; var13++) {
				for (int var12 = 0; var12 < 64; var12++) {
					if (var4 == var11 && var13 >= var5 && var13 < 8 + var5 && var12 >= var6 && var12 < var6 + 8) {
						int var19 = var13 & 7;
						int var20 = var12 & 7;
						int var14 = var7 & 3;
						int var21;
						if (var14 == 0) {
							var21 = var19;
						} else if (var14 == 1) {
							var21 = var20;
						} else if (var14 == 2) {
							var21 = 7 - var19;
						} else {
							var21 = 7 - var20;
						}

						int var25 = var21 + var2;
						int var26 = var13 & 7;
						int var27 = var12 & 7;
						int var15 = var7 & 3;
						int var28;
						if (var15 == 0) {
							var28 = var27;
						} else if (var15 == 1) {
							var28 = 7 - var26;
						} else if (var15 == 2) {
							var28 = 7 - var27;
						} else {
							var28 = var26;
						}

						Class117_Sub22_Sub4.method2377(var29, var1, var25, var3 + var28, 0, 0, var7, (byte) 13);
					} else {
						Class117_Sub22_Sub4.method2377(var29, 0, -1, -1, 0, 0, 0, (byte) 13);
					}
				}
			}
		}

	}

	void method2368(Class117_Sub14 var1, int var2, int var3) {
		if (var2 == 1) {
			anInt2167 = var1.method2012(1053511631) * 1195465691;
			anInt2170 = var1.method2010(-1439707937) * -617684821;
			anInt2169 = var1.method2010(-1439707937) * 1238246587;
		}

	}

	public static Class117_Sub22_Sub17_Sub3 method2369(Class106 var0, int var1, int var2, short var3) {
		return !Class14.method295(var0, var1, var2, -100775357) ? null : Class101.method1283(-1581587247);
	}

	public void method2370(Class117_Sub14 var1, int var2) {
		while (true) {
			int var3 = var1.method2010(-1439707937);
			if (var3 == 0) {
				return;
			}

			method2368(var1, var3, -1986285521);
		}
	}

	public static RuntimeException_Sub1 method2372(Throwable var0, String var1) {
		RuntimeException_Sub1 var2;
		if (var0 instanceof RuntimeException_Sub1) {
			var2 = (RuntimeException_Sub1) var0;
			var2.aString2833 = var2.aString2833 + ' ' + var1;
		} else {
			var2 = new RuntimeException_Sub1(var0, var1);
		}

		return var2;
	}

}
