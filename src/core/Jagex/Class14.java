package core.Jagex;
import java.awt.*;

public class Class14 {

	public static int anInt156;
	static final int anInt157 = 256;
	static final int anInt158 = 16384;
	int anInt166;
	public static int anInt170;
	static final int anInt172 = 48;
	static final int anInt176 = 4;
	protected static int anInt177;
	static final int anInt178 = 39;
	int[] anIntArray155;
	long aLong162 = 0L;
	boolean aBool171 = true;
	int anInt167 = 0;
	long aLong159 = Class47.method774(1814808863) * 6079450472619789753L;
	int anInt163;
	int anInt165;
	int anInt169 = 0;
	long aLong164 = 0L;
	int anInt168 = 0;
	int anInt173 = 0;
	int anInt161 = 1485852576;
	Class117_Sub2[] aClass117_Sub2Array174 = new Class117_Sub2[8];
	Class117_Sub2[] aClass117_Sub2Array175 = new Class117_Sub2[8];
	Class117_Sub2 aClass117_Sub2_160;

	public final synchronized void method241(int var1) {
		if (Class32.aClass17_408 != null) {
			boolean var2 = true;

			for (int var3 = 0; var3 < 2; var3++) {
				if (this == Class32.aClass17_408.aClass14Array213[var3]) {
					Class32.aClass17_408.aClass14Array213[var3] = null;
				}

				if (Class32.aClass17_408.aClass14Array213[var3] != null) {
					var2 = false;
				}
			}

			if (var2) {
				Class32.aClass17_408.aBool208 = true;

				while (Class32.aClass17_408.aBool209) {
					Class38.method520(50L);
				}

				Class32.aClass17_408 = null;
			}
		}

		method253();
		anIntArray155 = null;
	}

	public final synchronized void method242(short var1) {
		if (anIntArray155 != null) {
			long var2 = Class47.method774(956597480);

			try {
				if (aLong162 * 741245351549227871L != 0L) {
					if (var2 < aLong162 * 741245351549227871L) {
						return;
					}

					method250(anInt163 * 1536791649);
					aLong162 = 0L;
					aBool171 = true;
				}

				int var4 = method247();
				if (anInt169 * 1411266775 - var4 > anInt167 * -546870435) {
					anInt167 = (anInt169 * 1411266775 - var4) * 804995317;
				}

				int var5 = anInt166 * 1845767501 + anInt165 * 531931777;
				if (var5 + 256 > 16384) {
					var5 = 16128;
				}

				if (var5 + 256 > anInt163 * 1536791649) {
					anInt163 -= 532773888;
					if (anInt163 * 1536791649 > 16384) {
						anInt163 = 65552384;
					}

					method253();
					method250(anInt163 * 1536791649);
					var4 = 0;
					aBool171 = true;
					if (256 + var5 > anInt163 * 1536791649) {
						var5 = anInt163 * 1536791649 - 256;
						anInt165 = (var5 - anInt166 * 1845767501) * 332504449;
					}
				}

				while (var4 < var5) {
					method293(anIntArray155, 256);
					method245();
					var4 += 256;
				}

				if (var2 > 8424389384833108059L * aLong164) {
					if (!aBool171) {
						if (anInt167 * -546870435 == 0 && anInt168 * -1717822727 == 0) {
							method253();
							aLong162 = 8158089374502144159L * (2000L + var2);
							return;
						}

						anInt165 = Math.min(anInt168 * -1717822727, anInt167 * -546870435) * 332504449;
						anInt168 = anInt167 * -1192580987;
					} else {
						aBool171 = false;
					}

					anInt167 = 0;
					aLong164 = (var2 + 2000L) * -5713982564719564845L;
				}

				anInt169 = var4 * 28719847;
			} catch (Exception var7) {
				method253();
				aLong162 = (var2 + 2000L) * 8158089374502144159L;
			}

			try {
				if (var2 > 500000L + aLong159 * 2336646865108904073L) {
					var2 = aLong159 * 2336646865108904073L;
				}

				while (var2 > aLong159 * 2336646865108904073L + 5000L) {
					method246(256, 213202417);
					aLong159 += (long) (256000 / (anInt170 * -1211689641)) * 6079450472619789753L;
				}
			} catch (Exception var6) {
				aLong159 = 6079450472619789753L * var2;
			}

		}
	}

	static int method243(int var0, int var1, int var2, int var3) {
		int var4 = 256 - var2;
		return ((var1 & 65280) * var2 + (var0 & 65280) * var4 & 16711680) + ((var0 & 16711935) * var4 + var2 * (var1 & 16711935) & -16711936) >> 8;
	}

	public final synchronized void method244(byte var1) {
		aBool171 = true;

		try {
			method288();
		} catch (Exception var3) {
			method253();
			aLong162 = (Class47.method774(1101620758) + 2000L) * 8158089374502144159L;
		}

	}

	void method245() throws Exception {
	}

	final void method246(int var1, int var2) {
		anInt173 -= var1 * -1196860787;
		if (anInt173 * 1839921221 < 0) {
			anInt173 = 0;
		}

		if (aClass117_Sub2_160 != null) {
			aClass117_Sub2_160.method1852(var1);
		}

	}

	int method247() throws Exception {
		return anInt163 * 1536791649;
	}

	final void method248(Class117_Sub2 var1, int var2, int var3) {
		int var4 = var2 >> 5;
		Class117_Sub2 var5 = aClass117_Sub2Array175[var4];
		if (var5 == null) {
			aClass117_Sub2Array174[var4] = var1;
		} else {
			var5.aClass117_Sub2_1683 = var1;
		}

		aClass117_Sub2Array175[var4] = var1;
		var1.anInt1681 = var2;
	}

	void method250(int var1) throws Exception {
	}

	void method253() {
	}

	public final void method270(int var1) {
		aBool171 = true;
	}

	void method288() throws Exception {
	}

	static void method290(Class117_Sub19 var0, int var1, int var2, int var3) {
		if (var0.anInt1998 * 1907852693 == 1) {
			Class81.method1109(var0.aString2088, "", 24, 0, 0, var0.anInt1973 * -1955776525, -1337593744);
		}

		int var4;
		int var5;
		String var6;
		if (var0.anInt1998 * 1907852693 == 2 && !GameClient.aBool3074) {
			var5 = Class67.method961(var0, -1722012539);
			var4 = var5 >> 11 & 63;
			if (var4 == 0) {
				var6 = null;
			} else if (var0.aString2050 != null && var0.aString2050.trim().length() != 0) {
				var6 = var0.aString2050;
			} else {
				var6 = null;
			}

			if (var6 != null) {
				Class81.method1109(var6, Class117_Sub22_Sub12.method2584(65280, 668388556) + var0.aString2030, 25, 0, -1, var0.anInt1973 * -1955776525, -1919301416);
			}
		}

		if (var0.anInt1998 * 1907852693 == 3) {
			Class81.method1109(Class108.aString1290, "", 26, 0, 0, var0.anInt1973 * -1955776525, -1733527920);
		}

		if (var0.anInt1998 * 1907852693 == 4) {
			Class81.method1109(var0.aString2088, "", 28, 0, 0, var0.anInt1973 * -1955776525, -1712735895);
		}

		if (var0.anInt1998 * 1907852693 == 5) {
			Class81.method1109(var0.aString2088, "", 29, 0, 0, var0.anInt1973 * -1955776525, -1498466378);
		}

		if (var0.anInt1998 * 1907852693 == 6 && GameClient.aClass117_Sub19_3083 == null) {
			Class81.method1109(var0.aString2088, "", 30, 0, -1, var0.anInt1973 * -1955776525, -1290907576);
		}

		int var7;
		int var19;
		if (var0.anInt1975 * 657737235 == 2) {
			var19 = 0;

			for (var4 = 0; var4 < var0.anInt1989 * 2747837; var4++) {
				for (var5 = 0; var5 < var0.anInt1988 * 1854643179; var5++) {
					var7 = var5 * (var0.anInt2037 * 594676405 + 32);
					int var10 = (32 + var0.anInt2038 * -1418485899) * var4;
					if (var19 < 20) {
						var7 += var0.anIntArray2039[var19];
						var10 += var0.anIntArray2040[var19];
					}

					if (var1 >= var7 && var2 >= var10 && var1 < 32 + var7 && var2 < var10 + 32) {
						GameClient.anInt3037 = var19 * 686321155;
						Class7.aClass117_Sub19_104 = var0;
						if (var0.anIntArray2049[var19] > 0) {
							label364:
							{
								Class117_Sub22_Sub6 var11 = Class117_Sub13.method1992(var0.anIntArray2049[var19] - 1, -1560922614);
								int var12;
								boolean var13;
								if (GameClient.anInt3071 * -339828245 == 1) {
									var12 = Class67.method961(var0, 1071436857);
									var13 = (var12 >> 30 & 1) != 0;
									if (var13) {
										if (var0.anInt1973 * -1955776525 != Class82.anInt978 * 240984047 || Class117_Sub22_Sub20.anInt2495 * 621320165 != var19) {
											Class81.method1109(Class108.aString1326, GameClient.aString3058 + " " + Class39.aString481 + " " + Class117_Sub22_Sub12.method2584(16748608, 668388556) + var11.aString2264, 31, var11.anInt2226 * 507416925, var19, var0.anInt1973 * -1955776525, -887932469);
										}
										break label364;
									}
								}

								if (GameClient.aBool3074) {
									var12 = Class67.method961(var0, 33000343);
									var13 = (var12 >> 30 & 1) != 0;
									if (var13) {
										if ((Class25.anInt311 * 746665735 & 16) == 16) {
											Class81.method1109(GameClient.aString2931, GameClient.aString3078 + " " + Class39.aString481 + " " + Class117_Sub22_Sub12.method2584(16748608, 668388556) + var11.aString2264, 32, var11.anInt2226 * 507416925, var19, var0.anInt1973 * -1955776525, -1811255445);
										}
										break label364;
									}
								}

								String[] var22 = var11.aStringArray2243;
								if (GameClient.aBool3090) {
									var22 = Class69.method968(var22, (short) 31057);
								}

								int var14 = Class67.method961(var0, -825884175);
								boolean var21 = (var14 >> 30 & 1) != 0;
								if (var21) {
									for (int var15 = 4; var15 >= 3; --var15) {
										if (var22 != null && var22[var15] != null) {
											byte var16;
											if (var15 == 3) {
												var16 = 36;
											} else {
												var16 = 37;
											}

											Class81.method1109(var22[var15], Class117_Sub22_Sub12.method2584(16748608, 668388556) + var11.aString2264, var16, var11.anInt2226 * 507416925, var19, var0.anInt1973 * -1955776525, -1385872250);
										} else if (var15 == 4) {
											Class81.method1109(Class108.aString1468, Class117_Sub22_Sub12.method2584(16748608, 668388556) + var11.aString2264, 37, var11.anInt2226 * 507416925, var19, var0.anInt1973 * -1955776525, -1559610320);
										}
									}
								}

								Class93 var10000 = (Class93) null;
								if (Class117_Sub22_Sub8.method2491(Class67.method961(var0, 1058048618), 22183454)) {
									Class81.method1109(Class108.aString1326, Class117_Sub22_Sub12.method2584(16748608, 668388556) + var11.aString2264, 38, var11.anInt2226 * 507416925, var19, var0.anInt1973 * -1955776525, -1342199263);
								}

								int var24 = Class67.method961(var0, -1552650491);
								boolean var23 = (var24 >> 30 & 1) != 0;
								byte var8;
								int var9;
								if (var23 && var22 != null) {
									for (var9 = 2; var9 >= 0; --var9) {
										if (var22[var9] != null) {
											var8 = 0;
											if (var9 == 0) {
												var8 = 33;
											}

											if (var9 == 1) {
												var8 = 34;
											}

											if (var9 == 2) {
												var8 = 35;
											}

											Class81.method1109(var22[var9], Class117_Sub22_Sub12.method2584(16748608, 668388556) + var11.aString2264, var8, var11.anInt2226 * 507416925, var19, var0.anInt1973 * -1955776525, -1383718740);
										}
									}
								}

								var22 = var0.aStringArray1972;
								if (GameClient.aBool3090) {
									var22 = Class69.method968(var22, (short) 23833);
								}

								if (var22 != null) {
									for (var9 = 4; var9 >= 0; --var9) {
										if (var22[var9] != null) {
											var8 = 0;
											if (var9 == 0) {
												var8 = 39;
											}

											if (var9 == 1) {
												var8 = 40;
											}

											if (var9 == 2) {
												var8 = 41;
											}

											if (var9 == 3) {
												var8 = 42;
											}

											if (var9 == 4) {
												var8 = 43;
											}

											Class81.method1109(var22[var9], Class117_Sub22_Sub12.method2584(16748608, 668388556) + var11.aString2264, var8, var11.anInt2226 * 507416925, var19, var0.anInt1973 * -1955776525, -870422810);
										}
									}
								}

								Class81.method1109(Class108.aString1351, Class117_Sub22_Sub12.method2584(16748608, 668388556) + var11.aString2264, 1005, var11.anInt2226 * 507416925, var19, var0.anInt1973 * -1955776525, -1890620656);
							}
						}
					}

					++var19;
				}
			}
		}

		if (var0.aBool2061) {
			if (GameClient.aBool3074) {
				if (Class86.method1144(Class67.method961(var0, -1869794622), (byte) 89) && (Class25.anInt311 * 746665735 & 32) == 32) {
					Class81.method1109(GameClient.aString2931, GameClient.aString3078 + " " + Class39.aString481 + " " + var0.aString1964, 58, 0, var0.anInt1976 * 1710354431, var0.anInt1973 * -1955776525, -1507529575);
				}
			} else {
				for (var19 = 9; var19 >= 5; --var19) {
					String var17 = Class117_Sub22_Sub18_Sub3.method3088(var0, var19, -1902292368);
					if (var17 != null) {
						Class81.method1109(var17, var0.aString1964, 1007, var19 + 1, var0.anInt1976 * 1710354431, var0.anInt1973 * -1955776525, -1652728104);
					}
				}

				var5 = Class67.method961(var0, 837850732);
				var4 = var5 >> 11 & 63;
				if (var4 == 0) {
					var6 = null;
				} else if (var0.aString2050 != null && var0.aString2050.trim().length() != 0) {
					var6 = var0.aString2050;
				} else {
					var6 = null;
				}

				if (var6 != null) {
					Class81.method1109(var6, var0.aString1964, 25, 0, var0.anInt1976 * 1710354431, var0.anInt1973 * -1955776525, -1794901471);
				}

				for (var5 = 4; var5 >= 0; --var5) {
					String var20 = Class117_Sub22_Sub18_Sub3.method3088(var0, var5, -1598898955);
					if (var20 != null) {
						Class81.method1109(var20, var0.aString1964, 57, 1 + var5, var0.anInt1976 * 1710354431, var0.anInt1973 * -1955776525, -1994057964);
					}
				}

				var7 = Class67.method961(var0, -173179625);
				boolean var18 = (var7 & 1) != 0;
				if (var18) {
					Class81.method1109(Class108.aString1205, "", 30, 0, var0.anInt1976 * 1710354431, var0.anInt1973 * -1955776525, -2064289742);
				}
			}
		}

	}

	public final synchronized void method291(Class117_Sub2 var1, int var2) {
		aClass117_Sub2_160 = var1;
	}

	final void method293(int[] var1, int var2) {
		int var3 = var2;
		if (Class130.aBool1588) {
			var3 = var2 << 1;
		}

		Class60.method911(var1, 0, var3);
		anInt173 -= var2 * -1196860787;
		if (aClass117_Sub2_160 != null && anInt173 * 1839921221 <= 0) {
			anInt173 += (anInt170 * -1211689641 >> 4) * -1196860787;
			Class4.method73(aClass117_Sub2_160, (byte) -88);
			method248(aClass117_Sub2_160, aClass117_Sub2_160.method1847(), -501485987);
			int var15 = 0;
			int var11 = 255;

			int var4;
			Class117_Sub2 var12;
			label138:
			for (var4 = 7; var11 != 0; --var4) {
				int var5;
				int var10;
				if (var4 < 0) {
					var5 = var4 & 3;
					var10 = -(var4 >> 2);
				} else {
					var5 = var4;
					var10 = 0;
				}

				for (int var9 = var11 >>> var5 & 286331153; var9 != 0; var9 >>>= 4) {
					if ((var9 & 1) != 0) {
						var11 &= ~(1 << var5);
						var12 = null;
						Class117_Sub2 var6 = aClass117_Sub2Array174[var5];

						label132:
						while (true) {
							while (true) {
								if (var6 == null) {
									break label132;
								}

								Class117_Sub4 var13 = var6.aClass117_Sub4_1682;
								if (var13 != null && var13.anInt1727 > var10) {
									var11 |= 1 << var5;
									var12 = var6;
									var6 = var6.aClass117_Sub2_1683;
								} else {
									var6.aBool1680 = true;
									int var14 = var6.method1869();
									var15 += var14;
									if (var13 != null) {
										var13.anInt1727 += var14;
									}

									if (var15 >= anInt161 * 60458709) {
										break label138;
									}

									Class117_Sub2 var8 = var6.method1859();
									if (var8 != null) {
										for (int var7 = var6.anInt1681; var8 != null; var8 = var6.method1848()) {
											method248(var8, var7 * var8.method1847() >> 8, -1592201796);
										}
									}

									Class117_Sub2 var17 = var6.aClass117_Sub2_1683;
									var6.aClass117_Sub2_1683 = null;
									if (var12 == null) {
										aClass117_Sub2Array174[var5] = var17;
									} else {
										var12.aClass117_Sub2_1683 = var17;
									}

									if (var17 == null) {
										aClass117_Sub2Array175[var5] = var12;
									}

									var6 = var17;
								}
							}
						}
					}

					var5 += 4;
					++var10;
				}
			}

			for (var4 = 0; var4 < 8; var4++) {
				Class117_Sub2 var16 = aClass117_Sub2Array174[var4];
				Class117_Sub2[] var18 = aClass117_Sub2Array174;
				aClass117_Sub2Array175[var4] = null;

				for (var18[var4] = null; var16 != null; var16 = var12) {
					var12 = var16.aClass117_Sub2_1683;
					var16.aClass117_Sub2_1683 = null;
				}
			}
		}

		if (anInt173 * 1839921221 < 0) {
			anInt173 = 0;
		}

		if (aClass117_Sub2_160 != null) {
			aClass117_Sub2_160.method1851(var1, 0, var2);
		}

		aLong159 = Class47.method774(2097125345) * 6079450472619789753L;
	}

	static Class117_Sub22_Sub17_Sub2 method294(Class106 var0, int var1, int var2, int var3) {
		if (!method295(var0, var1, var2, 1604803236)) {
			return null;
		} else {
			Class117_Sub22_Sub17_Sub2 var4 = new Class117_Sub22_Sub17_Sub2();
			var4.anInt2702 = Class13.anInt145 * -1559182453;
			var4.anInt2709 = Class13.anInt146 * -1301976433;
			var4.anInt2706 = Class98.anIntArray1133[0];
			var4.anInt2708 = Class13.anIntArray147[0];
			var4.anInt2707 = Class13.anIntArray148[0];
			var4.anInt2705 = Class26.anIntArray324[0];
			var4.anIntArray2704 = Class13.anIntArray149;
			var4.aByteArray2703 = Class13.aByteArrayArray150[0];
			Class117_Sub22_Sub18_Sub3.method3083(-578517745);
			return var4;
		}
	}

	public static boolean method295(Class106 var0, int var1, int var2, int var3) {
		byte[] var4 = var0.method1380(var1, var2, (byte) 122);
		if (var4 == null) {
			return false;
		} else {
			Class1.method53(var4, -1628090784);
			return true;
		}
	}

	static void method296(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7, int var8) {
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 22) {
			GameClient.anInt3028 = var6 * 1714664247;
			GameClient.anInt3140 = var7 * -1900329249;
			GameClient.anInt3031 = -114767238;
			GameClient.anInt3049 = 0;
			GameClient.anInt3153 = var0 * 1748897489;
			GameClient.anInt3154 = var1 * -2025568851;
			GameClient.aClass117_Sub14_Sub1_2961.method2932(4, 693728280);
			GameClient.aClass117_Sub14_Sub1_2961.method2042(var1 + Class117_Sub22_Sub19.anInt2468 * -771797447, (byte) 8);
			GameClient.aClass117_Sub14_Sub1_2961.method2042(var0 + Class117_Sub22_Sub20.anInt2497 * 544615727, (byte) 8);
			GameClient.aClass117_Sub14_Sub1_2961.method1996(var3, (byte) -111);
			GameClient.aClass117_Sub14_Sub1_2961.method2034(Class89.aBoolArray1050[82] ? 1 : 0, (byte) -12);
		}

		if (var2 == 3) {
			GameClient.anInt3028 = var6 * 1714664247;
			GameClient.anInt3140 = var7 * -1900329249;
			GameClient.anInt3031 = -114767238;
			GameClient.anInt3049 = 0;
			GameClient.anInt3153 = var0 * 1748897489;
			GameClient.anInt3154 = var1 * -2025568851;
			GameClient.aClass117_Sub14_Sub1_2961.method2932(155, 1924036184);
			GameClient.aClass117_Sub14_Sub1_2961.method2035(Class89.aBoolArray1050[82] ? 1 : 0, -2136352166);
			GameClient.aClass117_Sub14_Sub1_2961.method2209(var3 >> 14 & 32767, -2069472551);
			GameClient.aClass117_Sub14_Sub1_2961.method1996(var0 + Class117_Sub22_Sub20.anInt2497 * 544615727, (byte) -59);
			GameClient.aClass117_Sub14_Sub1_2961.method2068(Class117_Sub22_Sub19.anInt2468 * -771797447 + var1, (byte) 122);
		}

		if (var2 == 21) {
			GameClient.anInt3028 = var6 * 1714664247;
			GameClient.anInt3140 = var7 * -1900329249;
			GameClient.anInt3031 = -114767238;
			GameClient.anInt3049 = 0;
			GameClient.anInt3153 = var0 * 1748897489;
			GameClient.anInt3154 = var1 * -2025568851;
			GameClient.aClass117_Sub14_Sub1_2961.method2932(89, 1234164705);
			GameClient.aClass117_Sub14_Sub1_2961.method2209(Class117_Sub22_Sub20.anInt2497 * 544615727 + var0, -2069472551);
			GameClient.aClass117_Sub14_Sub1_2961.method1996(var1 + Class117_Sub22_Sub19.anInt2468 * -771797447, (byte) -114);
			GameClient.aClass117_Sub14_Sub1_2961.method1996(var3, (byte) -34);
			GameClient.aClass117_Sub14_Sub1_2961.method2126(Class89.aBoolArray1050[82] ? 1 : 0, 87425366);
		}

		if (var2 == 5) {
			GameClient.anInt3028 = var6 * 1714664247;
			GameClient.anInt3140 = var7 * -1900329249;
			GameClient.anInt3031 = -114767238;
			GameClient.anInt3049 = 0;
			GameClient.anInt3153 = var0 * 1748897489;
			GameClient.anInt3154 = var1 * -2025568851;
			GameClient.aClass117_Sub14_Sub1_2961.method2932(95, 553392779);
			GameClient.aClass117_Sub14_Sub1_2961.method2035(Class89.aBoolArray1050[82] ? 1 : 0, -1988021028);
			GameClient.aClass117_Sub14_Sub1_2961.method2068(Class117_Sub22_Sub19.anInt2468 * -771797447 + var1, (byte) 54);
			GameClient.aClass117_Sub14_Sub1_2961.method2068(var3 >> 14 & 32767, (byte) 26);
			GameClient.aClass117_Sub14_Sub1_2961.method2209(var0 + Class117_Sub22_Sub20.anInt2497 * 544615727, -2069472551);
		}

		if (var2 == 16) {
			GameClient.anInt3028 = var6 * 1714664247;
			GameClient.anInt3140 = var7 * -1900329249;
			GameClient.anInt3031 = -114767238;
			GameClient.anInt3049 = 0;
			GameClient.anInt3153 = var0 * 1748897489;
			GameClient.anInt3154 = var1 * -2025568851;
			GameClient.aClass117_Sub14_Sub1_2961.method2932(200, 449117018);
			GameClient.aClass117_Sub14_Sub1_2961.method2068(var0 + Class117_Sub22_Sub20.anInt2497 * 544615727, (byte) 90);
			GameClient.aClass117_Sub14_Sub1_2961.method2209(GameClient.anInt2995 * -1650603479, -2069472551);
			GameClient.aClass117_Sub14_Sub1_2961.method2068(var3, (byte) 43);
			GameClient.aClass117_Sub14_Sub1_2961.method2042(var1 + Class117_Sub22_Sub19.anInt2468 * -771797447, (byte) 8);
			GameClient.aClass117_Sub14_Sub1_2961.method2009(Class82.anInt978 * 240984047, -1777442703);
			GameClient.aClass117_Sub14_Sub1_2961.method1996(Class117_Sub22_Sub20.anInt2495 * 621320165, (byte) -92);
			GameClient.aClass117_Sub14_Sub1_2961.method2035(Class89.aBoolArray1050[82] ? 1 : 0, -1903946069);
		}

		Player var9;
		if (var2 == 14) {
			var9 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var3];
			if (var9 != null) {
				GameClient.anInt3028 = var6 * 1714664247;
				GameClient.anInt3140 = var7 * -1900329249;
				GameClient.anInt3031 = -114767238;
				GameClient.anInt3049 = 0;
				GameClient.anInt3153 = var0 * 1748897489;
				GameClient.anInt3154 = var1 * -2025568851;
				GameClient.aClass117_Sub14_Sub1_2961.method2932(85, 1048189200);
				GameClient.aClass117_Sub14_Sub1_2961.method2209(var3, -2069472551);
				GameClient.aClass117_Sub14_Sub1_2961.method2024(Class89.aBoolArray1050[82] ? 1 : 0, -2066160775);
				GameClient.aClass117_Sub14_Sub1_2961.method2042(GameClient.anInt2995 * -1650603479, (byte) 8);
				GameClient.aClass117_Sub14_Sub1_2961.method2042(Class117_Sub22_Sub20.anInt2495 * 621320165, (byte) 8);
				GameClient.aClass117_Sub14_Sub1_2961.method2053(Class82.anInt978 * 240984047, 734640632);
			}
		}

		if (var2 == 31) {
			GameClient.aClass117_Sub14_Sub1_2961.method2932(212, 850362606);
			GameClient.aClass117_Sub14_Sub1_2961.method2053(var1, 734640632);
			GameClient.aClass117_Sub14_Sub1_2961.method1996(var0, (byte) -102);
			GameClient.aClass117_Sub14_Sub1_2961.method2209(GameClient.anInt2995 * -1650603479, -2069472551);
			GameClient.aClass117_Sub14_Sub1_2961.method2042(Class117_Sub22_Sub20.anInt2495 * 621320165, (byte) 8);
			GameClient.aClass117_Sub14_Sub1_2961.method2009(Class82.anInt978 * 240984047, -1777442703);
			GameClient.aClass117_Sub14_Sub1_2961.method2042(var3, (byte) 8);
			GameClient.anInt3032 = 0;
			Class26.aClass117_Sub19_333 = Class74.method1010(var1, -1809093138);
			GameClient.anInt3033 = var0 * 1496757531;
		}

		if (var2 == 19) {
			GameClient.anInt3028 = var6 * 1714664247;
			GameClient.anInt3140 = var7 * -1900329249;
			GameClient.anInt3031 = -114767238;
			GameClient.anInt3049 = 0;
			GameClient.anInt3153 = var0 * 1748897489;
			GameClient.anInt3154 = var1 * -2025568851;
			GameClient.aClass117_Sub14_Sub1_2961.method2932(149, -336095764);
			GameClient.aClass117_Sub14_Sub1_2961.method2068(var3, (byte) 126);
			GameClient.aClass117_Sub14_Sub1_2961.method2042(var0 + Class117_Sub22_Sub20.anInt2497 * 544615727, (byte) 8);
			GameClient.aClass117_Sub14_Sub1_2961.method2126(Class89.aBoolArray1050[82] ? 1 : 0, 1446242199);
			GameClient.aClass117_Sub14_Sub1_2961.method1996(Class117_Sub22_Sub19.anInt2468 * -771797447 + var1, (byte) -62);
		}

		int var15;
		Class117_Sub19 var17;
		if (var2 == 29) {
			GameClient.aClass117_Sub14_Sub1_2961.method2932(116, 268255152);
			GameClient.aClass117_Sub14_Sub1_2961.method2183(var1, (byte) 72);
			var17 = Class74.method1010(var1, -1591339258);
			if (var17.anIntArrayArray2059 != null && var17.anIntArrayArray2059[0][0] == 5) {
				var15 = var17.anIntArrayArray2059[0][1];
				if (var17.anIntArray2085[0] != Class97.anIntArray1129[var15]) {
					Class97.anIntArray1129[var15] = var17.anIntArray2085[0];
					Class117_Sub22_Sub13.method2631(var15, (byte) 54);
				}
			}
		}

		if (var2 == 24) {
			var17 = Class74.method1010(var1, -1675813682);
			boolean var19 = true;
			if (var17.anInt2018 * 2064823433 > 0) {
				var19 = Class56.method853(var17, -1867470626);
			}

			if (var19) {
				GameClient.aClass117_Sub14_Sub1_2961.method2932(116, 171915805);
				GameClient.aClass117_Sub14_Sub1_2961.method2183(var1, (byte) 109);
			}
		}

		if (var2 == 25) {
			var17 = Class23.method368(var1, var0, 1023461230);
			if (var17 != null) {
				Class31.method466(-585341396);
				int var13 = Class67.method961(var17, -268552528);
				int var14 = var13 >> 11 & 63;
				Class30.method422(var1, var0, var14, var17.anInt2091 * -828631679, (byte) -91);
				GameClient.anInt3071 = 0;
				int var11 = Class67.method961(var17, -161416502);
				int var12 = var11 >> 11 & 63;
				String var10;
				if (var12 == 0) {
					var10 = null;
				} else if (var17.aString2050 != null && var17.aString2050.trim().length() != 0) {
					var10 = var17.aString2050;
				} else {
					var10 = null;
				}

				GameClient.aString2931 = var10;
				if (GameClient.aString2931 == null) {
					GameClient.aString2931 = "Null";
				}

				if (var17.aBool2061) {
					GameClient.aString3078 = var17.aString1964 + Class117_Sub22_Sub12.method2584(16777215, 668388556);
				} else {
					GameClient.aString3078 = Class117_Sub22_Sub12.method2584(65280, 668388556) + var17.aString2030 + Class117_Sub22_Sub12.method2584(16777215, 668388556);
				}
			}

		} else {
			if (var2 == 1004) {
				GameClient.anInt3028 = var6 * 1714664247;
				GameClient.anInt3140 = var7 * -1900329249;
				GameClient.anInt3031 = -114767238;
				GameClient.anInt3049 = 0;
				GameClient.aClass117_Sub14_Sub1_2961.method2932(79, -399657304);
				GameClient.aClass117_Sub14_Sub1_2961.method2068(var3, (byte) 100);
			}

			if (var2 == 58) {
				var17 = Class23.method368(var1, var0, 945722893);
				if (var17 != null) {
					GameClient.aClass117_Sub14_Sub1_2961.method2932(174, 429119835);
					GameClient.aClass117_Sub14_Sub1_2961.method1996(var17.anInt2091 * -828631679, (byte) -119);
					GameClient.aClass117_Sub14_Sub1_2961.method2068(var0, (byte) 121);
					GameClient.aClass117_Sub14_Sub1_2961.method2009(RuntimeException_Sub1.anInt2835 * -1977023109, -1777442703);
					GameClient.aClass117_Sub14_Sub1_2961.method2068(GameClient.anInt3075 * 1861520895, (byte) 9);
					GameClient.aClass117_Sub14_Sub1_2961.method1996(GameClient.anInt3076 * -1355274417, (byte) -2);
					GameClient.aClass117_Sub14_Sub1_2961.method2054(var1, 329981728);
				}
			}

			if (var2 == 23) {
				Class117_Sub13.aClass42_1875.method576(Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, var0, var1);
			}

			Class117_Sub22_Sub18_Sub1_Sub1 var18;
			if (var2 == 7) {
				var18 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[var3];
				if (var18 != null) {
					GameClient.anInt3028 = var6 * 1714664247;
					GameClient.anInt3140 = var7 * -1900329249;
					GameClient.anInt3031 = -114767238;
					GameClient.anInt3049 = 0;
					GameClient.anInt3153 = var0 * 1748897489;
					GameClient.anInt3154 = var1 * -2025568851;
					GameClient.aClass117_Sub14_Sub1_2961.method2932(53, 705411670);
					GameClient.aClass117_Sub14_Sub1_2961.method2042(var3, (byte) 8);
					GameClient.aClass117_Sub14_Sub1_2961.method2054(Class82.anInt978 * 240984047, 329981728);
					GameClient.aClass117_Sub14_Sub1_2961.method1996(GameClient.anInt2995 * -1650603479, (byte) -85);
					GameClient.aClass117_Sub14_Sub1_2961.method2126(Class89.aBoolArray1050[82] ? 1 : 0, 1580097459);
					GameClient.aClass117_Sub14_Sub1_2961.method2042(Class117_Sub22_Sub20.anInt2495 * 621320165, (byte) 8);
				}
			}

			if (var2 == 8) {
				var18 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[var3];
				if (var18 != null) {
					GameClient.anInt3028 = var6 * 1714664247;
					GameClient.anInt3140 = var7 * -1900329249;
					GameClient.anInt3031 = -114767238;
					GameClient.anInt3049 = 0;
					GameClient.anInt3153 = var0 * 1748897489;
					GameClient.anInt3154 = var1 * -2025568851;
					GameClient.aClass117_Sub14_Sub1_2961.method2932(124, 56241902);
					GameClient.aClass117_Sub14_Sub1_2961.method2042(GameClient.anInt3075 * 1861520895, (byte) 8);
					GameClient.aClass117_Sub14_Sub1_2961.method2053(RuntimeException_Sub1.anInt2835 * -1977023109, 734640632);
					GameClient.aClass117_Sub14_Sub1_2961.method2042(var3, (byte) 8);
					GameClient.aClass117_Sub14_Sub1_2961.method2024(Class89.aBoolArray1050[82] ? 1 : 0, -1551433736);
				}
			}

			if (var2 == 1) {
				GameClient.anInt3028 = var6 * 1714664247;
				GameClient.anInt3140 = var7 * -1900329249;
				GameClient.anInt3031 = -114767238;
				GameClient.anInt3049 = 0;
				GameClient.anInt3153 = var0 * 1748897489;
				GameClient.anInt3154 = var1 * -2025568851;
				GameClient.aClass117_Sub14_Sub1_2961.method2932(154, 1081133660);
				GameClient.aClass117_Sub14_Sub1_2961.method1996(Class117_Sub22_Sub20.anInt2497 * 544615727 + var0, (byte) -6);
				GameClient.aClass117_Sub14_Sub1_2961.method2035(Class89.aBoolArray1050[82] ? 1 : 0, -1846278158);
				GameClient.aClass117_Sub14_Sub1_2961.method1996(GameClient.anInt2995 * -1650603479, (byte) -20);
				GameClient.aClass117_Sub14_Sub1_2961.method2068(var1 + Class117_Sub22_Sub19.anInt2468 * -771797447, (byte) 47);
				GameClient.aClass117_Sub14_Sub1_2961.method1996(Class117_Sub22_Sub20.anInt2495 * 621320165, (byte) -76);
				GameClient.aClass117_Sub14_Sub1_2961.method2068(var3 >> 14 & 32767, (byte) 38);
				GameClient.aClass117_Sub14_Sub1_2961.method2054(Class82.anInt978 * 240984047, 329981728);
			}

			if (var2 == 43) {
				GameClient.aClass117_Sub14_Sub1_2961.method2932(135, 985345049);
				GameClient.aClass117_Sub14_Sub1_2961.method2054(var1, 329981728);
				GameClient.aClass117_Sub14_Sub1_2961.method2042(var0, (byte) 8);
				GameClient.aClass117_Sub14_Sub1_2961.method2042(var3, (byte) 8);
				GameClient.anInt3032 = 0;
				Class26.aClass117_Sub19_333 = Class74.method1010(var1, -1524697340);
				GameClient.anInt3033 = var0 * 1496757531;
			}

			if (var2 == 11) {
				var18 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[var3];
				if (var18 != null) {
					GameClient.anInt3028 = var6 * 1714664247;
					GameClient.anInt3140 = var7 * -1900329249;
					GameClient.anInt3031 = -114767238;
					GameClient.anInt3049 = 0;
					GameClient.anInt3153 = var0 * 1748897489;
					GameClient.anInt3154 = var1 * -2025568851;
					GameClient.aClass117_Sub14_Sub1_2961.method2932(132, 2129674877);
					GameClient.aClass117_Sub14_Sub1_2961.method2035(Class89.aBoolArray1050[82] ? 1 : 0, -1512508573);
					GameClient.aClass117_Sub14_Sub1_2961.method2209(var3, -2069472551);
				}
			}

			if (var2 == 28) {
				GameClient.aClass117_Sub14_Sub1_2961.method2932(116, 464782595);
				GameClient.aClass117_Sub14_Sub1_2961.method2183(var1, (byte) 35);
				var17 = Class74.method1010(var1, -662311079);
				if (var17.anIntArrayArray2059 != null && var17.anIntArrayArray2059[0][0] == 5) {
					var15 = var17.anIntArrayArray2059[0][1];
					Class97.anIntArray1129[var15] = 1 - Class97.anIntArray1129[var15];
					Class117_Sub22_Sub13.method2631(var15, (byte) 82);
				}
			}

			if (var2 == 20) {
				GameClient.anInt3028 = var6 * 1714664247;
				GameClient.anInt3140 = var7 * -1900329249;
				GameClient.anInt3031 = -114767238;
				GameClient.anInt3049 = 0;
				GameClient.anInt3153 = var0 * 1748897489;
				GameClient.anInt3154 = var1 * -2025568851;
				GameClient.aClass117_Sub14_Sub1_2961.method2932(3, -353648670);
				GameClient.aClass117_Sub14_Sub1_2961.method2068(var3, (byte) 127);
				GameClient.aClass117_Sub14_Sub1_2961.method2126(Class89.aBoolArray1050[82] ? 1 : 0, 1134262126);
				GameClient.aClass117_Sub14_Sub1_2961.method2068(Class117_Sub22_Sub20.anInt2497 * 544615727 + var0, (byte) 21);
				GameClient.aClass117_Sub14_Sub1_2961.method2068(var1 + Class117_Sub22_Sub19.anInt2468 * -771797447, (byte) 111);
			}

			if (var2 == 57 || var2 == 1007) {
				var17 = Class23.method368(var1, var0, 1538184129);
				if (var17 != null) {
					Class117_Sub12.method1977(var3, var1, var0, var17.anInt2091 * -828631679, var5, 1118729948);
				}
			}

			if (var2 == 4) {
				GameClient.anInt3028 = var6 * 1714664247;
				GameClient.anInt3140 = var7 * -1900329249;
				GameClient.anInt3031 = -114767238;
				GameClient.anInt3049 = 0;
				GameClient.anInt3153 = var0 * 1748897489;
				GameClient.anInt3154 = var1 * -2025568851;
				GameClient.aClass117_Sub14_Sub1_2961.method2932(215, 911776514);
				GameClient.aClass117_Sub14_Sub1_2961.method1996(var3 >> 14 & 32767, (byte) -70);
				GameClient.aClass117_Sub14_Sub1_2961.method2024(Class89.aBoolArray1050[82] ? 1 : 0, -1388197861);
				GameClient.aClass117_Sub14_Sub1_2961.method1996(var0 + Class117_Sub22_Sub20.anInt2497 * 544615727, (byte) -5);
				GameClient.aClass117_Sub14_Sub1_2961.method2209(Class117_Sub22_Sub19.anInt2468 * -771797447 + var1, -2069472551);
			}

			if (var2 == 17) {
				GameClient.anInt3028 = var6 * 1714664247;
				GameClient.anInt3140 = var7 * -1900329249;
				GameClient.anInt3031 = -114767238;
				GameClient.anInt3049 = 0;
				GameClient.anInt3153 = var0 * 1748897489;
				GameClient.anInt3154 = var1 * -2025568851;
				GameClient.aClass117_Sub14_Sub1_2961.method2932(239, 504661239);
				GameClient.aClass117_Sub14_Sub1_2961.method1996(GameClient.anInt3075 * 1861520895, (byte) -116);
				GameClient.aClass117_Sub14_Sub1_2961.method2068(Class117_Sub22_Sub19.anInt2468 * -771797447 + var1, (byte) 50);
				GameClient.aClass117_Sub14_Sub1_2961.method2009(RuntimeException_Sub1.anInt2835 * -1977023109, -1777442703);
				GameClient.aClass117_Sub14_Sub1_2961.method2042(var3, (byte) 8);
				GameClient.aClass117_Sub14_Sub1_2961.method1996(var0 + Class117_Sub22_Sub20.anInt2497 * 544615727, (byte) -40);
				GameClient.aClass117_Sub14_Sub1_2961.method2034(Class89.aBoolArray1050[82] ? 1 : 0, (byte) -13);
			}

			if (var2 == 38) {
				Class31.method466(-585341396);
				var17 = Class74.method1010(var1, -2084143208);
				GameClient.anInt3071 = -1358201149;
				Class117_Sub22_Sub20.anInt2495 = var0 * -1489646099;
				Class82.anInt978 = var1 * -654971121;
				GameClient.anInt2995 = var3 * 522809881;
				Class54.method850(var17, (byte) 0);
				GameClient.aString3058 = Class117_Sub22_Sub12.method2584(16748608, 668388556) + Class117_Sub13.method1992(var3, 1875295987).aString2264 + Class117_Sub22_Sub12.method2584(16777215, 668388556);
				if (GameClient.aString3058 == null) {
					GameClient.aString3058 = "null";
				}

			} else {
				if (var2 == 50) {
					var9 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var3];
					if (var9 != null) {
						GameClient.anInt3028 = var6 * 1714664247;
						GameClient.anInt3140 = var7 * -1900329249;
						GameClient.anInt3031 = -114767238;
						GameClient.anInt3049 = 0;
						GameClient.anInt3153 = var0 * 1748897489;
						GameClient.anInt3154 = var1 * -2025568851;
						GameClient.aClass117_Sub14_Sub1_2961.method2932(107, 813250037);
						GameClient.aClass117_Sub14_Sub1_2961.method2042(var3, (byte) 8);
						GameClient.aClass117_Sub14_Sub1_2961.method2126(Class89.aBoolArray1050[82] ? 1 : 0, -108522357);
					}
				}

				if (var2 == 10) {
					var18 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[var3];
					if (var18 != null) {
						GameClient.anInt3028 = var6 * 1714664247;
						GameClient.anInt3140 = var7 * -1900329249;
						GameClient.anInt3031 = -114767238;
						GameClient.anInt3049 = 0;
						GameClient.anInt3153 = var0 * 1748897489;
						GameClient.anInt3154 = var1 * -2025568851;
						GameClient.aClass117_Sub14_Sub1_2961.method2932(185, 1411644611);
						GameClient.aClass117_Sub14_Sub1_2961.method2034(Class89.aBoolArray1050[82] ? 1 : 0, (byte) -92);
						GameClient.aClass117_Sub14_Sub1_2961.method1996(var3, (byte) -39);
					}
				}

				if (var2 == 47) {
					var9 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var3];
					if (var9 != null) {
						GameClient.anInt3028 = var6 * 1714664247;
						GameClient.anInt3140 = var7 * -1900329249;
						GameClient.anInt3031 = -114767238;
						GameClient.anInt3049 = 0;
						GameClient.anInt3153 = var0 * 1748897489;
						GameClient.anInt3154 = var1 * -2025568851;
						GameClient.aClass117_Sub14_Sub1_2961.method2932(142, 224069456);
						GameClient.aClass117_Sub14_Sub1_2961.method2034(Class89.aBoolArray1050[82] ? 1 : 0, (byte) -118);
						GameClient.aClass117_Sub14_Sub1_2961.method2209(var3, -2069472551);
					}
				}

				if (var2 == 13) {
					var18 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[var3];
					if (var18 != null) {
						GameClient.anInt3028 = var6 * 1714664247;
						GameClient.anInt3140 = var7 * -1900329249;
						GameClient.anInt3031 = -114767238;
						GameClient.anInt3049 = 0;
						GameClient.anInt3153 = var0 * 1748897489;
						GameClient.anInt3154 = var1 * -2025568851;
						GameClient.aClass117_Sub14_Sub1_2961.method2932(69, 891606843);
						GameClient.aClass117_Sub14_Sub1_2961.method2126(Class89.aBoolArray1050[82] ? 1 : 0, 1936007385);
						GameClient.aClass117_Sub14_Sub1_2961.method2042(var3, (byte) 8);
					}
				}

				if (var2 == 15) {
					var9 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var3];
					if (var9 != null) {
						GameClient.anInt3028 = var6 * 1714664247;
						GameClient.anInt3140 = var7 * -1900329249;
						GameClient.anInt3031 = -114767238;
						GameClient.anInt3049 = 0;
						GameClient.anInt3153 = var0 * 1748897489;
						GameClient.anInt3154 = var1 * -2025568851;
						GameClient.aClass117_Sub14_Sub1_2961.method2932(68, 1918460113);
						GameClient.aClass117_Sub14_Sub1_2961.method2042(var3, (byte) 8);
						GameClient.aClass117_Sub14_Sub1_2961.method2009(RuntimeException_Sub1.anInt2835 * -1977023109, -1777442703);
						GameClient.aClass117_Sub14_Sub1_2961.method2024(Class89.aBoolArray1050[82] ? 1 : 0, -1829668051);
						GameClient.aClass117_Sub14_Sub1_2961.method1996(GameClient.anInt3075 * 1861520895, (byte) -24);
					}
				}

				if (var2 == 40) {
					GameClient.aClass117_Sub14_Sub1_2961.method2932(143, 563700560);
					GameClient.aClass117_Sub14_Sub1_2961.method1996(var3, (byte) -89);
					GameClient.aClass117_Sub14_Sub1_2961.method2183(var1, (byte) 95);
					GameClient.aClass117_Sub14_Sub1_2961.method2209(var0, -2069472551);
					GameClient.anInt3032 = 0;
					Class26.aClass117_Sub19_333 = Class74.method1010(var1, -1216388586);
					GameClient.anInt3033 = var0 * 1496757531;
				}

				if (var2 == 9) {
					var18 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[var3];
					if (var18 != null) {
						GameClient.anInt3028 = var6 * 1714664247;
						GameClient.anInt3140 = var7 * -1900329249;
						GameClient.anInt3031 = -114767238;
						GameClient.anInt3049 = 0;
						GameClient.anInt3153 = var0 * 1748897489;
						GameClient.anInt3154 = var1 * -2025568851;
						GameClient.aClass117_Sub14_Sub1_2961.method2932(165, 524143138);
						GameClient.aClass117_Sub14_Sub1_2961.method2068(var3, (byte) 12);
						GameClient.aClass117_Sub14_Sub1_2961.method2126(Class89.aBoolArray1050[82] ? 1 : 0, 2033522631);
					}
				}

				if (var2 == 36) {
					GameClient.aClass117_Sub14_Sub1_2961.method2932(108, 321995970);
					GameClient.aClass117_Sub14_Sub1_2961.method2042(var3, (byte) 8);
					GameClient.aClass117_Sub14_Sub1_2961.method2068(var0, (byte) 98);
					GameClient.aClass117_Sub14_Sub1_2961.method2009(var1, -1777442703);
					GameClient.anInt3032 = 0;
					Class26.aClass117_Sub19_333 = Class74.method1010(var1, -1479342659);
					GameClient.anInt3033 = var0 * 1496757531;
				}

				if (var2 == 32) {
					GameClient.aClass117_Sub14_Sub1_2961.method2932(40, 629329670);
					GameClient.aClass117_Sub14_Sub1_2961.method2068(GameClient.anInt3075 * 1861520895, (byte) 22);
					GameClient.aClass117_Sub14_Sub1_2961.method2068(var0, (byte) 18);
					GameClient.aClass117_Sub14_Sub1_2961.method1996(var3, (byte) -103);
					GameClient.aClass117_Sub14_Sub1_2961.method2053(RuntimeException_Sub1.anInt2835 * -1977023109, 734640632);
					GameClient.aClass117_Sub14_Sub1_2961.method2053(var1, 734640632);
					GameClient.anInt3032 = 0;
					Class26.aClass117_Sub19_333 = Class74.method1010(var1, -2086620824);
					GameClient.anInt3033 = var0 * 1496757531;
				}

				if (var2 == 49) {
					var9 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var3];
					if (var9 != null) {
						GameClient.anInt3028 = var6 * 1714664247;
						GameClient.anInt3140 = var7 * -1900329249;
						GameClient.anInt3031 = -114767238;
						GameClient.anInt3049 = 0;
						GameClient.anInt3153 = var0 * 1748897489;
						GameClient.anInt3154 = var1 * -2025568851;
						GameClient.aClass117_Sub14_Sub1_2961.method2932(153, 536213434);
						GameClient.aClass117_Sub14_Sub1_2961.method2034(Class89.aBoolArray1050[82] ? 1 : 0, (byte) -82);
						GameClient.aClass117_Sub14_Sub1_2961.method2209(var3, -2069472551);
					}
				}

				if (var2 == 1002) {
					GameClient.anInt3028 = var6 * 1714664247;
					GameClient.anInt3140 = var7 * -1900329249;
					GameClient.anInt3031 = -114767238;
					GameClient.anInt3049 = 0;
					GameClient.aClass117_Sub14_Sub1_2961.method2932(216, -423584743);
					GameClient.aClass117_Sub14_Sub1_2961.method2209(var3 >> 14 & 32767, -2069472551);
				}

				if (var2 == 41) {
					GameClient.aClass117_Sub14_Sub1_2961.method2932(247, -343198182);
					GameClient.aClass117_Sub14_Sub1_2961.method2042(var3, (byte) 8);
					GameClient.aClass117_Sub14_Sub1_2961.method2053(var1, 734640632);
					GameClient.aClass117_Sub14_Sub1_2961.method1996(var0, (byte) -41);
					GameClient.anInt3032 = 0;
					Class26.aClass117_Sub19_333 = Class74.method1010(var1, -1974585628);
					GameClient.anInt3033 = var0 * 1496757531;
				}

				if (var2 == 51) {
					var9 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var3];
					if (var9 != null) {
						GameClient.anInt3028 = var6 * 1714664247;
						GameClient.anInt3140 = var7 * -1900329249;
						GameClient.anInt3031 = -114767238;
						GameClient.anInt3049 = 0;
						GameClient.anInt3153 = var0 * 1748897489;
						GameClient.anInt3154 = var1 * -2025568851;
						GameClient.aClass117_Sub14_Sub1_2961.method2932(170, 824606646);
						GameClient.aClass117_Sub14_Sub1_2961.method1996(var3, (byte) -118);
						GameClient.aClass117_Sub14_Sub1_2961.method2035(Class89.aBoolArray1050[82] ? 1 : 0, -1681085418);
					}
				}

				if (var2 == 34) {
					GameClient.aClass117_Sub14_Sub1_2961.method2932(172, 1473204966);
					GameClient.aClass117_Sub14_Sub1_2961.method2068(var3, (byte) 98);
					GameClient.aClass117_Sub14_Sub1_2961.method2183(var1, (byte) 22);
					GameClient.aClass117_Sub14_Sub1_2961.method2068(var0, (byte) 112);
					GameClient.anInt3032 = 0;
					Class26.aClass117_Sub19_333 = Class74.method1010(var1, -1965834056);
					GameClient.anInt3033 = var0 * 1496757531;
				}

				if (var2 == 12) {
					var18 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[var3];
					if (var18 != null) {
						GameClient.anInt3028 = var6 * 1714664247;
						GameClient.anInt3140 = var7 * -1900329249;
						GameClient.anInt3031 = -114767238;
						GameClient.anInt3049 = 0;
						GameClient.anInt3153 = var0 * 1748897489;
						GameClient.anInt3154 = var1 * -2025568851;
						GameClient.aClass117_Sub14_Sub1_2961.method2932(30, 1034250260);
						GameClient.aClass117_Sub14_Sub1_2961.method2209(var3, -2069472551);
						GameClient.aClass117_Sub14_Sub1_2961.method2126(Class89.aBoolArray1050[82] ? 1 : 0, 49969027);
					}
				}

				if (var2 == 37) {
					GameClient.aClass117_Sub14_Sub1_2961.method2932(94, 715637038);
					GameClient.aClass117_Sub14_Sub1_2961.method2068(var3, (byte) 44);
					GameClient.aClass117_Sub14_Sub1_2961.method2209(var0, -2069472551);
					GameClient.aClass117_Sub14_Sub1_2961.method2054(var1, 329981728);
					GameClient.anInt3032 = 0;
					Class26.aClass117_Sub19_333 = Class74.method1010(var1, -1035511269);
					GameClient.anInt3033 = var0 * 1496757531;
				}

				if (var2 == 44) {
					var9 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var3];
					if (var9 != null) {
						GameClient.anInt3028 = var6 * 1714664247;
						GameClient.anInt3140 = var7 * -1900329249;
						GameClient.anInt3031 = -114767238;
						GameClient.anInt3049 = 0;
						GameClient.anInt3153 = var0 * 1748897489;
						GameClient.anInt3154 = var1 * -2025568851;
						GameClient.aClass117_Sub14_Sub1_2961.method2932(208, 1308198333);
						GameClient.aClass117_Sub14_Sub1_2961.method2024(Class89.aBoolArray1050[82] ? 1 : 0, -1934626243);
						GameClient.aClass117_Sub14_Sub1_2961.method1996(var3, (byte) -47);
					}
				}

				if (var2 == 42) {
					GameClient.aClass117_Sub14_Sub1_2961.method2932(138, -74240773);
					GameClient.aClass117_Sub14_Sub1_2961.method2209(var0, -2069472551);
					GameClient.aClass117_Sub14_Sub1_2961.method2183(var1, (byte) 19);
					GameClient.aClass117_Sub14_Sub1_2961.method2042(var3, (byte) 8);
					GameClient.anInt3032 = 0;
					Class26.aClass117_Sub19_333 = Class74.method1010(var1, -1085925095);
					GameClient.anInt3033 = var0 * 1496757531;
				}

				if (var2 == 2) {
					GameClient.anInt3028 = var6 * 1714664247;
					GameClient.anInt3140 = var7 * -1900329249;
					GameClient.anInt3031 = -114767238;
					GameClient.anInt3049 = 0;
					GameClient.anInt3153 = var0 * 1748897489;
					GameClient.anInt3154 = var1 * -2025568851;
					GameClient.aClass117_Sub14_Sub1_2961.method2932(206, 704679326);
					GameClient.aClass117_Sub14_Sub1_2961.method2068(var0 + Class117_Sub22_Sub20.anInt2497 * 544615727, (byte) 12);
					GameClient.aClass117_Sub14_Sub1_2961.method2054(RuntimeException_Sub1.anInt2835 * -1977023109, 329981728);
					GameClient.aClass117_Sub14_Sub1_2961.method2209(var3 >> 14 & 32767, -2069472551);
					GameClient.aClass117_Sub14_Sub1_2961.method2042(GameClient.anInt3075 * 1861520895, (byte) 8);
					GameClient.aClass117_Sub14_Sub1_2961.method2042(var1 + Class117_Sub22_Sub19.anInt2468 * -771797447, (byte) 8);
					GameClient.aClass117_Sub14_Sub1_2961.method2024(Class89.aBoolArray1050[82] ? 1 : 0, -2097129772);
				}

				if (var2 == 6) {
					GameClient.anInt3028 = var6 * 1714664247;
					GameClient.anInt3140 = var7 * -1900329249;
					GameClient.anInt3031 = -114767238;
					GameClient.anInt3049 = 0;
					GameClient.anInt3153 = var0 * 1748897489;
					GameClient.anInt3154 = var1 * -2025568851;
					GameClient.aClass117_Sub14_Sub1_2961.method2932(33, 1533769688);
					GameClient.aClass117_Sub14_Sub1_2961.method2042(Class117_Sub22_Sub19.anInt2468 * -771797447 + var1, (byte) 8);
					GameClient.aClass117_Sub14_Sub1_2961.method2126(Class89.aBoolArray1050[82] ? 1 : 0, 392922956);
					GameClient.aClass117_Sub14_Sub1_2961.method2042(Class117_Sub22_Sub20.anInt2497 * 544615727 + var0, (byte) 8);
					GameClient.aClass117_Sub14_Sub1_2961.method2209(var3 >> 14 & 32767, -2069472551);
				}

				if (var2 == 35) {
					GameClient.aClass117_Sub14_Sub1_2961.method2932(24, 686906250);
					GameClient.aClass117_Sub14_Sub1_2961.method2183(var1, (byte) 100);
					GameClient.aClass117_Sub14_Sub1_2961.method1996(var3, (byte) -70);
					GameClient.aClass117_Sub14_Sub1_2961.method2042(var0, (byte) 8);
					GameClient.anInt3032 = 0;
					Class26.aClass117_Sub19_333 = Class74.method1010(var1, -1797844896);
					GameClient.anInt3033 = var0 * 1496757531;
				}

				if (var2 == 45) {
					var9 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var3];
					if (var9 != null) {
						GameClient.anInt3028 = var6 * 1714664247;
						GameClient.anInt3140 = var7 * -1900329249;
						GameClient.anInt3031 = -114767238;
						GameClient.anInt3049 = 0;
						GameClient.anInt3153 = var0 * 1748897489;
						GameClient.anInt3154 = var1 * -2025568851;
						GameClient.aClass117_Sub14_Sub1_2961.method2932(146, -93822920);
						GameClient.aClass117_Sub14_Sub1_2961.method2209(var3, -2069472551);
						GameClient.aClass117_Sub14_Sub1_2961.method2024(Class89.aBoolArray1050[82] ? 1 : 0, -1436855516);
					}
				}

				if (var2 == 30 && GameClient.aClass117_Sub19_3083 == null) {
					GameClient.aClass117_Sub14_Sub1_2961.method2932(177, 1934081819);
					GameClient.aClass117_Sub14_Sub1_2961.method2209(var0, -2069472551);
					GameClient.aClass117_Sub14_Sub1_2961.method2053(var1, 734640632);
					GameClient.aClass117_Sub19_3083 = Class23.method368(var1, var0, 203336918);
					Class54.method850(GameClient.aClass117_Sub19_3083, (byte) 0);
				}

				if (var2 == 18) {
					GameClient.anInt3028 = var6 * 1714664247;
					GameClient.anInt3140 = var7 * -1900329249;
					GameClient.anInt3031 = -114767238;
					GameClient.anInt3049 = 0;
					GameClient.anInt3153 = var0 * 1748897489;
					GameClient.anInt3154 = var1 * -2025568851;
					GameClient.aClass117_Sub14_Sub1_2961.method2932(210, -30811039);
					GameClient.aClass117_Sub14_Sub1_2961.method2209(var0 + Class117_Sub22_Sub20.anInt2497 * 544615727, -2069472551);
					GameClient.aClass117_Sub14_Sub1_2961.method2126(Class89.aBoolArray1050[82] ? 1 : 0, 841549241);
					GameClient.aClass117_Sub14_Sub1_2961.method2068(var1 + Class117_Sub22_Sub19.anInt2468 * -771797447, (byte) 58);
					GameClient.aClass117_Sub14_Sub1_2961.method2042(var3, (byte) 8);
				}

				if (var2 == 48) {
					var9 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var3];
					if (var9 != null) {
						GameClient.anInt3028 = var6 * 1714664247;
						GameClient.anInt3140 = var7 * -1900329249;
						GameClient.anInt3031 = -114767238;
						GameClient.anInt3049 = 0;
						GameClient.anInt3153 = var0 * 1748897489;
						GameClient.anInt3154 = var1 * -2025568851;
						GameClient.aClass117_Sub14_Sub1_2961.method2932(28, 389420249);
						GameClient.aClass117_Sub14_Sub1_2961.method1996(var3, (byte) -121);
						GameClient.aClass117_Sub14_Sub1_2961.method2035(Class89.aBoolArray1050[82] ? 1 : 0, -1458499685);
					}
				}

				if (var2 == 39) {
					GameClient.aClass117_Sub14_Sub1_2961.method2932(159, 1860338544);
					GameClient.aClass117_Sub14_Sub1_2961.method2053(var1, 734640632);
					GameClient.aClass117_Sub14_Sub1_2961.method2042(var3, (byte) 8);
					GameClient.aClass117_Sub14_Sub1_2961.method2042(var0, (byte) 8);
					GameClient.anInt3032 = 0;
					Class26.aClass117_Sub19_333 = Class74.method1010(var1, -1178542744);
					GameClient.anInt3033 = var0 * 1496757531;
				}

				if (var2 == 1003) {
					GameClient.anInt3028 = var6 * 1714664247;
					GameClient.anInt3140 = var7 * -1900329249;
					GameClient.anInt3031 = -114767238;
					GameClient.anInt3049 = 0;
					var18 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[var3];
					if (var18 != null) {
						Class117_Sub22_Sub5 var20 = var18.aClass117_Sub22_Sub5_2864;
						if (var20.anIntArray2210 != null) {
							var20 = var20.method2394(1906324744);
						}

						if (var20 != null) {
							GameClient.aClass117_Sub14_Sub1_2961.method2932(235, -323407660);
							GameClient.aClass117_Sub14_Sub1_2961.method1996(var20.anInt2184 * -446840273, (byte) 5);
						}
					}
				}

				if (var2 == 46) {
					var9 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var3];
					if (var9 != null) {
						GameClient.anInt3028 = var6 * 1714664247;
						GameClient.anInt3140 = var7 * -1900329249;
						GameClient.anInt3031 = -114767238;
						GameClient.anInt3049 = 0;
						GameClient.anInt3153 = var0 * 1748897489;
						GameClient.anInt3154 = var1 * -2025568851;
						GameClient.aClass117_Sub14_Sub1_2961.method2932(224, 437350465);
						GameClient.aClass117_Sub14_Sub1_2961.method2126(Class89.aBoolArray1050[82] ? 1 : 0, 1598980312);
						GameClient.aClass117_Sub14_Sub1_2961.method2209(var3, -2069472551);
					}
				}

				if (var2 == 1001) {
					GameClient.anInt3028 = var6 * 1714664247;
					GameClient.anInt3140 = var7 * -1900329249;
					GameClient.anInt3031 = -114767238;
					GameClient.anInt3049 = 0;
					GameClient.anInt3153 = var0 * 1748897489;
					GameClient.anInt3154 = var1 * -2025568851;
					GameClient.aClass117_Sub14_Sub1_2961.method2932(241, 964823845);
					GameClient.aClass117_Sub14_Sub1_2961.method2035(Class89.aBoolArray1050[82] ? 1 : 0, -1453721102);
					GameClient.aClass117_Sub14_Sub1_2961.method2042(var1 + Class117_Sub22_Sub19.anInt2468 * -771797447, (byte) 8);
					GameClient.aClass117_Sub14_Sub1_2961.method2068(var0 + Class117_Sub22_Sub20.anInt2497 * 544615727, (byte) 87);
					GameClient.aClass117_Sub14_Sub1_2961.method2209(var3 >> 14 & 32767, -2069472551);
				}

				if (var2 == 26) {
					Class117_Sub22_Sub7.method2480(557389619);
				}

				if (var2 == 33) {
					GameClient.aClass117_Sub14_Sub1_2961.method2932(227, 306488361);
					GameClient.aClass117_Sub14_Sub1_2961.method2042(var0, (byte) 8);
					GameClient.aClass117_Sub14_Sub1_2961.method1996(var3, (byte) -123);
					GameClient.aClass117_Sub14_Sub1_2961.method2183(var1, (byte) 35);
					GameClient.anInt3032 = 0;
					Class26.aClass117_Sub19_333 = Class74.method1010(var1, -737485445);
					GameClient.anInt3033 = var0 * 1496757531;
				}

				if (var2 == 1005) {
					var17 = Class74.method1010(var1, -1473160996);
					if (var17 != null && var17.anIntArray2058[var0] >= 100000) {
						Class117_Sub22_Sub1.method2353(27, "", var17.anIntArray2058[var0] + " x " + Class117_Sub13.method1992(var3, 456942158).aString2264, 902404216);
					} else {
						GameClient.aClass117_Sub14_Sub1_2961.method2932(79, 1541847052);
						GameClient.aClass117_Sub14_Sub1_2961.method2068(var3, (byte) 116);
					}

					GameClient.anInt3032 = 0;
					Class26.aClass117_Sub19_333 = Class74.method1010(var1, -1105124148);
					GameClient.anInt3033 = var0 * 1496757531;
				}

				if (GameClient.anInt3071 * -339828245 != 0) {
					GameClient.anInt3071 = 0;
					Class54.method850(Class74.method1010(Class82.anInt978 * 240984047, -1999065757), (byte) 0);
				}

				if (GameClient.aBool3074) {
					Class31.method466(-585341396);
				}

				if (Class26.aClass117_Sub19_333 != null && GameClient.anInt3032 * -747675247 == 0) {
					Class54.method850(Class26.aClass117_Sub19_333, (byte) 0);
				}

			}
		}
	}

	void method297(Component var1) throws Exception {
	}

}
