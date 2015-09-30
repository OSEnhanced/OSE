package core.Jagex;
import netscape.javascript.JSObject;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.zip.Inflater;

public class Class64 {

	static final int anInt778 = 51;
	public static final int anInt780 = 3;
	Inflater anInflater779;

	static void method933(byte var0) {
		try {
			if (GameClient.anInt2985 * -1334916781 == 0) {
				if (Class117_Sub22_Sub18_Sub2.aClass81_2609 != null) {
					Class117_Sub22_Sub18_Sub2.aClass81_2609.method1088((byte) 0);
					Class117_Sub22_Sub18_Sub2.aClass81_2609 = null;
				}

				Class117_Sub22_Sub19.aClass72_2479 = null;
				GameClient.aBool2972 = false;
				GameClient.anInt2950 = 0;
				GameClient.anInt2985 = 708338395;
			}

			if (GameClient.anInt2985 * -1334916781 == 1) {
				if (Class117_Sub22_Sub19.aClass72_2479 == null) {
					Class117_Sub22_Sub19.aClass72_2479 = Class84.aClass77_989.method1050(Class117_Sub22_Sub4.aString2177, GameClient.anInt2954 * 25574249, 1902029564);
				}

				if (Class117_Sub22_Sub19.aClass72_2479.anInt870 == 2) {
					throw new IOException();
				}

				if (Class117_Sub22_Sub19.aClass72_2479.anInt870 == 1) {
					Class117_Sub22_Sub18_Sub2.aClass81_2609 = new Class81((Socket) Class117_Sub22_Sub19.aClass72_2479.anObject874, Class84.aClass77_989);
					Class117_Sub22_Sub19.aClass72_2479 = null;
					GameClient.anInt2985 = 1416676790;
				}
			}

			if (GameClient.anInt2985 * -1334916781 == 2) {
				GameClient.aClass117_Sub14_Sub1_2961.anInt1880 = 0;
				GameClient.aClass117_Sub14_Sub1_2961.method2126(14, 349156904);
				Class117_Sub22_Sub18_Sub2.aClass81_2609.method1107(GameClient.aClass117_Sub14_Sub1_2961.aByteArray1885, 0, 1, (byte) 4);
				GameClient.aClass117_Sub14_Sub1_2953.anInt1880 = 0;
				GameClient.anInt2985 = 2125015185;
			}

			int var1;
			if (GameClient.anInt2985 * -1334916781 == 3) {
				if (Class17.aClass14_210 != null) {
					Class17.aClass14_210.method270(-2124468825);
				}

				if (Class24.aClass14_305 != null) {
					Class24.aClass14_305.method270(-2071919363);
				}

				var1 = Class117_Sub22_Sub18_Sub2.aClass81_2609.method1090((byte) 15);
				if (Class17.aClass14_210 != null) {
					Class17.aClass14_210.method270(-2114981249);
				}

				if (Class24.aClass14_305 != null) {
					Class24.aClass14_305.method270(-2130045593);
				}

				if (var1 != 0) {
					Class117_Sub22_Sub18_Sub6.method3357(var1, (byte) -39);
					return;
				}

				GameClient.aClass117_Sub14_Sub1_2953.anInt1880 = 0;
				GameClient.anInt2985 = -753275321;
			}

			int var2;
			int var3;
			if (GameClient.anInt2985 * -1334916781 == 5) {
				int[] var9 = new int[]{(int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D)};
				GameClient.aClass117_Sub14_Sub1_2961.anInt1880 = 0;
				GameClient.aClass117_Sub14_Sub1_2961.method2126(1, 1848922053);
				GameClient.aClass117_Sub14_Sub1_2961.method2126(Class6.aClass94_77.method40((byte) 8), 1438865137);
				GameClient.aClass117_Sub14_Sub1_2961.method2183(var9[0], (byte) 5);
				GameClient.aClass117_Sub14_Sub1_2961.method2183(var9[1], (byte) 19);
				GameClient.aClass117_Sub14_Sub1_2961.method2183(var9[2], (byte) 74);
				GameClient.aClass117_Sub14_Sub1_2961.method2183(var9[3], (byte) 71);
				switch (Class6.aClass94_77.anInt1096 * -2125946685) {
					case 0:
						GameClient.aClass117_Sub14_Sub1_2961.anInt1880 += 546129032;
						break;
					case 1:
					case 2:
						GameClient.aClass117_Sub14_Sub1_2961.method2040(Class105.anInt1168 * 950183761, 2122296545);
						GameClient.aClass117_Sub14_Sub1_2961.anInt1880 -= 1806153003;
						break;
					case 3:
						GameClient.aClass117_Sub14_Sub1_2961.method2183(((Integer) Class117_Sub22_Sub21.aClass33_2499.aLinkedHashMap421.get(Integer.valueOf(Class63.method930(Class6.aString75, -1365540077)))).intValue(), (byte) 79);
						GameClient.aClass117_Sub14_Sub1_2961.anInt1880 += 273064516;
				}

				GameClient.aClass117_Sub14_Sub1_2961.method2001(Class6.aString76, 1954596949);
				GameClient.aClass117_Sub14_Sub1_2961.method2030(Class29.aBigInteger368, Class29.aBigInteger361, (byte) 63);
				GameClient.aClass117_Sub14_Sub1_2962.anInt1880 = 0;
				if (GameClient.anInt2924 * 935215971 == 40) {
					GameClient.aClass117_Sub14_Sub1_2962.method2126(18, -52399756);
				} else {
					GameClient.aClass117_Sub14_Sub1_2962.method2126(16, 1673231095);
				}

				GameClient.aClass117_Sub14_Sub1_2962.method1996(0, (byte) -40);
				var2 = GameClient.aClass117_Sub14_Sub1_2962.anInt1880 * 561453169;
				GameClient.aClass117_Sub14_Sub1_2962.method2183(93, (byte) 72);
				GameClient.aClass117_Sub14_Sub1_2962.method2004(GameClient.aClass117_Sub14_Sub1_2961.aByteArray1885, 0, GameClient.aClass117_Sub14_Sub1_2961.anInt1880 * 561453169, 1038574697);
				var3 = GameClient.aClass117_Sub14_Sub1_2962.anInt1880 * 561453169;
				GameClient.aClass117_Sub14_Sub1_2962.method2001(Class6.aString75, 1319279387);
				GameClient.aClass117_Sub14_Sub1_2962.method2126((GameClient.aBool3133 ? 1 : 0) << 1 | (GameClient.aBool2921 ? 1 : 0), 367836231);
				GameClient.aClass117_Sub14_Sub1_2962.method1996(Class80.anInt952 * 1566500665, (byte) -78);
				GameClient.aClass117_Sub14_Sub1_2962.method1996(Class117_Sub22_Sub18_Sub2.anInt2613 * 1325743505, (byte) -124);
				Class117_Sub22_Sub11.method2565(GameClient.aClass117_Sub14_Sub1_2962, -1854877790);
				GameClient.aClass117_Sub14_Sub1_2962.method2001(Class117_Sub7.aString1790, 1281572137);
				GameClient.aClass117_Sub14_Sub1_2962.method2183(Class51.anInt695 * 1036605231, (byte) 51);
				Class117_Sub14 var4 = new Class117_Sub14(Class117_Sub22_Sub18_Sub1_Sub1.aClass117_Sub18_2868.method2270(-1749159671));
				Class117_Sub22_Sub18_Sub1_Sub1.aClass117_Sub18_2868.method2269(var4, 544615907);
				GameClient.aClass117_Sub14_Sub1_2962.method2004(var4.aByteArray1885, 0, var4.aByteArray1885.length, 1873651775);
				GameClient.aClass117_Sub14_Sub1_2962.method2126(GameClient.anInt3029 * -434353425, 227698129);
				GameClient.aClass117_Sub14_Sub1_2962.method2183(Class117_Sub22_Sub9.aClass106_Sub1_2287.anInt1187 * 1499914007, (byte) 66);
				GameClient.aClass117_Sub14_Sub1_2962.method2183(Class117_Sub10.aClass106_Sub1_1840.anInt1187 * 1499914007, (byte) 9);
				GameClient.aClass117_Sub14_Sub1_2962.method2183(Class29.aClass106_Sub1_370.anInt1187 * 1499914007, (byte) 88);
				GameClient.aClass117_Sub14_Sub1_2962.method2183(Class117_Sub22_Sub5.aClass106_Sub1_2217.anInt1187 * 1499914007, (byte) 115);
				GameClient.aClass117_Sub14_Sub1_2962.method2183(Class58.aClass106_Sub1_753.anInt1187 * 1499914007, (byte) 4);
				GameClient.aClass117_Sub14_Sub1_2962.method2183(Class73_Sub2.aClass106_Sub1_1893.anInt1187 * 1499914007, (byte) 31);
				GameClient.aClass117_Sub14_Sub1_2962.method2183(Class57.aClass106_Sub1_749.anInt1187 * 1499914007, (byte) 35);
				GameClient.aClass117_Sub14_Sub1_2962.method2183(Class87.aClass106_Sub1_1020.anInt1187 * 1499914007, (byte) 90);
				GameClient.aClass117_Sub14_Sub1_2962.method2183(Class117_Sub13.aClass106_Sub1_1868.anInt1187 * 1499914007, (byte) 61);
				GameClient.aClass117_Sub14_Sub1_2962.method2183(GameClient.aClass106_Sub1_3137.anInt1187 * 1499914007, (byte) 31);
				GameClient.aClass117_Sub14_Sub1_2962.method2183(GameClient.aClass106_Sub1_2947.anInt1187 * 1499914007, (byte) 97);
				GameClient.aClass117_Sub14_Sub1_2962.method2183(Class117_Sub22_Sub16.aClass106_Sub1_2457.anInt1187 * 1499914007, (byte) 120);
				GameClient.aClass117_Sub14_Sub1_2962.method2183(Class32.aClass106_Sub1_410.anInt1187 * 1499914007, (byte) 41);
				GameClient.aClass117_Sub14_Sub1_2962.method2183(Class32.aClass106_Sub1_412.anInt1187 * 1499914007, (byte) 66);
				GameClient.aClass117_Sub14_Sub1_2962.method2183(Class90.aClass106_Sub1_1063.anInt1187 * 1499914007, (byte) 82);
				GameClient.aClass117_Sub14_Sub1_2962.method2183(Class129.aClass106_Sub1_1585.anInt1187 * 1499914007, (byte) 36);
				GameClient.aClass117_Sub14_Sub1_2962.method2028(var9, var3, GameClient.aClass117_Sub14_Sub1_2962.anInt1880 * 561453169, -92544153);
				GameClient.aClass117_Sub14_Sub1_2962.method2006(GameClient.aClass117_Sub14_Sub1_2962.anInt1880 * 561453169 - var2, -1414479731);
				Class117_Sub22_Sub18_Sub2.aClass81_2609.method1107(GameClient.aClass117_Sub14_Sub1_2962.aByteArray1885, 0, GameClient.aClass117_Sub14_Sub1_2962.anInt1880 * 561453169, (byte) 4);
				GameClient.aClass117_Sub14_Sub1_2961.method2935(var9, 2030198494);

				for (int var5 = 0; var5 < 4; var5++) {
					var9[var5] += 50;
				}

				GameClient.aClass117_Sub14_Sub1_2953.method2935(var9, 1219858656);
				GameClient.anInt2985 = -44936926;
			}

			if (GameClient.anInt2985 * -1334916781 == 6 && Class117_Sub22_Sub18_Sub2.aClass81_2609.method1093(-1779946851) > 0) {
				var1 = Class117_Sub22_Sub18_Sub2.aClass81_2609.method1090((byte) 15);
				if (var1 == 21 && GameClient.anInt2924 * 935215971 == 20) {
					GameClient.anInt2985 = 663401469;
				} else if (var1 == 2) {
					GameClient.anInt2985 = 2080078259;
				} else if (var1 == 15 && GameClient.anInt2924 * 935215971 == 40) {
					GameClient.anInt2964 = -1605221403;
					GameClient.anInt2985 = 618464543;
				} else if (var1 == 23 && GameClient.anInt3106 * 1373369793 < 1) {
					GameClient.anInt3106 -= 428795327;
					GameClient.anInt2985 = 0;
				} else {
					if (var1 != 29) {
						Class117_Sub22_Sub18_Sub6.method3357(var1, (byte) -57);
						return;
					}

					GameClient.anInt2985 = -798212247;
				}
			}

			if (GameClient.anInt2985 * -1334916781 == 7 && Class117_Sub22_Sub18_Sub2.aClass81_2609.method1093(-1735591116) > 0) {
				GameClient.anInt3089 = (Class117_Sub22_Sub18_Sub2.aClass81_2609.method1090((byte) 15) + 3) * -1429349996;
				GameClient.anInt2985 = 1371739864;
			}

			if (GameClient.anInt2985 * -1334916781 == 8) {
				GameClient.anInt2950 = 0;
				Class45.method740(Class108.aString1236, Class108.aString1237, GameClient.anInt3089 * 1029270371 / 60 + Class108.aString1238, 1232428791);
				if ((GameClient.anInt3089 += 310153653) * 1029270371 <= 0) {
					GameClient.anInt2985 = 0;
				}

			} else {
				if (GameClient.anInt2985 * -1334916781 == 9 && Class117_Sub22_Sub18_Sub2.aClass81_2609.method1093(1145597677) >= 13) {
					boolean var10 = Class117_Sub22_Sub18_Sub2.aClass81_2609.method1090((byte) 15) == 1;
					Class117_Sub22_Sub18_Sub2.aClass81_2609.method1092(GameClient.aClass117_Sub14_Sub1_2953.aByteArray1885, 0, 4, (short) 22424);
					GameClient.aClass117_Sub14_Sub1_2953.anInt1880 = 0;
					boolean var11 = false;
					if (var10) {
						var2 = GameClient.aClass117_Sub14_Sub1_2953.method2933(1700470316) << 24;
						var2 |= GameClient.aClass117_Sub14_Sub1_2953.method2933(147837735) << 16;
						var2 |= GameClient.aClass117_Sub14_Sub1_2953.method2933(1500528179) << 8;
						var2 |= GameClient.aClass117_Sub14_Sub1_2953.method2933(782766947);
						var3 = Class63.method930(Class6.aString75, 236069011);
						if (Class117_Sub22_Sub21.aClass33_2499.aLinkedHashMap421.size() >= 10 && !Class117_Sub22_Sub21.aClass33_2499.aLinkedHashMap421.containsKey(Integer.valueOf(var3))) {
							Iterator var15 = Class117_Sub22_Sub21.aClass33_2499.aLinkedHashMap421.entrySet().iterator();
							var15.next();
							var15.remove();
						}

						Class117_Sub22_Sub21.aClass33_2499.aLinkedHashMap421.put(Integer.valueOf(var3), Integer.valueOf(var2));
						Class117_Sub14.method2216(-1240582871);
					}

					GameClient.anInt3073 = Class117_Sub22_Sub18_Sub2.aClass81_2609.method1090((byte) 15) * 109893465;
					GameClient.aBool3088 = Class117_Sub22_Sub18_Sub2.aClass81_2609.method1090((byte) 15) == 1;
					GameClient.anInt3042 = Class117_Sub22_Sub18_Sub2.aClass81_2609.method1090((byte) 15) * -1722457709;
					GameClient.anInt3042 = (GameClient.anInt3042 * 610133147 << 8) * -1722457709;
					GameClient.anInt3042 += Class117_Sub22_Sub18_Sub2.aClass81_2609.method1090((byte) 15) * -1722457709;
					GameClient.anInt3043 = Class117_Sub22_Sub18_Sub2.aClass81_2609.method1090((byte) 15) * -1802919505;
					Class117_Sub22_Sub18_Sub2.aClass81_2609.method1092(GameClient.aClass117_Sub14_Sub1_2953.aByteArray1885, 0, 1, (short) 29551);
					GameClient.aClass117_Sub14_Sub1_2953.anInt1880 = 0;
					GameClient.incomingMessageId = GameClient.aClass117_Sub14_Sub1_2953.method2933(839803429) * -512475507;
					Class117_Sub22_Sub18_Sub2.aClass81_2609.method1092(GameClient.aClass117_Sub14_Sub1_2953.aByteArray1885, 0, 2, (short) 2246);
					GameClient.aClass117_Sub14_Sub1_2953.anInt1880 = 0;
					GameClient.anInt2964 = GameClient.aClass117_Sub14_Sub1_2953.method2012(1053511631) * 1605221403;
					GameClient var13;
					if (GameClient.anInt3043 * 1688753487 == 1) {
						try {
							var13 = Class92.aGameClient1087;
							JSObject.getWindow(var13).call("zap", (Object[]) null);
						} catch (Throwable var7) {
							;
						}
					} else {
						try {
							var13 = Class92.aGameClient1087;
							JSObject.getWindow(var13).call("unzap", (Object[]) null);
						} catch (Throwable var6) {
							;
						}
					}

					GameClient.anInt2985 = -1506550642;
				}

				if (GameClient.anInt2985 * -1334916781 == 10) {
					if (Class117_Sub22_Sub18_Sub2.aClass81_2609.method1093(-1825875456) >= GameClient.anInt2964 * 1735245331) {
						GameClient.aClass117_Sub14_Sub1_2953.anInt1880 = 0;
						Class117_Sub22_Sub18_Sub2.aClass81_2609.method1092(GameClient.aClass117_Sub14_Sub1_2953.aByteArray1885, 0, GameClient.anInt2964 * 1735245331, (short) 11379);
						Class40.method528(-2043343041);
						Class15.method313(GameClient.aClass117_Sub14_Sub1_2953, 1283768640);
						Class26.anInt328 = -540289613;
						Class51.method815(false, -1995410428);
						GameClient.incomingMessageId = 512475507;
					}

				} else {
					if (GameClient.anInt2985 * -1334916781 == 11 && Class117_Sub22_Sub18_Sub2.aClass81_2609.method1093(1514519895) >= 2) {
						GameClient.aClass117_Sub14_Sub1_2953.anInt1880 = 0;
						Class117_Sub22_Sub18_Sub2.aClass81_2609.method1092(GameClient.aClass117_Sub14_Sub1_2953.aByteArray1885, 0, 2, (short) 16456);
						GameClient.aClass117_Sub14_Sub1_2953.anInt1880 = 0;
						Class28.anInt358 = GameClient.aClass117_Sub14_Sub1_2953.method2012(1053511631) * 68721691;
						GameClient.anInt2985 = -89873852;
					}

					if (GameClient.anInt2985 * -1334916781 == 12 && Class117_Sub22_Sub18_Sub2.aClass81_2609.method1093(1057867488) >= Class28.anInt358 * -2093490669) {
						GameClient.aClass117_Sub14_Sub1_2953.anInt1880 = 0;
						Class117_Sub22_Sub18_Sub2.aClass81_2609.method1092(GameClient.aClass117_Sub14_Sub1_2953.aByteArray1885, 0, Class28.anInt358 * -2093490669, (short) 3452);
						GameClient.aClass117_Sub14_Sub1_2953.anInt1880 = 0;
						String var12 = GameClient.aClass117_Sub14_Sub1_2953.method2018((byte) -101);
						String var14 = GameClient.aClass117_Sub14_Sub1_2953.method2018((byte) -79);
						String var16 = GameClient.aClass117_Sub14_Sub1_2953.method2018((byte) 65);
						Class45.method740(var12, var14, var16, -1460191664);
						Class117_Sub14_Sub1.method2953(10, 962707903);
					}

					if (GameClient.anInt2985 * -1334916781 != 13) {
						GameClient.anInt2950 += 1725606041;
						if (GameClient.anInt2950 * 907881385 > 2000) {
							if (GameClient.anInt3106 * 1373369793 < 1) {
								if (GameClient.anInt2954 * 25574249 == GameClient.anInt3012 * 2093367015) {
									GameClient.anInt2954 = Class117_Sub10.anInt1835 * 1043284899;
								} else {
									GameClient.anInt2954 = GameClient.anInt3012 * -1092817457;
								}

								GameClient.anInt3106 -= 428795327;
								GameClient.anInt2985 = 0;
							} else {
								Class117_Sub22_Sub18_Sub6.method3357(-3, (byte) 21);
							}
						}
					} else {
						if (GameClient.anInt2964 * 1735245331 == -1) {
							if (Class117_Sub22_Sub18_Sub2.aClass81_2609.method1093(-1076729121) < 2) {
								return;
							}

							Class117_Sub22_Sub18_Sub2.aClass81_2609.method1092(GameClient.aClass117_Sub14_Sub1_2953.aByteArray1885, 0, 2, (short) 1058);
							GameClient.aClass117_Sub14_Sub1_2953.anInt1880 = 0;
							GameClient.anInt2964 = GameClient.aClass117_Sub14_Sub1_2953.method2012(1053511631) * 1605221403;
						}

						if (Class117_Sub22_Sub18_Sub2.aClass81_2609.method1093(1802060110) >= GameClient.anInt2964 * 1735245331) {
							Class117_Sub22_Sub18_Sub2.aClass81_2609.method1092(GameClient.aClass117_Sub14_Sub1_2953.aByteArray1885, 0, GameClient.anInt2964 * 1735245331, (short) 4378);
							GameClient.aClass117_Sub14_Sub1_2953.anInt1880 = 0;
							var1 = GameClient.anInt2964 * 1735245331;
							GameClient.aClass117_Sub14_Sub1_2961.anInt1880 = 0;
							GameClient.aClass117_Sub14_Sub1_2953.anInt1880 = 0;
							GameClient.incomingMessageId = 512475507;
							GameClient.anInt2982 = 913542275;
							GameClient.anInt2969 = -390733297;
							GameClient.anInt2992 = -998552057;
							GameClient.anInt2964 = 0;
							GameClient.anInt2966 = 0;
							GameClient.anInt2933 = 0;
							GameClient.anInt3060 = 0;
							GameClient.aBool3059 = false;
							GameClient.anInt3155 = 0;
							GameClient.anInt3153 = 0;

							for (var2 = 0; var2 < 2048; var2++) {
								GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var2] = null;
							}

							Class31.player = null;

							for (var2 = 0; var2 < GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942.length; var2++) {
								Class117_Sub22_Sub18_Sub1_Sub1 var17 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[var2];
								if (var17 != null) {
									var17.anInt2565 = 983534769;
									var17.aBool2566 = false;
								}
							}

							Class117_Sub22_Sub18_Sub6.method3360((byte) 0);
							Class117_Sub14_Sub1.method2953(30, 1573985488);

							for (var2 = 0; var2 < 100; var2++) {
								GameClient.aBoolArray3124[var2] = true;
							}

							GameClient.aClass117_Sub14_Sub1_2961.method2932(133, 577561515);
							GameClient.aClass117_Sub14_Sub1_2961.method2126(Class2.method63(1280947133), 40270310);
							GameClient.aClass117_Sub14_Sub1_2961.method1996(Class80.anInt952 * 1566500665, (byte) 1);
							GameClient.aClass117_Sub14_Sub1_2961.method1996(Class117_Sub22_Sub18_Sub2.anInt2613 * 1325743505, (byte) -63);
							Class15.method313(GameClient.aClass117_Sub14_Sub1_2953, 855662803);
							if (var1 != GameClient.aClass117_Sub14_Sub1_2953.anInt1880 * 561453169) {
								throw new RuntimeException();
							}
						}
					}
				}
			}
		} catch (IOException var8) {
			if (GameClient.anInt3106 * 1373369793 < 1) {
				if (GameClient.anInt3012 * 2093367015 == GameClient.anInt2954 * 25574249) {
					GameClient.anInt2954 = Class117_Sub10.anInt1835 * 1043284899;
				} else {
					GameClient.anInt2954 = GameClient.anInt3012 * -1092817457;
				}

				GameClient.anInt3106 -= 428795327;
				GameClient.anInt2985 = 0;
			} else {
				Class117_Sub22_Sub18_Sub6.method3357(-2, (byte) 73);
			}
		}
	}

	Class64(int var1, int var2, int var3) {
	}

	public Class64() {
		this(-1, 1000000, 1000000);
	}

	static void method938(int var0, int var1) {
		GameClient.aLong3132 = 0L;
		if (var0 < 2) {
			GameClient.aBool3133 = false;
		} else {
			GameClient.aBool3133 = true;
		}

		Class8.method133(886477071);
		if (GameClient.anInt2924 * 935215971 >= 25) {
			GameClient.aClass117_Sub14_Sub1_2961.method2932(133, 834346524);
			GameClient.aClass117_Sub14_Sub1_2961.method2126(Class2.method63(-1655159978), 1534078010);
			GameClient.aClass117_Sub14_Sub1_2961.method1996(Class80.anInt952 * 1566500665, (byte) -73);
			GameClient.aClass117_Sub14_Sub1_2961.method1996(Class117_Sub22_Sub18_Sub2.anInt2613 * 1325743505, (byte) -96);
		}

		GameClient.aBool2902 = true;
	}

	static int method939(int var0, int var1, int var2, int var3) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var4 = var2 / 2 + (var1 / 32 << 7) + (var0 / 4 << 10);
		return var4;
	}

	public void method940(Class117_Sub14 var1, byte[] var2, byte var3) {
		if (var1.aByteArray1885[var1.anInt1880 * 561453169] == 31 && var1.aByteArray1885[1 + var1.anInt1880 * 561453169] == -117) {
			if (anInflater779 == null) {
				anInflater779 = new Inflater(true);
			}

			try {
				anInflater779.setInput(var1.aByteArray1885, 10 + var1.anInt1880 * 561453169, var1.aByteArray1885.length - (8 + var1.anInt1880 * 561453169 + 10));
				anInflater779.inflate(var2);
			} catch (Exception var5) {
				anInflater779.reset();
				throw new RuntimeException("");
			}

			anInflater779.reset();
		} else {
			throw new RuntimeException("");
		}
	}

}
