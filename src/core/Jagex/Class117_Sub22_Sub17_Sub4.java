package core.Jagex;
import java.util.Random;

public abstract class Class117_Sub22_Sub17_Sub4 extends Class117_Sub22_Sub17 {

	public static Class117_Sub22_Sub17_Sub2[] aClass117_Sub22_Sub17_Sub2Array2850;
	int[] anIntArray2845;
	public int anInt2854 = 0;
	byte[] aByteArray2851;
	byte[][] aByteArrayArray2853 = new byte[256][];
	int[] anIntArray2846;
	int[] anIntArray2847;
	int[] anIntArray2843;
	int[] anIntArray2844;
	int anInt2848;
	int anInt2849;
	static int anInt2859 = 0;
	static int anInt2852 = -1;
	static int anInt2856 = -1;
	static int anInt2862 = -1;
	static int anInt2855 = -1;
	static int anInt2858 = 0;
	static int anInt2842 = 0;
	static int anInt2841 = 256;
	static int anInt2860 = 0;
	static Random aRandom2861 = new Random();
	static String[] aStringArray2857 = new String[100];

	void method3451(byte[] var1) {
		anIntArray2845 = new int[256];
		int var5;
		if (var1.length == 257) {
			for (var5 = 0; var5 < anIntArray2845.length; var5++) {
				anIntArray2845[var5] = var1[var5] & 255;
			}

			anInt2854 = var1[256] & 255;
		} else {
			var5 = 0;

			for (int var9 = 0; var9 < 256; var9++) {
				anIntArray2845[var9] = var1[var5++] & 255;
			}

			int[] var14 = new int[256];
			int[] var8 = new int[256];

			int var7;
			for (var7 = 0; var7 < 256; var7++) {
				var14[var7] = var1[var5++] & 255;
			}

			for (var7 = 0; var7 < 256; var7++) {
				var8[var7] = var1[var5++] & 255;
			}

			byte[][] var13 = new byte[256][];

			int var6;
			for (int var3 = 0; var3 < 256; var3++) {
				var13[var3] = new byte[var14[var3]];
				byte var4 = 0;

				for (var6 = 0; var6 < var13[var3].length; var6++) {
					var4 += var1[var5++];
					var13[var3][var6] = var4;
				}
			}

			byte[][] var10 = new byte[256][];

			int var11;
			for (var11 = 0; var11 < 256; var11++) {
				var10[var11] = new byte[var14[var11]];
				byte var12 = 0;

				for (int var2 = 0; var2 < var10[var11].length; var2++) {
					var12 += var1[var5++];
					var10[var11][var2] = var12;
				}
			}

			aByteArray2851 = new byte[65536];

			for (var11 = 0; var11 < 256; var11++) {
				if (var11 != 32 && var11 != 160) {
					for (var6 = 0; var6 < 256; var6++) {
						if (var6 != 32 && var6 != 160) {
							aByteArray2851[(var11 << 8) + var6] = (byte) method3467(var13, var10, var8, anIntArray2845, var14, var11, var6);
						}
					}
				}
			}

			anInt2854 = var8[32] + var14[32];
		}

	}

	int method3453(char var1) {
		if (var1 == 160) {
			var1 = 32;
		}

		return anIntArray2845[Class117_Sub22_Sub18_Sub1_Sub2.method3548(var1, 289789629) & 255];
	}

	public int method3454(String var1) {
		if (var1 == null) {
			return 0;
		} else {
			int var2 = -1;
			int var3 = -1;
			int var4 = 0;

			for (int var5 = 0; var5 < var1.length(); var5++) {
				char var6 = var1.charAt(var5);
				if (var6 == 60) {
					var2 = var5;
				} else {
					if (var6 == 62 && var2 != -1) {
						String var7 = var1.substring(var2 + 1, var5);
						var2 = -1;
						if (var7.equals("lt")) {
							var6 = 60;
						} else {
							if (!var7.equals("gt")) {
								if (var7.startsWith("img=")) {
									try {
										String var8 = var7.substring(4);
										int var9 = Class5.method87(var8, 10, true, 1522449038);
										var4 += aClass117_Sub22_Sub17_Sub2Array2850[var9].anInt2702;
										var3 = -1;
									} catch (Exception var11) {
										;
									}
								}
								continue;
							}

							var6 = 62;
						}
					}

					if (var6 == 160) {
						var6 = 32;
					}

					if (var2 == -1) {
						var4 += anIntArray2845[(char) (Class117_Sub22_Sub18_Sub1_Sub2.method3548(var6, -541067469) & 255)];
						if (aByteArray2851 != null && var3 != -1) {
							var4 += aByteArray2851[(var3 << 8) + var6];
						}

						var3 = var6;
					}
				}
			}

			return var4;
		}
	}

	int method3455(String var1, int[] var2, String[] var3) {
		if (var1 == null) {
			return 0;
		} else {
			int var4 = 0;
			int var5 = 0;
			StringBuilder var6 = new StringBuilder(100);
			int var7 = -1;
			int var8 = 0;
			byte var9 = 0;
			int var10 = -1;
			char var11 = 0;
			int var12 = 0;
			int var13 = var1.length();

			for (int var14 = 0; var14 < var13; var14++) {
				char var15 = var1.charAt(var14);
				if (var15 == 60) {
					var10 = var14;
				} else {
					if (var15 == 62 && var10 != -1) {
						String var16 = var1.substring(var10 + 1, var14);
						var10 = -1;
						var6.append('<');
						var6.append(var16);
						var6.append('>');
						if (var16.equals("br")) {
							var3[var12] = var6.toString().substring(var5, var6.length());
							++var12;
							var5 = var6.length();
							var4 = 0;
							var7 = -1;
							var11 = 0;
						} else if (var16.equals("lt")) {
							var4 += method3453('<');
							if (aByteArray2851 != null && var11 != -1) {
								var4 += aByteArray2851[(var11 << 8) + 60];
							}

							var11 = 60;
						} else if (var16.equals("gt")) {
							var4 += method3453('>');
							if (aByteArray2851 != null && var11 != -1) {
								var4 += aByteArray2851[(var11 << 8) + 62];
							}

							var11 = 62;
						} else if (var16.startsWith("img=")) {
							try {
								String var17 = var16.substring(4);
								int var18 = Class5.method87(var17, 10, true, 2041869743);
								var4 += aClass117_Sub22_Sub17_Sub2Array2850[var18].anInt2702;
								var11 = 0;
							} catch (Exception var20) {
								;
							}
						}

						var15 = 0;
					}

					if (var10 == -1) {
						if (var15 != 0) {
							var6.append(var15);
							var4 += method3453(var15);
							if (aByteArray2851 != null && var11 != -1) {
								var4 += aByteArray2851[(var11 << 8) + var15];
							}

							var11 = var15;
						}

						if (var15 == 32) {
							var7 = var6.length();
							var8 = var4;
							var9 = 1;
						}

						if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
							var3[var12] = var6.toString().substring(var5, var7 - var9);
							++var12;
							var5 = var7;
							var7 = -1;
							var4 -= var8;
							var11 = 0;
						}

						if (var15 == 45) {
							var7 = var6.length();
							var8 = var4;
							var9 = 0;
						}
					}
				}
			}

			String var21 = var6.toString();
			if (var21.length() > var5) {
				var3[var12++] = var21.substring(var5, var21.length());
			}

			return var12;
		}
	}

	public int method3457(String var1, int var2) {
		return method3455(var1, new int[]{var2}, aStringArray2857);
	}

	public static String method3458(String var0) {
		int var1 = var0.length();
		int var4 = 0;

		for (int var3 = 0; var3 < var1; var3++) {
			char var2 = var0.charAt(var3);
			if (var2 == 60 || var2 == 62) {
				var4 += 3;
			}
		}

		StringBuilder var7 = new StringBuilder(var1 + var4);

		for (int var6 = 0; var6 < var1; var6++) {
			char var5 = var0.charAt(var6);
			if (var5 == 60) {
				var7.append("<lt>");
			} else if (var5 != 62) {
				var7.append(var5);
			} else {
				var7.append("<gt>");
			}
		}

		return var7.toString();
	}

	Class117_Sub22_Sub17_Sub4(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		anIntArray2846 = var2;
		anIntArray2847 = var3;
		anIntArray2843 = var4;
		anIntArray2844 = var5;
		method3451(var1);
		aByteArrayArray2853 = var7;
		int var10 = Integer.MAX_VALUE;
		int var9 = Integer.MIN_VALUE;

		for (int var8 = 0; var8 < 256; var8++) {
			if (anIntArray2847[var8] < var10 && anIntArray2844[var8] != 0) {
				var10 = anIntArray2847[var8];
			}

			if (anIntArray2847[var8] + anIntArray2844[var8] > var9) {
				var9 = anIntArray2847[var8] + anIntArray2844[var8];
			}
		}

		anInt2848 = anInt2854 - var10;
		anInt2849 = var9 - anInt2854;
	}

	public void method3459(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			method3462(var4, var5);
			method3468(var1, var2 - method3454(var1), var3);
		}
	}

	public int method3461(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		if (var1 == null) {
			return 0;
		} else {
			method3462(var6, var7);
			if (var10 == 0) {
				var10 = anInt2854;
			}

			int[] var12 = new int[]{var4};
			if (var5 < anInt2848 + anInt2849 + var10 && var5 < var10 + var10) {
				var12 = null;
			}

			int var14 = method3455(var1, var12, aStringArray2857);
			if (var9 == 3 && var14 == 1) {
				var9 = 1;
			}

			int var11;
			int var13;
			if (var9 == 0) {
				var13 = var3 + anInt2848;
			} else if (var9 == 1) {
				var13 = var3 + anInt2848 + (var5 - anInt2848 - anInt2849 - (var14 - 1) * var10) / 2;
			} else if (var9 == 2) {
				var13 = var3 + var5 - anInt2849 - (var14 - 1) * var10;
			} else {
				var11 = (var5 - anInt2848 - anInt2849 - (var14 - 1) * var10) / (var14 + 1);
				if (var11 < 0) {
					var11 = 0;
				}

				var13 = var3 + anInt2848 + var11;
				var10 += var11;
			}

			for (var11 = 0; var11 < var14; var11++) {
				if (var8 == 0) {
					method3468(aStringArray2857[var11], var2, var13);
				} else if (var8 == 1) {
					method3468(aStringArray2857[var11], var2 + (var4 - method3454(aStringArray2857[var11])) / 2, var13);
				} else if (var8 == 2) {
					method3468(aStringArray2857[var11], var2 + var4 - method3454(aStringArray2857[var11]), var13);
				} else if (var11 == var14 - 1) {
					method3468(aStringArray2857[var11], var2, var13);
				} else {
					method3477(aStringArray2857[var11], var4);
					method3468(aStringArray2857[var11], var2, var13);
					anInt2859 = 0;
				}

				var13 += var10;
			}

			return var14;
		}
	}

	void method3462(int var1, int var2) {
		anInt2852 = -1;
		anInt2856 = -1;
		anInt2862 = var2;
		anInt2855 = var2;
		anInt2858 = var1;
		anInt2842 = var1;
		anInt2841 = 256;
		anInt2859 = 0;
		anInt2860 = 0;
	}

	public void method3463(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			method3462(var4, var5);
			int[] var8 = new int[var1.length()];
			int[] var7 = new int[var1.length()];

			for (int var9 = 0; var9 < var1.length(); var9++) {
				var8[var9] = (int) (Math.sin((double) var9 / 5.0D + (double) var6 / 5.0D) * 5.0D);
				var7[var9] = (int) (Math.sin((double) var9 / 3.0D + (double) var6 / 5.0D) * 5.0D);
			}

			method3469(var1, var2 - method3454(var1) / 2, var3, var8, var7);
		}
	}

	public void method3464(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 != null) {
			method3462(var4, var5);
			double var9 = 7.0D - (double) var7 / 8.0D;
			if (var9 < 0.0D) {
				var9 = 0.0D;
			}

			int[] var11 = new int[var1.length()];

			for (int var8 = 0; var8 < var1.length(); var8++) {
				var11[var8] = (int) (Math.sin((double) var8 / 1.5D + (double) var6 / 1.0D) * var9);
			}

			method3469(var1, var2 - method3454(var1) / 2, var3, (int[]) null, var11);
		}
	}

	public void method3465(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			method3462(var4, var5);
			aRandom2861.setSeed((long) var6);
			anInt2841 = 192 + (aRandom2861.nextInt() & 31);
			int[] var8 = new int[var1.length()];
			int var7 = 0;

			for (int var9 = 0; var9 < var1.length(); var9++) {
				var8[var9] = var7;
				if ((aRandom2861.nextInt() & 3) == 0) {
					++var7;
				}
			}

			method3469(var1, var2, var3, var8, (int[]) null);
		}
	}

	Class117_Sub22_Sub17_Sub4(byte[] var1) {
		method3451(var1);
	}

	void method3466(String var1) {
		try {
			String var2;
			int var3;
			if (var1.startsWith("col=")) {
				var2 = var1.substring(4);
				var3 = Class5.method87(var2, 16, true, 62560315);
				anInt2842 = var3;
			} else if (var1.equals("/col")) {
				anInt2842 = anInt2858;
			} else if (var1.startsWith("str=")) {
				var2 = var1.substring(4);
				var3 = Class5.method87(var2, 16, true, -522761269);
				anInt2852 = var3;
			} else if (var1.equals("str")) {
				anInt2852 = 8388608;
			} else if (var1.equals("/str")) {
				anInt2852 = -1;
			} else if (var1.startsWith("u=")) {
				var2 = var1.substring(2);
				var3 = Class5.method87(var2, 16, true, 1185194098);
				anInt2856 = var3;
			} else if (var1.equals("u")) {
				anInt2856 = 0;
			} else if (var1.equals("/u")) {
				anInt2856 = -1;
			} else if (var1.startsWith("shad=")) {
				anInt2855 = Class52.method820(var1.substring(5), 16, -1050954579);
			} else if (var1.equals("shad")) {
				anInt2855 = 0;
			} else if (var1.equals("/shad")) {
				anInt2855 = anInt2862;
			} else if (var1.equals("br")) {
				method3462(anInt2858, anInt2862);
			}
		} catch (Exception var4) {
			;
		}

	}

	static int method3467(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
		int var7 = var2[var5];
		int var15 = var7 + var4[var5];
		int var12 = var2[var6];
		int var8 = var12 + var4[var6];
		int var13 = var7;
		if (var12 > var7) {
			var13 = var12;
		}

		int var9 = var15;
		if (var8 < var15) {
			var9 = var8;
		}

		int var11 = var3[var5];
		if (var3[var6] < var11) {
			var11 = var3[var6];
		}

		byte[] var16 = var1[var5];
		byte[] var18 = var0[var6];
		int var17 = var13 - var7;
		int var19 = var13 - var12;

		for (int var14 = var13; var14 < var9; var14++) {
			int var10 = var16[var17++] + var18[var19++];
			if (var10 < var11) {
				var11 = var10;
			}
		}

		return -var11;
	}

	void method3468(String var1, int var2, int var3) {
		var3 -= anInt2854;
		int var4 = -1;
		int var5 = -1;

		for (int var6 = 0; var6 < var1.length(); var6++) {
			if (var1.charAt(var6) != 0) {
				char var7 = (char) (Class117_Sub22_Sub18_Sub1_Sub2.method3548(var1.charAt(var6), -1168820199) & 255);
				if (var7 == 60) {
					var4 = var6;
				} else {
					int var10;
					if (var7 == 62 && var4 != -1) {
						String var8 = var1.substring(var4 + 1, var6);
						var4 = -1;
						if (var8.equals("lt")) {
							var7 = 60;
						} else {
							if (!var8.equals("gt")) {
								if (var8.startsWith("img=")) {
									try {
										String var15 = var8.substring(4);
										var10 = Class5.method87(var15, 10, true, -323035001);
										Class117_Sub22_Sub17_Sub2 var12 = aClass117_Sub22_Sub17_Sub2Array2850[var10];
										var12.method3239(var2, var3 + anInt2854 - var12.anInt2709);
										var2 += var12.anInt2702;
										var5 = -1;
									} catch (Exception var13) {
										;
									}
								} else {
									method3466(var8);
								}
								continue;
							}

							var7 = 62;
						}
					}

					if (var7 == 160) {
						var7 = 32;
					}

					if (var4 == -1) {
						if (aByteArray2851 != null && var5 != -1) {
							var2 += aByteArray2851[(var5 << 8) + var7];
						}

						int var14 = anIntArray2843[var7];
						var10 = anIntArray2844[var7];
						if (var7 != 32) {
							if (anInt2841 == 256) {
								if (anInt2855 != -1) {
									method3472(aByteArrayArray2853[var7], var2 + anIntArray2846[var7] + 1, var3 + anIntArray2847[var7] + 1, var14, var10, anInt2855);
								}

								method3470(aByteArrayArray2853[var7], var2 + anIntArray2846[var7], var3 + anIntArray2847[var7], var14, var10, anInt2842);
							} else {
								if (anInt2855 != -1) {
									method3474(aByteArrayArray2853[var7], var2 + anIntArray2846[var7] + 1, var3 + anIntArray2847[var7] + 1, var14, var10, anInt2855, anInt2841);
								}

								method3476(aByteArrayArray2853[var7], var2 + anIntArray2846[var7], var3 + anIntArray2847[var7], var14, var10, anInt2842, anInt2841);
							}
						} else if (anInt2859 > 0) {
							anInt2860 += anInt2859;
							var2 += anInt2860 >> 8;
							anInt2860 &= 255;
						}

						int var9 = anIntArray2845[var7];
						if (anInt2852 != -1) {
							method2916(var2, var3 + (int) ((double) anInt2854 * 0.7D), var9, anInt2852);
						}

						if (anInt2856 != -1) {
							method2916(var2, var3 + anInt2854 + 1, var9, anInt2856);
						}

						var2 += var9;
						var5 = var7;
					}
				}
			}
		}

	}

	void method3469(String var1, int var2, int var3, int[] var4, int[] var5) {
		var3 -= anInt2854;
		int var6 = -1;
		int var7 = -1;
		int var8 = 0;

		for (int var9 = 0; var9 < var1.length(); var9++) {
			if (var1.charAt(var9) != 0) {
				char var10 = (char) (Class117_Sub22_Sub18_Sub1_Sub2.method3548(var1.charAt(var9), -1904287821) & 255);
				if (var10 == 60) {
					var6 = var9;
				} else {
					int var12;
					int var13;
					int var15;
					if (var10 == 62 && var6 != -1) {
						String var11 = var1.substring(var6 + 1, var9);
						var6 = -1;
						if (var11.equals("lt")) {
							var10 = 60;
						} else {
							if (!var11.equals("gt")) {
								if (var11.startsWith("img=")) {
									try {
										if (var4 != null) {
											var12 = var4[var8];
										} else {
											var12 = 0;
										}

										if (var5 != null) {
											var13 = var5[var8];
										} else {
											var13 = 0;
										}

										++var8;
										String var20 = var11.substring(4);
										var15 = Class5.method87(var20, 10, true, -577045884);
										Class117_Sub22_Sub17_Sub2 var17 = aClass117_Sub22_Sub17_Sub2Array2850[var15];
										var17.method3239(var2 + var12, var3 + anInt2854 - var17.anInt2709 + var13);
										var2 += var17.anInt2702;
										var7 = -1;
									} catch (Exception var18) {
										;
									}
								} else {
									method3466(var11);
								}
								continue;
							}

							var10 = 62;
						}
					}

					if (var10 == 160) {
						var10 = 32;
					}

					if (var6 == -1) {
						if (aByteArray2851 != null && var7 != -1) {
							var2 += aByteArray2851[(var7 << 8) + var10];
						}

						int var19 = anIntArray2843[var10];
						var12 = anIntArray2844[var10];
						if (var4 != null) {
							var13 = var4[var8];
						} else {
							var13 = 0;
						}

						if (var5 != null) {
							var15 = var5[var8];
						} else {
							var15 = 0;
						}

						++var8;
						if (var10 != 32) {
							if (anInt2841 == 256) {
								if (anInt2855 != -1) {
									method3472(aByteArrayArray2853[var10], var2 + anIntArray2846[var10] + 1 + var13, var3 + anIntArray2847[var10] + 1 + var15, var19, var12, anInt2855);
								}

								method3470(aByteArrayArray2853[var10], var2 + anIntArray2846[var10] + var13, var3 + anIntArray2847[var10] + var15, var19, var12, anInt2842);
							} else {
								if (anInt2855 != -1) {
									method3474(aByteArrayArray2853[var10], var2 + anIntArray2846[var10] + 1 + var13, var3 + anIntArray2847[var10] + 1 + var15, var19, var12, anInt2855, anInt2841);
								}

								method3476(aByteArrayArray2853[var10], var2 + anIntArray2846[var10] + var13, var3 + anIntArray2847[var10] + var15, var19, var12, anInt2842, anInt2841);
							}
						} else if (anInt2859 > 0) {
							anInt2860 += anInt2859;
							var2 += anInt2860 >> 8;
							anInt2860 &= 255;
						}

						int var14 = anIntArray2845[var10];
						if (anInt2852 != -1) {
							method2916(var2, var3 + (int) ((double) anInt2854 * 0.7D), var14, anInt2852);
						}

						if (anInt2856 != -1) {
							method2916(var2, var3 + anInt2854, var14, anInt2856);
						}

						var2 += var14;
						var7 = var10;
					}
				}
			}
		}

	}

	abstract void method3470(byte[] var1, int var2, int var3, int var4, int var5, int var6);

	public void method3471(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			method3462(var4, var5);
			method3468(var1, var2, var3);
		}
	}

	static void method3472(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var1 + var2 * anInt2462;
		int var9 = anInt2462 - var3;
		int var10 = 0;
		int var7 = 0;
		int var8;
		if (var2 < anInt2465) {
			var8 = anInt2465 - var2;
			var4 -= var8;
			var2 = anInt2465;
			var7 += var8 * var3;
			var6 += var8 * anInt2462;
		}

		if (var2 + var4 > anInt2463) {
			var4 -= var2 + var4 - anInt2463;
		}

		if (var1 < anInt2464) {
			var8 = anInt2464 - var1;
			var3 -= var8;
			var1 = anInt2464;
			var7 += var8;
			var6 += var8;
			var10 += var8;
			var9 += var8;
		}

		if (var1 + var3 > anInt2460) {
			var8 = var1 + var3 - anInt2460;
			var3 -= var8;
			var10 += var8;
			var9 += var8;
		}

		if (var3 > 0 && var4 > 0) {
			method3473(anIntArray2459, var0, var5, var7, var6, var3, var4, var9, var10);
		}
	}

	static void method3473(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; var10++) {
			int var11;
			for (var11 = var9; var11 < 0; var11++) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] == 0) {
					++var4;
				} else {
					var0[var4++] = var2;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			for (var11 = var5; var11 < 0; var11++) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	static void method3474(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var1 + var2 * anInt2462;
		int var8 = anInt2462 - var3;
		int var10 = 0;
		int var11 = 0;
		int var9;
		if (var2 < anInt2465) {
			var9 = anInt2465 - var2;
			var4 -= var9;
			var2 = anInt2465;
			var11 += var9 * var3;
			var7 += var9 * anInt2462;
		}

		if (var2 + var4 > anInt2463) {
			var4 -= var2 + var4 - anInt2463;
		}

		if (var1 < anInt2464) {
			var9 = anInt2464 - var1;
			var3 -= var9;
			var1 = anInt2464;
			var11 += var9;
			var7 += var9;
			var10 += var9;
			var8 += var9;
		}

		if (var1 + var3 > anInt2460) {
			var9 = var1 + var3 - anInt2460;
			var3 -= var9;
			var10 += var9;
			var8 += var9;
		}

		if (var3 > 0 && var4 > 0) {
			method3475(anIntArray2459, var0, var5, var11, var7, var3, var4, var8, var10, var6);
		}
	}

	static void method3475(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & 65280) * var9 & 16711680) >> 8;
		var9 = 256 - var9;

		for (int var11 = -var6; var11 < 0; var11++) {
			for (int var10 = -var5; var10 < 0; var10++) {
				if (var1[var3++] != 0) {
					int var12 = var0[var4];
					var0[var4++] = (((var12 & 16711935) * var9 & -16711936) + ((var12 & 65280) * var9 & 16711680) >> 8) + var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	abstract void method3476(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

	void method3477(String var1, int var2) {
		int var3 = 0;
		boolean var6 = false;

		for (int var4 = 0; var4 < var1.length(); var4++) {
			char var5 = var1.charAt(var4);
			if (var5 == 60) {
				var6 = true;
			} else if (var5 == 62) {
				var6 = false;
			} else if (!var6 && var5 == 32) {
				++var3;
			}
		}

		if (var3 > 0) {
			anInt2859 = (var2 - method3454(var1) << 8) / var3;
		}

	}

	public int method3500(String var1, int var2) {
		int var3 = method3455(var1, new int[]{var2}, aStringArray2857);
		int var5 = 0;

		for (int var6 = 0; var6 < var3; var6++) {
			int var4 = method3454(aStringArray2857[var6]);
			if (var4 > var5) {
				var5 = var4;
			}
		}

		return var5;
	}

	public void method3524(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			method3462(var4, var5);
			int[] var8 = new int[var1.length()];

			for (int var7 = 0; var7 < var1.length(); var7++) {
				var8[var7] = (int) (Math.sin((double) var7 / 2.0D + (double) var6 / 5.0D) * 5.0D);
			}

			method3469(var1, var2 - method3454(var1) / 2, var3, (int[]) null, var8);
		}
	}

	public void method3530(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			method3462(var4, var5);
			method3468(var1, var2 - method3454(var1) / 2, var3);
		}
	}

}
