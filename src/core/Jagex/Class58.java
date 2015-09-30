package core.Jagex;
import java.util.HashMap;

public class Class58 {

	static Class106_Sub1 aClass106_Sub1_753;
	static final int anInt754 = 1005;
	public static final int anInt755 = 200;

	Class58() throws Throwable {
		throw new Error();
	}

	static void method874(int var0, int var1, byte var2) {
		if (GameClient.anInt3156 * 206554627 != 0) {
			if (var2 != 3) {
				return;
			}

			if (var0 != -1) {
				if (var2 != 3) {
					return;
				}

				Class93.method1236(Class117_Sub22_Sub16.aClass106_Sub1_2457, var0, 0, GameClient.anInt3156 * 206554627, false, -1746414387);
				GameClient.aBool3158 = true;
			}
		}

	}

	static {
		new HashMap();
	}

	public static Class117_Sub22_Sub17_Sub2 method876(Class106 var0, String var1, String var2, short var3) {
		int var4 = var0.method1391(var1, -1358525092);
		int var5 = var0.method1383(var4, var2, (byte) 19);
		return Class14.method294(var0, var4, var5, -1462049308);
	}

	static void method877(int var0, int var1, int var2, boolean var3, int var4, boolean var5, int var6) {
		if (var0 < var1) {
			int var8 = (var0 + var1) / 2;
			int var7 = var0;
			Class24 var9 = Class24.aClass24Array290[var8];
			Class24.aClass24Array290[var8] = Class24.aClass24Array290[var1];
			Class24.aClass24Array290[var1] = var9;

			for (int var10 = var0; var10 < var1; var10++) {
				if (Class28.method411(Class24.aClass24Array290[var10], var9, var2, var3, var4, var5, -403948785) <= 0) {
					Class24 var11 = Class24.aClass24Array290[var10];
					Class24.aClass24Array290[var10] = Class24.aClass24Array290[var7];
					Class24.aClass24Array290[var7++] = var11;
				}
			}

			Class24.aClass24Array290[var1] = Class24.aClass24Array290[var7];
			Class24.aClass24Array290[var7] = var9;
			method877(var0, var7 - 1, var2, var3, var4, var5, -609837149);
			method877(1 + var7, var1, var2, var3, var4, var5, -777050620);
		}

	}

}
