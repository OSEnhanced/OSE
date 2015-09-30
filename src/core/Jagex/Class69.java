package core.Jagex;
public class Class69 {

	static final int anInt848 = 69;
	static Class46 aClass46_851;
	public static final int anInt852 = 146;
	static final int anInt853 = 14;
	static Class69 aClass69_847 = new Class69(0);
	public static Class69 aClass69_850 = new Class69(1);
	static Class69 aClass69_846 = new Class69(2);
	public int anInt849;

	Class69(int var1) {
		anInt849 = var1 * 1530248677;
	}

	static void method967(Class117_Sub19 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (GameClient.aBool3002) {
			GameClient.anInt3003 = -1537141472;
		} else {
			GameClient.anInt3003 = 0;
		}

		GameClient.aBool3002 = false;
		int var8;
		if (Class75.anInt911 * -1760033137 == 1 || !Class95.aBool1107 && Class75.anInt911 * -1760033137 == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.anInt2060 -= 1181743340;
				Class54.method850(var0, (byte) 0);
			} else if (var5 >= var1 && var5 < 16 + var1 && var6 >= var3 + var2 - 16 && var6 < var2 + var3) {
				var0.anInt2060 += 1181743340;
				Class54.method850(var0, (byte) 0);
			} else if (var5 >= var1 - GameClient.anInt3003 * -1800004711 && var5 < var1 + 16 + GameClient.anInt3003 * -1800004711 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var8 = (var3 - 32) * var3 / var4;
				if (var8 < 8) {
					var8 = 8;
				}

				int var9 = var6 - var2 - 16 - var8 / 2;
				int var10 = var3 - 32 - var8;
				var0.anInt2060 = var9 * (var4 - var3) / var10 * -1852047813;
				Class54.method850(var0, (byte) 0);
				GameClient.aBool3002 = true;
			}
		}

		if (GameClient.anInt3117 * -1257555397 != 0) {
			var8 = var0.anInt1988 * 1854643179;
			if (var5 >= var1 - var8 && var6 >= var2 && var5 < var1 + 16 && var6 <= var2 + var3) {
				var0.anInt2060 += GameClient.anInt3117 * 1172057061;
				Class54.method850(var0, (byte) 0);
			}
		}

	}

	static String[] method968(String[] var0, short var1) {
		String[] var2 = new String[5];

		for (int var3 = 0; var3 < 5; var3++) {
			var2[var3] = var3 + ": ";
			if (var0 != null && var0[var3] != null) {
				var2[var3] = var2[var3] + var0[var3];
			}
		}

		return var2;
	}

}
