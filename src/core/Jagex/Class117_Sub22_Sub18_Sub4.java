package core.Jagex;
public class Class117_Sub22_Sub18_Sub4 extends Class117_Sub22_Sub18 {

	int anInt2655 = 0;
	int anInt2671 = 0;
	byte aByte2659 = 0;
	boolean aBool2677 = false;
	byte[] aByteArray2680;
	int anInt2670;
	int[] anIntArray2700;
	int[] anIntArray2661;
	int[] anIntArray2658;
	int[] anIntArray2660;
	int[] anIntArray2691;
	int[] anIntArray2662;
	int[] anIntArray2682;
	byte[] aByteArray2663;
	byte[] aByteArray2664;
	byte[] aByteArray2701;
	int[] anIntArray2683;
	short[] aShortArray2668;
	short[] aShortArray2667;
	byte[] aByteArray2666;
	short[] aShortArray2672;
	short[] aShortArray2673;
	short[] aShortArray2657;
	short[] aShortArray2690;
	short[] aShortArray2676;
	short[] aShortArray2669;
	short[] aShortArray2678;
	byte[] aByteArray2674;
	short[] aShortArray2679;
	short[] aShortArray2695;
	int[][] anIntArrayArray2665;
	int[][] anIntArrayArray2685;
	Class38[] aClass38Array2675;
	Class30[] aClass30Array2686;
	Class38[] aClass38Array2688;
	public short aShort2689;
	public short aShort2681;
	int anInt2692;
	int anInt2693;
	int anInt2694;
	int anInt2684;
	int anInt2696;
	static int anInt2699 = 0;
	static int[] anIntArray2697 = new int[10000];
	static int[] anIntArray2698 = new int[10000];
	static int[] anIntArray2687;
	static int[] anIntArray2656;

	public static Class117_Sub22_Sub18_Sub4 method3155(Class106 var0, int var1, int var2) {
		byte[] var3 = var0.method1380(var1, var2, (byte) 50);
		return var3 == null ? null : new Class117_Sub22_Sub18_Sub4(var3);
	}

	Class117_Sub22_Sub18_Sub4(byte[] var1) {
		if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
			method3156(var1);
		} else {
			method3157(var1);
		}

	}

	void method3156(byte[] var1) {
		Class117_Sub14 var2 = new Class117_Sub14(var1);
		Class117_Sub14 var15 = new Class117_Sub14(var1);
		Class117_Sub14 var5 = new Class117_Sub14(var1);
		Class117_Sub14 var4 = new Class117_Sub14(var1);
		Class117_Sub14 var48 = new Class117_Sub14(var1);
		Class117_Sub14 var7 = new Class117_Sub14(var1);
		Class117_Sub14 var16 = new Class117_Sub14(var1);
		var2.anInt1880 = (var1.length - 23) * -2079217519;
		int var8 = var2.method2012(1053511631);
		int var9 = var2.method2012(1053511631);
		int var10 = var2.method2010(-1439707937);
		int var29 = var2.method2010(-1439707937);
		int var31 = var2.method2010(-1439707937);
		int var37 = var2.method2010(-1439707937);
		int var34 = var2.method2010(-1439707937);
		int var32 = var2.method2010(-1439707937);
		int var17 = var2.method2010(-1439707937);
		int var18 = var2.method2012(1053511631);
		int var19 = var2.method2012(1053511631);
		int var42 = var2.method2012(1053511631);
		int var52 = var2.method2012(1053511631);
		int var21 = var2.method2012(1053511631);
		int var22 = 0;
		int var23 = 0;
		int var24 = 0;
		int var25;
		if (var10 > 0) {
			aByteArray2680 = new byte[var10];
			var2.anInt1880 = 0;

			for (var25 = 0; var25 < var10; var25++) {
				byte var26 = aByteArray2680[var25] = var2.method1997(270116278);
				if (var26 == 0) {
					++var22;
				}

				if (var26 >= 1 && var26 <= 3) {
					++var23;
				}

				if (var26 == 2) {
					++var24;
				}
			}
		}

		var25 = var10 + var8;
		int var28 = var25;
		if (var29 == 1) {
			var25 += var9;
		}

		int var30 = var25;
		var25 += var9;
		int var54 = var25;
		if (var31 == 255) {
			var25 += var9;
		}

		int var33 = var25;
		if (var34 == 1) {
			var25 += var9;
		}

		int var35 = var25;
		if (var17 == 1) {
			var25 += var8;
		}

		int var36 = var25;
		if (var37 == 1) {
			var25 += var9;
		}

		int var53 = var25;
		var25 += var52;
		int var38 = var25;
		if (var32 == 1) {
			var25 += var9 * 2;
		}

		int var40 = var25;
		var25 += var21;
		int var41 = var25;
		var25 += var9 * 2;
		int var47 = var25;
		var25 += var18;
		int var6 = var25;
		var25 += var19;
		int var49 = var25;
		var25 += var42;
		int var57 = var25;
		var25 += var22 * 6;
		int var43 = var25;
		var25 += var23 * 6;
		int var27 = var25;
		var25 += var23 * 6;
		int var56 = var25;
		var25 += var23 * 2;
		int var44 = var25;
		var25 += var23;
		int var46 = var25;
		var25 += var23 * 2 + var24 * 2;
		anInt2655 = var8;
		anInt2671 = var9;
		anInt2670 = var10;
		anIntArray2700 = new int[var8];
		anIntArray2661 = new int[var8];
		anIntArray2658 = new int[var8];
		anIntArray2660 = new int[var9];
		anIntArray2691 = new int[var9];
		anIntArray2662 = new int[var9];
		if (var17 == 1) {
			anIntArray2682 = new int[var8];
		}

		if (var29 == 1) {
			aByteArray2663 = new byte[var9];
		}

		if (var31 == 255) {
			aByteArray2664 = new byte[var9];
		} else {
			aByte2659 = (byte) var31;
		}

		if (var37 == 1) {
			aByteArray2701 = new byte[var9];
		}

		if (var34 == 1) {
			anIntArray2683 = new int[var9];
		}

		if (var32 == 1) {
			aShortArray2668 = new short[var9];
		}

		if (var32 == 1 && var10 > 0) {
			aByteArray2666 = new byte[var9];
		}

		aShortArray2667 = new short[var9];
		if (var10 > 0) {
			aShortArray2672 = new short[var10];
			aShortArray2673 = new short[var10];
			aShortArray2657 = new short[var10];
			if (var23 > 0) {
				aShortArray2690 = new short[var23];
				aShortArray2676 = new short[var23];
				aShortArray2669 = new short[var23];
				aShortArray2678 = new short[var23];
				aByteArray2674 = new byte[var23];
				aShortArray2679 = new short[var23];
			}

			if (var24 > 0) {
				aShortArray2695 = new short[var24];
			}
		}

		var2.anInt1880 = var10 * -2079217519;
		var15.anInt1880 = var47 * -2079217519;
		var5.anInt1880 = var6 * -2079217519;
		var4.anInt1880 = var49 * -2079217519;
		var48.anInt1880 = var35 * -2079217519;
		int var50 = 0;
		int var51 = 0;
		int var14 = 0;

		int var3;
		int var11;
		int var12;
		int var13;
		int var39;
		for (var11 = 0; var11 < var8; var11++) {
			var12 = var2.method2010(-1439707937);
			var39 = 0;
			if ((var12 & 1) != 0) {
				var39 = var15.method2056(-1003847421);
			}

			var13 = 0;
			if ((var12 & 2) != 0) {
				var13 = var5.method2056(-1003847421);
			}

			var3 = 0;
			if ((var12 & 4) != 0) {
				var3 = var4.method2056(-1003847421);
			}

			anIntArray2700[var11] = var50 + var39;
			anIntArray2661[var11] = var51 + var13;
			anIntArray2658[var11] = var14 + var3;
			var50 = anIntArray2700[var11];
			var51 = anIntArray2661[var11];
			var14 = anIntArray2658[var11];
			if (var17 == 1) {
				anIntArray2682[var11] = var48.method2010(-1439707937);
			}
		}

		var2.anInt1880 = var41 * -2079217519;
		var15.anInt1880 = var28 * -2079217519;
		var5.anInt1880 = var54 * -2079217519;
		var4.anInt1880 = var36 * -2079217519;
		var48.anInt1880 = var33 * -2079217519;
		var7.anInt1880 = var38 * -2079217519;
		var16.anInt1880 = var40 * -2079217519;

		for (var11 = 0; var11 < var9; var11++) {
			aShortArray2667[var11] = (short) var2.method2012(1053511631);
			if (var29 == 1) {
				aByteArray2663[var11] = var15.method1997(-114691468);
			}

			if (var31 == 255) {
				aByteArray2664[var11] = var5.method1997(597377414);
			}

			if (var37 == 1) {
				aByteArray2701[var11] = var4.method1997(-1034253815);
			}

			if (var34 == 1) {
				anIntArray2683[var11] = var48.method2010(-1439707937);
			}

			if (var32 == 1) {
				aShortArray2668[var11] = (short) (var7.method2012(1053511631) - 1);
			}

			if (aByteArray2666 != null && aShortArray2668[var11] != -1) {
				aByteArray2666[var11] = (byte) (var16.method2010(-1439707937) - 1);
			}
		}

		var2.anInt1880 = var53 * -2079217519;
		var15.anInt1880 = var30 * -2079217519;
		var11 = 0;
		var12 = 0;
		var39 = 0;
		var13 = 0;

		int var20;
		for (var3 = 0; var3 < var9; var3++) {
			var20 = var15.method2010(-1439707937);
			if (var20 == 1) {
				var11 = var2.method2056(-1003847421) + var13;
				var12 = var2.method2056(-1003847421) + var11;
				var39 = var2.method2056(-1003847421) + var12;
				var13 = var39;
				anIntArray2660[var3] = var11;
				anIntArray2691[var3] = var12;
				anIntArray2662[var3] = var39;
			}

			if (var20 == 2) {
				var12 = var39;
				var39 = var2.method2056(-1003847421) + var13;
				var13 = var39;
				anIntArray2660[var3] = var11;
				anIntArray2691[var3] = var12;
				anIntArray2662[var3] = var39;
			}

			if (var20 == 3) {
				var11 = var39;
				var39 = var2.method2056(-1003847421) + var13;
				var13 = var39;
				anIntArray2660[var3] = var11;
				anIntArray2691[var3] = var12;
				anIntArray2662[var3] = var39;
			}

			if (var20 == 4) {
				int var55 = var11;
				var11 = var12;
				var12 = var55;
				var39 = var2.method2056(-1003847421) + var13;
				var13 = var39;
				anIntArray2660[var3] = var11;
				anIntArray2691[var3] = var55;
				anIntArray2662[var3] = var39;
			}
		}

		var2.anInt1880 = var57 * -2079217519;
		var15.anInt1880 = var43 * -2079217519;
		var5.anInt1880 = var27 * -2079217519;
		var4.anInt1880 = var56 * -2079217519;
		var48.anInt1880 = var44 * -2079217519;
		var7.anInt1880 = var46 * -2079217519;

		for (var3 = 0; var3 < var10; var3++) {
			var20 = aByteArray2680[var3] & 255;
			if (var20 == 0) {
				aShortArray2672[var3] = (short) var2.method2012(1053511631);
				aShortArray2673[var3] = (short) var2.method2012(1053511631);
				aShortArray2657[var3] = (short) var2.method2012(1053511631);
			}

			if (var20 == 1) {
				aShortArray2672[var3] = (short) var15.method2012(1053511631);
				aShortArray2673[var3] = (short) var15.method2012(1053511631);
				aShortArray2657[var3] = (short) var15.method2012(1053511631);
				aShortArray2690[var3] = (short) var5.method2012(1053511631);
				aShortArray2676[var3] = (short) var5.method2012(1053511631);
				aShortArray2669[var3] = (short) var5.method2012(1053511631);
				aShortArray2678[var3] = (short) var4.method2012(1053511631);
				aByteArray2674[var3] = var48.method1997(-455666256);
				aShortArray2679[var3] = (short) var7.method2012(1053511631);
			}

			if (var20 == 2) {
				aShortArray2672[var3] = (short) var15.method2012(1053511631);
				aShortArray2673[var3] = (short) var15.method2012(1053511631);
				aShortArray2657[var3] = (short) var15.method2012(1053511631);
				aShortArray2690[var3] = (short) var5.method2012(1053511631);
				aShortArray2676[var3] = (short) var5.method2012(1053511631);
				aShortArray2669[var3] = (short) var5.method2012(1053511631);
				aShortArray2678[var3] = (short) var4.method2012(1053511631);
				aByteArray2674[var3] = var48.method1997(324150910);
				aShortArray2679[var3] = (short) var7.method2012(1053511631);
				aShortArray2695[var3] = (short) var7.method2012(1053511631);
			}

			if (var20 == 3) {
				aShortArray2672[var3] = (short) var15.method2012(1053511631);
				aShortArray2673[var3] = (short) var15.method2012(1053511631);
				aShortArray2657[var3] = (short) var15.method2012(1053511631);
				aShortArray2690[var3] = (short) var5.method2012(1053511631);
				aShortArray2676[var3] = (short) var5.method2012(1053511631);
				aShortArray2669[var3] = (short) var5.method2012(1053511631);
				aShortArray2678[var3] = (short) var4.method2012(1053511631);
				aByteArray2674[var3] = var48.method1997(1582535187);
				aShortArray2679[var3] = (short) var7.method2012(1053511631);
			}
		}

		var2.anInt1880 = var25 * -2079217519;
		var3 = var2.method2010(-1439707937);
		if (var3 != 0) {
			new Class22();
			var2.method2012(1053511631);
			var2.method2012(1053511631);
			var2.method2012(1053511631);
			var2.method2015((byte) 55);
		}

	}

	void method3157(byte[] var1) {
		boolean var2 = false;
		boolean var44 = false;
		Class117_Sub14 var4 = new Class117_Sub14(var1);
		Class117_Sub14 var21 = new Class117_Sub14(var1);
		Class117_Sub14 var6 = new Class117_Sub14(var1);
		Class117_Sub14 var43 = new Class117_Sub14(var1);
		Class117_Sub14 var8 = new Class117_Sub14(var1);
		var4.anInt1880 = (var1.length - 18) * -2079217519;
		int var14 = var4.method2012(1053511631);
		int var23 = var4.method2012(1053511631);
		int var10 = var4.method2010(-1439707937);
		int var11 = var4.method2010(-1439707937);
		int var12 = var4.method2010(-1439707937);
		int var36 = var4.method2010(-1439707937);
		int var13 = var4.method2010(-1439707937);
		int var26 = var4.method2010(-1439707937);
		int var41 = var4.method2012(1053511631);
		int var32 = var4.method2012(1053511631);
		int var34 = var4.method2012(1053511631);
		int var18 = var4.method2012(1053511631);
		byte var16 = 0;
		int var46 = var16 + var14;
		int var20 = var46;
		var46 += var23;
		int var22 = var46;
		if (var12 == 255) {
			var46 += var23;
		}

		int var24 = var46;
		if (var13 == 1) {
			var46 += var23;
		}

		int var17 = var46;
		if (var11 == 1) {
			var46 += var23;
		}

		int var37 = var46;
		if (var26 == 1) {
			var46 += var14;
		}

		int var27 = var46;
		if (var36 == 1) {
			var46 += var23;
		}

		int var28 = var46;
		var46 += var18;
		int var42 = var46;
		var46 += var23 * 2;
		int var29 = var46;
		var46 += var10 * 6;
		int var30 = var46;
		var46 += var41;
		int var31 = var46;
		var46 += var32;
		int var10000 = var46 + var34;
		anInt2655 = var14;
		anInt2671 = var23;
		anInt2670 = var10;
		anIntArray2700 = new int[var14];
		anIntArray2661 = new int[var14];
		anIntArray2658 = new int[var14];
		anIntArray2660 = new int[var23];
		anIntArray2691 = new int[var23];
		anIntArray2662 = new int[var23];
		if (var10 > 0) {
			aByteArray2680 = new byte[var10];
			aShortArray2672 = new short[var10];
			aShortArray2673 = new short[var10];
			aShortArray2657 = new short[var10];
		}

		if (var26 == 1) {
			anIntArray2682 = new int[var14];
		}

		if (var11 == 1) {
			aByteArray2663 = new byte[var23];
			aByteArray2666 = new byte[var23];
			aShortArray2668 = new short[var23];
		}

		if (var12 == 255) {
			aByteArray2664 = new byte[var23];
		} else {
			aByte2659 = (byte) var12;
		}

		if (var36 == 1) {
			aByteArray2701 = new byte[var23];
		}

		if (var13 == 1) {
			anIntArray2683 = new int[var23];
		}

		aShortArray2667 = new short[var23];
		var4.anInt1880 = var16 * -2079217519;
		var21.anInt1880 = var30 * -2079217519;
		var6.anInt1880 = var31 * -2079217519;
		var43.anInt1880 = var46 * -2079217519;
		var8.anInt1880 = var37 * -2079217519;
		int var38 = 0;
		int var39 = 0;
		int var40 = 0;

		int var3;
		int var5;
		int var7;
		int var9;
		int var15;
		for (var3 = 0; var3 < var14; var3++) {
			var9 = var4.method2010(-1439707937);
			var7 = 0;
			if ((var9 & 1) != 0) {
				var7 = var21.method2056(-1003847421);
			}

			var15 = 0;
			if ((var9 & 2) != 0) {
				var15 = var6.method2056(-1003847421);
			}

			var5 = 0;
			if ((var9 & 4) != 0) {
				var5 = var43.method2056(-1003847421);
			}

			anIntArray2700[var3] = var38 + var7;
			anIntArray2661[var3] = var39 + var15;
			anIntArray2658[var3] = var40 + var5;
			var38 = anIntArray2700[var3];
			var39 = anIntArray2661[var3];
			var40 = anIntArray2658[var3];
			if (var26 == 1) {
				anIntArray2682[var3] = var8.method2010(-1439707937);
			}
		}

		var4.anInt1880 = var42 * -2079217519;
		var21.anInt1880 = var17 * -2079217519;
		var6.anInt1880 = var22 * -2079217519;
		var43.anInt1880 = var27 * -2079217519;
		var8.anInt1880 = var24 * -2079217519;

		for (var3 = 0; var3 < var23; var3++) {
			aShortArray2667[var3] = (short) var4.method2012(1053511631);
			if (var11 == 1) {
				var9 = var21.method2010(-1439707937);
				if ((var9 & 1) == 1) {
					aByteArray2663[var3] = 1;
					var2 = true;
				} else {
					aByteArray2663[var3] = 0;
				}

				if ((var9 & 2) == 2) {
					aByteArray2666[var3] = (byte) (var9 >> 2);
					aShortArray2668[var3] = aShortArray2667[var3];
					aShortArray2667[var3] = 127;
					if (aShortArray2668[var3] != -1) {
						var44 = true;
					}
				} else {
					aByteArray2666[var3] = -1;
					aShortArray2668[var3] = -1;
				}
			}

			if (var12 == 255) {
				aByteArray2664[var3] = var6.method1997(-2124306411);
			}

			if (var36 == 1) {
				aByteArray2701[var3] = var43.method1997(-603719535);
			}

			if (var13 == 1) {
				anIntArray2683[var3] = var8.method2010(-1439707937);
			}
		}

		var4.anInt1880 = var28 * -2079217519;
		var21.anInt1880 = var20 * -2079217519;
		var3 = 0;
		var9 = 0;
		var7 = 0;
		var15 = 0;

		int var19;
		int var25;
		for (var5 = 0; var5 < var23; var5++) {
			var25 = var21.method2010(-1439707937);
			if (var25 == 1) {
				var3 = var4.method2056(-1003847421) + var15;
				var9 = var4.method2056(-1003847421) + var3;
				var7 = var4.method2056(-1003847421) + var9;
				var15 = var7;
				anIntArray2660[var5] = var3;
				anIntArray2691[var5] = var9;
				anIntArray2662[var5] = var7;
			}

			if (var25 == 2) {
				var9 = var7;
				var7 = var4.method2056(-1003847421) + var15;
				var15 = var7;
				anIntArray2660[var5] = var3;
				anIntArray2691[var5] = var9;
				anIntArray2662[var5] = var7;
			}

			if (var25 == 3) {
				var3 = var7;
				var7 = var4.method2056(-1003847421) + var15;
				var15 = var7;
				anIntArray2660[var5] = var3;
				anIntArray2691[var5] = var9;
				anIntArray2662[var5] = var7;
			}

			if (var25 == 4) {
				var19 = var3;
				var3 = var9;
				var9 = var19;
				var7 = var4.method2056(-1003847421) + var15;
				var15 = var7;
				anIntArray2660[var5] = var3;
				anIntArray2691[var5] = var19;
				anIntArray2662[var5] = var7;
			}
		}

		var4.anInt1880 = var29 * -2079217519;

		for (var5 = 0; var5 < var10; var5++) {
			aByteArray2680[var5] = 0;
			aShortArray2672[var5] = (short) var4.method2012(1053511631);
			aShortArray2673[var5] = (short) var4.method2012(1053511631);
			aShortArray2657[var5] = (short) var4.method2012(1053511631);
		}

		if (aByteArray2666 != null) {
			boolean var45 = false;

			for (var25 = 0; var25 < var23; var25++) {
				var19 = aByteArray2666[var25] & 255;
				if (var19 != 255) {
					if ((aShortArray2672[var19] & 65535) == anIntArray2660[var25] && (aShortArray2673[var19] & 65535) == anIntArray2691[var25] && (aShortArray2657[var19] & 65535) == anIntArray2662[var25]) {
						aByteArray2666[var25] = -1;
					} else {
						var45 = true;
					}
				}
			}

			if (!var45) {
				aByteArray2666 = null;
			}
		}

		if (!var44) {
			aShortArray2668 = null;
		}

		if (!var2) {
			aByteArray2663 = null;
		}

	}

	final int method3159(Class117_Sub22_Sub18_Sub4 var1, int var2) {
		int var3 = -1;
		int var7 = var1.anIntArray2700[var2];
		int var4 = var1.anIntArray2661[var2];
		int var5 = var1.anIntArray2658[var2];

		for (int var6 = 0; var6 < anInt2655; var6++) {
			if (var7 == anIntArray2700[var6] && var4 == anIntArray2661[var6] && var5 == anIntArray2658[var6]) {
				var3 = var6;
				break;
			}
		}

		if (var3 == -1) {
			anIntArray2700[anInt2655] = var7;
			anIntArray2661[anInt2655] = var4;
			anIntArray2658[anInt2655] = var5;
			if (var1.anIntArray2682 != null) {
				anIntArray2682[anInt2655] = var1.anIntArray2682[var2];
			}

			var3 = anInt2655++;
		}

		return var3;
	}

	public Class117_Sub22_Sub18_Sub4(Class117_Sub22_Sub18_Sub4 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		anInt2655 = var1.anInt2655;
		anInt2671 = var1.anInt2671;
		anInt2670 = var1.anInt2670;
		int var6;
		if (var2) {
			anIntArray2700 = var1.anIntArray2700;
			anIntArray2661 = var1.anIntArray2661;
			anIntArray2658 = var1.anIntArray2658;
		} else {
			anIntArray2700 = new int[anInt2655];
			anIntArray2661 = new int[anInt2655];
			anIntArray2658 = new int[anInt2655];

			for (var6 = 0; var6 < anInt2655; var6++) {
				anIntArray2700[var6] = var1.anIntArray2700[var6];
				anIntArray2661[var6] = var1.anIntArray2661[var6];
				anIntArray2658[var6] = var1.anIntArray2658[var6];
			}
		}

		if (var3) {
			aShortArray2667 = var1.aShortArray2667;
		} else {
			aShortArray2667 = new short[anInt2671];

			for (var6 = 0; var6 < anInt2671; var6++) {
				aShortArray2667[var6] = var1.aShortArray2667[var6];
			}
		}

		if (!var4 && var1.aShortArray2668 != null) {
			aShortArray2668 = new short[anInt2671];

			for (var6 = 0; var6 < anInt2671; var6++) {
				aShortArray2668[var6] = var1.aShortArray2668[var6];
			}
		} else {
			aShortArray2668 = var1.aShortArray2668;
		}

		if (var5) {
			aByteArray2701 = var1.aByteArray2701;
		} else {
			aByteArray2701 = new byte[anInt2671];
			if (var1.aByteArray2701 == null) {
				for (var6 = 0; var6 < anInt2671; var6++) {
					aByteArray2701[var6] = 0;
				}
			} else {
				for (var6 = 0; var6 < anInt2671; var6++) {
					aByteArray2701[var6] = var1.aByteArray2701[var6];
				}
			}
		}

		anIntArray2660 = var1.anIntArray2660;
		anIntArray2691 = var1.anIntArray2691;
		anIntArray2662 = var1.anIntArray2662;
		aByteArray2663 = var1.aByteArray2663;
		aByteArray2664 = var1.aByteArray2664;
		aByteArray2666 = var1.aByteArray2666;
		aByte2659 = var1.aByte2659;
		aByteArray2680 = var1.aByteArray2680;
		aShortArray2672 = var1.aShortArray2672;
		aShortArray2673 = var1.aShortArray2673;
		aShortArray2657 = var1.aShortArray2657;
		aShortArray2690 = var1.aShortArray2690;
		aShortArray2676 = var1.aShortArray2676;
		aShortArray2669 = var1.aShortArray2669;
		aShortArray2678 = var1.aShortArray2678;
		aByteArray2674 = var1.aByteArray2674;
		aShortArray2679 = var1.aShortArray2679;
		aShortArray2695 = var1.aShortArray2695;
		anIntArray2682 = var1.anIntArray2682;
		anIntArray2683 = var1.anIntArray2683;
		anIntArrayArray2665 = var1.anIntArrayArray2665;
		anIntArrayArray2685 = var1.anIntArrayArray2685;
		aClass38Array2675 = var1.aClass38Array2675;
		aClass30Array2686 = var1.aClass30Array2686;
		aClass38Array2688 = var1.aClass38Array2688;
		aShort2689 = var1.aShort2689;
		aShort2681 = var1.aShort2681;
	}

	public Class117_Sub22_Sub18_Sub4 method3160() {
		Class117_Sub22_Sub18_Sub4 var1 = new Class117_Sub22_Sub18_Sub4();
		if (aByteArray2663 != null) {
			var1.aByteArray2663 = new byte[anInt2671];

			for (int var2 = 0; var2 < anInt2671; var2++) {
				var1.aByteArray2663[var2] = aByteArray2663[var2];
			}
		}

		var1.anInt2655 = anInt2655;
		var1.anInt2671 = anInt2671;
		var1.anInt2670 = anInt2670;
		var1.anIntArray2700 = anIntArray2700;
		var1.anIntArray2661 = anIntArray2661;
		var1.anIntArray2658 = anIntArray2658;
		var1.anIntArray2660 = anIntArray2660;
		var1.anIntArray2691 = anIntArray2691;
		var1.anIntArray2662 = anIntArray2662;
		var1.aByteArray2664 = aByteArray2664;
		var1.aByteArray2701 = aByteArray2701;
		var1.aByteArray2666 = aByteArray2666;
		var1.aShortArray2667 = aShortArray2667;
		var1.aShortArray2668 = aShortArray2668;
		var1.aByte2659 = aByte2659;
		var1.aByteArray2680 = aByteArray2680;
		var1.aShortArray2672 = aShortArray2672;
		var1.aShortArray2673 = aShortArray2673;
		var1.aShortArray2657 = aShortArray2657;
		var1.aShortArray2690 = aShortArray2690;
		var1.aShortArray2676 = aShortArray2676;
		var1.aShortArray2669 = aShortArray2669;
		var1.aShortArray2678 = aShortArray2678;
		var1.aByteArray2674 = aByteArray2674;
		var1.aShortArray2679 = aShortArray2679;
		var1.aShortArray2695 = aShortArray2695;
		var1.anIntArray2682 = anIntArray2682;
		var1.anIntArray2683 = anIntArray2683;
		var1.anIntArrayArray2665 = anIntArrayArray2665;
		var1.anIntArrayArray2685 = anIntArrayArray2685;
		var1.aClass38Array2675 = aClass38Array2675;
		var1.aClass30Array2686 = aClass30Array2686;
		var1.aShort2689 = aShort2689;
		var1.aShort2681 = aShort2681;
		return var1;
	}

	public Class117_Sub22_Sub18_Sub4 method3161(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		method3174();
		int var8 = var2 + anInt2693;
		int var11 = var2 + anInt2694;
		int var13 = var4 + anInt2696;
		int var12 = var4 + anInt2684;
		if (var8 >= 0 && var11 + 128 >> 7 < var1.length && var13 >= 0 && var12 + 128 >> 7 < var1[0].length) {
			var8 >>= 7;
			var11 = var11 + 127 >> 7;
			var13 >>= 7;
			var12 = var12 + 127 >> 7;
			if (var1[var8][var13] == var3 && var1[var11][var13] == var3 && var1[var8][var12] == var3 && var1[var11][var12] == var3) {
				return this;
			} else {
				Class117_Sub22_Sub18_Sub4 var7;
				if (var5) {
					var7 = new Class117_Sub22_Sub18_Sub4();
					var7.anInt2655 = anInt2655;
					var7.anInt2671 = anInt2671;
					var7.anInt2670 = anInt2670;
					var7.anIntArray2700 = anIntArray2700;
					var7.anIntArray2658 = anIntArray2658;
					var7.anIntArray2660 = anIntArray2660;
					var7.anIntArray2691 = anIntArray2691;
					var7.anIntArray2662 = anIntArray2662;
					var7.aByteArray2663 = aByteArray2663;
					var7.aByteArray2664 = aByteArray2664;
					var7.aByteArray2701 = aByteArray2701;
					var7.aByteArray2666 = aByteArray2666;
					var7.aShortArray2667 = aShortArray2667;
					var7.aShortArray2668 = aShortArray2668;
					var7.aByte2659 = aByte2659;
					var7.aByteArray2680 = aByteArray2680;
					var7.aShortArray2672 = aShortArray2672;
					var7.aShortArray2673 = aShortArray2673;
					var7.aShortArray2657 = aShortArray2657;
					var7.aShortArray2690 = aShortArray2690;
					var7.aShortArray2676 = aShortArray2676;
					var7.aShortArray2669 = aShortArray2669;
					var7.aShortArray2678 = aShortArray2678;
					var7.aByteArray2674 = aByteArray2674;
					var7.aShortArray2679 = aShortArray2679;
					var7.aShortArray2695 = aShortArray2695;
					var7.anIntArray2682 = anIntArray2682;
					var7.anIntArray2683 = anIntArray2683;
					var7.anIntArrayArray2665 = anIntArrayArray2665;
					var7.anIntArrayArray2685 = anIntArrayArray2685;
					var7.aShort2689 = aShort2689;
					var7.aShort2681 = aShort2681;
					var7.anIntArray2661 = new int[var7.anInt2655];
				} else {
					var7 = this;
				}

				int var9;
				int var10;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var6 == 0) {
					for (var9 = 0; var9 < var7.anInt2655; var9++) {
						var10 = anIntArray2700[var9] + var2;
						var21 = anIntArray2658[var9] + var4;
						var18 = var10 & 127;
						var16 = var21 & 127;
						var19 = var10 >> 7;
						var14 = var21 >> 7;
						var15 = var1[var19][var14] * (128 - var18) + var1[var19 + 1][var14] * var18 >> 7;
						var17 = var1[var19][var14 + 1] * (128 - var18) + var1[var19 + 1][var14 + 1] * var18 >> 7;
						var20 = var15 * (128 - var16) + var17 * var16 >> 7;
						var7.anIntArray2661[var9] = anIntArray2661[var9] + var20 - var3;
					}
				} else {
					for (var9 = 0; var9 < var7.anInt2655; var9++) {
						var10 = (-anIntArray2661[var9] << 16) / (anInt2466 * 1871917943);
						if (var10 < var6) {
							var21 = anIntArray2700[var9] + var2;
							var18 = anIntArray2658[var9] + var4;
							var16 = var21 & 127;
							var19 = var18 & 127;
							var14 = var21 >> 7;
							var15 = var18 >> 7;
							var17 = var1[var14][var15] * (128 - var16) + var1[var14 + 1][var15] * var16 >> 7;
							var20 = var1[var14][var15 + 1] * (128 - var16) + var1[var14 + 1][var15 + 1] * var16 >> 7;
							int var22 = var17 * (128 - var19) + var20 * var19 >> 7;
							var7.anIntArray2661[var9] = anIntArray2661[var9] + (var22 - var3) * (var6 - var10) / var6;
						}
					}
				}

				var7.method3173();
				return var7;
			}
		} else {
			return this;
		}
	}

	public void method3163() {
		for (int var1 = 0; var1 < anInt2655; var1++) {
			int var2 = anIntArray2700[var1];
			anIntArray2700[var1] = anIntArray2658[var1];
			anIntArray2658[var1] = -var2;
		}

		method3173();
	}

	public void method3165() {
		for (int var1 = 0; var1 < anInt2655; var1++) {
			int var2 = anIntArray2658[var1];
			anIntArray2658[var1] = anIntArray2700[var1];
			anIntArray2700[var1] = -var2;
		}

		method3173();
	}

	public void method3166(int var1) {
		int var2 = anIntArray2687[var1];
		int var4 = anIntArray2656[var1];

		for (int var3 = 0; var3 < anInt2655; var3++) {
			int var5 = anIntArray2658[var3] * var2 + anIntArray2700[var3] * var4 >> 16;
			anIntArray2658[var3] = anIntArray2658[var3] * var4 - anIntArray2700[var3] * var2 >> 16;
			anIntArray2700[var3] = var5;
		}

		method3173();
	}

	public void method3167(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < anInt2655; var4++) {
			anIntArray2700[var4] += var1;
			anIntArray2661[var4] += var2;
			anIntArray2658[var4] += var3;
		}

		method3173();
	}

	public void method3168(short var1, short var2) {
		for (int var3 = 0; var3 < anInt2671; var3++) {
			if (aShortArray2667[var3] == var1) {
				aShortArray2667[var3] = var2;
			}
		}

	}

	public void method3170() {
		int var1;
		for (var1 = 0; var1 < anInt2655; var1++) {
			anIntArray2658[var1] = -anIntArray2658[var1];
		}

		for (var1 = 0; var1 < anInt2671; var1++) {
			int var2 = anIntArray2660[var1];
			anIntArray2660[var1] = anIntArray2662[var1];
			anIntArray2662[var1] = var2;
		}

		method3173();
	}

	void method3173() {
		aClass38Array2675 = null;
		aClass38Array2688 = null;
		aClass30Array2686 = null;
		aBool2677 = false;
	}

	void method3174() {
		if (!aBool2677) {
			anInt2466 = 0;
			anInt2692 = 0;
			anInt2693 = 999999;
			anInt2694 = -999999;
			anInt2684 = -99999;
			anInt2696 = 99999;

			for (int var1 = 0; var1 < anInt2655; var1++) {
				int var2 = anIntArray2700[var1];
				int var3 = anIntArray2661[var1];
				int var4 = anIntArray2658[var1];
				if (var2 < anInt2693) {
					anInt2693 = var2;
				}

				if (var2 > anInt2694) {
					anInt2694 = var2;
				}

				if (var4 < anInt2696) {
					anInt2696 = var4;
				}

				if (var4 > anInt2684) {
					anInt2684 = var4;
				}

				if (-var3 > anInt2466 * 1871917943) {
					anInt2466 = -var3 * 291739207;
				}

				if (var3 > anInt2692) {
					anInt2692 = var3;
				}
			}

			aBool2677 = true;
		}
	}

	static void method3175(Class117_Sub22_Sub18_Sub4 var0, Class117_Sub22_Sub18_Sub4 var1, int var2, int var3, int var4, boolean var5) {
		var0.method3174();
		var0.method3188();
		var1.method3174();
		var1.method3188();
		++anInt2699;
		int var8 = 0;
		int[] var9 = var1.anIntArray2700;
		int var14 = var1.anInt2655;

		int var12;
		for (var12 = 0; var12 < var0.anInt2655; var12++) {
			Class38 var11 = var0.aClass38Array2675[var12];
			if (var11.anInt470 * 394492497 != 0) {
				int var13 = var0.anIntArray2661[var12] - var3;
				if (var13 <= var1.anInt2692) {
					int var15 = var0.anIntArray2700[var12] - var2;
					if (var15 >= var1.anInt2693 && var15 <= var1.anInt2694) {
						int var16 = var0.anIntArray2658[var12] - var4;
						if (var16 >= var1.anInt2696 && var16 <= var1.anInt2684) {
							for (int var17 = 0; var17 < var14; var17++) {
								Class38 var7 = var1.aClass38Array2675[var17];
								if (var15 == var9[var17] && var16 == var1.anIntArray2658[var17] && var13 == var1.anIntArray2661[var17] && var7.anInt470 * 394492497 != 0) {
									if (var0.aClass38Array2688 == null) {
										var0.aClass38Array2688 = new Class38[var0.anInt2655];
									}

									if (var1.aClass38Array2688 == null) {
										var1.aClass38Array2688 = new Class38[var14];
									}

									Class38 var6 = var0.aClass38Array2688[var12];
									if (var6 == null) {
										var6 = var0.aClass38Array2688[var12] = new Class38(var11);
									}

									Class38 var10 = var1.aClass38Array2688[var17];
									if (var10 == null) {
										var10 = var1.aClass38Array2688[var17] = new Class38(var7);
									}

									var6.anInt474 += var7.anInt474 * 1;
									var6.anInt468 += var7.anInt468 * 1;
									var6.anInt469 += var7.anInt469 * 1;
									var6.anInt470 += var7.anInt470 * 1;
									var10.anInt474 += var11.anInt474 * 1;
									var10.anInt468 += var11.anInt468 * 1;
									var10.anInt469 += var11.anInt469 * 1;
									var10.anInt470 += var11.anInt470 * 1;
									++var8;
									anIntArray2697[var12] = anInt2699;
									anIntArray2698[var17] = anInt2699;
								}
							}
						}
					}
				}
			}
		}

		if (var8 >= 3 && var5) {
			for (var12 = 0; var12 < var0.anInt2671; var12++) {
				if (anIntArray2697[var0.anIntArray2660[var12]] == anInt2699 && anIntArray2697[var0.anIntArray2691[var12]] == anInt2699 && anIntArray2697[var0.anIntArray2662[var12]] == anInt2699) {
					if (var0.aByteArray2663 == null) {
						var0.aByteArray2663 = new byte[var0.anInt2671];
					}

					var0.aByteArray2663[var12] = 2;
				}
			}

			for (var12 = 0; var12 < var1.anInt2671; var12++) {
				if (anIntArray2698[var1.anIntArray2660[var12]] == anInt2699 && anIntArray2698[var1.anIntArray2691[var12]] == anInt2699 && anIntArray2698[var1.anIntArray2662[var12]] == anInt2699) {
					if (var1.aByteArray2663 == null) {
						var1.aByteArray2663 = new byte[var1.anInt2671];
					}

					var1.aByteArray2663[var12] = 2;
				}
			}

		}
	}

	static int method3177(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	static int method3178(int var0) {
		if (var0 < 2) {
			var0 = 2;
		} else if (var0 > 126) {
			var0 = 126;
		}

		return var0;
	}

	public final Class117_Sub22_Sub18_Sub7 method3183(int var1, int var2, int var3, int var4, int var5) {
		method3188();
		int var7 = (int) Math.sqrt((double) (var3 * var3 + var4 * var4 + var5 * var5));
		int var8 = var2 * var7 >> 8;
		Class117_Sub22_Sub18_Sub7 var6 = new Class117_Sub22_Sub18_Sub7();
		var6.anIntArray2776 = new int[anInt2671];
		var6.anIntArray2777 = new int[anInt2671];
		var6.anIntArray2778 = new int[anInt2671];
		if (anInt2670 > 0 && aByteArray2666 != null) {
			int[] var10 = new int[anInt2670];

			int var11;
			for (var11 = 0; var11 < anInt2671; var11++) {
				if (aByteArray2666[var11] != -1) {
					++var10[aByteArray2666[var11] & 255];
				}
			}

			var6.anInt2784 = 0;

			for (var11 = 0; var11 < anInt2670; var11++) {
				if (var10[var11] > 0 && aByteArray2680[var11] == 0) {
					++var6.anInt2784;
				}
			}

			var6.anIntArray2785 = new int[var6.anInt2784];
			var6.anIntArray2786 = new int[var6.anInt2784];
			var6.anIntArray2787 = new int[var6.anInt2784];
			var11 = 0;

			int var9;
			for (var9 = 0; var9 < anInt2670; var9++) {
				if (var10[var9] > 0 && aByteArray2680[var9] == 0) {
					var6.anIntArray2785[var11] = aShortArray2672[var9] & 65535;
					var6.anIntArray2786[var11] = aShortArray2673[var9] & 65535;
					var6.anIntArray2787[var11] = aShortArray2657[var9] & 65535;
					var10[var9] = var11++;
				} else {
					var10[var9] = -1;
				}
			}

			var6.aByteArray2764 = new byte[anInt2671];

			for (var9 = 0; var9 < anInt2671; var9++) {
				if (aByteArray2666[var9] == -1) {
					var6.aByteArray2764[var9] = -1;
				} else {
					var6.aByteArray2764[var9] = (byte) var10[aByteArray2666[var9] & 255];
				}
			}
		}

		for (int var16 = 0; var16 < anInt2671; var16++) {
			byte var18;
			if (aByteArray2663 == null) {
				var18 = 0;
			} else {
				var18 = aByteArray2663[var16];
			}

			byte var17;
			if (aByteArray2701 == null) {
				var17 = 0;
			} else {
				var17 = aByteArray2701[var16];
			}

			short var12;
			if (aShortArray2668 == null) {
				var12 = -1;
			} else {
				var12 = aShortArray2668[var16];
			}

			if (var17 == -2) {
				var18 = 3;
			}

			if (var17 == -1) {
				var18 = 2;
			}

			Class38 var13;
			int var14;
			Class30 var19;
			if (var12 == -1) {
				if (var18 != 0) {
					if (var18 == 1) {
						var19 = aClass30Array2686[var16];
						var14 = var1 + (var3 * var19.anInt379 * 246371459 + var4 * var19.anInt376 * 1897299207 + var5 * var19.anInt377 * 1106116101) / (var8 + var8 / 2);
						var6.anIntArray2776[var16] = method3177(aShortArray2667[var16] & 65535, var14);
						var6.anIntArray2778[var16] = -1;
					} else if (var18 == 3) {
						var6.anIntArray2776[var16] = 128;
						var6.anIntArray2778[var16] = -1;
					} else {
						var6.anIntArray2778[var16] = -2;
					}
				} else {
					int var15 = aShortArray2667[var16] & 65535;
					if (aClass38Array2688 != null && aClass38Array2688[anIntArray2660[var16]] != null) {
						var13 = aClass38Array2688[anIntArray2660[var16]];
					} else {
						var13 = aClass38Array2675[anIntArray2660[var16]];
					}

					var14 = var1 + (var3 * var13.anInt474 * -75938205 + var4 * var13.anInt468 * 933983407 + var5 * var13.anInt469 * -1131666755) / (var8 * var13.anInt470 * 394492497);
					var6.anIntArray2776[var16] = method3177(var15, var14);
					if (aClass38Array2688 != null && aClass38Array2688[anIntArray2691[var16]] != null) {
						var13 = aClass38Array2688[anIntArray2691[var16]];
					} else {
						var13 = aClass38Array2675[anIntArray2691[var16]];
					}

					var14 = var1 + (var3 * var13.anInt474 * -75938205 + var4 * var13.anInt468 * 933983407 + var5 * var13.anInt469 * -1131666755) / (var8 * var13.anInt470 * 394492497);
					var6.anIntArray2777[var16] = method3177(var15, var14);
					if (aClass38Array2688 != null && aClass38Array2688[anIntArray2662[var16]] != null) {
						var13 = aClass38Array2688[anIntArray2662[var16]];
					} else {
						var13 = aClass38Array2675[anIntArray2662[var16]];
					}

					var14 = var1 + (var3 * var13.anInt474 * -75938205 + var4 * var13.anInt468 * 933983407 + var5 * var13.anInt469 * -1131666755) / (var8 * var13.anInt470 * 394492497);
					var6.anIntArray2778[var16] = method3177(var15, var14);
				}
			} else if (var18 != 0) {
				if (var18 == 1) {
					var19 = aClass30Array2686[var16];
					var14 = var1 + (var3 * var19.anInt379 * 246371459 + var4 * var19.anInt376 * 1897299207 + var5 * var19.anInt377 * 1106116101) / (var8 + var8 / 2);
					var6.anIntArray2776[var16] = method3178(var14);
					var6.anIntArray2778[var16] = -1;
				} else {
					var6.anIntArray2778[var16] = -2;
				}
			} else {
				if (aClass38Array2688 != null && aClass38Array2688[anIntArray2660[var16]] != null) {
					var13 = aClass38Array2688[anIntArray2660[var16]];
				} else {
					var13 = aClass38Array2675[anIntArray2660[var16]];
				}

				var14 = var1 + (var3 * var13.anInt474 * -75938205 + var4 * var13.anInt468 * 933983407 + var5 * var13.anInt469 * -1131666755) / (var8 * var13.anInt470 * 394492497);
				var6.anIntArray2776[var16] = method3178(var14);
				if (aClass38Array2688 != null && aClass38Array2688[anIntArray2691[var16]] != null) {
					var13 = aClass38Array2688[anIntArray2691[var16]];
				} else {
					var13 = aClass38Array2675[anIntArray2691[var16]];
				}

				var14 = var1 + (var3 * var13.anInt474 * -75938205 + var4 * var13.anInt468 * 933983407 + var5 * var13.anInt469 * -1131666755) / (var8 * var13.anInt470 * 394492497);
				var6.anIntArray2777[var16] = method3178(var14);
				if (aClass38Array2688 != null && aClass38Array2688[anIntArray2662[var16]] != null) {
					var13 = aClass38Array2688[anIntArray2662[var16]];
				} else {
					var13 = aClass38Array2675[anIntArray2662[var16]];
				}

				var14 = var1 + (var3 * var13.anInt474 * -75938205 + var4 * var13.anInt468 * 933983407 + var5 * var13.anInt469 * -1131666755) / (var8 * var13.anInt470 * 394492497);
				var6.anIntArray2778[var16] = method3178(var14);
			}
		}

		method3214();
		var6.anInt2809 = anInt2655;
		var6.anIntArray2769 = anIntArray2700;
		var6.anIntArray2770 = anIntArray2661;
		var6.anIntArray2771 = anIntArray2658;
		var6.anInt2821 = anInt2671;
		var6.anIntArray2773 = anIntArray2660;
		var6.anIntArray2811 = anIntArray2691;
		var6.anIntArray2775 = anIntArray2662;
		var6.aByteArray2779 = aByteArray2664;
		var6.aByteArray2780 = aByteArray2701;
		var6.aByte2783 = aByte2659;
		var6.anIntArrayArray2828 = anIntArrayArray2665;
		var6.anIntArrayArray2791 = anIntArrayArray2685;
		var6.aShortArray2822 = aShortArray2668;
		return var6;
	}

	public void method3188() {
		if (aClass38Array2675 == null) {
			aClass38Array2675 = new Class38[anInt2655];

			int var3;
			for (var3 = 0; var3 < anInt2655; var3++) {
				aClass38Array2675[var3] = new Class38();
			}

			for (var3 = 0; var3 < anInt2671; var3++) {
				int var7 = anIntArray2660[var3];
				int var5 = anIntArray2691[var3];
				int var6 = anIntArray2662[var3];
				int var15 = anIntArray2700[var5] - anIntArray2700[var7];
				int var14 = anIntArray2661[var5] - anIntArray2661[var7];
				int var8 = anIntArray2658[var5] - anIntArray2658[var7];
				int var11 = anIntArray2700[var6] - anIntArray2700[var7];
				int var12 = anIntArray2661[var6] - anIntArray2661[var7];
				int var13 = anIntArray2658[var6] - anIntArray2658[var7];
				int var9 = var14 * var13 - var12 * var8;
				int var10 = var8 * var11 - var13 * var15;

				int var1;
				for (var1 = var15 * var12 - var11 * var14; var9 > 8192 || var10 > 8192 || var1 > 8192 || var9 < -8192 || var10 < -8192 || var1 < -8192; var1 >>= 1) {
					var9 >>= 1;
					var10 >>= 1;
				}

				int var2 = (int) Math.sqrt((double) (var9 * var9 + var10 * var10 + var1 * var1));
				if (var2 <= 0) {
					var2 = 1;
				}

				var9 = var9 * 256 / var2;
				var10 = var10 * 256 / var2;
				var1 = var1 * 256 / var2;
				byte var16;
				if (aByteArray2663 == null) {
					var16 = 0;
				} else {
					var16 = aByteArray2663[var3];
				}

				if (var16 == 0) {
					Class38 var4 = aClass38Array2675[var7];
					var4.anInt474 += var9 * 869231435;
					var4.anInt468 += var10 * -95133105;
					var4.anInt469 += var1 * -867211115;
					var4.anInt470 += 1961365169;
					var4 = aClass38Array2675[var5];
					var4.anInt474 += var9 * 869231435;
					var4.anInt468 += var10 * -95133105;
					var4.anInt469 += var1 * -867211115;
					var4.anInt470 += 1961365169;
					var4 = aClass38Array2675[var6];
					var4.anInt474 += var9 * 869231435;
					var4.anInt468 += var10 * -95133105;
					var4.anInt469 += var1 * -867211115;
					var4.anInt470 += 1961365169;
				} else if (var16 == 1) {
					if (aClass30Array2686 == null) {
						aClass30Array2686 = new Class30[anInt2671];
					}

					Class30 var17 = aClass30Array2686[var3] = new Class30();
					var17.anInt379 = var9 * 529701419;
					var17.anInt376 = var10 * -1121558345;
					var17.anInt377 = var1 * 666574541;
				}
			}

		}
	}

	public void method3196() {
		for (int var1 = 0; var1 < anInt2655; var1++) {
			anIntArray2700[var1] = -anIntArray2700[var1];
			anIntArray2658[var1] = -anIntArray2658[var1];
		}

		method3173();
	}

	static {
		anIntArray2687 = Class117_Sub22_Sub17_Sub1.anIntArray2653;
		anIntArray2656 = Class117_Sub22_Sub17_Sub1.anIntArray2654;
	}

	public Class117_Sub22_Sub18_Sub4(Class117_Sub22_Sub18_Sub4[] var1, int var2) {
		boolean var7 = false;
		boolean var3 = false;
		boolean var9 = false;
		boolean var6 = false;
		boolean var11 = false;
		boolean var10 = false;
		anInt2655 = 0;
		anInt2671 = 0;
		anInt2670 = 0;
		aByte2659 = -1;

		Class117_Sub22_Sub18_Sub4 var4;
		int var8;
		for (var8 = 0; var8 < var2; var8++) {
			var4 = var1[var8];
			if (var4 != null) {
				anInt2655 += var4.anInt2655;
				anInt2671 += var4.anInt2671;
				anInt2670 += var4.anInt2670;
				if (var4.aByteArray2664 != null) {
					var3 = true;
				} else {
					if (aByte2659 == -1) {
						aByte2659 = var4.aByte2659;
					}

					if (aByte2659 != var4.aByte2659) {
						var3 = true;
					}
				}

				var7 |= var4.aByteArray2663 != null;
				var9 |= var4.aByteArray2701 != null;
				var6 |= var4.anIntArray2683 != null;
				var11 |= var4.aShortArray2668 != null;
				var10 |= var4.aByteArray2666 != null;
			}
		}

		anIntArray2700 = new int[anInt2655];
		anIntArray2661 = new int[anInt2655];
		anIntArray2658 = new int[anInt2655];
		anIntArray2682 = new int[anInt2655];
		anIntArray2660 = new int[anInt2671];
		anIntArray2691 = new int[anInt2671];
		anIntArray2662 = new int[anInt2671];
		if (var7) {
			aByteArray2663 = new byte[anInt2671];
		}

		if (var3) {
			aByteArray2664 = new byte[anInt2671];
		}

		if (var9) {
			aByteArray2701 = new byte[anInt2671];
		}

		if (var6) {
			anIntArray2683 = new int[anInt2671];
		}

		if (var11) {
			aShortArray2668 = new short[anInt2671];
		}

		if (var10) {
			aByteArray2666 = new byte[anInt2671];
		}

		aShortArray2667 = new short[anInt2671];
		if (anInt2670 > 0) {
			aByteArray2680 = new byte[anInt2670];
			aShortArray2672 = new short[anInt2670];
			aShortArray2673 = new short[anInt2670];
			aShortArray2657 = new short[anInt2670];
			aShortArray2690 = new short[anInt2670];
			aShortArray2676 = new short[anInt2670];
			aShortArray2669 = new short[anInt2670];
			aShortArray2678 = new short[anInt2670];
			aByteArray2674 = new byte[anInt2670];
			aShortArray2679 = new short[anInt2670];
			aShortArray2695 = new short[anInt2670];
		}

		anInt2655 = 0;
		anInt2671 = 0;
		anInt2670 = 0;

		for (var8 = 0; var8 < var2; var8++) {
			var4 = var1[var8];
			if (var4 != null) {
				int var5;
				for (var5 = 0; var5 < var4.anInt2671; var5++) {
					if (var7 && var4.aByteArray2663 != null) {
						aByteArray2663[anInt2671] = var4.aByteArray2663[var5];
					}

					if (var3) {
						if (var4.aByteArray2664 != null) {
							aByteArray2664[anInt2671] = var4.aByteArray2664[var5];
						} else {
							aByteArray2664[anInt2671] = var4.aByte2659;
						}
					}

					if (var9 && var4.aByteArray2701 != null) {
						aByteArray2701[anInt2671] = var4.aByteArray2701[var5];
					}

					if (var6 && var4.anIntArray2683 != null) {
						anIntArray2683[anInt2671] = var4.anIntArray2683[var5];
					}

					if (var11) {
						if (var4.aShortArray2668 != null) {
							aShortArray2668[anInt2671] = var4.aShortArray2668[var5];
						} else {
							aShortArray2668[anInt2671] = -1;
						}
					}

					if (var10) {
						if (var4.aByteArray2666 != null && var4.aByteArray2666[var5] != -1) {
							aByteArray2666[anInt2671] = (byte) (var4.aByteArray2666[var5] + anInt2670);
						} else {
							aByteArray2666[anInt2671] = -1;
						}
					}

					aShortArray2667[anInt2671] = var4.aShortArray2667[var5];
					anIntArray2660[anInt2671] = method3159(var4, var4.anIntArray2660[var5]);
					anIntArray2691[anInt2671] = method3159(var4, var4.anIntArray2691[var5]);
					anIntArray2662[anInt2671] = method3159(var4, var4.anIntArray2662[var5]);
					++anInt2671;
				}

				for (var5 = 0; var5 < var4.anInt2670; var5++) {
					byte var12 = aByteArray2680[anInt2670] = var4.aByteArray2680[var5];
					if (var12 == 0) {
						aShortArray2672[anInt2670] = (short) method3159(var4, var4.aShortArray2672[var5]);
						aShortArray2673[anInt2670] = (short) method3159(var4, var4.aShortArray2673[var5]);
						aShortArray2657[anInt2670] = (short) method3159(var4, var4.aShortArray2657[var5]);
					}

					if (var12 >= 1 && var12 <= 3) {
						aShortArray2672[anInt2670] = var4.aShortArray2672[var5];
						aShortArray2673[anInt2670] = var4.aShortArray2673[var5];
						aShortArray2657[anInt2670] = var4.aShortArray2657[var5];
						aShortArray2690[anInt2670] = var4.aShortArray2690[var5];
						aShortArray2676[anInt2670] = var4.aShortArray2676[var5];
						aShortArray2669[anInt2670] = var4.aShortArray2669[var5];
						aShortArray2678[anInt2670] = var4.aShortArray2678[var5];
						aByteArray2674[anInt2670] = var4.aByteArray2674[var5];
						aShortArray2679[anInt2670] = var4.aShortArray2679[var5];
					}

					if (var12 == 2) {
						aShortArray2695[anInt2670] = var4.aShortArray2695[var5];
					}

					++anInt2670;
				}
			}
		}

	}

	void method3214() {
		int var1;
		int var2;
		int var3;
		int[] var4;
		if (anIntArray2682 != null) {
			var4 = new int[256];
			var2 = 0;

			for (var1 = 0; var1 < anInt2655; var1++) {
				var3 = anIntArray2682[var1];
				++var4[var3];
				if (var3 > var2) {
					var2 = var3;
				}
			}

			anIntArrayArray2665 = new int[var2 + 1][];

			for (var1 = 0; var1 <= var2; var1++) {
				anIntArrayArray2665[var1] = new int[var4[var1]];
				var4[var1] = 0;
			}

			for (var1 = 0; var1 < anInt2655; anIntArrayArray2665[var3][var4[var3]++] = var1++) {
				var3 = anIntArray2682[var1];
			}

			anIntArray2682 = null;
		}

		if (anIntArray2683 != null) {
			var4 = new int[256];
			var2 = 0;

			for (var1 = 0; var1 < anInt2671; var1++) {
				var3 = anIntArray2683[var1];
				++var4[var3];
				if (var3 > var2) {
					var2 = var3;
				}
			}

			anIntArrayArray2685 = new int[var2 + 1][];

			for (var1 = 0; var1 <= var2; var1++) {
				anIntArrayArray2685[var1] = new int[var4[var1]];
				var4[var1] = 0;
			}

			for (var1 = 0; var1 < anInt2671; anIntArrayArray2685[var3][var4[var3]++] = var1++) {
				var3 = anIntArray2683[var1];
			}

			anIntArray2683 = null;
		}

	}

	public void method3220(short var1, short var2) {
		if (aShortArray2668 != null) {
			for (int var3 = 0; var3 < anInt2671; var3++) {
				if (aShortArray2668[var3] == var1) {
					aShortArray2668[var3] = var2;
				}
			}

		}
	}

	Class117_Sub22_Sub18_Sub4() {
	}

	public void method3228(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < anInt2655; var4++) {
			anIntArray2700[var4] = anIntArray2700[var4] * var1 / 128;
			anIntArray2661[var4] = anIntArray2661[var4] * var2 / 128;
			anIntArray2658[var4] = anIntArray2658[var4] * var3 / 128;
		}

		method3173();
	}

}
