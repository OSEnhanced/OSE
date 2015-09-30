package core.Jagex;
public class Class120 {

	Class117 aClass117_1511;
	public Class117 aClass117_1510 = new Class117();

	public Class117 method1573() {
		Class117 var1 = aClass117_1510.aClass117_1505;
		if (var1 == aClass117_1510) {
			aClass117_1511 = null;
			return null;
		} else {
			aClass117_1511 = var1.aClass117_1505;
			return var1;
		}
	}

	public void method1574() {
		while (true) {
			Class117 var1 = aClass117_1510.aClass117_1504;
			if (var1 == aClass117_1510) {
				aClass117_1511 = null;
				return;
			}

			var1.method1532();
		}
	}

	public void method1575(Class117 var1) {
		if (var1.aClass117_1505 != null) {
			var1.method1532();
		}

		var1.aClass117_1505 = aClass117_1510.aClass117_1505;
		var1.aClass117_1504 = aClass117_1510;
		var1.aClass117_1505.aClass117_1504 = var1;
		var1.aClass117_1504.aClass117_1505 = var1;
	}

	public Class117 method1577() {
		Class117 var1 = aClass117_1510.aClass117_1504;
		if (var1 == aClass117_1510) {
			aClass117_1511 = null;
			return null;
		} else {
			aClass117_1511 = var1.aClass117_1504;
			return var1;
		}
	}

	public Class117 method1582() {
		Class117 var1 = aClass117_1511;
		if (var1 == aClass117_1510) {
			aClass117_1511 = null;
			return null;
		} else {
			aClass117_1511 = var1.aClass117_1504;
			return var1;
		}
	}

	public Class117 method1583() {
		Class117 var1 = aClass117_1511;
		if (var1 != aClass117_1510) {
			aClass117_1511 = var1.aClass117_1505;
			return var1;
		} else {
			aClass117_1511 = null;
			return null;
		}
	}

	public static void method1584(Class117 var0, Class117 var1) {
		if (var0.aClass117_1505 != null) {
			var0.method1532();
		}

		var0.aClass117_1505 = var1.aClass117_1505;
		var0.aClass117_1504 = var1;
		var0.aClass117_1505.aClass117_1504 = var0;
		var0.aClass117_1504.aClass117_1505 = var0;
	}

	public Class117 method1585() {
		Class117 var1 = aClass117_1510.aClass117_1505;
		if (var1 == aClass117_1510) {
			return null;
		} else {
			var1.method1532();
			return var1;
		}
	}

	public void method1587(Class117 var1) {
		if (var1.aClass117_1505 != null) {
			var1.method1532();
		}

		var1.aClass117_1505 = aClass117_1510;
		var1.aClass117_1504 = aClass117_1510.aClass117_1504;
		var1.aClass117_1505.aClass117_1504 = var1;
		var1.aClass117_1504.aClass117_1505 = var1;
	}

	public Class117 method1594() {
		Class117 var1 = aClass117_1510.aClass117_1504;
		if (var1 == aClass117_1510) {
			return null;
		} else {
			var1.method1532();
			return var1;
		}
	}

	public Class120() {
		aClass117_1510.aClass117_1504 = aClass117_1510;
		aClass117_1510.aClass117_1505 = aClass117_1510;
	}

}
