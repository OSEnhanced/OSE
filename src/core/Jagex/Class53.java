package core.Jagex;
public final class Class53 {

	static final int anInt721 = 4096;
	static final int anInt722 = 23;
	static final int anInt723 = 0;
	static final int anInt724 = 16;
	static final int anInt725 = 6;
	static final int anInt726 = 50;
	static final int anInt727 = 1;
	static Class68 aClass68_720 = new Class68();

	public static int method824(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		Class68 var5 = aClass68_720;
		synchronized (var5) {
			aClass68_720.aByteArray814 = var2;
			aClass68_720.anInt828 = var4 * 1137583003;
			aClass68_720.aByteArray817 = var0;
			aClass68_720.anInt818 = 0;
			aClass68_720.anInt823 = var1 * -672246681;
			aClass68_720.anInt809 = 0;
			aClass68_720.anInt824 = 0;
			aClass68_720.anInt816 = 0;
			aClass68_720.anInt820 = 0;
			method826(aClass68_720);
			var1 -= aClass68_720.anInt823 * 1563002711;
			aClass68_720.aByteArray814 = null;
			aClass68_720.aByteArray817 = null;
			return var1;
		}
	}

	static void method825(Class68 var0) {
		byte var1 = var0.aByte821;
		int var11 = var0.anInt822 * -708199269;
		int var3 = var0.anInt830 * -1309659979;
		int var2 = var0.anInt819 * -1157115539;
		int[] var10 = Class7.anIntArray98;
		int var4 = var0.anInt827 * 1684466715;
		byte[] var5 = var0.aByteArray817;
		int var6 = var0.anInt818 * 99347477;
		int var8 = var0.anInt823 * 1563002711;
		int var12 = var0.anInt845 * 2097368671 + 1;

		label112:
		while (true) {
			if (var11 > 0) {
				while (true) {
					if (var8 == 0) {
						break label112;
					}

					if (var11 == 1) {
						if (var8 == 0) {
							var11 = 1;
							break label112;
						}

						var5[var6] = var1;
						++var6;
						--var8;
						break;
					}

					var5[var6] = var1;
					--var11;
					++var6;
					--var8;
				}
			}

			boolean var13 = true;

			byte var7;
			while (var13) {
				var13 = false;
				if (var3 == var12) {
					var11 = 0;
					break label112;
				}

				var1 = (byte) var2;
				var4 = var10[var4];
				var7 = (byte) (var4 & 255);
				var4 >>= 8;
				++var3;
				if (var7 != var2) {
					var2 = var7;
					if (var8 == 0) {
						var11 = 1;
						break label112;
					}

					var5[var6] = var1;
					++var6;
					--var8;
					var13 = true;
				} else if (var3 == var12) {
					if (var8 == 0) {
						var11 = 1;
						break label112;
					}

					var5[var6] = var1;
					++var6;
					--var8;
					var13 = true;
				}
			}

			var11 = 2;
			var4 = var10[var4];
			var7 = (byte) (var4 & 255);
			var4 >>= 8;
			++var3;
			if (var3 != var12) {
				if (var7 != var2) {
					var2 = var7;
				} else {
					var11 = 3;
					var4 = var10[var4];
					var7 = (byte) (var4 & 255);
					var4 >>= 8;
					++var3;
					if (var3 != var12) {
						if (var7 != var2) {
							var2 = var7;
						} else {
							var4 = var10[var4];
							var7 = (byte) (var4 & 255);
							var4 >>= 8;
							++var3;
							var11 = (var7 & 255) + 4;
							var4 = var10[var4];
							var2 = (byte) (var4 & 255);
							var4 >>= 8;
							++var3;
						}
					}
				}
			}
		}

		int var14 = var0.anInt820 * 710054735;
		var0.anInt820 += (var8 - var8) * 2107548591;
		if (var0.anInt820 * 710054735 < var14) {
			;
		}

		var0.aByte821 = var1;
		var0.anInt822 = var11 * -35010157;
		var0.anInt830 = var3 * -499883619;
		var0.anInt819 = var2 * -109584283;
		Class7.anIntArray98 = var10;
		var0.anInt827 = var4 * -1014428141;
		var0.aByteArray817 = var5;
		var0.anInt818 = var6 * -1785560259;
		var0.anInt823 = var8 * -672246681;
	}

	static void method826(Class68 var0) {
		boolean var1 = false;
		boolean var9 = false;
		boolean var17 = false;
		boolean var3 = false;
		boolean var19 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var4 = false;
		boolean var21 = false;
		boolean var18 = false;
		boolean var24 = false;
		boolean var25 = false;
		boolean var27 = false;
		boolean var10 = false;
		boolean var11 = false;
		boolean var12 = false;
		boolean var23 = false;
		int var31 = 0;
		int[] var13 = null;
		int[] var14 = null;
		int[] var15 = null;
		var0.anInt825 = -1940753235;
		if (Class7.anIntArray98 == null) {
			Class7.anIntArray98 = new int[var0.anInt825 * -369371872];
		}

		boolean var16 = true;

		while (true) {
			while (var16) {
				byte var2 = method842(var0);
				if (var2 == 23) {
					return;
				}

				var2 = method842(var0);
				var2 = method842(var0);
				var2 = method842(var0);
				var2 = method842(var0);
				var2 = method842(var0);
				var2 = method842(var0);
				var2 = method842(var0);
				var2 = method842(var0);
				var2 = method842(var0);
				var2 = method827(var0);
				if (var2 != 0) {
					;
				}

				var0.anInt826 = 0;
				var2 = method842(var0);
				var0.anInt826 = (var0.anInt826 * -558712679 << 8 | var2 & 255) * -1838408791;
				var2 = method842(var0);
				var0.anInt826 = (var0.anInt826 * -558712679 << 8 | var2 & 255) * -1838408791;
				var2 = method842(var0);
				var0.anInt826 = (var0.anInt826 * -558712679 << 8 | var2 & 255) * -1838408791;

				int var35;
				for (var35 = 0; var35 < 16; var35++) {
					var2 = method827(var0);
					if (var2 == 1) {
						var0.aBoolArray834[var35] = true;
					} else {
						var0.aBoolArray834[var35] = false;
					}
				}

				for (var35 = 0; var35 < 256; var35++) {
					var0.aBoolArray812[var35] = false;
				}

				int var43;
				for (var35 = 0; var35 < 16; var35++) {
					if (var0.aBoolArray834[var35]) {
						for (var43 = 0; var43 < 16; var43++) {
							var2 = method827(var0);
							if (var2 == 1) {
								var0.aBoolArray812[var35 * 16 + var43] = true;
							}
						}
					}
				}

				method829(var0);
				int var36 = var0.anInt832 * -1723605043 + 2;
				int var49 = method828(3, var0);
				int var38 = method828(15, var0);

				for (var35 = 0; var35 < var38; var35++) {
					var43 = 0;

					while (true) {
						var2 = method827(var0);
						if (var2 == 0) {
							var0.aByteArray839[var35] = (byte) var43;
							break;
						}

						++var43;
					}
				}

				byte[] var28 = new byte[6];

				byte var22;
				for (var22 = 0; var22 < var49; var28[var22] = var22++) {
					;
				}

				for (var35 = 0; var35 < var38; var35++) {
					var22 = var0.aByteArray839[var35];

					byte var8;
					for (var8 = var28[var22]; var22 > 0; --var22) {
						var28[var22] = var28[var22 - 1];
					}

					var28[0] = var8;
					var0.aByteArray829[var35] = var8;
				}

				int var47;
				for (var47 = 0; var47 < var49; var47++) {
					int var55 = method828(5, var0);

					for (var35 = 0; var35 < var36; var35++) {
						while (true) {
							var2 = method827(var0);
							if (var2 == 0) {
								var0.aByteArrayArray840[var47][var35] = (byte) var55;
								break;
							}

							var2 = method827(var0);
							if (var2 == 0) {
								++var55;
							} else {
								--var55;
							}
						}
					}
				}

				for (var47 = 0; var47 < var49; var47++) {
					byte var29 = 32;
					byte var30 = 0;

					for (var35 = 0; var35 < var36; var35++) {
						if (var0.aByteArrayArray840[var47][var35] > var30) {
							var30 = var0.aByteArrayArray840[var47][var35];
						}

						if (var0.aByteArrayArray840[var47][var35] < var29) {
							var29 = var0.aByteArrayArray840[var47][var35];
						}
					}

					method831(var0.anIntArrayArray841[var47], var0.anIntArrayArray833[var47], var0.anIntArrayArray843[var47], var0.aByteArrayArray840[var47], var29, var30, var36);
					var0.anIntArray844[var47] = var29;
				}

				int var40 = var0.anInt832 * -1723605043 + 1;
				int var41 = -1;
				byte var37 = 0;

				for (var35 = 0; var35 <= 255; var35++) {
					var0.anIntArray808[var35] = 0;
				}

				int var51 = 4095;

				int var42;
				int var56;
				for (var56 = 15; var56 >= 0; --var56) {
					for (var42 = 15; var42 >= 0; --var42) {
						var0.aByteArray815[var51] = (byte) (var56 * 16 + var42);
						--var51;
					}

					var0.anIntArray836[var56] = var51 + 1;
				}

				int var48 = 0;
				byte var52;
				if (var37 == 0) {
					++var41;
					var37 = 50;
					var52 = var0.aByteArray829[var41];
					var31 = var0.anIntArray844[var52];
					var13 = var0.anIntArrayArray841[var52];
					var15 = var0.anIntArrayArray843[var52];
					var14 = var0.anIntArrayArray833[var52];
				}

				int var39 = var37 - 1;
				int var44 = var31;

				int var45;
				byte var46;
				for (var45 = method828(var31, var0); var45 > var13[var44]; var45 = var45 << 1 | var46) {
					++var44;
					var46 = method827(var0);
				}

				int var50 = var15[var45 - var14[var44]];

				while (true) {
					while (var50 != var40) {
						if (var50 != 0 && var50 != 1) {
							int var20 = var50 - 1;
							int var33;
							if (var20 < 16) {
								var33 = var0.anIntArray836[0];

								for (var2 = var0.aByteArray815[var33 + var20]; var20 > 3; var20 -= 4) {
									int var32 = var33 + var20;
									var0.aByteArray815[var32] = var0.aByteArray815[var32 - 1];
									var0.aByteArray815[var32 - 1] = var0.aByteArray815[var32 - 2];
									var0.aByteArray815[var32 - 2] = var0.aByteArray815[var32 - 3];
									var0.aByteArray815[var32 - 3] = var0.aByteArray815[var32 - 4];
								}

								while (var20 > 0) {
									var0.aByteArray815[var33 + var20] = var0.aByteArray815[var33 + var20 - 1];
									--var20;
								}

								var0.aByteArray815[var33] = var2;
							} else {
								int var26 = var20 / 16;
								int var34 = var20 % 16;
								var33 = var0.anIntArray836[var26] + var34;

								for (var2 = var0.aByteArray815[var33]; var33 > var0.anIntArray836[var26]; --var33) {
									var0.aByteArray815[var33] = var0.aByteArray815[var33 - 1];
								}

								++var0.anIntArray836[var26];

								while (var26 > 0) {
									--var0.anIntArray836[var26];
									var0.aByteArray815[var0.anIntArray836[var26]] = var0.aByteArray815[var0.anIntArray836[var26 - 1] + 16 - 1];
									--var26;
								}

								--var0.anIntArray836[0];
								var0.aByteArray815[var0.anIntArray836[0]] = var2;
								if (var0.anIntArray836[0] == 0) {
									var51 = 4095;

									for (var56 = 15; var56 >= 0; --var56) {
										for (var42 = 15; var42 >= 0; --var42) {
											var0.aByteArray815[var51] = var0.aByteArray815[var0.anIntArray836[var56] + var42];
											--var51;
										}

										var0.anIntArray836[var56] = var51 + 1;
									}
								}
							}

							++var0.anIntArray808[var0.aByteArray835[var2 & 255] & 255];
							Class7.anIntArray98[var48] = var0.aByteArray835[var2 & 255] & 255;
							++var48;
							if (var39 == 0) {
								++var41;
								var39 = 50;
								var52 = var0.aByteArray829[var41];
								var31 = var0.anIntArray844[var52];
								var13 = var0.anIntArrayArray841[var52];
								var15 = var0.anIntArrayArray843[var52];
								var14 = var0.anIntArrayArray833[var52];
							}

							--var39;
							var44 = var31;

							for (var45 = method828(var31, var0); var45 > var13[var44]; var45 = var45 << 1 | var46) {
								++var44;
								var46 = method827(var0);
							}

							var50 = var15[var45 - var14[var44]];
						} else {
							int var53 = -1;
							int var54 = 1;

							do {
								if (var50 == 0) {
									var53 += var54 * 1;
								} else if (var50 == 1) {
									var53 += var54 * 2;
								}

								var54 *= 2;
								if (var39 == 0) {
									++var41;
									var39 = 50;
									var52 = var0.aByteArray829[var41];
									var31 = var0.anIntArray844[var52];
									var13 = var0.anIntArrayArray841[var52];
									var15 = var0.anIntArrayArray843[var52];
									var14 = var0.anIntArrayArray833[var52];
								}

								--var39;
								var44 = var31;

								for (var45 = method828(var31, var0); var45 > var13[var44]; var45 = var45 << 1 | var46) {
									++var44;
									var46 = method827(var0);
								}

								var50 = var15[var45 - var14[var44]];
							} while (var50 == 0 || var50 == 1);

							++var53;
							var2 = var0.aByteArray835[var0.aByteArray815[var0.anIntArray836[0]] & 255];

							for (var0.anIntArray808[var2 & 255] += var53; var53 > 0; --var53) {
								Class7.anIntArray98[var48] = var2 & 255;
								++var48;
							}
						}
					}

					var0.anInt822 = 0;
					var0.aByte821 = 0;
					var0.anIntArray831[0] = 0;

					for (var35 = 1; var35 <= 256; var35++) {
						var0.anIntArray831[var35] = var0.anIntArray808[var35 - 1];
					}

					for (var35 = 1; var35 <= 256; var35++) {
						var0.anIntArray831[var35] += var0.anIntArray831[var35 - 1];
					}

					for (var35 = 0; var35 < var48; var35++) {
						var2 = (byte) (Class7.anIntArray98[var35] & 255);
						Class7.anIntArray98[var0.anIntArray831[var2 & 255]] |= var35 << 8;
						++var0.anIntArray831[var2 & 255];
					}

					var0.anInt827 = (Class7.anIntArray98[var0.anInt826 * -558712679] >> 8) * -1014428141;
					var0.anInt830 = 0;
					var0.anInt827 = Class7.anIntArray98[var0.anInt827 * 1684466715] * -1014428141;
					var0.anInt819 = (byte) (var0.anInt827 * 1684466715 & 255) * -109584283;
					var0.anInt827 = (var0.anInt827 * 1684466715 >> 8) * -1014428141;
					var0.anInt830 -= 499883619;
					var0.anInt845 = var48 * 473468319;
					method825(var0);
					if (var0.anInt830 * -1309659979 == var0.anInt845 * 2097368671 + 1 && var0.anInt822 * -708199269 == 0) {
						var16 = true;
						break;
					}

					var16 = false;
					break;
				}
			}

			return;
		}
	}

	Class53() throws Throwable {
		throw new Error();
	}

	static byte method827(Class68 var0) {
		return (byte) method828(1, var0);
	}

	static int method828(int var0, Class68 var1) {
		while (var1.anInt809 * 1800219475 < var0) {
			var1.anInt824 = (var1.anInt824 * 1762392485 << 8 | var1.aByteArray814[var1.anInt828 * 55610003] & 255) * 41567789;
			var1.anInt809 += 1949468376;
			var1.anInt828 += 1137583003;
			var1.anInt816 += 860208025;
			if (var1.anInt816 * -1989580631 == 0) {
				;
			}
		}

		int var2 = var1.anInt824 * 1762392485 >> var1.anInt809 * 1800219475 - var0 & (1 << var0) - 1;
		var1.anInt809 -= var0 * -1366929189;
		return var2;
	}

	static void method829(Class68 var0) {
		var0.anInt832 = 0;

		for (int var1 = 0; var1 < 256; var1++) {
			if (var0.aBoolArray812[var1]) {
				var0.aByteArray835[var0.anInt832 * -1723605043] = (byte) var1;
				var0.anInt832 += 530851077;
			}
		}

	}

	static void method831(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
		int var7 = 0;

		int var9;
		for (var9 = var4; var9 <= var5; var9++) {
			for (int var10 = 0; var10 < var6; var10++) {
				if (var3[var10] == var9) {
					var2[var7] = var10;
					++var7;
				}
			}
		}

		for (var9 = 0; var9 < 23; var9++) {
			var1[var9] = 0;
		}

		for (var9 = 0; var9 < var6; var9++) {
			++var1[var3[var9] + 1];
		}

		for (var9 = 1; var9 < 23; var9++) {
			var1[var9] += var1[var9 - 1];
		}

		for (var9 = 0; var9 < 23; var9++) {
			var0[var9] = 0;
		}

		int var8 = 0;

		for (var9 = var4; var9 <= var5; var9++) {
			var8 += var1[var9 + 1] - var1[var9];
			var0[var9] = var8 - 1;
			var8 <<= 1;
		}

		for (var9 = var4 + 1; var9 <= var5; var9++) {
			var1[var9] = (var0[var9 - 1] + 1 << 1) - var1[var9];
		}

	}

	static byte method842(Class68 var0) {
		return (byte) method828(8, var0);
	}

}
