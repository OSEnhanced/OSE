package core.Jagex;
public class Class143 {

	byte aByte1645;
	public int anInt1643;
	public int anInt1644;
	public int anInt1647;
	public int anInt1646;
	public int anInt1642;

	public Class143(Class117_Sub14 var1, boolean var2) {
		aByte1645 = var1.method1997(1059674334);
		anInt1643 = var1.method2012(1053511631) * -1238855187;
		anInt1644 = var1.method2015((byte) 31) * 497051707;
		anInt1647 = var1.method2015((byte) 62) * 398283465;
		anInt1646 = var1.method2015((byte) 68) * -847549805;
		anInt1642 = var1.method2015((byte) 61) * -1166737051;
		if (var2) {
			method1771(Class78.method1070(var1, (byte) 0), (byte) -10);
		}

	}

	void method1771(Integer var1, byte var2) {
	}

	public int method1773(int var1) {
		return (aByte1645 & 8) == 8 ? 1 : 0;
	}

	void method1783(int var1, byte var2) {
		aByte1645 &= -8;
		aByte1645 = (byte) (aByte1645 | var1 & 7);
	}

	public Class143() {
	}

	void method1790(int var1, int var2) {
		aByte1645 &= -9;
		if (var1 == 1) {
			aByte1645 = (byte) (aByte1645 | 8);
		}

	}

	public int method1792(int var1) {
		return aByte1645 & 7;
	}

}
