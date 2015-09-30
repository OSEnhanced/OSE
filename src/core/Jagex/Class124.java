package core.Jagex;
import java.util.Iterator;

public class Class124 implements Iterator {

	Class117_Sub22 aClass117_Sub22_1531;
	Class117_Sub22 aClass117_Sub22_1530 = null;
	Class123 aClass123_1532;

	public Object next() {
		Class117_Sub22 var1 = aClass117_Sub22_1531;
		if (var1 == aClass123_1532.aClass117_Sub22_1529) {
			var1 = null;
			aClass117_Sub22_1531 = null;
		} else {
			aClass117_Sub22_1531 = var1.aClass117_Sub22_2133;
		}

		aClass117_Sub22_1530 = var1;
		return var1;
	}

	public boolean hasNext() {
		return aClass117_Sub22_1531 != aClass123_1532.aClass117_Sub22_1529;
	}

	public void remove() {
		if (aClass117_Sub22_1530 == null) {
			throw new IllegalStateException();
		} else {
			aClass117_Sub22_1530.method2339();
			aClass117_Sub22_1530 = null;
		}
	}

	Class124(Class123 var1) {
		aClass123_1532 = var1;
		aClass117_Sub22_1531 = aClass123_1532.aClass117_Sub22_1529.aClass117_Sub22_2133;
		aClass117_Sub22_1530 = null;
	}

}
