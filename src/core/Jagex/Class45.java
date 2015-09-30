package core.Jagex;
import java.net.MalformedURLException;
import java.net.URL;

public final class Class45 {

	int anInt598;
	static int anInt599;
	int anInt600;
	int anInt601;
	static final int anInt602 = 51;
	int anInt603;
	int anInt604;
	int anInt605;
	int anInt606;
	int anInt607;
	int anInt608;
	int anInt609;
	static int anInt610;
	int anInt611;
	int anInt612;
	int anInt613;
	int anInt614;
	int anInt615;
	int anInt616;
	int anInt617;
	int anInt618;

	static boolean method738(String var0, byte var1) {
		if (var0 == null) {
			return false;
		} else {
			try {
				new URL(var0);
				return true;
			} catch (MalformedURLException var3) {
				return false;
			}
		}
	}

	static void method739(Class117_Sub19 var0, int var1, int var2, byte var3) {
		if (var0.anInt1978 * -92066971 == 0) {
			var0.anInt2104 = var0.anInt2026 * 1498779311;
		} else if (var0.anInt1978 * -92066971 == 1) {
			var0.anInt2104 = ((var1 - var0.anInt1988 * 1854643179) / 2 + var0.anInt2026 * -627192833) * 1765014865;
		} else if (var0.anInt1978 * -92066971 == 2) {
			var0.anInt2104 = (var1 - var0.anInt1988 * 1854643179 - var0.anInt2026 * -627192833) * 1765014865;
		} else if (var0.anInt1978 * -92066971 == 3) {
			var0.anInt2104 = (var0.anInt2026 * -627192833 * var1 >> 14) * 1765014865;
		} else if (var0.anInt1978 * -92066971 != 4) {
			var0.anInt2104 = (var1 - var0.anInt1988 * 1854643179 - (var1 * var0.anInt2026 * -627192833 >> 14)) * 1765014865;
		} else {
			var0.anInt2104 = ((var1 * var0.anInt2026 * -627192833 >> 14) + (var1 - var0.anInt1988 * 1854643179) / 2) * 1765014865;
		}

		if (var0.anInt2048 * -1843003587 == 0) {
			var0.anInt1987 = var0.anInt1983 * -436285223;
		} else if (var0.anInt2048 * -1843003587 == 1) {
			var0.anInt1987 = (var0.anInt1983 * 1272023551 + (var2 - var0.anInt1989 * 2747837) / 2) * 2122265895;
		} else if (var0.anInt2048 * -1843003587 == 2) {
			var0.anInt1987 = (var2 - var0.anInt1989 * 2747837 - var0.anInt1983 * 1272023551) * 2122265895;
		} else if (var0.anInt2048 * -1843003587 == 3) {
			var0.anInt1987 = (var2 * var0.anInt1983 * 1272023551 >> 14) * 2122265895;
		} else if (var0.anInt2048 * -1843003587 == 4) {
			var0.anInt1987 = ((var2 * var0.anInt1983 * 1272023551 >> 14) + (var2 - var0.anInt1989 * 2747837) / 2) * 2122265895;
		} else {
			var0.anInt1987 = (var2 - var0.anInt1989 * 2747837 - (var0.anInt1983 * 1272023551 * var2 >> 14)) * 2122265895;
		}

		if (GameClient.aBool3072 && var0.anInt1975 * 657737235 == 0) {
			if (var0.anInt2104 * -165844047 < 0) {
				var0.anInt2104 = 0;
			} else if (var0.anInt1988 * 1854643179 + var0.anInt2104 * -165844047 > var1) {
				var0.anInt2104 = (var1 - var0.anInt1988 * 1854643179) * 1765014865;
			}

			if (var0.anInt1987 * 1372514967 < 0) {
				var0.anInt1987 = 0;
			} else if (var0.anInt1989 * 2747837 + var0.anInt1987 * 1372514967 > var2) {
				var0.anInt1987 = (var2 - var0.anInt1989 * 2747837) * 2122265895;
			}
		}

	}

	static void method740(String var0, String var1, String var2, int var3) {
		Class6.aString59 = var0;
		Class6.aString73 = var1;
		Class6.aString74 = var2;
	}

}
