package core.Jagex;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import java.awt.*;

public class Class14_Sub1 extends Class14 {

	SourceDataLine aSourceDataLine1676;
	int anInt1675;
	AudioFormat anAudioFormat1677;
	byte[] aByteArray1678;

	void method250(int var1) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, anAudioFormat1677, var1 << (Class130.aBool1588 ? 2 : 1));
			aSourceDataLine1676 = (SourceDataLine) AudioSystem.getLine(var2);
			aSourceDataLine1676.open();
			aSourceDataLine1676.start();
			anInt1675 = var1 * 2046609891;
		} catch (LineUnavailableException var5) {
			int var3 = (var1 >>> 1 & 1431655765) + (var1 & 1431655765);
			var3 = (var3 >>> 2 & 858993459) + (var3 & 858993459);
			var3 = var3 + (var3 >>> 4) & 252645135;
			var3 += var3 >>> 8;
			var3 += var3 >>> 16;
			int var4 = var3 & 255;
			if (var4 != 1) {
				method250(Class57.method870(var1, (byte) 17));
			} else {
				aSourceDataLine1676 = null;
				throw var5;
			}
		}
	}

	void method297(Component var1) {
		anAudioFormat1677 = new AudioFormat((float) (anInt170 * -1211689641), 16, Class130.aBool1588 ? 2 : 1, true, false);
		aByteArray1678 = new byte[256 << (Class130.aBool1588 ? 2 : 1)];
	}

	int method247() {
		return anInt1675 * 963429323 - (aSourceDataLine1676.available() >> (Class130.aBool1588 ? 2 : 1));
	}

	void method245() {
		int var1 = 256;
		if (Class130.aBool1588) {
			var1 <<= 1;
		}

		for (int var2 = 0; var2 < var1; var2++) {
			int var3 = anIntArray155[var2];
			if ((var3 + 8388608 & -16777216) != 0) {
				var3 = 8388607 ^ var3 >> 31;
			}

			aByteArray1678[var2 * 2] = (byte) (var3 >> 8);
			aByteArray1678[1 + var2 * 2] = (byte) (var3 >> 16);
		}

		aSourceDataLine1676.write(aByteArray1678, 0, var1 << 1);
	}

	void method253() {
		if (aSourceDataLine1676 != null) {
			aSourceDataLine1676.close();
			aSourceDataLine1676 = null;
		}

	}

	void method288() {
		aSourceDataLine1676.flush();
	}

}
