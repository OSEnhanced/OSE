package core.Jagex;
public class Class138 {

	public static int anInt1620;
	static Class117_Sub22_Sub17_Sub2[] aClass117_Sub22_Sub17_Sub2Array1621;
	public static final int anInt1622 = 0;
	public static Class126 aClass126_1623 = new Class126();

	Class138() throws Throwable {
		throw new Error();
	}

	static char method1747(char var0, int var1) {
		switch (var0) {
			case ' ':
			case '-':
			case '_':
			case '\u00a0':
				return '_';
			case '#':
			case '[':
			case ']':
				return var0;
			case '\u00c0':
			case '\u00c1':
			case '\u00c2':
			case '\u00c3':
			case '\u00c4':
			case '\u00e0':
			case '\u00e1':
			case '\u00e2':
			case '\u00e3':
			case '\u00e4':
				return 'a';
			case '\u00c7':
			case '\u00e7':
				return 'c';
			case '\u00c8':
			case '\u00c9':
			case '\u00ca':
			case '\u00cb':
			case '\u00e8':
			case '\u00e9':
			case '\u00ea':
			case '\u00eb':
				return 'e';
			case '\u00cd':
			case '\u00ce':
			case '\u00cf':
			case '\u00ed':
			case '\u00ee':
			case '\u00ef':
				return 'i';
			case '\u00d1':
			case '\u00f1':
				return 'n';
			case '\u00d2':
			case '\u00d3':
			case '\u00d4':
			case '\u00d5':
			case '\u00d6':
			case '\u00f2':
			case '\u00f3':
			case '\u00f4':
			case '\u00f5':
			case '\u00f6':
				return 'o';
			case '\u00d9':
			case '\u00da':
			case '\u00db':
			case '\u00dc':
			case '\u00f9':
			case '\u00fa':
			case '\u00fb':
			case '\u00fc':
				return 'u';
			case '\u00df':
				return 'b';
			case '\u00ff':
			case 376:
				return 'y';
			default:
				return Character.toLowerCase(var0);
		}
	}

}
