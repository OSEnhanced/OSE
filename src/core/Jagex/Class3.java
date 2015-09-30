package core.Jagex;
public class Class3 {

	int anInt25;
	int anInt26;
	static final int anInt27 = 10;
	int anInt28;
	String aString29;
	static int[] anIntArray30;
	int anInt31;
	public static final int anInt32 = 90;
	public static final int anInt33 = 226;
	public static final int anInt34 = 137;

	static Class117_Sub22_Sub17_Sub2[] method65(int var0) {
		Class117_Sub22_Sub17_Sub2[] var1 = new Class117_Sub22_Sub17_Sub2[Class13.anInt152 * -764616363];

		for (int var3 = 0; var3 < Class13.anInt152 * -764616363; var3++) {
			Class117_Sub22_Sub17_Sub2 var2 = var1[var3] = new Class117_Sub22_Sub17_Sub2();
			var2.anInt2702 = Class13.anInt145 * -1559182453;
			var2.anInt2709 = Class13.anInt146 * -1301976433;
			var2.anInt2706 = Class98.anIntArray1133[var3];
			var2.anInt2708 = Class13.anIntArray147[var3];
			var2.anInt2707 = Class13.anIntArray148[var3];
			var2.anInt2705 = Class26.anIntArray324[var3];
			var2.anIntArray2704 = Class13.anIntArray149;
			var2.aByteArray2703 = Class13.aByteArrayArray150[var3];
		}

		Class117_Sub22_Sub18_Sub3.method3083(-578517745);
		return var1;
	}

	public static char method66(char var0, byte var1) {
		return (char) (var0 == 198 ? 'E' : (var0 == 230 ? 'e' : (var0 == 223 ? 's' : (var0 == 338 ? 'E' : (var0 == 339 ? 'e' : '\u0000')))));
	}

	public static Object method67(byte[] var0, boolean var1, int var2) {
		if (var0 == null) {
			return null;
		} else {
			if (var0.length > 136 && !Class57.aBool747) {
				try {
					Class57_Sub1 var3 = new Class57_Sub1();
					var3.method872(var0, (byte) 8);
					return var3;
				} catch (Throwable var4) {
					Class57.aBool747 = true;
				}
			}

			return var1 ? Class117_Sub11.method1973(var0, 549334431) : var0;
		}
	}

}
