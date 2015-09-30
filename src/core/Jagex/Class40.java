package core.Jagex;
public final class Class40 {

	int anInt491;
	int anInt492;
	int anInt493;
	int anInt494;
	int anInt495;
	public Class117_Sub22_Sub18 aClass117_Sub22_Sub18_496;
	static Class117_Sub22_Sub17_Sub3[] aClass117_Sub22_Sub17_Sub3Array497;
	int anInt498;
	int anInt499;
	public Class117_Sub22_Sub18 aClass117_Sub22_Sub18_501;
	static int[][][] anIntArrayArrayArray502;
	public static final int anInt503 = 85;
	public static Class117_Sub22_Sub20 aClass117_Sub22_Sub20_504;
	public static Class117_Sub17 aClass117_Sub17_505;
	public int anInt500 = 0;
	int anInt506 = 0;

	static void method527(int var0, int var1, int var2, int var3, int var4) {
		for (Class117_Sub6 var5 = (Class117_Sub6) Class117_Sub6.aClass120_1769.method1577(); var5 != null; var5 = (Class117_Sub6) Class117_Sub6.aClass120_1769.method1582()) {
			if (var5.anInt1766 * 1601270233 != -1 || var5.anIntArray1759 != null) {
				int var8 = 0;
				if (var1 > var5.anInt1763 * 345024315) {
					var8 += var1 - var5.anInt1763 * 345024315;
				} else if (var1 < var5.anInt1765 * 768633691) {
					var8 += var5.anInt1765 * 768633691 - var1;
				}

				if (var2 > var5.anInt1776 * -578386079) {
					var8 += var2 - var5.anInt1776 * -578386079;
				} else if (var2 < var5.anInt1762 * -786896473) {
					var8 += var5.anInt1762 * -786896473 - var2;
				}

				if (var8 - 64 <= var5.anInt1773 * 420773081 && GameClient.anInt2948 * 1581116715 != 0 && var0 == var5.anInt1760 * 2037698023) {
					var8 -= 64;
					if (var8 < 0) {
						var8 = 0;
					}

					int var9 = (var5.anInt1773 * 420773081 - var8) * GameClient.anInt2948 * 1581116715 / (var5.anInt1773 * 420773081);
					if (var5.aClass117_Sub2_Sub2_1767 == null) {
						if (var5.anInt1766 * 1601270233 >= 0) {
							Class10 var11 = Class10.method162(Class58.aClass106_Sub1_753, var5.anInt1766 * 1601270233, 0);
							if (var11 != null) {
								Class117_Sub4_Sub1 var7 = var11.method150().method2674(Class117_Sub7.aClass20_1789);
								Class117_Sub2_Sub2 var10 = Class117_Sub2_Sub2.method2706(var7, 100, var9);
								var10.method2709(-1);
								Class117_Sub13.aClass117_Sub2_Sub1_1871.method2678(var10);
								var5.aClass117_Sub2_Sub2_1767 = var10;
							}
						}
					} else {
						var5.aClass117_Sub2_Sub2_1767.method2710(var9);
					}

					if (var5.aClass117_Sub2_Sub2_1764 == null) {
						if (var5.anIntArray1759 != null && (var5.anInt1771 -= var3 * 1033789459) * -1712559589 <= 0) {
							int var14 = (int) (Math.random() * (double) var5.anIntArray1759.length);
							Class10 var12 = Class10.method162(Class58.aClass106_Sub1_753, var5.anIntArray1759[var14], 0);
							if (var12 != null) {
								Class117_Sub4_Sub1 var13 = var12.method150().method2674(Class117_Sub7.aClass20_1789);
								Class117_Sub2_Sub2 var6 = Class117_Sub2_Sub2.method2706(var13, 100, var9);
								var6.method2709(0);
								Class117_Sub13.aClass117_Sub2_Sub1_1871.method2678(var6);
								var5.aClass117_Sub2_Sub2_1764 = var6;
								var5.anInt1771 = (var5.anInt1761 * 475832239 + (int) (Math.random() * (double) (var5.anInt1772 * 144417193 - var5.anInt1761 * 475832239))) * 1033789459;
							}
						}
					} else {
						var5.aClass117_Sub2_Sub2_1764.method2710(var9);
						if (!var5.aClass117_Sub2_Sub2_1764.method1533()) {
							var5.aClass117_Sub2_Sub2_1764 = null;
						}
					}
				} else {
					if (var5.aClass117_Sub2_Sub2_1767 != null) {
						Class117_Sub13.aClass117_Sub2_Sub1_1871.method2679(var5.aClass117_Sub2_Sub2_1767);
						var5.aClass117_Sub2_Sub2_1767 = null;
					}

					if (var5.aClass117_Sub2_Sub2_1764 != null) {
						Class117_Sub13.aClass117_Sub2_Sub1_1871.method2679(var5.aClass117_Sub2_Sub2_1764);
						var5.aClass117_Sub2_Sub2_1764 = null;
					}
				}
			}
		}

	}

	static void method528(int var0) {
		GameClient.aLong3121 = 1618749821913333797L;
		GameClient.anInt3159 = -1393129829;
		Class70.aClass28_858.anInt351 = 0;
		Class131.aBool1589 = true;
		GameClient.aBool2963 = true;
		GameClient.aLong3045 = 8391544638048747903L;
		Class138.aClass126_1623 = new Class126();
		GameClient.aClass117_Sub14_Sub1_2961.anInt1880 = 0;
		GameClient.aClass117_Sub14_Sub1_2953.anInt1880 = 0;
		GameClient.incomingMessageId = 512475507;
		GameClient.anInt2982 = 913542275;
		GameClient.anInt2969 = -390733297;
		GameClient.anInt2992 = -998552057;
		GameClient.anInt2966 = 0;
		GameClient.anInt2933 = 0;
		GameClient.anInt3101 = 0;
		GameClient.anInt3095 = 0;
		GameClient.anInt3060 = 0;
		GameClient.aBool3059 = false;
		Class117_Sub22_Sub4.method2385(0, (byte) 93);
		Class35.aMap440.clear();
		Class35.aClass118_442.method1542();
		Class35.aClass123_441.method1631();
		Class35.anInt439 = 0;
		GameClient.anInt3071 = 0;
		GameClient.aBool3074 = false;
		GameClient.anInt3162 = 0;
		GameClient.anInt2939 = ((int) (Math.random() * 100.0D) - 50) * 1181391357;
		GameClient.anInt3145 = ((int) (Math.random() * 110.0D) - 55) * -1443166571;
		GameClient.anInt2987 = ((int) (Math.random() * 80.0D) - 40) * 1480600865;
		GameClient.anInt2990 = ((int) (Math.random() * 120.0D) - 60) * -840321387;
		GameClient.anInt3202 = ((int) (Math.random() * 30.0D) - 20) * -1983821035;
		GameClient.anInt3005 = ((int) (Math.random() * 20.0D) - 10 & 2047) * 109370805;
		GameClient.anInt3155 = 0;
		GameClient.anInt3160 = -42975717;
		GameClient.anInt3153 = 0;
		GameClient.anInt3154 = 0;
		GameClient.aClass36_3077 = Class36.aClass36_451;
		GameClient.anInt2956 = 0;
		Class4.anInt46 = 0;

		int var1;
		for (var1 = 0; var1 < 2048; var1++) {
			Class4.aClass117_Sub14Array39[var1] = null;
			Class4.aByteArray38[var1] = 1;
		}

		for (var1 = 0; var1 < 2048; var1++) {
			GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var1] = null;
		}

		for (var1 = 0; var1 < 32768; var1++) {
			GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[var1] = null;
		}

		GameClient.anInt3084 = 1428519581;
		GameClient.aClass120_3186.method1574();
		GameClient.aClass120_3054.method1574();

		for (var1 = 0; var1 < 4; var1++) {
			for (int var3 = 0; var3 < 104; var3++) {
				for (int var2 = 0; var2 < 104; var2++) {
					GameClient.aClass120ArrayArrayArray3051[var1][var3][var2] = null;
				}
			}
		}

		GameClient.aClass120_3052 = new Class120();
		GameClient.anInt3188 = 0;
		GameClient.anInt3198 = 0;
		GameClient.anInt2976 = 0;

		for (var1 = 0; var1 < Class117_Sub22_Sub15.anInt2453 * 432029757; var1++) {
			Class117_Sub22_Sub15 var4 = Class117_Sub22_Sub4.method2386(var1, 1754700459);
			if (var4 != null) {
				Class97.anIntArray1127[var1] = 0;
				Class97.anIntArray1129[var1] = 0;
			}
		}

		Class69.aClass46_851.method758((byte) -34);
		GameClient.anInt2983 = 875598665;
		if (GameClient.anInt3036 * -1635287017 != -1) {
			Class52.method821(GameClient.anInt3036 * -1635287017, (byte) 8);
		}

		for (Class117_Sub10 var5 = (Class117_Sub10) GameClient.aClass127_3080.method1668(); var5 != null; var5 = (Class117_Sub10) GameClient.aClass127_3080.method1669()) {
			Class41.method536(var5, true, -935492002);
		}

		GameClient.anInt3036 = 1825720409;
		GameClient.aClass127_3080 = new Class127(8);
		GameClient.aClass117_Sub19_3083 = null;
		GameClient.aBool3059 = false;
		GameClient.anInt3060 = 0;
		GameClient.aClass91_3193.method1189((int[]) null, new int[]{0, 0, 0, 0, 0}, false, -1, (byte) -103);

		for (var1 = 0; var1 < 8; var1++) {
			GameClient.aStringArray2936[var1] = null;
			GameClient.aBoolArray2986[var1] = false;
		}

		Class117_Sub22_Sub18_Sub6.method3360((byte) -115);
		GameClient.aBool2935 = true;

		for (var1 = 0; var1 < 100; var1++) {
			GameClient.aBoolArray3124[var1] = true;
		}

		GameClient.aClass117_Sub14_Sub1_2961.method2932(133, 2017709200);
		GameClient.aClass117_Sub14_Sub1_2961.method2126(Class2.method63(920166314), 1099707710);
		GameClient.aClass117_Sub14_Sub1_2961.method1996(Class80.anInt952 * 1566500665, (byte) -60);
		GameClient.aClass117_Sub14_Sub1_2961.method1996(Class117_Sub22_Sub18_Sub2.anInt2613 * 1325743505, (byte) -32);
		GameClient.aString3146 = null;
		Class29.anInt362 = 0;
		Class117_Sub22_Sub18_Sub5.aClass117_Sub13Array2747 = null;

		for (var1 = 0; var1 < 8; var1++) {
			GameClient.aClass143Array3196[var1] = new Class143();
		}

		Class117_Sub12.aClass141_1858 = null;
	}

	static void method529(byte var0) {
		int var3;
		if (GameClient.anInt3036 * -1635287017 != -1) {
			var3 = GameClient.anInt3036 * -1635287017;
			if (Class4.method85(var3, -1759920377)) {
				Class117_Sub14_Sub1.method2955(Class117_Sub19.aClass117_Sub19ArrayArray2032[var3], -1, (byte) 54);
			}
		}

		for (var3 = 0; var3 < GameClient.anInt3122 * -115854549; var3++) {
			if (GameClient.aBoolArray3124[var3]) {
				GameClient.aBoolArray3062[var3] = true;
			}

			GameClient.aBoolArray3179[var3] = GameClient.aBoolArray3124[var3];
			GameClient.aBoolArray3124[var3] = false;
		}

		GameClient.anInt3191 = GameClient.anInt2923 * 699477911;
		GameClient.anInt3115 = 399284979;
		GameClient.anInt3068 = -1831800237;
		Class7.aClass117_Sub19_104 = null;
		if (GameClient.anInt3036 * -1635287017 != -1) {
			GameClient.anInt3122 = 0;
			Class122.method1629(GameClient.anInt3036 * -1635287017, 0, 0, Class80.anInt952 * 1566500665, Class117_Sub22_Sub18_Sub2.anInt2613 * 1325743505, 0, 0, -1, 1065943590);
		}

		Class117_Sub22_Sub17.method2863();
		if (!GameClient.aBool3059) {
			if (GameClient.anInt3115 * -1759841851 != -1) {
				Class93.method1228(GameClient.anInt3115 * -1759841851, GameClient.anInt3068 * -795615707, (byte) 97);
			}
		} else {
			var3 = Class28.anInt359 * -185062675;
			int var4 = Class114_Sub1.anInt1673 * 1102988949;
			int var6 = Class54.anInt735 * -2038284061;
			int var8 = Class45.anInt599 * -915640919;
			int var7 = 6116423;
			Class117_Sub22_Sub17.method2877(var3, var4, var6, var8, var7);
			Class117_Sub22_Sub17.method2877(1 + var3, var4 + 1, var6 - 2, 16, 0);
			Class117_Sub22_Sub17.method2872(var3 + 1, var4 + 18, var6 - 2, var8 - 19, 0);
			Class54_Sub1.aClass117_Sub22_Sub17_Sub4_Sub1_1729.method3471(Class108.aString1247, 3 + var3, 14 + var4, var7, -1);
			int var9 = Class75.anInt903 * -456706193;
			int var2 = Class75.anInt904 * 1381104939;

			for (int var1 = 0; var1 < GameClient.anInt3060 * 1223430109; var1++) {
				int var5 = (GameClient.anInt3060 * 1223430109 - 1 - var1) * 15 + var4 + 31;
				int var10 = 16777215;
				if (var9 > var3 && var9 < var3 + var6 && var2 > var5 - 13 && var2 < var5 + 3) {
					var10 = 16776960;
				}

				Class54_Sub1.aClass117_Sub22_Sub17_Sub4_Sub1_1729.method3471(Class117_Sub19.method2284(var1, 2098658053), var3 + 3, var5, var10, 0);
			}

			Class117_Sub22_Sub18_Sub5.method3353(Class28.anInt359 * -185062675, Class114_Sub1.anInt1673 * 1102988949, Class54.anInt735 * -2038284061, Class45.anInt599 * -915640919, -884617177);
		}

		if (GameClient.anInt3131 * 317367717 == 3) {
			for (var3 = 0; var3 < GameClient.anInt3122 * -115854549; var3++) {
				if (GameClient.aBoolArray3179[var3]) {
					Class117_Sub22_Sub17.method2869(GameClient.anIntArray3022[var3], GameClient.anIntArray3128[var3], GameClient.anIntArray3129[var3], GameClient.anIntArray3130[var3], 16711935, 128);
				} else if (GameClient.aBoolArray3062[var3]) {
					Class117_Sub22_Sub17.method2869(GameClient.anIntArray3022[var3], GameClient.anIntArray3128[var3], GameClient.anIntArray3129[var3], GameClient.anIntArray3130[var3], 16711680, 128);
				}
			}
		}

		method527(Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, Class31.player.anInt2577 * 1961555871, Class31.player.anInt2567 * -184603173, GameClient.anInt3092 * -402053703, 1759318775);
		GameClient.anInt3092 = 0;
	}

}
