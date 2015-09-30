package core.Jagex;
public final class Class117_Sub22_Sub17_Sub2 extends Class117_Sub22_Sub17 {

	public int anInt2702;
	public int[] anIntArray2704;
	public int anInt2709;
	public byte[] aByteArray2703;
	public int anInt2707;
	public int anInt2705;
	public int anInt2706;
	public int anInt2708;

	public void method3231() {
		if (anInt2707 != anInt2702 || anInt2705 != anInt2709) {
			byte[] var3 = new byte[anInt2702 * anInt2709];
			int var2 = 0;

			for (int var4 = 0; var4 < anInt2705; var4++) {
				for (int var1 = 0; var1 < anInt2707; var1++) {
					var3[var1 + anInt2706 + (var4 + anInt2708) * anInt2702] = aByteArray2703[var2++];
				}
			}

			aByteArray2703 = var3;
			anInt2707 = anInt2702;
			anInt2705 = anInt2709;
			anInt2706 = 0;
			anInt2708 = 0;
		}
	}

	public void method3233(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < anIntArray2704.length; var4++) {
			int var5 = anIntArray2704[var4] >> 16 & 255;
			var5 += var1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = anIntArray2704[var4] >> 8 & 255;
			var6 += var2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = anIntArray2704[var4] & 255;
			var7 += var3;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			anIntArray2704[var4] = (var5 << 16) + (var6 << 8) + var7;
		}

	}

	static void method3234(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var11 = -var6; var11 < 0; var11++) {
			byte var10;
			int var12;
			for (var12 = var9; var12 < 0; var12++) {
				var10 = var1[var3++];
				if (var10 != 0) {
					var0[var4++] = var2[var10 & 255];
				} else {
					++var4;
				}

				var10 = var1[var3++];
				if (var10 != 0) {
					var0[var4++] = var2[var10 & 255];
				} else {
					++var4;
				}

				var10 = var1[var3++];
				if (var10 != 0) {
					var0[var4++] = var2[var10 & 255];
				} else {
					++var4;
				}

				var10 = var1[var3++];
				if (var10 != 0) {
					var0[var4++] = var2[var10 & 255];
				} else {
					++var4;
				}
			}

			for (var12 = var5; var12 < 0; var12++) {
				var10 = var1[var3++];
				if (var10 != 0) {
					var0[var4++] = var2[var10 & 255];
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public void method3239(int var1, int var2) {
		var1 += anInt2706;
		var2 += anInt2708;
		int var5 = var1 + var2 * anInt2462;
		int var7 = 0;
		int var6 = anInt2705;
		int var3 = anInt2707;
		int var8 = anInt2462 - var3;
		int var9 = 0;
		int var4;
		if (var2 < anInt2465) {
			var4 = anInt2465 - var2;
			var6 -= var4;
			var2 = anInt2465;
			var7 += var4 * var3;
			var5 += var4 * anInt2462;
		}

		if (var2 + var6 > anInt2463) {
			var6 -= var2 + var6 - anInt2463;
		}

		if (var1 < anInt2464) {
			var4 = anInt2464 - var1;
			var3 -= var4;
			var1 = anInt2464;
			var7 += var4;
			var5 += var4;
			var9 += var4;
			var8 += var4;
		}

		if (var1 + var3 > anInt2460) {
			var4 = var1 + var3 - anInt2460;
			var3 -= var4;
			var9 += var4;
			var8 += var4;
		}

		if (var3 > 0 && var6 > 0) {
			method3234(anIntArray2459, aByteArray2703, anIntArray2704, var7, var5, var3, var6, var8, var9);
		}
	}

}
