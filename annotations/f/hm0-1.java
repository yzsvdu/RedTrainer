/*  1 */ package f;public final class hm0 { public static final eo g4 = new eo(); public static final uT[] m10 = new uT[0]; public short bh0; public byte fh; public byte zm = -1; public byte vt0 = -1; public byte f1 = -1; public String VK = ""; public boolean Lh; public boolean S90; public boolean Js; public UD0 hU = null; public byte FT; public byte ws; public final byte iJ; public cOm4 RN; public final jd0 K0; public byte G8; public byte LC0; public C30 if = C30.wm; public mi Ob0; public uT rF0; public uT[] qf; public uT[] Xn; public boolean Cs0; public short[] zG0; public byte[] Bm0; public short my; public boolean f8; public boolean Gt0; public boolean D5; private void uB0(Wl paramWl) { paramWl.LW
/*  2 */       .oD(this).bd(); } public boolean cOn; public short BC; public short yj0; public short zD0; public short xO; public short eH0; public boolean N3; public boolean c; public boolean Eg0; public short[] cM0; public short[] iz; public byte[] Hj0; public short KT; public byte[] wt; public Ht0 lPt1; public Ht0 se; public boolean A0; public uT eq0; public boolean h2; public UA0 FJ; public Bw[] Sn0; public boolean zd; public boolean aJ0; public boolean El0; public So bC; public So k6; public float jx; public Runnable gO; public kn0 Ui0; public byte i8; public hm0(jd0 paramjd0, byte paramByte1, byte paramByte2, byte paramByte3) { uT[] arrayOfUT = m10; this.Xn = this; this.Cs0 = false; this.Bm0 = null; this.my = -1; this.f8 = false; this.Gt0 = false; this.D5 = false; this.cOn = false; this.BC = -1; this.yj0 = -1; this.zD0 = -1; this.xO = -1; this.eH0 = 0; this.N3 = false; this.c = false; this.Eg0 = false; this.cM0 = new short[0]; this.iz = null; this.Hj0 = null; this.KT = -1; this.wt = new byte[hR.Tt0.length]; Ht0 ht0 = Ht0.P00; this.se = this; this.A0 = false; this.eq0 = null; this.h2 = false; this.FJ = null; this.Sn0 = null; this.zd = true; this.aJ0 = false; this.El0 = true; this.bC = null; this.k6 = null; this.gO = null; this.Ui0 = new kn0(); this.i8 = 0; this.K0 = paramjd0; this.FT = paramByte1; this.ws = paramByte2; this.iJ = paramByte3; } public hm0(byte paramByte1, byte paramByte2, int paramInt, short paramShort1, byte paramByte3, String paramString, byte paramByte4, byte paramByte5, byte paramByte6, short paramShort2, byte paramByte7, mA parammA, short paramShort3, short paramShort4, byte paramByte8, byte paramByte9) { uT[] arrayOfUT = m10; this.Xn = arrayOfUT; this.Cs0 = false; this.Bm0 = null; this.my = -1; this.f8 = false; this.Gt0 = false; this.D5 = false; this.cOn = false; this.BC = -1; this.yj0 = -1; this.zD0 = -1; this.xO = -1; this.eH0 = 0; this.N3 = false; this.c = false; this.Eg0 = false; this.cM0 = new short[0]; this.iz = null; this.Hj0 = null; this.KT = -1; this.wt = new byte[hR.Tt0.length]; Ht0 ht0 = Ht0.P00; this.se = ht0; this.A0 = false; this.eq0 = null; this.h2 = false; this.FJ = null; this.Sn0 = null; this.zd = true; this.aJ0 = false; this.El0 = true; this.bC = null; this.k6 = null; this.gO = null; this.Ui0 = new kn0(); this.i8 = 0; this.FT = paramByte1; this.ws = paramByte2; this.iJ = paramByte9; this(paramInt); this.K0 = jd01; jd0 jd01; (jd01 = new jd0()).nH(paramShort1, paramByte3, paramString, paramByte4, paramByte5, paramByte6, paramShort2, paramByte7, parammA, paramShort3, paramShort4, paramByte8); ZB0(paramShort1, paramByte3, paramString, paramByte4, paramByte5, paramByte6, paramByte7); } private void OZ() { km.wI0.K7.qg0(this.FT, (short)1046); } public final void ZB0(short paramShort, byte paramByte1, String paramString, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5) { UD0 uD0; this.bh0 = paramShort; this.fh = paramByte1; this.VK = paramString; if ((paramByte2 & 0x9) != 0) { paramByte1 = 1; } else { paramByte1 = 0; }  this.Lh = paramByte1; if ((paramByte2 & 0x4) != 0) { paramByte1 = 1; } else { paramByte1 = 0; }  this.S90 = paramByte1; if ((paramByte2 & 0x8) != 0) { paramByte1 = 1; } else { paramByte1 = 0; }
/*    */      this.Js = paramByte1; this.vt0 = paramByte3; this.f1 = paramByte4; this.zm = paramByte5; if (paramByte4 > 0) { if ((uD0 = On.v30().lpT3(paramShort)).TL > 0)
/*  4 */         this.hU = On.v30().lpT3((short)(uD0.TL + paramByte4 - 1));  } else { this.hU = On.v30().lpT3(uD0); }  } public final void JB0() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield K0 : Lf/jd0;
/*    */     //   4: getfield ta : Lf/Q90;
/*    */     //   7: dup
/*    */     //   8: astore_1
/*    */     //   9: getfield Jg : Z
/*    */     //   12: ifne -> 16
/*    */     //   15: return
/*    */     //   16: aload_0
/*    */     //   17: getfield k6 : Lf/So;
/*    */     //   20: ifnonnull -> 456
/*    */     //   23: aload_1
/*    */     //   24: getfield Cw0 : S
/*    */     //   27: sipush #250
/*    */     //   30: if_icmpne -> 456
/*    */     //   33: aload_0
/*    */     //   34: getfield bh0 : S
/*    */     //   37: ifeq -> 48
/*    */     //   40: aload_0
/*    */     //   41: getfield Lh : Z
/*    */     //   44: istore_1
/*    */     //   45: goto -> 53
/*    */     //   48: aload_1
/*    */     //   49: invokevirtual tm0 : ()Z
/*    */     //   52: istore_1
/*    */     //   53: iload_1
/*    */     //   54: ifeq -> 456
/*    */     //   57: aload_0
/*    */     //   58: dup
/*    */     //   59: getstatic f/km.MR : Lf/Gp0;
/*    */     //   62: dup
/*    */     //   63: iconst_4
/*    */     //   64: putfield iK : B
/*    */     //   67: sipush #1121
/*    */     //   70: putfield CoM9 : S
/*    */     //   73: ldc_w 1.33
/*    */     //   76: putfield jx : F
/*    */     //   79: ldc_w '#FF9AA2'
/*    */     //   82: invokestatic valueOf : (Ljava/lang/String;)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   85: astore_1
/*    */     //   86: getfield rF0 : Lf/uT;
/*    */     //   89: getfield Os0 : Lf/T0;
/*    */     //   92: getstatic f/F4.Qr0 : J
/*    */     //   95: dup2
/*    */     //   96: lstore_2
/*    */     //   97: invokevirtual gV : (J)Z
/*    */     //   100: ifne -> 138
/*    */     //   103: aload_0
/*    */     //   104: getfield rF0 : Lf/uT;
/*    */     //   107: dup
/*    */     //   108: astore #4
/*    */     //   110: ldc_w 1.4
/*    */     //   113: dup
/*    */     //   114: fstore #5
/*    */     //   116: aload #4
/*    */     //   118: getfield Os0 : Lf/T0;
/*    */     //   121: new f/F4
/*    */     //   124: dup
/*    */     //   125: lload_2
/*    */     //   126: aload_1
/*    */     //   127: fload #5
/*    */     //   129: invokespecial <init> : (JLcom/badlogic/gdx/graphics/Color;F)V
/*    */     //   132: invokevirtual Tz0 : (Lf/dj;)V
/*    */     //   135: putfield IC : F
/*    */     //   138: invokestatic k60 : ()Lf/So;
/*    */     //   141: astore_2
/*    */     //   142: bipush #6
/*    */     //   144: dup
/*    */     //   145: istore_3
/*    */     //   146: anewarray com/badlogic/gdx/graphics/Color
/*    */     //   149: dup
/*    */     //   150: dup
/*    */     //   151: dup2
/*    */     //   152: dup2
/*    */     //   153: astore #4
/*    */     //   155: iconst_0
/*    */     //   156: aload_1
/*    */     //   157: aastore
/*    */     //   158: ldc_w '#FFB7B2'
/*    */     //   161: invokestatic valueOf : (Ljava/lang/String;)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   164: iconst_1
/*    */     //   165: swap
/*    */     //   166: aastore
/*    */     //   167: ldc_w '#FFDAC1'
/*    */     //   170: invokestatic valueOf : (Ljava/lang/String;)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   173: iconst_2
/*    */     //   174: swap
/*    */     //   175: aastore
/*    */     //   176: ldc_w '#E2F0CB'
/*    */     //   179: invokestatic valueOf : (Ljava/lang/String;)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   182: iconst_3
/*    */     //   183: swap
/*    */     //   184: aastore
/*    */     //   185: ldc_w '#B5EAD7'
/*    */     //   188: invokestatic valueOf : (Ljava/lang/String;)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   191: iconst_4
/*    */     //   192: swap
/*    */     //   193: aastore
/*    */     //   194: ldc_w '#bfbbf6'
/*    */     //   197: invokestatic valueOf : (Ljava/lang/String;)Lcom/badlogic/gdx/graphics/Color;
/*    */     //   200: iconst_5
/*    */     //   201: swap
/*    */     //   202: aastore
/*    */     //   203: iconst_0
/*    */     //   204: istore #5
/*    */     //   206: iload #5
/*    */     //   208: iload_3
/*    */     //   209: if_icmpge -> 293
/*    */     //   212: aload_2
/*    */     //   213: aload_0
/*    */     //   214: aload #4
/*    */     //   216: iload #5
/*    */     //   218: aaload
/*    */     //   219: astore #6
/*    */     //   221: getfield rF0 : Lf/uT;
/*    */     //   224: getfield Os0 : Lf/T0;
/*    */     //   227: bipush #11
/*    */     //   229: ldc_w 1.8
/*    */     //   232: invokestatic gq : (Ljava/lang/Object;IF)Lf/Wz0;
/*    */     //   235: iconst_4
/*    */     //   236: newarray float
/*    */     //   238: dup
/*    */     //   239: dup
/*    */     //   240: astore #7
/*    */     //   242: aload #6
/*    */     //   244: aload #7
/*    */     //   246: aload #6
/*    */     //   248: aload #7
/*    */     //   250: aload #6
/*    */     //   252: aload #7
/*    */     //   254: aload #6
/*    */     //   256: getfield r : F
/*    */     //   259: iconst_0
/*    */     //   260: swap
/*    */     //   261: fastore
/*    */     //   262: getfield g : F
/*    */     //   265: iconst_1
/*    */     //   266: swap
/*    */     //   267: fastore
/*    */     //   268: getfield b : F
/*    */     //   271: iconst_2
/*    */     //   272: swap
/*    */     //   273: fastore
/*    */     //   274: getfield a : F
/*    */     //   277: iconst_3
/*    */     //   278: swap
/*    */     //   279: fastore
/*    */     //   280: invokevirtual qY : ([F)Lf/Wz0;
/*    */     //   283: invokevirtual PL : (Lf/Wz0;)Lf/So;
/*    */     //   286: pop
/*    */     //   287: iinc #5, 1
/*    */     //   290: goto -> 206
/*    */     //   293: aload_0
/*    */     //   294: dup
/*    */     //   295: dup
/*    */     //   296: dup2
/*    */     //   297: aload_2
/*    */     //   298: aload_0
/*    */     //   299: aload_2
/*    */     //   300: dup
/*    */     //   301: dup
/*    */     //   302: aload_0
/*    */     //   303: getfield rF0 : Lf/uT;
/*    */     //   306: getfield Os0 : Lf/T0;
/*    */     //   309: bipush #11
/*    */     //   311: ldc_w 1.8
/*    */     //   314: invokestatic gq : (Ljava/lang/Object;IF)Lf/Wz0;
/*    */     //   317: iconst_4
/*    */     //   318: newarray float
/*    */     //   320: dup
/*    */     //   321: dup
/*    */     //   322: astore_2
/*    */     //   323: aload_1
/*    */     //   324: aload_2
/*    */     //   325: aload_1
/*    */     //   326: aload_2
/*    */     //   327: aload_1
/*    */     //   328: aload_2
/*    */     //   329: aload_1
/*    */     //   330: getfield r : F
/*    */     //   333: iconst_0
/*    */     //   334: swap
/*    */     //   335: fastore
/*    */     //   336: getfield g : F
/*    */     //   339: iconst_1
/*    */     //   340: swap
/*    */     //   341: fastore
/*    */     //   342: getfield b : F
/*    */     //   345: iconst_2
/*    */     //   346: swap
/*    */     //   347: fastore
/*    */     //   348: getfield a : F
/*    */     //   351: iconst_3
/*    */     //   352: swap
/*    */     //   353: fastore
/*    */     //   354: invokevirtual qY : ([F)Lf/Wz0;
/*    */     //   357: invokevirtual PL : (Lf/Wz0;)Lf/So;
/*    */     //   360: pop
/*    */     //   361: sipush #32767
/*    */     //   364: fconst_0
/*    */     //   365: invokevirtual Ck0 : (IF)Lf/sh;
/*    */     //   368: pop
/*    */     //   369: putfield k6 : Lf/So;
/*    */     //   372: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   375: getfield pB0 : Lf/G30;
/*    */     //   378: invokevirtual mg : (Lf/G30;)Lf/sh;
/*    */     //   381: pop
/*    */     //   382: invokevirtual kn0 : ()V
/*    */     //   385: getstatic f/km.MR : Lf/Gp0;
/*    */     //   388: aload_0
/*    */     //   389: getfield FT : B
/*    */     //   392: invokevirtual a0 : (B)Lf/PE;
/*    */     //   395: iconst_1
/*    */     //   396: putfield c9 : Z
/*    */     //   399: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   402: getfield K7 : Lf/Wl;
/*    */     //   405: aload_0
/*    */     //   406: getfield FT : B
/*    */     //   409: sipush #1046
/*    */     //   412: invokevirtual yw0 : (BS)V
/*    */     //   415: ldc_w 150250
/*    */     //   418: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   421: sipush #5063
/*    */     //   424: swap
/*    */     //   425: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*    */     //   428: astore_0
/*    */     //   429: ldc ''
/*    */     //   431: putfield VK : Ljava/lang/String;
/*    */     //   434: getfield K0 : Lf/jd0;
/*    */     //   437: dup
/*    */     //   438: getfield ta : Lf/Q90;
/*    */     //   441: aload_0
/*    */     //   442: putfield nr : Ljava/lang/String;
/*    */     //   445: invokevirtual pO : ()V
/*    */     //   448: <illegal opcode> run : (Lf/hm0;)Ljava/lang/Runnable;
/*    */     //   453: putfield gO : Ljava/lang/Runnable;
/*    */     //   456: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 1
/*    */     //   #2	-> 4
/*    */     //   #3	-> 9
/*    */     //   #4	-> 17
/*    */     //   #5	-> 24
/*    */     //   #6	-> 34
/*    */     //   #7	-> 49
/*    */     //   #8	-> 59
/*    */     //   #9	-> 64
/*    */     //   #10	-> 70
/*    */     //   #11	-> 76
/*    */     //   #12	-> 86
/*    */     //   #13	-> 89
/*    */     //   #14	-> 104
/*    */     //   #15	-> 118
/*    */     //   #16	-> 121
/*    */     //   #17	-> 132
/*    */     //   #18	-> 138
/*    */     //   #19	-> 221
/*    */     //   #20	-> 224
/*    */     //   #21	-> 303
/*    */     //   #22	-> 306
/*    */     //   #23	-> 369
/*    */     //   #24	-> 375
/*    */     //   #25	-> 378
/*    */     //   #26	-> 382
/*    */     //   #27	-> 396
/*    */     //   #28	-> 399
/*    */     //   #29	-> 402
/*    */     //   #30	-> 406
/*    */     //   #31	-> 429
/*    */     //   #32	-> 438
/*    */     //   #33	-> 442
/*    */     //   #34	-> 445 } public final short Jx() { short s; if ((s = this.bh0) > 0) return s;  return this.K0.ta.Cw0; } public final jd0 k6() { return this.K0; } public final cOm4 x6() { return this.RN; } public final void k8(cOm4 paramcOm4) { this.RN = paramcOm4; paramcOm4.gc = this; paramcOm4.k60 = 1; jd0 jd01; (jd01 = this.K0).sm = paramcOm4; } public final byte FA() { return this.iJ; } public final short wf0() { short s = this.K0.ta.Cw0; return um0.HZ(this.K0.IH0, s); } public final boolean JF() { if (this.bh0 != 0) return this.S90;  return this.K0.ta.da(); } public final void t30() { hn0(Si(), true); } public final void hn0(boolean paramBoolean1, boolean paramBoolean2) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield KT : S
/*    */     //   4: dup
/*    */     //   5: istore_3
/*    */     //   6: iconst_m1
/*    */     //   7: if_icmpeq -> 14
/*    */     //   10: iconst_1
/*    */     //   11: goto -> 15
/*    */     //   14: iconst_0
/*    */     //   15: ifeq -> 21
/*    */     //   18: goto -> 26
/*    */     //   21: aload_0
/*    */     //   22: invokevirtual Jx : ()S
/*    */     //   25: istore_3
/*    */     //   26: iload_3
/*    */     //   27: iconst_1
/*    */     //   28: if_icmpge -> 36
/*    */     //   31: aconst_null
/*    */     //   32: astore_1
/*    */     //   33: goto -> 643
/*    */     //   36: aload_0
/*    */     //   37: invokevirtual iQ : ()B
/*    */     //   40: istore #4
/*    */     //   42: invokestatic v30 : ()Lf/On;
/*    */     //   45: iload_3
/*    */     //   46: invokevirtual lpT3 : (S)Lf/UD0;
/*    */     //   49: aload_0
/*    */     //   50: invokevirtual hE : ()B
/*    */     //   53: istore #5
/*    */     //   55: getfield FD : I
/*    */     //   58: dup
/*    */     //   59: istore #6
/*    */     //   61: ifeq -> 95
/*    */     //   64: iload #6
/*    */     //   66: sipush #254
/*    */     //   69: if_icmpeq -> 89
/*    */     //   72: iload #6
/*    */     //   74: sipush #255
/*    */     //   77: if_icmpeq -> 83
/*    */     //   80: goto -> 98
/*    */     //   83: iconst_m1
/*    */     //   84: istore #5
/*    */     //   86: goto -> 98
/*    */     //   89: iconst_1
/*    */     //   90: istore #5
/*    */     //   92: goto -> 98
/*    */     //   95: iconst_0
/*    */     //   96: istore #5
/*    */     //   98: aload_0
/*    */     //   99: iload #4
/*    */     //   101: iload_3
/*    */     //   102: invokestatic HZ : (BS)S
/*    */     //   105: istore_3
/*    */     //   106: getfield FJ : Lf/UA0;
/*    */     //   109: dup
/*    */     //   110: astore #4
/*    */     //   112: ifnull -> 125
/*    */     //   115: aload_0
/*    */     //   116: aload #4
/*    */     //   118: invokevirtual dispose : ()V
/*    */     //   121: aconst_null
/*    */     //   122: putfield FJ : Lf/UA0;
/*    */     //   125: aload_0
/*    */     //   126: getfield Sn0 : [Lf/Bw;
/*    */     //   129: dup
/*    */     //   130: astore #4
/*    */     //   132: ifnull -> 170
/*    */     //   135: aload #4
/*    */     //   137: arraylength
/*    */     //   138: istore #6
/*    */     //   140: iconst_0
/*    */     //   141: istore #7
/*    */     //   143: iload #7
/*    */     //   145: iload #6
/*    */     //   147: if_icmpge -> 165
/*    */     //   150: aload #4
/*    */     //   152: iload #7
/*    */     //   154: aaload
/*    */     //   155: aload_0
/*    */     //   156: invokevirtual gH0 : (Ljava/lang/Object;)V
/*    */     //   159: iinc #7, 1
/*    */     //   162: goto -> 143
/*    */     //   165: aload_0
/*    */     //   166: aconst_null
/*    */     //   167: putfield Sn0 : [Lf/Bw;
/*    */     //   170: aload_0
/*    */     //   171: getfield bh0 : S
/*    */     //   174: ifeq -> 186
/*    */     //   177: aload_0
/*    */     //   178: getfield Lh : Z
/*    */     //   181: istore #4
/*    */     //   183: goto -> 198
/*    */     //   186: aload_0
/*    */     //   187: getfield K0 : Lf/jd0;
/*    */     //   190: getfield ta : Lf/Q90;
/*    */     //   193: invokevirtual tm0 : ()Z
/*    */     //   196: istore #4
/*    */     //   198: getstatic f/um0.Kt0 : Lf/um0;
/*    */     //   201: iload #5
/*    */     //   203: iload_3
/*    */     //   204: iload_1
/*    */     //   205: iload #4
/*    */     //   207: invokevirtual rE0 : (BSZZ)Z
/*    */     //   210: ifeq -> 567
/*    */     //   213: getstatic f/um0.Kt0 : Lf/um0;
/*    */     //   216: iload #5
/*    */     //   218: iload_3
/*    */     //   219: iload_1
/*    */     //   220: iload #4
/*    */     //   222: invokevirtual H9 : (BSZZ)[Lf/zh0;
/*    */     //   225: dup
/*    */     //   226: astore #6
/*    */     //   228: aload_0
/*    */     //   229: aload #6
/*    */     //   231: putfield Sn0 : [Lf/Bw;
/*    */     //   234: arraylength
/*    */     //   235: dup
/*    */     //   236: istore #7
/*    */     //   238: anewarray f/pe0
/*    */     //   241: astore #8
/*    */     //   243: iconst_0
/*    */     //   244: istore #9
/*    */     //   246: iload #9
/*    */     //   248: iload #7
/*    */     //   250: if_icmpge -> 281
/*    */     //   253: aload #6
/*    */     //   255: iload #9
/*    */     //   257: aload #8
/*    */     //   259: iload #9
/*    */     //   261: aload #6
/*    */     //   263: iload #9
/*    */     //   265: aaload
/*    */     //   266: invokevirtual Uu0 : ()Lf/pe0;
/*    */     //   269: aastore
/*    */     //   270: aaload
/*    */     //   271: aload_0
/*    */     //   272: invokevirtual lu : (Ljava/lang/Object;)V
/*    */     //   275: iinc #9, 1
/*    */     //   278: goto -> 246
/*    */     //   281: getstatic f/um0.Kt0 : Lf/um0;
/*    */     //   284: getfield da : [Lf/Uf0;
/*    */     //   287: iload_1
/*    */     //   288: aaload
/*    */     //   289: dup
/*    */     //   290: astore #6
/*    */     //   292: ifnonnull -> 301
/*    */     //   295: fconst_0
/*    */     //   296: fstore #6
/*    */     //   298: goto -> 309
/*    */     //   301: aload #6
/*    */     //   303: iload_3
/*    */     //   304: invokevirtual Sp : (S)F
/*    */     //   307: fstore #6
/*    */     //   309: fload #6
/*    */     //   311: fconst_0
/*    */     //   312: fcmpl
/*    */     //   313: ifne -> 319
/*    */     //   316: fconst_1
/*    */     //   317: fstore #6
/*    */     //   319: new f/uT
/*    */     //   322: dup
/*    */     //   323: dup
/*    */     //   324: dup2
/*    */     //   325: astore #7
/*    */     //   327: aload #8
/*    */     //   329: aload #7
/*    */     //   331: aload #8
/*    */     //   333: iconst_0
/*    */     //   334: aaload
/*    */     //   335: dup
/*    */     //   336: astore #9
/*    */     //   338: getfield H0 : I
/*    */     //   341: i2f
/*    */     //   342: fload #6
/*    */     //   344: fmul
/*    */     //   345: f2i
/*    */     //   346: aload #9
/*    */     //   348: getfield Vn0 : I
/*    */     //   351: i2f
/*    */     //   352: fload #6
/*    */     //   354: fmul
/*    */     //   355: f2i
/*    */     //   356: aload #9
/*    */     //   358: iconst_1
/*    */     //   359: invokespecial <init> : (IILf/pe0;Z)V
/*    */     //   362: new f/R30
/*    */     //   365: dup
/*    */     //   366: aload #7
/*    */     //   368: swap
/*    */     //   369: dup
/*    */     //   370: ldc_w 0.1
/*    */     //   373: aload #8
/*    */     //   375: invokespecial <init> : (F[Ljava/lang/Object;)V
/*    */     //   378: putfield BA : Lf/R30;
/*    */     //   381: getstatic f/Qb.RW : Lf/Qb;
/*    */     //   384: putfield sI : Lf/Qb;
/*    */     //   387: iconst_0
/*    */     //   388: aaload
/*    */     //   389: astore #6
/*    */     //   391: getfield RC : Lf/O80;
/*    */     //   394: aload #6
/*    */     //   396: invokevirtual ID : (Lf/pe0;)V
/*    */     //   399: ldc_w 0.01
/*    */     //   402: invokevirtual zO : (F)V
/*    */     //   405: fconst_1
/*    */     //   406: fconst_1
/*    */     //   407: fconst_1
/*    */     //   408: fconst_1
/*    */     //   409: invokevirtual hA0 : (FFFF)V
/*    */     //   412: ldc_w 0.01
/*    */     //   415: invokevirtual zO : (F)V
/*    */     //   418: getstatic f/um0.Kt0 : Lf/um0;
/*    */     //   421: iload #5
/*    */     //   423: iload_3
/*    */     //   424: iload_1
/*    */     //   425: iload #4
/*    */     //   427: invokevirtual F7 : (BSZZ)Z
/*    */     //   430: ifeq -> 561
/*    */     //   433: getstatic f/um0.Kt0 : Lf/um0;
/*    */     //   436: iload #5
/*    */     //   438: iload_3
/*    */     //   439: iload_1
/*    */     //   440: iload #4
/*    */     //   442: invokevirtual Hr : (BSZZ)[I
/*    */     //   445: dup
/*    */     //   446: astore_1
/*    */     //   447: ifnull -> 519
/*    */     //   450: aload_1
/*    */     //   451: iconst_0
/*    */     //   452: iaload
/*    */     //   453: ifle -> 519
/*    */     //   456: aload_1
/*    */     //   457: iconst_0
/*    */     //   458: istore_3
/*    */     //   459: arraylength
/*    */     //   460: istore #4
/*    */     //   462: iconst_0
/*    */     //   463: istore #5
/*    */     //   465: iload #5
/*    */     //   467: iload #4
/*    */     //   469: if_icmpge -> 485
/*    */     //   472: iload_3
/*    */     //   473: aload_1
/*    */     //   474: iload #5
/*    */     //   476: iaload
/*    */     //   477: iadd
/*    */     //   478: istore_3
/*    */     //   479: iinc #5, 1
/*    */     //   482: goto -> 465
/*    */     //   485: aload #7
/*    */     //   487: iload_3
/*    */     //   488: aload_1
/*    */     //   489: arraylength
/*    */     //   490: idiv
/*    */     //   491: i2f
/*    */     //   492: ldc_w 1000.0
/*    */     //   495: fdiv
/*    */     //   496: fstore_1
/*    */     //   497: getfield BA : Lf/R30;
/*    */     //   500: dup
/*    */     //   501: astore_3
/*    */     //   502: ifnull -> 544
/*    */     //   505: aload_3
/*    */     //   506: dup
/*    */     //   507: fload_1
/*    */     //   508: putfield aB : F
/*    */     //   511: getfield Bs : [Ljava/lang/Object;
/*    */     //   514: arraylength
/*    */     //   515: pop
/*    */     //   516: goto -> 544
/*    */     //   519: aload #7
/*    */     //   521: ldc_w 0.05
/*    */     //   524: fstore_1
/*    */     //   525: getfield BA : Lf/R30;
/*    */     //   528: dup
/*    */     //   529: astore_3
/*    */     //   530: ifnull -> 544
/*    */     //   533: aload_3
/*    */     //   534: dup
/*    */     //   535: fload_1
/*    */     //   536: putfield aB : F
/*    */     //   539: getfield Bs : [Ljava/lang/Object;
/*    */     //   542: arraylength
/*    */     //   543: pop
/*    */     //   544: aload #7
/*    */     //   546: getfield BA : Lf/R30;
/*    */     //   549: dup
/*    */     //   550: astore_1
/*    */     //   551: ifnull -> 561
/*    */     //   554: aload_1
/*    */     //   555: getstatic f/Qb.RW : Lf/Qb;
/*    */     //   558: putfield sI : Lf/Qb;
/*    */     //   561: aload #7
/*    */     //   563: astore_1
/*    */     //   564: goto -> 643
/*    */     //   567: iload_1
/*    */     //   568: aload_0
/*    */     //   569: getstatic f/um0.Kt0 : Lf/um0;
/*    */     //   572: iload #5
/*    */     //   574: iload_3
/*    */     //   575: iload_1
/*    */     //   576: iload #4
/*    */     //   578: invokevirtual vt : (BSZZ)Lf/UA0;
/*    */     //   581: dup
/*    */     //   582: astore_1
/*    */     //   583: putfield FJ : Lf/UA0;
/*    */     //   586: ifeq -> 597
/*    */     //   589: getstatic f/h1.Wx0 : I
/*    */     //   592: i2f
/*    */     //   593: fstore_3
/*    */     //   594: goto -> 602
/*    */     //   597: getstatic f/h1.UD0 : I
/*    */     //   600: i2f
/*    */     //   601: fstore_3
/*    */     //   602: aload_0
/*    */     //   603: dup
/*    */     //   604: aload_1
/*    */     //   605: fload_3
/*    */     //   606: invokevirtual Zz : (F)V
/*    */     //   609: getfield FJ : Lf/UA0;
/*    */     //   612: invokestatic NI : (Lf/UA0;)Lf/uT;
/*    */     //   615: astore_1
/*    */     //   616: invokevirtual JF : ()Z
/*    */     //   619: ifeq -> 629
/*    */     //   622: ldc_w 0.0125
/*    */     //   625: fstore_3
/*    */     //   626: goto -> 633
/*    */     //   629: ldc_w 0.01
/*    */     //   632: fstore_3
/*    */     //   633: aload_1
/*    */     //   634: dup
/*    */     //   635: fload_3
/*    */     //   636: putfield ys : F
/*    */     //   639: fload_3
/*    */     //   640: invokevirtual zO : (F)V
/*    */     //   643: aload_1
/*    */     //   644: aload_0
/*    */     //   645: aload_1
/*    */     //   646: putfield rF0 : Lf/uT;
/*    */     //   649: ifnonnull -> 653
/*    */     //   652: return
/*    */     //   653: aload_0
/*    */     //   654: dup
/*    */     //   655: aload_1
/*    */     //   656: fconst_0
/*    */     //   657: fconst_0
/*    */     //   658: fconst_0
/*    */     //   659: fconst_0
/*    */     //   660: invokevirtual hA0 : (FFFF)V
/*    */     //   663: iconst_1
/*    */     //   664: anewarray f/uT
/*    */     //   667: dup
/*    */     //   668: aload_0
/*    */     //   669: getfield rF0 : Lf/uT;
/*    */     //   672: iconst_0
/*    */     //   673: swap
/*    */     //   674: aastore
/*    */     //   675: putfield qf : [Lf/uT;
/*    */     //   678: invokevirtual JF : ()Z
/*    */     //   681: ifeq -> 793
/*    */     //   684: aload_0
/*    */     //   685: getfield bh0 : S
/*    */     //   688: ifeq -> 699
/*    */     //   691: aload_0
/*    */     //   692: getfield Lh : Z
/*    */     //   695: istore_1
/*    */     //   696: goto -> 710
/*    */     //   699: aload_0
/*    */     //   700: getfield K0 : Lf/jd0;
/*    */     //   703: getfield ta : Lf/Q90;
/*    */     //   706: invokevirtual tm0 : ()Z
/*    */     //   709: istore_1
/*    */     //   710: iload_1
/*    */     //   711: ifeq -> 754
/*    */     //   714: aload_0
/*    */     //   715: getfield rF0 : Lf/uT;
/*    */     //   718: dup
/*    */     //   719: astore_1
/*    */     //   720: getstatic f/dM.d10 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   723: astore_3
/*    */     //   724: fconst_1
/*    */     //   725: dup
/*    */     //   726: fstore #4
/*    */     //   728: aload_1
/*    */     //   729: getfield Os0 : Lf/T0;
/*    */     //   732: new f/F4
/*    */     //   735: dup
/*    */     //   736: getstatic f/F4.Qr0 : J
/*    */     //   739: aload_3
/*    */     //   740: fload #4
/*    */     //   742: invokespecial <init> : (JLcom/badlogic/gdx/graphics/Color;F)V
/*    */     //   745: invokevirtual Tz0 : (Lf/dj;)V
/*    */     //   748: putfield IC : F
/*    */     //   751: goto -> 793
/*    */     //   754: aload_0
/*    */     //   755: getfield rF0 : Lf/uT;
/*    */     //   758: dup
/*    */     //   759: astore_1
/*    */     //   760: getstatic f/dM.N1 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   763: astore_3
/*    */     //   764: ldc_w 0.8
/*    */     //   767: dup
/*    */     //   768: fstore #4
/*    */     //   770: aload_1
/*    */     //   771: getfield Os0 : Lf/T0;
/*    */     //   774: new f/F4
/*    */     //   777: dup
/*    */     //   778: getstatic f/F4.Qr0 : J
/*    */     //   781: aload_3
/*    */     //   782: fload #4
/*    */     //   784: invokespecial <init> : (JLcom/badlogic/gdx/graphics/Color;F)V
/*    */     //   787: invokevirtual Tz0 : (Lf/dj;)V
/*    */     //   790: putfield IC : F
/*    */     //   793: aload_0
/*    */     //   794: getfield A0 : Z
/*    */     //   797: ifeq -> 805
/*    */     //   800: aload_0
/*    */     //   801: invokevirtual Af : ()Lf/uT;
/*    */     //   804: pop
/*    */     //   805: iload_2
/*    */     //   806: aload_0
/*    */     //   807: invokevirtual yL0 : ()V
/*    */     //   810: ifeq -> 821
/*    */     //   813: aload_0
/*    */     //   814: dup
/*    */     //   815: invokevirtual Vb : ()V
/*    */     //   818: invokevirtual JB0 : ()V
/*    */     //   821: aload_0
/*    */     //   822: getfield zd : Z
/*    */     //   825: ifne -> 838
/*    */     //   828: aload_0
/*    */     //   829: dup
/*    */     //   830: iconst_0
/*    */     //   831: invokevirtual qt0 : (Z)V
/*    */     //   834: iconst_1
/*    */     //   835: putfield zd : Z
/*    */     //   838: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 1
/*    */     //   #2	-> 22
/*    */     //   #3	-> 55
/*    */     //   #4	-> 102
/*    */     //   #5	-> 171
/*    */     //   #6	-> 190
/*    */     //   #7	-> 193
/*    */     //   #8	-> 198
/*    */     //   #9	-> 207
/*    */     //   #10	-> 213
/*    */     //   #11	-> 222
/*    */     //   #12	-> 281
/*    */     //   #13	-> 284
/*    */     //   #14	-> 288
/*    */     //   #15	-> 319
/*    */     //   #16	-> 338
/*    */     //   #17	-> 348
/*    */     //   #18	-> 359
/*    */     //   #19	-> 384
/*    */     //   #20	-> 388
/*    */     //   #21	-> 391
/*    */     //   #22	-> 402
/*    */     //   #23	-> 415
/*    */     //   #24	-> 418
/*    */     //   #25	-> 427
/*    */     //   #26	-> 433
/*    */     //   #27	-> 442
/*    */     //   #28	-> 497
/*    */     //   #29	-> 508
/*    */     //   #30	-> 525
/*    */     //   #31	-> 536
/*    */     //   #32	-> 546
/*    */     //   #33	-> 558
/*    */     //   #34	-> 569
/*    */     //   #35	-> 578
/*    */     //   #36	-> 636
/*    */     //   #37	-> 640
/*    */     //   #38	-> 646
/*    */     //   #39	-> 685
/*    */     //   #40	-> 703
/*    */     //   #41	-> 706
/*    */     //   #42	-> 715
/*    */     //   #43	-> 729
/*    */     //   #44	-> 732
/*    */     //   #45	-> 745
/*    */     //   #46	-> 755
/*    */     //   #47	-> 771
/*    */     //   #48	-> 774
/*    */     //   #49	-> 787
/*  4 */     //   #50	-> 794 } public final synchronized void yL0() { this(); ArrayList<uT> arrayList; uT uT1; if ((uT1 = this.rF0) != null) arrayList.add(uT1);  if (this.A0) arrayList.add(this.eq0);  if (arrayList.size() > 0) { this.Xn = arrayList.<uT>toArray(new uT[0]); } else { this.Xn = m10; }  kn0(); } public final void Vb() { if (this.rF0 == null || km.MR == null) return;  uT[] arrayOfUT; int i; byte b; for (i = (arrayOfUT = this.Xn).length, b = 0; b < i; ) { uT uT1; (uT1 = arrayOfUT[b]).He0.JL(sf(uT1, true)); b++; }  if (this.zd) kn0();  } public final void jI() { if (this.rF0 == null || km.MR == null) return;  So so; uT[] arrayOfUT; int i; byte b; for (so = So.fD(), i = (arrayOfUT = this.Xn).length, b = 0; b < i; ) { eo eo1 = sf(arrayOfUT[b], true); float f1 = eo1.x, f2 = eo1.y, f3 = eo1.z; so.PL(Wz0.gq(arrayOfUT[b], 4, 0.5F).qw0(f1, f2, f3)); b++; }  so.mg(km.wI0.pB0); if (this.zd) kn0();  } public final eo sf(uT paramuT, boolean paramBoolean) { // Byte code:
/*    */     //   0: getstatic f/um0.Kt0 : Lf/um0;
/*    */     //   3: dup
/*    */     //   4: astore_3
/*    */     //   5: aload_0
/*    */     //   6: invokevirtual Jx : ()S
/*    */     //   9: aload_0
/*    */     //   10: invokevirtual Si : ()Z
/*    */     //   13: iconst_0
/*    */     //   14: iconst_0
/*    */     //   15: iconst_0
/*    */     //   16: iconst_0
/*    */     //   17: invokestatic EY : (SZZBZZ)I
/*    */     //   20: istore #4
/*    */     //   22: getfield MI : Lf/Ut0;
/*    */     //   25: dup
/*    */     //   26: astore #5
/*    */     //   28: ifnull -> 60
/*    */     //   31: aload #5
/*    */     //   33: iload #4
/*    */     //   35: invokevirtual return : (I)Z
/*    */     //   38: ifne -> 44
/*    */     //   41: goto -> 60
/*    */     //   44: aload_3
/*    */     //   45: getfield MI : Lf/Ut0;
/*    */     //   48: iload #4
/*    */     //   50: invokevirtual Z6 : (I)Ljava/lang/Object;
/*    */     //   53: checkcast f/eo
/*    */     //   56: astore_3
/*    */     //   57: goto -> 64
/*    */     //   60: getstatic f/um0.YA : Lf/eo;
/*    */     //   63: astore_3
/*    */     //   64: aload_0
/*    */     //   65: invokevirtual JF : ()Z
/*    */     //   68: ifeq -> 80
/*    */     //   71: iload_2
/*    */     //   72: ifeq -> 80
/*    */     //   75: iconst_1
/*    */     //   76: istore_2
/*    */     //   77: goto -> 82
/*    */     //   80: iconst_0
/*    */     //   81: istore_2
/*    */     //   82: aload_0
/*    */     //   83: invokevirtual Si : ()Z
/*    */     //   86: ifeq -> 233
/*    */     //   89: aload_1
/*    */     //   90: aload_0
/*    */     //   91: getfield rF0 : Lf/uT;
/*    */     //   94: if_acmpne -> 176
/*    */     //   97: iload_2
/*    */     //   98: aload_3
/*    */     //   99: aload_0
/*    */     //   100: getstatic f/hm0.g4 : Lf/eo;
/*    */     //   103: dup
/*    */     //   104: astore_1
/*    */     //   105: getstatic f/vH.Zu : Lf/eo;
/*    */     //   108: invokevirtual JL : (Lf/eo;)Lf/eo;
/*    */     //   111: pop
/*    */     //   112: getstatic f/km.MR : Lf/Gp0;
/*    */     //   115: invokevirtual zJ0 : (Lf/Gp0;)F
/*    */     //   118: aload_3
/*    */     //   119: getfield x : F
/*    */     //   122: fadd
/*    */     //   123: fstore_2
/*    */     //   124: getfield y : F
/*    */     //   127: ldc_w 0.08
/*    */     //   130: fadd
/*    */     //   131: fstore #4
/*    */     //   133: ifeq -> 144
/*    */     //   136: ldc_w 0.09
/*    */     //   139: fstore #5
/*    */     //   141: goto -> 147
/*    */     //   144: fconst_0
/*    */     //   145: fstore #5
/*    */     //   147: aload_1
/*    */     //   148: fload_2
/*    */     //   149: aload_0
/*    */     //   150: fload #4
/*    */     //   152: fload #5
/*    */     //   154: fadd
/*    */     //   155: fstore_0
/*    */     //   156: getstatic f/km.MR : Lf/Gp0;
/*    */     //   159: invokevirtual dk : (Lf/Gp0;)F
/*    */     //   162: aload_3
/*    */     //   163: getfield z : F
/*    */     //   166: fadd
/*    */     //   167: fload_0
/*    */     //   168: swap
/*    */     //   169: invokevirtual Tz : (FFF)Lf/eo;
/*    */     //   172: pop
/*    */     //   173: goto -> 378
/*    */     //   176: aload_1
/*    */     //   177: aload_0
/*    */     //   178: getfield eq0 : Lf/uT;
/*    */     //   181: if_acmpne -> 378
/*    */     //   184: getstatic f/hm0.g4 : Lf/eo;
/*    */     //   187: dup
/*    */     //   188: astore_1
/*    */     //   189: aload_0
/*    */     //   190: dup
/*    */     //   191: aload_1
/*    */     //   192: getstatic f/vH.Zu : Lf/eo;
/*    */     //   195: invokevirtual JL : (Lf/eo;)Lf/eo;
/*    */     //   198: pop
/*    */     //   199: getstatic f/km.MR : Lf/Gp0;
/*    */     //   202: invokevirtual zJ0 : (Lf/Gp0;)F
/*    */     //   205: ldc_w 0.15
/*    */     //   208: fadd
/*    */     //   209: fstore_0
/*    */     //   210: getstatic f/km.MR : Lf/Gp0;
/*    */     //   213: invokevirtual dk : (Lf/Gp0;)F
/*    */     //   216: ldc_w 0.3
/*    */     //   219: fsub
/*    */     //   220: fstore_1
/*    */     //   221: fload_0
/*    */     //   222: ldc_w -0.3
/*    */     //   225: fload_1
/*    */     //   226: invokevirtual Tz : (FFF)Lf/eo;
/*    */     //   229: pop
/*    */     //   230: goto -> 378
/*    */     //   233: aload_1
/*    */     //   234: aload_0
/*    */     //   235: getfield rF0 : Lf/uT;
/*    */     //   238: if_acmpne -> 324
/*    */     //   241: iload_2
/*    */     //   242: aload_3
/*    */     //   243: aload_0
/*    */     //   244: getstatic f/hm0.g4 : Lf/eo;
/*    */     //   247: dup
/*    */     //   248: astore_1
/*    */     //   249: getstatic f/vH.xC : Lf/eo;
/*    */     //   252: invokevirtual JL : (Lf/eo;)Lf/eo;
/*    */     //   255: pop
/*    */     //   256: getstatic f/km.MR : Lf/Gp0;
/*    */     //   259: invokevirtual zJ0 : (Lf/Gp0;)F
/*    */     //   262: aload_3
/*    */     //   263: getfield x : F
/*    */     //   266: fadd
/*    */     //   267: fstore_2
/*    */     //   268: getfield y : F
/*    */     //   271: ldc_w 0.06
/*    */     //   274: fadd
/*    */     //   275: fstore #4
/*    */     //   277: ifeq -> 288
/*    */     //   280: ldc_w 0.09
/*    */     //   283: fstore #5
/*    */     //   285: goto -> 291
/*    */     //   288: fconst_0
/*    */     //   289: fstore #5
/*    */     //   291: aload_1
/*    */     //   292: fload_2
/*    */     //   293: aload_0
/*    */     //   294: fload #4
/*    */     //   296: fload #5
/*    */     //   298: fadd
/*    */     //   299: fstore_0
/*    */     //   300: getstatic f/km.MR : Lf/Gp0;
/*    */     //   303: invokevirtual dk : (Lf/Gp0;)F
/*    */     //   306: ldc_w 0.5
/*    */     //   309: fadd
/*    */     //   310: aload_3
/*    */     //   311: getfield z : F
/*    */     //   314: fadd
/*    */     //   315: fload_0
/*    */     //   316: swap
/*    */     //   317: invokevirtual Tz : (FFF)Lf/eo;
/*    */     //   320: pop
/*    */     //   321: goto -> 378
/*    */     //   324: aload_1
/*    */     //   325: aload_0
/*    */     //   326: getfield eq0 : Lf/uT;
/*    */     //   329: if_acmpne -> 378
/*    */     //   332: getstatic f/hm0.g4 : Lf/eo;
/*    */     //   335: dup
/*    */     //   336: astore_1
/*    */     //   337: aload_0
/*    */     //   338: dup
/*    */     //   339: aload_1
/*    */     //   340: getstatic f/vH.xC : Lf/eo;
/*    */     //   343: invokevirtual JL : (Lf/eo;)Lf/eo;
/*    */     //   346: pop
/*    */     //   347: getstatic f/km.MR : Lf/Gp0;
/*    */     //   350: invokevirtual zJ0 : (Lf/Gp0;)F
/*    */     //   353: ldc_w 0.2
/*    */     //   356: fsub
/*    */     //   357: fstore_0
/*    */     //   358: getstatic f/km.MR : Lf/Gp0;
/*    */     //   361: invokevirtual dk : (Lf/Gp0;)F
/*    */     //   364: ldc_w 0.6
/*    */     //   367: fadd
/*    */     //   368: fstore_1
/*    */     //   369: fload_0
/*    */     //   370: ldc_w -0.28
/*    */     //   373: fload_1
/*    */     //   374: invokevirtual Tz : (FFF)Lf/eo;
/*    */     //   377: pop
/*    */     //   378: getstatic f/hm0.g4 : Lf/eo;
/*    */     //   381: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 0
/*    */     //   #2	-> 6
/*    */     //   #3	-> 17
/*    */     //   #4	-> 22
/*    */     //   #5	-> 35
/*  4 */     //   #6	-> 65 } public final uT Af() { if (this.eq0 == null) { pe0 pe0 = new pe0(); um0 um01; U70 u701; if ((u701 = (um01 = um0.Kt0).Z2) == null) { iI iI; this(um01); this(iI); um01.Z2 = u701; }  this(u701.HA0()); if (Si()) { pe0.Y9(96, 0, 96, 96); pe0.zt0(true, false); } else { pe0.Y9(0, 0, 96, 96); }
/*    */       
/*  6 */       int i = pe0.H0;
/*    */ 
/*    */       
/*  9 */       (this.eq0 = new uT(i, pe0.Vn0, pe0, true)).zO(0.01F); this.eq0
/*    */         
/* 11 */         .WI0(sf(this.eq0, true)); yL0(); }
/*    */      um0 um0; U70 u70;
/* 13 */     if ((u70 = (um0 = um0.Kt0).Z2) == null)
/* 14 */     { iI iI; this(um0); this(iI); um0.Z2 = u70; }  u70
/*    */       
/* 16 */       .mk = zm0.u20;
/* 17 */     return this.eq0; }
/*    */ 
/*    */   
/*    */   public final void qt0(boolean paramBoolean) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield qf : [Lf/uT;
/*    */     //   4: dup
/*    */     //   5: astore_0
/*    */     //   6: arraylength
/*    */     //   7: istore_2
/*    */     //   8: iconst_0
/*    */     //   9: istore_3
/*    */     //   10: iload_3
/*    */     //   11: iload_2
/*    */     //   12: if_icmpge -> 101
/*    */     //   15: iload_1
/*    */     //   16: aload_0
/*    */     //   17: iload_3
/*    */     //   18: aaload
/*    */     //   19: dup
/*    */     //   20: astore #4
/*    */     //   22: invokevirtual G10 : ()Lcom/badlogic/gdx/graphics/Color;
/*    */     //   25: astore #5
/*    */     //   27: ifeq -> 64
/*    */     //   30: aload #4
/*    */     //   32: aload #5
/*    */     //   34: dup
/*    */     //   35: dup
/*    */     //   36: getfield r : F
/*    */     //   39: fstore #4
/*    */     //   41: getfield g : F
/*    */     //   44: fstore #5
/*    */     //   46: getfield b : F
/*    */     //   49: fstore #6
/*    */     //   51: fload #4
/*    */     //   53: fload #5
/*    */     //   55: fload #6
/*    */     //   57: fconst_1
/*    */     //   58: invokevirtual Bp : (FFFF)V
/*    */     //   61: goto -> 95
/*    */     //   64: aload #4
/*    */     //   66: aload #5
/*    */     //   68: dup
/*    */     //   69: dup
/*    */     //   70: getfield r : F
/*    */     //   73: fstore #4
/*    */     //   75: getfield g : F
/*    */     //   78: fstore #5
/*    */     //   80: getfield b : F
/*    */     //   83: fstore #6
/*    */     //   85: fload #4
/*    */     //   87: fload #5
/*    */     //   89: fload #6
/*    */     //   91: fconst_0
/*    */     //   92: invokevirtual Bp : (FFFF)V
/*    */     //   95: iinc #3, 1
/*    */     //   98: goto -> 10
/*    */     //   101: return
/*    */   }
/*    */   
/*    */   public final void DS(boolean paramBoolean) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: invokevirtual Jx : ()S
/*    */     //   4: dup
/*    */     //   5: istore_2
/*    */     //   6: iconst_1
/*    */     //   7: if_icmpge -> 17
/*    */     //   10: getstatic f/C30.wm : Lf/N4;
/*    */     //   13: astore_2
/*    */     //   14: goto -> 552
/*    */     //   17: aload_0
/*    */     //   18: getstatic f/um0.Kt0 : Lf/um0;
/*    */     //   21: astore_3
/*    */     //   22: invokevirtual iQ : ()B
/*    */     //   25: istore #4
/*    */     //   27: invokestatic v30 : ()Lf/On;
/*    */     //   30: iload_2
/*    */     //   31: invokevirtual lpT3 : (S)Lf/UD0;
/*    */     //   34: aload_0
/*    */     //   35: invokevirtual hE : ()B
/*    */     //   38: istore #5
/*    */     //   40: getfield FD : I
/*    */     //   43: dup
/*    */     //   44: istore #6
/*    */     //   46: ifeq -> 80
/*    */     //   49: iload #6
/*    */     //   51: sipush #254
/*    */     //   54: if_icmpeq -> 74
/*    */     //   57: iload #6
/*    */     //   59: sipush #255
/*    */     //   62: if_icmpeq -> 68
/*    */     //   65: goto -> 83
/*    */     //   68: iconst_m1
/*    */     //   69: istore #5
/*    */     //   71: goto -> 83
/*    */     //   74: iconst_1
/*    */     //   75: istore #5
/*    */     //   77: goto -> 83
/*    */     //   80: iconst_0
/*    */     //   81: istore #5
/*    */     //   83: aload_0
/*    */     //   84: iload #4
/*    */     //   86: iload_2
/*    */     //   87: aload_0
/*    */     //   88: dup
/*    */     //   89: iconst_0
/*    */     //   90: putfield G8 : B
/*    */     //   93: iconst_0
/*    */     //   94: putfield LC0 : B
/*    */     //   97: invokestatic HZ : (BS)S
/*    */     //   100: istore_2
/*    */     //   101: getfield bh0 : S
/*    */     //   104: ifeq -> 116
/*    */     //   107: aload_0
/*    */     //   108: getfield Lh : Z
/*    */     //   111: istore #4
/*    */     //   113: goto -> 128
/*    */     //   116: aload_0
/*    */     //   117: getfield K0 : Lf/jd0;
/*    */     //   120: getfield ta : Lf/Q90;
/*    */     //   123: invokevirtual tm0 : ()Z
/*    */     //   126: istore #4
/*    */     //   128: aload_3
/*    */     //   129: iload #5
/*    */     //   131: iload_2
/*    */     //   132: iload_1
/*    */     //   133: iload #4
/*    */     //   135: invokevirtual H9 : (BSZZ)[Lf/zh0;
/*    */     //   138: dup
/*    */     //   139: dup
/*    */     //   140: astore_3
/*    */     //   141: iconst_0
/*    */     //   142: aaload
/*    */     //   143: astore #6
/*    */     //   145: arraylength
/*    */     //   146: iconst_2
/*    */     //   147: if_icmple -> 260
/*    */     //   150: getstatic f/um0.Kt0 : Lf/um0;
/*    */     //   153: iload #5
/*    */     //   155: iload_2
/*    */     //   156: iload_1
/*    */     //   157: iload #4
/*    */     //   159: invokevirtual F7 : (BSZZ)Z
/*    */     //   162: ifeq -> 260
/*    */     //   165: aload_0
/*    */     //   166: dup
/*    */     //   167: iconst_0
/*    */     //   168: putfield LC0 : B
/*    */     //   171: iconst_2
/*    */     //   172: putfield G8 : B
/*    */     //   175: getstatic f/um0.Kt0 : Lf/um0;
/*    */     //   178: getfield da : [Lf/Uf0;
/*    */     //   181: iload_1
/*    */     //   182: aaload
/*    */     //   183: dup
/*    */     //   184: astore #6
/*    */     //   186: ifnonnull -> 195
/*    */     //   189: fconst_0
/*    */     //   190: fstore #6
/*    */     //   192: goto -> 203
/*    */     //   195: aload #6
/*    */     //   197: iload_2
/*    */     //   198: invokevirtual Sp : (S)F
/*    */     //   201: fstore #6
/*    */     //   203: fload #6
/*    */     //   205: fconst_0
/*    */     //   206: fcmpg
/*    */     //   207: ifle -> 219
/*    */     //   210: fload #6
/*    */     //   212: ldc_w 10.0
/*    */     //   215: fcmpl
/*    */     //   216: ifle -> 224
/*    */     //   219: ldc_w 3.0
/*    */     //   222: fstore #6
/*    */     //   224: getstatic f/um0.Kt0 : Lf/um0;
/*    */     //   227: iload #5
/*    */     //   229: iload_2
/*    */     //   230: iload_1
/*    */     //   231: iload #4
/*    */     //   233: invokevirtual Hr : (BSZZ)[I
/*    */     //   236: astore_2
/*    */     //   237: new f/C30
/*    */     //   240: dup
/*    */     //   241: astore #4
/*    */     //   243: aload_3
/*    */     //   244: fload #6
/*    */     //   246: ldc_w 3.0
/*    */     //   249: fdiv
/*    */     //   250: aload_2
/*    */     //   251: invokespecial <init> : ([Lf/zh0;F[I)V
/*    */     //   254: aload #4
/*    */     //   256: astore_2
/*    */     //   257: goto -> 552
/*    */     //   260: iload_1
/*    */     //   261: ifeq -> 409
/*    */     //   264: aload #6
/*    */     //   266: dup
/*    */     //   267: dup
/*    */     //   268: aload_0
/*    */     //   269: iconst_2
/*    */     //   270: putfield G8 : B
/*    */     //   273: getfield Fj : I
/*    */     //   276: istore_2
/*    */     //   277: getfield jh0 : Lf/U70;
/*    */     //   280: astore_3
/*    */     //   281: getfield vC0 : I
/*    */     //   284: istore #4
/*    */     //   286: aload_3
/*    */     //   287: iload #4
/*    */     //   289: iload_2
/*    */     //   290: iadd
/*    */     //   291: iconst_1
/*    */     //   292: isub
/*    */     //   293: istore #5
/*    */     //   295: getfield Gd0 : Z
/*    */     //   298: ifeq -> 398
/*    */     //   301: aload_3
/*    */     //   302: getfield WG : Ljava/util/BitSet;
/*    */     //   305: ifnonnull -> 313
/*    */     //   308: aload_3
/*    */     //   309: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   312: pop
/*    */     //   313: iload #4
/*    */     //   315: ifge -> 321
/*    */     //   318: iconst_0
/*    */     //   319: istore #4
/*    */     //   321: iload #5
/*    */     //   323: aload_3
/*    */     //   324: getfield s7 : I
/*    */     //   327: dup
/*    */     //   328: istore #7
/*    */     //   330: if_icmplt -> 339
/*    */     //   333: iload #7
/*    */     //   335: iconst_1
/*    */     //   336: isub
/*    */     //   337: istore #5
/*    */     //   339: iload #5
/*    */     //   341: iload #4
/*    */     //   343: if_icmplt -> 371
/*    */     //   346: aload_3
/*    */     //   347: getfield WG : Ljava/util/BitSet;
/*    */     //   350: iload #5
/*    */     //   352: invokevirtual get : (I)Z
/*    */     //   355: ifeq -> 365
/*    */     //   358: iload #5
/*    */     //   360: istore #4
/*    */     //   362: goto -> 371
/*    */     //   365: iinc #5, -1
/*    */     //   368: goto -> 339
/*    */     //   371: aload_0
/*    */     //   372: iload_2
/*    */     //   373: iload #4
/*    */     //   375: aload #6
/*    */     //   377: getfield vC0 : I
/*    */     //   380: isub
/*    */     //   381: isub
/*    */     //   382: i2d
/*    */     //   383: ldc2_w 1.5
/*    */     //   386: ddiv
/*    */     //   387: invokestatic ceil : (D)D
/*    */     //   390: d2i
/*    */     //   391: i2b
/*    */     //   392: putfield G8 : B
/*    */     //   395: goto -> 520
/*    */     //   398: new java/lang/RuntimeException
/*    */     //   401: dup
/*    */     //   402: ldc_w 'Calculation not requested'
/*    */     //   405: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   408: athrow
/*    */     //   409: aload #6
/*    */     //   411: dup
/*    */     //   412: getfield jh0 : Lf/U70;
/*    */     //   415: astore_2
/*    */     //   416: getfield vC0 : I
/*    */     //   419: istore_3
/*    */     //   420: aload_2
/*    */     //   421: iload_3
/*    */     //   422: aload #6
/*    */     //   424: getfield Fj : I
/*    */     //   427: iadd
/*    */     //   428: iconst_1
/*    */     //   429: isub
/*    */     //   430: istore #4
/*    */     //   432: getfield Gd0 : Z
/*    */     //   435: ifeq -> 654
/*    */     //   438: aload_2
/*    */     //   439: getfield WG : Ljava/util/BitSet;
/*    */     //   442: ifnonnull -> 450
/*    */     //   445: aload_2
/*    */     //   446: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   449: pop
/*    */     //   450: iload_3
/*    */     //   451: ifge -> 456
/*    */     //   454: iconst_0
/*    */     //   455: istore_3
/*    */     //   456: iload #4
/*    */     //   458: aload_2
/*    */     //   459: getfield s7 : I
/*    */     //   462: dup
/*    */     //   463: istore #5
/*    */     //   465: if_icmplt -> 474
/*    */     //   468: iload #5
/*    */     //   470: iconst_1
/*    */     //   471: isub
/*    */     //   472: istore #4
/*    */     //   474: iload_3
/*    */     //   475: iload #4
/*    */     //   477: if_icmpgt -> 500
/*    */     //   480: aload_2
/*    */     //   481: getfield WG : Ljava/util/BitSet;
/*    */     //   484: iload_3
/*    */     //   485: invokevirtual get : (I)Z
/*    */     //   488: ifeq -> 494
/*    */     //   491: goto -> 503
/*    */     //   494: iinc #3, 1
/*    */     //   497: goto -> 474
/*    */     //   500: iload #4
/*    */     //   502: istore_3
/*    */     //   503: aload_0
/*    */     //   504: iload_3
/*    */     //   505: aload #6
/*    */     //   507: getfield vC0 : I
/*    */     //   510: isub
/*    */     //   511: iconst_2
/*    */     //   512: idiv
/*    */     //   513: i2b
/*    */     //   514: iconst_2
/*    */     //   515: iadd
/*    */     //   516: i2b
/*    */     //   517: putfield LC0 : B
/*    */     //   520: new f/C30
/*    */     //   523: dup
/*    */     //   524: dup2
/*    */     //   525: dup2
/*    */     //   526: astore_2
/*    */     //   527: aload #6
/*    */     //   529: invokespecial <init> : (Lf/zh0;)V
/*    */     //   532: bipush #64
/*    */     //   534: putfield yg : I
/*    */     //   537: bipush #64
/*    */     //   539: putfield aQ : I
/*    */     //   542: bipush #64
/*    */     //   544: putfield ot0 : I
/*    */     //   547: bipush #64
/*    */     //   549: putfield pK : I
/*    */     //   552: aload_0
/*    */     //   553: aload_2
/*    */     //   554: putfield if : Lf/C30;
/*    */     //   557: getstatic f/km.MR : Lf/Gp0;
/*    */     //   560: dup
/*    */     //   561: astore_3
/*    */     //   562: ifnull -> 589
/*    */     //   565: aload_3
/*    */     //   566: getfield dd : Lf/rK;
/*    */     //   569: getstatic f/rK.Az : Lf/rK;
/*    */     //   572: if_acmpne -> 589
/*    */     //   575: aload_0
/*    */     //   576: bipush #-80
/*    */     //   578: istore_1
/*    */     //   579: getstatic f/km.MR : Lf/Gp0;
/*    */     //   582: invokevirtual ya : (Lf/Gp0;)I
/*    */     //   585: istore_3
/*    */     //   586: goto -> 628
/*    */     //   589: iload_1
/*    */     //   590: ifeq -> 608
/*    */     //   593: aload_0
/*    */     //   594: sipush #296
/*    */     //   597: istore_1
/*    */     //   598: getstatic f/km.MR : Lf/Gp0;
/*    */     //   601: invokevirtual ya : (Lf/Gp0;)I
/*    */     //   604: istore_3
/*    */     //   605: goto -> 628
/*    */     //   608: aload_0
/*    */     //   609: dup
/*    */     //   610: getstatic f/km.MR : Lf/Gp0;
/*    */     //   613: invokevirtual YI : (Lf/Gp0;)I
/*    */     //   616: sipush #260
/*    */     //   619: isub
/*    */     //   620: istore_1
/*    */     //   621: getstatic f/km.MR : Lf/Gp0;
/*    */     //   624: invokevirtual ya : (Lf/Gp0;)I
/*    */     //   627: istore_3
/*    */     //   628: aload_0
/*    */     //   629: aload_2
/*    */     //   630: iload_3
/*    */     //   631: aload_2
/*    */     //   632: iload_1
/*    */     //   633: putfield ec : I
/*    */     //   636: putfield hv : I
/*    */     //   639: new f/mi
/*    */     //   642: dup
/*    */     //   643: aload_0
/*    */     //   644: getfield if : Lf/C30;
/*    */     //   647: invokespecial <init> : (Lf/C30;)V
/*    */     //   650: putfield Ob0 : Lf/mi;
/*    */     //   653: return
/*    */     //   654: new java/lang/RuntimeException
/*    */     //   657: dup
/*    */     //   658: ldc_w 'Calculation not requested'
/*    */     //   661: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   664: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 1
/*    */     //   #2	-> 18
/*    */     //   #3	-> 22
/*    */     //   #4	-> 40
/*    */     //   #5	-> 90
/*    */     //   #6	-> 101
/*    */     //   #7	-> 120
/*    */     //   #8	-> 123
/*    */     //   #9	-> 135
/*    */     //   #10	-> 150
/*    */     //   #11	-> 159
/*    */     //   #12	-> 175
/*    */     //   #13	-> 178
/*    */     //   #14	-> 182
/*    */     //   #15	-> 224
/*    */     //   #16	-> 233
/*    */     //   #17	-> 273
/*    */     //   #18	-> 277
/*    */     //   #19	-> 295
/*    */     //   #20	-> 302
/*    */     //   #21	-> 377
/*    */     //   #22	-> 387
/*    */     //   #23	-> 398
/*    */     //   #24	-> 412
/*    */     //   #25	-> 416
/*    */     //   #26	-> 432
/*    */     //   #27	-> 439
/*    */     //   #28	-> 507
/*    */     //   #29	-> 512
/*    */     //   #30	-> 534
/*    */     //   #31	-> 544
/*    */     //   #32	-> 554
/*    */     //   #33	-> 566
/*    */     //   #34	-> 569
/*    */     //   #35	-> 633
/*    */     //   #36	-> 636
/*    */     //   #37	-> 639
/*    */     //   #38	-> 654
/*    */   }
/*    */   
/*    */   public final int ih() {
/*    */     return this.K0.ta.q10;
/*    */   }
/*    */   
/*    */   public final short XW() {
/*    */     return this.K0.ta.Hq0;
/*    */   }
/*    */   
/*    */   public final void tx(short paramShort) {
/*    */     this.K0.ta.ok(paramShort);
/*    */   }
/*    */   
/*    */   public final byte hE() {
/*    */     byte b;
/*    */     return ((b = this.vt0) != -1) ? b : this.K0.Ih0;
/*    */   }
/*    */   
/*    */   public final byte oi() {
/*    */     byte b;
/*    */     if ((b = this.zm) > 0)
/*    */       return b; 
/*    */     return this.K0.ta.qz;
/*    */   }
/*    */   
/*    */   public final byte Hk() {
/*    */     byte b;
/*    */     if ((b = this.fh) > 0)
/*    */       return b; 
/*    */     return this.K0.ta.od;
/*    */   }
/*    */   
/*    */   public final String fA() {
/*    */     if (this.VK.length() > 0)
/*    */       return this.VK; 
/*    */     String str;
/*    */     return ((str = this.K0.ta.nr).length() > 0) ? str : I9();
/*    */   }
/*    */   
/*    */   public final String coM1() {
/*    */     return B40.df("[#ff8a00]").append(fA().replaceAll("\\{[^\\}]+\\}", "")).append("[#]").toString();
/*    */   }
/*    */   
/*    */   public final String Ek() {
/*    */     QZ qZ = km.MR.wB(this.FT);
/*    */     String str = "";
/*    */     if (km.MR != null)
/*    */       str = qZ.s7(this.ws).trim(); 
/*    */     if (!str.isEmpty()) {
/*    */       if (qZ.jj(this.ws)) {
/*    */         arrayOfString1[0] = str;
/*    */         String[] arrayOfString1;
/*    */         (arrayOfString1 = new String[2])[1] = fA();
/*    */         return Ml0.sB(5025, arrayOfString1);
/*    */       } 
/*    */       arrayOfString[0] = str;
/*    */       String[] arrayOfString;
/*    */       (arrayOfString = new String[2])[1] = fA();
/*    */       return Ml0.sB(5026, arrayOfString);
/*    */     } 
/*    */     return fA();
/*    */   }
/*    */   
/*    */   public final String I9() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield Bm0 : [B
/*    */     //   4: ifnull -> 37
/*    */     //   7: aload_0
/*    */     //   8: dup
/*    */     //   9: getfield K0 : Lf/jd0;
/*    */     //   12: getfield ta : Lf/Q90;
/*    */     //   15: dup
/*    */     //   16: getfield Cw0 : S
/*    */     //   19: istore_0
/*    */     //   20: invokevirtual tm0 : ()Z
/*    */     //   23: istore_1
/*    */     //   24: getfield K0 : Lf/jd0;
/*    */     //   27: getfield ta : Lf/Q90;
/*    */     //   30: invokevirtual da : ()Z
/*    */     //   33: istore_2
/*    */     //   34: goto -> 73
/*    */     //   37: aload_0
/*    */     //   38: getfield bh0 : S
/*    */     //   41: ifeq -> 52
/*    */     //   44: aload_0
/*    */     //   45: getfield Lh : Z
/*    */     //   48: istore_1
/*    */     //   49: goto -> 63
/*    */     //   52: aload_0
/*    */     //   53: getfield K0 : Lf/jd0;
/*    */     //   56: getfield ta : Lf/Q90;
/*    */     //   59: invokevirtual tm0 : ()Z
/*    */     //   62: istore_1
/*    */     //   63: aload_0
/*    */     //   64: dup
/*    */     //   65: invokevirtual JF : ()Z
/*    */     //   68: istore_2
/*    */     //   69: invokevirtual Jx : ()S
/*    */     //   72: istore_0
/*    */     //   73: iload_1
/*    */     //   74: iload_0
/*    */     //   75: ldc_w 150000
/*    */     //   78: iadd
/*    */     //   79: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   82: astore_0
/*    */     //   83: ifeq -> 105
/*    */     //   86: iload_2
/*    */     //   87: ifeq -> 105
/*    */     //   90: sipush #1887
/*    */     //   93: aload_0
/*    */     //   94: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*    */     //   97: sipush #5019
/*    */     //   100: swap
/*    */     //   101: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*    */     //   104: areturn
/*    */     //   105: iload_1
/*    */     //   106: ifeq -> 117
/*    */     //   109: sipush #5019
/*    */     //   112: aload_0
/*    */     //   113: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*    */     //   116: areturn
/*    */     //   117: iload_2
/*    */     //   118: ifeq -> 129
/*    */     //   121: sipush #1887
/*    */     //   124: aload_0
/*    */     //   125: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
/*    */     //   128: areturn
/*    */     //   129: aload_0
/*    */     //   130: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 12
/*    */     //   #2	-> 16
/*    */     //   #3	-> 20
/*    */     //   #4	-> 27
/*    */     //   #5	-> 30
/*    */     //   #6	-> 38
/*    */     //   #7	-> 56
/*    */     //   #8	-> 59
/*    */     //   #9	-> 65
/*    */   }
/*    */   
/*    */   public final boolean wh0() {
/*    */     return this.K0.AL();
/*    */   }
/*    */   
/*    */   public final void gG0(short paramShort) {
/*    */     // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: aload_0
/*    */     //   2: getfield K0 : Lf/jd0;
/*    */     //   5: dup
/*    */     //   6: dup
/*    */     //   7: astore_2
/*    */     //   8: iload_1
/*    */     //   9: putfield y6 : S
/*    */     //   12: getfield ta : Lf/Q90;
/*    */     //   15: invokevirtual p10 : ()S
/*    */     //   18: if_icmpeq -> 32
/*    */     //   21: aload_2
/*    */     //   22: getfield ta : Lf/Q90;
/*    */     //   25: aload_2
/*    */     //   26: getfield y6 : S
/*    */     //   29: putfield m80 : S
/*    */     //   32: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   35: getfield K7 : Lf/Wl;
/*    */     //   38: dup
/*    */     //   39: astore_1
/*    */     //   40: ifnull -> 56
/*    */     //   43: getstatic f/UB0.Kg0 : Lf/Q50;
/*    */     //   46: aload_0
/*    */     //   47: aload_1
/*    */     //   48: <illegal opcode> run : (Lf/hm0;Lf/Wl;)Ljava/lang/Runnable;
/*    */     //   53: invokevirtual fN : (Ljava/lang/Runnable;)V
/*    */     //   56: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 9
/*    */     //   #2	-> 12
/*    */     //   #3	-> 29
/*    */     //   #4	-> 32
/*    */     //   #5	-> 35
/*    */     //   #6	-> 43
/*    */   }
/*    */   
/*    */   public final void ZE(byte paramByte) {
/*    */     Nd0();
/*    */     this.K0.ta.u0 = paramByte;
/*    */     kn0();
/*    */     xz0();
/*    */   }
/*    */   
/*    */   public final void kn0() {
/*    */     uT[] arrayOfUT;
/*    */     if ((arrayOfUT = this.qf).length < 1)
/*    */       return; 
/*    */     int i;
/*    */     byte b;
/*    */     for (i = arrayOfUT.length, b = 0; b < i; ) {
/*    */       float f2;
/*    */       uT uT1 = arrayOfUT[b];
/*    */       float f1;
/*    */       if ((f1 = this.jx) == 0.0F)
/*    */         if (JF()) {
/*    */           f1 = 0.8F;
/*    */         } else {
/*    */           f1 = 1.0F;
/*    */         }  
/*    */       if (Xk0() || Sw()) {
/*    */         f2 = 0.6F;
/*    */       } else {
/*    */         f2 = f1;
/*    */       } 
/*    */       if (u70())
/*    */         f2 = 0.3F; 
/*    */       if (f1 > 1.0F && f2 != f1)
/*    */         f2 *= f1; 
/*    */       uT1.Kh = f2;
/*    */       UA0 uA0;
/*    */       if ((uA0 = uT1.L1) != null)
/*    */         uA0.rS = f2; 
/*    */       b++;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void Nd0() {
/*    */     So so;
/*    */     if ((so = this.bC) != null) {
/*    */       so.fr0 = true;
/*    */       this.bC = null;
/*    */       this[0] = color.r;
/*    */       this[1] = color.g;
/*    */       this[2] = color.b;
/*    */       float[] arrayOfFloat;
/*    */       Color color;
/*    */       (arrayOfFloat = new float[4])[3] = (color = Color.CLEAR).a;
/*    */       So.k60().eC().PL(Wz0.gq(this.rF0.Os0, 10, 0.25F).qY(new float[4])).Kr().mg(km.wI0.pB0);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void xz0() {
/*    */     Color color1;
/*    */     if (!this.El0)
/*    */       return; 
/*    */     if (Ok()) {
/*    */       color1 = Color.RED;
/*    */     } else if (Xk0()) {
/*    */       color1 = Color.YELLOW;
/*    */     } else if (Sy0()) {
/*    */       color1 = Color.PURPLE;
/*    */     } else if (Z9()) {
/*    */       color1 = Color.MAGENTA;
/*    */     } else if (u70()) {
/*    */       color1 = Color.CYAN;
/*    */     } else {
/*    */       color1 = Color.CLEAR;
/*    */     } 
/*    */     Color color2;
/*    */     if (color1 != (color2 = Color.CLEAR) && this.bC == null) {
/*    */       arrayOfFloat2[0] = color1.r;
/*    */       arrayOfFloat2[1] = color1.g;
/*    */       float[] arrayOfFloat2;
/*    */       (arrayOfFloat2 = new float[4])[2] = color1.b;
/*    */       this[0] = color2.r;
/*    */       this[1] = color2.g;
/*    */       this[2] = color2.b;
/*    */       float[] arrayOfFloat1;
/*    */       (arrayOfFloat1 = new float[4])[3] = color2.a;
/*    */       this.bC = (So)((So)So.k60().eC().Wz0(xi0.A90(20, 35) / 10.0F).PL(Wz0.gq(this.rF0.Os0, 10, 3.5F).qY(new float[] { 0, 0, 0, 0.5F })).PL(Wz0.gq(this.rF0.Os0, 10, 3.5F).qY(new float[4])).Kr().Ck0(32767, 0.0F)).mg(km.wI0.pB0);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final boolean Sw() {
/*    */     return ((byte)(this.K0.ta.u0 & 0x7) > 0);
/*    */   }
/*    */   
/*    */   public final boolean Sy0() {
/*    */     byte b;
/*    */     if (((b = this.K0.ta.u0) | 0x8) == b) {
/*    */       b = 1;
/*    */     } else {
/*    */       b = 0;
/*    */     } 
/*    */     return b;
/*    */   }
/*    */   
/*    */   public final boolean Z9() {
/*    */     byte b;
/*    */     if (((b = this.K0.ta.u0) | Byte.MIN_VALUE) == b) {
/*    */       b = 1;
/*    */     } else {
/*    */       b = 0;
/*    */     } 
/*    */     return b;
/*    */   }
/*    */   
/*    */   public final boolean Ok() {
/*    */     byte b;
/*    */     if (((b = this.K0.ta.u0) | 0x10) == b) {
/*    */       b = 1;
/*    */     } else {
/*    */       b = 0;
/*    */     } 
/*    */     return b;
/*    */   }
/*    */   
/*    */   public final boolean u70() {
/*    */     byte b;
/*    */     if (((b = this.K0.ta.u0) | 0x20) == b) {
/*    */       b = 1;
/*    */     } else {
/*    */       b = 0;
/*    */     } 
/*    */     return b;
/*    */   }
/*    */   
/*    */   public final boolean Xk0() {
/*    */     byte b;
/*    */     if (((b = this.K0.ta.u0) | 0x40) == b) {
/*    */       b = 1;
/*    */     } else {
/*    */       b = 0;
/*    */     } 
/*    */     return b;
/*    */   }
/*    */   
/*    */   public final int ya(Gp0 paramGp0) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: invokevirtual Si : ()Z
/*    */     //   4: ifne -> 68
/*    */     //   7: aload_1
/*    */     //   8: getfield dd : Lf/rK;
/*    */     //   11: getstatic f/rK.Az : Lf/rK;
/*    */     //   14: if_acmpne -> 20
/*    */     //   17: goto -> 68
/*    */     //   20: aload_1
/*    */     //   21: aload_0
/*    */     //   22: iconst_0
/*    */     //   23: istore_1
/*    */     //   24: getfield FT : B
/*    */     //   27: invokevirtual wI : (B)B
/*    */     //   30: iconst_5
/*    */     //   31: if_icmpne -> 44
/*    */     //   34: aload_0
/*    */     //   35: getfield ws : B
/*    */     //   38: iconst_2
/*    */     //   39: irem
/*    */     //   40: bipush #-10
/*    */     //   42: imul
/*    */     //   43: istore_1
/*    */     //   44: aload_0
/*    */     //   45: bipush #8
/*    */     //   47: istore_2
/*    */     //   48: getfield A0 : Z
/*    */     //   51: ifeq -> 59
/*    */     //   54: bipush #17
/*    */     //   56: goto -> 63
/*    */     //   59: aload_0
/*    */     //   60: getfield LC0 : B
/*    */     //   63: iload_2
/*    */     //   64: iadd
/*    */     //   65: iload_1
/*    */     //   66: iadd
/*    */     //   67: ireturn
/*    */     //   68: aload_0
/*    */     //   69: bipush #48
/*    */     //   71: istore_1
/*    */     //   72: getfield A0 : Z
/*    */     //   75: ifeq -> 83
/*    */     //   78: bipush #17
/*    */     //   80: goto -> 87
/*    */     //   83: aload_0
/*    */     //   84: getfield G8 : B
/*    */     //   87: iload_1
/*    */     //   88: iadd
/*    */     //   89: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 8
/*    */     //   #2	-> 11
/*    */   }
/*    */   
/*    */   public final float dk(Gp0 paramGp0) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: aload_0
/*    */     //   3: getfield FT : B
/*    */     //   6: invokevirtual wI : (B)B
/*    */     //   9: istore_2
/*    */     //   10: invokevirtual Si : ()Z
/*    */     //   13: ifeq -> 148
/*    */     //   16: aload_1
/*    */     //   17: getfield Ja : Lf/Mn;
/*    */     //   20: getstatic f/Mn.VK : Lf/Mn;
/*    */     //   23: if_acmpne -> 90
/*    */     //   26: aload_0
/*    */     //   27: getfield ws : B
/*    */     //   30: dup
/*    */     //   31: istore_0
/*    */     //   32: tableswitch default -> 72, 0 -> 82, 1 -> 82, 2 -> 82, 3 -> 75, 4 -> 75, 5 -> 75
/*    */     //   72: goto -> 144
/*    */     //   75: iload_0
/*    */     //   76: i2f
/*    */     //   77: ldc_w 0.05
/*    */     //   80: fmul
/*    */     //   81: freturn
/*    */     //   82: iload_0
/*    */     //   83: i2f
/*    */     //   84: ldc_w 0.05
/*    */     //   87: fmul
/*    */     //   88: fneg
/*    */     //   89: freturn
/*    */     //   90: iload_2
/*    */     //   91: iconst_2
/*    */     //   92: if_icmpne -> 108
/*    */     //   95: aload_0
/*    */     //   96: getfield ws : B
/*    */     //   99: ifeq -> 106
/*    */     //   102: ldc_w 0.25
/*    */     //   105: freturn
/*    */     //   106: fconst_0
/*    */     //   107: freturn
/*    */     //   108: iload_2
/*    */     //   109: iconst_3
/*    */     //   110: if_icmpne -> 137
/*    */     //   113: aload_0
/*    */     //   114: getfield ws : B
/*    */     //   117: dup
/*    */     //   118: istore_0
/*    */     //   119: ifeq -> 135
/*    */     //   122: iload_0
/*    */     //   123: iconst_2
/*    */     //   124: if_icmpeq -> 131
/*    */     //   127: ldc_w -0.5
/*    */     //   130: freturn
/*    */     //   131: ldc_w 0.5
/*    */     //   134: freturn
/*    */     //   135: fconst_0
/*    */     //   136: freturn
/*    */     //   137: iload_2
/*    */     //   138: iconst_5
/*    */     //   139: if_icmpne -> 144
/*    */     //   142: fconst_0
/*    */     //   143: freturn
/*    */     //   144: ldc_w 0.2
/*    */     //   147: freturn
/*    */     //   148: aload_1
/*    */     //   149: getfield dd : Lf/rK;
/*    */     //   152: getstatic f/rK.bh : Lf/rK;
/*    */     //   155: if_acmpne -> 174
/*    */     //   158: aload_1
/*    */     //   159: aload_0
/*    */     //   160: getfield FT : B
/*    */     //   163: invokevirtual lPt8 : (B)I
/*    */     //   166: iconst_1
/*    */     //   167: if_icmpne -> 174
/*    */     //   170: ldc_w -0.5
/*    */     //   173: freturn
/*    */     //   174: aload_1
/*    */     //   175: getfield Ja : Lf/Mn;
/*    */     //   178: getstatic f/Mn.VK : Lf/Mn;
/*    */     //   181: if_acmpne -> 246
/*    */     //   184: aload_0
/*    */     //   185: getfield ws : B
/*    */     //   188: dup
/*    */     //   189: istore_0
/*    */     //   190: tableswitch default -> 228, 0 -> 239, 1 -> 239, 2 -> 239, 3 -> 231, 4 -> 231, 5 -> 231
/*    */     //   228: goto -> 354
/*    */     //   231: iload_0
/*    */     //   232: i2f
/*    */     //   233: ldc_w 0.05
/*    */     //   236: fmul
/*    */     //   237: fneg
/*    */     //   238: freturn
/*    */     //   239: iload_0
/*    */     //   240: i2f
/*    */     //   241: ldc_w 0.05
/*    */     //   244: fmul
/*    */     //   245: freturn
/*    */     //   246: iload_2
/*    */     //   247: iconst_2
/*    */     //   248: if_icmpne -> 264
/*    */     //   251: aload_0
/*    */     //   252: getfield ws : B
/*    */     //   255: ifeq -> 260
/*    */     //   258: fconst_0
/*    */     //   259: freturn
/*    */     //   260: ldc_w -0.6
/*    */     //   263: freturn
/*    */     //   264: iload_2
/*    */     //   265: iconst_3
/*    */     //   266: if_icmpne -> 295
/*    */     //   269: aload_0
/*    */     //   270: getfield ws : B
/*    */     //   273: dup
/*    */     //   274: istore_0
/*    */     //   275: ifeq -> 291
/*    */     //   278: iload_0
/*    */     //   279: iconst_2
/*    */     //   280: if_icmpeq -> 287
/*    */     //   283: ldc_w 0.2
/*    */     //   286: freturn
/*    */     //   287: ldc_w -0.1
/*    */     //   290: freturn
/*    */     //   291: ldc_w -0.7
/*    */     //   294: freturn
/*    */     //   295: iload_2
/*    */     //   296: iconst_5
/*    */     //   297: if_icmpne -> 354
/*    */     //   300: aload_0
/*    */     //   301: getfield ws : B
/*    */     //   304: tableswitch default -> 336, 1 -> 350, 2 -> 346, 3 -> 342, 4 -> 338
/*    */     //   336: fconst_0
/*    */     //   337: freturn
/*    */     //   338: ldc_w 0.1
/*    */     //   341: freturn
/*    */     //   342: ldc_w -0.25
/*    */     //   345: freturn
/*    */     //   346: ldc_w -0.55
/*    */     //   349: freturn
/*    */     //   350: ldc_w -0.75
/*    */     //   353: freturn
/*    */     //   354: ldc_w -0.5
/*    */     //   357: freturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 17
/*    */     //   #2	-> 20
/*    */     //   #3	-> 149
/*    */     //   #4	-> 152
/*    */     //   #5	-> 175
/*    */     //   #6	-> 178
/*    */   }
/*    */   
/*    */   public final float zJ0(Gp0 paramGp0) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: getfield dd : Lf/rK;
/*    */     //   4: getstatic f/rK.Az : Lf/rK;
/*    */     //   7: if_acmpne -> 12
/*    */     //   10: fconst_0
/*    */     //   11: freturn
/*    */     //   12: aload_0
/*    */     //   13: aload_1
/*    */     //   14: aload_0
/*    */     //   15: getfield FT : B
/*    */     //   18: invokevirtual wI : (B)B
/*    */     //   21: istore_2
/*    */     //   22: invokevirtual Si : ()Z
/*    */     //   25: ifeq -> 163
/*    */     //   28: aload_1
/*    */     //   29: getfield Ja : Lf/Mn;
/*    */     //   32: getstatic f/Mn.VK : Lf/Mn;
/*    */     //   35: if_acmpne -> 111
/*    */     //   38: aload_0
/*    */     //   39: getfield ws : B
/*    */     //   42: dup
/*    */     //   43: istore_0
/*    */     //   44: tableswitch default -> 84, 0 -> 100, 1 -> 100, 2 -> 100, 3 -> 87, 4 -> 87, 5 -> 87
/*    */     //   84: goto -> 161
/*    */     //   87: iload_0
/*    */     //   88: iconst_3
/*    */     //   89: isub
/*    */     //   90: i2f
/*    */     //   91: ldc_w 0.75
/*    */     //   94: fmul
/*    */     //   95: ldc_w 0.85
/*    */     //   98: fsub
/*    */     //   99: freturn
/*    */     //   100: iload_0
/*    */     //   101: i2f
/*    */     //   102: ldc_w 0.75
/*    */     //   105: fmul
/*    */     //   106: ldc_w 0.45
/*    */     //   109: fsub
/*    */     //   110: freturn
/*    */     //   111: iload_2
/*    */     //   112: iconst_2
/*    */     //   113: if_icmpne -> 131
/*    */     //   116: aload_0
/*    */     //   117: getfield ws : B
/*    */     //   120: ifne -> 127
/*    */     //   123: ldc_w -0.4
/*    */     //   126: freturn
/*    */     //   127: ldc_w 0.4
/*    */     //   130: freturn
/*    */     //   131: iload_2
/*    */     //   132: iconst_3
/*    */     //   133: if_icmpne -> 161
/*    */     //   136: aload_0
/*    */     //   137: getfield ws : B
/*    */     //   140: dup
/*    */     //   141: istore_0
/*    */     //   142: iconst_2
/*    */     //   143: if_icmpne -> 150
/*    */     //   146: ldc_w 0.5
/*    */     //   149: freturn
/*    */     //   150: iload_0
/*    */     //   151: i2f
/*    */     //   152: ldc_w 0.7
/*    */     //   155: fmul
/*    */     //   156: ldc_w -0.5
/*    */     //   159: fadd
/*    */     //   160: freturn
/*    */     //   161: fconst_0
/*    */     //   162: freturn
/*    */     //   163: aload_1
/*    */     //   164: getfield dd : Lf/rK;
/*    */     //   167: getstatic f/rK.bh : Lf/rK;
/*    */     //   170: if_acmpne -> 189
/*    */     //   173: aload_1
/*    */     //   174: aload_0
/*    */     //   175: getfield FT : B
/*    */     //   178: invokevirtual lPt8 : (B)I
/*    */     //   181: iconst_1
/*    */     //   182: if_icmpne -> 189
/*    */     //   185: ldc_w 0.2
/*    */     //   188: freturn
/*    */     //   189: aload_1
/*    */     //   190: getfield Ja : Lf/Mn;
/*    */     //   193: getstatic f/Mn.VK : Lf/Mn;
/*    */     //   196: if_acmpne -> 271
/*    */     //   199: aload_0
/*    */     //   200: getfield ws : B
/*    */     //   203: dup
/*    */     //   204: istore_0
/*    */     //   205: tableswitch default -> 244, 0 -> 260, 1 -> 260, 2 -> 260, 3 -> 247, 4 -> 247, 5 -> 247
/*    */     //   244: goto -> 392
/*    */     //   247: iload_0
/*    */     //   248: iconst_3
/*    */     //   249: isub
/*    */     //   250: i2f
/*    */     //   251: ldc_w 0.75
/*    */     //   254: fmul
/*    */     //   255: ldc_w 0.85
/*    */     //   258: fsub
/*    */     //   259: freturn
/*    */     //   260: iload_0
/*    */     //   261: i2f
/*    */     //   262: ldc_w 0.75
/*    */     //   265: fmul
/*    */     //   266: ldc_w 0.75
/*    */     //   269: fsub
/*    */     //   270: freturn
/*    */     //   271: iload_2
/*    */     //   272: iconst_2
/*    */     //   273: if_icmpne -> 291
/*    */     //   276: aload_0
/*    */     //   277: getfield ws : B
/*    */     //   280: ifne -> 287
/*    */     //   283: ldc_w -0.25
/*    */     //   286: freturn
/*    */     //   287: ldc_w 0.35
/*    */     //   290: freturn
/*    */     //   291: iload_2
/*    */     //   292: iconst_3
/*    */     //   293: if_icmpne -> 321
/*    */     //   296: aload_0
/*    */     //   297: getfield ws : B
/*    */     //   300: dup
/*    */     //   301: istore_0
/*    */     //   302: iconst_2
/*    */     //   303: if_icmpne -> 310
/*    */     //   306: ldc_w 0.75
/*    */     //   309: freturn
/*    */     //   310: iload_0
/*    */     //   311: i2f
/*    */     //   312: ldc_w 0.3
/*    */     //   315: fmul
/*    */     //   316: ldc_w -0.35
/*    */     //   319: fadd
/*    */     //   320: freturn
/*    */     //   321: iload_2
/*    */     //   322: iconst_5
/*    */     //   323: if_icmpne -> 392
/*    */     //   326: aload_0
/*    */     //   327: getfield ws : B
/*    */     //   330: dup
/*    */     //   331: istore_0
/*    */     //   332: tableswitch default -> 368, 0 -> 388, 1 -> 375, 2 -> 375, 3 -> 375, 4 -> 371
/*    */     //   368: goto -> 392
/*    */     //   371: ldc_w 0.35999998
/*    */     //   374: freturn
/*    */     //   375: iload_0
/*    */     //   376: iconst_2
/*    */     //   377: isub
/*    */     //   378: i2f
/*    */     //   379: ldc_w 0.75
/*    */     //   382: fmul
/*    */     //   383: ldc_w 0.25
/*    */     //   386: fadd
/*    */     //   387: freturn
/*    */     //   388: ldc_w -0.35999998
/*    */     //   391: freturn
/*    */     //   392: ldc_w 0.2
/*    */     //   395: freturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 1
/*    */     //   #2	-> 4
/*    */     //   #3	-> 29
/*    */     //   #4	-> 32
/*    */     //   #5	-> 164
/*    */     //   #6	-> 167
/*    */     //   #7	-> 190
/*    */     //   #8	-> 193
/*    */   }
/*    */   
/*    */   public final boolean Si() {
/*    */     return (km.MR.hG0() == this.FT);
/*    */   }
/*    */   
/*    */   public final int YI(Gp0 paramGp0) {
/*    */     return (paramGp0.dd == rK.Az) ? 0 : (Si() ? ((paramGp0.wI(this.FT) == 2) ? ((paramGp0.N0(this.FT, (byte)0) == this) ? 10 : 66) : ((paramGp0.wI(this.FT) == 3) ? (this.ws * 28 + 10) : 38)) : ((paramGp0.wI(this.FT) == 3) ? (this.ws * 20 + 124) : ((paramGp0.wI(this.FT) == 5) ? (this.ws * 20 + 104) : ((paramGp0.wI(this.FT) == 2) ? ((paramGp0.N0(this.FT, (byte)0) == this) ? 122 : 166) : 144))));
/*    */   }
/*    */   
/*    */   public final void x10(short paramShort, byte paramByte1, short[] paramArrayOfshort, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
/*    */     paramShort = Hk();
/*    */     String str = this.K0.ta.nr;
/*    */     byte b = oi();
/*    */     ZB0(paramShort, paramShort, str, paramByte2, paramByte3, paramByte1, b);
/*    */     this.zG0 = paramArrayOfshort;
/*    */     this.Bm0 = paramArrayOfbyte;
/*    */     if (paramShort > 0 && paramArrayOfshort != null && paramArrayOfbyte == null)
/*    */       for (this.Bm0 = new byte[4], paramShort = 0; paramShort < 4; ) {
/*    */         if (this.zG0[paramShort] > 0) {
/*    */           WD wD;
/*    */           if ((wD = yk0.cw().mP(paramArrayOfshort[paramShort])) == null) {
/*    */             this.Bm0[paramShort] = 0;
/*    */           } else {
/*    */             byte[] arrayOfByte = this.Bm0;
/*    */             byte b1;
/*    */             if ((b1 = wD.nul) >= 5)
/*    */               b1 = 5; 
/*    */             arrayOfByte[paramShort] = b1;
/*    */           } 
/*    */         } 
/*    */         paramShort++;
/*    */       }  
/*    */   }
/*    */   
/*    */   public final byte iQ() {
/*    */     byte b;
/*    */     return ((b = this.f1) != -1) ? b : this.K0.IH0;
/*    */   }
/*    */   
/*    */   public final short[] vZ() {
/*    */     short[] arrayOfShort;
/*    */     if ((arrayOfShort = this.zG0) != null)
/*    */       return arrayOfShort; 
/*    */     arrayOfShort = this.K0.ta.En0;
/*    */     if (this.iz != null) {
/*    */       byte b;
/*    */       short[] arrayOfShort1;
/*    */       for (arrayOfShort = Arrays.copyOf(arrayOfShort, arrayOfShort.length), b = 0; b < (arrayOfShort1 = this.iz).length; ) {
/*    */         short s;
/*    */         if ((s = arrayOfShort1[b]) > 0)
/*    */           arrayOfShort[b] = s; 
/*    */         b++;
/*    */       } 
/*    */       return arrayOfShort;
/*    */     } 
/*    */     return arrayOfShort;
/*    */   }
/*    */   
/*    */   public final byte[] k70() {
/*    */     byte[] arrayOfByte;
/*    */     if ((arrayOfByte = this.Bm0) != null)
/*    */       return arrayOfByte; 
/*    */     arrayOfByte = this.K0.ta.rI0;
/*    */     if (this.iz != null) {
/*    */       byte b;
/*    */       short[] arrayOfShort;
/*    */       for (arrayOfByte = Arrays.copyOf(arrayOfByte, arrayOfByte.length), b = 0; b < (arrayOfShort = this.iz).length; ) {
/*    */         if (arrayOfShort[b] > 0)
/*    */           arrayOfByte[b] = this.Hj0[b]; 
/*    */         b++;
/*    */       } 
/*    */       return arrayOfByte;
/*    */     } 
/*    */     return arrayOfByte;
/*    */   }
/*    */   
/*    */   public final void aJ(hR paramhR, byte paramByte) {
/*    */     byte b;
/*    */     this.wt[b] = (byte)(this.wt[b = paramhR.dL] + paramByte);
/*    */     this.K0.pO();
/*    */     Wl wl;
/*    */     if ((wl = km.wI0.K7) != null)
/*    */       wl.LW.oD(this).Eh(); 
/*    */   }
/*    */   
/*    */   public final void K00() {
/*    */     Arrays.fill(this.wt, (byte)0);
/*    */   }
/*    */   
/*    */   public final void lG0() {
/*    */     this.aJ0 = true;
/*    */     UA0 uA0;
/*    */     if ((uA0 = this.FJ) != null)
/*    */       uA0.dispose(); 
/*    */     Bw[] arrayOfBw;
/*    */     if ((arrayOfBw = this.Sn0) != null) {
/*    */       int i = arrayOfBw.length;
/*    */       for (byte b = 0; b < i; b++)
/*    */         arrayOfBw[b].gH0(this); 
/*    */     } 
/*    */     So so;
/*    */     if ((so = this.bC) != null)
/*    */       Cy0(); 
/*    */   }
/*    */   
/*    */   public final void rj() {
/*    */     xy0(1.0F);
/*    */   }
/*    */   
/*    */   public final void xy0(float paramFloat) {
/*    */     boolean bool = JF();
/*    */     float f = 0.0F;
/*    */     Gp0 gp0;
/*    */     if ((gp0 = km.MR) != null)
/*    */       if (gp0.hG0() == this.FT) {
/*    */         f = -1.0F;
/*    */       } else {
/*    */         f = 1.0F;
/*    */       }  
/*    */     f *= h1.In0;
/*    */     if (bool)
/*    */       paramFloat = nx0.SA0(paramFloat * 0.6F, 0.5F, 1.0F); 
/*    */     D0.lPt1(Jx(), paramFloat, f, bool);
/*    */   }
/*    */   
/*    */   public final UD0 xp() {
/*    */     UD0 uD0;
/*    */     if ((uD0 = this.hU) != null) {
/*    */       if (uD0.TL > 0 && this.f1 > 0)
/*    */         return On.v30().lpT3((short)(this.hU.TL + this.f1 - 1)); 
/*    */       return uD0;
/*    */     } 
/*    */     jd0 jd01;
/*    */     if ((uD0 = (jd01 = this.K0).NI).TL > 0 && this.IH0 > 0)
/*    */       uD0 = On.v30().lpT3((short)(this.NI.TL + this.IH0 - 1)); 
/*    */     return uD0;
/*    */   }
/*    */   
/*    */   public final Ht0 VA0() {
/*    */     Ht0 ht0;
/*    */     return ((ht0 = this.lPt1) != Ht0.P00) ? ht0 : xp().Sl0(iQ());
/*    */   }
/*    */   
/*    */   public final Ht0 qH0() {
/*    */     Ht0 ht0;
/*    */     return ((ht0 = this.se) != Ht0.P00) ? ht0 : xp().pf0(iQ());
/*    */   }
/*    */   
/*    */   public final boolean xe(Ht0 paramHt0) {
/*    */     if (this.lPt1 == paramHt0 || this.se == paramHt0)
/*    */       return true; 
/*    */     if (VA0() == paramHt0 || qH0() == paramHt0)
/*    */       return true; 
/*    */   }
/*    */   
/*    */   public final short D90() {
/*    */     short s;
/*    */     return ((s = this.BC) != -1) ? s : this.K0.yw();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/hm0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */