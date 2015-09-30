package core.Jagex;
public class Class117_Sub8 extends Class117 {

	static final int anInt1794 = 1;
	static final int anInt1799 = 0;
	static final int anInt1801 = 2;
	static final int anInt1806 = 3;
	static int[] anIntArray1807;
	int[] anIntArray1805;
	boolean aBool1803 = false;
	int anInt1797;
	boolean aBool1798;
	int[] anIntArray1795;
	int[] anIntArray1800;
	int[] anIntArray1796;
	int[] anIntArray1802;
	int anInt1793;
	int anInt1804;

	void method1955(int var1) {
		if (anIntArray1805 != null) {
			int var2;
			short var3;
			int var4;
			int var5;
			int var6;
			int var7;
			int[] var10;
			if (anInt1793 == 1 || anInt1793 == 3) {
				if (anIntArray1807 == null || anIntArray1807.length < anIntArray1805.length) {
					anIntArray1807 = new int[anIntArray1805.length];
				}

				if (anIntArray1805.length == 4096) {
					var3 = 64;
				} else {
					var3 = 128;
				}

				var4 = anIntArray1805.length;
				var5 = var3 * var1 * anInt1804;
				var6 = var4 - 1;
				if (anInt1793 == 1) {
					var5 = -var5;
				}

				for (var2 = 0; var2 < var4; var2++) {
					var7 = var2 + var5 & var6;
					anIntArray1807[var2] = anIntArray1805[var7];
				}

				var10 = anIntArray1805;
				anIntArray1805 = anIntArray1807;
				anIntArray1807 = var10;
			}

			if (anInt1793 == 2 || anInt1793 == 4) {
				if (anIntArray1807 == null || anIntArray1807.length < anIntArray1805.length) {
					anIntArray1807 = new int[anIntArray1805.length];
				}

				if (anIntArray1805.length == 4096) {
					var3 = 64;
				} else {
					var3 = 128;
				}

				var4 = anIntArray1805.length;
				var5 = var1 * anInt1804;
				var6 = var3 - 1;
				if (anInt1793 == 2) {
					var5 = -var5;
				}

				for (var2 = 0; var2 < var4; var2 += var3) {
					for (var7 = 0; var7 < var3; var7++) {
						int var9 = var2 + var7;
						int var8 = var2 + (var7 + var5 & var6);
						anIntArray1807[var9] = anIntArray1805[var8];
					}
				}

				var10 = anIntArray1805;
				anIntArray1805 = anIntArray1807;
				anIntArray1807 = var10;
			}

		}
	}

	void method1957() {
		anIntArray1805 = null;
	}

	Class117_Sub8(Class117_Sub14 var1) {
		anInt1797 = var1.method2012(1053511631);
		aBool1798 = var1.method2010(-1439707937) == 1;
		int var3 = var1.method2010(-1439707937);
		if (var3 >= 1 && var3 <= 4) {
			anIntArray1795 = new int[var3];

			int var2;
			for (var2 = 0; var2 < var3; var2++) {
				anIntArray1795[var2] = var1.method2012(1053511631);
			}

			if (var3 > 1) {
				anIntArray1800 = new int[var3 - 1];

				for (var2 = 0; var2 < var3 - 1; var2++) {
					anIntArray1800[var2] = var1.method2010(-1439707937);
				}
			}

			if (var3 > 1) {
				anIntArray1796 = new int[var3 - 1];

				for (var2 = 0; var2 < var3 - 1; var2++) {
					anIntArray1796[var2] = var1.method2010(-1439707937);
				}
			}

			anIntArray1802 = new int[var3];

			for (var2 = 0; var2 < var3; var2++) {
				anIntArray1802[var2] = var1.method2015((byte) 18);
			}

			anInt1793 = var1.method2010(-1439707937);
			anInt1804 = var1.method2010(-1439707937);
			anIntArray1805 = null;
		} else {
			throw new RuntimeException();
		}
	}

	boolean method1962(double var1, int var3, Class106 var4) {
		int var5;
		for (var5 = 0; var5 < anIntArray1795.length; var5++) {
			if (var4.method1386(anIntArray1795[var5], -988975735) == null) {
				return false;
			}
		}

		var5 = var3 * var3;
		anIntArray1805 = new int[var5];

		for (int var12 = 0; var12 < anIntArray1795.length; var12++) {
			int var13 = anIntArray1795[var12];
			byte[] var14 = var4.method1384(var13, 635294511);
			boolean var11;
			if (var14 == null) {
				var11 = false;
			} else {
				Class1.method53(var14, 84460621);
				var11 = true;
			}

			Class117_Sub22_Sub17_Sub2 var15;
			if (!var11) {
				var15 = null;
			} else {
				Class117_Sub22_Sub17_Sub2 var6 = new Class117_Sub22_Sub17_Sub2();
				var6.anInt2702 = Class13.anInt145 * -1559182453;
				var6.anInt2709 = Class13.anInt146 * -1301976433;
				var6.anInt2706 = Class98.anIntArray1133[0];
				var6.anInt2708 = Class13.anIntArray147[0];
				var6.anInt2707 = Class13.anIntArray148[0];
				var6.anInt2705 = Class26.anIntArray324[0];
				var6.anIntArray2704 = Class13.anIntArray149;
				var6.aByteArray2703 = Class13.aByteArrayArray150[0];
				Class117_Sub22_Sub18_Sub3.method3083(-578517745);
				var15 = var6;
			}

			var15.method3231();
			var14 = var15.aByteArray2703;
			int[] var17 = var15.anIntArray2704;
			int var16 = anIntArray1802[var12];
			if ((var16 & -16777216) == 16777216) {
				;
			}

			if ((var16 & -16777216) == 33554432) {
				;
			}

			int var7;
			int var8;
			int var9;
			int var10;
			if ((var16 & -16777216) == 50331648) {
				var8 = var16 & 16711935;
				var10 = var16 >> 8 & 255;

				for (var7 = 0; var7 < var17.length; var7++) {
					var9 = var17[var7];
					if ((var9 & 65535) == var9 >> 8) {
						var9 &= 255;
						var17[var7] = var8 * var9 >> 8 & 16711935 | var10 * var9 & 65280;
					}
				}
			}

			for (var8 = 0; var8 < var17.length; var8++) {
				var17[var8] = Class117_Sub22_Sub17_Sub1.method3100(var17[var8], var1);
			}

			if (var12 == 0) {
				var8 = 0;
			} else {
				var8 = anIntArray1800[var12 - 1];
			}

			if (var12 == 0) {
				;
			}

			if (var8 == 0) {
				if (var15.anInt2707 == var3) {
					for (var10 = 0; var10 < var5; var10++) {
						anIntArray1805[var10] = var17[var14[var10] & 255];
					}
				} else if (var15.anInt2707 == 64 && var3 == 128) {
					var10 = 0;

					for (var7 = 0; var7 < var3; var7++) {
						for (var9 = 0; var9 < var3; var9++) {
							anIntArray1805[var10++] = var17[var14[(var9 >> 1) + (var7 >> 1 << 6)] & 255];
						}
					}
				} else {
					if (var15.anInt2707 != 128 || var3 != 64) {
						throw new RuntimeException();
					}

					var10 = 0;

					for (var7 = 0; var7 < var3; var7++) {
						for (var9 = 0; var9 < var3; var9++) {
							anIntArray1805[var10++] = var17[var14[(var9 << 1) + (var7 << 1 << 7)] & 255];
						}
					}
				}
			}

			if (var8 == 1) {
				;
			}

			if (var8 == 2) {
				;
			}

			if (var8 == 3) {
				;
			}
		}

		return true;
	}

}
