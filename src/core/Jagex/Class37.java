package core.Jagex;
public class Class37 implements Interface2 {

	public static final int anInt456 = 163;
	public static final int anInt460 = 30;
	static final int anInt461 = 41;
	static final int anInt463 = 2;
	Class120 aClass120_457 = new Class120();
	int anInt459 = 0;
	double aDouble464 = 1.0D;
	int anInt465 = 1251995008;
	Class106 aClass106_462;
	int anInt458;
	Class117_Sub8[] aClass117_Sub8Array466;

	public void method508(short var1) {
		for (int var2 = 0; var2 < aClass117_Sub8Array466.length; var2++) {
			if (aClass117_Sub8Array466[var2] != null) {
				aClass117_Sub8Array466[var2].method1957();
			}
		}

		aClass120_457 = new Class120();
		anInt459 = anInt458 * -273744619;
	}

	public void method509(double var1) {
		aDouble464 = var1;
		method508((short) 1600);
	}

	public int[] method31(int var1, byte var2) {
		Class117_Sub8 var3 = aClass117_Sub8Array466[var1];
		if (var3 != null) {
			if (var3.anIntArray1805 != null) {
				aClass120_457.method1587(var3);
				var3.aBool1803 = true;
				return var3.anIntArray1805;
			}

			boolean var4 = var3.method1962(aDouble464, anInt465 * -1134779309, aClass106_462);
			if (var4) {
				if (anInt459 * 2077230741 == 0) {
					Class117_Sub8 var5 = (Class117_Sub8) aClass120_457.method1585();
					var5.method1957();
				} else {
					anInt459 -= 2129237181;
				}

				aClass120_457.method1587(var3);
				var3.aBool1803 = true;
				return var3.anIntArray1805;
			}
		}

		return null;
	}

	public int method24(int var1, byte var2) {
		return aClass117_Sub8Array466[var1] != null ? aClass117_Sub8Array466[var1].anInt1797 : 0;
	}

	public boolean method25(int var1, int var2) {
		return aClass117_Sub8Array466[var1].aBool1798;
	}

	public Class37(Class106 var1, Class106 var2, int var3, double var4, int var6) {
		aClass106_462 = var2;
		anInt458 = var3 * 1893315337;
		anInt459 = anInt458 * -273744619;
		aDouble464 = var4;
		anInt465 = var6 * 1687502811;
		int[] var9 = var1.method1439(0, (byte) 12);
		int var8 = var9.length;
		aClass117_Sub8Array466 = new Class117_Sub8[var1.method1399(0, 2138061361)];

		for (int var7 = 0; var7 < var8; var7++) {
			Class117_Sub14 var10 = new Class117_Sub14(var1.method1380(0, var9[var7], (byte) 84));
			aClass117_Sub8Array466[var9[var7]] = new Class117_Sub8(var10);
		}

	}

	public void method510(int var1, int var2) {
		for (int var3 = 0; var3 < aClass117_Sub8Array466.length; var3++) {
			Class117_Sub8 var4 = aClass117_Sub8Array466[var3];
			if (var4 != null && var4.anInt1793 != 0 && var4.aBool1803) {
				var4.method1955(var1);
				var4.aBool1803 = false;
			}
		}

	}

	public boolean method26(int var1, int var2) {
		return anInt465 * -1134779309 == 64;
	}

	public static int method517(String var0, int var1) {
		return var0.length() + 1;
	}

}
