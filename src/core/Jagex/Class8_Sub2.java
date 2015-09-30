package core.Jagex;
import java.awt.*;
import java.awt.image.*;
import java.util.Hashtable;

public final class Class8_Sub2 extends Class8 {

	Component aComponent1826;

	public final void method120(int var1, int var2, Component var3, byte var4) {
		anInt105 = var1 * -1665036677;
		anInt108 = var2 * 114327359;
		anIntArray107 = new int[var1 * var2 + 1];
		DataBufferInt var5 = new DataBufferInt(anIntArray107, anIntArray107.length);
		DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(anInt105 * -831643469, anInt108 * -1990528833), var5, (Point) null);
		anImage106 = new BufferedImage(var6, var7, false, new Hashtable());
		aComponent1826 = var3;
		method126(2028794089);
	}

	public final void method123(Graphics var1, int var2, int var3, int var4, int var5, int var6) {
		Shape var7 = var1.getClip();
		var1.clipRect(var2, var3, var4, var5);
		var1.drawImage(anImage106, 0, 0, aComponent1826);
		var1.setClip(var7);
	}

	public final void method122(Graphics var1, int var2, int var3, int var4) {
		var1.drawImage(anImage106, var2, var3, aComponent1826);
	}

}
