package core.Jagex;
public class Class117_Sub4_Sub1 extends Class117_Sub4 {

	public int anInt2425;
	public byte[] aByteArray2423;
	public int anInt2422;
	int anInt2424;
	public boolean aBool2426;

	Class117_Sub4_Sub1(int var1, byte[] var2, int var3, int var4, boolean var5) {
		anInt2425 = var1;
		aByteArray2423 = var2;
		anInt2422 = var3;
		anInt2424 = var4;
		aBool2426 = var5;
	}

	public Class117_Sub4_Sub1 method2674(Class20 var1) {
		aByteArray2423 = var1.method343(aByteArray2423, 1673385328);
		anInt2425 = var1.method352(anInt2425, 115804530);
		if (anInt2422 == anInt2424) {
			anInt2422 = anInt2424 = var1.method345(anInt2422, (byte) 46);
		} else {
			anInt2422 = var1.method345(anInt2422, (byte) 87);
			anInt2424 = var1.method345(anInt2424, (byte) 100);
			if (anInt2422 == anInt2424) {
				--anInt2422;
			}
		}

		return this;
	}

	Class117_Sub4_Sub1(int var1, byte[] var2, int var3, int var4) {
		anInt2425 = var1;
		aByteArray2423 = var2;
		anInt2422 = var3;
		anInt2424 = var4;
	}

}
