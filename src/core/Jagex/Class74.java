package core.Jagex;
import java.io.File;

public class Class74 {

	public static final int anInt879 = 0;
	public static final int anInt880 = 1048576;
	public static final String aString881 = "rw";
	public static File aFile882;
	public static File aFile883;
	public static int anInt884;
	public static final int anInt885 = 124;
	public static String[] aStringArray888;
	public static final int anInt889 = 1048576000;
	public static final int anInt890 = 227;
	static final int anInt891 = 2;
	public static final int anInt892 = 54;
	public static final int anInt893 = 80;
	public static final String aString895 = "main_file_cache.dat2";
	public static final int anInt896 = 139;
	public static Class145 aClass145_886 = null;
	public static Class145 aClass145_887 = null;
	public static Class145 aClass145_894 = null;

	Class74() throws Throwable {
		throw new Error();
	}

	static boolean method1005(Class117_Sub14_Sub1 var0, int var1, int var2) {
		int var3 = var0.method2931(2, -1320315244);
		int var4;
		int var5;
		int var7;
		int var8;
		int var9;
		int var11;
		if (var3 == 0) {
			if (var0.method2931(1, -1320315244) != 0) {
				method1005(var0, var1, -1264853330);
			}

			var4 = var0.method2931(6, -1320315244);
			var5 = var0.method2931(6, -1320315244);
			boolean var13 = var0.method2931(1, -1320315244) == 1;
			if (var13) {
				Class4.anIntArray47[(Class4.anInt36 += 1741958109) * -1049459595 - 1] = var1;
			}

			if (GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var1] != null) {
				throw new RuntimeException();
			} else {
				Player var12 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var1] = new Player();
				var12.anInt2894 = var1 * -743481251;
				if (Class4.aClass117_Sub14Array39[var1] != null) {
					var12.method3541(Class4.aClass117_Sub14Array39[var1], 414144600);
				}

				var12.anInt2590 = Class4.anIntArray45[var1] * -1516112469;
				var12.anInt2565 = Class4.anIntArray35[var1] * -983534769;
				var8 = Class4.anIntArray44[var1];
				var7 = var8 >> 28;
				var11 = var8 >> 14 & 255;
				var9 = var8 & 255;
				var12.aByteArray2596[0] = Class4.aByteArray38[var1];
				var12.anInt2890 = (byte) var7 * 1587543155;
				var12.method3545((var11 << 6) + var4 - Class117_Sub22_Sub20.anInt2497 * 544615727, var5 + (var9 << 6) - Class117_Sub22_Sub19.anInt2468 * -771797447, (byte) -12);
				var12.aBool2879 = false;
				return true;
			}
		} else if (var3 == 1) {
			var4 = var0.method2931(2, -1320315244);
			var5 = Class4.anIntArray44[var1];
			Class4.anIntArray44[var1] = ((var4 + (var5 >> 28) & 3) << 28) + (var5 & 268435455);
			return false;
		} else {
			int var6;
			int var10;
			if (var3 == 2) {
				var4 = var0.method2931(5, -1320315244);
				var5 = var4 >> 3;
				var10 = var4 & 7;
				var6 = Class4.anIntArray44[var1];
				var8 = (var6 >> 28) + var5 & 3;
				var7 = var6 >> 14 & 255;
				var11 = var6 & 255;
				if (var10 == 0) {
					--var7;
					--var11;
				}

				if (var10 == 1) {
					--var11;
				}

				if (var10 == 2) {
					++var7;
					--var11;
				}

				if (var10 == 3) {
					--var7;
				}

				if (var10 == 4) {
					++var7;
				}

				if (var10 == 5) {
					--var7;
					++var11;
				}

				if (var10 == 6) {
					++var11;
				}

				if (var10 == 7) {
					++var7;
					++var11;
				}

				Class4.anIntArray44[var1] = var11 + (var8 << 28) + (var7 << 14);
				return false;
			} else {
				var4 = var0.method2931(18, -1320315244);
				var5 = var4 >> 16;
				var10 = var4 >> 8 & 255;
				var6 = var4 & 255;
				var8 = Class4.anIntArray44[var1];
				var7 = (var8 >> 28) + var5 & 3;
				var11 = (var8 >> 14) + var10 & 255;
				var9 = var8 + var6 & 255;
				Class4.anIntArray44[var1] = var9 + (var7 << 28) + (var11 << 14);
				return false;
			}
		}
	}

	public static Class69 method1009(int var0, int var1) {
		Class69[] var2 = Class32.method471(693499401);

		for (int var4 = 0; var4 < var2.length; var4++) {
			Class69 var3 = var2[var4];
			if (var3.anInt849 * -428394515 == var0) {
				return var3;
			}
		}

		return null;
	}

	public static Class117_Sub19 method1010(int var0, int var1) {
		int var2 = var0 >> 16;
		int var4 = var0 & 65535;
		if (Class117_Sub19.aClass117_Sub19ArrayArray2032[var2] == null || Class117_Sub19.aClass117_Sub19ArrayArray2032[var2][var4] == null) {
			boolean var3 = Class4.method85(var2, 326862862);
			if (!var3) {
				return null;
			}
		}

		return Class117_Sub19.aClass117_Sub19ArrayArray2032[var2][var4];
	}

}
