package core.Jagex;
public final class Class34 {

	public static final int anInt425 = 84;
	int anInt426;
	int anInt427;
	int anInt428;
	int anInt429;
	public Class117_Sub22_Sub18 aClass117_Sub22_Sub18_430;
	public Class117_Sub22_Sub18 aClass117_Sub22_Sub18_431;
	public static final int anInt432 = 140;
	int anInt435;
	static final int anInt436 = 11;
	public static final int anInt437 = 147;
	static Class117_Sub22_Sub17_Sub3 aClass117_Sub22_Sub17_Sub3_438;
	public int anInt434 = 0;
	int anInt433 = 0;

	static void method487(int var0, int var1, int var2, byte var3) {
		if (GameClient.anInt3047 * -2084883511 != 0) {
			if (var3 == 2) {
				return;
			}

			if (var1 != 0 && GameClient.anInt3162 * 1572335207 < 50) {
				GameClient.anIntArray3163[GameClient.anInt3162 * 1572335207] = var0;
				GameClient.anIntArray3164[GameClient.anInt3162 * 1572335207] = var1;
				GameClient.anIntArray3165[GameClient.anInt3162 * 1572335207] = var2;
				GameClient.aClass10Array3067[GameClient.anInt3162 * 1572335207] = null;
				GameClient.anIntArray2959[GameClient.anInt3162 * 1572335207] = 0;
				GameClient.anInt3162 += 1850690903;
			}
		}

	}

	public static int method488(CharSequence var0, int var1, int var2, byte[] var3, int var4, int var5) {
		int var6 = var2 - var1;

		for (int var7 = 0; var7 < var6; var7++) {
			char var8 = var0.charAt(var7 + var1);
			if (var8 > 0 && var8 < 128 || var8 >= 160 && var8 <= 255) {
				var3[var4 + var7] = (byte) var8;
			} else if (var8 == 8364) {
				var3[var7 + var4] = -128;
			} else if (var8 == 8218) {
				var3[var7 + var4] = -126;
			} else if (var8 == 402) {
				var3[var7 + var4] = -125;
			} else if (var8 == 8222) {
				var3[var4 + var7] = -124;
			} else if (var8 == 8230) {
				var3[var4 + var7] = -123;
			} else if (var8 == 8224) {
				var3[var7 + var4] = -122;
			} else if (var8 == 8225) {
				var3[var7 + var4] = -121;
			} else if (var8 == 710) {
				var3[var7 + var4] = -120;
			} else if (var8 == 8240) {
				var3[var7 + var4] = -119;
			} else if (var8 == 352) {
				var3[var7 + var4] = -118;
			} else if (var8 == 8249) {
				var3[var7 + var4] = -117;
			} else if (var8 == 338) {
				var3[var4 + var7] = -116;
			} else if (var8 == 381) {
				var3[var4 + var7] = -114;
			} else if (var8 == 8216) {
				var3[var7 + var4] = -111;
			} else if (var8 == 8217) {
				var3[var7 + var4] = -110;
			} else if (var8 == 8220) {
				var3[var4 + var7] = -109;
			} else if (var8 == 8221) {
				var3[var7 + var4] = -108;
			} else if (var8 == 8226) {
				var3[var4 + var7] = -107;
			} else if (var8 == 8211) {
				var3[var4 + var7] = -106;
			} else if (var8 == 8212) {
				var3[var7 + var4] = -105;
			} else if (var8 == 732) {
				var3[var4 + var7] = -104;
			} else if (var8 == 8482) {
				var3[var4 + var7] = -103;
			} else if (var8 == 353) {
				var3[var4 + var7] = -102;
			} else if (var8 == 8250) {
				var3[var4 + var7] = -101;
			} else if (var8 == 339) {
				var3[var4 + var7] = -100;
			} else if (var8 == 382) {
				var3[var7 + var4] = -98;
			} else if (var8 == 376) {
				var3[var4 + var7] = -97;
			} else {
				var3[var7 + var4] = 63;
			}
		}

		return var6;
	}

}
