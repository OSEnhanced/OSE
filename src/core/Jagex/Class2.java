package core.Jagex;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;

public class Class2 {

	static String[] aStringArray10;
	public static int anInt11;
	public static final int anInt16 = 235;
	static int[] anIntArray20;
	public static final int anInt22 = 80;
	public static final int anInt23 = 210;
	public static final int anInt24 = 118;
	static int[] anIntArray9 = new int[5];
	static int[][] anIntArrayArray12 = new int[5][5000];
	static int[] anIntArray13 = new int[1000];
	static String[] aStringArray14 = new String[1000];
	static int anInt15 = 0;
	static Class32[] aClass32Array17 = new Class32[50];
	static Calendar aCalendar19 = Calendar.getInstance();
	static String[] aStringArray18 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	static int anInt21 = 0;

	public static void method55(Class106 var0, byte var1) {
		Class117_Sub22_Sub8.aClass106_2281 = var0;
	}

	public static void method60(Class117_Sub14_Sub1 var0, int var1) {
		Class117_Sub24 var2 = (Class117_Sub24) Class138.aClass126_1623.method1653();
		if (var2 != null) {
			int var3 = var0.anInt1880 * 561453169;
			var0.method2183(var2.anInt2141 * -1032558107, (byte) 66);

			for (int var4 = 0; var4 < var2.anInt2136 * 1311913905; var4++) {
				if (var2.anIntArray2138[var4] != 0) {
					var0.method2126(var2.anIntArray2138[var4], 1908763036);
				} else {
					try {
						int var5 = var2.anIntArray2137[var4];
						Field var6;
						int var7;
						if (var5 == 0) {
							var6 = var2.aFieldArray2140[var4];
							var7 = var6.getInt((Object) null);
							var0.method2126(0, 71854983);
							var0.method2183(var7, (byte) 18);
						} else if (var5 == 1) {
							var6 = var2.aFieldArray2140[var4];
							var6.setInt((Object) null, var2.anIntArray2135[var4]);
							var0.method2126(0, 213582041);
						} else if (var5 == 2) {
							var6 = var2.aFieldArray2140[var4];
							var7 = var6.getModifiers();
							var0.method2126(0, 1871125412);
							var0.method2183(var7, (byte) 48);
						}

						Method var23;
						if (var5 != 3) {
							if (var5 == 4) {
								var23 = var2.aMethodArray2139[var4];
								var7 = var23.getModifiers();
								var0.method2126(0, 298635533);
								var0.method2183(var7, (byte) 61);
							}
						} else {
							var23 = var2.aMethodArray2139[var4];
							byte[][] var24 = var2.aByteArrayArrayArray2142[var4];
							Object[] var8 = new Object[var24.length];

							for (int var9 = 0; var9 < var24.length; var9++) {
								ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var24[var9]));
								var8[var9] = var10.readObject();
							}

							Object var25 = var23.invoke((Object) null, var8);
							if (var25 == null) {
								var0.method2126(0, 1530796932);
							} else if (var25 instanceof Number) {
								var0.method2126(1, 765866218);
								var0.method2029(((Number) var25).longValue());
							} else if (var25 instanceof String) {
								var0.method2126(2, 894842744);
								var0.method2001((String) var25, 1926727168);
							} else {
								var0.method2126(4, 16405897);
							}
						}
					} catch (ClassNotFoundException var11) {
						var0.method2126(-10, 1749585457);
					} catch (InvalidClassException var12) {
						var0.method2126(-11, 1386393630);
					} catch (StreamCorruptedException var13) {
						var0.method2126(-12, 1964006790);
					} catch (OptionalDataException var14) {
						var0.method2126(-13, 140017768);
					} catch (IllegalAccessException var15) {
						var0.method2126(-14, 338295036);
					} catch (IllegalArgumentException var16) {
						var0.method2126(-15, -5465511);
					} catch (InvocationTargetException var17) {
						var0.method2126(-16, 2078748432);
					} catch (SecurityException var18) {
						var0.method2126(-17, 1970782004);
					} catch (IOException var19) {
						var0.method2126(-18, 1186859966);
					} catch (NullPointerException var20) {
						var0.method2126(-19, 1712307052);
					} catch (Exception var21) {
						var0.method2126(-20, 490922358);
					} catch (Throwable var22) {
						var0.method2126(-21, -10137644);
					}
				}
			}

			var0.method2031(var3, -207352465);
			var2.method1532();
		}
	}

	Class2() throws Throwable {
		throw new Error();
	}

	static boolean method62(Class117_Sub19 var0, short var1) {
		if (var0.anIntArray2084 == null) {
			return false;
		} else {
			for (int var2 = 0; var2 < var0.anIntArray2084.length; var2++) {
				int var3 = Class62.method926(var0, var2, -1978002087);
				int var4 = var0.anIntArray2085[var2];
				if (var0.anIntArray2084[var2] == 2) {
					if (var3 >= var4) {
						return false;
					}
				} else if (var0.anIntArray2084[var2] == 3) {
					if (var3 <= var4) {
						return false;
					}
				} else if (var0.anIntArray2084[var2] == 4) {
					if (var4 == var3) {
						return false;
					}
				} else if (var4 != var3) {
					return false;
				}
			}

			return true;
		}
	}

	static int method63(int var0) {
		return GameClient.aBool3133 ? 2 : 1;
	}

}
