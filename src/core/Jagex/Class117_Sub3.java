package core.Jagex;
public class Class117_Sub3 extends Class117 {

	int anInt1694;
	int anInt1695;
	int anInt1696;
	int anInt1711;
	boolean aBool1698;
	byte[][] aByteArrayArray1726;
	int anInt1712;
	float[] aFloatArray1709;
	byte[] aByteArray1724;
	int anInt1714;
	int anInt1708;
	static int anInt1706;
	static int anInt1697;
	static float[] aFloatArray1715;
	static Class11[] aClass11Array1704;
	static Class12[] aClass12Array1705;
	static Class18[] aClass18Array1702;
	static Class19[] aClass19Array1717;
	static boolean[] aBoolArray1718;
	static int[] anIntArray1725;
	static float[] aFloatArray1716;
	static float[] aFloatArray1693;
	static float[] aFloatArray1703;
	static int[] anIntArray1722;
	static float[] aFloatArray1719;
	static float[] aFloatArray1720;
	static float[] aFloatArray1721;
	static int[] anIntArray1723;
	static byte[] aByteArray1699;
	static int anInt1700;
	static int anInt1701;
	static boolean aBool1710 = false;
	int anInt1713;
	boolean aBool1707;

	Class117_Sub3(byte[] var1) {
		method1902(var1);
	}

	void method1902(byte[] var1) {
		Class117_Sub14 var2 = new Class117_Sub14(var1);
		anInt1694 = var2.method2015((byte) 37);
		anInt1695 = var2.method2015((byte) 21);
		anInt1696 = var2.method2015((byte) 42);
		anInt1711 = var2.method2015((byte) 127);
		if (anInt1711 < 0) {
			anInt1711 = ~anInt1711;
			aBool1698 = true;
		}

		int var4 = var2.method2015((byte) 110);
		aByteArrayArray1726 = new byte[var4][];

		for (int var3 = 0; var3 < var4; var3++) {
			int var5 = 0;

			int var6;
			do {
				var6 = var2.method2010(-1439707937);
				var5 += var6;
			} while (var6 >= 255);

			byte[] var7 = new byte[var5];
			var2.method2021(var7, 0, var5, 1658176429);
			aByteArrayArray1726[var3] = var7;
		}

	}

	Class117_Sub4_Sub1 method1903(int[] var1) {
		if (var1 != null && var1[0] <= 0) {
			return null;
		} else {
			if (aByteArray1724 == null) {
				anInt1712 = 0;
				aFloatArray1709 = new float[anInt1697];
				aByteArray1724 = new byte[anInt1695];
				anInt1714 = 0;
				anInt1708 = 0;
			}

			for (; anInt1708 < aByteArrayArray1726.length; anInt1708++) {
				if (var1 != null && var1[0] <= 0) {
					return null;
				}

				float[] var2 = method1906(anInt1708);
				if (var2 != null) {
					int var6 = anInt1714;
					int var3 = var2.length;
					if (var3 > anInt1695 - var6) {
						var3 = anInt1695 - var6;
					}

					for (int var5 = 0; var5 < var3; var5++) {
						int var4 = (int) (128.0F + var2[var5] * 128.0F);
						if ((var4 & -256) != 0) {
							var4 = ~var4 >> 31;
						}

						aByteArray1724[var6++] = (byte) (var4 - 128);
					}

					if (var1 != null) {
						var1[0] -= var6 - anInt1714;
					}

					anInt1714 = var6;
				}
			}

			aFloatArray1709 = null;
			byte[] var7 = aByteArray1724;
			aByteArray1724 = null;
			return new Class117_Sub4_Sub1(anInt1694, var7, anInt1696, anInt1711, aBool1698);
		}
	}

	static void method1904(byte[] var0) {
		method1905(var0, 0);
		anInt1706 = 1 << method1908(4);
		anInt1697 = 1 << method1908(4);
		aFloatArray1715 = new float[anInt1697];

		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		for (var4 = 0; var4 < 2; var4++) {
			var1 = var4 != 0 ? anInt1697 : anInt1706;
			var3 = var1 >> 1;
			var2 = var1 >> 2;
			var5 = var1 >> 3;
			float[] var8 = new float[var3];

			for (int var9 = 0; var9 < var2; var9++) {
				var8[var9 * 2] = (float) Math.cos((double) (var9 * 4) * 3.141592653589793D / (double) var1);
				var8[var9 * 2 + 1] = -((float) Math.sin((double) (var9 * 4) * 3.141592653589793D / (double) var1));
			}

			float[] var21 = new float[var3];

			for (int var7 = 0; var7 < var2; var7++) {
				var21[var7 * 2] = (float) Math.cos((double) (var7 * 2 + 1) * 3.141592653589793D / (double) (var1 * 2));
				var21[var7 * 2 + 1] = (float) Math.sin((double) (var7 * 2 + 1) * 3.141592653589793D / (double) (var1 * 2));
			}

			float[] var19 = new float[var2];

			for (int var6 = 0; var6 < var5; var6++) {
				var19[var6 * 2] = (float) Math.cos((double) (var6 * 4 + 2) * 3.141592653589793D / (double) var1);
				var19[var6 * 2 + 1] = -((float) Math.sin((double) (var6 * 4 + 2) * 3.141592653589793D / (double) var1));
			}

			int[] var18 = new int[var5];
			int var12 = Class117_Sub24.method2341(var5 - 1, -381115549);

			for (int var10 = 0; var10 < var5; var10++) {
				int var13 = var10;
				int var15 = var12;

				int var14;
				for (var14 = 0; var15 > 0; --var15) {
					var14 = var14 << 1 | var13 & 1;
					var13 >>>= 1;
				}

				var18[var10] = var14;
			}

			if (var4 != 0) {
				aFloatArray1719 = var8;
				aFloatArray1720 = var21;
				aFloatArray1721 = var19;
				anIntArray1723 = var18;
			} else {
				aFloatArray1716 = var8;
				aFloatArray1693 = var21;
				aFloatArray1703 = var19;
				anIntArray1722 = var18;
			}
		}

		var4 = method1908(8) + 1;
		aClass11Array1704 = new Class11[var4];

		for (var1 = 0; var1 < var4; var1++) {
			aClass11Array1704[var1] = new Class11();
		}

		var1 = method1908(6) + 1;

		for (var3 = 0; var3 < var1; var3++) {
			method1908(16);
		}

		var1 = method1908(6) + 1;
		aClass12Array1705 = new Class12[var1];

		for (var3 = 0; var3 < var1; var3++) {
			aClass12Array1705[var3] = new Class12();
		}

		var3 = method1908(6) + 1;
		aClass18Array1702 = new Class18[var3];

		for (var2 = 0; var2 < var3; var2++) {
			aClass18Array1702[var2] = new Class18();
		}

		var2 = method1908(6) + 1;
		aClass19Array1717 = new Class19[var2];

		for (var5 = 0; var5 < var2; var5++) {
			aClass19Array1717[var5] = new Class19();
		}

		var5 = method1908(6) + 1;
		aBoolArray1718 = new boolean[var5];
		anIntArray1725 = new int[var5];

		for (int var20 = 0; var20 < var5; var20++) {
			aBoolArray1718[var20] = method1911() != 0;
			method1908(16);
			method1908(16);
			anIntArray1725[var20] = method1908(8);
		}

	}

	static void method1905(byte[] var0, int var1) {
		aByteArray1699 = var0;
		anInt1700 = var1;
		anInt1701 = 0;
	}

	float[] method1906(int var1) {
		method1905(aByteArrayArray1726[var1], 0);
		method1911();
		int var6 = method1908(Class117_Sub24.method2341(anIntArray1725.length - 1, -381115549));
		boolean var8 = aBoolArray1718[var6];
		int var7 = var8 ? anInt1697 : anInt1706;
		boolean var10 = false;
		boolean var11 = false;
		if (var8) {
			var10 = method1911() != 0;
			var11 = method1911() != 0;
		}

		int var15 = var7 >> 1;
		int var3;
		int var4;
		int var16;
		if (var8 && !var10) {
			var3 = (var7 >> 2) - (anInt1706 >> 2);
			var16 = (var7 >> 2) + (anInt1706 >> 2);
			var4 = anInt1706 >> 1;
		} else {
			var3 = 0;
			var16 = var15;
			var4 = var7 >> 1;
		}

		int var20;
		int var21;
		int var29;
		if (var8 && !var11) {
			var29 = var7 - (var7 >> 2) - (anInt1706 >> 2);
			var20 = var7 - (var7 >> 2) + (anInt1706 >> 2);
			var21 = anInt1706 >> 1;
		} else {
			var29 = var15;
			var20 = var7;
			var21 = var7 >> 1;
		}

		Class19 var25 = aClass19Array1717[anIntArray1725[var6]];
		int var26 = var25.anInt222;
		int var22 = var25.anIntArray221[var26];
		boolean var27 = !aClass12Array1705[var22].method205();
		boolean var52 = var27;

		for (var22 = 0; var22 < var25.anInt223; var22++) {
			Class18 var17 = aClass18Array1702[var25.anIntArray224[var22]];
			float[] var18 = aFloatArray1715;
			var17.method341(var18, var7 >> 1, var52);
		}

		int var45;
		if (!var27) {
			var22 = var25.anInt222;
			var45 = var25.anIntArray221[var22];
			aClass12Array1705[var45].method187(aFloatArray1715, var7 >> 1);
		}

		int var46;
		if (var27) {
			for (var22 = var7 >> 1; var22 < var7; var22++) {
				aFloatArray1715[var22] = 0.0F;
			}
		} else {
			var22 = var7 >> 1;
			var45 = var7 >> 2;
			var46 = var7 >> 3;
			float[] var12 = aFloatArray1715;

			int var30;
			for (var30 = 0; var30 < var22; var30++) {
				var12[var30] *= 0.5F;
			}

			for (var30 = var22; var30 < var7; var30++) {
				var12[var30] = -var12[var7 - var30 - 1];
			}

			float[] var53 = var8 ? aFloatArray1719 : aFloatArray1716;
			float[] var39 = var8 ? aFloatArray1720 : aFloatArray1693;
			float[] var28 = var8 ? aFloatArray1721 : aFloatArray1703;
			int[] var34 = var8 ? anIntArray1723 : anIntArray1722;

			float var2;
			float var5;
			int var9;
			float var13;
			float var14;
			for (var9 = 0; var9 < var45; var9++) {
				var2 = var12[var9 * 4] - var12[var7 - var9 * 4 - 1];
				var5 = var12[var9 * 4 + 2] - var12[var7 - var9 * 4 - 3];
				var14 = var53[var9 * 2];
				var13 = var53[var9 * 2 + 1];
				var12[var7 - var9 * 4 - 1] = var2 * var14 - var5 * var13;
				var12[var7 - var9 * 4 - 3] = var2 * var13 + var5 * var14;
			}

			float var23;
			float var31;
			for (var9 = 0; var9 < var46; var9++) {
				var2 = var12[var22 + 3 + var9 * 4];
				var5 = var12[var22 + 1 + var9 * 4];
				var14 = var12[var9 * 4 + 3];
				var13 = var12[var9 * 4 + 1];
				var12[var22 + 3 + var9 * 4] = var2 + var14;
				var12[var22 + 1 + var9 * 4] = var5 + var13;
				var23 = var53[var22 - 4 - var9 * 4];
				var31 = var53[var22 - 3 - var9 * 4];
				var12[var9 * 4 + 3] = (var2 - var14) * var23 - (var5 - var13) * var31;
				var12[var9 * 4 + 1] = (var5 - var13) * var23 + (var2 - var14) * var31;
			}

			var9 = Class117_Sub24.method2341(var7 - 1, -381115549);

			int var40;
			int var41;
			int var43;
			int var44;
			for (var40 = 0; var40 < var9 - 3; var40++) {
				var41 = var7 >> var40 + 2;
				var44 = 8 << var40;

				for (var43 = 0; var43 < 2 << var40; var43++) {
					int var49 = var7 - var41 * 2 * var43;
					int var54 = var7 - var41 * (var43 * 2 + 1);

					for (int var19 = 0; var19 < var7 >> var40 + 4; var19++) {
						int var24 = var19 * 4;
						float var33 = var12[var49 - 1 - var24];
						float var35 = var12[var49 - 3 - var24];
						float var32 = var12[var54 - 1 - var24];
						float var36 = var12[var54 - 3 - var24];
						var12[var49 - 1 - var24] = var33 + var32;
						var12[var49 - 3 - var24] = var35 + var36;
						float var37 = var53[var19 * var44];
						float var38 = var53[var19 * var44 + 1];
						var12[var54 - 1 - var24] = (var33 - var32) * var37 - (var35 - var36) * var38;
						var12[var54 - 3 - var24] = (var35 - var36) * var37 + (var33 - var32) * var38;
					}
				}
			}

			for (var40 = 1; var40 < var46 - 1; var40++) {
				var41 = var34[var40];
				if (var40 < var41) {
					var44 = var40 * 8;
					var43 = var41 * 8;
					var23 = var12[var44 + 1];
					var12[var44 + 1] = var12[var43 + 1];
					var12[var43 + 1] = var23;
					var23 = var12[var44 + 3];
					var12[var44 + 3] = var12[var43 + 3];
					var12[var43 + 3] = var23;
					var23 = var12[var44 + 5];
					var12[var44 + 5] = var12[var43 + 5];
					var12[var43 + 5] = var23;
					var23 = var12[var44 + 7];
					var12[var44 + 7] = var12[var43 + 7];
					var12[var43 + 7] = var23;
				}
			}

			for (var40 = 0; var40 < var22; var40++) {
				var12[var40] = var12[var40 * 2 + 1];
			}

			for (var40 = 0; var40 < var46; var40++) {
				var12[var7 - 1 - var40 * 2] = var12[var40 * 4];
				var12[var7 - 2 - var40 * 2] = var12[var40 * 4 + 1];
				var12[var7 - var45 - 1 - var40 * 2] = var12[var40 * 4 + 2];
				var12[var7 - var45 - 2 - var40 * 2] = var12[var40 * 4 + 3];
			}

			for (var40 = 0; var40 < var46; var40++) {
				var5 = var28[var40 * 2];
				var14 = var28[var40 * 2 + 1];
				var13 = var12[var22 + var40 * 2];
				var23 = var12[var22 + var40 * 2 + 1];
				var31 = var12[var7 - 2 - var40 * 2];
				float var48 = var12[var7 - 1 - var40 * 2];
				float var51 = var14 * (var13 - var31) + var5 * (var23 + var48);
				var12[var22 + var40 * 2] = (var13 + var31 + var51) * 0.5F;
				var12[var7 - 2 - var40 * 2] = (var13 + var31 - var51) * 0.5F;
				var51 = var14 * (var23 + var48) - var5 * (var13 - var31);
				var12[var22 + var40 * 2 + 1] = (var23 - var48 + var51) * 0.5F;
				var12[var7 - 1 - var40 * 2] = (-var23 + var48 + var51) * 0.5F;
			}

			for (var40 = 0; var40 < var45; var40++) {
				var12[var40] = var12[var40 * 2 + var22] * var39[var40 * 2] + var12[var40 * 2 + 1 + var22] * var39[var40 * 2 + 1];
				var12[var22 - 1 - var40] = var12[var40 * 2 + var22] * var39[var40 * 2 + 1] - var12[var40 * 2 + 1 + var22] * var39[var40 * 2];
			}

			for (var40 = 0; var40 < var45; var40++) {
				var12[var7 - var45 + var40] = -var12[var40];
			}

			for (var40 = 0; var40 < var45; var40++) {
				var12[var40] = var12[var45 + var40];
			}

			for (var40 = 0; var40 < var45; var40++) {
				var12[var45 + var40] = -var12[var45 - var40 - 1];
			}

			for (var40 = 0; var40 < var45; var40++) {
				var12[var22 + var40] = var12[var7 - var40 - 1];
			}

			for (var40 = var3; var40 < var16; var40++) {
				var5 = (float) Math.sin(((double) (var40 - var3) + 0.5D) / (double) var4 * 0.5D * 3.141592653589793D);
				aFloatArray1715[var40] *= (float) Math.sin(1.5707963267948966D * (double) var5 * (double) var5);
			}

			for (var40 = var29; var40 < var20; var40++) {
				var5 = (float) Math.sin(((double) (var40 - var29) + 0.5D) / (double) var21 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				aFloatArray1715[var40] *= (float) Math.sin(1.5707963267948966D * (double) var5 * (double) var5);
			}
		}

		float[] var50 = null;
		if (anInt1712 > 0) {
			var45 = anInt1712 + var7 >> 2;
			var50 = new float[var45];
			int var42;
			if (!aBool1707) {
				for (var46 = 0; var46 < anInt1713; var46++) {
					var42 = (anInt1712 >> 1) + var46;
					var50[var46] += aFloatArray1709[var42];
				}
			}

			if (!var27) {
				for (var46 = var3; var46 < var7 >> 1; var46++) {
					var42 = var50.length - (var7 >> 1) + var46;
					var50[var42] += aFloatArray1715[var46];
				}
			}
		}

		float[] var47 = aFloatArray1709;
		aFloatArray1709 = aFloatArray1715;
		aFloatArray1715 = var47;
		anInt1712 = var7;
		anInt1713 = var20 - (var7 >> 1);
		aBool1707 = var27;
		return var50;
	}

	static boolean method1907(Class106 var0) {
		if (!aBool1710) {
			byte[] var1 = var0.method1380(0, 0, (byte) 4);
			if (var1 == null) {
				return false;
			}

			method1904(var1);
			aBool1710 = true;
		}

		return true;
	}

	static int method1908(int var0) {
		int var1 = 0;

		int var2;
		int var3;
		for (var2 = 0; var0 >= 8 - anInt1701; var0 -= var3) {
			var3 = 8 - anInt1701;
			int var4 = (1 << var3) - 1;
			var1 += (aByteArray1699[anInt1700] >> anInt1701 & var4) << var2;
			anInt1701 = 0;
			++anInt1700;
			var2 += var3;
		}

		if (var0 > 0) {
			var3 = (1 << var0) - 1;
			var1 += (aByteArray1699[anInt1700] >> anInt1701 & var3) << var2;
			anInt1701 += var0;
		}

		return var1;
	}

	static Class117_Sub3 method1910(Class106 var0, int var1, int var2) {
		if (method1907(var0)) {
			byte[] var3 = var0.method1380(var1, var2, (byte) 27);
			return var3 == null ? null : new Class117_Sub3(var3);
		} else {
			var0.method1382(var1, var2, (byte) 13);
			return null;
		}
	}

	static int method1911() {
		int var0 = aByteArray1699[anInt1700] >> anInt1701 & 1;
		++anInt1701;
		anInt1700 += anInt1701 >> 3;
		anInt1701 &= 7;
		return var0;
	}

	static float method1917(int var0) {
		int var1 = var0 & 2097151;
		int var3 = var0 & Integer.MIN_VALUE;
		int var2 = (var0 & 2145386496) >> 21;
		if (var3 != 0) {
			var1 = -var1;
		}

		return (float) ((double) var1 * Math.pow(2.0D, (double) (var2 - 788)));
	}

}
