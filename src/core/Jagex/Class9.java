package core.Jagex;
public class Class9 {

	int anInt115 = 2;
	int[] anIntArray112 = new int[2];
	int[] anIntArray111 = new int[2];
	int anInt117;
	int anInt118;
	int anInt119;
	int anInt120;
	int anInt121;
	int anInt113;
	int anInt114;
	int anInt116;

	final void method138(Class117_Sub14 var1) {
		anInt115 = var1.method2010(-1439707937);
		anIntArray112 = new int[anInt115];
		anIntArray111 = new int[anInt115];

		for (int var2 = 0; var2 < anInt115; var2++) {
			anIntArray112[var2] = var1.method2012(1053511631);
			anIntArray111[var2] = var1.method2012(1053511631);
		}

	}

	final void method139() {
		anInt117 = 0;
		anInt118 = 0;
		anInt119 = 0;
		anInt120 = 0;
		anInt121 = 0;
	}

	final void method143(Class117_Sub14 var1) {
		anInt113 = var1.method2010(-1439707937);
		anInt114 = var1.method2015((byte) 101);
		anInt116 = var1.method2015((byte) 63);
		method138(var1);
	}

	Class9() {
		anIntArray112[0] = 0;
		anIntArray112[1] = 65535;
		anIntArray111[0] = 0;
		anIntArray111[1] = 65535;
	}

	final int method147(int var1) {
		if (anInt121 >= anInt117) {
			anInt120 = anIntArray111[anInt118++] << 15;
			if (anInt118 >= anInt115) {
				anInt118 = anInt115 - 1;
			}

			anInt117 = (int) ((double) anIntArray112[anInt118] / 65536.0D * (double) var1);
			if (anInt117 > anInt121) {
				anInt119 = ((anIntArray111[anInt118] << 15) - anInt120) / (anInt117 - anInt121);
			}
		}

		anInt120 += anInt119;
		++anInt121;
		return anInt120 - anInt119 >> 15;
	}

}
