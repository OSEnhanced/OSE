package core.Jagex;
import java.io.File;
import java.io.IOException;

public class Class93 {

	static final int anInt1089 = 5;
	static final int anInt1090 = 1;
	public static final int anInt1091 = 12;

	static void method1228(int var0, int var1, byte var2) {
		if (GameClient.anInt3060 * 1223430109 >= 2 || GameClient.anInt3071 * -339828245 != 0 || GameClient.aBool3074) {
			String var3;
			if (GameClient.anInt3071 * -339828245 == 1 && GameClient.anInt3060 * 1223430109 < 2) {
				var3 = Class108.aString1326 + Class108.aString1402 + GameClient.aString3058 + " " + Class39.aString481;
			} else if (GameClient.aBool3074 && GameClient.anInt3060 * 1223430109 < 2) {
				var3 = GameClient.aString2931 + Class108.aString1402 + GameClient.aString3078 + " " + Class39.aString481;
			} else {
				var3 = Class117_Sub19.method2284(GameClient.anInt3060 * 1223430109 - 1, 661972590);
			}

			if (GameClient.anInt3060 * 1223430109 > 2) {
				var3 = var3 + Class117_Sub22_Sub12.method2584(16777215, 668388556) + " " + '/' + " " + (GameClient.anInt3060 * 1223430109 - 2) + Class108.aString1268;
			}

			Class54_Sub1.aClass117_Sub22_Sub17_Sub4_Sub1_1729.method3465(var3, var0 + 4, var1 + 15, 16777215, 0, GameClient.anInt2923 * -488599663 / 1000);
		}
	}

	public static void method1236(Class106 var0, int var1, int var2, int var3, boolean var4, int var5) {
		Class121.anInt1515 = -793599395;
		Class54_Sub1.aClass106_1728 = var0;
		Class117_Sub11.anInt1851 = var1 * 366489035;
		Class117_Sub22_Sub18_Sub2.anInt2605 = var2 * 1519237447;
		Class138.anInt1620 = var3 * 1436582997;
		Class82.aBool972 = var4;
		Class39.anInt488 = -1473020624;
	}

	Class93() throws Throwable {
		throw new Error();
	}

	public static Class129 method1241(String var0, String var1, boolean var2, byte var3) {
		File var4 = new File(Class74.aFile883, "preferences" + var0 + ".dat");
		if (var4.exists()) {
			try {
				Class129 var11 = new Class129(var4, "rw", 10000L);
				return var11;
			} catch (IOException var10) {
				;
			}
		}

		String var5 = "";
		if (Class29.anInt373 * -1137452499 == 33) {
			var5 = "_rc";
		} else if (Class29.anInt373 * -1137452499 == 34) {
			var5 = "_wip";
		}

		File var6 = new File(Class75.aString897, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
		Class129 var7;
		if (!var2 && var6.exists()) {
			try {
				var7 = new Class129(var6, "rw", 10000L);
				return var7;
			} catch (IOException var9) {
				;
			}
		}

		try {
			var7 = new Class129(var4, "rw", 10000L);
			return var7;
		} catch (IOException var8) {
			throw new RuntimeException();
		}
	}

}
