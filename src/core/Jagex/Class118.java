package core.Jagex;
import java.util.Iterator;

public final class Class118 implements Iterable {

	Class117 aClass117_1506;
	int anInt1507;
	Class117[] aClass117Array1508;

	public Class117 method1540(long var1) {
		Class117 var3 = aClass117Array1508[(int) (var1 & (long) (anInt1507 - 1))];

		for (aClass117_1506 = var3.aClass117_1504; aClass117_1506 != var3; aClass117_1506 = aClass117_1506.aClass117_1504) {
			if (aClass117_1506.aLong1503 == var1) {
				Class117 var4 = aClass117_1506;
				aClass117_1506 = aClass117_1506.aClass117_1504;
				return var4;
			}
		}

		aClass117_1506 = null;
		return null;
	}

	public void method1542() {
		for (int var1 = 0; var1 < anInt1507; var1++) {
			Class117 var2 = aClass117Array1508[var1];

			while (true) {
				Class117 var3 = var2.aClass117_1504;
				if (var3 == var2) {
					break;
				}

				var3.method1532();
			}
		}

		aClass117_1506 = null;
	}

	public void method1544(Class117 var1, long var2) {
		if (var1.aClass117_1505 != null) {
			var1.method1532();
		}

		Class117 var4 = aClass117Array1508[(int) (var2 & (long) (anInt1507 - 1))];
		var1.aClass117_1505 = var4.aClass117_1505;
		var1.aClass117_1504 = var4;
		var1.aClass117_1505.aClass117_1504 = var1;
		var1.aClass117_1504.aClass117_1505 = var1;
		var1.aLong1503 = var2;
	}

	public Class118(int var1) {
		anInt1507 = var1;
		aClass117Array1508 = new Class117[var1];

		for (int var3 = 0; var3 < var1; var3++) {
			Class117 var2 = aClass117Array1508[var3] = new Class117();
			var2.aClass117_1504 = var2;
			var2.aClass117_1505 = var2;
		}

	}

	public Iterator iterator() {
		return new Class111(this);
	}

}
