package core.Jagex;
import java.awt.*;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class Class77 implements Runnable {

	Interface1 anInterface1_922;
	public static final int anInt923 = 201;
	boolean aBool928 = false;
	Class72 aClass72_926 = null;
	Class72 aClass72_924 = null;
	public static String aString925;
	public EventQueue anEventQueue927;
	Thread aThread921;

	final void method1044(int var1) {
		synchronized (this) {
			aBool928 = true;
			notifyAll();
		}

		try {
			aThread921.join();
		} catch (InterruptedException var4) {
			;
		}

	}

	public final void run() {
		while (true) {
			Class72 var2;
			synchronized (this) {
				while (true) {
					if (aBool928) {
						return;
					}

					if (aClass72_926 != null) {
						var2 = aClass72_926;
						aClass72_926 = aClass72_926.aClass72_868;
						if (aClass72_926 == null) {
							aClass72_924 = null;
						}
						break;
					}

					try {
						wait();
					} catch (InterruptedException var7) {
						;
					}
				}
			}

			try {
				int var1 = var2.anInt866 * 2133152591;
				if (var1 == 1) {
					var2.anObject874 = new Socket(InetAddress.getByName((String) var2.anObject873), var2.anInt872);
				} else if (var1 == 2) {
					Thread var3 = new Thread((Runnable) var2.anObject873);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var2.anInt872);
					var2.anObject874 = var3;
				} else if (var1 == 4) {
					var2.anObject874 = new DataInputStream(((URL) var2.anObject873).openStream());
				} else if (var1 == 3) {
					String var9 = (var2.anInt872 >> 24 & 255) + "." + (var2.anInt872 >> 16 & 255) + "." + (var2.anInt872 >> 8 & 255) + "." + (var2.anInt872 & 255);
					var2.anObject874 = InetAddress.getByName(var9).getHostName();
				}

				var2.anInt870 = 1;
			} catch (ThreadDeath var5) {
				throw var5;
			} catch (Throwable var6) {
				var2.anInt870 = 2;
			}
		}
	}

	final Class72 method1047(int var1, int var2, int var3, Object var4, int var5) {
		Class72 var6 = new Class72();
		var6.anInt866 = var1 * -430709841;
		var6.anInt872 = var2;
		var6.anObject873 = var4;
		synchronized (this) {
			if (aClass72_924 != null) {
				aClass72_924.aClass72_868 = var6;
				aClass72_924 = var6;
			} else {
				aClass72_924 = aClass72_926 = var6;
			}

			notify();
			return var6;
		}
	}

	public final Interface1 method1048(int var1) {
		return anInterface1_922;
	}

	public final Class72 method1049(URL var1, int var2) {
		return method1047(4, 0, 0, var1, -1113839164);
	}

	public final Class72 method1050(String var1, int var2, int var3) {
		return method1047(1, var2, 0, var1, -1995142947);
	}

	Class77() {
		aString925 = "Unknown";
		Class139.aString1625 = "1.1";

		try {
			aString925 = System.getProperty("java.vendor");
			Class139.aString1625 = System.getProperty("java.version");
		} catch (Exception var3) {
			;
		}

		try {
			anEventQueue927 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var2) {
			;
		}

		aBool928 = false;
		aThread921 = new Thread(this);
		aThread921.setPriority(10);
		aThread921.setDaemon(true);
		aThread921.start();
	}

	public final Class72 method1057(int var1, int var2) {
		return method1047(3, var1, 0, (Object) null, -904464511);
	}

	public final Class72 method1065(Runnable var1, int var2, int var3) {
		return method1047(2, var2, 0, var1, -2035958958);
	}

	static void method1069(int var0) {
		Class117_Sub22_Sub6.aClass115_2247.method1518();
		Class117_Sub22_Sub6.aClass115_2224.method1518();
		Class117_Sub22_Sub6.aClass115_2225.method1518();
	}

}
