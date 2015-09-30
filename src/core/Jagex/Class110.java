package core.Jagex;
public class Class110 {

	Class114 aClass114_1477 = new Class114();
	Class114 aClass114_1478;

	public Class110() {
		aClass114_1477.aClass114_1496 = aClass114_1477;
		aClass114_1477.aClass114_1495 = aClass114_1477;
	}

	public Class114 method1488() {
		Class114 var1 = aClass114_1477.aClass114_1496;
		if (var1 != aClass114_1477) {
			aClass114_1478 = var1.aClass114_1496;
			return var1;
		} else {
			aClass114_1478 = null;
			return null;
		}
	}

	public Class114 method1490() {
		Class114 var1 = aClass114_1478;
		if (var1 == aClass114_1477) {
			aClass114_1478 = null;
			return null;
		} else {
			aClass114_1478 = var1.aClass114_1496;
			return var1;
		}
	}

	public void method1492(Class114 var1) {
		if (var1.aClass114_1495 != null) {
			var1.method1511();
		}

		var1.aClass114_1495 = aClass114_1477.aClass114_1495;
		var1.aClass114_1496 = aClass114_1477;
		var1.aClass114_1495.aClass114_1496 = var1;
		var1.aClass114_1496.aClass114_1495 = var1;
	}

}
