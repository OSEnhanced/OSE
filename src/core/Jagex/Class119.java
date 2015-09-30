package core.Jagex;
public final class Class119 {

	Class117_Sub22 aClass117_Sub22_1509 = new Class117_Sub22();

	public void method1555(Class117_Sub22 var1) {
		if (var1.aClass117_Sub22_2132 != null) {
			var1.method2339();
		}

		var1.aClass117_Sub22_2132 = aClass117_Sub22_1509.aClass117_Sub22_2132;
		var1.aClass117_Sub22_2133 = aClass117_Sub22_1509;
		var1.aClass117_Sub22_2132.aClass117_Sub22_2133 = var1;
		var1.aClass117_Sub22_2133.aClass117_Sub22_2132 = var1;
	}

	public void method1556(Class117_Sub22 var1) {
		if (var1.aClass117_Sub22_2132 != null) {
			var1.method2339();
		}

		var1.aClass117_Sub22_2132 = aClass117_Sub22_1509;
		var1.aClass117_Sub22_2133 = aClass117_Sub22_1509.aClass117_Sub22_2133;
		var1.aClass117_Sub22_2132.aClass117_Sub22_2133 = var1;
		var1.aClass117_Sub22_2133.aClass117_Sub22_2132 = var1;
	}

	Class117_Sub22 method1557() {
		Class117_Sub22 var1 = aClass117_Sub22_1509.aClass117_Sub22_2133;
		if (var1 == aClass117_Sub22_1509) {
			return null;
		} else {
			var1.method2339();
			return var1;
		}
	}

	public Class117_Sub22 method1558() {
		Class117_Sub22 var1 = aClass117_Sub22_1509.aClass117_Sub22_2133;
		return var1 == aClass117_Sub22_1509 ? null : var1;
	}

	public Class119() {
		aClass117_Sub22_1509.aClass117_Sub22_2133 = aClass117_Sub22_1509;
		aClass117_Sub22_1509.aClass117_Sub22_2132 = aClass117_Sub22_1509;
	}

	void method1565() {
		while (true) {
			Class117_Sub22 var1 = aClass117_Sub22_1509.aClass117_Sub22_2133;
			if (var1 == aClass117_Sub22_1509) {
				return;
			}

			var1.method2339();
		}
	}

}
