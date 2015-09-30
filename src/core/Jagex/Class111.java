package core.Jagex;
import java.util.Iterator;

public class Class111 implements Iterator {

	Class117 aClass117_1480;
	int anInt1479;
	Class117 aClass117_1481 = null;
	Class118 aClass118_1482;

	void method1499() {
		aClass117_1480 = aClass118_1482.aClass117Array1508[0].aClass117_1504;
		anInt1479 = 1;
		aClass117_1481 = null;
	}

	public Object next() {
		Class117 var1;
		if (aClass117_1480 != aClass118_1482.aClass117Array1508[anInt1479 - 1]) {
			var1 = aClass117_1480;
			aClass117_1480 = var1.aClass117_1504;
			aClass117_1481 = var1;
			return var1;
		} else {
			do {
				if (anInt1479 >= aClass118_1482.anInt1507) {
					return null;
				}

				var1 = aClass118_1482.aClass117Array1508[anInt1479++].aClass117_1504;
			} while (var1 == aClass118_1482.aClass117Array1508[anInt1479 - 1]);

			aClass117_1480 = var1.aClass117_1504;
			aClass117_1481 = var1;
			return var1;
		}
	}

	public boolean hasNext() {
		if (aClass117_1480 != aClass118_1482.aClass117Array1508[anInt1479 - 1]) {
			return true;
		} else {
			while (anInt1479 < aClass118_1482.anInt1507) {
				if (aClass118_1482.aClass117Array1508[anInt1479++].aClass117_1504 != aClass118_1482.aClass117Array1508[anInt1479 - 1]) {
					aClass117_1480 = aClass118_1482.aClass117Array1508[anInt1479 - 1].aClass117_1504;
					return true;
				}

				aClass117_1480 = aClass118_1482.aClass117Array1508[anInt1479 - 1];
			}

			return false;
		}
	}

	public void remove() {
		if (aClass117_1481 == null) {
			throw new IllegalStateException();
		} else {
			aClass117_1481.method1532();
			aClass117_1481 = null;
		}
	}

	Class111(Class118 var1) {
		aClass118_1482 = var1;
		method1499();
	}

}
