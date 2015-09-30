package core.Jagex;
public class Class107 implements Runnable {

	public static final int anInt1195 = 97;
	static final int anInt1197 = 34;
	public static int anInt1193 = 0;
	static Class120 aClass120_1198 = new Class120();
	static Class120 aClass120_1194 = new Class120();
	public static Object anObject1196 = new Object();

	public void run() {
		try {
			while (true) {
				Class120 var1 = aClass120_1198;
				Class117_Sub15 var2;
				synchronized (var1) {
					var2 = (Class117_Sub15) aClass120_1198.method1577();
				}

				Object var14;
				if (var2 != null) {
					if (var2.anInt1898 * 163716151 == 0) {
						var2.aClass88_1899.method1147((int) var2.aLong1503, var2.aByteArray1903, var2.aByteArray1903.length, (byte) 117);
						var1 = aClass120_1198;
						synchronized (var1) {
							var2.method1532();
						}
					} else if (var2.anInt1898 * 163716151 == 1) {
						var2.aByteArray1903 = var2.aClass88_1899.method1145((int) var2.aLong1503, -2126241753);
						var1 = aClass120_1198;
						synchronized (var1) {
							aClass120_1194.method1575(var2);
						}
					}

					var14 = anObject1196;
					synchronized (var14) {
						if (anInt1193 * 1236626877 <= 1) {
							anInt1193 = 0;
							anObject1196.notifyAll();
							return;
						}

						anInt1193 = -104491720;
					}
				} else {
					Class38.method520(100L);
					var14 = anObject1196;
					synchronized (var14) {
						if (anInt1193 * 1236626877 <= 1) {
							anInt1193 = 0;
							anObject1196.notifyAll();
							return;
						}

						anInt1193 -= 1574647189;
					}
				}
			}
		} catch (Exception var13) {
			Class117_Sub12.method1987((String) null, var13, 1649969484);
		}
	}

}
