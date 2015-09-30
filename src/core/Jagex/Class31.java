package core.Jagex;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class31 {

	public static final int anInt380 = 239;
	static byte[][][] aByteArrayArrayArray382;
	static byte[][][] aByteArrayArrayArray383;
	static byte[][][] aByteArrayArrayArray385;
	static int[][] anIntArrayArray386;
	static final int anInt387 = 585;
	static final int anInt388 = 1170;
	public static Class117_Sub22_Sub18_Sub1_Sub2 aClass117_Sub22_Sub18_Sub1_Sub2_393;
	static final int anInt397 = 4;
	static final int anInt398 = 2;
	static FontMetrics aFontMetrics400;
	static final int anInt402 = 15;
	static final int anInt403 = 29;
	static int[][][] anIntArrayArrayArray381 = new int[4][105][105];
	static byte[][][] aByteArrayArrayArray401 = new byte[4][104][104];
	static int anInt399 = 768807135;
	static int[] anIntArray389 = new int[]{1, 2, 4, 8};
	static int[] anIntArray390 = new int[]{16, 32, 64, 128};
	static int[] anIntArray391 = new int[]{1, 0, -1, 0};
	static int[] anIntArray392 = new int[]{0, -1, 0, 1};
	static int[] anIntArray384 = new int[]{1, -1, -1, 1};
	static int[] anIntArray394 = new int[]{-1, -1, 1, 1};
	static int anInt395 = ((int) (Math.random() * 17.0D) - 8) * -2127249693;
	static int anInt396 = ((int) (Math.random() * 33.0D) - 16) * -1408752021;

	static void method424(boolean var0, int var1) {
		Class117_Sub13.method1989(-1001075450);
		GameClient.anInt2967 += 2105338273;
		if (GameClient.anInt2967 * 2141010529 >= 50 || var0) {
			GameClient.anInt2967 = 0;
			if (!GameClient.aBool2972 && Class117_Sub22_Sub18_Sub2.aClass81_2609 != null) {
				GameClient.aClass117_Sub14_Sub1_2961.method2932(179, 334643171);

				try {
					Class117_Sub22_Sub18_Sub2.aClass81_2609.method1107(GameClient.aClass117_Sub14_Sub1_2961.aByteArray1885, 0, GameClient.aClass117_Sub14_Sub1_2961.anInt1880 * 561453169, (byte) 4);
					GameClient.aClass117_Sub14_Sub1_2961.anInt1880 = 0;
				} catch (IOException var3) {
					GameClient.aBool2972 = true;
				}
			}

		}
	}

	Class31() throws Throwable {
		throw new Error();
	}

	public static void method452(short var0) {
		try {
			File var1 = new File(Class75.aString897, "random.dat");
			int var3;
			if (var1.exists()) {
				Class74.aClass145_886 = new Class145(new Class129(var1, "rw", 25L), 24, 0);
			} else {
				label33:
				for (int var2 = 0; var2 < Class121.aStringArray1519.length; var2++) {
					for (var3 = 0; var3 < Class74.aStringArray888.length; var3++) {
						File var4 = new File(Class74.aStringArray888[var3] + Class121.aStringArray1519[var2] + File.separatorChar + "random.dat");
						if (var4.exists()) {
							Class74.aClass145_886 = new Class145(new Class129(var4, "rw", 25L), 24, 0);
							break label33;
						}
					}
				}
			}

			if (Class74.aClass145_886 == null) {
				RandomAccessFile var6 = new RandomAccessFile(var1, "rw");
				var3 = var6.read();
				var6.seek(0L);
				var6.write(var3);
				var6.seek(0L);
				var6.close();
				Class74.aClass145_886 = new Class145(new Class129(var1, "rw", 25L), 24, 0);
			}
		} catch (IOException var5) {
			;
		}

	}

	public static void method465(Component var0, byte var1) {
		var0.removeKeyListener(Class89.aClass89_1055);
		var0.removeFocusListener(Class89.aClass89_1055);
		Class89.anInt1051 = -304673675;
	}

	static void method466(int var0) {
		if (GameClient.aBool3074) {
			Class117_Sub19 var2 = Class23.method368(RuntimeException_Sub1.anInt2835 * -1977023109, GameClient.anInt3075 * 1861520895, -1141365772);
			if (var2 != null && var2.anObjectArray2063 != null) {
				Class117_Sub7 var1 = new Class117_Sub7();
				var1.aClass117_Sub19_1780 = var2;
				var1.anObjectArray1786 = var2.anObjectArray2063;
				Class57.method867(var1, 200000, 358801263);
			}

			GameClient.aBool3074 = false;
			Class54.method850(var2, (byte) 0);
		}
	}

}
