package core.Jagex;
import java.util.Calendar;
import java.util.TimeZone;

public class Class62 {

	public static final int anInt769 = 216;
	public static final int anInt772 = 9;
	static String[][] aStringArrayArray773 = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}};
	static String[] aStringArray770 = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
	static Calendar aCalendar771;

	public static byte[] method924(Object var0, boolean var1, byte var2) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var4 = (byte[]) ((byte[]) var0);
			return !var1 ? var4 : Class117_Sub11.method1973(var4, 549334431);
		} else if (var0 instanceof Class57) {
			Class57 var3 = (Class57) var0;
			return var3.method855(2093705279);
		} else {
			throw new IllegalArgumentException();
		}
	}

	Class62() throws Throwable {
		throw new Error();
	}

	static {
		Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
		aCalendar771 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}

	static int method926(Class117_Sub19 var0, int var1, int var2) {
		if (var0.anIntArrayArray2059 != null && var1 < var0.anIntArrayArray2059.length) {
			try {
				int[] var3 = var0.anIntArrayArray2059[var1];
				int var4 = 0;
				int var5 = 0;
				byte var6 = 0;

				while (true) {
					int var7 = var3[var5++];
					int var8 = 0;
					byte var9 = 0;
					if (var7 == 0) {
						return var4;
					}

					if (var7 == 1) {
						var8 = GameClient.anIntArray3055[var3[var5++]];
					}

					if (var7 == 2) {
						var8 = GameClient.anIntArray3056[var3[var5++]];
					}

					if (var7 == 3) {
						var8 = GameClient.anIntArray3057[var3[var5++]];
					}

					int var10;
					Class117_Sub19 var11;
					int var12;
					int var13;
					if (var7 == 4) {
						var10 = var3[var5++] << 16;
						var10 += var3[var5++];
						var11 = Class74.method1010(var10, -1919723748);
						var12 = var3[var5++];
						if (var12 != -1 && (!Class117_Sub13.method1992(var12, 46551904).aBool2241 || GameClient.aBool2920)) {
							for (var13 = 0; var13 < var11.anIntArray2049.length; var13++) {
								if (1 + var12 == var11.anIntArray2049[var13]) {
									var8 += var11.anIntArray2058[var13];
								}
							}
						}
					}

					if (var7 == 5) {
						var8 = Class97.anIntArray1129[var3[var5++]];
					}

					if (var7 == 6) {
						var8 = Class87.anIntArray1017[GameClient.anIntArray3056[var3[var5++]] - 1];
					}

					if (var7 == 7) {
						var8 = Class97.anIntArray1129[var3[var5++]] * 100 / 46875;
					}

					if (var7 == 8) {
						var8 = Class31.player.anInt2874 * -1654863477;
					}

					if (var7 == 9) {
						for (var10 = 0; var10 < 25; var10++) {
							if (Class87.aBoolArray1015[var10]) {
								var8 += GameClient.anIntArray3056[var10];
							}
						}
					}

					if (var7 == 10) {
						var10 = var3[var5++] << 16;
						var10 += var3[var5++];
						var11 = Class74.method1010(var10, -811509985);
						var12 = var3[var5++];
						if (var12 != -1 && (!Class117_Sub13.method1992(var12, 96205782).aBool2241 || GameClient.aBool2920)) {
							for (var13 = 0; var13 < var11.anIntArray2049.length; var13++) {
								if (var12 + 1 == var11.anIntArray2049[var13]) {
									var8 = 999999999;
									break;
								}
							}
						}
					}

					if (var7 == 11) {
						var8 = GameClient.anInt2932 * 2064875789;
					}

					if (var7 == 12) {
						var8 = GameClient.anInt3085 * 1515954537;
					}

					if (var7 == 13) {
						var10 = Class97.anIntArray1129[var3[var5++]];
						int var15 = var3[var5++];
						var8 = (var10 & 1 << var15) != 0 ? 1 : 0;
					}

					if (var7 == 14) {
						var10 = var3[var5++];
						var8 = Class35.method507(var10, 1033278887);
					}

					if (var7 == 15) {
						var9 = 1;
					}

					if (var7 == 16) {
						var9 = 2;
					}

					if (var7 == 17) {
						var9 = 3;
					}

					if (var7 == 18) {
						var8 = Class117_Sub22_Sub20.anInt2497 * 544615727 + (Class31.player.anInt2577 * 1961555871 >> 7);
					}

					if (var7 == 19) {
						var8 = Class117_Sub22_Sub19.anInt2468 * -771797447 + (Class31.player.anInt2567 * -184603173 >> 7);
					}

					if (var7 == 20) {
						var8 = var3[var5++];
					}

					if (var9 == 0) {
						if (var6 == 0) {
							var4 += var8;
						}

						if (var6 == 1) {
							var4 -= var8;
						}

						if (var6 == 2 && var8 != 0) {
							var4 /= var8;
						}

						if (var6 == 3) {
							var4 *= var8;
						}

						var6 = 0;
					} else {
						var6 = var9;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}

}
