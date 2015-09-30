package core.Jagex;
public class Class117_Sub17 extends Class117 {

	byte[] aByteArray1924;
	Class127 aClass127_1925;

	Class117_Sub17(Class117_Sub14 var1) {
		var1.anInt1880 = (var1.aByteArray1885.length - 3) * -2079217519;
		int var3 = var1.method2010(-1439707937);
		int var61 = var1.method2012(1053511631);
		int var4 = 14 + var3 * 10;
		var1.anInt1880 = 0;
		int var19 = 0;
		int var7 = 0;
		int var8 = 0;
		int var12 = 0;
		int var9 = 0;
		int var2 = 0;
		int var27 = 0;
		int var10 = 0;

		int var14;
		int var15;
		int var23;
		for (var23 = 0; var23 < var3; var23++) {
			var15 = -1;

			while (true) {
				var14 = var1.method2010(-1439707937);
				if (var14 != var15) {
					++var4;
				}

				var15 = var14 & 15;
				if (var14 == 7) {
					break;
				}

				if (var14 == 23) {
					++var19;
				} else if (var15 == 0) {
					++var8;
				} else if (var15 == 1) {
					++var12;
				} else if (var15 == 2) {
					++var7;
				} else if (var15 == 3) {
					++var9;
				} else if (var15 == 4) {
					++var2;
				} else if (var15 == 5) {
					++var27;
				} else {
					if (var15 != 6) {
						throw new RuntimeException();
					}

					++var10;
				}
			}
		}

		var4 += var19 * 5;
		var4 += (var8 + var12 + var7 + var9 + var27) * 2;
		var4 += var2 + var10;
		var23 = var1.anInt1880 * 561453169;
		var15 = var3 + var19 + var7 + var8 + var12 + var9 + var2 + var27 + var10;

		for (var14 = 0; var14 < var15; var14++) {
			var1.method2127(-1571118231);
		}

		var4 += var1.anInt1880 * 561453169 - var23;
		var14 = var1.anInt1880 * 561453169;
		int var30 = 0;
		int var31 = 0;
		int var39 = 0;
		int var32 = 0;
		int var33 = 0;
		int var41 = 0;
		int var37 = 0;
		int var6 = 0;
		int var43 = 0;
		int var35 = 0;
		int var36 = 0;
		int var45 = 0;
		int var5 = 0;

		int var34;
		for (var34 = 0; var34 < var7; var34++) {
			var5 = var5 + var1.method2010(-1439707937) & 127;
			if (var5 != 0 && var5 != 32) {
				if (var5 == 1) {
					++var30;
				} else if (var5 == 33) {
					++var31;
				} else if (var5 == 7) {
					++var39;
				} else if (var5 == 39) {
					++var32;
				} else if (var5 == 10) {
					++var33;
				} else if (var5 == 42) {
					++var41;
				} else if (var5 == 99) {
					++var37;
				} else if (var5 == 98) {
					++var6;
				} else if (var5 == 101) {
					++var43;
				} else if (var5 == 100) {
					++var35;
				} else if (var5 != 64 && var5 != 65 && var5 != 120 && var5 != 121 && var5 != 123) {
					++var45;
				} else {
					++var36;
				}
			} else {
				++var10;
			}
		}

		var34 = 0;
		int var47 = var1.anInt1880 * 561453169;
		var1.anInt1880 += var36 * -2079217519;
		int var48 = var1.anInt1880 * 561453169;
		var1.anInt1880 += var27 * -2079217519;
		int var49 = var1.anInt1880 * 561453169;
		var1.anInt1880 += var2 * -2079217519;
		int var22 = var1.anInt1880 * 561453169;
		var1.anInt1880 += var9 * -2079217519;
		int var66 = var1.anInt1880 * 561453169;
		var1.anInt1880 += var30 * -2079217519;
		int var26 = var1.anInt1880 * 561453169;
		var1.anInt1880 += var39 * -2079217519;
		int var29 = var1.anInt1880 * 561453169;
		var1.anInt1880 += var33 * -2079217519;
		int var53 = var1.anInt1880 * 561453169;
		var1.anInt1880 += (var8 + var12 + var27) * -2079217519;
		int var54 = var1.anInt1880 * 561453169;
		var1.anInt1880 += var8 * -2079217519;
		int var57 = var1.anInt1880 * 561453169;
		var1.anInt1880 += var45 * -2079217519;
		int var40 = var1.anInt1880 * 561453169;
		var1.anInt1880 += var12 * -2079217519;
		int var55 = var1.anInt1880 * 561453169;
		var1.anInt1880 += var31 * -2079217519;
		int var52 = var1.anInt1880 * 561453169;
		var1.anInt1880 += var32 * -2079217519;
		int var56 = var1.anInt1880 * 561453169;
		var1.anInt1880 += var41 * -2079217519;
		int var17 = var1.anInt1880 * 561453169;
		var1.anInt1880 += var10 * -2079217519;
		int var58 = var1.anInt1880 * 561453169;
		var1.anInt1880 += var9 * -2079217519;
		int var13 = var1.anInt1880 * 561453169;
		var1.anInt1880 += var37 * -2079217519;
		int var16 = var1.anInt1880 * 561453169;
		var1.anInt1880 += var6 * -2079217519;
		int var59 = var1.anInt1880 * 561453169;
		var1.anInt1880 += var43 * -2079217519;
		int var28 = var1.anInt1880 * 561453169;
		var1.anInt1880 += var35 * -2079217519;
		int var60 = var1.anInt1880 * 561453169;
		var1.anInt1880 += var19 * -1942685261;
		aByteArray1924 = new byte[var4];
		Class117_Sub14 var20 = new Class117_Sub14(aByteArray1924);
		var20.method2183(1297377380, (byte) 45);
		var20.method2183(6, (byte) 11);
		var20.method1996(var3 > 1 ? 1 : 0, (byte) -25);
		var20.method1996(var3, (byte) -71);
		var20.method1996(var61, (byte) -122);
		var1.anInt1880 = var23 * -2079217519;
		int var51 = 0;
		int var50 = 0;
		int var42 = 0;
		int var38 = 0;
		int var21 = 0;
		int var44 = 0;
		int var62 = 0;
		int[] var63 = new int[128];
		var5 = 0;

		label355:
		for (int var46 = 0; var46 < var3; var46++) {
			var20.method2183(1297379947, (byte) 58);
			var20.anInt1880 += 273064516;
			int var24 = var20.anInt1880 * 561453169;
			int var65 = -1;

			while (true) {
				while (true) {
					int var64 = var1.method2127(805599233);
					var20.method1999(var64, -1855882841);
					int var25 = var1.aByteArray1885[var34++] & 255;
					boolean var11 = var25 != var65;
					var65 = var25 & 15;
					if (var25 == 7) {
						if (var11) {
							var20.method2126(255, 253156332);
						}

						var20.method2126(47, 1950264149);
						var20.method2126(0, 190492908);
						var20.method2047(var20.anInt1880 * 561453169 - var24, -1889041364);
						continue label355;
					}

					if (var25 == 23) {
						if (var11) {
							var20.method2126(255, 339191360);
						}

						var20.method2126(81, 638558688);
						var20.method2126(3, 1446276468);
						var20.method2126(var1.aByteArray1885[var60++], 1097139008);
						var20.method2126(var1.aByteArray1885[var60++], 1641811030);
						var20.method2126(var1.aByteArray1885[var60++], 180832040);
					} else {
						var51 ^= var25 >> 4;
						if (var65 == 0) {
							if (var11) {
								var20.method2126(144 + var51, 1736722143);
							}

							var50 += var1.aByteArray1885[var53++];
							var42 += var1.aByteArray1885[var54++];
							var20.method2126(var50 & 127, 1281672976);
							var20.method2126(var42 & 127, 651418101);
						} else if (var65 == 1) {
							if (var11) {
								var20.method2126(128 + var51, 714848383);
							}

							var50 += var1.aByteArray1885[var53++];
							var38 += var1.aByteArray1885[var40++];
							var20.method2126(var50 & 127, 227494365);
							var20.method2126(var38 & 127, -144682936);
						} else if (var65 == 2) {
							if (var11) {
								var20.method2126(176 + var51, 384369841);
							}

							var5 = var5 + var1.aByteArray1885[var14++] & 127;
							var20.method2126(var5, 321975903);
							byte var18;
							if (var5 != 0 && var5 != 32) {
								if (var5 == 1) {
									var18 = var1.aByteArray1885[var66++];
								} else if (var5 == 33) {
									var18 = var1.aByteArray1885[var55++];
								} else if (var5 == 7) {
									var18 = var1.aByteArray1885[var26++];
								} else if (var5 == 39) {
									var18 = var1.aByteArray1885[var52++];
								} else if (var5 == 10) {
									var18 = var1.aByteArray1885[var29++];
								} else if (var5 == 42) {
									var18 = var1.aByteArray1885[var56++];
								} else if (var5 == 99) {
									var18 = var1.aByteArray1885[var13++];
								} else if (var5 == 98) {
									var18 = var1.aByteArray1885[var16++];
								} else if (var5 == 101) {
									var18 = var1.aByteArray1885[var59++];
								} else if (var5 == 100) {
									var18 = var1.aByteArray1885[var28++];
								} else if (var5 != 64 && var5 != 65 && var5 != 120 && var5 != 121 && var5 != 123) {
									var18 = var1.aByteArray1885[var57++];
								} else {
									var18 = var1.aByteArray1885[var47++];
								}
							} else {
								var18 = var1.aByteArray1885[var17++];
							}

							int var67 = var18 + var63[var5];
							var63[var5] = var67;
							var20.method2126(var67 & 127, 1074755859);
						} else if (var65 == 3) {
							if (var11) {
								var20.method2126(224 + var51, 1465415971);
							}

							var21 += var1.aByteArray1885[var58++];
							var21 += var1.aByteArray1885[var22++] << 7;
							var20.method2126(var21 & 127, 1646809334);
							var20.method2126(var21 >> 7 & 127, 1178789684);
						} else if (var65 == 4) {
							if (var11) {
								var20.method2126(208 + var51, -174492929);
							}

							var44 += var1.aByteArray1885[var49++];
							var20.method2126(var44 & 127, 931870174);
						} else if (var65 == 5) {
							if (var11) {
								var20.method2126(160 + var51, 1171544803);
							}

							var50 += var1.aByteArray1885[var53++];
							var62 += var1.aByteArray1885[var48++];
							var20.method2126(var50 & 127, 321654495);
							var20.method2126(var62 & 127, 885951199);
						} else {
							if (var65 != 6) {
								throw new RuntimeException();
							}

							if (var11) {
								var20.method2126(192 + var51, 1021898905);
							}

							var20.method2126(var1.aByteArray1885[var17++], 409511681);
						}
					}
				}
			}
		}

	}

	void method2258() {
		if (aClass127_1925 == null) {
			aClass127_1925 = new Class127(16);
			int[] var3 = new int[16];
			int[] var4 = new int[16];
			var4[9] = 128;
			var3[9] = 128;
			Class103 var1 = new Class103(aByteArray1924);
			int var7 = var1.method1303();

			int var2;
			for (var2 = 0; var2 < var7; var2++) {
				var1.method1314(var2);
				var1.method1321(var2);
				var1.method1305(var2);
			}

			label81:
			do {
				while (true) {
					var2 = var1.method1318();
					int var10 = var1.anIntArray1156[var2];

					while (var1.anIntArray1156[var2] == var10) {
						var1.method1314(var2);
						int var8 = var1.method1308(var2);
						if (var8 == 1) {
							var1.method1306();
							var1.method1305(var2);
							continue label81;
						}

						int var6 = var8 & 240;
						int var9;
						int var12;
						int var13;
						if (var6 == 176) {
							var9 = var8 & 15;
							var12 = var8 >> 8 & 127;
							var13 = var8 >> 16 & 127;
							if (var12 == 0) {
								var3[var9] = (var3[var9] & -2080769) + (var13 << 14);
							}

							if (var12 == 32) {
								var3[var9] = (var3[var9] & -16257) + (var13 << 7);
							}
						}

						if (var6 == 192) {
							var9 = var8 & 15;
							var12 = var8 >> 8 & 127;
							var4[var9] = var3[var9] + var12;
						}

						if (var6 == 144) {
							var9 = var8 & 15;
							var12 = var8 >> 8 & 127;
							var13 = var8 >> 16 & 127;
							if (var13 > 0) {
								int var14 = var4[var9];
								Class117_Sub23 var11 = (Class117_Sub23) aClass127_1925.method1675((long) var14);
								if (var11 == null) {
									var11 = new Class117_Sub23(new byte[128]);
									aClass127_1925.method1666(var11, (long) var14);
								}

								var11.aByteArray2134[var12] = 1;
							}
						}

						var1.method1321(var2);
						var1.method1305(var2);
					}
				}
			} while (!var1.method1312());

		}
	}

	static Class117_Sub17 method2259(Class106 var0, int var1, int var2) {
		byte[] var3 = var0.method1380(var1, var2, (byte) 89);
		return var3 != null ? new Class117_Sub17(new Class117_Sub14(var3)) : null;
	}

	void method2266() {
		aClass127_1925 = null;
	}

}
