package core.Jagex;
import java.util.zip.CRC32;

public class Class106_Sub1 extends Class106 {

	volatile boolean aBool1907 = false;
	int anInt1904;
	int anInt1912;
	volatile boolean[] aBoolArray1909;
	int anInt1906 = 205543293;
	static CRC32 aCRC32_1910 = new CRC32();
	boolean aBool1911 = false;
	Class88 aClass88_1908;
	Class88 aClass88_1913;
	int anInt1905;

	void method1466(int var1, int var2) {
		int var3 = anInt1905 * -762778127;
		long var4 = (long) ((var3 << 16) + var1);
		Class117_Sub22_Sub20 var6 = (Class117_Sub22_Sub20) Class96.aClass127_1113.method1675(var4);
		if (var6 != null) {
			Class96.aClass119_1114.method1556(var6);
		}

	}

	void method2223(Class88 var1, int var2, byte[] var3, boolean var4, byte var5) {
		int var6;
		if (var1 == aClass88_1913) {
			if (aBool1907) {
				throw new RuntimeException();
			}

			if (var3 == null) {
				Class117_Sub22_Sub14.method2672(this, 255, anInt1905 * -762778127, anInt1904 * 600301779, (byte) 0, true, -1043522736);
				return;
			}

			aCRC32_1910.reset();
			aCRC32_1910.update(var3, 0, var3.length);
			var6 = (int) aCRC32_1910.getValue();
			Class117_Sub14 var10 = new Class117_Sub14(Class28.method416(var3, 1067534235));
			int var8 = var10.method2010(-1439707937);
			if (var8 != 5 && var8 != 6) {
				throw new RuntimeException(var8 + "," + anInt1905 * -762778127 + "," + var2);
			}

			int var9 = 0;
			if (var8 >= 6) {
				var9 = var10.method2015((byte) 33);
			}

			if (anInt1904 * 600301779 != var6 || var9 != anInt1912 * -1981812917) {
				Class117_Sub22_Sub14.method2672(this, 255, anInt1905 * -762778127, anInt1904 * 600301779, (byte) 0, true, -1043522736);
				return;
			}

			method1395(var3, -1252004375);
			method2227((byte) 75);
		} else {
			if (!var4 && var2 == anInt1906 * -2036079061) {
				aBool1907 = true;
			}

			if (var3 == null || var3.length <= 2) {
				aBoolArray1909[var2] = false;
				if (aBool1911 || var4) {
					Class117_Sub22_Sub14.method2672(this, anInt1905 * -762778127, var2, anIntArray1178[var2], (byte) 2, var4, -1043522736);
				}

				return;
			}

			aCRC32_1910.reset();
			aCRC32_1910.update(var3, 0, var3.length - 2);
			var6 = (int) aCRC32_1910.getValue();
			int var7 = (var3[var3.length - 1] & 255) + ((var3[var3.length - 2] & 255) << 8);
			if (var6 != anIntArray1178[var2] || anIntArray1191[var2] != var7) {
				aBoolArray1909[var2] = false;
				if (aBool1911 || var4) {
					Class117_Sub22_Sub14.method2672(this, anInt1905 * -762778127, var2, anIntArray1178[var2], (byte) 2, var4, -1043522736);
				}

				return;
			}

			aBoolArray1909[var2] = true;
			if (var4) {
				anObjectArray1184[var2] = Class3.method67(var3, false, -2129627546);
			}
		}

	}

	void method1387(int var1, int var2) {
		if (aClass88_1908 != null && aBoolArray1909 != null && aBoolArray1909[var1]) {
			Class88 var3 = aClass88_1908;
			byte[] var5 = null;
			Class120 var6 = Class107.aClass120_1198;
			synchronized (var6) {
				for (Class117_Sub15 var7 = (Class117_Sub15) Class107.aClass120_1198.method1577(); var7 != null; var7 = (Class117_Sub15) Class107.aClass120_1198.method1582()) {
					if (var7.aLong1503 == (long) var1 && var3 == var7.aClass88_1899 && var7.anInt1898 * 163716151 == 0) {
						var5 = var7.aByteArray1903;
						break;
					}
				}
			}

			if (var5 != null) {
				method2223(var3, var1, var5, true, (byte) 11);
			} else {
				byte[] var10 = var3.method1145(var1, -787682835);
				method2223(var3, var1, var10, true, (byte) 34);
			}
		} else {
			Class117_Sub22_Sub14.method2672(this, anInt1905 * -762778127, var1, anIntArray1178[var1], (byte) 2, true, -1043522736);
		}

	}

	void method2224(int var1, int var2, byte var3) {
		anInt1904 = var1 * 422279003;
		anInt1912 = var2 * -632577437;
		if (aClass88_1913 != null) {
			int var4 = anInt1905 * -762778127;
			Class88 var5 = aClass88_1913;
			byte[] var7 = null;
			Class120 var8 = Class107.aClass120_1198;
			synchronized (var8) {
				for (Class117_Sub15 var9 = (Class117_Sub15) Class107.aClass120_1198.method1577(); var9 != null; var9 = (Class117_Sub15) Class107.aClass120_1198.method1582()) {
					if ((long) var4 == var9.aLong1503 && var9.aClass88_1899 == var5 && var9.anInt1898 * 163716151 == 0) {
						var7 = var9.aByteArray1903;
						break;
					}
				}
			}

			if (var7 != null) {
				method2223(var5, var4, var7, true, (byte) -16);
			} else {
				byte[] var12 = var5.method1145(var4, -1117418901);
				method2223(var5, var4, var12, true, (byte) -33);
			}
		} else {
			Class117_Sub22_Sub14.method2672(this, 255, anInt1905 * -762778127, anInt1904 * 600301779, (byte) 0, true, -1043522736);
		}

	}

	void method2225(int var1, byte[] var2, boolean var3, boolean var4, int var5) {
		if (var3) {
			if (aBool1907) {
				throw new RuntimeException();
			}

			if (aClass88_1913 != null) {
				Class140.method1766(anInt1905 * -762778127, var2, aClass88_1913, 2122626816);
			}

			method1395(var2, -1624398624);
			method2227((byte) -21);
		} else {
			var2[var2.length - 2] = (byte) (anIntArray1191[var1] >> 8);
			var2[var2.length - 1] = (byte) anIntArray1191[var1];
			if (aClass88_1908 != null) {
				Class140.method1766(var1, var2, aClass88_1908, 2136871524);
				aBoolArray1909[var1] = true;
			}

			if (var4) {
				anObjectArray1184[var1] = Class3.method67(var2, false, -2144408111);
			}
		}

	}

	void method2227(byte var1) {
		aBoolArray1909 = new boolean[anObjectArray1184.length];

		int var2;
		for (var2 = 0; var2 < aBoolArray1909.length; var2++) {
			aBoolArray1909[var2] = false;
		}

		if (aClass88_1908 == null) {
			aBool1907 = true;
		} else {
			anInt1906 = 205543293;

			for (var2 = 0; var2 < aBoolArray1909.length; var2++) {
				if (anIntArray1180[var2] > 0) {
					Class28.method417(var2, aClass88_1908, this, (short) 20715);
					anInt1906 = var2 * -205543293;
				}
			}

			if (anInt1906 * -2036079061 == -1) {
				aBool1907 = true;
			}

		}
	}

	int method2228(int var1, int var2) {
		return anObjectArray1184[var1] != null ? 100 : (aBoolArray1909[var1] ? 100 : Class117_Sub10.method1972(anInt1905 * -762778127, var1, -1180072431));
	}

	public int method2230(int var1) {
		int var2 = 0;
		int var3 = 0;

		int var4;
		for (var4 = 0; var4 < anObjectArray1184.length; var4++) {
			if (anIntArray1180[var4] > 0) {
				var2 += 100;
				var3 += method2228(var4, -757972796);
			}
		}

		if (var2 == 0) {
			return 100;
		} else {
			var4 = var3 * 100 / var2;
			return var4;
		}
	}

	public int method2231(int var1) {
		if (aBool1907) {
			return 100;
		} else if (anObjectArray1184 == null) {
			int var2 = Class117_Sub10.method1972(255, anInt1905 * -762778127, -841651286);
			if (var2 >= 100) {
				var2 = 99;
			}

			return var2;
		} else {
			return 99;
		}
	}

	public Class106_Sub1(Class88 var1, Class88 var2, int var3, boolean var4, boolean var5, boolean var6) {
		super(var4, var5);
		aClass88_1908 = var1;
		aClass88_1913 = var2;
		anInt1905 = var3 * 1260675857;
		aBool1911 = var6;
		int var7 = anInt1905 * -762778127;
		if (Class87.aClass117_Sub14_1021 != null) {
			Class87.aClass117_Sub14_1021.anInt1880 = var7 * 546129032 - 1806153003;
			int var10 = Class87.aClass117_Sub14_1021.method2015((byte) 109);
			int var9 = Class87.aClass117_Sub14_1021.method2015((byte) 87);
			method2224(var10, var9, (byte) 115);
		} else {
			Class117_Sub22_Sub14.method2672((Class106_Sub1) null, 255, 255, 0, (byte) 0, true, -1043522736);
			Class96.aClass106_Sub1Array1122[var7] = this;
		}

	}

	static void method2244(int var0, byte var1) {
		if (var0 == -1 && !GameClient.aBool3158) {
			Class121.aClass117_Sub2_Sub4_1514.method2980((byte) -30);
			Class121.anInt1515 = -793599395;
			Class54_Sub1.aClass106_1728 = null;
		} else if (var0 != -1 && var0 != GameClient.anInt3021 * 1034748741 && GameClient.anInt3156 * 206554627 != 0 && !GameClient.aBool3158) {
			Class106_Sub1 var3 = Class57.aClass106_Sub1_749;
			int var2 = GameClient.anInt3156 * 206554627;
			Class121.anInt1515 = -793599395;
			Class54_Sub1.aClass106_1728 = var3;
			Class117_Sub11.anInt1851 = var0 * 366489035;
			Class117_Sub22_Sub18_Sub2.anInt2605 = 0;
			Class138.anInt1620 = var2 * 1436582997;
			Class82.aBool972 = false;
			Class39.anInt488 = 123400454;
		}

		GameClient.anInt3021 = var0 * 207755149;
	}

	static void method2248(int var0, int var1, int var2, int var3, int var4) {
		Class117_Sub12 var5 = (Class117_Sub12) Class117_Sub12.aClass127_1862.method1675((long) var0);
		if (var5 == null) {
			var5 = new Class117_Sub12();
			Class117_Sub12.aClass127_1862.method1666(var5, (long) var0);
		}

		if (var5.anIntArray1855.length <= var1) {
			int[] var6 = new int[var1 + 1];
			int[] var8 = new int[var1 + 1];

			int var7;
			for (var7 = 0; var7 < var5.anIntArray1855.length; var7++) {
				var6[var7] = var5.anIntArray1855[var7];
				var8[var7] = var5.anIntArray1856[var7];
			}

			for (var7 = var5.anIntArray1855.length; var7 < var1; var7++) {
				var6[var7] = -1;
				var8[var7] = 0;
			}

			var5.anIntArray1855 = var6;
			var5.anIntArray1856 = var8;
		}

		var5.anIntArray1855[var1] = var2;
		var5.anIntArray1856[var1] = var3;
	}

	static void method2250(int var0, byte var1) {
		if (Class4.method85(var0, 964901725)) {
			Class117_Sub19[] var2 = Class117_Sub19.aClass117_Sub19ArrayArray2032[var0];

			for (int var3 = 0; var3 < var2.length; var3++) {
				Class117_Sub19 var4 = var2[var3];
				if (var4 != null) {
					var4.anInt2082 = 0;
					var4.anInt2101 = 0;
				}
			}

		}
	}

}
