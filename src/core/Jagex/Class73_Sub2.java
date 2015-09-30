package core.Jagex;
import java.io.IOException;

public class Class73_Sub2 extends Class73 {

	public static final int anInt1888 = 197;
	static Class106_Sub1 aClass106_Sub1_1893;
	public static final int anInt1895 = 12;
	int anInt1890 = 2017018624;
	int anInt1889 = 1397078371;
	long aLong1892 = Class47.method774(-101336380) * -8159635368338855825L;
	int anInt1894;
	int anInt1891 = 0;
	long[] aLongArray1887 = new long[10];

	public static void method2218(boolean var0, byte var1) {
		if (Class96.aClass81_1125 != null) {
			try {
				Class117_Sub14 var2 = new Class117_Sub14(4);
				var2.method2126(var0 ? 2 : 3, 1637605658);
				var2.method2040(0, 2139043751);
				Class96.aClass81_1125.method1107(var2.aByteArray1885, 0, 4, (byte) 4);
			} catch (IOException var5) {
				try {
					Class96.aClass81_1125.method1088((byte) 0);
				} catch (Exception var4) {
					;
				}

				Class96.anInt1115 += 1642660055;
				Class96.aClass81_1125 = null;
			}

		}
	}

	public void method987(int var1) {
		for (int var2 = 0; var2 < 10; var2++) {
			aLongArray1887[var2] = 0L;
		}

	}

	int method988(int var1, int var2, int var3) {
		int var4 = anInt1890 * 470948715;
		int var6 = anInt1889 * -67530677;
		anInt1890 = 551754372;
		anInt1889 = 1397078371;
		aLong1892 = Class47.method774(1825143594) * -8159635368338855825L;
		if (aLongArray1887[anInt1894 * -1795641037] == 0L) {
			anInt1890 = var4 * -1887946429;
			anInt1889 = var6 * 1397078371;
		} else if (-4206381558604269937L * aLong1892 > aLongArray1887[anInt1894 * -1795641037]) {
			anInt1890 = (int) ((long) (var1 * 2560) / (aLong1892 * -4206381558604269937L - aLongArray1887[anInt1894 * -1795641037])) * -1887946429;
		}

		if (anInt1890 * 470948715 < 25) {
			anInt1890 = 45979531;
		}

		if (anInt1890 * 470948715 > 256) {
			anInt1890 = 2017018624;
			anInt1889 = (int) ((long) var1 - (aLong1892 * -4206381558604269937L - aLongArray1887[anInt1894 * -1795641037]) / 10L) * 1397078371;
		}

		if (anInt1889 * -67530677 > var1) {
			anInt1889 = var1 * 1397078371;
		}

		aLongArray1887[anInt1894 * -1795641037] = -4206381558604269937L * aLong1892;
		anInt1894 = (anInt1894 * -1795641037 + 1) % 10 * 2009248251;
		int var5;
		if (anInt1889 * -67530677 > 1) {
			for (var5 = 0; var5 < 10; var5++) {
				if (aLongArray1887[var5] != 0L) {
					aLongArray1887[var5] += (long) (anInt1889 * -67530677);
				}
			}
		}

		if (anInt1889 * -67530677 < var2) {
			anInt1889 = var2 * 1397078371;
		}

		Class38.method520((long) (anInt1889 * -67530677));

		for (var5 = 0; anInt1891 * -373830067 < 256; anInt1891 += anInt1890 * 536026263) {
			++var5;
		}

		anInt1891 = (anInt1891 * -373830067 & 255) * 1036393093;
		return var5;
	}

	static void method2219(long var0) {
		try {
			Thread.sleep(var0);
		} catch (InterruptedException var3) {
			;
		}

	}

	static void method2220(int var0) {
		GameClient.anInt2952 = 0;
		int var1 = (Class31.player.anInt2577 * 1961555871 >> 7) + Class117_Sub22_Sub20.anInt2497 * 544615727;
		int var2 = Class117_Sub22_Sub19.anInt2468 * -771797447 + (Class31.player.anInt2567 * -184603173 >> 7);
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			GameClient.anInt2952 = -2126163005;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			GameClient.anInt2952 = -2126163005;
		}

		if (GameClient.anInt2952 * -885148437 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			GameClient.anInt2952 = 0;
		}

	}

	public static String method2221(CharSequence var0, int var1) {
		int var2 = var0.length();
		char[] var3 = new char[var2];

		for (int var4 = 0; var4 < var2; var4++) {
			var3[var4] = 42;
		}

		String var5 = new String(var3);
		return var5;
	}

	Class73_Sub2() {
		for (int var1 = 0; var1 < 10; var1++) {
			aLongArray1887[var1] = aLong1892 * -4206381558604269937L;
		}

	}

}
