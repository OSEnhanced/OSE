package core.Jagex;
import java.io.IOException;

public class Class117_Sub22_Sub11 extends Class117_Sub22 {

	int anInt2312;
	public static Class106 aClass106_2314;
	public static Class106 aClass106_2323;
	static final int anInt2327 = 55;
	static final int anInt2328 = 88;
	static final int anInt2329 = 1048576;
	static int anInt2330;
	public static final int anInt2331 = 210;
	static Class115 aClass115_2318 = new Class115(64);
	static Class115 aClass115_2311 = new Class115(30);
	int anInt2316;
	public int anInt2317 = -961732791;
	int anInt2322 = -614722688;
	int anInt2313 = 277470848;
	int anInt2324 = 0;
	int anInt2325 = 0;
	int anInt2326 = 0;
	short[] aShortArray2315;
	short[] aShortArray2319;
	short[] aShortArray2320;
	short[] aShortArray2321;

	void method2551(Class117_Sub14 var1, int var2) {
		while (true) {
			int var3 = var1.method2010(-1439707937);
			if (var3 == 0) {
				return;
			}

			method2556(var1, var3, 1735820059);
		}
	}

	static void method2553(int var0) {
		Object var1 = Class107.anObject1196;
		synchronized (var1) {
			if (Class107.anInt1193 * 1236626877 == 0) {
				Class84.aClass77_989.method1065(new Class107(), 5, -1259764746);
			}

			Class107.anInt1193 = -104491720;
		}
	}

	void method2556(Class117_Sub14 var1, int var2, int var3) {
		if (var2 == 1) {
			anInt2316 = var1.method2012(1053511631) * 41640563;
		} else if (var2 == 2) {
			anInt2317 = var1.method2012(1053511631) * 961732791;
		} else if (var2 == 4) {
			anInt2322 = var1.method2012(1053511631) * 464959527;
		} else if (var2 == 5) {
			anInt2313 = var1.method2012(1053511631) * -970910787;
		} else if (var2 == 6) {
			anInt2324 = var1.method2012(1053511631) * 790846575;
		} else if (var2 == 7) {
			anInt2325 = var1.method2010(-1439707937) * -1669924113;
		} else if (var2 == 8) {
			anInt2326 = var1.method2010(-1439707937) * 509216729;
		} else {
			int var4;
			int var5;
			if (var2 == 40) {
				var4 = var1.method2010(-1439707937);
				aShortArray2315 = new short[var4];
				aShortArray2319 = new short[var4];

				for (var5 = 0; var5 < var4; var5++) {
					aShortArray2315[var5] = (short) var1.method2012(1053511631);
					aShortArray2319[var5] = (short) var1.method2012(1053511631);
				}
			} else if (var2 == 41) {
				var4 = var1.method2010(-1439707937);
				aShortArray2320 = new short[var4];
				aShortArray2321 = new short[var4];

				for (var5 = 0; var5 < var4; var5++) {
					aShortArray2320[var5] = (short) var1.method2012(1053511631);
					aShortArray2321[var5] = (short) var1.method2012(1053511631);
				}
			}
		}

	}

	public final Class117_Sub22_Sub18_Sub7 method2562(int var1, int var2) {
		Class117_Sub22_Sub18_Sub7 var3 = (Class117_Sub22_Sub18_Sub7) aClass115_2311.method1515((long) (anInt2312 * 1844126495));
		if (var3 == null) {
			Class117_Sub22_Sub18_Sub4 var4 = Class117_Sub22_Sub18_Sub4.method3155(aClass106_2323, anInt2316 * -1115614533, 0);
			if (var4 == null) {
				return null;
			}

			int var5;
			if (aShortArray2315 != null) {
				for (var5 = 0; var5 < aShortArray2315.length; var5++) {
					var4.method3168(aShortArray2315[var5], aShortArray2319[var5]);
				}
			}

			if (aShortArray2320 != null) {
				for (var5 = 0; var5 < aShortArray2320.length; var5++) {
					var4.method3220(aShortArray2320[var5], aShortArray2321[var5]);
				}
			}

			var3 = var4.method3183(anInt2325 * 1709011983 + 64, anInt2326 * 317982825 + 850, -30, -50, -30);
			aClass115_2311.method1517(var3, (long) (anInt2312 * 1844126495));
		}

		Class117_Sub22_Sub18_Sub7 var6;
		if (anInt2317 * -1181614841 != -1 && var1 != -1) {
			var6 = Class114_Sub1.method1838(anInt2317 * -1181614841, (byte) -47).method2638(var3, var1, -538796979);
		} else {
			var6 = var3.method3365(true);
		}

		if (anInt2322 * 1169110935 != 128 || anInt2313 * -223068267 != 128) {
			var6.method3382(anInt2322 * 1169110935, anInt2313 * -223068267, anInt2322 * 1169110935);
		}

		if (anInt2324 * -199130481 != 0) {
			if (anInt2324 * -199130481 == 90) {
				var6.method3372();
			}

			if (anInt2324 * -199130481 == 180) {
				var6.method3372();
				var6.method3372();
			}

			if (anInt2324 * -199130481 == 270) {
				var6.method3372();
				var6.method3372();
				var6.method3372();
			}
		}

		return var6;
	}

	public static void method2565(Class117_Sub14 var0, int var1) {
		byte[] var2 = new byte[24];

		try {
			Class74.aClass145_886.method1827(0L);
			Class74.aClass145_886.method1805(var2, (byte) -49);

			int var3;
			for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
				;
			}

			if (var3 >= 24) {
				throw new IOException();
			}
		} catch (Exception var5) {
			for (int var4 = 0; var4 < 24; var4++) {
				var2[var4] = -1;
			}
		}

		var0.method2004(var2, 0, 24, 1456104390);
	}

	public static int method2566(int var0, int var1) {
		return var0 > 0 ? 1 : (var0 >= 0 ? 0 : -1);
	}

}
