package core.Jagex;
public class Class117_Sub22_Sub18_Sub7 extends Class117_Sub22_Sub18 {

	static final int anInt2796 = 4096;
	static final int anInt2799 = 50;
	static final int anInt2805 = 1600;
	static final int anInt2829 = 3500;
	int anInt2781;
	int anInt2809 = 0;
	int anInt2821 = 0;
	byte aByte2783 = 0;
	int anInt2784 = 0;
	public boolean aBool2826 = false;
	int[] anIntArray2769;
	int[] anIntArray2770;
	int[] anIntArray2771;
	int[] anIntArray2773;
	int[] anIntArray2811;
	int[] anIntArray2775;
	int[] anIntArray2776;
	int[] anIntArray2777;
	int[] anIntArray2778;
	byte[] aByteArray2779;
	byte[] aByteArray2780;
	short[] aShortArray2822;
	byte[] aByteArray2764;
	int[] anIntArray2785;
	int[] anIntArray2786;
	int[] anIntArray2787;
	int[][] anIntArrayArray2828;
	int[][] anIntArrayArray2791;
	static byte[] aByteArray2767 = new byte[1];
	int anInt2793;
	int anInt2788;
	int anInt2794;
	static int anInt2816;
	static int anInt2817;
	static int anInt2818;
	public static int anInt2772 = 0;
	static Class117_Sub22_Sub18_Sub7 aClass117_Sub22_Sub18_Sub7_2768 = new Class117_Sub22_Sub18_Sub7();
	static byte[] aByteArray2765 = new byte[1];
	static Class117_Sub22_Sub18_Sub7 aClass117_Sub22_Sub18_Sub7_2766 = new Class117_Sub22_Sub18_Sub7();
	static boolean[] aBoolArray2797 = new boolean[4096];
	static boolean[] aBoolArray2798 = new boolean[4096];
	static int[] anIntArray2802 = new int[4096];
	static int[] anIntArray2825 = new int[4096];
	static int[] anIntArray2801 = new int[4096];
	static int[] anIntArray2800 = new int[4096];
	static int[] anIntArray2803 = new int[4096];
	static int[] anIntArray2804 = new int[4096];
	static int[] anIntArray2808 = new int[1600];
	static int[][] anIntArrayArray2807 = new int[1600][512];
	static int[] anIntArray2812 = new int[12];
	static int[][] anIntArrayArray2782 = new int[12][2000];
	static int[] anIntArray2810 = new int[2000];
	static int[] anIntArray2823 = new int[2000];
	static int[] anIntArray2789 = new int[12];
	static int[] anIntArray2819 = new int[10];
	static int[] anIntArray2814 = new int[10];
	static int[] anIntArray2815 = new int[10];
	public static boolean aBool2774 = false;
	public static int anInt2806 = 0;
	public static int anInt2820 = 0;
	public static int[] anIntArray2790 = new int[1000];
	static int[] anIntArray2824;
	static int[] anIntArray2795;
	static int[] anIntArray2813;
	static int[] anIntArray2827;
	int anInt2792;

	public void method3362(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < anInt2809; var4++) {
			anIntArray2769[var4] += var1;
			anIntArray2770[var4] += var2;
			anIntArray2771[var4] += var3;
		}

		anInt2781 = 0;
	}

	public Class117_Sub22_Sub18_Sub7(Class117_Sub22_Sub18_Sub7[] var1, int var2) {
		boolean var4 = false;
		boolean var5 = false;
		boolean var8 = false;
		boolean var9 = false;
		anInt2809 = 0;
		anInt2821 = 0;
		anInt2784 = 0;
		aByte2783 = -1;

		Class117_Sub22_Sub18_Sub7 var3;
		int var7;
		for (var7 = 0; var7 < var2; var7++) {
			var3 = var1[var7];
			if (var3 != null) {
				anInt2809 += var3.anInt2809;
				anInt2821 += var3.anInt2821;
				anInt2784 += var3.anInt2784;
				if (var3.aByteArray2779 != null) {
					var4 = true;
				} else {
					if (aByte2783 == -1) {
						aByte2783 = var3.aByte2783;
					}

					if (aByte2783 != var3.aByte2783) {
						var4 = true;
					}
				}

				var5 |= var3.aByteArray2780 != null;
				var8 |= var3.aShortArray2822 != null;
				var9 |= var3.aByteArray2764 != null;
			}
		}

		anIntArray2769 = new int[anInt2809];
		anIntArray2770 = new int[anInt2809];
		anIntArray2771 = new int[anInt2809];
		anIntArray2773 = new int[anInt2821];
		anIntArray2811 = new int[anInt2821];
		anIntArray2775 = new int[anInt2821];
		anIntArray2776 = new int[anInt2821];
		anIntArray2777 = new int[anInt2821];
		anIntArray2778 = new int[anInt2821];
		if (var4) {
			aByteArray2779 = new byte[anInt2821];
		}

		if (var5) {
			aByteArray2780 = new byte[anInt2821];
		}

		if (var8) {
			aShortArray2822 = new short[anInt2821];
		}

		if (var9) {
			aByteArray2764 = new byte[anInt2821];
		}

		if (anInt2784 > 0) {
			anIntArray2785 = new int[anInt2784];
			anIntArray2786 = new int[anInt2784];
			anIntArray2787 = new int[anInt2784];
		}

		anInt2809 = 0;
		anInt2821 = 0;
		anInt2784 = 0;

		for (var7 = 0; var7 < var2; var7++) {
			var3 = var1[var7];
			if (var3 != null) {
				int var6;
				for (var6 = 0; var6 < var3.anInt2821; var6++) {
					anIntArray2773[anInt2821] = var3.anIntArray2773[var6] + anInt2809;
					anIntArray2811[anInt2821] = var3.anIntArray2811[var6] + anInt2809;
					anIntArray2775[anInt2821] = var3.anIntArray2775[var6] + anInt2809;
					anIntArray2776[anInt2821] = var3.anIntArray2776[var6];
					anIntArray2777[anInt2821] = var3.anIntArray2777[var6];
					anIntArray2778[anInt2821] = var3.anIntArray2778[var6];
					if (var4) {
						if (var3.aByteArray2779 != null) {
							aByteArray2779[anInt2821] = var3.aByteArray2779[var6];
						} else {
							aByteArray2779[anInt2821] = var3.aByte2783;
						}
					}

					if (var5 && var3.aByteArray2780 != null) {
						aByteArray2780[anInt2821] = var3.aByteArray2780[var6];
					}

					if (var8) {
						if (var3.aShortArray2822 != null) {
							aShortArray2822[anInt2821] = var3.aShortArray2822[var6];
						} else {
							aShortArray2822[anInt2821] = -1;
						}
					}

					if (var9) {
						if (var3.aByteArray2764 != null && var3.aByteArray2764[var6] != -1) {
							aByteArray2764[anInt2821] = (byte) (var3.aByteArray2764[var6] + anInt2784);
						} else {
							aByteArray2764[anInt2821] = -1;
						}
					}

					++anInt2821;
				}

				for (var6 = 0; var6 < var3.anInt2784; var6++) {
					anIntArray2785[anInt2784] = var3.anIntArray2785[var6] + anInt2809;
					anIntArray2786[anInt2784] = var3.anIntArray2786[var6] + anInt2809;
					anIntArray2787[anInt2784] = var3.anIntArray2787[var6] + anInt2809;
					++anInt2784;
				}

				for (var6 = 0; var6 < var3.anInt2809; var6++) {
					anIntArray2769[anInt2809] = var3.anIntArray2769[var6];
					anIntArray2770[anInt2809] = var3.anIntArray2770[var6];
					anIntArray2771[anInt2809] = var3.anIntArray2771[var6];
					++anInt2809;
				}
			}
		}

	}

	public Class117_Sub22_Sub18_Sub7 method3363(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		method3410();
		int var12 = var2 - anInt2793;
		int var10 = var2 + anInt2793;
		int var11 = var4 - anInt2793;
		int var13 = var4 + anInt2793;
		if (var12 >= 0 && var10 + 128 >> 7 < var1.length && var11 >= 0 && var13 + 128 >> 7 < var1[0].length) {
			var12 >>= 7;
			var10 = var10 + 127 >> 7;
			var11 >>= 7;
			var13 = var13 + 127 >> 7;
			if (var1[var12][var11] == var3 && var1[var10][var11] == var3 && var1[var12][var13] == var3 && var1[var10][var13] == var3) {
				return this;
			} else {
				Class117_Sub22_Sub18_Sub7 var7;
				if (var5) {
					var7 = new Class117_Sub22_Sub18_Sub7();
					var7.anInt2809 = anInt2809;
					var7.anInt2821 = anInt2821;
					var7.anInt2784 = anInt2784;
					var7.anIntArray2769 = anIntArray2769;
					var7.anIntArray2771 = anIntArray2771;
					var7.anIntArray2773 = anIntArray2773;
					var7.anIntArray2811 = anIntArray2811;
					var7.anIntArray2775 = anIntArray2775;
					var7.anIntArray2776 = anIntArray2776;
					var7.anIntArray2777 = anIntArray2777;
					var7.anIntArray2778 = anIntArray2778;
					var7.aByteArray2779 = aByteArray2779;
					var7.aByteArray2780 = aByteArray2780;
					var7.aByteArray2764 = aByteArray2764;
					var7.aShortArray2822 = aShortArray2822;
					var7.aByte2783 = aByte2783;
					var7.anIntArray2785 = anIntArray2785;
					var7.anIntArray2786 = anIntArray2786;
					var7.anIntArray2787 = anIntArray2787;
					var7.anIntArrayArray2828 = anIntArrayArray2828;
					var7.anIntArrayArray2791 = anIntArrayArray2791;
					var7.aBool2826 = aBool2826;
					var7.anIntArray2770 = new int[var7.anInt2809];
				} else {
					var7 = this;
				}

				int var8;
				int var9;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var21;
				int var22;
				if (var6 == 0) {
					for (var8 = 0; var8 < var7.anInt2809; var8++) {
						var21 = anIntArray2769[var8] + var2;
						var18 = anIntArray2771[var8] + var4;
						var16 = var21 & 127;
						var19 = var18 & 127;
						var14 = var21 >> 7;
						var15 = var18 >> 7;
						var17 = var1[var14][var15] * (128 - var16) + var1[var14 + 1][var15] * var16 >> 7;
						var22 = var1[var14][var15 + 1] * (128 - var16) + var1[var14 + 1][var15 + 1] * var16 >> 7;
						var9 = var17 * (128 - var19) + var22 * var19 >> 7;
						var7.anIntArray2770[var8] = anIntArray2770[var8] + var9 - var3;
					}
				} else {
					for (var8 = 0; var8 < var7.anInt2809; var8++) {
						var21 = (-anIntArray2770[var8] << 16) / (anInt2466 * 1871917943);
						if (var21 < var6) {
							var18 = anIntArray2769[var8] + var2;
							var16 = anIntArray2771[var8] + var4;
							var19 = var18 & 127;
							var14 = var16 & 127;
							var15 = var18 >> 7;
							var17 = var16 >> 7;
							var22 = var1[var15][var17] * (128 - var19) + var1[var15 + 1][var17] * var19 >> 7;
							var9 = var1[var15][var17 + 1] * (128 - var19) + var1[var15 + 1][var17 + 1] * var19 >> 7;
							int var20 = var22 * (128 - var14) + var9 * var14 >> 7;
							var7.anIntArray2770[var8] = anIntArray2770[var8] + (var20 - var3) * (var6 - var21) / var6;
						}
					}
				}

				var7.anInt2781 = 0;
				return var7;
			}
		} else {
			return this;
		}
	}

	public Class117_Sub22_Sub18_Sub7 method3365(boolean var1) {
		if (!var1 && aByteArray2767.length < anInt2821) {
			aByteArray2767 = new byte[anInt2821 + 100];
		}

		return method3366(var1, aClass117_Sub22_Sub18_Sub7_2766, aByteArray2767);
	}

	Class117_Sub22_Sub18_Sub7 method3366(boolean var1, Class117_Sub22_Sub18_Sub7 var2, byte[] var3) {
		var2.anInt2809 = anInt2809;
		var2.anInt2821 = anInt2821;
		var2.anInt2784 = anInt2784;
		if (var2.anIntArray2769 == null || var2.anIntArray2769.length < anInt2809) {
			var2.anIntArray2769 = new int[anInt2809 + 100];
			var2.anIntArray2770 = new int[anInt2809 + 100];
			var2.anIntArray2771 = new int[anInt2809 + 100];
		}

		int var4;
		for (var4 = 0; var4 < anInt2809; var4++) {
			var2.anIntArray2769[var4] = anIntArray2769[var4];
			var2.anIntArray2770[var4] = anIntArray2770[var4];
			var2.anIntArray2771[var4] = anIntArray2771[var4];
		}

		if (!var1) {
			var2.aByteArray2780 = var3;
			if (aByteArray2780 == null) {
				for (var4 = 0; var4 < anInt2821; var4++) {
					var2.aByteArray2780[var4] = 0;
				}
			} else {
				for (var4 = 0; var4 < anInt2821; var4++) {
					var2.aByteArray2780[var4] = aByteArray2780[var4];
				}
			}
		} else {
			var2.aByteArray2780 = aByteArray2780;
		}

		var2.anIntArray2773 = anIntArray2773;
		var2.anIntArray2811 = anIntArray2811;
		var2.anIntArray2775 = anIntArray2775;
		var2.anIntArray2776 = anIntArray2776;
		var2.anIntArray2777 = anIntArray2777;
		var2.anIntArray2778 = anIntArray2778;
		var2.aByteArray2779 = aByteArray2779;
		var2.aByteArray2764 = aByteArray2764;
		var2.aShortArray2822 = aShortArray2822;
		var2.aByte2783 = aByte2783;
		var2.anIntArray2785 = anIntArray2785;
		var2.anIntArray2786 = anIntArray2786;
		var2.anIntArray2787 = anIntArray2787;
		var2.anIntArrayArray2828 = anIntArrayArray2828;
		var2.anIntArrayArray2791 = anIntArrayArray2791;
		var2.aBool2826 = aBool2826;
		var2.anInt2781 = 0;
		return var2;
	}

	void method3368() {
		if (anInt2781 != 2) {
			anInt2781 = 2;
			anInt2793 = 0;

			for (int var1 = 0; var1 < anInt2809; var1++) {
				int var2 = anIntArray2769[var1];
				int var3 = anIntArray2770[var1];
				int var4 = anIntArray2771[var1];
				int var5 = var2 * var2 + var4 * var4 + var3 * var3;
				if (var5 > anInt2793) {
					anInt2793 = var5;
				}
			}

			anInt2793 = (int) (Math.sqrt((double) anInt2793) + 0.99D);
			anInt2788 = anInt2793;
			anInt2794 = anInt2793 + anInt2793;
		}
	}

	void method3369(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length;
		int var7;
		int var8;
		int var10;
		int var12;
		if (var1 == 0) {
			var8 = 0;
			anInt2816 = 0;
			anInt2817 = 0;
			anInt2818 = 0;

			for (var12 = 0; var12 < var6; var12++) {
				int var19 = var2[var12];
				if (var19 < anIntArrayArray2828.length) {
					int[] var18 = anIntArrayArray2828[var19];

					for (var10 = 0; var10 < var18.length; var10++) {
						var7 = var18[var10];
						anInt2816 += anIntArray2769[var7];
						anInt2817 += anIntArray2770[var7];
						anInt2818 += anIntArray2771[var7];
						++var8;
					}
				}
			}

			if (var8 > 0) {
				anInt2816 = anInt2816 / var8 + var3;
				anInt2817 = anInt2817 / var8 + var4;
				anInt2818 = anInt2818 / var8 + var5;
			} else {
				anInt2816 = var3;
				anInt2817 = var4;
				anInt2818 = var5;
			}

		} else {
			int var9;
			int[] var11;
			if (var1 == 1) {
				for (var8 = 0; var8 < var6; var8++) {
					var12 = var2[var8];
					if (var12 < anIntArrayArray2828.length) {
						var11 = anIntArrayArray2828[var12];

						for (var9 = 0; var9 < var11.length; var9++) {
							var10 = var11[var9];
							anIntArray2769[var10] += var3;
							anIntArray2770[var10] += var4;
							anIntArray2771[var10] += var5;
						}
					}
				}

			} else if (var1 == 2) {
				for (var8 = 0; var8 < var6; var8++) {
					var12 = var2[var8];
					if (var12 < anIntArrayArray2828.length) {
						var11 = anIntArrayArray2828[var12];

						for (var9 = 0; var9 < var11.length; var9++) {
							var10 = var11[var9];
							anIntArray2769[var10] -= anInt2816;
							anIntArray2770[var10] -= anInt2817;
							anIntArray2771[var10] -= anInt2818;
							var7 = (var3 & 255) * 8;
							int var15 = (var4 & 255) * 8;
							int var13 = (var5 & 255) * 8;
							int var14;
							int var16;
							int var17;
							if (var13 != 0) {
								var16 = anIntArray2824[var13];
								var14 = anIntArray2795[var13];
								var17 = anIntArray2770[var10] * var16 + anIntArray2769[var10] * var14 >> 16;
								anIntArray2770[var10] = anIntArray2770[var10] * var14 - anIntArray2769[var10] * var16 >> 16;
								anIntArray2769[var10] = var17;
							}

							if (var7 != 0) {
								var16 = anIntArray2824[var7];
								var14 = anIntArray2795[var7];
								var17 = anIntArray2770[var10] * var14 - anIntArray2771[var10] * var16 >> 16;
								anIntArray2771[var10] = anIntArray2770[var10] * var16 + anIntArray2771[var10] * var14 >> 16;
								anIntArray2770[var10] = var17;
							}

							if (var15 != 0) {
								var16 = anIntArray2824[var15];
								var14 = anIntArray2795[var15];
								var17 = anIntArray2771[var10] * var16 + anIntArray2769[var10] * var14 >> 16;
								anIntArray2771[var10] = anIntArray2771[var10] * var14 - anIntArray2769[var10] * var16 >> 16;
								anIntArray2769[var10] = var17;
							}

							anIntArray2769[var10] += anInt2816;
							anIntArray2770[var10] += anInt2817;
							anIntArray2771[var10] += anInt2818;
						}
					}
				}

			} else if (var1 == 3) {
				for (var8 = 0; var8 < var6; var8++) {
					var12 = var2[var8];
					if (var12 < anIntArrayArray2828.length) {
						var11 = anIntArrayArray2828[var12];

						for (var9 = 0; var9 < var11.length; var9++) {
							var10 = var11[var9];
							anIntArray2769[var10] -= anInt2816;
							anIntArray2770[var10] -= anInt2817;
							anIntArray2771[var10] -= anInt2818;
							anIntArray2769[var10] = anIntArray2769[var10] * var3 / 128;
							anIntArray2770[var10] = anIntArray2770[var10] * var4 / 128;
							anIntArray2771[var10] = anIntArray2771[var10] * var5 / 128;
							anIntArray2769[var10] += anInt2816;
							anIntArray2770[var10] += anInt2817;
							anIntArray2771[var10] += anInt2818;
						}
					}
				}

			} else if (var1 == 5) {
				if (anIntArrayArray2791 != null && aByteArray2780 != null) {
					for (var8 = 0; var8 < var6; var8++) {
						var12 = var2[var8];
						if (var12 < anIntArrayArray2791.length) {
							var11 = anIntArrayArray2791[var12];

							for (var9 = 0; var9 < var11.length; var9++) {
								var10 = var11[var9];
								var7 = (aByteArray2780[var10] & 255) + var3 * 8;
								if (var7 < 0) {
									var7 = 0;
								} else if (var7 > 255) {
									var7 = 255;
								}

								aByteArray2780[var10] = (byte) var7;
							}
						}
					}
				}

			}
		}
	}

	public void method3370(Class117_Sub22_Sub16 var1, int var2) {
		if (anIntArrayArray2828 != null) {
			if (var2 != -1) {
				Class48 var3 = var1.aClass48Array2454[var2];
				Class117_Sub11 var4 = var3.aClass117_Sub11_651;
				anInt2816 = 0;
				anInt2817 = 0;
				anInt2818 = 0;

				for (int var5 = 0; var5 < var3.anInt647; var5++) {
					int var6 = var3.anIntArray650[var5];
					method3369(var4.anIntArray1847[var6], var4.anIntArrayArray1848[var6], var3.anIntArray649[var5], var3.anIntArray652[var5], var3.anIntArray653[var5]);
				}

				anInt2781 = 0;
			}
		}
	}

	public void method3372() {
		for (int var1 = 0; var1 < anInt2809; var1++) {
			int var2 = anIntArray2769[var1];
			anIntArray2769[var1] = anIntArray2771[var1];
			anIntArray2771[var1] = -var2;
		}

		anInt2781 = 0;
	}

	final void method3373(int var1) {
		int var2 = Class117_Sub22_Sub17_Sub1.anInt2649;
		int var13 = Class117_Sub22_Sub17_Sub1.anInt2637;
		int var7 = 0;
		int var16 = anIntArray2773[var1];
		int var11 = anIntArray2811[var1];
		int var10 = anIntArray2775[var1];
		int var14 = anIntArray2804[var16];
		int var18 = anIntArray2804[var11];
		int var15 = anIntArray2804[var10];
		if (aByteArray2780 == null) {
			Class117_Sub22_Sub17_Sub1.anInt2634 = 0;
		} else {
			Class117_Sub22_Sub17_Sub1.anInt2634 = aByteArray2780[var1] & 255;
		}

		int var3;
		int var5;
		int var6;
		int var12;
		if (var14 >= 50) {
			anIntArray2819[var7] = anIntArray2802[var16];
			anIntArray2814[var7] = anIntArray2825[var16];
			anIntArray2815[var7++] = anIntArray2776[var1];
		} else {
			var5 = anIntArray2800[var16];
			var12 = anIntArray2803[var16];
			var6 = anIntArray2776[var1];
			if (var15 >= 50) {
				var3 = (50 - var14) * anIntArray2827[var15 - var14];
				anIntArray2819[var7] = var2 + (var5 + ((anIntArray2800[var10] - var5) * var3 >> 16)) * Class117_Sub22_Sub17_Sub1.anInt2639 / 50;
				anIntArray2814[var7] = var13 + (var12 + ((anIntArray2803[var10] - var12) * var3 >> 16)) * Class117_Sub22_Sub17_Sub1.anInt2639 / 50;
				anIntArray2815[var7++] = var6 + ((anIntArray2778[var1] - var6) * var3 >> 16);
			}

			if (var18 >= 50) {
				var3 = (50 - var14) * anIntArray2827[var18 - var14];
				anIntArray2819[var7] = var2 + (var5 + ((anIntArray2800[var11] - var5) * var3 >> 16)) * Class117_Sub22_Sub17_Sub1.anInt2639 / 50;
				anIntArray2814[var7] = var13 + (var12 + ((anIntArray2803[var11] - var12) * var3 >> 16)) * Class117_Sub22_Sub17_Sub1.anInt2639 / 50;
				anIntArray2815[var7++] = var6 + ((anIntArray2777[var1] - var6) * var3 >> 16);
			}
		}

		if (var18 >= 50) {
			anIntArray2819[var7] = anIntArray2802[var11];
			anIntArray2814[var7] = anIntArray2825[var11];
			anIntArray2815[var7++] = anIntArray2777[var1];
		} else {
			var5 = anIntArray2800[var11];
			var12 = anIntArray2803[var11];
			var6 = anIntArray2777[var1];
			if (var14 >= 50) {
				var3 = (50 - var18) * anIntArray2827[var14 - var18];
				anIntArray2819[var7] = var2 + (var5 + ((anIntArray2800[var16] - var5) * var3 >> 16)) * Class117_Sub22_Sub17_Sub1.anInt2639 / 50;
				anIntArray2814[var7] = var13 + (var12 + ((anIntArray2803[var16] - var12) * var3 >> 16)) * Class117_Sub22_Sub17_Sub1.anInt2639 / 50;
				anIntArray2815[var7++] = var6 + ((anIntArray2776[var1] - var6) * var3 >> 16);
			}

			if (var15 >= 50) {
				var3 = (50 - var18) * anIntArray2827[var15 - var18];
				anIntArray2819[var7] = var2 + (var5 + ((anIntArray2800[var10] - var5) * var3 >> 16)) * Class117_Sub22_Sub17_Sub1.anInt2639 / 50;
				anIntArray2814[var7] = var13 + (var12 + ((anIntArray2803[var10] - var12) * var3 >> 16)) * Class117_Sub22_Sub17_Sub1.anInt2639 / 50;
				anIntArray2815[var7++] = var6 + ((anIntArray2778[var1] - var6) * var3 >> 16);
			}
		}

		if (var15 >= 50) {
			anIntArray2819[var7] = anIntArray2802[var10];
			anIntArray2814[var7] = anIntArray2825[var10];
			anIntArray2815[var7++] = anIntArray2778[var1];
		} else {
			var5 = anIntArray2800[var10];
			var12 = anIntArray2803[var10];
			var6 = anIntArray2778[var1];
			if (var18 >= 50) {
				var3 = (50 - var15) * anIntArray2827[var18 - var15];
				anIntArray2819[var7] = var2 + (var5 + ((anIntArray2800[var11] - var5) * var3 >> 16)) * Class117_Sub22_Sub17_Sub1.anInt2639 / 50;
				anIntArray2814[var7] = var13 + (var12 + ((anIntArray2803[var11] - var12) * var3 >> 16)) * Class117_Sub22_Sub17_Sub1.anInt2639 / 50;
				anIntArray2815[var7++] = var6 + ((anIntArray2777[var1] - var6) * var3 >> 16);
			}

			if (var14 >= 50) {
				var3 = (50 - var15) * anIntArray2827[var14 - var15];
				anIntArray2819[var7] = var2 + (var5 + ((anIntArray2800[var16] - var5) * var3 >> 16)) * Class117_Sub22_Sub17_Sub1.anInt2639 / 50;
				anIntArray2814[var7] = var13 + (var12 + ((anIntArray2803[var16] - var12) * var3 >> 16)) * Class117_Sub22_Sub17_Sub1.anInt2639 / 50;
				anIntArray2815[var7++] = var6 + ((anIntArray2776[var1] - var6) * var3 >> 16);
			}
		}

		var5 = anIntArray2819[0];
		var12 = anIntArray2819[1];
		var6 = anIntArray2819[2];
		var3 = anIntArray2814[0];
		int var19 = anIntArray2814[1];
		int var4 = anIntArray2814[2];
		Class117_Sub22_Sub17_Sub1.aBool2640 = false;
		int var8;
		int var9;
		int var17;
		int var20;
		if (var7 == 3) {
			if (var5 < 0 || var12 < 0 || var6 < 0 || var5 > Class117_Sub22_Sub17_Sub1.anInt2642 || var12 > Class117_Sub22_Sub17_Sub1.anInt2642 || var6 > Class117_Sub22_Sub17_Sub1.anInt2642) {
				Class117_Sub22_Sub17_Sub1.aBool2640 = true;
			}

			if (aShortArray2822 != null && aShortArray2822[var1] != -1) {
				if (aByteArray2764 != null && aByteArray2764[var1] != -1) {
					var8 = aByteArray2764[var1] & 255;
					var9 = anIntArray2785[var8];
					var20 = anIntArray2786[var8];
					var17 = anIntArray2787[var8];
				} else {
					var9 = var16;
					var20 = var11;
					var17 = var10;
				}

				if (anIntArray2778[var1] == -1) {
					Class117_Sub22_Sub17_Sub1.method3106(var3, var19, var4, var5, var12, var6, anIntArray2776[var1], anIntArray2776[var1], anIntArray2776[var1], anIntArray2800[var9], anIntArray2800[var20], anIntArray2800[var17], anIntArray2803[var9], anIntArray2803[var20], anIntArray2803[var17], anIntArray2804[var9], anIntArray2804[var20], anIntArray2804[var17], aShortArray2822[var1]);
				} else {
					Class117_Sub22_Sub17_Sub1.method3106(var3, var19, var4, var5, var12, var6, anIntArray2815[0], anIntArray2815[1], anIntArray2815[2], anIntArray2800[var9], anIntArray2800[var20], anIntArray2800[var17], anIntArray2803[var9], anIntArray2803[var20], anIntArray2803[var17], anIntArray2804[var9], anIntArray2804[var20], anIntArray2804[var17], aShortArray2822[var1]);
				}
			} else if (anIntArray2778[var1] == -1) {
				Class117_Sub22_Sub17_Sub1.method3104(var3, var19, var4, var5, var12, var6, anIntArray2813[anIntArray2776[var1]]);
			} else {
				Class117_Sub22_Sub17_Sub1.method3153(var3, var19, var4, var5, var12, var6, anIntArray2815[0], anIntArray2815[1], anIntArray2815[2]);
			}
		}

		if (var7 == 4) {
			if (var5 < 0 || var12 < 0 || var6 < 0 || var5 > Class117_Sub22_Sub17_Sub1.anInt2642 || var12 > Class117_Sub22_Sub17_Sub1.anInt2642 || var6 > Class117_Sub22_Sub17_Sub1.anInt2642 || anIntArray2819[3] < 0 || anIntArray2819[3] > Class117_Sub22_Sub17_Sub1.anInt2642) {
				Class117_Sub22_Sub17_Sub1.aBool2640 = true;
			}

			if (aShortArray2822 != null && aShortArray2822[var1] != -1) {
				if (aByteArray2764 != null && aByteArray2764[var1] != -1) {
					var8 = aByteArray2764[var1] & 255;
					var9 = anIntArray2785[var8];
					var20 = anIntArray2786[var8];
					var17 = anIntArray2787[var8];
				} else {
					var9 = var16;
					var20 = var11;
					var17 = var10;
				}

				short var21 = aShortArray2822[var1];
				if (anIntArray2778[var1] == -1) {
					Class117_Sub22_Sub17_Sub1.method3106(var3, var19, var4, var5, var12, var6, anIntArray2776[var1], anIntArray2776[var1], anIntArray2776[var1], anIntArray2800[var9], anIntArray2800[var20], anIntArray2800[var17], anIntArray2803[var9], anIntArray2803[var20], anIntArray2803[var17], anIntArray2804[var9], anIntArray2804[var20], anIntArray2804[var17], var21);
					Class117_Sub22_Sub17_Sub1.method3106(var3, var4, anIntArray2814[3], var5, var6, anIntArray2819[3], anIntArray2776[var1], anIntArray2776[var1], anIntArray2776[var1], anIntArray2800[var9], anIntArray2800[var20], anIntArray2800[var17], anIntArray2803[var9], anIntArray2803[var20], anIntArray2803[var17], anIntArray2804[var9], anIntArray2804[var20], anIntArray2804[var17], var21);
				} else {
					Class117_Sub22_Sub17_Sub1.method3106(var3, var19, var4, var5, var12, var6, anIntArray2815[0], anIntArray2815[1], anIntArray2815[2], anIntArray2800[var9], anIntArray2800[var20], anIntArray2800[var17], anIntArray2803[var9], anIntArray2803[var20], anIntArray2803[var17], anIntArray2804[var9], anIntArray2804[var20], anIntArray2804[var17], var21);
					Class117_Sub22_Sub17_Sub1.method3106(var3, var4, anIntArray2814[3], var5, var6, anIntArray2819[3], anIntArray2815[0], anIntArray2815[2], anIntArray2815[3], anIntArray2800[var9], anIntArray2800[var20], anIntArray2800[var17], anIntArray2803[var9], anIntArray2803[var20], anIntArray2803[var17], anIntArray2804[var9], anIntArray2804[var20], anIntArray2804[var17], var21);
				}
			} else if (anIntArray2778[var1] == -1) {
				var9 = anIntArray2813[anIntArray2776[var1]];
				Class117_Sub22_Sub17_Sub1.method3104(var3, var19, var4, var5, var12, var6, var9);
				Class117_Sub22_Sub17_Sub1.method3104(var3, var4, anIntArray2814[3], var5, var6, anIntArray2819[3], var9);
			} else {
				Class117_Sub22_Sub17_Sub1.method3153(var3, var19, var4, var5, var12, var6, anIntArray2815[0], anIntArray2815[1], anIntArray2815[2]);
				Class117_Sub22_Sub17_Sub1.method3153(var3, var4, anIntArray2814[3], var5, var6, anIntArray2819[3], anIntArray2815[0], anIntArray2815[2], anIntArray2815[3]);
			}
		}

	}

	public void method3374() {
		for (int var1 = 0; var1 < anInt2809; var1++) {
			int var2 = anIntArray2771[var1];
			anIntArray2771[var1] = anIntArray2769[var1];
			anIntArray2769[var1] = -var2;
		}

		anInt2781 = 0;
	}

	public void method3375(int var1) {
		int var2 = anIntArray2824[var1];
		int var4 = anIntArray2795[var1];

		for (int var3 = 0; var3 < anInt2809; var3++) {
			int var5 = anIntArray2770[var3] * var4 - anIntArray2771[var3] * var2 >> 16;
			anIntArray2771[var3] = anIntArray2770[var3] * var2 + anIntArray2771[var3] * var4 >> 16;
			anIntArray2770[var3] = var5;
		}

		anInt2781 = 0;
	}

	public final void method3378(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		anIntArray2808[0] = -1;
		if (anInt2781 != 2 && anInt2781 != 1) {
			method3368();
		}

		int var8 = Class117_Sub22_Sub17_Sub1.anInt2649;
		int var9 = Class117_Sub22_Sub17_Sub1.anInt2637;
		int var10 = anIntArray2824[var1];
		int var11 = anIntArray2795[var1];
		int var12 = anIntArray2824[var2];
		int var13 = anIntArray2795[var2];
		int var14 = anIntArray2824[var3];
		int var15 = anIntArray2795[var3];
		int var16 = anIntArray2824[var4];
		int var17 = anIntArray2795[var4];
		int var18 = var6 * var16 + var7 * var17 >> 16;

		for (int var19 = 0; var19 < anInt2809; var19++) {
			int var20 = anIntArray2769[var19];
			int var21 = anIntArray2770[var19];
			int var22 = anIntArray2771[var19];
			int var23;
			if (var3 != 0) {
				var23 = var21 * var14 + var20 * var15 >> 16;
				var21 = var21 * var15 - var20 * var14 >> 16;
				var20 = var23;
			}

			if (var1 != 0) {
				var23 = var21 * var11 - var22 * var10 >> 16;
				var22 = var21 * var10 + var22 * var11 >> 16;
				var21 = var23;
			}

			if (var2 != 0) {
				var23 = var22 * var12 + var20 * var13 >> 16;
				var22 = var22 * var13 - var20 * var12 >> 16;
				var20 = var23;
			}

			var20 += var5;
			var21 += var6;
			var22 += var7;
			var23 = var21 * var17 - var22 * var16 >> 16;
			var22 = var21 * var16 + var22 * var17 >> 16;
			anIntArray2801[var19] = var22 - var18;
			anIntArray2802[var19] = var8 + var20 * Class117_Sub22_Sub17_Sub1.anInt2639 / var22;
			anIntArray2825[var19] = var9 + var23 * Class117_Sub22_Sub17_Sub1.anInt2639 / var22;
			if (anInt2784 > 0) {
				anIntArray2800[var19] = var20;
				anIntArray2803[var19] = var23;
				anIntArray2804[var19] = var22;
			}
		}

		try {
			method3380(false, false, 0);
		} catch (Exception var24) {
			;
		}

	}

	public final void method3379(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		anIntArray2808[0] = -1;
		if (anInt2781 != 2 && anInt2781 != 1) {
			method3368();
		}

		int var9 = Class117_Sub22_Sub17_Sub1.anInt2649;
		int var10 = Class117_Sub22_Sub17_Sub1.anInt2637;
		int var11 = anIntArray2824[var1];
		int var12 = anIntArray2795[var1];
		int var13 = anIntArray2824[var2];
		int var14 = anIntArray2795[var2];
		int var15 = anIntArray2824[var3];
		int var16 = anIntArray2795[var3];
		int var17 = anIntArray2824[var4];
		int var18 = anIntArray2795[var4];
		int var19 = var6 * var17 + var7 * var18 >> 16;

		for (int var20 = 0; var20 < anInt2809; var20++) {
			int var21 = anIntArray2769[var20];
			int var22 = anIntArray2770[var20];
			int var23 = anIntArray2771[var20];
			int var24;
			if (var3 != 0) {
				var24 = var22 * var15 + var21 * var16 >> 16;
				var22 = var22 * var16 - var21 * var15 >> 16;
				var21 = var24;
			}

			if (var1 != 0) {
				var24 = var22 * var12 - var23 * var11 >> 16;
				var23 = var22 * var11 + var23 * var12 >> 16;
				var22 = var24;
			}

			if (var2 != 0) {
				var24 = var23 * var13 + var21 * var14 >> 16;
				var23 = var23 * var14 - var21 * var13 >> 16;
				var21 = var24;
			}

			var21 += var5;
			var22 += var6;
			var23 += var7;
			var24 = var22 * var18 - var23 * var17 >> 16;
			var23 = var22 * var17 + var23 * var18 >> 16;
			anIntArray2801[var20] = var23 - var19;
			anIntArray2802[var20] = var9 + var21 * Class117_Sub22_Sub17_Sub1.anInt2639 / var8;
			anIntArray2825[var20] = var10 + var24 * Class117_Sub22_Sub17_Sub1.anInt2639 / var8;
			if (anInt2784 > 0) {
				anIntArray2800[var20] = var21;
				anIntArray2803[var20] = var24;
				anIntArray2804[var20] = var23;
			}
		}

		try {
			method3380(false, false, 0);
		} catch (Exception var25) {
			;
		}

	}

	void method2924(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		anIntArray2808[0] = -1;
		if (anInt2781 != 1) {
			method3410();
		}

		int var10 = var8 * var5 - var6 * var4 >> 16;
		int var11 = var7 * var2 + var10 * var3 >> 16;
		int var12 = anInt2793 * var3 >> 16;
		int var13 = var11 + var12;
		if (var13 > 50 && var11 < 3500) {
			int var14 = var8 * var4 + var6 * var5 >> 16;
			int var15 = (var14 - anInt2793) * Class117_Sub22_Sub17_Sub1.anInt2639;
			if (var15 / var13 < Class117_Sub22_Sub17_Sub1.anInt2645) {
				int var16 = (var14 + anInt2793) * Class117_Sub22_Sub17_Sub1.anInt2639;
				if (var16 / var13 > Class117_Sub22_Sub17_Sub1.anInt2636) {
					int var17 = var7 * var3 - var10 * var2 >> 16;
					int var18 = anInt2793 * var2 >> 16;
					int var19 = (var17 + var18) * Class117_Sub22_Sub17_Sub1.anInt2639;
					if (var19 / var13 > Class117_Sub22_Sub17_Sub1.anInt2646) {
						int var20 = var18 + (anInt2466 * 1871917943 * var3 >> 16);
						int var21 = (var17 - var20) * Class117_Sub22_Sub17_Sub1.anInt2639;
						if (var21 / var13 < Class117_Sub22_Sub17_Sub1.anInt2647) {
							int var22 = var12 + (anInt2466 * 1871917943 * var2 >> 16);
							boolean var23 = false;
							boolean var24 = false;
							if (var11 - var22 <= 50) {
								var24 = true;
							}

							boolean var25 = var24 || anInt2784 > 0;
							boolean var26 = false;
							int var27;
							int var28;
							int var29;
							if (var9 > 0 && aBool2774) {
								var27 = var11 - var12;
								if (var27 <= 50) {
									var27 = 50;
								}

								if (var14 > 0) {
									var15 /= var13;
									var16 /= var27;
								} else {
									var16 /= var13;
									var15 /= var27;
								}

								if (var17 > 0) {
									var21 /= var13;
									var19 /= var27;
								} else {
									var19 /= var13;
									var21 /= var27;
								}

								var28 = anInt2806 - Class117_Sub22_Sub17_Sub1.anInt2649;
								var29 = anInt2820 - Class117_Sub22_Sub17_Sub1.anInt2637;
								if (var28 > var15 && var28 < var16 && var29 > var21 && var29 < var19) {
									if (aBool2826) {
										anIntArray2790[anInt2772++] = var9;
									} else {
										var26 = true;
									}
								}
							}

							var27 = Class117_Sub22_Sub17_Sub1.anInt2649;
							var28 = Class117_Sub22_Sub17_Sub1.anInt2637;
							var29 = 0;
							int var30 = 0;
							if (var1 != 0) {
								var29 = anIntArray2824[var1];
								var30 = anIntArray2795[var1];
							}

							for (int var31 = 0; var31 < anInt2809; var31++) {
								int var32 = anIntArray2769[var31];
								int var33 = anIntArray2770[var31];
								int var34 = anIntArray2771[var31];
								int var35;
								if (var1 != 0) {
									var35 = var34 * var29 + var32 * var30 >> 16;
									var34 = var34 * var30 - var32 * var29 >> 16;
									var32 = var35;
								}

								var32 += var6;
								var33 += var7;
								var34 += var8;
								var35 = var34 * var4 + var32 * var5 >> 16;
								var34 = var34 * var5 - var32 * var4 >> 16;
								var32 = var35;
								var35 = var33 * var3 - var34 * var2 >> 16;
								var34 = var33 * var2 + var34 * var3 >> 16;
								anIntArray2801[var31] = var34 - var11;
								if (var34 >= 50) {
									anIntArray2802[var31] = var27 + var32 * Class117_Sub22_Sub17_Sub1.anInt2639 / var34;
									anIntArray2825[var31] = var28 + var35 * Class117_Sub22_Sub17_Sub1.anInt2639 / var34;
								} else {
									anIntArray2802[var31] = -5000;
									var23 = true;
								}

								if (var25) {
									anIntArray2800[var31] = var32;
									anIntArray2803[var31] = var35;
									anIntArray2804[var31] = var34;
								}
							}

							try {
								method3380(var23, var26, var9);
							} catch (Exception var36) {
								;
							}

						}
					}
				}
			}
		}
	}

	final void method3380(boolean var1, boolean var2, int var3) {
		if (anInt2794 < 1600) {
			int var7;
			for (var7 = 0; var7 < anInt2794; var7++) {
				anIntArray2808[var7] = 0;
			}

			int var5;
			int var6;
			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var13;
			int var17;
			for (var7 = 0; var7 < anInt2821; var7++) {
				if (anIntArray2778[var7] != -2) {
					var9 = anIntArray2773[var7];
					var10 = anIntArray2811[var7];
					var11 = anIntArray2775[var7];
					var6 = anIntArray2802[var9];
					var12 = anIntArray2802[var10];
					var8 = anIntArray2802[var11];
					int var14;
					if (!var1 || var6 != -5000 && var12 != -5000 && var8 != -5000) {
						if (var2 && method3383(anInt2806, anInt2820, anIntArray2825[var9], anIntArray2825[var10], anIntArray2825[var11], var6, var12, var8)) {
							anIntArray2790[anInt2772++] = var3;
							var2 = false;
						}

						if ((var6 - var12) * (anIntArray2825[var11] - anIntArray2825[var10]) - (anIntArray2825[var9] - anIntArray2825[var10]) * (var8 - var12) > 0) {
							aBoolArray2798[var7] = false;
							if (var6 >= 0 && var12 >= 0 && var8 >= 0 && var6 <= Class117_Sub22_Sub17_Sub1.anInt2642 && var12 <= Class117_Sub22_Sub17_Sub1.anInt2642 && var8 <= Class117_Sub22_Sub17_Sub1.anInt2642) {
								aBoolArray2797[var7] = false;
							} else {
								aBoolArray2797[var7] = true;
							}

							var14 = (anIntArray2801[var9] + anIntArray2801[var10] + anIntArray2801[var11]) / 3 + anInt2788;
							anIntArrayArray2807[var14][anIntArray2808[var14]++] = var7;
						}
					} else {
						var14 = anIntArray2800[var9];
						var13 = anIntArray2800[var10];
						var17 = anIntArray2800[var11];
						int var4 = anIntArray2803[var9];
						var5 = anIntArray2803[var10];
						int var19 = anIntArray2803[var11];
						int var18 = anIntArray2804[var9];
						int var15 = anIntArray2804[var10];
						int var16 = anIntArray2804[var11];
						var14 -= var13;
						var17 -= var13;
						var4 -= var5;
						var19 -= var5;
						var18 -= var15;
						var16 -= var15;
						int var20 = var4 * var16 - var18 * var19;
						int var21 = var18 * var17 - var14 * var16;
						int var22 = var14 * var19 - var4 * var17;
						if (var13 * var20 + var5 * var21 + var15 * var22 > 0) {
							aBoolArray2798[var7] = true;
							int var23 = (anIntArray2801[var9] + anIntArray2801[var10] + anIntArray2801[var11]) / 3 + anInt2788;
							anIntArrayArray2807[var23][anIntArray2808[var23]++] = var7;
						}
					}
				}
			}

			int[] var26;
			if (aByteArray2779 == null) {
				for (var7 = anInt2794 - 1; var7 >= 0; --var7) {
					var9 = anIntArray2808[var7];
					if (var9 > 0) {
						var26 = anIntArrayArray2807[var7];

						for (var11 = 0; var11 < var9; var11++) {
							method3381(var26[var11]);
						}
					}
				}

			} else {
				for (var7 = 0; var7 < 12; var7++) {
					anIntArray2812[var7] = 0;
					anIntArray2789[var7] = 0;
				}

				for (var7 = anInt2794 - 1; var7 >= 0; --var7) {
					var9 = anIntArray2808[var7];
					if (var9 > 0) {
						var26 = anIntArrayArray2807[var7];

						for (var11 = 0; var11 < var9; var11++) {
							var6 = var26[var11];
							byte var27 = aByteArray2779[var6];
							var8 = anIntArray2812[var27]++;
							anIntArrayArray2782[var27][var8] = var6;
							if (var27 < 10) {
								anIntArray2789[var27] += var7;
							} else if (var27 == 10) {
								anIntArray2810[var8] = var7;
							} else {
								anIntArray2823[var8] = var7;
							}
						}
					}
				}

				var7 = 0;
				if (anIntArray2812[1] > 0 || anIntArray2812[2] > 0) {
					var7 = (anIntArray2789[1] + anIntArray2789[2]) / (anIntArray2812[1] + anIntArray2812[2]);
				}

				var9 = 0;
				if (anIntArray2812[3] > 0 || anIntArray2812[4] > 0) {
					var9 = (anIntArray2789[3] + anIntArray2789[4]) / (anIntArray2812[3] + anIntArray2812[4]);
				}

				var10 = 0;
				if (anIntArray2812[6] > 0 || anIntArray2812[8] > 0) {
					var10 = (anIntArray2789[6] + anIntArray2789[8]) / (anIntArray2812[6] + anIntArray2812[8]);
				}

				var6 = 0;
				var12 = anIntArray2812[10];
				int[] var25 = anIntArrayArray2782[10];
				int[] var28 = anIntArray2810;
				if (var6 == var12) {
					var6 = 0;
					var12 = anIntArray2812[11];
					var25 = anIntArrayArray2782[11];
					var28 = anIntArray2823;
				}

				if (var6 < var12) {
					var11 = var28[var6];
				} else {
					var11 = -1000;
				}

				for (var13 = 0; var13 < 10; var13++) {
					while (var13 == 0 && var11 > var7) {
						method3381(var25[var6++]);
						if (var6 == var12 && var25 != anIntArrayArray2782[11]) {
							var6 = 0;
							var12 = anIntArray2812[11];
							var25 = anIntArrayArray2782[11];
							var28 = anIntArray2823;
						}

						if (var6 < var12) {
							var11 = var28[var6];
						} else {
							var11 = -1000;
						}
					}

					while (var13 == 3 && var11 > var9) {
						method3381(var25[var6++]);
						if (var6 == var12 && var25 != anIntArrayArray2782[11]) {
							var6 = 0;
							var12 = anIntArray2812[11];
							var25 = anIntArrayArray2782[11];
							var28 = anIntArray2823;
						}

						if (var6 < var12) {
							var11 = var28[var6];
						} else {
							var11 = -1000;
						}
					}

					while (var13 == 5 && var11 > var10) {
						method3381(var25[var6++]);
						if (var6 == var12 && var25 != anIntArrayArray2782[11]) {
							var6 = 0;
							var12 = anIntArray2812[11];
							var25 = anIntArrayArray2782[11];
							var28 = anIntArray2823;
						}

						if (var6 < var12) {
							var11 = var28[var6];
						} else {
							var11 = -1000;
						}
					}

					var17 = anIntArray2812[var13];
					int[] var24 = anIntArrayArray2782[var13];

					for (var5 = 0; var5 < var17; var5++) {
						method3381(var24[var5]);
					}
				}

				while (var11 != -1000) {
					method3381(var25[var6++]);
					if (var6 == var12 && var25 != anIntArrayArray2782[11]) {
						var6 = 0;
						var25 = anIntArrayArray2782[11];
						var12 = anIntArray2812[11];
						var28 = anIntArray2823;
					}

					if (var6 < var12) {
						var11 = var28[var6];
					} else {
						var11 = -1000;
					}
				}

			}
		}
	}

	final void method3381(int var1) {
		if (aBoolArray2798[var1]) {
			method3373(var1);
		} else {
			int var2 = anIntArray2773[var1];
			int var4 = anIntArray2811[var1];
			int var3 = anIntArray2775[var1];
			Class117_Sub22_Sub17_Sub1.aBool2640 = aBoolArray2797[var1];
			if (aByteArray2780 == null) {
				Class117_Sub22_Sub17_Sub1.anInt2634 = 0;
			} else {
				Class117_Sub22_Sub17_Sub1.anInt2634 = aByteArray2780[var1] & 255;
			}

			if (aShortArray2822 != null && aShortArray2822[var1] != -1) {
				int var5;
				int var6;
				int var8;
				if (aByteArray2764 != null && aByteArray2764[var1] != -1) {
					int var7 = aByteArray2764[var1] & 255;
					var8 = anIntArray2785[var7];
					var5 = anIntArray2786[var7];
					var6 = anIntArray2787[var7];
				} else {
					var8 = var2;
					var5 = var4;
					var6 = var3;
				}

				if (anIntArray2778[var1] == -1) {
					Class117_Sub22_Sub17_Sub1.method3106(anIntArray2825[var2], anIntArray2825[var4], anIntArray2825[var3], anIntArray2802[var2], anIntArray2802[var4], anIntArray2802[var3], anIntArray2776[var1], anIntArray2776[var1], anIntArray2776[var1], anIntArray2800[var8], anIntArray2800[var5], anIntArray2800[var6], anIntArray2803[var8], anIntArray2803[var5], anIntArray2803[var6], anIntArray2804[var8], anIntArray2804[var5], anIntArray2804[var6], aShortArray2822[var1]);
				} else {
					Class117_Sub22_Sub17_Sub1.method3106(anIntArray2825[var2], anIntArray2825[var4], anIntArray2825[var3], anIntArray2802[var2], anIntArray2802[var4], anIntArray2802[var3], anIntArray2776[var1], anIntArray2777[var1], anIntArray2778[var1], anIntArray2800[var8], anIntArray2800[var5], anIntArray2800[var6], anIntArray2803[var8], anIntArray2803[var5], anIntArray2803[var6], anIntArray2804[var8], anIntArray2804[var5], anIntArray2804[var6], aShortArray2822[var1]);
				}
			} else if (anIntArray2778[var1] == -1) {
				Class117_Sub22_Sub17_Sub1.method3104(anIntArray2825[var2], anIntArray2825[var4], anIntArray2825[var3], anIntArray2802[var2], anIntArray2802[var4], anIntArray2802[var3], anIntArray2813[anIntArray2776[var1]]);
			} else {
				Class117_Sub22_Sub17_Sub1.method3153(anIntArray2825[var2], anIntArray2825[var4], anIntArray2825[var3], anIntArray2802[var2], anIntArray2802[var4], anIntArray2802[var3], anIntArray2776[var1], anIntArray2777[var1], anIntArray2778[var1]);
			}

		}
	}

	public void method3382(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < anInt2809; var4++) {
			anIntArray2769[var4] = anIntArray2769[var4] * var1 / 128;
			anIntArray2770[var4] = anIntArray2770[var4] * var2 / 128;
			anIntArray2771[var4] = anIntArray2771[var4] * var3 / 128;
		}

		anInt2781 = 0;
	}

	final boolean method3383(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		return var2 < var3 && var2 < var4 && var2 < var5 ? false : (var2 > var3 && var2 > var4 && var2 > var5 ? false : (var1 < var6 && var1 < var7 && var1 < var8 ? false : var1 <= var6 || var1 <= var7 || var1 <= var8));
	}

	static {
		anIntArray2824 = Class117_Sub22_Sub17_Sub1.anIntArray2653;
		anIntArray2795 = Class117_Sub22_Sub17_Sub1.anIntArray2654;
		anIntArray2813 = Class117_Sub22_Sub17_Sub1.anIntArray2643;
		anIntArray2827 = Class117_Sub22_Sub17_Sub1.anIntArray2644;
	}

	public void method3387(Class117_Sub22_Sub16 var1, int var2, Class117_Sub22_Sub16 var3, int var4, int[] var5) {
		if (var2 != -1) {
			if (var5 != null && var4 != -1) {
				Class48 var7 = var1.aClass48Array2454[var2];
				Class48 var8 = var3.aClass48Array2454[var4];
				Class117_Sub11 var9 = var7.aClass117_Sub11_651;
				anInt2816 = 0;
				anInt2817 = 0;
				anInt2818 = 0;
				byte var10 = 0;
				int var13 = var10 + 1;
				int var11 = var5[var10];

				int var6;
				int var12;
				for (var6 = 0; var6 < var7.anInt647; var6++) {
					for (var12 = var7.anIntArray650[var6]; var12 > var11; var11 = var5[var13++]) {
						;
					}

					if (var12 != var11 || var9.anIntArray1847[var12] == 0) {
						method3369(var9.anIntArray1847[var12], var9.anIntArrayArray1848[var12], var7.anIntArray649[var6], var7.anIntArray652[var6], var7.anIntArray653[var6]);
					}
				}

				anInt2816 = 0;
				anInt2817 = 0;
				anInt2818 = 0;
				var10 = 0;
				var13 = var10 + 1;
				var11 = var5[var10];

				for (var6 = 0; var6 < var8.anInt647; var6++) {
					for (var12 = var8.anIntArray650[var6]; var12 > var11; var11 = var5[var13++]) {
						;
					}

					if (var12 == var11 || var9.anIntArray1847[var12] == 0) {
						method3369(var9.anIntArray1847[var12], var9.anIntArrayArray1848[var12], var8.anIntArray649[var6], var8.anIntArray652[var6], var8.anIntArray653[var6]);
					}
				}

				anInt2781 = 0;
			} else {
				method3370(var1, var2);
			}
		}
	}

	Class117_Sub22_Sub18_Sub7() {
	}

	public void method3399() {
		for (int var1 = 0; var1 < anInt2809; var1++) {
			anIntArray2769[var1] = -anIntArray2769[var1];
			anIntArray2771[var1] = -anIntArray2771[var1];
		}

		anInt2781 = 0;
	}

	public Class117_Sub22_Sub18_Sub7 method3406(boolean var1) {
		if (!var1 && aByteArray2765.length < anInt2821) {
			aByteArray2765 = new byte[anInt2821 + 100];
		}

		return method3366(var1, aClass117_Sub22_Sub18_Sub7_2768, aByteArray2765);
	}

	public void method3410() {
		if (anInt2781 != 1) {
			anInt2781 = 1;
			anInt2466 = 0;
			anInt2792 = 0;
			anInt2793 = 0;

			for (int var2 = 0; var2 < anInt2809; var2++) {
				int var4 = anIntArray2769[var2];
				int var1 = anIntArray2770[var2];
				int var3 = anIntArray2771[var2];
				if (-var1 > anInt2466 * 1871917943) {
					anInt2466 = -var1 * 291739207;
				}

				if (var1 > anInt2792) {
					anInt2792 = var1;
				}

				int var5 = var4 * var4 + var3 * var3;
				if (var5 > anInt2793) {
					anInt2793 = var5;
				}
			}

			anInt2793 = (int) (Math.sqrt((double) anInt2793) + 0.99D);
			anInt2788 = (int) (Math.sqrt((double) (anInt2793 * anInt2793 + anInt2466 * 1871917943 * anInt2466 * 1871917943)) + 0.99D);
			anInt2794 = anInt2788 + (int) (Math.sqrt((double) (anInt2793 * anInt2793 + anInt2792 * anInt2792)) + 0.99D);
		}
	}

	public int method3413() {
		method3410();
		return anInt2793;
	}

}
