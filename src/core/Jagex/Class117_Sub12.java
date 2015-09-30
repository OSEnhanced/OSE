package core.Jagex;
import java.io.DataInputStream;
import java.net.URL;

public class Class117_Sub12 extends Class117 {

	static int anInt1854;
	static final int anInt1857 = 6;
	static Class141 aClass141_1858;
	public static final int anInt1859 = 19136896;
	public static final int anInt1860 = 5;
	static final String aString1861 = "random.dat";
	static final int anInt1863 = 43;
	static Class127 aClass127_1862 = new Class127(32);
	int[] anIntArray1855 = new int[]{-1};
	int[] anIntArray1856 = new int[]{0};

	static void method1977(int var0, int var1, int var2, int var3, String var4, int var5) {
		Class117_Sub19 var6 = Class23.method368(var1, var2, 1371262819);
		if (var6 != null) {
			if (var6.anObjectArray2071 != null) {
				Class117_Sub7 var7 = new Class117_Sub7();
				var7.aClass117_Sub19_1780 = var6;
				var7.anInt1783 = var0 * 1508948697;
				var7.aString1778 = var4;
				var7.anObjectArray1786 = var6.anObjectArray2071;
				Class57.method867(var7, 200000, -542281141);
			}

			boolean var11 = true;
			if (var6.anInt2018 * 2064823433 > 0) {
				var11 = Class56.method853(var6, -1456435);
			}

			if (var11) {
				int var8 = Class67.method961(var6, 1113379400);
				int var9 = var0 - 1;
				boolean var10 = (var8 >> 1 + var9 & 1) != 0;
				if (var10) {
					if (var0 == 1) {
						GameClient.aClass117_Sub14_Sub1_2961.method2932(13, 609359895);
						GameClient.aClass117_Sub14_Sub1_2961.method2183(var1, (byte) 80);
						GameClient.aClass117_Sub14_Sub1_2961.method1996(var2, (byte) -41);
						GameClient.aClass117_Sub14_Sub1_2961.method1996(var3, (byte) -107);
					}

					if (var0 == 2) {
						GameClient.aClass117_Sub14_Sub1_2961.method2932(80, 1503291511);
						GameClient.aClass117_Sub14_Sub1_2961.method2183(var1, (byte) 16);
						GameClient.aClass117_Sub14_Sub1_2961.method1996(var2, (byte) -63);
						GameClient.aClass117_Sub14_Sub1_2961.method1996(var3, (byte) -123);
					}

					if (var0 == 3) {
						GameClient.aClass117_Sub14_Sub1_2961.method2932(81, 1375903305);
						GameClient.aClass117_Sub14_Sub1_2961.method2183(var1, (byte) 30);
						GameClient.aClass117_Sub14_Sub1_2961.method1996(var2, (byte) -52);
						GameClient.aClass117_Sub14_Sub1_2961.method1996(var3, (byte) -118);
					}

					if (var0 == 4) {
						GameClient.aClass117_Sub14_Sub1_2961.method2932(191, 1301905450);
						GameClient.aClass117_Sub14_Sub1_2961.method2183(var1, (byte) 51);
						GameClient.aClass117_Sub14_Sub1_2961.method1996(var2, (byte) -22);
						GameClient.aClass117_Sub14_Sub1_2961.method1996(var3, (byte) -118);
					}

					if (var0 == 5) {
						GameClient.aClass117_Sub14_Sub1_2961.method2932(120, 2117725392);
						GameClient.aClass117_Sub14_Sub1_2961.method2183(var1, (byte) 43);
						GameClient.aClass117_Sub14_Sub1_2961.method1996(var2, (byte) -83);
						GameClient.aClass117_Sub14_Sub1_2961.method1996(var3, (byte) -48);
					}

					if (var0 == 6) {
						GameClient.aClass117_Sub14_Sub1_2961.method2932(122, 1672418805);
						GameClient.aClass117_Sub14_Sub1_2961.method2183(var1, (byte) 41);
						GameClient.aClass117_Sub14_Sub1_2961.method1996(var2, (byte) -89);
						GameClient.aClass117_Sub14_Sub1_2961.method1996(var3, (byte) -124);
					}

					if (var0 == 7) {
						GameClient.aClass117_Sub14_Sub1_2961.method2932(192, 1790257010);
						GameClient.aClass117_Sub14_Sub1_2961.method2183(var1, (byte) 20);
						GameClient.aClass117_Sub14_Sub1_2961.method1996(var2, (byte) -43);
						GameClient.aClass117_Sub14_Sub1_2961.method1996(var3, (byte) -125);
					}

					if (var0 == 8) {
						GameClient.aClass117_Sub14_Sub1_2961.method2932(90, 2079463804);
						GameClient.aClass117_Sub14_Sub1_2961.method2183(var1, (byte) 81);
						GameClient.aClass117_Sub14_Sub1_2961.method1996(var2, (byte) -59);
						GameClient.aClass117_Sub14_Sub1_2961.method1996(var3, (byte) -117);
					}

					if (var0 == 9) {
						GameClient.aClass117_Sub14_Sub1_2961.method2932(245, 1930592307);
						GameClient.aClass117_Sub14_Sub1_2961.method2183(var1, (byte) 10);
						GameClient.aClass117_Sub14_Sub1_2961.method1996(var2, (byte) -113);
						GameClient.aClass117_Sub14_Sub1_2961.method1996(var3, (byte) -7);
					}

					if (var0 == 10) {
						GameClient.aClass117_Sub14_Sub1_2961.method2932(64, 1394153615);
						GameClient.aClass117_Sub14_Sub1_2961.method2183(var1, (byte) 87);
						GameClient.aClass117_Sub14_Sub1_2961.method1996(var2, (byte) 7);
						GameClient.aClass117_Sub14_Sub1_2961.method1996(var3, (byte) -37);
					}

				}
			}
		}
	}

	static void method1982(int var0, int var1, int var2, int var3, boolean var4, short var5) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var7 = var3 - 334;
		if (var7 < 0) {
			var7 = 0;
		} else if (var7 > 100) {
			var7 = 100;
		}

		int var9 = GameClient.aShort3105 + (GameClient.aShort3175 - GameClient.aShort3105) * var7 / 100;
		int var12 = var3 * var9 * 512 / (var2 * 334);
		int var8;
		int var13;
		short var16;
		if (var12 < GameClient.aShort2955) {
			var16 = GameClient.aShort2955;
			var9 = var16 * var2 * 334 / (var3 * 512);
			if (var9 > GameClient.aShort3094) {
				var9 = GameClient.aShort3094;
				var13 = var9 * var3 * 512 / (var16 * 334);
				var8 = (var2 - var13) / 2;
				if (var4) {
					Class117_Sub22_Sub17.method2863();
					Class117_Sub22_Sub17.method2877(var0, var1, var8, var3, -16777216);
					Class117_Sub22_Sub17.method2877(var0 + var2 - var8, var1, var8, var3, -16777216);
				}

				var0 += var8;
				var2 -= var8 * 2;
			}
		} else if (var12 > GameClient.aShort3181) {
			var16 = GameClient.aShort3181;
			var9 = var2 * var16 * 334 / (var3 * 512);
			if (var9 < GameClient.aShort3178) {
				var9 = GameClient.aShort3178;
				var13 = var16 * var2 * 334 / (var9 * 512);
				var8 = (var3 - var13) / 2;
				if (var4) {
					Class117_Sub22_Sub17.method2863();
					Class117_Sub22_Sub17.method2877(var0, var1, var2, var8, -16777216);
					Class117_Sub22_Sub17.method2877(var0, var3 + var1 - var8, var2, var8, -16777216);
				}

				var1 += var8;
				var3 -= var8 * 2;
			}
		}

		var13 = (GameClient.aShort3177 - GameClient.aShort3176) * var7 / 100 + GameClient.aShort3176;
		GameClient.anInt2944 = (var13 * var3 * var9 / 85504 << 1) * -191378369;
		if (GameClient.anInt3142 * -910791425 != var2 || GameClient.anInt3185 * -278001619 != var3) {
			int[] var15 = new int[9];

			for (int var6 = 0; var6 < 9; var6++) {
				int var10 = 128 + var6 * 32 + 15;
				int var11 = var10 * 3 + 600;
				int var14 = Class117_Sub22_Sub17_Sub1.anIntArray2653[var10];
				var15[var6] = var11 * var14 >> 16;
			}

			Class42.method694(var15, 500, 800, var2, var3);
		}

		GameClient.anInt3126 = var0 * 1715900863;
		GameClient.anInt3183 = var1 * -47448595;
		GameClient.anInt3142 = var2 * 1457558271;
		GameClient.anInt3185 = var3 * 83462053;
	}

	public static void method1987(String var0, Throwable var1, int var2) {
		try {
			String var3 = "";
			if (var1 != null) {
				var3 = Class117_Sub22_Sub5.method2402(var1, (short) -10286);
			}

			if (var0 != null) {
				if (var1 != null) {
					var3 = var3 + " | ";
				}

				var3 = var3 + var0;
			}

			System.out.println("Error: " + var3);
			var3 = var3.replace(':', '.');
			var3 = var3.replace('@', '_');
			var3 = var3.replace('&', '_');
			var3 = var3.replace('#', '_');
			if (RuntimeException_Sub1.anApplet2840 == null) {
				return;
			}

			URL var4 = new URL(RuntimeException_Sub1.anApplet2840.getCodeBase(), "clienterror.ws?c=" + RuntimeException_Sub1.anInt2832 * 1220621267 + "&u=" + RuntimeException_Sub1.aString2831 + "&v1=" + Class77.aString925 + "&v2=" + Class139.aString1625 + "&e=" + var3);
			DataInputStream var5 = new DataInputStream(var4.openStream());
			var5.read();
			var5.close();
		} catch (Exception var6) {
			;
		}

	}

	public static String method1988(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var5 = 0;

				for (long var3 = var0; var3 != 0L; var3 /= 37L) {
					++var5;
				}

				StringBuilder var2 = new StringBuilder(var5);

				while (var0 != 0L) {
					long var6 = var0;
					var0 /= 37L;
					var2.append(Class101.aCharArray1146[(int) (var6 - 37L * var0)]);
				}

				return var2.reverse().toString();
			}
		} else {
			return null;
		}
	}

}
