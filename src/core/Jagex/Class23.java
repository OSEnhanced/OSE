package core.Jagex;
public final class Class23 {

	int anInt272;
	int anInt273;
	int anInt274;
	int anInt275;
	public Class117_Sub22_Sub18 aClass117_Sub22_Sub18_276;
	int anInt277;
	int anInt278;
	int anInt279;
	int anInt280;
	int anInt281;
	static int anInt282;
	public static final int anInt283 = 69;
	int anInt285;
	static final int anInt286 = 91;
	int anInt287;
	public static final int anInt288 = 61;
	public int anInt289 = 0;
	int anInt284 = 0;

	public static Class117_Sub19 method368(int var0, int var1, int var2) {
		Class117_Sub19 var3 = Class74.method1010(var0, -1200514952);
		return var1 == -1 ? var3 : (var3 != null && var3.aClass117_Sub19Array2095 != null && var1 < var3.aClass117_Sub19Array2095.length ? var3.aClass117_Sub19Array2095[var1] : null);
	}

	public static String method369(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var5 = 0;

				for (long var7 = var0; var7 != 0L; var7 /= 37L) {
					++var5;
				}

				char var4;
				StringBuilder var6;
				for (var6 = new StringBuilder(var5); var0 != 0L; var6.append(var4)) {
					long var2 = var0;
					var0 /= 37L;
					var4 = Class101.aCharArray1146[(int) (var2 - var0 * 37L)];
					if (var4 == 95) {
						int var9 = var6.length() - 1;
						var6.setCharAt(var9, Character.toUpperCase(var6.charAt(var9)));
						var4 = 160;
					}
				}

				var6.reverse();
				var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
				return var6.toString();
			}
		} else {
			return null;
		}
	}

}
