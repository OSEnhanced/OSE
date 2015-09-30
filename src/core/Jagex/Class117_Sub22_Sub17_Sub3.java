package core.Jagex;
import java.awt.*;
import java.awt.image.PixelGrabber;

public final class Class117_Sub22_Sub17_Sub3 extends Class117_Sub22_Sub17 {

	static final int anInt2710 = 12;
	static final int anInt2711 = 8;
	static final int anInt2717 = 4;
	static final int anInt2718 = 15;
	static final int anInt2721 = 4095;
	public int[] anIntArray2713;
	public int anInt2715;
	public int anInt2712;
	public int anInt2720;
	public int anInt2716;
	int anInt2719;
	int anInt2714;

	public void method3242(int var1, int var2) {
		var1 += anInt2714;
		var2 += anInt2719;
		int var4 = var1 + var2 * anInt2462;
		int var5 = 0;
		int var8 = anInt2716;
		int var3 = anInt2712;
		int var7 = anInt2462 - var3;
		int var9 = 0;
		int var6;
		if (var2 < anInt2465) {
			var6 = anInt2465 - var2;
			var8 -= var6;
			var2 = anInt2465;
			var5 += var6 * var3;
			var4 += var6 * anInt2462;
		}

		if (var2 + var8 > anInt2463) {
			var8 -= var2 + var8 - anInt2463;
		}

		if (var1 < anInt2464) {
			var6 = anInt2464 - var1;
			var3 -= var6;
			var1 = anInt2464;
			var5 += var6;
			var4 += var6;
			var9 += var6;
			var7 += var6;
		}

		if (var1 + var3 > anInt2460) {
			var6 = var1 + var3 - anInt2460;
			var3 -= var6;
			var9 += var6;
			var7 += var6;
		}

		if (var3 > 0 && var8 > 0) {
			method3254(anIntArray2459, anIntArray2713, var5, var4, var3, var8, var7, var9);
		}
	}

	public Class117_Sub22_Sub17_Sub3(int var1, int var2) {
		anIntArray2713 = new int[var1 * var2];
		anInt2712 = anInt2715 = var1;
		anInt2716 = anInt2720 = var2;
		anInt2719 = 0;
		anInt2714 = 0;
	}

	public Class117_Sub22_Sub17_Sub3(byte[] var1, Component var2) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(var1);
			MediaTracker var4 = new MediaTracker(var2);
			var4.addImage(var3, 0);
			var4.waitForAll();
			anInt2712 = var3.getWidth(var2);
			anInt2716 = var3.getHeight(var2);
			anInt2715 = anInt2712;
			anInt2720 = anInt2716;
			anInt2714 = 0;
			anInt2719 = 0;
			anIntArray2713 = new int[anInt2712 * anInt2716];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, anInt2712, anInt2716, anIntArray2713, 0, anInt2712);
			var5.grabPixels();
		} catch (InterruptedException var6) {
			;
		}

	}

	public Class117_Sub22_Sub17_Sub3 method3243() {
		Class117_Sub22_Sub17_Sub3 var1 = new Class117_Sub22_Sub17_Sub3(anInt2712, anInt2716);
		var1.anInt2715 = anInt2715;
		var1.anInt2720 = anInt2720;
		var1.anInt2714 = anInt2715 - anInt2712 - anInt2714;
		var1.anInt2719 = anInt2719;

		for (int var2 = 0; var2 < anInt2716; var2++) {
			for (int var3 = 0; var3 < anInt2712; var3++) {
				var1.anIntArray2713[var2 * anInt2712 + var3] = anIntArray2713[var2 * anInt2712 + anInt2712 - 1 - var3];
			}
		}

		return var1;
	}

	public Class117_Sub22_Sub17_Sub3 method3244() {
		Class117_Sub22_Sub17_Sub3 var1 = new Class117_Sub22_Sub17_Sub3(anInt2715, anInt2720);

		for (int var2 = 0; var2 < anInt2716; var2++) {
			for (int var3 = 0; var3 < anInt2712; var3++) {
				var1.anIntArray2713[(var2 + anInt2719) * anInt2715 + var3 + anInt2714] = anIntArray2713[var2 * anInt2712 + var3];
			}
		}

		return var1;
	}

	public void method3245() {
		method2862(anIntArray2713, anInt2712, anInt2716);
	}

	public void method3246(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < anIntArray2713.length; var4++) {
			int var5 = anIntArray2713[var4];
			if (var5 != 0) {
				int var6 = var5 >> 16 & 255;
				var6 += var1;
				if (var6 < 1) {
					var6 = 1;
				} else if (var6 > 255) {
					var6 = 255;
				}

				int var8 = var5 >> 8 & 255;
				var8 += var2;
				if (var8 < 1) {
					var8 = 1;
				} else if (var8 > 255) {
					var8 = 255;
				}

				int var7 = var5 & 255;
				var7 += var3;
				if (var7 < 1) {
					var7 = 1;
				} else if (var7 > 255) {
					var7 = 255;
				}

				anIntArray2713[var4] = (var6 << 16) + (var8 << 8) + var7;
			}
		}

	}

	public void method3247() {
		if (anInt2712 != anInt2715 || anInt2716 != anInt2720) {
			int[] var2 = new int[anInt2715 * anInt2720];

			for (int var1 = 0; var1 < anInt2716; var1++) {
				for (int var3 = 0; var3 < anInt2712; var3++) {
					var2[(var1 + anInt2719) * anInt2715 + var3 + anInt2714] = anIntArray2713[var1 * anInt2712 + var3];
				}
			}

			anIntArray2713 = var2;
			anInt2712 = anInt2715;
			anInt2716 = anInt2720;
			anInt2714 = 0;
			anInt2719 = 0;
		}
	}

	public void method3248(int var1) {
		if (anInt2712 != anInt2715 || anInt2716 != anInt2720) {
			int var3 = var1;
			if (var1 > anInt2714) {
				var3 = anInt2714;
			}

			int var2 = var1;
			if (var1 + anInt2714 + anInt2712 > anInt2715) {
				var2 = anInt2715 - anInt2714 - anInt2712;
			}

			int var4 = var1;
			if (var1 > anInt2719) {
				var4 = anInt2719;
			}

			int var6 = var1;
			if (var1 + anInt2719 + anInt2716 > anInt2720) {
				var6 = anInt2720 - anInt2719 - anInt2716;
			}

			int var7 = anInt2712 + var3 + var2;
			int var8 = anInt2716 + var4 + var6;
			int[] var9 = new int[var7 * var8];

			for (int var10 = 0; var10 < anInt2716; var10++) {
				for (int var5 = 0; var5 < anInt2712; var5++) {
					var9[(var10 + var4) * var7 + var5 + var3] = anIntArray2713[var10 * anInt2712 + var5];
				}
			}

			anIntArray2713 = var9;
			anInt2712 = var7;
			anInt2716 = var8;
			anInt2714 -= var3;
			anInt2719 -= var4;
		}
	}

	public void method3249() {
		int[] var1 = new int[anInt2712 * anInt2716];
		int var4 = 0;

		for (int var2 = 0; var2 < anInt2716; var2++) {
			for (int var3 = anInt2712 - 1; var3 >= 0; --var3) {
				var1[var4++] = anIntArray2713[var3 + var2 * anInt2712];
			}
		}

		anIntArray2713 = var1;
		anInt2714 = anInt2715 - anInt2712 - anInt2714;
	}

	public void method3250(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
		int var9 = var2 < 0 ? -var2 : 0;
		int var17 = var2 + anInt2716 <= var6 ? anInt2716 : var6 - var2;
		int var10 = var1 < 0 ? -var1 : 0;
		int var10000;
		if (var1 + anInt2712 <= var5) {
			var10000 = anInt2712;
		} else {
			var10000 = var5 - var1;
		}

		int var11 = var3 + var1 + var10 + (var4 + var2 + var9) * anInt2462;
		int var13 = var2 + var9;

		for (int var16 = var9; var16 < var17; var16++) {
			int var18 = var7[var13];
			int var15 = var8[var13++];
			int var12 = var11;
			int var19;
			if (var1 < var18) {
				var19 = var18 - var1;
				var12 = var11 + (var19 - var10);
			} else {
				var19 = var10;
			}

			int var14;
			if (var1 + anInt2712 > var18 + var15) {
				var14 = var18 + var15 - var1;
			} else {
				var14 = anInt2712;
			}

			for (int var20 = var19; var20 < var14; var20++) {
				int var21 = anIntArray2713[var20 + var16 * anInt2712];
				if (var21 != 0) {
					anIntArray2459[var12++] = var21;
				} else {
					++var12;
				}
			}

			var11 += anInt2462;
		}

	}

	public void method3252(int var1) {
		for (int var2 = anInt2716 - 1; var2 > 0; --var2) {
			int var4 = var2 * anInt2712;

			for (int var3 = anInt2712 - 1; var3 > 0; --var3) {
				if (anIntArray2713[var3 + var4] == 0 && anIntArray2713[var3 + var4 - 1 - anInt2712] != 0) {
					anIntArray2713[var3 + var4] = var1;
				}
			}
		}

	}

	static void method3254(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = -var5; var8 < 0; var8++) {
			int var9;
			for (var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
				var0[var3++] = var1[var2++];
				var0[var3++] = var1[var2++];
				var0[var3++] = var1[var2++];
			}

			for (var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) {
				;
			}

			var3 += var6;
			var2 += var7;
		}

	}

	static void method3256(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; var10++) {
			int var11;
			for (var11 = var9; var11 < 0; var11++) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			for (var11 = var5; var11 < 0; var11++) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public void method3257(int var1, int var2, int var3, int var4) {
		if (var3 > 0 && var4 > 0) {
			int var5 = anInt2712;
			int var6 = anInt2716;
			int var15 = 0;
			int var7 = 0;
			int var10 = anInt2715;
			int var11 = anInt2720;
			int var14 = (var10 << 16) / var3;
			int var8 = (var11 << 16) / var4;
			int var9;
			if (anInt2714 > 0) {
				var9 = ((anInt2714 << 16) + var14 - 1) / var14;
				var1 += var9;
				var15 += var9 * var14 - (anInt2714 << 16);
			}

			if (anInt2719 > 0) {
				var9 = ((anInt2719 << 16) + var8 - 1) / var8;
				var2 += var9;
				var7 += var9 * var8 - (anInt2719 << 16);
			}

			if (var5 < var10) {
				var3 = ((var5 << 16) - var15 + var14 - 1) / var14;
			}

			if (var6 < var11) {
				var4 = ((var6 << 16) - var7 + var8 - 1) / var8;
			}

			var9 = var1 + var2 * anInt2462;
			int var12 = anInt2462 - var3;
			if (var2 + var4 > anInt2463) {
				var4 -= var2 + var4 - anInt2463;
			}

			int var13;
			if (var2 < anInt2465) {
				var13 = anInt2465 - var2;
				var4 -= var13;
				var9 += var13 * anInt2462;
				var7 += var8 * var13;
			}

			if (var1 + var3 > anInt2460) {
				var13 = var1 + var3 - anInt2460;
				var3 -= var13;
				var12 += var13;
			}

			if (var1 < anInt2464) {
				var13 = anInt2464 - var1;
				var3 -= var13;
				var9 += var13;
				var15 += var14 * var13;
				var12 += var13;
			}

			method3258(anIntArray2459, anIntArray2713, 0, var15, var7, var9, var12, var3, var4, var14, var8, var5);
		}
	}

	static void method3258(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		int var12 = var3;

		for (int var14 = -var8; var14 < 0; var14++) {
			int var15 = (var4 >> 16) * var11;

			for (int var13 = -var7; var13 < 0; var13++) {
				var2 = var1[(var3 >> 16) + var15];
				if (var2 != 0) {
					var0[var5++] = var2;
				} else {
					++var5;
				}

				var3 += var9;
			}

			var4 += var10;
			var3 = var12;
			var5 += var6;
		}

	}

	public void method3259(int var1, int var2, int var3, int var4) {
		if (var3 == 256) {
			method3290(var1, var2);
		} else {
			var1 += anInt2714;
			var2 += anInt2719;
			int var11 = var1 + var2 * anInt2462;
			int var6 = 0;
			int var10 = anInt2716;
			int var5 = anInt2712;
			int var7 = anInt2462 - var5;
			int var8 = 0;
			int var9;
			if (var2 < anInt2465) {
				var9 = anInt2465 - var2;
				var10 -= var9;
				var2 = anInt2465;
				var6 += var9 * var5;
				var11 += var9 * anInt2462;
			}

			if (var2 + var10 > anInt2463) {
				var10 -= var2 + var10 - anInt2463;
			}

			if (var1 < anInt2464) {
				var9 = anInt2464 - var1;
				var5 -= var9;
				var1 = anInt2464;
				var6 += var9;
				var11 += var9;
				var8 += var9;
				var7 += var9;
			}

			if (var1 + var5 > anInt2460) {
				var9 = var1 + var5 - anInt2460;
				var5 -= var9;
				var8 += var9;
				var7 += var9;
			}

			if (var5 > 0 && var10 > 0) {
				method3260(anIntArray2459, anIntArray2713, 0, var6, var11, var5, var10, var7, var8, var3, var4);
			}
		}
	}

	static void method3260(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		int var11 = 256 - var9;
		int var12 = (var10 & 16711935) * var11 & -16711936;
		int var13 = (var10 & 65280) * var11 & 16711680;
		var10 = (var12 | var13) >>> 8;

		for (int var15 = -var6; var15 < 0; var15++) {
			for (int var14 = -var5; var14 < 0; var14++) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var12 = (var2 & 16711935) * var9 & -16711936;
					var13 = (var2 & 65280) * var9 & 16711680;
					var0[var4++] = ((var12 | var13) >>> 8) + var10;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	static void method3262(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		int var10 = 256 - var9;

		for (int var11 = -var6; var11 < 0; var11++) {
			for (int var12 = -var5; var12 < 0; var12++) {
				var2 = var1[var3++];
				if (var2 == 0) {
					++var4;
				} else {
					int var13 = var0[var4];
					var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936) + ((var2 & 65280) * var9 + (var13 & 65280) * var10 & 16711680) >> 8;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public void method3263(int var1, int var2, int var3, int var4, int var5) {
		if (var3 > 0 && var4 > 0) {
			int var9 = anInt2712;
			int var10 = anInt2716;
			int var8 = 0;
			int var11 = 0;
			int var15 = anInt2715;
			int var14 = anInt2720;
			int var6 = (var15 << 16) / var3;
			int var12 = (var14 << 16) / var4;
			int var7;
			if (anInt2714 > 0) {
				var7 = ((anInt2714 << 16) + var6 - 1) / var6;
				var1 += var7;
				var8 += var7 * var6 - (anInt2714 << 16);
			}

			if (anInt2719 > 0) {
				var7 = ((anInt2719 << 16) + var12 - 1) / var12;
				var2 += var7;
				var11 += var7 * var12 - (anInt2719 << 16);
			}

			if (var9 < var15) {
				var3 = ((var9 << 16) - var8 + var6 - 1) / var6;
			}

			if (var10 < var14) {
				var4 = ((var10 << 16) - var11 + var12 - 1) / var12;
			}

			var7 = var1 + var2 * anInt2462;
			int var16 = anInt2462 - var3;
			if (var2 + var4 > anInt2463) {
				var4 -= var2 + var4 - anInt2463;
			}

			int var13;
			if (var2 < anInt2465) {
				var13 = anInt2465 - var2;
				var4 -= var13;
				var7 += var13 * anInt2462;
				var11 += var12 * var13;
			}

			if (var1 + var3 > anInt2460) {
				var13 = var1 + var3 - anInt2460;
				var3 -= var13;
				var16 += var13;
			}

			if (var1 < anInt2464) {
				var13 = anInt2464 - var1;
				var3 -= var13;
				var7 += var13;
				var8 += var6 * var13;
				var16 += var13;
			}

			method3264(anIntArray2459, anIntArray2713, 0, var8, var11, var7, var16, var3, var4, var6, var12, var9, var5);
		}
	}

	static void method3264(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		int var13 = 256 - var12;
		int var18 = var3;

		for (int var14 = -var8; var14 < 0; var14++) {
			int var16 = (var4 >> 16) * var11;

			for (int var15 = -var7; var15 < 0; var15++) {
				var2 = var1[(var3 >> 16) + var16];
				if (var2 != 0) {
					int var17 = var0[var5];
					var0[var5++] = ((var2 & 16711935) * var12 + (var17 & 16711935) * var13 & -16711936) + ((var2 & 65280) * var12 + (var17 & 65280) * var13 & 16711680) >> 8;
				} else {
					++var5;
				}

				var3 += var9;
			}

			var4 += var10;
			var3 = var18;
			var5 += var6;
		}

	}

	public void method3267(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
		try {
			int var10 = -var3 / 2;
			int var11 = -var4 / 2;
			int var12 = (int) (Math.sin(var7) * 65536.0D);
			int var13 = (int) (Math.cos(var7) * 65536.0D);
			var12 = var12 * var9 >> 8;
			var13 = var13 * var9 >> 8;
			int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
			int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
			int var16 = var1 + var2 * anInt2462;

			for (var2 = 0; var2 < var4; var2++) {
				int var17 = var16;
				int var18 = var14;
				int var19 = var15;

				for (var1 = -var3; var1 < 0; var1++) {
					int var20 = anIntArray2713[(var18 >> 16) + (var19 >> 16) * anInt2712];
					if (var20 != 0) {
						anIntArray2459[var17++] = var20;
					} else {
						++var17;
					}

					var18 += var13;
					var19 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += anInt2462;
			}
		} catch (Exception var21) {
			;
		}

	}

	public void method3268(int var1, int var2, int var3, int var4) {
		method3269(anInt2715 << 3, anInt2720 << 3, var1 << 4, var2 << 4, var3, var4);
	}

	void method3269(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var6 != 0) {
			var1 -= anInt2714 << 4;
			var2 -= anInt2719 << 4;
			double var12 = (double) (var5 & 65535) * 9.587379924285257E-5D;
			int var15 = (int) Math.floor(Math.sin(var12) * (double) var6 + 0.5D);
			int var14 = (int) Math.floor(Math.cos(var12) * (double) var6 + 0.5D);
			int var16 = -var1 * var14 + -var2 * var15;
			int var30 = -(-var1) * var15 + -var2 * var14;
			int var27 = ((anInt2712 << 4) - var1) * var14 + -var2 * var15;
			int var21 = -((anInt2712 << 4) - var1) * var15 + -var2 * var14;
			int var22 = -var1 * var14 + ((anInt2716 << 4) - var2) * var15;
			int var23 = -(-var1) * var15 + ((anInt2716 << 4) - var2) * var14;
			int var24 = ((anInt2712 << 4) - var1) * var14 + ((anInt2716 << 4) - var2) * var15;
			int var25 = -((anInt2712 << 4) - var1) * var15 + ((anInt2716 << 4) - var2) * var14;
			int var9;
			int var28;
			if (var16 < var27) {
				var9 = var16;
				var28 = var27;
			} else {
				var9 = var27;
				var28 = var16;
			}

			if (var22 < var9) {
				var9 = var22;
			}

			if (var24 < var9) {
				var9 = var24;
			}

			if (var22 > var28) {
				var28 = var22;
			}

			if (var24 > var28) {
				var28 = var24;
			}

			int var29;
			int var31;
			if (var30 < var21) {
				var31 = var30;
				var29 = var21;
			} else {
				var31 = var21;
				var29 = var30;
			}

			if (var23 < var31) {
				var31 = var23;
			}

			if (var25 < var31) {
				var31 = var25;
			}

			if (var23 > var29) {
				var29 = var23;
			}

			if (var25 > var29) {
				var29 = var25;
			}

			var9 >>= 12;
			var28 = var28 + 4095 >> 12;
			var31 >>= 12;
			var29 = var29 + 4095 >> 12;
			var9 += var3;
			var28 += var3;
			var31 += var4;
			var29 += var4;
			var9 >>= 4;
			var28 = var28 + 15 >> 4;
			var31 >>= 4;
			var29 = var29 + 15 >> 4;
			if (var9 < anInt2464) {
				var9 = anInt2464;
			}

			if (var28 > anInt2460) {
				var28 = anInt2460;
			}

			if (var31 < anInt2465) {
				var31 = anInt2465;
			}

			if (var29 > anInt2463) {
				var29 = anInt2463;
			}

			var28 = var9 - var28;
			if (var28 < 0) {
				var29 = var31 - var29;
				if (var29 < 0) {
					int var7 = var31 * anInt2462 + var9;
					double var35 = 1.6777216E7D / (double) var6;
					int var18 = (int) Math.floor(Math.sin(var12) * var35 + 0.5D);
					int var26 = (int) Math.floor(Math.cos(var12) * var35 + 0.5D);
					int var10 = (var9 << 4) + 8 - var3;
					int var37 = (var31 << 4) + 8 - var4;
					int var32 = (var1 << 8) - (var37 * var18 >> 4);
					int var38 = (var2 << 8) + (var37 * var26 >> 4);
					int var8;
					int var11;
					int var17;
					int var19;
					int var20;
					int var33;
					int var34;
					if (var26 == 0) {
						if (var18 == 0) {
							for (var34 = var29; var34 < 0; var7 += anInt2462) {
								var8 = var7;
								var33 = var32;
								var17 = var38;
								var20 = var28;
								if (var32 >= 0 && var38 >= 0 && var32 - (anInt2712 << 12) < 0 && var38 - (anInt2716 << 12) < 0) {
									for (; var20 < 0; var20++) {
										var11 = anIntArray2713[(var17 >> 12) * anInt2712 + (var33 >> 12)];
										if (var11 != 0) {
											anIntArray2459[var8++] = var11;
										} else {
											++var8;
										}
									}
								}

								++var34;
							}
						} else if (var18 < 0) {
							for (var34 = var29; var34 < 0; var7 += anInt2462) {
								var8 = var7;
								var33 = var32;
								var17 = var38 + (var10 * var18 >> 4);
								var20 = var28;
								if (var32 >= 0 && var32 - (anInt2712 << 12) < 0) {
									if ((var19 = var17 - (anInt2716 << 12)) >= 0) {
										var19 = (var18 - var19) / var18;
										var20 = var28 + var19;
										var17 += var18 * var19;
										var8 = var7 + var19;
									}

									if ((var19 = (var17 - var18) / var18) > var20) {
										var20 = var19;
									}

									while (var20 < 0) {
										var11 = anIntArray2713[(var17 >> 12) * anInt2712 + (var33 >> 12)];
										if (var11 != 0) {
											anIntArray2459[var8++] = var11;
										} else {
											++var8;
										}

										var17 += var18;
										++var20;
									}
								}

								++var34;
								var32 -= var18;
							}
						} else {
							for (var34 = var29; var34 < 0; var7 += anInt2462) {
								var8 = var7;
								var33 = var32;
								var17 = var38 + (var10 * var18 >> 4);
								var20 = var28;
								if (var32 >= 0 && var32 - (anInt2712 << 12) < 0) {
									if (var17 < 0) {
										var19 = (var18 - 1 - var17) / var18;
										var20 = var28 + var19;
										var17 += var18 * var19;
										var8 = var7 + var19;
									}

									if ((var19 = (1 + var17 - (anInt2716 << 12) - var18) / var18) > var20) {
										var20 = var19;
									}

									while (var20 < 0) {
										var11 = anIntArray2713[(var17 >> 12) * anInt2712 + (var33 >> 12)];
										if (var11 != 0) {
											anIntArray2459[var8++] = var11;
										} else {
											++var8;
										}

										var17 += var18;
										++var20;
									}
								}

								++var34;
								var32 -= var18;
							}
						}
					} else if (var26 < 0) {
						if (var18 == 0) {
							for (var34 = var29; var34 < 0; var7 += anInt2462) {
								var8 = var7;
								var33 = var32 + (var10 * var26 >> 4);
								var17 = var38;
								var20 = var28;
								if (var38 >= 0 && var38 - (anInt2716 << 12) < 0) {
									if ((var19 = var33 - (anInt2712 << 12)) >= 0) {
										var19 = (var26 - var19) / var26;
										var20 = var28 + var19;
										var33 += var26 * var19;
										var8 = var7 + var19;
									}

									if ((var19 = (var33 - var26) / var26) > var20) {
										var20 = var19;
									}

									while (var20 < 0) {
										var11 = anIntArray2713[(var17 >> 12) * anInt2712 + (var33 >> 12)];
										if (var11 != 0) {
											anIntArray2459[var8++] = var11;
										} else {
											++var8;
										}

										var33 += var26;
										++var20;
									}
								}

								++var34;
								var38 += var26;
							}
						} else if (var18 < 0) {
							for (var34 = var29; var34 < 0; var7 += anInt2462) {
								var8 = var7;
								var33 = var32 + (var10 * var26 >> 4);
								var17 = var38 + (var10 * var18 >> 4);
								var20 = var28;
								if ((var19 = var33 - (anInt2712 << 12)) >= 0) {
									var19 = (var26 - var19) / var26;
									var20 = var28 + var19;
									var33 += var26 * var19;
									var17 += var18 * var19;
									var8 = var7 + var19;
								}

								if ((var19 = (var33 - var26) / var26) > var20) {
									var20 = var19;
								}

								if ((var19 = var17 - (anInt2716 << 12)) >= 0) {
									var19 = (var18 - var19) / var18;
									var20 += var19;
									var33 += var26 * var19;
									var17 += var18 * var19;
									var8 += var19;
								}

								if ((var19 = (var17 - var18) / var18) > var20) {
									var20 = var19;
								}

								while (var20 < 0) {
									var11 = anIntArray2713[(var17 >> 12) * anInt2712 + (var33 >> 12)];
									if (var11 != 0) {
										anIntArray2459[var8++] = var11;
									} else {
										++var8;
									}

									var33 += var26;
									var17 += var18;
									++var20;
								}

								++var34;
								var32 -= var18;
								var38 += var26;
							}
						} else {
							for (var34 = var29; var34 < 0; var7 += anInt2462) {
								var8 = var7;
								var33 = var32 + (var10 * var26 >> 4);
								var17 = var38 + (var10 * var18 >> 4);
								var20 = var28;
								if ((var19 = var33 - (anInt2712 << 12)) >= 0) {
									var19 = (var26 - var19) / var26;
									var20 = var28 + var19;
									var33 += var26 * var19;
									var17 += var18 * var19;
									var8 = var7 + var19;
								}

								if ((var19 = (var33 - var26) / var26) > var20) {
									var20 = var19;
								}

								if (var17 < 0) {
									var19 = (var18 - 1 - var17) / var18;
									var20 += var19;
									var33 += var26 * var19;
									var17 += var18 * var19;
									var8 += var19;
								}

								if ((var19 = (1 + var17 - (anInt2716 << 12) - var18) / var18) > var20) {
									var20 = var19;
								}

								while (var20 < 0) {
									var11 = anIntArray2713[(var17 >> 12) * anInt2712 + (var33 >> 12)];
									if (var11 != 0) {
										anIntArray2459[var8++] = var11;
									} else {
										++var8;
									}

									var33 += var26;
									var17 += var18;
									++var20;
								}

								++var34;
								var32 -= var18;
								var38 += var26;
							}
						}
					} else if (var18 == 0) {
						for (var34 = var29; var34 < 0; var7 += anInt2462) {
							var8 = var7;
							var33 = var32 + (var10 * var26 >> 4);
							var17 = var38;
							var20 = var28;
							if (var38 >= 0 && var38 - (anInt2716 << 12) < 0) {
								if (var33 < 0) {
									var19 = (var26 - 1 - var33) / var26;
									var20 = var28 + var19;
									var33 += var26 * var19;
									var8 = var7 + var19;
								}

								if ((var19 = (1 + var33 - (anInt2712 << 12) - var26) / var26) > var20) {
									var20 = var19;
								}

								while (var20 < 0) {
									var11 = anIntArray2713[(var17 >> 12) * anInt2712 + (var33 >> 12)];
									if (var11 != 0) {
										anIntArray2459[var8++] = var11;
									} else {
										++var8;
									}

									var33 += var26;
									++var20;
								}
							}

							++var34;
							var38 += var26;
						}
					} else if (var18 < 0) {
						for (var34 = var29; var34 < 0; var7 += anInt2462) {
							var8 = var7;
							var33 = var32 + (var10 * var26 >> 4);
							var17 = var38 + (var10 * var18 >> 4);
							var20 = var28;
							if (var33 < 0) {
								var19 = (var26 - 1 - var33) / var26;
								var20 = var28 + var19;
								var33 += var26 * var19;
								var17 += var18 * var19;
								var8 = var7 + var19;
							}

							if ((var19 = (1 + var33 - (anInt2712 << 12) - var26) / var26) > var20) {
								var20 = var19;
							}

							if ((var19 = var17 - (anInt2716 << 12)) >= 0) {
								var19 = (var18 - var19) / var18;
								var20 += var19;
								var33 += var26 * var19;
								var17 += var18 * var19;
								var8 += var19;
							}

							if ((var19 = (var17 - var18) / var18) > var20) {
								var20 = var19;
							}

							while (var20 < 0) {
								var11 = anIntArray2713[(var17 >> 12) * anInt2712 + (var33 >> 12)];
								if (var11 != 0) {
									anIntArray2459[var8++] = var11;
								} else {
									++var8;
								}

								var33 += var26;
								var17 += var18;
								++var20;
							}

							++var34;
							var32 -= var18;
							var38 += var26;
						}
					} else {
						for (var34 = var29; var34 < 0; var7 += anInt2462) {
							var8 = var7;
							var33 = var32 + (var10 * var26 >> 4);
							var17 = var38 + (var10 * var18 >> 4);
							var20 = var28;
							if (var33 < 0) {
								var19 = (var26 - 1 - var33) / var26;
								var20 = var28 + var19;
								var33 += var26 * var19;
								var17 += var18 * var19;
								var8 = var7 + var19;
							}

							if ((var19 = (1 + var33 - (anInt2712 << 12) - var26) / var26) > var20) {
								var20 = var19;
							}

							if (var17 < 0) {
								var19 = (var18 - 1 - var17) / var18;
								var20 += var19;
								var33 += var26 * var19;
								var17 += var18 * var19;
								var8 += var19;
							}

							if ((var19 = (1 + var17 - (anInt2716 << 12) - var18) / var18) > var20) {
								var20 = var19;
							}

							while (var20 < 0) {
								var11 = anIntArray2713[(var17 >> 12) * anInt2712 + (var33 >> 12)];
								if (var11 != 0) {
									anIntArray2459[var8++] = var11;
								} else {
									++var8;
								}

								var33 += var26;
								var17 += var18;
								++var20;
							}

							++var34;
							var32 -= var18;
							var38 += var26;
						}
					}

				}
			}
		}
	}

	public void method3270(int var1, int var2, int var3) {
		var1 += anInt2714;
		var2 += anInt2719;
		int var5 = var1 + var2 * anInt2462;
		int var9 = 0;
		int var8 = anInt2716;
		int var4 = anInt2712;
		int var10 = anInt2462 - var4;
		int var6 = 0;
		int var7;
		if (var2 < anInt2465) {
			var7 = anInt2465 - var2;
			var8 -= var7;
			var2 = anInt2465;
			var9 += var7 * var4;
			var5 += var7 * anInt2462;
		}

		if (var2 + var8 > anInt2463) {
			var8 -= var2 + var8 - anInt2463;
		}

		if (var1 < anInt2464) {
			var7 = anInt2464 - var1;
			var4 -= var7;
			var1 = anInt2464;
			var9 += var7;
			var5 += var7;
			var6 += var7;
			var10 += var7;
		}

		if (var1 + var4 > anInt2460) {
			var7 = var1 + var4 - anInt2460;
			var4 -= var7;
			var6 += var7;
			var10 += var7;
		}

		if (var4 > 0 && var8 > 0) {
			method3262(anIntArray2459, anIntArray2713, 0, var9, var5, var4, var8, var10, var6, var3);
		}
	}

	public void method3278(int var1) {
		int[] var2 = new int[anInt2712 * anInt2716];
		int var4 = 0;

		for (int var5 = 0; var5 < anInt2716; var5++) {
			for (int var3 = 0; var3 < anInt2712; var3++) {
				int var6 = anIntArray2713[var4];
				if (var6 == 0) {
					if (var3 > 0 && anIntArray2713[var4 - 1] != 0) {
						var6 = var1;
					} else if (var5 > 0 && anIntArray2713[var4 - anInt2712] != 0) {
						var6 = var1;
					} else if (var3 < anInt2712 - 1 && anIntArray2713[var4 + 1] != 0) {
						var6 = var1;
					} else if (var5 < anInt2716 - 1 && anIntArray2713[var4 + anInt2712] != 0) {
						var6 = var1;
					}
				}

				var2[var4++] = var6;
			}
		}

		anIntArray2713 = var2;
	}

	public void method3290(int var1, int var2) {
		var1 += anInt2714;
		var2 += anInt2719;
		int var4 = var1 + var2 * anInt2462;
		int var5 = 0;
		int var8 = anInt2716;
		int var6 = anInt2712;
		int var7 = anInt2462 - var6;
		int var9 = 0;
		int var3;
		if (var2 < anInt2465) {
			var3 = anInt2465 - var2;
			var8 -= var3;
			var2 = anInt2465;
			var5 += var3 * var6;
			var4 += var3 * anInt2462;
		}

		if (var2 + var8 > anInt2463) {
			var8 -= var2 + var8 - anInt2463;
		}

		if (var1 < anInt2464) {
			var3 = anInt2464 - var1;
			var6 -= var3;
			var1 = anInt2464;
			var5 += var3;
			var4 += var3;
			var9 += var3;
			var7 += var3;
		}

		if (var1 + var6 > anInt2460) {
			var3 = var1 + var6 - anInt2460;
			var6 -= var3;
			var9 += var3;
			var7 += var3;
		}

		if (var6 > 0 && var8 > 0) {
			method3256(anIntArray2459, anIntArray2713, 0, var5, var4, var6, var8, var7, var9);
		}
	}

	public void method3315() {
		int[] var1 = new int[anInt2712 * anInt2716];
		int var4 = 0;

		for (int var3 = anInt2716 - 1; var3 >= 0; --var3) {
			for (int var2 = 0; var2 < anInt2712; var2++) {
				var1[var4++] = anIntArray2713[var2 + var3 * anInt2712];
			}
		}

		anIntArray2713 = var1;
		anInt2719 = anInt2720 - anInt2716 - anInt2719;
	}

	Class117_Sub22_Sub17_Sub3() {
	}

	public void method3342(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
		try {
			int var11 = -var3 / 2;
			int var12 = -var4 / 2;
			int var13 = (int) (Math.sin((double) var7 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos((double) var7 / 326.11D) * 65536.0D);
			var13 = var13 * var8 >> 8;
			var14 = var14 * var8 >> 8;
			int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
			int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
			int var17 = var1 + var2 * anInt2462;

			for (var2 = 0; var2 < var4; var2++) {
				int var18 = var9[var2];
				int var19 = var17 + var18;
				int var20 = var15 + var14 * var18;
				int var21 = var16 - var13 * var18;

				for (var1 = -var10[var2]; var1 < 0; var1++) {
					anIntArray2459[var19++] = anIntArray2713[(var20 >> 16) + (var21 >> 16) * anInt2712];
					var20 += var14;
					var21 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += anInt2462;
			}
		} catch (Exception var22) {
			;
		}

	}

}
