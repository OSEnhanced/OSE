package core.Jagex;
public final class Class101 {

	public static final int anInt1144 = 24;
	public static final int anInt1145 = 137;
	static char[] aCharArray1146 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

	Class101() throws Throwable {
		throw new Error();
	}

	static Class117_Sub22_Sub17_Sub3 method1283(int var0) {
		Class117_Sub22_Sub17_Sub3 var1 = new Class117_Sub22_Sub17_Sub3();
		var1.anInt2715 = Class13.anInt145 * -1559182453;
		var1.anInt2720 = Class13.anInt146 * -1301976433;
		var1.anInt2714 = Class98.anIntArray1133[0];
		var1.anInt2719 = Class13.anIntArray147[0];
		var1.anInt2712 = Class13.anIntArray148[0];
		var1.anInt2716 = Class26.anIntArray324[0];
		int var3 = var1.anInt2712 * var1.anInt2716;
		byte[] var4 = Class13.aByteArrayArray150[0];
		var1.anIntArray2713 = new int[var3];

		for (int var2 = 0; var2 < var3; var2++) {
			var1.anIntArray2713[var2] = Class13.anIntArray149[var4[var2] & 255];
		}

		Class117_Sub22_Sub18_Sub3.method3083(-578517745);
		return var1;
	}

	static void method1289(int var0, int var1, int var2) {
		int var3 = Class54_Sub1.aClass117_Sub22_Sub17_Sub4_Sub1_1729.method3454(Class108.aString1247);

		int var4;
		int var5;
		for (var5 = 0; var5 < GameClient.anInt3060 * 1223430109; var5++) {
			var4 = Class54_Sub1.aClass117_Sub22_Sub17_Sub4_Sub1_1729.method3454(Class117_Sub19.method2284(var5, 2119709021));
			if (var4 > var3) {
				var3 = var4;
			}
		}

		var3 += 8;
		var5 = GameClient.anInt3060 * 1171582451 + 22;
		var4 = var0 - var3 / 2;
		if (var4 + var3 > Class80.anInt952 * 1566500665) {
			var4 = Class80.anInt952 * 1566500665 - var3;
		}

		if (var4 < 0) {
			var4 = 0;
		}

		int var6 = var1;
		if (var1 + var5 > Class117_Sub22_Sub18_Sub2.anInt2613 * 1325743505) {
			var6 = Class117_Sub22_Sub18_Sub2.anInt2613 * 1325743505 - var5;
		}

		if (var6 < 0) {
			var6 = 0;
		}

		GameClient.aBool3059 = true;
		Class28.anInt359 = var4 * 1109574373;
		Class114_Sub1.anInt1673 = var6 * -207006531;
		Class54.anInt735 = var3 * 1760625867;
		Class45.anInt599 = 1381208358 + GameClient.anInt3060 * -204249029;
	}

}
