package core.Jagex;
public class Class5 {

	static Class5 aClass5_53 = new Class5();
	static Class5 aClass5_54 = new Class5();
	static Class5 aClass5_56 = new Class5();
	static Class5 aClass5_55 = new Class5();

	public static int method87(CharSequence var0, int var1, boolean var2, int var3) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var5 = false;
			boolean var10 = false;
			int var6 = 0;
			int var7 = var0.length();

			for (int var4 = 0; var4 < var7; var4++) {
				char var8 = var0.charAt(var4);
				if (var4 == 0) {
					if (var8 == 45) {
						var5 = true;
						continue;
					}

					if (var8 == 43 && var2) {
						continue;
					}
				}

				int var11;
				if (var8 >= 48 && var8 <= 57) {
					var11 = var8 - 48;
				} else if (var8 >= 65 && var8 <= 90) {
					var11 = var8 - 55;
				} else {
					if (var8 < 97 || var8 > 122) {
						throw new NumberFormatException();
					}

					var11 = var8 - 87;
				}

				if (var11 >= var1) {
					throw new NumberFormatException();
				}

				if (var5) {
					var11 = -var11;
				}

				int var9 = var1 * var6 + var11;
				if (var9 / var1 != var6) {
					throw new NumberFormatException();
				}

				var6 = var9;
				var10 = true;
			}

			if (!var10) {
				throw new NumberFormatException();
			} else {
				return var6;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	public static boolean method88(int var0, int var1) {
		return (var0 >> 20 & 1) != 0;
	}

}
