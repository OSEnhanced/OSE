package core.Jagex;
import java.nio.ByteBuffer;

public class Class57_Sub1 extends Class57 {

	ByteBuffer aByteBuffer1877;

	byte[] method855(int var1) {
		byte[] var2 = new byte[aByteBuffer1877.capacity()];
		aByteBuffer1877.position(0);
		aByteBuffer1877.get(var2);
		return var2;
	}

	void method872(byte[] var1, byte var2) {
		aByteBuffer1877 = ByteBuffer.allocateDirect(var1.length);
		aByteBuffer1877.position(0);
		aByteBuffer1877.put(var1);
	}

}
