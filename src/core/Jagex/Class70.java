package core.Jagex;
public final class Class70 {

	static final int anInt856 = 1020;
	static final int anInt857 = 256;
	static Class28 aClass28_858;
	static final int anInt859 = 8;
	public static final int anInt863 = 13;
	static final int anInt864 = 5;
	int[] anIntArray862 = new int[256];
	int[] anIntArray855 = new int[256];
	int anInt865;
	int anInt854;
	int anInt861;
	int anInt860;

	Class70(int[] var1) {
		for (int var2 = 0; var2 < var1.length; var2++) {
			anIntArray855[var2] = var1[var2];
		}

		method971(-1132602177);
	}

	final void method971(int var1) {
		int var2 = -1640531527;
		int var6 = -1640531527;
		int var5 = -1640531527;
		int var4 = -1640531527;
		int var3 = -1640531527;
		int var8 = -1640531527;
		int var10 = -1640531527;
		int var9 = -1640531527;

		int var7;
		for (var7 = 0; var7 < 4; var7++) {
			var9 ^= var10 << 11;
			var3 += var9;
			var10 += var8;
			var10 ^= var8 >>> 2;
			var4 += var10;
			var8 += var3;
			var8 ^= var3 << 8;
			var5 += var8;
			var3 += var4;
			var3 ^= var4 >>> 16;
			var6 += var3;
			var4 += var5;
			var4 ^= var5 << 10;
			var2 += var4;
			var5 += var6;
			var5 ^= var6 >>> 4;
			var9 += var5;
			var6 += var2;
			var6 ^= var2 << 8;
			var10 += var6;
			var2 += var9;
			var2 ^= var9 >>> 9;
			var8 += var2;
			var9 += var10;
		}

		for (var7 = 0; var7 < 256; var7 += 8) {
			var9 += anIntArray855[var7];
			var10 += anIntArray855[var7 + 1];
			var8 += anIntArray855[2 + var7];
			var3 += anIntArray855[var7 + 3];
			var4 += anIntArray855[var7 + 4];
			var5 += anIntArray855[5 + var7];
			var6 += anIntArray855[var7 + 6];
			var2 += anIntArray855[7 + var7];
			var9 ^= var10 << 11;
			var3 += var9;
			var10 += var8;
			var10 ^= var8 >>> 2;
			var4 += var10;
			var8 += var3;
			var8 ^= var3 << 8;
			var5 += var8;
			var3 += var4;
			var3 ^= var4 >>> 16;
			var6 += var3;
			var4 += var5;
			var4 ^= var5 << 10;
			var2 += var4;
			var5 += var6;
			var5 ^= var6 >>> 4;
			var9 += var5;
			var6 += var2;
			var6 ^= var2 << 8;
			var10 += var6;
			var2 += var9;
			var2 ^= var9 >>> 9;
			var8 += var2;
			var9 += var10;
			anIntArray862[var7] = var9;
			anIntArray862[var7 + 1] = var10;
			anIntArray862[var7 + 2] = var8;
			anIntArray862[3 + var7] = var3;
			anIntArray862[var7 + 4] = var4;
			anIntArray862[5 + var7] = var5;
			anIntArray862[var7 + 6] = var6;
			anIntArray862[7 + var7] = var2;
		}

		for (var7 = 0; var7 < 256; var7 += 8) {
			var9 += anIntArray862[var7];
			var10 += anIntArray862[var7 + 1];
			var8 += anIntArray862[var7 + 2];
			var3 += anIntArray862[var7 + 3];
			var4 += anIntArray862[var7 + 4];
			var5 += anIntArray862[5 + var7];
			var6 += anIntArray862[6 + var7];
			var2 += anIntArray862[7 + var7];
			var9 ^= var10 << 11;
			var3 += var9;
			var10 += var8;
			var10 ^= var8 >>> 2;
			var4 += var10;
			var8 += var3;
			var8 ^= var3 << 8;
			var5 += var8;
			var3 += var4;
			var3 ^= var4 >>> 16;
			var6 += var3;
			var4 += var5;
			var4 ^= var5 << 10;
			var2 += var4;
			var5 += var6;
			var5 ^= var6 >>> 4;
			var9 += var5;
			var6 += var2;
			var6 ^= var2 << 8;
			var10 += var6;
			var2 += var9;
			var2 ^= var9 >>> 9;
			var8 += var2;
			var9 += var10;
			anIntArray862[var7] = var9;
			anIntArray862[1 + var7] = var10;
			anIntArray862[var7 + 2] = var8;
			anIntArray862[3 + var7] = var3;
			anIntArray862[4 + var7] = var4;
			anIntArray862[5 + var7] = var5;
			anIntArray862[6 + var7] = var6;
			anIntArray862[var7 + 7] = var2;
		}

		method979(748722523);
		anInt865 = -1541479168;
	}

	final int method975(int var1) {
		if ((anInt865 += 257679643) * -501911827 + 1 == 0) {
			method979(-397551475);
			anInt865 = -1283799525;
		}

		return anIntArray855[anInt865 * -501911827];
	}

	final void method979(int var1) {
		anInt861 += (anInt854 -= 1647287627) * -299997815;

		for (int var2 = 0; var2 < 256; var2++) {
			int var3 = anIntArray862[var2];
			if ((var2 & 2) == 0) {
				if ((var2 & 1) == 0) {
					anInt860 = (anInt860 * 1863242461 ^ anInt860 * 1863242461 << 13) * -435448459;
				} else {
					anInt860 = (anInt860 * 1863242461 ^ anInt860 * 1863242461 >>> 6) * -435448459;
				}
			} else if ((var2 & 1) == 0) {
				anInt860 = (anInt860 * 1863242461 ^ anInt860 * 1863242461 << 2) * -435448459;
			} else {
				anInt860 = (anInt860 * 1863242461 ^ anInt860 * 1863242461 >>> 16) * -435448459;
			}

			anInt860 += anIntArray862[128 + var2 & 255] * -435448459;
			int var4;
			anIntArray862[var2] = var4 = anInt861 * 411235445 + anInt860 * 1863242461 + anIntArray862[(var3 & 1020) >> 2];
			anIntArray855[var2] = (anInt861 = (anIntArray862[(var4 >> 8 & 1020) >> 2] + var3) * -2102641699) * 411235445;
		}

	}

}
