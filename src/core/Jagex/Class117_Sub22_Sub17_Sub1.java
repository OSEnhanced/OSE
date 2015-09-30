package core.Jagex;
public class Class117_Sub22_Sub17_Sub1 extends Class117_Sub22_Sub17 {

	static final int anInt2632 = 14;
	static final int anInt2635 = 50;
	static final int anInt2638 = 3500;
	static final int anInt2641 = 3;
	static int anInt2642;
	static int anInt2652;
	static int[] anIntArray2648 = new int[1024];
	static int anInt2649;
	static int anInt2637;
	static int anInt2636;
	static int anInt2645;
	static int anInt2646;
	static int anInt2647;
	public static Interface2 anInterface2_2650;
	static boolean aBool2640 = false;
	static boolean aBool2633 = false;
	static boolean aBool2631 = false;
	public static boolean aBool2630 = true;
	static int anInt2634 = 0;
	public static int anInt2639 = 512;
	public static int[] anIntArray2643 = new int[65536];
	static int[] anIntArray2651 = new int[512];
	static int[] anIntArray2644 = new int[2048];
	public static int[] anIntArray2653 = new int[2048];
	public static int[] anIntArray2654 = new int[2048];

	static void method3093(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (aBool2640) {
			if (var5 > anInt2642) {
				var5 = anInt2642;
			}

			if (var4 < 0) {
				var4 = 0;
			}
		}

		if (var4 < var5) {
			var1 += var4;
			var6 += var7 * var4;
			int var8;
			int var9;
			int var10;
			if (aBool2630) {
				var3 = var5 - var4 >> 2;
				var7 <<= 2;
				if (anInt2634 == 0) {
					if (var3 > 0) {
						do {
							var2 = anIntArray2643[var6 >> 8];
							var6 += var7;
							var0[var1++] = var2;
							var0[var1++] = var2;
							var0[var1++] = var2;
							var0[var1++] = var2;
							--var3;
						} while (var3 > 0);
					}

					var3 = var5 - var4 & 3;
					if (var3 > 0) {
						var2 = anIntArray2643[var6 >> 8];

						do {
							var0[var1++] = var2;
							--var3;
						} while (var3 > 0);
					}
				} else {
					var9 = anInt2634;
					var10 = 256 - anInt2634;
					if (var3 > 0) {
						do {
							var2 = anIntArray2643[var6 >> 8];
							var6 += var7;
							var2 = ((var2 & 16711935) * var10 >> 8 & 16711935) + ((var2 & 65280) * var10 >> 8 & 65280);
							var8 = var0[var1];
							var0[var1++] = var2 + ((var8 & 16711935) * var9 >> 8 & 16711935) + ((var8 & 65280) * var9 >> 8 & 65280);
							var8 = var0[var1];
							var0[var1++] = var2 + ((var8 & 16711935) * var9 >> 8 & 16711935) + ((var8 & 65280) * var9 >> 8 & 65280);
							var8 = var0[var1];
							var0[var1++] = var2 + ((var8 & 16711935) * var9 >> 8 & 16711935) + ((var8 & 65280) * var9 >> 8 & 65280);
							var8 = var0[var1];
							var0[var1++] = var2 + ((var8 & 16711935) * var9 >> 8 & 16711935) + ((var8 & 65280) * var9 >> 8 & 65280);
							--var3;
						} while (var3 > 0);
					}

					var3 = var5 - var4 & 3;
					if (var3 > 0) {
						var2 = anIntArray2643[var6 >> 8];
						var2 = ((var2 & 16711935) * var10 >> 8 & 16711935) + ((var2 & 65280) * var10 >> 8 & 65280);

						do {
							var8 = var0[var1];
							var0[var1++] = var2 + ((var8 & 16711935) * var9 >> 8 & 16711935) + ((var8 & 65280) * var9 >> 8 & 65280);
							--var3;
						} while (var3 > 0);
					}
				}

			} else {
				var3 = var5 - var4;
				if (anInt2634 == 0) {
					do {
						var0[var1++] = anIntArray2643[var6 >> 8];
						var6 += var7;
						--var3;
					} while (var3 > 0);
				} else {
					var9 = anInt2634;
					var10 = 256 - anInt2634;

					do {
						var2 = anIntArray2643[var6 >> 8];
						var6 += var7;
						var2 = ((var2 & 16711935) * var10 >> 8 & 16711935) + ((var2 & 65280) * var10 >> 8 & 65280);
						var8 = var0[var1];
						var0[var1++] = var2 + ((var8 & 16711935) * var9 >> 8 & 16711935) + ((var8 & 65280) * var9 >> 8 & 65280);
						--var3;
					} while (var3 > 0);
				}

			}
		}
	}

	static void method3094(int var0, int var1, int var2, int var3) {
		anInt2642 = var2 - var0;
		anInt2652 = var3 - var1;
		method3131();
		if (anIntArray2648.length < anInt2652) {
			anIntArray2648 = new int[Class57.method870(anInt2652, (byte) 95)];
		}

		int var5 = var1 * anInt2462 + var0;

		for (int var4 = 0; var4 < anInt2652; var4++) {
			anIntArray2648[var4] = var5;
			var5 += anInt2462;
		}

	}

	public static void method3095() {
		method3094(anInt2464, anInt2465, anInt2460, anInt2463);
	}

	public static void method3096(int var0, int var1) {
		int var2 = anIntArray2648[0];
		int var3 = var2 / anInt2462;
		int var4 = var2 - var3 * anInt2462;
		anInt2649 = var0 - var4;
		anInt2637 = var1 - var3;
		anInt2636 = -anInt2649;
		anInt2645 = anInt2642 - anInt2649;
		anInt2646 = -anInt2637;
		anInt2647 = anInt2652 - anInt2637;
	}

	public static void method3097(Interface2 var0) {
		anInterface2_2650 = var0;
	}

	public static void method3098(double var0) {
		method3109(var0, 0, 512);
	}

	static int method3100(int var0, double var1) {
		double var3 = (double) (var0 >> 16) / 256.0D;
		double var5 = (double) (var0 >> 8 & 255) / 256.0D;
		double var8 = (double) (var0 & 255) / 256.0D;
		var3 = Math.pow(var3, var1);
		var5 = Math.pow(var5, var1);
		var8 = Math.pow(var8, var1);
		int var10 = (int) (var3 * 256.0D);
		int var7 = (int) (var5 * 256.0D);
		int var11 = (int) (var8 * 256.0D);
		return (var10 << 16) + (var7 << 8) + var11;
	}

	public static void method3101(int var0, int var1, int var2) {
		aBool2640 = var0 < 0 || var0 > anInt2642 || var1 < 0 || var1 > anInt2642 || var2 < 0 || var2 > anInt2642;
	}

	public static void method3104(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = 0;
		if (var1 != var0) {
			var7 = (var4 - var3 << 14) / (var1 - var0);
		}

		int var8 = 0;
		if (var2 != var1) {
			var8 = (var5 - var4 << 14) / (var2 - var1);
		}

		int var9 = 0;
		if (var2 != var0) {
			var9 = (var3 - var5 << 14) / (var0 - var2);
		}

		if (var0 <= var1 && var0 <= var2) {
			if (var0 < anInt2652) {
				if (var1 > anInt2652) {
					var1 = anInt2652;
				}

				if (var2 > anInt2652) {
					var2 = anInt2652;
				}

				if (var1 < var2) {
					var5 = var3 <<= 14;
					if (var0 < 0) {
						var5 -= var9 * var0;
						var3 -= var7 * var0;
						var0 = 0;
					}

					var4 <<= 14;
					if (var1 < 0) {
						var4 -= var8 * var1;
						var1 = 0;
					}

					if (var0 != var1 && var9 < var7 || var0 == var1 && var9 > var8) {
						var2 -= var1;
						var1 -= var0;
						var0 = anIntArray2648[var0];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method3105(anIntArray2459, var0, var6, 0, var5 >> 14, var4 >> 14);
									var5 += var9;
									var4 += var8;
									var0 += anInt2462;
								}
							}

							method3105(anIntArray2459, var0, var6, 0, var5 >> 14, var3 >> 14);
							var5 += var9;
							var3 += var7;
							var0 += anInt2462;
						}
					} else {
						var2 -= var1;
						var1 -= var0;
						var0 = anIntArray2648[var0];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method3105(anIntArray2459, var0, var6, 0, var4 >> 14, var5 >> 14);
									var5 += var9;
									var4 += var8;
									var0 += anInt2462;
								}
							}

							method3105(anIntArray2459, var0, var6, 0, var3 >> 14, var5 >> 14);
							var5 += var9;
							var3 += var7;
							var0 += anInt2462;
						}
					}
				} else {
					var4 = var3 <<= 14;
					if (var0 < 0) {
						var4 -= var9 * var0;
						var3 -= var7 * var0;
						var0 = 0;
					}

					var5 <<= 14;
					if (var2 < 0) {
						var5 -= var8 * var2;
						var2 = 0;
					}

					if ((var0 == var2 || var9 >= var7) && (var0 != var2 || var8 <= var7)) {
						var1 -= var2;
						var2 -= var0;
						var0 = anIntArray2648[var0];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method3105(anIntArray2459, var0, var6, 0, var3 >> 14, var5 >> 14);
									var5 += var8;
									var3 += var7;
									var0 += anInt2462;
								}
							}

							method3105(anIntArray2459, var0, var6, 0, var3 >> 14, var4 >> 14);
							var4 += var9;
							var3 += var7;
							var0 += anInt2462;
						}
					} else {
						var1 -= var2;
						var2 -= var0;
						var0 = anIntArray2648[var0];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method3105(anIntArray2459, var0, var6, 0, var5 >> 14, var3 >> 14);
									var5 += var8;
									var3 += var7;
									var0 += anInt2462;
								}
							}

							method3105(anIntArray2459, var0, var6, 0, var4 >> 14, var3 >> 14);
							var4 += var9;
							var3 += var7;
							var0 += anInt2462;
						}
					}
				}
			}
		} else if (var1 <= var2) {
			if (var1 < anInt2652) {
				if (var2 > anInt2652) {
					var2 = anInt2652;
				}

				if (var0 > anInt2652) {
					var0 = anInt2652;
				}

				if (var2 < var0) {
					var3 = var4 <<= 14;
					if (var1 < 0) {
						var3 -= var7 * var1;
						var4 -= var8 * var1;
						var1 = 0;
					}

					var5 <<= 14;
					if (var2 < 0) {
						var5 -= var9 * var2;
						var2 = 0;
					}

					if (var1 != var2 && var7 < var8 || var1 == var2 && var7 > var9) {
						var0 -= var2;
						var2 -= var1;
						var1 = anIntArray2648[var1];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									method3105(anIntArray2459, var1, var6, 0, var3 >> 14, var5 >> 14);
									var3 += var7;
									var5 += var9;
									var1 += anInt2462;
								}
							}

							method3105(anIntArray2459, var1, var6, 0, var3 >> 14, var4 >> 14);
							var3 += var7;
							var4 += var8;
							var1 += anInt2462;
						}
					} else {
						var0 -= var2;
						var2 -= var1;
						var1 = anIntArray2648[var1];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									method3105(anIntArray2459, var1, var6, 0, var5 >> 14, var3 >> 14);
									var3 += var7;
									var5 += var9;
									var1 += anInt2462;
								}
							}

							method3105(anIntArray2459, var1, var6, 0, var4 >> 14, var3 >> 14);
							var3 += var7;
							var4 += var8;
							var1 += anInt2462;
						}
					}
				} else {
					var5 = var4 <<= 14;
					if (var1 < 0) {
						var5 -= var7 * var1;
						var4 -= var8 * var1;
						var1 = 0;
					}

					var3 <<= 14;
					if (var0 < 0) {
						var3 -= var9 * var0;
						var0 = 0;
					}

					if (var7 < var8) {
						var2 -= var0;
						var0 -= var1;
						var1 = anIntArray2648[var1];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method3105(anIntArray2459, var1, var6, 0, var3 >> 14, var4 >> 14);
									var3 += var9;
									var4 += var8;
									var1 += anInt2462;
								}
							}

							method3105(anIntArray2459, var1, var6, 0, var5 >> 14, var4 >> 14);
							var5 += var7;
							var4 += var8;
							var1 += anInt2462;
						}
					} else {
						var2 -= var0;
						var0 -= var1;
						var1 = anIntArray2648[var1];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method3105(anIntArray2459, var1, var6, 0, var4 >> 14, var3 >> 14);
									var3 += var9;
									var4 += var8;
									var1 += anInt2462;
								}
							}

							method3105(anIntArray2459, var1, var6, 0, var4 >> 14, var5 >> 14);
							var5 += var7;
							var4 += var8;
							var1 += anInt2462;
						}
					}
				}
			}
		} else if (var2 < anInt2652) {
			if (var0 > anInt2652) {
				var0 = anInt2652;
			}

			if (var1 > anInt2652) {
				var1 = anInt2652;
			}

			if (var0 < var1) {
				var4 = var5 <<= 14;
				if (var2 < 0) {
					var4 -= var8 * var2;
					var5 -= var9 * var2;
					var2 = 0;
				}

				var3 <<= 14;
				if (var0 < 0) {
					var3 -= var7 * var0;
					var0 = 0;
				}

				if (var8 < var9) {
					var1 -= var0;
					var0 -= var2;
					var2 = anIntArray2648[var2];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								method3105(anIntArray2459, var2, var6, 0, var4 >> 14, var3 >> 14);
								var4 += var8;
								var3 += var7;
								var2 += anInt2462;
							}
						}

						method3105(anIntArray2459, var2, var6, 0, var4 >> 14, var5 >> 14);
						var4 += var8;
						var5 += var9;
						var2 += anInt2462;
					}
				} else {
					var1 -= var0;
					var0 -= var2;
					var2 = anIntArray2648[var2];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								method3105(anIntArray2459, var2, var6, 0, var3 >> 14, var4 >> 14);
								var4 += var8;
								var3 += var7;
								var2 += anInt2462;
							}
						}

						method3105(anIntArray2459, var2, var6, 0, var5 >> 14, var4 >> 14);
						var4 += var8;
						var5 += var9;
						var2 += anInt2462;
					}
				}
			} else {
				var3 = var5 <<= 14;
				if (var2 < 0) {
					var3 -= var8 * var2;
					var5 -= var9 * var2;
					var2 = 0;
				}

				var4 <<= 14;
				if (var1 < 0) {
					var4 -= var7 * var1;
					var1 = 0;
				}

				if (var8 < var9) {
					var0 -= var1;
					var1 -= var2;
					var2 = anIntArray2648[var2];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								method3105(anIntArray2459, var2, var6, 0, var4 >> 14, var5 >> 14);
								var4 += var7;
								var5 += var9;
								var2 += anInt2462;
							}
						}

						method3105(anIntArray2459, var2, var6, 0, var3 >> 14, var5 >> 14);
						var3 += var8;
						var5 += var9;
						var2 += anInt2462;
					}
				} else {
					var0 -= var1;
					var1 -= var2;
					var2 = anIntArray2648[var2];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								method3105(anIntArray2459, var2, var6, 0, var5 >> 14, var4 >> 14);
								var4 += var7;
								var5 += var9;
								var2 += anInt2462;
							}
						}

						method3105(anIntArray2459, var2, var6, 0, var5 >> 14, var3 >> 14);
						var3 += var8;
						var5 += var9;
						var2 += anInt2462;
					}
				}
			}
		}
	}

	static void method3105(int[] var0, int var1, int var2, int var3, int var4, int var5) {
		if (aBool2640) {
			if (var5 > anInt2642) {
				var5 = anInt2642;
			}

			if (var4 < 0) {
				var4 = 0;
			}
		}

		if (var4 < var5) {
			var1 += var4;
			var3 = var5 - var4 >> 2;
			if (anInt2634 != 0) {
				if (anInt2634 == 254) {
					while (true) {
						--var3;
						if (var3 < 0) {
							var3 = var5 - var4 & 3;

							while (true) {
								--var3;
								if (var3 < 0) {
									return;
								}

								var0[var1++] = var0[var1];
							}
						}

						var0[var1++] = var0[var1];
						var0[var1++] = var0[var1];
						var0[var1++] = var0[var1];
						var0[var1++] = var0[var1];
					}
				} else {
					int var7 = anInt2634;
					int var8 = 256 - anInt2634;
					var2 = ((var2 & 16711935) * var8 >> 8 & 16711935) + ((var2 & 65280) * var8 >> 8 & 65280);

					while (true) {
						--var3;
						int var6;
						if (var3 < 0) {
							var3 = var5 - var4 & 3;

							while (true) {
								--var3;
								if (var3 < 0) {
									return;
								}

								var6 = var0[var1];
								var0[var1++] = var2 + ((var6 & 16711935) * var7 >> 8 & 16711935) + ((var6 & 65280) * var7 >> 8 & 65280);
							}
						}

						var6 = var0[var1];
						var0[var1++] = var2 + ((var6 & 16711935) * var7 >> 8 & 16711935) + ((var6 & 65280) * var7 >> 8 & 65280);
						var6 = var0[var1];
						var0[var1++] = var2 + ((var6 & 16711935) * var7 >> 8 & 16711935) + ((var6 & 65280) * var7 >> 8 & 65280);
						var6 = var0[var1];
						var0[var1++] = var2 + ((var6 & 16711935) * var7 >> 8 & 16711935) + ((var6 & 65280) * var7 >> 8 & 65280);
						var6 = var0[var1];
						var0[var1++] = var2 + ((var6 & 16711935) * var7 >> 8 & 16711935) + ((var6 & 65280) * var7 >> 8 & 65280);
					}
				}
			} else {
				while (true) {
					--var3;
					if (var3 < 0) {
						var3 = var5 - var4 & 3;

						while (true) {
							--var3;
							if (var3 < 0) {
								return;
							}

							var0[var1++] = var2;
						}
					}

					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
				}
			}
		}
	}

	static void method3106(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
		int[] var19 = anInterface2_2650.method31(var18, (byte) -88);
		int var23;
		if (var19 == null) {
			var23 = anInterface2_2650.method24(var18, (byte) 1);
			method3153(var0, var1, var2, var3, var4, var5, method3110(var23, var6), method3110(var23, var7), method3110(var23, var8));
		} else {
			aBool2633 = anInterface2_2650.method26(var18, 946856021);
			aBool2631 = anInterface2_2650.method25(var18, -227164729);
			var23 = var4 - var3;
			int var35 = var1 - var0;
			int var34 = var5 - var3;
			int var33 = var2 - var0;
			int var32 = var7 - var6;
			int var40 = var8 - var6;
			int var37 = 0;
			if (var1 != var0) {
				var37 = (var4 - var3 << 14) / (var1 - var0);
			}

			int var31 = 0;
			if (var2 != var1) {
				var31 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var41 = 0;
			if (var2 != var0) {
				var41 = (var3 - var5 << 14) / (var0 - var2);
			}

			int var36 = var23 * var33 - var34 * var35;
			if (var36 != 0) {
				int var26 = (var32 * var33 - var40 * var35 << 9) / var36;
				int var22 = (var40 * var23 - var32 * var34 << 9) / var36;
				var10 = var9 - var10;
				var13 = var12 - var13;
				var16 = var15 - var16;
				var11 -= var9;
				var14 -= var12;
				var17 -= var15;
				int var27 = var11 * var12 - var14 * var9 << 14;
				int var28 = (int) (((long) (var14 * var15 - var17 * var12) << 3 << 14) / (long) anInt2639);
				int var39 = (int) (((long) (var17 * var9 - var11 * var15) << 14) / (long) anInt2639);
				int var24 = var10 * var12 - var13 * var9 << 14;
				int var29 = (int) (((long) (var13 * var15 - var16 * var12) << 3 << 14) / (long) anInt2639);
				int var25 = (int) (((long) (var16 * var9 - var10 * var15) << 14) / (long) anInt2639);
				int var20 = var13 * var11 - var10 * var14 << 14;
				int var30 = (int) (((long) (var16 * var14 - var13 * var17) << 3 << 14) / (long) anInt2639);
				int var21 = (int) (((long) (var10 * var17 - var16 * var11) << 14) / (long) anInt2639);
				int var38;
				if (var0 <= var1 && var0 <= var2) {
					if (var0 < anInt2652) {
						if (var1 > anInt2652) {
							var1 = anInt2652;
						}

						if (var2 > anInt2652) {
							var2 = anInt2652;
						}

						var6 = (var6 << 9) - var26 * var3 + var26;
						if (var1 < var2) {
							var5 = var3 <<= 14;
							if (var0 < 0) {
								var5 -= var41 * var0;
								var3 -= var37 * var0;
								var6 -= var22 * var0;
								var0 = 0;
							}

							var4 <<= 14;
							if (var1 < 0) {
								var4 -= var31 * var1;
								var1 = 0;
							}

							var38 = var0 - anInt2637;
							var27 += var39 * var38;
							var24 += var25 * var38;
							var20 += var21 * var38;
							if (var0 != var1 && var41 < var37 || var0 == var1 && var41 > var31) {
								var2 -= var1;
								var1 -= var0;
								var0 = anIntArray2648[var0];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method3132(anIntArray2459, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var26, var27, var24, var20, var28, var29, var30);
											var5 += var41;
											var4 += var31;
											var6 += var22;
											var0 += anInt2462;
											var27 += var39;
											var24 += var25;
											var20 += var21;
										}
									}

									method3132(anIntArray2459, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var26, var27, var24, var20, var28, var29, var30);
									var5 += var41;
									var3 += var37;
									var6 += var22;
									var0 += anInt2462;
									var27 += var39;
									var24 += var25;
									var20 += var21;
								}
							} else {
								var2 -= var1;
								var1 -= var0;
								var0 = anIntArray2648[var0];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method3132(anIntArray2459, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var26, var27, var24, var20, var28, var29, var30);
											var5 += var41;
											var4 += var31;
											var6 += var22;
											var0 += anInt2462;
											var27 += var39;
											var24 += var25;
											var20 += var21;
										}
									}

									method3132(anIntArray2459, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var26, var27, var24, var20, var28, var29, var30);
									var5 += var41;
									var3 += var37;
									var6 += var22;
									var0 += anInt2462;
									var27 += var39;
									var24 += var25;
									var20 += var21;
								}
							}
						} else {
							var4 = var3 <<= 14;
							if (var0 < 0) {
								var4 -= var41 * var0;
								var3 -= var37 * var0;
								var6 -= var22 * var0;
								var0 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var31 * var2;
								var2 = 0;
							}

							var38 = var0 - anInt2637;
							var27 += var39 * var38;
							var24 += var25 * var38;
							var20 += var21 * var38;
							if (var0 != var2 && var41 < var37 || var0 == var2 && var31 > var37) {
								var1 -= var2;
								var2 -= var0;
								var0 = anIntArray2648[var0];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											method3132(anIntArray2459, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var26, var27, var24, var20, var28, var29, var30);
											var5 += var31;
											var3 += var37;
											var6 += var22;
											var0 += anInt2462;
											var27 += var39;
											var24 += var25;
											var20 += var21;
										}
									}

									method3132(anIntArray2459, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var26, var27, var24, var20, var28, var29, var30);
									var4 += var41;
									var3 += var37;
									var6 += var22;
									var0 += anInt2462;
									var27 += var39;
									var24 += var25;
									var20 += var21;
								}
							} else {
								var1 -= var2;
								var2 -= var0;
								var0 = anIntArray2648[var0];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											method3132(anIntArray2459, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var26, var27, var24, var20, var28, var29, var30);
											var5 += var31;
											var3 += var37;
											var6 += var22;
											var0 += anInt2462;
											var27 += var39;
											var24 += var25;
											var20 += var21;
										}
									}

									method3132(anIntArray2459, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var26, var27, var24, var20, var28, var29, var30);
									var4 += var41;
									var3 += var37;
									var6 += var22;
									var0 += anInt2462;
									var27 += var39;
									var24 += var25;
									var20 += var21;
								}
							}
						}
					}
				} else if (var1 <= var2) {
					if (var1 < anInt2652) {
						if (var2 > anInt2652) {
							var2 = anInt2652;
						}

						if (var0 > anInt2652) {
							var0 = anInt2652;
						}

						var7 = (var7 << 9) - var26 * var4 + var26;
						if (var2 < var0) {
							var3 = var4 <<= 14;
							if (var1 < 0) {
								var3 -= var37 * var1;
								var4 -= var31 * var1;
								var7 -= var22 * var1;
								var1 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var41 * var2;
								var2 = 0;
							}

							var38 = var1 - anInt2637;
							var27 += var39 * var38;
							var24 += var25 * var38;
							var20 += var21 * var38;
							if (var1 != var2 && var37 < var31 || var1 == var2 && var37 > var41) {
								var0 -= var2;
								var2 -= var1;
								var1 = anIntArray2648[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}

											method3132(anIntArray2459, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var26, var27, var24, var20, var28, var29, var30);
											var3 += var37;
											var5 += var41;
											var7 += var22;
											var1 += anInt2462;
											var27 += var39;
											var24 += var25;
											var20 += var21;
										}
									}

									method3132(anIntArray2459, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var26, var27, var24, var20, var28, var29, var30);
									var3 += var37;
									var4 += var31;
									var7 += var22;
									var1 += anInt2462;
									var27 += var39;
									var24 += var25;
									var20 += var21;
								}
							} else {
								var0 -= var2;
								var2 -= var1;
								var1 = anIntArray2648[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}

											method3132(anIntArray2459, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var26, var27, var24, var20, var28, var29, var30);
											var3 += var37;
											var5 += var41;
											var7 += var22;
											var1 += anInt2462;
											var27 += var39;
											var24 += var25;
											var20 += var21;
										}
									}

									method3132(anIntArray2459, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var26, var27, var24, var20, var28, var29, var30);
									var3 += var37;
									var4 += var31;
									var7 += var22;
									var1 += anInt2462;
									var27 += var39;
									var24 += var25;
									var20 += var21;
								}
							}
						} else {
							var5 = var4 <<= 14;
							if (var1 < 0) {
								var5 -= var37 * var1;
								var4 -= var31 * var1;
								var7 -= var22 * var1;
								var1 = 0;
							}

							var3 <<= 14;
							if (var0 < 0) {
								var3 -= var41 * var0;
								var0 = 0;
							}

							var38 = var1 - anInt2637;
							var27 += var39 * var38;
							var24 += var25 * var38;
							var20 += var21 * var38;
							if (var37 < var31) {
								var2 -= var0;
								var0 -= var1;
								var1 = anIntArray2648[var1];

								while (true) {
									--var0;
									if (var0 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method3132(anIntArray2459, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var26, var27, var24, var20, var28, var29, var30);
											var3 += var41;
											var4 += var31;
											var7 += var22;
											var1 += anInt2462;
											var27 += var39;
											var24 += var25;
											var20 += var21;
										}
									}

									method3132(anIntArray2459, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var26, var27, var24, var20, var28, var29, var30);
									var5 += var37;
									var4 += var31;
									var7 += var22;
									var1 += anInt2462;
									var27 += var39;
									var24 += var25;
									var20 += var21;
								}
							} else {
								var2 -= var0;
								var0 -= var1;
								var1 = anIntArray2648[var1];

								while (true) {
									--var0;
									if (var0 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method3132(anIntArray2459, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var26, var27, var24, var20, var28, var29, var30);
											var3 += var41;
											var4 += var31;
											var7 += var22;
											var1 += anInt2462;
											var27 += var39;
											var24 += var25;
											var20 += var21;
										}
									}

									method3132(anIntArray2459, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var26, var27, var24, var20, var28, var29, var30);
									var5 += var37;
									var4 += var31;
									var7 += var22;
									var1 += anInt2462;
									var27 += var39;
									var24 += var25;
									var20 += var21;
								}
							}
						}
					}
				} else if (var2 < anInt2652) {
					if (var0 > anInt2652) {
						var0 = anInt2652;
					}

					if (var1 > anInt2652) {
						var1 = anInt2652;
					}

					var8 = (var8 << 9) - var26 * var5 + var26;
					if (var0 < var1) {
						var4 = var5 <<= 14;
						if (var2 < 0) {
							var4 -= var31 * var2;
							var5 -= var41 * var2;
							var8 -= var22 * var2;
							var2 = 0;
						}

						var3 <<= 14;
						if (var0 < 0) {
							var3 -= var37 * var0;
							var0 = 0;
						}

						var38 = var2 - anInt2637;
						var27 += var39 * var38;
						var24 += var25 * var38;
						var20 += var21 * var38;
						if (var31 < var41) {
							var1 -= var0;
							var0 -= var2;
							var2 = anIntArray2648[var2];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method3132(anIntArray2459, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var26, var27, var24, var20, var28, var29, var30);
										var4 += var31;
										var3 += var37;
										var8 += var22;
										var2 += anInt2462;
										var27 += var39;
										var24 += var25;
										var20 += var21;
									}
								}

								method3132(anIntArray2459, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var26, var27, var24, var20, var28, var29, var30);
								var4 += var31;
								var5 += var41;
								var8 += var22;
								var2 += anInt2462;
								var27 += var39;
								var24 += var25;
								var20 += var21;
							}
						} else {
							var1 -= var0;
							var0 -= var2;
							var2 = anIntArray2648[var2];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method3132(anIntArray2459, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var26, var27, var24, var20, var28, var29, var30);
										var4 += var31;
										var3 += var37;
										var8 += var22;
										var2 += anInt2462;
										var27 += var39;
										var24 += var25;
										var20 += var21;
									}
								}

								method3132(anIntArray2459, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var26, var27, var24, var20, var28, var29, var30);
								var4 += var31;
								var5 += var41;
								var8 += var22;
								var2 += anInt2462;
								var27 += var39;
								var24 += var25;
								var20 += var21;
							}
						}
					} else {
						var3 = var5 <<= 14;
						if (var2 < 0) {
							var3 -= var31 * var2;
							var5 -= var41 * var2;
							var8 -= var22 * var2;
							var2 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var37 * var1;
							var1 = 0;
						}

						var38 = var2 - anInt2637;
						var27 += var39 * var38;
						var24 += var25 * var38;
						var20 += var21 * var38;
						if (var31 < var41) {
							var0 -= var1;
							var1 -= var2;
							var2 = anIntArray2648[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										method3132(anIntArray2459, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var26, var27, var24, var20, var28, var29, var30);
										var4 += var37;
										var5 += var41;
										var8 += var22;
										var2 += anInt2462;
										var27 += var39;
										var24 += var25;
										var20 += var21;
									}
								}

								method3132(anIntArray2459, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var26, var27, var24, var20, var28, var29, var30);
								var3 += var31;
								var5 += var41;
								var8 += var22;
								var2 += anInt2462;
								var27 += var39;
								var24 += var25;
								var20 += var21;
							}
						} else {
							var0 -= var1;
							var1 -= var2;
							var2 = anIntArray2648[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										method3132(anIntArray2459, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var26, var27, var24, var20, var28, var29, var30);
										var4 += var37;
										var5 += var41;
										var8 += var22;
										var2 += anInt2462;
										var27 += var39;
										var24 += var25;
										var20 += var21;
									}
								}

								method3132(anIntArray2459, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var26, var27, var24, var20, var28, var29, var30);
								var3 += var31;
								var5 += var41;
								var8 += var22;
								var2 += anInt2462;
								var27 += var39;
								var24 += var25;
								var20 += var21;
							}
						}
					}
				}
			}
		}
	}

	static void method3109(double var0, int var2, int var3) {
		var0 += Math.random() * 0.03D - 0.015D;
		int var27 = var2 * 128;

		for (int var4 = var2; var4 < var3; var4++) {
			double var7 = (double) (var4 >> 3) / 64.0D + 0.0078125D;
			double var5 = (double) (var4 & 7) / 8.0D + 0.0625D;

			for (int var11 = 0; var11 < 128; var11++) {
				double var9 = (double) var11 / 128.0D;
				double var12 = var9;
				double var18 = var9;
				double var16 = var9;
				if (var5 != 0.0D) {
					double var14;
					if (var9 < 0.5D) {
						var14 = var9 * (1.0D + var5);
					} else {
						var14 = var9 + var5 - var9 * var5;
					}

					double var23 = 2.0D * var9 - var14;
					double var25 = var7 + 0.3333333333333333D;
					if (var25 > 1.0D) {
						--var25;
					}

					double var21 = var7 - 0.3333333333333333D;
					if (var21 < 0.0D) {
						++var21;
					}

					if (6.0D * var25 < 1.0D) {
						var12 = var23 + (var14 - var23) * 6.0D * var25;
					} else if (2.0D * var25 < 1.0D) {
						var12 = var14;
					} else if (3.0D * var25 < 2.0D) {
						var12 = var23 + (var14 - var23) * (0.6666666666666666D - var25) * 6.0D;
					} else {
						var12 = var23;
					}

					if (6.0D * var7 < 1.0D) {
						var18 = var23 + (var14 - var23) * 6.0D * var7;
					} else if (2.0D * var7 < 1.0D) {
						var18 = var14;
					} else if (3.0D * var7 < 2.0D) {
						var18 = var23 + (var14 - var23) * (0.6666666666666666D - var7) * 6.0D;
					} else {
						var18 = var23;
					}

					if (6.0D * var21 < 1.0D) {
						var16 = var23 + (var14 - var23) * 6.0D * var21;
					} else if (2.0D * var21 < 1.0D) {
						var16 = var14;
					} else if (3.0D * var21 < 2.0D) {
						var16 = var23 + (var14 - var23) * (0.6666666666666666D - var21) * 6.0D;
					} else {
						var16 = var23;
					}
				}

				int var28 = (int) (var12 * 256.0D);
				int var20 = (int) (var18 * 256.0D);
				int var31 = (int) (var16 * 256.0D);
				int var32 = (var28 << 16) + (var20 << 8) + var31;
				var32 = method3100(var32, var0);
				if (var32 == 0) {
					var32 = 1;
				}

				anIntArray2643[var27++] = var32;
			}
		}

	}

	static int method3110(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 >= 2) {
			if (var1 > 126) {
				var1 = 126;
			}
		} else {
			var1 = 2;
		}

		return (var0 & 65408) + var1;
	}

	static {
		int var0;
		for (var0 = 1; var0 < 512; var0++) {
			anIntArray2651[var0] = 32768 / var0;
		}

		for (var0 = 1; var0 < 2048; var0++) {
			anIntArray2644[var0] = 65536 / var0;
		}

		for (var0 = 0; var0 < 2048; var0++) {
			anIntArray2653[var0] = (int) (65536.0D * Math.sin((double) var0 * 0.0030679615D));
			anIntArray2654[var0] = (int) (65536.0D * Math.cos((double) var0 * 0.0030679615D));
		}

	}

	Class117_Sub22_Sub17_Sub1() throws Throwable {
		throw new Error();
	}

	public static void method3131() {
		anInt2649 = anInt2642 / 2;
		anInt2637 = anInt2652 / 2;
		anInt2636 = -anInt2649;
		anInt2645 = anInt2642 - anInt2649;
		anInt2646 = -anInt2637;
		anInt2647 = anInt2652 - anInt2637;
	}

	static void method3132(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (aBool2640) {
			if (var6 > anInt2642) {
				var6 = anInt2642;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var4 += var5;
			var7 += var8 * var5;
			int var20 = var6 - var5;
			int var15;
			int var16;
			int var10000;
			int var17;
			int var18;
			int var19;
			int var21;
			int var22;
			int var23;
			if (aBool2633) {
				var16 = var5 - anInt2649;
				var9 += (var12 >> 3) * var16;
				var10 += (var13 >> 3) * var16;
				var11 += (var14 >> 3) * var16;
				var18 = var11 >> 12;
				if (var18 != 0) {
					var19 = var9 / var18;
					var21 = var10 / var18;
					if (var19 < 0) {
						var19 = 0;
					} else if (var19 > 4032) {
						var19 = 4032;
					}
				} else {
					var19 = 0;
					var21 = 0;
				}

				var9 += var12;
				var10 += var13;
				var11 += var14;
				var18 = var11 >> 12;
				if (var18 != 0) {
					var15 = var9 / var18;
					var23 = var10 / var18;
					if (var15 < 0) {
						var15 = 0;
					} else if (var15 > 4032) {
						var15 = 4032;
					}
				} else {
					var15 = 0;
					var23 = 0;
				}

				var2 = (var19 << 20) + var21;
				var17 = (var15 - var19 >> 3 << 20) + (var23 - var21 >> 3);
				var20 >>= 3;
				var8 <<= 3;
				var22 = var7 >> 8;
				if (aBool2631) {
					if (var20 > 0) {
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							var10000 = var2 + var17;
							var19 = var15;
							var21 = var23;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var18 = var11 >> 12;
							if (var18 != 0) {
								var15 = var9 / var18;
								var23 = var10 / var18;
								if (var15 < 0) {
									var15 = 0;
								} else if (var15 > 4032) {
									var15 = 4032;
								}
							} else {
								var15 = 0;
								var23 = 0;
							}

							var2 = (var19 << 20) + var21;
							var17 = (var15 - var19 >> 3 << 20) + (var23 - var21 >> 3);
							var7 += var8;
							var22 = var7 >> 8;
							--var20;
						} while (var20 > 0);
					}

					var20 = var6 - var5 & 7;
					if (var20 > 0) {
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							var2 += var17;
							--var20;
						} while (var20 > 0);
					}
				} else {
					if (var20 > 0) {
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							}

							++var4;
							var10000 = var2 + var17;
							var19 = var15;
							var21 = var23;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var18 = var11 >> 12;
							if (var18 != 0) {
								var15 = var9 / var18;
								var23 = var10 / var18;
								if (var15 < 0) {
									var15 = 0;
								} else if (var15 > 4032) {
									var15 = 4032;
								}
							} else {
								var15 = 0;
								var23 = 0;
							}

							var2 = (var19 << 20) + var21;
							var17 = (var15 - var19 >> 3 << 20) + (var23 - var21 >> 3);
							var7 += var8;
							var22 = var7 >> 8;
							--var20;
						} while (var20 > 0);
					}

					var20 = var6 - var5 & 7;
					if (var20 > 0) {
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							--var20;
						} while (var20 > 0);
					}
				}
			} else {
				var16 = var5 - anInt2649;
				var9 += (var12 >> 3) * var16;
				var10 += (var13 >> 3) * var16;
				var11 += (var14 >> 3) * var16;
				var18 = var11 >> 14;
				if (var18 != 0) {
					var19 = var9 / var18;
					var21 = var10 / var18;
					if (var19 < 0) {
						var19 = 0;
					} else if (var19 > 16256) {
						var19 = 16256;
					}
				} else {
					var19 = 0;
					var21 = 0;
				}

				var9 += var12;
				var10 += var13;
				var11 += var14;
				var18 = var11 >> 14;
				if (var18 != 0) {
					var15 = var9 / var18;
					var23 = var10 / var18;
					if (var15 < 0) {
						var15 = 0;
					} else if (var15 > 16256) {
						var15 = 16256;
					}
				} else {
					var15 = 0;
					var23 = 0;
				}

				var2 = (var19 << 18) + var21;
				var17 = (var15 - var19 >> 3 << 18) + (var23 - var21 >> 3);
				var20 >>= 3;
				var8 <<= 3;
				var22 = var7 >> 8;
				if (aBool2631) {
					if (var20 > 0) {
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							var10000 = var2 + var17;
							var19 = var15;
							var21 = var23;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var18 = var11 >> 14;
							if (var18 != 0) {
								var15 = var9 / var18;
								var23 = var10 / var18;
								if (var15 < 0) {
									var15 = 0;
								} else if (var15 > 16256) {
									var15 = 16256;
								}
							} else {
								var15 = 0;
								var23 = 0;
							}

							var2 = (var19 << 18) + var21;
							var17 = (var15 - var19 >> 3 << 18) + (var23 - var21 >> 3);
							var7 += var8;
							var22 = var7 >> 8;
							--var20;
						} while (var20 > 0);
					}

					var20 = var6 - var5 & 7;
					if (var20 > 0) {
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							var2 += var17;
							--var20;
						} while (var20 > 0);
					}
				} else {
					if (var20 > 0) {
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							}

							++var4;
							var10000 = var2 + var17;
							var19 = var15;
							var21 = var23;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var18 = var11 >> 14;
							if (var18 != 0) {
								var15 = var9 / var18;
								var23 = var10 / var18;
								if (var15 < 0) {
									var15 = 0;
								} else if (var15 > 16256) {
									var15 = 16256;
								}
							} else {
								var15 = 0;
								var23 = 0;
							}

							var2 = (var19 << 18) + var21;
							var17 = (var15 - var19 >> 3 << 18) + (var23 - var21 >> 3);
							var7 += var8;
							var22 = var7 >> 8;
							--var20;
						} while (var20 > 0);
					}

					var20 = var6 - var5 & 7;
					if (var20 > 0) {
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var22 & -16711936) + ((var3 & 65280) * var22 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							--var20;
						} while (var20 > 0);
					}
				}
			}

		}
	}

	static void method3143(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (aBool2640) {
			if (var6 > anInt2642) {
				var6 = anInt2642;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var4 += var5;
			var7 += var8 * var5;
			int var15 = var6 - var5;
			int var16;
			int var17;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			if (aBool2633) {
				var18 = var5 - anInt2649;
				var9 += var12 * var18;
				var10 += var13 * var18;
				var11 += var14 * var18;
				var19 = var11 >> 12;
				if (var19 != 0) {
					var22 = var9 / var19;
					var20 = var10 / var19;
				} else {
					var22 = 0;
					var20 = 0;
				}

				var9 += var12 * var15;
				var10 += var13 * var15;
				var11 += var14 * var15;
				var19 = var11 >> 12;
				if (var19 != 0) {
					var23 = var9 / var19;
					var21 = var10 / var19;
				} else {
					var23 = 0;
					var21 = 0;
				}

				var2 = (var22 << 20) + var20;
				var17 = ((var23 - var22) / var15 << 20) + (var21 - var20) / var15;
				var15 >>= 3;
				var8 <<= 3;
				var16 = var7 >> 8;
				if (aBool2631) {
					if (var15 > 0) {
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var17;
							var7 += var8;
							var16 = var7 >> 8;
							--var15;
						} while (var15 > 0);
					}

					var15 = var6 - var5 & 7;
					if (var15 > 0) {
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var17;
							--var15;
						} while (var15 > 0);
					}
				} else {
					if (var15 > 0) {
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							var7 += var8;
							var16 = var7 >> 8;
							--var15;
						} while (var15 > 0);
					}

					var15 = var6 - var5 & 7;
					if (var15 > 0) {
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							--var15;
						} while (var15 > 0);
					}
				}
			} else {
				var18 = var5 - anInt2649;
				var9 += var12 * var18;
				var10 += var13 * var18;
				var11 += var14 * var18;
				var19 = var11 >> 14;
				if (var19 != 0) {
					var22 = var9 / var19;
					var20 = var10 / var19;
				} else {
					var22 = 0;
					var20 = 0;
				}

				var9 += var12 * var15;
				var10 += var13 * var15;
				var11 += var14 * var15;
				var19 = var11 >> 14;
				if (var19 != 0) {
					var23 = var9 / var19;
					var21 = var10 / var19;
				} else {
					var23 = 0;
					var21 = 0;
				}

				var2 = (var22 << 18) + var20;
				var17 = ((var23 - var22) / var15 << 18) + (var21 - var20) / var15;
				var15 >>= 3;
				var8 <<= 3;
				var16 = var7 >> 8;
				if (aBool2631) {
					if (var15 > 0) {
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var17;
							var7 += var8;
							var16 = var7 >> 8;
							--var15;
						} while (var15 > 0);
					}

					var15 = var6 - var5 & 7;
					if (var15 > 0) {
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var17;
							--var15;
						} while (var15 > 0);
					}
				} else {
					if (var15 > 0) {
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							var7 += var8;
							var16 = var7 >> 8;
							--var15;
						} while (var15 > 0);
					}

					var15 = var6 - var5 & 7;
					if (var15 > 0) {
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var17;
							--var15;
						} while (var15 > 0);
					}
				}
			}

		}
	}

	static void method3146(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
		int[] var19 = anInterface2_2650.method31(var18, (byte) 19);
		int var20;
		if (var19 == null) {
			var20 = anInterface2_2650.method24(var18, (byte) 1);
			method3153(var0, var1, var2, var3, var4, var5, method3110(var20, var6), method3110(var20, var7), method3110(var20, var8));
		} else {
			aBool2633 = anInterface2_2650.method26(var18, 1191648954);
			aBool2631 = anInterface2_2650.method25(var18, -1761165043);
			var20 = var4 - var3;
			int var22 = var1 - var0;
			int var23 = var5 - var3;
			int var24 = var2 - var0;
			int var25 = var7 - var6;
			int var30 = var8 - var6;
			int var27 = 0;
			if (var1 != var0) {
				var27 = (var4 - var3 << 14) / (var1 - var0);
			}

			int var28 = 0;
			if (var2 != var1) {
				var28 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var21 = 0;
			if (var2 != var0) {
				var21 = (var3 - var5 << 14) / (var0 - var2);
			}

			int var29 = var20 * var24 - var23 * var22;
			if (var29 != 0) {
				int var33 = (var25 * var24 - var30 * var22 << 9) / var29;
				int var26 = (var30 * var20 - var25 * var23 << 9) / var29;
				var10 = var9 - var10;
				var13 = var12 - var13;
				var16 = var15 - var16;
				var11 -= var9;
				var14 -= var12;
				var17 -= var15;
				int var34 = var11 * var12 - var14 * var9 << 14;
				int var36 = (int) (((long) (var14 * var15 - var17 * var12) << 14) / (long) anInt2639);
				int var39 = (int) (((long) (var17 * var9 - var11 * var15) << 14) / (long) anInt2639);
				int var31 = var10 * var12 - var13 * var9 << 14;
				int var37 = (int) (((long) (var13 * var15 - var16 * var12) << 14) / (long) anInt2639);
				int var32 = (int) (((long) (var16 * var9 - var10 * var15) << 14) / (long) anInt2639);
				int var35 = var13 * var11 - var10 * var14 << 14;
				int var38 = (int) (((long) (var16 * var14 - var13 * var17) << 14) / (long) anInt2639);
				int var40 = (int) (((long) (var10 * var17 - var16 * var11) << 14) / (long) anInt2639);
				int var41;
				if (var0 <= var1 && var0 <= var2) {
					if (var0 < anInt2652) {
						if (var1 > anInt2652) {
							var1 = anInt2652;
						}

						if (var2 > anInt2652) {
							var2 = anInt2652;
						}

						var6 = (var6 << 9) - var33 * var3 + var33;
						if (var1 < var2) {
							var5 = var3 <<= 14;
							if (var0 < 0) {
								var5 -= var21 * var0;
								var3 -= var27 * var0;
								var6 -= var26 * var0;
								var0 = 0;
							}

							var4 <<= 14;
							if (var1 < 0) {
								var4 -= var28 * var1;
								var1 = 0;
							}

							var41 = var0 - anInt2637;
							var34 += var39 * var41;
							var31 += var32 * var41;
							var35 += var40 * var41;
							if (var0 != var1 && var21 < var27 || var0 == var1 && var21 > var28) {
								var2 -= var1;
								var1 -= var0;
								var0 = anIntArray2648[var0];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method3143(anIntArray2459, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var33, var34, var31, var35, var36, var37, var38);
											var5 += var21;
											var4 += var28;
											var6 += var26;
											var0 += anInt2462;
											var34 += var39;
											var31 += var32;
											var35 += var40;
										}
									}

									method3143(anIntArray2459, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var33, var34, var31, var35, var36, var37, var38);
									var5 += var21;
									var3 += var27;
									var6 += var26;
									var0 += anInt2462;
									var34 += var39;
									var31 += var32;
									var35 += var40;
								}
							} else {
								var2 -= var1;
								var1 -= var0;
								var0 = anIntArray2648[var0];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method3143(anIntArray2459, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var33, var34, var31, var35, var36, var37, var38);
											var5 += var21;
											var4 += var28;
											var6 += var26;
											var0 += anInt2462;
											var34 += var39;
											var31 += var32;
											var35 += var40;
										}
									}

									method3143(anIntArray2459, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var33, var34, var31, var35, var36, var37, var38);
									var5 += var21;
									var3 += var27;
									var6 += var26;
									var0 += anInt2462;
									var34 += var39;
									var31 += var32;
									var35 += var40;
								}
							}
						} else {
							var4 = var3 <<= 14;
							if (var0 < 0) {
								var4 -= var21 * var0;
								var3 -= var27 * var0;
								var6 -= var26 * var0;
								var0 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var28 * var2;
								var2 = 0;
							}

							var41 = var0 - anInt2637;
							var34 += var39 * var41;
							var31 += var32 * var41;
							var35 += var40 * var41;
							if ((var0 == var2 || var21 >= var27) && (var0 != var2 || var28 <= var27)) {
								var1 -= var2;
								var2 -= var0;
								var0 = anIntArray2648[var0];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											method3143(anIntArray2459, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var33, var34, var31, var35, var36, var37, var38);
											var5 += var28;
											var3 += var27;
											var6 += var26;
											var0 += anInt2462;
											var34 += var39;
											var31 += var32;
											var35 += var40;
										}
									}

									method3143(anIntArray2459, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var33, var34, var31, var35, var36, var37, var38);
									var4 += var21;
									var3 += var27;
									var6 += var26;
									var0 += anInt2462;
									var34 += var39;
									var31 += var32;
									var35 += var40;
								}
							} else {
								var1 -= var2;
								var2 -= var0;
								var0 = anIntArray2648[var0];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											method3143(anIntArray2459, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var33, var34, var31, var35, var36, var37, var38);
											var5 += var28;
											var3 += var27;
											var6 += var26;
											var0 += anInt2462;
											var34 += var39;
											var31 += var32;
											var35 += var40;
										}
									}

									method3143(anIntArray2459, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var33, var34, var31, var35, var36, var37, var38);
									var4 += var21;
									var3 += var27;
									var6 += var26;
									var0 += anInt2462;
									var34 += var39;
									var31 += var32;
									var35 += var40;
								}
							}
						}
					}
				} else if (var1 <= var2) {
					if (var1 < anInt2652) {
						if (var2 > anInt2652) {
							var2 = anInt2652;
						}

						if (var0 > anInt2652) {
							var0 = anInt2652;
						}

						var7 = (var7 << 9) - var33 * var4 + var33;
						if (var2 < var0) {
							var3 = var4 <<= 14;
							if (var1 < 0) {
								var3 -= var27 * var1;
								var4 -= var28 * var1;
								var7 -= var26 * var1;
								var1 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var21 * var2;
								var2 = 0;
							}

							var41 = var1 - anInt2637;
							var34 += var39 * var41;
							var31 += var32 * var41;
							var35 += var40 * var41;
							if (var1 != var2 && var27 < var28 || var1 == var2 && var27 > var21) {
								var0 -= var2;
								var2 -= var1;
								var1 = anIntArray2648[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}

											method3143(anIntArray2459, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var33, var34, var31, var35, var36, var37, var38);
											var3 += var27;
											var5 += var21;
											var7 += var26;
											var1 += anInt2462;
											var34 += var39;
											var31 += var32;
											var35 += var40;
										}
									}

									method3143(anIntArray2459, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var33, var34, var31, var35, var36, var37, var38);
									var3 += var27;
									var4 += var28;
									var7 += var26;
									var1 += anInt2462;
									var34 += var39;
									var31 += var32;
									var35 += var40;
								}
							} else {
								var0 -= var2;
								var2 -= var1;
								var1 = anIntArray2648[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}

											method3143(anIntArray2459, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var33, var34, var31, var35, var36, var37, var38);
											var3 += var27;
											var5 += var21;
											var7 += var26;
											var1 += anInt2462;
											var34 += var39;
											var31 += var32;
											var35 += var40;
										}
									}

									method3143(anIntArray2459, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var33, var34, var31, var35, var36, var37, var38);
									var3 += var27;
									var4 += var28;
									var7 += var26;
									var1 += anInt2462;
									var34 += var39;
									var31 += var32;
									var35 += var40;
								}
							}
						} else {
							var5 = var4 <<= 14;
							if (var1 < 0) {
								var5 -= var27 * var1;
								var4 -= var28 * var1;
								var7 -= var26 * var1;
								var1 = 0;
							}

							var3 <<= 14;
							if (var0 < 0) {
								var3 -= var21 * var0;
								var0 = 0;
							}

							var41 = var1 - anInt2637;
							var34 += var39 * var41;
							var31 += var32 * var41;
							var35 += var40 * var41;
							if (var27 < var28) {
								var2 -= var0;
								var0 -= var1;
								var1 = anIntArray2648[var1];

								while (true) {
									--var0;
									if (var0 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method3143(anIntArray2459, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var33, var34, var31, var35, var36, var37, var38);
											var3 += var21;
											var4 += var28;
											var7 += var26;
											var1 += anInt2462;
											var34 += var39;
											var31 += var32;
											var35 += var40;
										}
									}

									method3143(anIntArray2459, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var33, var34, var31, var35, var36, var37, var38);
									var5 += var27;
									var4 += var28;
									var7 += var26;
									var1 += anInt2462;
									var34 += var39;
									var31 += var32;
									var35 += var40;
								}
							} else {
								var2 -= var0;
								var0 -= var1;
								var1 = anIntArray2648[var1];

								while (true) {
									--var0;
									if (var0 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method3143(anIntArray2459, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var33, var34, var31, var35, var36, var37, var38);
											var3 += var21;
											var4 += var28;
											var7 += var26;
											var1 += anInt2462;
											var34 += var39;
											var31 += var32;
											var35 += var40;
										}
									}

									method3143(anIntArray2459, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var33, var34, var31, var35, var36, var37, var38);
									var5 += var27;
									var4 += var28;
									var7 += var26;
									var1 += anInt2462;
									var34 += var39;
									var31 += var32;
									var35 += var40;
								}
							}
						}
					}
				} else if (var2 < anInt2652) {
					if (var0 > anInt2652) {
						var0 = anInt2652;
					}

					if (var1 > anInt2652) {
						var1 = anInt2652;
					}

					var8 = (var8 << 9) - var33 * var5 + var33;
					if (var0 < var1) {
						var4 = var5 <<= 14;
						if (var2 < 0) {
							var4 -= var28 * var2;
							var5 -= var21 * var2;
							var8 -= var26 * var2;
							var2 = 0;
						}

						var3 <<= 14;
						if (var0 < 0) {
							var3 -= var27 * var0;
							var0 = 0;
						}

						var41 = var2 - anInt2637;
						var34 += var39 * var41;
						var31 += var32 * var41;
						var35 += var40 * var41;
						if (var28 < var21) {
							var1 -= var0;
							var0 -= var2;
							var2 = anIntArray2648[var2];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method3143(anIntArray2459, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var33, var34, var31, var35, var36, var37, var38);
										var4 += var28;
										var3 += var27;
										var8 += var26;
										var2 += anInt2462;
										var34 += var39;
										var31 += var32;
										var35 += var40;
									}
								}

								method3143(anIntArray2459, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var33, var34, var31, var35, var36, var37, var38);
								var4 += var28;
								var5 += var21;
								var8 += var26;
								var2 += anInt2462;
								var34 += var39;
								var31 += var32;
								var35 += var40;
							}
						} else {
							var1 -= var0;
							var0 -= var2;
							var2 = anIntArray2648[var2];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method3143(anIntArray2459, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var33, var34, var31, var35, var36, var37, var38);
										var4 += var28;
										var3 += var27;
										var8 += var26;
										var2 += anInt2462;
										var34 += var39;
										var31 += var32;
										var35 += var40;
									}
								}

								method3143(anIntArray2459, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var33, var34, var31, var35, var36, var37, var38);
								var4 += var28;
								var5 += var21;
								var8 += var26;
								var2 += anInt2462;
								var34 += var39;
								var31 += var32;
								var35 += var40;
							}
						}
					} else {
						var3 = var5 <<= 14;
						if (var2 < 0) {
							var3 -= var28 * var2;
							var5 -= var21 * var2;
							var8 -= var26 * var2;
							var2 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var27 * var1;
							var1 = 0;
						}

						var41 = var2 - anInt2637;
						var34 += var39 * var41;
						var31 += var32 * var41;
						var35 += var40 * var41;
						if (var28 < var21) {
							var0 -= var1;
							var1 -= var2;
							var2 = anIntArray2648[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										method3143(anIntArray2459, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var33, var34, var31, var35, var36, var37, var38);
										var4 += var27;
										var5 += var21;
										var8 += var26;
										var2 += anInt2462;
										var34 += var39;
										var31 += var32;
										var35 += var40;
									}
								}

								method3143(anIntArray2459, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var33, var34, var31, var35, var36, var37, var38);
								var3 += var28;
								var5 += var21;
								var8 += var26;
								var2 += anInt2462;
								var34 += var39;
								var31 += var32;
								var35 += var40;
							}
						} else {
							var0 -= var1;
							var1 -= var2;
							var2 = anIntArray2648[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										method3143(anIntArray2459, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var33, var34, var31, var35, var36, var37, var38);
										var4 += var27;
										var5 += var21;
										var8 += var26;
										var2 += anInt2462;
										var34 += var39;
										var31 += var32;
										var35 += var40;
									}
								}

								method3143(anIntArray2459, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var33, var34, var31, var35, var36, var37, var38);
								var3 += var28;
								var5 += var21;
								var8 += var26;
								var2 += anInt2462;
								var34 += var39;
								var31 += var32;
								var35 += var40;
							}
						}
					}
				}
			}
		}
	}

	static void method3153(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = var4 - var3;
		int var15 = var1 - var0;
		int var18 = var5 - var3;
		int var11 = var2 - var0;
		int var12 = var7 - var6;
		int var20 = var8 - var6;
		int var14;
		if (var2 != var1) {
			var14 = (var5 - var4 << 14) / (var2 - var1);
		} else {
			var14 = 0;
		}

		int var13;
		if (var1 != var0) {
			var13 = (var9 << 14) / var15;
		} else {
			var13 = 0;
		}

		int var17;
		if (var2 != var0) {
			var17 = (var18 << 14) / var11;
		} else {
			var17 = 0;
		}

		int var19 = var9 * var11 - var18 * var15;
		if (var19 != 0) {
			int var10 = (var12 * var11 - var20 * var15 << 8) / var19;
			int var16 = (var20 * var9 - var12 * var18 << 8) / var19;
			if (var0 <= var1 && var0 <= var2) {
				if (var0 < anInt2652) {
					if (var1 > anInt2652) {
						var1 = anInt2652;
					}

					if (var2 > anInt2652) {
						var2 = anInt2652;
					}

					var6 = (var6 << 8) - var10 * var3 + var10;
					if (var1 < var2) {
						var5 = var3 <<= 14;
						if (var0 < 0) {
							var5 -= var17 * var0;
							var3 -= var13 * var0;
							var6 -= var16 * var0;
							var0 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var14 * var1;
							var1 = 0;
						}

						if (var0 != var1 && var17 < var13 || var0 == var1 && var17 > var14) {
							var2 -= var1;
							var1 -= var0;
							var0 = anIntArray2648[var0];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										method3093(anIntArray2459, var0, 0, 0, var5 >> 14, var4 >> 14, var6, var10);
										var5 += var17;
										var4 += var14;
										var6 += var16;
										var0 += anInt2462;
									}
								}

								method3093(anIntArray2459, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var10);
								var5 += var17;
								var3 += var13;
								var6 += var16;
								var0 += anInt2462;
							}
						} else {
							var2 -= var1;
							var1 -= var0;
							var0 = anIntArray2648[var0];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										method3093(anIntArray2459, var0, 0, 0, var4 >> 14, var5 >> 14, var6, var10);
										var5 += var17;
										var4 += var14;
										var6 += var16;
										var0 += anInt2462;
									}
								}

								method3093(anIntArray2459, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var10);
								var5 += var17;
								var3 += var13;
								var6 += var16;
								var0 += anInt2462;
							}
						}
					} else {
						var4 = var3 <<= 14;
						if (var0 < 0) {
							var4 -= var17 * var0;
							var3 -= var13 * var0;
							var6 -= var16 * var0;
							var0 = 0;
						}

						var5 <<= 14;
						if (var2 < 0) {
							var5 -= var14 * var2;
							var2 = 0;
						}

						if (var0 != var2 && var17 < var13 || var0 == var2 && var14 > var13) {
							var1 -= var2;
							var2 -= var0;
							var0 = anIntArray2648[var0];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method3093(anIntArray2459, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var10);
										var5 += var14;
										var3 += var13;
										var6 += var16;
										var0 += anInt2462;
									}
								}

								method3093(anIntArray2459, var0, 0, 0, var4 >> 14, var3 >> 14, var6, var10);
								var4 += var17;
								var3 += var13;
								var6 += var16;
								var0 += anInt2462;
							}
						} else {
							var1 -= var2;
							var2 -= var0;
							var0 = anIntArray2648[var0];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method3093(anIntArray2459, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var10);
										var5 += var14;
										var3 += var13;
										var6 += var16;
										var0 += anInt2462;
									}
								}

								method3093(anIntArray2459, var0, 0, 0, var3 >> 14, var4 >> 14, var6, var10);
								var4 += var17;
								var3 += var13;
								var6 += var16;
								var0 += anInt2462;
							}
						}
					}
				}
			} else if (var1 <= var2) {
				if (var1 < anInt2652) {
					if (var2 > anInt2652) {
						var2 = anInt2652;
					}

					if (var0 > anInt2652) {
						var0 = anInt2652;
					}

					var7 = (var7 << 8) - var10 * var4 + var10;
					if (var2 < var0) {
						var3 = var4 <<= 14;
						if (var1 < 0) {
							var3 -= var13 * var1;
							var4 -= var14 * var1;
							var7 -= var16 * var1;
							var1 = 0;
						}

						var5 <<= 14;
						if (var2 < 0) {
							var5 -= var17 * var2;
							var2 = 0;
						}

						if (var1 != var2 && var13 < var14 || var1 == var2 && var13 > var17) {
							var0 -= var2;
							var2 -= var1;
							var1 = anIntArray2648[var1];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										method3093(anIntArray2459, var1, 0, 0, var3 >> 14, var5 >> 14, var7, var10);
										var3 += var13;
										var5 += var17;
										var7 += var16;
										var1 += anInt2462;
									}
								}

								method3093(anIntArray2459, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var10);
								var3 += var13;
								var4 += var14;
								var7 += var16;
								var1 += anInt2462;
							}
						} else {
							var0 -= var2;
							var2 -= var1;
							var1 = anIntArray2648[var1];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										method3093(anIntArray2459, var1, 0, 0, var5 >> 14, var3 >> 14, var7, var10);
										var3 += var13;
										var5 += var17;
										var7 += var16;
										var1 += anInt2462;
									}
								}

								method3093(anIntArray2459, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var10);
								var3 += var13;
								var4 += var14;
								var7 += var16;
								var1 += anInt2462;
							}
						}
					} else {
						var5 = var4 <<= 14;
						if (var1 < 0) {
							var5 -= var13 * var1;
							var4 -= var14 * var1;
							var7 -= var16 * var1;
							var1 = 0;
						}

						var3 <<= 14;
						if (var0 < 0) {
							var3 -= var17 * var0;
							var0 = 0;
						}

						if (var13 < var14) {
							var2 -= var0;
							var0 -= var1;
							var1 = anIntArray2648[var1];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										method3093(anIntArray2459, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var10);
										var3 += var17;
										var4 += var14;
										var7 += var16;
										var1 += anInt2462;
									}
								}

								method3093(anIntArray2459, var1, 0, 0, var5 >> 14, var4 >> 14, var7, var10);
								var5 += var13;
								var4 += var14;
								var7 += var16;
								var1 += anInt2462;
							}
						} else {
							var2 -= var0;
							var0 -= var1;
							var1 = anIntArray2648[var1];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										method3093(anIntArray2459, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var10);
										var3 += var17;
										var4 += var14;
										var7 += var16;
										var1 += anInt2462;
									}
								}

								method3093(anIntArray2459, var1, 0, 0, var4 >> 14, var5 >> 14, var7, var10);
								var5 += var13;
								var4 += var14;
								var7 += var16;
								var1 += anInt2462;
							}
						}
					}
				}
			} else if (var2 < anInt2652) {
				if (var0 > anInt2652) {
					var0 = anInt2652;
				}

				if (var1 > anInt2652) {
					var1 = anInt2652;
				}

				var8 = (var8 << 8) - var10 * var5 + var10;
				if (var0 < var1) {
					var4 = var5 <<= 14;
					if (var2 < 0) {
						var4 -= var14 * var2;
						var5 -= var17 * var2;
						var8 -= var16 * var2;
						var2 = 0;
					}

					var3 <<= 14;
					if (var0 < 0) {
						var3 -= var13 * var0;
						var0 = 0;
					}

					if (var14 < var17) {
						var1 -= var0;
						var0 -= var2;
						var2 = anIntArray2648[var2];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method3093(anIntArray2459, var2, 0, 0, var4 >> 14, var3 >> 14, var8, var10);
									var4 += var14;
									var3 += var13;
									var8 += var16;
									var2 += anInt2462;
								}
							}

							method3093(anIntArray2459, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var10);
							var4 += var14;
							var5 += var17;
							var8 += var16;
							var2 += anInt2462;
						}
					} else {
						var1 -= var0;
						var0 -= var2;
						var2 = anIntArray2648[var2];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method3093(anIntArray2459, var2, 0, 0, var3 >> 14, var4 >> 14, var8, var10);
									var4 += var14;
									var3 += var13;
									var8 += var16;
									var2 += anInt2462;
								}
							}

							method3093(anIntArray2459, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var10);
							var4 += var14;
							var5 += var17;
							var8 += var16;
							var2 += anInt2462;
						}
					}
				} else {
					var3 = var5 <<= 14;
					if (var2 < 0) {
						var3 -= var14 * var2;
						var5 -= var17 * var2;
						var8 -= var16 * var2;
						var2 = 0;
					}

					var4 <<= 14;
					if (var1 < 0) {
						var4 -= var13 * var1;
						var1 = 0;
					}

					if (var14 < var17) {
						var0 -= var1;
						var1 -= var2;
						var2 = anIntArray2648[var2];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									method3093(anIntArray2459, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var10);
									var4 += var13;
									var5 += var17;
									var8 += var16;
									var2 += anInt2462;
								}
							}

							method3093(anIntArray2459, var2, 0, 0, var3 >> 14, var5 >> 14, var8, var10);
							var3 += var14;
							var5 += var17;
							var8 += var16;
							var2 += anInt2462;
						}
					} else {
						var0 -= var1;
						var1 -= var2;
						var2 = anIntArray2648[var2];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									method3093(anIntArray2459, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var10);
									var4 += var13;
									var5 += var17;
									var8 += var16;
									var2 += anInt2462;
								}
							}

							method3093(anIntArray2459, var2, 0, 0, var5 >> 14, var3 >> 14, var8, var10);
							var3 += var14;
							var5 += var17;
							var8 += var16;
							var2 += anInt2462;
						}
					}
				}
			}
		}
	}

}
