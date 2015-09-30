package core.Jagex;
import java.io.*;

public class Class117_Sub22_Sub5 extends Class117_Sub22 {

	public int anInt2184;
	static Class106 aClass106_2199;
	static Class106 aClass106_2212;
	static Class106_Sub1 aClass106_Sub1_2217;
	static Class117_Sub22_Sub17_Sub2[] aClass117_Sub22_Sub17_Sub2Array2218;
	int[] anIntArray2187;
	public String aString2208 = "null";
	public int anInt2198 = -1688451895;
	public int anInt2189 = -478073175;
	public int anInt2192 = 853328619;
	public int anInt2188 = -1845267923;
	public int anInt2191 = -1887711561;
	public int anInt2193 = -1188252791;
	public int anInt2194 = -2079756821;
	public int anInt2195 = 191164879;
	short[] aShortArray2201;
	short[] aShortArray2197;
	short[] aShortArray2185;
	short[] aShortArray2209;
	int[] anIntArray2180;
	public boolean aBool2205 = true;
	public int anInt2196 = -274046781;
	int anInt2203 = -422843520;
	int anInt2204 = -492289152;
	public boolean aBool2202 = false;
	int anInt2183 = 0;
	int anInt2207 = 0;
	public int anInt2206 = 1439666449;
	public int anInt2190 = 382585184;
	int anInt2211 = -600585771;
	public boolean aBool2213 = true;
	int anInt2181 = 1816810383;
	public boolean aBool2214 = true;
	public int[] anIntArray2210;
	public boolean aBool2215 = false;
	public int anInt2216 = -1168143354;
	public String[] aStringArray2200 = new String[5];
	static Class115 aClass115_2182 = new Class115(64);
	static Class115 aClass115_2186 = new Class115(50);

	static void method2388(int var0) {
		GameClient.aClass117_Sub14_Sub1_2961.method2932(232, 261603518);
		GameClient.aClass117_Sub14_Sub1_2961.method2126(0, 1376256344);
	}

	void method2390(int var1) {
	}

	void method2391(Class117_Sub14 var1, int var2, short var3) {
		int var4;
		int var5;
		if (var2 == 1) {
			var4 = var1.method2010(-1439707937);
			anIntArray2187 = new int[var4];

			for (var5 = 0; var5 < var4; var5++) {
				anIntArray2187[var5] = var1.method2012(1053511631);
			}
		} else if (var2 == 2) {
			aString2208 = var1.method2018((byte) 65);
		} else if (var2 == 12) {
			anInt2198 = var1.method2010(-1439707937) * -1688451895;
		} else if (var2 == 13) {
			anInt2189 = var1.method2012(1053511631) * 478073175;
		} else if (var2 == 14) {
			anInt2192 = var1.method2012(1053511631) * -853328619;
		} else if (var2 == 15) {
			anInt2188 = var1.method2012(1053511631) * 1845267923;
		} else if (var2 == 16) {
			anInt2191 = var1.method2012(1053511631) * 1887711561;
		} else if (var2 == 17) {
			anInt2192 = var1.method2012(1053511631) * -853328619;
			anInt2193 = var1.method2012(1053511631) * 1188252791;
			anInt2194 = var1.method2012(1053511631) * 2079756821;
			anInt2195 = var1.method2012(1053511631) * -191164879;
		} else if (var2 >= 30 && var2 < 35) {
			aStringArray2200[var2 - 30] = var1.method2018((byte) 24);
			if (aStringArray2200[var2 - 30].equalsIgnoreCase(Class108.aString1392)) {
				aStringArray2200[var2 - 30] = null;
			}
		} else if (var2 == 40) {
			var4 = var1.method2010(-1439707937);
			aShortArray2201 = new short[var4];
			aShortArray2197 = new short[var4];

			for (var5 = 0; var5 < var4; var5++) {
				aShortArray2201[var5] = (short) var1.method2012(1053511631);
				aShortArray2197[var5] = (short) var1.method2012(1053511631);
			}
		} else if (var2 == 41) {
			var4 = var1.method2010(-1439707937);
			aShortArray2185 = new short[var4];
			aShortArray2209 = new short[var4];

			for (var5 = 0; var5 < var4; var5++) {
				aShortArray2185[var5] = (short) var1.method2012(1053511631);
				aShortArray2209[var5] = (short) var1.method2012(1053511631);
			}
		} else if (var2 == 60) {
			var4 = var1.method2010(-1439707937);
			anIntArray2180 = new int[var4];

			for (var5 = 0; var5 < var4; var5++) {
				anIntArray2180[var5] = var1.method2012(1053511631);
			}
		} else if (var2 == 93) {
			aBool2205 = false;
		} else if (var2 == 95) {
			anInt2196 = var1.method2012(1053511631) * 274046781;
		} else if (var2 == 97) {
			anInt2203 = var1.method2012(1053511631) * -2117232681;
		} else if (var2 == 98) {
			anInt2204 = var1.method2012(1053511631) * 2042974343;
		} else if (var2 == 99) {
			aBool2202 = true;
		} else if (var2 == 100) {
			anInt2183 = var1.method1997(-1022303679) * 1444612269;
		} else if (var2 == 101) {
			anInt2207 = var1.method1997(1463145879) * -1106948269;
		} else if (var2 == 102) {
			anInt2206 = var1.method2012(1053511631) * -1439666449;
		} else if (var2 == 103) {
			anInt2190 = var1.method2012(1053511631) * 1622568523;
		} else if (var2 == 106) {
			anInt2211 = var1.method2012(1053511631) * 600585771;
			if (anInt2211 * -1469785981 == 65535) {
				anInt2211 = -600585771;
			}

			anInt2181 = var1.method2012(1053511631) * -1816810383;
			if (anInt2181 * -1998023535 == 65535) {
				anInt2181 = 1816810383;
			}

			var4 = var1.method2010(-1439707937);
			anIntArray2210 = new int[1 + var4];

			for (var5 = 0; var5 <= var4; var5++) {
				anIntArray2210[var5] = var1.method2012(1053511631);
				if (anIntArray2210[var5] == 65535) {
					anIntArray2210[var5] = -1;
				}
			}
		} else if (var2 == 107) {
			aBool2213 = false;
		} else if (var2 == 109) {
			aBool2214 = false;
		} else if (var2 == 111) {
			aBool2215 = true;
		} else if (var2 == 112) {
			anInt2216 = var1.method2010(-1439707937) * -897931571;
		}

	}

	public final Class117_Sub22_Sub18_Sub7 method2392(Class117_Sub22_Sub14 var1, int var2, Class117_Sub22_Sub14 var3, int var4, int var5) {
		if (anIntArray2210 != null) {
			Class117_Sub22_Sub5 var13 = method2394(-1903167902);
			return var13 == null ? null : var13.method2392(var1, var2, var3, var4, 459619760);
		} else {
			Class117_Sub22_Sub18_Sub7 var7 = (Class117_Sub22_Sub18_Sub7) aClass115_2186.method1515((long) (anInt2184 * -446840273));
			if (var7 == null) {
				boolean var6 = false;

				for (int var8 = 0; var8 < anIntArray2187.length; var8++) {
					if (!aClass106_2199.method1382(anIntArray2187[var8], 0, (byte) 98)) {
						var6 = true;
					}
				}

				if (var6) {
					return null;
				}

				Class117_Sub22_Sub18_Sub4[] var9 = new Class117_Sub22_Sub18_Sub4[anIntArray2187.length];

				int var10;
				for (var10 = 0; var10 < anIntArray2187.length; var10++) {
					var9[var10] = Class117_Sub22_Sub18_Sub4.method3155(aClass106_2199, anIntArray2187[var10], 0);
				}

				Class117_Sub22_Sub18_Sub4 var12;
				if (var9.length == 1) {
					var12 = var9[0];
				} else {
					var12 = new Class117_Sub22_Sub18_Sub4(var9, var9.length);
				}

				if (aShortArray2201 != null) {
					for (var10 = 0; var10 < aShortArray2201.length; var10++) {
						var12.method3168(aShortArray2201[var10], aShortArray2197[var10]);
					}
				}

				if (aShortArray2185 != null) {
					for (var10 = 0; var10 < aShortArray2185.length; var10++) {
						var12.method3220(aShortArray2185[var10], aShortArray2209[var10]);
					}
				}

				var7 = var12.method3183(64 + anInt2183 * 387160869, anInt2207 * 192741447 + 850, -30, -50, -30);
				aClass115_2186.method1517(var7, (long) (anInt2184 * -446840273));
			}

			Class117_Sub22_Sub18_Sub7 var11;
			if (var1 != null && var3 != null) {
				var11 = var1.method2639(var7, var2, var3, var4, -1067518943);
			} else if (var1 != null) {
				var11 = var1.method2636(var7, var2, -1635122104);
			} else if (var3 != null) {
				var11 = var3.method2636(var7, var4, -2085711255);
			} else {
				var11 = var7.method3406(true);
			}

			if (anInt2203 * -67089433 != 128 || anInt2204 * 1782740279 != 128) {
				var11.method3382(anInt2203 * -67089433, anInt2204 * 1782740279, anInt2203 * -67089433);
			}

			return var11;
		}
	}

	public final Class117_Sub22_Sub18_Sub4 method2393(byte var1) {
		if (anIntArray2210 != null) {
			Class117_Sub22_Sub5 var6 = method2394(1939040629);
			return var6 == null ? null : var6.method2393((byte) 34);
		} else if (anIntArray2180 == null) {
			return null;
		} else {
			boolean var2 = false;

			for (int var5 = 0; var5 < anIntArray2180.length; var5++) {
				if (!aClass106_2199.method1382(anIntArray2180[var5], 0, (byte) -27)) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			} else {
				Class117_Sub22_Sub18_Sub4[] var8 = new Class117_Sub22_Sub18_Sub4[anIntArray2180.length];

				for (int var3 = 0; var3 < anIntArray2180.length; var3++) {
					var8[var3] = Class117_Sub22_Sub18_Sub4.method3155(aClass106_2199, anIntArray2180[var3], 0);
				}

				Class117_Sub22_Sub18_Sub4 var7;
				if (var8.length != 1) {
					var7 = new Class117_Sub22_Sub18_Sub4(var8, var8.length);
				} else {
					var7 = var8[0];
				}

				int var4;
				if (aShortArray2201 != null) {
					for (var4 = 0; var4 < aShortArray2201.length; var4++) {
						var7.method3168(aShortArray2201[var4], aShortArray2197[var4]);
					}
				}

				if (aShortArray2185 != null) {
					for (var4 = 0; var4 < aShortArray2185.length; var4++) {
						var7.method3220(aShortArray2185[var4], aShortArray2209[var4]);
					}
				}

				return var7;
			}
		}
	}

	public final Class117_Sub22_Sub5 method2394(int var1) {
		int var2 = -1;
		if (anInt2211 * -1469785981 != -1) {
			var2 = Class35.method507(anInt2211 * -1469785981, -1601317717);
		} else if (anInt2181 * -1998023535 != -1) {
			var2 = Class97.anIntArray1129[anInt2181 * -1998023535];
		}

		return var2 >= 0 && var2 < anIntArray2210.length && anIntArray2210[var2] != -1 ? Class117_Sub7.method1952(anIntArray2210[var2], (byte) 0) : null;
	}

	void method2397(Class117_Sub14 var1, int var2) {
		while (true) {
			int var3 = var1.method2010(-1439707937);
			if (var3 == 0) {
				return;
			}

			method2391(var1, var3, (short) 6306);
		}
	}

	static String method2402(Throwable var0, short var1) throws IOException {
		String var7;
		if (var0 instanceof RuntimeException_Sub1) {
			RuntimeException_Sub1 var6 = (RuntimeException_Sub1) var0;
			var7 = var6.aString2833 + " | ";
			var0 = var6.aThrowable2836;
		} else {
			var7 = "";
		}

		StringWriter var13 = new StringWriter();
		PrintWriter var8 = new PrintWriter(var13);
		var0.printStackTrace(var8);
		var8.close();
		String var10 = var13.toString();
		BufferedReader var11 = new BufferedReader(new StringReader(var10));
		String var9 = var11.readLine();

		while (true) {
			while (true) {
				String var2 = var11.readLine();
				if (var2 == null) {
					var7 = var7 + "| " + var9;
					return var7;
				}

				int var3 = var2.indexOf(40);
				int var4 = var2.indexOf(41, var3 + 1);
				if (var3 >= 0 && var4 >= 0) {
					String var5 = var2.substring(1 + var3, var4);
					int var12 = var5.indexOf(".java:");
					if (var12 >= 0) {
						var5 = var5.substring(0, var12) + var5.substring(var12 + 5);
						var7 = var7 + var5 + ' ';
						continue;
					}

					var2 = var2.substring(0, var3);
				}

				var2 = var2.trim();
				var2 = var2.substring(var2.lastIndexOf(32) + 1);
				var2 = var2.substring(var2.lastIndexOf(9) + 1);
				var7 = var7 + var2 + ' ';
			}
		}
	}

	public boolean method2404(byte var1) {
		if (anIntArray2210 == null) {
			return true;
		} else {
			int var2 = -1;
			if (anInt2211 * -1469785981 != -1) {
				var2 = Class35.method507(anInt2211 * -1469785981, 1849765464);
			} else if (anInt2181 * -1998023535 != -1) {
				var2 = Class97.anIntArray1129[anInt2181 * -1998023535];
			}

			return var2 >= 0 && var2 < anIntArray2210.length && anIntArray2210[var2] != -1;
		}
	}

	public static boolean method2416(String var0, int var1, byte var2) {
		return Class117_Sub22_Sub15.method2834(var0, var1, "openjs", -1994299560);
	}

}
