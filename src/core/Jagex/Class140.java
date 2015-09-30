package core.Jagex;
import java.util.Comparator;

final class Class140 implements Comparator {

	public static final int anInt1626 = 143;
	public static final int anInt1627 = 93;
	static final int anInt1628 = 2;
	public static final int anInt1629 = 0;

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return method1762((Class133) var1, (Class133) var2, -1105520119);
	}

	int method1762(Class133 var1, Class133 var2, int var3) {
		return var1.aClass143_1598.anInt1644 * 645279987 < var2.aClass143_1598.anInt1644 * 645279987 ? -1 : (var2.aClass143_1598.anInt1644 * 645279987 != var1.aClass143_1598.anInt1644 * 645279987 ? 1 : 0);
	}

	static void method1765(int var0) {
		if (Class117_Sub22_Sub18_Sub2.aClass81_2609 != null) {
			Class117_Sub22_Sub18_Sub2.aClass81_2609.method1088((byte) 0);
			Class117_Sub22_Sub18_Sub2.aClass81_2609 = null;
		}

		Class29.method420(-434527822);
		Class117_Sub13.aClass42_1875.method539();

		for (int var1 = 0; var1 < 4; var1++) {
			GameClient.aClass51Array3174[var1].method776(1715710214);
		}

		System.gc();
		Class121.anInt1515 = -793599395;
		Class54_Sub1.aClass106_1728 = null;
		Class117_Sub11.anInt1851 = -366489035;
		Class117_Sub22_Sub18_Sub2.anInt2605 = -1519237447;
		Class138.anInt1620 = 0;
		Class82.aBool972 = false;
		Class39.anInt488 = 123400454;
		GameClient.anInt3021 = -207755149;
		GameClient.aBool3158 = false;
		Class117_Sub22_Sub13.method2630(1516183559);
		Class117_Sub14_Sub1.method2953(10, 1002155545);
	}

	static void method1766(int var0, byte[] var1, Class88 var2, int var3) {
		Class117_Sub15 var4 = new Class117_Sub15();
		var4.anInt1898 = 0;
		var4.aLong1503 = (long) var0;
		var4.aByteArray1903 = var1;
		var4.aClass88_1899 = var2;
		Class120 var5 = Class107.aClass120_1198;
		synchronized (var5) {
			Class107.aClass120_1198.method1575(var4);
		}

		Class117_Sub22_Sub11.method2553(2032317630);
	}

}
