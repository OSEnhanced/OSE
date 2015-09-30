package core.Jagex;
public class Class78 {

	public static final int anInt933 = 162;
	static Class41 aClass41_935;
	static final int anInt936 = 36;
	static final int anInt937 = 4;
	public static final int anInt938 = 20;
	static Class78 aClass78_931 = new Class78("LIVE", 0);
	static Class78 aClass78_930 = new Class78("BUILDLIVE", 3);
	static Class78 aClass78_932 = new Class78("RC", 1);
	static Class78 aClass78_939 = new Class78("WIP", 2);
	public String aString929;
	int anInt934;

	static Integer method1070(Class117_Sub14 var0, byte var1) {
		int var2 = 0;
		boolean var3 = false;

		while (true) {
			int var4 = var0.method2010(-1439707937);
			if (var4 == 255) {
				return var3 ? Integer.valueOf(var2) : null;
			}

			if (var4 != 0) {
				throw new IllegalStateException("");
			}

			while (true) {
				int var5 = var0.method2010(-1439707937);
				if (var5 == 255) {
					break;
				}

				var0.anInt1880 += 2079217519;
				if (var0.method2012(1053511631) != 0) {
					throw new IllegalStateException("");
				}

				if (var3) {
					throw new IllegalStateException("");
				}

				var2 = var0.method2015((byte) 84);
				var3 = true;
			}
		}
	}

	public static void method1072(int var0, int var1, int var2) {
		Class117_Sub22_Sub3 var3 = (Class117_Sub22_Sub3) Class117_Sub22_Sub3.aClass115_2166.method1515((long) var0);
		Class117_Sub22_Sub3 var5;
		if (var3 == null) {
			byte[] var4 = Class117_Sub22_Sub3.aClass106_2172.method1380(14, var0, (byte) 5);
			var3 = new Class117_Sub22_Sub3();
			if (var4 != null) {
				var3.method2370(new Class117_Sub14(var4), -1500352332);
			}

			Class117_Sub22_Sub3.aClass115_2166.method1517(var3, (long) var0);
			var5 = var3;
		} else {
			var5 = var3;
		}

		int var9 = var5.anInt2167 * 720316499;
		int var7 = var5.anInt2170 * 1994791427;
		int var6 = var5.anInt2169 * -174555021;
		int var8 = Class97.anIntArray1126[var6 - var7];
		if (var1 < 0 || var1 > var8) {
			var1 = 0;
		}

		var8 <<= var7;
		Class97.anIntArray1129[var9] = Class97.anIntArray1129[var9] & ~var8 | var1 << var7 & var8;
	}

	Class78(String var1, int var2) {
		aString929 = var1;
		anInt934 = var2 * -1149069557;
	}

}
