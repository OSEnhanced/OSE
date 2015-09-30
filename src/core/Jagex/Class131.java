package core.Jagex;
import java.util.Comparator;

final class Class131 implements Comparator {

	protected static boolean aBool1589;

	int method1706(Class133 var1, Class133 var2, byte var3) {
		return var1.method1719((short) 27171).compareTo(var2.method1719((short) 21157));
	}

	public int compare(Object var1, Object var2) {
		return method1706((Class133) var1, (Class133) var2, (byte) 28);
	}

	static void method1708(int var0) {
		int var1 = Class80.anInt952 * 1566500665;
		int var2 = Class117_Sub22_Sub18_Sub2.anInt2613 * 1325743505;
		if (Class14.anInt177 * 715849079 < var1) {
			var1 = Class14.anInt177 * 715849079;
		}

		if (Class117_Sub18.anInt1954 * 910153847 < var2) {
			var2 = Class117_Sub18.anInt1954 * 910153847;
		}

		if (Class117_Sub22_Sub21.aClass33_2499 != null) {
			try {
				Class71.method985(Class92.aGameClient1087, "resize", new Object[]{Integer.valueOf(Class2.method63(-933294830))}, -1418648348);
			} catch (Throwable var4) {
				;
			}
		}

	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

}
