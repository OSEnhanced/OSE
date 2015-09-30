package core.Jagex;
import java.awt.*;
import java.awt.image.ImageObserver;

public final class Class117_Sub5 extends Class117 {

	boolean aBool1733;
	Class50 aClass50_1738;
	Class34 aClass34_1739;
	Class40 aClass40_1740;
	Class25 aClass25_1741;
	Class47 aClass47_1742;
	Class117_Sub5 aClass117_Sub5_1743;
	int anInt1745;
	int anInt1747;
	boolean aBool1748;
	static Class117_Sub19 aClass117_Sub19_1749;
	boolean aBool1750;
	static int anInt1751;
	int anInt1752;
	int anInt1753;
	int anInt1754;
	int anInt1756;
	Class27 aClass27_1757;
	static int anInt1758;
	Class23[] aClass23Array1744 = new Class23[5];
	int[] anIntArray1737 = new int[5];
	int anInt1746 = 0;
	int anInt1736;
	int anInt1755;
	int anInt1734;
	int anInt1735;

	static boolean method1935(int var0, byte var1) {
		if (var0 < 0) {
			return false;
		} else {
			int var2 = GameClient.anIntArray2999[var0];
			if (var2 >= 2000) {
				var2 -= 2000;
			}

			return var2 == 1007;
		}
	}

	Class117_Sub5(int var1, int var2, int var3) {
		anInt1755 = (anInt1736 = var1 * -1807869281) * -532154457;
		anInt1734 = var2 * 2121624233;
		anInt1735 = var3 * -895403129;
	}

	protected static void method1936(int var0, String var1, Color var2, boolean var3, byte var4) {
		try {
			Graphics var5 = Class91.aCanvas1085.getGraphics();
			if (Class117_Sub22_Sub18_Sub6.aFont2755 == null) {
				Class117_Sub22_Sub18_Sub6.aFont2755 = new Font("Helvetica", 1, 13);
				Class31.aFontMetrics400 = Class91.aCanvas1085.getFontMetrics(Class117_Sub22_Sub18_Sub6.aFont2755);
			}

			if (var3) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, Class80.anInt952 * 1566500665, Class117_Sub22_Sub18_Sub2.anInt2613 * 1325743505);
			}

			if (var2 == null) {
				var2 = new Color(140, 17, 17);
			}

			try {
				if (Class117_Sub22_Sub15.anImage2451 == null) {
					Class117_Sub22_Sub15.anImage2451 = Class91.aCanvas1085.createImage(304, 34);
				}

				Graphics var6 = Class117_Sub22_Sub15.anImage2451.getGraphics();
				var6.setColor(var2);
				var6.drawRect(0, 0, 303, 33);
				var6.fillRect(2, 2, var0 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(1, 1, 301, 31);
				var6.fillRect(2 + var0 * 3, 2, 300 - var0 * 3, 30);
				var6.setFont(Class117_Sub22_Sub18_Sub6.aFont2755);
				var6.setColor(Color.white);
				var6.drawString(var1, (304 - Class31.aFontMetrics400.stringWidth(var1)) / 2, 22);
				var5.drawImage(Class117_Sub22_Sub15.anImage2451, Class80.anInt952 * 1566500665 / 2 - 152, Class117_Sub22_Sub18_Sub2.anInt2613 * 1325743505 / 2 - 18, (ImageObserver) null);
			} catch (Exception var9) {
				int var7 = Class80.anInt952 * 1566500665 / 2 - 152;
				int var8 = Class117_Sub22_Sub18_Sub2.anInt2613 * 1325743505 / 2 - 18;
				var5.setColor(var2);
				var5.drawRect(var7, var8, 303, 33);
				var5.fillRect(2 + var7, 2 + var8, var0 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(1 + var7, 1 + var8, 301, 31);
				var5.fillRect(var0 * 3 + 2 + var7, var8 + 2, 300 - var0 * 3, 30);
				var5.setFont(Class117_Sub22_Sub18_Sub6.aFont2755);
				var5.setColor(Color.white);
				var5.drawString(var1, var7 + (304 - Class31.aFontMetrics400.stringWidth(var1)) / 2, 22 + var8);
			}
		} catch (Exception var10) {
			Class91.aCanvas1085.repaint();
		}

	}

}
