package core.Jagex;
public class Class10 {

	static final int anInt122 = 22050;
	Class21[] aClass21Array123 = new Class21[10];
	int anInt124;
	int anInt125;

	Class10(Class117_Sub14 var1) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = var1.method2010(-1439707937);
			if (var3 != 0) {
				var1.anInt1880 += 2079217519;
				aClass21Array123[var2] = new Class21();
				aClass21Array123[var2].method359(var1);
			}
		}

		anInt124 = var1.method2012(1053511631);
		anInt125 = var1.method2012(1053511631);
	}

	public Class117_Sub4_Sub1 method150() {
		byte[] var1 = method152();
		return new Class117_Sub4_Sub1(22050, var1, anInt124 * 22050 / 1000, anInt125 * 22050 / 1000);
	}

	final byte[] method152() {
		int var1 = 0;

		int var2;
		for (var2 = 0; var2 < 10; var2++) {
			if (aClass21Array123[var2] != null && aClass21Array123[var2].anInt251 + aClass21Array123[var2].anInt254 > var1) {
				var1 = aClass21Array123[var2].anInt251 + aClass21Array123[var2].anInt254;
			}
		}

		if (var1 == 0) {
			return new byte[0];
		} else {
			var2 = var1 * 22050 / 1000;
			byte[] var7 = new byte[var2];

			for (int var3 = 0; var3 < 10; var3++) {
				if (aClass21Array123[var3] != null) {
					int var6 = aClass21Array123[var3].anInt251 * 22050 / 1000;
					int var8 = aClass21Array123[var3].anInt254 * 22050 / 1000;
					int[] var9 = aClass21Array123[var3].method363(var6, aClass21Array123[var3].anInt251);

					for (int var5 = 0; var5 < var6; var5++) {
						int var4 = var7[var5 + var8] + (var9[var5] >> 8);
						if ((var4 + 128 & -256) != 0) {
							var4 = var4 >> 31 ^ 127;
						}

						var7[var5 + var8] = (byte) var4;
					}
				}
			}

			return var7;
		}
	}

	public final int method161() {
		int var1 = 9999999;

		int var2;
		for (var2 = 0; var2 < 10; var2++) {
			if (aClass21Array123[var2] != null && aClass21Array123[var2].anInt254 / 20 < var1) {
				var1 = aClass21Array123[var2].anInt254 / 20;
			}
		}

		if (anInt124 < anInt125 && anInt124 / 20 < var1) {
			var1 = anInt124 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (var2 = 0; var2 < 10; var2++) {
				if (aClass21Array123[var2] != null) {
					aClass21Array123[var2].anInt254 -= var1 * 20;
				}
			}

			if (anInt124 < anInt125) {
				anInt124 -= var1 * 20;
				anInt125 -= var1 * 20;
			}

			return var1;
		} else {
			return 0;
		}
	}

	public static Class10 method162(Class106 var0, int var1, int var2) {
		byte[] var3 = var0.method1380(var1, var2, (byte) 65);
		return var3 == null ? null : new Class10(new Class117_Sub14(var3));
	}

}
