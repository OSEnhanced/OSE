package core.Jagex;
public class Class117_Sub2_Sub3 extends Class117_Sub2 {

	public static final int anInt2506 = 256;
	public static final int anInt2507 = 89;
	public static final int anInt2508 = 1024;
	public static final int anInt2509 = 102;
	public static final int anInt2511 = 222;
	Class120 aClass120_2505 = new Class120();
	Class117_Sub2_Sub1 aClass117_Sub2_Sub1_2510 = new Class117_Sub2_Sub1();
	Class117_Sub2_Sub4 aClass117_Sub2_Sub4_2504;

	protected Class117_Sub2 method1859() {
		Class117_Sub21 var1 = (Class117_Sub21) aClass120_2505.method1577();
		return (Class117_Sub2) (var1 == null ? null : (var1.aClass117_Sub2_Sub2_2113 != null ? var1.aClass117_Sub2_Sub2_2113 : method1848()));
	}

	protected Class117_Sub2 method1848() {
		Class117_Sub21 var1;
		do {
			var1 = (Class117_Sub21) aClass120_2505.method1582();
			if (var1 == null) {
				return null;
			}
		} while (var1.aClass117_Sub2_Sub2_2113 == null);

		return var1.aClass117_Sub2_Sub2_2113;
	}

	protected int method1869() {
		return 0;
	}

	protected void method1851(int[] var1, int var2, int var3) {
		aClass117_Sub2_Sub1_2510.method1851(var1, var2, var3);

		for (Class117_Sub21 var5 = (Class117_Sub21) aClass120_2505.method1577(); var5 != null; var5 = (Class117_Sub21) aClass120_2505.method1582()) {
			if (!aClass117_Sub2_Sub4_2504.method3004(var5, -231412136)) {
				int var6 = var2;
				int var4 = var3;

				do {
					if (var4 <= var5.anInt2126 * -1167763321) {
						method2966(var5, var1, var6, var4, var6 + var4, 1791707952);
						var5.anInt2126 -= var4 * 114552119;
						break;
					}

					method2966(var5, var1, var6, var5.anInt2126 * -1167763321, var4 + var6, 1791707952);
					var6 += var5.anInt2126 * -1167763321;
					var4 -= var5.anInt2126 * -1167763321;
				} while (!aClass117_Sub2_Sub4_2504.method3005(var5, var1, var6, var4, (byte) 103));
			}
		}

	}

	void method2966(Class117_Sub21 var1, int[] var2, int var3, int var4, int var5, int var6) {
		if ((aClass117_Sub2_Sub4_2504.anIntArray2518[var1.anInt2130 * -418354143] & 4) != 0 && var1.anInt2118 * -1281961041 < 0) {
			int var7 = aClass117_Sub2_Sub4_2504.anIntArray2530[var1.anInt2130 * -418354143] / (Class14.anInt170 * -1211689641);

			while (true) {
				int var8 = (1048575 + var7 - var1.anInt2127 * -765826233) / var7;
				if (var8 > var4) {
					var1.anInt2127 += var4 * var7 * 1974718071;
					break;
				}

				var1.aClass117_Sub2_Sub2_2113.method1851(var2, var3, var8);
				var3 += var8;
				var4 -= var8;
				var1.anInt2127 += (var8 * var7 - 1048576) * 1974718071;
				int var9 = Class14.anInt170 * -1211689641 / 100;
				int var10 = 262144 / var7;
				if (var10 < var9) {
					var9 = var10;
				}

				Class117_Sub2_Sub2 var11 = var1.aClass117_Sub2_Sub2_2113;
				if (aClass117_Sub2_Sub4_2504.anIntArray2528[var1.anInt2130 * -418354143] == 0) {
					var1.aClass117_Sub2_Sub2_2113 = Class117_Sub2_Sub2.method2731(var1.aClass117_Sub4_Sub1_2109, var11.method2720(), var11.method2713(), var11.method2825());
				} else {
					var1.aClass117_Sub2_Sub2_2113 = Class117_Sub2_Sub2.method2731(var1.aClass117_Sub4_Sub1_2109, var11.method2720(), 0, var11.method2825());
					aClass117_Sub2_Sub4_2504.method3054(var1, var1.aClass117_Sub16_2108.aShortArray1916[var1.anInt2112 * 1972048083] < 0, 1837062353);
					var1.aClass117_Sub2_Sub2_2113.method2716(var9, var11.method2713());
				}

				if (var1.aClass117_Sub16_2108.aShortArray1916[var1.anInt2112 * 1972048083] < 0) {
					var1.aClass117_Sub2_Sub2_2113.method2709(-1);
				}

				var11.method2782(var9);
				var11.method1851(var2, var3, var5 - var3);
				if (var11.method2721()) {
					aClass117_Sub2_Sub1_2510.method2678(var11);
				}
			}
		}

		var1.aClass117_Sub2_Sub2_2113.method1851(var2, var3, var4);
	}

	void method2967(Class117_Sub21 var1, int var2, byte var3) {
		if ((aClass117_Sub2_Sub4_2504.anIntArray2518[var1.anInt2130 * -418354143] & 4) != 0 && var1.anInt2118 * -1281961041 < 0) {
			int var4 = aClass117_Sub2_Sub4_2504.anIntArray2530[var1.anInt2130 * -418354143] / (Class14.anInt170 * -1211689641);
			int var5 = (var4 + 1048575 - var1.anInt2127 * -765826233) / var4;
			var1.anInt2127 = (var1.anInt2127 * -765826233 + var4 * var2 & 1048575) * 1974718071;
			if (var5 <= var2) {
				if (aClass117_Sub2_Sub4_2504.anIntArray2528[var1.anInt2130 * -418354143] != 0) {
					var1.aClass117_Sub2_Sub2_2113 = Class117_Sub2_Sub2.method2731(var1.aClass117_Sub4_Sub1_2109, var1.aClass117_Sub2_Sub2_2113.method2720(), 0, var1.aClass117_Sub2_Sub2_2113.method2825());
					aClass117_Sub2_Sub4_2504.method3054(var1, var1.aClass117_Sub16_2108.aShortArray1916[var1.anInt2112 * 1972048083] < 0, 1837062353);
				} else {
					var1.aClass117_Sub2_Sub2_2113 = Class117_Sub2_Sub2.method2731(var1.aClass117_Sub4_Sub1_2109, var1.aClass117_Sub2_Sub2_2113.method2720(), var1.aClass117_Sub2_Sub2_2113.method2713(), var1.aClass117_Sub2_Sub2_2113.method2825());
				}

				if (var1.aClass117_Sub16_2108.aShortArray1916[var1.anInt2112 * 1972048083] < 0) {
					var1.aClass117_Sub2_Sub2_2113.method2709(-1);
				}

				var2 = var1.anInt2127 * -765826233 / var4;
			}
		}

		var1.aClass117_Sub2_Sub2_2113.method1852(var2);
	}

	protected void method1852(int var1) {
		aClass117_Sub2_Sub1_2510.method1852(var1);

		for (Class117_Sub21 var2 = (Class117_Sub21) aClass120_2505.method1577(); var2 != null; var2 = (Class117_Sub21) aClass120_2505.method1582()) {
			if (!aClass117_Sub2_Sub4_2504.method3004(var2, -1940034987)) {
				int var3 = var1;

				do {
					if (var3 <= var2.anInt2126 * -1167763321) {
						method2967(var2, var3, (byte) 28);
						var2.anInt2126 -= var3 * 114552119;
						break;
					}

					method2967(var2, var2.anInt2126 * -1167763321, (byte) 93);
					var3 -= var2.anInt2126 * -1167763321;
				} while (!aClass117_Sub2_Sub4_2504.method3005(var2, (int[]) null, 0, var3, (byte) 72));
			}
		}

	}

	Class117_Sub2_Sub3(Class117_Sub2_Sub4 var1) {
		aClass117_Sub2_Sub4_2504 = var1;
	}

}
