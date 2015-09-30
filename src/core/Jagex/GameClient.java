package core.Jagex;
import java.awt.*;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Iterator;

public final class GameClient extends Applet_Sub1 {

	static Class106_Sub1 aClass106_Sub1_2947;
	static Class81 aClass81_2960;
	static Class117_Sub22_Sub17_Sub4_Sub1 aClass117_Sub22_Sub17_Sub4_Sub1_2973;
	static int anInt2995;
	static Class117_Sub22_Sub17_Sub3[] aClass117_Sub22_Sub17_Sub3Array2996;
	static Class117_Sub22_Sub17_Sub3[] aClass117_Sub22_Sub17_Sub3Array2997;
	static int[] anIntArray3108;
	static Class106_Sub1 aClass106_Sub1_3137;
	static final int anInt3161 = 50;
	static final String aString3172 = "oldschool";
	static final int anInt3203 = 83;
	static boolean aBool3204;
	static final int anInt3205 = 500;
	public static final int anInt3206 = 120;
	public static final int anInt3208 = 111;
	static int anInt2923 = 0;
	static int anInt3117;
	static int anInt2933 = 0;
	static int anInt3101;
	static int anInt2974;
	static boolean aBool2972;
	static int anInt3060;
	static int anInt3199;
	static int anInt2978;
	static int incomingMessageId;
	static int anInt2964;
	static int anInt2966;
	static int anInt2992;
	static int anInt2969;
	static int anInt2982;
	static long aLong3121 = 1618749821913333797L;
	static int anInt2932;
	static int anInt3116;
	static boolean aBool3168;
	static int anInt3207;
	static int anInt3011;
	static boolean aBool3070;
	static long aLong3045;
	static int anInt2928 = -283221591;
	static int anInt2929 = 2080903411;
	static boolean aBool2963 = true;
	static int anInt3159 = -1393129829;
	static int anInt2971;
	static Class117_Sub19 aClass117_Sub19_3083;
	static int anInt3036;
	static int anInt3188;
	static int anInt3112;
	static int anInt3092;
	static Class127 aClass127_3053;
	static int anInt3049;
	static int anInt3026;
	static int anInt3138;
	static int anInt3031;
	static int anInt3032;
	static Class117_Sub19 aClass117_Sub19_3096;
	static boolean aBool3100;
	static boolean aBool3097;
	static int anInt2925;
	static int anInt3104;
	static int anInt3141;
	static int anInt3039;
	static int anInt3166;
	static int anInt3093;
	static int anInt3028;
	static int anInt3140;
	static int anInt3153;
	static int anInt3154;
	static boolean aBool3038;
	static boolean aBool3059;
	static long aLong3197;
	static long aLong2926;
	static int anInt3069;
	static int anInt3095 = 0;
	static int anInt2914 = 0;
	static int anInt3034;
	static int anInt3035;
	static int anInt2949;
	static int anInt3167 = 0;
	static int anInt3171 = 0;
	static int anInt2927 = 0;
	static int anInt3114;
	static int anInt2930;
	static int anInt3006;
	static int anInt3030;
	static int anInt3113;
	static int anInt3008;
	static int anInt2937 = 0;
	static int anInt2938 = 0;
	static int anInt2934 = 0;
	static int anInt3005;
	static int anInt3004;
	static int anInt3155;
	static int anInt3063;
	static int anInt2976;
	static int anInt3110;
	static int anInt2989;
	static int anInt2939;
	static int anInt2984;
	static int anInt3085;
	static int anInt3145;
	static int anInt2987;
	static int anInt3086;
	static int anInt2988;
	static int anInt2994;
	static String aString3146;
	static String aString3147;
	static int anInt2990;
	static int anInt2991;
	static int anInt3202;
	static int anInt2993;
	static int anInt2967;
	static int anInt3198;
	static long aLong3132;
	static int anInt2975;
	static int anInt2977;
	static int anInt2924 = 0;
	static int anInt2945;
	static int anInt3200;
	static int anInt3013;
	static int anInt2954;
	static boolean aBool2915 = true;
	static int anInt2916 = 927678295;
	static int anInt3087 = 0;
	static int anInt2918 = 0;
	static boolean aBool2920 = false;
	static boolean aBool2921 = false;
	static int anInt2922 = 0;
	static boolean aBool2935 = true;
	static boolean aBool3182 = true;
	static Class36 aClass36_3077;
	static int anInt2943;
	static int anInt2985;
	static int anInt2950;
	static int anInt3106;
	static int anInt3089;
	static Class117_Sub22_Sub18_Sub1_Sub1[] aClass117_Sub22_Sub18_Sub1_Sub1Array2942;
	static int anInt2956;
	static int[] anIntArray2957;
	static int anInt2958;
	static int[] anIntArray3125;
	static Class117_Sub14_Sub1 aClass117_Sub14_Sub1_2961;
	static Class117_Sub14_Sub1 aClass117_Sub14_Sub1_2962;
	static Class117_Sub14_Sub1 aClass117_Sub14_Sub1_2953;
	static Class51[] aClass51Array3174;
	static boolean aBool2980;
	static int[][][] anIntArrayArrayArray2981;
	static int[] anIntArray3027;
	static int anInt2998;
	static int anInt3190;
	static int anInt3000;
	static int anInt3001;
	static boolean aBool3002;
	static int anInt3003;
	static int anInt3010;
	static int anInt3014;
	static int anInt3015;
	static int[] anIntArray3016;
	static int[] anIntArray3017;
	static int[] anIntArray3018;
	static int[] anIntArray3007;
	static int[] anIntArray3020;
	static int[] anIntArray3189;
	static int[] anIntArray2940;
	static String[] aStringArray3023;
	static int[][] anIntArrayArray3024;
	static int anInt3025;
	static int anInt2941;
	static int anInt3187;
	static int anInt3033;
	static int anInt3037;
	static int anInt2952;
	static Class117_Sub22_Sub18_Sub1_Sub2[] aClass117_Sub22_Sub18_Sub1_Sub2Array3041;
	static int anInt3042;
	static int anInt3043;
	static int anInt3044;
	static int[] anIntArray2917;
	static int[] anIntArray3046;
	static String[] aStringArray2936;
	static boolean[] aBoolArray2986;
	static int[] anIntArray3151;
	static int anInt3084;
	static Class120[][][] aClass120ArrayArrayArray3051;
	static Class120 aClass120_3052;
	static Class120 aClass120_3186;
	static Class120 aClass120_3054;
	static int[] anIntArray3055;
	static int[] anIntArray3056;
	static int[] anIntArray3057;
	static int anInt3149;
	static int[] anIntArray3061;
	static int[] anIntArray3009;
	static int[] anIntArray2999;
	static int[] anIntArray3064;
	static String[] aStringArray3065;
	static String[] aStringArray3066;
	static int anInt3115;
	static int anInt3068;
	static int anInt3123;
	static int anInt3071;
	static String aString3058;
	static boolean aBool3074;
	static int anInt3075;
	static int anInt3076;
	static String aString2931;
	static String aString3078;
	static Class127 aClass127_3080;
	static int anInt3081;
	static int anInt3082;
	static int anInt3073;
	static int anInt2983;
	static boolean aBool3088;
	static boolean aBool3072;
	static boolean aBool3090;
	static Class117_Sub19 aClass117_Sub19_3091;
	static Class117_Sub19 aClass117_Sub19_3019;
	static Class117_Sub19 aClass117_Sub19_3157;
	static int anInt3184;
	static int anInt3048;
	static int anInt3079;
	static int anInt3099;
	static int anInt2951;
	static int anInt3102;
	static boolean aBool3103;
	static int[] anIntArray3050;
	static int[] anIntArray3107;
	static int[] anIntArray3109;
	static int anInt3111;
	static Class120 aClass120_3118;
	static Class120 aClass120_3119;
	static Class120 aClass120_3120;
	static int anInt3122;
	static int anInt3191;
	static boolean[] aBoolArray3124;
	static boolean[] aBoolArray3062;
	static boolean[] aBoolArray3179;
	static int[] anIntArray3022;
	static int[] anIntArray3128;
	static int[] anIntArray3129;
	static int[] anIntArray3130;
	static int anInt3131;
	static boolean aBool3133;
	static int anInt3134;
	static int anInt3135;
	static int[] anIntArray3136;
	static String aString3139;
	static long[] aLongArray2970;
	static int[] anIntArray3143;
	static int[] anIntArray3144;
	static int anInt3160;
	static int anInt2968;
	static int[] anIntArray3150;
	static int[] anIntArray3127;
	static Class117_Sub22_Sub17_Sub3[] aClass117_Sub22_Sub17_Sub3Array3152;
	static int anInt3156;
	static int anInt3021;
	static boolean aBool3158;
	static int anInt3047;
	static int anInt2948;
	static int anInt3162;
	static int[] anIntArray3163;
	static int[] anIntArray3164;
	static int[] anIntArray3165;
	static int[] anIntArray2959;
	static Class10[] aClass10Array3067;
	static boolean[] aBoolArray3169;
	static int[] anIntArray3170;
	static int[] anIntArray3180;
	static int[] anIntArray2946;
	static int[] anIntArray3173;
	static short aShort3105;
	static short aShort3175;
	static short aShort3176;
	static short aShort3177;
	static short aShort3178;
	static short aShort3094;
	static short aShort2955;
	static short aShort3181;
	static int anInt3126;
	static int anInt3183;
	static int anInt3142;
	static int anInt3185;
	static int anInt2944;
	static Class49[] aClass49Array3098;
	static Class110 aClass110_3148;
	static Class43[] aClass43Array3192;
	static Class91 aClass91_3193;
	static int anInt3194;
	static int anInt3195;
	static Class143[] aClass143Array3196;
	static Class54_Sub1 aClass54_Sub1_2979;
	static int[] anIntArray3040;
	static int[] anIntArray3201;
	static int anInt3012;
	static Class79 aClass79_2919;
	static int anInt3029;

	protected final void method3583(int var1) {
	}

	protected final void method3577(int var1) {
		anInt2923 += 1607995761;
		method3654((byte) 0);
		Class6.method115(-1531190165);

		int var2;
		try {
			if (Class121.anInt1515 * -704298507 == 1) {
				var2 = Class121.aClass117_Sub2_Sub4_1514.method2975(-619175901);
				if (var2 > 0 && Class121.aClass117_Sub2_Sub4_1514.method2979(1206909658)) {
					var2 -= Class39.anInt488 * 1237358123;
					if (var2 < 0) {
						var2 = 0;
					}

					Class121.aClass117_Sub2_Sub4_1514.method2974(var2, -821001628);
				} else {
					Class121.aClass117_Sub2_Sub4_1514.method2980((byte) 44);
					Class121.aClass117_Sub2_Sub4_1514.method2978((byte) 16);
					if (Class54_Sub1.aClass106_1728 != null) {
						Class121.anInt1515 = -1587198790;
					} else {
						Class121.anInt1515 = 0;
					}

					Class40.aClass117_Sub17_505 = null;
					Class117_Sub14_Sub1.aClass15_2484 = null;
				}
			}
		} catch (Exception var86) {
			var86.printStackTrace();
			Class121.aClass117_Sub2_Sub4_1514.method2980((byte) -38);
			Class121.anInt1515 = 0;
			Class40.aClass117_Sub17_505 = null;
			Class117_Sub14_Sub1.aClass15_2484 = null;
			Class54_Sub1.aClass106_1728 = null;
		}

		Class117_Sub13.method1989(-1001075450);
		Class117_Sub22_Sub18_Sub1_Sub1.method3539(130918941);
		Class75 var87 = Class75.aClass75_912;
		synchronized (var87) {
			Class75.anInt911 = Class75.anInt899 * 158978833;
			Class75.anInt903 = Class75.anInt900 * -589337649;
			Class75.anInt904 = Class75.anInt907 * -1026866069;
			Class75.anInt909 = Class75.anInt905 * -382210271;
			Class75.anInt915 = Class75.anInt906 * -1860049857;
			Class75.anInt901 = Class75.anInt902 * 1097431817;
			Class75.aLong910 = -1165442621469601361L * Class75.aLong908;
			Class75.anInt905 = 0;
		}

		if (Class79.aClass83_948 != null) {
			var2 = Class79.aClass83_948.method1123(-1597522593);
			anInt3117 = var2 * 678530803;
		}

		int var3;
		int var5;
		int var6;
		boolean var8;
		int var10;
		int var11;
		int var12;
		int var15;
		int var16;
		int var19;
		int var22;
		int var89;
		int var93;
		int var99;
		int var101;
		int var107;
		byte[] var111;
		int var155;
		int var174;
		if (anInt2924 * 935215971 == 0) {
			Class54.method849(1671910814);
			Class82.method1117(1680103234);
		} else if (anInt2924 * 935215971 == 5) {
			Class55.method851(this, (byte) -15);
			Class54.method849(1428171225);
			Class82.method1117(984760888);
		} else if (anInt2924 * 935215971 != 10 && anInt2924 * 935215971 != 11) {
			if (anInt2924 * 935215971 == 20) {
				Class55.method851(this, (byte) -40);
				Class64.method933((byte) 1);
			} else if (anInt2924 * 935215971 == 25) {
				Class31.method424(false, -1758241156);
				anInt2974 = 0;
				boolean var88 = true;

				for (var3 = 0; var3 < Class7.aByteArrayArray101.length; var3++) {
					if (anIntArray3108[var3] != -1 && Class7.aByteArrayArray101[var3] == null) {
						Class7.aByteArrayArray101[var3] = Class73_Sub2.aClass106_Sub1_1893.method1380(anIntArray3108[var3], 0, (byte) 70);
						if (Class7.aByteArrayArray101[var3] == null) {
							var88 = false;
							anInt2974 -= 1045721173;
						}
					}

					if (Canvas_Sub1.anIntArray2489[var3] != -1 && Class117_Sub22_Sub18_Sub1_Sub1.aByteArrayArray2865[var3] == null) {
						Class117_Sub22_Sub18_Sub1_Sub1.aByteArrayArray2865[var3] = Class73_Sub2.aClass106_Sub1_1893.method1381(Canvas_Sub1.anIntArray2489[var3], 0, Class63.anIntArrayArray777[var3], -1420158829);
						if (Class117_Sub22_Sub18_Sub1_Sub1.aByteArrayArray2865[var3] == null) {
							var88 = false;
							anInt2974 -= 1045721173;
						}
					}
				}

				if (!var88) {
					anInt2978 = 639782409;
				} else {
					anInt3199 = 0;
					var88 = true;

					Class117_Sub14 var9;
					int var14;
					int var17;
					int var18;
					for (var3 = 0; var3 < Class7.aByteArrayArray101.length; var3++) {
						byte[] var4 = Class117_Sub22_Sub18_Sub1_Sub1.aByteArrayArray2865[var3];
						if (var4 != null) {
							var5 = (Class41.anIntArray515[var3] >> 8) * 64 - Class117_Sub22_Sub20.anInt2497 * 544615727;
							var6 = (Class41.anIntArray515[var3] & 255) * 64 - Class117_Sub22_Sub19.anInt2468 * -771797447;
							if (aBool2980) {
								var5 = 10;
								var6 = 10;
							}

							var8 = true;
							var9 = new Class117_Sub14(var4);
							var10 = -1;

							label4591:
							while (true) {
								var11 = var9.method2111((byte) 16);
								if (var11 == 0) {
									var88 &= var8;
									break;
								}

								var10 += var11;
								var12 = 0;
								boolean var13 = false;

								while (true) {
									while (!var13) {
										var14 = var9.method2111((byte) 104);
										if (var14 == 0) {
											continue label4591;
										}

										var12 += var14 - 1;
										var15 = var12 & 63;
										var16 = var12 >> 6 & 63;
										var17 = var9.method2010(-1439707937) >> 2;
										var18 = var16 + var5;
										var19 = var15 + var6;
										if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
											Class117_Sub22_Sub13 var20 = Class63.method928(var10, 1192850508);
											if (var17 != 22 || !aBool2921 || var20.anInt2361 * 338861247 != 0 || var20.anInt2355 * 1067298499 == 1 || var20.aBool2384) {
												if (!var20.method2595(-1372369908)) {
													anInt3199 += 1180845079;
													var8 = false;
												}

												var13 = true;
											}
										}
									}

									var14 = var9.method2111((byte) 87);
									if (var14 == 0) {
										break;
									}

									var9.method2010(-1439707937);
								}
							}
						}
					}

					if (!var88) {
						anInt2978 = 1279564818;
					} else {
						if (anInt2978 * 1251975225 != 0) {
							Class117_Sub22_Sub12.method2586(Class108.aString1209 + Class39.aString482 + Class39.aString479 + 100 + "%" + Class39.aString480, true, (byte) -5);
						}

						Class117_Sub13.method1989(-1001075450);
						Class29.method420(-434527822);
						Class117_Sub13.method1989(-1001075450);
						Class117_Sub13.aClass42_1875.method539();
						Class117_Sub13.method1989(-1001075450);
						System.gc();

						for (var3 = 0; var3 < 4; var3++) {
							aClass51Array3174[var3].method776(1802514105);
						}

						for (var3 = 0; var3 < 4; var3++) {
							for (var89 = 0; var89 < 104; var89++) {
								for (var5 = 0; var5 < 104; var5++) {
									Class31.aByteArrayArrayArray401[var3][var89][var5] = 0;
								}
							}
						}

						Class117_Sub13.method1989(-1001075450);
						Class75.method1034(1839043337);
						var3 = Class7.aByteArrayArray101.length;
						Class117_Sub22_Sub13.method2630(-935651169);
						Class31.method424(true, -841177976);
						int var23;
						int var147;
						if (!aBool2980) {
							byte[] var7;
							for (var89 = 0; var89 < var3; var89++) {
								var5 = (Class41.anIntArray515[var89] >> 8) * 64 - Class117_Sub22_Sub20.anInt2497 * 544615727;
								var6 = (Class41.anIntArray515[var89] & 255) * 64 - Class117_Sub22_Sub19.anInt2468 * -771797447;
								var7 = Class7.aByteArrayArray101[var89];
								if (var7 != null) {
									Class117_Sub13.method1989(-1001075450);
									Class80.method1086(var7, var5, var6, Class26.anInt328 * -240585688 - 48, Class117_Sub21.anInt2110 * 1140759864 - 48, aClass51Array3174, (byte) 12);
								}
							}

							for (var89 = 0; var89 < var3; var89++) {
								var5 = (Class41.anIntArray515[var89] >> 8) * 64 - Class117_Sub22_Sub20.anInt2497 * 544615727;
								var6 = (Class41.anIntArray515[var89] & 255) * 64 - Class117_Sub22_Sub19.anInt2468 * -771797447;
								var7 = Class7.aByteArrayArray101[var89];
								if (var7 == null && Class117_Sub21.anInt2110 * 1216336807 < 800) {
									Class117_Sub13.method1989(-1001075450);
									Class17.method335(var5, var6, 64, 64, -319920294);
								}
							}

							Class31.method424(true, 1220828687);

							for (var89 = 0; var89 < var3; var89++) {
								byte[] var92 = Class117_Sub22_Sub18_Sub1_Sub1.aByteArrayArray2865[var89];
								if (var92 != null) {
									var6 = (Class41.anIntArray515[var89] >> 8) * 64 - Class117_Sub22_Sub20.anInt2497 * 544615727;
									var93 = (Class41.anIntArray515[var89] & 255) * 64 - Class117_Sub22_Sub19.anInt2468 * -771797447;
									Class117_Sub13.method1989(-1001075450);
									Class42 var21 = Class117_Sub13.aClass42_1875;
									Class51[] var97 = aClass51Array3174;
									var9 = new Class117_Sub14(var92);
									var10 = -1;

									while (true) {
										var11 = var9.method2111((byte) 89);
										if (var11 == 0) {
											break;
										}

										var10 += var11;
										var12 = 0;

										while (true) {
											var107 = var9.method2111((byte) 12);
											if (var107 == 0) {
												break;
											}

											var12 += var107 - 1;
											var14 = var12 & 63;
											var15 = var12 >> 6 & 63;
											var16 = var12 >> 12;
											var17 = var9.method2010(-1439707937);
											var18 = var17 >> 2;
											var19 = var17 & 3;
											var147 = var15 + var6;
											var22 = var93 + var14;
											if (var147 > 0 && var22 > 0 && var147 < 103 && var22 < 103) {
												var23 = var16;
												if ((Class31.aByteArrayArrayArray401[1][var147][var22] & 2) == 2) {
													var23 = var16 - 1;
												}

												Class51 var24 = null;
												if (var23 >= 0) {
													var24 = var97[var23];
												}

												Class51.method814(var16, var147, var22, var10, var19, var18, var21, var24, -454595435);
											}
										}
									}
								}
							}
						}

						int var25;
						int var26;
						int var27;
						int var28;
						int var29;
						int var30;
						int var31;
						int var34;
						int var35;
						int var36;
						int var37;
						int var39;
						int var40;
						int var42;
						if (aBool2980) {
							var89 = 0;

							label4496:
							while (true) {
								if (var89 >= 4) {
									for (var89 = 0; var89 < 13; var89++) {
										for (var5 = 0; var5 < 13; var5++) {
											var6 = anIntArrayArrayArray2981[0][var89][var5];
											if (var6 == -1) {
												Class17.method335(var89 * 8, var5 * 8, 8, 8, -319920294);
											}
										}
									}

									Class31.method424(true, -703518932);
									var89 = 0;

									while (true) {
										if (var89 >= 4) {
											break label4496;
										}

										Class117_Sub13.method1989(-1001075450);

										for (var5 = 0; var5 < 13; var5++) {
											label4419:
											for (var6 = 0; var6 < 13; var6++) {
												var93 = anIntArrayArrayArray2981[var89][var5][var6];
												if (var93 != -1) {
													var155 = var93 >> 24 & 3;
													var99 = var93 >> 1 & 3;
													var101 = var93 >> 14 & 1023;
													var10 = var93 >> 3 & 2047;
													var11 = (var101 / 8 << 8) + var10 / 8;

													for (var12 = 0; var12 < Class41.anIntArray515.length; var12++) {
														if (var11 == Class41.anIntArray515[var12] && Class117_Sub22_Sub18_Sub1_Sub1.aByteArrayArray2865[var12] != null) {
															var111 = Class117_Sub22_Sub18_Sub1_Sub1.aByteArrayArray2865[var12];
															var14 = var5 * 8;
															var15 = var6 * 8;
															var16 = (var101 & 7) * 8;
															var17 = (var10 & 7) * 8;
															Class42 var136 = Class117_Sub13.aClass42_1875;
															Class51[] var141 = aClass51Array3174;
															Class117_Sub14 var152 = new Class117_Sub14(var111);
															var22 = -1;

															while (true) {
																var23 = var152.method2111((byte) 110);
																if (var23 == 0) {
																	continue label4419;
																}

																var22 += var23;
																var174 = 0;

																while (true) {
																	var25 = var152.method2111((byte) 43);
																	if (var25 == 0) {
																		break;
																	}

																	var174 += var25 - 1;
																	var26 = var174 & 63;
																	var27 = var174 >> 6 & 63;
																	var28 = var174 >> 12;
																	var29 = var152.method2010(-1439707937);
																	var30 = var29 >> 2;
																	var31 = var29 & 3;
																	if (var155 == var28 && var27 >= var16 && var27 < 8 + var16 && var26 >= var17 && var26 < 8 + var17) {
																		Class117_Sub22_Sub13 var32 = Class63.method928(var22, 1614301616);
																		var34 = var27 & 7;
																		var35 = var26 & 7;
																		var37 = var32.anInt2346 * -1473224837;
																		int var38 = var32.anInt2396 * 817158555;
																		if ((var31 & 1) == 1) {
																			var39 = var37;
																			var37 = var38;
																			var38 = var39;
																		}

																		var36 = var99 & 3;
																		if (var36 == 0) {
																			var40 = var34;
																		} else if (var36 == 1) {
																			var40 = var35;
																		} else if (var36 == 2) {
																			var40 = 7 - var34 - (var37 - 1);
																		} else {
																			var40 = 7 - var35 - (var38 - 1);
																		}

																		var39 = var40 + var14;
																		int var41 = var15 + Class89.method1168(var27 & 7, var26 & 7, var99, var32.anInt2346 * -1473224837, var32.anInt2396 * 817158555, var31, -2135703219);
																		if (var39 > 0 && var41 > 0 && var39 < 103 && var41 < 103) {
																			var42 = var89;
																			if ((Class31.aByteArrayArrayArray401[1][var39][var41] & 2) == 2) {
																				var42 = var89 - 1;
																			}

																			Class51 var43 = null;
																			if (var42 >= 0) {
																				var43 = var141[var42];
																			}

																			Class51.method814(var89, var39, var41, var22, var99 + var31 & 3, var30, var136, var43, -454595435);
																		}
																	}
																}
															}
														}
													}
												}
											}
										}

										++var89;
									}
								}

								Class117_Sub13.method1989(-1001075450);

								for (var5 = 0; var5 < 13; var5++) {
									for (var6 = 0; var6 < 13; var6++) {
										boolean var95 = false;
										var155 = anIntArrayArrayArray2981[var89][var5][var6];
										if (var155 != -1) {
											var99 = var155 >> 24 & 3;
											var101 = var155 >> 1 & 3;
											var10 = var155 >> 14 & 1023;
											var11 = var155 >> 3 & 2047;
											var12 = var11 / 8 + (var10 / 8 << 8);

											for (var107 = 0; var107 < Class41.anIntArray515.length; var107++) {
												if (var12 == Class41.anIntArray515[var107] && Class7.aByteArrayArray101[var107] != null) {
													Class117_Sub22_Sub3.method2367(Class7.aByteArrayArray101[var107], var89, var5 * 8, var6 * 8, var99, (var10 & 7) * 8, (var11 & 7) * 8, var101, aClass51Array3174, 769722671);
													var95 = true;
													break;
												}
											}
										}

										if (!var95) {
											var99 = var89;
											var101 = var5 * 8;
											var10 = var6 * 8;

											for (var11 = 0; var11 < 8; var11++) {
												for (var12 = 0; var12 < 8; var12++) {
													Class31.anIntArrayArrayArray381[var99][var101 + var11][var12 + var10] = 0;
												}
											}

											if (var101 > 0) {
												for (var11 = 1; var11 < 8; var11++) {
													Class31.anIntArrayArrayArray381[var99][var101][var10 + var11] = Class31.anIntArrayArrayArray381[var99][var101 - 1][var11 + var10];
												}
											}

											if (var10 > 0) {
												for (var11 = 1; var11 < 8; var11++) {
													Class31.anIntArrayArrayArray381[var99][var101 + var11][var10] = Class31.anIntArrayArrayArray381[var99][var11 + var101][var10 - 1];
												}
											}

											if (var101 > 0 && Class31.anIntArrayArrayArray381[var99][var101 - 1][var10] != 0) {
												Class31.anIntArrayArrayArray381[var99][var101][var10] = Class31.anIntArrayArrayArray381[var99][var101 - 1][var10];
											} else if (var10 > 0 && Class31.anIntArrayArrayArray381[var99][var101][var10 - 1] != 0) {
												Class31.anIntArrayArrayArray381[var99][var101][var10] = Class31.anIntArrayArrayArray381[var99][var101][var10 - 1];
											} else if (var101 > 0 && var10 > 0 && Class31.anIntArrayArrayArray381[var99][var101 - 1][var10 - 1] != 0) {
												Class31.anIntArrayArrayArray381[var99][var101][var10] = Class31.anIntArrayArrayArray381[var99][var101 - 1][var10 - 1];
											}
										}
									}
								}

								++var89;
							}
						}

						Class31.method424(true, -233197004);
						Class29.method420(-434527822);
						Class117_Sub13.method1989(-1001075450);
						Class42 var98 = Class117_Sub13.aClass42_1875;
						Class51[] var100 = aClass51Array3174;

						for (var6 = 0; var6 < 4; var6++) {
							for (var93 = 0; var93 < 104; var93++) {
								for (var155 = 0; var155 < 104; var155++) {
									if ((Class31.aByteArrayArrayArray401[var6][var93][var155] & 1) == 1) {
										var99 = var6;
										if ((Class31.aByteArrayArrayArray401[1][var93][var155] & 2) == 2) {
											var99 = var6 - 1;
										}

										if (var99 >= 0) {
											var100[var99].method779(var93, var155, -270210750);
										}
									}
								}
							}
						}

						Class31.anInt395 += ((int) (Math.random() * 5.0D) - 2) * -2127249693;
						if (Class31.anInt395 * 252737227 < -8) {
							Class31.anInt395 = -161871640;
						}

						if (Class31.anInt395 * 252737227 > 8) {
							Class31.anInt395 = 161871640;
						}

						Class31.anInt396 += ((int) (Math.random() * 5.0D) - 2) * -1408752021;
						if (Class31.anInt396 * -1738385853 < -16) {
							Class31.anInt396 = 1065195856;
						}

						if (Class31.anInt396 * -1738385853 > 16) {
							Class31.anInt396 = -1065195856;
						}

						for (var6 = 0; var6 < 4; var6++) {
							byte[][] var103 = Class31.aByteArrayArrayArray385[var6];
							var12 = (int) Math.sqrt(5100.0D);
							var107 = var12 * 768 >> 8;

							for (var14 = 1; var14 < 103; var14++) {
								for (var15 = 1; var15 < 103; var15++) {
									var16 = Class31.anIntArrayArrayArray381[var6][1 + var15][var14] - Class31.anIntArrayArrayArray381[var6][var15 - 1][var14];
									var17 = Class31.anIntArrayArrayArray381[var6][var15][var14 + 1] - Class31.anIntArrayArrayArray381[var6][var15][var14 - 1];
									var18 = (int) Math.sqrt((double) (var17 * var17 + 65536 + var16 * var16));
									var19 = (var16 << 8) / var18;
									var147 = 65536 / var18;
									var22 = (var17 << 8) / var18;
									var23 = (var147 * -10 + var19 * -50 + var22 * -50) / var107 + 96;
									var174 = (var103[var15 - 1][var14] >> 2) + (var103[1 + var15][var14] >> 3) + (var103[var15][var14 - 1] >> 2) + (var103[var15][1 + var14] >> 3) + (var103[var15][var14] >> 1);
									Class31.anIntArrayArray386[var15][var14] = var23 - var174;
								}
							}

							for (var14 = 0; var14 < 104; var14++) {
								Class130.anIntArray1586[var14] = 0;
								Class117_Sub22_Sub18_Sub1_Sub1.anIntArray2869[var14] = 0;
								Class20.anIntArray230[var14] = 0;
								Class136.anIntArray1606[var14] = 0;
								Class38.anIntArray471[var14] = 0;
							}

							for (var14 = -5; var14 < 109; var14++) {
								for (var15 = 0; var15 < 104; var15++) {
									var16 = var14 + 5;
									if (var16 >= 0 && var16 < 104) {
										var17 = Class99.aByteArrayArrayArray1138[var6][var16][var15] & 255;
										if (var17 > 0) {
											Class117_Sub22_Sub9 var139 = Class117_Sub22_Sub18_Sub6.method3361(var17 - 1, 1492725604);
											Class130.anIntArray1586[var15] += var139.anInt2290 * 548811331;
											Class117_Sub22_Sub18_Sub1_Sub1.anIntArray2869[var15] += var139.anInt2289 * 1736295993;
											Class20.anIntArray230[var15] += var139.anInt2291 * 572097385;
											Class136.anIntArray1606[var15] += var139.anInt2292 * -1912673027;
											++Class38.anIntArray471[var15];
										}
									}

									var17 = var14 - 5;
									if (var17 >= 0 && var17 < 104) {
										var18 = Class99.aByteArrayArrayArray1138[var6][var17][var15] & 255;
										if (var18 > 0) {
											Class117_Sub22_Sub9 var146 = Class117_Sub22_Sub18_Sub6.method3361(var18 - 1, 803457416);
											Class130.anIntArray1586[var15] -= var146.anInt2290 * 548811331;
											Class117_Sub22_Sub18_Sub1_Sub1.anIntArray2869[var15] -= var146.anInt2289 * 1736295993;
											Class20.anIntArray230[var15] -= var146.anInt2291 * 572097385;
											Class136.anIntArray1606[var15] -= var146.anInt2292 * -1912673027;
											--Class38.anIntArray471[var15];
										}
									}
								}

								if (var14 >= 1 && var14 < 103) {
									var15 = 0;
									var16 = 0;
									var17 = 0;
									var18 = 0;
									var19 = 0;

									for (var147 = -5; var147 < 109; var147++) {
										var22 = 5 + var147;
										if (var22 >= 0 && var22 < 104) {
											var15 += Class130.anIntArray1586[var22];
											var16 += Class117_Sub22_Sub18_Sub1_Sub1.anIntArray2869[var22];
											var17 += Class20.anIntArray230[var22];
											var18 += Class136.anIntArray1606[var22];
											var19 += Class38.anIntArray471[var22];
										}

										var23 = var147 - 5;
										if (var23 >= 0 && var23 < 104) {
											var15 -= Class130.anIntArray1586[var23];
											var16 -= Class117_Sub22_Sub18_Sub1_Sub1.anIntArray2869[var23];
											var17 -= Class20.anIntArray230[var23];
											var18 -= Class136.anIntArray1606[var23];
											var19 -= Class38.anIntArray471[var23];
										}

										if (var147 >= 1 && var147 < 103 && (!aBool2921 || (Class31.aByteArrayArrayArray401[0][var14][var147] & 2) != 0 || (Class31.aByteArrayArrayArray401[var6][var14][var147] & 16) == 0)) {
											if (var6 < Class31.anInt399 * 1455303933) {
												Class31.anInt399 = var6 * 398217301;
											}

											var174 = Class99.aByteArrayArrayArray1138[var6][var14][var147] & 255;
											var25 = Class31.aByteArrayArrayArray382[var6][var14][var147] & 255;
											if (var174 > 0 || var25 > 0) {
												var26 = Class31.anIntArrayArrayArray381[var6][var14][var147];
												var27 = Class31.anIntArrayArrayArray381[var6][var14 + 1][var147];
												var28 = Class31.anIntArrayArrayArray381[var6][1 + var14][var147 + 1];
												var29 = Class31.anIntArrayArrayArray381[var6][var14][1 + var147];
												var30 = Class31.anIntArrayArray386[var14][var147];
												var31 = Class31.anIntArrayArray386[var14 + 1][var147];
												int var187 = Class31.anIntArrayArray386[1 + var14][var147 + 1];
												int var33 = Class31.anIntArrayArray386[var14][var147 + 1];
												var40 = -1;
												var34 = -1;
												if (var174 > 0) {
													var35 = var15 * 256 / var18;
													var36 = var16 / var19;
													var37 = var17 / var19;
													var40 = Class64.method939(var35, var36, var37, -1303387531);
													var35 = Class31.anInt395 * 252737227 + var35 & 255;
													var37 += Class31.anInt396 * -1738385853;
													if (var37 < 0) {
														var37 = 0;
													} else if (var37 > 255) {
														var37 = 255;
													}

													var34 = Class64.method939(var35, var36, var37, 1843829679);
												}

												Class117_Sub22_Sub12 var203;
												if (var6 > 0) {
													boolean var196 = true;
													if (var174 == 0 && Class28.aByteArrayArrayArray347[var6][var14][var147] != 0) {
														var196 = false;
													}

													if (var25 > 0) {
														var37 = var25 - 1;
														var203 = (Class117_Sub22_Sub12) Class117_Sub22_Sub12.aClass115_2334.method1515((long) var37);
														Class117_Sub22_Sub12 var197;
														if (var203 != null) {
															var197 = var203;
														} else {
															byte[] var205 = Class117_Sub22_Sub12.aClass106_2332.method1380(4, var37, (byte) 67);
															var203 = new Class117_Sub22_Sub12();
															if (var205 != null) {
																var203.method2589(new Class117_Sub14(var205), var37, -669809987);
															}

															var203.method2587((byte) -44);
															Class117_Sub22_Sub12.aClass115_2334.method1517(var203, (long) var37);
															var197 = var203;
														}

														if (!var197.aBool2336) {
															var196 = false;
														}
													}

													if (var196 && var27 == var26 && var26 == var28 && var29 == var26) {
														Class40.anIntArrayArrayArray502[var6][var14][var147] |= 2340;
													}
												}

												var35 = 0;
												if (var34 != -1) {
													var35 = Class117_Sub22_Sub17_Sub1.anIntArray2643[Class73.method986(var34, 96, (byte) 12)];
												}

												if (var25 == 0) {
													var98.method544(var6, var14, var147, 0, 0, -1, var26, var27, var28, var29, Class73.method986(var40, var30, (byte) 16), Class73.method986(var40, var31, (byte) 23), Class73.method986(var40, var187, (byte) 109), Class73.method986(var40, var33, (byte) 54), 0, 0, 0, 0, var35, 0);
												} else {
													var36 = 1 + Class28.aByteArrayArrayArray347[var6][var14][var147];
													byte var206 = Class31.aByteArrayArrayArray383[var6][var14][var147];
													var39 = var25 - 1;
													Class117_Sub22_Sub12 var208 = (Class117_Sub22_Sub12) Class117_Sub22_Sub12.aClass115_2334.method1515((long) var39);
													if (var208 != null) {
														var203 = var208;
													} else {
														byte[] var209 = Class117_Sub22_Sub12.aClass106_2332.method1380(4, var39, (byte) 127);
														var208 = new Class117_Sub22_Sub12();
														if (var209 != null) {
															var208.method2589(new Class117_Sub14(var209), var39, -669809987);
														}

														var208.method2587((byte) -19);
														Class117_Sub22_Sub12.aClass115_2334.method1517(var208, (long) var39);
														var203 = var208;
													}

													var42 = var203.anInt2344 * -232025673;
													int var44;
													int var45;
													int var46;
													int var211;
													if (var42 >= 0) {
														var44 = Class117_Sub22_Sub17_Sub1.anInterface2_2650.method24(var42, (byte) 1);
														var211 = -1;
													} else if (var203.anInt2339 * 1885434877 == 16711935) {
														var211 = -2;
														var42 = -1;
														var44 = -2;
													} else {
														var211 = Class64.method939(var203.anInt2338 * 281911389, var203.anInt2335 * -887571613, var203.anInt2340 * 1096266863, 1766548060);
														var45 = Class31.anInt395 * 252737227 + var203.anInt2338 * 281911389 & 255;
														var46 = var203.anInt2340 * 1096266863 + Class31.anInt396 * -1738385853;
														if (var46 < 0) {
															var46 = 0;
														} else if (var46 > 255) {
															var46 = 255;
														}

														var44 = Class64.method939(var45, var203.anInt2335 * -887571613, var46, -1730956933);
													}

													var45 = 0;
													if (var44 != -2) {
														var45 = Class117_Sub22_Sub17_Sub1.anIntArray2643[Class114_Sub1.method1837(var44, 96, 1981818153)];
													}

													if (var203.anInt2337 * 778565993 != -1) {
														var46 = var203.anInt2341 * -1960792063 + Class31.anInt395 * 252737227 & 255;
														int var47 = Class31.anInt396 * -1738385853 + var203.anInt2343 * 723126117;
														if (var47 < 0) {
															var47 = 0;
														} else if (var47 > 255) {
															var47 = 255;
														}

														var44 = Class64.method939(var46, var203.anInt2342 * -1327473145, var47, -189609107);
														var45 = Class117_Sub22_Sub17_Sub1.anIntArray2643[Class114_Sub1.method1837(var44, 96, 1854476609)];
													}

													var98.method544(var6, var14, var147, var36, var206, var42, var26, var27, var28, var29, Class73.method986(var40, var30, (byte) 84), Class73.method986(var40, var31, (byte) 21), Class73.method986(var40, var187, (byte) 41), Class73.method986(var40, var33, (byte) 28), Class114_Sub1.method1837(var211, var30, 1852605912), Class114_Sub1.method1837(var211, var31, 1931762539), Class114_Sub1.method1837(var211, var187, 1886625249), Class114_Sub1.method1837(var211, var33, 2039372616), var35, var45);
												}
											}
										}
									}
								}
							}

							for (var14 = 1; var14 < 103; var14++) {
								for (var15 = 1; var15 < 103; var15++) {
									var98.method621(var6, var15, var14, Class15.method311(var6, var15, var14, 1503498815));
								}
							}

							Class99.aByteArrayArrayArray1138[var6] = (byte[][]) null;
							Class31.aByteArrayArrayArray382[var6] = (byte[][]) null;
							Class28.aByteArrayArrayArray347[var6] = (byte[][]) null;
							Class31.aByteArrayArrayArray383[var6] = (byte[][]) null;
							Class31.aByteArrayArrayArray385[var6] = (byte[][]) null;
						}

						var98.method639(-50, -10, -50);

						for (var6 = 0; var6 < 104; var6++) {
							for (var93 = 0; var93 < 104; var93++) {
								if ((Class31.aByteArrayArrayArray401[1][var6][var93] & 2) == 2) {
									var98.method541(var6, var93);
								}
							}
						}

						var6 = 1;
						var93 = 2;
						var155 = 4;

						for (var99 = 0; var99 < 4; var99++) {
							if (var99 > 0) {
								var6 <<= 3;
								var93 <<= 3;
								var155 <<= 3;
							}

							for (var101 = 0; var101 <= var99; var101++) {
								for (var10 = 0; var10 <= 104; var10++) {
									for (var11 = 0; var11 <= 104; var11++) {
										short var151;
										if ((Class40.anIntArrayArrayArray502[var101][var11][var10] & var6) != 0) {
											var12 = var10;
											var107 = var10;
											var14 = var101;

											for (var15 = var101; var12 > 0 && (Class40.anIntArrayArrayArray502[var101][var11][var12 - 1] & var6) != 0; --var12) {
												;
											}

											while (var107 < 104 && (Class40.anIntArrayArrayArray502[var101][var11][var107 + 1] & var6) != 0) {
												++var107;
											}

											label4145:
											while (var14 > 0) {
												for (var16 = var12; var16 <= var107; var16++) {
													if ((Class40.anIntArrayArrayArray502[var14 - 1][var11][var16] & var6) == 0) {
														break label4145;
													}
												}

												--var14;
											}

											label4134:
											while (var15 < var99) {
												for (var16 = var12; var16 <= var107; var16++) {
													if ((Class40.anIntArrayArrayArray502[1 + var15][var11][var16] & var6) == 0) {
														break label4134;
													}
												}

												++var15;
											}

											var16 = (1 + (var107 - var12)) * (1 + var15 - var14);
											if (var16 >= 8) {
												var151 = 240;
												var18 = Class31.anIntArrayArrayArray381[var15][var11][var12] - var151;
												var19 = Class31.anIntArrayArrayArray381[var14][var11][var12];
												Class42.method691(var99, 1, var11 * 128, var11 * 128, var12 * 128, 128 + var107 * 128, var18, var19);

												for (var147 = var14; var147 <= var15; var147++) {
													for (var22 = var12; var22 <= var107; var22++) {
														Class40.anIntArrayArrayArray502[var147][var11][var22] &= ~var6;
													}
												}
											}
										}

										if ((Class40.anIntArrayArrayArray502[var101][var11][var10] & var93) != 0) {
											var12 = var11;
											var107 = var11;
											var14 = var101;

											for (var15 = var101; var12 > 0 && (Class40.anIntArrayArrayArray502[var101][var12 - 1][var10] & var93) != 0; --var12) {
												;
											}

											while (var107 < 104 && (Class40.anIntArrayArrayArray502[var101][1 + var107][var10] & var93) != 0) {
												++var107;
											}

											label4198:
											while (var14 > 0) {
												for (var16 = var12; var16 <= var107; var16++) {
													if ((Class40.anIntArrayArrayArray502[var14 - 1][var16][var10] & var93) == 0) {
														break label4198;
													}
												}

												--var14;
											}

											label4187:
											while (var15 < var99) {
												for (var16 = var12; var16 <= var107; var16++) {
													if ((Class40.anIntArrayArrayArray502[1 + var15][var16][var10] & var93) == 0) {
														break label4187;
													}
												}

												++var15;
											}

											var16 = (1 + (var107 - var12)) * (var15 + 1 - var14);
											if (var16 >= 8) {
												var151 = 240;
												var18 = Class31.anIntArrayArrayArray381[var15][var12][var10] - var151;
												var19 = Class31.anIntArrayArrayArray381[var14][var12][var10];
												Class42.method691(var99, 2, var12 * 128, 128 + var107 * 128, var10 * 128, var10 * 128, var18, var19);

												for (var147 = var14; var147 <= var15; var147++) {
													for (var22 = var12; var22 <= var107; var22++) {
														Class40.anIntArrayArrayArray502[var147][var22][var10] &= ~var93;
													}
												}
											}
										}

										if ((Class40.anIntArrayArrayArray502[var101][var11][var10] & var155) != 0) {
											var12 = var11;
											var107 = var11;
											var14 = var10;

											for (var15 = var10; var14 > 0 && (Class40.anIntArrayArrayArray502[var101][var11][var14 - 1] & var155) != 0; --var14) {
												;
											}

											while (var15 < 104 && (Class40.anIntArrayArrayArray502[var101][var11][1 + var15] & var155) != 0) {
												++var15;
											}

											label4251:
											while (var12 > 0) {
												for (var16 = var14; var16 <= var15; var16++) {
													if ((Class40.anIntArrayArrayArray502[var101][var12 - 1][var16] & var155) == 0) {
														break label4251;
													}
												}

												--var12;
											}

											label4240:
											while (var107 < 104) {
												for (var16 = var14; var16 <= var15; var16++) {
													if ((Class40.anIntArrayArrayArray502[var101][1 + var107][var16] & var155) == 0) {
														break label4240;
													}
												}

												++var107;
											}

											if ((var15 - var14 + 1) * (1 + (var107 - var12)) >= 4) {
												var16 = Class31.anIntArrayArrayArray381[var101][var12][var14];
												Class42.method691(var99, 4, var12 * 128, 128 + var107 * 128, var14 * 128, var15 * 128 + 128, var16, var16);

												for (var17 = var12; var17 <= var107; var17++) {
													for (var18 = var14; var18 <= var15; var18++) {
														Class40.anIntArrayArrayArray502[var101][var17][var18] &= ~var155;
													}
												}
											}
										}
									}
								}
							}
						}

						Class31.method424(true, -2089657134);
						var6 = Class31.anInt399 * 1455303933;
						if (var6 > Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421) {
							var6 = Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421;
						}

						if (var6 < Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421 - 1) {
							var6 = Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421 - 1;
						}

						if (aBool2921) {
							Class117_Sub13.aClass42_1875.method540(Class31.anInt399 * 1455303933);
						} else {
							Class117_Sub13.aClass42_1875.method540(0);
						}

						for (var93 = 0; var93 < 104; var93++) {
							for (var155 = 0; var155 < 104; var155++) {
								Class41.method534(var93, var155, 1728960765);
							}
						}

						Class117_Sub13.method1989(-1001075450);

						for (Class117_Sub9 var106 = (Class117_Sub9) aClass120_3052.method1577(); var106 != null; var106 = (Class117_Sub9) aClass120_3052.method1582()) {
							if (var106.anInt1819 * -1516797987 == -1) {
								var106.anInt1822 = 0;
								Class28.method418(var106, (byte) -41);
							} else {
								var106.method1532();
							}
						}

						Class117_Sub22_Sub13.aClass115_2349.method1518();
						if (Class117_Sub22_Sub6.aFrame2269 != null) {
							aClass117_Sub14_Sub1_2961.method2932(176, 2061882682);
							aClass117_Sub14_Sub1_2961.method2183(1057001181, (byte) 95);
						}

						if (!aBool2980) {
							var93 = (Class26.anInt328 * -30073211 - 6) / 8;
							var155 = (Class26.anInt328 * -30073211 + 6) / 8;
							var99 = (Class117_Sub21.anInt2110 * 1216336807 - 6) / 8;
							var101 = (6 + Class117_Sub21.anInt2110 * 1216336807) / 8;

							for (var10 = var93 - 1; var10 <= 1 + var155; var10++) {
								for (var11 = var99 - 1; var11 <= var101 + 1; var11++) {
									if (var10 < var93 || var10 > var155 || var11 < var99 || var11 > var101) {
										Class73_Sub2.aClass106_Sub1_1893.method1438("m" + var10 + "_" + var11, -1619481987);
										Class73_Sub2.aClass106_Sub1_1893.method1438("l" + var10 + "_" + var11, -1966237640);
									}
								}
							}
						}

						Class117_Sub14_Sub1.method2953(30, 1177469807);
						Class117_Sub13.method1989(-1001075450);
						Class117_Sub22_Sub18_Sub5.method3354(714402042);
						aClass117_Sub14_Sub1_2961.method2932(223, 1291195887);
						Class88.aClass73_1028.method987(-2018375209);

						for (var93 = 0; var93 < 32; var93++) {
							aLongArray2903[var93] = 0L;
						}

						for (var93 = 0; var93 < 32; var93++) {
							aLongArray2904[var93] = 0L;
						}

						Class117_Sub11.anInt1849 = 0;
					}
				}
			}
		} else {
			Class55.method851(this, (byte) -103);
		}

		if (anInt2924 * 935215971 == 30) {
			if (anInt2933 * -1302201703 > 1) {
				anInt2933 += 1650345559;
			}

			if (anInt3101 * -830747683 > 0) {
				anInt3101 += 619191179;
			}

			if (aBool2972) {
				aBool2972 = false;
				Class117_Sub7.method1953(947620485);
			} else {
				if (!aBool3059) {
					aStringArray3065[0] = Class108.aString1367;
					aStringArray3066[0] = "";
					anIntArray2999[0] = 1006;
					anInt3060 = 2032386165;
				}

				long var58;
				String var102;
				String var105;
				String var108;
				String var120;
				String var125;
				Class117_Sub19 var142;
				boolean var160;
				String var172;
				Class117_Sub19 var192;
				for (var2 = 0; var2 < 100; var2++) {
					boolean var90;
					if (Class117_Sub22_Sub18_Sub2.aClass81_2609 == null) {
						var90 = false;
					} else {
						label4877:
						{
							try {
								var89 = Class117_Sub22_Sub18_Sub2.aClass81_2609.method1093(-1218498055);
								if (var89 == 0) {
									var90 = false;
									break label4877;
								}

								if (incomingMessageId * 712029253 == -1) {
									Class117_Sub22_Sub18_Sub2.aClass81_2609.method1092(aClass117_Sub14_Sub1_2953.aByteArray1885, 0, 1, (short) 9789);
									aClass117_Sub14_Sub1_2953.anInt1880 = 0;
									incomingMessageId = aClass117_Sub14_Sub1_2953.method2933(357570853) * -512475507;
									anInt2964 = Class128.anIntArray1578[incomingMessageId * 712029253] * 1605221403;
									--var89;
								}

								if (anInt2964 * 1735245331 == -1) {
									if (var89 <= 0) {
										var90 = false;
										break label4877;
									}

									Class117_Sub22_Sub18_Sub2.aClass81_2609.method1092(aClass117_Sub14_Sub1_2953.aByteArray1885, 0, 1, (short) 553);
									anInt2964 = (aClass117_Sub14_Sub1_2953.aByteArray1885[0] & 255) * 1605221403;
									--var89;
								}

								if (anInt2964 * 1735245331 == -2) {
									if (var89 <= 1) {
										var90 = false;
										break label4877;
									}

									Class117_Sub22_Sub18_Sub2.aClass81_2609.method1092(aClass117_Sub14_Sub1_2953.aByteArray1885, 0, 2, (short) 16112);
									aClass117_Sub14_Sub1_2953.anInt1880 = 0;
									anInt2964 = aClass117_Sub14_Sub1_2953.method2012(1053511631) * 1605221403;
									var89 -= 2;
								}

								if (var89 < anInt2964 * 1735245331) {
									var90 = false;
									break label4877;
								}

								aClass117_Sub14_Sub1_2953.anInt1880 = 0;
								Class117_Sub22_Sub18_Sub2.aClass81_2609.method1092(aClass117_Sub14_Sub1_2953.aByteArray1885, 0, anInt2964 * 1735245331, (short) 4609);
								anInt2966 = 0;
								anInt2992 = anInt2969 * -557224823;
								anInt2969 = anInt2982 * 1933112965;
								anInt2982 = incomingMessageId * 482280625;
								if (incomingMessageId * 712029253 == 78) {
									Class43.method726(1455622551);
									anInt2932 = aClass117_Sub14_Sub1_2953.method2010(-1439707937) * -203541051;
									anInt3116 = anInt3104 * 64352301;
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 43) {
									aBool3168 = true;
									Class63.anInt775 = aClass117_Sub14_Sub1_2953.method2010(-1439707937) * -483447827;
									Class22.anInt268 = aClass117_Sub14_Sub1_2953.method2010(-1439707937) * 594018505;
									Class117_Sub22_Sub18_Sub6.anInt2758 = aClass117_Sub14_Sub1_2953.method2012(1053511631) * -1801932131;
									Class46.anInt631 = aClass117_Sub14_Sub1_2953.method2010(-1439707937) * -1655729791;
									anInt3207 = aClass117_Sub14_Sub1_2953.method2010(-1439707937) * 945117815;
									if (anInt3207 * 821862215 >= 100) {
										var5 = Class63.anInt775 * 1609888384 + 64;
										var6 = 64 + Class22.anInt268 * -770917248;
										var93 = Class44.method729(var5, var6, Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, 1955037272) - Class117_Sub22_Sub18_Sub6.anInt2758 * -39623755;
										var155 = var5 - Class76.anInt916 * 1355759835;
										var99 = var93 - Class117_Sub22_Sub1.anInt2143 * 716978923;
										var101 = var6 - Class49.anInt665 * 1784829965;
										var10 = (int) Math.sqrt((double) (var101 * var101 + var155 * var155));
										Class117_Sub5.anInt1758 = ((int) (Math.atan2((double) var99, (double) var10) * 325.949D) & 2047) * -631993499;
										RuntimeException_Sub1.anInt2838 = ((int) (Math.atan2((double) var155, (double) var101) * -325.949D) & 2047) * -1646765531;
										if (Class117_Sub5.anInt1758 * -1894076819 < 128) {
											Class117_Sub5.anInt1758 = 709210752;
										}

										if (Class117_Sub5.anInt1758 * -1894076819 > 383) {
											Class117_Sub5.anInt1758 = -1535341541;
										}
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								Class117_Sub19 var118;
								if (incomingMessageId * 712029253 == 147) {
									var5 = aClass117_Sub14_Sub1_2953.method2015((byte) 60);
									var6 = aClass117_Sub14_Sub1_2953.method2012(1053511631);
									if (var5 < -70000) {
										var6 += 32768;
									}

									if (var5 >= 0) {
										var118 = Class74.method1010(var5, -1774147755);
									} else {
										var118 = null;
									}

									if (var118 != null) {
										for (var155 = 0; var155 < var118.anIntArray2049.length; var155++) {
											var118.anIntArray2049[var155] = 0;
											var118.anIntArray2058[var155] = 0;
										}
									}

									Class117_Sub12 var212 = (Class117_Sub12) Class117_Sub12.aClass127_1862.method1675((long) var6);
									if (var212 != null) {
										for (var99 = 0; var99 < var212.anIntArray1855.length; var99++) {
											var212.anIntArray1855[var99] = -1;
											var212.anIntArray1856[var99] = 0;
										}
									}

									var155 = aClass117_Sub14_Sub1_2953.method2012(1053511631);

									for (var99 = 0; var99 < var155; var99++) {
										var101 = aClass117_Sub14_Sub1_2953.method2045((byte) 101);
										var10 = aClass117_Sub14_Sub1_2953.method2176(27061748);
										if (var10 == 255) {
											var10 = aClass117_Sub14_Sub1_2953.method2055((byte) 94);
										}

										if (var118 != null && var99 < var118.anIntArray2049.length) {
											var118.anIntArray2049[var99] = var101;
											var118.anIntArray2058[var99] = var10;
										}

										Class106_Sub1.method2248(var6, var99, var101 - 1, var10, 187340036);
									}

									if (var118 != null) {
										Class54.method850(var118, (byte) 0);
									}

									Class43.method726(1863728993);
									anIntArray3107[(anInt2971 += 1994209991) * -1026070793 - 1 & 31] = var6 & 32767;
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 63) {
									var102 = aClass117_Sub14_Sub1_2953.method2018((byte) 43);
									var125 = Class117_Sub22_Sub17_Sub4.method3458(Class117_Sub10.method1971(Class97.method1263(aClass117_Sub14_Sub1_2953, -1743982838), -62994918));
									Class117_Sub22_Sub1.method2353(6, var102, var125, 1513017312);
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 8) {
									Class140.method1765(-1916789407);
									incomingMessageId = 512475507;
									var90 = false;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 20) {
									Class44.anInt593 = aClass117_Sub14_Sub1_2953.method2050((byte) 18) * -620998687;
									Class84.anInt991 = aClass117_Sub14_Sub1_2953.method2176(-1060573877) * 148751797;

									while (aClass117_Sub14_Sub1_2953.anInt1880 * 561453169 < anInt2964 * 1735245331) {
										incomingMessageId = aClass117_Sub14_Sub1_2953.method2010(-1439707937) * -512475507;
										Class117_Sub22_Sub10.method2549(332223171);
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 119) {
									var5 = aClass117_Sub14_Sub1_2953.method2012(1053511631);
									var6 = aClass117_Sub14_Sub1_2953.method2010(-1439707937);
									var93 = aClass117_Sub14_Sub1_2953.method2012(1053511631);
									Class34.method487(var5, var6, var93, (byte) 40);
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 177) {
									Class117_Sub9.method1967(false, (byte) -63);
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								boolean var185;
								if (incomingMessageId * 712029253 == 57) {
									var5 = aClass117_Sub14_Sub1_2953.method2111((byte) 90);
									var160 = aClass117_Sub14_Sub1_2953.method2010(-1439707937) == 1;
									var120 = "";
									var185 = false;
									if (var160) {
										var120 = aClass117_Sub14_Sub1_2953.method2018((byte) -5);
										if (Class117_Sub7.method1951(var120, (byte) 100)) {
											var185 = true;
										}
									}

									String var191 = aClass117_Sub14_Sub1_2953.method2018((byte) -82);
									if (!var185) {
										Class117_Sub22_Sub1.method2353(var5, var120, var191, 1820983663);
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								Class117_Sub10 var190;
								if (incomingMessageId * 712029253 == 54) {
									var5 = aClass117_Sub14_Sub1_2953.method2010(-1439707937);
									var6 = aClass117_Sub14_Sub1_2953.method2055((byte) 70);
									var93 = aClass117_Sub14_Sub1_2953.method2046(-2146246090);
									var190 = (Class117_Sub10) aClass127_3080.method1675((long) var6);
									if (var190 != null) {
										Class41.method536(var190, var190.anInt1831 * -2090327687 != var93, -1319590769);
									}

									Class117_Sub10 var189 = new Class117_Sub10();
									var189.anInt1831 = var93 * -508200759;
									var189.anInt1828 = var5 * -632392493;
									aClass127_3080.method1666(var189, (long) var6);
									Class106_Sub1.method2250(var93, (byte) 2);
									Class117_Sub19 var166 = Class74.method1010(var6, -1231609073);
									Class54.method850(var166, (byte) 0);
									if (aClass117_Sub19_3083 != null) {
										Class54.method850(aClass117_Sub19_3083, (byte) 0);
										aClass117_Sub19_3083 = null;
									}

									Class80.method1082(498105018);
									Class95.method1245(Class117_Sub19.aClass117_Sub19ArrayArray2032[var6 >> 16], var166, false, (byte) 4);
									Class117_Sub22_Sub18_Sub3.method3091(var93, (byte) 12);
									if (anInt3036 * -1635287017 != -1) {
										Class117_Sub22_Sub18_Sub1_Sub2.method3543(anInt3036 * -1635287017, 1, -1278238790);
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 146) {
									var5 = aClass117_Sub14_Sub1_2953.method2055((byte) 91);
									var6 = aClass117_Sub14_Sub1_2953.method2012(1053511631);
									var118 = Class74.method1010(var5, -945656064);
									if (var118 != null && var118.anInt1975 * 657737235 == 0) {
										if (var6 > var118.anInt1997 * 1348115267 - var118.anInt1989 * 2747837) {
											var6 = var118.anInt1997 * 1348115267 - var118.anInt1989 * 2747837;
										}

										if (var6 < 0) {
											var6 = 0;
										}

										if (var118.anInt2060 * -400020749 != var6) {
											var118.anInt2060 = var6 * -1852047813;
											Class54.method850(var118, (byte) 0);
										}
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								boolean var112;
								if (incomingMessageId * 712029253 == 145) {
									var112 = aClass117_Sub14_Sub1_2953.method2010(-1439707937) == 1;
									var6 = aClass117_Sub14_Sub1_2953.method2114((byte) 2);
									var118 = Class74.method1010(var6, -1784735552);
									if (var118.aBool1993 != var112) {
										var118.aBool1993 = var112;
										Class54.method850(var118, (byte) 0);
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								long var48;
								if (incomingMessageId * 712029253 == 56) {
									var5 = aClass117_Sub14_Sub1_2953.anInt1880 * 561453169 + anInt2964 * 1735245331;
									var6 = aClass117_Sub14_Sub1_2953.method2012(1053511631);
									var93 = aClass117_Sub14_Sub1_2953.method2012(1053511631);
									if (var6 != anInt3036 * -1635287017) {
										anInt3036 = var6 * -1825720409;
										Class117_Sub22_Sub18_Sub2.method3082(false, (byte) -26);
										Class106_Sub1.method2250(anInt3036 * -1635287017, (byte) 2);
										Class117_Sub22_Sub18_Sub3.method3091(anInt3036 * -1635287017, (byte) 12);

										for (var155 = 0; var155 < 100; var155++) {
											aBoolArray3124[var155] = true;
										}
									}

									Class117_Sub10 var171;
									for (; var93-- > 0; var171.aBool1829 = true) {
										var155 = aClass117_Sub14_Sub1_2953.method2015((byte) 11);
										var99 = aClass117_Sub14_Sub1_2953.method2012(1053511631);
										var101 = aClass117_Sub14_Sub1_2953.method2010(-1439707937);
										var171 = (Class117_Sub10) aClass127_3080.method1675((long) var155);
										if (var171 != null && var99 != var171.anInt1831 * -2090327687) {
											Class41.method536(var171, true, -524856902);
											var171 = null;
										}

										if (var171 == null) {
											var171 = Class75.method1040(var155, var99, var101, 1107050245);
										}
									}

									for (var190 = (Class117_Sub10) aClass127_3080.method1668(); var190 != null; var190 = (Class117_Sub10) aClass127_3080.method1669()) {
										if (var190.aBool1829) {
											var190.aBool1829 = false;
										} else {
											Class41.method536(var190, true, -1332249748);
										}
									}

									aClass127_3053 = new Class127(512);

									while (aClass117_Sub14_Sub1_2953.anInt1880 * 561453169 < var5) {
										var155 = aClass117_Sub14_Sub1_2953.method2015((byte) 38);
										var99 = aClass117_Sub14_Sub1_2953.method2012(1053511631);
										var101 = aClass117_Sub14_Sub1_2953.method2012(1053511631);
										var10 = aClass117_Sub14_Sub1_2953.method2015((byte) 46);

										for (var11 = var99; var11 <= var101; var11++) {
											var48 = (long) var11 + ((long) var155 << 32);
											aClass127_3053.method1666(new Class117_Sub20(var10), var48);
										}
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 191) {
									anInt3188 = -78977771;
									anInt3112 = anInt3104 * -481597009;
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 221) {
									var5 = aClass117_Sub14_Sub1_2953.method2010(-1439707937);
									var6 = aClass117_Sub14_Sub1_2953.method2010(-1439707937);
									var93 = aClass117_Sub14_Sub1_2953.method2010(-1439707937);
									var155 = aClass117_Sub14_Sub1_2953.method2010(-1439707937);
									aBoolArray3169[var5] = true;
									anIntArray3170[var5] = var6;
									anIntArray3180[var5] = var93;
									anIntArray2946[var5] = var155;
									anIntArray3173[var5] = 0;
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 139) {
									var102 = aClass117_Sub14_Sub1_2953.method2018((byte) 55);
									var6 = aClass117_Sub14_Sub1_2953.method2012(1053511631);
									byte var180 = aClass117_Sub14_Sub1_2953.method1997(953131989);
									var185 = false;
									if (var180 == -128) {
										var185 = true;
									}

									if (var185) {
										if (Class29.anInt362 * -562694677 == 0) {
											incomingMessageId = 512475507;
											var90 = true;
											break label4877;
										}

										var8 = false;

										for (var99 = 0; var99 < Class29.anInt362 * -562694677 && (!Class117_Sub22_Sub18_Sub5.aClass117_Sub13Array2747[var99].aString1870.equals(var102) || Class117_Sub22_Sub18_Sub5.aClass117_Sub13Array2747[var99].anInt1866 * -265391575 != var6); var99++) {
											;
										}

										if (var99 < Class29.anInt362 * -562694677) {
											while (var99 < Class29.anInt362 * -562694677 - 1) {
												Class117_Sub22_Sub18_Sub5.aClass117_Sub13Array2747[var99] = Class117_Sub22_Sub18_Sub5.aClass117_Sub13Array2747[1 + var99];
												++var99;
											}

											Class29.anInt362 -= 1652525763;
											Class117_Sub22_Sub18_Sub5.aClass117_Sub13Array2747[Class29.anInt362 * -562694677] = null;
										}
									} else {
										aClass117_Sub14_Sub1_2953.method2018((byte) -66);
										Class117_Sub13 var186 = new Class117_Sub13();
										var186.aString1870 = var102;
										var186.aString1865 = Class32.method472(var186.aString1870, Class54.aClass137_729, 1538480085);
										var186.anInt1866 = var6 * 1604274713;
										var186.aByte1867 = var180;

										for (var101 = Class29.anInt362 * -562694677 - 1; var101 >= 0; --var101) {
											var10 = Class117_Sub22_Sub18_Sub5.aClass117_Sub13Array2747[var101].aString1865.compareTo(var186.aString1865);
											if (var10 == 0) {
												Class117_Sub22_Sub18_Sub5.aClass117_Sub13Array2747[var101].anInt1866 = var6 * 1604274713;
												Class117_Sub22_Sub18_Sub5.aClass117_Sub13Array2747[var101].aByte1867 = var180;
												if (var102.equals(Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.getPlayerName())) {
													Class56.aByte744 = var180;
												}

												anInt3141 = anInt3104 * -759515231;
												incomingMessageId = 512475507;
												var90 = true;
												break label4877;
											}

											if (var10 < 0) {
												break;
											}
										}

										if (Class29.anInt362 * -562694677 >= Class117_Sub22_Sub18_Sub5.aClass117_Sub13Array2747.length) {
											incomingMessageId = 512475507;
											var90 = true;
											break label4877;
										}

										for (var10 = Class29.anInt362 * -562694677 - 1; var10 > var101; --var10) {
											Class117_Sub22_Sub18_Sub5.aClass117_Sub13Array2747[var10 + 1] = Class117_Sub22_Sub18_Sub5.aClass117_Sub13Array2747[var10];
										}

										if (Class29.anInt362 * -562694677 == 0) {
											Class117_Sub22_Sub18_Sub5.aClass117_Sub13Array2747 = new Class117_Sub13[100];
										}

										Class117_Sub22_Sub18_Sub5.aClass117_Sub13Array2747[var101 + 1] = var186;
										Class29.anInt362 += 1652525763;
										if (var102.equals(Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.getPlayerName())) {
											Class56.aByte744 = var180;
										}
									}

									anInt3141 = anInt3104 * -759515231;
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								Class117_Sub14_Sub1 var104;
								Class117_Sub22_Sub18_Sub1_Sub2 var109;
								byte var127;
								Class90 var140;
								Class117_Sub14 var149;
								byte var150;
								boolean var153;
								boolean var162;
								String var169;
								Class117_Sub14 var170;
								byte[] var179;
								String var182;
								if (incomingMessageId * 712029253 == 17) {
									var104 = aClass117_Sub14_Sub1_2953;
									var6 = anInt2964 * 1735245331;
									var93 = var104.anInt1880 * 561453169;
									Class4.anInt36 = 0;
									var155 = 0;
									var104.method2930(1592912042);

									for (var99 = 0; var99 < Class4.anInt46 * -1915182763; var99++) {
										var101 = Class4.anIntArray41[var99];
										if ((Class4.aByteArray37[var101] & 1) == 0) {
											if (var155 > 0) {
												--var155;
												Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
											} else {
												var10 = var104.method2931(1, -1320315244);
												if (var10 == 0) {
													var155 = Class1.method54(var104, 1477511731);
													Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
												} else {
													Class82.method1115(var104, var101, -1918757449);
												}
											}
										}
									}

									var104.method2945(-1771644294);
									if (var155 != 0) {
										throw new RuntimeException();
									}

									var104.method2930(2103011729);

									for (var99 = 0; var99 < Class4.anInt46 * -1915182763; var99++) {
										var101 = Class4.anIntArray41[var99];
										if ((Class4.aByteArray37[var101] & 1) != 0) {
											if (var155 > 0) {
												--var155;
												Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
											} else {
												var10 = var104.method2931(1, -1320315244);
												if (var10 == 0) {
													var155 = Class1.method54(var104, 1478190447);
													Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
												} else {
													Class82.method1115(var104, var101, -413147814);
												}
											}
										}
									}

									var104.method2945(-582419980);
									if (var155 != 0) {
										throw new RuntimeException();
									}

									var104.method2930(1764370435);

									for (var99 = 0; var99 < Class4.anInt42 * -1037177429; var99++) {
										var101 = Class4.anIntArray43[var99];
										if ((Class4.aByteArray37[var101] & 1) != 0) {
											if (var155 > 0) {
												--var155;
												Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
											} else {
												var10 = var104.method2931(1, -1320315244);
												if (var10 == 0) {
													var155 = Class1.method54(var104, 1184119461);
													Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
												} else if (Class74.method1005(var104, var101, -3732335)) {
													Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
												}
											}
										}
									}

									var104.method2945(697739247);
									if (var155 != 0) {
										throw new RuntimeException();
									}

									var104.method2930(1850884154);

									for (var99 = 0; var99 < Class4.anInt42 * -1037177429; var99++) {
										var101 = Class4.anIntArray43[var99];
										if ((Class4.aByteArray37[var101] & 1) == 0) {
											if (var155 > 0) {
												--var155;
												Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
											} else {
												var10 = var104.method2931(1, -1320315244);
												if (var10 == 0) {
													var155 = Class1.method54(var104, 1357711751);
													Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
												} else if (Class74.method1005(var104, var101, -277160809)) {
													Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
												}
											}
										}
									}

									var104.method2945(-1935122533);
									if (var155 != 0) {
										throw new RuntimeException();
									}

									Class4.anInt46 = 0;
									Class4.anInt42 = 0;

									for (var99 = 1; var99 < 2048; var99++) {
										Class4.aByteArray37[var99] = (byte) (Class4.aByteArray37[var99] >> 1);
										var109 = aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var99];
										if (var109 != null) {
											Class4.anIntArray41[(Class4.anInt46 -= 902671363) * -1915182763 - 1] = var99;
										} else {
											Class4.anIntArray43[(Class4.anInt42 += 550872323) * -1037177429 - 1] = var99;
										}
									}

									for (var155 = 0; var155 < Class4.anInt36 * -1049459595; var155++) {
										var99 = Class4.anIntArray47[var155];
										var109 = aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var99];
										var10 = var104.method2010(-1439707937);
										if ((var10 & 8) != 0) {
											var10 += var104.method2010(-1439707937) << 8;
										}

										var127 = -1;
										if ((var10 & 32) != 0) {
											var12 = var104.method2010(-1439707937);
											var111 = new byte[var12];
											var149 = new Class117_Sub14(var111);
											var104.method2021(var111, 0, var12, 1658176429);
											Class4.aClass117_Sub14Array39[var99] = var149;
											var109.method3541(var149, -217028405);
										}

										if ((var10 & 128) != 0) {
											var12 = var104.method2012(1053511631);
											if (var12 == 65535) {
												var12 = -1;
											}

											var107 = var104.method2010(-1439707937);
											Class61.method921(var109, var12, var107, 38528944);
										}

										if ((var10 & 16) != 0) {
											var109.anInt2565 = var104.method2012(1053511631) * -983534769;
											if (var109.anInt2565 * -771439697 == 65535) {
												var109.anInt2565 = 983534769;
											}
										}

										if ((var10 & 4) != 0) {
											var109.aString2546 = var104.method2018((byte) 12);
											if (var109.aString2546.charAt(0) == 126) {
												var109.aString2546 = var109.aString2546.substring(1);
												Class117_Sub22_Sub1.method2353(2, var109.getPlayerName(), var109.aString2546, 1706253768);
											} else if (var109 == Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393) {
												Class117_Sub22_Sub1.method2353(2, var109.getPlayerName(), var109.aString2546, 731288758);
											}

											var109.aBool2554 = false;
											var109.anInt2557 = 0;
											var109.anInt2580 = 0;
											var109.anInt2556 = -1497138754;
										}

										if ((var10 & 64) != 0) {
											var12 = var104.method2012(1053511631);
											var107 = var104.method2010(-1439707937);
											var109.method3075(var12, var107, anInt2923 * -488599663, (byte) -53);
											var109.anInt2601 = anInt2923 * 1605709651 - 2063579388;
											var109.anInt2563 = var104.method2010(-1439707937) * 478458227;
											var109.anInt2564 = var104.method2010(-1439707937) * -906524193;
										}

										if ((var10 & 1) != 0) {
											var109.anInt2592 = var104.method2012(1053511631) * 184454383;
											if (var109.anInt2593 * 1000346769 == 0) {
												var109.anInt2590 = var109.anInt2592 * -554427643;
												var109.anInt2592 = -184454383;
											}
										}

										if ((var10 & 2) != 0) {
											var12 = var104.method2012(1053511631);
											var140 = (Class90) Class117_Sub10.method1970(Class65.method941(-15493759), var104.method2010(-1439707937), 2018590606);
											var153 = var104.method2010(-1439707937) == 1;
											var15 = var104.method2010(-1439707937);
											var16 = var104.anInt1880 * 561453169;
											if (var109.getPlayerName() != null && var109.aClass91_2871 != null) {
												var162 = false;
												if (var140.aBool1070 && Class117_Sub7.method1951(var109.getPlayerName(), (byte) 111)) {
													var162 = true;
												}

												if (!var162 && anInt2952 * -885148437 == 0 && !var109.aBool2883) {
													Class4.aClass117_Sub14_49.anInt1880 = 0;
													var104.method2021(Class4.aClass117_Sub14_49.aByteArray1885, 0, var15, 1658176429);
													Class4.aClass117_Sub14_49.anInt1880 = 0;
													var170 = Class4.aClass117_Sub14_49;

													try {
														var22 = var170.method2111((byte) 1);
														if (var22 > 32767) {
															var22 = 32767;
														}

														var179 = new byte[var22];
														var170.anInt1880 += Class146.aClass61_1663.method917(var170.aByteArray1885, var170.anInt1880 * 561453169, var179, 0, var22, 782032758) * -2079217519;
														var182 = Class117_Sub22_Sub9.method2518(var179, 0, var22, -1500701071);
														var169 = var182;
													} catch (Exception var75) {
														var169 = "Cabbage";
													}

													var169 = Class117_Sub22_Sub17_Sub4.method3458(Class117_Sub10.method1971(var169, -62994918));
													var109.aString2546 = var169.trim();
													var109.anInt2557 = (var12 >> 8) * 1533013557;
													var109.anInt2580 = (var12 & 255) * -2038086947;
													var109.anInt2556 = -1497138754;
													var109.aBool2554 = var153;
													var109.aBool2555 = var109 != Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393 && var140.aBool1070 && aString3139 != "" && var169.toLowerCase().indexOf(aString3139) == -1;
													if (var140.aBool1069) {
														var22 = var153 ? 91 : 1;
													} else {
														var22 = var153 ? 90 : 2;
													}

													if (var140.anInt1068 * 309306431 != -1) {
														Class117_Sub22_Sub1.method2353(var22, Class44.method736(var140.anInt1068 * 309306431, -835690016) + var109.getPlayerName(), var169, 1622757923);
													} else {
														Class117_Sub22_Sub1.method2353(var22, var109.getPlayerName(), var169, 328299866);
													}
												}
											}

											var104.anInt1880 = (var15 + var16) * -2079217519;
										}

										if ((var10 & 512) != 0) {
											var109.anInt2550 = var104.method2012(1053511631) * -953061807;
											var12 = var104.method2015((byte) 113);
											var109.anInt2551 = (var12 >> 16) * 1253750341;
											var109.anInt2579 = (anInt2923 * -488599663 + (var12 & 65535)) * -1189764379;
											var109.anInt2571 = 0;
											var109.anInt2578 = 0;
											if (var109.anInt2579 * -1506129171 > anInt2923 * -488599663) {
												var109.anInt2571 = 72092623;
											}

											if (var109.anInt2550 * -1214866767 == 65535) {
												var109.anInt2550 = 953061807;
											}
										}

										if ((var10 & 256) != 0) {
											var109.anInt2581 = var104.method1997(1281950134) * 296210225;
											var109.anInt2583 = var104.method1997(-1540069437) * 1415547941;
											var109.anInt2582 = var104.method1997(-56582289) * -1281519923;
											var109.anInt2584 = var104.method1997(-469563242) * 442960649;
											var109.anInt2585 = (var104.method2012(1053511631) + anInt2923 * -488599663) * 1589639519;
											var109.anInt2586 = (var104.method2012(1053511631) + anInt2923 * -488599663) * -203509333;
											var109.anInt2587 = var104.method2012(1053511631) * -552486795;
											if (var109.aBool2879) {
												var109.anInt2581 += var109.anInt2891 * -540780825;
												var109.anInt2583 += var109.anInt2876 * 897115307;
												var109.anInt2582 += var109.anInt2891 * 279590891;
												var109.anInt2584 += var109.anInt2876 * -1195837945;
												var109.anInt2593 = 0;
											} else {
												var109.anInt2581 += var109.anIntArray2594[0] * 296210225;
												var109.anInt2583 += var109.anIntArray2541[0] * 1415547941;
												var109.anInt2582 += var109.anIntArray2594[0] * -1281519923;
												var109.anInt2584 += var109.anIntArray2541[0] * 442960649;
												var109.anInt2593 = 1290677361;
											}

											var109.anInt2598 = 0;
										}

										if ((var10 & 2048) != 0) {
											var12 = var104.method2012(1053511631);
											var107 = var104.method2010(-1439707937);
											var109.method3075(var12, var107, anInt2923 * -488599663, (byte) 0);
											var109.anInt2601 = anInt2923 * 1605709651 - 2063579388;
											var109.anInt2563 = var104.method2010(-1439707937) * 478458227;
											var109.anInt2564 = var104.method2010(-1439707937) * -906524193;
										}

										if ((var10 & 1024) != 0) {
											Class4.aByteArray38[var99] = var104.method1997(663145157);
										}

										if ((var10 & 4096) != 0) {
											var127 = var104.method1997(-1719900077);
										}

										if (var109.aBool2879) {
											if (var127 == 127) {
												var109.method3545(var109.anInt2891 * 545059223, var109.anInt2876 * 49441935, (byte) -12);
											} else {
												if (var127 != -1) {
													var150 = var127;
												} else {
													var150 = Class4.aByteArray38[var99];
												}

												var109.method3544(var109.anInt2891 * 545059223, var109.anInt2876 * 49441935, var150, -687755523);
											}
										}
									}

									if (var104.anInt1880 * 561453169 - var93 != var6) {
										throw new RuntimeException(var104.anInt1880 * 561453169 - var93 + " " + var6);
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 157) {
									anInt3026 = aClass117_Sub14_Sub1_2953.method2010(-1439707937) * 391913531;
									anInt3138 = aClass117_Sub14_Sub1_2953.method2010(-1439707937) * 2033389001;
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 241) {
									var5 = aClass117_Sub14_Sub1_2953.method2114((byte) 2);
									var142 = Class74.method1010(var5, -1256935894);

									for (var93 = 0; var93 < var142.anIntArray2049.length; var93++) {
										var142.anIntArray2049[var93] = -1;
										var142.anIntArray2049[var93] = 0;
									}

									Class54.method850(var142, (byte) 0);
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 55) {
									var5 = aClass117_Sub14_Sub1_2953.method2012(1053511631);
									Class81.method1110(var5, -393343378);
									anIntArray3107[(anInt2971 += 1994209991) * -1026070793 - 1 & 31] = var5 & 32767;
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 41) {
									Class117_Sub22_Sub18_Sub3.aClass69_2625 = Class74.method1009(aClass117_Sub14_Sub1_2953.method2010(-1439707937), 1090644615);
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								Class117_Sub14_Sub1 var124;
								if (incomingMessageId * 712029253 == 111) {
									Class51.method815(true, -436894889);
									aClass117_Sub14_Sub1_2953.method2933(214712828);
									var5 = aClass117_Sub14_Sub1_2953.method2012(1053511631);
									var124 = aClass117_Sub14_Sub1_2953;
									var93 = var124.anInt1880 * 561453169;
									Class4.anInt36 = 0;
									var155 = 0;
									var124.method2930(1400787393);

									for (var99 = 0; var99 < Class4.anInt46 * -1915182763; var99++) {
										var101 = Class4.anIntArray41[var99];
										if ((Class4.aByteArray37[var101] & 1) == 0) {
											if (var155 > 0) {
												--var155;
												Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
											} else {
												var10 = var124.method2931(1, -1320315244);
												if (var10 == 0) {
													var155 = Class1.method54(var124, 1957468003);
													Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
												} else {
													Class82.method1115(var124, var101, -1208770917);
												}
											}
										}
									}

									var124.method2945(-1991351950);
									if (var155 != 0) {
										throw new RuntimeException();
									}

									var124.method2930(1362951117);

									for (var99 = 0; var99 < Class4.anInt46 * -1915182763; var99++) {
										var101 = Class4.anIntArray41[var99];
										if ((Class4.aByteArray37[var101] & 1) != 0) {
											if (var155 > 0) {
												--var155;
												Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
											} else {
												var10 = var124.method2931(1, -1320315244);
												if (var10 == 0) {
													var155 = Class1.method54(var124, 1363499914);
													Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
												} else {
													Class82.method1115(var124, var101, -535104446);
												}
											}
										}
									}

									var124.method2945(-1115451628);
									if (var155 != 0) {
										throw new RuntimeException();
									}

									var124.method2930(1697043387);

									for (var99 = 0; var99 < Class4.anInt42 * -1037177429; var99++) {
										var101 = Class4.anIntArray43[var99];
										if ((Class4.aByteArray37[var101] & 1) != 0) {
											if (var155 > 0) {
												--var155;
												Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
											} else {
												var10 = var124.method2931(1, -1320315244);
												if (var10 == 0) {
													var155 = Class1.method54(var124, 994541100);
													Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
												} else if (Class74.method1005(var124, var101, -932020367)) {
													Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
												}
											}
										}
									}

									var124.method2945(810578990);
									if (var155 != 0) {
										throw new RuntimeException();
									}

									var124.method2930(1254469802);

									for (var99 = 0; var99 < Class4.anInt42 * -1037177429; var99++) {
										var101 = Class4.anIntArray43[var99];
										if ((Class4.aByteArray37[var101] & 1) == 0) {
											if (var155 > 0) {
												--var155;
												Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
											} else {
												var10 = var124.method2931(1, -1320315244);
												if (var10 == 0) {
													var155 = Class1.method54(var124, 1298693308);
													Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
												} else if (Class74.method1005(var124, var101, 1421821418)) {
													Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
												}
											}
										}
									}

									var124.method2945(-1967985142);
									if (var155 != 0) {
										throw new RuntimeException();
									}

									Class4.anInt46 = 0;
									Class4.anInt42 = 0;

									for (var99 = 1; var99 < 2048; var99++) {
										Class4.aByteArray37[var99] = (byte) (Class4.aByteArray37[var99] >> 1);
										var109 = aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var99];
										if (var109 != null) {
											Class4.anIntArray41[(Class4.anInt46 -= 902671363) * -1915182763 - 1] = var99;
										} else {
											Class4.anIntArray43[(Class4.anInt42 += 550872323) * -1037177429 - 1] = var99;
										}
									}

									for (var155 = 0; var155 < Class4.anInt36 * -1049459595; var155++) {
										var99 = Class4.anIntArray47[var155];
										var109 = aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var99];
										var10 = var124.method2010(-1439707937);
										if ((var10 & 8) != 0) {
											var10 += var124.method2010(-1439707937) << 8;
										}

										var127 = -1;
										if ((var10 & 32) != 0) {
											var12 = var124.method2010(-1439707937);
											var111 = new byte[var12];
											var149 = new Class117_Sub14(var111);
											var124.method2021(var111, 0, var12, 1658176429);
											Class4.aClass117_Sub14Array39[var99] = var149;
											var109.method3541(var149, -219148788);
										}

										if ((var10 & 128) != 0) {
											var12 = var124.method2012(1053511631);
											if (var12 == 65535) {
												var12 = -1;
											}

											var107 = var124.method2010(-1439707937);
											Class61.method921(var109, var12, var107, 580057310);
										}

										if ((var10 & 16) != 0) {
											var109.anInt2565 = var124.method2012(1053511631) * -983534769;
											if (var109.anInt2565 * -771439697 == 65535) {
												var109.anInt2565 = 983534769;
											}
										}

										if ((var10 & 4) != 0) {
											var109.aString2546 = var124.method2018((byte) -29);
											if (var109.aString2546.charAt(0) == 126) {
												var109.aString2546 = var109.aString2546.substring(1);
												Class117_Sub22_Sub1.method2353(2, var109.getPlayerName(), var109.aString2546, 1307345805);
											} else if (Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393 == var109) {
												Class117_Sub22_Sub1.method2353(2, var109.getPlayerName(), var109.aString2546, 1798333555);
											}

											var109.aBool2554 = false;
											var109.anInt2557 = 0;
											var109.anInt2580 = 0;
											var109.anInt2556 = -1497138754;
										}

										if ((var10 & 64) != 0) {
											var12 = var124.method2012(1053511631);
											var107 = var124.method2010(-1439707937);
											var109.method3075(var12, var107, anInt2923 * -488599663, (byte) -125);
											var109.anInt2601 = anInt2923 * 1605709651 - 2063579388;
											var109.anInt2563 = var124.method2010(-1439707937) * 478458227;
											var109.anInt2564 = var124.method2010(-1439707937) * -906524193;
										}

										if ((var10 & 1) != 0) {
											var109.anInt2592 = var124.method2012(1053511631) * 184454383;
											if (var109.anInt2593 * 1000346769 == 0) {
												var109.anInt2590 = var109.anInt2592 * -554427643;
												var109.anInt2592 = -184454383;
											}
										}

										if ((var10 & 2) != 0) {
											var12 = var124.method2012(1053511631);
											var140 = (Class90) Class117_Sub10.method1970(Class65.method941(-15493759), var124.method2010(-1439707937), 1722925553);
											var153 = var124.method2010(-1439707937) == 1;
											var15 = var124.method2010(-1439707937);
											var16 = var124.anInt1880 * 561453169;
											if (var109.getPlayerName() != null && var109.aClass91_2871 != null) {
												var162 = false;
												if (var140.aBool1070 && Class117_Sub7.method1951(var109.getPlayerName(), (byte) 100)) {
													var162 = true;
												}

												if (!var162 && anInt2952 * -885148437 == 0 && !var109.aBool2883) {
													Class4.aClass117_Sub14_49.anInt1880 = 0;
													var124.method2021(Class4.aClass117_Sub14_49.aByteArray1885, 0, var15, 1658176429);
													Class4.aClass117_Sub14_49.anInt1880 = 0;
													var170 = Class4.aClass117_Sub14_49;

													try {
														var22 = var170.method2111((byte) 15);
														if (var22 > 32767) {
															var22 = 32767;
														}

														var179 = new byte[var22];
														var170.anInt1880 += Class146.aClass61_1663.method917(var170.aByteArray1885, var170.anInt1880 * 561453169, var179, 0, var22, 252408484) * -2079217519;
														var182 = Class117_Sub22_Sub9.method2518(var179, 0, var22, -2134597403);
														var169 = var182;
													} catch (Exception var74) {
														var169 = "Cabbage";
													}

													var169 = Class117_Sub22_Sub17_Sub4.method3458(Class117_Sub10.method1971(var169, -62994918));
													var109.aString2546 = var169.trim();
													var109.anInt2557 = (var12 >> 8) * 1533013557;
													var109.anInt2580 = (var12 & 255) * -2038086947;
													var109.anInt2556 = -1497138754;
													var109.aBool2554 = var153;
													var109.aBool2555 = var109 != Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393 && var140.aBool1070 && aString3139 != "" && var169.toLowerCase().indexOf(aString3139) == -1;
													if (var140.aBool1069) {
														var22 = var153 ? 91 : 1;
													} else {
														var22 = var153 ? 90 : 2;
													}

													if (var140.anInt1068 * 309306431 != -1) {
														Class117_Sub22_Sub1.method2353(var22, Class44.method736(var140.anInt1068 * 309306431, -876901372) + var109.getPlayerName(), var169, 72563473);
													} else {
														Class117_Sub22_Sub1.method2353(var22, var109.getPlayerName(), var169, 564524694);
													}
												}
											}

											var124.anInt1880 = (var16 + var15) * -2079217519;
										}

										if ((var10 & 512) != 0) {
											var109.anInt2550 = var124.method2012(1053511631) * -953061807;
											var12 = var124.method2015((byte) 85);
											var109.anInt2551 = (var12 >> 16) * 1253750341;
											var109.anInt2579 = ((var12 & 65535) + anInt2923 * -488599663) * -1189764379;
											var109.anInt2571 = 0;
											var109.anInt2578 = 0;
											if (var109.anInt2579 * -1506129171 > anInt2923 * -488599663) {
												var109.anInt2571 = 72092623;
											}

											if (var109.anInt2550 * -1214866767 == 65535) {
												var109.anInt2550 = 953061807;
											}
										}

										if ((var10 & 256) != 0) {
											var109.anInt2581 = var124.method1997(551136983) * 296210225;
											var109.anInt2583 = var124.method1997(1388029772) * 1415547941;
											var109.anInt2582 = var124.method1997(595504086) * -1281519923;
											var109.anInt2584 = var124.method1997(-1009703657) * 442960649;
											var109.anInt2585 = (var124.method2012(1053511631) + anInt2923 * -488599663) * 1589639519;
											var109.anInt2586 = (var124.method2012(1053511631) + anInt2923 * -488599663) * -203509333;
											var109.anInt2587 = var124.method2012(1053511631) * -552486795;
											if (var109.aBool2879) {
												var109.anInt2581 += var109.anInt2891 * -540780825;
												var109.anInt2583 += var109.anInt2876 * 897115307;
												var109.anInt2582 += var109.anInt2891 * 279590891;
												var109.anInt2584 += var109.anInt2876 * -1195837945;
												var109.anInt2593 = 0;
											} else {
												var109.anInt2581 += var109.anIntArray2594[0] * 296210225;
												var109.anInt2583 += var109.anIntArray2541[0] * 1415547941;
												var109.anInt2582 += var109.anIntArray2594[0] * -1281519923;
												var109.anInt2584 += var109.anIntArray2541[0] * 442960649;
												var109.anInt2593 = 1290677361;
											}

											var109.anInt2598 = 0;
										}

										if ((var10 & 2048) != 0) {
											var12 = var124.method2012(1053511631);
											var107 = var124.method2010(-1439707937);
											var109.method3075(var12, var107, anInt2923 * -488599663, (byte) -23);
											var109.anInt2601 = anInt2923 * 1605709651 - 2063579388;
											var109.anInt2563 = var124.method2010(-1439707937) * 478458227;
											var109.anInt2564 = var124.method2010(-1439707937) * -906524193;
										}

										if ((var10 & 1024) != 0) {
											Class4.aByteArray38[var99] = var124.method1997(136245341);
										}

										if ((var10 & 4096) != 0) {
											var127 = var124.method1997(-810547058);
										}

										if (var109.aBool2879) {
											if (var127 == 127) {
												var109.method3545(var109.anInt2891 * 545059223, var109.anInt2876 * 49441935, (byte) -12);
											} else {
												if (var127 != -1) {
													var150 = var127;
												} else {
													var150 = Class4.aByteArray38[var99];
												}

												var109.method3544(var109.anInt2891 * 545059223, var109.anInt2876 * 49441935, var150, 1512822395);
											}
										}
									}

									if (var124.anInt1880 * 561453169 - var93 != var5) {
										throw new RuntimeException(var124.anInt1880 * 561453169 - var93 + " " + var5);
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 77) {
									for (var5 = 0; var5 < aClass117_Sub22_Sub18_Sub1_Sub2Array3041.length; var5++) {
										if (aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var5] != null) {
											aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var5].anInt2558 = -1804599217;
										}
									}

									for (var5 = 0; var5 < aClass117_Sub22_Sub18_Sub1_Sub1Array2942.length; var5++) {
										if (aClass117_Sub22_Sub18_Sub1_Sub1Array2942[var5] != null) {
											aClass117_Sub22_Sub18_Sub1_Sub1Array2942[var5].anInt2558 = -1804599217;
										}
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 81) {
									var5 = aClass117_Sub14_Sub1_2953.method2057(-561901449);
									var125 = aClass117_Sub14_Sub1_2953.method2018((byte) -55);
									var118 = Class74.method1010(var5, -1565268072);
									if (!var125.equals(var118.aString2031)) {
										var118.aString2031 = var125;
										Class54.method850(var118, (byte) 0);
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 224) {
									var102 = aClass117_Sub14_Sub1_2953.method2018((byte) -66);
									Object[] var184 = new Object[var102.length() + 1];

									for (var93 = var102.length() - 1; var93 >= 0; --var93) {
										if (var102.charAt(var93) == 115) {
											var184[1 + var93] = aClass117_Sub14_Sub1_2953.method2018((byte) -41);
										} else {
											var184[var93 + 1] = new Integer(aClass117_Sub14_Sub1_2953.method2015((byte) 50));
										}
									}

									var184[0] = new Integer(aClass117_Sub14_Sub1_2953.method2015((byte) 57));
									Class117_Sub7 var173 = new Class117_Sub7();
									var173.anObjectArray1786 = var184;
									Class57.method867(var173, 200000, 827515320);
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 172) {
									Class84.anInt991 = aClass117_Sub14_Sub1_2953.method2050((byte) 9) * 148751797;
									Class44.anInt593 = aClass117_Sub14_Sub1_2953.method2050((byte) -39) * -620998687;
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 168) {
									var112 = aClass117_Sub14_Sub1_2953.method2010(-1439707937) == 1;
									if (var112) {
										Class117_Sub9.aLong1824 = (Class47.method774(1027194464) - aClass117_Sub14_Sub1_2953.method2016(1006093938)) * -1272161870113625569L;
										Class117_Sub12.aClass141_1858 = new Class141(aClass117_Sub14_Sub1_2953, true);
									} else {
										Class117_Sub12.aClass141_1858 = null;
									}

									anInt3166 = anInt3104 * 450993047;
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 40) {
									var5 = aClass117_Sub14_Sub1_2953.method2048((byte) 56);
									var6 = aClass117_Sub14_Sub1_2953.method2015((byte) 102);
									var118 = Class74.method1010(var6, -1292410964);
									if (var5 != var118.anInt2102 * 1339652199 || var5 == -1) {
										var118.anInt2102 = var5 * -1811012777;
										var118.anInt2082 = 0;
										var118.anInt2101 = 0;
										Class54.method850(var118, (byte) 0);
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 225) {
									aClass117_Sub14_Sub1_2953.anInt1880 += 1911451612;
									if (aClass117_Sub14_Sub1_2953.method2032(-1451354906)) {
										var104 = aClass117_Sub14_Sub1_2953;
										var6 = aClass117_Sub14_Sub1_2953.anInt1880 * 561453169 - 28;
										if (Class74.aClass145_886 != null) {
											try {
												Class74.aClass145_886.method1827(0L);
												Class74.aClass145_886.method1813(var104.aByteArray1885, var6, 24, -1763139035);
											} catch (Exception var73) {
												;
											}
										}
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 143) {
									var5 = aClass117_Sub14_Sub1_2953.method2015((byte) 68);
									Class117_Sub10 var183 = (Class117_Sub10) aClass127_3080.method1675((long) var5);
									if (var183 != null) {
										Class41.method536(var183, true, -1872527774);
									}

									if (aClass117_Sub19_3083 != null) {
										Class54.method850(aClass117_Sub19_3083, (byte) 0);
										aClass117_Sub19_3083 = null;
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								long var52;
								if (incomingMessageId * 712029253 == 188) {
									var5 = aClass117_Sub14_Sub1_2953.method2015((byte) 42);
									var6 = aClass117_Sub14_Sub1_2953.method2015((byte) 56);
									if (Class117_Sub10.aGarbageCollectorMXBean1842 == null || !Class117_Sub10.aGarbageCollectorMXBean1842.isValid()) {
										try {
											Iterator var167 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

											while (var167.hasNext()) {
												GarbageCollectorMXBean var199 = (GarbageCollectorMXBean) var167.next();
												if (var199.isValid()) {
													Class117_Sub10.aGarbageCollectorMXBean1842 = var199;
													aLong2926 = 3665732098070112625L;
													aLong3197 = -1465676534226904019L;
												}
											}
										} catch (Throwable var83) {
											;
										}
									}

									long var50 = Class47.method774(1126697491);
									var99 = -1;
									if (Class117_Sub10.aGarbageCollectorMXBean1842 != null) {
										var52 = Class117_Sub10.aGarbageCollectorMXBean1842.getCollectionTime();
										if (7324842577165479003L * aLong3197 != -1L) {
											long var54 = var52 - aLong3197 * 7324842577165479003L;
											long var56 = var50 - aLong2926 * 7655845546756261999L;
											if (var56 != 0L) {
												var99 = (int) (100L * var54 / var56);
											}
										}

										aLong3197 = 1465676534226904019L * var52;
										aLong2926 = -3665732098070112625L * var50;
									}

									aClass117_Sub14_Sub1_2961.method2932(217, 266297934);
									aClass117_Sub14_Sub1_2961.method2035(anInt2911 * -2033650219, -1829754858);
									aClass117_Sub14_Sub1_2961.method2009(var5, -1777442703);
									aClass117_Sub14_Sub1_2961.method2009(var6, -1777442703);
									aClass117_Sub14_Sub1_2961.method2035(var99, -1958812137);
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 162) {
									byte var181 = aClass117_Sub14_Sub1_2953.method2110(1053511631);
									var6 = aClass117_Sub14_Sub1_2953.method2045((byte) 17);
									Class97.anIntArray1127[var6] = var181;
									if (var181 != Class97.anIntArray1129[var6]) {
										Class97.anIntArray1129[var6] = var181;
										Class117_Sub22_Sub13.method2631(var6, (byte) 37);
									}

									anIntArray3050[(anInt3093 += 535212873) * 348172025 - 1 & 31] = var6;
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 201) {
									var5 = aClass117_Sub14_Sub1_2953.method2057(-1507109578);
									Class41.aClass72_518 = Class84.aClass77_989.method1057(var5, -1193131627);
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 15) {
									var5 = aClass117_Sub14_Sub1_2953.method2049(-902258866);
									var6 = aClass117_Sub14_Sub1_2953.method2015((byte) 85);
									var93 = aClass117_Sub14_Sub1_2953.method2048((byte) 43);
									var192 = Class74.method1010(var6, -1886680162);
									if (var5 != var192.anInt2026 * -627192833 || var93 != var192.anInt1983 * 1272023551 || var192.anInt1978 * -92066971 != 0 || var192.anInt2048 * -1843003587 != 0) {
										var192.anInt2026 = var5 * -1965935617;
										var192.anInt1983 = var93 * 768243199;
										var192.anInt1978 = 0;
										var192.anInt2048 = 0;
										Class54.method850(var192, (byte) 0);
										Class33.method474(var192, (byte) -65);
										if (var192.anInt1975 * 657737235 == 0) {
											Class95.method1245(Class117_Sub19.aClass117_Sub19ArrayArray2032[var6 >> 16], var192, false, (byte) 4);
										}
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 87) {
									var5 = aClass117_Sub14_Sub1_2953.method2055((byte) 111);
									var6 = aClass117_Sub14_Sub1_2953.method2012(1053511631);
									var93 = var6 >> 10 & 31;
									var155 = var6 >> 5 & 31;
									var99 = var6 & 31;
									var101 = (var155 << 11) + (var93 << 19) + (var99 << 3);
									Class117_Sub19 var131 = Class74.method1010(var5, -936671977);
									if (var131.anInt1986 * 338507451 != var101) {
										var131.anInt1986 = var101 * 1537973875;
										Class54.method850(var131, (byte) 0);
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 208) {
									var5 = aClass117_Sub14_Sub1_2953.method2057(415477164);
									var6 = aClass117_Sub14_Sub1_2953.method2045((byte) 49);
									if (var6 == 65535) {
										var6 = -1;
									}

									var93 = aClass117_Sub14_Sub1_2953.method2114((byte) 2);
									var155 = aClass117_Sub14_Sub1_2953.method2046(-2147214002);
									if (var155 == 65535) {
										var155 = -1;
									}

									for (var99 = var6; var99 <= var155; var99++) {
										var52 = (long) var99 + ((long) var5 << 32);
										Class117 var138 = aClass127_3053.method1675(var52);
										if (var138 != null) {
											var138.method1532();
										}

										aClass127_3053.method1666(new Class117_Sub20(var93), var52);
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 171) {
									anInt3095 = aClass117_Sub14_Sub1_2953.method2010(-1439707937) * 1530231265;
									if (anInt3095 * -949450207 == 1) {
										anInt2914 = aClass117_Sub14_Sub1_2953.method2012(1053511631) * 1636292427;
									}

									if (anInt3095 * -949450207 >= 2 && anInt3095 * -949450207 <= 6) {
										if (anInt3095 * -949450207 == 2) {
											anInt3171 = -123905728;
											anInt2927 = -1238125248;
										}

										if (anInt3095 * -949450207 == 3) {
											anInt3171 = 0;
											anInt2927 = -1238125248;
										}

										if (anInt3095 * -949450207 == 4) {
											anInt3171 = -247811456;
											anInt2927 = -1238125248;
										}

										if (anInt3095 * -949450207 == 5) {
											anInt3171 = -123905728;
											anInt2927 = 0;
										}

										if (anInt3095 * -949450207 == 6) {
											anInt3171 = -123905728;
											anInt2927 = 1818716800;
										}

										anInt3095 = -1234504766;
										anInt2937 = aClass117_Sub14_Sub1_2953.method2012(1053511631) * -1239980747;
										anInt2938 = aClass117_Sub14_Sub1_2953.method2012(1053511631) * -463480123;
										anInt2934 = aClass117_Sub14_Sub1_2953.method2010(-1439707937) * 739955553;
									}

									if (anInt3095 * -949450207 == 10) {
										anInt3167 = aClass117_Sub14_Sub1_2953.method2012(1053511631) * 1161511521;
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								long var60;
								String var133;
								if (incomingMessageId * 712029253 == 154) {
									var102 = aClass117_Sub14_Sub1_2953.method2018((byte) -105);
									var58 = (long) aClass117_Sub14_Sub1_2953.method2012(1053511631);
									var60 = (long) aClass117_Sub14_Sub1_2953.method2014(768901823);
									Class90 var128 = (Class90) Class117_Sub10.method1970(Class65.method941(-15493759), aClass117_Sub14_Sub1_2953.method2010(-1439707937), 653666345);
									long var62 = (var58 << 32) + var60;
									boolean var161 = false;

									for (var107 = 0; var107 < 100; var107++) {
										if (aLongArray2970[var107] == var62) {
											var161 = true;
											break;
										}
									}

									if (Class117_Sub7.method1951(var102, (byte) 74)) {
										var161 = true;
									}

									if (!var161 && anInt2952 * -885148437 == 0) {
										aLongArray2970[anInt3030 * -472307801] = var62;
										anInt3030 = (1 + anInt3030 * -472307801) % 100 * 860164119;
										var133 = Class117_Sub22_Sub17_Sub4.method3458(Class117_Sub10.method1971(Class97.method1263(aClass117_Sub14_Sub1_2953, -1743982838), -62994918));
										byte var165;
										if (var128.aBool1069) {
											var165 = 7;
										} else {
											var165 = 3;
										}

										if (var128.anInt1068 * 309306431 != -1) {
											Class117_Sub22_Sub1.method2353(var165, Class44.method736(var128.anInt1068 * 309306431, -1115609561) + var102, var133, 247686315);
										} else {
											Class117_Sub22_Sub1.method2353(var165, var102, var133, 803338860);
										}
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 45) {
									var5 = aClass117_Sub14_Sub1_2953.method2010(-1439707937);
									if (aClass117_Sub14_Sub1_2953.method2010(-1439707937) == 0) {
										aClass143Array3196[var5] = new Class143();
										aClass117_Sub14_Sub1_2953.anInt1880 += 1228790322;
									} else {
										aClass117_Sub14_Sub1_2953.anInt1880 += 2079217519;
										aClass143Array3196[var5] = new Class143(aClass117_Sub14_Sub1_2953, false);
									}

									anInt3114 = anInt3104 * -404650945;
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 120) {
									Class117_Sub9.method1967(true, (byte) -14);
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 35) {
									var5 = aClass117_Sub14_Sub1_2953.method2057(-1919375248);
									var6 = aClass117_Sub14_Sub1_2953.method2046(-2147410162);
									var118 = Class74.method1010(var5, -1594138777);
									if (var118.anInt2080 * 1682942971 != 2 || var118.anInt2015 * 562552053 != var6) {
										var118.anInt2080 = 2074168934;
										var118.anInt2015 = var6 * -680726691;
										Class54.method850(var118, (byte) 0);
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 216) {
									var5 = aClass117_Sub14_Sub1_2953.method2045((byte) 10);
									anInt3036 = var5 * -1825720409;
									Class117_Sub22_Sub18_Sub2.method3082(false, (byte) -64);
									Class106_Sub1.method2250(var5, (byte) 2);
									Class117_Sub22_Sub18_Sub3.method3091(anInt3036 * -1635287017, (byte) -26);

									for (var6 = 0; var6 < 100; var6++) {
										aBoolArray3124[var6] = true;
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 118) {
									var5 = aClass117_Sub14_Sub1_2953.method2015((byte) 46);
									var6 = aClass117_Sub14_Sub1_2953.method2012(1053511631);
									if (var5 < -70000) {
										var6 += 32768;
									}

									if (var5 >= 0) {
										var118 = Class74.method1010(var5, -1766233379);
									} else {
										var118 = null;
									}

									for (; aClass117_Sub14_Sub1_2953.anInt1880 * 561453169 < anInt2964 * 1735245331; Class106_Sub1.method2248(var6, var155, var99 - 1, var101, 187340036)) {
										var155 = aClass117_Sub14_Sub1_2953.method2111((byte) 39);
										var99 = aClass117_Sub14_Sub1_2953.method2012(1053511631);
										var101 = 0;
										if (var99 != 0) {
											var101 = aClass117_Sub14_Sub1_2953.method2010(-1439707937);
											if (var101 == 255) {
												var101 = aClass117_Sub14_Sub1_2953.method2015((byte) 103);
											}
										}

										if (var118 != null && var155 >= 0 && var155 < var118.anIntArray2049.length) {
											var118.anIntArray2049[var155] = var99;
											var118.anIntArray2058[var155] = var101;
										}
									}

									if (var118 != null) {
										Class54.method850(var118, (byte) 0);
									}

									Class43.method726(835202735);
									anIntArray3107[(anInt2971 += 1994209991) * -1026070793 - 1 & 31] = var6 & 32767;
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 124) {
									anInt2933 = aClass117_Sub14_Sub1_2953.method2012(1053511631) * 2029240782;
									anInt3116 = anInt3104 * 64352301;
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 114) {
									var5 = aClass117_Sub14_Sub1_2953.method2186((byte) 118);
									if (var5 == 65535) {
										var5 = -1;
									}

									var6 = aClass117_Sub14_Sub1_2953.method2114((byte) 2);
									var93 = aClass117_Sub14_Sub1_2953.method2114((byte) 2);
									var192 = Class74.method1010(var6, -1117570121);
									Class117_Sub22_Sub6 var148;
									if (!var192.aBool2061) {
										if (var5 == -1) {
											var192.anInt2080 = 0;
											incomingMessageId = 512475507;
											var90 = true;
											break label4877;
										}

										var148 = Class117_Sub13.method1992(var5, -121660645);
										var192.anInt2080 = -146629428;
										var192.anInt2015 = var5 * -680726691;
										var192.anInt1966 = var148.anInt2234 * 1733000013;
										var192.anInt2023 = var148.anInt2235 * -2129281257;
										var192.anInt2025 = var148.anInt2239 * 1338735652 / var93 * -1145439295;
										Class54.method850(var192, (byte) 0);
									} else {
										var192.anInt2091 = var5 * -1529730431;
										var192.anInt2092 = var93 * -1367524999;
										var148 = Class117_Sub13.method1992(var5, 1486958439);
										var192.anInt1966 = var148.anInt2234 * 1733000013;
										var192.anInt2023 = var148.anInt2235 * -2129281257;
										var192.anInt2024 = var148.anInt2236 * -76071127;
										var192.anInt2020 = var148.anInt2237 * -882100745;
										var192.anInt2022 = var148.anInt2238 * -1908038529;
										var192.anInt2025 = var148.anInt2239 * 845091889;
										if (var148.anInt2222 * -1106690991 == 1) {
											var192.anInt2043 = -439106553;
										} else {
											var192.anInt2043 = -878213106;
										}

										if (var192.anInt1995 * -1445739571 > 0) {
											var192.anInt2025 = var192.anInt2025 * -1551726560 / (var192.anInt1995 * -1445739571) * -1145439295;
										} else if (var192.anInt1984 * 63573717 > 0) {
											var192.anInt2025 = var192.anInt2025 * -1551726560 / (var192.anInt1984 * 63573717) * -1145439295;
										}

										Class54.method850(var192, (byte) 0);
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 187) {
									while (aClass117_Sub14_Sub1_2953.anInt1880 * 561453169 < anInt2964 * 1735245331) {
										var5 = aClass117_Sub14_Sub1_2953.method2010(-1439707937);
										var160 = (var5 & 1) == 1;
										var120 = aClass117_Sub14_Sub1_2953.method2018((byte) -84);
										String var194 = aClass117_Sub14_Sub1_2953.method2018((byte) -6);
										aClass117_Sub14_Sub1_2953.method2018((byte) -88);

										for (var99 = 0; var99 < anInt2976 * -178563241; var99++) {
											Class43 var117 = aClass43Array3192[var99];
											if (var160) {
												if (var194.equals(var117.aString581)) {
													var117.aString581 = var120;
													var117.aString588 = var194;
													var120 = null;
													break;
												}
											} else if (var120.equals(var117.aString581)) {
												var117.aString581 = var120;
												var117.aString588 = var194;
												var120 = null;
												break;
											}
										}

										if (var120 != null && anInt2976 * -178563241 < 400) {
											Class43 var145 = new Class43();
											aClass43Array3192[anInt2976 * -178563241] = var145;
											var145.aString581 = var120;
											var145.aString588 = var194;
											anInt2976 += 1528923239;
										}
									}

									anInt3112 = anInt3104 * -481597009;
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 152) {
									anInt3155 = aClass117_Sub14_Sub1_2953.method2010(-1439707937) * 2021534035;
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 22) {
									aBool3168 = false;

									for (var5 = 0; var5 < 5; var5++) {
										aBoolArray3169[var5] = false;
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 252) {
									Class24 var154 = new Class24();
									var154.aString301 = aClass117_Sub14_Sub1_2953.method2018((byte) 24);
									var154.anInt294 = aClass117_Sub14_Sub1_2953.method2012(1053511631) * -2143429379;
									var6 = aClass117_Sub14_Sub1_2953.method2015((byte) 25);
									var154.anInt299 = var6 * -750310725;
									Class117_Sub14_Sub1.method2953(45, 1128948423);
									Class117_Sub22_Sub18_Sub2.aClass81_2609.method1088((byte) 0);
									Class117_Sub22_Sub18_Sub2.aClass81_2609 = null;
									Class117_Sub22_Sub18_Sub3.method3090(var154, (byte) -1);
									incomingMessageId = 512475507;
									var90 = false;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 209) {
									for (var5 = 0; var5 < Class117_Sub22_Sub15.anInt2453 * 432029757; var5++) {
										Class117_Sub22_Sub15 var156 = Class117_Sub22_Sub4.method2386(var5, 1591088076);
										if (var156 != null) {
											Class97.anIntArray1127[var5] = 0;
											Class97.anIntArray1129[var5] = 0;
										}
									}

									Class43.method726(1044012970);
									anInt3093 -= 53057248;
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 250) {
									Class38.method518((short) 5811);

									for (var5 = 0; var5 < 2048; var5++) {
										aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var5] = null;
									}

									Class15.method313(aClass117_Sub14_Sub1_2953, 1767025288);
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 65) {
									Class43.method726(361833837);
									var5 = aClass117_Sub14_Sub1_2953.method2038(-125093834);
									var6 = aClass117_Sub14_Sub1_2953.method2050((byte) -6);
									var93 = aClass117_Sub14_Sub1_2953.method2057(819941484);
									anIntArray3057[var5] = var93;
									anIntArray3055[var5] = var6;
									anIntArray3056[var5] = 1;

									for (var155 = 0; var155 < 98; var155++) {
										if (var93 >= Class87.anIntArray1017[var155]) {
											anIntArray3056[var5] = var155 + 2;
										}
									}

									anIntArray3109[(anInt3110 += 226589231) * 95161551 - 1 & 31] = var5;
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 102) {
									var5 = aClass117_Sub14_Sub1_2953.method2186((byte) 81);
									var6 = aClass117_Sub14_Sub1_2953.method2055((byte) 17);
									Class97.anIntArray1127[var5] = var6;
									if (Class97.anIntArray1129[var5] != var6) {
										Class97.anIntArray1129[var5] = var6;
										Class117_Sub22_Sub13.method2631(var5, (byte) 106);
									}

									anIntArray3050[(anInt3093 += 535212873) * 348172025 - 1 & 31] = var5;
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 66) {
									var5 = aClass117_Sub14_Sub1_2953.method2046(-2147413196);
									var6 = aClass117_Sub14_Sub1_2953.method2114((byte) 2);
									var93 = aClass117_Sub14_Sub1_2953.method2186((byte) 112);
									var192 = Class74.method1010(var6, -1081593909);
									var192.anInt1982 = ((var93 << 16) + var5) * -1471750665;
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 233) {
									if (anInt3036 * -1635287017 != -1) {
										Class117_Sub22_Sub18_Sub1_Sub2.method3543(anInt3036 * -1635287017, 0, -181042093);
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								Class117_Sub19 var134;
								if (incomingMessageId * 712029253 == 29) {
									var5 = aClass117_Sub14_Sub1_2953.method2015((byte) 73);
									var6 = aClass117_Sub14_Sub1_2953.method2114((byte) 2);
									Class117_Sub10 var130 = (Class117_Sub10) aClass127_3080.method1675((long) var6);
									var190 = (Class117_Sub10) aClass127_3080.method1675((long) var5);
									if (var190 != null) {
										Class41.method536(var190, var130 == null || var130.anInt1831 * -2090327687 != var190.anInt1831 * -2090327687, -613367996);
									}

									if (var130 != null) {
										var130.method1532();
										aClass127_3080.method1666(var130, (long) var5);
									}

									var134 = Class74.method1010(var6, -491810811);
									if (var134 != null) {
										Class54.method850(var134, (byte) 0);
									}

									var134 = Class74.method1010(var5, -2023261526);
									if (var134 != null) {
										Class54.method850(var134, (byte) 0);
										Class95.method1245(Class117_Sub19.aClass117_Sub19ArrayArray2032[var134.anInt1973 * -1955776525 >>> 16], var134, true, (byte) 4);
									}

									if (anInt3036 * -1635287017 != -1) {
										Class117_Sub22_Sub18_Sub1_Sub2.method3543(anInt3036 * -1635287017, 1, -1425433888);
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 210) {
									aBool3168 = true;
									Class90.anInt1071 = aClass117_Sub14_Sub1_2953.method2010(-1439707937) * 549906995;
									Class117_Sub22_Sub11.anInt2330 = aClass117_Sub14_Sub1_2953.method2010(-1439707937) * -1538512825;
									Class27.anInt345 = aClass117_Sub14_Sub1_2953.method2012(1053511631) * -1902522905;
									Class23.anInt282 = aClass117_Sub14_Sub1_2953.method2010(-1439707937) * -1119171725;
									Class45.anInt610 = aClass117_Sub14_Sub1_2953.method2010(-1439707937) * 646115791;
									if (Class45.anInt610 * 166622511 >= 100) {
										Class76.anInt916 = 1789842624 + Class90.anInt1071 * 553988224;
										Class49.anInt665 = Class117_Sub22_Sub11.anInt2330 * -1797437056 - 680677056;
										Class117_Sub22_Sub1.anInt2143 = (Class44.method729(Class76.anInt916 * 1355759835, Class49.anInt665 * 1784829965, Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, -870192024) - Class27.anInt345 * -1974798889) * -1908957757;
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 10) {
									var5 = aClass117_Sub14_Sub1_2953.method2012(1053511631);
									var6 = aClass117_Sub14_Sub1_2953.method2015((byte) 12);
									var93 = aClass117_Sub14_Sub1_2953.method2012(1053511631);
									var155 = aClass117_Sub14_Sub1_2953.method2046(-2147456778);
									var134 = Class74.method1010(var6, -1429432503);
									if (var134.anInt1966 * -1133280755 != var155 || var5 != var134.anInt2023 * -1569228799 || var93 != var134.anInt2025 * -2061757375) {
										var134.anInt1966 = var155 * -1995334459;
										var134.anInt2023 = var5 * 633899009;
										var134.anInt2025 = var93 * -1145439295;
										Class54.method850(var134, (byte) 0);
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 174) {
									Class43.method726(1148805262);
									anInt3085 = aClass117_Sub14_Sub1_2953.method2013(1511075930) * -1728119079;
									anInt3116 = anInt3104 * 64352301;
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 140) {
									var102 = aClass117_Sub14_Sub1_2953.method2018((byte) 58);
									var58 = aClass117_Sub14_Sub1_2953.method2016(-2049760621);
									var60 = (long) aClass117_Sub14_Sub1_2953.method2012(1053511631);
									var52 = (long) aClass117_Sub14_Sub1_2953.method2014(-1296626133);
									Class90 var137 = (Class90) Class117_Sub10.method1970(Class65.method941(-15493759), aClass117_Sub14_Sub1_2953.method2010(-1439707937), 983543853);
									var48 = var52 + (var60 << 32);
									var153 = false;

									for (var15 = 0; var15 < 100; var15++) {
										if (var48 == aLongArray2970[var15]) {
											var153 = true;
											break;
										}
									}

									if (var137.aBool1070 && Class117_Sub7.method1951(var102, (byte) 30)) {
										var153 = true;
									}

									if (!var153 && anInt2952 * -885148437 == 0) {
										aLongArray2970[anInt3030 * -472307801] = var48;
										anInt3030 = (anInt3030 * -472307801 + 1) % 100 * 860164119;
										var172 = Class117_Sub22_Sub17_Sub4.method3458(Class117_Sub10.method1971(Class97.method1263(aClass117_Sub14_Sub1_2953, -1743982838), -62994918));
										if (var137.anInt1068 * 309306431 != -1) {
											Class13.method239(9, Class44.method736(var137.anInt1068 * 309306431, -1728035389) + var102, var172, Class23.method369(var58), 1093490605);
										} else {
											Class13.method239(9, var102, var172, Class23.method369(var58), 1370002407);
										}
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 227) {
									var5 = aClass117_Sub14_Sub1_2953.method2015((byte) 119);
									var142 = Class74.method1010(var5, -455185626);
									var142.anInt2080 = 963769753;
									var142.anInt2015 = Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.aClass91_2871.method1216(-540744955) * -680726691;
									Class54.method850(var142, (byte) 0);
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 205) {
									anInt3153 = aClass117_Sub14_Sub1_2953.method2010(-1439707937) * 1748897489;
									if (anInt3153 * -140834255 == 255) {
										anInt3153 = 0;
									}

									anInt3154 = aClass117_Sub14_Sub1_2953.method2010(-1439707937) * -2025568851;
									if (anInt3154 * 45835813 == 255) {
										anInt3154 = 0;
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 104) {
									anInt3141 = anInt3104 * -759515231;
									if (anInt2964 * 1735245331 == 0) {
										aString3146 = null;
										aString3147 = null;
										Class29.anInt362 = 0;
										Class117_Sub22_Sub18_Sub5.aClass117_Sub13Array2747 = null;
										incomingMessageId = 512475507;
										var90 = true;
										break label4877;
									}

									aString3147 = aClass117_Sub14_Sub1_2953.method2018((byte) 19);
									long var64 = aClass117_Sub14_Sub1_2953.method2016(780491832);
									aString3146 = Class117_Sub12.method1988(var64);
									Class134.aByte1604 = aClass117_Sub14_Sub1_2953.method1997(-1515778785);
									var93 = aClass117_Sub14_Sub1_2953.method2010(-1439707937);
									if (var93 == 255) {
										incomingMessageId = 512475507;
										var90 = true;
										break label4877;
									}

									Class29.anInt362 = var93 * 1652525763;
									Class117_Sub13[] var188 = new Class117_Sub13[100];

									for (var99 = 0; var99 < Class29.anInt362 * -562694677; var99++) {
										var188[var99] = new Class117_Sub13();
										var188[var99].aString1870 = aClass117_Sub14_Sub1_2953.method2018((byte) -41);
										var188[var99].aString1865 = Class32.method472(var188[var99].aString1870, Class54.aClass137_729, 1538480085);
										var188[var99].anInt1866 = aClass117_Sub14_Sub1_2953.method2012(1053511631) * 1604274713;
										var188[var99].aByte1867 = aClass117_Sub14_Sub1_2953.method1997(-592625547);
										aClass117_Sub14_Sub1_2953.method2018((byte) 17);
										if (var188[var99].aString1870.equals(Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.getPlayerName())) {
											Class56.aByte744 = var188[var99].aByte1867;
										}
									}

									var8 = false;
									var10 = Class29.anInt362 * -562694677;

									while (var10 > 0) {
										var8 = true;
										--var10;

										for (var11 = 0; var11 < var10; var11++) {
											if (var188[var11].aString1865.compareTo(var188[1 + var11].aString1865) > 0) {
												Class117_Sub13 var115 = var188[var11];
												var188[var11] = var188[1 + var11];
												var188[var11 + 1] = var115;
												var8 = false;
											}
										}

										if (var8) {
											break;
										}
									}

									Class117_Sub22_Sub18_Sub5.aClass117_Sub13Array2747 = var188;
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 240) {
									Class44.anInt593 = aClass117_Sub14_Sub1_2953.method2176(1613595652) * -620998687;
									Class84.anInt991 = aClass117_Sub14_Sub1_2953.method2038(1719253386) * 148751797;

									for (var5 = Class84.anInt991 * 513720477; var5 < Class84.anInt991 * 513720477 + 8; var5++) {
										for (var6 = Class44.anInt593 * 759182369; var6 < 8 + Class44.anInt593 * 759182369; var6++) {
											if (aClass120ArrayArrayArray3051[Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421][var5][var6] != null) {
												aClass120ArrayArrayArray3051[Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421][var5][var6] = null;
												Class41.method534(var5, var6, 1728960765);
											}
										}
									}

									for (Class117_Sub9 var122 = (Class117_Sub9) aClass120_3052.method1577(); var122 != null; var122 = (Class117_Sub9) aClass120_3052.method1582()) {
										if (var122.anInt1810 * 358282887 >= Class84.anInt991 * 513720477 && var122.anInt1810 * 358282887 < Class84.anInt991 * 513720477 + 8 && var122.anInt1811 * -2131922755 >= Class44.anInt593 * 759182369 && var122.anInt1811 * -2131922755 < Class44.anInt593 * 759182369 + 8 && var122.anInt1820 * -1213240437 == Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421) {
											var122.anInt1819 = 0;
										}
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 131) {
									Class28.method415(aClass117_Sub14_Sub1_2953.method2018((byte) 44), -1946006601);
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 254) {
									while (aClass117_Sub14_Sub1_2953.anInt1880 * 561453169 < anInt2964 * 1735245331) {
										var112 = aClass117_Sub14_Sub1_2953.method2010(-1439707937) == 1;
										var125 = aClass117_Sub14_Sub1_2953.method2018((byte) 69);
										var120 = aClass117_Sub14_Sub1_2953.method2018((byte) 87);
										var155 = aClass117_Sub14_Sub1_2953.method2012(1053511631);
										var99 = aClass117_Sub14_Sub1_2953.method2010(-1439707937);
										var101 = aClass117_Sub14_Sub1_2953.method2010(-1439707937);
										boolean var123 = (var101 & 2) != 0;
										boolean var132 = (var101 & 1) != 0;
										if (var155 > 0) {
											aClass117_Sub14_Sub1_2953.method2018((byte) 86);
											aClass117_Sub14_Sub1_2953.method2010(-1439707937);
											aClass117_Sub14_Sub1_2953.method2015((byte) 76);
										}

										aClass117_Sub14_Sub1_2953.method2018((byte) 44);

										for (var12 = 0; var12 < anInt3198 * -1278614973; var12++) {
											Class49 var143 = aClass49Array3098[var12];
											if (!var112) {
												if (var125.equals(var143.aString660)) {
													if (var155 != var143.anInt662 * -2124244471) {
														var153 = true;

														for (Class114_Sub1 var164 = (Class114_Sub1) aClass110_3148.method1488(); var164 != null; var164 = (Class114_Sub1) aClass110_3148.method1490()) {
															if (var164.aString1665.equals(var125)) {
																if (var155 != 0 && var164.aShort1664 == 0) {
																	var164.method1511();
																	var153 = false;
																} else if (var155 == 0 && var164.aShort1664 != 0) {
																	var164.method1511();
																	var153 = false;
																}
															}
														}

														if (var153) {
															aClass110_3148.method1492(new Class114_Sub1(var125, var155));
														}

														var143.anInt662 = var155 * 296424505;
													}

													var143.aString656 = var120;
													var143.anInt658 = var99 * -1192288979;
													var143.aBool659 = var123;
													var143.aBool661 = var132;
													var125 = null;
													break;
												}
											} else if (var120.equals(var143.aString660)) {
												var143.aString660 = var125;
												var143.aString656 = var120;
												var125 = null;
												break;
											}
										}

										if (var125 != null && anInt3198 * -1278614973 < 400) {
											Class49 var158 = new Class49();
											aClass49Array3098[anInt3198 * -1278614973] = var158;
											var158.aString660 = var125;
											var158.aString656 = var120;
											var158.anInt662 = var155 * 296424505;
											var158.anInt658 = var99 * -1192288979;
											var158.aBool659 = var123;
											var158.aBool661 = var132;
											anInt3198 += 564394603;
										}
									}

									anInt3188 = -157955542;
									anInt3112 = anInt3104 * -481597009;
									var112 = false;
									var6 = anInt3198 * -1278614973;

									while (var6 > 0) {
										var112 = true;
										--var6;

										for (var93 = 0; var93 < var6; var93++) {
											var185 = false;
											Class49 var121 = aClass49Array3098[var93];
											Class49 var113 = aClass49Array3098[var93 + 1];
											if (anInt2916 * 622074983 != var121.anInt662 * -2124244471 && anInt2916 * 622074983 == var113.anInt662 * -2124244471) {
												var185 = true;
											}

											if (!var185 && var121.anInt662 * -2124244471 == 0 && var113.anInt662 * -2124244471 != 0) {
												var185 = true;
											}

											if (!var185 && !var121.aBool659 && var113.aBool659) {
												var185 = true;
											}

											if (!var185 && !var121.aBool661 && var113.aBool661) {
												var185 = true;
											}

											if (var185) {
												Class49 var126 = aClass49Array3098[var93];
												aClass49Array3098[var93] = aClass49Array3098[var93 + 1];
												aClass49Array3098[var93 + 1] = var126;
												var112 = false;
											}
										}

										if (var112) {
											break;
										}
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 196) {
									Class51.method815(false, -396460800);
									aClass117_Sub14_Sub1_2953.method2933(2056751737);
									var5 = aClass117_Sub14_Sub1_2953.method2012(1053511631);
									var124 = aClass117_Sub14_Sub1_2953;
									var93 = var124.anInt1880 * 561453169;
									Class4.anInt36 = 0;
									var155 = 0;
									var124.method2930(1470913698);

									for (var99 = 0; var99 < Class4.anInt46 * -1915182763; var99++) {
										var101 = Class4.anIntArray41[var99];
										if ((Class4.aByteArray37[var101] & 1) == 0) {
											if (var155 > 0) {
												--var155;
												Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
											} else {
												var10 = var124.method2931(1, -1320315244);
												if (var10 == 0) {
													var155 = Class1.method54(var124, 1001866048);
													Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
												} else {
													Class82.method1115(var124, var101, -800686720);
												}
											}
										}
									}

									var124.method2945(-1323479979);
									if (var155 != 0) {
										throw new RuntimeException();
									}

									var124.method2930(2121992270);

									for (var99 = 0; var99 < Class4.anInt46 * -1915182763; var99++) {
										var101 = Class4.anIntArray41[var99];
										if ((Class4.aByteArray37[var101] & 1) != 0) {
											if (var155 > 0) {
												--var155;
												Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
											} else {
												var10 = var124.method2931(1, -1320315244);
												if (var10 == 0) {
													var155 = Class1.method54(var124, 1863592495);
													Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
												} else {
													Class82.method1115(var124, var101, 57157025);
												}
											}
										}
									}

									var124.method2945(793958106);
									if (var155 != 0) {
										throw new RuntimeException();
									}

									var124.method2930(2047398989);

									for (var99 = 0; var99 < Class4.anInt42 * -1037177429; var99++) {
										var101 = Class4.anIntArray43[var99];
										if ((Class4.aByteArray37[var101] & 1) != 0) {
											if (var155 > 0) {
												--var155;
												Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
											} else {
												var10 = var124.method2931(1, -1320315244);
												if (var10 == 0) {
													var155 = Class1.method54(var124, 1539282143);
													Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
												} else if (Class74.method1005(var124, var101, 151973083)) {
													Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
												}
											}
										}
									}

									var124.method2945(-1207722828);
									if (var155 != 0) {
										throw new RuntimeException();
									}

									var124.method2930(1441441814);

									for (var99 = 0; var99 < Class4.anInt42 * -1037177429; var99++) {
										var101 = Class4.anIntArray43[var99];
										if ((Class4.aByteArray37[var101] & 1) == 0) {
											if (var155 > 0) {
												--var155;
												Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
											} else {
												var10 = var124.method2931(1, -1320315244);
												if (var10 == 0) {
													var155 = Class1.method54(var124, 1022722892);
													Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
												} else if (Class74.method1005(var124, var101, 1102455890)) {
													Class4.aByteArray37[var101] = (byte) (Class4.aByteArray37[var101] | 2);
												}
											}
										}
									}

									var124.method2945(-1740860763);
									if (var155 != 0) {
										throw new RuntimeException();
									}

									Class4.anInt46 = 0;
									Class4.anInt42 = 0;

									for (var99 = 1; var99 < 2048; var99++) {
										Class4.aByteArray37[var99] = (byte) (Class4.aByteArray37[var99] >> 1);
										var109 = aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var99];
										if (var109 != null) {
											Class4.anIntArray41[(Class4.anInt46 -= 902671363) * -1915182763 - 1] = var99;
										} else {
											Class4.anIntArray43[(Class4.anInt42 += 550872323) * -1037177429 - 1] = var99;
										}
									}

									for (var155 = 0; var155 < Class4.anInt36 * -1049459595; var155++) {
										var99 = Class4.anIntArray47[var155];
										var109 = aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var99];
										var10 = var124.method2010(-1439707937);
										if ((var10 & 8) != 0) {
											var10 += var124.method2010(-1439707937) << 8;
										}

										var127 = -1;
										if ((var10 & 32) != 0) {
											var12 = var124.method2010(-1439707937);
											var111 = new byte[var12];
											var149 = new Class117_Sub14(var111);
											var124.method2021(var111, 0, var12, 1658176429);
											Class4.aClass117_Sub14Array39[var99] = var149;
											var109.method3541(var149, 749452937);
										}

										if ((var10 & 128) != 0) {
											var12 = var124.method2012(1053511631);
											if (var12 == 65535) {
												var12 = -1;
											}

											var107 = var124.method2010(-1439707937);
											Class61.method921(var109, var12, var107, 1801188698);
										}

										if ((var10 & 16) != 0) {
											var109.anInt2565 = var124.method2012(1053511631) * -983534769;
											if (var109.anInt2565 * -771439697 == 65535) {
												var109.anInt2565 = 983534769;
											}
										}

										if ((var10 & 4) != 0) {
											var109.aString2546 = var124.method2018((byte) -49);
											if (var109.aString2546.charAt(0) == 126) {
												var109.aString2546 = var109.aString2546.substring(1);
												Class117_Sub22_Sub1.method2353(2, var109.getPlayerName(), var109.aString2546, 1622709743);
											} else if (Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393 == var109) {
												Class117_Sub22_Sub1.method2353(2, var109.getPlayerName(), var109.aString2546, 156018729);
											}

											var109.aBool2554 = false;
											var109.anInt2557 = 0;
											var109.anInt2580 = 0;
											var109.anInt2556 = -1497138754;
										}

										if ((var10 & 64) != 0) {
											var12 = var124.method2012(1053511631);
											var107 = var124.method2010(-1439707937);
											var109.method3075(var12, var107, anInt2923 * -488599663, (byte) -70);
											var109.anInt2601 = anInt2923 * 1605709651 - 2063579388;
											var109.anInt2563 = var124.method2010(-1439707937) * 478458227;
											var109.anInt2564 = var124.method2010(-1439707937) * -906524193;
										}

										if ((var10 & 1) != 0) {
											var109.anInt2592 = var124.method2012(1053511631) * 184454383;
											if (var109.anInt2593 * 1000346769 == 0) {
												var109.anInt2590 = var109.anInt2592 * -554427643;
												var109.anInt2592 = -184454383;
											}
										}

										if ((var10 & 2) != 0) {
											var12 = var124.method2012(1053511631);
											var140 = (Class90) Class117_Sub10.method1970(Class65.method941(-15493759), var124.method2010(-1439707937), 627397898);
											var153 = var124.method2010(-1439707937) == 1;
											var15 = var124.method2010(-1439707937);
											var16 = var124.anInt1880 * 561453169;
											if (var109.getPlayerName() != null && var109.aClass91_2871 != null) {
												var162 = false;
												if (var140.aBool1070 && Class117_Sub7.method1951(var109.getPlayerName(), (byte) 104)) {
													var162 = true;
												}

												if (!var162 && anInt2952 * -885148437 == 0 && !var109.aBool2883) {
													Class4.aClass117_Sub14_49.anInt1880 = 0;
													var124.method2021(Class4.aClass117_Sub14_49.aByteArray1885, 0, var15, 1658176429);
													Class4.aClass117_Sub14_49.anInt1880 = 0;
													var170 = Class4.aClass117_Sub14_49;

													try {
														var22 = var170.method2111((byte) 53);
														if (var22 > 32767) {
															var22 = 32767;
														}

														var179 = new byte[var22];
														var170.anInt1880 += Class146.aClass61_1663.method917(var170.aByteArray1885, var170.anInt1880 * 561453169, var179, 0, var22, 1183711269) * -2079217519;
														var182 = Class117_Sub22_Sub9.method2518(var179, 0, var22, -1553903561);
														var169 = var182;
													} catch (Exception var72) {
														var169 = "Cabbage";
													}

													var169 = Class117_Sub22_Sub17_Sub4.method3458(Class117_Sub10.method1971(var169, -62994918));
													var109.aString2546 = var169.trim();
													var109.anInt2557 = (var12 >> 8) * 1533013557;
													var109.anInt2580 = (var12 & 255) * -2038086947;
													var109.anInt2556 = -1497138754;
													var109.aBool2554 = var153;
													var109.aBool2555 = Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393 != var109 && var140.aBool1070 && aString3139 != "" && var169.toLowerCase().indexOf(aString3139) == -1;
													if (var140.aBool1069) {
														var22 = var153 ? 91 : 1;
													} else {
														var22 = var153 ? 90 : 2;
													}

													if (var140.anInt1068 * 309306431 != -1) {
														Class117_Sub22_Sub1.method2353(var22, Class44.method736(var140.anInt1068 * 309306431, -93013610) + var109.getPlayerName(), var169, 130890029);
													} else {
														Class117_Sub22_Sub1.method2353(var22, var109.getPlayerName(), var169, 1609575995);
													}
												}
											}

											var124.anInt1880 = (var15 + var16) * -2079217519;
										}

										if ((var10 & 512) != 0) {
											var109.anInt2550 = var124.method2012(1053511631) * -953061807;
											var12 = var124.method2015((byte) 66);
											var109.anInt2551 = (var12 >> 16) * 1253750341;
											var109.anInt2579 = (anInt2923 * -488599663 + (var12 & 65535)) * -1189764379;
											var109.anInt2571 = 0;
											var109.anInt2578 = 0;
											if (var109.anInt2579 * -1506129171 > anInt2923 * -488599663) {
												var109.anInt2571 = 72092623;
											}

											if (var109.anInt2550 * -1214866767 == 65535) {
												var109.anInt2550 = 953061807;
											}
										}

										if ((var10 & 256) != 0) {
											var109.anInt2581 = var124.method1997(-1031714438) * 296210225;
											var109.anInt2583 = var124.method1997(-78358872) * 1415547941;
											var109.anInt2582 = var124.method1997(-128645845) * -1281519923;
											var109.anInt2584 = var124.method1997(-1820973393) * 442960649;
											var109.anInt2585 = (var124.method2012(1053511631) + anInt2923 * -488599663) * 1589639519;
											var109.anInt2586 = (var124.method2012(1053511631) + anInt2923 * -488599663) * -203509333;
											var109.anInt2587 = var124.method2012(1053511631) * -552486795;
											if (var109.aBool2879) {
												var109.anInt2581 += var109.anInt2891 * -540780825;
												var109.anInt2583 += var109.anInt2876 * 897115307;
												var109.anInt2582 += var109.anInt2891 * 279590891;
												var109.anInt2584 += var109.anInt2876 * -1195837945;
												var109.anInt2593 = 0;
											} else {
												var109.anInt2581 += var109.anIntArray2594[0] * 296210225;
												var109.anInt2583 += var109.anIntArray2541[0] * 1415547941;
												var109.anInt2582 += var109.anIntArray2594[0] * -1281519923;
												var109.anInt2584 += var109.anIntArray2541[0] * 442960649;
												var109.anInt2593 = 1290677361;
											}

											var109.anInt2598 = 0;
										}

										if ((var10 & 2048) != 0) {
											var12 = var124.method2012(1053511631);
											var107 = var124.method2010(-1439707937);
											var109.method3075(var12, var107, anInt2923 * -488599663, (byte) -50);
											var109.anInt2601 = anInt2923 * 1605709651 - 2063579388;
											var109.anInt2563 = var124.method2010(-1439707937) * 478458227;
											var109.anInt2564 = var124.method2010(-1439707937) * -906524193;
										}

										if ((var10 & 1024) != 0) {
											Class4.aByteArray38[var99] = var124.method1997(-118910495);
										}

										if ((var10 & 4096) != 0) {
											var127 = var124.method1997(422103597);
										}

										if (var109.aBool2879) {
											if (var127 == 127) {
												var109.method3545(var109.anInt2891 * 545059223, var109.anInt2876 * 49441935, (byte) -12);
											} else {
												if (var127 != -1) {
													var150 = var127;
												} else {
													var150 = Class4.aByteArray38[var99];
												}

												var109.method3544(var109.anInt2891 * 545059223, var109.anInt2876 * 49441935, var150, 508864112);
											}
										}
									}

									if (var5 != var124.anInt1880 * 561453169 - var93) {
										throw new RuntimeException(var124.anInt1880 * 561453169 - var93 + " " + var5);
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 136) {
									var5 = aClass117_Sub14_Sub1_2953.method2012(1053511631);
									if (var5 == 65535) {
										var5 = -1;
									}

									Class106_Sub1.method2244(var5, (byte) 119);
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 115) {
									var5 = aClass117_Sub14_Sub1_2953.method2051(-410960084);
									var6 = aClass117_Sub14_Sub1_2953.method2046(-2147403413);
									if (var6 == 65535) {
										var6 = -1;
									}

									Class58.method874(var6, var5, (byte) 3);
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 230) {
									var5 = aClass117_Sub14_Sub1_2953.method2055((byte) 107);
									var6 = aClass117_Sub14_Sub1_2953.method2045((byte) 33);
									var118 = Class74.method1010(var5, -946296151);
									if (var118.anInt2080 * 1682942971 != 1 || var6 != var118.anInt2015 * 562552053) {
										var118.anInt2080 = -1110399181;
										var118.anInt2015 = var6 * -680726691;
										Class54.method850(var118, (byte) 0);
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 249 || incomingMessageId * 712029253 == 80 || incomingMessageId * 712029253 == 163 || incomingMessageId * 712029253 == 101 || incomingMessageId * 712029253 == 106 || incomingMessageId * 712029253 == 197 || incomingMessageId * 712029253 == 156 || incomingMessageId * 712029253 == 27 || incomingMessageId * 712029253 == 88 || incomingMessageId * 712029253 == 103) {
									Class117_Sub22_Sub10.method2549(332223171);
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 137) {
									var102 = aClass117_Sub14_Sub1_2953.method2018((byte) -5);
									var6 = aClass117_Sub14_Sub1_2953.method2050((byte) -58);
									var93 = aClass117_Sub14_Sub1_2953.method2176(-562845481);
									if (var93 >= 1 && var93 <= 8) {
										if (var102.equalsIgnoreCase("null")) {
											var102 = null;
										}

										aStringArray2936[var93 - 1] = var102;
										aBoolArray2986[var93 - 1] = var6 == 0;
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 184) {
									var104 = aClass117_Sub14_Sub1_2953;
									var6 = anInt2964 * 1735245331;
									Class117_Sub24 var114 = new Class117_Sub24();
									var114.anInt2136 = var104.method2010(-1439707937) * -1257524911;
									var114.anInt2141 = var104.method2015((byte) 10) * -1985565715;
									var114.anIntArray2137 = new int[var114.anInt2136 * 1311913905];
									var114.anIntArray2138 = new int[var114.anInt2136 * 1311913905];
									var114.aFieldArray2140 = new Field[var114.anInt2136 * 1311913905];
									var114.anIntArray2135 = new int[var114.anInt2136 * 1311913905];
									var114.aMethodArray2139 = new Method[var114.anInt2136 * 1311913905];
									var114.aByteArrayArrayArray2142 = new byte[var114.anInt2136 * 1311913905][][];

									for (var155 = 0; var155 < var114.anInt2136 * 1311913905; var155++) {
										try {
											var99 = var104.method2010(-1439707937);
											if (var99 != 0 && var99 != 1 && var99 != 2) {
												if (var99 == 3 || var99 == 4) {
													var105 = var104.method2018((byte) 18);
													var108 = var104.method2018((byte) 23);
													var11 = var104.method2010(-1439707937);
													String[] var129 = new String[var11];

													for (var107 = 0; var107 < var11; var107++) {
														var129[var107] = var104.method2018((byte) -52);
													}

													var133 = var104.method2018((byte) -19);
													byte[][] var144 = new byte[var11][];
													if (var99 == 3) {
														for (var15 = 0; var15 < var11; var15++) {
															var16 = var104.method2015((byte) 15);
															var144[var15] = new byte[var16];
															var104.method2021(var144[var15], 0, var16, 1658176429);
														}
													}

													var114.anIntArray2137[var155] = var99;
													Class[] var159 = new Class[var11];

													for (var16 = 0; var16 < var11; var16++) {
														var159[var16] = Class117_Sub22_Sub9.method2511(var129[var16], (short) 128);
													}

													Class var177 = Class117_Sub22_Sub9.method2511(var133, (short) 128);
													if (Class117_Sub22_Sub9.method2511(var105, (short) 128).getClassLoader() == null) {
														throw new SecurityException();
													}

													Method[] var157 = Class117_Sub22_Sub9.method2511(var105, (short) 128).getDeclaredMethods();
													Method[] var163 = var157;

													for (var19 = 0; var19 < var163.length; var19++) {
														Method var168 = var163[var19];
														if (var168.getName().equals(var108)) {
															Class[] var176 = var168.getParameterTypes();
															if (var176.length == var159.length) {
																boolean var175 = true;

																for (var174 = 0; var174 < var159.length; var174++) {
																	if (var159[var174] != var176[var174]) {
																		var175 = false;
																		break;
																	}
																}

																if (var175 && var177 == var168.getReturnType()) {
																	var114.aMethodArray2139[var155] = var168;
																}
															}
														}
													}

													var114.aByteArrayArrayArray2142[var155] = var144;
												}
											} else {
												var105 = var104.method2018((byte) -17);
												var108 = var104.method2018((byte) -22);
												var11 = 0;
												if (var99 == 1) {
													var11 = var104.method2015((byte) 104);
												}

												var114.anIntArray2137[var155] = var99;
												var114.anIntArray2135[var155] = var11;
												if (Class117_Sub22_Sub9.method2511(var105, (short) 128).getClassLoader() == null) {
													throw new SecurityException();
												}

												var114.aFieldArray2140[var155] = Class117_Sub22_Sub9.method2511(var105, (short) 128).getDeclaredField(var108);
											}
										} catch (ClassNotFoundException var78) {
											var114.anIntArray2138[var155] = -1;
										} catch (SecurityException var79) {
											var114.anIntArray2138[var155] = -2;
										} catch (NullPointerException var80) {
											var114.anIntArray2138[var155] = -3;
										} catch (Exception var81) {
											var114.anIntArray2138[var155] = -4;
										} catch (Throwable var82) {
											var114.anIntArray2138[var155] = -5;
										}
									}

									Class138.aClass126_1623.method1651(var114);
									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								if (incomingMessageId * 712029253 == 123) {
									for (var5 = 0; var5 < Class97.anIntArray1129.length; var5++) {
										if (Class97.anIntArray1129[var5] != Class97.anIntArray1127[var5]) {
											Class97.anIntArray1129[var5] = Class97.anIntArray1127[var5];
											Class117_Sub22_Sub13.method2631(var5, (byte) 64);
											anIntArray3050[(anInt3093 += 535212873) * 348172025 - 1 & 31] = var5;
										}
									}

									incomingMessageId = 512475507;
									var90 = true;
									break label4877;
								}

								Class117_Sub12.method1987("" + incomingMessageId * 712029253 + Class39.aString478 + anInt2969 * 2028811025 + Class39.aString478 + anInt2992 * 449003593 + Class39.aString478 + anInt2964 * 1735245331, (Throwable) null, 12675426);
								Class140.method1765(-1916789407);
							} catch (IOException var84) {
								Class117_Sub7.method1953(-70660976);
							} catch (Exception var85) {
								var102 = "" + incomingMessageId * 712029253 + Class39.aString478 + anInt2969 * 2028811025 + Class39.aString478 + anInt2992 * 449003593 + Class39.aString478 + anInt2964 * 1735245331 + Class39.aString478 + (Class117_Sub22_Sub20.anInt2497 * 544615727 + Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anIntArray2594[0]) + Class39.aString478 + (Class117_Sub22_Sub19.anInt2468 * -771797447 + Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anIntArray2541[0]) + Class39.aString478;

								for (var6 = 0; var6 < anInt2964 * 1735245331 && var6 < 50; var6++) {
									var102 = var102 + aClass117_Sub14_Sub1_2953.aByteArray1885[var6] + Class39.aString478;
								}

								Class117_Sub12.method1987(var102, var85, -84934906);
								Class140.method1765(-1916789407);
							}

							var90 = true;
						}
					}

					if (!var90) {
						break;
					}
				}

				if (anInt2924 * 935215971 == 30) {
					while (Class89.method1158(1738286520)) {
						aClass117_Sub14_Sub1_2961.method2932(101, 441744227);
						aClass117_Sub14_Sub1_2961.method2126(0, 773848521);
						var2 = aClass117_Sub14_Sub1_2961.anInt1880 * 561453169;
						Class2.method60(aClass117_Sub14_Sub1_2961, -362982067);
						aClass117_Sub14_Sub1_2961.method2007(aClass117_Sub14_Sub1_2961.anInt1880 * 561453169 - var2, (byte) 1);
					}

					Object var91 = Class70.aClass28_858.anObject349;
					synchronized (var91) {
						if (!aBool2915) {
							Class70.aClass28_858.anInt351 = 0;
						} else if (Class75.anInt909 * -393851667 != 0 || Class70.aClass28_858.anInt351 * -476391515 >= 40) {
							aClass117_Sub14_Sub1_2961.method2932(117, 730258410);
							aClass117_Sub14_Sub1_2961.method2126(0, 378615743);
							var3 = aClass117_Sub14_Sub1_2961.anInt1880 * 561453169;
							var89 = 0;

							for (var5 = 0; var5 < Class70.aClass28_858.anInt351 * -476391515 && aClass117_Sub14_Sub1_2961.anInt1880 * 561453169 - var3 < 240; var5++) {
								++var89;
								var6 = Class70.aClass28_858.anIntArray357[var5];
								if (var6 < 0) {
									var6 = 0;
								} else if (var6 > 502) {
									var6 = 502;
								}

								var93 = Class70.aClass28_858.anIntArray350[var5];
								if (var93 < 0) {
									var93 = 0;
								} else if (var93 > 764) {
									var93 = 764;
								}

								var155 = var93 + var6 * 765;
								if (Class70.aClass28_858.anIntArray357[var5] == -1 && Class70.aClass28_858.anIntArray350[var5] == -1) {
									var93 = -1;
									var6 = -1;
									var155 = 524287;
								}

								if (var93 == anInt2928 * 272379239 && anInt2929 * -991004731 == var6) {
									if (anInt3159 * -1035136915 < 2047) {
										anInt3159 += 1393129829;
									}
								} else {
									var99 = var93 - anInt2928 * 272379239;
									anInt2928 = var93 * 283221591;
									var101 = var6 - anInt2929 * -991004731;
									anInt2929 = var6 * -2080903411;
									if (anInt3159 * -1035136915 < 8 && var99 >= -32 && var99 <= 31 && var101 >= -32 && var101 <= 31) {
										var99 += 32;
										var101 += 32;
										aClass117_Sub14_Sub1_2961.method1996((var99 << 6) + (anInt3159 * -1035136915 << 12) + var101, (byte) -110);
										anInt3159 = 0;
									} else if (anInt3159 * -1035136915 < 8) {
										aClass117_Sub14_Sub1_2961.method2040(8388608 + (anInt3159 * -1035136915 << 19) + var155, 2130131468);
										anInt3159 = 0;
									} else {
										aClass117_Sub14_Sub1_2961.method2183(var155 + ((anInt3159 * -1035136915 << 19) - 1073741824), (byte) 76);
										anInt3159 = 0;
									}
								}
							}

							aClass117_Sub14_Sub1_2961.method2007(aClass117_Sub14_Sub1_2961.anInt1880 * 561453169 - var3, (byte) 1);
							if (var89 >= Class70.aClass28_858.anInt351 * -476391515) {
								Class70.aClass28_858.anInt351 = 0;
							} else {
								Class70.aClass28_858.anInt351 -= var89 * -2123614163;

								for (var5 = 0; var5 < Class70.aClass28_858.anInt351 * -476391515; var5++) {
									Class70.aClass28_858.anIntArray350[var5] = Class70.aClass28_858.anIntArray350[var5 + var89];
									Class70.aClass28_858.anIntArray357[var5] = Class70.aClass28_858.anIntArray357[var89 + var5];
								}
							}
						}
					}

					if (Class75.anInt909 * -393851667 == 1 || !Class95.aBool1107 && Class75.anInt909 * -393851667 == 4 || Class75.anInt909 * -393851667 == 2) {
						long var67 = (-3300927789349510697L * Class75.aLong910 - aLong3121 * 7664998772223173715L) / 50L;
						if (var67 > 4095L) {
							var67 = 4095L;
						}

						aLong3121 = -8623238172009964563L * Class75.aLong910;
						var89 = Class75.anInt901 * 1538480085;
						if (var89 < 0) {
							var89 = 0;
						} else if (var89 > Class117_Sub22_Sub18_Sub2.anInt2613 * 1325743505) {
							var89 = Class117_Sub22_Sub18_Sub2.anInt2613 * 1325743505;
						}

						var5 = Class75.anInt915 * -664246003;
						if (var5 < 0) {
							var5 = 0;
						} else if (var5 > Class80.anInt952 * 1566500665) {
							var5 = Class80.anInt952 * 1566500665;
						}

						var6 = (int) var67;
						aClass117_Sub14_Sub1_2961.method2932(63, -233632431);
						aClass117_Sub14_Sub1_2961.method1996((Class75.anInt909 * -393851667 == 2 ? 1 : 0) + (var6 << 1), (byte) -20);
						aClass117_Sub14_Sub1_2961.method1996(var5, (byte) -95);
						aClass117_Sub14_Sub1_2961.method1996(var89, (byte) -105);
					}

					if (Class89.anInt1039 * 383306105 > 0) {
						aClass117_Sub14_Sub1_2961.method2932(115, 1738145159);
						aClass117_Sub14_Sub1_2961.method1996(0, (byte) -122);
						var2 = aClass117_Sub14_Sub1_2961.anInt1880 * 561453169;
						long var69 = Class47.method774(1689987137);

						for (var5 = 0; var5 < Class89.anInt1039 * 383306105; var5++) {
							var58 = var69 - 6640577492088062337L * aLong3045;
							if (var58 > 16777215L) {
								var58 = 16777215L;
							}

							aLong3045 = var69 * -8391544638048747903L;
							aClass117_Sub14_Sub1_2961.method2214((int) var58, 1250350356);
							aClass117_Sub14_Sub1_2961.method2034(Class89.anIntArray1054[var5], (byte) -45);
						}

						aClass117_Sub14_Sub1_2961.method2006(aClass117_Sub14_Sub1_2961.anInt1880 * 561453169 - var2, -1826751121);
					}

					if (anInt3011 * -1740218931 > 0) {
						anInt3011 += 465709307;
					}

					if (Class89.aBoolArray1050[96] || Class89.aBoolArray1050[97] || Class89.aBoolArray1050[98] || Class89.aBoolArray1050[99]) {
						aBool3070 = true;
					}

					if (aBool3070 && anInt3011 * -1740218931 <= 0) {
						anInt3011 = -724251548;
						aBool3070 = false;
						aClass117_Sub14_Sub1_2961.method2932(83, 908462621);
						aClass117_Sub14_Sub1_2961.method2068(anInt3005 * -1204229987, (byte) 60);
						aClass117_Sub14_Sub1_2961.method2068(anInt3004 * -1836712259, (byte) 83);
					}

					if (Class131.aBool1589 && !aBool2963) {
						aBool2963 = true;
						aClass117_Sub14_Sub1_2961.method2932(125, 1162424271);
						aClass117_Sub14_Sub1_2961.method2126(1, 1240701891);
					}

					if (!Class131.aBool1589 && aBool2963) {
						aBool2963 = false;
						aClass117_Sub14_Sub1_2961.method2932(125, -269914051);
						aClass117_Sub14_Sub1_2961.method2126(0, 613562148);
					}

					Class97.method1256(1599221330);
					if (anInt2924 * 935215971 == 30) {
						Class117_Sub6.method1944(-1746769057);
						Class117_Sub22_Sub18_Sub1_Sub2.method3560(878007666);
						anInt2966 -= 933719009;
						if (anInt2966 * 1693575135 > 750) {
							Class117_Sub7.method1953(1249091719);
						} else {
							var2 = Class4.anInt46 * -1915182763;
							int[] var195 = Class4.anIntArray41;

							for (var89 = 0; var89 < var2; var89++) {
								Class117_Sub22_Sub18_Sub1_Sub2 var202 = aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var195[var89]];
								if (var202 != null) {
									Class7.method116(var202, 1, 384007564);
								}
							}

							Class114_Sub1.method1839(712029253);
							int[] var94 = Class4.anIntArray41;

							for (var3 = 0; var3 < Class4.anInt46 * -1915182763; var3++) {
								Class117_Sub22_Sub18_Sub1_Sub2 var110 = aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var94[var3]];
								if (var110 != null && var110.anInt2556 * -319635947 > 0) {
									var110.anInt2556 += 754441923;
									if (var110.anInt2556 * -319635947 == 0) {
										var110.aString2546 = null;
									}
								}
							}

							for (var3 = 0; var3 < anInt2956 * -434472087; var3++) {
								var89 = anIntArray2957[var3];
								Class117_Sub22_Sub18_Sub1_Sub1 var204 = aClass117_Sub22_Sub18_Sub1_Sub1Array2942[var89];
								if (var204 != null && var204.anInt2556 * -319635947 > 0) {
									var204.anInt2556 += 754441923;
									if (var204.anInt2556 * -319635947 == 0) {
										var204.aString2546 = null;
									}
								}
							}

							anInt3092 -= 1436987255;
							if (anInt3031 * -814638571 != 0) {
								anInt3049 -= 1022162508;
								if (anInt3049 * 2066478329 >= 400) {
									anInt3031 = 0;
								}
							}

							if (Class26.aClass117_Sub19_333 != null) {
								anInt3032 += 201293681;
								if (anInt3032 * -747675247 >= 15) {
									Class54.method850(Class26.aClass117_Sub19_333, (byte) 0);
									Class26.aClass117_Sub19_333 = null;
								}
							}

							Class117_Sub19 var96 = Class117_Sub22_Sub6.aClass117_Sub19_2271;
							Class117_Sub19 var198 = Class117_Sub5.aClass117_Sub19_1749;
							Class117_Sub22_Sub6.aClass117_Sub19_2271 = null;
							Class117_Sub5.aClass117_Sub19_1749 = null;
							aClass117_Sub19_3096 = null;
							aBool3100 = false;
							aBool3097 = false;
							anInt2925 = 0;

							while (true) {
								while (Class67.method960(-1544492869) && anInt2925 * 1079234157 < 128) {
									if (anInt3073 * -296746775 >= 2 && Class89.aBoolArray1050[82] && Class2.anInt11 * -1371052587 == 66) {
										var102 = "";

										Class117_Sub22_Sub7 var193;
										for (Iterator var201 = Class35.aClass118_442.iterator(); var201.hasNext(); var102 = var102 + var193.aString2276 + ':' + var193.aString2275 + '\n') {
											var193 = (Class117_Sub22_Sub7) var201.next();
										}

										Class39.aClipboard487.setContents(new StringSelection(var102), (ClipboardOwner) null);
									} else {
										anIntArray3144[anInt2925 * 1079234157] = Class2.anInt11 * -1371052587;
										anIntArray3143[anInt2925 * 1079234157] = Class36.aChar447;
										anInt2925 += 222849893;
									}
								}

								if (anInt3036 * -1635287017 != -1) {
									var89 = anInt3036 * -1635287017;
									var5 = Class80.anInt952 * 1566500665;
									var6 = Class117_Sub22_Sub18_Sub2.anInt2613 * 1325743505;
									if (Class4.method85(var89, 1176517149)) {
										Class46.method746(Class117_Sub19.aClass117_Sub19ArrayArray2032[var89], -1, 0, 0, var5, var6, 0, 0, (byte) -9);
									}
								}

								anInt3104 -= 1641162339;

								while (true) {
									Class117_Sub7 var116;
									Class117_Sub19 var207;
									do {
										var116 = (Class117_Sub7) aClass120_3119.method1594();
										if (var116 == null) {
											while (true) {
												do {
													var116 = (Class117_Sub7) aClass120_3120.method1594();
													if (var116 == null) {
														while (true) {
															do {
																var116 = (Class117_Sub7) aClass120_3118.method1594();
																if (var116 == null) {
																	boolean var119 = false;

																	while (!var119) {
																		var119 = true;

																		for (var5 = 0; var5 < anInt3060 * 1223430109 - 1; var5++) {
																			if (anIntArray2999[var5] < 1000 && anIntArray2999[1 + var5] > 1000) {
																				var125 = aStringArray3066[var5];
																				aStringArray3066[var5] = aStringArray3066[1 + var5];
																				aStringArray3066[var5 + 1] = var125;
																				var120 = aStringArray3065[var5];
																				aStringArray3065[var5] = aStringArray3065[1 + var5];
																				aStringArray3065[var5 + 1] = var120;
																				var155 = anIntArray2999[var5];
																				anIntArray2999[var5] = anIntArray2999[1 + var5];
																				anIntArray2999[var5 + 1] = var155;
																				var155 = anIntArray3061[var5];
																				anIntArray3061[var5] = anIntArray3061[1 + var5];
																				anIntArray3061[var5 + 1] = var155;
																				var155 = anIntArray3009[var5];
																				anIntArray3009[var5] = anIntArray3009[var5 + 1];
																				anIntArray3009[var5 + 1] = var155;
																				var155 = anIntArray3064[var5];
																				anIntArray3064[var5] = anIntArray3064[var5 + 1];
																				anIntArray3064[1 + var5] = var155;
																				var119 = false;
																			}
																		}
																	}

																	if (Class55.aClass117_Sub19_738 == null && aClass117_Sub19_3019 == null) {
																		var89 = Class75.anInt909 * -393851667;
																		if (aBool3059) {
																			if (var89 != 1 && (Class95.aBool1107 || var89 != 4)) {
																				var5 = Class75.anInt903 * -456706193;
																				var6 = Class75.anInt904 * 1381104939;
																				if (var5 < Class28.anInt359 * -185062675 - 10 || var5 > 10 + Class28.anInt359 * -185062675 + Class54.anInt735 * -2038284061 || var6 < Class114_Sub1.anInt1673 * 1102988949 - 10 || var6 > 10 + Class114_Sub1.anInt1673 * 1102988949 + Class45.anInt599 * -915640919) {
																					aBool3059 = false;
																					Class33.method486(Class28.anInt359 * -185062675, Class114_Sub1.anInt1673 * 1102988949, Class54.anInt735 * -2038284061, Class45.anInt599 * -915640919, -1987167178);
																				}
																			}

																			if (var89 == 1 || !Class95.aBool1107 && var89 == 4) {
																				var5 = Class28.anInt359 * -185062675;
																				var6 = Class114_Sub1.anInt1673 * 1102988949;
																				var93 = Class54.anInt735 * -2038284061;
																				var155 = Class75.anInt915 * -664246003;
																				var99 = Class75.anInt901 * 1538480085;
																				var101 = -1;

																				for (var10 = 0; var10 < anInt3060 * 1223430109; var10++) {
																					var11 = (anInt3060 * 1223430109 - 1 - var10) * 15 + 31 + var6;
																					if (var155 > var5 && var155 < var93 + var5 && var99 > var11 - 13 && var99 < var11 + 3) {
																						var101 = var10;
																					}
																				}

																				if (var101 != -1 && var101 >= 0) {
																					var10 = anIntArray3061[var101];
																					var11 = anIntArray3009[var101];
																					var12 = anIntArray2999[var101];
																					var107 = anIntArray3064[var101];
																					String var178 = aStringArray3065[var101];
																					var172 = aStringArray3066[var101];
																					Class14.method296(var10, var11, var12, var107, var178, var172, Class75.anInt915 * -664246003, Class75.anInt901 * 1538480085, 1765014865);
																				}

																				aBool3059 = false;
																				Class33.method486(Class28.anInt359 * -185062675, Class114_Sub1.anInt1673 * 1102988949, Class54.anInt735 * -2038284061, Class45.anInt599 * -915640919, -2000146316);
																			}
																		} else {
																			label4953:
																			{
																				label5037:
																				{
																					if ((var89 == 1 || !Class95.aBool1107 && var89 == 4) && anInt3060 * 1223430109 > 0) {
																						var5 = anIntArray2999[anInt3060 * 1223430109 - 1];
																						if (var5 == 39 || var5 == 40 || var5 == 41 || var5 == 42 || var5 == 43 || var5 == 33 || var5 == 34 || var5 == 35 || var5 == 36 || var5 == 37 || var5 == 38 || var5 == 1005) {
																							var6 = anIntArray3061[anInt3060 * 1223430109 - 1];
																							var93 = anIntArray3009[anInt3060 * 1223430109 - 1];
																							var192 = Class74.method1010(var93, -665515102);
																							var101 = Class67.method961(var192, -539276427);
																							var8 = (var101 >> 28 & 1) != 0;
																							if (var8) {
																								break label5037;
																							}

																							Class93 var213 = (Class93) null;
																							if (Class79.method1076(Class67.method961(var192, -1837291898), -2115458452)) {
																								break label5037;
																							}
																						}
																					}

																					if ((var89 == 1 || !Class95.aBool1107 && var89 == 4) && (anInt3149 * -370826807 == 1 && anInt3060 * 1223430109 > 2 || Class117_Sub5.method1935(anInt3060 * 1223430109 - 1, (byte) -7))) {
																						var89 = 2;
																					}

																					if ((var89 == 1 || !Class95.aBool1107 && var89 == 4) && anInt3060 * 1223430109 > 0) {
																						var5 = anInt3060 * 1223430109 - 1;
																						if (var5 >= 0) {
																							var6 = anIntArray3061[var5];
																							var93 = anIntArray3009[var5];
																							var155 = anIntArray2999[var5];
																							var99 = anIntArray3064[var5];
																							var105 = aStringArray3065[var5];
																							var108 = aStringArray3066[var5];
																							Class14.method296(var6, var93, var155, var99, var105, var108, Class75.anInt915 * -664246003, Class75.anInt901 * 1538480085, 1765014865);
																						}
																					}

																					if (var89 == 2 && anInt3060 * 1223430109 > 0) {
																						Class101.method1289(Class75.anInt915 * -664246003, Class75.anInt901 * 1538480085, -2108022665);
																					}
																					break label4953;
																				}

																				if (Class55.aClass117_Sub19_738 != null && !aBool3038 && anInt3149 * -370826807 != 1 && !Class117_Sub5.method1935(anInt3060 * 1223430109 - 1, (byte) 29) && anInt3060 * 1223430109 > 0) {
																					Class116.method1530(anInt3035 * 1554516091, anInt2949 * 274254957, (short) 23295);
																				}

																				aBool3038 = false;
																				anInt3039 = 0;
																				if (Class55.aClass117_Sub19_738 != null) {
																					Class54.method850(Class55.aClass117_Sub19_738, (byte) 0);
																				}

																				Class55.aClass117_Sub19_738 = Class74.method1010(var93, -2085432327);
																				anInt3034 = var6 * 907668439;
																				anInt3035 = Class75.anInt915 * -1779101161;
																				anInt2949 = Class75.anInt901 * -1560557559;
																				if (anInt3060 * 1223430109 > 0) {
																					var10 = anInt3060 * 1223430109 - 1;
																					Class117_Sub6.aClass3_1770 = new Class3();
																					Class117_Sub6.aClass3_1770.anInt26 = anIntArray3061[var10] * 1558298929;
																					Class117_Sub6.aClass3_1770.anInt31 = anIntArray3009[var10] * -642764011;
																					Class117_Sub6.aClass3_1770.anInt28 = anIntArray2999[var10] * 354852715;
																					Class117_Sub6.aClass3_1770.anInt25 = anIntArray3064[var10] * -225579981;
																					Class117_Sub6.aClass3_1770.aString29 = aStringArray3065[var10];
																				}

																				Class54.method850(Class55.aClass117_Sub19_738, (byte) 0);
																			}
																		}
																	}

																	if (aClass117_Sub19_3019 != null) {
																		Class66.method952((byte) 30);
																	}

																	if (Class55.aClass117_Sub19_738 != null) {
																		Class54.method850(Class55.aClass117_Sub19_738, (byte) 0);
																		anInt3039 += 548637343;
																		if (Class75.anInt911 * -1760033137 != 0) {
																			if (anInt3039 * 1509232991 >= 5 && (Class75.anInt903 * -456706193 > anInt3035 * 1554516091 + 5 || Class75.anInt903 * -456706193 < anInt3035 * 1554516091 - 5 || Class75.anInt904 * 1381104939 > anInt2949 * 274254957 + 5 || Class75.anInt904 * 1381104939 < anInt2949 * 274254957 - 5)) {
																				aBool3038 = true;
																			}
																		} else {
																			if (aBool3038) {
																				if (Class7.aClass117_Sub19_104 == Class55.aClass117_Sub19_738 && anInt3037 * -370004821 != anInt3034 * 1685534695) {
																					Class117_Sub19 var135 = Class55.aClass117_Sub19_738;
																					byte var210 = 0;
																					if (anInt3082 * 1258251049 == 1 && var135.anInt2018 * 2064823433 == 206) {
																						var210 = 1;
																					}

																					if (var135.anIntArray2049[anInt3037 * -370004821] <= 0) {
																						var210 = 0;
																					}

																					var93 = Class67.method961(var135, -506120668);
																					var160 = (var93 >> 29 & 1) != 0;
																					if (var160) {
																						var155 = anInt3034 * 1685534695;
																						var99 = anInt3037 * -370004821;
																						var135.anIntArray2049[var99] = var135.anIntArray2049[var155];
																						var135.anIntArray2058[var99] = var135.anIntArray2058[var155];
																						var135.anIntArray2049[var155] = -1;
																						var135.anIntArray2058[var155] = 0;
																					} else if (var210 == 1) {
																						var155 = anInt3034 * 1685534695;
																						var99 = anInt3037 * -370004821;

																						while (var155 != var99) {
																							if (var155 > var99) {
																								var135.method2280(var155 - 1, var155, 561453169);
																								--var155;
																							} else if (var155 < var99) {
																								var135.method2280(var155 + 1, var155, 561453169);
																								++var155;
																							}
																						}
																					} else {
																						var135.method2280(anInt3037 * -370004821, anInt3034 * 1685534695, 561453169);
																					}

																					aClass117_Sub14_Sub1_2961.method2932(61, -95371708);
																					aClass117_Sub14_Sub1_2961.method2035(var210, -1759507835);
																					aClass117_Sub14_Sub1_2961.method2042(anInt3034 * 1685534695, (byte) 8);
																					aClass117_Sub14_Sub1_2961.method2209(anInt3037 * -370004821, -2069472551);
																					aClass117_Sub14_Sub1_2961.method2053(Class55.aClass117_Sub19_738.anInt1973 * -1955776525, 734640632);
																				}
																			} else if ((anInt3149 * -370826807 == 1 || Class117_Sub5.method1935(anInt3060 * 1223430109 - 1, (byte) -94)) && anInt3060 * 1223430109 > 2) {
																				Class101.method1289(anInt3035 * 1554516091, anInt2949 * 274254957, -2108022665);
																			} else if (anInt3060 * 1223430109 > 0) {
																				Class116.method1530(anInt3035 * 1554516091, anInt2949 * 274254957, (short) 4312);
																			}

																			anInt3032 = 2012936810;
																			Class75.anInt909 = 0;
																			Class55.aClass117_Sub19_738 = null;
																		}
																	}

																	if (Class42.anInt580 != -1) {
																		var89 = Class42.anInt580;
																		var5 = Class42.anInt555;
																		aClass117_Sub14_Sub1_2961.method2932(187, 396224026);
																		aClass117_Sub14_Sub1_2961.method2126(5, 2068622976);
																		aClass117_Sub14_Sub1_2961.method1996(Class117_Sub22_Sub20.anInt2497 * 544615727 + var89, (byte) -86);
																		aClass117_Sub14_Sub1_2961.method2126(Class89.aBoolArray1050[82] ? (Class89.aBoolArray1050[81] ? 2 : 1) : 0, -172657932);
																		aClass117_Sub14_Sub1_2961.method2209(var5 + Class117_Sub22_Sub19.anInt2468 * -771797447, -2069472551);
																		Class42.anInt580 = -1;
																		anInt3028 = Class75.anInt915 * -1686525749;
																		anInt3140 = Class75.anInt901 * 970244235;
																		anInt3031 = -57383619;
																		anInt3049 = 0;
																		anInt3153 = var89 * 1748897489;
																		anInt3154 = var5 * -2025568851;
																	}

																	if (Class117_Sub22_Sub6.aClass117_Sub19_2271 != var96) {
																		if (var96 != null) {
																			Class54.method850(var96, (byte) 0);
																		}

																		if (Class117_Sub22_Sub6.aClass117_Sub19_2271 != null) {
																			Class54.method850(Class117_Sub22_Sub6.aClass117_Sub19_2271, (byte) 0);
																		}
																	}

																	if (var198 != Class117_Sub5.aClass117_Sub19_1749 && anInt3069 * 968251447 == anInt3123 * -1796547367) {
																		if (var198 != null) {
																			Class54.method850(var198, (byte) 0);
																		}

																		if (Class117_Sub5.aClass117_Sub19_1749 != null) {
																			Class54.method850(Class117_Sub5.aClass117_Sub19_1749, (byte) 0);
																		}
																	}

																	if (Class117_Sub5.aClass117_Sub19_1749 != null) {
																		if (anInt3069 * 968251447 < anInt3123 * -1796547367) {
																			anInt3069 += 1456528775;
																			if (anInt3069 * 968251447 == anInt3123 * -1796547367) {
																				Class54.method850(Class117_Sub5.aClass117_Sub19_1749, (byte) 0);
																			}
																		}
																	} else if (anInt3069 * 968251447 > 0) {
																		anInt3069 -= 1456528775;
																	}

																	var89 = anInt2939 * 805374805 + Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2577 * 1961555871;
																	var5 = Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.anInt2567 * -184603173 + anInt3145 * -1729719107;
																	if (Class117_Sub12.anInt1854 * 1354878175 - var89 < -500 || Class117_Sub12.anInt1854 * 1354878175 - var89 > 500 || Class54.anInt737 * -815988555 - var5 < -500 || Class54.anInt737 * -815988555 - var5 > 500) {
																		Class117_Sub12.anInt1854 = var89 * 2050813727;
																		Class54.anInt737 = var5 * 1702096285;
																	}

																	if (var89 != Class117_Sub12.anInt1854 * 1354878175) {
																		Class117_Sub12.anInt1854 += (var89 - Class117_Sub12.anInt1854 * 1354878175) / 16 * 2050813727;
																	}

																	if (Class54.anInt737 * -815988555 != var5) {
																		Class54.anInt737 += (var5 - Class54.anInt737 * -815988555) / 16 * 1702096285;
																	}

																	if (Class75.anInt911 * -1760033137 == 4 && Class95.aBool1107) {
																		var6 = Class75.anInt904 * 1381104939 - anInt3113 * 981643079;
																		anInt2930 = var6 * 668934902;
																		anInt3113 = (var6 != -1 && var6 != 1 ? (Class75.anInt904 * 1381104939 + anInt3113 * 981643079) / 2 : Class75.anInt904 * 1381104939) * 1807370871;
																		var93 = anInt3008 * 1966172873 - Class75.anInt903 * -456706193;
																		anInt3006 = var93 * -1370578698;
																		anInt3008 = 233623417 * (var93 != -1 && var93 != 1 ? (Class75.anInt903 * -456706193 + anInt3008 * 1966172873) / 2 : Class75.anInt903 * -456706193);
																	} else {
																		if (Class89.aBoolArray1050[96]) {
																			anInt3006 += (-24 - anInt3006 * 110366387) / 2 * -685289349;
																		} else if (Class89.aBoolArray1050[97]) {
																			anInt3006 += (24 - anInt3006 * 110366387) / 2 * -685289349;
																		} else {
																			anInt3006 = anInt3006 * 110366387 / 2 * -685289349;
																		}

																		if (Class89.aBoolArray1050[98]) {
																			anInt2930 += (12 - anInt2930 * 1348183475) / 2 * -1813016197;
																		} else if (Class89.aBoolArray1050[99]) {
																			anInt2930 += (-12 - anInt2930 * 1348183475) / 2 * -1813016197;
																		} else {
																			anInt2930 = anInt2930 * 1348183475 / 2 * -1813016197;
																		}

																		anInt3113 = Class75.anInt904 * -511107843;
																		anInt3008 = Class75.anInt903 * -179309449;
																	}

																	anInt3005 = (anInt3006 * 110366387 / 2 + anInt3005 * -1204229987 & 2047) * 109370805;
																	anInt3004 += anInt2930 * 1348183475 / 2 * -454595435;
																	if (anInt3004 * -1836712259 < 128) {
																		anInt3004 = 1941326464;
																	}

																	if (anInt3004 * -1836712259 > 383) {
																		anInt3004 = 1983607531;
																	}

																	var6 = Class117_Sub12.anInt1854 * 1354878175 >> 7;
																	var93 = Class54.anInt737 * -815988555 >> 7;
																	var155 = Class44.method729(Class117_Sub12.anInt1854 * 1354878175, Class54.anInt737 * -815988555, Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, -1558232563);
																	var99 = 0;
																	if (var6 > 3 && var93 > 3 && var6 < 100 && var93 < 100) {
																		for (var101 = var6 - 4; var101 <= 4 + var6; var101++) {
																			for (var10 = var93 - 4; var10 <= var93 + 4; var10++) {
																				var11 = Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421;
																				if (var11 < 3 && (Class31.aByteArrayArrayArray401[1][var101][var10] & 2) == 2) {
																					++var11;
																				}

																				var12 = var155 - Class31.anIntArrayArrayArray381[var11][var101][var10];
																				if (var12 > var99) {
																					var99 = var12;
																				}
																			}
																		}
																	}

																	var101 = var99 * 192;
																	if (var101 > 98048) {
																		var101 = 98048;
																	}

																	if (var101 < 32768) {
																		var101 = 32768;
																	}

																	if (var101 > anInt3063 * -488679193) {
																		anInt3063 += (var101 - anInt3063 * -488679193) / 24 * 1350056663;
																	} else if (var101 < anInt3063 * -488679193) {
																		anInt3063 += (var101 - anInt3063 * -488679193) / 80 * 1350056663;
																	}

																	if (aBool3168) {
																		var89 = 64 + Class90.anInt1071 * -1022329472;
																		var5 = 64 + Class117_Sub22_Sub11.anInt2330 * -1014973568;
																		var6 = Class44.method729(var89, var5, Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, 864317758) - Class27.anInt345 * -1974798889;
																		if (Class76.anInt916 * 1355759835 < var89) {
																			Class76.anInt916 += (Class23.anInt282 * 210391483 + (var89 - Class76.anInt916 * 1355759835) * Class45.anInt610 * 166622511 / 1000) * 900381523;
																			if (Class76.anInt916 * 1355759835 > var89) {
																				Class76.anInt916 = var89 * 900381523;
																			}
																		}

																		if (Class76.anInt916 * 1355759835 > var89) {
																			Class76.anInt916 -= ((Class76.anInt916 * 1355759835 - var89) * Class45.anInt610 * 166622511 / 1000 + Class23.anInt282 * 210391483) * 900381523;
																			if (Class76.anInt916 * 1355759835 < var89) {
																				Class76.anInt916 = var89 * 900381523;
																			}
																		}

																		if (Class117_Sub22_Sub1.anInt2143 * 716978923 < var6) {
																			Class117_Sub22_Sub1.anInt2143 += ((var6 - Class117_Sub22_Sub1.anInt2143 * 716978923) * Class45.anInt610 * 166622511 / 1000 + Class23.anInt282 * 210391483) * -1908957757;
																			if (Class117_Sub22_Sub1.anInt2143 * 716978923 > var6) {
																				Class117_Sub22_Sub1.anInt2143 = var6 * -1908957757;
																			}
																		}

																		if (Class117_Sub22_Sub1.anInt2143 * 716978923 > var6) {
																			Class117_Sub22_Sub1.anInt2143 -= (Class45.anInt610 * 166622511 * (Class117_Sub22_Sub1.anInt2143 * 716978923 - var6) / 1000 + Class23.anInt282 * 210391483) * -1908957757;
																			if (Class117_Sub22_Sub1.anInt2143 * 716978923 < var6) {
																				Class117_Sub22_Sub1.anInt2143 = var6 * -1908957757;
																			}
																		}

																		if (Class49.anInt665 * 1784829965 < var5) {
																			Class49.anInt665 += (Class23.anInt282 * 210391483 + (var5 - Class49.anInt665 * 1784829965) * Class45.anInt610 * 166622511 / 1000) * 1734194885;
																			if (Class49.anInt665 * 1784829965 > var5) {
																				Class49.anInt665 = var5 * 1734194885;
																			}
																		}

																		if (Class49.anInt665 * 1784829965 > var5) {
																			Class49.anInt665 -= (Class45.anInt610 * 166622511 * (Class49.anInt665 * 1784829965 - var5) / 1000 + Class23.anInt282 * 210391483) * 1734194885;
																			if (Class49.anInt665 * 1784829965 < var5) {
																				Class49.anInt665 = var5 * 1734194885;
																			}
																		}

																		var89 = Class63.anInt775 * 1609888384 + 64;
																		var5 = 64 + Class22.anInt268 * -770917248;
																		var6 = Class44.method729(var89, var5, Class117_Sub22_Sub18_Sub3.anInt2629 * -1003847421, 1122912875) - Class117_Sub22_Sub18_Sub6.anInt2758 * -39623755;
																		var93 = var89 - Class76.anInt916 * 1355759835;
																		var155 = var6 - Class117_Sub22_Sub1.anInt2143 * 716978923;
																		var99 = var5 - Class49.anInt665 * 1784829965;
																		var101 = (int) Math.sqrt((double) (var99 * var99 + var93 * var93));
																		var10 = (int) (Math.atan2((double) var155, (double) var101) * 325.949D) & 2047;
																		var11 = (int) (Math.atan2((double) var93, (double) var99) * -325.949D) & 2047;
																		if (var10 < 128) {
																			var10 = 128;
																		}

																		if (var10 > 383) {
																			var10 = 383;
																		}

																		if (Class117_Sub5.anInt1758 * -1894076819 < var10) {
																			Class117_Sub5.anInt1758 += ((var10 - Class117_Sub5.anInt1758 * -1894076819) * anInt3207 * 821862215 / 1000 + Class46.anInt631 * 50507393) * -631993499;
																			if (Class117_Sub5.anInt1758 * -1894076819 > var10) {
																				Class117_Sub5.anInt1758 = var10 * -631993499;
																			}
																		}

																		if (Class117_Sub5.anInt1758 * -1894076819 > var10) {
																			Class117_Sub5.anInt1758 -= ((Class117_Sub5.anInt1758 * -1894076819 - var10) * anInt3207 * 821862215 / 1000 + Class46.anInt631 * 50507393) * -631993499;
																			if (Class117_Sub5.anInt1758 * -1894076819 < var10) {
																				Class117_Sub5.anInt1758 = var10 * -631993499;
																			}
																		}

																		var12 = var11 - RuntimeException_Sub1.anInt2838 * -1774046803;
																		if (var12 > 1024) {
																			var12 -= 2048;
																		}

																		if (var12 < -1024) {
																			var12 += 2048;
																		}

																		if (var12 > 0) {
																			RuntimeException_Sub1.anInt2838 += (Class46.anInt631 * 50507393 + var12 * anInt3207 * 821862215 / 1000) * -1646765531;
																			RuntimeException_Sub1.anInt2838 = (RuntimeException_Sub1.anInt2838 * -1774046803 & 2047) * -1646765531;
																		}

																		if (var12 < 0) {
																			RuntimeException_Sub1.anInt2838 -= (anInt3207 * 821862215 * -var12 / 1000 + Class46.anInt631 * 50507393) * -1646765531;
																			RuntimeException_Sub1.anInt2838 = (RuntimeException_Sub1.anInt2838 * -1774046803 & 2047) * -1646765531;
																		}

																		var107 = var11 - RuntimeException_Sub1.anInt2838 * -1774046803;
																		if (var107 > 1024) {
																			var107 -= 2048;
																		}

																		if (var107 < -1024) {
																			var107 += 2048;
																		}

																		if (var107 < 0 && var12 > 0 || var107 > 0 && var12 < 0) {
																			RuntimeException_Sub1.anInt2838 = var11 * -1646765531;
																		}
																	}

																	for (var89 = 0; var89 < 5; var89++) {
																		++anIntArray3173[var89];
																	}

																	Class69.aClass46_851.method750(649720245);
																	var89 = (Class75.anInt898 += 413953979) * 863698291 - 1;
																	var6 = Class117_Sub22_Sub15.method2852(103956313);
																	if (var89 > 15000 && var6 > 15000) {
																		anInt3101 = -178972094;
																		Class117_Sub22_Sub4.method2385(14500, (byte) 27);
																		aClass117_Sub14_Sub1_2961.method2932(188, 1831353221);
																	}

																	anInt2989 -= 575551035;
																	if (anInt2989 * -2043753203 > 500) {
																		anInt2989 = 0;
																		var93 = (int) (Math.random() * 8.0D);
																		if ((var93 & 1) == 1) {
																			anInt2939 += anInt2984 * -75393261;
																		}

																		if ((var93 & 2) == 2) {
																			anInt3145 += anInt3086 * -1515958309;
																		}

																		if ((var93 & 4) == 4) {
																			anInt2987 += anInt2988 * 1380024551;
																		}
																	}

																	if (anInt2939 * 805374805 < -50) {
																		anInt2984 = -234768034;
																	}

																	if (anInt2939 * 805374805 > 50) {
																		anInt2984 = 234768034;
																	}

																	if (anInt3145 * -1729719107 < -55) {
																		anInt3086 = 1358138526;
																	}

																	if (anInt3145 * -1729719107 > 55) {
																		anInt3086 = -1358138526;
																	}

																	if (anInt2987 * 826775265 < -40) {
																		anInt2988 = 1059174583;
																	}

																	if (anInt2987 * 826775265 > 40) {
																		anInt2988 = -1059174583;
																	}

																	anInt2994 += 667911423;
																	if (anInt2994 * -2145944833 > 500) {
																		anInt2994 = 0;
																		var93 = (int) (Math.random() * 8.0D);
																		if ((var93 & 1) == 1) {
																			anInt2990 += anInt2991 * 1560033217;
																		}

																		if ((var93 & 2) == 2) {
																			anInt3202 += anInt2993 * -956756517;
																		}
																	}

																	if (anInt2990 * -1810209603 < -60) {
																		anInt2991 = -1512560726;
																	}

																	if (anInt2990 * -1810209603 > 60) {
																		anInt2991 = 1512560726;
																	}

																	if (anInt3202 * 138652733 < -20) {
																		anInt2993 = -398559793;
																	}

																	if (anInt3202 * 138652733 > 10) {
																		anInt2993 = 398559793;
																	}

																	for (Class114_Sub1 var200 = (Class114_Sub1) aClass110_3148.method1488(); var200 != null; var200 = (Class114_Sub1) aClass110_3148.method1490()) {
																		if ((long) (var200.anInt1668 * -986796829) < Class47.method774(394222695) / 1000L - 5L) {
																			if (var200.aShort1664 > 0) {
																				Class117_Sub22_Sub1.method2353(5, "", var200.aString1665 + Class108.aString1347, 1579202402);
																			}

																			if (var200.aShort1664 == 0) {
																				Class117_Sub22_Sub1.method2353(5, "", var200.aString1665 + Class108.aString1348, 1932362152);
																			}

																			var200.method1511();
																		}
																	}

																	anInt2967 += 2105338273;
																	if (anInt2967 * 2141010529 > 50) {
																		aClass117_Sub14_Sub1_2961.method2932(179, 821803868);
																	}

																	try {
																		if (Class117_Sub22_Sub18_Sub2.aClass81_2609 != null && aClass117_Sub14_Sub1_2961.anInt1880 * 561453169 > 0) {
																			Class117_Sub22_Sub18_Sub2.aClass81_2609.method1107(aClass117_Sub14_Sub1_2961.aByteArray1885, 0, aClass117_Sub14_Sub1_2961.anInt1880 * 561453169, (byte) 4);
																			aClass117_Sub14_Sub1_2961.anInt1880 = 0;
																			anInt2967 = 0;
																			return;
																		}
																	} catch (IOException var71) {
																		Class117_Sub7.method1953(-688545977);
																	}

																	return;
																}

																var207 = var116.aClass117_Sub19_1780;
																if (var207.anInt1976 * 1710354431 < 0) {
																	break;
																}

																var142 = Class74.method1010(var207.anInt2027 * 1264631563, -1084549327);
															}
															while (var142 == null || var142.aClass117_Sub19Array2095 == null || var207.anInt1976 * 1710354431 >= var142.aClass117_Sub19Array2095.length || var142.aClass117_Sub19Array2095[var207.anInt1976 * 1710354431] != var207);

															Class57.method867(var116, 200000, -974081879);
														}
													}

													var207 = var116.aClass117_Sub19_1780;
													if (var207.anInt1976 * 1710354431 < 0) {
														break;
													}

													var142 = Class74.method1010(var207.anInt2027 * 1264631563, -1456087467);
												}
												while (var142 == null || var142.aClass117_Sub19Array2095 == null || var207.anInt1976 * 1710354431 >= var142.aClass117_Sub19Array2095.length || var207 != var142.aClass117_Sub19Array2095[var207.anInt1976 * 1710354431]);

												Class57.method867(var116, 200000, -87595760);
											}
										}

										var207 = var116.aClass117_Sub19_1780;
										if (var207.anInt1976 * 1710354431 < 0) {
											break;
										}

										var142 = Class74.method1010(var207.anInt2027 * 1264631563, -608507701);
									}
									while (var142 == null || var142.aClass117_Sub19Array2095 == null || var207.anInt1976 * 1710354431 >= var142.aClass117_Sub19Array2095.length || var207 != var142.aClass117_Sub19Array2095[var207.anInt1976 * 1710354431]);

									Class57.method867(var116, 200000, 816572639);
								}
							}
						}
					}
				}
			}
		} else if (anInt2924 * 935215971 == 40 || anInt2924 * 935215971 == 45) {
			Class64.method933((byte) 1);
		}

	}

	protected final void method3578(byte var1) {
		boolean var2 = Class17.method339((byte) -1);
		if (var2 && aBool3158 && Class17.aClass14_210 != null) {
			Class17.aClass14_210.method244((byte) 0);
		}

		if (anInt2924 * 935215971 == 10 || anInt2924 * 935215971 == 20 || anInt2924 * 935215971 == 30) {
			if (-7721533266942693833L * aLong3132 != 0L && Class47.method774(1988797821) > -7721533266942693833L * aLong3132) {
				Class64.method938(Class2.method63(-1057647793), 534537233);
			} else if (aBool2910) {
				Class85.method1143(-754297200);
			}
		}

		Dimension var3 = method3582(-820581715);
		if (var3.width != Class14.anInt177 * 715849079 || var3.height != Class117_Sub18.anInt1954 * 910153847 || aBool2913) {
			Class8.method133(951752841);
			aLong3132 = (Class47.method774(835074243) + 500L) * 3969893317323532167L;
			aBool2913 = false;
		}

		boolean var4 = false;
		int var5;
		if (aBool2902) {
			aBool2902 = false;
			var4 = true;

			for (var5 = 0; var5 < 100; var5++) {
				aBoolArray3124[var5] = true;
			}
		}

		if (var4) {
			Class117_Sub10.method1969(-877443344);
		}

		if (anInt2924 * 935215971 == 0) {
			Class117_Sub5.method1936(Class6.anInt69 * 354422189, Class6.aString70, (Color) null, var4, (byte) 14);
		} else if (anInt2924 * 935215971 == 5) {
			Class117_Sub13.method1991(Class54_Sub1.aClass117_Sub22_Sub17_Sub4_Sub1_1729, aClass117_Sub22_Sub17_Sub4_Sub1_2973, Class39.aClass117_Sub22_Sub17_Sub4_Sub1_485, var4, (byte) -8);
		} else if (anInt2924 * 935215971 != 10 && anInt2924 * 935215971 != 11) {
			if (anInt2924 * 935215971 == 20) {
				Class117_Sub13.method1991(Class54_Sub1.aClass117_Sub22_Sub17_Sub4_Sub1_1729, aClass117_Sub22_Sub17_Sub4_Sub1_2973, Class39.aClass117_Sub22_Sub17_Sub4_Sub1_485, var4, (byte) -14);
			} else if (anInt2924 * 935215971 == 25) {
				if (anInt2978 * 1251975225 == 1) {
					if (anInt2974 * -1629818109 > anInt2975 * -1514512783) {
						anInt2975 = anInt2974 * -2050848077;
					}

					var5 = (anInt2975 * 1583772178 - anInt2974 * 113473174) / (anInt2975 * -1514512783);
					Class117_Sub22_Sub12.method2586(Class108.aString1209 + Class39.aString482 + Class39.aString479 + var5 + "%" + Class39.aString480, false, (byte) -85);
				} else if (anInt2978 * 1251975225 == 2) {
					if (anInt3199 * -193776729 > anInt2977 * -1584981353) {
						anInt2977 = anInt3199 * 1226121585;
					}

					var5 = (anInt2977 * -1939656322 - anInt3199 * -1098901858) / (anInt2977 * -1584981353) + 50;
					Class117_Sub22_Sub12.method2586(Class108.aString1209 + Class39.aString482 + Class39.aString479 + var5 + "%" + Class39.aString480, false, (byte) -66);
				} else {
					Class117_Sub22_Sub12.method2586(Class108.aString1209, false, (byte) -27);
				}
			} else if (anInt2924 * 935215971 == 30) {
				Class40.method529((byte) 0);
			} else if (anInt2924 * 935215971 == 40) {
				Class117_Sub22_Sub12.method2586(Class108.aString1380 + Class39.aString482 + Class108.aString1202, false, (byte) -42);
			} else if (anInt2924 * 935215971 == 45) {
				Class117_Sub22_Sub12.method2586(Class108.aString1242, false, (byte) -12);
			}
		} else {
			Class117_Sub13.method1991(Class54_Sub1.aClass117_Sub22_Sub17_Sub4_Sub1_1729, aClass117_Sub22_Sub17_Sub4_Sub1_2973, Class39.aClass117_Sub22_Sub17_Sub4_Sub1_485, var4, (byte) -54);
		}

		int var6;
		Graphics var9;
		if (anInt2924 * 935215971 == 30 && anInt3131 * 317367717 == 0 && !var4) {
			try {
				var9 = Class91.aCanvas1085.getGraphics();

				for (var6 = 0; var6 < anInt3122 * -115854549; var6++) {
					if (aBoolArray3062[var6]) {
						Class82.aClass8_979.method123(var9, anIntArray3022[var6], anIntArray3128[var6], anIntArray3129[var6], anIntArray3130[var6], 237893766);
						aBoolArray3062[var6] = false;
					}
				}
			} catch (Exception var8) {
				Class91.aCanvas1085.repaint();
			}
		} else if (anInt2924 * 935215971 > 0) {
			try {
				var9 = Class91.aCanvas1085.getGraphics();
				Class82.aClass8_979.method122(var9, 0, 0, 1291186113);

				for (var6 = 0; var6 < anInt3122 * -115854549; var6++) {
					aBoolArray3062[var6] = false;
				}
			} catch (Exception var7) {
				Class91.aCanvas1085.repaint();
			}
		}

	}

	protected final void method3591(int var1) {
		if (Class69.aClass46_851.method751(1075189347)) {
			Class69.aClass46_851.method744(-1036542201);
		}

		if (Class70.aClass28_858 != null) {
			Class70.aClass28_858.aBool348 = false;
		}

		Class70.aClass28_858 = null;
		if (Class117_Sub22_Sub18_Sub2.aClass81_2609 != null) {
			Class117_Sub22_Sub18_Sub2.aClass81_2609.method1088((byte) 0);
			Class117_Sub22_Sub18_Sub2.aClass81_2609 = null;
		}

		if (Class89.aClass89_1055 != null) {
			Class89 var2 = Class89.aClass89_1055;
			synchronized (var2) {
				Class89.aClass89_1055 = null;
			}
		}

		Class117_Sub22_Sub15.method2840((byte) 99);
		Class79.aClass83_948 = null;
		if (Class17.aClass14_210 != null) {
			Class17.aClass14_210.method241(-1913820921);
		}

		if (Class24.aClass14_305 != null) {
			Class24.aClass14_305.method241(108998496);
		}

		Class117_Sub24.method2342(443699786);
		Object var8 = Class107.anObject1196;
		synchronized (var8) {
			if (Class107.anInt1193 * 1236626877 != 0) {
				Class107.anInt1193 = 1574647189;

				try {
					Class107.anObject1196.wait();
				} catch (InterruptedException var5) {
					;
				}
			}
		}

		Class54.method845(-118653202);
	}

	void method3654(byte var1) {
		if (anInt2924 * 935215971 != 1000) {
			boolean var2 = Class117_Sub7.method1954(2053123410);
			if (!var2) {
				method3655(1805664478);
			}

		}
	}

	void method3655(int var1) {
		if (Class96.anInt1124 * -1386584169 >= 4) {
			method3573("js5crc", (byte) 11);
			anInt2924 = 123278584;
		} else {
			if (Class96.anInt1115 * -871107865 >= 4) {
				if (anInt2924 * 935215971 <= 5) {
					method3573("js5io", (byte) 11);
					anInt2924 = 123278584;
					return;
				}

				anInt2945 = -995700760;
				Class96.anInt1115 = 633012869;
			}

			if ((anInt2945 -= 2054094123) * 2119293315 + 1 <= 0) {
				try {
					if (anInt3200 * -1408052237 == 0) {
						Class117_Sub22_Sub18_Sub5.aClass72_2749 = Class84.aClass77_989.method1050(Class117_Sub22_Sub4.aString2177, anInt2954 * 25574249, -222496323);
						anInt3200 -= 913900229;
					}

					if (anInt3200 * -1408052237 == 1) {
						if (Class117_Sub22_Sub18_Sub5.aClass72_2749.anInt870 == 2) {
							method3656(-1, (byte) 32);
							return;
						}

						if (Class117_Sub22_Sub18_Sub5.aClass72_2749.anInt870 == 1) {
							anInt3200 -= 913900229;
						}
					}

					if (anInt3200 * -1408052237 == 2) {
						Class15.aClass81_184 = new Class81((Socket) Class117_Sub22_Sub18_Sub5.aClass72_2749.anObject874, Class84.aClass77_989);
						Class117_Sub14 var2 = new Class117_Sub14(5);
						var2.method2126(15, 461162147);
						var2.method2183(93, (byte) 46);
						Class15.aClass81_184.method1107(var2.aByteArray1885, 0, 5, (byte) 4);
						anInt3200 -= 913900229;
						Class29.aLong363 = Class47.method774(360827458) * -7618420600109507153L;
					}

					if (anInt3200 * -1408052237 == 3) {
						if (anInt2924 * 935215971 > 5 && Class15.aClass81_184.method1093(1544110107) <= 0) {
							if (Class47.method774(967079366) - 3150399210606500175L * Class29.aLong363 > 30000L) {
								method3656(-2, (byte) 5);
								return;
							}
						} else {
							int var10 = Class15.aClass81_184.method1090((byte) 15);
							if (var10 != 0) {
								method3656(var10, (byte) 76);
								return;
							}

							anInt3200 -= 913900229;
						}
					}

					if (anInt3200 * -1408052237 == 4) {
						Class81 var11 = Class15.aClass81_184;
						boolean var3 = anInt2924 * 935215971 > 20;
						if (Class96.aClass81_1125 != null) {
							try {
								Class96.aClass81_1125.method1088((byte) 0);
							} catch (Exception var8) {
								;
							}

							Class96.aClass81_1125 = null;
						}

						Class96.aClass81_1125 = var11;
						Class73_Sub2.method2218(var3, (byte) 111);
						Class96.aClass117_Sub14_1119.anInt1880 = 0;
						Class40.aClass117_Sub22_Sub20_504 = null;
						Class117_Sub14.aClass117_Sub14_1878 = null;
						Class96.anInt1120 = 0;

						while (true) {
							Class117_Sub22_Sub20 var4 = (Class117_Sub22_Sub20) Class96.aClass127_1112.method1668();
							if (var4 == null) {
								while (true) {
									var4 = (Class117_Sub22_Sub20) Class96.aClass127_1117.method1668();
									if (var4 == null) {
										if (Class96.aByte1123 != 0) {
											try {
												Class117_Sub14 var12 = new Class117_Sub14(4);
												var12.method2126(4, 1981533987);
												var12.method2126(Class96.aByte1123, 905391122);
												var12.method1996(0, (byte) -50);
												Class96.aClass81_1125.method1107(var12.aByteArray1885, 0, 4, (byte) 4);
											} catch (IOException var7) {
												try {
													Class96.aClass81_1125.method1088((byte) 0);
												} catch (Exception var6) {
													;
												}

												Class96.anInt1115 += 1642660055;
												Class96.aClass81_1125 = null;
											}
										}

										Class96.anInt1111 = 0;
										Class29.aLong371 = Class47.method774(331246790) * -7142464459995183879L;
										Class117_Sub22_Sub18_Sub5.aClass72_2749 = null;
										Class15.aClass81_184 = null;
										anInt3200 = 0;
										anInt3013 = 0;
										return;
									}

									Class96.aClass119_1114.method1556(var4);
									Class96.aClass127_1113.method1666(var4, var4.aLong1503);
									Class96.anInt1116 -= 348267081;
									Class96.anInt1118 -= 2004127173;
								}
							}

							Class96.aClass127_1108.method1666(var4, var4.aLong1503);
							Class96.anInt1109 += 1995029351;
							Class96.anInt1110 -= 1667838151;
						}
					}
				} catch (IOException var9) {
					method3656(-3, (byte) 92);
				}

			}
		}
	}

	void method3656(int var1, byte var2) {
		Class117_Sub22_Sub18_Sub5.aClass72_2749 = null;
		Class15.aClass81_184 = null;
		anInt3200 = 0;
		if (anInt2954 * 25574249 == anInt3012 * 2093367015) {
			anInt2954 = Class117_Sub10.anInt1835 * 1043284899;
		} else {
			anInt2954 = anInt3012 * -1092817457;
		}

		anInt3013 += 559366079;
		if (anInt3013 * -582176705 < 2 || var1 != 7 && var1 != 9) {
			if (anInt3013 * -582176705 >= 2 && var1 == 6) {
				method3573("js5connect_outofdate", (byte) 11);
				anInt2924 = 123278584;
			} else if (anInt3013 * -582176705 >= 4) {
				if (anInt2924 * 935215971 <= 5) {
					method3573("js5connect", (byte) 11);
					anInt2924 = 123278584;
				} else {
					anInt2945 = -995700760;
				}
			}
		} else if (anInt2924 * 935215971 <= 5) {
			method3573("js5connect_full", (byte) 11);
			anInt2924 = 123278584;
		} else {
			anInt2945 = -995700760;
		}

	}

	static {
		aClass36_3077 = Class36.aClass36_451;
		anInt2943 = 0;
		anInt3200 = 0;
		anInt2945 = 0;
		anInt3013 = 0;
		anInt2985 = 0;
		anInt2950 = 0;
		anInt3106 = 0;
		anInt3089 = 0;
		aClass117_Sub22_Sub18_Sub1_Sub1Array2942 = new Class117_Sub22_Sub18_Sub1_Sub1[32768];
		anInt2956 = 0;
		anIntArray2957 = new int[32768];
		anInt2958 = 0;
		anIntArray3125 = new int[250];
		aClass117_Sub14_Sub1_2961 = new Class117_Sub14_Sub1(5000);
		aClass117_Sub14_Sub1_2962 = new Class117_Sub14_Sub1(5000);
		aClass117_Sub14_Sub1_2953 = new Class117_Sub14_Sub1(15000);
		anInt2964 = 0;
		incomingMessageId = 0;
		anInt2966 = 0;
		anInt2967 = 0;
		anInt2982 = 0;
		anInt2969 = 0;
		anInt2992 = 0;
		anInt3101 = 0;
		aBool2972 = false;
		anInt2974 = 0;
		anInt2975 = -1661099375;
		anInt3199 = 0;
		anInt2977 = -519437017;
		anInt2978 = 0;
		aClass51Array3174 = new Class51[4];
		aBool2980 = false;
		anIntArrayArrayArray2981 = new int[4][13][13];
		anIntArray3027 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		anInt2939 = 0;
		anInt2984 = -234768034;
		anInt3145 = 0;
		anInt3086 = 1358138526;
		anInt2987 = 0;
		anInt2988 = 1059174583;
		anInt2989 = 0;
		anInt2990 = 0;
		anInt2991 = -1512560726;
		anInt3202 = 0;
		anInt2993 = -398559793;
		anInt2994 = 0;
		anInt3092 = 0;
		anInt2998 = 1570731453;
		anInt3190 = -1977359497;
		anInt3000 = -444061981;
		anInt3001 = -926887988;
		aBool3002 = false;
		anInt3003 = 0;
		anInt3004 = 1941326464;
		anInt3005 = 0;
		anInt3006 = 0;
		anInt2930 = 0;
		anInt3008 = 0;
		anInt3113 = 0;
		anInt3010 = -13286706;
		anInt3011 = 0;
		aBool3070 = false;
		anInt3063 = 0;
		anInt3014 = 0;
		anInt3015 = 974422094;
		anIntArray3016 = new int[anInt3015 * 1704437183];
		anIntArray3017 = new int[anInt3015 * 1704437183];
		anIntArray3018 = new int[anInt3015 * 1704437183];
		anIntArray3007 = new int[anInt3015 * 1704437183];
		anIntArray3020 = new int[anInt3015 * 1704437183];
		anIntArray3189 = new int[anInt3015 * 1704437183];
		anIntArray2940 = new int[anInt3015 * 1704437183];
		aStringArray3023 = new String[anInt3015 * 1704437183];
		anIntArrayArray3024 = new int[104][104];
		anInt3025 = 0;
		anInt2941 = 1326843327;
		anInt3187 = -1281930195;
		anInt3028 = 0;
		anInt3140 = 0;
		anInt3049 = 0;
		anInt3031 = 0;
		anInt3032 = 0;
		anInt3033 = 0;
		anInt3034 = 0;
		anInt3035 = 0;
		anInt2949 = 0;
		anInt3037 = 0;
		aBool3038 = false;
		anInt3039 = 0;
		anInt2952 = 0;
		aClass117_Sub22_Sub18_Sub1_Sub2Array3041 = new Class117_Sub22_Sub18_Sub1_Sub2[2048];
		anInt3042 = 1722457709;
		anInt3043 = 0;
		anInt3044 = 0;
		anIntArray2917 = new int[1000];
		anIntArray3046 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		aStringArray2936 = new String[8];
		aBoolArray2986 = new boolean[8];
		anIntArray3151 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		anInt3084 = 1428519581;
		aClass120ArrayArrayArray3051 = new Class120[4][104][104];
		aClass120_3052 = new Class120();
		aClass120_3186 = new Class120();
		aClass120_3054 = new Class120();
		anIntArray3055 = new int[25];
		anIntArray3056 = new int[25];
		anIntArray3057 = new int[25];
		anInt3149 = 0;
		aBool3059 = false;
		anInt3060 = 0;
		anIntArray3061 = new int[500];
		anIntArray3009 = new int[500];
		anIntArray2999 = new int[500];
		anIntArray3064 = new int[500];
		aStringArray3065 = new String[500];
		aStringArray3066 = new String[500];
		anInt3115 = 399284979;
		anInt3068 = -1831800237;
		anInt3069 = 0;
		anInt3123 = 1163553410;
		anInt3071 = 0;
		aString3058 = null;
		aBool3074 = false;
		anInt3075 = 632851969;
		anInt3076 = -1356369839;
		aString2931 = null;
		aString3078 = null;
		anInt3036 = 1825720409;
		aClass127_3080 = new Class127(8);
		anInt3081 = 0;
		anInt3082 = 0;
		aClass117_Sub19_3083 = null;
		anInt2932 = 0;
		anInt3085 = 0;
		anInt3073 = 0;
		anInt2983 = 875598665;
		aBool3088 = false;
		aBool3072 = false;
		aBool3090 = false;
		aClass117_Sub19_3091 = null;
		aClass117_Sub19_3019 = null;
		aClass117_Sub19_3157 = null;
		anInt3184 = 0;
		anInt3048 = 0;
		aClass117_Sub19_3096 = null;
		aBool3097 = false;
		anInt3079 = -857877743;
		anInt3099 = -141334049;
		aBool3100 = false;
		anInt2951 = 1127763991;
		anInt3102 = 310845641;
		aBool3103 = false;
		anInt3104 = -1641162339;
		anIntArray3050 = new int[32];
		anInt3093 = 0;
		anIntArray3107 = new int[32];
		anInt2971 = 0;
		anIntArray3109 = new int[32];
		anInt3110 = 0;
		anInt3111 = 0;
		anInt3112 = 0;
		anInt3141 = 0;
		anInt3114 = 0;
		anInt3166 = 0;
		anInt3116 = 0;
		anInt3117 = 0;
		aClass120_3118 = new Class120();
		aClass120_3119 = new Class120();
		aClass120_3120 = new Class120();
		aClass127_3053 = new Class127(512);
		anInt3122 = 0;
		anInt3191 = 1215426226;
		aBoolArray3124 = new boolean[100];
		aBoolArray3062 = new boolean[100];
		aBoolArray3179 = new boolean[100];
		anIntArray3022 = new int[100];
		anIntArray3128 = new int[100];
		anIntArray3129 = new int[100];
		anIntArray3130 = new int[100];
		anInt3131 = 0;
		aLong3132 = 0L;
		aBool3133 = true;
		anInt3134 = -2120858333;
		anInt3135 = 960481629;
		anIntArray3136 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		anInt3026 = 0;
		anInt3138 = 0;
		aString3139 = "";
		aLongArray2970 = new long[100];
		anInt3030 = 0;
		anInt2925 = 0;
		anIntArray3143 = new int[128];
		anIntArray3144 = new int[128];
		aLong3045 = 8391544638048747903L;
		aString3146 = null;
		aString3147 = null;
		anInt3160 = -42975717;
		anInt2968 = 0;
		anIntArray3150 = new int[1000];
		anIntArray3127 = new int[1000];
		aClass117_Sub22_Sub17_Sub3Array3152 = new Class117_Sub22_Sub17_Sub3[1000];
		anInt3153 = 0;
		anInt3154 = 0;
		anInt3155 = 0;
		anInt3156 = 450172501;
		anInt3021 = -207755149;
		aBool3158 = false;
		anInt3047 = -905714169;
		anInt2948 = -132556803;
		anInt3162 = 0;
		anIntArray3163 = new int[50];
		anIntArray3164 = new int[50];
		anIntArray3165 = new int[50];
		anIntArray2959 = new int[50];
		aClass10Array3067 = new Class10[50];
		aBool3168 = false;
		aBoolArray3169 = new boolean[5];
		anIntArray3170 = new int[5];
		anIntArray3180 = new int[5];
		anIntArray2946 = new int[5];
		anIntArray3173 = new int[5];
		aShort3105 = 256;
		aShort3175 = 205;
		aShort3176 = 256;
		aShort3177 = 320;
		aShort3178 = 1;
		aShort3094 = 32767;
		aShort2955 = 1;
		aShort3181 = 32767;
		anInt3126 = 0;
		anInt3183 = 0;
		anInt3142 = 0;
		anInt3185 = 0;
		anInt2944 = 0;
		anInt3198 = 0;
		anInt3188 = 0;
		aClass49Array3098 = new Class49[400];
		aClass110_3148 = new Class110();
		anInt2976 = 0;
		aClass43Array3192 = new Class43[400];
		aClass91_3193 = new Class91();
		anInt3194 = -1617157641;
		anInt3195 = 285142639;
		aClass143Array3196 = new Class143[8];
		aLong3197 = -1465676534226904019L;
		aLong2926 = 3665732098070112625L;
		aClass54_Sub1_2979 = new Class54_Sub1();
		anIntArray3040 = new int[50];
		anIntArray3201 = new int[50];
	}

	protected final void method3610(int var1) {
		anInt3012 = (anInt2918 * -553019157 == 0 ? 43594 : 40000 + anInt2916 * 622074983) * 1902900439;
		Class117_Sub10.anInt1835 = (anInt2918 * -553019157 == 0 ? 443 : anInt2916 * 622074983 + 50000) * -551158445;
		anInt2954 = anInt3012 * -1092817457;
		Class91.aShortArray1080 = Class105.aShortArray1169;
		Class87.aShortArrayArray1019 = Class105.aShortArrayArray1173;
		Class91.aShortArray1074 = Class105.aShortArray1170;
		Class25.aShortArrayArray318 = Class105.aShortArrayArray1171;
		if (Class77.aString925.toLowerCase().indexOf("microsoft") != -1) {
			Class89.anIntArray1056[186] = 57;
			Class89.anIntArray1056[187] = 27;
			Class89.anIntArray1056[188] = 71;
			Class89.anIntArray1056[189] = 26;
			Class89.anIntArray1056[190] = 72;
			Class89.anIntArray1056[191] = 73;
			Class89.anIntArray1056[192] = 58;
			Class89.anIntArray1056[219] = 42;
			Class89.anIntArray1056[220] = 74;
			Class89.anIntArray1056[221] = 43;
			Class89.anIntArray1056[222] = 59;
			Class89.anIntArray1056[223] = 28;
		} else {
			Class89.anIntArray1056[44] = 71;
			Class89.anIntArray1056[45] = 26;
			Class89.anIntArray1056[46] = 72;
			Class89.anIntArray1056[47] = 73;
			Class89.anIntArray1056[59] = 57;
			Class89.anIntArray1056[61] = 27;
			Class89.anIntArray1056[91] = 42;
			Class89.anIntArray1056[92] = 74;
			Class89.anIntArray1056[93] = 43;
			Class89.anIntArray1056[192] = 28;
			Class89.anIntArray1056[222] = 58;
			Class89.anIntArray1056[520] = 59;
		}

		Class82.method1116(Class91.aCanvas1085, 961274435);
		Class117_Sub22_Sub18_Sub1_Sub1.method3534(Class91.aCanvas1085, (byte) 107);
		Class79.aClass83_948 = Class33.method484((byte) -58);
		if (Class79.aClass83_948 != null) {
			Class79.aClass83_948.method1121(Class91.aCanvas1085, 2011134395);
		}

		Class7.aClass88_95 = new Class88(255, Class74.aClass145_887, Class74.aClass145_894, 500000);
		Class129 var2 = null;
		Class33 var3 = new Class33();

		try {
			var2 = Class93.method1241("", aClass79_2919.aString947, false, (byte) -30);
			byte[] var4 = new byte[(int) var2.method1686((byte) 0)];

			int var6;
			for (int var5 = 0; var5 < var4.length; var5 += var6) {
				var6 = var2.method1691(var4, var5, var4.length - var5, -1702877019);
				if (var6 == -1) {
					throw new IOException();
				}
			}

			var3 = new Class33(new Class117_Sub14(var4));
		} catch (Exception var9) {
			;
		}

		try {
			if (var2 != null) {
				var2.method1685(759632148);
			}
		} catch (Exception var8) {
			;
		}

		Class117_Sub22_Sub21.aClass33_2499 = var3;
		Class39.aClipboard487 = getToolkit().getSystemClipboard();
		Class117_Sub22_Sub12.method2571(this, Class117_Sub13.aString1873, 1972129222);
		if (anInt2918 * -553019157 != 0) {
			aBool3182 = true;
		}

		Class64.method938(Class117_Sub22_Sub21.aClass33_2499.anInt416 * 1703993515, 2011900100);
	}

	public final void init() {
		if (method3569(1304702778)) {
			Class125[] var1 = new Class125[]{Class125.aClass125_1546, Class125.aClass125_1533, Class125.aClass125_1541, Class125.aClass125_1547, Class125.aClass125_1539, Class125.aClass125_1540, Class125.aClass125_1545, Class125.aClass125_1544, Class125.aClass125_1542, Class125.aClass125_1536, Class125.aClass125_1543, Class125.aClass125_1534, Class125.aClass125_1538, Class125.aClass125_1537, Class125.aClass125_1535};
			Class125[] var2 = var1;

			int var3;
			String var5;
			for (var3 = 0; var3 < var2.length; var3++) {
				Class125 var4 = var2[var3];
				var5 = getParameter(var4.aString1548);
				if (var5 != null) {
					switch (Integer.parseInt(var4.aString1548)) {
						case 1:
							if (var5.equalsIgnoreCase(Class39.aString490)) {
								aBool2920 = true;
							} else {
								aBool2920 = false;
							}
							break;
						case 2:
							aClass79_2919 = (Class79) Class117_Sub10.method1970(Class117_Sub22_Sub14.method2642(-706302064), Integer.parseInt(var5), 980866951);
							if (Class79.aClass79_946 == aClass79_2919) {
								Class54.aClass137_729 = Class137.aClass137_1609;
							} else {
								Class54.aClass137_729 = Class137.aClass137_1613;
							}
							break;
						case 3:
							if (var5.equalsIgnoreCase(Class39.aString490)) {
								;
							}
							break;
						case 4:
							anInt2918 = Integer.parseInt(var5) * 276844483;
							break;
						case 5:
							anInt2922 = Integer.parseInt(var5) * 1709289655;
							break;
						case 6:
							anInt3029 = Integer.parseInt(var5) * 185738255;
							break;
						case 7:
							Class117_Sub22_Sub18_Sub2.aString2602 = var5;
						case 8:
						case 11:
						case 14:
						default:
							break;
						case 9:
							Class61.aClass78_764 = Class79.method1077(Integer.parseInt(var5), (byte) -116);
							break;
						case 10:
							Class51.anInt695 = Integer.parseInt(var5) * -106606641;
							break;
						case 12:
							Class117_Sub7.aString1790 = var5;
							break;
						case 13:
							anInt2916 = Integer.parseInt(var5) * 927678295;
							break;
						case 15:
							anInt3087 = Integer.parseInt(var5) * 1291766499;
					}
				}
			}

			Class30.method421((byte) -28);
			Class117_Sub22_Sub4.aString2177 = getCodeBase().getHost();
			String var23 = Class61.aClass78_764.aString929;
			byte var24 = 0;

			try {
				Class74.anInt884 = -384633040;
				Class29.anInt373 = var24 * -687372891;

				try {
					Class15.aString187 = System.getProperty("os.name");
				} catch (Exception var19) {
					Class15.aString187 = "Unknown";
				}

				Class32.aString413 = Class15.aString187.toLowerCase();

				try {
					Class75.aString897 = System.getProperty("user.home");
					if (Class75.aString897 != null) {
						Class75.aString897 = Class75.aString897 + "/";
					}
				} catch (Exception var18) {
					;
				}

				try {
					if (Class32.aString413.startsWith("win")) {
						if (Class75.aString897 == null) {
							Class75.aString897 = System.getenv("USERPROFILE");
						}
					} else if (Class75.aString897 == null) {
						Class75.aString897 = System.getenv("HOME");
					}

					if (Class75.aString897 != null) {
						Class75.aString897 = Class75.aString897 + "/";
					}
				} catch (Exception var17) {
					;
				}

				if (Class75.aString897 == null) {
					Class75.aString897 = "~/";
				}

				Class74.aStringArray888 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class75.aString897, "/tmp/", ""};
				Class121.aStringArray1519 = new String[]{".jagex_cache_" + Class29.anInt373 * -1137452499, ".file_store_" + Class29.anInt373 * -1137452499};
				var3 = 0;

				label243:
				while (var3 < 4) {
					var5 = var3 == 0 ? "" : "" + var3;
					Class74.aFile882 = new File(Class75.aString897, "jagex_cl_oldschool_" + var23 + var5 + ".dat");
					String var6 = null;
					String var7 = null;
					boolean var8 = false;
					File var31;
					if (Class74.aFile882.exists()) {
						try {
							Class129 var9 = new Class129(Class74.aFile882, "rw", 10000L);

							Class117_Sub14 var10;
							int var11;
							for (var10 = new Class117_Sub14((int) var9.method1686((byte) 0)); var10.anInt1880 * 561453169 < var10.aByteArray1885.length; var10.anInt1880 += var11 * -2079217519) {
								var11 = var9.method1691(var10.aByteArray1885, var10.anInt1880 * 561453169, var10.aByteArray1885.length - var10.anInt1880 * 561453169, -1611132709);
								if (var11 == -1) {
									throw new IOException();
								}
							}

							var10.anInt1880 = 0;
							var11 = var10.method2010(-1439707937);
							if (var11 < 1 || var11 > 3) {
								throw new IOException("" + var11);
							}

							int var12 = 0;
							if (var11 > 1) {
								var12 = var10.method2010(-1439707937);
							}

							if (var11 <= 2) {
								var6 = var10.method2019((short) -4518);
								if (var12 == 1) {
									var7 = var10.method2019((short) -6664);
								}
							} else {
								var6 = var10.method2020(1746695080);
								if (var12 == 1) {
									var7 = var10.method2020(1350074065);
								}
							}

							var9.method1685(1596958226);
						} catch (IOException var21) {
							var21.printStackTrace();
						}

						if (var6 != null) {
							var31 = new File(var6);
							if (!var31.exists()) {
								var6 = null;
							}
						}

						if (var6 != null) {
							var31 = new File(var6, "test.dat");
							if (!Class7.method117(var31, true, -2084373776)) {
								var6 = null;
							}
						}
					}

					if (var6 == null && var3 == 0) {
						label218:
						for (int var28 = 0; var28 < Class121.aStringArray1519.length; var28++) {
							for (int var33 = 0; var33 < Class74.aStringArray888.length; var33++) {
								File var34 = new File(Class74.aStringArray888[var33] + Class121.aStringArray1519[var28] + File.separatorChar + "oldschool" + File.separatorChar);
								if (var34.exists() && Class7.method117(new File(var34, "test.dat"), true, -1353826575)) {
									var6 = var34.toString();
									var8 = true;
									break label218;
								}
							}
						}
					}

					if (var6 == null) {
						var6 = Class75.aString897 + File.separatorChar + "jagexcache" + var5 + File.separatorChar + "oldschool" + File.separatorChar + var23 + File.separatorChar;
						var8 = true;
					}

					if (var7 != null) {
						File var30 = new File(var7);
						var31 = new File(var6);

						try {
							File[] var35 = var30.listFiles();
							File[] var36 = var35;

							for (int var13 = 0; var13 < var36.length; var13++) {
								File var14 = var36[var13];
								File var15 = new File(var31, var14.getName());
								boolean var16 = var14.renameTo(var15);
								if (!var16) {
									throw new IOException();
								}
							}
						} catch (Exception var20) {
							var20.printStackTrace();
						}

						var8 = true;
					}

					if (var8) {
						Class8_Sub1.method1878(new File(var6), (File) null, -1860689749);
					}

					File var25 = new File(var6);
					Class74.aFile883 = var25;
					if (!Class74.aFile883.exists()) {
						Class74.aFile883.mkdirs();
					}

					File[] var26 = Class74.aFile883.listFiles();
					if (var26 != null) {
						File[] var32 = var26;

						for (int var27 = 0; var27 < var32.length; var27++) {
							File var29 = var32[var27];
							if (!Class7.method117(var29, false, -427572965)) {
								++var3;
								continue label243;
							}
						}
					}
					break;
				}

				Class66.method957(Class74.aFile883, (byte) 0);
				Class31.method452((short) -6812);
				Class74.aClass145_887 = new Class145(new Class129(Class8.method134("main_file_cache.dat2", (byte) 8), "rw", 1048576000L), 5200, 0);
				Class74.aClass145_894 = new Class145(new Class129(Class8.method134("main_file_cache.idx255", (byte) 8), "rw", 1048576L), 6000, 0);
				Class117_Sub10.aClass145Array1839 = new Class145[Class74.anInt884 * 1676709307];

				for (var3 = 0; var3 < Class74.anInt884 * 1676709307; var3++) {
					Class117_Sub10.aClass145Array1839[var3] = new Class145(new Class129(Class8.method134("main_file_cache.idx" + var3, (byte) 8), "rw", 1048576L), 6000, 0);
				}
			} catch (Exception var22) {
				Class117_Sub12.method1987((String) null, var22, 63760416);
			}

			Class92.aGameClient1087 = this;
			method3634(765, 503, 93, -1298352662);
		}
	}

	public static Class117_Sub22_Sub17_Sub3[] method3952(Class106 var0, String var1, String var2, int var3) {
		int var4 = var0.method1391(var1, -1991221696);
		int var6 = var0.method1383(var4, var2, (byte) 19);
		Class117_Sub22_Sub17_Sub3[] var5;
		if (!Class14.method295(var0, var4, var6, -300879410)) {
			var5 = null;
		} else {
			var5 = Class1.method52((byte) 24);
		}

		return var5;
	}

}
