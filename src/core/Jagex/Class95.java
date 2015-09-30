package core.Jagex;
public class Class95 {

	public static final int anInt1101 = 29;
	public static final int anInt1102 = 31;
	public static final int anInt1103 = 32;
	public static final int anInt1104 = 55;
	public static final int anInt1105 = 56;
	static final int anInt1106 = 1001;
	static boolean aBool1107;

	public static int method1242(int var0, int var1, int var2, Class54 var3, Class51 var4, boolean var5, int[] var6, int[] var7, byte var8) {
		int var14;
		for (int var9 = 0; var9 < 128; var9++) {
			for (var14 = 0; var14 < 128; var14++) {
				Class65.anIntArrayArray787[var9][var14] = 0;
				Class65.anIntArrayArray781[var9][var14] = 99999999;
			}
		}

		int var10;
		int[][] var11;
		int var12;
		int var13;
		byte var15;
		int var16;
		int var17;
		byte var18;
		byte var19;
		int var20;
		int var21;
		int var22;
		int var23;
		boolean var28;
		boolean var30;
		int var31;
		int var32;
		int var33;
		if (var2 == 1) {
			var21 = var0;
			var16 = var1;
			var18 = 64;
			var19 = 64;
			var22 = var0 - var18;
			var20 = var1 - var19;
			Class65.anIntArrayArray787[var18][var19] = 99;
			Class65.anIntArrayArray781[var18][var19] = 0;
			var15 = 0;
			var17 = 0;
			Class65.anIntArray783[var15] = var0;
			var31 = var15 + 1;
			Class65.anIntArray788[var15] = var1;
			var11 = var4.anIntArrayArray704;

			while (true) {
				if (var31 == var17) {
					Class65.anInt785 = var21 * 810120645;
					Class99.anInt1141 = var16 * 1027921353;
					var30 = false;
					break;
				}

				var21 = Class65.anIntArray783[var17];
				var16 = Class65.anIntArray788[var17];
				var17 = 1 + var17 & 4095;
				var32 = var21 - var22;
				var33 = var16 - var20;
				var12 = var21 - var4.anInt700 * 796143871;
				var13 = var16 - var4.anInt701 * 1659021759;
				if (var3.method847(1, var21, var16, var4, 1328159226)) {
					Class65.anInt785 = var21 * 810120645;
					Class99.anInt1141 = var16 * 1027921353;
					var30 = true;
					break;
				}

				var23 = 1 + Class65.anIntArrayArray781[var32][var33];
				if (var32 > 0 && Class65.anIntArrayArray787[var32 - 1][var33] == 0 && (var11[var12 - 1][var13] & 19136776) == 0) {
					Class65.anIntArray783[var31] = var21 - 1;
					Class65.anIntArray788[var31] = var16;
					var31 = var31 + 1 & 4095;
					Class65.anIntArrayArray787[var32 - 1][var33] = 2;
					Class65.anIntArrayArray781[var32 - 1][var33] = var23;
				}

				if (var32 < 127 && Class65.anIntArrayArray787[1 + var32][var33] == 0 && (var11[var12 + 1][var13] & 19136896) == 0) {
					Class65.anIntArray783[var31] = var21 + 1;
					Class65.anIntArray788[var31] = var16;
					var31 = var31 + 1 & 4095;
					Class65.anIntArrayArray787[var32 + 1][var33] = 8;
					Class65.anIntArrayArray781[1 + var32][var33] = var23;
				}

				if (var33 > 0 && Class65.anIntArrayArray787[var32][var33 - 1] == 0 && (var11[var12][var13 - 1] & 19136770) == 0) {
					Class65.anIntArray783[var31] = var21;
					Class65.anIntArray788[var31] = var16 - 1;
					var31 = var31 + 1 & 4095;
					Class65.anIntArrayArray787[var32][var33 - 1] = 1;
					Class65.anIntArrayArray781[var32][var33 - 1] = var23;
				}

				if (var33 < 127 && Class65.anIntArrayArray787[var32][var33 + 1] == 0 && (var11[var12][1 + var13] & 19136800) == 0) {
					Class65.anIntArray783[var31] = var21;
					Class65.anIntArray788[var31] = 1 + var16;
					var31 = 1 + var31 & 4095;
					Class65.anIntArrayArray787[var32][1 + var33] = 4;
					Class65.anIntArrayArray781[var32][var33 + 1] = var23;
				}

				if (var32 > 0 && var33 > 0 && Class65.anIntArrayArray787[var32 - 1][var33 - 1] == 0 && (var11[var12 - 1][var13 - 1] & 19136782) == 0 && (var11[var12 - 1][var13] & 19136776) == 0 && (var11[var12][var13 - 1] & 19136770) == 0) {
					Class65.anIntArray783[var31] = var21 - 1;
					Class65.anIntArray788[var31] = var16 - 1;
					var31 = 1 + var31 & 4095;
					Class65.anIntArrayArray787[var32 - 1][var33 - 1] = 3;
					Class65.anIntArrayArray781[var32 - 1][var33 - 1] = var23;
				}

				if (var32 < 127 && var33 > 0 && Class65.anIntArrayArray787[1 + var32][var33 - 1] == 0 && (var11[1 + var12][var13 - 1] & 19136899) == 0 && (var11[var12 + 1][var13] & 19136896) == 0 && (var11[var12][var13 - 1] & 19136770) == 0) {
					Class65.anIntArray783[var31] = 1 + var21;
					Class65.anIntArray788[var31] = var16 - 1;
					var31 = 1 + var31 & 4095;
					Class65.anIntArrayArray787[var32 + 1][var33 - 1] = 9;
					Class65.anIntArrayArray781[1 + var32][var33 - 1] = var23;
				}

				if (var32 > 0 && var33 < 127 && Class65.anIntArrayArray787[var32 - 1][var33 + 1] == 0 && (var11[var12 - 1][var13 + 1] & 19136824) == 0 && (var11[var12 - 1][var13] & 19136776) == 0 && (var11[var12][var13 + 1] & 19136800) == 0) {
					Class65.anIntArray783[var31] = var21 - 1;
					Class65.anIntArray788[var31] = var16 + 1;
					var31 = var31 + 1 & 4095;
					Class65.anIntArrayArray787[var32 - 1][var33 + 1] = 6;
					Class65.anIntArrayArray781[var32 - 1][1 + var33] = var23;
				}

				if (var32 < 127 && var33 < 127 && Class65.anIntArrayArray787[var32 + 1][var33 + 1] == 0 && (var11[var12 + 1][1 + var13] & 19136992) == 0 && (var11[1 + var12][var13] & 19136896) == 0 && (var11[var12][var13 + 1] & 19136800) == 0) {
					Class65.anIntArray783[var31] = 1 + var21;
					Class65.anIntArray788[var31] = 1 + var16;
					var31 = var31 + 1 & 4095;
					Class65.anIntArrayArray787[1 + var32][var33 + 1] = 12;
					Class65.anIntArrayArray781[1 + var32][1 + var33] = var23;
				}
			}

			var28 = var30;
		} else if (var2 == 2) {
			var21 = var0;
			var16 = var1;
			var18 = 64;
			var19 = 64;
			var22 = var0 - var18;
			var20 = var1 - var19;
			Class65.anIntArrayArray787[var18][var19] = 99;
			Class65.anIntArrayArray781[var18][var19] = 0;
			var15 = 0;
			var17 = 0;
			Class65.anIntArray783[var15] = var0;
			var31 = var15 + 1;
			Class65.anIntArray788[var15] = var1;
			var11 = var4.anIntArrayArray704;

			while (true) {
				if (var31 == var17) {
					Class65.anInt785 = var21 * 810120645;
					Class99.anInt1141 = var16 * 1027921353;
					var30 = false;
					break;
				}

				var21 = Class65.anIntArray783[var17];
				var16 = Class65.anIntArray788[var17];
				var17 = var17 + 1 & 4095;
				var32 = var21 - var22;
				var33 = var16 - var20;
				var12 = var21 - var4.anInt700 * 796143871;
				var13 = var16 - var4.anInt701 * 1659021759;
				if (var3.method847(2, var21, var16, var4, -1327112226)) {
					Class65.anInt785 = var21 * 810120645;
					Class99.anInt1141 = var16 * 1027921353;
					var30 = true;
					break;
				}

				var23 = Class65.anIntArrayArray781[var32][var33] + 1;
				if (var32 > 0 && Class65.anIntArrayArray787[var32 - 1][var33] == 0 && (var11[var12 - 1][var13] & 19136782) == 0 && (var11[var12 - 1][1 + var13] & 19136824) == 0) {
					Class65.anIntArray783[var31] = var21 - 1;
					Class65.anIntArray788[var31] = var16;
					var31 = 1 + var31 & 4095;
					Class65.anIntArrayArray787[var32 - 1][var33] = 2;
					Class65.anIntArrayArray781[var32 - 1][var33] = var23;
				}

				if (var32 < 126 && Class65.anIntArrayArray787[1 + var32][var33] == 0 && (var11[2 + var12][var13] & 19136899) == 0 && (var11[2 + var12][1 + var13] & 19136992) == 0) {
					Class65.anIntArray783[var31] = 1 + var21;
					Class65.anIntArray788[var31] = var16;
					var31 = 1 + var31 & 4095;
					Class65.anIntArrayArray787[1 + var32][var33] = 8;
					Class65.anIntArrayArray781[var32 + 1][var33] = var23;
				}

				if (var33 > 0 && Class65.anIntArrayArray787[var32][var33 - 1] == 0 && (var11[var12][var13 - 1] & 19136782) == 0 && (var11[var12 + 1][var13 - 1] & 19136899) == 0) {
					Class65.anIntArray783[var31] = var21;
					Class65.anIntArray788[var31] = var16 - 1;
					var31 = 1 + var31 & 4095;
					Class65.anIntArrayArray787[var32][var33 - 1] = 1;
					Class65.anIntArrayArray781[var32][var33 - 1] = var23;
				}

				if (var33 < 126 && Class65.anIntArrayArray787[var32][var33 + 1] == 0 && (var11[var12][2 + var13] & 19136824) == 0 && (var11[var12 + 1][2 + var13] & 19136992) == 0) {
					Class65.anIntArray783[var31] = var21;
					Class65.anIntArray788[var31] = 1 + var16;
					var31 = var31 + 1 & 4095;
					Class65.anIntArrayArray787[var32][1 + var33] = 4;
					Class65.anIntArrayArray781[var32][var33 + 1] = var23;
				}

				if (var32 > 0 && var33 > 0 && Class65.anIntArrayArray787[var32 - 1][var33 - 1] == 0 && (var11[var12 - 1][var13] & 19136830) == 0 && (var11[var12 - 1][var13 - 1] & 19136782) == 0 && (var11[var12][var13 - 1] & 19136911) == 0) {
					Class65.anIntArray783[var31] = var21 - 1;
					Class65.anIntArray788[var31] = var16 - 1;
					var31 = 1 + var31 & 4095;
					Class65.anIntArrayArray787[var32 - 1][var33 - 1] = 3;
					Class65.anIntArrayArray781[var32 - 1][var33 - 1] = var23;
				}

				if (var32 < 126 && var33 > 0 && Class65.anIntArrayArray787[1 + var32][var33 - 1] == 0 && (var11[1 + var12][var13 - 1] & 19136911) == 0 && (var11[var12 + 2][var13 - 1] & 19136899) == 0 && (var11[var12 + 2][var13] & 19136995) == 0) {
					Class65.anIntArray783[var31] = var21 + 1;
					Class65.anIntArray788[var31] = var16 - 1;
					var31 = var31 + 1 & 4095;
					Class65.anIntArrayArray787[1 + var32][var33 - 1] = 9;
					Class65.anIntArrayArray781[1 + var32][var33 - 1] = var23;
				}

				if (var32 > 0 && var33 < 126 && Class65.anIntArrayArray787[var32 - 1][1 + var33] == 0 && (var11[var12 - 1][1 + var13] & 19136830) == 0 && (var11[var12 - 1][var13 + 2] & 19136824) == 0 && (var11[var12][2 + var13] & 19137016) == 0) {
					Class65.anIntArray783[var31] = var21 - 1;
					Class65.anIntArray788[var31] = 1 + var16;
					var31 = var31 + 1 & 4095;
					Class65.anIntArrayArray787[var32 - 1][var33 + 1] = 6;
					Class65.anIntArrayArray781[var32 - 1][var33 + 1] = var23;
				}

				if (var32 < 126 && var33 < 126 && Class65.anIntArrayArray787[1 + var32][var33 + 1] == 0 && (var11[1 + var12][var13 + 2] & 19137016) == 0 && (var11[var12 + 2][2 + var13] & 19136992) == 0 && (var11[var12 + 2][var13 + 1] & 19136995) == 0) {
					Class65.anIntArray783[var31] = var21 + 1;
					Class65.anIntArray788[var31] = 1 + var16;
					var31 = var31 + 1 & 4095;
					Class65.anIntArrayArray787[var32 + 1][var33 + 1] = 12;
					Class65.anIntArrayArray781[var32 + 1][var33 + 1] = var23;
				}
			}

			var28 = var30;
		} else {
			var21 = var0;
			var16 = var1;
			var18 = 64;
			var19 = 64;
			var22 = var0 - var18;
			var20 = var1 - var19;
			Class65.anIntArrayArray787[var18][var19] = 99;
			Class65.anIntArrayArray781[var18][var19] = 0;
			var15 = 0;
			var17 = 0;
			Class65.anIntArray783[var15] = var0;
			var31 = var15 + 1;
			Class65.anIntArray788[var15] = var1;
			var11 = var4.anIntArrayArray704;

			label797:
			while (true) {
				label795:
				while (true) {
					do {
						do {
							do {
								label772:
								do {
									if (var31 == var17) {
										Class65.anInt785 = var21 * 810120645;
										Class99.anInt1141 = var16 * 1027921353;
										var30 = false;
										break label797;
									}

									var21 = Class65.anIntArray783[var17];
									var16 = Class65.anIntArray788[var17];
									var17 = 1 + var17 & 4095;
									var32 = var21 - var22;
									var33 = var16 - var20;
									var12 = var21 - var4.anInt700 * 796143871;
									var13 = var16 - var4.anInt701 * 1659021759;
									if (var3.method847(var2, var21, var16, var4, -1898318477)) {
										Class65.anInt785 = var21 * 810120645;
										Class99.anInt1141 = var16 * 1027921353;
										var30 = true;
										break label797;
									}

									var23 = 1 + Class65.anIntArrayArray781[var32][var33];
									if (var32 > 0 && Class65.anIntArrayArray787[var32 - 1][var33] == 0 && (var11[var12 - 1][var13] & 19136782) == 0 && (var11[var12 - 1][var13 + var2 - 1] & 19136824) == 0) {
										var10 = 1;

										while (true) {
											if (var10 >= var2 - 1) {
												Class65.anIntArray783[var31] = var21 - 1;
												Class65.anIntArray788[var31] = var16;
												var31 = var31 + 1 & 4095;
												Class65.anIntArrayArray787[var32 - 1][var33] = 2;
												Class65.anIntArrayArray781[var32 - 1][var33] = var23;
												break;
											}

											if ((var11[var12 - 1][var13 + var10] & 19136830) != 0) {
												break;
											}

											++var10;
										}
									}

									if (var32 < 128 - var2 && Class65.anIntArrayArray787[var32 + 1][var33] == 0 && (var11[var12 + var2][var13] & 19136899) == 0 && (var11[var2 + var12][var2 + var13 - 1] & 19136992) == 0) {
										var10 = 1;

										while (true) {
											if (var10 >= var2 - 1) {
												Class65.anIntArray783[var31] = var21 + 1;
												Class65.anIntArray788[var31] = var16;
												var31 = var31 + 1 & 4095;
												Class65.anIntArrayArray787[var32 + 1][var33] = 8;
												Class65.anIntArrayArray781[var32 + 1][var33] = var23;
												break;
											}

											if ((var11[var12 + var2][var10 + var13] & 19136995) != 0) {
												break;
											}

											++var10;
										}
									}

									if (var33 > 0 && Class65.anIntArrayArray787[var32][var33 - 1] == 0 && (var11[var12][var13 - 1] & 19136782) == 0 && (var11[var2 + var12 - 1][var13 - 1] & 19136899) == 0) {
										var10 = 1;

										while (true) {
											if (var10 >= var2 - 1) {
												Class65.anIntArray783[var31] = var21;
												Class65.anIntArray788[var31] = var16 - 1;
												var31 = var31 + 1 & 4095;
												Class65.anIntArrayArray787[var32][var33 - 1] = 1;
												Class65.anIntArrayArray781[var32][var33 - 1] = var23;
												break;
											}

											if ((var11[var10 + var12][var13 - 1] & 19136911) != 0) {
												break;
											}

											++var10;
										}
									}

									if (var33 < 128 - var2 && Class65.anIntArrayArray787[var32][1 + var33] == 0 && (var11[var12][var13 + var2] & 19136824) == 0 && (var11[var12 + var2 - 1][var2 + var13] & 19136992) == 0) {
										var10 = 1;

										while (true) {
											if (var10 >= var2 - 1) {
												Class65.anIntArray783[var31] = var21;
												Class65.anIntArray788[var31] = 1 + var16;
												var31 = 1 + var31 & 4095;
												Class65.anIntArrayArray787[var32][1 + var33] = 4;
												Class65.anIntArrayArray781[var32][var33 + 1] = var23;
												break;
											}

											if ((var11[var10 + var12][var2 + var13] & 19137016) != 0) {
												break;
											}

											++var10;
										}
									}

									if (var32 > 0 && var33 > 0 && Class65.anIntArrayArray787[var32 - 1][var33 - 1] == 0 && (var11[var12 - 1][var13 - 1] & 19136782) == 0) {
										var10 = 1;

										while (true) {
											if (var10 >= var2) {
												Class65.anIntArray783[var31] = var21 - 1;
												Class65.anIntArray788[var31] = var16 - 1;
												var31 = 1 + var31 & 4095;
												Class65.anIntArrayArray787[var32 - 1][var33 - 1] = 3;
												Class65.anIntArrayArray781[var32 - 1][var33 - 1] = var23;
												break;
											}

											if ((var11[var12 - 1][var13 - 1 + var10] & 19136830) != 0 || (var11[var12 - 1 + var10][var13 - 1] & 19136911) != 0) {
												break;
											}

											++var10;
										}
									}

									if (var32 < 128 - var2 && var33 > 0 && Class65.anIntArrayArray787[var32 + 1][var33 - 1] == 0 && (var11[var12 + var2][var13 - 1] & 19136899) == 0) {
										var10 = 1;

										while (true) {
											if (var10 >= var2) {
												Class65.anIntArray783[var31] = 1 + var21;
												Class65.anIntArray788[var31] = var16 - 1;
												var31 = 1 + var31 & 4095;
												Class65.anIntArrayArray787[var32 + 1][var33 - 1] = 9;
												Class65.anIntArrayArray781[var32 + 1][var33 - 1] = var23;
												break;
											}

											if ((var11[var12 + var2][var13 - 1 + var10] & 19136995) != 0 || (var11[var10 + var12][var13 - 1] & 19136911) != 0) {
												break;
											}

											++var10;
										}
									}

									if (var32 > 0 && var33 < 128 - var2 && Class65.anIntArrayArray787[var32 - 1][1 + var33] == 0 && (var11[var12 - 1][var2 + var13] & 19136824) == 0) {
										for (var10 = 1; var10 < var2; var10++) {
											if ((var11[var12 - 1][var13 + var10] & 19136830) != 0 || (var11[var12 - 1 + var10][var2 + var13] & 19137016) != 0) {
												continue label772;
											}
										}

										Class65.anIntArray783[var31] = var21 - 1;
										Class65.anIntArray788[var31] = var16 + 1;
										var31 = var31 + 1 & 4095;
										Class65.anIntArrayArray787[var32 - 1][1 + var33] = 6;
										Class65.anIntArrayArray781[var32 - 1][1 + var33] = var23;
									}
								} while (var32 >= 128 - var2);
							} while (var33 >= 128 - var2);
						} while (Class65.anIntArrayArray787[var32 + 1][1 + var33] != 0);
					} while ((var11[var12 + var2][var13 + var2] & 19136992) != 0);

					for (var10 = 1; var10 < var2; var10++) {
						if ((var11[var10 + var12][var2 + var13] & 19137016) != 0 || (var11[var12 + var2][var10 + var13] & 19136995) != 0) {
							continue label795;
						}
					}

					Class65.anIntArray783[var31] = var21 + 1;
					Class65.anIntArray788[var31] = 1 + var16;
					var31 = 1 + var31 & 4095;
					Class65.anIntArrayArray787[1 + var32][var33 + 1] = 12;
					Class65.anIntArrayArray781[1 + var32][1 + var33] = var23;
				}
			}

			var28 = var30;
		}

		var14 = var0 - 64;
		var21 = var1 - 64;
		var16 = Class65.anInt785 * -2084159219;
		var32 = Class99.anInt1141 * -1907796871;
		if (!var28) {
			if (!var5) {
				return -1;
			}

			var33 = Integer.MAX_VALUE;
			var22 = Integer.MAX_VALUE;
			byte var34 = 10;
			var31 = var3.anInt736 * 596959719;
			var17 = var3.anInt728 * 1540487459;
			int var29 = var3.anInt730 * 1818079605;
			var12 = var3.anInt731 * 399769883;

			for (var13 = var31 - var34; var13 <= var31 + var34; var13++) {
				for (var23 = var17 - var34; var23 <= var17 + var34; var23++) {
					var10 = var13 - var14;
					int var26 = var23 - var21;
					if (var10 >= 0 && var26 >= 0 && var10 < 128 && var26 < 128 && Class65.anIntArrayArray781[var10][var26] < 100) {
						int var27 = 0;
						if (var13 < var31) {
							var27 = var31 - var13;
						} else if (var13 > var31 + var29 - 1) {
							var27 = var13 - (var31 + var29 - 1);
						}

						int var24 = 0;
						if (var23 < var17) {
							var24 = var17 - var23;
						} else if (var23 > var17 + var12 - 1) {
							var24 = var23 - (var12 + var17 - 1);
						}

						int var25 = var27 * var27 + var24 * var24;
						if (var25 < var33 || var25 == var33 && Class65.anIntArrayArray781[var10][var26] < var22) {
							var33 = var25;
							var22 = Class65.anIntArrayArray781[var10][var26];
							var16 = var13;
							var32 = var23;
						}
					}
				}
			}

			if (var33 == Integer.MAX_VALUE) {
				return -1;
			}
		}

		if (var16 == var0 && var32 == var1) {
			return 0;
		} else {
			var19 = 0;
			Class65.anIntArray783[var19] = var16;
			var33 = var19 + 1;
			Class65.anIntArray788[var19] = var32;

			for (var22 = var20 = Class65.anIntArrayArray787[var16 - var14][var32 - var21]; var16 != var0 || var32 != var1; var22 = Class65.anIntArrayArray787[var16 - var14][var32 - var21]) {
				if (var22 != var20) {
					var20 = var22;
					Class65.anIntArray783[var33] = var16;
					Class65.anIntArray788[var33++] = var32;
				}

				if ((var22 & 2) != 0) {
					++var16;
				} else if ((var22 & 8) != 0) {
					--var16;
				}

				if ((var22 & 1) != 0) {
					++var32;
				} else if ((var22 & 4) != 0) {
					--var32;
				}
			}

			var31 = 0;

			while (var33-- > 0) {
				var6[var31] = Class65.anIntArray783[var33];
				var7[var31++] = Class65.anIntArray788[var33];
				if (var31 >= var6.length) {
					break;
				}
			}

			return var31;
		}
	}

	static long method1243(CharSequence var0, int var1) {
		long var2 = 0L;
		int var6 = var0.length();

		for (int var5 = 0; var5 < var6; var5++) {
			var2 *= 37L;
			char var4 = var0.charAt(var5);
			if (var4 >= 65 && var4 <= 90) {
				var2 += (long) (1 + var4 - 65);
			} else if (var4 >= 97 && var4 <= 122) {
				var2 += (long) (1 + var4 - 97);
			} else if (var4 >= 48 && var4 <= 57) {
				var2 += (long) (27 + var4 - 48);
			}

			if (var2 >= 177917621779460413L) {
				break;
			}
		}

		while (var2 % 37L == 0L && var2 != 0L) {
			var2 /= 37L;
		}

		return var2;
	}

	Class95() throws Throwable {
		throw new Error();
	}

	static void method1244(String[] var0, short[] var1, int var2, int var3, int var4) {
		if (var2 < var3) {
			int var7 = (var2 + var3) / 2;
			int var5 = var2;
			String var8 = var0[var7];
			var0[var7] = var0[var3];
			var0[var3] = var8;
			short var9 = var1[var7];
			var1[var7] = var1[var3];
			var1[var3] = var9;

			for (int var10 = var2; var10 < var3; var10++) {
				if (var8 == null || var0[var10] != null && var0[var10].compareTo(var8) < (var10 & 1)) {
					String var11 = var0[var10];
					var0[var10] = var0[var5];
					var0[var5] = var11;
					short var6 = var1[var10];
					var1[var10] = var1[var5];
					var1[var5++] = var6;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var8;
			var1[var3] = var1[var5];
			var1[var5] = var9;
			method1244(var0, var1, var2, var5 - 1, 1031628339);
			method1244(var0, var1, var5 + 1, var3, -831541572);
		}

	}

	static void method1245(Class117_Sub19[] var0, Class117_Sub19 var1, boolean var2, byte var3) {
		int var5 = var1.anInt1996 * -825850981 != 0 ? var1.anInt1996 * -825850981 : var1.anInt1988 * 1854643179;
		int var6 = var1.anInt1997 * 1348115267 != 0 ? var1.anInt1997 * 1348115267 : var1.anInt1989 * 2747837;
		Class41.method537(var0, var1.anInt1973 * -1955776525, var5, var6, var2, (byte) -85);
		if (var1.aClass117_Sub19Array2095 != null) {
			Class41.method537(var1.aClass117_Sub19Array2095, var1.anInt1973 * -1955776525, var5, var6, var2, (byte) -92);
		}

		Class117_Sub10 var4 = (Class117_Sub10) GameClient.aClass127_3080.method1675((long) (var1.anInt1973 * -1955776525));
		if (var4 != null) {
			Class29.method419(var4.anInt1831 * -2090327687, var5, var6, var2, (byte) 107);
		}

		if (var1.anInt2018 * 2064823433 == 1337) {
			;
		}

	}

}
