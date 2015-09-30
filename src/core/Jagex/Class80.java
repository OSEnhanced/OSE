package core.Jagex;
import java.applet.Applet;

public class Class80 {

	public static int anInt952;
	public static final int anInt953 = 165;
	public static final int anInt954 = 3;
	public static final int anInt955 = 2;
	public static final String aString956 = "main_file_cache.idx255";
	public static final int anInt958 = 247;
	static Applet anApplet951 = null;
	public static String aString957 = null;

	static void method1082(int var0) {
		for (int var1 = 0; var1 < GameClient.anInt3060 * 1223430109; var1++) {
			int var3 = GameClient.anIntArray2999[var1];
			boolean var4 = var3 == 57 || var3 == 58 || var3 == 1007 || var3 == 25 || var3 == 30;
			if (var4) {
				if (var1 < GameClient.anInt3060 * 1223430109 - 1) {
					for (int var2 = var1; var2 < GameClient.anInt3060 * 1223430109 - 1; var2++) {
						GameClient.aStringArray3065[var2] = GameClient.aStringArray3065[1 + var2];
						GameClient.aStringArray3066[var2] = GameClient.aStringArray3066[var2 + 1];
						GameClient.anIntArray2999[var2] = GameClient.anIntArray2999[var2 + 1];
						GameClient.anIntArray3064[var2] = GameClient.anIntArray3064[var2 + 1];
						GameClient.anIntArray3061[var2] = GameClient.anIntArray3061[1 + var2];
						GameClient.anIntArray3009[var2] = GameClient.anIntArray3009[1 + var2];
					}
				}

				GameClient.anInt3060 -= 2032386165;
			}
		}

	}

	public static Class117_Sub22_Sub11 method1085(int var0, byte var1) {
		Class117_Sub22_Sub11 var2 = (Class117_Sub22_Sub11) Class117_Sub22_Sub11.aClass115_2318.method1515((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Class117_Sub22_Sub11.aClass106_2314.method1380(13, var0, (byte) 124);
			var2 = new Class117_Sub22_Sub11();
			var2.anInt2312 = var0 * -194078497;
			if (var3 != null) {
				var2.method2551(new Class117_Sub14(var3), 1280719219);
			}

			Class117_Sub22_Sub11.aClass115_2318.method1517(var2, (long) var0);
			return var2;
		}
	}

	Class80() throws Throwable {
		throw new Error();
	}

	static void method1086(byte[] var0, int var1, int var2, int var3, int var4, Class51[] var5, byte var6) {
		int var8;
		int var9;
		for (int var7 = 0; var7 < 4; var7++) {
			for (var8 = 0; var8 < 64; var8++) {
				for (var9 = 0; var9 < 64; var9++) {
					if (var8 + var1 > 0 && var1 + var8 < 103 && var2 + var9 > 0 && var2 + var9 < 103) {
						var5[var7].anIntArrayArray704[var8 + var1][var2 + var9] &= -16777217;
					}
				}
			}
		}

		Class117_Sub14 var11 = new Class117_Sub14(var0);

		for (var8 = 0; var8 < 4; var8++) {
			for (var9 = 0; var9 < 64; var9++) {
				for (int var10 = 0; var10 < 64; var10++) {
					Class117_Sub22_Sub4.method2377(var11, var8, var9 + var1, var10 + var2, var3, var4, 0, (byte) 13);
				}
			}
		}

	}

}
