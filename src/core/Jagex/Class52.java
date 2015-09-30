package core.Jagex;
public class Class52 {

	public static final int anInt711 = 8;
	static Class117_Sub22_Sub17_Sub3[] aClass117_Sub22_Sub17_Sub3Array716;
	public static final int anInt718 = 8;
	static final int anInt719 = 202;
	static int anInt717 = 0;
	static int anInt710 = 0;
	static int anInt712 = 0;
	static byte[][] aByteArrayArray713 = new byte[1000][];
	static byte[][] aByteArrayArray714 = new byte[250][];
	static byte[][] aByteArrayArray715 = new byte[50][];

	static synchronized byte[] method818(int var0, byte var1) {
		byte[] var2;
		if (var0 == 100 && anInt717 * 1360741327 > 0) {
			var2 = aByteArrayArray713[(anInt717 += 1262296273) * 1360741327];
			aByteArrayArray713[anInt717 * 1360741327] = null;
			return var2;
		} else if (var0 == 5000 && anInt710 * 1075189347 > 0) {
			var2 = aByteArrayArray714[(anInt710 += 1399252149) * 1075189347];
			aByteArrayArray714[anInt710 * 1075189347] = null;
			return var2;
		} else if (var0 == 30000 && anInt712 * -1231251713 > 0) {
			var2 = aByteArrayArray715[(anInt712 += 514692865) * -1231251713];
			aByteArrayArray715[anInt712 * -1231251713] = null;
			return var2;
		} else {
			return new byte[var0];
		}
	}

	Class52() throws Throwable {
		throw new Error();
	}

	public static int method820(CharSequence var0, int var1, int var2) {
		return Class5.method87(var0, var1, true, 1150506404);
	}

	public static void method821(int var0, byte var1) {
		if (var0 != -1) {
			if (Class117_Sub19.aBoolArray1962[var0]) {
				Class117_Sub19.aClass106_2093.method1401(var0, -1311271408);
				if (Class117_Sub19.aClass117_Sub19ArrayArray2032[var0] != null) {
					boolean var3 = true;

					for (int var2 = 0; var2 < Class117_Sub19.aClass117_Sub19ArrayArray2032[var0].length; var2++) {
						if (Class117_Sub19.aClass117_Sub19ArrayArray2032[var0][var2] != null) {
							if (Class117_Sub19.aClass117_Sub19ArrayArray2032[var0][var2].anInt1975 * 657737235 != 2) {
								Class117_Sub19.aClass117_Sub19ArrayArray2032[var0][var2] = null;
							} else {
								var3 = false;
							}
						}
					}

					if (var3) {
						Class117_Sub19.aClass117_Sub19ArrayArray2032[var0] = null;
					}

					Class117_Sub19.aBoolArray1962[var0] = false;
				}
			}
		}
	}

	static boolean method822(int var0, int var1, int var2) {
		return var0 != 4 || var1 != 8;
	}

}
