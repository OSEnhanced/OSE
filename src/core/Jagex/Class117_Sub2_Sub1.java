package core.Jagex;
public class Class117_Sub2_Sub1 extends Class117_Sub2 {

	int anInt2430 = -1;
	int anInt2429 = 0;
	Class120 aClass120_2427 = new Class120();
	Class120 aClass120_2428 = new Class120();

	public final synchronized void method2678(Class117_Sub2 var1) {
		aClass120_2427.method1587(var1);
	}

	public final synchronized void method2679(Class117_Sub2 var1) {
		var1.method1532();
	}

	void method2680() {
		if (anInt2429 > 0) {
			for (Class117_Sub1 var1 = (Class117_Sub1) aClass120_2428.method1577(); var1 != null; var1 = (Class117_Sub1) aClass120_2428.method1582()) {
				var1.anInt1679 -= anInt2429;
			}

			anInt2430 -= anInt2429;
			anInt2429 = 0;
		}

	}

	void method2682(Class117_Sub1 var1) {
		var1.method1532();
		var1.method1842();
		Class117 var2 = aClass120_2428.aClass117_1510.aClass117_1504;
		if (var2 == aClass120_2428.aClass117_1510) {
			anInt2430 = -1;
		} else {
			anInt2430 = ((Class117_Sub1) var2).anInt1679;
		}

	}

	protected Class117_Sub2 method1859() {
		return (Class117_Sub2) aClass120_2427.method1577();
	}

	void method2683(int[] var1, int var2, int var3) {
		for (Class117_Sub2 var4 = (Class117_Sub2) aClass120_2427.method1577(); var4 != null; var4 = (Class117_Sub2) aClass120_2427.method1582()) {
			var4.method1846(var1, var2, var3);
		}

	}

	protected int method1869() {
		return 0;
	}

	public final synchronized void method1852(int var1) {
		do {
			if (anInt2430 < 0) {
				method2684(var1);
				return;
			}

			if (anInt2429 + var1 < anInt2430) {
				anInt2429 += var1;
				method2684(var1);
				return;
			}

			int var2 = anInt2430 - anInt2429;
			method2684(var2);
			var1 -= var2;
			anInt2429 += var2;
			method2680();
			Class117_Sub1 var3 = (Class117_Sub1) aClass120_2428.method1577();
			synchronized (var3) {
				int var5 = var3.method1843(this);
				if (var5 < 0) {
					var3.anInt1679 = 0;
					method2682(var3);
				} else {
					var3.anInt1679 = var5;
					method2696(var3.aClass117_1504, var3);
				}
			}
		} while (var1 != 0);

	}

	void method2684(int var1) {
		for (Class117_Sub2 var2 = (Class117_Sub2) aClass120_2427.method1577(); var2 != null; var2 = (Class117_Sub2) aClass120_2427.method1582()) {
			var2.method1852(var1);
		}

	}

	public final synchronized void method1851(int[] var1, int var2, int var3) {
		do {
			if (anInt2430 < 0) {
				method2683(var1, var2, var3);
				return;
			}

			if (anInt2429 + var3 < anInt2430) {
				anInt2429 += var3;
				method2683(var1, var2, var3);
				return;
			}

			int var4 = anInt2430 - anInt2429;
			method2683(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			anInt2429 += var4;
			method2680();
			Class117_Sub1 var5 = (Class117_Sub1) aClass120_2428.method1577();
			synchronized (var5) {
				int var7 = var5.method1843(this);
				if (var7 < 0) {
					var5.anInt1679 = 0;
					method2682(var5);
				} else {
					var5.anInt1679 = var7;
					method2696(var5.aClass117_1504, var5);
				}
			}
		} while (var3 != 0);

	}

	void method2696(Class117 var1, Class117_Sub1 var2) {
		while (var1 != aClass120_2428.aClass117_1510 && ((Class117_Sub1) var1).anInt1679 <= var2.anInt1679) {
			var1 = var1.aClass117_1504;
		}

		Class120.method1584(var2, var1);
		anInt2430 = ((Class117_Sub1) aClass120_2428.aClass117_1510.aClass117_1504).anInt1679;
	}

	protected Class117_Sub2 method1848() {
		return (Class117_Sub2) aClass120_2427.method1582();
	}

}
