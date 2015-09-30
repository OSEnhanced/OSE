package core.Jagex;
public class Class99 {

	public static final int anInt1136 = 53;
	static byte[][][] aByteArrayArrayArray1138;
	static final int anInt1140 = 5;
	static int anInt1141;
	static char[] aCharArray1139 = new char[64];
	static char[] aCharArray1135;
	static int[] anIntArray1137;

	static {
		int var0;
		for (var0 = 0; var0 < 26; var0++) {
			aCharArray1139[var0] = (char) (65 + var0);
		}

		for (var0 = 26; var0 < 52; var0++) {
			aCharArray1139[var0] = (char) (97 + var0 - 26);
		}

		for (var0 = 52; var0 < 62; var0++) {
			aCharArray1139[var0] = (char) (var0 + 48 - 52);
		}

		aCharArray1139[62] = 43;
		aCharArray1139[63] = 47;
		aCharArray1135 = new char[64];

		for (var0 = 0; var0 < 26; var0++) {
			aCharArray1135[var0] = (char) (var0 + 65);
		}

		for (var0 = 26; var0 < 52; var0++) {
			aCharArray1135[var0] = (char) (97 + var0 - 26);
		}

		for (var0 = 52; var0 < 62; var0++) {
			aCharArray1135[var0] = (char) (48 + var0 - 52);
		}

		aCharArray1135[62] = 42;
		aCharArray1135[63] = 45;
		anIntArray1137 = new int[128];

		for (var0 = 0; var0 < anIntArray1137.length; var0++) {
			anIntArray1137[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; var0++) {
			anIntArray1137[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; var0++) {
			anIntArray1137[var0] = 26 + (var0 - 97);
		}

		for (var0 = 48; var0 <= 57; var0++) {
			anIntArray1137[var0] = 52 + (var0 - 48);
		}

		int[] var2 = anIntArray1137;
		anIntArray1137[43] = 62;
		var2[42] = 62;
		int[] var1 = anIntArray1137;
		anIntArray1137[47] = 63;
		var1[45] = 63;
	}

	Class99() throws Throwable {
		throw new Error();
	}

}
