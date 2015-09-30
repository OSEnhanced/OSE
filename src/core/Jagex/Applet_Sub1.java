package core.Jagex;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

import core.Constants;

public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	public static final int anInt2895 = 208;
	protected static volatile boolean aBool2902 = true;
	protected static volatile boolean aBool2910 = false;
	static volatile long aLong2907 = 0L;
	boolean aBool2899 = false;
	static boolean aBool2898 = false;
	static long aLong2897 = 0L;
	static volatile boolean aBool2896 = true;
	static Applet_Sub1 anApplet_Sub1_2912 = null;
	static int anInt2909 = 0;
	static int anInt2900 = 714018388;
	static int anInt2901 = 1625505901;
	protected static int anInt2911 = 0;
	protected static long[] aLongArray2903 = new long[32];
	protected static long[] aLongArray2904 = new long[32];
	protected static int anInt2905 = 0;
	protected static int anInt2906 = 0;
	static int anInt2908 = 277595972;
	protected static boolean aBool2913 = false;

	void method3566(int var1) {
		long var2 = Class47.method774(679916615);
		long var4 = aLongArray2904[Class117_Sub22_Sub1.anInt2153 * 1864570397];
		aLongArray2904[Class117_Sub22_Sub1.anInt2153 * 1864570397] = var2;
		Class117_Sub22_Sub1.anInt2153 = (1 + Class117_Sub22_Sub1.anInt2153 * 1864570397 & 31) * -690856907;
		if (var4 != 0L && var2 > var4) {
			;
		}

		synchronized (this) {
			Class131.aBool1589 = aBool2896;
		}

		method3577(-2045136722);
	}

	protected final synchronized void method3568(byte var1) {
		Container var2 = method3576(1549154784);
		if (Class91.aCanvas1085 != null) {
			Class91.aCanvas1085.removeFocusListener(this);
			var2.remove(Class91.aCanvas1085);
		}

		Class80.anInt952 = Math.max(var2.getWidth(), Class117_Sub22_Sub18_Sub2.anInt2614 * -282146123) * -1102981367;
		Class117_Sub22_Sub18_Sub2.anInt2613 = Math.max(var2.getHeight(), Class117_Sub22_Sub18_Sub1.anInt2600 * 1184019573) * 74785649;
		Insets var3;
		if (Class117_Sub22_Sub6.aFrame2269 != null) {
			var3 = Class117_Sub22_Sub6.aFrame2269.getInsets();
			Class80.anInt952 -= (var3.right + var3.left) * -1102981367;
			Class117_Sub22_Sub18_Sub2.anInt2613 -= (var3.top + var3.bottom) * 74785649;
		}

		Class91.aCanvas1085 = new Canvas_Sub1(this);
		var2.add(Class91.aCanvas1085);
		Class91.aCanvas1085.setSize(Class80.anInt952 * 1566500665, Class117_Sub22_Sub18_Sub2.anInt2613 * 1325743505);
		Class91.aCanvas1085.setVisible(true);
		if (var2 == Class117_Sub22_Sub6.aFrame2269) {
			var3 = Class117_Sub22_Sub6.aFrame2269.getInsets();
			Class91.aCanvas1085.setLocation(var3.left + anInt2905 * -144834411, anInt2906 * -1191072495 + var3.top);
		} else {
			Class91.aCanvas1085.setLocation(anInt2905 * -144834411, anInt2906 * -1191072495);
		}

		Class91.aCanvas1085.addFocusListener(this);
		Class91.aCanvas1085.requestFocus();
		aBool2902 = true;
		int var4 = Class80.anInt952 * 1566500665;
		int var5 = Class117_Sub22_Sub18_Sub2.anInt2613 * 1325743505;
		Canvas var6 = Class91.aCanvas1085;

		Object var10;
		try {
			Class8_Sub2 var7 = new Class8_Sub2();
			var7.method120(var4, var5, var6, (byte) 10);
			var10 = var7;
		} catch (Throwable var9) {
			Class8_Sub1 var8 = new Class8_Sub1();
			var8.method120(var4, var5, var6, (byte) 10);
			var10 = var8;
		}

		if (Class82.aClass8_979 != null) {
			Class82.aClass8_979.method122(((Class8) var10).anImage106.getGraphics(), 0, 0, 584000431);
		}

		Class82.aClass8_979 = (Class8) var10;
		aBool2910 = false;
		aLong2907 = Class47.method774(1933183512) * -2486868070392875471L;
	}

	protected final boolean method3569(int var1) {
		String var2 = getDocumentBase().getHost().toLowerCase();
		if (!var2.equals("jagex.com") && !var2.endsWith(".jagex.com")) {
			if (!var2.equals("runescape.com") && !var2.endsWith(".runescape.com")) {
				if (!var2.equals("mechscape.com") && !var2.endsWith(".mechscape.com")) {
					if (var2.endsWith("127.0.0.1")) {
						return true;
					} else {
						while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= 48 && var2.charAt(var2.length() - 1) <= 57) {
							var2 = var2.substring(0, var2.length() - 1);
						}

						if (var2.endsWith("192.168.1.")) {
							return true;
						} else {
							method3573("invalidhost", (byte) 11);
							return false;
						}
					}
				} else {
					return true;
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	public final void windowClosing(WindowEvent var1) {
		destroy();
	}

	final synchronized void method3571(short var1) {
		if (!aBool2898) {
			aBool2898 = true;

			try {
				Class91.aCanvas1085.removeFocusListener(this);
			} catch (Exception var6) {
				;
			}

			try {
				method3591(-1900553559);
			} catch (Exception var5) {
				;
			}

			if (Class117_Sub22_Sub6.aFrame2269 != null) {
				try {
					System.exit(0);
				} catch (Throwable var4) {
					;
				}
			}

			if (Class84.aClass77_989 != null) {
				try {
					Class84.aClass77_989.method1044(-2083668857);
				} catch (Exception var3) {
					;
				}
			}

			method3583(-1486672305);
		}
	}

	public void start() {
		if (this == anApplet_Sub1_2912 && !aBool2898) {
			aLong2897 = 0L;
		}
	}

	public void stop() {
		if (this == anApplet_Sub1_2912 && !aBool2898) {
			aLong2897 = (Class47.method774(33539416) + 4000L) * -1312023603349092359L;
		}
	}

	public void destroy() {
		if (anApplet_Sub1_2912 == this && !aBool2898) {
			aLong2897 = Class47.method774(-315757374) * -1312023603349092359L;
			Class38.method520(5000L);
			method3571((short) 11124);
		}
	}

	public final synchronized void paint(Graphics var1) {
		if (anApplet_Sub1_2912 == this && !aBool2898) {
			aBool2902 = true;
			if (Class139.aString1625 != null && Class139.aString1625.startsWith("1.5") && Class47.method774(971946078) - 4196666050397135569L * aLong2907 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= Class80.anInt952 * 1566500665 && var2.height >= Class117_Sub22_Sub18_Sub2.anInt2613 * 1325743505) {
					aBool2910 = true;
				}
			}

		}
	}

	public final void focusGained(FocusEvent var1) {
		aBool2896 = true;
		aBool2902 = true;
	}

	protected void method3573(String var1, byte var2) {
		if (aBool2899) {
			if (var2 == 11) {
				;
			}
		} else {
			aBool2899 = true;
			System.out.println("error_game_" + var1);

			try {
				getAppletContext().showDocument(new URL(getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
			} catch (Exception var4) {
				;
			}

		}
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public abstract void init();

	protected Container method3576(int var1) {
		return (Container) (Class117_Sub22_Sub6.aFrame2269 != null ? Class117_Sub22_Sub6.aFrame2269 : this);
	}

	protected abstract void method3577(int var1);

	protected abstract void method3578(byte var1);

	protected Dimension method3582(int var1) {
		Container var2 = method3576(1549154784);
		int var4 = Math.max(var2.getWidth(), Class117_Sub22_Sub18_Sub2.anInt2614 * -282146123);
		int var5 = Math.max(var2.getHeight(), Class117_Sub22_Sub18_Sub1.anInt2600 * 1184019573);
		if (Class117_Sub22_Sub6.aFrame2269 != null) {
			Insets var3 = Class117_Sub22_Sub6.aFrame2269.getInsets();
			var4 -= var3.left + var3.right;
			var5 -= var3.bottom + var3.top;
		}

		return new Dimension(var4, var5);
	}

	protected abstract void method3583(int var1);

	protected abstract void method3591(int var1);

	public final void update(Graphics var1) {
		paint(var1);
	}

	protected abstract void method3610(int var1);

	public final void windowClosed(WindowEvent var1) {
	}

	public void run() {
		try {
			if (Class77.aString925 != null) {
				String var1 = Class77.aString925.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = Class139.aString1625;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						method3573("wrongjava", (byte) 11);
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && Class26.method405(var2.charAt(var3), 13993284); var3++) {
							;
						}

						String var4 = var2.substring(6, var3);
						if (Class65.method948(var4, 1745572875) && Class33.method485(var4, -2096317330) < 10) {
							method3573("wrongjava", (byte) 11);
							return;
						}
					}

					anInt2901 = -462405087;
				}
			}

			setFocusCycleRoot(true);
			method3568((byte) -9);
			method3610(-1861737197);

			Object var7;
			try {
				var7 = new Class73_Sub1();
			} catch (Throwable var5) {
				var7 = new Class73_Sub2();
			}

			Class88.aClass73_1028 = (Class73) var7;

			label80:
			while (true) {
				Class77 var9;
				Canvas var10;
				do {
					if (-4325312920390268343L * aLong2897 != 0L && Class47.method774(2061398678) >= -4325312920390268343L * aLong2897) {
						break label80;
					}

					Class117_Sub11.anInt1849 = Class88.aClass73_1028.method988(anInt2900 * 1625108145, anInt2901 * 1451936101, -1997133834) * 1681979811;

					for (int var8 = 0; var8 < Class117_Sub11.anInt1849 * -1948909045; var8++) {
						method3566(372275808);
					}

					method3639((byte) 104);
					var9 = Class84.aClass77_989;
					var10 = Class91.aCanvas1085;
				} while (var9.anEventQueue927 == null);

				for (int var11 = 0; var11 < 50 && var9.anEventQueue927.peekEvent() != null; var11++) {
					Class38.method520(1L);
				}

				if (var10 != null) {
					var9.anEventQueue927.postEvent(new ActionEvent(var10, 1001, "dummy"));
				}
			}
		} catch (Exception var6) {
			Class117_Sub12.method1987((String) null, var6, -519383589);
			method3573("crash", (byte) 11);
		}

		method3571((short) 21566);
	}

	protected final void method3634(int var1, int var2, int var3, int var4) {
		try {
			if (anApplet_Sub1_2912 != null) {
				anInt2909 -= 1286481859;
				if (anInt2909 * -314605803 >= 3) {
					method3573("alreadyloaded", (byte) 11);
					return;
				}

				getAppletContext().showDocument(getDocumentBase(), "_self");
				return;
			}

			anApplet_Sub1_2912 = this;
			Class80.anInt952 = var1 * -1102981367;
			Class117_Sub22_Sub18_Sub2.anInt2613 = var2 * 74785649;
			RuntimeException_Sub1.anInt2832 = var3 * -1467311013;
			RuntimeException_Sub1.anApplet2840 = this;
			if (Class84.aClass77_989 == null) {
				Class84.aClass77_989 = new Class77();
			}

			Class84.aClass77_989.method1065(this, 1, -1425025502);
		} catch (Exception var6) {
			Class117_Sub12.method1987((String) null, var6, 1328290877);
			method3573("crash", (byte) 11);
		}

	}

	public final void focusLost(FocusEvent var1) {
		aBool2896 = false;
	}

	void method3639(byte var1) {
		Container var2 = method3576(1549154784);
		long var5 = Class47.method774(539388548);
		long var3 = aLongArray2903[Class8_Sub1.anInt1690 * -490391161];
		aLongArray2903[Class8_Sub1.anInt1690 * -490391161] = var5;
		Class8_Sub1.anInt1690 = (1 + Class8_Sub1.anInt1690 * -490391161 & 31) * -1242350537;
		if (var3 != 0L && var5 > var3) {
			int var7 = (int) (var5 - var3);
			anInt2911 = (32000 + (var7 >> 1)) / var7 * -756507779;
		}

		if ((anInt2908 += 799419109) * -1950711059 - 1 > 50) {
			anInt2908 -= 1316249786;
			aBool2902 = true;
			Class91.aCanvas1085.setSize(Class80.anInt952 * 1566500665, Class117_Sub22_Sub18_Sub2.anInt2613 * 1325743505);
			Class91.aCanvas1085.setVisible(true);
			if (Class117_Sub22_Sub6.aFrame2269 == var2) {
				Insets var8 = Class117_Sub22_Sub6.aFrame2269.getInsets();
				Class91.aCanvas1085.setLocation(anInt2905 * -144834411 + var8.left, anInt2906 * -1191072495 + var8.top);
			} else {
				Class91.aCanvas1085.setLocation(anInt2905 * -144834411, anInt2906 * -1191072495);
			}
		}

		method3578((byte) -114);
	}

	static char method3648(char var0, int var1) {
		return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0;
	}
	static String getMessage() {
		return Constants.message;
	}
	static void method3649(Class117_Sub19[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		Class117_Sub22_Sub17.method2871(var2, var3, var4, var5);
		Class117_Sub22_Sub17_Sub1.method3095();

		for (int var16 = 0; var16 < var0.length; var16++) {
			Class117_Sub19 var12 = var0[var16];
			if (var12 != null && (var1 == var12.anInt2027 * 1264631563 || var1 == -1412584499 && var12 == GameClient.aClass117_Sub19_3019)) {
				int var18;
				if (var8 == -1) {
					GameClient.anIntArray3022[GameClient.anInt3122 * -115854549] = var6 + var12.anInt2104 * -165844047;
					GameClient.anIntArray3128[GameClient.anInt3122 * -115854549] = var7 + var12.anInt1987 * 1372514967;
					GameClient.anIntArray3129[GameClient.anInt3122 * -115854549] = var12.anInt1988 * 1854643179;
					GameClient.anIntArray3130[GameClient.anInt3122 * -115854549] = var12.anInt1989 * 2747837;
					var18 = (GameClient.anInt3122 += 438629251) * -115854549 - 1;
				} else {
					var18 = var8;
				}

				var12.anInt2051 = var18 * -1918675433;
				var12.anInt2103 = GameClient.anInt2923 * -1821283723;
				if (!var12.aBool2061 || !Class117_Sub22_Sub18_Sub6.method3356(var12, 639540841)) {
					if (var12.anInt2018 * 2064823433 > 0) {
						Class17.method336(var12, -1913769784);
					}

					int var22 = var12.anInt2104 * -165844047 + var6;
					int var23 = var12.anInt1987 * 1372514967 + var7;
					int var34 = var12.anInt2013 * -1578517901;
					int var17;
					int var20;
					if (var12 == GameClient.aClass117_Sub19_3019) {
						if (var1 != -1412584499 && !var12.aBool2052) {
							Class46.aClass117_Sub19Array621 = var0;
							Class85.anInt1000 = var6 * 1661631909;
							Class28.anInt352 = var7 * 451101223;
							continue;
						}

						if (GameClient.aBool3103 && GameClient.aBool3097) {
							var17 = Class75.anInt903 * -456706193;
							var20 = Class75.anInt904 * 1381104939;
							var17 -= GameClient.anInt3184 * -1921736267;
							var20 -= GameClient.anInt3048 * -2035182379;
							if (var17 < GameClient.anInt3079 * 414351887) {
								var17 = GameClient.anInt3079 * 414351887;
							}

							if (var12.anInt1988 * 1854643179 + var17 > GameClient.anInt3079 * 414351887 + GameClient.aClass117_Sub19_3157.anInt1988 * 1854643179) {
								var17 = GameClient.aClass117_Sub19_3157.anInt1988 * 1854643179 + GameClient.anInt3079 * 414351887 - var12.anInt1988 * 1854643179;
							}

							if (var20 < GameClient.anInt3099 * 1076129249) {
								var20 = GameClient.anInt3099 * 1076129249;
							}

							if (var12.anInt1989 * 2747837 + var20 > GameClient.anInt3099 * 1076129249 + GameClient.aClass117_Sub19_3157.anInt1989 * 2747837) {
								var20 = GameClient.aClass117_Sub19_3157.anInt1989 * 2747837 + GameClient.anInt3099 * 1076129249 - var12.anInt1989 * 2747837;
							}

							var22 = var17;
							var23 = var20;
						}

						if (!var12.aBool2052) {
							var34 = 128;
						}
					}

					int var10;
					int var11;
					int var14;
					int var19;
					int var30;
					int var32;
					if (var12.anInt1975 * 657737235 == 2) {
						var17 = var2;
						var20 = var3;
						var30 = var4;
						var32 = var5;
					} else if (var12.anInt1975 * 657737235 == 9) {
						var11 = var22;
						var19 = var23;
						var10 = var22 + var12.anInt1988 * 1854643179;
						var14 = var12.anInt1989 * 2747837 + var23;
						if (var10 < var22) {
							var11 = var10;
							var10 = var22;
						}

						if (var14 < var23) {
							var19 = var14;
							var14 = var23;
						}

						++var10;
						++var14;
						var17 = var11 > var2 ? var11 : var2;
						var20 = var19 > var3 ? var19 : var3;
						var30 = var10 < var4 ? var10 : var4;
						var32 = var14 < var5 ? var14 : var5;
					} else {
						var11 = var12.anInt1988 * 1854643179 + var22;
						var19 = var12.anInt1989 * 2747837 + var23;
						var17 = var22 > var2 ? var22 : var2;
						var20 = var23 > var3 ? var23 : var3;
						var30 = var11 < var4 ? var11 : var4;
						var32 = var19 < var5 ? var19 : var5;
					}

					if (!var12.aBool2061 || var17 < var30 && var20 < var32) {
						if (var12.anInt2018 * 2064823433 != 0) {
							if (var12.anInt2018 * 2064823433 == 1336) {
								if (GameClient.aBool3182) {
									var23 += 15;
									//Class39.aClass117_Sub22_Sub17_Sub4_Sub1_485.method3459("Fps:" + GameClient.anInt2911 * -2033650219, var12.anInt1988 * 1854643179 + var22, var23, 16776960, -1);
									Class39.aClass117_Sub22_Sub17_Sub4_Sub1_485.method3459(getMessage(), var12.anInt1988 * 1854643179 + var22, var23, 16776960, -1);
									var23 += 15;
									Runtime var51 = Runtime.getRuntime();
									var19 = (int) ((var51.totalMemory() - var51.freeMemory()) / 1024L);
									var10 = 16776960;
									if (var19 > 32768 && GameClient.aBool2921) {
										var10 = 16711680;
									}

									if (var19 > 65536 && !GameClient.aBool2921) {
										var10 = 16711680;
									}

									Class39.aClass117_Sub22_Sub17_Sub4_Sub1_485.method3459("Mem:" + var19 + "k", var22 + var12.anInt1988 * 1854643179, var23, var10, -1);
									var23 += 15;
								}
								continue;
							}

							if (var12.anInt2018 * 2064823433 == 1337) {
								GameClient.anInt3115 = var22 * -399284979;
								GameClient.anInt3068 = var23 * 1831800237;
								Canvas_Sub1.method2956(var22, var23, var12.anInt1988 * 1854643179, var12.anInt1989 * 2747837, (byte) 87);
								GameClient.aBoolArray3124[var12.anInt2051 * 1082212775] = true;
								Class117_Sub22_Sub17.method2871(var2, var3, var4, var5);
								continue;
							}

							if (var12.anInt2018 * 2064823433 == 1338) {
								Class56.method852(var12, var22, var23, var18, 1826963174);
								Class117_Sub22_Sub17.method2871(var2, var3, var4, var5);
								continue;
							}

							if (var12.anInt2018 * 2064823433 == 1339) {
								Class117_Sub22_Sub21 var50 = var12.method2285(false, 1881168798);
								if (var50 != null) {
									if (GameClient.anInt3155 * -1723858213 < 3) {
										Class34.aClass117_Sub22_Sub17_Sub3_438.method3342(var22, var23, var50.anInt2502 * 707865929, var50.anInt2500 * -1893173225, 25, 25, GameClient.anInt3005 * -1204229987, 256, var50.anIntArray2503, var50.anIntArray2501);
									} else {
										Class117_Sub22_Sub17.method2879(var22, var23, 0, var50.anIntArray2503, var50.anIntArray2501);
									}
								}

								Class117_Sub22_Sub17.method2871(var2, var3, var4, var5);
								continue;
							}
						}

						if (var12.anInt1975 * 657737235 == 0) {
							if (!var12.aBool2061 && Class117_Sub22_Sub18_Sub6.method3356(var12, -1089526260) && var12 != Class117_Sub22_Sub6.aClass117_Sub19_2271) {
								continue;
							}

							if (!var12.aBool2061) {
								if (var12.anInt2060 * -400020749 > var12.anInt1997 * 1348115267 - var12.anInt1989 * 2747837) {
									var12.anInt2060 = var12.anInt1997 * 1602175601 - var12.anInt1989 * -1577430897;
								}

								if (var12.anInt2060 * -400020749 < 0) {
									var12.anInt2060 = 0;
								}
							}

							method3649(var0, var12.anInt1973 * -1955776525, var17, var20, var30, var32, var22 - var12.anInt1994 * 17552373, var23 - var12.anInt2060 * -400020749, var18, 2142228433);
							if (var12.aClass117_Sub19Array2095 != null) {
								method3649(var12.aClass117_Sub19Array2095, var12.anInt1973 * -1955776525, var17, var20, var30, var32, var22 - var12.anInt1994 * 17552373, var23 - var12.anInt2060 * -400020749, var18, 1385154444);
							}

							Class117_Sub10 var37 = (Class117_Sub10) GameClient.aClass127_3080.method1675((long) (var12.anInt1973 * -1955776525));
							if (var37 != null) {
								Class122.method1629(var37.anInt1831 * -2090327687, var17, var20, var30, var32, var22, var23, var18, 1065943590);
							}

							Class117_Sub22_Sub17.method2871(var2, var3, var4, var5);
							Class117_Sub22_Sub17_Sub1.method3095();
						}

						if (GameClient.aBool3133 || GameClient.aBoolArray3179[var18] || GameClient.anInt3131 * 317367717 > 1) {
							int var13;
							int var15;
							if (var12.anInt1975 * 657737235 == 0 && !var12.aBool2061 && var12.anInt1997 * 1348115267 > var12.anInt1989 * 2747837) {
								var11 = var12.anInt1988 * 1854643179 + var22;
								var19 = var12.anInt2060 * -400020749;
								var10 = var12.anInt1989 * 2747837;
								var14 = var12.anInt1997 * 1348115267;
								Class117_Sub22_Sub5.aClass117_Sub22_Sub17_Sub2Array2218[0].method3239(var11, var23);
								Class117_Sub22_Sub5.aClass117_Sub22_Sub17_Sub2Array2218[1].method3239(var11, var10 + var23 - 16);
								Class117_Sub22_Sub17.method2877(var11, 16 + var23, 16, var10 - 32, GameClient.anInt2998 * 14036663);
								var13 = var10 * (var10 - 32) / var14;
								if (var13 < 8) {
									var13 = 8;
								}

								var15 = (var10 - 32 - var13) * var19 / (var14 - var10);
								Class117_Sub22_Sub17.method2877(var11, var15 + var23 + 16, 16, var13, GameClient.anInt3190 * 1597124133);
								Class117_Sub22_Sub17.method2876(var11, var15 + var23 + 16, var13, GameClient.anInt3001 * -373635497);
								Class117_Sub22_Sub17.method2876(var11 + 1, 16 + var23 + var15, var13, GameClient.anInt3001 * -373635497);
								Class117_Sub22_Sub17.method2916(var11, var15 + var23 + 16, 16, GameClient.anInt3001 * -373635497);
								Class117_Sub22_Sub17.method2916(var11, var23 + 17 + var15, 16, GameClient.anInt3001 * -373635497);
								Class117_Sub22_Sub17.method2876(15 + var11, 16 + var23 + var15, var13, GameClient.anInt3000 * 128324183);
								Class117_Sub22_Sub17.method2876(var11 + 14, var15 + var23 + 17, var13 - 1, GameClient.anInt3000 * 128324183);
								Class117_Sub22_Sub17.method2916(var11, var13 + var15 + 15 + var23, 16, GameClient.anInt3000 * 128324183);
								Class117_Sub22_Sub17.method2916(var11 + 1, var15 + 14 + var23 + var13, 15, GameClient.anInt3000 * 128324183);
							}

							if (var12.anInt1975 * 657737235 != 1) {
								int var21;
								int var31;
								int var35;
								if (var12.anInt1975 * 657737235 == 2) {
									var11 = 0;

									for (var19 = 0; var19 < var12.anInt1985 * -625237513; var19++) {
										for (var10 = 0; var10 < var12.anInt1984 * 63573717; var10++) {
											var14 = (var12.anInt2037 * 594676405 + 32) * var10 + var22;
											var13 = var23 + var19 * (32 + var12.anInt2038 * -1418485899);
											if (var11 < 20) {
												var14 += var12.anIntArray2039[var11];
												var13 += var12.anIntArray2040[var11];
											}

											if (var12.anIntArray2049[var11] <= 0) {
												if (var12.anIntArray2041 != null && var11 < 20) {
													Class117_Sub22_Sub17_Sub3 var52 = var12.method2283(var11, (byte) -33);
													if (var52 != null) {
														var52.method3290(var14, var13);
													} else if (Class117_Sub19.aBool2086) {
														Class54.method850(var12, (byte) 0);
													}
												}
											} else {
												boolean var49 = false;
												boolean var54 = false;
												var35 = var12.anIntArray2049[var11] - 1;
												if (var14 + 32 > var2 && var14 < var4 && 32 + var13 > var3 && var13 < var5 || Class55.aClass117_Sub19_738 == var12 && GameClient.anInt3034 * 1685534695 == var11) {
													Class117_Sub22_Sub17_Sub3 var56;
													if (GameClient.anInt3071 * -339828245 == 1 && var11 == Class117_Sub22_Sub20.anInt2495 * 621320165 && Class82.anInt978 * 240984047 == var12.anInt1973 * -1955776525) {
														var56 = Class15.method317(var35, var12.anIntArray2058[var11], 2, 0, 2, false, (short) 4852);
													} else {
														var56 = Class15.method317(var35, var12.anIntArray2058[var11], 1, 3153952, 2, false, (short) -6204);
													}

													if (var56 != null) {
														if (Class55.aClass117_Sub19_738 == var12 && GameClient.anInt3034 * 1685534695 == var11) {
															var15 = Class75.anInt903 * -456706193 - GameClient.anInt3035 * 1554516091;
															var21 = Class75.anInt904 * 1381104939 - GameClient.anInt2949 * 274254957;
															if (var15 < 5 && var15 > -5) {
																var15 = 0;
															}

															if (var21 < 5 && var21 > -5) {
																var21 = 0;
															}

															if (GameClient.anInt3039 * 1509232991 < 5) {
																var15 = 0;
																var21 = 0;
															}

															var56.method3270(var14 + var15, var21 + var13, 128);
															if (var1 != -1) {
																Class117_Sub19 var55 = var0[var1 & 65535];
																if (var13 + var21 < Class117_Sub22_Sub17.anInt2465 && var55.anInt2060 * -400020749 > 0) {
																	var31 = (Class117_Sub22_Sub17.anInt2465 - var13 - var21) * GameClient.anInt3092 * -402053703 / 3;
																	if (var31 > GameClient.anInt3092 * 274430266) {
																		var31 = GameClient.anInt3092 * 274430266;
																	}

																	if (var31 > var55.anInt2060 * -400020749) {
																		var31 = var55.anInt2060 * -400020749;
																	}

																	var55.anInt2060 -= var31 * -1852047813;
																	GameClient.anInt2949 += var31 * 363535717;
																	Class54.method850(var55, (byte) 0);
																}

																if (var21 + var13 + 32 > Class117_Sub22_Sub17.anInt2463 && var55.anInt2060 * -400020749 < var55.anInt1997 * 1348115267 - var55.anInt1989 * 2747837) {
																	var31 = GameClient.anInt3092 * -402053703 * (var13 + var21 + 32 - Class117_Sub22_Sub17.anInt2463) / 3;
																	if (var31 > GameClient.anInt3092 * 274430266) {
																		var31 = GameClient.anInt3092 * 274430266;
																	}

																	if (var31 > var55.anInt1997 * 1348115267 - var55.anInt1989 * 2747837 - var55.anInt2060 * -400020749) {
																		var31 = var55.anInt1997 * 1348115267 - var55.anInt1989 * 2747837 - var55.anInt2060 * -400020749;
																	}

																	var55.anInt2060 += var31 * -1852047813;
																	GameClient.anInt2949 -= var31 * 363535717;
																	Class54.method850(var55, (byte) 0);
																}
															}
														} else if (var12 == Class26.aClass117_Sub19_333 && GameClient.anInt3033 * 2089655571 == var11) {
															var56.method3270(var14, var13, 128);
														} else {
															var56.method3290(var14, var13);
														}
													} else {
														Class54.method850(var12, (byte) 0);
													}
												}
											}

											++var11;
										}
									}
								} else if (var12.anInt1975 * 657737235 == 3) {
									if (Class2.method62(var12, (short) 2048)) {
										var11 = var12.anInt1999 * -193926671;
										if (Class117_Sub22_Sub6.aClass117_Sub19_2271 == var12 && var12.anInt1970 * 260333003 != 0) {
											var11 = var12.anInt1970 * 260333003;
										}
									} else {
										var11 = var12.anInt1986 * 338507451;
										if (var12 == Class117_Sub22_Sub6.aClass117_Sub19_2271 && var12.anInt2000 * -769732333 != 0) {
											var11 = var12.anInt2000 * -769732333;
										}
									}

									if (var34 == 0) {
										if (var12.aBool2002) {
											Class117_Sub22_Sub17.method2877(var22, var23, var12.anInt1988 * 1854643179, var12.anInt1989 * 2747837, var11);
										} else {
											Class117_Sub22_Sub17.method2872(var22, var23, var12.anInt1988 * 1854643179, var12.anInt1989 * 2747837, var11);
										}
									} else if (var12.aBool2002) {
										Class117_Sub22_Sub17.method2869(var22, var23, var12.anInt1988 * 1854643179, var12.anInt1989 * 2747837, var11, 256 - (var34 & 255));
									} else {
										Class117_Sub22_Sub17.method2873(var22, var23, var12.anInt1988 * 1854643179, var12.anInt1989 * 2747837, var11, 256 - (var34 & 255));
									}
								} else {
									Class117_Sub22_Sub17_Sub4_Sub1 var39;
									if (var12.anInt1975 * 657737235 == 4) {
										var39 = var12.method2322(-374843186);
										if (var39 == null) {
											if (Class117_Sub19.aBool2086) {
												Class54.method850(var12, (byte) 0);
											}
										} else {
											String var47 = var12.aString2031;
											if (Class2.method62(var12, (short) 2048)) {
												var19 = var12.anInt1999 * -193926671;
												if (var12 == Class117_Sub22_Sub6.aClass117_Sub19_2271 && var12.anInt1970 * 260333003 != 0) {
													var19 = var12.anInt1970 * 260333003;
												}

												if (var12.aString2089.length() > 0) {
													var47 = var12.aString2089;
												}
											} else {
												var19 = var12.anInt1986 * 338507451;
												if (Class117_Sub22_Sub6.aClass117_Sub19_2271 == var12 && var12.anInt2000 * -769732333 != 0) {
													var19 = var12.anInt2000 * -769732333;
												}
											}

											if (var12.aBool2061 && var12.anInt2091 * -828631679 != -1) {
												Class117_Sub22_Sub6 var53 = Class117_Sub13.method1992(var12.anInt2091 * -828631679, 1499024294);
												var47 = var53.aString2264;
												if (var47 == null) {
													var47 = "null";
												}

												if ((var53.anInt2222 * -1106690991 == 1 || var12.anInt2092 * 1669652681 != 1) && var12.anInt2092 * 1669652681 != -1) {
													var47 = Class117_Sub22_Sub12.method2584(16748608, 668388556) + var47 + Class39.aString483 + " " + 'x' + Class47.method773(var12.anInt2092 * 1669652681, 2086279126);
												}
											}

											if (GameClient.aClass117_Sub19_3083 == var12) {
												Class108 var10000 = (Class108) null;
												var47 = Class108.aString1242;
												var19 = var12.anInt1986 * 338507451;
											}

											if (!var12.aBool2061) {
												var47 = Class117_Sub22_Sub10.method2542(var47, var12, -1247632707);
											}

											var39.method3461(var47, var22, var23, var12.anInt1988 * 1854643179, var12.anInt1989 * 2747837, var19, var12.aBool2036 ? 0 : -1, var12.anInt2034 * -893742069, var12.anInt2035 * 1877221541, var12.anInt2033 * -303446287);
										}
									} else if (var12.anInt1975 * 657737235 == 5) {
										Class117_Sub22_Sub17_Sub3 var45;
										if (!var12.aBool2061) {
											var45 = var12.method2324(Class2.method62(var12, (short) 2048), (short) 29417);
											if (var45 != null) {
												var45.method3290(var22, var23);
											} else if (Class117_Sub19.aBool2086) {
												Class54.method850(var12, (byte) 0);
											}
										} else {
											if (var12.anInt2091 * -828631679 != -1) {
												var45 = Class15.method317(var12.anInt2091 * -828631679, var12.anInt2092 * 1669652681, var12.anInt2010 * -1092810545, var12.anInt2011 * 2036408165, var12.anInt2043 * -167220809, false, (short) -5701);
											} else {
												var45 = var12.method2324(false, (short) 24249);
											}

											if (var45 == null) {
												if (Class117_Sub19.aBool2086) {
													Class54.method850(var12, (byte) 0);
												}
											} else {
												var19 = var45.anInt2715;
												var10 = var45.anInt2720;
												if (!var12.aBool2009) {
													var14 = var12.anInt1988 * -1178685440 / var19;
													if (var12.anInt1968 * -151680049 != 0) {
														var45.method3268(var22 + var12.anInt1988 * 1854643179 / 2, var23 + var12.anInt1989 * 2747837 / 2, var12.anInt1968 * -151680049, var14);
													} else if (var34 != 0) {
														var45.method3263(var22, var23, var12.anInt1988 * 1854643179, var12.anInt1989 * 2747837, 256 - (var34 & 255));
													} else if (var19 == var12.anInt1988 * 1854643179 && var12.anInt1989 * 2747837 == var10) {
														var45.method3290(var22, var23);
													} else {
														var45.method3257(var22, var23, var12.anInt1988 * 1854643179, var12.anInt1989 * 2747837);
													}
												} else {
													Class117_Sub22_Sub17.method2915(var22, var23, var12.anInt1988 * 1854643179 + var22, var12.anInt1989 * 2747837 + var23);
													var14 = (var19 - 1 + var12.anInt1988 * 1854643179) / var19;
													var13 = (var10 - 1 + var12.anInt1989 * 2747837) / var10;

													for (var15 = 0; var15 < var14; var15++) {
														for (var21 = 0; var21 < var13; var21++) {
															if (var12.anInt1968 * -151680049 != 0) {
																var45.method3268(var19 / 2 + var19 * var15 + var22, var23 + var10 * var21 + var10 / 2, var12.anInt1968 * -151680049, 4096);
															} else if (var34 != 0) {
																var45.method3270(var15 * var19 + var22, var23 + var21 * var10, 256 - (var34 & 255));
															} else {
																var45.method3290(var22 + var19 * var15, var21 * var10 + var23);
															}
														}
													}

													Class117_Sub22_Sub17.method2871(var2, var3, var4, var5);
												}
											}
										}
									} else {
										Class117_Sub22_Sub6 var40;
										if (var12.anInt1975 * 657737235 == 6) {
											boolean var44 = Class2.method62(var12, (short) 2048);
											if (var44) {
												var19 = var12.anInt2019 * 946586839;
											} else {
												var19 = var12.anInt2102 * 1339652199;
											}

											Class117_Sub22_Sub18_Sub7 var42 = null;
											var14 = 0;
											if (var12.anInt2091 * -828631679 != -1) {
												var40 = Class117_Sub13.method1992(var12.anInt2091 * -828631679, 802020358);
												if (var40 != null) {
													var40 = var40.method2465(var12.anInt2092 * 1669652681, -379661069);
													var42 = var40.method2423(1, -255863967);
													if (var42 != null) {
														var42.method3410();
														var14 = var42.anInt2466 * 1871917943 / 2;
													} else {
														Class54.method850(var12, (byte) 0);
													}
												}
											} else if (var12.anInt2080 * 1682942971 == 5) {
												if (var12.anInt2015 * 562552053 == 0) {
													var42 = GameClient.aClass91_3193.method1221((Class117_Sub22_Sub14) null, -1, (Class117_Sub22_Sub14) null, -1, 839212158);
												} else {
													var42 = Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.method2921((byte) 53);
												}
											} else if (var19 == -1) {
												var42 = var12.method2279((Class117_Sub22_Sub14) null, -1, var44, Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.aClass91_2871, -2069840042);
												if (var42 == null && Class117_Sub19.aBool2086) {
													Class54.method850(var12, (byte) 0);
												}
											} else {
												Class117_Sub22_Sub14 var48 = Class114_Sub1.method1838(var19, (byte) -113);
												var42 = var12.method2279(var48, var12.anInt2082 * -816117465, var44, Class31.aClass117_Sub22_Sub18_Sub1_Sub2_393.aClass91_2871, -1131480014);
												if (var42 == null && Class117_Sub19.aBool2086) {
													Class54.method850(var12, (byte) 0);
												}
											}

											Class117_Sub22_Sub17_Sub1.method3096(var22 + var12.anInt1988 * 1854643179 / 2, var23 + var12.anInt1989 * 2747837 / 2);
											var13 = var12.anInt2025 * -2061757375 * Class117_Sub22_Sub17_Sub1.anIntArray2653[var12.anInt1966 * -1133280755] >> 16;
											var15 = var12.anInt2025 * -2061757375 * Class117_Sub22_Sub17_Sub1.anIntArray2654[var12.anInt1966 * -1133280755] >> 16;
											if (var42 != null) {
												if (!var12.aBool2061) {
													var42.method3378(0, var12.anInt2023 * -1569228799, 0, var12.anInt1966 * -1133280755, 0, var13, var15);
												} else {
													var42.method3410();
													if (var12.aBool2028) {
														var42.method3379(0, var12.anInt2023 * -1569228799, var12.anInt2024 * -1708734847, var12.anInt1966 * -1133280755, var12.anInt2020 * -1832824355, var13 + var14 + var12.anInt2022 * -1603566821, var12.anInt2022 * -1603566821 + var15, var12.anInt2025 * -2061757375);
													} else {
														var42.method3378(0, var12.anInt2023 * -1569228799, var12.anInt2024 * -1708734847, var12.anInt1966 * -1133280755, var12.anInt2020 * -1832824355, var14 + var13 + var12.anInt2022 * -1603566821, var12.anInt2022 * -1603566821 + var15);
													}
												}
											}

											Class117_Sub22_Sub17_Sub1.method3131();
										} else {
											if (var12.anInt1975 * 657737235 == 7) {
												var39 = var12.method2322(1861593682);
												if (var39 == null) {
													if (Class117_Sub19.aBool2086) {
														Class54.method850(var12, (byte) 0);
													}
													continue;
												}

												var19 = 0;

												for (var10 = 0; var10 < var12.anInt1985 * -625237513; var10++) {
													for (var14 = 0; var14 < var12.anInt1984 * 63573717; var14++) {
														if (var12.anIntArray2049[var19] > 0) {
															var40 = Class117_Sub13.method1992(var12.anIntArray2049[var19] - 1, 593437685);
															String var43;
															if (var40.anInt2222 * -1106690991 != 1 && var12.anIntArray2058[var19] == 1) {
																var43 = Class117_Sub22_Sub12.method2584(16748608, 668388556) + var40.aString2264 + Class39.aString483;
															} else {
																var43 = Class117_Sub22_Sub12.method2584(16748608, 668388556) + var40.aString2264 + Class39.aString483 + " " + 'x' + Class47.method773(var12.anIntArray2058[var19], 2077866532);
															}

															var21 = var22 + var14 * (var12.anInt2037 * 594676405 + 115);
															var35 = var23 + var10 * (12 + var12.anInt2038 * -1418485899);
															if (var12.anInt2034 * -893742069 == 0) {
																var39.method3471(var43, var21, var35, var12.anInt1986 * 338507451, !var12.aBool2036 ? -1 : 0);
															} else if (var12.anInt2034 * -893742069 == 1) {
																var39.method3530(var43, var12.anInt1988 * 1854643179 / 2 + var21, var35, var12.anInt1986 * 338507451, var12.aBool2036 ? 0 : -1);
															} else {
																var39.method3459(var43, var12.anInt1988 * 1854643179 + var21 - 1, var35, var12.anInt1986 * 338507451, var12.aBool2036 ? 0 : -1);
															}
														}

														++var19;
													}
												}
											}

											int var33;
											if (var12.anInt1975 * 657737235 == 8 && var12 == Class117_Sub5.aClass117_Sub19_1749 && GameClient.anInt3123 * -1796547367 == GameClient.anInt3069 * 968251447) {
												var11 = 0;
												var19 = 0;
												Class117_Sub22_Sub17_Sub4_Sub1 var38 = Class39.aClass117_Sub22_Sub17_Sub4_Sub1_485;
												String var46 = var12.aString2031;

												String var41;
												for (var46 = Class117_Sub22_Sub10.method2542(var46, var12, -469467509); var46.length() > 0; var19 += var38.anInt2854 + 1) {
													var15 = var46.indexOf(Class39.aString482);
													if (var15 != -1) {
														var41 = var46.substring(0, var15);
														var46 = var46.substring(var15 + 4);
													} else {
														var41 = var46;
														var46 = "";
													}

													var21 = var38.method3454(var41);
													if (var21 > var11) {
														var11 = var21;
													}
												}

												var11 += 6;
												var19 += 7;
												var15 = var12.anInt1988 * 1854643179 + var22 - 5 - var11;
												var21 = 5 + var23 + var12.anInt1989 * 2747837;
												if (var15 < var22 + 5) {
													var15 = var22 + 5;
												}

												if (var11 + var15 > var4) {
													var15 = var4 - var11;
												}

												if (var19 + var21 > var5) {
													var21 = var5 - var19;
												}

												Class117_Sub22_Sub17.method2877(var15, var21, var11, var19, 16777120);
												Class117_Sub22_Sub17.method2872(var15, var21, var11, var19, 0);
												var46 = var12.aString2031;
												var35 = 2 + var38.anInt2854 + var21;

												for (var46 = Class117_Sub22_Sub10.method2542(var46, var12, -123820101); var46.length() > 0; var35 += 1 + var38.anInt2854) {
													var33 = var46.indexOf(Class39.aString482);
													if (var33 != -1) {
														var41 = var46.substring(0, var33);
														var46 = var46.substring(var33 + 4);
													} else {
														var41 = var46;
														var46 = "";
													}

													var38.method3471(var41, 3 + var15, var35, 0, -1);
												}
											}

											if (var12.anInt1975 * 657737235 == 9) {
												if (var12.anInt2004 * 1887460517 == 1) {
													if (var12.aBool2005) {
														var11 = var22;
														var19 = var23 + var12.anInt1989 * 2747837;
														var10 = var22 + var12.anInt1988 * 1854643179;
														var14 = var23;
													} else {
														var11 = var22;
														var19 = var23;
														var10 = var22 + var12.anInt1988 * 1854643179;
														var14 = var12.anInt1989 * 2747837 + var23;
													}

													Class117_Sub22_Sub17.method2908(var11, var19, var10, var14, var12.anInt1986 * 338507451);
												} else {
													var11 = var12.anInt1988 * 1854643179 >= 0 ? var12.anInt1988 * 1854643179 : -(var12.anInt1988 * 1854643179);
													var19 = var12.anInt1989 * 2747837 >= 0 ? var12.anInt1989 * 2747837 : -(var12.anInt1989 * 2747837);
													var10 = var11;
													if (var11 < var19) {
														var10 = var19;
													}

													if (var10 != 0) {
														var14 = (var12.anInt1988 * 1854643179 << 16) / var10;
														var13 = (var12.anInt1989 * 2747837 << 16) / var10;
														if (var13 <= var14) {
															var14 = -var14;
														} else {
															var13 = -var13;
														}

														var15 = var12.anInt2004 * 1887460517 * var13 >> 17;
														var21 = 1 + var13 * var12.anInt2004 * 1887460517 >> 17;
														var35 = var14 * var12.anInt2004 * 1887460517 >> 17;
														var33 = var14 * var12.anInt2004 * 1887460517 + 1 >> 17;
														int var27 = var22 + var15;
														var31 = var22 - var21;
														int var28 = var22 + var12.anInt1988 * 1854643179 - var21;
														int var29 = var12.anInt1988 * 1854643179 + var22 + var15;
														int var24 = var23 + var35;
														int var36 = var23 - var33;
														int var25 = var23 + var12.anInt1989 * 2747837 - var33;
														int var26 = var35 + var12.anInt1989 * 2747837 + var23;
														Class117_Sub22_Sub17_Sub1.method3101(var27, var31, var28);
														Class117_Sub22_Sub17_Sub1.method3104(var24, var36, var25, var27, var31, var28, var12.anInt1986 * 338507451);
														Class117_Sub22_Sub17_Sub1.method3101(var27, var28, var29);
														Class117_Sub22_Sub17_Sub1.method3104(var24, var25, var26, var27, var28, var29, var12.anInt1986 * 338507451);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}

}
