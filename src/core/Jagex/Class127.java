package core.Jagex;
public final class Class127 {

	Class117 aClass117_1553;
	Class117 aClass117_1551;
	int anInt1555 = 0;
	int anInt1554;
	Class117[] aClass117Array1552;

	public void method1666(Class117 var1, long var2) {
		if (var1.aClass117_1505 != null) {
			var1.method1532();
		}

		Class117 var4 = aClass117Array1552[(int) (var2 & (long) (anInt1554 - 1))];
		var1.aClass117_1505 = var4.aClass117_1505;
		var1.aClass117_1504 = var4;
		var1.aClass117_1505.aClass117_1504 = var1;
		var1.aClass117_1504.aClass117_1505 = var1;
		var1.aLong1503 = var2;
	}

	void method1667() {
		for (int var1 = 0; var1 < anInt1554; var1++) {
			Class117 var3 = aClass117Array1552[var1];

			while (true) {
				Class117 var2 = var3.aClass117_1504;
				if (var2 == var3) {
					break;
				}

				var2.method1532();
			}
		}

		aClass117_1553 = null;
		aClass117_1551 = null;
	}

	public Class117 method1668() {
		anInt1555 = 0;
		return method1669();
	}

	public Class117 method1669() {
		Class117 var1;
		if (anInt1555 > 0 && aClass117_1551 != aClass117Array1552[anInt1555 - 1]) {
			var1 = aClass117_1551;
			aClass117_1551 = var1.aClass117_1504;
			return var1;
		} else {
			do {
				if (anInt1555 >= anInt1554) {
					return null;
				}

				var1 = aClass117Array1552[anInt1555++].aClass117_1504;
			} while (var1 == aClass117Array1552[anInt1555 - 1]);

			aClass117_1551 = var1.aClass117_1504;
			return var1;
		}
	}

	public Class117 method1675(long var1) {
		Class117 var3 = aClass117Array1552[(int) (var1 & (long) (anInt1554 - 1))];

		for (aClass117_1553 = var3.aClass117_1504; aClass117_1553 != var3; aClass117_1553 = aClass117_1553.aClass117_1504) {
			if (aClass117_1553.aLong1503 == var1) {
				Class117 var4 = aClass117_1553;
				aClass117_1553 = aClass117_1553.aClass117_1504;
				return var4;
			}
		}

		aClass117_1553 = null;
		return null;
	}

	public Class127(int var1) {
		anInt1554 = var1;
		aClass117Array1552 = new Class117[var1];

		for (int var2 = 0; var2 < var1; var2++) {
			Class117 var3 = aClass117Array1552[var2] = new Class117();
			var3.aClass117_1504 = var3;
			var3.aClass117_1505 = var3;
		}

	}

}
