package core.Jagex;
public class Class117_Sub22_Sub2 extends Class117_Sub22 {

	public static final int anInt2156 = 82;
	static final int anInt2159 = 40;
	public static final int anInt2160 = 28;
	static final int anInt2161 = 101;
	static Class117_Sub22_Sub17_Sub2[] aClass117_Sub22_Sub17_Sub2Array2162;
	public static final int anInt2163 = 168;
	public static final int anInt2164 = 94;
	public int anInt2158 = 0;
	static Class115 aClass115_2157 = new Class115(64);

	void method2356(Class117_Sub14 var1, short var2) {
		while (true) {
			int var3 = var1.method2010(-1439707937);
			if (var3 == 0) {
				return;
			}

			method2357(var1, var3, (byte) 85);
		}
	}

	void method2357(Class117_Sub14 var1, int var2, byte var3) {
		if (var2 == 2) {
			anInt2158 = var1.method2012(1053511631) * 1893426881;
		}

	}

	static void method2363(Class24[] var0, int var1, int var2, int[] var3, int[] var4, int var5) {
		if (var1 < var2) {
			int var9 = var1 - 1;
			int var10 = 1 + var2;
			int var13 = (var2 + var1) / 2;
			Class24 var8 = var0[var13];
			var0[var13] = var0[var1];
			var0[var1] = var8;

			while (var9 < var10) {
				boolean var11 = true;

				int var6;
				int var7;
				int var12;
				do {
					--var10;

					for (var12 = 0; var12 < 4; var12++) {
						if (var3[var12] == 2) {
							var6 = var0[var10].anInt296 * 917086431;
							var7 = var8.anInt296 * 917086431;
						} else if (var3[var12] == 1) {
							var6 = var0[var10].anInt300 * -1696774655;
							var7 = var8.anInt300 * -1696774655;
							if (var6 == -1 && var4[var12] == 1) {
								var6 = 2001;
							}

							if (var7 == -1 && var4[var12] == 1) {
								var7 = 2001;
							}
						} else if (var3[var12] == 3) {
							var6 = var0[var10].method371(1640588) ? 1 : 0;
							var7 = var8.method371(1640588) ? 1 : 0;
						} else {
							var6 = var0[var10].anInt294 * 571351125;
							var7 = var8.anInt294 * 571351125;
						}

						if (var6 != var7) {
							if ((var4[var12] != 1 || var6 <= var7) && (var4[var12] != 0 || var6 >= var7)) {
								var11 = false;
							}
							break;
						}

						if (var12 == 3) {
							var11 = false;
						}
					}
				} while (var11);

				var11 = true;

				do {
					++var9;

					for (var12 = 0; var12 < 4; var12++) {
						if (var3[var12] == 2) {
							var6 = var0[var9].anInt296 * 917086431;
							var7 = var8.anInt296 * 917086431;
						} else if (var3[var12] == 1) {
							var6 = var0[var9].anInt300 * -1696774655;
							var7 = var8.anInt300 * -1696774655;
							if (var6 == -1 && var4[var12] == 1) {
								var6 = 2001;
							}

							if (var7 == -1 && var4[var12] == 1) {
								var7 = 2001;
							}
						} else if (var3[var12] == 3) {
							var6 = var0[var9].method371(1640588) ? 1 : 0;
							var7 = var8.method371(1640588) ? 1 : 0;
						} else {
							var6 = var0[var9].anInt294 * 571351125;
							var7 = var8.anInt294 * 571351125;
						}

						if (var7 != var6) {
							if ((var4[var12] != 1 || var6 >= var7) && (var4[var12] != 0 || var6 <= var7)) {
								var11 = false;
							}
							break;
						}

						if (var12 == 3) {
							var11 = false;
						}
					}
				} while (var11);

				if (var9 < var10) {
					Class24 var14 = var0[var9];
					var0[var9] = var0[var10];
					var0[var10] = var14;
				}
			}

			method2363(var0, var1, var10, var3, var4, -1903846458);
			method2363(var0, var10 + 1, var2, var3, var4, -1183152208);
		}

	}

}
