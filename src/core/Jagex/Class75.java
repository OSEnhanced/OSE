package core.Jagex;
import java.awt.event.*;

public class Class75 implements MouseListener, MouseMotionListener, FocusListener {

	public static String aString897;
	public static final int anInt913 = 40;
	static final int anInt914 = 3;
	public static volatile int anInt898 = 0;
	public static volatile int anInt906 = 0;
	public static volatile int anInt902 = 0;
	public static volatile long aLong908 = 0L;
	public static volatile int anInt905 = 0;
	public static volatile int anInt899 = 0;
	public static volatile int anInt900 = -179689537;
	public static volatile int anInt907 = 1934703287;
	public static Class75 aClass75_912 = new Class75();
	public static int anInt911 = 0;
	public static int anInt903 = 0;
	public static int anInt904 = 0;
	public static int anInt909 = 0;
	public static int anInt915 = 0;
	public static int anInt901 = 0;
	public static long aLong910 = 0L;

	public final synchronized void mousePressed(MouseEvent var1) {
		if (aClass75_912 != null) {
			anInt898 = 0;
			anInt906 = var1.getX() * -1845347077;
			anInt902 = var1.getY() * -2100612139;
			aLong908 = Class47.method774(768816327) * -8419130234965632695L;
			if (var1.isAltDown()) {
				anInt905 = -1461226220;
				anInt899 = 1236389372;
			} else if (var1.isMetaDown()) {
				anInt905 = 1416870538;
				anInt899 = 618194686;
			} else {
				anInt905 = -1439048379;
				anInt899 = -1838386305;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseEntered(MouseEvent var1) {
		if (aClass75_912 != null) {
			anInt898 = 0;
			anInt900 = var1.getX() * 179689537;
			anInt907 = var1.getY() * -1934703287;
		}

	}

	public final synchronized void mouseExited(MouseEvent var1) {
		if (aClass75_912 != null) {
			anInt898 = 0;
			anInt900 = -179689537;
			anInt907 = 1934703287;
		}

	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		if (aClass75_912 != null) {
			anInt898 = 0;
			anInt900 = var1.getX() * 179689537;
			anInt907 = var1.getY() * -1934703287;
		}

	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (aClass75_912 != null) {
			anInt898 = 0;
			anInt900 = var1.getX() * 179689537;
			anInt907 = var1.getY() * -1934703287;
		}

	}

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (aClass75_912 != null) {
			anInt898 = 0;
			anInt899 = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final void focusGained(FocusEvent var1) {
	}

	static void method1034(int var0) {
		Class31.anInt399 = 768807135;
		Class99.aByteArrayArrayArray1138 = new byte[4][104][104];
		Class31.aByteArrayArrayArray382 = new byte[4][104][104];
		Class28.aByteArrayArrayArray347 = new byte[4][104][104];
		Class31.aByteArrayArrayArray383 = new byte[4][104][104];
		Class40.anIntArrayArrayArray502 = new int[4][105][105];
		Class31.aByteArrayArrayArray385 = new byte[4][105][105];
		Class31.anIntArrayArray386 = new int[105][105];
		Class130.anIntArray1586 = new int[104];
		Class117_Sub22_Sub18_Sub1_Sub1.anIntArray2869 = new int[104];
		Class20.anIntArray230 = new int[104];
		Class136.anIntArray1606 = new int[104];
		Class38.anIntArray471 = new int[104];
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (aClass75_912 != null) {
			anInt899 = 0;
		}

	}

	static Class117_Sub10 method1040(int var0, int var1, int var2, int var3) {
		Class117_Sub10 var4 = new Class117_Sub10();
		var4.anInt1831 = var1 * -508200759;
		var4.anInt1828 = var2 * -632392493;
		GameClient.aClass127_3080.method1666(var4, (long) var0);
		Class106_Sub1.method2250(var1, (byte) 2);
		Class117_Sub19 var5 = Class74.method1010(var0, -1180501644);
		Class54.method850(var5, (byte) 0);
		if (GameClient.aClass117_Sub19_3083 != null) {
			Class54.method850(GameClient.aClass117_Sub19_3083, (byte) 0);
			GameClient.aClass117_Sub19_3083 = null;
		}

		Class80.method1082(128303663);
		Class95.method1245(Class117_Sub19.aClass117_Sub19ArrayArray2032[var0 >> 16], var5, false, (byte) 4);
		Class117_Sub22_Sub18_Sub3.method3091(var1, (byte) 94);
		if (GameClient.anInt3036 * -1635287017 != -1) {
			Class117_Sub22_Sub18_Sub1_Sub2.method3543(GameClient.anInt3036 * -1635287017, 1, -1550534219);
		}

		return var4;
	}

}
