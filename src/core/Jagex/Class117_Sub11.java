package core.Jagex;
public class Class117_Sub11 extends Class117 {

	protected static int anInt1849;
	static final int anInt1850 = 25;
	public static int anInt1851;
	static final int anInt1852 = 19137016;
	static final int anInt1853 = 1006;
	int anInt1845;
	int anInt1846;
	int[] anIntArray1847;
	int[][] anIntArrayArray1848;

	static byte[] method1973(byte[] var0, int var1) {
		int var2 = var0.length;
		byte[] var3 = new byte[var2];
		System.arraycopy(var0, 0, var3, 0, var2);
		return var3;
	}

	Class117_Sub11(int var1, byte[] var2) {
		anInt1845 = var1 * -1994158693;
		Class117_Sub14 var4 = new Class117_Sub14(var2);
		anInt1846 = var4.method2010(-1439707937) * -1327088755;
		anIntArray1847 = new int[anInt1846 * 918781765];
		anIntArrayArray1848 = new int[anInt1846 * 918781765][];

		int var3;
		for (var3 = 0; var3 < anInt1846 * 918781765; var3++) {
			anIntArray1847[var3] = var4.method2010(-1439707937);
		}

		for (var3 = 0; var3 < anInt1846 * 918781765; var3++) {
			anIntArrayArray1848[var3] = new int[var4.method2010(-1439707937)];
		}

		for (var3 = 0; var3 < anInt1846 * 918781765; var3++) {
			for (int var5 = 0; var5 < anIntArrayArray1848[var3].length; var5++) {
				anIntArrayArray1848[var3][var5] = var4.method2010(-1439707937);
			}
		}

	}

}
