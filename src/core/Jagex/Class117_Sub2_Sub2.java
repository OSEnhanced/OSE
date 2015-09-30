package core.Jagex;
public class Class117_Sub2_Sub2 extends Class117_Sub2 {

	int anInt2441;
	int anInt2434;
	int anInt2440;
	boolean aBool2437;
	int anInt2439;
	int anInt2432;
	int anInt2433;
	int anInt2443;
	int anInt2442;
	int anInt2431;
	int anInt2436;
	int anInt2435;
	int anInt2444;
	int anInt2445;
	int anInt2438;

	public synchronized void method2703(int var1) {
		if (anInt2441 < 0) {
			anInt2441 = -var1;
		} else {
			anInt2441 = var1;
		}

	}

	static int method2704(int var0, int var1) {
		return var1 >= 0 ? (int) ((double) var0 * Math.sqrt((double) var1 * 1.220703125E-4D) + 0.5D) : -var0;
	}

	int method1847() {
		int var1 = anInt2435 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (anInt2438 != 0) {
			if (anInt2438 >= 0) {
				var1 -= var1 * anInt2434 / ((Class117_Sub4_Sub1) aClass117_Sub4_1682).aByteArray2423.length;
			}
		} else {
			var1 -= var1 * anInt2433 / (((Class117_Sub4_Sub1) aClass117_Sub4_1682).aByteArray2423.length << 8);
		}

		return var1 > 255 ? 255 : var1;
	}

	Class117_Sub2_Sub2(Class117_Sub4_Sub1 var1, int var2, int var3, int var4) {
		aClass117_Sub4_1682 = var1;
		anInt2434 = var1.anInt2422;
		anInt2440 = var1.anInt2424;
		aBool2437 = var1.aBool2426;
		anInt2441 = var2;
		anInt2439 = var3;
		anInt2432 = var4;
		anInt2433 = 0;
		method2708();
	}

	public static Class117_Sub2_Sub2 method2706(Class117_Sub4_Sub1 var0, int var1, int var2) {
		return var0.aByteArray2423 != null && var0.aByteArray2423.length != 0 ? new Class117_Sub2_Sub2(var0, (int) ((long) var0.anInt2425 * 256L * (long) var1 / (long) (Class14.anInt170 * -909879812)), var2 << 6) : null;
	}

	boolean method2707() {
		int var1 = anInt2439;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var2 = 0;
			var3 = 0;
			var1 = 0;
		} else {
			var3 = method2819(var1, anInt2432);
			var2 = method2704(var1, anInt2432);
		}

		if (anInt2435 == var1 && anInt2436 == var3 && anInt2431 == var2) {
			if (anInt2439 == Integer.MIN_VALUE) {
				anInt2439 = 0;
				anInt2431 = 0;
				anInt2436 = 0;
				anInt2435 = 0;
				method1532();
				return true;
			} else {
				method2708();
				return false;
			}
		} else {
			if (anInt2435 < var1) {
				anInt2443 = 1;
				anInt2442 = var1 - anInt2435;
			} else if (anInt2435 > var1) {
				anInt2443 = -1;
				anInt2442 = anInt2435 - var1;
			} else {
				anInt2443 = 0;
			}

			if (anInt2436 < var3) {
				anInt2444 = 1;
				if (anInt2442 == 0 || anInt2442 > var3 - anInt2436) {
					anInt2442 = var3 - anInt2436;
				}
			} else if (anInt2436 > var3) {
				anInt2444 = -1;
				if (anInt2442 == 0 || anInt2442 > anInt2436 - var3) {
					anInt2442 = anInt2436 - var3;
				}
			} else {
				anInt2444 = 0;
			}

			if (anInt2431 < var2) {
				anInt2445 = 1;
				if (anInt2442 == 0 || anInt2442 > var2 - anInt2431) {
					anInt2442 = var2 - anInt2431;
				}
			} else if (anInt2431 > var2) {
				anInt2445 = -1;
				if (anInt2442 == 0 || anInt2442 > anInt2431 - var2) {
					anInt2442 = anInt2431 - var2;
				}
			} else {
				anInt2445 = 0;
			}

			return false;
		}
	}

	void method2708() {
		anInt2435 = anInt2439;
		anInt2436 = method2819(anInt2439, anInt2432);
		anInt2431 = method2704(anInt2439, anInt2432);
	}

	public synchronized void method2709(int var1) {
		anInt2438 = var1;
	}

	public synchronized void method2710(int var1) {
		method2712(var1 << 6, method2825());
	}

	synchronized void method2711(int var1) {
		method2712(var1, method2825());
	}

	synchronized void method2712(int var1, int var2) {
		anInt2439 = var1;
		anInt2432 = var2;
		anInt2442 = 0;
		method2708();
	}

	public synchronized int method2713() {
		return anInt2439 == Integer.MIN_VALUE ? 0 : anInt2439;
	}

	protected int method1869() {
		return anInt2439 == 0 && anInt2442 == 0 ? 0 : 1;
	}

	public synchronized void method2714(boolean var1) {
		anInt2441 = (anInt2441 ^ anInt2441 >> 31) + (anInt2441 >>> 31);
		if (var1) {
			anInt2441 = -anInt2441;
		}

	}

	void method2715() {
		if (anInt2442 != 0) {
			if (anInt2439 == Integer.MIN_VALUE) {
				anInt2439 = 0;
			}

			anInt2442 = 0;
			method2708();
		}

	}

	public synchronized void method2716(int var1, int var2) {
		method2802(var1, var2, method2825());
	}

	public synchronized int method2720() {
		return anInt2441 < 0 ? -anInt2441 : anInt2441;
	}

	protected Class117_Sub2 method1848() {
		return null;
	}

	public boolean method2721() {
		return anInt2442 != 0;
	}

	static int method2723(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, Class117_Sub2_Sub2 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var4 + var11 - var3) > var10) {
			var9 = var10;
		}

		var12.anInt2435 += var12.anInt2443 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.anInt2436 = var5 >> 2;
		var12.anInt2431 = var6 >> 2;
		var12.anInt2433 = var3 << 8;
		return var4 >> 1;
	}

	public synchronized void method1851(int[] var1, int var2, int var3) {
		if (anInt2439 == 0 && anInt2442 == 0) {
			method1852(var3);
		} else {
			Class117_Sub4_Sub1 var6 = (Class117_Sub4_Sub1) aClass117_Sub4_1682;
			int var5 = anInt2434 << 8;
			int var4 = anInt2440 << 8;
			int var7 = var6.aByteArray2423.length << 8;
			int var9 = var4 - var5;
			if (var9 <= 0) {
				anInt2438 = 0;
			}

			int var10 = var2;
			var3 += var2;
			if (anInt2433 < 0) {
				if (anInt2441 <= 0) {
					method2715();
					method1532();
					return;
				}

				anInt2433 = 0;
			}

			if (anInt2433 >= var7) {
				if (anInt2441 >= 0) {
					method2715();
					method1532();
					return;
				}

				anInt2433 = var7 - 1;
			}

			if (anInt2438 < 0) {
				if (aBool2437) {
					if (anInt2441 < 0) {
						var10 = method2726(var1, var2, var5, var3, var6.aByteArray2423[anInt2434]);
						if (anInt2433 >= var5) {
							return;
						}

						anInt2433 = var5 + var5 - 1 - anInt2433;
						anInt2441 = -anInt2441;
					}

					while (true) {
						var10 = method2725(var1, var10, var4, var3, var6.aByteArray2423[anInt2440 - 1]);
						if (anInt2433 < var4) {
							return;
						}

						anInt2433 = var4 + var4 - 1 - anInt2433;
						anInt2441 = -anInt2441;
						var10 = method2726(var1, var10, var5, var3, var6.aByteArray2423[anInt2434]);
						if (anInt2433 >= var5) {
							return;
						}

						anInt2433 = var5 + var5 - 1 - anInt2433;
						anInt2441 = -anInt2441;
					}
				} else if (anInt2441 < 0) {
					while (true) {
						var10 = method2726(var1, var10, var5, var3, var6.aByteArray2423[anInt2440 - 1]);
						if (anInt2433 >= var5) {
							return;
						}

						anInt2433 = var4 - 1 - (var4 - 1 - anInt2433) % var9;
					}
				} else {
					while (true) {
						var10 = method2725(var1, var10, var4, var3, var6.aByteArray2423[anInt2434]);
						if (anInt2433 < var4) {
							return;
						}

						anInt2433 = var5 + (anInt2433 - var5) % var9;
					}
				}
			} else {
				if (anInt2438 > 0) {
					if (aBool2437) {
						label170:
						{
							if (anInt2441 < 0) {
								var10 = method2726(var1, var2, var5, var3, var6.aByteArray2423[anInt2434]);
								if (anInt2433 >= var5) {
									return;
								}

								anInt2433 = var5 + var5 - 1 - anInt2433;
								anInt2441 = -anInt2441;
								if (--anInt2438 == 0) {
									break label170;
								}
							}

							do {
								var10 = method2725(var1, var10, var4, var3, var6.aByteArray2423[anInt2440 - 1]);
								if (anInt2433 < var4) {
									return;
								}

								anInt2433 = var4 + var4 - 1 - anInt2433;
								anInt2441 = -anInt2441;
								if (--anInt2438 == 0) {
									break;
								}

								var10 = method2726(var1, var10, var5, var3, var6.aByteArray2423[anInt2434]);
								if (anInt2433 >= var5) {
									return;
								}

								anInt2433 = var5 + var5 - 1 - anInt2433;
								anInt2441 = -anInt2441;
							} while (--anInt2438 != 0);
						}
					} else {
						int var8;
						if (anInt2441 < 0) {
							while (true) {
								var10 = method2726(var1, var10, var5, var3, var6.aByteArray2423[anInt2440 - 1]);
								if (anInt2433 >= var5) {
									return;
								}

								var8 = (var4 - 1 - anInt2433) / var9;
								if (var8 >= anInt2438) {
									anInt2433 += var9 * anInt2438;
									anInt2438 = 0;
									break;
								}

								anInt2433 += var9 * var8;
								anInt2438 -= var8;
							}
						} else {
							while (true) {
								var10 = method2725(var1, var10, var4, var3, var6.aByteArray2423[anInt2434]);
								if (anInt2433 < var4) {
									return;
								}

								var8 = (anInt2433 - var5) / var9;
								if (var8 >= anInt2438) {
									anInt2433 -= var9 * anInt2438;
									anInt2438 = 0;
									break;
								}

								anInt2433 -= var9 * var8;
								anInt2438 -= var8;
							}
						}
					}
				}

				if (anInt2441 < 0) {
					method2726(var1, var10, 0, var3, 0);
					if (anInt2433 < 0) {
						anInt2433 = -1;
						method2715();
						method1532();
					}
				} else {
					method2725(var1, var10, var7, var3, 0);
					if (anInt2433 >= var7) {
						anInt2433 = var7;
						method2715();
						method1532();
					}
				}

			}
		}
	}

	public synchronized void method1852(int var1) {
		if (anInt2442 > 0) {
			if (var1 >= anInt2442) {
				if (anInt2439 == Integer.MIN_VALUE) {
					anInt2439 = 0;
					anInt2431 = 0;
					anInt2436 = 0;
					anInt2435 = 0;
					method1532();
					var1 = anInt2442;
				}

				anInt2442 = 0;
				method2708();
			} else {
				anInt2435 += anInt2443 * var1;
				anInt2436 += anInt2444 * var1;
				anInt2431 += anInt2445 * var1;
				anInt2442 -= var1;
			}
		}

		Class117_Sub4_Sub1 var2 = (Class117_Sub4_Sub1) aClass117_Sub4_1682;
		int var6 = anInt2434 << 8;
		int var4 = anInt2440 << 8;
		int var3 = var2.aByteArray2423.length << 8;
		int var7 = var4 - var6;
		if (var7 <= 0) {
			anInt2438 = 0;
		}

		if (anInt2433 < 0) {
			if (anInt2441 <= 0) {
				method2715();
				method1532();
				return;
			}

			anInt2433 = 0;
		}

		if (anInt2433 >= var3) {
			if (anInt2441 >= 0) {
				method2715();
				method1532();
				return;
			}

			anInt2433 = var3 - 1;
		}

		anInt2433 += anInt2441 * var1;
		if (anInt2438 < 0) {
			if (!aBool2437) {
				if (anInt2441 < 0) {
					if (anInt2433 >= var6) {
						return;
					}

					anInt2433 = var4 - 1 - (var4 - 1 - anInt2433) % var7;
				} else {
					if (anInt2433 < var4) {
						return;
					}

					anInt2433 = var6 + (anInt2433 - var6) % var7;
				}

			} else {
				if (anInt2441 < 0) {
					if (anInt2433 >= var6) {
						return;
					}

					anInt2433 = var6 + var6 - 1 - anInt2433;
					anInt2441 = -anInt2441;
				}

				while (anInt2433 >= var4) {
					anInt2433 = var4 + var4 - 1 - anInt2433;
					anInt2441 = -anInt2441;
					if (anInt2433 >= var6) {
						return;
					}

					anInt2433 = var6 + var6 - 1 - anInt2433;
					anInt2441 = -anInt2441;
				}

			}
		} else {
			if (anInt2438 > 0) {
				if (aBool2437) {
					label169:
					{
						if (anInt2441 < 0) {
							if (anInt2433 >= var6) {
								return;
							}

							anInt2433 = var6 + var6 - 1 - anInt2433;
							anInt2441 = -anInt2441;
							if (--anInt2438 == 0) {
								break label169;
							}
						}

						do {
							if (anInt2433 < var4) {
								return;
							}

							anInt2433 = var4 + var4 - 1 - anInt2433;
							anInt2441 = -anInt2441;
							if (--anInt2438 == 0) {
								break;
							}

							if (anInt2433 >= var6) {
								return;
							}

							anInt2433 = var6 + var6 - 1 - anInt2433;
							anInt2441 = -anInt2441;
						} while (--anInt2438 != 0);
					}
				} else {
					label201:
					{
						int var5;
						if (anInt2441 < 0) {
							if (anInt2433 >= var6) {
								return;
							}

							var5 = (var4 - 1 - anInt2433) / var7;
							if (var5 >= anInt2438) {
								anInt2433 += var7 * anInt2438;
								anInt2438 = 0;
								break label201;
							}

							anInt2433 += var7 * var5;
							anInt2438 -= var5;
						} else {
							if (anInt2433 < var4) {
								return;
							}

							var5 = (anInt2433 - var6) / var7;
							if (var5 >= anInt2438) {
								anInt2433 -= var7 * anInt2438;
								anInt2438 = 0;
								break label201;
							}

							anInt2433 -= var7 * var5;
							anInt2438 -= var5;
						}

						return;
					}
				}
			}

			if (anInt2441 < 0) {
				if (anInt2433 < 0) {
					anInt2433 = -1;
					method2715();
					method1532();
				}
			} else if (anInt2433 >= var3) {
				anInt2433 = var3;
				method2715();
				method1532();
			}

		}
	}

	int method2725(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (anInt2442 > 0) {
				int var6 = var2 + anInt2442;
				if (var6 > var4) {
					var6 = var4;
				}

				anInt2442 += var2;
				if (anInt2441 == 256 && (anInt2433 & 255) == 0) {
					if (Class130.aBool1588) {
						var2 = method2723(0, ((Class117_Sub4_Sub1) aClass117_Sub4_1682).aByteArray2423, var1, anInt2433, var2, anInt2436, anInt2431, anInt2444, anInt2445, 0, var6, var3, this);
					} else {
						var2 = method2735(((Class117_Sub4_Sub1) aClass117_Sub4_1682).aByteArray2423, var1, anInt2433, var2, anInt2435, anInt2443, 0, var6, var3, this);
					}
				} else if (Class130.aBool1588) {
					var2 = method2788(0, 0, ((Class117_Sub4_Sub1) aClass117_Sub4_1682).aByteArray2423, var1, anInt2433, var2, anInt2436, anInt2431, anInt2444, anInt2445, 0, var6, var3, this, anInt2441, var5);
				} else {
					var2 = method2790(0, 0, ((Class117_Sub4_Sub1) aClass117_Sub4_1682).aByteArray2423, var1, anInt2433, var2, anInt2435, anInt2443, 0, var6, var3, this, anInt2441, var5);
				}

				anInt2442 -= var2;
				if (anInt2442 != 0) {
					return var2;
				}

				if (!method2707()) {
					continue;
				}

				return var4;
			}

			if (anInt2441 == 256 && (anInt2433 & 255) == 0) {
				if (Class130.aBool1588) {
					return method2729(0, ((Class117_Sub4_Sub1) aClass117_Sub4_1682).aByteArray2423, var1, anInt2433, var2, anInt2436, anInt2431, 0, var4, var3, this);
				}

				return method2728(((Class117_Sub4_Sub1) aClass117_Sub4_1682).aByteArray2423, var1, anInt2433, var2, anInt2435, 0, var4, var3, this);
			}

			if (Class130.aBool1588) {
				return method2760(0, 0, ((Class117_Sub4_Sub1) aClass117_Sub4_1682).aByteArray2423, var1, anInt2433, var2, anInt2436, anInt2431, 0, var4, var3, this, anInt2441, var5);
			}

			return method2732(0, 0, ((Class117_Sub4_Sub1) aClass117_Sub4_1682).aByteArray2423, var1, anInt2433, var2, anInt2435, 0, var4, var3, this, anInt2441, var5);
		}
	}

	int method2726(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (anInt2442 > 0) {
				int var6 = var2 + anInt2442;
				if (var6 > var4) {
					var6 = var4;
				}

				anInt2442 += var2;
				if (anInt2441 == -256 && (anInt2433 & 255) == 0) {
					if (Class130.aBool1588) {
						var2 = method2738(0, ((Class117_Sub4_Sub1) aClass117_Sub4_1682).aByteArray2423, var1, anInt2433, var2, anInt2436, anInt2431, anInt2444, anInt2445, 0, var6, var3, this);
					} else {
						var2 = method2737(((Class117_Sub4_Sub1) aClass117_Sub4_1682).aByteArray2423, var1, anInt2433, var2, anInt2435, anInt2443, 0, var6, var3, this);
					}
				} else if (Class130.aBool1588) {
					var2 = method2742(0, 0, ((Class117_Sub4_Sub1) aClass117_Sub4_1682).aByteArray2423, var1, anInt2433, var2, anInt2436, anInt2431, anInt2444, anInt2445, 0, var6, var3, this, anInt2441, var5);
				} else {
					var2 = method2741(0, 0, ((Class117_Sub4_Sub1) aClass117_Sub4_1682).aByteArray2423, var1, anInt2433, var2, anInt2435, anInt2443, 0, var6, var3, this, anInt2441, var5);
				}

				anInt2442 -= var2;
				if (anInt2442 != 0) {
					return var2;
				}

				if (!method2707()) {
					continue;
				}

				return var4;
			}

			if (anInt2441 == -256 && (anInt2433 & 255) == 0) {
				if (Class130.aBool1588) {
					return method2811(0, ((Class117_Sub4_Sub1) aClass117_Sub4_1682).aByteArray2423, var1, anInt2433, var2, anInt2436, anInt2431, 0, var4, var3, this);
				}

				return method2730(((Class117_Sub4_Sub1) aClass117_Sub4_1682).aByteArray2423, var1, anInt2433, var2, anInt2435, 0, var4, var3, this);
			}

			if (Class130.aBool1588) {
				return method2806(0, 0, ((Class117_Sub4_Sub1) aClass117_Sub4_1682).aByteArray2423, var1, anInt2433, var2, anInt2436, anInt2431, 0, var4, var3, this, anInt2441, var5);
			}

			return method2734(0, 0, ((Class117_Sub4_Sub1) aClass117_Sub4_1682).aByteArray2423, var1, anInt2433, var2, anInt2435, 0, var4, var3, this, anInt2441, var5);
		}
	}

	static int method2728(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, Class117_Sub2_Sub2 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var7 - var2) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
		}

		var8.anInt2433 = var2 << 8;
		return var3;
	}

	static int method2729(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Class117_Sub2_Sub2 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var9 - var3) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.anInt2433 = var3 << 8;
		return var4 >> 1;
	}

	static int method2730(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, Class117_Sub2_Sub2 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
		}

		var8.anInt2433 = var2 << 8;
		return var3;
	}

	public static Class117_Sub2_Sub2 method2731(Class117_Sub4_Sub1 var0, int var1, int var2, int var3) {
		return var0.aByteArray2423 != null && var0.aByteArray2423.length != 0 ? new Class117_Sub2_Sub2(var0, var1, var2, var3) : null;
	}

	static int method2732(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, Class117_Sub2_Sub2 var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
			var7 = var8;
		}

		byte var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
			var7 = var8;
		}

		for (var1 = var12; var5 < var7; var4 += var11) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
		}

		var10.anInt2433 = var4;
		return var5;
	}

	static int method2734(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, Class117_Sub2_Sub2 var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
			var7 = var8;
		}

		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			byte var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
			var7 = var8;
		}

		var0 = var12;

		for (var1 = var11; var5 < var7; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
		}

		var10.anInt2433 = var4;
		return var5;
	}

	static int method2735(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Class117_Sub2_Sub2 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.anInt2436 += var9.anInt2444 * (var6 - var3);
		var9.anInt2431 += var9.anInt2445 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		var9.anInt2435 = var4 >> 2;
		var9.anInt2433 = var2 << 8;
		return var3;
	}

	static int method2737(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Class117_Sub2_Sub2 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.anInt2436 += var9.anInt2444 * (var6 - var3);
		var9.anInt2431 += var9.anInt2445 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		var9.anInt2435 = var4 >> 2;
		var9.anInt2433 = var2 << 8;
		return var3;
	}

	static int method2738(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, Class117_Sub2_Sub2 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.anInt2435 += var12.anInt2443 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.anInt2436 = var5 >> 2;
		var12.anInt2431 = var6 >> 2;
		var12.anInt2433 = var3 << 8;
		return var4 >> 1;
	}

	static int method2741(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class117_Sub2_Sub2 var11, int var12, int var13) {
		var11.anInt2436 -= var11.anInt2444 * var5;
		var11.anInt2431 -= var11.anInt2445 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var0 = var13;

		for (var1 = var12; var5 < var8; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.anInt2436 += var11.anInt2444 * var5;
		var11.anInt2431 += var11.anInt2445 * var5;
		var11.anInt2435 = var6;
		var11.anInt2433 = var4;
		return var5;
	}

	static int method2742(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class117_Sub2_Sub2 var13, int var14, int var15) {
		var13.anInt2435 -= var13.anInt2443 * var5;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			byte var16 = var2[var1 - 1];
			var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.anInt2435 += var13.anInt2443 * var5;
		var13.anInt2436 = var6;
		var13.anInt2431 = var7;
		var13.anInt2433 = var4;
		return var5;
	}

	public synchronized void method2752(int var1) {
		int var2 = ((Class117_Sub4_Sub1) aClass117_Sub4_1682).aByteArray2423.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		anInt2433 = var1;
	}

	static int method2760(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class117_Sub2_Sub2 var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.anInt2433 = var4;
		return var5 >> 1;
	}

	public synchronized void method2782(int var1) {
		if (var1 == 0) {
			method2711(0);
			method1532();
		} else if (anInt2436 == 0 && anInt2431 == 0) {
			anInt2442 = 0;
			anInt2439 = 0;
			anInt2435 = 0;
			method1532();
		} else {
			int var2 = -anInt2435;
			if (anInt2435 > var2) {
				var2 = anInt2435;
			}

			if (-anInt2436 > var2) {
				var2 = -anInt2436;
			}

			if (anInt2436 > var2) {
				var2 = anInt2436;
			}

			if (-anInt2431 > var2) {
				var2 = -anInt2431;
			}

			if (anInt2431 > var2) {
				var2 = anInt2431;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			anInt2442 = var1;
			anInt2439 = Integer.MIN_VALUE;
			anInt2443 = -anInt2435 / var1;
			anInt2444 = -anInt2436 / var1;
			anInt2445 = -anInt2431 / var1;
		}
	}

	static int method2788(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class117_Sub2_Sub2 var13, int var14, int var15) {
		var13.anInt2435 -= var13.anInt2443 * var5;
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.anInt2435 += var13.anInt2443 * var5;
		var13.anInt2436 = var6;
		var13.anInt2431 = var7;
		var13.anInt2433 = var4;
		return var5;
	}

	static int method2790(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class117_Sub2_Sub2 var11, int var12, int var13) {
		var11.anInt2436 -= var11.anInt2444 * var5;
		var11.anInt2431 -= var11.anInt2445 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		byte var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.anInt2436 += var11.anInt2444 * var5;
		var11.anInt2431 += var11.anInt2445 * var5;
		var11.anInt2435 = var6;
		var11.anInt2433 = var4;
		return var5;
	}

	Class117_Sub2_Sub2(Class117_Sub4_Sub1 var1, int var2, int var3) {
		aClass117_Sub4_1682 = var1;
		anInt2434 = var1.anInt2422;
		anInt2440 = var1.anInt2424;
		aBool2437 = var1.aBool2426;
		anInt2441 = var2;
		anInt2439 = var3;
		anInt2432 = 8192;
		anInt2433 = 0;
		method2708();
	}

	public synchronized void method2802(int var1, int var2, int var3) {
		if (var1 == 0) {
			method2712(var2, var3);
		} else {
			int var6 = method2819(var2, var3);
			int var5 = method2704(var2, var3);
			if (anInt2436 == var6 && anInt2431 == var5) {
				anInt2442 = 0;
			} else {
				int var4 = var2 - anInt2435;
				if (anInt2435 - var2 > var4) {
					var4 = anInt2435 - var2;
				}

				if (var6 - anInt2436 > var4) {
					var4 = var6 - anInt2436;
				}

				if (anInt2436 - var6 > var4) {
					var4 = anInt2436 - var6;
				}

				if (var5 - anInt2431 > var4) {
					var4 = var5 - anInt2431;
				}

				if (anInt2431 - var5 > var4) {
					var4 = anInt2431 - var5;
				}

				if (var1 > var4) {
					var1 = var4;
				}

				anInt2442 = var1;
				anInt2439 = var2;
				anInt2432 = var3;
				anInt2443 = (var2 - anInt2435) / var1;
				anInt2444 = (var6 - anInt2436) / var1;
				anInt2445 = (var5 - anInt2431) / var1;
			}
		}
	}

	static int method2806(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class117_Sub2_Sub2 var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.anInt2433 = var4;
		return var5 >> 1;
	}

	protected Class117_Sub2 method1859() {
		return null;
	}

	static int method2811(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Class117_Sub2_Sub2 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.anInt2433 = var3 << 8;
		return var4 >> 1;
	}

	public boolean method2813() {
		return anInt2433 < 0 || anInt2433 >= ((Class117_Sub4_Sub1) aClass117_Sub4_1682).aByteArray2423.length << 8;
	}

	static int method2819(int var0, int var1) {
		return var1 >= 0 ? (int) ((double) var0 * Math.sqrt((double) (16384 - var1) * 1.220703125E-4D) + 0.5D) : var0;
	}

	public synchronized int method2825() {
		return anInt2432 >= 0 ? anInt2432 : -1;
	}

}
