package core.Jagex;
import java.awt.*;

public class Class117_Sub22_Sub18_Sub6 extends Class117_Sub22_Sub18 {

	static Font aFont2755;
	static int anInt2758;
	static final int anInt2761 = 37;
	static Class117_Sub22_Sub17_Sub3[] aClass117_Sub22_Sub17_Sub3Array2762;
	int anInt2759;
	int anInt2752;
	Class117_Sub22_Sub14 aClass117_Sub22_Sub14_2757;
	int anInt2763;
	int anInt2751;
	int anInt2753;
	int anInt2754;
	int anInt2760;
	int anInt2756;

	protected final Class117_Sub22_Sub18_Sub7 method2921(byte var1) {
		if (aClass117_Sub22_Sub14_2757 != null) {
			int var2 = GameClient.anInt2923 * -488599663 - anInt2759 * 2119990109;
			if (var2 > 100 && aClass117_Sub22_Sub14_2757.anInt2407 * 2095415527 > 0) {
				var2 = 100;
			}

			label62:
			{
				do {
					do {
						if (var2 <= aClass117_Sub22_Sub14_2757.anIntArray2405[anInt2752 * 1681420351]) {
							break label62;
						}

						var2 -= aClass117_Sub22_Sub14_2757.anIntArray2405[anInt2752 * 1681420351];
						anInt2752 -= 1198817345;
					} while (anInt2752 * 1681420351 < aClass117_Sub22_Sub14_2757.anIntArray2403.length);

					anInt2752 -= aClass117_Sub22_Sub14_2757.anInt2407 * 261801305;
				}
				while (anInt2752 * 1681420351 >= 0 && anInt2752 * 1681420351 < aClass117_Sub22_Sub14_2757.anIntArray2403.length);

				aClass117_Sub22_Sub14_2757 = null;
			}

			anInt2759 = (GameClient.anInt2923 * -488599663 - var2) * -226053899;
		}

		Class117_Sub22_Sub13 var13 = Class63.method928(anInt2763 * -115776623, 93188206);
		if (var13.anIntArray2387 != null) {
			var13 = var13.method2600(-1310653015);
		}

		if (var13 == null) {
			return null;
		} else {
			int var3;
			int var5;
			if (anInt2753 * 1323620455 != 1 && anInt2753 * 1323620455 != 3) {
				var3 = var13.anInt2346 * -1473224837;
				var5 = var13.anInt2396 * 817158555;
			} else {
				var3 = var13.anInt2396 * 817158555;
				var5 = var13.anInt2346 * -1473224837;
			}

			int var4 = (var3 >> 1) + anInt2760 * -1866243025;
			int var7 = (var3 + 1 >> 1) + anInt2760 * -1866243025;
			int var6 = (var5 >> 1) + anInt2756 * -2075834859;
			int var8 = anInt2756 * -2075834859 + (var5 + 1 >> 1);
			int[][] var9 = Class31.anIntArrayArrayArray381[anInt2754 * 762573613];
			int var10 = var9[var4][var8] + var9[var7][var6] + var9[var4][var6] + var9[var7][var8] >> 2;
			int var11 = (var3 << 6) + (anInt2760 * -1866243025 << 7);
			int var12 = (anInt2756 * -2075834859 << 7) + (var5 << 6);
			return var13.method2626(anInt2751 * -1131371717, anInt2753 * 1323620455, var9, var11, var10, var12, aClass117_Sub22_Sub14_2757, anInt2752 * 1681420351, -2007917756);
		}
	}

	static boolean method3356(Class117_Sub19 var0, int var1) {
		if (GameClient.aBool3072) {
			if (Class67.method961(var0, -2014828221) != 0) {
				return false;
			}

			if (var0.anInt1975 * 657737235 == 0) {
				return false;
			}
		}

		return var0.aBool1993;
	}

	Class117_Sub22_Sub18_Sub6(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Class117_Sub22_Sub18 var9) {
		anInt2763 = var1 * 37338481;
		anInt2751 = var2 * 1181761011;
		anInt2753 = var3 * 385663831;
		anInt2754 = var4 * -1269836635;
		anInt2760 = var5 * -1026006321;
		anInt2756 = var6 * -824354499;
		if (var7 != -1) {
			aClass117_Sub22_Sub14_2757 = Class114_Sub1.method1838(var7, (byte) -112);
			anInt2752 = 0;
			anInt2759 = GameClient.anInt2923 * -1149037115 + 226053899;
			if (aClass117_Sub22_Sub14_2757.anInt2416 * -1912420809 == 0 && var9 != null && var9 instanceof Class117_Sub22_Sub18_Sub6) {
				Class117_Sub22_Sub18_Sub6 var10 = (Class117_Sub22_Sub18_Sub6) var9;
				if (aClass117_Sub22_Sub14_2757 == var10.aClass117_Sub22_Sub14_2757) {
					anInt2752 = var10.anInt2752 * 1;
					anInt2759 = var10.anInt2759 * 1;
					return;
				}
			}

			if (var8 && aClass117_Sub22_Sub14_2757.anInt2407 * 2095415527 != -1) {
				anInt2752 = (int) (Math.random() * (double) aClass117_Sub22_Sub14_2757.anIntArray2403.length) * -1198817345;
				anInt2759 -= (int) (Math.random() * (double) aClass117_Sub22_Sub14_2757.anIntArray2405[anInt2752 * 1681420351]) * -226053899;
			}
		}

	}

	static void method3357(int var0, byte var1) {
		if (var0 == -3) {
			Class45.method740(Class108.aString1239, Class108.aString1427, Class108.aString1400, -1071789727);
		} else if (var0 == -2) {
			Class45.method740(Class108.aString1464, Class108.aString1243, Class108.aString1244, 499380225);
		} else if (var0 == -1) {
			Class45.method740(Class108.aString1245, Class108.aString1315, Class108.aString1265, -2000602275);
		} else if (var0 == 3) {
			Class45.method740(Class108.aString1349, Class108.aString1249, Class108.aString1250, 171138591);
		} else if (var0 == 4) {
			Class45.method740(Class108.aString1251, Class108.aString1252, Class108.aString1253, 1610355637);
		} else if (var0 == 5) {
			Class45.method740(Class108.aString1254, Class108.aString1255, Class108.aString1340, -280348993);
		} else if (var0 == 6) {
			Class45.method740(Class108.aString1257, Class108.aString1258, Class108.aString1259, -278625315);
		} else if (var0 == 7) {
			Class45.method740(Class108.aString1260, Class108.aString1261, Class108.aString1262, -408988952);
		} else if (var0 == 8) {
			Class45.method740(Class108.aString1248, Class108.aString1264, Class108.aString1452, -216928826);
		} else if (var0 == 9) {
			Class45.method740(Class108.aString1266, Class108.aString1267, Class108.aString1288, -1014279958);
		} else if (var0 == 10) {
			Class45.method740(Class108.aString1280, Class108.aString1270, Class108.aString1203, -1020637520);
		} else if (var0 == 11) {
			Class45.method740(Class108.aString1272, Class108.aString1296, Class108.aString1368, 1213563816);
		} else if (var0 == 12) {
			Class45.method740(Class108.aString1223, Class108.aString1276, Class108.aString1277, -55998729);
		} else if (var0 == 13) {
			Class45.method740(Class108.aString1278, Class108.aString1279, Class108.aString1378, 1623099114);
		} else if (var0 == 14) {
			Class45.method740(Class108.aString1281, Class108.aString1282, Class108.aString1283, -1308406046);
		} else if (var0 == 16) {
			Class45.method740(Class108.aString1284, Class108.aString1285, Class108.aString1354, 1895680174);
		} else if (var0 == 17) {
			Class45.method740(Class108.aString1287, Class108.aString1355, Class108.aString1289, -2088916871);
		} else if (var0 == 18) {
			Class45.method740(Class108.aString1219, Class108.aString1291, Class108.aString1409, -900966540);
		} else if (var0 == 19) {
			Class45.method740(Class108.aString1386, Class108.aString1294, Class108.aString1295, 221158989);
		} else if (var0 == 20) {
			Class45.method740(Class108.aString1273, Class108.aString1297, Class108.aString1298, 2137802135);
		} else if (var0 == 22) {
			Class45.method740(Class108.aString1201, Class108.aString1300, Class108.aString1301, -630907057);
		} else if (var0 == 23) {
			Class45.method740(Class108.aString1302, Class108.aString1303, Class108.aString1304, 21033360);
		} else if (var0 == 24) {
			Class45.method740(Class108.aString1305, Class108.aString1306, Class108.aString1307, -252590181);
		} else if (var0 == 25) {
			Class45.method740(Class108.aString1308, Class108.aString1309, Class108.aString1353, -1518238893);
		} else if (var0 == 26) {
			Class45.method740(Class108.aString1311, Class108.aString1312, Class108.aString1313, 1195468365);
		} else if (var0 == 27) {
			Class45.method740(Class108.aString1322, Class108.aString1323, Class108.aString1316, -1898713451);
		} else if (var0 == 31) {
			Class45.method740(Class108.aString1310, Class108.aString1324, Class108.aString1325, 596119624);
		} else if (var0 == 32) {
			Class45.method740(Class108.aString1426, Class108.aString1327, Class108.aString1328, -1305228767);
		} else if (var0 == 37) {
			Class45.method740(Class108.aString1329, Class108.aString1434, Class108.aString1331, 1431867411);
		} else if (var0 == 38) {
			Class45.method740(Class108.aString1359, Class108.aString1333, Class108.aString1210, -1905439706);
		} else if (var0 == 55) {
			Class45.method740(Class108.aString1335, Class108.aString1336, Class108.aString1337, 586220189);
		} else {
			if (var0 == 56) {
				Class45.method740(Class108.aString1338, Class108.aString1339, Class108.aString1360, -1935033459);
				Class117_Sub14_Sub1.method2953(11, 1536733374);
				return;
			}

			if (var0 == 57) {
				Class45.method740(Class108.aString1373, Class108.aString1342, Class108.aString1343, 490893589);
				Class117_Sub14_Sub1.method2953(11, 2056519887);
				return;
			}

			Class45.method740(Class108.aString1344, Class108.aString1345, Class108.aString1450, 831497790);
		}

		Class117_Sub14_Sub1.method2953(10, 1447794741);
	}

	static Class54 method3358(int var0, int var1, byte var2) {
		GameClient.aClass54_Sub1_2979.anInt736 = var0 * 1887216087;
		GameClient.aClass54_Sub1_2979.anInt728 = var1 * 978321035;
		GameClient.aClass54_Sub1_2979.anInt730 = -823208227;
		GameClient.aClass54_Sub1_2979.anInt731 = 935686419;
		return GameClient.aClass54_Sub1_2979;
	}

	static void method3359(int var0, int var1, int var2, int var3, Class117_Sub22_Sub17_Sub3 var4, Class117_Sub22_Sub21 var5, byte var6) {
		int var7 = var3 * var3 + var2 * var2;
		if (var7 > 4225 && var7 < 90000) {
			int var11 = GameClient.anInt2990 * -1810209603 + GameClient.anInt3005 * -1204229987 & 2047;
			int var12 = Class117_Sub22_Sub17_Sub1.anIntArray2653[var11];
			int var14 = Class117_Sub22_Sub17_Sub1.anIntArray2654[var11];
			var12 = var12 * 256 / (GameClient.anInt3202 * 138652733 + 256);
			var14 = var14 * 256 / (GameClient.anInt3202 * 138652733 + 256);
			int var16 = var12 * var3 + var2 * var14 >> 16;
			int var15 = var14 * var3 - var12 * var2 >> 16;
			double var8 = Math.atan2((double) var16, (double) var15);
			int var13 = (int) (Math.sin(var8) * 63.0D);
			int var10 = (int) (Math.cos(var8) * 57.0D);
			Class125.aClass117_Sub22_Sub17_Sub3_1549.method3267(4 + var0 + 94 + var13 - 10, var1 + 83 - var10 - 20, 20, 20, 15, 15, var8, 256);
		} else {
			Class117_Sub22_Sub16.method2860(var0, var1, var2, var3, var4, var5, -2066564737);
		}

	}

	static void method3360(byte var0) {
		Class117_Sub12.aClass127_1862 = new Class127(32);
	}

	public static Class117_Sub22_Sub9 method3361(int var0, int var1) {
		Class117_Sub22_Sub9 var2 = (Class117_Sub22_Sub9) Class117_Sub22_Sub9.aClass115_2293.method1515((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Class139.aClass106_1624.method1380(1, var0, (byte) 127);
			var2 = new Class117_Sub22_Sub9();
			if (var3 != null) {
				var2.method2495(new Class117_Sub14(var3), var0, (short) 12957);
			}

			var2.method2506((byte) -56);
			Class117_Sub22_Sub9.aClass115_2293.method1517(var2, (long) var0);
			return var2;
		}
	}

}
