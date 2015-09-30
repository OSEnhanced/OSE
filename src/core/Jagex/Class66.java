package core.Jagex;
import java.io.File;

public class Class66 {

	public static final int anInt791 = 96;
	public static final int anInt792 = 1;
	static final int anInt793 = 34;
	public static final int anInt794 = 63;
	static final int anInt795 = 3;
	public static final int anInt796 = 4096;
	public static final int anInt797 = 63;
	static final int anInt798 = 112;
	public static final int anInt799 = 3;
	static final int anInt800 = 41;

	static void method952(byte var0) {
		Class54.method850(GameClient.aClass117_Sub19_3019, (byte) 0);
		Class117_Sub22_Sub14.anInt2399 -= 1784701963;
		if (GameClient.aBool3100 && GameClient.aBool3097) {
			int var1 = Class75.anInt903 * -456706193;
			int var2 = Class75.anInt904 * 1381104939;
			var1 -= GameClient.anInt3184 * -1921736267;
			var2 -= GameClient.anInt3048 * -2035182379;
			if (var1 < GameClient.anInt3079 * 414351887) {
				var1 = GameClient.anInt3079 * 414351887;
			}

			if (GameClient.aClass117_Sub19_3019.anInt1988 * 1854643179 + var1 > GameClient.anInt3079 * 414351887 + GameClient.aClass117_Sub19_3157.anInt1988 * 1854643179) {
				var1 = GameClient.aClass117_Sub19_3157.anInt1988 * 1854643179 + GameClient.anInt3079 * 414351887 - GameClient.aClass117_Sub19_3019.anInt1988 * 1854643179;
			}

			if (var2 < GameClient.anInt3099 * 1076129249) {
				var2 = GameClient.anInt3099 * 1076129249;
			}

			if (var2 + GameClient.aClass117_Sub19_3019.anInt1989 * 2747837 > GameClient.anInt3099 * 1076129249 + GameClient.aClass117_Sub19_3157.anInt1989 * 2747837) {
				var2 = GameClient.aClass117_Sub19_3157.anInt1989 * 2747837 + GameClient.anInt3099 * 1076129249 - GameClient.aClass117_Sub19_3019.anInt1989 * 2747837;
			}

			int var5 = var1 - GameClient.anInt2951 * -844752807;
			int var7 = var2 - GameClient.anInt3102 * -1112471929;
			int var6 = GameClient.aClass117_Sub19_3019.anInt2047 * -2000275281;
			if (Class117_Sub22_Sub14.anInt2399 * -1345062819 > GameClient.aClass117_Sub19_3019.anInt2003 * -69720911 && (var5 > var6 || var5 < -var6 || var7 > var6 || var7 < -var6)) {
				GameClient.aBool3103 = true;
			}

			int var4 = GameClient.aClass117_Sub19_3157.anInt1994 * 17552373 + (var1 - GameClient.anInt3079 * 414351887);
			int var8 = GameClient.aClass117_Sub19_3157.anInt2060 * -400020749 + (var2 - GameClient.anInt3099 * 1076129249);
			Class117_Sub7 var3;
			if (GameClient.aClass117_Sub19_3019.anObjectArray1963 != null && GameClient.aBool3103) {
				var3 = new Class117_Sub7();
				var3.aClass117_Sub19_1780 = GameClient.aClass117_Sub19_3019;
				var3.anInt1781 = var4 * -2107255895;
				var3.anInt1791 = var8 * -1551690197;
				var3.anObjectArray1786 = GameClient.aClass117_Sub19_3019.anObjectArray1963;
				Class57.method867(var3, 200000, -1912108700);
			}

			if (Class75.anInt911 * -1760033137 == 0) {
				if (GameClient.aBool3103) {
					if (GameClient.aClass117_Sub19_3019.anObjectArray2001 != null) {
						var3 = new Class117_Sub7();
						var3.aClass117_Sub19_1780 = GameClient.aClass117_Sub19_3019;
						var3.anInt1781 = var4 * -2107255895;
						var3.anInt1791 = var8 * -1551690197;
						var3.aClass117_Sub19_1784 = GameClient.aClass117_Sub19_3096;
						var3.anObjectArray1786 = GameClient.aClass117_Sub19_3019.anObjectArray2001;
						Class57.method867(var3, 200000, 544020237);
					}

					if (GameClient.aClass117_Sub19_3096 != null && Class117_Sub22_Sub8.method2489(GameClient.aClass117_Sub19_3019, (byte) 3) != null) {
						GameClient.aClass117_Sub14_Sub1_2961.method2932(58, 1560452862);
						GameClient.aClass117_Sub14_Sub1_2961.method1996(GameClient.aClass117_Sub19_3019.anInt1976 * 1710354431, (byte) -95);
						GameClient.aClass117_Sub14_Sub1_2961.method2054(GameClient.aClass117_Sub19_3019.anInt1973 * -1955776525, 329981728);
						GameClient.aClass117_Sub14_Sub1_2961.method2009(GameClient.aClass117_Sub19_3096.anInt1973 * -1955776525, -1777442703);
						GameClient.aClass117_Sub14_Sub1_2961.method2068(GameClient.aClass117_Sub19_3019.anInt2091 * -828631679, (byte) 16);
						GameClient.aClass117_Sub14_Sub1_2961.method1996(GameClient.aClass117_Sub19_3096.anInt1976 * 1710354431, (byte) -6);
						GameClient.aClass117_Sub14_Sub1_2961.method2042(GameClient.aClass117_Sub19_3096.anInt2091 * -828631679, (byte) 8);
					}
				} else if ((GameClient.anInt3149 * -370826807 == 1 || Class117_Sub5.method1935(GameClient.anInt3060 * 1223430109 - 1, (byte) -4)) && GameClient.anInt3060 * 1223430109 > 2) {
					Class101.method1289(GameClient.anInt3184 * -1921736267 + GameClient.anInt2951 * -844752807, GameClient.anInt3102 * -1112471929 + GameClient.anInt3048 * -2035182379, -2108022665);
				} else if (GameClient.anInt3060 * 1223430109 > 0) {
					Class116.method1530(GameClient.anInt3184 * -1921736267 + GameClient.anInt2951 * -844752807, GameClient.anInt3102 * -1112471929 + GameClient.anInt3048 * -2035182379, (short) 2984);
				}

				GameClient.aClass117_Sub19_3019 = null;
			}

		} else {
			if (Class117_Sub22_Sub14.anInt2399 * -1345062819 > 1) {
				GameClient.aClass117_Sub19_3019 = null;
			}

		}
	}

	Class66() throws Throwable {
		throw new Error();
	}

	public static void method957(File var0, byte var1) {
		Class82.aFile973 = var0;
		if (!Class82.aFile973.exists()) {
			if (var1 != 1) {
				throw new RuntimeException("");
			}
		} else {
			Class82.aBool974 = true;
		}
	}

	static void method958(Class117_Sub19 var0, int var1, int var2, int var3) {
		if (GameClient.aClass117_Sub19_3019 == null && !GameClient.aBool3059) {
			if (var0 != null) {
				Class117_Sub19 var5 = Class117_Sub22_Sub8.method2489(var0, (byte) 3);
				if (var5 == null) {
					var5 = var0.aClass117_Sub19_2046;
				}

				if (var5 != null) {
					GameClient.aClass117_Sub19_3019 = var0;
					var5 = Class117_Sub22_Sub8.method2489(var0, (byte) 3);
					if (var5 == null) {
						var5 = var0.aClass117_Sub19_2046;
					}

					GameClient.aClass117_Sub19_3157 = var5;
					GameClient.anInt3184 = var1 * -1737882467;
					GameClient.anInt3048 = var2 * -124058499;
					Class117_Sub22_Sub14.anInt2399 = 0;
					GameClient.aBool3103 = false;
					if (GameClient.anInt3060 * 1223430109 > 0) {
						int var6 = GameClient.anInt3060 * 1223430109 - 1;
						Class117_Sub6.aClass3_1770 = new Class3();
						Class117_Sub6.aClass3_1770.anInt26 = GameClient.anIntArray3061[var6] * 1558298929;
						Class117_Sub6.aClass3_1770.anInt31 = GameClient.anIntArray3009[var6] * -642764011;
						Class117_Sub6.aClass3_1770.anInt28 = GameClient.anIntArray2999[var6] * 354852715;
						Class117_Sub6.aClass3_1770.anInt25 = GameClient.anIntArray3064[var6] * -225579981;
						Class117_Sub6.aClass3_1770.aString29 = GameClient.aStringArray3065[var6];
					}

					return;
				}
			}

		}
	}

}
