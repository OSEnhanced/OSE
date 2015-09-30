package core.Jagex;
public class Class54_Sub1 extends Class54 {

	public static Class106 aClass106_1728;
	static Class117_Sub22_Sub17_Sub4_Sub1 aClass117_Sub22_Sub17_Sub4_Sub1_1729;
	public static final int anInt1730 = 42;
	public static final int anInt1731 = 177;
	public static final int anInt1732 = 216;

	protected boolean method847(int var1, int var2, int var3, Class51 var4, int var5) {
		return anInt736 * 596959719 == var2 && var3 == anInt728 * 1540487459;
	}

	static void method1933(String var0, int var1) {
		if (var0 != null) {
			String var2 = Class32.method472(var0, Class54.aClass137_729, 1538480085);
			if (var2 != null) {
				for (int var5 = 0; var5 < GameClient.anInt2976 * -178563241; var5++) {
					Class43 var6 = GameClient.aClass43Array3192[var5];
					String var7 = var6.aString581;
					String var3 = Class32.method472(var7, Class54.aClass137_729, 1538480085);
					boolean var4;
					if (var0 != null && var7 != null) {
						if (!var0.startsWith("#") && !var7.startsWith("#")) {
							var4 = var2.equals(var3);
						} else {
							var4 = var0.equals(var7);
						}
					} else {
						var4 = false;
					}

					if (var4) {
						GameClient.anInt2976 -= 1528923239;

						for (int var8 = var5; var8 < GameClient.anInt2976 * -178563241; var8++) {
							GameClient.aClass43Array3192[var8] = GameClient.aClass43Array3192[var8 + 1];
						}

						GameClient.anInt3112 = GameClient.anInt3104 * -481597009;
						GameClient.aClass117_Sub14_Sub1_2961.method2932(34, 126327145);
						GameClient.aClass117_Sub14_Sub1_2961.method2126(Class37.method517(var0, 403612888), 1637992916);
						GameClient.aClass117_Sub14_Sub1_2961.method2001(var0, 1819160095);
						break;
					}
				}

			}
		}
	}

	public static Class117_Sub22_Sub4 method1934(int var0, int var1) {
		Class117_Sub22_Sub4 var2 = (Class117_Sub22_Sub4) Class117_Sub22_Sub4.aClass115_2173.method1515((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Class117_Sub22_Sub4.aClass106_2174.method1380(15, var0, (byte) 82);
			var2 = new Class117_Sub22_Sub4();
			if (var3 != null) {
				var2.method2373(new Class117_Sub14(var3), 814365160);
			}

			Class117_Sub22_Sub4.aClass115_2173.method1517(var2, (long) var0);
			return var2;
		}
	}

}
