package core.Jagex;
public class Class79 implements Interface4 {

	static Class83 aClass83_948;
	public static final int anInt949 = 241;
	static final int anInt950 = 2;
	public String aString947;
	int anInt940;
	static Class79 aClass79_941 = new Class79("runescape", "RuneScape", 0);
	static Class79 aClass79_945 = new Class79("stellardawn", "Stellar Dawn", 1);
	static Class79 aClass79_942 = new Class79("game3", "Game 3", 2);
	static Class79 aClass79_943 = new Class79("game4", "Game 4", 3);
	static Class79 aClass79_944 = new Class79("game5", "Game 5", 4);
	public static Class79 aClass79_946 = new Class79("oldscape", "RuneScape 2007", 5);

	public int method40(byte var1) {
		return anInt940 * -1743957017;
	}

	Class79(String var1, String var2, int var3) {
		aString947 = var1;
		anInt940 = var3 * -142864425;
	}

	public static void method1075(Class106 var0, Class106 var1, int var2) {
		Class117_Sub22_Sub5.aClass106_2212 = var0;
		Class117_Sub22_Sub5.aClass106_2199 = var1;
	}

	public static boolean method1076(int var0, int var1) {
		return (var0 >> 29 & 1) != 0;
	}

	public static Class78 method1077(int var0, byte var1) {
		Class78[] var2 = new Class78[]{Class78.aClass78_939, Class78.aClass78_930, Class78.aClass78_931, Class78.aClass78_932};
		Class78[] var5 = var2;

		for (int var4 = 0; var4 < var5.length; var4++) {
			Class78 var3 = var5[var4];
			if (var0 == var3.anInt934 * -60687197) {
				return var3;
			}
		}

		return null;
	}

}
