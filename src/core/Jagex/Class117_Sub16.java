package core.Jagex;
public class Class117_Sub16 extends Class117 {

	static final int anInt1922 = 256;
	public static final int anInt1923 = 192;
	int[] anIntArray1921 = new int[128];
	Class117_Sub4_Sub1[] aClass117_Sub4_Sub1Array1915 = new Class117_Sub4_Sub1[128];
	short[] aShortArray1916 = new short[128];
	byte[] aByteArray1920 = new byte[128];
	byte[] aByteArray1917 = new byte[128];
	Class112[] aClass112Array1918 = new Class112[128];
	byte[] aByteArray1914 = new byte[128];
	int anInt1919;

	void method2253(byte var1) {
		anIntArray1921 = null;
	}

	boolean method2254(Class15 var1, byte[] var2, int[] var3, int var4) {
		boolean var5 = true;
		int var9 = 0;
		Class117_Sub4_Sub1 var7 = null;

		for (int var8 = 0; var8 < 128; var8++) {
			if (var2 == null || var2[var8] != 0) {
				int var6 = anIntArray1921[var8];
				if (var6 != 0) {
					if (var6 != var9) {
						var9 = var6--;
						if ((var6 & 1) == 0) {
							var7 = var1.method302(var6 >> 2, var3, 1307339255);
						} else {
							var7 = var1.method303(var6 >> 2, var3, 419052974);
						}

						if (var7 == null) {
							var5 = false;
						}
					}

					if (var7 != null) {
						aClass117_Sub4_Sub1Array1915[var8] = var7;
						anIntArray1921[var8] = 0;
					}
				}
			}
		}

		return var5;
	}

	Class117_Sub16(byte[] var1) {
		Class117_Sub14 var2 = new Class117_Sub14(var1);

		int var5;
		for (var5 = 0; var2.aByteArray1885[var5 + var2.anInt1880 * 561453169] != 0; var5++) {
			;
		}

		byte[] var9 = new byte[var5];

		int var12;
		for (var12 = 0; var12 < var5; var12++) {
			var9[var12] = var2.method1997(-700923032);
		}

		var2.anInt1880 -= 2079217519;
		++var5;
		var12 = var2.anInt1880 * 561453169;
		var2.anInt1880 += var5 * -2079217519;

		int var3;
		for (var3 = 0; var2.aByteArray1885[var3 + var2.anInt1880 * 561453169] != 0; var3++) {
			;
		}

		byte[] var16 = new byte[var3];

		int var18;
		for (var18 = 0; var18 < var3; var18++) {
			var16[var18] = var2.method1997(-1427646765);
		}

		var2.anInt1880 -= 2079217519;
		++var3;
		var18 = var2.anInt1880 * 561453169;
		var2.anInt1880 += var3 * -2079217519;

		int var6;
		for (var6 = 0; var2.aByteArray1885[var2.anInt1880 * 561453169 + var6] != 0; var6++) {
			;
		}

		byte[] var24 = new byte[var6];

		for (int var25 = 0; var25 < var6; var25++) {
			var24[var25] = var2.method1997(-215710128);
		}

		var2.anInt1880 -= 2079217519;
		++var6;
		byte[] var44 = new byte[var6];
		int var8;
		int var26;
		if (var6 > 1) {
			var44[1] = 1;
			int var27 = 1;
			var26 = 2;

			for (var8 = 2; var8 < var6; var8++) {
				int var28 = var2.method2010(-1439707937);
				if (var28 == 0) {
					var27 = var26++;
				} else {
					if (var28 <= var27) {
						--var28;
					}

					var27 = var28;
				}

				var44[var8] = (byte) var27;
			}
		} else {
			var26 = var6;
		}

		Class112[] var45 = new Class112[var26];

		Class112 var46;
		for (var8 = 0; var8 < var45.length; var8++) {
			var46 = var45[var8] = new Class112();
			int var4 = var2.method2010(-1439707937);
			if (var4 > 0) {
				var46.aByteArray1492 = new byte[var4 * 2];
			}

			var4 = var2.method2010(-1439707937);
			if (var4 > 0) {
				var46.aByteArray1491 = new byte[2 + var4 * 2];
				var46.aByteArray1491[1] = 64;
			}
		}

		var8 = var2.method2010(-1439707937);
		byte[] var47 = var8 > 0 ? new byte[var8 * 2] : null;
		var8 = var2.method2010(-1439707937);
		byte[] var38 = var8 > 0 ? new byte[var8 * 2] : null;

		int var10;
		for (var10 = 0; var2.aByteArray1885[var10 + var2.anInt1880 * 561453169] != 0; var10++) {
			;
		}

		byte[] var11 = new byte[var10];

		int var15;
		for (var15 = 0; var15 < var10; var15++) {
			var11[var15] = var2.method1997(-146594009);
		}

		var2.anInt1880 -= 2079217519;
		++var10;
		var15 = 0;

		int var19;
		for (var19 = 0; var19 < 128; var19++) {
			var15 += var2.method2010(-1439707937);
			aShortArray1916[var19] = (short) var15;
		}

		var15 = 0;

		for (var19 = 0; var19 < 128; var19++) {
			var15 += var2.method2010(-1439707937);
			aShortArray1916[var19] = (short) (aShortArray1916[var19] + (var15 << 8));
		}

		var19 = 0;
		int var21 = 0;
		int var32 = 0;

		int var33;
		for (var33 = 0; var33 < 128; var33++) {
			if (var19 == 0) {
				if (var21 < var11.length) {
					var19 = var11[var21++];
				} else {
					var19 = -1;
				}

				var32 = var2.method2127(902577087);
			}

			aShortArray1916[var33] = (short) (aShortArray1916[var33] + ((var32 - 1 & 2) << 14));
			anIntArray1921[var33] = var32;
			--var19;
		}

		var19 = 0;
		var21 = 0;
		var33 = 0;

		int var35;
		for (var35 = 0; var35 < 128; var35++) {
			if (anIntArray1921[var35] != 0) {
				if (var19 == 0) {
					if (var21 < var9.length) {
						var19 = var9[var21++];
					} else {
						var19 = -1;
					}

					var33 = var2.aByteArray1885[var12++] - 1;
				}

				aByteArray1914[var35] = (byte) var33;
				--var19;
			}
		}

		var19 = 0;
		var21 = 0;
		var35 = 0;

		for (int var36 = 0; var36 < 128; var36++) {
			if (anIntArray1921[var36] != 0) {
				if (var19 == 0) {
					if (var21 < var16.length) {
						var19 = var16[var21++];
					} else {
						var19 = -1;
					}

					var35 = var2.aByteArray1885[var18++] + 16 << 2;
				}

				aByteArray1917[var36] = (byte) var35;
				--var19;
			}
		}

		var19 = 0;
		var21 = 0;
		Class112 var49 = null;

		int var13;
		for (var13 = 0; var13 < 128; var13++) {
			if (anIntArray1921[var13] != 0) {
				if (var19 == 0) {
					var49 = var45[var44[var21]];
					if (var21 < var24.length) {
						var19 = var24[var21++];
					} else {
						var19 = -1;
					}
				}

				aClass112Array1918[var13] = var49;
				--var19;
			}
		}

		var19 = 0;
		var21 = 0;
		var13 = 0;

		int var7;
		for (var7 = 0; var7 < 128; var7++) {
			if (var19 == 0) {
				if (var21 < var11.length) {
					var19 = var11[var21++];
				} else {
					var19 = -1;
				}

				if (anIntArray1921[var7] > 0) {
					var13 = var2.method2010(-1439707937) + 1;
				}
			}

			aByteArray1920[var7] = (byte) var13;
			--var19;
		}

		anInt1919 = (var2.method2010(-1439707937) + 1) * -1757476783;

		int var14;
		Class112 var20;
		for (var7 = 0; var7 < var26; var7++) {
			var20 = var45[var7];
			if (var20.aByteArray1492 != null) {
				for (var14 = 1; var14 < var20.aByteArray1492.length; var14 += 2) {
					var20.aByteArray1492[var14] = var2.method1997(-1225720407);
				}
			}

			if (var20.aByteArray1491 != null) {
				for (var14 = 3; var14 < var20.aByteArray1491.length - 2; var14 += 2) {
					var20.aByteArray1491[var14] = var2.method1997(-1277442346);
				}
			}
		}

		if (var47 != null) {
			for (var7 = 1; var7 < var47.length; var7 += 2) {
				var47[var7] = var2.method1997(-166633739);
			}
		}

		if (var38 != null) {
			for (var7 = 1; var7 < var38.length; var7 += 2) {
				var38[var7] = var2.method1997(-1427603226);
			}
		}

		for (var7 = 0; var7 < var26; var7++) {
			var20 = var45[var7];
			if (var20.aByteArray1491 != null) {
				var15 = 0;

				for (var14 = 2; var14 < var20.aByteArray1491.length; var14 += 2) {
					var15 = var15 + 1 + var2.method2010(-1439707937);
					var20.aByteArray1491[var14] = (byte) var15;
				}
			}
		}

		for (var7 = 0; var7 < var26; var7++) {
			var20 = var45[var7];
			if (var20.aByteArray1492 != null) {
				var15 = 0;

				for (var14 = 2; var14 < var20.aByteArray1492.length; var14 += 2) {
					var15 = 1 + var15 + var2.method2010(-1439707937);
					var20.aByteArray1492[var14] = (byte) var15;
				}
			}
		}

		int var22;
		int var23;
		byte var30;
		int var31;
		int var34;
		int var37;
		byte var40;
		int var48;
		if (var47 != null) {
			var15 = var2.method2010(-1439707937);
			var47[0] = (byte) var15;

			for (var7 = 2; var7 < var47.length; var7 += 2) {
				var15 = var15 + 1 + var2.method2010(-1439707937);
				var47[var7] = (byte) var15;
			}

			var40 = var47[0];
			byte var42 = var47[1];

			for (var14 = 0; var14 < var40; var14++) {
				aByteArray1920[var14] = (byte) (var42 * aByteArray1920[var14] + 32 >> 6);
			}

			for (var14 = 2; var14 < var47.length; var14 += 2) {
				var30 = var47[var14];
				byte var17 = var47[1 + var14];
				var22 = (var30 - var40) * var42 + (var30 - var40) / 2;

				for (var34 = var40; var34 < var30; var34++) {
					var31 = var30 - var40;
					var23 = var22 >>> 31;
					var37 = (var22 + var23) / var31 - var23;
					aByteArray1920[var34] = (byte) (aByteArray1920[var34] * var37 + 32 >> 6);
					var22 += var17 - var42;
				}

				var40 = var30;
				var42 = var17;
			}

			for (var48 = var40; var48 < 128; var48++) {
				aByteArray1920[var48] = (byte) (var42 * aByteArray1920[var48] + 32 >> 6);
			}

			var46 = null;
		}

		if (var38 != null) {
			var15 = var2.method2010(-1439707937);
			var38[0] = (byte) var15;

			for (var7 = 2; var7 < var38.length; var7 += 2) {
				var15 = var15 + 1 + var2.method2010(-1439707937);
				var38[var7] = (byte) var15;
			}

			var40 = var38[0];
			int var43 = var38[1] << 1;

			for (var14 = 0; var14 < var40; var14++) {
				var48 = (aByteArray1917[var14] & 255) + var43;
				if (var48 < 0) {
					var48 = 0;
				}

				if (var48 > 128) {
					var48 = 128;
				}

				aByteArray1917[var14] = (byte) var48;
			}

			int var41;
			for (var14 = 2; var14 < var38.length; var14 += 2) {
				var30 = var38[var14];
				var41 = var38[var14 + 1] << 1;
				var22 = var43 * (var30 - var40) + (var30 - var40) / 2;

				for (var34 = var40; var34 < var30; var34++) {
					var31 = var30 - var40;
					var23 = var22 >>> 31;
					var37 = (var22 + var23) / var31 - var23;
					int var29 = var37 + (aByteArray1917[var34] & 255);
					if (var29 < 0) {
						var29 = 0;
					}

					if (var29 > 128) {
						var29 = 128;
					}

					aByteArray1917[var34] = (byte) var29;
					var22 += var41 - var43;
				}

				var40 = var30;
				var43 = var41;
			}

			for (var48 = var40; var48 < 128; var48++) {
				var41 = (aByteArray1917[var48] & 255) + var43;
				if (var41 < 0) {
					var41 = 0;
				}

				if (var41 > 128) {
					var41 = 128;
				}

				aByteArray1917[var48] = (byte) var41;
			}

			Object var39 = null;
		}

		for (var7 = 0; var7 < var26; var7++) {
			var45[var7].anInt1483 = var2.method2010(-1439707937) * 1123405601;
		}

		for (var7 = 0; var7 < var26; var7++) {
			var20 = var45[var7];
			if (var20.aByteArray1492 != null) {
				var20.anInt1486 = var2.method2010(-1439707937) * -1413863005;
			}

			if (var20.aByteArray1491 != null) {
				var20.anInt1487 = var2.method2010(-1439707937) * 377349857;
			}

			if (var20.anInt1483 * 584742113 > 0) {
				var20.anInt1488 = var2.method2010(-1439707937) * -60268399;
			}
		}

		for (var7 = 0; var7 < var26; var7++) {
			var45[var7].anInt1493 = var2.method2010(-1439707937) * 2136840271;
		}

		for (var7 = 0; var7 < var26; var7++) {
			var20 = var45[var7];
			if (var20.anInt1493 * -1349353809 > 0) {
				var20.anInt1489 = var2.method2010(-1439707937) * -1617126029;
			}
		}

		for (var7 = 0; var7 < var26; var7++) {
			var20 = var45[var7];
			if (var20.anInt1489 * 592695227 > 0) {
				var20.anInt1490 = var2.method2010(-1439707937) * -14597875;
			}
		}

	}

}
