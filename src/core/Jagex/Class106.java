package core.Jagex;
public abstract class Class106 {

	static final int anInt1189 = 1;
	public static final int anInt1192 = 87;
	boolean aBool1176;
	boolean aBool1188;
	public int anInt1187;
	int anInt1174;
	int[] anIntArray1179;
	int[] anIntArray1178;
	int[] anIntArray1191;
	int[] anIntArray1180;
	int[][] anIntArrayArray1181;
	Object[] anObjectArray1184;
	Object[][] anObjectArrayArray1185;
	int[] anIntArray1186;
	Class113 aClass113_1177;
	int[][] anIntArrayArray1182;
	Class113[] aClass113Array1175;
	static Class64 aClass64_1183 = new Class64();
	static int anInt1190 = 0;

	public byte[] method1380(int var1, int var2, byte var3) {
		return method1381(var1, var2, (int[]) null, -566250926);
	}

	public byte[] method1381(int var1, int var2, int[] var3, int var4) {
		if (var1 >= 0 && var1 < anObjectArrayArray1185.length && anObjectArrayArray1185[var1] != null && var2 >= 0 && var2 < anObjectArrayArray1185[var1].length) {
			if (anObjectArrayArray1185[var1][var2] == null) {
				boolean var5 = method1429(var1, var3, 708450960);
				if (!var5) {
					method1387(var1, 1657355286);
					var5 = method1429(var1, var3, 1131408775);
					if (!var5) {
						return null;
					}
				}
			}

			byte[] var6 = Class62.method924(anObjectArrayArray1185[var1][var2], false, (byte) -21);
			if (aBool1188) {
				anObjectArrayArray1185[var1][var2] = null;
			}

			return var6;
		} else {
			return null;
		}
	}

	public boolean method1382(int var1, int var2, byte var3) {
		if (var1 >= 0 && var1 < anObjectArrayArray1185.length && anObjectArrayArray1185[var1] != null && var2 >= 0 && var2 < anObjectArrayArray1185[var1].length) {
			if (anObjectArrayArray1185[var1][var2] != null) {
				return true;
			} else if (anObjectArray1184[var1] != null) {
				return true;
			} else {
				method1387(var1, -824494623);
				return anObjectArray1184[var1] != null;
			}
		} else {
			return false;
		}
	}

	Class106(boolean var1, boolean var2) {
		aBool1176 = var1;
		aBool1188 = var2;
	}

	public int method1383(int var1, String var2, byte var3) {
		var2 = var2.toLowerCase();
		return aClass113Array1175[var1].method1509(Class15.method314(var2, (byte) 50));
	}

	public byte[] method1384(int var1, int var2) {
		if (anObjectArrayArray1185.length == 1) {
			return method1380(0, var1, (byte) 59);
		} else if (anObjectArrayArray1185[var1].length != 1) {
			throw new RuntimeException();
		} else {
			return method1380(var1, 0, (byte) 115);
		}
	}

	public byte[] method1386(int var1, int var2) {
		if (anObjectArrayArray1185.length == 1) {
			return method1433(0, var1, (byte) 16);
		} else if (anObjectArrayArray1185[var1].length == 1) {
			return method1433(var1, 0, (byte) 16);
		} else {
			throw new RuntimeException();
		}
	}

	void method1387(int var1, int var2) {
	}

	public int method1390(byte var1) {
		return anObjectArrayArray1185.length;
	}

	public int method1391(String var1, int var2) {
		var1 = var1.toLowerCase();
		return aClass113_1177.method1509(Class15.method314(var1, (byte) 50));
	}

	public void method1392(byte var1) {
		for (int var2 = 0; var2 < anObjectArrayArray1185.length; var2++) {
			if (anObjectArrayArray1185[var2] != null) {
				for (int var3 = 0; var3 < anObjectArrayArray1185[var2].length; var3++) {
					anObjectArrayArray1185[var2][var3] = null;
				}
			}
		}

	}

	public boolean method1393(int var1) {
		boolean var2 = true;

		for (int var4 = 0; var4 < anIntArray1179.length; var4++) {
			int var3 = anIntArray1179[var4];
			if (anObjectArray1184[var3] == null) {
				method1387(var3, -589521409);
				if (anObjectArray1184[var3] == null) {
					var2 = false;
				}
			}
		}

		return var2;
	}

	public boolean method1394(String var1, byte var2) {
		int var3 = method1391("", -1081948996);
		return var3 != -1 ? method1405("", var1, (byte) -72) : method1405(var1, "", (byte) 72);
	}

	void method1395(byte[] var1, int var2) {
		int var3 = var1.length;
		int var10 = -1;

		int var9;
		for (var9 = 0; var9 < var3; var9++) {
			var10 = var10 >>> 8 ^ Class117_Sub14.anIntArray1879[(var10 ^ var1[var9]) & 255];
		}

		var10 = ~var10;
		anInt1187 = var10 * 1640646823;
		Class117_Sub14 var7 = new Class117_Sub14(Class28.method416(var1, 2133650707));
		var10 = var7.method2010(-1439707937);
		if (var10 >= 5 && var10 <= 7) {
			if (var10 >= 6) {
				var7.method2015((byte) 10);
			}

			var9 = var7.method2010(-1439707937);
			if (var10 >= 7) {
				anInt1174 = var7.method2077((byte) 100) * -1690125321;
			} else {
				anInt1174 = var7.method2012(1053511631) * -1690125321;
			}

			int var6 = 0;
			int var15 = -1;
			anIntArray1179 = new int[anInt1174 * -1400343097];
			int var12;
			if (var10 >= 7) {
				for (var12 = 0; var12 < anInt1174 * -1400343097; var12++) {
					anIntArray1179[var12] = var6 += var7.method2077((byte) 100);
					if (anIntArray1179[var12] > var15) {
						var15 = anIntArray1179[var12];
					}
				}
			} else {
				for (var12 = 0; var12 < anInt1174 * -1400343097; var12++) {
					anIntArray1179[var12] = var6 += var7.method2012(1053511631);
					if (anIntArray1179[var12] > var15) {
						var15 = anIntArray1179[var12];
					}
				}
			}

			anIntArray1178 = new int[1 + var15];
			anIntArray1191 = new int[var15 + 1];
			anIntArray1180 = new int[1 + var15];
			anIntArrayArray1181 = new int[1 + var15][];
			anObjectArray1184 = new Object[1 + var15];
			anObjectArrayArray1185 = new Object[1 + var15][];
			if (var9 != 0) {
				anIntArray1186 = new int[var15 + 1];

				for (var12 = 0; var12 < anInt1174 * -1400343097; var12++) {
					anIntArray1186[anIntArray1179[var12]] = var7.method2015((byte) 83);
				}

				aClass113_1177 = new Class113(anIntArray1186);
			}

			for (var12 = 0; var12 < anInt1174 * -1400343097; var12++) {
				anIntArray1178[anIntArray1179[var12]] = var7.method2015((byte) 49);
			}

			for (var12 = 0; var12 < anInt1174 * -1400343097; var12++) {
				anIntArray1191[anIntArray1179[var12]] = var7.method2015((byte) 82);
			}

			for (var12 = 0; var12 < anInt1174 * -1400343097; var12++) {
				anIntArray1180[anIntArray1179[var12]] = var7.method2012(1053511631);
			}

			int var4;
			int var5;
			int var8;
			int var11;
			int var14;
			if (var10 >= 7) {
				for (var12 = 0; var12 < anInt1174 * -1400343097; var12++) {
					var4 = anIntArray1179[var12];
					var11 = anIntArray1180[var4];
					var6 = 0;
					var14 = -1;
					anIntArrayArray1181[var4] = new int[var11];

					for (var5 = 0; var5 < var11; var5++) {
						var8 = anIntArrayArray1181[var4][var5] = var6 += var7.method2077((byte) 100);
						if (var8 > var14) {
							var14 = var8;
						}
					}

					anObjectArrayArray1185[var4] = new Object[var14 + 1];
				}
			} else {
				for (var12 = 0; var12 < anInt1174 * -1400343097; var12++) {
					var4 = anIntArray1179[var12];
					var11 = anIntArray1180[var4];
					var6 = 0;
					var14 = -1;
					anIntArrayArray1181[var4] = new int[var11];

					for (var5 = 0; var5 < var11; var5++) {
						var8 = anIntArrayArray1181[var4][var5] = var6 += var7.method2012(1053511631);
						if (var8 > var14) {
							var14 = var8;
						}
					}

					anObjectArrayArray1185[var4] = new Object[1 + var14];
				}
			}

			if (var9 != 0) {
				anIntArrayArray1182 = new int[var15 + 1][];
				aClass113Array1175 = new Class113[var15 + 1];

				for (var12 = 0; var12 < anInt1174 * -1400343097; var12++) {
					var4 = anIntArray1179[var12];
					var11 = anIntArray1180[var4];
					anIntArrayArray1182[var4] = new int[anObjectArrayArray1185[var4].length];

					for (var14 = 0; var14 < var11; var14++) {
						anIntArrayArray1182[var4][anIntArrayArray1181[var4][var14]] = var7.method2015((byte) 41);
					}

					aClass113Array1175[var4] = new Class113(anIntArrayArray1182[var4]);
				}
			}

		} else {
			throw new RuntimeException("");
		}
	}

	public byte[] method1396(String var1, String var2, int var3) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = aClass113_1177.method1509(Class15.method314(var1, (byte) 50));
		int var5 = aClass113Array1175[var4].method1509(Class15.method314(var2, (byte) 50));
		return method1380(var4, var5, (byte) 17);
	}

	public int method1399(int var1, int var2) {
		return anObjectArrayArray1185[var1].length;
	}

	public void method1401(int var1, int var2) {
		for (int var3 = 0; var3 < anObjectArrayArray1185[var1].length; var3++) {
			anObjectArrayArray1185[var1][var3] = null;
		}

	}

	public boolean method1405(String var1, String var2, byte var3) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = aClass113_1177.method1509(Class15.method314(var1, (byte) 50));
		int var5 = aClass113Array1175[var4].method1509(Class15.method314(var2, (byte) 50));
		return method1382(var4, var5, (byte) 10);
	}

	boolean method1429(int var1, int[] var2, int var3) {
		if (anObjectArray1184[var1] == null) {
			return false;
		} else {
			int var4 = anIntArray1180[var1];
			int[] var5 = anIntArrayArray1181[var1];
			Object[] var6 = anObjectArrayArray1185[var1];
			boolean var7 = true;

			for (int var8 = 0; var8 < var4; var8++) {
				if (var6[var5[var8]] == null) {
					var7 = false;
					break;
				}
			}

			if (var7) {
				return true;
			} else {
				byte[] var23;
				if (var2 != null && (var2[0] != 0 || var2[1] != 0 || var2[2] != 0 || var2[3] != 0)) {
					var23 = Class62.method924(anObjectArray1184[var1], true, (byte) 0);
					Class117_Sub14 var9 = new Class117_Sub14(var23);
					var9.method2148(var2, 5, var9.aByteArray1885.length, -2113208458);
				} else {
					var23 = Class62.method924(anObjectArray1184[var1], false, (byte) -42);
				}

				int var13;
				int var14;
				int var15;
				int var18;
				byte[] var24;
				try {
					var24 = Class28.method416(var23, 282367766);
				} catch (RuntimeException var22) {
					String var12 = "" + (var2 != null) + "," + var1 + "," + var23.length + ",";
					var13 = var23.length;
					var14 = -1;

					for (var15 = 0; var15 < var13; var15++) {
						var14 = var14 >>> 8 ^ Class117_Sub14.anIntArray1879[(var14 ^ var23[var15]) & 255];
					}

					var14 = ~var14;
					String var27 = var12 + var14 + ",";
					var18 = var23.length - 2;
					int var19 = -1;

					for (int var20 = 0; var20 < var18; var20++) {
						var19 = var19 >>> 8 ^ Class117_Sub14.anIntArray1879[(var19 ^ var23[var20]) & 255];
					}

					var19 = ~var19;
					throw Class117_Sub22_Sub3.method2372(var22, var27 + var19 + "," + anIntArray1178[var1] + "," + anInt1187 * 1499914007);
				}

				if (aBool1176) {
					anObjectArray1184[var1] = null;
				}

				if (var4 > 1) {
					int var10 = var24.length;
					--var10;
					int var11 = var24[var10] & 255;
					var10 -= var11 * var4 * 4;
					Class117_Sub14 var25 = new Class117_Sub14(var24);
					int[] var17 = new int[var4];
					var25.anInt1880 = var10 * -2079217519;

					int var16;
					for (var13 = 0; var13 < var11; var13++) {
						var16 = 0;

						for (var14 = 0; var14 < var4; var14++) {
							var16 += var25.method2015((byte) 102);
							var17[var14] += var16;
						}
					}

					byte[][] var26 = new byte[var4][];

					for (var16 = 0; var16 < var4; var16++) {
						var26[var16] = new byte[var17[var16]];
						var17[var16] = 0;
					}

					var25.anInt1880 = var10 * -2079217519;
					var16 = 0;

					for (var14 = 0; var14 < var11; var14++) {
						var15 = 0;

						for (var18 = 0; var18 < var4; var18++) {
							var15 += var25.method2015((byte) 84);
							System.arraycopy(var24, var16, var26[var18], var17[var18], var15);
							var17[var18] += var15;
							var16 += var15;
						}
					}

					for (var14 = 0; var14 < var4; var14++) {
						if (!aBool1188) {
							var6[var5[var14]] = Class3.method67(var26[var14], false, -2060487975);
						} else {
							var6[var5[var14]] = var26[var14];
						}
					}
				} else if (!aBool1188) {
					var6[var5[0]] = Class3.method67(var24, false, -2061183442);
				} else {
					var6[var5[0]] = var24;
				}

				return true;
			}
		}
	}

	public byte[] method1433(int var1, int var2, byte var3) {
		if (var1 >= 0 && var1 < anObjectArrayArray1185.length && anObjectArrayArray1185[var1] != null && var2 >= 0 && var2 < anObjectArrayArray1185[var1].length) {
			if (anObjectArrayArray1185[var1][var2] == null) {
				boolean var4 = method1429(var1, (int[]) null, 677473400);
				if (!var4) {
					method1387(var1, -1156368201);
					var4 = method1429(var1, (int[]) null, 1185942382);
					if (!var4) {
						return null;
					}
				}
			}

			byte[] var5 = Class62.method924(anObjectArrayArray1185[var1][var2], false, (byte) -38);
			return var5;
		} else {
			return null;
		}
	}

	public void method1438(String var1, int var2) {
		var1 = var1.toLowerCase();
		int var3 = aClass113_1177.method1509(Class15.method314(var1, (byte) 50));
		if (var3 >= 0) {
			method1466(var3, 810916369);
		}
	}

	public int[] method1439(int var1, byte var2) {
		return anIntArrayArray1181[var1];
	}

	public boolean method1464(int var1, byte var2) {
		if (anObjectArray1184[var1] != null) {
			return true;
		} else {
			method1387(var1, 2106215711);
			return anObjectArray1184[var1] != null;
		}
	}

	void method1466(int var1, int var2) {
	}

}
