package core.Jagex;
public class Class117_Sub22_Sub7 extends Class117_Sub22 {

	static final int anInt2278 = 32;
	static final int anInt2280 = 100;
	int anInt2279 = Class20.method353(-1838408791) * 689818523;
	int anInt2274;
	int anInt2273;
	String aString2276;
	String aString2277;
	String aString2275;

	Class117_Sub22_Sub7(int var1, String var2, String var3, String var4) {
		anInt2274 = GameClient.anInt2923 * -1741267757;
		anInt2273 = var1 * -1015667009;
		aString2276 = var2;
		aString2277 = var3;
		aString2275 = var4;
	}

	void method2469(int var1, String var2, String var3, String var4, int var5) {
		anInt2279 = Class20.method353(-1838408791) * 689818523;
		anInt2274 = GameClient.anInt2923 * -1741267757;
		anInt2273 = var1 * -1015667009;
		aString2276 = var2;
		aString2277 = var3;
		aString2275 = var4;
	}

	public static boolean method2471(char var0, int var1) {
		return var0 >= 48 && var0 <= 57 || var0 >= 65 && var0 <= 90 || var0 >= 97 && var0 <= 122;
	}

	public static void method2472(Class106 var0, byte var1) {
		Class117_Sub22_Sub4.aClass106_2174 = var0;
	}

	static int method2477(int var0, int var1, int var2, byte var3) {
		int var4 = var0 / var2;
		int var8 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var7 = var1 & var2 - 1;
		int var6 = Class117_Sub9.method1968(var4, var5, -1553492226);
		int var9 = Class117_Sub9.method1968(var4 + 1, var5, -708106757);
		int var10 = Class117_Sub9.method1968(var4, var5 + 1, 121782096);
		int var11 = Class117_Sub9.method1968(var4 + 1, var5 + 1, -1145845094);
		int var12 = Class8.method135(var6, var9, var8, var2, (byte) -20);
		int var13 = Class8.method135(var10, var11, var8, var2, (byte) -83);
		int var14 = 65536 - Class117_Sub22_Sub17_Sub1.anIntArray2654[var7 * 1024 / var2] >> 1;
		int var15 = (var13 * var14 >> 16) + (var12 * (65536 - var14) >> 16);
		return var15;
	}

	public static void method2478(String[] var0, short[] var1, byte var2) {
		Class95.method1244(var0, var1, 0, var0.length - 1, -2049610422);
	}

	static void method2480(int var0) {
		GameClient.aClass117_Sub14_Sub1_2961.method2932(233, 1314205023);

		for (Class117_Sub10 var1 = (Class117_Sub10) GameClient.aClass127_3080.method1668(); var1 != null; var1 = (Class117_Sub10) GameClient.aClass127_3080.method1669()) {
			if (var1.anInt1828 * -611712165 == 0 || var1.anInt1828 * -611712165 == 3) {
				Class41.method536(var1, true, -2142497714);
			}
		}

		if (GameClient.aClass117_Sub19_3083 != null) {
			Class54.method850(GameClient.aClass117_Sub19_3083, (byte) 0);
			GameClient.aClass117_Sub19_3083 = null;
		}

	}

}
