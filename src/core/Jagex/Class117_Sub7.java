package core.Jagex;
import java.io.IOException;

public class Class117_Sub7 extends Class117 {

	String aString1778;
	boolean aBool1779;
	Class117_Sub19 aClass117_Sub19_1780;
	int anInt1781;
	int anInt1782;
	int anInt1783;
	Class117_Sub19 aClass117_Sub19_1784;
	int anInt1785;
	Object[] anObjectArray1786;
	static int[] anIntArray1787;
	int anInt1788;
	static Class20 aClass20_1789;
	static String aString1790;
	int anInt1791;
	public static final int anInt1792 = 232;

	static int method1950(int var0, int var1) {
		Class1 var2 = (Class1) Class35.aMap440.get(Integer.valueOf(var0));
		return var2 != null ? var2.method45(-747386166) : 0;
	}

	static boolean method1951(String var0, byte var1) {
		if (var0 == null) {
			return false;
		} else {
			String var3 = Class32.method472(var0, Class54.aClass137_729, 1538480085);

			for (int var2 = 0; var2 < GameClient.anInt2976 * -178563241; var2++) {
				Class43 var4 = GameClient.aClass43Array3192[var2];
				if (var3.equalsIgnoreCase(Class32.method472(var4.aString581, Class54.aClass137_729, 1538480085))) {
					return true;
				}

				if (var3.equalsIgnoreCase(Class32.method472(var4.aString588, Class54.aClass137_729, 1538480085))) {
					return true;
				}
			}

			return false;
		}
	}

	public static Class117_Sub22_Sub5 method1952(int var0, byte var1) {
		Class117_Sub22_Sub5 var2 = (Class117_Sub22_Sub5) Class117_Sub22_Sub5.aClass115_2182.method1515((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Class117_Sub22_Sub5.aClass106_2212.method1380(9, var0, (byte) 59);
			var2 = new Class117_Sub22_Sub5();
			var2.anInt2184 = var0 * -1162033969;
			if (var3 != null) {
				var2.method2397(new Class117_Sub14(var3), 1370997032);
			}

			var2.method2390(308105722);
			Class117_Sub22_Sub5.aClass115_2182.method1517(var2, (long) var0);
			return var2;
		}
	}

	static void method1953(int var0) {
		if (GameClient.anInt3101 * -830747683 > 0) {
			Class140.method1765(-1916789407);
		} else {
			Class117_Sub14_Sub1.method2953(40, 1064268496);
			GameClient.aClass81_2960 = Class117_Sub22_Sub18_Sub2.aClass81_2609;
			Class117_Sub22_Sub18_Sub2.aClass81_2609 = null;
		}
	}

	public static boolean method1954(int var0) {
		long var1 = Class47.method774(568794745);
		int var3 = (int) (var1 - -4996750068977566391L * Class29.aLong371);
		Class29.aLong371 = -7142464459995183879L * var1;
		if (var3 > 200) {
			var3 = 200;
		}

		Class96.anInt1111 += var3 * -1450106831;
		if (Class96.anInt1118 * -1289524979 == 0 && Class96.anInt1110 * -144797449 == 0 && Class96.anInt1116 * -534212601 == 0 && Class96.anInt1109 * 174207063 == 0) {
			return true;
		} else if (Class96.aClass81_1125 == null) {
			return false;
		} else {
			try {
				if (Class96.anInt1111 * -1264961327 > 30000) {
					throw new IOException();
				} else {
					Class117_Sub22_Sub20 var4;
					Class117_Sub14 var5;
					while (Class96.anInt1110 * -144797449 < 20 && Class96.anInt1109 * 174207063 > 0) {
						var4 = (Class117_Sub22_Sub20) Class96.aClass127_1108.method1668();
						var5 = new Class117_Sub14(4);
						var5.method2126(1, -146960984);
						var5.method2040((int) var4.aLong1503, 2142578650);
						Class96.aClass81_1125.method1107(var5.aByteArray1885, 0, 4, (byte) 4);
						Class96.aClass127_1112.method1666(var4, var4.aLong1503);
						Class96.anInt1109 -= 1995029351;
						Class96.anInt1110 += 1667838151;
					}

					while (Class96.anInt1118 * -1289524979 < 20 && Class96.anInt1116 * -534212601 > 0) {
						var4 = (Class117_Sub22_Sub20) Class96.aClass119_1114.method1558();
						var5 = new Class117_Sub14(4);
						var5.method2126(0, 35987909);
						var5.method2040((int) var4.aLong1503, 2122649202);
						Class96.aClass81_1125.method1107(var5.aByteArray1885, 0, 4, (byte) 4);
						var4.method2339();
						Class96.aClass127_1117.method1666(var4, var4.aLong1503);
						Class96.anInt1116 += 348267081;
						Class96.anInt1118 += 2004127173;
					}

					for (int var20 = 0; var20 < 100; var20++) {
						int var21 = Class96.aClass81_1125.method1093(-1877253318);
						if (var21 < 0) {
							throw new IOException();
						}

						if (var21 == 0) {
							break;
						}

						Class96.anInt1111 = 0;
						byte var6 = 0;
						if (Class40.aClass117_Sub22_Sub20_504 == null) {
							var6 = 8;
						} else if (Class96.anInt1120 * 1969338897 == 0) {
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						int var11;
						if (var6 > 0) {
							var7 = var6 - Class96.aClass117_Sub14_1119.anInt1880 * 561453169;
							if (var7 > var21) {
								var7 = var21;
							}

							Class96.aClass81_1125.method1092(Class96.aClass117_Sub14_1119.aByteArray1885, Class96.aClass117_Sub14_1119.anInt1880 * 561453169, var7, (short) 31360);
							if (Class96.aByte1123 != 0) {
								for (var8 = 0; var8 < var7; var8++) {
									Class96.aClass117_Sub14_1119.aByteArray1885[Class96.aClass117_Sub14_1119.anInt1880 * 561453169 + var8] ^= Class96.aByte1123;
								}
							}

							Class96.aClass117_Sub14_1119.anInt1880 += var7 * -2079217519;
							if (Class96.aClass117_Sub14_1119.anInt1880 * 561453169 < var6) {
								break;
							}

							if (Class40.aClass117_Sub22_Sub20_504 == null) {
								Class96.aClass117_Sub14_1119.anInt1880 = 0;
								var8 = Class96.aClass117_Sub14_1119.method2010(-1439707937);
								var9 = Class96.aClass117_Sub14_1119.method2012(1053511631);
								int var10 = Class96.aClass117_Sub14_1119.method2010(-1439707937);
								var11 = Class96.aClass117_Sub14_1119.method2015((byte) 111);
								long var12 = (long) ((var8 << 16) + var9);
								Class117_Sub22_Sub20 var14 = (Class117_Sub22_Sub20) Class96.aClass127_1112.method1675(var12);
								GameClient.aBool3204 = true;
								if (var14 == null) {
									var14 = (Class117_Sub22_Sub20) Class96.aClass127_1117.method1675(var12);
									GameClient.aBool3204 = false;
								}

								if (var14 == null) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								Class40.aClass117_Sub22_Sub20_504 = var14;
								Class117_Sub14.aClass117_Sub14_1878 = new Class117_Sub14(var11 + var15 + Class40.aClass117_Sub22_Sub20_504.aByte2492);
								Class117_Sub14.aClass117_Sub14_1878.method2126(var10, 1317728716);
								Class117_Sub14.aClass117_Sub14_1878.method2183(var11, (byte) 114);
								Class96.anInt1120 = 467908488;
								Class96.aClass117_Sub14_1119.anInt1880 = 0;
							} else if (Class96.anInt1120 * 1969338897 == 0) {
								if (Class96.aClass117_Sub14_1119.aByteArray1885[0] == -1) {
									Class96.anInt1120 = 595359473;
									Class96.aClass117_Sub14_1119.anInt1880 = 0;
								} else {
									Class40.aClass117_Sub22_Sub20_504 = null;
								}
							}
						} else {
							var7 = Class117_Sub14.aClass117_Sub14_1878.aByteArray1885.length - Class40.aClass117_Sub22_Sub20_504.aByte2492;
							var8 = 512 - Class96.anInt1120 * 1969338897;
							if (var8 > var7 - Class117_Sub14.aClass117_Sub14_1878.anInt1880 * 561453169) {
								var8 = var7 - Class117_Sub14.aClass117_Sub14_1878.anInt1880 * 561453169;
							}

							if (var8 > var21) {
								var8 = var21;
							}

							Class96.aClass81_1125.method1092(Class117_Sub14.aClass117_Sub14_1878.aByteArray1885, Class117_Sub14.aClass117_Sub14_1878.anInt1880 * 561453169, var8, (short) 23085);
							if (Class96.aByte1123 != 0) {
								for (var9 = 0; var9 < var8; var9++) {
									Class117_Sub14.aClass117_Sub14_1878.aByteArray1885[var9 + Class117_Sub14.aClass117_Sub14_1878.anInt1880 * 561453169] ^= Class96.aByte1123;
								}
							}

							Class117_Sub14.aClass117_Sub14_1878.anInt1880 += var8 * -2079217519;
							Class96.anInt1120 += var8 * 595359473;
							if (Class117_Sub14.aClass117_Sub14_1878.anInt1880 * 561453169 == var7) {
								if (Class40.aClass117_Sub22_Sub20_504.aLong1503 == 16711935L) {
									Class87.aClass117_Sub14_1021 = Class117_Sub14.aClass117_Sub14_1878;

									for (var9 = 0; var9 < 256; var9++) {
										Class106_Sub1 var22 = Class96.aClass106_Sub1Array1122[var9];
										if (var22 != null) {
											Class87.aClass117_Sub14_1021.anInt1880 = var9 * 546129032 - 1806153003;
											var11 = Class87.aClass117_Sub14_1021.method2015((byte) 101);
											int var16 = Class87.aClass117_Sub14_1021.method2015((byte) 10);
											var22.method2224(var11, var16, (byte) 93);
										}
									}
								} else {
									Class96.aCRC32_1121.reset();
									Class96.aCRC32_1121.update(Class117_Sub14.aClass117_Sub14_1878.aByteArray1885, 0, var7);
									var9 = (int) Class96.aCRC32_1121.getValue();
									if (var9 != Class40.aClass117_Sub22_Sub20_504.anInt2493 * 457665111) {
										try {
											Class96.aClass81_1125.method1088((byte) 0);
										} catch (Exception var18) {
											;
										}

										Class96.anInt1124 -= 2019653593;
										Class96.aClass81_1125 = null;
										Class96.aByte1123 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
										return false;
									}

									Class96.anInt1124 = 0;
									Class96.anInt1115 = 0;
									Class40.aClass117_Sub22_Sub20_504.aClass106_Sub1_2496.method2225((int) (Class40.aClass117_Sub22_Sub20_504.aLong1503 & 65535L), Class117_Sub14.aClass117_Sub14_1878.aByteArray1885, (Class40.aClass117_Sub22_Sub20_504.aLong1503 & 16711680L) == 16711680L, GameClient.aBool3204, -2109967547);
								}

								Class40.aClass117_Sub22_Sub20_504.method1532();
								if (GameClient.aBool3204) {
									Class96.anInt1110 -= 1667838151;
								} else {
									Class96.anInt1118 -= 2004127173;
								}

								Class96.anInt1120 = 0;
								Class40.aClass117_Sub22_Sub20_504 = null;
								Class117_Sub14.aClass117_Sub14_1878 = null;
							} else {
								if (Class96.anInt1120 * 1969338897 != 512) {
									break;
								}

								Class96.anInt1120 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var19) {
				try {
					Class96.aClass81_1125.method1088((byte) 0);
				} catch (Exception var17) {
					;
				}

				Class96.anInt1115 += 1642660055;
				Class96.aClass81_1125 = null;
				return false;
			}
		}
	}

}
