package core.Jagex;
public class Class38 {

	public static final int anInt467 = 188;
	static int[] anIntArray471;
	static final int anInt472 = 171;
	public static Class106 aClass106_473;
	static final int anInt475 = 512;
	int anInt474;
	int anInt468;
	int anInt469;
	int anInt470;

	static void method518(short var0) {
		Class4.anInt46 = 0;

		for (int var1 = 0; var1 < 2048; var1++) {
			Class4.aClass117_Sub14Array39[var1] = null;
			Class4.aByteArray38[var1] = 1;
		}

	}

	Class38(Class38 var1) {
		anInt474 = var1.anInt474 * 1;
		anInt468 = var1.anInt468 * 1;
		anInt469 = var1.anInt469 * 1;
		anInt470 = var1.anInt470 * 1;
	}

	public static void method519(int var0) {
		Class117_Sub22_Sub9.aClass115_2293.method1518();
	}

	public static void method520(long var0) {
		if (var0 > 0L) {
			if (var0 % 10L != 0L) {
				Class73_Sub2.method2219(var0);
			} else {
				Class73_Sub2.method2219(var0 - 1L);
				Class73_Sub2.method2219(1L);
			}

		}
	}

	Class38() {
	}

	public static String method521(CharSequence var0, byte var1) {
		int var2 = var0.length();
		StringBuilder var6 = new StringBuilder(var2);

		for (int var5 = 0; var5 < var2; var5++) {
			char var3 = var0.charAt(var5);
			if ((var3 < 97 || var3 > 122) && (var3 < 65 || var3 > 90) && (var3 < 48 || var3 > 57) && var3 != 46 && var3 != 45 && var3 != 42 && var3 != 95) {
				if (var3 == 32) {
					var6.append('+');
				} else {
					byte var4 = Player.method3548(var3, -635618848);
					var6.append('%');
					int var7 = var4 >> 4 & 15;
					if (var7 >= 10) {
						var6.append((char) (55 + var7));
					} else {
						var6.append((char) (48 + var7));
					}

					var7 = var4 & 15;
					if (var7 >= 10) {
						var6.append((char) (55 + var7));
					} else {
						var6.append((char) (48 + var7));
					}
				}
			} else {
				var6.append(var3);
			}
		}

		return var6.toString();
	}

}
