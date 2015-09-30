package core.Jagex;
public class Class30 {

	public static final int anInt375 = 248;
	int anInt376;
	int anInt377;
	static final int anInt378 = 32768;
	int anInt379;

	static void method421(byte var0) {
		Class42.aBool554 = false;
		GameClient.aBool2921 = false;
	}

	static void method422(int var0, int var1, int var2, int var3, byte var4) {
		Class117_Sub19 var5 = Class23.method368(var0, var1, 2103373918);
		if (var5 != null && var5.anObjectArray2042 != null) {
			Class117_Sub7 var6 = new Class117_Sub7();
			var6.aClass117_Sub19_1780 = var5;
			var6.anObjectArray1786 = var5.anObjectArray2042;
			Class57.method867(var6, 200000, -1380553846);
		}

		GameClient.anInt3076 = var3 * 1356369839;
		GameClient.aBool3074 = true;
		RuntimeException_Sub1.anInt2835 = var0 * 1872499123;
		GameClient.anInt3075 = var1 * -632851969;
		Class25.anInt311 = var2 * -1551071561;
		Class54.method850(var5, (byte) 0);
	}

	public static String method423(CharSequence var0, byte var1) {
		String var2 = Class23.method369(Class95.method1243(var0, -1523764386));
		if (var2 == null) {
			var2 = "";
		}

		return var2;
	}

}
