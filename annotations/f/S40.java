/* 1 */ package f;public final class S40 extends YK0 { public static final ik M2 = C00.gd(S40.class); public char[] nz0; public S40(HI paramHI, F40 paramF40, T7 paramT7) { super(paramHI, paramF40, paramT7); if ("zh".equals(paramHI.SO())) { this.nz0 = Iw.VD0; } else { this.nz0 = Iw.W50; }  } public final synchronized void PH0(int paramInt) { if (this.Pv0[paramInt] != null)
/*   */       return;  ByteBuffer byteBuffer; short s, arrayOfShort[]; int arrayOfInt1[], arrayOfInt2[], j;
/* 3 */     for (int i = byteBuffer.getShort() * 765 & 0xFFFF; j < s; ) { int k = i * ++j & 0xFFFF | (i * ++j & 0xFFFF) << 16; arrayOfInt1[j] = byteBuffer.getInt() ^ k; arrayOfInt2[j] = byteBuffer.getInt() ^ k; }  this(); StringBuilder stringBuilder; for (j = 0; j < s; ) { int k, m = (k = j + 1) * 596947 & 0xFFFF; int n; if (byteBuffer.limit() >= (n = arrayOfInt1[j]) && n >= 0) { byteBuffer.position(n); stringBuilder.setLength(0); n = 0; byte b = 0; label134: while (true) { if (b < arrayOfInt2[j]) { if (byteBuffer.remaining() >= 2) { m = m + 18749 & 0xFFFF; int i1; if ((i1 = (short)(byteBuffer.getShort() ^ m)) == -1) break;  switch (i1) { default: if (n != 0) { int i2 = 0, i3 = 0;
/*   */ 
/*   */                     
/*   */                     while (true)
/* 7 */                     { while (i2 >= 15) { if ((i2 += -15) > 0) { int i6; if (((i6 = i3 | (i1 & 0xFFFF) << 9 - i2 & 0x1FF) & 0xFF) == 255) continue label134;  if (i6 != 0 && i6 != 1) { char[] arrayOfChar; if (i6 < (arrayOfChar = this.nz0).length) { if (i6 != 480) { if (i6 != 481) { stringBuilder.append(arrayOfChar[i6]); continue; }  stringBuilder.append("MN"); continue; }  stringBuilder.append("PK"); continue; }  Object[] arrayOfObject; (arrayOfObject = new Object[1])[0] = Short.valueOf(i1); String.format("%1$02X", arrayOfObject); M2.getClass(); }  }  }  int i4; int i5; if (((i5 = (i4 = i1 & 0xFFFF) >> i2 & 0x1FF) & 0xFF) == 255) break;  if (i5 != 0 && i5 != 1) { char[] arrayOfChar; if (i5 < (arrayOfChar = this.nz0).length) { if (i5 != 480) { if (i5 != 481) { stringBuilder.append(arrayOfChar[i5]); } else { stringBuilder.append("MN"); }  } else { stringBuilder.append("PK"); }  } else { Object[] arrayOfObject; (arrayOfObject = new Object[1])[0] = Short.valueOf(i1); String.format("%1$02X", arrayOfObject); M2.getClass(); }  }  if ((i1 = i2 + 9) < 15) { i2 = i4 >> i1 & 0x1FF; i1 += 9; i3 = i2; i2 = i1; } else { i2 = i1; }  if (byteBuffer.remaining() < 2) break;  i1 = (short)(byteBuffer.getShort() ^ m); m = m + 18749 & 0xFFFF; b++; }  } else if (i1 != 0 && i1 != 1) { char[] arrayOfChar; if (i1 >= 0 && i1 < (arrayOfChar = this.nz0).length) { if (i1 != 480) { if (i1 != 481) { stringBuilder.append(arrayOfChar[i1]); } else { stringBuilder.append("MN"); }  } else { stringBuilder.append("PK"); }  } else { sk0(paramInt); Object[] arrayOfObject; (arrayOfObject = new Object[1])[0] = Short.valueOf(i1); String.format("%1$02X", arrayOfObject);
/* 8 */                       Aq0.Qu0(i1, true);
/* 9 */                       M2.getClass(); }  }  b++; continue;case 9660: case 9661: stringBuilder.append("\n\n"); break;case -2: arrayOfShort[0] = 0; arrayOfShort[1] = 0; arrayOfShort[2] = 0; arrayOfShort[3] = 0; m = (short)(byteBuffer.getShort() & 0xFFFF ^ m); i1 = m + 18749 & 0xFFFF; arrayOfShort[0] = m;case -3840: n = 1; break;case -8192: if (stringBuilder.length() >= 2 && stringBuilder.charAt(stringBuilder.length() - 2) == '\n' && stringBuilder.charAt(stringBuilder.length() - 1) == '\n') break;  stringBuilder.append("\n"); break; }  }  } else { break; }  b++; }  this.Pv0[paramInt][0][j] = stringBuilder.toString(); }  j = k; }
/*   */      }
/*   */ 
/*   */   
/*   */   public final int sk0(int paramInt) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield Sy0 : Z
/*   */     //   4: ifne -> 16
/*   */     //   7: aload_0
/*   */     //   8: getfield coM3 : Z
/*   */     //   11: ifne -> 16
/*   */     //   14: iload_1
/*   */     //   15: ireturn
/*   */     //   16: aload_0
/*   */     //   17: getfield qt0 : Lf/HI;
/*   */     //   20: invokevirtual bO : ()B
/*   */     //   23: iconst_3
/*   */     //   24: if_icmpne -> 264
/*   */     //   27: iload_1
/*   */     //   28: bipush #12
/*   */     //   30: if_icmpgt -> 35
/*   */     //   33: iload_1
/*   */     //   34: ireturn
/*   */     //   35: iload_1
/*   */     //   36: sipush #386
/*   */     //   39: if_icmpgt -> 46
/*   */     //   42: iload_1
/*   */     //   43: iconst_1
/*   */     //   44: isub
/*   */     //   45: ireturn
/*   */     //   46: iload_1
/*   */     //   47: sipush #392
/*   */     //   50: if_icmpgt -> 58
/*   */     //   53: iload_1
/*   */     //   54: iconst_2
/*   */     //   55: goto -> 44
/*   */     //   58: iload_1
/*   */     //   59: sipush #393
/*   */     //   62: if_icmpne -> 69
/*   */     //   65: sipush #390
/*   */     //   68: ireturn
/*   */     //   69: iload_1
/*   */     //   70: sipush #412
/*   */     //   73: if_icmpgt -> 81
/*   */     //   76: iload_1
/*   */     //   77: iconst_4
/*   */     //   78: goto -> 44
/*   */     //   81: iload_1
/*   */     //   82: sipush #413
/*   */     //   85: if_icmpne -> 92
/*   */     //   88: sipush #408
/*   */     //   91: ireturn
/*   */     //   92: aload_0
/*   */     //   93: getfield coM3 : Z
/*   */     //   96: ifeq -> 189
/*   */     //   99: iload_1
/*   */     //   100: sipush #610
/*   */     //   103: if_icmpgt -> 111
/*   */     //   106: iload_1
/*   */     //   107: iconst_5
/*   */     //   108: goto -> 44
/*   */     //   111: iload_1
/*   */     //   112: sipush #619
/*   */     //   115: if_icmpgt -> 124
/*   */     //   118: iload_1
/*   */     //   119: bipush #6
/*   */     //   121: goto -> 44
/*   */     //   124: iload_1
/*   */     //   125: sipush #626
/*   */     //   128: if_icmpgt -> 137
/*   */     //   131: iload_1
/*   */     //   132: bipush #7
/*   */     //   134: goto -> 44
/*   */     //   137: iload_1
/*   */     //   138: sipush #628
/*   */     //   141: if_icmpgt -> 150
/*   */     //   144: iload_1
/*   */     //   145: bipush #8
/*   */     //   147: goto -> 44
/*   */     //   150: iload_1
/*   */     //   151: sipush #630
/*   */     //   154: if_icmpgt -> 163
/*   */     //   157: iload_1
/*   */     //   158: bipush #9
/*   */     //   160: goto -> 44
/*   */     //   163: iload_1
/*   */     //   164: sipush #647
/*   */     //   167: if_icmpgt -> 176
/*   */     //   170: iload_1
/*   */     //   171: bipush #10
/*   */     //   173: goto -> 44
/*   */     //   176: iload_1
/*   */     //   177: sipush #662
/*   */     //   180: if_icmpgt -> 170
/*   */     //   183: iload_1
/*   */     //   184: bipush #11
/*   */     //   186: goto -> 44
/*   */     //   189: iload_1
/*   */     //   190: sipush #414
/*   */     //   193: if_icmpne -> 198
/*   */     //   196: iconst_m1
/*   */     //   197: ireturn
/*   */     //   198: iload_1
/*   */     //   199: sipush #610
/*   */     //   202: if_icmpgt -> 208
/*   */     //   205: goto -> 118
/*   */     //   208: iload_1
/*   */     //   209: sipush #619
/*   */     //   212: if_icmpgt -> 218
/*   */     //   215: goto -> 131
/*   */     //   218: iload_1
/*   */     //   219: sipush #626
/*   */     //   222: if_icmpgt -> 228
/*   */     //   225: goto -> 144
/*   */     //   228: iload_1
/*   */     //   229: sipush #628
/*   */     //   232: if_icmpgt -> 238
/*   */     //   235: goto -> 157
/*   */     //   238: iload_1
/*   */     //   239: sipush #630
/*   */     //   242: if_icmpgt -> 248
/*   */     //   245: goto -> 170
/*   */     //   248: iload_1
/*   */     //   249: sipush #647
/*   */     //   252: if_icmpgt -> 258
/*   */     //   255: goto -> 183
/*   */     //   258: iload_1
/*   */     //   259: bipush #12
/*   */     //   261: goto -> 44
/*   */     //   264: aload_0
/*   */     //   265: getfield qt0 : Lf/HI;
/*   */     //   268: invokevirtual bO : ()B
/*   */     //   271: iconst_4
/*   */     //   272: if_icmpne -> 567
/*   */     //   275: iload_1
/*   */     //   276: bipush #15
/*   */     //   278: if_icmpgt -> 283
/*   */     //   281: iload_1
/*   */     //   282: ireturn
/*   */     //   283: aload_0
/*   */     //   284: getfield coM3 : Z
/*   */     //   287: ifeq -> 392
/*   */     //   290: iload_1
/*   */     //   291: sipush #216
/*   */     //   294: if_icmpgt -> 300
/*   */     //   297: goto -> 42
/*   */     //   300: iload_1
/*   */     //   301: sipush #219
/*   */     //   304: if_icmpgt -> 310
/*   */     //   307: goto -> 53
/*   */     //   310: iload_1
/*   */     //   311: sipush #220
/*   */     //   314: if_icmpeq -> 388
/*   */     //   317: iload_1
/*   */     //   318: sipush #221
/*   */     //   321: if_icmpne -> 327
/*   */     //   324: goto -> 388
/*   */     //   327: iload_1
/*   */     //   328: sipush #224
/*   */     //   331: if_icmpgt -> 338
/*   */     //   334: sipush #220
/*   */     //   337: ireturn
/*   */     //   338: iload_1
/*   */     //   339: sipush #237
/*   */     //   342: if_icmpgt -> 348
/*   */     //   345: goto -> 76
/*   */     //   348: iload_1
/*   */     //   349: sipush #720
/*   */     //   352: if_icmpgt -> 358
/*   */     //   355: goto -> 106
/*   */     //   358: iload_1
/*   */     //   359: sipush #730
/*   */     //   362: if_icmpgt -> 368
/*   */     //   365: goto -> 118
/*   */     //   368: iload_1
/*   */     //   369: sipush #750
/*   */     //   372: if_icmpgt -> 378
/*   */     //   375: goto -> 131
/*   */     //   378: iload_1
/*   */     //   379: sipush #772
/*   */     //   382: if_icmpgt -> 131
/*   */     //   385: goto -> 144
/*   */     //   388: sipush #219
/*   */     //   391: ireturn
/*   */     //   392: iload_1
/*   */     //   393: bipush #38
/*   */     //   395: if_icmpgt -> 401
/*   */     //   398: goto -> 42
/*   */     //   401: iload_1
/*   */     //   402: sipush #216
/*   */     //   405: if_icmpgt -> 411
/*   */     //   408: goto -> 53
/*   */     //   411: iload_1
/*   */     //   412: sipush #219
/*   */     //   415: if_icmpgt -> 423
/*   */     //   418: iload_1
/*   */     //   419: iconst_3
/*   */     //   420: goto -> 44
/*   */     //   423: iload_1
/*   */     //   424: sipush #220
/*   */     //   427: if_icmpeq -> 563
/*   */     //   430: iload_1
/*   */     //   431: sipush #221
/*   */     //   434: if_icmpne -> 440
/*   */     //   437: goto -> 563
/*   */     //   440: iload_1
/*   */     //   441: sipush #224
/*   */     //   444: if_icmpgt -> 451
/*   */     //   447: sipush #219
/*   */     //   450: ireturn
/*   */     //   451: iload_1
/*   */     //   452: sipush #237
/*   */     //   455: if_icmpgt -> 461
/*   */     //   458: goto -> 106
/*   */     //   461: iload_1
/*   */     //   462: sipush #239
/*   */     //   465: if_icmpne -> 470
/*   */     //   468: iconst_m1
/*   */     //   469: ireturn
/*   */     //   470: iload_1
/*   */     //   471: sipush #510
/*   */     //   474: if_icmpgt -> 480
/*   */     //   477: goto -> 131
/*   */     //   480: iload_1
/*   */     //   481: sipush #511
/*   */     //   484: if_icmpne -> 489
/*   */     //   487: iconst_m1
/*   */     //   488: ireturn
/*   */     //   489: iload_1
/*   */     //   490: sipush #602
/*   */     //   493: if_icmpgt -> 499
/*   */     //   496: goto -> 144
/*   */     //   499: iload_1
/*   */     //   500: sipush #603
/*   */     //   503: if_icmpne -> 508
/*   */     //   506: iconst_m1
/*   */     //   507: ireturn
/*   */     //   508: iload_1
/*   */     //   509: sipush #720
/*   */     //   512: if_icmpgt -> 518
/*   */     //   515: goto -> 157
/*   */     //   518: iload_1
/*   */     //   519: sipush #730
/*   */     //   522: if_icmpgt -> 528
/*   */     //   525: goto -> 170
/*   */     //   528: iload_1
/*   */     //   529: sipush #750
/*   */     //   532: if_icmpgt -> 538
/*   */     //   535: goto -> 183
/*   */     //   538: iload_1
/*   */     //   539: sipush #810
/*   */     //   542: if_icmpgt -> 548
/*   */     //   545: goto -> 258
/*   */     //   548: iload_1
/*   */     //   549: sipush #811
/*   */     //   552: if_icmpne -> 557
/*   */     //   555: iconst_m1
/*   */     //   556: ireturn
/*   */     //   557: iload_1
/*   */     //   558: bipush #13
/*   */     //   560: goto -> 44
/*   */     //   563: sipush #218
/*   */     //   566: ireturn
/*   */     //   567: iload_1
/*   */     //   568: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 17
/*   */     //   #2	-> 20
/*   */     //   #3	-> 265
/*   */     //   #4	-> 268
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/S40.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */