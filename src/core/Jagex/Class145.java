package core.Jagex;
import java.io.EOFException;
import java.io.IOException;

public class Class145 {

	long aLong1657;
	long aLong1653;
	long aLong1652 = -2312516504851025499L;
	long aLong1655 = 4590592042671496817L;
	int anInt1656 = 0;
	Class129 aClass129_1659;
	long aLong1658;
	long aLong1650;
	byte[] aByteArray1651;
	byte[] aByteArray1654;
	int anInt1660;

	public void method1802(byte[] var1, int var2, int var3, int var4) throws IOException {
		try {
			if (var2 + var3 > var1.length) {
				throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
			}

			if (6505214641354005871L * aLong1655 != -1L && 127579217178312417L * aLong1653 >= aLong1655 * 6505214641354005871L && (long) var3 + 127579217178312417L * aLong1653 <= (long) (anInt1656 * 1790181945) + 6505214641354005871L * aLong1655) {
				System.arraycopy(aByteArray1654, (int) (aLong1653 * 127579217178312417L - 6505214641354005871L * aLong1655), var1, var2, var3);
				aLong1653 += (long) var3 * -8831785984498924255L;
				return;
			}

			long var5 = aLong1653 * 127579217178312417L;
			int var8 = var3;
			int var9;
			if (127579217178312417L * aLong1653 >= 3838567798591648211L * aLong1652 && 127579217178312417L * aLong1653 < aLong1652 * 3838567798591648211L + (long) (anInt1660 * -122669929)) {
				var9 = (int) ((long) (anInt1660 * -122669929) - (aLong1653 * 127579217178312417L - aLong1652 * 3838567798591648211L));
				if (var9 > var3) {
					var9 = var3;
				}

				System.arraycopy(aByteArray1651, (int) (127579217178312417L * aLong1653 - aLong1652 * 3838567798591648211L), var1, var2, var9);
				aLong1653 += -8831785984498924255L * (long) var9;
				var2 += var9;
				var3 -= var9;
			}

			if (var3 > aByteArray1651.length) {
				aClass129_1659.method1683(127579217178312417L * aLong1653);

				for (aLong1657 = aLong1653 * 6988857833007816139L; var3 > 0; var3 -= var9) {
					var9 = aClass129_1659.method1691(var1, var2, var3, -1988083209);
					if (var9 == -1) {
						break;
					}

					aLong1657 += (long) var9 * 382941749484768811L;
					aLong1653 += -8831785984498924255L * (long) var9;
					var2 += var9;
				}
			} else if (var3 > 0) {
				method1807(178000894);
				var9 = var3;
				if (var3 > anInt1660 * -122669929) {
					var9 = anInt1660 * -122669929;
				}

				System.arraycopy(aByteArray1651, 0, var1, var2, var9);
				var2 += var9;
				var3 -= var9;
				aLong1653 += (long) var9 * -8831785984498924255L;
			}

			if (aLong1655 * 6505214641354005871L != -1L) {
				if (aLong1655 * 6505214641354005871L > 127579217178312417L * aLong1653 && var3 > 0) {
					var9 = (int) (aLong1655 * 6505214641354005871L - 127579217178312417L * aLong1653) + var2;
					if (var9 > var3 + var2) {
						var9 = var2 + var3;
					}

					while (var2 < var9) {
						var1[var2++] = 0;
						--var3;
						aLong1653 += -8831785984498924255L;
					}
				}

				long var10 = -1L;
				long var12 = -1L;
				if (aLong1655 * 6505214641354005871L >= var5 && aLong1655 * 6505214641354005871L < var5 + (long) var8) {
					var10 = aLong1655 * 6505214641354005871L;
				} else if (var5 >= 6505214641354005871L * aLong1655 && var5 < (long) (anInt1656 * 1790181945) + aLong1655 * 6505214641354005871L) {
					var10 = var5;
				}

				if (6505214641354005871L * aLong1655 + (long) (anInt1656 * 1790181945) > var5 && (long) (anInt1656 * 1790181945) + aLong1655 * 6505214641354005871L <= (long) var8 + var5) {
					var12 = 6505214641354005871L * aLong1655 + (long) (anInt1656 * 1790181945);
				} else if ((long) var8 + var5 > aLong1655 * 6505214641354005871L && var5 + (long) var8 <= 6505214641354005871L * aLong1655 + (long) (anInt1656 * 1790181945)) {
					var12 = var5 + (long) var8;
				}

				if (var10 > -1L && var12 > var10) {
					int var14 = (int) (var12 - var10);
					System.arraycopy(aByteArray1654, (int) (var10 - aLong1655 * 6505214641354005871L), var1, var2 + (int) (var10 - var5), var14);
					if (var12 > aLong1653 * 127579217178312417L) {
						var3 = (int) ((long) var3 - (var12 - aLong1653 * 127579217178312417L));
						aLong1653 = var12 * -8831785984498924255L;
					}
				}
			}
		} catch (IOException var16) {
			aLong1657 = -382941749484768811L;
			throw var16;
		}

		if (var3 > 0) {
			throw new EOFException();
		}
	}

	public Class145(Class129 var1, int var2, int var3) throws IOException {
		aClass129_1659 = var1;
		aLong1650 = (aLong1658 = var1.method1686((byte) 0) * -741841344434818449L) * 5415773987274620545L;
		aByteArray1651 = new byte[var2];
		aByteArray1654 = new byte[var3];
		aLong1653 = 0L;
	}

	public void method1803(byte var1) throws IOException {
		method1809(1212991919);
		aClass129_1659.method1685(895504975);
	}

	public long method1804(int var1) {
		return aLong1650 * -1884547356036005105L;
	}

	public void method1805(byte[] var1, byte var2) throws IOException {
		method1802(var1, 0, var1.length, -1353297686);
	}

	void method1807(int var1) throws IOException {
		anInt1660 = 0;
		if (aLong1653 * 127579217178312417L != aLong1657 * -4100471848197717885L) {
			aClass129_1659.method1683(127579217178312417L * aLong1653);
			aLong1657 = aLong1653 * 6988857833007816139L;
		}

		int var2;
		for (aLong1652 = aLong1653 * 5309292249525889019L; anInt1660 * -122669929 < aByteArray1651.length; anInt1660 += var2 * -982086873) {
			var2 = aClass129_1659.method1691(aByteArray1651, anInt1660 * -122669929, aByteArray1651.length - anInt1660 * -122669929, -1906531778);
			if (var2 == -1) {
				break;
			}

			aLong1657 += (long) var2 * 382941749484768811L;
		}

	}

	void method1809(int var1) throws IOException {
		if (aLong1655 * 6505214641354005871L != -1L) {
			if (-4100471848197717885L * aLong1657 != 6505214641354005871L * aLong1655) {
				aClass129_1659.method1683(6505214641354005871L * aLong1655);
				aLong1657 = -4809216551431699547L * aLong1655;
			}

			aClass129_1659.method1693(aByteArray1654, 0, anInt1656 * 1790181945, (byte) -23);
			aLong1657 += (long) anInt1656 * -3312974129566958189L;
			if (aLong1657 * -4100471848197717885L > -4550442793329234801L * aLong1658) {
				aLong1658 = -6993773693948342579L * aLong1657;
			}

			long var4 = -1L;
			long var2 = -1L;
			if (6505214641354005871L * aLong1655 >= 3838567798591648211L * aLong1652 && aLong1655 * 6505214641354005871L < 3838567798591648211L * aLong1652 + (long) (anInt1660 * -122669929)) {
				var4 = 6505214641354005871L * aLong1655;
			} else if (3838567798591648211L * aLong1652 >= 6505214641354005871L * aLong1655 && 3838567798591648211L * aLong1652 < (long) (anInt1656 * 1790181945) + 6505214641354005871L * aLong1655) {
				var4 = 3838567798591648211L * aLong1652;
			}

			if (6505214641354005871L * aLong1655 + (long) (anInt1656 * 1790181945) > 3838567798591648211L * aLong1652 && 6505214641354005871L * aLong1655 + (long) (anInt1656 * 1790181945) <= aLong1652 * 3838567798591648211L + (long) (anInt1660 * -122669929)) {
				var2 = aLong1655 * 6505214641354005871L + (long) (anInt1656 * 1790181945);
			} else if ((long) (anInt1660 * -122669929) + aLong1652 * 3838567798591648211L > 6505214641354005871L * aLong1655 && 3838567798591648211L * aLong1652 + (long) (anInt1660 * -122669929) <= 6505214641354005871L * aLong1655 + (long) (anInt1656 * 1790181945)) {
				var2 = aLong1652 * 3838567798591648211L + (long) (anInt1660 * -122669929);
			}

			if (var4 > -1L && var2 > var4) {
				int var6 = (int) (var2 - var4);
				System.arraycopy(aByteArray1654, (int) (var4 - aLong1655 * 6505214641354005871L), aByteArray1651, (int) (var4 - aLong1652 * 3838567798591648211L), var6);
			}

			aLong1655 = 4590592042671496817L;
			anInt1656 = 0;
		}

	}

	public void method1813(byte[] var1, int var2, int var3, int var4) throws IOException {
		try {
			if (127579217178312417L * aLong1653 + (long) var3 > -1884547356036005105L * aLong1650) {
				aLong1650 = 3452237681709943791L * (aLong1653 * 127579217178312417L + (long) var3);
			}

			if (6505214641354005871L * aLong1655 != -1L && (127579217178312417L * aLong1653 < aLong1655 * 6505214641354005871L || 127579217178312417L * aLong1653 > (long) (anInt1656 * 1790181945) + 6505214641354005871L * aLong1655)) {
				method1809(335038391);
			}

			if (aLong1655 * 6505214641354005871L != -1L && (long) var3 + aLong1653 * 127579217178312417L > 6505214641354005871L * aLong1655 + (long) aByteArray1654.length) {
				int var5 = (int) ((long) aByteArray1654.length - (aLong1653 * 127579217178312417L - aLong1655 * 6505214641354005871L));
				System.arraycopy(var1, var2, aByteArray1654, (int) (aLong1653 * 127579217178312417L - aLong1655 * 6505214641354005871L), var5);
				aLong1653 += (long) var5 * -8831785984498924255L;
				var2 += var5;
				var3 -= var5;
				anInt1656 = aByteArray1654.length * 723209225;
				method1809(-524123682);
			}

			if (var3 <= aByteArray1654.length) {
				if (var3 > 0) {
					if (aLong1655 * 6505214641354005871L == -1L) {
						aLong1655 = -8915582396376014673L * aLong1653;
					}

					System.arraycopy(var1, var2, aByteArray1654, (int) (127579217178312417L * aLong1653 - aLong1655 * 6505214641354005871L), var3);
					aLong1653 += (long) var3 * -8831785984498924255L;
					if (127579217178312417L * aLong1653 - 6505214641354005871L * aLong1655 > (long) (anInt1656 * 1790181945)) {
						anInt1656 = (int) (aLong1653 * 127579217178312417L - 6505214641354005871L * aLong1655) * 723209225;
					}

				}
			} else {
				if (-4100471848197717885L * aLong1657 != 127579217178312417L * aLong1653) {
					aClass129_1659.method1683(127579217178312417L * aLong1653);
					aLong1657 = 6988857833007816139L * aLong1653;
				}

				aClass129_1659.method1693(var1, var2, var3, (byte) -90);
				aLong1657 += 382941749484768811L * (long) var3;
				if (-4100471848197717885L * aLong1657 > -4550442793329234801L * aLong1658) {
					aLong1658 = -6993773693948342579L * aLong1657;
				}

				long var6 = -1L;
				long var8 = -1L;
				if (127579217178312417L * aLong1653 >= aLong1652 * 3838567798591648211L && aLong1653 * 127579217178312417L < aLong1652 * 3838567798591648211L + (long) (anInt1660 * -122669929)) {
					var6 = 127579217178312417L * aLong1653;
				} else if (aLong1652 * 3838567798591648211L >= 127579217178312417L * aLong1653 && 3838567798591648211L * aLong1652 < aLong1653 * 127579217178312417L + (long) var3) {
					var6 = 3838567798591648211L * aLong1652;
				}

				if ((long) var3 + aLong1653 * 127579217178312417L > aLong1652 * 3838567798591648211L && (long) var3 + 127579217178312417L * aLong1653 <= (long) (anInt1660 * -122669929) + 3838567798591648211L * aLong1652) {
					var8 = (long) var3 + 127579217178312417L * aLong1653;
				} else if (3838567798591648211L * aLong1652 + (long) (anInt1660 * -122669929) > aLong1653 * 127579217178312417L && aLong1652 * 3838567798591648211L + (long) (anInt1660 * -122669929) <= (long) var3 + 127579217178312417L * aLong1653) {
					var8 = 3838567798591648211L * aLong1652 + (long) (anInt1660 * -122669929);
				}

				if (var6 > -1L && var8 > var6) {
					int var10 = (int) (var8 - var6);
					System.arraycopy(var1, (int) ((long) var2 + var6 - 127579217178312417L * aLong1653), aByteArray1651, (int) (var6 - aLong1652 * 3838567798591648211L), var10);
				}

				aLong1653 += (long) var3 * -8831785984498924255L;
			}
		} catch (IOException var11) {
			aLong1657 = -382941749484768811L;
			throw var11;
		}
	}

	public void method1827(long var1) throws IOException {
		if (var1 < 0L) {
			throw new IOException("");
		} else {
			aLong1653 = -8831785984498924255L * var1;
		}
	}

}
