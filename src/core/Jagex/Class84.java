package core.Jagex;
public class Class84 {

	static final int anInt987 = 70;
	public static final int anInt988 = 79;
	public static Class77 aClass77_989;
	static final int anInt990 = 2097152;
	static int anInt991;
	public static final int anInt992 = 72;
	public static final int anInt993 = 1024;

	public static void method1140(int var0, Class106 var1, String var2, String var3, int var4, boolean var5, int var6) {
		int var7 = var1.method1391(var2, -1979649170);
		int var8 = var1.method1383(var7, var3, (byte) 19);
		Class121.anInt1515 = -793599395;
		Class54_Sub1.aClass106_1728 = var1;
		Class117_Sub11.anInt1851 = var7 * 366489035;
		Class117_Sub22_Sub18_Sub2.anInt2605 = var8 * 1519237447;
		Class138.anInt1620 = var4 * 1436582997;
		Class82.aBool972 = var5;
		Class39.anInt488 = var0 * 61700227;
	}

	Class84() throws Throwable {
		throw new Error();
	}

	static boolean method1141(String var0, boolean var1, int var2) {
		if (var0 == null) {
			return false;
		} else {
			String var4 = Class32.method472(var0, Class54.aClass137_729, 1538480085);

			for (int var3 = 0; var3 < GameClient.anInt3198 * -1278614973; var3++) {
				if (var4.equalsIgnoreCase(Class32.method472(GameClient.aClass49Array3098[var3].aString660, Class54.aClass137_729, 1538480085)) && (!var1 || GameClient.aClass49Array3098[var3].anInt662 * -2124244471 != 0)) {
					return true;
				}
			}

			if (var4.equalsIgnoreCase(Class32.method472(Class31.player.playerName, Class54.aClass137_729, 1538480085))) {
				return true;
			} else {
				return false;
			}
		}
	}

}
