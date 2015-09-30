package core.Jagex;
public final class Class47 {

	int anInt635;
	int anInt636;
	int anInt637;
	Class117_Sub22_Sub18 aClass117_Sub22_Sub18_638;
	int anInt639;
	Class117_Sub22_Sub18 aClass117_Sub22_Sub18_640;
	int anInt641;
	Class117_Sub22_Sub18 aClass117_Sub22_Sub18_642;
	public static final int anInt643 = 115;

	static boolean method771(char var0, byte var1) {
		return var0 == 160 || var0 == 32 || var0 == 95 || var0 == 45;
	}

	public static void method772(int var0) {
		Class117_Sub22_Sub11.aClass115_2318.method1518();
		Class117_Sub22_Sub11.aClass115_2311.method1518();
	}

	static String method773(int var0, int var1) {
		String var2 = Integer.toString(var0);

		for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
			var2 = var2.substring(0, var3) + Class39.aString478 + var2.substring(var3);
		}

		return var2.length() > 9 ? " " + Class117_Sub22_Sub12.method2584(65408, 668388556) + var2.substring(0, var2.length() - 8) + Class108.aString1361 + " " + Class39.aString479 + var2 + Class39.aString480 + Class39.aString483 : (var2.length() > 6 ? " " + Class117_Sub22_Sub12.method2584(16777215, 668388556) + var2.substring(0, var2.length() - 4) + Class108.aString1363 + " " + Class39.aString479 + var2 + Class39.aString480 + Class39.aString483 : " " + Class117_Sub22_Sub12.method2584(16776960, 668388556) + var2 + Class39.aString483);
	}

	public static synchronized long method774(int var0) {
		long var1 = System.currentTimeMillis();
		if (var1 < Class63.aLong776 * -7665649306217073141L) {
			Class63.aLong774 += (Class63.aLong776 * -7665649306217073141L - var1) * -1838229446257317885L;
		}

		Class63.aLong776 = 8368425927948117411L * var1;
		return var1 + Class63.aLong774 * 3651530195276432043L;
	}

}
