package core.Jagex;
import java.awt.*;
import java.io.File;
import java.io.RandomAccessFile;

public abstract class Class8 {

	public int anInt105;
	public Image anImage106;
	public int[] anIntArray107;
	int anInt108;
	static final int anInt109 = 24;
	public static final int anInt110 = 154;

	public abstract void method120(int var1, int var2, Component var3, byte var4);

	public abstract void method122(Graphics var1, int var2, int var3, int var4);

	public abstract void method123(Graphics var1, int var2, int var3, int var4, int var5, int var6);

	public final void method126(int var1) {
		Class117_Sub22_Sub17.method2862(anIntArray107, anInt105 * -831643469, anInt108 * -1990528833);
	}

	static void method133(int var0) {
		GameClient var1 = Class92.aGameClient1087;
		synchronized (var1) {
			Container var2 = Class92.aGameClient1087.method3576(1549154784);
			if (var2 != null) {
				Class14.anInt177 = Math.max(var2.getSize().width, Class117_Sub22_Sub18_Sub2.anInt2614 * -282146123) * -1327043513;
				Class117_Sub18.anInt1954 = Math.max(var2.getSize().height, Class117_Sub22_Sub18_Sub1.anInt2600 * 1184019573) * 1044480327;
				if (Class117_Sub22_Sub6.aFrame2269 == var2) {
					Insets var3 = Class117_Sub22_Sub6.aFrame2269.getInsets();
					Class14.anInt177 -= (var3.right + var3.left) * -1327043513;
					Class117_Sub18.anInt1954 -= (var3.bottom + var3.top) * 1044480327;
				}

				if (Class14.anInt177 * 715849079 <= 0) {
					Class14.anInt177 = -1327043513;
				}

				if (Class117_Sub18.anInt1954 * 910153847 <= 0) {
					Class117_Sub18.anInt1954 = 1044480327;
				}

				if (Class2.method63(1280063057) == 1) {
					Class80.anInt952 = GameClient.anInt3134 * 2015657303;
					Class117_Sub22_Sub18_Sub2.anInt2613 = GameClient.anInt3135 * -1995324493;
				} else {
					Class80.anInt952 = Math.min(Class14.anInt177 * 715849079, 7680) * -1102981367;
					Class117_Sub22_Sub18_Sub2.anInt2613 = Math.min(Class117_Sub18.anInt1954 * 910153847, 2160) * 74785649;
				}

				GameClient.anInt2905 = (Class14.anInt177 * 715849079 - Class80.anInt952 * 1566500665) / 2 * 697617085;
				GameClient.anInt2906 = 0;
				Class91.aCanvas1085.setSize(Class80.anInt952 * 1566500665, Class117_Sub22_Sub18_Sub2.anInt2613 * 1325743505);
				int var4 = Class80.anInt952 * 1566500665;
				int var5 = Class117_Sub22_Sub18_Sub2.anInt2613 * 1325743505;
				Canvas var6 = Class91.aCanvas1085;

				Object var12;
				try {
					Class8_Sub2 var7 = new Class8_Sub2();
					var7.method120(var4, var5, var6, (byte) 10);
					var12 = var7;
				} catch (Throwable var10) {
					Class8_Sub1 var8 = new Class8_Sub1();
					var8.method120(var4, var5, var6, (byte) 10);
					var12 = var8;
				}

				Class82.aClass8_979 = (Class8) var12;
				if (Class117_Sub22_Sub6.aFrame2269 == var2) {
					Insets var13 = Class117_Sub22_Sub6.aFrame2269.getInsets();
					Class91.aCanvas1085.setLocation(var13.left + GameClient.anInt2905 * -144834411, var13.top + GameClient.anInt2906 * -1191072495);
				} else {
					Class91.aCanvas1085.setLocation(GameClient.anInt2905 * -144834411, GameClient.anInt2906 * -1191072495);
				}

				Class131.method1708(2111554398);
				if (GameClient.anInt3036 * -1635287017 != -1) {
					Class117_Sub22_Sub18_Sub2.method3082(true, (byte) -88);
				}

				Class117_Sub10.method1969(-877443344);
			}
		}
	}

	public static File method134(String var0, byte var1) {
		if (!Class82.aBool974) {
			throw new RuntimeException("");
		} else {
			File var2 = (File) Class82.aHashtable980.get(var0);
			if (var2 != null) {
				return var2;
			} else {
				File var3 = new File(Class82.aFile973, var0);
				RandomAccessFile var4 = null;

				try {
					File var5 = new File(var3.getParent());
					if (!var5.exists()) {
						throw new RuntimeException("");
					} else {
						var4 = new RandomAccessFile(var3, "rw");
						int var6 = var4.read();
						var4.seek(0L);
						var4.write(var6);
						var4.seek(0L);
						var4.close();
						Class82.aHashtable980.put(var0, var3);
						return var3;
					}
				} catch (Exception var8) {
					try {
						if (var4 != null) {
							var4.close();
							var4 = null;
						}
					} catch (Exception var7) {
						;
					}

					throw new RuntimeException();
				}
			}
		}
	}

	static int method135(int var0, int var1, int var2, int var3, byte var4) {
		int var5 = 65536 - Class117_Sub22_Sub17_Sub1.anIntArray2654[var2 * 1024 / var3] >> 1;
		return (var0 * (65536 - var5) >> 16) + (var5 * var1 >> 16);
	}

}
