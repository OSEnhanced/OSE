package core.Jagex;
public class Class61 {

	public static final int anInt762 = 155;
	static Class78 aClass78_764;
	static final int anInt765 = 19;
	public static final int anInt766 = 174;
	static final int anInt767 = 2;
	int[] anIntArray768;
	byte[] aByteArray761;
	int[] anIntArray763;

	public int method916(byte[] var1, int var2, int var3, byte[] var4, int var5, int var6) {
		int var7 = 0;
		int var13 = var5 << 3;

		for (var3 += var2; var2 < var3; var2++) {
			int var10 = var1[var2] & 255;
			int var14 = anIntArray768[var10];
			byte var12 = aByteArray761[var10];
			if (var12 == 0) {
				throw new RuntimeException("");
			}

			int var8 = var13 >> 3;
			int var11 = var13 & 7;
			var7 &= -var11 >> 31;
			int var9 = var8 + (var12 + var11 - 1 >> 3);
			var11 += 24;
			var4[var8] = (byte) (var7 |= var14 >>> var11);
			if (var8 < var9) {
				++var8;
				var11 -= 8;
				var4[var8] = (byte) (var7 = var14 >>> var11);
				if (var8 < var9) {
					++var8;
					var11 -= 8;
					var4[var8] = (byte) (var7 = var14 >>> var11);
					if (var8 < var9) {
						++var8;
						var11 -= 8;
						var4[var8] = (byte) (var7 = var14 >>> var11);
						if (var8 < var9) {
							++var8;
							var11 -= 8;
							var4[var8] = (byte) (var7 = var14 << -var11);
						}
					}
				}
			}

			var13 += var12;
		}

		return (var13 + 7 >> 3) - var5;
	}

	public int method917(byte[] var1, int var2, byte[] var3, int var4, int var5, int var6) {
		if (var5 == 0) {
			return 0;
		} else {
			int var7 = 0;
			var5 += var4;
			int var9 = var2;

			while (true) {
				byte var10 = var1[var9];
				if (var10 < 0) {
					var7 = anIntArray763[var7];
				} else {
					++var7;
				}

				int var8;
				if ((var8 = anIntArray763[var7]) < 0) {
					var3[var4++] = (byte) (~var8);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var10 & 64) != 0) {
					var7 = anIntArray763[var7];
				} else {
					++var7;
				}

				if ((var8 = anIntArray763[var7]) < 0) {
					var3[var4++] = (byte) (~var8);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var10 & 32) != 0) {
					var7 = anIntArray763[var7];
				} else {
					++var7;
				}

				if ((var8 = anIntArray763[var7]) < 0) {
					var3[var4++] = (byte) (~var8);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var10 & 16) != 0) {
					var7 = anIntArray763[var7];
				} else {
					++var7;
				}

				if ((var8 = anIntArray763[var7]) < 0) {
					var3[var4++] = (byte) (~var8);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var10 & 8) != 0) {
					var7 = anIntArray763[var7];
				} else {
					++var7;
				}

				if ((var8 = anIntArray763[var7]) < 0) {
					var3[var4++] = (byte) (~var8);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var10 & 4) != 0) {
					var7 = anIntArray763[var7];
				} else {
					++var7;
				}

				if ((var8 = anIntArray763[var7]) < 0) {
					var3[var4++] = (byte) (~var8);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var10 & 2) != 0) {
					var7 = anIntArray763[var7];
				} else {
					++var7;
				}

				if ((var8 = anIntArray763[var7]) < 0) {
					var3[var4++] = (byte) (~var8);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var10 & 1) != 0) {
					var7 = anIntArray763[var7];
				} else {
					++var7;
				}

				if ((var8 = anIntArray763[var7]) < 0) {
					var3[var4++] = (byte) (~var8);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				++var9;
			}

			return 1 + var9 - var2;
		}
	}

	static void method921(Player var0, int var1, int var2, int var3) {
		if (var0.anInt2558 * -919017135 == var1 && var1 != -1) {
			int var4 = Class114_Sub1.method1838(var1, (byte) -73).anInt2416 * -1912420809;
			if (var4 == 1) {
				var0.anInt2572 = 0;
				var0.anInt2573 = 0;
				var0.anInt2543 = var2 * -1461756537;
				var0.anInt2575 = 0;
			}

			if (var4 == 2) {
				var0.anInt2575 = 0;
			}
		} else if (var1 == -1 || var0.anInt2558 * -919017135 == -1 || Class114_Sub1.method1838(var1, (byte) -42).anInt2400 * -385937947 >= Class114_Sub1.method1838(var0.anInt2558 * -919017135, (byte) -19).anInt2400 * -385937947) {
			var0.anInt2558 = var1 * 1804599217;
			var0.anInt2572 = 0;
			var0.anInt2573 = 0;
			var0.anInt2543 = var2 * -1461756537;
			var0.anInt2575 = 0;
			var0.anInt2598 = var0.anInt2593 * 713807047;
		}

	}

	static int method923(int var0, int var1, int var2) {
		int var3 = Class117_Sub22_Sub7.method2477(var0 + 45365, var1 + 91923, 4, (byte) 88) - 128 + (Class117_Sub22_Sub7.method2477(10294 + var0, 37821 + var1, 2, (byte) 12) - 128 >> 1) + (Class117_Sub22_Sub7.method2477(var0, var1, 1, (byte) 118) - 128 >> 2);
		var3 = 35 + (int) (0.3D * (double) var3);
		if (var3 < 10) {
			var3 = 10;
		} else if (var3 > 60) {
			var3 = 60;
		}

		return var3;
	}

	public Class61(byte[] var1) {
		int var3 = var1.length;
		anIntArray768 = new int[var3];
		aByteArray761 = var1;
		int[] var6 = new int[33];
		anIntArray763 = new int[8];
		int var7 = 0;

		for (int var8 = 0; var8 < var3; var8++) {
			byte var10 = var1[var8];
			if (var10 != 0) {
				int var11 = 1 << 32 - var10;
				int var4 = var6[var10];
				anIntArray768[var8] = var4;
				int var2;
				int var5;
				int var12;
				int var13;
				if ((var4 & var11) != 0) {
					var13 = var6[var10 - 1];
				} else {
					var13 = var4 | var11;

					for (var2 = var10 - 1; var2 >= 1; --var2) {
						var5 = var6[var2];
						if (var4 != var5) {
							break;
						}

						var12 = 1 << 32 - var2;
						if ((var5 & var12) != 0) {
							var6[var2] = var6[var2 - 1];
							break;
						}

						var6[var2] = var5 | var12;
					}
				}

				var6[var10] = var13;

				for (var2 = 1 + var10; var2 <= 32; var2++) {
					if (var6[var2] == var4) {
						var6[var2] = var13;
					}
				}

				var2 = 0;

				for (var5 = 0; var5 < var10; var5++) {
					var12 = Integer.MIN_VALUE >>> var5;
					if ((var4 & var12) == 0) {
						++var2;
					} else {
						if (anIntArray763[var2] == 0) {
							anIntArray763[var2] = var7;
						}

						var2 = anIntArray763[var2];
					}

					if (var2 >= anIntArray763.length) {
						int[] var9 = new int[anIntArray763.length * 2];

						for (int var14 = 0; var14 < anIntArray763.length; var14++) {
							var9[var14] = anIntArray763[var14];
						}

						anIntArray763 = var9;
					}

					var12 >>>= 1;
				}

				anIntArray763[var2] = ~var8;
				if (var2 >= var7) {
					var7 = 1 + var2;
				}
			}
		}

	}

}
