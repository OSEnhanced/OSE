package core.Jagex;
public class Class92 {

	static final int anInt1086 = 4;
	static GameClient aGameClient1087;
	public static Class106 aClass106_1088;

	Class92() throws Throwable {
		throw new Error();
	}

	public static int method1226(CharSequence var0, int var1) {
		int var2 = var0.length();
		int var3 = 0;

		for (int var4 = 0; var4 < var2; var4++) {
			char var5 = var0.charAt(var4);
			if (var5 <= 127) {
				++var3;
			} else if (var5 <= 2047) {
				var3 += 2;
			} else {
				var3 += 3;
			}
		}

		return var3;
	}

	static void method1227(Class117_Sub22_Sub14 var0, int var1, int var2, int var3, int var4) {
		if (GameClient.anInt3162 * 1572335207 < 50 && GameClient.anInt2948 * 1581116715 != 0) {
			if (var0.anIntArray2406 != null && var1 < var0.anIntArray2406.length) {
				int var9 = var0.anIntArray2406[var1];
				if (var9 != 0) {
					int var8 = var9 >> 8;
					int var10 = var9 >> 4 & 7;
					int var7 = var9 & 15;
					GameClient.anIntArray3163[GameClient.anInt3162 * 1572335207] = var8;
					GameClient.anIntArray3164[GameClient.anInt3162 * 1572335207] = var10;
					GameClient.anIntArray3165[GameClient.anInt3162 * 1572335207] = 0;
					GameClient.aClass10Array3067[GameClient.anInt3162 * 1572335207] = null;
					int var6 = (var2 - 64) / 128;
					int var5 = (var3 - 64) / 128;
					GameClient.anIntArray2959[GameClient.anInt3162 * 1572335207] = (var5 << 8) + (var6 << 16) + var7;
					GameClient.anInt3162 += 1850690903;
				}
			}
		}
	}

}
