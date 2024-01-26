/*  1 */ package f;public final class fM0 extends me { public final void s9(byte paramByte, boolean paramBoolean) { short[][] arrayOfShort; int i; byte b; for (this.Cb0 = paramByte, i = (arrayOfShort = PA0).length, b = 0; b < i; ) { short arrayOfShort1[] = arrayOfShort[b], s = arrayOfShort1[0]; ((il)this.im0.v50(s, arrayOfShort1[1], 0))
/*    */         
/*  3 */         .xJ = this.Cb0 * 2.0F; b++; }
/*  4 */      Hc0 hc0; for (hc0 = this.J00.r30(); hc0.hasNext(); ) { lpt1 lpt1 = (lpt1)hc0.next(); if (paramByte == 2) { lpt1
/*  5 */           .co0((String)lpt1.lz.get(0), false, null); continue; }  lpt1
/*  6 */         .uq();
/*  7 */       ((O80)((T0)lpt1.xl0.get(0))
/*  8 */         .cOM1(O80.Jg0))
/*  9 */         .ID(lpt1.WJ0); }
/* 10 */      for (hc0 = this.ai0.r30(); hc0.hasNext(); ) { lpt1 lpt1 = (lpt1)hc0.next(); if (paramByte == 1) { lpt1
/* 11 */           .co0((String)lpt1.lz.get(0), false, null); continue; }  lpt1
/* 12 */         .uq();
/* 13 */       ((O80)((T0)lpt1.xl0.get(0))
/* 14 */         .cOM1(O80.Jg0))
/* 15 */         .ID(lpt1.WJ0); }
/* 16 */      for (hc0 = this.d0.r30(); hc0.hasNext(); ) { lpt1 lpt1 = (lpt1)hc0.next(); if (paramByte == 0) { lpt1
/* 17 */           .co0((String)lpt1.lz.get(0), false, null); continue; }  lpt1
/* 18 */         .uq();
/* 19 */       ((O80)((T0)lpt1.xl0.get(0))
/* 20 */         .cOM1(O80.Jg0))
/* 21 */         .ID(lpt1.WJ0); }  if (paramBoolean) {
/*    */       NW nW;
/*    */       
/* 24 */       Matrix4 matrix4 = (nW = this.ql).FI.mh; matrix4.on0(eo1); eo eo1; (eo1 = MA).y = this.w2.Cb0 * 0.5F; this.ql.FI.mh.b8(eo1);
/*    */     }  }
/*    */ 
/*    */   
/*    */   public static final eo MA = new eo();
/*    */   public static short[][] PA0;
/*    */   public NW ql;
/*    */   public byte Cb0;
/*    */   public boolean TI;
/*    */   public fQ J00;
/*    */   public fQ ai0;
/*    */   public fQ d0;
/*    */   
/*    */   public fM0(xV paramxV) {
/*    */     super(paramxV);
/*    */     zk zk;
/*    */     this.Cb0 = -10;
/*    */     this.TI = false;
/*    */     this.J00 = new fQ();
/*    */     this.ai0 = new fQ();
/*    */     this.d0 = new fQ();
/*    */     eI.Lj().getClass();
/*    */     lpt1.Yr0 = false;
/*    */     lpt1.mh.g7(4.0F, this.Cb0 * 0.5F, 4.0F);
/*    */     kc(lpt1);
/*    */     this.ql = new NW(this, lpt1);
/*    */     lpt1 lpt1;
/*    */     (lpt1 = eI.Gp(242)).yQ();
/*    */     s9((byte)1, true);
/*    */     this(this);
/*    */     int i = paramxV.ev0();
/*    */     i = paramxV.m00() * i;
/*    */     int j = paramxV.jI0();
/*    */     j = paramxV.uK0() * j;
/*    */     short s;
/*    */     for (s = 0; s < i; s = (short)(s + 1)) {
/*    */       short s1;
/*    */       for (s1 = 0; s1 < j; s1 = (short)(s1 + 1)) {
/*    */         il il;
/*    */         if ((il = paramxV.mF((byte)0, s, s1)).OB0() == 89)
/*    */           il.wu0(zk); 
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   static {
/*    */     short[] arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 1;
/*    */     (new short[2])[1] = 34;
/*    */     (new short[41][])[0] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 1;
/*    */     (new short[2])[1] = 35;
/*    */     (new short[41][])[1] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 1;
/*    */     (new short[2])[1] = 36;
/*    */     (new short[41][])[2] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 6;
/*    */     (new short[2])[1] = 25;
/*    */     (new short[41][])[3] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 6;
/*    */     (new short[2])[1] = 26;
/*    */     (new short[41][])[4] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 6;
/*    */     (new short[2])[1] = 27;
/*    */     (new short[41][])[5] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 6;
/*    */     (new short[2])[1] = 8;
/*    */     (new short[41][])[6] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 6;
/*    */     (new short[2])[1] = 9;
/*    */     (new short[41][])[7] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 6;
/*    */     (new short[2])[1] = 10;
/*    */     (new short[41][])[8] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 7;
/*    */     (new short[2])[1] = 8;
/*    */     (new short[41][])[9] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 7;
/*    */     (new short[2])[1] = 9;
/*    */     (new short[41][])[10] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 7;
/*    */     (new short[2])[1] = 10;
/*    */     (new short[41][])[11] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 10;
/*    */     (new short[2])[1] = 2;
/*    */     (new short[41][])[12] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 10;
/*    */     (new short[2])[1] = 3;
/*    */     (new short[41][])[13] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 10;
/*    */     (new short[2])[1] = 4;
/*    */     (new short[41][])[14] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 13;
/*    */     (new short[2])[1] = 6;
/*    */     (new short[41][])[15] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 13;
/*    */     (new short[2])[1] = 7;
/*    */     (new short[41][])[16] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 13;
/*    */     (new short[2])[1] = 8;
/*    */     (new short[41][])[17] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 13;
/*    */     (new short[2])[1] = 19;
/*    */     (new short[41][])[18] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 13;
/*    */     (new short[2])[1] = 20;
/*    */     (new short[41][])[19] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 13;
/*    */     (new short[2])[1] = 21;
/*    */     (new short[41][])[20] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 13;
/*    */     (new short[2])[1] = 27;
/*    */     (new short[41][])[21] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 13;
/*    */     (new short[2])[1] = 28;
/*    */     (new short[41][])[22] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 13;
/*    */     (new short[2])[1] = 29;
/*    */     (new short[41][])[23] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 13;
/*    */     (new short[2])[1] = 33;
/*    */     (new short[41][])[24] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 13;
/*    */     (new short[2])[1] = 34;
/*    */     (new short[41][])[25] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 13;
/*    */     (new short[2])[1] = 35;
/*    */     (new short[41][])[26] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 16;
/*    */     (new short[2])[1] = 2;
/*    */     (new short[41][])[27] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 16;
/*    */     (new short[2])[1] = 3;
/*    */     (new short[41][])[28] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 16;
/*    */     (new short[2])[1] = 4;
/*    */     (new short[41][])[29] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 16;
/*    */     (new short[2])[1] = 25;
/*    */     (new short[41][])[30] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 16;
/*    */     (new short[2])[1] = 26;
/*    */     (new short[41][])[31] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 16;
/*    */     (new short[2])[1] = 27;
/*    */     (new short[41][])[32] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 20;
/*    */     (new short[2])[1] = 21;
/*    */     (new short[41][])[33] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 20;
/*    */     (new short[2])[1] = 22;
/*    */     (new short[41][])[34] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 20;
/*    */     (new short[2])[1] = 23;
/*    */     (new short[41][])[35] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 20;
/*    */     (new short[2])[1] = 24;
/*    */     (new short[41][])[36] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 20;
/*    */     (new short[2])[1] = 25;
/*    */     (new short[41][])[37] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 25;
/*    */     (new short[2])[1] = 34;
/*    */     (new short[41][])[38] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 25;
/*    */     (new short[2])[1] = 35;
/*    */     (new short[41][])[39] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 25;
/*    */     (new short[2])[1] = 36;
/*    */     PA0 = new short[][] { 
/*    */         null, null, null, null, null, null, null, null, null, null, 
/*    */         null, null, null, null, null, null, null, null, null, null, 
/*    */         null, null, null, null, null, null, null, null, null, null, 
/*    */         null, null, null, null, null, null, null, null, null, null, 
/*    */         arrayOfShort };
/*    */   }
/*    */   
/*    */   public final void Ic0(float paramFloat) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield TI : Z
/*    */     //   4: ifne -> 158
/*    */     //   7: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   10: getfield iJ0 : Lf/Xi;
/*    */     //   13: checkcast f/W9
/*    */     //   16: getfield wN : Lf/fQ;
/*    */     //   19: invokevirtual r30 : ()Lf/Hc0;
/*    */     //   22: astore_2
/*    */     //   23: aload_2
/*    */     //   24: invokevirtual hasNext : ()Z
/*    */     //   27: ifeq -> 143
/*    */     //   30: aload_2
/*    */     //   31: invokevirtual next : ()Ljava/lang/Object;
/*    */     //   34: checkcast f/Ah
/*    */     //   37: getfield W7 : Lf/fQ;
/*    */     //   40: invokevirtual r30 : ()Lf/Hc0;
/*    */     //   43: astore_3
/*    */     //   44: aload_3
/*    */     //   45: invokevirtual hasNext : ()Z
/*    */     //   48: ifeq -> 23
/*    */     //   51: aload_3
/*    */     //   52: invokevirtual next : ()Ljava/lang/Object;
/*    */     //   55: checkcast f/lpt1
/*    */     //   58: dup
/*    */     //   59: astore #4
/*    */     //   61: getfield Zl0 : Ljava/lang/String;
/*    */     //   64: ldc 'r04_b1'
/*    */     //   66: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   69: ifeq -> 86
/*    */     //   72: aload_0
/*    */     //   73: aload #4
/*    */     //   75: invokevirtual uq : ()V
/*    */     //   78: getfield J00 : Lf/fQ;
/*    */     //   81: aload #4
/*    */     //   83: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   86: aload #4
/*    */     //   88: getfield Zl0 : Ljava/lang/String;
/*    */     //   91: ldc 'r04_b2'
/*    */     //   93: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   96: ifeq -> 113
/*    */     //   99: aload_0
/*    */     //   100: aload #4
/*    */     //   102: invokevirtual uq : ()V
/*    */     //   105: getfield ai0 : Lf/fQ;
/*    */     //   108: aload #4
/*    */     //   110: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   113: aload #4
/*    */     //   115: getfield Zl0 : Ljava/lang/String;
/*    */     //   118: ldc 'r04_b3'
/*    */     //   120: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   123: ifeq -> 44
/*    */     //   126: aload_0
/*    */     //   127: aload #4
/*    */     //   129: invokevirtual uq : ()V
/*    */     //   132: getfield d0 : Lf/fQ;
/*    */     //   135: aload #4
/*    */     //   137: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   140: goto -> 44
/*    */     //   143: aload_0
/*    */     //   144: getfield ai0 : Lf/fQ;
/*    */     //   147: getfield Z8 : I
/*    */     //   150: ifle -> 158
/*    */     //   153: aload_0
/*    */     //   154: iconst_1
/*    */     //   155: putfield TI : Z
/*    */     //   158: aload_0
/*    */     //   159: getfield ql : Lf/NW;
/*    */     //   162: dup
/*    */     //   163: dup
/*    */     //   164: astore_2
/*    */     //   165: getfield FI : Lf/lpt1;
/*    */     //   168: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   171: getfield Qy : F
/*    */     //   174: invokevirtual wP : (F)V
/*    */     //   177: getfield FI : Lf/lpt1;
/*    */     //   180: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   183: astore_3
/*    */     //   184: getstatic f/fM0.MA : Lf/eo;
/*    */     //   187: dup
/*    */     //   188: astore #4
/*    */     //   190: aload_2
/*    */     //   191: aload_3
/*    */     //   192: aload #4
/*    */     //   194: invokevirtual on0 : (Lf/eo;)Lf/eo;
/*    */     //   197: pop
/*    */     //   198: getfield w2 : Lf/fM0;
/*    */     //   201: getfield Cb0 : B
/*    */     //   204: i2f
/*    */     //   205: ldc 0.5
/*    */     //   207: fmul
/*    */     //   208: fstore_3
/*    */     //   209: getfield y : F
/*    */     //   212: dup
/*    */     //   213: fstore #5
/*    */     //   215: fload_3
/*    */     //   216: fcmpg
/*    */     //   217: ifge -> 250
/*    */     //   220: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   223: getfield Qy : F
/*    */     //   226: ldc 0.5
/*    */     //   228: fmul
/*    */     //   229: fload #5
/*    */     //   231: fadd
/*    */     //   232: dup
/*    */     //   233: fstore #5
/*    */     //   235: fload_3
/*    */     //   236: aload #4
/*    */     //   238: fload #5
/*    */     //   240: putfield y : F
/*    */     //   243: fcmpl
/*    */     //   244: iflt -> 290
/*    */     //   247: goto -> 284
/*    */     //   250: fload #5
/*    */     //   252: fload_3
/*    */     //   253: fcmpl
/*    */     //   254: ifle -> 302
/*    */     //   257: fload #5
/*    */     //   259: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   262: getfield Qy : F
/*    */     //   265: ldc 0.5
/*    */     //   267: fmul
/*    */     //   268: fsub
/*    */     //   269: dup
/*    */     //   270: fstore #5
/*    */     //   272: fload_3
/*    */     //   273: aload #4
/*    */     //   275: fload #5
/*    */     //   277: putfield y : F
/*    */     //   280: fcmpg
/*    */     //   281: ifgt -> 290
/*    */     //   284: aload #4
/*    */     //   286: fload_3
/*    */     //   287: putfield y : F
/*    */     //   290: aload_2
/*    */     //   291: getfield FI : Lf/lpt1;
/*    */     //   294: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   297: aload #4
/*    */     //   299: invokevirtual b8 : (Lf/eo;)V
/*    */     //   302: aload_0
/*    */     //   303: fload_1
/*    */     //   304: invokespecial Ic0 : (F)V
/*    */     //   307: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 10
/*    */     //   #2	-> 13
/*    */     //   #3	-> 16
/*    */     //   #4	-> 19
/*    */     //   #5	-> 165
/*    */     //   #6	-> 168
/*    */     //   #7	-> 171
/*    */     //   #8	-> 174
/*    */     //   #9	-> 223
/*    */     //   #10	-> 240
/*    */     //   #11	-> 262
/*    */     //   #12	-> 277
/*    */     //   #13	-> 304
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     super.dispose();
/*    */     this.J00.clear();
/*    */     this.ai0.clear();
/*    */     this.d0.clear();
/*    */     this.Cb0 = -10;
/*    */   }
/*    */   
/*    */   public final void Ad0(short[] paramArrayOfshort) {
/*    */     if (paramArrayOfshort.length < 1)
/*    */       return; 
/*    */     short s;
/*    */     if ((s = paramArrayOfshort[0]) == 4463 || s == 4464) {
/*    */       byte b = (byte)paramArrayOfshort[1];
/*    */       if (s == 4463) {
/*    */         s = 1;
/*    */       } else {
/*    */         s = 0;
/*    */       } 
/*    */       s9(b, s);
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/fM0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */