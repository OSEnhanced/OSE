package core.Jagex;
public class Class48 {

	Class117_Sub11 aClass117_Sub11_651 = null;
	int anInt647 = -1;
	boolean aBool654 = false;
	int[] anIntArray650;
	int[] anIntArray649;
	int[] anIntArray652;
	int[] anIntArray653;
	static int[] anIntArray648 = new int[500];
	static int[] anIntArray645 = new int[500];
	static int[] anIntArray646 = new int[500];
	static int[] anIntArray644 = new int[500];

	Class48(byte[] var1, Class117_Sub11 var2) {
		aClass117_Sub11_651 = var2;
		Class117_Sub14 var3 = new Class117_Sub14(var1);
		Class117_Sub14 var10 = new Class117_Sub14(var1);
		var3.anInt1880 = 136532258;
		int var8 = var3.method2010(-1439707937);
		int var6 = -1;
		int var7 = 0;
		var10.anInt1880 = (var3.anInt1880 * 561453169 + var8) * -2079217519;

		int var5;
		for (var5 = 0; var5 < var8; var5++) {
			int var4 = var3.method2010(-1439707937);
			if (var4 > 0) {
				if (aClass117_Sub11_651.anIntArray1847[var5] != 0) {
					for (int var9 = var5 - 1; var9 > var6; --var9) {
						if (aClass117_Sub11_651.anIntArray1847[var9] == 0) {
							anIntArray648[var7] = var9;
							anIntArray645[var7] = 0;
							anIntArray646[var7] = 0;
							anIntArray644[var7] = 0;
							++var7;
							break;
						}
					}
				}

				anIntArray648[var7] = var5;
				short var11 = 0;
				if (aClass117_Sub11_651.anIntArray1847[var5] == 3) {
					var11 = 128;
				}

				if ((var4 & 1) != 0) {
					anIntArray645[var7] = var10.method2056(-1003847421);
				} else {
					anIntArray645[var7] = var11;
				}

				if ((var4 & 2) != 0) {
					anIntArray646[var7] = var10.method2056(-1003847421);
				} else {
					anIntArray646[var7] = var11;
				}

				if ((var4 & 4) == 0) {
					anIntArray644[var7] = var11;
				} else {
					anIntArray644[var7] = var10.method2056(-1003847421);
				}

				var6 = var5;
				++var7;
				if (aClass117_Sub11_651.anIntArray1847[var5] == 5) {
					aBool654 = true;
				}
			}
		}

		if (var10.anInt1880 * 561453169 != var1.length) {
			throw new RuntimeException();
		} else {
			anInt647 = var7;
			anIntArray650 = new int[var7];
			anIntArray649 = new int[var7];
			anIntArray652 = new int[var7];
			anIntArray653 = new int[var7];

			for (var5 = 0; var5 < var7; var5++) {
				anIntArray650[var5] = anIntArray648[var5];
				anIntArray649[var5] = anIntArray645[var5];
				anIntArray652[var5] = anIntArray646[var5];
				anIntArray653[var5] = anIntArray644[var5];
			}

		}
	}

}
