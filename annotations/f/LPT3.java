/*  1 */ package f;public final class LPT3 implements Cloneable, Comparable { public static final uj[] sm = new uj[0]; public static final UD0[] rH = new UD0[0]; public static final byte[] b4; public byte ux0; public int Iu; public short bj0; public int ph0; public int dk = -1; public int wC0; public Hu0 Y8; public short Pa0 = 0; public boolean Rv0 = false; public byte xp0 = 0; public byte C90 = 0; public m9 Ap0 = m9.Bt0; public hR el = null; public short lA = 0; public short KD0 = 0; public XZ h3 = XZ.Sn0; public byte Kp = 0; public int lh = 0; public byte KU = -1; public short O5 = 0; public short ID0 = 9999; public short B90 = -1; public wc c3; public boolean Sg0 = true; public boolean IK0; public boolean Ym0 = true; public boolean kd = true; public Uj t5 = Uj.Lt; public byte z20; public short YB = -1; public dv qA0; public final short Iv0() { short s; if ((s = this.B90) > -1) return s;  wc wc1; if ((wc1 = this.c3) != null) { short s1 = 30000;
/*  2 */       s1 = (short)(wc1.Hl0.gw0 * 10 + s1);
/*  3 */       switch (this.wg0.ordinal()) { default: return (!this.TA0 && !this.cOm4) ? (short)(s1 + 1) : s1;case 12: return (short)(s1 + 6);case 1: case 9: case 10: case 11: return (short)(s1 + 2);case 6: return (short)(s1 + 3);case 2: case 3: case 5: case 7: return (short)(s1 + 4);case 4: case 8: break; }  return (short)(s1 + 5); }  return this.bj0; } public dv i80; public int[] iI0; public byte kU; public byte Sd0; public short nk0; public byte ab; public byte iY; public short Dw; public byte rU; public byte yE0; public short kx0; public short Is; public boolean uL; public mA KI; public byte m20; public Ht0 de0; public v7 wg0; public YearMonth BU; public Uj sw; public yL ge; public boolean EA; public uj[] yq0; public boolean TA0; public boolean cOm4; public byte ED0; public byte bi; public short GK; public UD0[] ia0; public Predicate J20; public LPT3() { dv dv1 = dv.wS; this.i80 = this; this.iI0 = null; this.kU = 0; this.Sd0 = 0; this.nk0 = 0; this.ab = 0; this.iY = 0; this.Dw = 0; this.rU = -1; this.yE0 = -1; this.kx0 = -1; this.Is = 0; this.uL = false; this.KI = mA.uZ; this.m20 = 0; this.de0 = Ht0.P00; this.wg0 = v7.Kj0; this.BU = null; this.sw = null; this.ge = null; this.yq0 = sm; this.TA0 = false; this.cOm4 = false; this.ED0 = -1; this.bi = -1; this.GK = -1; this.ia0 = rH; } public LPT3(short paramShort1, short paramShort2, int paramInt1, int paramInt2, short paramShort3, Hu0 paramHu0) { dv dv1 = dv.wS; this.i80 = this; this.iI0 = null; this.kU = 0; this.Sd0 = 0; this.nk0 = 0; this.ab = 0; this.iY = 0; this.Dw = 0; this.rU = -1; this.yE0 = -1; this.kx0 = -1; this.Is = 0; this.uL = false; this.KI = mA.uZ; this.m20 = 0; this.de0 = Ht0.P00; this.wg0 = v7.Kj0; this.BU = null; this.sw = null; this.ge = null; this.yq0 = sm; this.TA0 = false; this.cOm4 = false; this.ED0 = -1; this.bi = -1; this.GK = -1; this.ia0 = rH; this.ux0 = 10; this.bj0 = paramShort1; this.B90 = paramShort2; this.Iu = paramInt1; this.wC0 = paramInt2; this.ph0 = paramShort3; this.Y8 = paramHu0; this.O5 = paramHu0.Nq(); } static { (b4 = new byte[25])[3] = -3; (new byte[25])[2] = -2; (new byte[25])[1] = -1; (new byte[25])[0] = 10; } public final void vy0(short paramShort, HI paramHI, ByteBuffer paramByteBuffer) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_3
/*    */     //   2: dup
/*    */     //   3: dup
/*    */     //   4: dup2
/*    */     //   5: dup2
/*    */     //   6: aload_0
/*    */     //   7: aload_3
/*    */     //   8: aload_0
/*    */     //   9: iload_1
/*    */     //   10: aload_0
/*    */     //   11: iload_1
/*    */     //   12: aload_0
/*    */     //   13: iload_1
/*    */     //   14: aload_0
/*    */     //   15: aload_2
/*    */     //   16: invokevirtual bO : ()B
/*    */     //   19: putfield ux0 : B
/*    */     //   22: putfield bj0 : S
/*    */     //   25: ldc_w 240000
/*    */     //   28: iadd
/*    */     //   29: putfield Iu : I
/*    */     //   32: ldc_w 130000
/*    */     //   35: iadd
/*    */     //   36: putfield wC0 : I
/*    */     //   39: invokevirtual getShort : ()S
/*    */     //   42: bipush #10
/*    */     //   44: imul
/*    */     //   45: putfield ph0 : I
/*    */     //   48: invokevirtual get : ()B
/*    */     //   51: pop
/*    */     //   52: invokevirtual get : ()B
/*    */     //   55: pop
/*    */     //   56: invokevirtual get : ()B
/*    */     //   59: pop
/*    */     //   60: invokevirtual get : ()B
/*    */     //   63: pop
/*    */     //   64: invokevirtual get : ()B
/*    */     //   67: pop
/*    */     //   68: invokevirtual get : ()B
/*    */     //   71: pop
/*    */     //   72: invokevirtual getShort : ()S
/*    */     //   75: dup
/*    */     //   76: bipush #31
/*    */     //   78: iand
/*    */     //   79: i2b
/*    */     //   80: invokestatic wY : (B)Lf/Ht0;
/*    */     //   83: pop
/*    */     //   84: ldc_w 65535
/*    */     //   87: iand
/*    */     //   88: bipush #7
/*    */     //   90: ishr
/*    */     //   91: bipush #7
/*    */     //   93: iand
/*    */     //   94: istore_1
/*    */     //   95: getfield ux0 : B
/*    */     //   98: dup
/*    */     //   99: istore_2
/*    */     //   100: iconst_2
/*    */     //   101: if_icmpne -> 157
/*    */     //   104: getstatic f/Hu0.It : [Lf/Hu0;
/*    */     //   107: dup
/*    */     //   108: astore_2
/*    */     //   109: arraylength
/*    */     //   110: istore #4
/*    */     //   112: iconst_0
/*    */     //   113: istore #5
/*    */     //   115: iload #5
/*    */     //   117: iload #4
/*    */     //   119: if_icmpge -> 145
/*    */     //   122: aload_2
/*    */     //   123: iload #5
/*    */     //   125: aaload
/*    */     //   126: dup
/*    */     //   127: astore #6
/*    */     //   129: getfield Ya : B
/*    */     //   132: iload_1
/*    */     //   133: if_icmpne -> 139
/*    */     //   136: goto -> 148
/*    */     //   139: iinc #5, 1
/*    */     //   142: goto -> 115
/*    */     //   145: aconst_null
/*    */     //   146: astore #6
/*    */     //   148: aload_0
/*    */     //   149: aload #6
/*    */     //   151: putfield Y8 : Lf/Hu0;
/*    */     //   154: goto -> 223
/*    */     //   157: iload_2
/*    */     //   158: iconst_3
/*    */     //   159: if_icmpeq -> 167
/*    */     //   162: iload_2
/*    */     //   163: iconst_4
/*    */     //   164: if_icmpne -> 223
/*    */     //   167: iload_1
/*    */     //   168: iconst_5
/*    */     //   169: if_icmpne -> 182
/*    */     //   172: aload_0
/*    */     //   173: getstatic f/Hu0.M8 : Lf/Hu0;
/*    */     //   176: putfield Y8 : Lf/Hu0;
/*    */     //   179: goto -> 223
/*    */     //   182: getstatic f/Hu0.It : [Lf/Hu0;
/*    */     //   185: dup
/*    */     //   186: astore_2
/*    */     //   187: arraylength
/*    */     //   188: istore #4
/*    */     //   190: iconst_0
/*    */     //   191: istore #5
/*    */     //   193: iload #5
/*    */     //   195: iload #4
/*    */     //   197: if_icmpge -> 145
/*    */     //   200: aload_2
/*    */     //   201: iload #5
/*    */     //   203: aaload
/*    */     //   204: dup
/*    */     //   205: astore #6
/*    */     //   207: getfield H2 : B
/*    */     //   210: iload_1
/*    */     //   211: if_icmpne -> 217
/*    */     //   214: goto -> 148
/*    */     //   217: iinc #5, 1
/*    */     //   220: goto -> 193
/*    */     //   223: aload_3
/*    */     //   224: dup
/*    */     //   225: dup2
/*    */     //   226: invokevirtual get : ()B
/*    */     //   229: istore_1
/*    */     //   230: invokevirtual get : ()B
/*    */     //   233: pop
/*    */     //   234: invokevirtual get : ()B
/*    */     //   237: pop
/*    */     //   238: invokevirtual get : ()B
/*    */     //   241: dup
/*    */     //   242: istore_2
/*    */     //   243: iconst_3
/*    */     //   244: if_icmpeq -> 265
/*    */     //   247: iload_2
/*    */     //   248: iconst_4
/*    */     //   249: if_icmpeq -> 255
/*    */     //   252: goto -> 272
/*    */     //   255: aload_0
/*    */     //   256: getstatic f/Hu0.jf0 : Lf/Hu0;
/*    */     //   259: putfield Y8 : Lf/Hu0;
/*    */     //   262: goto -> 272
/*    */     //   265: aload_0
/*    */     //   266: getstatic f/Hu0.Uw : Lf/Hu0;
/*    */     //   269: putfield Y8 : Lf/Hu0;
/*    */     //   272: iload_2
/*    */     //   273: aload_3
/*    */     //   274: dup
/*    */     //   275: invokevirtual get : ()B
/*    */     //   278: pop
/*    */     //   279: invokevirtual get : ()B
/*    */     //   282: pop
/*    */     //   283: iconst_4
/*    */     //   284: if_icmpne -> 298
/*    */     //   287: aload_0
/*    */     //   288: aload_3
/*    */     //   289: invokevirtual get : ()B
/*    */     //   292: putfield KU : B
/*    */     //   295: goto -> 303
/*    */     //   298: aload_3
/*    */     //   299: invokevirtual get : ()B
/*    */     //   302: pop
/*    */     //   303: aload_3
/*    */     //   304: dup
/*    */     //   305: dup2
/*    */     //   306: invokevirtual get : ()B
/*    */     //   309: pop
/*    */     //   310: invokevirtual get : ()B
/*    */     //   313: pop
/*    */     //   314: invokevirtual get : ()B
/*    */     //   317: pop
/*    */     //   318: invokevirtual get : ()B
/*    */     //   321: aload_3
/*    */     //   322: invokevirtual getShort : ()S
/*    */     //   325: istore_2
/*    */     //   326: sipush #128
/*    */     //   329: iand
/*    */     //   330: pop
/*    */     //   331: iconst_0
/*    */     //   332: istore #4
/*    */     //   334: iload #4
/*    */     //   336: bipush #6
/*    */     //   338: if_icmpge -> 370
/*    */     //   341: iload_2
/*    */     //   342: bipush #8
/*    */     //   344: iload #4
/*    */     //   346: ishl
/*    */     //   347: iand
/*    */     //   348: ifeq -> 360
/*    */     //   351: aload_0
/*    */     //   352: iload #4
/*    */     //   354: invokestatic aU : (B)Lf/hR;
/*    */     //   357: putfield el : Lf/hR;
/*    */     //   360: iload #4
/*    */     //   362: iconst_1
/*    */     //   363: iadd
/*    */     //   364: i2b
/*    */     //   365: istore #4
/*    */     //   367: goto -> 334
/*    */     //   370: iconst_0
/*    */     //   371: istore_2
/*    */     //   372: iload_2
/*    */     //   373: bipush #6
/*    */     //   375: if_icmpge -> 418
/*    */     //   378: aload_0
/*    */     //   379: aload_3
/*    */     //   380: invokevirtual get : ()B
/*    */     //   383: istore #4
/*    */     //   385: getfield el : Lf/hR;
/*    */     //   388: dup
/*    */     //   389: astore #5
/*    */     //   391: ifnull -> 410
/*    */     //   394: aload #5
/*    */     //   396: getfield dL : B
/*    */     //   399: iload_2
/*    */     //   400: if_icmpne -> 410
/*    */     //   403: aload_0
/*    */     //   404: iload #4
/*    */     //   406: i2s
/*    */     //   407: putfield lA : S
/*    */     //   410: iload_2
/*    */     //   411: iconst_1
/*    */     //   412: iadd
/*    */     //   413: i2b
/*    */     //   414: istore_2
/*    */     //   415: goto -> 372
/*    */     //   418: aload_3
/*    */     //   419: invokevirtual get : ()B
/*    */     //   422: sipush #255
/*    */     //   425: iand
/*    */     //   426: i2s
/*    */     //   427: dup
/*    */     //   428: aload_0
/*    */     //   429: swap
/*    */     //   430: putfield Pa0 : S
/*    */     //   433: tableswitch default -> 460, 253 -> 491, 254 -> 477, 255 -> 463
/*    */     //   460: goto -> 502
/*    */     //   463: aload_0
/*    */     //   464: dup
/*    */     //   465: bipush #100
/*    */     //   467: putfield Pa0 : S
/*    */     //   470: iconst_1
/*    */     //   471: putfield Rv0 : Z
/*    */     //   474: goto -> 502
/*    */     //   477: aload_0
/*    */     //   478: dup
/*    */     //   479: bipush #50
/*    */     //   481: putfield Pa0 : S
/*    */     //   484: iconst_1
/*    */     //   485: putfield Rv0 : Z
/*    */     //   488: goto -> 502
/*    */     //   491: aload_0
/*    */     //   492: dup
/*    */     //   493: bipush #25
/*    */     //   495: putfield Pa0 : S
/*    */     //   498: iconst_1
/*    */     //   499: putfield Rv0 : Z
/*    */     //   502: iload_1
/*    */     //   503: aload_3
/*    */     //   504: dup
/*    */     //   505: dup
/*    */     //   506: aload_0
/*    */     //   507: aload_3
/*    */     //   508: invokevirtual get : ()B
/*    */     //   511: putfield C90 : B
/*    */     //   514: invokevirtual get : ()B
/*    */     //   517: pop
/*    */     //   518: invokevirtual get : ()B
/*    */     //   521: pop
/*    */     //   522: invokevirtual get : ()B
/*    */     //   525: pop
/*    */     //   526: ifle -> 542
/*    */     //   529: iload_1
/*    */     //   530: bipush #7
/*    */     //   532: if_icmpeq -> 542
/*    */     //   535: aload_0
/*    */     //   536: getstatic f/dv.JL : Lf/dv;
/*    */     //   539: putfield qA0 : Lf/dv;
/*    */     //   542: aload_0
/*    */     //   543: getfield Y8 : Lf/Hu0;
/*    */     //   546: dup
/*    */     //   547: astore_1
/*    */     //   548: getstatic f/Hu0.JV : Lf/Hu0;
/*    */     //   551: if_acmpne -> 561
/*    */     //   554: aload_0
/*    */     //   555: getstatic f/dv.E30 : Lf/dv;
/*    */     //   558: putfield qA0 : Lf/dv;
/*    */     //   561: aload_0
/*    */     //   562: aload_1
/*    */     //   563: getfield tj : S
/*    */     //   566: putfield O5 : S
/*    */     //   569: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 104
/*    */     //   #2	-> 151
/*    */     //   #3	-> 182
/*    */     //   #4	-> 226
/*    */     //   #5	-> 396
/*    */     //   #6	-> 407
/*    */     //   #7	-> 563
/*    */     //   #8	-> 566 } public final dv default(boolean paramBoolean) { return (this.c3 != null) ? (paramBoolean ? dv.wS : dv.JL) : (paramBoolean ? this.i80 : this.qA0); } public final short u1() { return this.bj0; } public final int ms() { return this.ph0; } public final String X50() { return Ey0(38); } public final String getName() { return Ml0.OH0(this.Iu); } public final String UQ(byte paramByte) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: getfield Iu : I
/*    */     //   5: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   8: astore_2
/*    */     //   9: getfield bj0 : S
/*    */     //   12: dup
/*    */     //   13: istore_3
/*    */     //   14: tableswitch default -> 64, 2431 -> 124, 2432 -> 124, 2433 -> 124, 2434 -> 124, 2435 -> 124, 2436 -> 124, 2437 -> 124, 2438 -> 124, 2439 -> 124
/*    */     //   64: iload_3
/*    */     //   65: tableswitch default -> 92, 4576 -> 124, 4577 -> 124, 4578 -> 124
/*    */     //   92: iload_3
/*    */     //   93: tableswitch default -> 120, 4624 -> 124, 4625 -> 124, 4626 -> 124
/*    */     //   120: iconst_0
/*    */     //   121: goto -> 125
/*    */     //   124: iconst_1
/*    */     //   125: ifne -> 207
/*    */     //   128: iload_3
/*    */     //   129: tableswitch default -> 192, 2440 -> 196, 2441 -> 196, 2442 -> 196, 2443 -> 196, 2444 -> 196, 2445 -> 196, 2446 -> 196, 2447 -> 196, 2448 -> 196, 2449 -> 196, 2450 -> 196, 2451 -> 196
/*    */     //   192: iconst_0
/*    */     //   193: goto -> 197
/*    */     //   196: iconst_1
/*    */     //   197: ifeq -> 203
/*    */     //   200: goto -> 207
/*    */     //   203: iconst_0
/*    */     //   204: goto -> 208
/*    */     //   207: iconst_1
/*    */     //   208: ifeq -> 260
/*    */     //   211: iload_1
/*    */     //   212: ifle -> 260
/*    */     //   215: aload_2
/*    */     //   216: ldc_w ' - '
/*    */     //   219: invokestatic vz : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   222: new java/lang/StringBuilder
/*    */     //   225: dup
/*    */     //   226: iload_1
/*    */     //   227: swap
/*    */     //   228: invokespecial <init> : ()V
/*    */     //   231: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   234: ldc_w ''
/*    */     //   237: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   240: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   243: sipush #5496
/*    */     //   246: swap
/*    */     //   247: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*    */     //   250: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   253: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   256: astore_2
/*    */     //   257: goto -> 444
/*    */     //   260: iload_3
/*    */     //   261: lookupswitch default -> 344, 3342 -> 348, 3343 -> 348, 3344 -> 348, 3361 -> 348, 3362 -> 348, 3363 -> 348, 4611 -> 348, 4636 -> 348, 4647 -> 348
/*    */     //   344: iconst_0
/*    */     //   345: goto -> 349
/*    */     //   348: iconst_1
/*    */     //   349: ifeq -> 374
/*    */     //   352: aload_2
/*    */     //   353: ldc_w ' - '
/*    */     //   356: invokestatic vz : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   359: iload_1
/*    */     //   360: sipush #2021
/*    */     //   363: iadd
/*    */     //   364: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   367: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   370: astore_2
/*    */     //   371: goto -> 444
/*    */     //   374: aload_0
/*    */     //   375: getfield c3 : Lf/wc;
/*    */     //   378: dup
/*    */     //   379: astore_0
/*    */     //   380: ifnull -> 444
/*    */     //   383: aload_0
/*    */     //   384: invokevirtual XF0 : ()Z
/*    */     //   387: ifeq -> 444
/*    */     //   390: iload_1
/*    */     //   391: aload_2
/*    */     //   392: ldc_w ' ('
/*    */     //   395: invokestatic vz : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   398: astore_0
/*    */     //   399: invokestatic Er : (B)Lf/UX;
/*    */     //   402: dup
/*    */     //   403: astore_1
/*    */     //   404: getfield Ii : B
/*    */     //   407: sipush #32000
/*    */     //   410: iadd
/*    */     //   411: istore_2
/*    */     //   412: getstatic f/Ml0.nW : Lf/Ut0;
/*    */     //   415: iload_2
/*    */     //   416: invokevirtual return : (I)Z
/*    */     //   419: ifeq -> 430
/*    */     //   422: iload_2
/*    */     //   423: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   426: astore_1
/*    */     //   427: goto -> 435
/*    */     //   430: aload_1
/*    */     //   431: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   434: astore_1
/*    */     //   435: aload_0
/*    */     //   436: aload_1
/*    */     //   437: ldc_w ')'
/*    */     //   440: invokestatic Vr0 : (Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   443: astore_2
/*    */     //   444: aload_2
/*    */     //   445: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 2
/*    */     //   #2	-> 9
/*    */     //   #3	-> 216
/*    */     //   #4	-> 222
/*    */     //   #5	-> 353
/*    */     //   #6	-> 364
/*    */     //   #7	-> 392
/*    */     //   #8	-> 399
/*    */     //   #9	-> 404
/*    */     //   #10	-> 412
/*    */     //   #11	-> 416
/*    */     //   #12	-> 423
/*  3 */     //   #13	-> 437 } public final int gA() { return this.Iu; } public final void Gd(int paramInt) { this.Iu = paramInt; } public final Hu0 ws0() { return this.Y8; } public final byte Ue0() { return this.C90; } public final int E10() { return this.lh; } public final void zJ0(Predicate paramPredicate) { this.J20 = paramPredicate; } public final boolean ZO(WD paramWD) { Predicate predicate; return ((predicate = this.J20) != null) ? test((T)paramWD) : false; } public final boolean co0() { return (this.ia0.length > 0); } public final UD0[] gJ0() { return this.ia0; } public final short a90() { return this.kx0; } public final boolean bj() { short s; return (this.kx0 < 1) ? false : ((((s = this.bj0) >= 339 && s <= 346) || (s >= 5420 && s <= 5425) || (s >= 8420 && s <= 8427) || (s >= 1297 && s <= 1298) || (s >= 9420 && s <= 9427))); } public final void vr(wc paramwc) { this.c3 = paramwc; } public final wc Pd0() { return this.c3; } public final int coM8() { int i; return ((i = this.dk) > 0 && i <= this.ph0) ? i : (short)(this.ph0 / 2); } public final boolean vx() { if (this.Y8 == Hu0.Bm || bj()) return false;  return this.Sg0; } public final boolean rg0(boolean paramBoolean) { if (paramBoolean) { if (this.Y8 == Hu0.Bm || bj()) return false;  if (!this.wg0.mC0) return false;  }
/*  4 */      return this.Ym0; } public final byte ZE() { return this.z20; } public final int wf0() { wc wc1; if ((wc1 = this.c3) != null) return Hu0.w2.od * 100 + wc1.Hl0.gw0;  return this.O5; } public final LPT3 mi(short paramShort) { try { lPT3.bj0 = paramShort; lPT3.B90 = Iv0(); LPT3 lPT3; (lPT3 = (LPT3)clone()).YB = this.bj0; return (LPT3)clone(); } catch (CloneNotSupportedException cloneNotSupportedException) { null.printStackTrace(); return null; }  } public final boolean lF0() { return (this.iI0 != null); } public final void Na(byte paramByte1, byte paramByte2) { this.rU = paramByte1; this.yE0 = paramByte2; } public final void YI(byte paramByte1, byte paramByte2) { this.ED0 = paramByte1; this.bi = paramByte2; } public final int cd0(LPT3 paramLPT3) { if (paramLPT3 == null) return 0;  if (wf0() != paramLPT3.wf0()) return wf0() - paramLPT3.wf0();  Hu0 hu0; if (this.Y8 == (hu0 = Hu0.JV) && paramLPT3.Y8 == hu0 && bj() != paramLPT3.bj()) return bj() - paramLPT3.bj();  int i; byte[] arrayOfByte; if (this
/*  5 */       .Y8 == (
/*  6 */       hu0 = Hu0.jf0) && paramLPT3
/*  7 */       .Y8 == hu0 && (
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 12 */       i = (arrayOfByte = b4)[this.KU] - arrayOfByte[paramLPT3.KU]) != 0) return i;
/*    */ 
/*    */ 
/*    */     
/* 16 */     return ((i = Ml0.OH0(this.Iu).toLowerCase().compareTo(Ml0.OH0(paramLPT3.Iu).toLowerCase())) != 0) ? i : (((i = Boolean.compare(paramLPT3.Sg0, this.Sg0)) != 0) ? i : Integer.compare(this.bj0, paramLPT3.bj0)); }
/*    */ 
/*    */   
/*    */   public final void Ji0(m9 paramm9) {
/*    */     this.Ap0 = paramm9;
/*    */   }
/*    */   
/*    */   public final void xm0() {
/*    */     this.ID0 = 1;
/*    */   }
/*    */   
/*    */   public final String Ey0(int paramInt) {
/*    */     int i;
/*    */     if ((i = this.wC0) < 0)
/*    */       return ""; 
/*    */     String str = Ml0.OH0(i);
/*    */     if (paramInt > 0) {
/*    */       boolean bool = false;
/*    */       str = cS.Qd0(this, paramInt, null, bool, 0);
/*    */     } 
/*    */     return this;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/LPT3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */