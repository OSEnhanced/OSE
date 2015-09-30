package core.Jagex;
public final class Class50 {

	boolean aBool668 = true;
	int anInt684;
	int anInt685;
	int anInt681;
	int anInt682;
	int[] anIntArray675;
	int[] anIntArray669;
	int[] anIntArray670;
	int[] anIntArray674;
	int[] anIntArray679;
	int[] anIntArray678;
	int[] anIntArray671;
	int[] anIntArray672;
	int[] anIntArray673;
	int[] anIntArray688;
	static int[] anIntArray683 = new int[6];
	static int[] anIntArray680 = new int[6];
	static int[] anIntArray676 = new int[6];
	static int[] anIntArray686 = new int[6];
	static int[] anIntArray687 = new int[6];
	static int[][] anIntArrayArray677 = new int[][]{{1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 2, 6}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 13, 14}};
	static int[][] anIntArrayArray689 = new int[][]{{0, 1, 2, 3, 0, 0, 1, 3}, {1, 1, 2, 3, 1, 0, 1, 3}, {0, 1, 2, 3, 1, 0, 1, 3}, {0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3}, {0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4}, {0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4}, {0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3}, {0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3}, {0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5}, {0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5}, {0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3}, {1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3}, {1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5}};

	Class50(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19) {
		if (var6 != var7 || var6 != var8 || var6 != var9) {
			aBool668 = false;
		}

		anInt684 = var1;
		anInt685 = var2;
		anInt681 = var18;
		anInt682 = var19;
		short var21 = 128;
		int var26 = var21 / 2;
		int var27 = var21 / 4;
		int var23 = var21 * 3 / 4;
		int[] var33 = anIntArrayArray677[var1];
		int var28 = var33.length;
		anIntArray675 = new int[var28];
		anIntArray669 = new int[var28];
		anIntArray670 = new int[var28];
		int[] var29 = new int[var28];
		int[] var30 = new int[var28];
		int var20 = var4 * var21;
		int var31 = var5 * var21;

		int var22;
		int var24;
		int var25;
		int var34;
		int var35;
		int var36;
		for (int var32 = 0; var32 < var28; var32++) {
			var24 = var33[var32];
			if ((var24 & 1) == 0 && var24 <= 8) {
				var24 = (var24 - var2 - var2 - 1 & 7) + 1;
			}

			if (var24 > 8 && var24 <= 12) {
				var24 = (var24 - 9 - var2 & 3) + 9;
			}

			if (var24 > 12 && var24 <= 16) {
				var24 = (var24 - 13 - var2 & 3) + 13;
			}

			if (var24 == 1) {
				var22 = var20;
				var36 = var31;
				var25 = var6;
				var35 = var10;
				var34 = var14;
			} else if (var24 == 2) {
				var22 = var20 + var26;
				var36 = var31;
				var25 = var6 + var7 >> 1;
				var35 = var10 + var11 >> 1;
				var34 = var14 + var15 >> 1;
			} else if (var24 == 3) {
				var22 = var20 + var21;
				var36 = var31;
				var25 = var7;
				var35 = var11;
				var34 = var15;
			} else if (var24 == 4) {
				var22 = var20 + var21;
				var36 = var31 + var26;
				var25 = var7 + var8 >> 1;
				var35 = var11 + var12 >> 1;
				var34 = var15 + var16 >> 1;
			} else if (var24 == 5) {
				var22 = var20 + var21;
				var36 = var31 + var21;
				var25 = var8;
				var35 = var12;
				var34 = var16;
			} else if (var24 == 6) {
				var22 = var20 + var26;
				var36 = var31 + var21;
				var25 = var8 + var9 >> 1;
				var35 = var12 + var13 >> 1;
				var34 = var16 + var17 >> 1;
			} else if (var24 == 7) {
				var22 = var20;
				var36 = var31 + var21;
				var25 = var9;
				var35 = var13;
				var34 = var17;
			} else if (var24 == 8) {
				var22 = var20;
				var36 = var31 + var26;
				var25 = var9 + var6 >> 1;
				var35 = var13 + var10 >> 1;
				var34 = var17 + var14 >> 1;
			} else if (var24 == 9) {
				var22 = var20 + var26;
				var36 = var31 + var27;
				var25 = var6 + var7 >> 1;
				var35 = var10 + var11 >> 1;
				var34 = var14 + var15 >> 1;
			} else if (var24 == 10) {
				var22 = var20 + var23;
				var36 = var31 + var26;
				var25 = var7 + var8 >> 1;
				var35 = var11 + var12 >> 1;
				var34 = var15 + var16 >> 1;
			} else if (var24 == 11) {
				var22 = var20 + var26;
				var36 = var31 + var23;
				var25 = var8 + var9 >> 1;
				var35 = var12 + var13 >> 1;
				var34 = var16 + var17 >> 1;
			} else if (var24 == 12) {
				var22 = var20 + var27;
				var36 = var31 + var26;
				var25 = var9 + var6 >> 1;
				var35 = var13 + var10 >> 1;
				var34 = var17 + var14 >> 1;
			} else if (var24 == 13) {
				var22 = var20 + var27;
				var36 = var31 + var27;
				var25 = var6;
				var35 = var10;
				var34 = var14;
			} else if (var24 == 14) {
				var22 = var20 + var23;
				var36 = var31 + var27;
				var25 = var7;
				var35 = var11;
				var34 = var15;
			} else if (var24 == 15) {
				var22 = var20 + var23;
				var36 = var31 + var23;
				var25 = var8;
				var35 = var12;
				var34 = var16;
			} else {
				var22 = var20 + var27;
				var36 = var31 + var23;
				var25 = var9;
				var35 = var13;
				var34 = var17;
			}

			anIntArray675[var32] = var22;
			anIntArray669[var32] = var25;
			anIntArray670[var32] = var36;
			var29[var32] = var35;
			var30[var32] = var34;
		}

		int[] var38 = anIntArrayArray689[var1];
		var24 = var38.length / 4;
		anIntArray674 = new int[var24];
		anIntArray679 = new int[var24];
		anIntArray678 = new int[var24];
		anIntArray671 = new int[var24];
		anIntArray672 = new int[var24];
		anIntArray673 = new int[var24];
		if (var3 != -1) {
			anIntArray688 = new int[var24];
		}

		var22 = 0;

		for (var36 = 0; var36 < var24; var36++) {
			var25 = var38[var22];
			var35 = var38[var22 + 1];
			var34 = var38[var22 + 2];
			int var37 = var38[var22 + 3];
			var22 += 4;
			if (var35 < 4) {
				var35 = var35 - var2 & 3;
			}

			if (var34 < 4) {
				var34 = var34 - var2 & 3;
			}

			if (var37 < 4) {
				var37 = var37 - var2 & 3;
			}

			anIntArray674[var36] = var35;
			anIntArray679[var36] = var34;
			anIntArray678[var36] = var37;
			if (var25 == 0) {
				anIntArray671[var36] = var29[var35];
				anIntArray672[var36] = var29[var34];
				anIntArray673[var36] = var29[var37];
				if (anIntArray688 != null) {
					anIntArray688[var36] = -1;
				}
			} else {
				anIntArray671[var36] = var30[var35];
				anIntArray672[var36] = var30[var34];
				anIntArray673[var36] = var30[var37];
				if (anIntArray688 != null) {
					anIntArray688[var36] = var3;
				}
			}
		}

		var36 = var6;
		var25 = var7;
		if (var7 < var6) {
			var36 = var7;
		}

		if (var7 > var7) {
			var25 = var7;
		}

		if (var8 < var36) {
			var36 = var8;
		}

		if (var8 > var25) {
			var25 = var8;
		}

		if (var9 < var36) {
			var36 = var9;
		}

		if (var9 > var25) {
			var25 = var9;
		}

		var36 /= 14;
		var25 /= 14;
	}

}
