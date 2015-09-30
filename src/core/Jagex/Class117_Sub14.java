package core.Jagex;
import java.math.BigInteger;

public class Class117_Sub14 extends Class117 {

	public static Class117_Sub14 aClass117_Sub14_1878;
	public static final int anInt1881 = 100;
	public static final int anInt1882 = 91;
	static final int anInt1883 = 8;
	public static final int anInt1884 = 133;
	public int anInt1880;
	public static int[] anIntArray1879 = new int[256];
	public byte[] aByteArray1885;

	public void method1996(int var1, byte var2) {
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) (var1 >> 8);
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) var1;
	}

	public byte method1997(int var1) {
		return aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1];
	}

	public byte method1998(short var1) {
		return (byte) (aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] - 128);
	}

	public void method1999(int var1, int var2) {
		if ((var1 & -128) != 0) {
			if ((var1 & -16384) != 0) {
				if ((var1 & -2097152) != 0) {
					if ((var1 & -268435456) != 0) {
						method2126(var1 >>> 28 | 128, 161233137);
					}

					method2126(var1 >>> 21 | 128, 2064227392);
				}

				method2126(var1 >>> 14 | 128, 285759099);
			}

			method2126(var1 >>> 7 | 128, 1136866422);
		}

		method2126(var1 & 127, 10102369);
	}

	public void method2001(String var1, int var2) {
		int var3 = var1.indexOf(0);
		if (var3 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			anInt1880 += Class34.method488(var1, 0, var1.length(), aByteArray1885, anInt1880 * 561453169, 1660372868) * -2079217519;
			aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = 0;
		}
	}

	public void method2002(String var1, byte var2) {
		int var3 = var1.indexOf(0);
		if (var3 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = 0;
			anInt1880 += Class34.method488(var1, 0, var1.length(), aByteArray1885, anInt1880 * 561453169, 665560779) * -2079217519;
			aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = 0;
		}
	}

	public void method2004(byte[] var1, int var2, int var3, int var4) {
		for (int var5 = var2; var5 < var3 + var2; var5++) {
			aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = var1[var5];
		}

	}

	public void method2006(int var1, int var2) {
		aByteArray1885[anInt1880 * 561453169 - var1 - 2] = (byte) (var1 >> 8);
		aByteArray1885[anInt1880 * 561453169 - var1 - 1] = (byte) var1;
	}

	public void method2007(int var1, byte var2) {
		aByteArray1885[anInt1880 * 561453169 - var1 - 1] = (byte) var1;
	}

	public void method2008(int var1, int var2) {
		if (var1 >= 0 && var1 < 128) {
			method2126(var1, 1572993158);
		} else if (var1 >= 0 && var1 < 32768) {
			method1996(32768 + var1, (byte) -54);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method2009(int var1, int var2) {
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) var1;
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) (var1 >> 8);
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) (var1 >> 16);
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) (var1 >> 24);
	}

	public int method2010(int var1) {
		return aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] & 255;
	}

	public int method2012(int var1) {
		anInt1880 += 136532258;
		return (aByteArray1885[anInt1880 * 561453169 - 1] & 255) + ((aByteArray1885[anInt1880 * 561453169 - 2] & 255) << 8);
	}

	public int method2013(int var1) {
		anInt1880 += 136532258;
		int var2 = (aByteArray1885[anInt1880 * 561453169 - 1] & 255) + ((aByteArray1885[anInt1880 * 561453169 - 2] & 255) << 8);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	public int method2014(int var1) {
		anInt1880 -= 1942685261;
		return ((aByteArray1885[anInt1880 * 561453169 - 3] & 255) << 16) + ((aByteArray1885[anInt1880 * 561453169 - 2] & 255) << 8) + (aByteArray1885[anInt1880 * 561453169 - 1] & 255);
	}

	public int method2015(byte var1) {
		anInt1880 += 273064516;
		return (aByteArray1885[anInt1880 * 561453169 - 1] & 255) + ((aByteArray1885[anInt1880 * 561453169 - 3] & 255) << 16) + ((aByteArray1885[anInt1880 * 561453169 - 4] & 255) << 24) + ((aByteArray1885[anInt1880 * 561453169 - 2] & 255) << 8);
	}

	public long method2016(int var1) {
		long var2 = (long) method2015((byte) 98) & 4294967295L;
		long var4 = (long) method2015((byte) 113) & 4294967295L;
		return var4 + (var2 << 32);
	}

	public String method2018(byte var1) {
		int var2 = anInt1880 * 561453169;

		while (aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] != 0) {
			;
		}

		int var3 = anInt1880 * 561453169 - var2 - 1;
		return var3 == 0 ? "" : Class117_Sub22_Sub9.method2518(aByteArray1885, var2, var3, -1316313191);
	}

	public String method2019(short var1) {
		byte var2 = aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1];
		if (var2 != 0) {
			throw new IllegalStateException("");
		} else {
			int var3 = anInt1880 * 561453169;

			while (aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] != 0) {
				;
			}

			int var4 = anInt1880 * 561453169 - var3 - 1;
			return var4 == 0 ? "" : Class117_Sub22_Sub9.method2518(aByteArray1885, var3, var4, -1327581082);
		}
	}

	public String method2020(int var1) {
		byte var2 = aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1];
		if (var2 != 0) {
			throw new IllegalStateException("");
		} else {
			int var6 = method2127(1266884111);
			if (anInt1880 * 561453169 + var6 > aByteArray1885.length) {
				throw new IllegalStateException("");
			} else {
				byte[] var3 = aByteArray1885;
				int var7 = anInt1880 * 561453169;
				char[] var8 = new char[var6];
				int var9 = 0;
				int var4 = var7;

				int var5;
				for (int var11 = var6 + var7; var4 < var11; var8[var9++] = (char) var5) {
					int var10 = var3[var4++] & 255;
					if (var10 < 128) {
						if (var10 == 0) {
							var5 = 65533;
						} else {
							var5 = var10;
						}
					} else if (var10 < 192) {
						var5 = 65533;
					} else if (var10 < 224) {
						if (var4 < var11 && (var3[var4] & 192) == 128) {
							var5 = (var10 & 31) << 6 | var3[var4++] & 63;
							if (var5 < 128) {
								var5 = 65533;
							}
						} else {
							var5 = 65533;
						}
					} else if (var10 < 240) {
						if (var4 + 1 < var11 && (var3[var4] & 192) == 128 && (var3[var4 + 1] & 192) == 128) {
							var5 = (var10 & 15) << 12 | (var3[var4++] & 63) << 6 | var3[var4++] & 63;
							if (var5 < 2048) {
								var5 = 65533;
							}
						} else {
							var5 = 65533;
						}
					} else if (var10 < 248) {
						if (2 + var4 < var11 && (var3[var4] & 192) == 128 && (var3[1 + var4] & 192) == 128 && (var3[2 + var4] & 192) == 128) {
							var5 = (var10 & 7) << 18 | (var3[var4++] & 63) << 12 | (var3[var4++] & 63) << 6 | var3[var4++] & 63;
							if (var5 >= 65536 && var5 <= 1114111) {
								var5 = 65533;
							} else {
								var5 = 65533;
							}
						} else {
							var5 = 65533;
						}
					} else {
						var5 = 65533;
					}
				}

				String var12 = new String(var8, 0, var9);
				anInt1880 += var6 * -2079217519;
				return var12;
			}
		}
	}

	public void method2021(byte[] var1, int var2, int var3, int var4) {
		for (int var5 = var2; var5 < var3 + var2; var5++) {
			var1[var5] = aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1];
		}

	}

	public void method2024(int var1, int var2) {
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) (128 + var1);
	}

	public void method2028(int[] var1, int var2, int var3, int var4) {
		int var5 = anInt1880 * 561453169;
		anInt1880 = var2 * -2079217519;
		int var9 = (var3 - var2) / 8;

		for (int var10 = 0; var10 < var9; var10++) {
			int var6 = method2015((byte) 31);
			int var7 = method2015((byte) 74);
			int var8 = 0;
			int var11 = -1640531527;

			for (int var12 = 32; var12-- > 0; var7 += (var6 << 4 ^ var6 >>> 5) + var6 ^ var8 + var1[var8 >>> 11 & 3]) {
				var6 += (var7 << 4 ^ var7 >>> 5) + var7 ^ var1[var8 & 3] + var8;
				var8 += var11;
			}

			anInt1880 -= 546129032;
			method2183(var6, (byte) 111);
			method2183(var7, (byte) 79);
		}

		anInt1880 = var5 * -2079217519;
	}

	public void method2029(long var1) {
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) ((int) (var1 >> 56));
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) ((int) (var1 >> 48));
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) ((int) (var1 >> 40));
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) ((int) (var1 >> 32));
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) ((int) (var1 >> 24));
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) ((int) (var1 >> 16));
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) ((int) (var1 >> 8));
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) ((int) var1);
	}

	public void method2030(BigInteger var1, BigInteger var2, byte var3) {
		int var4 = anInt1880 * 561453169;
		anInt1880 = 0;
		byte[] var5 = new byte[var4];
		method2021(var5, 0, var4, 1658176429);
		BigInteger var6 = new BigInteger(var5);
		BigInteger var7 = var6.modPow(var1, var2);
		byte[] var8 = var7.toByteArray();
		anInt1880 = 0;
		method1996(var8.length, (byte) -97);
		method2004(var8, 0, var8.length, 1604833629);
	}

	public int method2031(int var1, int var2) {
		byte[] var3 = aByteArray1885;
		int var6 = anInt1880 * 561453169;
		int var4 = -1;

		for (int var5 = var1; var5 < var6; var5++) {
			var4 = var4 >>> 8 ^ anIntArray1879[(var4 ^ var3[var5]) & 255];
		}

		var4 = ~var4;
		method2183(var4, (byte) 109);
		return var4;
	}

	public boolean method2032(int var1) {
		anInt1880 -= 273064516;
		byte[] var6 = aByteArray1885;
		int var4 = anInt1880 * 561453169;
		int var2 = -1;

		int var5;
		for (var5 = 0; var5 < var4; var5++) {
			var2 = var2 >>> 8 ^ anIntArray1879[(var2 ^ var6[var5]) & 255];
		}

		var2 = ~var2;
		var5 = method2015((byte) 65);
		return var2 == var5;
	}

	public void method2033(long var1) {
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) ((int) (var1 >> 40));
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) ((int) (var1 >> 32));
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) ((int) (var1 >> 24));
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) ((int) (var1 >> 16));
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) ((int) (var1 >> 8));
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) ((int) var1);
	}

	public void method2034(int var1, byte var2) {
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) (0 - var1);
	}

	public void method2035(int var1, int var2) {
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) (128 - var1);
	}

	public int method2038(int var1) {
		return 128 - aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] & 255;
	}

	public void method2040(int var1, int var2) {
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) (var1 >> 16);
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) (var1 >> 8);
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) var1;
	}

	public byte method2041(int var1) {
		return (byte) (128 - aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1]);
	}

	public void method2042(int var1, byte var2) {
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) var1;
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) (var1 >> 8);
	}

	public int method2045(byte var1) {
		anInt1880 += 136532258;
		return (aByteArray1885[anInt1880 * 561453169 - 2] & 255) + ((aByteArray1885[anInt1880 * 561453169 - 1] & 255) << 8);
	}

	public int method2046(int var1) {
		anInt1880 += 136532258;
		return ((aByteArray1885[anInt1880 * 561453169 - 2] & 255) << 8) + (aByteArray1885[anInt1880 * 561453169 - 1] - 128 & 255);
	}

	public void method2047(int var1, int var2) {
		aByteArray1885[anInt1880 * 561453169 - var1 - 4] = (byte) (var1 >> 24);
		aByteArray1885[anInt1880 * 561453169 - var1 - 3] = (byte) (var1 >> 16);
		aByteArray1885[anInt1880 * 561453169 - var1 - 2] = (byte) (var1 >> 8);
		aByteArray1885[anInt1880 * 561453169 - var1 - 1] = (byte) var1;
	}

	public int method2048(byte var1) {
		anInt1880 += 136532258;
		int var2 = (aByteArray1885[anInt1880 * 561453169 - 2] & 255) + ((aByteArray1885[anInt1880 * 561453169 - 1] & 255) << 8);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	public int method2049(int var1) {
		anInt1880 += 136532258;
		int var2 = ((aByteArray1885[anInt1880 * 561453169 - 2] & 255) << 8) + (aByteArray1885[anInt1880 * 561453169 - 1] - 128 & 255);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	public int method2050(byte var1) {
		return 0 - aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] & 255;
	}

	public int method2051(int var1) {
		anInt1880 -= 1942685261;
		return (aByteArray1885[anInt1880 * 561453169 - 2] & 255) + ((aByteArray1885[anInt1880 * 561453169 - 1] & 255) << 8) + ((aByteArray1885[anInt1880 * 561453169 - 3] & 255) << 16);
	}

	public void method2053(int var1, int var2) {
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) (var1 >> 8);
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) var1;
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) (var1 >> 24);
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) (var1 >> 16);
	}

	public void method2054(int var1, int var2) {
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) (var1 >> 16);
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) (var1 >> 24);
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) var1;
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) (var1 >> 8);
	}

	public int method2055(byte var1) {
		anInt1880 += 273064516;
		return ((aByteArray1885[anInt1880 * 561453169 - 3] & 255) << 8) + ((aByteArray1885[anInt1880 * 561453169 - 2] & 255) << 16) + ((aByteArray1885[anInt1880 * 561453169 - 1] & 255) << 24) + (aByteArray1885[anInt1880 * 561453169 - 4] & 255);
	}

	public int method2056(int var1) {
		int var2 = aByteArray1885[anInt1880 * 561453169] & 255;
		return var2 < 128 ? method2010(-1439707937) - 64 : method2012(1053511631) - 49152;
	}

	public int method2057(int var1) {
		anInt1880 += 273064516;
		return ((aByteArray1885[anInt1880 * 561453169 - 1] & 255) << 8) + ((aByteArray1885[anInt1880 * 561453169 - 3] & 255) << 24) + ((aByteArray1885[anInt1880 * 561453169 - 4] & 255) << 16) + (aByteArray1885[anInt1880 * 561453169 - 2] & 255);
	}

	static {
		for (int var1 = 0; var1 < 256; var1++) {
			int var0 = var1;

			for (int var2 = 0; var2 < 8; var2++) {
				if ((var0 & 1) == 1) {
					var0 = var0 >>> 1 ^ -306674912;
				} else {
					var0 >>>= 1;
				}
			}

			anIntArray1879[var1] = var0;
		}

	}

	public Class117_Sub14(int var1) {
		aByteArray1885 = Class52.method818(var1, (byte) -38);
		anInt1880 = 0;
	}

	public void method2068(int var1, byte var2) {
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) (var1 + 128);
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) (var1 >> 8);
	}

	public int method2077(byte var1) {
		return aByteArray1885[anInt1880 * 561453169] >= 0 ? method2012(1053511631) : method2015((byte) 59) & Integer.MAX_VALUE;
	}

	public Class117_Sub14(byte[] var1) {
		aByteArray1885 = var1;
		anInt1880 = 0;
	}

	public void method2090(CharSequence var1, int var2) {
		int var3 = Class92.method1226(var1, -420191334);
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = 0;
		method1999(var3, 659680418);
		int var5 = anInt1880;
		byte[] var6 = aByteArray1885;
		int var7 = anInt1880 * 561453169;
		int var4 = var1.length();
		int var8 = var7;

		for (int var9 = 0; var9 < var4; var9++) {
			char var10 = var1.charAt(var9);
			if (var10 <= 127) {
				var6[var8++] = (byte) var10;
			} else if (var10 <= 2047) {
				var6[var8++] = (byte) (192 | var10 >> 6);
				var6[var8++] = (byte) (128 | var10 & 63);
			} else {
				var6[var8++] = (byte) (224 | var10 >> 12);
				var6[var8++] = (byte) (128 | var10 >> 6 & 63);
				var6[var8++] = (byte) (128 | var10 & 63);
			}
		}

		int var11 = var8 - var7;
		anInt1880 = var5 + var11 * -2079217519;
	}

	public String method2098(int var1) {
		if (aByteArray1885[anInt1880 * 561453169] == 0) {
			anInt1880 -= 2079217519;
			return null;
		} else {
			return method2018((byte) -22);
		}
	}

	public byte method2110(int var1) {
		return (byte) (0 - aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1]);
	}

	public int method2111(byte var1) {
		int var2 = aByteArray1885[anInt1880 * 561453169] & 255;
		return var2 < 128 ? method2010(-1439707937) : method2012(1053511631) - 32768;
	}

	public int method2114(byte var1) {
		anInt1880 += 273064516;
		return (aByteArray1885[anInt1880 * 561453169 - 3] & 255) + ((aByteArray1885[anInt1880 * 561453169 - 4] & 255) << 8) + ((aByteArray1885[anInt1880 * 561453169 - 1] & 255) << 16) + ((aByteArray1885[anInt1880 * 561453169 - 2] & 255) << 24);
	}

	public void method2126(int var1, int var2) {
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) var1;
	}

	public int method2127(int var1) {
		byte var2 = aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1];

		int var3;
		for (var3 = 0; var2 < 0; var2 = aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1]) {
			var3 = (var3 | var2 & 127) << 7;
		}

		return var3 | var2;
	}

	public void method2128(int[] var1, short var2) {
		int var3 = anInt1880 * 561453169 / 8;
		anInt1880 = 0;

		for (int var6 = 0; var6 < var3; var6++) {
			if (var2 == 396) {
				return;
			}

			int var7 = method2015((byte) 24);
			int var8 = method2015((byte) 78);
			int var9 = -957401312;
			int var5 = -1640531527;

			for (int var4 = 32; var4-- > 0; var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var9 + var1[var9 & 3]) {
				var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ var1[var9 >>> 11 & 3] + var9;
				var9 -= var5;
			}

			anInt1880 -= 546129032;
			method2183(var7, (byte) 8);
			method2183(var8, (byte) 126);
		}

	}

	public void method2148(int[] var1, int var2, int var3, int var4) {
		int var5 = anInt1880 * 561453169;
		anInt1880 = var2 * -2079217519;
		int var6 = (var3 - var2) / 8;

		for (int var12 = 0; var12 < var6; var12++) {
			int var10 = method2015((byte) 89);
			int var11 = method2015((byte) 33);
			int var8 = -957401312;
			int var9 = -1640531527;

			for (int var7 = 32; var7-- > 0; var10 -= var11 + (var11 << 4 ^ var11 >>> 5) ^ var8 + var1[var8 & 3]) {
				var11 -= var10 + (var10 << 4 ^ var10 >>> 5) ^ var1[var8 >>> 11 & 3] + var8;
				var8 -= var9;
			}

			anInt1880 -= 546129032;
			method2183(var10, (byte) 79);
			method2183(var11, (byte) 68);
		}

		anInt1880 = var5 * -2079217519;
	}

	public int method2176(int var1) {
		return aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] - 128 & 255;
	}

	public void method2183(int var1, byte var2) {
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) (var1 >> 24);
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) (var1 >> 16);
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) (var1 >> 8);
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) var1;
	}

	public int method2186(byte var1) {
		anInt1880 += 136532258;
		return (aByteArray1885[anInt1880 * 561453169 - 2] - 128 & 255) + ((aByteArray1885[anInt1880 * 561453169 - 1] & 255) << 8);
	}

	public void method2205(int[] var1, int var2) {
		int var3 = anInt1880 * 561453169 / 8;
		anInt1880 = 0;

		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = method2015((byte) 32);
			int var4 = method2015((byte) 74);
			int var7 = 0;
			int var8 = -1640531527;

			for (int var9 = 32; var9-- > 0; var4 += var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 >>> 11 & 3]) {
				var6 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var7 & 3] + var7;
				var7 += var8;
			}

			anInt1880 -= 546129032;
			method2183(var6, (byte) 70);
			method2183(var4, (byte) 118);
		}

	}

	public void method2209(int var1, int var2) {
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) (var1 >> 8);
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) (128 + var1);
	}

	public void method2214(int var1, int var2) {
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) var1;
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) (var1 >> 8);
		aByteArray1885[(anInt1880 -= 2079217519) * 561453169 - 1] = (byte) (var1 >> 16);
	}

	static void method2216(int var0) {
		Class129 var1 = null;

		try {
			var1 = Class93.method1241("", GameClient.aClass79_2919.aString947, true, (byte) -31);
			Class117_Sub14 var2 = Class117_Sub22_Sub21.aClass33_2499.method476(1150556189);
			var1.method1693(var2.aByteArray1885, 0, var2.anInt1880 * 561453169, (byte) -100);
		} catch (Exception var4) {
			;
		}

		try {
			if (var1 != null) {
				var1.method1685(986603916);
			}
		} catch (Exception var3) {
			;
		}

	}

	static void method2217(String var0, boolean var1, byte var2) {
		var0 = var0.toLowerCase();
		short[] var3 = new short[16];
		int var5 = 0;

		for (int var7 = 0; var7 < Class117_Sub22_Sub6.anInt2250 * 1647261705; var7++) {
			Class117_Sub22_Sub6 var6 = Class117_Sub13.method1992(var7, -611524893);
			if ((!var1 || var6.aBool2228) && var6.anInt2259 * -1574477923 == -1 && var6.aString2264.toLowerCase().indexOf(var0) != -1) {
				if (var5 >= 250) {
					Class82.anInt977 = 1362408011;
					Class59.aShortArray757 = null;
					return;
				}

				if (var5 >= var3.length) {
					short[] var4 = new short[var3.length * 2];

					for (int var8 = 0; var8 < var5; var8++) {
						var4[var8] = var3[var8];
					}

					var3 = var4;
				}

				var3[var5++] = (short) var7;
			}
		}

		Class59.aShortArray757 = var3;
		Class117_Sub5.anInt1751 = 0;
		Class82.anInt977 = var5 * -1362408011;
		String[] var10 = new String[Class82.anInt977 * 1747122333];

		for (int var9 = 0; var9 < Class82.anInt977 * 1747122333; var9++) {
			var10[var9] = Class117_Sub13.method1992(var3[var9], -1851176899).aString2264;
		}

		Class117_Sub22_Sub7.method2478(var10, Class59.aShortArray757, (byte) 42);
	}

}
