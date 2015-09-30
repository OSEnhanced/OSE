package core.Jagex;
import java.util.Iterator;

public class Class109 implements Iterator {

	Class117 aClass117_1476;
	Class117 aClass117_1474 = null;
	Class126 aClass126_1475;

	public Object next() {
		Class117 var1 = aClass117_1476;
		if (var1 == aClass126_1475.aClass117_1550) {
			var1 = null;
			aClass117_1476 = null;
		} else {
			aClass117_1476 = var1.aClass117_1504;
		}

		aClass117_1474 = var1;
		return var1;
	}

	public void remove() {
		if (aClass117_1474 == null) {
			throw new IllegalStateException();
		} else {
			aClass117_1474.method1532();
			aClass117_1474 = null;
		}
	}

	Class109(Class126 var1) {
		aClass126_1475 = var1;
		aClass117_1476 = aClass126_1475.aClass117_1550.aClass117_1504;
		aClass117_1474 = null;
	}

	public boolean hasNext() {
		return aClass117_1476 != aClass126_1475.aClass117_1550;
	}

}
