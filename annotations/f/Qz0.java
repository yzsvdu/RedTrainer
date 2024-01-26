/*  1 */ package f;public final class Qz0 extends Ks0 { public static final String[] tm = new String[0]; public static final eo rg = new eo(); public js Ot; public fQ D1; public Ut0 A5; public Ut0 x60; public long Kd0; public Fy W50; public Qz0(js paramjs) { fQ fQ1; Ut0 ut0; this(); this.D1 = this; this(); this.A5 = this; this(); this.x60 = this; this.Kd0 = 0L; this.Ot = paramjs; Xu("nameplategui"); km.kH0 = this; } private void Dk(short paramShort) { Fy fy; if ((fy = this.W50) != null) { jf0(fy); this.W50 = null; }  if (paramShort > 0) { Fy fy1; this(paramShort); this.W50 = this; si(this, Ub()); }  } private void Oo(byte paramByte1, short paramShort, byte paramByte2, j40 paramj40) { this(paramByte1, paramShort, paramByte2, paramj40); Ge ge; this.D1.Com3(this); this.Ot
/*  2 */       .si(this, this.Ot.Ub());
/*  3 */     this.Ot.Af(this); } private void zi0(zB0 paramzB0, int paramInt) { Ms0 ms0; int i; if ((i = paramzB0.ph0.ordinal()) != 9) { if (i != 12) { if (i != 21) { if (i != 23) { if (i != 27) { if (i != 32) { gH0 gH0; String[] arrayOfString = tm; LPT1[] arrayOfLPT1; if ((arrayOfLPT1 = paramzB0.nC0) != null) { int j; String[] arrayOfString1; byte b; for (arrayOfString1 = new String[j = arrayOfLPT1.length], b = 0; b < j; ) { arrayOfString1[b] = paramzB0.nC0[b].Na(); b++; }  arrayOfString = arrayOfString1; }  byte b1 = paramzB0.L7; Aq aq = paramzB0.ph0; String str = paramzB0.Md0(); short[] arrayOfShort1 = paramzB0.KK, arrayOfShort2 = paramzB0.Ny0; byte b2 = paramzB0.eG0, b3 = paramzB0.qS, b4 = paramzB0.so; this(b1, paramInt, aq, str, arrayOfShort1, arrayOfShort2, b2, b3, b4, arrayOfString); } else { Ge ge; j40 j40 = km.u4.s40(aq0.LI).ky((short)0); this(paramzB0.L7, (short)paramzB0.pF, (byte)0, j40); }  } else { JH0 jH0; i = paramzB0.L7; this(i, paramzB0.Md0()); }  } else { a0 a0; j40 j40; if ((j40 = km.u4.s40(aq0.LI).de0(paramzB0.pF)) == null) { km.u4.lx0(paramzB0.L7, (byte)-1); return; }  this(paramzB0.L7, j40); }  } else { i = paramzB0.L7; Aq aq = paramzB0.ph0; Uc0 uc0 = km.u4.s40(aq0.ss); short[] arrayOfShort = paramzB0.KK; this(i, aq, uc0, arrayOfShort); }  } else { th0 th0; i = paramzB0.L7; Aq aq = paramzB0.ph0; this(i, aq, (short)paramzB0.pF); }  } else { i = paramzB0.L7; Aq aq = paramzB0.ph0; short[] arrayOfShort; (arrayOfShort = new short[6])[0] = 0; (new short[6])[1] = 1; (new short[6])[2] = 2; (new short[6])[3] = 3; (new short[6])[4] = 4; (new short[6])[5] = 5; this(i, aq, km.u4.s40(aq0.LI), arrayOfShort); }  ms0.XK0 = paramzB0.rx0;
/*  4 */     this.D1.Com3(ms0); if (paramInt != -1 && ms0.Eq())
/*  5 */     { si(ms0, Ub());
/*  6 */       this.A5.A3(paramInt, ms0); ((hO)this.A5.Z6(paramInt))
/*  7 */         .ME(-2147483648, -2147483648);
/*  8 */       ((hO)this.A5.Z6(paramInt)).mM(); this.Ot.Af(this); Af(ms0); } else { this
/*  9 */         .Ot
/*    */         
/* 11 */         .si(ms0, this.Ot.Ub());
/* 12 */       this.Ot.Af(ms0); }  } public static void aX(hO paramhO, int paramInt1, int paramInt2) { if (paramhO.Eq()) { gH0 gH0; Qj0 qj0; int j, k = paramInt1 - (j = (qj0 = (gH0 = (gH0)paramhO).LN).xY) / 2; int i; if ((i = paramInt2 - 10 - qj0.HC) < 0) i = 0;  if (k < 0) k = 0;  if (k + j > km.wI0.dG()) km.wI0.dG();  if (i + gH0.LN.HC > km.wI0.k1()) km.wI0.k1();  paramhO
/* 13 */         .SB0(paramInt1, paramInt2); }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void jN(String paramString) {
/*    */     CU(paramString, Aq.ur, null);
/*    */   }
/*    */   
/*    */   public final void CU(String paramString, Aq paramAq, Ku0 paramKu0) {
/*    */     this(paramString, paramAq, -1, paramKu0);
/*    */     zB0 zB0;
/*    */     wV(this);
/*    */   }
/*    */   
/*    */   public final void wV(zB0 paramzB0) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: getfield ph0 : Lf/Aq;
/*    */     //   4: invokevirtual ordinal : ()I
/*    */     //   7: tableswitch default -> 40, 38 -> 82, 39 -> 82, 40 -> 43, 41 -> 43, 42 -> 43
/*    */     //   40: goto -> 98
/*    */     //   43: aload_0
/*    */     //   44: invokevirtual tc : ()Lf/hO;
/*    */     //   47: dup
/*    */     //   48: astore_0
/*    */     //   49: ifnull -> 70
/*    */     //   52: aload_0
/*    */     //   53: getfield Yv0 : Z
/*    */     //   56: ifeq -> 62
/*    */     //   59: goto -> 70
/*    */     //   62: aload_0
/*    */     //   63: aload_1
/*    */     //   64: invokevirtual Lf0 : (Lf/zB0;)V
/*    */     //   67: goto -> 81
/*    */     //   70: getstatic f/km.u4 : Lf/R8;
/*    */     //   73: aload_1
/*    */     //   74: getfield L7 : B
/*    */     //   77: iconst_0
/*    */     //   78: invokevirtual lx0 : (BB)V
/*    */     //   81: return
/*    */     //   82: aload_0
/*    */     //   83: invokevirtual tc : ()Lf/hO;
/*    */     //   86: dup
/*    */     //   87: astore_2
/*    */     //   88: ifnonnull -> 94
/*    */     //   91: goto -> 98
/*    */     //   94: aload_2
/*    */     //   95: invokevirtual EE0 : ()V
/*    */     //   98: aload_1
/*    */     //   99: getfield qw0 : I
/*    */     //   102: dup
/*    */     //   103: istore_2
/*    */     //   104: bipush #-2
/*    */     //   106: if_icmpne -> 115
/*    */     //   109: bipush #-2
/*    */     //   111: istore_2
/*    */     //   112: goto -> 160
/*    */     //   115: getstatic f/km.a3 : Lf/vh0;
/*    */     //   118: dup
/*    */     //   119: astore_3
/*    */     //   120: ifnonnull -> 126
/*    */     //   123: goto -> 160
/*    */     //   126: aload_3
/*    */     //   127: dup
/*    */     //   128: iload_2
/*    */     //   129: invokevirtual Xb : (I)Lf/tc;
/*    */     //   132: astore_3
/*    */     //   133: getfield Ct : Lf/Jo;
/*    */     //   136: dup
/*    */     //   137: astore #4
/*    */     //   139: ifnonnull -> 145
/*    */     //   142: goto -> 160
/*    */     //   145: iload_2
/*    */     //   146: iconst_m1
/*    */     //   147: if_icmpeq -> 154
/*    */     //   150: aload_3
/*    */     //   151: ifnonnull -> 160
/*    */     //   154: aload #4
/*    */     //   156: getfield Jg : I
/*    */     //   159: istore_2
/*    */     //   160: getstatic f/UB0.Kg0 : Lf/Q50;
/*    */     //   163: aload_0
/*    */     //   164: aload_1
/*    */     //   165: iload_2
/*    */     //   166: <illegal opcode> run : (Lf/Qz0;Lf/zB0;I)Ljava/lang/Runnable;
/*    */     //   171: invokevirtual fN : (Ljava/lang/Runnable;)V
/*    */     //   174: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 44
/*    */     //   #2	-> 53
/*    */     //   #3	-> 64
/*    */     //   #4	-> 83
/*    */     //   #5	-> 99
/*    */     //   #6	-> 115
/*    */     //   #7	-> 133
/*    */     //   #8	-> 156
/*    */     //   #9	-> 160
/*    */   }
/*    */   
/*    */   public final void Tj0(byte paramByte1, short paramShort, byte paramByte2, j40 paramj40) {
/*    */     // Byte code:
/*    */     //   0: getstatic f/UB0.Kg0 : Lf/Q50;
/*    */     //   3: aload_0
/*    */     //   4: iload_1
/*    */     //   5: iload_2
/*    */     //   6: iload_3
/*    */     //   7: aload #4
/*    */     //   9: <illegal opcode> run : (Lf/Qz0;BSBLf/j40;)Ljava/lang/Runnable;
/*    */     //   14: invokevirtual fN : (Ljava/lang/Runnable;)V
/*    */     //   17: return
/*    */   }
/*    */   
/*    */   public final boolean xy0() {
/*    */     if (this.D1.Z8 == 0) {
/*    */       boolean bool;
/*    */       if (this.Ot.Ji != null) {
/*    */         bool = true;
/*    */       } else {
/*    */         bool = false;
/*    */       } 
/*    */       if (bool)
/*    */         return true; 
/*    */     } 
/*    */     return true;
/*    */   }
/*    */   
/*    */   public final hO tc() {
/*    */     fQ fQ1;
/*    */     return ((fQ1 = this.D1).Z8 == 0) ? null : (hO)first();
/*    */   }
/*    */   
/*    */   public final void w8(int paramInt, eo parameo) {
/*    */     hO hO;
/*    */     if ((hO = (hO)this.A5.Z6(paramInt)) == null)
/*    */       return; 
/*    */     eo1.getClass();
/*    */     float f2 = parameo.x, f3 = parameo.y, f4 = parameo.z;
/*    */     eo1.TG0(f2, f3, f4);
/*    */     float f1 = ur0.G80;
/*    */     f2 = ur0.Cn0;
/*    */     f3 = ur0.QQ;
/*    */     f4 = ur0.o6;
/*    */     ur0.Xe.Ix0(eo1, f1, f2, f3, f4);
/*    */     eo eo1;
/*    */     int i = (int)(eo1 = rg).x;
/*    */     i = (int)(i + 36.0F);
/*    */     Ur0 ur0;
/*    */     int j = (int)(((int)(ur0 = km.wI0.fi0).ow - (int)eo1.y) + 24.0F);
/*    */     if (Eq()) {
/*    */       SB0(i, j);
/*    */     } else {
/*    */       SB0(km.wI0.k1() / 2 - this.xY / 2, km.wI0.k1() / 2 - this.HC / 2);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void Me(short paramShort) {
/*    */     // Byte code:
/*    */     //   0: getstatic f/UB0.Kg0 : Lf/Q50;
/*    */     //   3: aload_0
/*    */     //   4: iload_1
/*    */     //   5: <illegal opcode> run : (Lf/Qz0;S)Ljava/lang/Runnable;
/*    */     //   10: invokevirtual fN : (Ljava/lang/Runnable;)V
/*    */     //   13: return
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Qz0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */