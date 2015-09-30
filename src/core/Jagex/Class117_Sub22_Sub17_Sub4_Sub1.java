package core.Jagex;
public final class Class117_Sub22_Sub17_Sub4_Sub1 extends Class117_Sub22_Sub17_Sub4 {

	final void method3476(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var2 + var3 * anInt2462;
		int var11 = anInt2462 - var4;
		int var9 = 0;
		int var10 = 0;
		int var12;
		if (var3 < anInt2465) {
			var12 = anInt2465 - var3;
			var5 -= var12;
			var3 = anInt2465;
			var10 += var12 * var4;
			var8 += var12 * anInt2462;
		}

		if (var3 + var5 > anInt2463) {
			var5 -= var3 + var5 - anInt2463;
		}

		if (var2 < anInt2464) {
			var12 = anInt2464 - var2;
			var4 -= var12;
			var2 = anInt2464;
			var10 += var12;
			var8 += var12;
			var9 += var12;
			var11 += var12;
		}

		if (var2 + var4 > anInt2460) {
			var12 = var2 + var4 - anInt2460;
			var4 -= var12;
			var9 += var12;
			var11 += var12;
		}

		if (var4 > 0 && var5 > 0) {
			method3475(anIntArray2459, var1, var6, var10, var8, var4, var5, var11, var9, var7);
		}
	}

	public Class117_Sub22_Sub17_Sub4_Sub1(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		super(var1, var2, var3, var4, var5, var6, var7);
	}

	final void method3470(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var2 + var3 * anInt2462;
		int var10 = anInt2462 - var4;
		int var11 = 0;
		int var9 = 0;
		int var8;
		if (var3 < anInt2465) {
			var8 = anInt2465 - var3;
			var5 -= var8;
			var3 = anInt2465;
			var9 += var8 * var4;
			var7 += var8 * anInt2462;
		}

		if (var3 + var5 > anInt2463) {
			var5 -= var3 + var5 - anInt2463;
		}

		if (var2 < anInt2464) {
			var8 = anInt2464 - var2;
			var4 -= var8;
			var2 = anInt2464;
			var9 += var8;
			var7 += var8;
			var11 += var8;
			var10 += var8;
		}

		if (var2 + var4 > anInt2460) {
			var8 = var2 + var4 - anInt2460;
			var4 -= var8;
			var11 += var8;
			var10 += var8;
		}

		if (var4 > 0 && var5 > 0) {
			method3473(anIntArray2459, var1, var6, var9, var7, var4, var5, var10, var11);
		}
	}

	public Class117_Sub22_Sub17_Sub4_Sub1(byte[] var1) {
		super(var1);
	}

}
