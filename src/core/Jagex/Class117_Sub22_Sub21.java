package core.Jagex;
public class Class117_Sub22_Sub21 extends Class117_Sub22 {

	static Class33 aClass33_2499;
	public int anInt2502;
	public int anInt2500;
	public int[] anIntArray2501;
	public int[] anIntArray2503;

	static void method2960(Class117_Sub19[] var0, int var1, byte var2) {
		for (int var3 = 0; var3 < var0.length; var3++) {
			Class117_Sub19 var4 = var0[var3];
			if (var4 != null) {
				if (var4.anInt1975 * 657737235 == 0) {
					if (var4.aClass117_Sub19Array2095 != null) {
						method2960(var4.aClass117_Sub19Array2095, var1, (byte) -15);
					}

					Class117_Sub10 var5 = (Class117_Sub10) GameClient.aClass127_3080.method1675((long) (var4.anInt1973 * -1955776525));
					if (var5 != null) {
						Class117_Sub22_Sub18_Sub1_Sub2.method3543(var5.anInt1831 * -2090327687, var1, -1854452833);
					}
				}

				Class117_Sub7 var6;
				if (var1 == 0 && var4.anObjectArray2078 != null) {
					var6 = new Class117_Sub7();
					var6.aClass117_Sub19_1780 = var4;
					var6.anObjectArray1786 = var4.anObjectArray2078;
					Class57.method867(var6, 200000, -888392831);
				}

				if (var1 == 1 && var4.anObjectArray2079 != null) {
					if (var4.anInt1976 * 1710354431 >= 0) {
						Class117_Sub19 var7 = Class74.method1010(var4.anInt1973 * -1955776525, -1234816219);
						if (var7 == null || var7.aClass117_Sub19Array2095 == null || var4.anInt1976 * 1710354431 >= var7.aClass117_Sub19Array2095.length || var7.aClass117_Sub19Array2095[var4.anInt1976 * 1710354431] != var4) {
							continue;
						}
					}

					var6 = new Class117_Sub7();
					var6.aClass117_Sub19_1780 = var4;
					var6.anObjectArray1786 = var4.anObjectArray2079;
					Class57.method867(var6, 200000, -2024063152);
				}
			}
		}

	}

	Class117_Sub22_Sub21(int var1, int var2, int[] var3, int[] var4, int var5) {
		anInt2502 = var1 * 1943491833;
		anInt2500 = var2 * -321634393;
		anIntArray2501 = var3;
		anIntArray2503 = var4;
	}

	public boolean method2963(int var1, int var2, int var3) {
		if (var2 >= 0 && var2 < anIntArray2503.length) {
			int var4 = anIntArray2503[var2];
			if (var1 >= var4 && var1 <= anIntArray2501[var2] + var4) {
				return true;
			}
		}

		return false;
	}

}
