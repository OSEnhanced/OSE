package core.Jagex;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Class89 implements KeyListener, FocusListener {

	static final int anInt1033 = 6;
	public static final int anInt1034 = 13;
	static final int anInt1036 = 1;
	static final int anInt1037 = 3;
	static final int anInt1038 = 53;
	static final int anInt1040 = 7;
	static final int anInt1041 = 17;
	static final int anInt1042 = 21;
	static final int anInt1043 = 22;
	public static final int anInt1044 = 27;
	public static final int anInt1046 = 57;
	static final int anInt1047 = 128;
	static final int anInt1048 = 2;
	static final int anInt1060 = 5;
	static final int anInt1061 = 86;
	static volatile int anInt1059 = 0;
	static int anInt1051 = 0;
	static int anInt1057 = 0;
	public static Class89 aClass89_1055 = new Class89();
	public static boolean[] aBoolArray1050 = new boolean[112];
	static int[] anIntArray1049 = new int[128];
	static int anInt1052 = 0;
	static char[] aCharArray1053 = new char[128];
	static int[] anIntArray1045 = new int[128];
	public static int[] anIntArray1054 = new int[128];
	public static int anInt1039 = 0;
	static int anInt1035 = 0;
	static int anInt1058 = 0;
	public static int[] anIntArray1056 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

	public final synchronized void keyPressed(KeyEvent var1) {
		if (aClass89_1055 != null) {
			anInt1059 = 0;
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < anIntArray1056.length) {
				var2 = anIntArray1056[var2];
				if ((var2 & 128) != 0) {
					var2 = -1;
				}
			} else {
				var2 = -1;
			}

			if (anInt1051 * 2008718371 >= 0 && var2 >= 0) {
				anIntArray1049[anInt1051 * 2008718371] = var2;
				anInt1051 = (anInt1051 * 2008718371 + 1 & 127) * 304673675;
				if (anInt1051 * 2008718371 == anInt1052 * 23456761) {
					anInt1051 = -304673675;
				}
			}

			int var3;
			if (var2 >= 0) {
				var3 = 1 + anInt1057 * 1361501851 & 127;
				if (anInt1035 * 444349507 != var3) {
					anIntArray1045[anInt1057 * 1361501851] = var2;
					aCharArray1053[anInt1057 * 1361501851] = 0;
					anInt1057 = var3 * 1942935443;
				}
			}

			var3 = var1.getModifiers();
			if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) {
				var1.consume();
			}
		}

	}

	public final synchronized void keyReleased(KeyEvent var1) {
		if (aClass89_1055 != null) {
			anInt1059 = 0;
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < anIntArray1056.length) {
				var2 = anIntArray1056[var2] & -129;
			} else {
				var2 = -1;
			}

			if (anInt1051 * 2008718371 >= 0 && var2 >= 0) {
				anIntArray1049[anInt1051 * 2008718371] = ~var2;
				anInt1051 = (anInt1051 * 2008718371 + 1 & 127) * 304673675;
				if (anInt1052 * 23456761 == anInt1051 * 2008718371) {
					anInt1051 = -304673675;
				}
			}
		}

		var1.consume();
	}

	public static boolean method1158(int var0) {
		Class117_Sub24 var1 = (Class117_Sub24) Class138.aClass126_1623.method1653();
		return var1 != null;
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (aClass89_1055 != null) {
			anInt1051 = -304673675;
		}

	}

	public static int method1168(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if ((var5 & 1) == 1) {
			int var7 = var3;
			var3 = var4;
			var4 = var7;
		}

		var2 &= 3;
		return var2 == 0 ? var1 : (var2 == 1 ? 7 - var0 - (var3 - 1) : (var2 != 2 ? var0 : 7 - var1 - (var4 - 1)));
	}

	public final void keyTyped(KeyEvent var1) {
		if (aClass89_1055 != null) {
			char var2 = var1.getKeyChar();
			if (var2 != 0 && var2 != 65535 && Class125.method1649(var2, -1722635737)) {
				int var3 = anInt1057 * 1361501851 + 1 & 127;
				if (anInt1035 * 444349507 != var3) {
					anIntArray1045[anInt1057 * 1361501851] = -1;
					aCharArray1053[anInt1057 * 1361501851] = var2;
					anInt1057 = var3 * 1942935443;
				}
			}
		}

		var1.consume();
	}

	static void method1184(Class117_Sub22_Sub18_Sub1_Sub2 var0, int var1, int var2, byte var3, byte var4) {
		int var5 = var0.anIntArray2594[0];
		int var8 = var0.anIntArray2541[0];
		if (var5 >= 0 && var5 < 104 && var8 >= 0 && var8 < 104) {
			if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
				int var7 = Class95.method1242(var5, var8, var0.method3540((byte) -1), Class117_Sub22_Sub18_Sub6.method3358(var1, var2, (byte) -3), GameClient.aClass51Array3174[var0.anInt2890 * -2130376517], true, GameClient.anIntArray3040, GameClient.anIntArray3201, (byte) -10);
				if (var7 >= 1) {
					for (int var6 = 0; var6 < var7 - 1; var6++) {
						var0.method3557(GameClient.anIntArray3040[var6], GameClient.anIntArray3201[var6], var3, -756611095);
					}

				}
			}
		}
	}

	public final void focusGained(FocusEvent var1) {
	}

}
