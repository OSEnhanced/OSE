package core.Jagex;
import java.util.Iterator;

public class Class123 implements Iterable {

	public Class117_Sub22 aClass117_Sub22_1529 = new Class117_Sub22();

	public void method1631() {
		while (aClass117_Sub22_1529.aClass117_Sub22_2133 != aClass117_Sub22_1529) {
			aClass117_Sub22_1529.aClass117_Sub22_2133.method2339();
		}

	}

	public void method1632(Class117_Sub22 var1) {
		if (var1.aClass117_Sub22_2132 != null) {
			var1.method2339();
		}

		var1.aClass117_Sub22_2132 = aClass117_Sub22_1529.aClass117_Sub22_2132;
		var1.aClass117_Sub22_2133 = aClass117_Sub22_1529;
		var1.aClass117_Sub22_2132.aClass117_Sub22_2133 = var1;
		var1.aClass117_Sub22_2133.aClass117_Sub22_2132 = var1;
	}

	public Iterator iterator() {
		return new Class124(this);
	}

	public Class123() {
		aClass117_Sub22_1529.aClass117_Sub22_2133 = aClass117_Sub22_1529;
		aClass117_Sub22_1529.aClass117_Sub22_2132 = aClass117_Sub22_1529;
	}

}
