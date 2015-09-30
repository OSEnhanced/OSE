package core.Jagex;
import java.awt.*;
import java.awt.Desktop.Action;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class Class51 {

	static final int anInt691 = 2;
	static final int anInt692 = 4;
	static final int anInt693 = 128;
	static final int anInt694 = 32;
	static int anInt695;
	static final int anInt696 = 1;
	static final int anInt697 = 2048;
	static final int anInt699 = 19136824;
	public static final int anInt702 = 152;
	static final int anInt703 = 16;
	static final int anInt705 = 19136899;
	static final int anInt706 = 1024;
	static final int anInt707 = 64;
	public static final int anInt708 = 101;
	static final int anInt709 = 105;
	int anInt700 = 0;
	int anInt701 = 0;
	int anInt698;
	int anInt690;
	public int[][] anIntArrayArray704;

	public void method776(int var1) {
		for (int var2 = 0; var2 < anInt698 * -1929514775; var2++) {
			for (int var3 = 0; var3 < anInt690 * 1759318775; var3++) {
				if (var2 != 0 && var3 != 0 && var2 < anInt698 * -1929514775 - 5 && var3 < anInt690 * 1759318775 - 5) {
					anIntArrayArray704[var2][var3] = 16777216;
				} else {
					anIntArrayArray704[var2][var3] = 16777215;
				}
			}
		}

	}

	public void method777(int var1, int var2, int var3, int var4, boolean var5, byte var6) {
		var1 -= anInt700 * 796143871;
		var2 -= anInt701 * 1659021759;
		if (var3 == 0) {
			if (var4 == 0) {
				method781(var1, var2, 128, 1686349192);
				method781(var1 - 1, var2, 8, 1972558256);
			}

			if (var4 == 1) {
				method781(var1, var2, 2, 1693710383);
				method781(var1, var2 + 1, 32, 1751516798);
			}

			if (var4 == 2) {
				method781(var1, var2, 8, 1923434411);
				method781(var1 + 1, var2, 128, 1861582096);
			}

			if (var4 == 3) {
				method781(var1, var2, 32, 2134475745);
				method781(var1, var2 - 1, 2, 1740733004);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				method781(var1, var2, 1, 2022841365);
				method781(var1 - 1, 1 + var2, 16, 2086917264);
			}

			if (var4 == 1) {
				method781(var1, var2, 4, 1800699630);
				method781(var1 + 1, 1 + var2, 64, 1633099105);
			}

			if (var4 == 2) {
				method781(var1, var2, 16, 2144641536);
				method781(var1 + 1, var2 - 1, 1, 1906088030);
			}

			if (var4 == 3) {
				method781(var1, var2, 64, 1755732777);
				method781(var1 - 1, var2 - 1, 4, 1765752326);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				method781(var1, var2, 130, 2052413120);
				method781(var1 - 1, var2, 8, 1803648344);
				method781(var1, var2 + 1, 32, 1665267074);
			}

			if (var4 == 1) {
				method781(var1, var2, 10, 1907721181);
				method781(var1, 1 + var2, 32, 1935593428);
				method781(var1 + 1, var2, 128, 1731039416);
			}

			if (var4 == 2) {
				method781(var1, var2, 40, 2033089496);
				method781(1 + var1, var2, 128, 2049956994);
				method781(var1, var2 - 1, 2, 1997763451);
			}

			if (var4 == 3) {
				method781(var1, var2, 160, 1623444739);
				method781(var1, var2 - 1, 2, 2071308108);
				method781(var1 - 1, var2, 8, 1977296256);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					method781(var1, var2, 65536, 2026946289);
					method781(var1 - 1, var2, 4096, 2085967074);
				}

				if (var4 == 1) {
					method781(var1, var2, 1024, 2145979246);
					method781(var1, 1 + var2, 16384, 2111283817);
				}

				if (var4 == 2) {
					method781(var1, var2, 4096, 2123220082);
					method781(1 + var1, var2, 65536, 1766780437);
				}

				if (var4 == 3) {
					method781(var1, var2, 16384, 1998422923);
					method781(var1, var2 - 1, 1024, 2055044715);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					method781(var1, var2, 512, 1638029414);
					method781(var1 - 1, 1 + var2, 8192, 1641875218);
				}

				if (var4 == 1) {
					method781(var1, var2, 2048, 1916679583);
					method781(var1 + 1, var2 + 1, 32768, 2030985727);
				}

				if (var4 == 2) {
					method781(var1, var2, 8192, 2093746425);
					method781(var1 + 1, var2 - 1, 512, 1835953489);
				}

				if (var4 == 3) {
					method781(var1, var2, 32768, 1874263490);
					method781(var1 - 1, var2 - 1, 2048, 1619997600);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					method781(var1, var2, 66560, 1756236858);
					method781(var1 - 1, var2, 4096, 1973247991);
					method781(var1, var2 + 1, 16384, 1995862551);
				}

				if (var4 == 1) {
					method781(var1, var2, 5120, 1646463015);
					method781(var1, 1 + var2, 16384, 1803118829);
					method781(var1 + 1, var2, 65536, 2057026870);
				}

				if (var4 == 2) {
					method781(var1, var2, 20480, 1664281151);
					method781(1 + var1, var2, 65536, 1661299369);
					method781(var1, var2 - 1, 1024, 1916315560);
				}

				if (var4 == 3) {
					method781(var1, var2, 81920, 1963171787);
					method781(var1, var2 - 1, 1024, 1636953226);
					method781(var1 - 1, var2, 4096, 1701342796);
				}
			}
		}

	}

	public void method778(int var1, int var2, int var3, int var4, boolean var5, int var6) {
		int var7 = 256;
		if (var5) {
			var7 += 131072;
		}

		var1 -= anInt700 * 796143871;
		var2 -= anInt701 * 1659021759;

		for (int var8 = var1; var8 < var1 + var3; var8++) {
			if (var8 >= 0 && var8 < anInt698 * -1929514775) {
				for (int var9 = var2; var9 < var4 + var2; var9++) {
					if (var9 >= 0 && var9 < anInt690 * 1759318775) {
						method781(var8, var9, var7, 2037980778);
					}
				}
			}
		}

	}

	public void method779(int var1, int var2, int var3) {
		var1 -= anInt700 * 796143871;
		var2 -= anInt701 * 1659021759;
		anIntArrayArray704[var1][var2] |= 2097152;
	}

	public void method780(int var1, int var2, int var3) {
		var1 -= anInt700 * 796143871;
		var2 -= anInt701 * 1659021759;
		anIntArrayArray704[var1][var2] |= 262144;
	}

	void method781(int var1, int var2, int var3, int var4) {
		anIntArrayArray704[var1][var2] |= var3;
	}

	public void method782(int var1, int var2, int var3, int var4, boolean var5, int var6) {
		var1 -= anInt700 * 796143871;
		var2 -= anInt701 * 1659021759;
		if (var3 == 0) {
			if (var4 == 0) {
				method784(var1, var2, 128, 2085137495);
				method784(var1 - 1, var2, 8, -2036785268);
			}

			if (var4 == 1) {
				method784(var1, var2, 2, 1717094168);
				method784(var1, var2 + 1, 32, -434108281);
			}

			if (var4 == 2) {
				method784(var1, var2, 8, -1099255276);
				method784(var1 + 1, var2, 128, 1711241791);
			}

			if (var4 == 3) {
				method784(var1, var2, 32, -971049200);
				method784(var1, var2 - 1, 2, 1566553644);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				method784(var1, var2, 1, -433777690);
				method784(var1 - 1, 1 + var2, 16, -246158241);
			}

			if (var4 == 1) {
				method784(var1, var2, 4, 150636248);
				method784(1 + var1, 1 + var2, 64, 538011741);
			}

			if (var4 == 2) {
				method784(var1, var2, 16, 1778143196);
				method784(var1 + 1, var2 - 1, 1, 1559935712);
			}

			if (var4 == 3) {
				method784(var1, var2, 64, -206752021);
				method784(var1 - 1, var2 - 1, 4, -241061708);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				method784(var1, var2, 130, -349690028);
				method784(var1 - 1, var2, 8, 1161815682);
				method784(var1, var2 + 1, 32, -1537544180);
			}

			if (var4 == 1) {
				method784(var1, var2, 10, 1918028189);
				method784(var1, 1 + var2, 32, -2062894852);
				method784(1 + var1, var2, 128, -301672999);
			}

			if (var4 == 2) {
				method784(var1, var2, 40, 963149139);
				method784(1 + var1, var2, 128, 64675923);
				method784(var1, var2 - 1, 2, -2129601836);
			}

			if (var4 == 3) {
				method784(var1, var2, 160, -424067257);
				method784(var1, var2 - 1, 2, -1950906841);
				method784(var1 - 1, var2, 8, 1136762591);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					method784(var1, var2, 65536, -294407126);
					method784(var1 - 1, var2, 4096, -1731767553);
				}

				if (var4 == 1) {
					method784(var1, var2, 1024, -1834497987);
					method784(var1, 1 + var2, 16384, -601557476);
				}

				if (var4 == 2) {
					method784(var1, var2, 4096, -1294755941);
					method784(var1 + 1, var2, 65536, -476371709);
				}

				if (var4 == 3) {
					method784(var1, var2, 16384, 1833275805);
					method784(var1, var2 - 1, 1024, -661837900);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					method784(var1, var2, 512, 1569987862);
					method784(var1 - 1, 1 + var2, 8192, 644699942);
				}

				if (var4 == 1) {
					method784(var1, var2, 2048, 286096029);
					method784(1 + var1, var2 + 1, 32768, -1183313886);
				}

				if (var4 == 2) {
					method784(var1, var2, 8192, 1558281179);
					method784(var1 + 1, var2 - 1, 512, -185007349);
				}

				if (var4 == 3) {
					method784(var1, var2, 32768, 1135435747);
					method784(var1 - 1, var2 - 1, 2048, 776188080);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					method784(var1, var2, 66560, 675751031);
					method784(var1 - 1, var2, 4096, 826598434);
					method784(var1, 1 + var2, 16384, -903177115);
				}

				if (var4 == 1) {
					method784(var1, var2, 5120, -1440745094);
					method784(var1, var2 + 1, 16384, -1983931702);
					method784(1 + var1, var2, 65536, 1638384048);
				}

				if (var4 == 2) {
					method784(var1, var2, 20480, -1663728789);
					method784(1 + var1, var2, 65536, -173026455);
					method784(var1, var2 - 1, 1024, 1663406081);
				}

				if (var4 == 3) {
					method784(var1, var2, 81920, -684713785);
					method784(var1, var2 - 1, 1024, 1953634955);
					method784(var1 - 1, var2, 4096, 1812032056);
				}
			}
		}

	}

	public void method783(int var1, int var2, int var3, int var4, int var5, boolean var6, byte var7) {
		int var8 = 256;
		if (var6) {
			var8 += 131072;
		}

		var1 -= anInt700 * 796143871;
		var2 -= anInt701 * 1659021759;
		int var9;
		if (var5 == 1 || var5 == 3) {
			var9 = var3;
			var3 = var4;
			var4 = var9;
		}

		for (var9 = var1; var9 < var3 + var1; var9++) {
			if (var9 >= 0 && var9 < anInt698 * -1929514775) {
				for (int var10 = var2; var10 < var4 + var2; var10++) {
					if (var10 >= 0 && var10 < anInt690 * 1759318775) {
						method784(var9, var10, var8, 586038428);
					}
				}
			}
		}

	}

	void method784(int var1, int var2, int var3, int var4) {
		anIntArrayArray704[var1][var2] &= ~var3;
	}

	public void method785(int var1, int var2, int var3) {
		var1 -= anInt700 * 796143871;
		var2 -= anInt701 * 1659021759;
		anIntArrayArray704[var1][var2] &= -262145;
	}

	public Class51(int var1, int var2) {
		anInt698 = var1 * -1886525607;
		anInt690 = var2 * 467226311;
		anIntArrayArray704 = new int[anInt698 * -1929514775][anInt690 * 1759318775];
		method776(1784623710);
	}

	static int method797(long var0, String var2, int var3) {
		Random var4 = new Random();
		Class117_Sub14 var5 = new Class117_Sub14(128);
		Class117_Sub14 var6 = new Class117_Sub14(128);
		int[] var7 = new int[]{var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0};
		var5.method2126(10, 1366310018);

		int var8;
		for (var8 = 0; var8 < 4; var8++) {
			var5.method2183(var4.nextInt(), (byte) 123);
		}

		var5.method2183(var7[0], (byte) 61);
		var5.method2183(var7[1], (byte) 81);
		var5.method2029(var0);
		var5.method2029(0L);

		for (var8 = 0; var8 < 4; var8++) {
			var5.method2183(var4.nextInt(), (byte) 21);
		}

		var5.method2030(Class26.aBigInteger334, Class26.aBigInteger325, (byte) 40);
		var6.method2126(10, 1843383739);

		for (var8 = 0; var8 < 3; var8++) {
			var6.method2183(var4.nextInt(), (byte) 120);
		}

		var6.method2029(var4.nextLong());
		var6.method2033(var4.nextLong());
		Class117_Sub22_Sub11.method2565(var6, -1854877790);
		var6.method2029(var4.nextLong());
		var6.method2030(Class26.aBigInteger334, Class26.aBigInteger325, (byte) -99);
		var8 = Class37.method517(var2, 1505381394);
		if (var8 % 8 != 0) {
			var8 += 8 - var8 % 8;
		}

		Class117_Sub14 var9 = new Class117_Sub14(var8);
		var9.method2001(var2, 1410185188);
		var9.anInt1880 = var8 * -2079217519;
		var9.method2205(var7, 822135954);
		Class117_Sub14 var10 = new Class117_Sub14(var6.anInt1880 * 561453169 + var5.anInt1880 * 561453169 + 5 + var9.anInt1880 * 561453169);
		var10.method2126(2, 1129112637);
		var10.method2126(var5.anInt1880 * 561453169, 1439337656);
		var10.method2004(var5.aByteArray1885, 0, var5.anInt1880 * 561453169, 1378906872);
		var10.method2126(var6.anInt1880 * 561453169, 1735709101);
		var10.method2004(var6.aByteArray1885, 0, var6.anInt1880 * 561453169, 48004309);
		var10.method1996(var9.anInt1880 * 561453169, (byte) -5);
		var10.method2004(var9.aByteArray1885, 0, var9.anInt1880 * 561453169, 2062516728);
		byte[] var11 = var10.aByteArray1885;
		String var12 = Class117_Sub22_Sub10.method2538(var11, 0, var11.length, 148952340);
		String var13 = var12;

		try {
			URL var14 = new URL(Class117_Sub22_Sub12.method2588("services", false, -2123209254) + "m=accountappeal/login.ws");
			URLConnection var15 = var14.openConnection();
			var15.setDoInput(true);
			var15.setDoOutput(true);
			var15.setConnectTimeout(5000);
			OutputStreamWriter var16 = new OutputStreamWriter(var15.getOutputStream());
			var16.write("data2=" + Class38.method521(var13, (byte) 6) + "&dest=" + Class38.method521("passwordchoice.ws", (byte) -10));
			var16.flush();
			InputStream var17 = var15.getInputStream();
			var10 = new Class117_Sub14(new byte[1000]);

			do {
				int var18 = var17.read(var10.aByteArray1885, var10.anInt1880 * 561453169, 1000 - var10.anInt1880 * 561453169);
				if (var18 == -1) {
					var16.close();
					var17.close();
					String var22 = new String(var10.aByteArray1885);
					if (var22.startsWith("OFFLINE")) {
						return 4;
					} else if (var22.startsWith("WRONG")) {
						return 7;
					} else if (var22.startsWith("RELOAD")) {
						return 3;
					} else if (var22.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var10.method2128(var7, (short) 5565);

						while (var10.anInt1880 * 561453169 > 0 && var10.aByteArray1885[var10.anInt1880 * 561453169 - 1] == 0) {
							var10.anInt1880 += 2079217519;
						}

						var22 = new String(var10.aByteArray1885, 0, var10.anInt1880 * 561453169);
						if (!Class45.method738(var22, (byte) -90)) {
							return 5;
						} else {
							if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
								try {
									Desktop.getDesktop().browse(new URI(var22));
									return 2;
								} catch (Exception var20) {
									;
								}
							}

							if (Class80.aString957.startsWith("win")) {
								Class117_Sub22_Sub5.method2416(var22, 0, (byte) 0);
							} else if (Class80.aString957.startsWith("mac")) {
								Class117_Sub22_Sub15.method2834(var22, 1, "openjs", -1649753493);
							} else {
								Class117_Sub22_Sub5.method2416(var22, 2, (byte) 0);
							}

							return 2;
						}
					}
				}

				var10.anInt1880 += var18 * -2079217519;
			} while (var10.anInt1880 * 561453169 < 1000);

			return 5;
		} catch (Throwable var21) {
			var21.printStackTrace();
			return 5;
		}
	}

	static void method814(int var0, int var1, int var2, int var3, int var4, int var5, Class42 var6, Class51 var7, int var8) {
		if (!GameClient.aBool2921 || (Class31.aByteArrayArrayArray401[0][var1][var2] & 2) != 0 || (Class31.aByteArrayArrayArray401[var0][var1][var2] & 16) == 0) {
			if (var0 < Class31.anInt399 * 1455303933) {
				Class31.anInt399 = var0 * 398217301;
			}

			Class117_Sub22_Sub13 var9 = Class63.method928(var3, 1378687880);
			int var10;
			int var17;
			if (var4 != 1 && var4 != 3) {
				var10 = var9.anInt2346 * -1473224837;
				var17 = var9.anInt2396 * 817158555;
			} else {
				var10 = var9.anInt2396 * 817158555;
				var17 = var9.anInt2346 * -1473224837;
			}

			int var18;
			int var19;
			if (var1 + var10 <= 104) {
				var18 = var1 + (var10 >> 1);
				var19 = var1 + (1 + var10 >> 1);
			} else {
				var18 = var1;
				var19 = var1 + 1;
			}

			int var20;
			int var23;
			if (var2 + var17 <= 104) {
				var23 = var2 + (var17 >> 1);
				var20 = (1 + var17 >> 1) + var2;
			} else {
				var23 = var2;
				var20 = var2 + 1;
			}

			int[][] var12 = Class31.anIntArrayArrayArray381[var0];
			int var14 = var12[var19][var20] + var12[var18][var20] + var12[var19][var23] + var12[var18][var23] >> 2;
			int var13 = (var1 << 7) + (var10 << 6);
			int var15 = (var2 << 7) + (var17 << 6);
			int var21 = var1 + (var2 << 7) + (var3 << 14) + 1073741824;
			if (var9.anInt2361 * 338861247 == 0) {
				var21 += Integer.MIN_VALUE;
			}

			int var22 = (var4 << 6) + var5;
			if (var9.anInt2386 * -23237579 == 1) {
				var22 += 256;
			}

			if (var9.method2623(175637426)) {
				Class132.method1717(var0, var1, var2, var9, var4, 404426283);
			}

			Object var16;
			if (var5 == 22) {
				if (!GameClient.aBool2921 || var9.anInt2361 * 338861247 != 0 || var9.anInt2355 * 1067298499 == 1 || var9.aBool2384) {
					if (var9.anInt2367 * 1533456441 == -1 && var9.anIntArray2387 == null) {
						var16 = var9.method2596(22, var4, var12, var13, var14, var15, -521632788);
					} else {
						var16 = new Class117_Sub22_Sub18_Sub6(var3, 22, var4, var0, var1, var2, var9.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
					}

					var6.method589(var0, var1, var2, var14, (Class117_Sub22_Sub18) var16, var21, var22);
					if (var9.anInt2355 * 1067298499 == 1 && var7 != null) {
						var7.method780(var1, var2, -1910284309);
					}

				}
			} else {
				int var11;
				if (var5 != 10 && var5 != 11) {
					if (var5 >= 12) {
						if (var9.anInt2367 * 1533456441 == -1 && var9.anIntArray2387 == null) {
							var16 = var9.method2596(var5, var4, var12, var13, var14, var15, -74425718);
						} else {
							var16 = new Class117_Sub22_Sub18_Sub6(var3, var5, var4, var0, var1, var2, var9.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
						}

						var6.method549(var0, var1, var2, var14, 1, 1, (Class117_Sub22_Sub18) var16, 0, var21, var22);
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
							Class40.anIntArrayArrayArray502[var0][var1][var2] |= 2340;
						}

						if (var9.anInt2355 * 1067298499 != 0 && var7 != null) {
							var7.method778(var1, var2, var10, var17, var9.aBool2364, 1010110971);
						}

					} else if (var5 == 0) {
						if (var9.anInt2367 * 1533456441 == -1 && var9.anIntArray2387 == null) {
							var16 = var9.method2596(0, var4, var12, var13, var14, var15, -452006699);
						} else {
							var16 = new Class117_Sub22_Sub18_Sub6(var3, 0, var4, var0, var1, var2, var9.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
						}

						var6.method547(var0, var1, var2, var14, (Class117_Sub22_Sub18) var16, (Class117_Sub22_Sub18) null, Class31.anIntArray389[var4], 0, var21, var22);
						if (var4 == 0) {
							if (var9.aBool2377) {
								Class31.aByteArrayArrayArray385[var0][var1][var2] = 50;
								Class31.aByteArrayArrayArray385[var0][var1][var2 + 1] = 50;
							}

							if (var9.aBool2368) {
								Class40.anIntArrayArrayArray502[var0][var1][var2] |= 585;
							}
						} else if (var4 == 1) {
							if (var9.aBool2377) {
								Class31.aByteArrayArrayArray385[var0][var1][var2 + 1] = 50;
								Class31.aByteArrayArrayArray385[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var9.aBool2368) {
								Class40.anIntArrayArrayArray502[var0][var1][var2 + 1] |= 1170;
							}
						} else if (var4 == 2) {
							if (var9.aBool2377) {
								Class31.aByteArrayArrayArray385[var0][var1 + 1][var2] = 50;
								Class31.aByteArrayArrayArray385[var0][1 + var1][1 + var2] = 50;
							}

							if (var9.aBool2368) {
								Class40.anIntArrayArrayArray502[var0][var1 + 1][var2] |= 585;
							}
						} else if (var4 == 3) {
							if (var9.aBool2377) {
								Class31.aByteArrayArrayArray385[var0][var1][var2] = 50;
								Class31.aByteArrayArrayArray385[var0][var1 + 1][var2] = 50;
							}

							if (var9.aBool2368) {
								Class40.anIntArrayArrayArray502[var0][var1][var2] |= 1170;
							}
						}

						if (var9.anInt2355 * 1067298499 != 0 && var7 != null) {
							var7.method777(var1, var2, var5, var4, var9.aBool2364, (byte) 71);
						}

						if (var9.anInt2370 * -1225060401 != 16) {
							var6.method638(var0, var1, var2, var9.anInt2370 * -1225060401);
						}

					} else if (var5 == 1) {
						if (var9.anInt2367 * 1533456441 == -1 && var9.anIntArray2387 == null) {
							var16 = var9.method2596(1, var4, var12, var13, var14, var15, -2073768711);
						} else {
							var16 = new Class117_Sub22_Sub18_Sub6(var3, 1, var4, var0, var1, var2, var9.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
						}

						var6.method547(var0, var1, var2, var14, (Class117_Sub22_Sub18) var16, (Class117_Sub22_Sub18) null, Class31.anIntArray390[var4], 0, var21, var22);
						if (var9.aBool2377) {
							if (var4 == 0) {
								Class31.aByteArrayArrayArray385[var0][var1][1 + var2] = 50;
							} else if (var4 == 1) {
								Class31.aByteArrayArrayArray385[var0][var1 + 1][1 + var2] = 50;
							} else if (var4 == 2) {
								Class31.aByteArrayArrayArray385[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) {
								Class31.aByteArrayArrayArray385[var0][var1][var2] = 50;
							}
						}

						if (var9.anInt2355 * 1067298499 != 0 && var7 != null) {
							var7.method777(var1, var2, var5, var4, var9.aBool2364, (byte) 37);
						}

					} else {
						int var28;
						Object var29;
						if (var5 == 2) {
							var28 = 1 + var4 & 3;
							Object var27;
							if (var9.anInt2367 * 1533456441 == -1 && var9.anIntArray2387 == null) {
								var27 = var9.method2596(2, 4 + var4, var12, var13, var14, var15, 226730883);
								var29 = var9.method2596(2, var28, var12, var13, var14, var15, -1277109085);
							} else {
								var27 = new Class117_Sub22_Sub18_Sub6(var3, 2, 4 + var4, var0, var1, var2, var9.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
								var29 = new Class117_Sub22_Sub18_Sub6(var3, 2, var28, var0, var1, var2, var9.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
							}

							var6.method547(var0, var1, var2, var14, (Class117_Sub22_Sub18) var27, (Class117_Sub22_Sub18) var29, Class31.anIntArray389[var4], Class31.anIntArray389[var28], var21, var22);
							if (var9.aBool2368) {
								if (var4 == 0) {
									Class40.anIntArrayArrayArray502[var0][var1][var2] |= 585;
									Class40.anIntArrayArrayArray502[var0][var1][1 + var2] |= 1170;
								} else if (var4 == 1) {
									Class40.anIntArrayArrayArray502[var0][var1][1 + var2] |= 1170;
									Class40.anIntArrayArrayArray502[var0][1 + var1][var2] |= 585;
								} else if (var4 == 2) {
									Class40.anIntArrayArrayArray502[var0][1 + var1][var2] |= 585;
									Class40.anIntArrayArrayArray502[var0][var1][var2] |= 1170;
								} else if (var4 == 3) {
									Class40.anIntArrayArrayArray502[var0][var1][var2] |= 1170;
									Class40.anIntArrayArrayArray502[var0][var1][var2] |= 585;
								}
							}

							if (var9.anInt2355 * 1067298499 != 0 && var7 != null) {
								var7.method777(var1, var2, var5, var4, var9.aBool2364, (byte) 12);
							}

							if (var9.anInt2370 * -1225060401 != 16) {
								var6.method638(var0, var1, var2, var9.anInt2370 * -1225060401);
							}

						} else if (var5 == 3) {
							if (var9.anInt2367 * 1533456441 == -1 && var9.anIntArray2387 == null) {
								var16 = var9.method2596(3, var4, var12, var13, var14, var15, -403574445);
							} else {
								var16 = new Class117_Sub22_Sub18_Sub6(var3, 3, var4, var0, var1, var2, var9.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
							}

							var6.method547(var0, var1, var2, var14, (Class117_Sub22_Sub18) var16, (Class117_Sub22_Sub18) null, Class31.anIntArray390[var4], 0, var21, var22);
							if (var9.aBool2377) {
								if (var4 == 0) {
									Class31.aByteArrayArrayArray385[var0][var1][1 + var2] = 50;
								} else if (var4 == 1) {
									Class31.aByteArrayArrayArray385[var0][var1 + 1][1 + var2] = 50;
								} else if (var4 == 2) {
									Class31.aByteArrayArrayArray385[var0][1 + var1][var2] = 50;
								} else if (var4 == 3) {
									Class31.aByteArrayArrayArray385[var0][var1][var2] = 50;
								}
							}

							if (var9.anInt2355 * 1067298499 != 0 && var7 != null) {
								var7.method777(var1, var2, var5, var4, var9.aBool2364, (byte) 100);
							}

						} else if (var5 == 9) {
							if (var9.anInt2367 * 1533456441 == -1 && var9.anIntArray2387 == null) {
								var16 = var9.method2596(var5, var4, var12, var13, var14, var15, 141805789);
							} else {
								var16 = new Class117_Sub22_Sub18_Sub6(var3, var5, var4, var0, var1, var2, var9.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
							}

							var6.method549(var0, var1, var2, var14, 1, 1, (Class117_Sub22_Sub18) var16, 0, var21, var22);
							if (var9.anInt2355 * 1067298499 != 0 && var7 != null) {
								var7.method778(var1, var2, var10, var17, var9.aBool2364, 1010110971);
							}

							if (var9.anInt2370 * -1225060401 != 16) {
								var6.method638(var0, var1, var2, var9.anInt2370 * -1225060401);
							}

						} else if (var5 == 4) {
							if (var9.anInt2367 * 1533456441 == -1 && var9.anIntArray2387 == null) {
								var16 = var9.method2596(4, var4, var12, var13, var14, var15, -1924848213);
							} else {
								var16 = new Class117_Sub22_Sub18_Sub6(var3, 4, var4, var0, var1, var2, var9.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
							}

							var6.method659(var0, var1, var2, var14, (Class117_Sub22_Sub18) var16, (Class117_Sub22_Sub18) null, Class31.anIntArray389[var4], 0, 0, 0, var21, var22);
						} else if (var5 == 5) {
							var28 = 16;
							var11 = var6.method706(var0, var1, var2);
							if (var11 != 0) {
								var28 = Class63.method928(var11 >> 14 & 32767, -825390770).anInt2370 * -1225060401;
							}

							if (var9.anInt2367 * 1533456441 == -1 && var9.anIntArray2387 == null) {
								var29 = var9.method2596(4, var4, var12, var13, var14, var15, -33436620);
							} else {
								var29 = new Class117_Sub22_Sub18_Sub6(var3, 4, var4, var0, var1, var2, var9.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
							}

							var6.method659(var0, var1, var2, var14, (Class117_Sub22_Sub18) var29, (Class117_Sub22_Sub18) null, Class31.anIntArray389[var4], 0, Class31.anIntArray391[var4] * var28, var28 * Class31.anIntArray392[var4], var21, var22);
						} else if (var5 == 6) {
							var28 = 8;
							var11 = var6.method706(var0, var1, var2);
							if (var11 != 0) {
								var28 = Class63.method928(var11 >> 14 & 32767, 395186910).anInt2370 * -1225060401 / 2;
							}

							if (var9.anInt2367 * 1533456441 == -1 && var9.anIntArray2387 == null) {
								var29 = var9.method2596(4, var4 + 4, var12, var13, var14, var15, -1698690801);
							} else {
								var29 = new Class117_Sub22_Sub18_Sub6(var3, 4, 4 + var4, var0, var1, var2, var9.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
							}

							var6.method659(var0, var1, var2, var14, (Class117_Sub22_Sub18) var29, (Class117_Sub22_Sub18) null, 256, var4, var28 * Class31.anIntArray384[var4], Class31.anIntArray394[var4] * var28, var21, var22);
						} else if (var5 == 7) {
							var11 = var4 + 2 & 3;
							if (var9.anInt2367 * 1533456441 == -1 && var9.anIntArray2387 == null) {
								var16 = var9.method2596(4, 4 + var11, var12, var13, var14, var15, -382381282);
							} else {
								var16 = new Class117_Sub22_Sub18_Sub6(var3, 4, var11 + 4, var0, var1, var2, var9.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
							}

							var6.method659(var0, var1, var2, var14, (Class117_Sub22_Sub18) var16, (Class117_Sub22_Sub18) null, 256, var11, 0, 0, var21, var22);
						} else if (var5 == 8) {
							var28 = 8;
							var11 = var6.method706(var0, var1, var2);
							if (var11 != 0) {
								var28 = Class63.method928(var11 >> 14 & 32767, -786097116).anInt2370 * -1225060401 / 2;
							}

							int var26 = 2 + var4 & 3;
							Object var30;
							if (var9.anInt2367 * 1533456441 == -1 && var9.anIntArray2387 == null) {
								var29 = var9.method2596(4, var4 + 4, var12, var13, var14, var15, 267630271);
								var30 = var9.method2596(4, var26 + 4, var12, var13, var14, var15, 317969893);
							} else {
								var29 = new Class117_Sub22_Sub18_Sub6(var3, 4, 4 + var4, var0, var1, var2, var9.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
								var30 = new Class117_Sub22_Sub18_Sub6(var3, 4, 4 + var26, var0, var1, var2, var9.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
							}

							var6.method659(var0, var1, var2, var14, (Class117_Sub22_Sub18) var29, (Class117_Sub22_Sub18) var30, 256, var4, var28 * Class31.anIntArray384[var4], var28 * Class31.anIntArray394[var4], var21, var22);
						}
					}
				} else {
					if (var9.anInt2367 * 1533456441 == -1 && var9.anIntArray2387 == null) {
						var16 = var9.method2596(10, var4, var12, var13, var14, var15, -690366336);
					} else {
						var16 = new Class117_Sub22_Sub18_Sub6(var3, 10, var4, var0, var1, var2, var9.anInt2367 * 1533456441, true, (Class117_Sub22_Sub18) null);
					}

					if (var16 != null && var6.method549(var0, var1, var2, var14, var10, var17, (Class117_Sub22_Sub18) var16, var5 == 11 ? 256 : 0, var21, var22) && var9.aBool2377) {
						var11 = 15;
						if (var16 instanceof Class117_Sub22_Sub18_Sub7) {
							var11 = ((Class117_Sub22_Sub18_Sub7) var16).method3413() / 4;
							if (var11 > 30) {
								var11 = 30;
							}
						}

						for (int var24 = 0; var24 <= var10; var24++) {
							for (int var25 = 0; var25 <= var17; var25++) {
								if (var11 > Class31.aByteArrayArrayArray385[var0][var24 + var1][var25 + var2]) {
									Class31.aByteArrayArrayArray385[var0][var1 + var24][var25 + var2] = (byte) var11;
								}
							}
						}
					}

					if (var9.anInt2355 * 1067298499 != 0 && var7 != null) {
						var7.method778(var1, var2, var10, var17, var9.aBool2364, 1010110971);
					}

				}
			}
		}
	}

	static void method815(boolean var0, int var1) {
		GameClient.aBool2980 = var0;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var9;
		if (!GameClient.aBool2980) {
			var3 = GameClient.aClass117_Sub14_Sub1_2953.method2045((byte) 67);
			var4 = GameClient.aClass117_Sub14_Sub1_2953.method2012(1053511631);
			var2 = GameClient.aClass117_Sub14_Sub1_2953.method2012(1053511631);
			Class63.anIntArrayArray777 = new int[var2][4];

			for (var5 = 0; var5 < var2; var5++) {
				for (var6 = 0; var6 < 4; var6++) {
					Class63.anIntArrayArray777[var5][var6] = GameClient.aClass117_Sub14_Sub1_2953.method2015((byte) 67);
				}
			}

			Class41.anIntArray515 = new int[var2];
			GameClient.anIntArray3108 = new int[var2];
			Canvas_Sub1.anIntArray2489 = new int[var2];
			Class7.aByteArrayArray101 = new byte[var2][];
			Class117_Sub22_Sub18_Sub1_Sub1.aByteArrayArray2865 = new byte[var2][];
			boolean var14 = false;
			if ((var3 / 8 == 48 || var3 / 8 == 49) && var4 / 8 == 48) {
				var14 = true;
			}

			if (var3 / 8 == 48 && var4 / 8 == 148) {
				var14 = true;
			}

			var2 = 0;

			for (var6 = (var3 - 6) / 8; var6 <= (6 + var3) / 8; var6++) {
				for (var7 = (var4 - 6) / 8; var7 <= (6 + var4) / 8; var7++) {
					var9 = var7 + (var6 << 8);
					if (!var14 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) {
						Class41.anIntArray515[var2] = var9;
						GameClient.anIntArray3108[var2] = Class73_Sub2.aClass106_Sub1_1893.method1391("m" + var6 + "_" + var7, -1809851538);
						Canvas_Sub1.anIntArray2489[var2] = Class73_Sub2.aClass106_Sub1_1893.method1391("l" + var6 + "_" + var7, -1456364221);
						++var2;
					}
				}
			}

			Class43.method724(var3, var4, -2040281089);
		} else {
			var3 = GameClient.aClass117_Sub14_Sub1_2953.method2046(-2146130331);
			var4 = GameClient.aClass117_Sub14_Sub1_2953.method2012(1053511631);
			var2 = GameClient.aClass117_Sub14_Sub1_2953.method2012(1053511631);
			GameClient.aClass117_Sub14_Sub1_2953.method2930(2004057364);

			for (var5 = 0; var5 < 4; var5++) {
				for (var6 = 0; var6 < 13; var6++) {
					for (var7 = 0; var7 < 13; var7++) {
						var9 = GameClient.aClass117_Sub14_Sub1_2953.method2931(1, -1320315244);
						if (var9 == 1) {
							GameClient.anIntArrayArrayArray2981[var5][var6][var7] = GameClient.aClass117_Sub14_Sub1_2953.method2931(26, -1320315244);
						} else {
							GameClient.anIntArrayArrayArray2981[var5][var6][var7] = -1;
						}
					}
				}
			}

			GameClient.aClass117_Sub14_Sub1_2953.method2945(1971556158);
			Class63.anIntArrayArray777 = new int[var2][4];

			for (var5 = 0; var5 < var2; var5++) {
				for (var6 = 0; var6 < 4; var6++) {
					Class63.anIntArrayArray777[var5][var6] = GameClient.aClass117_Sub14_Sub1_2953.method2015((byte) 83);
				}
			}

			Class41.anIntArray515 = new int[var2];
			GameClient.anIntArray3108 = new int[var2];
			Canvas_Sub1.anIntArray2489 = new int[var2];
			Class7.aByteArrayArray101 = new byte[var2][];
			Class117_Sub22_Sub18_Sub1_Sub1.aByteArrayArray2865 = new byte[var2][];
			var2 = 0;

			for (var5 = 0; var5 < 4; var5++) {
				for (var6 = 0; var6 < 13; var6++) {
					for (var7 = 0; var7 < 13; var7++) {
						var9 = GameClient.anIntArrayArrayArray2981[var5][var6][var7];
						if (var9 != -1) {
							int var12 = var9 >> 14 & 1023;
							int var13 = var9 >> 3 & 2047;
							int var8 = (var12 / 8 << 8) + var13 / 8;

							int var10;
							for (var10 = 0; var10 < var2; var10++) {
								if (Class41.anIntArray515[var10] == var8) {
									var8 = -1;
									break;
								}
							}

							if (var8 != -1) {
								Class41.anIntArray515[var2] = var8;
								var10 = var8 >> 8 & 255;
								int var11 = var8 & 255;
								GameClient.anIntArray3108[var2] = Class73_Sub2.aClass106_Sub1_1893.method1391("m" + var10 + "_" + var11, -1168631388);
								Canvas_Sub1.anIntArray2489[var2] = Class73_Sub2.aClass106_Sub1_1893.method1391("l" + var10 + "_" + var11, -1269782063);
								++var2;
							}
						}
					}
				}
			}

			Class43.method724(var4, var3, -2040281089);
		}

	}

}
