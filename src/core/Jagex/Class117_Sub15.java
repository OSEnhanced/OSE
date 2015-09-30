package core.Jagex;
public class Class117_Sub15 extends Class117 {

	public static final int anInt1897 = 255;
	int anInt1898;
	Class88 aClass88_1899;
	Class106_Sub1 aClass106_Sub1_1900;
	static Class117_Sub22_Sub17_Sub2 aClass117_Sub22_Sub17_Sub2_1901;
	public static final int anInt1902 = 187;
	byte[] aByteArray1903;

	static void method2222(Class117_Sub22_Sub18_Sub1 var0, int var1) {
		if (var0.anInt2549 * -242447087 != 0) {
			if (var0.anInt2565 * -771439697 != -1) {
				Object var3 = null;
				if (var0.anInt2565 * -771439697 < 32768) {
					var3 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub1Array2942[var0.anInt2565 * -771439697];
				} else if (var0.anInt2565 * -771439697 >= 32768) {
					var3 = GameClient.aClass117_Sub22_Sub18_Sub1_Sub2Array3041[var0.anInt2565 * -771439697 - 32768];
				}

				if (var3 != null) {
					int var2 = var0.anInt2577 * 1961555871 - ((Class117_Sub22_Sub18_Sub1) var3).anInt2577 * 1961555871;
					int var4 = var0.anInt2567 * -184603173 - ((Class117_Sub22_Sub18_Sub1) var3).anInt2567 * -184603173;
					if (var2 != 0 || var4 != 0) {
						var0.anInt2590 = ((int) (Math.atan2((double) var2, (double) var4) * 325.949D) & 2047) * -1516112469;
					}
				} else if (var0.aBool2566) {
					var0.anInt2565 = 983534769;
					var0.aBool2566 = false;
				}
			}

			if (var0.anInt2592 * -1249762801 != -1 && (var0.anInt2593 * 1000346769 == 0 || var0.anInt2597 * -430254287 > 0)) {
				var0.anInt2590 = var0.anInt2592 * -554427643;
				var0.anInt2592 = -184454383;
			}

			int var6 = var0.anInt2590 * 965827843 - var0.anInt2542 * 240902973 & 2047;
			if (var6 == 0 && var0.aBool2566) {
				var0.anInt2565 = 983534769;
				var0.aBool2566 = false;
			}

			if (var6 != 0) {
				var0.anInt2591 += 2121050141;
				boolean var5;
				if (var6 > 1024) {
					var0.anInt2542 -= var0.anInt2549 * -654188955;
					var5 = true;
					if (var6 < var0.anInt2549 * -242447087 || var6 > 2048 - var0.anInt2549 * -242447087) {
						var0.anInt2542 = var0.anInt2590 * 1725515071;
						var5 = false;
					}

					if (var0.anInt2568 * -2098720445 == var0.anInt2544 * 1732563927 && (var0.anInt2591 * 1800624693 > 25 || var5)) {
						if (var0.anInt2595 * -1906177709 != -1) {
							var0.anInt2568 = var0.anInt2595 * -1932337487;
						} else {
							var0.anInt2568 = var0.anInt2548 * -730711491;
						}
					}
				} else {
					var0.anInt2542 += var0.anInt2549 * -654188955;
					var5 = true;
					if (var6 < var0.anInt2549 * -242447087 || var6 > 2048 - var0.anInt2549 * -242447087) {
						var0.anInt2542 = var0.anInt2590 * 1725515071;
						var5 = false;
					}

					if (var0.anInt2544 * 1732563927 == var0.anInt2568 * -2098720445 && (var0.anInt2591 * 1800624693 > 25 || var5)) {
						if (var0.anInt2547 * -115888443 != -1) {
							var0.anInt2568 = var0.anInt2547 * 2023578455;
						} else {
							var0.anInt2568 = var0.anInt2548 * -730711491;
						}
					}
				}

				var0.anInt2542 = (var0.anInt2542 * 240902973 & 2047) * -905606123;
			} else {
				var0.anInt2591 = 0;
			}

		}
	}

}
