package core.Jagex;
public class Class125 {

	static Class117_Sub22_Sub17_Sub3 aClass117_Sub22_Sub17_Sub3_1549;
	public String aString1548;
	public static Class125 aClass125_1542 = new Class125("3", "3");
	public static Class125 aClass125_1543 = new Class125("4", "4");
	public static Class125 aClass125_1535 = new Class125("9", "9");
	public static Class125 aClass125_1536 = new Class125("2", "2");
	public static Class125 aClass125_1534 = new Class125("14", "14");
	public static Class125 aClass125_1538 = new Class125("13", "13");
	public static Class125 aClass125_1533 = new Class125("1", "1");
	public static Class125 aClass125_1540 = new Class125("5", "5");
	public static Class125 aClass125_1547 = new Class125("7", "7");
	public static Class125 aClass125_1537 = new Class125("15", "15");
	public static Class125 aClass125_1541 = new Class125("12", "12");
	public static Class125 aClass125_1539 = new Class125("10", "10");
	public static Class125 aClass125_1545 = new Class125("8", "8");
	public static Class125 aClass125_1546 = new Class125("11", "11");
	public static Class125 aClass125_1544 = new Class125("6", "6");

	public static boolean method1649(char var0, int var1) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (var0 != 0) {
				char[] var3 = Class100.aCharArray1143;

				for (int var4 = 0; var4 < var3.length; var4++) {
					char var2 = var3[var4];
					if (var0 == var2) {
						return true;
					}
				}
			}

			return false;
		} else {
			return true;
		}
	}

	Class125(String var1, String var2) {
		aString1548 = var2;
	}

}
