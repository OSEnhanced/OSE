package core.Jagex;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class Class43 {

	String aString581;
	static final int anInt582 = 39;
	static int[] anIntArray583;
	static final int anInt584 = 19136830;
	static final int anInt585 = 16384;
	static final int anInt586 = 23;
	public static final int anInt587 = 107;
	String aString588;
	public static final int anInt589 = 170;

	static void method723(int var0, int var1, int var2) {
		int[] var3 = new int[4];
		int[] var5 = new int[4];
		var3[0] = var0;
		var5[0] = var1;
		int var6 = 1;

		for (int var4 = 0; var4 < 4; var4++) {
			if (var0 != Class24.anIntArray297[var4]) {
				var3[var6] = Class24.anIntArray297[var4];
				var5[var6] = Class24.anIntArray304[var4];
				++var6;
			}
		}

		Class24.anIntArray297 = var3;
		Class24.anIntArray304 = var5;
		Class117_Sub22_Sub2.method2363(Class24.aClass24Array290, 0, Class24.aClass24Array290.length - 1, Class24.anIntArray297, Class24.anIntArray304, -1146938527);
	}

	static void method724(int var0, int var1, int var2) {
		if (var0 != Class26.anInt328 * -30073211 || Class117_Sub21.anInt2110 * 1216336807 != var1) {
			Class26.anInt328 = var0 * 540289613;
			Class117_Sub21.anInt2110 = var1 * -1857313769;
			Class117_Sub14_Sub1.method2953(25, 1242658381);
			Class117_Sub22_Sub12.method2586(Class108.aString1209, true, (byte) -41);
			int var8 = Class117_Sub22_Sub20.anInt2497 * 544615727;
			int var10 = Class117_Sub22_Sub19.anInt2468 * -771797447;
			Class117_Sub22_Sub20.anInt2497 = (var0 - 6) * -1980641672;
			Class117_Sub22_Sub19.anInt2468 = (var1 - 6) * -238944184;
			int var9 = Class117_Sub22_Sub20.anInt2497 * 544615727 - var8;
			int var6 = Class117_Sub22_Sub19.anInt2468 * -771797447 - var10;
			var8 = Class117_Sub22_Sub20.anInt2497 * 544615727;
			var10 = Class117_Sub22_Sub19.anInt2468 * -771797447;

			int var12;
			int var14;
			for (var12 = 0; var12 < 32768; var12++) {
				Class117_Sub22_Sub18_Sub1_Sub1 var13 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[var12];
				if (var13 != null) {
					for (var14 = 0; var14 < 10; var14++) {
						var13.anIntArray2594[var14] -= var9;
						var13.anIntArray2541[var14] -= var6;
					}

					var13.anInt2577 -= var9 * -1238225024;
					var13.anInt2567 -= var6 * -243062400;
				}
			}

			for (var12 = 0; var12 < 2048; var12++) {
				Class117_Sub22_Sub18_Sub1_Sub2 var20 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var12];
				if (var20 != null) {
					for (var14 = 0; var14 < 10; var14++) {
						var20.anIntArray2594[var14] -= var9;
						var20.anIntArray2541[var14] -= var6;
					}

					var20.anInt2577 -= var9 * -1238225024;
					var20.anInt2567 -= var6 * -243062400;
				}
			}

			byte var19 = 0;
			byte var21 = 104;
			byte var22 = 1;
			if (var9 < 0) {
				var19 = 103;
				var21 = -1;
				var22 = -1;
			}

			byte var15 = 0;
			byte var3 = 104;
			byte var4 = 1;
			if (var6 < 0) {
				var15 = 103;
				var3 = -1;
				var4 = -1;
			}

			int var5;
			for (int var11 = var19; var11 != var21; var11 += var22) {
				for (var5 = var15; var5 != var3; var5 += var4) {
					int var17 = var9 + var11;
					int var7 = var5 + var6;

					for (int var16 = 0; var16 < 4; var16++) {
						if (var17 >= 0 && var7 >= 0 && var17 < 104 && var7 < 104) {
							GameClient.aClass120ArrayArrayArray3051[var16][var11][var5] = GameClient.aClass120ArrayArrayArray3051[var16][var17][var7];
						} else {
							GameClient.aClass120ArrayArrayArray3051[var16][var11][var5] = null;
						}
					}
				}
			}

			for (Class117_Sub9 var18 = (Class117_Sub9) GameClient.aClass120_3052.method1577(); var18 != null; var18 = (Class117_Sub9) GameClient.aClass120_3052.method1582()) {
				var18.anInt1810 -= var9 * -829690057;
				var18.anInt1811 -= var6 * 308152981;
				if (var18.anInt1810 * 358282887 < 0 || var18.anInt1811 * -2131922755 < 0 || var18.anInt1810 * 358282887 >= 104 || var18.anInt1811 * -2131922755 >= 104) {
					var18.method1532();
				}
			}

			if (GameClient.anInt3153 * -140834255 != 0) {
				GameClient.anInt3153 -= var9 * 1748897489;
				GameClient.anInt3154 -= var6 * -2025568851;
			}

			GameClient.anInt3162 = 0;
			GameClient.aBool3168 = false;
			GameClient.anInt3160 = -42975717;
			GameClient.aClass120_3054.method1574();
			GameClient.aClass120_3186.method1574();

			for (var5 = 0; var5 < 4; var5++) {
				GameClient.aClass51Array3174[var5].method776(2078327660);
			}

		}
	}

	static void method725(int var0) {
		Class6.aString75 = Class6.aString75.trim();
		if (Class6.aString75.length() == 0) {
			Class45.method740(Class108.aString1442, Class108.aString1443, Class108.aString1428, 308462459);
		} else {
			long var7;
			try {
				URL var1 = new URL(Class117_Sub22_Sub12.method2588("services", false, -1664208803) + "m=accountappeal/login.ws");
				URLConnection var2 = var1.openConnection();
				var2.setRequestProperty("connection", "close");
				var2.setDoInput(true);
				var2.setDoOutput(true);
				var2.setConnectTimeout(5000);
				OutputStreamWriter var3 = new OutputStreamWriter(var2.getOutputStream());
				var3.write("data1=req");
				var3.flush();
				InputStream var4 = var2.getInputStream();
				Class117_Sub14 var5 = new Class117_Sub14(new byte[1000]);

				while (true) {
					int var6 = var4.read(var5.aByteArray1885, var5.anInt1880 * 561453169, 1000 - var5.anInt1880 * 561453169);
					if (var6 == -1) {
						var5.anInt1880 = 0;
						long var9 = var5.method2016(-1273836113);
						var7 = var9;
						break;
					}

					var5.anInt1880 += var6 * -2079217519;
					if (var5.anInt1880 * 561453169 >= 1000) {
						var7 = 0L;
						break;
					}
				}
			} catch (Exception var14) {
				var7 = 0L;
			}

			int var13;
			if (var7 == 0L) {
				var13 = 5;
			} else {
				var13 = Class51.method797(var7, Class6.aString75, -1708320320);
			}

			switch (var13) {
				case 2:
					Class45.method740(Class108.aString1445, Class108.aString1379, Class108.aString1408, -1976420967);
					Class6.anInt57 = -2005171602;
					break;
				case 3:
					Class45.method740(Class108.aString1448, Class108.aString1449, Class108.aString1207, 367733046);
					break;
				case 4:
					Class45.method740(Class108.aString1451, Class108.aString1439, Class108.aString1453, 720058265);
					break;
				case 5:
					Class45.method740(Class108.aString1454, Class108.aString1455, Class108.aString1456, -1136832658);
					break;
				case 6:
					Class45.method740(Class108.aString1457, Class108.aString1458, Class108.aString1416, -2134748581);
					break;
				case 7:
					Class45.method740(Class108.aString1460, Class108.aString1461, Class108.aString1462, 351195625);
			}

		}
	}

	static void method726(int var0) {
		for (Class117_Sub10 var1 = (Class117_Sub10) GameClient.aClass127_3080.method1668(); var1 != null; var1 = (Class117_Sub10) GameClient.aClass127_3080.method1669()) {
			int var2 = var1.anInt1831 * -2090327687;
			if (Class4.method85(var2, 1300285665)) {
				boolean var3 = true;
				Class117_Sub19[] var4 = Class117_Sub19.aClass117_Sub19ArrayArray2032[var2];

				int var5;
				for (var5 = 0; var5 < var4.length; var5++) {
					if (var4[var5] != null) {
						var3 = var4[var5].aBool2061;
						break;
					}
				}

				if (!var3) {
					var5 = (int) var1.aLong1503;
					Class117_Sub19 var6 = Class74.method1010(var5, -1278525738);
					if (var6 != null) {
						Class54.method850(var6, (byte) 0);
					}
				}
			}
		}

	}

}
