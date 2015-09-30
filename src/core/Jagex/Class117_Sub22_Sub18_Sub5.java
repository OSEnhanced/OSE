package core.Jagex;
public final class Class117_Sub22_Sub18_Sub5 extends Class117_Sub22_Sub18 {

	public static final int anInt2722 = 34;
	static Class117_Sub13[] aClass117_Sub13Array2747;
	static final int anInt2748 = 48;
	static Class72 aClass72_2749;
	double aDouble2734;
	double aDouble2731;
	double aDouble2744;
	double aDouble2737;
	double aDouble2738;
	double aDouble2739;
	double aDouble2740;
	double aDouble2726;
	boolean aBool2742 = false;
	int anInt2732;
	int anInt2743;
	int anInt2746 = 0;
	int anInt2745 = 0;
	int anInt2735;
	int anInt2723;
	int anInt2724;
	int anInt2725;
	int anInt2733;
	int anInt2728;
	int anInt2729;
	int anInt2730;
	int anInt2741;
	int anInt2736;
	int anInt2750;
	Class117_Sub22_Sub14 aClass117_Sub22_Sub14_2727;

	final void method3345(int var1, int var2, int var3, int var4, int var5) {
		double var8;
		if (!aBool2742) {
			var8 = (double) (var1 - anInt2724 * 1819853599);
			double var6 = (double) (var2 - anInt2725 * -1776235015);
			double var10 = Math.sqrt(var6 * var6 + var8 * var8);
			aDouble2734 = (double) (anInt2724 * 1819853599) + var8 * (double) (anInt2741 * 1884479407) / var10;
			aDouble2731 = (double) (anInt2741 * 1884479407) * var6 / var10 + (double) (anInt2725 * -1776235015);
			aDouble2744 = (double) (anInt2733 * -1289308203);
		}

		var8 = (double) (anInt2729 * -1381906559 + 1 - var4);
		aDouble2737 = ((double) var1 - aDouble2734) / var8;
		aDouble2738 = ((double) var2 - aDouble2731) / var8;
		aDouble2739 = Math.sqrt(aDouble2738 * aDouble2738 + aDouble2737 * aDouble2737);
		if (!aBool2742) {
			aDouble2740 = -aDouble2739 * Math.tan(0.02454369D * (double) (anInt2730 * 1193193099));
		}

		aDouble2726 = 2.0D * ((double) var3 - aDouble2744 - var8 * aDouble2740) / (var8 * var8);
	}

	final void method3346(int var1, byte var2) {
		aBool2742 = true;
		aDouble2734 += aDouble2737 * (double) var1;
		aDouble2731 += (double) var1 * aDouble2738;
		aDouble2744 += aDouble2740 * (double) var1 + 0.5D * aDouble2726 * (double) var1 * (double) var1;
		aDouble2740 += aDouble2726 * (double) var1;
		anInt2732 = ((int) (Math.atan2(aDouble2737, aDouble2738) * 325.949D) + 1024 & 2047) * -1984448047;
		anInt2743 = ((int) (Math.atan2(aDouble2740, aDouble2739) * 325.949D) & 2047) * 1972505381;
		if (aClass117_Sub22_Sub14_2727 != null) {
			anInt2746 += var1 * -941350437;

			while (true) {
				do {
					do {
						if (anInt2746 * -40308141 <= aClass117_Sub22_Sub14_2727.anIntArray2405[anInt2745 * -1827335191]) {
							return;
						}

						anInt2746 -= aClass117_Sub22_Sub14_2727.anIntArray2405[anInt2745 * -1827335191] * -941350437;
						anInt2745 -= 1142754215;
					} while (anInt2745 * -1827335191 < aClass117_Sub22_Sub14_2727.anIntArray2403.length);

					anInt2745 -= aClass117_Sub22_Sub14_2727.anInt2407 * -1282147249;
				}
				while (anInt2745 * -1827335191 >= 0 && anInt2745 * -1827335191 < aClass117_Sub22_Sub14_2727.anIntArray2403.length);

				anInt2745 = 0;
			}
		}
	}

	protected final Class117_Sub22_Sub18_Sub7 method2921(byte var1) {
		Class117_Sub22_Sub11 var2 = Class80.method1085(anInt2735 * -905331191, (byte) 89);
		Class117_Sub22_Sub18_Sub7 var3 = var2.method2562(anInt2745 * -1827335191, 553464185);
		if (var3 == null) {
			return null;
		} else {
			var3.method3375(anInt2743 * 1950816429);
			return var3;
		}
	}

	static void method3353(int var0, int var1, int var2, int var3, int var4) {
		for (int var5 = 0; var5 < GameClient.anInt3122 * -115854549; var5++) {
			if (GameClient.anIntArray3129[var5] + GameClient.anIntArray3022[var5] > var0 && GameClient.anIntArray3022[var5] < var2 + var0 && GameClient.anIntArray3128[var5] + GameClient.anIntArray3130[var5] > var1 && GameClient.anIntArray3128[var5] < var3 + var1) {
				GameClient.aBoolArray3062[var5] = true;
			}
		}

	}

	Class117_Sub22_Sub18_Sub5(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		anInt2735 = var1 * 1264267321;
		anInt2723 = var2 * 2008659289;
		anInt2724 = var3 * 1228470495;
		anInt2725 = var4 * 766534729;
		anInt2733 = var5 * -742733443;
		anInt2728 = var6 * -1762066451;
		anInt2729 = var7 * -151619455;
		anInt2730 = var8 * -1565931229;
		anInt2741 = var9 * -138422449;
		anInt2736 = var10 * -1886619409;
		anInt2750 = var11 * -759403815;
		aBool2742 = false;
		int var12 = Class80.method1085(anInt2735 * -905331191, (byte) 91).anInt2317 * -1181614841;
		if (var12 != -1) {
			aClass117_Sub22_Sub14_2727 = Class114_Sub1.method1838(var12, (byte) -46);
		} else {
			aClass117_Sub22_Sub14_2727 = null;
		}

	}

	static void method3354(int var0) {
		Class99.aByteArrayArrayArray1138 = (byte[][][]) null;
		Class31.aByteArrayArrayArray382 = (byte[][][]) null;
		Class28.aByteArrayArrayArray347 = (byte[][][]) null;
		Class31.aByteArrayArrayArray383 = (byte[][][]) null;
		Class40.anIntArrayArrayArray502 = (int[][][]) null;
		Class31.aByteArrayArrayArray385 = (byte[][][]) null;
		Class31.anIntArrayArray386 = (int[][]) null;
		Class130.anIntArray1586 = null;
		Class117_Sub22_Sub18_Sub1_Sub1.anIntArray2869 = null;
		Class20.anIntArray230 = null;
		Class136.anIntArray1606 = null;
		Class38.anIntArray471 = null;
	}

	public static int method3355(String var0, byte var1) {
		return var0.length() + 2;
	}

}
