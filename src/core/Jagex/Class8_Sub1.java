package core.Jagex;
import java.awt.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

public final class Class8_Sub1 extends Class8 implements ImageProducer, ImageObserver {

	static final int anInt1684 = 400;
	static final int anInt1686 = 32768;
	static final int anInt1687 = 16;
	public static final int anInt1688 = 26;
	static int anInt1690;
	ColorModel aColorModel1689;
	ImageConsumer anImageConsumer1685;

	public final void method120(int var1, int var2, Component var3, byte var4) {
		anInt105 = var1 * -1665036677;
		anInt108 = var2 * 114327359;
		anIntArray107 = new int[1 + var1 * var2];
		aColorModel1689 = new DirectColorModel(32, 16711680, 65280, 255);
		anImage106 = var3.createImage(this);
		method1876(205853532);
		var3.prepareImage(anImage106, this);
		method1876(149789881);
		var3.prepareImage(anImage106, this);
		method1876(1672474456);
		var3.prepareImage(anImage106, this);
		method126(2062958033);
	}

	public final void method122(Graphics var1, int var2, int var3, int var4) {
		method1876(1840606038);
		var1.drawImage(anImage106, var2, var3, this);
	}

	public synchronized void addConsumer(ImageConsumer var1) {
		anImageConsumer1685 = var1;
		var1.setDimensions(anInt105 * -831643469, anInt108 * -1990528833);
		var1.setProperties((Hashtable) null);
		var1.setColorModel(aColorModel1689);
		var1.setHints(14);
	}

	public void startProduction(ImageConsumer var1) {
		addConsumer(var1);
	}

	synchronized void method1876(int var1) {
		if (anImageConsumer1685 != null) {
			anImageConsumer1685.setPixels(0, 0, anInt105 * -831643469, anInt108 * -1990528833, aColorModel1689, anIntArray107, 0, anInt105 * -831643469);
			anImageConsumer1685.imageComplete(2);
		}
	}

	synchronized void method1877(int var1, int var2, int var3, int var4, int var5) {
		if (anImageConsumer1685 != null) {
			anImageConsumer1685.setPixels(var1, var2, var3, var4, aColorModel1689, anIntArray107, var2 * anInt105 * -831643469 + var1, anInt105 * -831643469);
			anImageConsumer1685.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image var1, int var2, int var3, int var4, int var5, int var6) {
		return true;
	}

	public static void method1878(File var0, File var1, int var2) {
		try {
			Class129 var3 = new Class129(Class74.aFile882, "rw", 10000L);
			Class117_Sub14 var4 = new Class117_Sub14(500);
			var4.method2126(3, 2119526777);
			var4.method2126(var1 != null ? 1 : 0, 1153699743);
			var4.method2090(var0.getPath(), 2141725402);
			if (var1 != null) {
				var4.method2090(var1.getPath(), -344526089);
			}

			var3.method1693(var4.aByteArray1885, 0, var4.anInt1880 * 561453169, (byte) -83);
			var3.method1685(924359149);
		} catch (IOException var5) {
			var5.printStackTrace();
		}

	}

	public static void method1881(Class61 var0, byte var1) {
		Class146.aClass61_1663 = var0;
	}

	static void method1882(Class117_Sub22_Sub18_Sub1 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var0 != null && var0.method3074(-126706481)) {
			if (var0 instanceof Class117_Sub22_Sub18_Sub1_Sub1) {
				Class117_Sub22_Sub5 var7 = ((Class117_Sub22_Sub18_Sub1_Sub1) var0).aClass117_Sub22_Sub5_2864;
				if (var7.anIntArray2210 != null) {
					var7 = var7.method2394(1214358918);
				}

				if (var7 == null) {
					return;
				}
			}

			int var11 = Class4.anInt46 * -1915182763;
			int[] var10 = Class4.anIntArray41;
			int var8;
			if (var1 < var11) {
				var8 = 30;
				Player var9 = (Player) var0;
				if (var9.aBool2883) {
					return;
				}

				if (var9.anInt2872 * -319498955 != -1 || var9.anInt2877 * -1917052781 != -1) {
					Class65.method946(var0, var0.anInt2589 * 1872277641 + 15, 390429188);
					if (GameClient.anInt2941 * -1957489215 > -1) {
						if (var9.anInt2872 * -319498955 != -1) {
							Class117_Sub22_Sub18_Sub6.aClass117_Sub22_Sub17_Sub3Array2762[var9.anInt2872 * -319498955].method3290(GameClient.anInt2941 * -1957489215 + var2 - 12, GameClient.anInt3187 * 1733237851 + var3 - var8);
							var8 += 25;
						}

						if (var9.anInt2877 * -1917052781 != -1) {
							Class117_Sub22_Sub10.aClass117_Sub22_Sub17_Sub3Array2307[var9.anInt2877 * -1917052781].method3290(GameClient.anInt2941 * -1957489215 + var2 - 12, GameClient.anInt3187 * 1733237851 + var3 - var8);
							var8 += 25;
						}
					}
				}

				if (var1 >= 0 && GameClient.anInt3095 * -949450207 == 10 && var10[var1] == GameClient.anInt3167 * -2098929247) {
					Class65.method946(var0, var0.anInt2589 * 1872277641 + 15, -232729220);
					if (GameClient.anInt2941 * -1957489215 > -1) {
						Class112.aClass117_Sub22_Sub17_Sub3Array1484[1].method3290(GameClient.anInt2941 * -1957489215 + var2 - 12, var3 + GameClient.anInt3187 * 1733237851 - var8);
					}
				}
			} else {
				Class117_Sub22_Sub5 var13 = ((Class117_Sub22_Sub18_Sub1_Sub1) var0).aClass117_Sub22_Sub5_2864;
				if (var13.anIntArray2210 != null) {
					var13 = var13.method2394(-133117267);
				}

				if (var13.anInt2206 * 728662031 >= 0 && var13.anInt2206 * 728662031 < Class117_Sub22_Sub10.aClass117_Sub22_Sub17_Sub3Array2307.length) {
					Class65.method946(var0, var0.anInt2589 * 1872277641 + 15, -873842368);
					if (GameClient.anInt2941 * -1957489215 > -1) {
						Class117_Sub22_Sub10.aClass117_Sub22_Sub17_Sub3Array2307[var13.anInt2206 * 728662031].method3290(GameClient.anInt2941 * -1957489215 + var2 - 12, GameClient.anInt3187 * 1733237851 + var3 - 30);
					}
				}

				if (GameClient.anInt3095 * -949450207 == 1 && GameClient.anInt2914 * -488998301 == GameClient.anIntArray2957[var1 - var11] && GameClient.anInt2923 * -488599663 % 20 < 10) {
					Class65.method946(var0, var0.anInt2589 * 1872277641 + 15, -2056510553);
					if (GameClient.anInt2941 * -1957489215 > -1) {
						Class112.aClass117_Sub22_Sub17_Sub3Array1484[0].method3290(GameClient.anInt2941 * -1957489215 + var2 - 12, var3 + GameClient.anInt3187 * 1733237851 - 28);
					}
				}
			}

			if (var0.aString2546 != null && (var1 >= var11 || !var0.aBool2555 && (GameClient.anInt3026 * -1711687437 == 4 || !var0.aBool2554 && (GameClient.anInt3026 * -1711687437 == 0 || GameClient.anInt3026 * -1711687437 == 3 || GameClient.anInt3026 * -1711687437 == 1 && Class84.method1141(((Player) var0).playerName, false, 2006421320))))) {
				Class65.method946(var0, var0.anInt2589 * 1872277641, -848653062);
				if (GameClient.anInt2941 * -1957489215 > -1 && GameClient.anInt3014 * 1004179943 < GameClient.anInt3015 * 1704437183) {
					GameClient.anIntArray3007[GameClient.anInt3014 * 1004179943] = Class54_Sub1.aClass117_Sub22_Sub17_Sub4_Sub1_1729.method3454(var0.aString2546) / 2;
					GameClient.anIntArray3018[GameClient.anInt3014 * 1004179943] = Class54_Sub1.aClass117_Sub22_Sub17_Sub4_Sub1_1729.anInt2854;
					GameClient.anIntArray3016[GameClient.anInt3014 * 1004179943] = GameClient.anInt2941 * -1957489215;
					GameClient.anIntArray3017[GameClient.anInt3014 * 1004179943] = GameClient.anInt3187 * 1733237851;
					GameClient.anIntArray3020[GameClient.anInt3014 * 1004179943] = var0.anInt2557 * -475368419;
					GameClient.anIntArray3189[GameClient.anInt3014 * 1004179943] = var0.anInt2580 * -1795119755;
					GameClient.anIntArray2940[GameClient.anInt3014 * 1004179943] = var0.anInt2556 * -319635947;
					GameClient.aStringArray3023[GameClient.anInt3014 * 1004179943] = var0.aString2546;
					GameClient.anInt3014 += 514060759;
				}
			}

			if (var0.anInt2601 * 110394635 > GameClient.anInt2923 * -488599663) {
				Class65.method946(var0, 15 + var0.anInt2589 * 1872277641, -230467637);
				if (GameClient.anInt2941 * -1957489215 > -1) {
					if (var1 < var11) {
						var8 = 30;
					} else {
						Class117_Sub22_Sub5 var12 = ((Class117_Sub22_Sub18_Sub1_Sub1) var0).aClass117_Sub22_Sub5_2864;
						var8 = var12.anInt2216 * -887507451;
					}

					int var14 = var8 * var0.anInt2563 * 912776123 / (var0.anInt2564 * 1451192863);
					if (var14 > var8) {
						var14 = var8;
					} else if (var14 == 0 && var0.anInt2563 * 912776123 > 0) {
						var14 = 1;
					}

					Class117_Sub22_Sub17.method2877(var2 + GameClient.anInt2941 * -1957489215 - var8 / 2, GameClient.anInt3187 * 1733237851 + var3 - 3, var14, 5, 65280);
					Class117_Sub22_Sub17.method2877(var14 + (var2 + GameClient.anInt2941 * -1957489215 - var8 / 2), GameClient.anInt3187 * 1733237851 + var3 - 3, var8 - var14, 5, 16711680);
				}
			}

			for (var8 = 0; var8 < 4; var8++) {
				if (var0.anIntArray2561[var8] > GameClient.anInt2923 * -488599663) {
					Class65.method946(var0, var0.anInt2589 * 1872277641 / 2, -1635192382);
					if (GameClient.anInt2941 * -1957489215 > -1) {
						if (var8 == 1) {
							GameClient.anInt3187 += 131199876;
						}

						if (var8 == 2) {
							GameClient.anInt2941 -= 1572186575;
							GameClient.anInt3187 += 65599938;
						}

						if (var8 == 3) {
							GameClient.anInt2941 += 1572186575;
							GameClient.anInt3187 += 65599938;
						}

						Class32.aClass117_Sub22_Sub17_Sub3Array409[var0.anIntArray2560[var8]].method3290(var2 + GameClient.anInt2941 * -1957489215 - 12, GameClient.anInt3187 * 1733237851 + var3 - 12);
						GameClient.aClass117_Sub22_Sub17_Sub4_Sub1_2973.method3530(Integer.toString(var0.anIntArray2559[var8]), GameClient.anInt2941 * -1957489215 + var2 - 1, 3 + GameClient.anInt3187 * 1733237851 + var3, 16777215, 0);
					}
				}
			}

		}
	}

	public void requestTopDownLeftRightResend(ImageConsumer var1) {
	}

	public synchronized void removeConsumer(ImageConsumer var1) {
		if (var1 == anImageConsumer1685) {
			anImageConsumer1685 = null;
		}

	}

	public synchronized boolean isConsumer(ImageConsumer var1) {
		return var1 == anImageConsumer1685;
	}

	public static void method1900(int var0) {
		Class117_Sub22_Sub15.aClass115_2448.method1518();
	}

	public final void method123(Graphics var1, int var2, int var3, int var4, int var5, int var6) {
		method1877(var2, var3, var4, var5, -2141686054);
		Shape var7 = var1.getClip();
		var1.clipRect(var2, var3, var4, var5);
		var1.drawImage(anImage106, 0, 0, this);
		var1.setClip(var7);
	}

}
