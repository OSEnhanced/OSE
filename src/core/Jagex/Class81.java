package core.Jagex;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class Class81 implements Runnable {

	public static final int anInt959 = 15;
	static final int anInt967 = 12;
	static final int anInt970 = 65;
	boolean aBool962 = false;
	Class72 aClass72_964;
	byte[] aByteArray965;
	boolean aBool968 = false;
	int anInt961 = 0;
	int anInt971 = 0;
	Class77 aClass77_963;
	Socket aSocket966;
	InputStream anInputStream969;
	OutputStream anOutputStream960;

	public void method1088(byte var1) {
		if (!aBool962) {
			synchronized (this) {
				aBool962 = true;
				notifyAll();
			}

			if (aClass72_964 != null) {
				while (aClass72_964.anInt870 == 0) {
					Class38.method520(1L);
				}

				if (aClass72_964.anInt870 == 1) {
					try {
						((Thread) aClass72_964.anObject874).join();
					} catch (InterruptedException var4) {
						;
					}
				}
			}

			aClass72_964 = null;
		}
	}

	public int method1090(byte var1) throws IOException {
		return !aBool962 ? anInputStream969.read() : 0;
	}

	public void method1092(byte[] var1, int var2, int var3, short var4) throws IOException {
		if (!aBool962) {
			while (var3 > 0) {
				int var5 = anInputStream969.read(var1, var2, var3);
				if (var5 <= 0) {
					throw new EOFException();
				}

				var2 += var5;
				var3 -= var5;
			}

		}
	}

	public int method1093(int var1) throws IOException {
		return aBool962 ? 0 : anInputStream969.available();
	}

	public void run() {
		try {
			while (true) {
				label81:
				{
					int var3;
					int var4;
					synchronized (this) {
						if (anInt971 * 446004943 == anInt961 * -1813437423) {
							if (aBool962) {
								break label81;
							}

							try {
								wait();
							} catch (InterruptedException var9) {
								;
							}
						}

						var3 = anInt961 * -1813437423;
						if (anInt971 * 446004943 >= anInt961 * -1813437423) {
							var4 = anInt971 * 446004943 - anInt961 * -1813437423;
						} else {
							var4 = 5000 - anInt961 * -1813437423;
						}
					}

					if (var4 <= 0) {
						continue;
					}

					try {
						anOutputStream960.write(aByteArray965, var3, var4);
					} catch (IOException var8) {
						aBool968 = true;
					}

					anInt961 = (var4 + anInt961 * -1813437423) % 5000 * 1842367729;

					try {
						if (anInt971 * 446004943 == anInt961 * -1813437423) {
							anOutputStream960.flush();
						}
					} catch (IOException var7) {
						aBool968 = true;
					}
					continue;
				}

				try {
					if (anInputStream969 != null) {
						anInputStream969.close();
					}

					if (anOutputStream960 != null) {
						anOutputStream960.close();
					}

					if (aSocket966 != null) {
						aSocket966.close();
					}
				} catch (IOException var6) {
					;
				}

				aByteArray965 = null;
				break;
			}
		} catch (Exception var11) {
			Class117_Sub12.method1987((String) null, var11, -273945113);
		}

	}

	protected void finalize() {
		method1088((byte) 0);
	}

	public Class81(Socket var1, Class77 var2) throws IOException {
		aClass77_963 = var2;
		aSocket966 = var1;
		aSocket966.setSoTimeout(30000);
		aSocket966.setTcpNoDelay(true);
		aSocket966.setReceiveBufferSize(16384);
		aSocket966.setSendBufferSize(16384);
		anInputStream969 = aSocket966.getInputStream();
		anOutputStream960 = aSocket966.getOutputStream();
	}

	public void method1107(byte[] var1, int var2, int var3, byte var4) throws IOException {
		if (!aBool962) {
			if (aBool968) {
				aBool968 = false;
				throw new IOException();
			} else {
				if (aByteArray965 == null) {
					aByteArray965 = new byte[5000];
				}

				synchronized (this) {
					for (int var6 = 0; var6 < var3; var6++) {
						aByteArray965[anInt971 * 446004943] = var1[var2 + var6];
						anInt971 = (anInt971 * 446004943 + 1) % 5000 * 868534319;
						if (anInt971 * 446004943 == (4900 + anInt961 * -1813437423) % 5000) {
							throw new IOException();
						}
					}

					if (aClass72_964 == null) {
						aClass72_964 = aClass77_963.method1065(this, 3, -1829752232);
					}

					notifyAll();
				}
			}
		}
	}

	public static boolean method1108(int var0) {
		return Class121.anInt1515 * -704298507 == 0 ? Class121.aClass117_Sub2_Sub4_1514.method2979(167103028) : true;
	}

	static void method1109(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		if (!GameClient.aBool3059) {
			if (GameClient.anInt3060 * 1223430109 < 500) {
				GameClient.aStringArray3065[GameClient.anInt3060 * 1223430109] = var0;
				GameClient.aStringArray3066[GameClient.anInt3060 * 1223430109] = var1;
				GameClient.anIntArray2999[GameClient.anInt3060 * 1223430109] = var2;
				GameClient.anIntArray3064[GameClient.anInt3060 * 1223430109] = var3;
				GameClient.anIntArray3061[GameClient.anInt3060 * 1223430109] = var4;
				GameClient.anIntArray3009[GameClient.anInt3060 * 1223430109] = var5;
				GameClient.anInt3060 += 2032386165;
			}

		}
	}

	static void method1110(int var0, int var1) {
		Class117_Sub12 var2 = (Class117_Sub12) Class117_Sub12.aClass127_1862.method1675((long) var0);
		if (var2 != null) {
			var2.method1532();
		}
	}

}
