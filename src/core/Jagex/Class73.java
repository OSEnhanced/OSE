package core.Jagex;
public abstract class Class73 {

	public static final int anInt875 = 131;
	public static final int anInt876 = 205;
	static final int anInt877 = 8;
	public static final int anInt878 = 240;

	static int method986(int var0, int var1, byte var2) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1 + (var0 & 65408);
		}
	}

	public abstract void method987(int var1);

	abstract int method988(int var1, int var2, int var3);

}
