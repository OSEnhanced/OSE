package core.Jagex;
import java.io.EOFException;
import java.io.IOException;

public final class Class88 {

	static final int anInt1026 = 25;
	protected static Class73 aClass73_1028;
	public static final int anInt1029 = 57;
	public static final int anInt1030 = 4;
	static final int anInt1031 = 64;
	Class145 aClass145_1023 = null;
	Class145 aClass145_1025 = null;
	int anInt1027 = 1491077048;
	int anInt1024;
	static byte[] aByteArray1032 = new byte[520];

	public byte[] method1145(int var1, int var2) {
		Class145 var3 = aClass145_1023;
		synchronized (var3) {
			try {
				if (aClass145_1025.method1804(-826609470) < (long) (var1 * 6 + 6)) {
					return null;
				} else {
					aClass145_1025.method1827((long) (var1 * 6));
					aClass145_1025.method1802(aByteArray1032, 0, 6, 132574400);
					int var4 = (aByteArray1032[2] & 255) + ((aByteArray1032[0] & 255) << 16) + ((aByteArray1032[1] & 255) << 8);
					int var5 = ((aByteArray1032[4] & 255) << 8) + ((aByteArray1032[3] & 255) << 16) + (aByteArray1032[5] & 255);
					if (var4 < 0 || var4 > anInt1027 * 1497132011) {
						return null;
					} else if (var5 <= 0 || (long) var5 > aClass145_1023.method1804(732354549) / 520L) {
						return null;
					} else {
						byte[] var6 = new byte[var4];
						int var7 = 0;

						for (int var8 = 0; var7 < var4; var8++) {
							if (var5 == 0) {
								return null;
							}

							aClass145_1023.method1827((long) (var5 * 520));
							int var9 = var4 - var7;
							if (var9 > 512) {
								var9 = 512;
							}

							aClass145_1023.method1802(aByteArray1032, 0, var9 + 8, -731597007);
							int var10 = (aByteArray1032[1] & 255) + ((aByteArray1032[0] & 255) << 8);
							int var11 = ((aByteArray1032[2] & 255) << 8) + (aByteArray1032[3] & 255);
							int var12 = ((aByteArray1032[4] & 255) << 16) + ((aByteArray1032[5] & 255) << 8) + (aByteArray1032[6] & 255);
							int var13 = aByteArray1032[7] & 255;
							if (var1 != var10 || var8 != var11 || var13 != anInt1024 * 2019056303) {
								return null;
							}

							if (var12 < 0 || (long) var12 > aClass145_1023.method1804(-1123517722) / 520L) {
								return null;
							}

							for (int var14 = 0; var14 < var9; var14++) {
								var6[var7++] = aByteArray1032[8 + var14];
							}

							var5 = var12;
						}

						byte[] var10000 = var6;
						return var10000;
					}
				}
			} catch (IOException var16) {
				return null;
			}
		}
	}

	public boolean method1147(int var1, byte[] var2, int var3, byte var4) {
		Class145 var5 = aClass145_1023;
		synchronized (var5) {
			if (var3 >= 0 && var3 <= anInt1027 * 1497132011) {
				boolean var6 = method1148(var1, var2, var3, true, 1784145118);
				if (!var6) {
					var6 = method1148(var1, var2, var3, false, 1784145118);
				}

				return var6;
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	boolean method1148(int var1, byte[] var2, int var3, boolean var4, int var5) {
		Class145 var6 = aClass145_1023;
		synchronized (var6) {
			boolean var10000;
			try {
				int var7;
				if (var4) {
					if (aClass145_1025.method1804(-1016418072) < (long) (6 + var1 * 6)) {
						return false;
					}

					aClass145_1025.method1827((long) (var1 * 6));
					aClass145_1025.method1802(aByteArray1032, 0, 6, -1283929450);
					var7 = (aByteArray1032[5] & 255) + ((aByteArray1032[3] & 255) << 16) + ((aByteArray1032[4] & 255) << 8);
					if (var7 <= 0 || (long) var7 > aClass145_1023.method1804(-1215373551) / 520L) {
						return false;
					}
				} else {
					var7 = (int) ((aClass145_1023.method1804(862491427) + 519L) / 520L);
					if (var7 == 0) {
						var7 = 1;
					}
				}

				aByteArray1032[0] = (byte) (var3 >> 16);
				aByteArray1032[1] = (byte) (var3 >> 8);
				aByteArray1032[2] = (byte) var3;
				aByteArray1032[3] = (byte) (var7 >> 16);
				aByteArray1032[4] = (byte) (var7 >> 8);
				aByteArray1032[5] = (byte) var7;
				aClass145_1025.method1827((long) (var1 * 6));
				aClass145_1025.method1813(aByteArray1032, 0, 6, -1763139035);
				int var8 = 0;

				for (int var9 = 0; var8 < var3; var9++) {
					int var10 = 0;
					int var11;
					if (var4) {
						aClass145_1023.method1827((long) (var7 * 520));

						try {
							aClass145_1023.method1802(aByteArray1032, 0, 8, -1184722265);
						} catch (EOFException var15) {
							break;
						}

						var11 = (aByteArray1032[1] & 255) + ((aByteArray1032[0] & 255) << 8);
						int var12 = ((aByteArray1032[2] & 255) << 8) + (aByteArray1032[3] & 255);
						var10 = (aByteArray1032[6] & 255) + ((aByteArray1032[5] & 255) << 8) + ((aByteArray1032[4] & 255) << 16);
						int var13 = aByteArray1032[7] & 255;
						if (var1 != var11 || var9 != var12 || var13 != anInt1024 * 2019056303) {
							return false;
						}

						if (var10 < 0 || (long) var10 > aClass145_1023.method1804(417765118) / 520L) {
							return false;
						}
					}

					if (var10 == 0) {
						var4 = false;
						var10 = (int) ((aClass145_1023.method1804(759582009) + 519L) / 520L);
						if (var10 == 0) {
							++var10;
						}

						if (var10 == var7) {
							++var10;
						}
					}

					if (var3 - var8 <= 512) {
						var10 = 0;
					}

					aByteArray1032[0] = (byte) (var1 >> 8);
					aByteArray1032[1] = (byte) var1;
					aByteArray1032[2] = (byte) (var9 >> 8);
					aByteArray1032[3] = (byte) var9;
					aByteArray1032[4] = (byte) (var10 >> 16);
					aByteArray1032[5] = (byte) (var10 >> 8);
					aByteArray1032[6] = (byte) var10;
					aByteArray1032[7] = (byte) (anInt1024 * 2019056303);
					aClass145_1023.method1827((long) (var7 * 520));
					aClass145_1023.method1813(aByteArray1032, 0, 8, -1763139035);
					var11 = var3 - var8;
					if (var11 > 512) {
						var11 = 512;
					}

					aClass145_1023.method1813(var2, var8, var11, -1763139035);
					var8 += var11;
					var7 = var10;
				}

				var10000 = true;
			} catch (IOException var16) {
				return false;
			}

			return var10000;
		}
	}

	public Class88(int var1, Class145 var2, Class145 var3, int var4) {
		anInt1024 = var1 * 49626191;
		aClass145_1023 = var2;
		aClass145_1025 = var3;
		anInt1027 = var4 * -336173885;
	}

}
