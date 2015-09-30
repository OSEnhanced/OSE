package core.Jagex;
import java.awt.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class83_Sub1 extends Class83 implements MouseWheelListener {

	int anInt1896 = 0;

	public void method1121(Component var1, int var2) {
		var1.addMouseWheelListener(this);
	}

	public void method1122(Component var1, int var2) {
		var1.removeMouseWheelListener(this);
	}

	public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
		anInt1896 += var1.getWheelRotation() * 269301323;
	}

	public synchronized int method1123(int var1) {
		int var2 = anInt1896 * 831480675;
		anInt1896 = 0;
		return var2;
	}

}
