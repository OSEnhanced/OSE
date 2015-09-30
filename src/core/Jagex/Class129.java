package core.Jagex;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class129 {

	static final int anInt1584 = 18;
	static Class106_Sub1 aClass106_Sub1_1585;
	RandomAccessFile aRandomAccessFile1582;
	long aLong1581;
	long aLong1583;

	public Class129(File var1, String var2, long var3) throws IOException {
		if (var3 == -1L) {
			var3 = Long.MAX_VALUE;
		}

		if (var1.length() >= var3) {
			var1.delete();
		}

		aRandomAccessFile1582 = new RandomAccessFile(var1, var2);
		aLong1581 = var3 * -878968592885407111L;
		aLong1583 = 0L;
		int var5 = aRandomAccessFile1582.read();
		if (var5 != -1 && !var2.equals("r")) {
			aRandomAccessFile1582.seek(0L);
			aRandomAccessFile1582.write(var5);
		}

		aRandomAccessFile1582.seek(0L);
	}

	final void method1683(long var1) throws IOException {
		aRandomAccessFile1582.seek(var1);
		aLong1583 = var1 * -5536831689920829345L;
	}

	public final void method1685(int var1) throws IOException {
		if (aRandomAccessFile1582 != null) {
			aRandomAccessFile1582.close();
			aRandomAccessFile1582 = null;
		}

	}

	public final long method1686(byte var1) throws IOException {
		return aRandomAccessFile1582.length();
	}

	protected void finalize() throws Throwable {
		if (aRandomAccessFile1582 != null) {
			System.out.println("");
			method1685(817193444);
		}

	}

	public final int method1691(byte[] var1, int var2, int var3, int var4) throws IOException {
		int var5 = aRandomAccessFile1582.read(var1, var2, var3);
		if (var5 > 0) {
			aLong1583 += -5536831689920829345L * (long) var5;
		}

		return var5;
	}

	public final void method1693(byte[] var1, int var2, int var3, byte var4) throws IOException {
		if ((long) var3 + aLong1583 * 3309471652594561951L <= aLong1581 * 6027869271674169289L) {
			aRandomAccessFile1582.write(var1, var2, var3);
			aLong1583 += -5536831689920829345L * (long) var3;
		} else {
			aRandomAccessFile1582.seek(1L + aLong1581 * 6027869271674169289L);
			aRandomAccessFile1582.write(1);
			throw new EOFException();
		}
	}

}
