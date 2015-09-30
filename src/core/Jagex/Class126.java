package core.Jagex;
import java.util.Iterator;

public class Class126 implements Iterable {

	Class117 aClass117_1550 = new Class117();

	public void method1651(Class117 var1) {
		if (var1.aClass117_1505 != null) {
			var1.method1532();
		}

		var1.aClass117_1505 = aClass117_1550.aClass117_1505;
		var1.aClass117_1504 = aClass117_1550;
		var1.aClass117_1505.aClass117_1504 = var1;
		var1.aClass117_1504.aClass117_1505 = var1;
	}

	public Class117 method1653() {
		return method1657((Class117) null);
	}

	public Iterator iterator() {
		return new Class109(this);
	}

	Class117 method1657(Class117 var1) {
		Class117 var2;
		if (var1 == null) {
			var2 = aClass117_1550.aClass117_1504;
		} else {
			var2 = var1;
		}

		return var2 == aClass117_1550 ? null : var2;
	}

	public Class126() {
		aClass117_1550.aClass117_1504 = aClass117_1550;
		aClass117_1550.aClass117_1505 = aClass117_1550;
	}

}
