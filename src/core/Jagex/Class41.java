package core.Jagex;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

public class Class41 {

	static int[] anIntArray515;
	public static final int anInt516 = 241;
	static final int anInt517 = 4;
	static Class72 aClass72_518;
	DataInputStream aDataInputStream509;
	int anInt512;
	int anInt511;
	byte[] aByteArray508;
	int anInt513;
	byte[] aByteArray510 = new byte[4];
	Class72 aClass72_507;
	long aLong514;

	byte[] method531(int var1) throws IOException {
		if (Class47.method774(1158181864) > aLong514 * -7168989382739278237L) {
			throw new IOException();
		} else {
			if (anInt512 * 1061835063 == 0) {
				if (aClass72_507.anInt870 == 2) {
					throw new IOException();
				}

				if (aClass72_507.anInt870 == 1) {
					aDataInputStream509 = (DataInputStream) aClass72_507.anObject874;
					anInt512 = -1691339641;
				}
			}

			int var2;
			if (anInt512 * 1061835063 == 1) {
				var2 = aDataInputStream509.available();
				if (var2 > 0) {
					if (anInt511 * -1324072213 + var2 > 4) {
						var2 = 4 - anInt511 * -1324072213;
					}

					anInt511 += aDataInputStream509.read(aByteArray510, anInt511 * -1324072213, var2) * 969627075;
					if (anInt511 * -1324072213 == 4) {
						int var3 = (new Class117_Sub14(aByteArray510)).method2015((byte) 50);
						aByteArray508 = new byte[var3];
						anInt512 = 912288014;
					}
				}
			}

			if (anInt512 * 1061835063 == 2) {
				var2 = aDataInputStream509.available();
				if (var2 > 0) {
					if (var2 + anInt513 * 382113875 > aByteArray508.length) {
						var2 = aByteArray508.length - anInt513 * 382113875;
					}

					anInt513 += aDataInputStream509.read(aByteArray508, anInt513 * 382113875, var2) * -777294885;
					if (anInt513 * 382113875 == aByteArray508.length) {
						return aByteArray508;
					}
				}
			}

			return null;
		}
	}

	static void method534(int var0, int var1, int var2) {
		Class120 var3 = GameClient.aClass120ArrayArrayArray3051[Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421][var0][var1];
		if (var3 == null) {
			Class117_Sub13.aClass42_1875.method560(Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, var0, var1);
		} else {
			long var8 = -99999999L;
			Class117_Sub22_Sub18_Sub2 var10 = null;

			Class117_Sub22_Sub18_Sub2 var7;
			for (var7 = (Class117_Sub22_Sub18_Sub2) var3.method1577(); var7 != null; var7 = (Class117_Sub22_Sub18_Sub2) var3.method1582()) {
				Class117_Sub22_Sub6 var4 = Class117_Sub13.method1992(var7.anInt2607 * -604636939, 1360153723);
				long var5 = (long) (var4.anInt2257 * 453407725);
				if (var4.anInt2222 * -1106690991 == 1) {
					var5 *= (long) (1 + var7.anInt2608 * -493046193);
				}

				if (var5 > var8) {
					var8 = var5;
					var10 = var7;
				}
			}

			if (var10 == null) {
				Class117_Sub13.aClass42_1875.method560(Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, var0, var1);
			} else {
				var3.method1587(var10);
				Class117_Sub22_Sub18_Sub2 var13 = null;
				Class117_Sub22_Sub18_Sub2 var11 = null;

				for (var7 = (Class117_Sub22_Sub18_Sub2) var3.method1577(); var7 != null; var7 = (Class117_Sub22_Sub18_Sub2) var3.method1582()) {
					if (var7.anInt2607 * -604636939 != var10.anInt2607 * -604636939) {
						if (var13 == null) {
							var13 = var7;
						}

						if (var13.anInt2607 * -604636939 != var7.anInt2607 * -604636939 && var11 == null) {
							var11 = var7;
						}
					}
				}

				int var12 = (var1 << 7) + var0 + 1610612736;
				Class117_Sub13.aClass42_1875.method546(Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, var0, var1, Class44.method729(64 + var0 * 128, 64 + var1 * 128, Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, 1437452617), var10, var12, var13, var11);
			}
		}
	}

	Class41(Class77 var1, URL var2) {
		aClass72_507 = var1.method1049(var2, 781184477);
		anInt512 = 0;
		aLong514 = (Class47.method774(-261298066) + 30000L) * -6382432662674379957L;
	}

	static void method536(Class117_Sub10 var0, boolean var1, int var2) {
		int var3 = var0.anInt1831 * -2090327687;
		int var5 = (int) var0.aLong1503;
		var0.method1532();
		if (var1) {
			Class52.method821(var3, (byte) 8);
		}

		for (Class117_Sub20 var4 = (Class117_Sub20) GameClient.aClass127_3053.method1668(); var4 != null; var4 = (Class117_Sub20) GameClient.aClass127_3053.method1669()) {
			if ((var4.aLong1503 >> 48 & 65535L) == (long) var3) {
				var4.method1532();
			}
		}

		Class117_Sub19 var6 = Class74.method1010(var5, -1406684453);
		if (var6 != null) {
			Class54.method850(var6, (byte) 0);
		}

		Class80.method1082(-574043343);
		if (GameClient.anInt3036 * -1635287017 != -1) {
			Class117_Sub22_Sub18_Sub1_Sub2.method3543(GameClient.anInt3036 * -1635287017, 1, -1402262303);
		}

	}

	static void method537(Class117_Sub19[] var0, int var1, int var2, int var3, boolean var4, byte var5) {
		for (int var6 = 0; var6 < var0.length; var6++) {
			Class117_Sub19 var7 = var0[var6];
			if (var7 != null && var7.anInt2027 * 1264631563 == var1) {
				Class63.method929(var7, var2, var3, var4, -1452580680);
				Class45.method739(var7, var2, var3, (byte) 14);
				if (var7.anInt1994 * 17552373 > var7.anInt1996 * -825850981 - var7.anInt1988 * 1854643179) {
					var7.anInt1994 = var7.anInt1996 * -1549152433 - var7.anInt1988 * 1568908383;
				}

				if (var7.anInt1994 * 17552373 < 0) {
					var7.anInt1994 = 0;
				}

				if (var7.anInt2060 * -400020749 > var7.anInt1997 * 1348115267 - var7.anInt1989 * 2747837) {
					var7.anInt2060 = var7.anInt1997 * 1602175601 - var7.anInt1989 * -1577430897;
				}

				if (var7.anInt2060 * -400020749 < 0) {
					var7.anInt2060 = 0;
				}

				if (var7.anInt1975 * 657737235 == 0) {
					Class95.method1245(var0, var7, var4, (byte) 4);
				}
			}
		}

	}

}
