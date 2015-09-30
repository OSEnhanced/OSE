package core.Jagex;
public class Class76 {

	static int anInt916;
	public static final byte aByte917 = 2;
	public static final byte aByte918 = 1;
	public static final int anInt919 = 22;
	public static final int anInt920 = 191;

	static int method1042(Class106 var0, Class106 var1, int var2) {
		int var3 = 0;
		if (var0.method1405("title.jpg", "", (byte) 20)) {
			++var3;
		}

		if (var1.method1405("logo", "", (byte) -101)) {
			++var3;
		}

		if (var1.method1405("titlebox", "", (byte) 37)) {
			++var3;
		}

		if (var1.method1405("titlebutton", "", (byte) -42)) {
			++var3;
		}

		if (var1.method1405("runes", "", (byte) 115)) {
			++var3;
		}

		if (var1.method1405("title_mute", "", (byte) -40)) {
			++var3;
		}

		if (var1.method1394("options_radio_buttons,0", (byte) 52)) {
			++var3;
		}

		if (var1.method1394("options_radio_buttons,2", (byte) 64)) {
			++var3;
		}

		var1.method1405("sl_back", "", (byte) 25);
		var1.method1405("sl_flags", "", (byte) 88);
		var1.method1405("sl_arrows", "", (byte) 17);
		var1.method1405("sl_stars", "", (byte) 30);
		var1.method1405("sl_button", "", (byte) 65);
		return var3;
	}

	Class76() throws Throwable {
		throw new Error();
	}

}
