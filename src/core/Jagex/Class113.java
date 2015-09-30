package core.Jagex;
public class Class113 {

	int[] anIntArray1494;

	public int method1509(int var1) {
		int var2 = (anIntArray1494.length >> 1) - 1;
		int var3 = var1 & var2;

		while (true) {
			int var4 = anIntArray1494[var3 + var3 + 1];
			if (var4 == -1) {
				return -1;
			}

			if (anIntArray1494[var3 + var3] == var1) {
				return var4;
			}

			var3 = var3 + 1 & var2;
		}
	}

	public Class113(int[] var1) {
		int var2;
		for (var2 = 1; var2 <= var1.length + (var1.length >> 1); var2 <<= 1) {
			;
		}

		anIntArray1494 = new int[var2 + var2];

		int var4;
		for (var4 = 0; var4 < var2 + var2; var4++) {
			anIntArray1494[var4] = -1;
		}

		int var3;
		for (var4 = 0; var4 < var1.length; anIntArray1494[var3 + var3 + 1] = var4++) {
			for (var3 = var1[var4] & var2 - 1; anIntArray1494[var3 + var3 + 1] != -1; var3 = var3 + 1 & var2 - 1) {
				;
			}

			anIntArray1494[var3 + var3] = var1[var4];
		}

	}

}
