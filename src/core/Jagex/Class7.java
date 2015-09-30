package core.Jagex;
import java.io.File;
import java.io.RandomAccessFile;

public class Class7 {

	static final int anInt88 = 47;
	static final int anInt89 = 2;
	static final int anInt90 = 7;
	static final int anInt91 = 5;
	static final int anInt92 = 1;
	static final int anInt93 = 8;
	static final int anInt94 = 9;
	static Class88 aClass88_95;
	static final int anInt96 = 3;
	static final int anInt97 = 28;
	static int[] anIntArray98;
	static final int anInt99 = 17;
	public static boolean aBool100;
	static byte[][] aByteArrayArray101;
	static final int anInt102 = 20;
	public static final int anInt103 = 59;
	static Class117_Sub19 aClass117_Sub19_104;

	static void method116(Class117_Sub22_Sub18_Sub1 var0, int var1, int var2) {
		int var3;
		int var4;
		int var5;
		Class117_Sub22_Sub14 var13;
		if (var0.anInt2585 * -624254305 > GameClient.anInt2923 * -488599663) {
			var5 = var0.anInt2585 * -624254305 - GameClient.anInt2923 * -488599663;
			var4 = var0.anInt2581 * 1351936128 + var0.anInt2545 * -659115712;
			var3 = var0.anInt2583 * -422062464 + var0.anInt2545 * -659115712;
			var0.anInt2577 += (var4 - var0.anInt2577 * 1961555871) / var5 * -2090048417;
			var0.anInt2567 += (var3 - var0.anInt2567 * -184603173) / var5 * -672987565;
			var0.anInt2597 = 0;
			var0.anInt2590 = var0.anInt2587 * 1707749791;
		} else if (var0.anInt2586 * -1286160125 >= GameClient.anInt2923 * -488599663) {
			Class28.method414(var0, (short) -20152);
		} else {
			var0.anInt2568 = var0.anInt2544 * -63369251;
			if (var0.anInt2593 * 1000346769 == 0) {
				var0.anInt2597 = 0;
			} else {
				label416:
				{
					if (var0.anInt2558 * -919017135 != -1 && var0.anInt2543 * 341825591 == 0) {
						var13 = Class114_Sub1.method1838(var0.anInt2558 * -919017135, (byte) -30);
						if (var0.anInt2598 * -1843051545 > 0 && var13.anInt2414 * -1392738025 == 0) {
							var0.anInt2597 -= 1486282287;
							break label416;
						}

						if (var0.anInt2598 * -1843051545 <= 0 && var13.anInt2415 * 1618076415 == 0) {
							var0.anInt2597 -= 1486282287;
							break label416;
						}
					}

					var5 = var0.anInt2577 * 1961555871;
					var4 = var0.anInt2567 * -184603173;
					var3 = var0.anIntArray2594[var0.anInt2593 * 1000346769 - 1] * 128 + var0.anInt2545 * -659115712;
					int var9 = var0.anIntArray2541[var0.anInt2593 * 1000346769 - 1] * 128 + var0.anInt2545 * -659115712;
					if (var5 < var3) {
						if (var4 < var9) {
							var0.anInt2590 = 701257472;
						} else if (var4 > var9) {
							var0.anInt2590 = 1840753920;
						} else {
							var0.anInt2590 = -876477952;
						}
					} else if (var5 > var3) {
						if (var4 < var9) {
							var0.anInt2590 = -438238976;
						} else if (var4 > var9) {
							var0.anInt2590 = -1577735424;
						} else {
							var0.anInt2590 = 1139496448;
						}
					} else if (var4 < var9) {
						var0.anInt2590 = -2015974400;
					} else if (var4 > var9) {
						var0.anInt2590 = 0;
					}

					byte var10 = var0.aByteArray2596[var0.anInt2593 * 1000346769 - 1];
					if (var3 - var5 <= 256 && var3 - var5 >= -256 && var9 - var4 <= 256 && var9 - var4 >= -256) {
						int var8 = var0.anInt2590 * 965827843 - var0.anInt2542 * 240902973 & 2047;
						if (var8 > 1024) {
							var8 -= 2048;
						}

						int var6 = var0.anInt2599 * -178255353;
						if (var8 >= -256 && var8 <= 256) {
							var6 = var0.anInt2548 * -250918153;
						} else if (var8 >= 256 && var8 < 768) {
							var6 = var0.anInt2553 * 1571606889;
						} else if (var8 >= -768 && var8 <= -256) {
							var6 = var0.anInt2574 * 647616611;
						}

						if (var6 == -1) {
							var6 = var0.anInt2548 * -250918153;
						}

						var0.anInt2568 = var6 * -324074645;
						int var7 = 4;
						boolean var11 = true;
						if (var0 instanceof Class117_Sub22_Sub18_Sub1_Sub1) {
							var11 = ((Class117_Sub22_Sub18_Sub1_Sub1) var0).aClass117_Sub22_Sub5_2864.aBool2214;
						}

						if (var11) {
							if (var0.anInt2542 * 240902973 != var0.anInt2590 * 965827843 && var0.anInt2565 * -771439697 == -1 && var0.anInt2549 * -242447087 != 0) {
								var7 = 2;
							}

							if (var0.anInt2593 * 1000346769 > 2) {
								var7 = 6;
							}

							if (var0.anInt2593 * 1000346769 > 3) {
								var7 = 8;
							}

							if (var0.anInt2597 * -430254287 > 0 && var0.anInt2593 * 1000346769 > 1) {
								var7 = 8;
								var0.anInt2597 += 1486282287;
							}
						} else {
							if (var0.anInt2593 * 1000346769 > 1) {
								var7 = 6;
							}

							if (var0.anInt2593 * 1000346769 > 2) {
								var7 = 8;
							}

							if (var0.anInt2597 * -430254287 > 0 && var0.anInt2593 * 1000346769 > 1) {
								var7 = 8;
								var0.anInt2597 += 1486282287;
							}
						}

						if (var10 == 2) {
							var7 <<= 1;
						}

						if (var7 >= 8 && var0.anInt2548 * -250918153 == var0.anInt2568 * -2098720445 && var0.anInt2552 * -2083761033 != -1) {
							var0.anInt2568 = var0.anInt2552 * -323112259;
						}

						if (var3 != var5 || var4 != var9) {
							if (var5 < var3) {
								var0.anInt2577 += var7 * -2090048417;
								if (var0.anInt2577 * 1961555871 > var3) {
									var0.anInt2577 = var3 * -2090048417;
								}
							} else if (var5 > var3) {
								var0.anInt2577 -= var7 * -2090048417;
								if (var0.anInt2577 * 1961555871 < var3) {
									var0.anInt2577 = var3 * -2090048417;
								}
							}

							if (var4 < var9) {
								var0.anInt2567 += var7 * -672987565;
								if (var0.anInt2567 * -184603173 > var9) {
									var0.anInt2567 = var9 * -672987565;
								}
							} else if (var4 > var9) {
								var0.anInt2567 -= var7 * -672987565;
								if (var0.anInt2567 * -184603173 < var9) {
									var0.anInt2567 = var9 * -672987565;
								}
							}
						}

						if (var0.anInt2577 * 1961555871 == var3 && var9 == var0.anInt2567 * -184603173) {
							var0.anInt2593 -= 1290677361;
							if (var0.anInt2598 * -1843051545 > 0) {
								var0.anInt2598 += 1253236777;
							}
						}
					} else {
						var0.anInt2577 = var3 * -2090048417;
						var0.anInt2567 = var9 * -672987565;
						var0.anInt2593 -= 1290677361;
						if (var0.anInt2598 * -1843051545 > 0) {
							var0.anInt2598 += 1253236777;
						}
					}
				}
			}
		}

		if (var0.anInt2577 * 1961555871 < 128 || var0.anInt2567 * -184603173 < 128 || var0.anInt2577 * 1961555871 >= 13184 || var0.anInt2567 * -184603173 >= 13184) {
			var0.anInt2558 = -1804599217;
			var0.anInt2550 = 953061807;
			var0.anInt2585 = 0;
			var0.anInt2586 = 0;
			var0.anInt2577 = var0.anIntArray2594[0] * -1238225024 + var0.anInt2545 * 1342752448;
			var0.anInt2567 = var0.anIntArray2541[0] * -243062400 + var0.anInt2545 * 1998780352;
			var0.method3080(1215155572);
		}

		if (Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393 == var0 && (var0.anInt2577 * 1961555871 < 1536 || var0.anInt2567 * -184603173 < 1536 || var0.anInt2577 * 1961555871 >= 11776 || var0.anInt2567 * -184603173 >= 11776)) {
			var0.anInt2558 = -1804599217;
			var0.anInt2550 = 953061807;
			var0.anInt2585 = 0;
			var0.anInt2586 = 0;
			var0.anInt2577 = var0.anInt2545 * 1342752448 + var0.anIntArray2594[0] * -1238225024;
			var0.anInt2567 = var0.anIntArray2541[0] * -243062400 + var0.anInt2545 * 1998780352;
			var0.method3080(1215155572);
		}

		Class117_Sub15.method2222(var0, -2077883213);
		var0.aBool2576 = false;
		if (var0.anInt2568 * -2098720445 != -1) {
			var13 = Class114_Sub1.method1838(var0.anInt2568 * -2098720445, (byte) -101);
			if (var13 != null && var13.anIntArray2403 != null) {
				var0.anInt2570 -= 701732161;
				if (var0.anInt2569 * 1646089229 < var13.anIntArray2403.length && var0.anInt2570 * -1107032769 > var13.anIntArray2405[var0.anInt2569 * 1646089229]) {
					var0.anInt2570 = -701732161;
					var0.anInt2569 -= 2043077947;
					Class92.method1227(var13, var0.anInt2569 * 1646089229, var0.anInt2577 * 1961555871, var0.anInt2567 * -184603173, -1584549591);
				}

				if (var0.anInt2569 * 1646089229 >= var13.anIntArray2403.length) {
					var0.anInt2570 = 0;
					var0.anInt2569 = 0;
					Class92.method1227(var13, var0.anInt2569 * 1646089229, var0.anInt2577 * 1961555871, var0.anInt2567 * -184603173, 929920799);
				}
			} else {
				var0.anInt2568 = 324074645;
			}
		}

		if (var0.anInt2550 * -1214866767 != -1 && GameClient.anInt2923 * -488599663 >= var0.anInt2579 * -1506129171) {
			if (var0.anInt2571 * -1581587247 < 0) {
				var0.anInt2571 = 0;
			}

			var5 = Class80.method1085(var0.anInt2550 * -1214866767, (byte) 76).anInt2317 * -1181614841;
			if (var5 != -1) {
				Class117_Sub22_Sub14 var12 = Class114_Sub1.method1838(var5, (byte) -53);
				if (var12 != null && var12.anIntArray2403 != null) {
					var0.anInt2578 += 217026655;
					if (var0.anInt2571 * -1581587247 < var12.anIntArray2403.length && var0.anInt2578 * 1384565663 > var12.anIntArray2405[var0.anInt2571 * -1581587247]) {
						var0.anInt2578 = 217026655;
						var0.anInt2571 -= 72092623;
						Class92.method1227(var12, var0.anInt2571 * -1581587247, var0.anInt2577 * 1961555871, var0.anInt2567 * -184603173, -874031286);
					}

					if (var0.anInt2571 * -1581587247 >= var12.anIntArray2403.length && (var0.anInt2571 * -1581587247 < 0 || var0.anInt2571 * -1581587247 >= var12.anIntArray2403.length)) {
						var0.anInt2550 = 953061807;
					}
				} else {
					var0.anInt2550 = 953061807;
				}
			} else {
				var0.anInt2550 = 953061807;
			}
		}

		if (var0.anInt2558 * -919017135 != -1 && var0.anInt2543 * 341825591 <= 1) {
			var13 = Class114_Sub1.method1838(var0.anInt2558 * -919017135, (byte) -38);
			if (var13.anInt2414 * -1392738025 == 1 && var0.anInt2598 * -1843051545 > 0 && var0.anInt2585 * -624254305 <= GameClient.anInt2923 * -488599663 && var0.anInt2586 * -1286160125 < GameClient.anInt2923 * -488599663) {
				var0.anInt2543 = -1461756537;
				return;
			}
		}

		if (var0.anInt2558 * -919017135 != -1 && var0.anInt2543 * 341825591 == 0) {
			var13 = Class114_Sub1.method1838(var0.anInt2558 * -919017135, (byte) -92);
			if (var13 != null && var13.anIntArray2403 != null) {
				var0.anInt2573 += 1292539925;
				if (var0.anInt2572 * -1717673467 < var13.anIntArray2403.length && var0.anInt2573 * -1029146819 > var13.anIntArray2405[var0.anInt2572 * -1717673467]) {
					var0.anInt2573 = 1292539925;
					var0.anInt2572 -= 267707699;
					Class92.method1227(var13, var0.anInt2572 * -1717673467, var0.anInt2577 * 1961555871, var0.anInt2567 * -184603173, -1146812604);
				}

				if (var0.anInt2572 * -1717673467 >= var13.anIntArray2403.length) {
					var0.anInt2572 -= var13.anInt2407 * 1825353467;
					var0.anInt2575 += 238941789;
					if (var0.anInt2575 * 1911197173 >= var13.anInt2413 * -20560839) {
						var0.anInt2558 = -1804599217;
					} else if (var0.anInt2572 * -1717673467 >= 0 && var0.anInt2572 * -1717673467 < var13.anIntArray2403.length) {
						Class92.method1227(var13, var0.anInt2572 * -1717673467, var0.anInt2577 * 1961555871, var0.anInt2567 * -184603173, -1364279762);
					} else {
						var0.anInt2558 = -1804599217;
					}
				}

				var0.aBool2576 = var13.aBool2409;
			} else {
				var0.anInt2558 = -1804599217;
			}
		}

		if (var0.anInt2543 * 341825591 > 0) {
			var0.anInt2543 += 1461756537;
		}

	}

	public static boolean method117(File var0, boolean var1, int var2) {
		try {
			RandomAccessFile var3 = new RandomAccessFile(var0, "rw");
			int var4 = var3.read();
			var3.seek(0L);
			var3.write(var4);
			var3.seek(0L);
			var3.close();
			if (var1) {
				var0.delete();
			}

			return true;
		} catch (Exception var5) {
			return false;
		}
	}

	Class7() throws Throwable {
		throw new Error();
	}

	public static void method118(int var0) {
		Class117_Sub22_Sub14.aClass115_2401.method1518();
		Class117_Sub22_Sub14.aClass115_2402.method1518();
	}

}
