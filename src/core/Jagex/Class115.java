package core.Jagex;
public final class Class115 {

	int anInt1499;
	Class117_Sub22 aClass117_Sub22_1500 = new Class117_Sub22();
	Class119 aClass119_1501 = new Class119();
	int anInt1497;
	Class127 aClass127_1498;

	public Class117_Sub22 method1515(long var1) {
		Class117_Sub22 var3 = (Class117_Sub22) aClass127_1498.method1675(var1);
		if (var3 != null) {
			aClass119_1501.method1555(var3);
		}

		return var3;
	}

	public void method1517(Class117_Sub22 var1, long var2) {
		if (anInt1499 != 0) {
			--anInt1499;
		} else {
			Class117_Sub22 var4 = aClass119_1501.method1557();
			var4.method1532();
			var4.method2339();
			if (var4 == aClass117_Sub22_1500) {
				var4 = aClass119_1501.method1557();
				var4.method1532();
				var4.method2339();
			}
		}

		aClass127_1498.method1666(var1, var2);
		aClass119_1501.method1555(var1);
	}

	public void method1518() {
		aClass119_1501.method1565();
		aClass127_1498.method1667();
		aClass117_Sub22_1500 = new Class117_Sub22();
		anInt1499 = anInt1497;
	}

	public void method1519(long var1) {
		Class117_Sub22 var3 = (Class117_Sub22) aClass127_1498.method1675(var1);
		if (var3 != null) {
			var3.method1532();
			var3.method2339();
			++anInt1499;
		}

	}

	public Class115(int var1) {
		anInt1497 = var1;
		anInt1499 = var1;

		int var2;
		for (var2 = 1; var2 + var2 < var1; var2 += var2) {
			;
		}

		aClass127_1498 = new Class127(var2);
	}

}
