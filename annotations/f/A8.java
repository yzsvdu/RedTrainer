/*  1 */ package f;public final class A8 extends Wr implements r60 { public final pA cq; public final Ip mg0; public vF0 TK; public vF0 K00; public vF0[] Lh0; public vF0[] nI; public byte Kb; public final boolean i2(oa0 paramoa0) { if (!km.wI0.oq0) {
/*  2 */       return super.i2(paramoa0);
/*    */     }
/*  4 */     if (B8.Wm0(paramoa0.cz0) && paramoa0
/*  5 */       .oO())
/*    */     { dL0 dL0; int i;
/*  7 */       if (h1.J20(i = paramoa0.GG0, BM.N70)) {
/*    */         fH0 fH0;
/*    */         
/* 10 */         short s = (fH0 = km.u4.Lz).aY; if (this.cl == 0 && (i = this.Kb) <= 2 && ++i <= s) { this
/* 11 */             .Kb = (byte)i;
/* 12 */           fH0.aY = (short)(s - 1);
/* 13 */           km.pm0.bL((byte)0, (short)88); this.Kb = 3; if (this.Kb > 3 && this
/* 14 */             .cl == 0) { for (this.cl = 1, this.lx = null, i = 0; i < this.Lp0.length; ) { this.P80[i] = false; i++; }  dL0 = dL0.Ab0; km.u4
/* 15 */               .FL(dL0, this.Kb, (short)0); }
/* 16 */            go0(); }  if (this
/* 17 */           .cl != 0) return true; 
/* 18 */         this.TK
/* 19 */           .TS
/* 20 */           .qt(new U70[] { WB0.QJ0().OL0(this.Kb) }); return true;
/* 21 */       }  if (h1.J20(dL0, BM.lc)) { if (this.Kb == 0 && this.cl == 0) { this.cq.sW(false); km.u4
/* 22 */             .FL(dL0.Ab0, (byte)-1, (short)0); }  }
/* 23 */       else { dL0 dL01; byte b; if (h1.J20(dL0, BM.bC)) { if ((b = this.cl) == 0 && this.Kb > 0) { if (b == 0) { for (this
/* 24 */                 .cl = 1, this.lx = null, b = 0; b < this.Lp0.length; ) { this.P80[b] = false; b++; }  dL01 = dL0.Ab0; km.u4
/* 25 */                 .FL(this, this.Kb, (short)0); }  return true; }  if (((A8)super)
/* 26 */             .lx == null || b != 1)
/*    */           {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */             
/* 49 */             return true; }  b = 0; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{I, dimension=1}, name=null} */ while (b < ((A8)super).Lp0.length) { if (!((A8)super).P80[b]) { int[] arrayOfInt; byte b1; try { short s = 48; ((A8)super).h2[b] = 24 - (((A8)super).lx[b] + 1) * s; /* monitor exit BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{I, dimension=1}, name=null} = FieldReferenceExpression{lastType=ObjectType{I, dimension=1}, expression=SuperExpression{ObjectType{f/dL0}}, name=h2, descriptor=[I}} */ ((A8)super).P80[b] = true; km.pm0.bL((byte)0, (short)24); if (b == ((A8)super).Lp0.length - 1) { ArrayList<Byte> arrayList; this(); s = ((A8)super).Kb; byte[] arrayOfByte = ((A8)super).lx; byte[][] arrayOfByte1; byte b2; for (arrayOfByte1 = new byte[3][3], b2 = 0; b2 < 3; ) { byte b3; if ((b3 = arrayOfByte[b2]) == 0) { arrayOfByte1[b2][0] = FP.Wb0[b2][(FP.Wb0[b2]).length - 1]; } else { arrayOfByte1[b2][0] = FP.Wb0[b2][b3 - 1]; }  byte[] arrayOfByte2, arrayOfByte3; (arrayOfByte2 = arrayOfByte1[b2])[1] = (arrayOfByte3 = FP.Wb0[b2])[arrayOfByte[b2]]; byte b4; if ((b4 = arrayOfByte[b2]) == arrayOfByte3.length - 1) { arrayOfByte2[2] = arrayOfByte3[0]; } else { arrayOfByte2[2] = arrayOfByte3[b4 + 1]; }  b2++; }  short s1 = 0; b2 = arrayOfByte1[1][1]; s1 = (short)(FP.vR(arrayOfByte1[0][1], b2, arrayOfByte1[2][1]) + s1); if (s > 0 && FP.vR(arrayOfByte1[0][1], b2, arrayOfByte1[2][1]) > 0) arrayList.add(Byte.valueOf((byte)0));  if (s > 1) { b2 = arrayOfByte1[1][0]; s1 = (short)(s1 + FP.vR(arrayOfByte1[0][0], b2, arrayOfByte1[2][0])); if (FP.vR(arrayOfByte1[0][0], b2, arrayOfByte1[2][0]) > 0) arrayList.add(Byte.valueOf((byte)1));  b2 = arrayOfByte1[1][2]; s1 = (short)(s1 + FP.vR(arrayOfByte1[0][2], b2, arrayOfByte1[2][2])); if (FP.vR(arrayOfByte1[0][2], b2, arrayOfByte1[2][2]) > 0) arrayList.add(Byte.valueOf((byte)2));  }  if (s > 2) { s = arrayOfByte1[1][1]; s = (short)(s1 + FP.vR(arrayOfByte1[0][0], s, arrayOfByte1[2][2])); if (FP.vR(arrayOfByte1[0][0], s, arrayOfByte1[2][2]) > 0) arrayList.add(Byte.valueOf((byte)3));  s1 = arrayOfByte1[1][1]; s1 = (short)(s + FP.vR(arrayOfByte1[0][2], s1, arrayOfByte1[2][0])); if (FP.vR(arrayOfByte1[0][2], s1, arrayOfByte1[2][0]) > 0) arrayList.add(Byte.valueOf((byte)4));  }  if (s1 > 0) { JD jD; ((A8)super).cl = 2; km.pm0.Yt0((byte)0, (short)269); ((A8)super).kd0 = s1; super.wA(); ((A8)super).Kb = 0; ((A8)super).TK.TS.qt(new U70[] { WB0.QJ0().OL0(((A8)super).Kb) }); boolean bool1 = arrayList.contains(Byte.valueOf((byte)0)), bool2 = arrayList.contains(Byte.valueOf((byte)1)), bool3 = arrayList.contains(Byte.valueOf((byte)2)), bool4 = arrayList.contains(Byte.valueOf((byte)3)), bool5 = arrayList.contains(Byte.valueOf((byte)4)); ((A8)super).K00.TS.qt(new U70[] { WB0.QJ0().UK0(bool1, bool2, bool3, bool4, bool5) }); ((A8)super).K00.wI0(true); this((A8)this); HC.k6().S(jD, 2.5F); } else { super.hh(); }  }  return true; } finally { dL01 = null; /* monitor exit ClassFileLocalVariableReferenceExpression{type=PrimitiveType{primitive=maybe_byte}, name=null} */ }  }  b++; }  return true; }  if (b == 66 && ((A8)super).Kb == 3) ((A8)super).Kb = -1;  }  }  return false; }
/*    */ 
/*    */   
/*    */   public short kd0;
/*    */   public vF0[][] Lp0;
/*    */   public int[] h2;
/*    */   public boolean[] P80;
/*    */   public long ov0;
/*    */   public byte[] lx;
/*    */   public byte cl;
/*    */   
/*    */   public A8(pA parampA) {
/*    */     pRn pRn;
/*    */     vF0 vF01;
/*    */     this.Kb = 0;
/*    */     this.kd0 = 0;
/*    */     this.Lp0 = new vF0[3][];
/*    */     this.h2 = new int[] { -750, -750, -750 };
/*    */     this.P80 = new boolean[] { true, true, true };
/*    */     this.lx = null;
/*    */     this.cl = 0;
/*    */     this.cq = parampA;
/*    */     TG0(new s2(this, parampA));
/*    */     this((byte)-1, (byte)-1, (byte)-1, (byte)-1);
/*    */     Vo0(new I(this, pRn));
/*    */     Xu("base-frame");
/*    */     Lo(Ml0.OH0(1935));
/*    */     this.mg0 = new Ip();
/*    */     vF0[][] arrayOfVF01;
/*    */     for (byte b2 = 0; b2 < (arrayOfVF01 = this.Lp0).length; b2++) {
/*    */       arrayOfVF01[b2] = new vF0[(FP.Wb0[b2]).length];
/*    */       byte[][] arrayOfByte;
/*    */       for (byte b = 0; b < ((arrayOfByte = FP.Wb0)[b2]).length; b++) {
/*    */         vF0 vF02;
/*    */         this(64, 64);
/*    */         this.Lp0[b2][b] = vF02;
/*    */         this.Lp0[b2][b].ZH0().sm(new zh0[] { WB0.QJ0().wE0(arrayOfByte[b2][b]) });
/*    */         this.Lp0[b2][b].ZH0().tL(64, 64);
/*    */         this.mg0.J8(this.Lp0[b2][b]);
/*    */       } 
/*    */     } 
/*    */     this.Kb = 0;
/*    */     this(425, 300);
/*    */     this.TK = new vF0();
/*    */     vF01.ZH0().qt(new U70[] { WB0.QJ0().OL0(this.Kb) });
/*    */     this.TK.ZH0().zT(-52, -52);
/*    */     this.TK.ZH0().tL(512, 512);
/*    */     this.mg0.J8(this.TK);
/*    */     this(425, 300);
/*    */     this.K00 = new vF0();
/*    */     vF01.ZH0().qt(new U70[] { WB0.QJ0().UK0(false, false, false, false, false) });
/*    */     this.K00.ZH0().zT(-52, -52);
/*    */     this.K00.ZH0().tL(512, 512);
/*    */     this.K00.wI0(false);
/*    */     this.mg0.J8(this.K00);
/*    */     this.Lh0 = new vF0[4];
/*    */     byte b1;
/*    */     vF0[] arrayOfVF0;
/*    */     for (b1 = 0; b1 < (arrayOfVF0 = this.Lh0).length; b1++) {
/*    */       vF0 vF02;
/*    */       this(48, 48);
/*    */       arrayOfVF0[b1] = vF02;
/*    */       this.Lh0[b1].ZH0().tL(16, 32);
/*    */       this.mg0.J8(this.Lh0[b1]);
/*    */     } 
/*    */     this.nI = new vF0[4];
/*    */     for (b1 = 0; b1 < (arrayOfVF0 = this.nI).length; b1++) {
/*    */       vF0 vF02;
/*    */       this(48, 48);
/*    */       arrayOfVF0[b1] = vF02;
/*    */       this.nI[b1].ZH0().sm(new zh0[] { WB0.QJ0().Q() });
/*    */       this.nI[b1].ZH0().tL(16, 32);
/*    */       this.mg0.J8(this.nI[b1]);
/*    */     } 
/*    */     go0();
/*    */     J8(this.mg0);
/*    */   }
/*    */   
/*    */   public final void hh() {
/*    */     if (this.kd0 > 0) {
/*    */       eY eY;
/*    */       this.cl = 3;
/*    */       this.K00.wI0(true);
/*    */       fH0 fH0;
/*    */       if ((fH0.aY = (short)((fH0 = km.u4.Lz).aY + 1)) > 9999)
/*    */         fH0.aY = 9999; 
/*    */       this.kd0 = (short)(this.kd0 - 1);
/*    */       go0();
/*    */       wA();
/*    */       this(this);
/*    */       HC.k6().S(eY, 0.02F);
/*    */     } else {
/*    */       this.cl = 0;
/*    */       this.Kb = 0;
/*    */       vF0 vF01;
/*    */       if ((vF01 = this.K00).dP)
/*    */         vF01.wI0(false); 
/*    */       if (!(vF01 = this.TK).dP)
/*    */         vF01.wI0(true); 
/*    */       this.TK.TS.qt(new U70[] { WB0.QJ0().OL0(this.Kb) });
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void V90(throws paramthrows) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield cl : B
/*    */     //   4: iconst_2
/*    */     //   5: if_icmpne -> 65
/*    */     //   8: invokestatic currentTimeMillis : ()J
/*    */     //   11: aload_0
/*    */     //   12: getfield ov0 : J
/*    */     //   15: lsub
/*    */     //   16: ldc2_w 250
/*    */     //   19: lcmp
/*    */     //   20: ifle -> 65
/*    */     //   23: aload_0
/*    */     //   24: getfield K00 : Lf/vF0;
/*    */     //   27: dup
/*    */     //   28: astore_2
/*    */     //   29: ifnull -> 65
/*    */     //   32: aload_0
/*    */     //   33: dup
/*    */     //   34: aload_2
/*    */     //   35: dup
/*    */     //   36: getfield dP : Z
/*    */     //   39: iconst_1
/*    */     //   40: ixor
/*    */     //   41: invokevirtual wI0 : (Z)V
/*    */     //   44: getfield TK : Lf/vF0;
/*    */     //   47: aload_0
/*    */     //   48: getfield K00 : Lf/vF0;
/*    */     //   51: getfield dP : Z
/*    */     //   54: iconst_1
/*    */     //   55: ixor
/*    */     //   56: invokevirtual wI0 : (Z)V
/*    */     //   59: invokestatic currentTimeMillis : ()J
/*    */     //   62: putfield ov0 : J
/*    */     //   65: aload_0
/*    */     //   66: getfield h2 : [I
/*    */     //   69: dup
/*    */     //   70: astore_2
/*    */     //   71: monitorenter
/*    */     //   72: iconst_0
/*    */     //   73: istore_3
/*    */     //   74: iload_3
/*    */     //   75: aload_0
/*    */     //   76: getfield Lp0 : [[Lf/vF0;
/*    */     //   79: arraylength
/*    */     //   80: if_icmpge -> 134
/*    */     //   83: aload_0
/*    */     //   84: getfield P80 : [Z
/*    */     //   87: iload_3
/*    */     //   88: baload
/*    */     //   89: ifne -> 128
/*    */     //   92: aload_0
/*    */     //   93: getfield h2 : [I
/*    */     //   96: dup
/*    */     //   97: astore #4
/*    */     //   99: iload_3
/*    */     //   100: iaload
/*    */     //   101: bipush #16
/*    */     //   103: iadd
/*    */     //   104: dup
/*    */     //   105: istore #5
/*    */     //   107: aload #4
/*    */     //   109: iload_3
/*    */     //   110: iload #5
/*    */     //   112: iastore
/*    */     //   113: ifle -> 123
/*    */     //   116: aload #4
/*    */     //   118: iload_3
/*    */     //   119: sipush #-980
/*    */     //   122: iastore
/*    */     //   123: aload_0
/*    */     //   124: iload_3
/*    */     //   125: invokevirtual CM : (I)V
/*    */     //   128: iinc #3, 1
/*    */     //   131: goto -> 74
/*    */     //   134: aload_0
/*    */     //   135: aload_1
/*    */     //   136: aload_2
/*    */     //   137: monitorexit
/*    */     //   138: invokespecial V90 : (Lf/throws;)V
/*    */     //   141: return
/*    */     //   142: aload_2
/*    */     //   143: monitorexit
/*    */     //   144: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 36
/*    */     //   #2	-> 41
/*    */     //   #3	-> 51
/*    */     //   #4	-> 56
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   74	80	142	finally
/*    */     //   83	89	142	finally
/*    */     //   92	96	142	finally
/*    */     //   99	101	142	finally
/*    */     //   107	113	142	finally
/*    */     //   116	128	142	finally
/*    */     //   134	138	142	finally
/*    */     //   142	144	142	finally
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     Tm(483, 327);
/*    */     this.mg0.mM();
/*    */     vF0 vF01;
/*    */     if ((vF01 = this.TK) != null)
/*    */       vF01.ME(this.Kd + 64 + -10, this.er0 + 64 + -7); 
/*    */     if ((vF01 = this.K00) != null)
/*    */       vF01.ME(this.Kd + 64 + -10, this.er0 + 64 + -7); 
/*    */     byte b;
/*    */     for (b = 0; b < 4; ) {
/*    */       int i = this.Kd + 174;
/*    */       this.Lh0[b].ME(b * 14 + i - 10, this.er0 + 56 + -7);
/*    */       b++;
/*    */     } 
/*    */     for (b = 0; b < 4; ) {
/*    */       int i = this.Kd + 270;
/*    */       this.nI[b].ME(b * 14 + i - 10, this.er0 + 56 + -7);
/*    */       b++;
/*    */     } 
/*    */     CM(0);
/*    */     CM(1);
/*    */     CM(2);
/*    */     super.d40();
/*    */   }
/*    */   
/*    */   public final void CM(int paramInt) {
/*    */     vF0[] arrayOfVF0;
/*    */     for (byte b = 0; b < (arrayOfVF0 = this.Lp0[paramInt]).length; ) {
/*    */       int i = this.Kd + 140;
/*    */       i = paramInt * 80 + i + -10;
/*    */       int j = this.er0 + 188 + this.h2[paramInt];
/*    */       arrayOfVF0[b].ME(i, b * 48 + j + -7);
/*    */       vF0 vF01;
/*    */       int k;
/*    */       if ((j = (vF01 = this.Lp0[paramInt][b]).er0) - (k = this.er0) < 50 || j - k > 240) {
/*    */         vF01.wI0(false);
/*    */       } else {
/*    */         vF01.wI0(true);
/*    */       } 
/*    */       b++;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void go0() {
/*    */     short s;
/*    */     if ((s = km.u4.Lz.aY) > 9999)
/*    */       s = 9999; 
/*    */     int i, j, k, m = s - (i = s / 1000) * 1000 - (j = (s - (i = s / 1000) * 1000) / 100) * 100 - (k = (s - (i = s / 1000) * 1000 - (j = (s - (i = s / 1000) * 1000) / 100) * 100) / 10) * 10;
/*    */     (this.Lh0[0]).TS.sm(new zh0[] { (WB0.QJ0()).GD[i] });
/*    */     (this.Lh0[1]).TS.sm(new zh0[] { (WB0.QJ0()).GD[j] });
/*    */     (this.Lh0[2]).TS.sm(new zh0[] { (WB0.QJ0()).GD[k] });
/*    */     (this.Lh0[3]).TS.sm(new zh0[] { (WB0.QJ0()).GD[m] });
/*    */   }
/*    */   
/*    */   public final void wA() {
/*    */     int i, j, k, m = this.kd0 - (i = this.kd0 / 1000) * 1000 - (j = (this.kd0 - (i = this.kd0 / 1000) * 1000) / 100) * 100 - (k = (this.kd0 - (i = this.kd0 / 1000) * 1000 - (j = (this.kd0 - (i = this.kd0 / 1000) * 1000) / 100) * 100) / 10) * 10;
/*    */     (this.nI[0]).TS.sm(new zh0[] { (WB0.QJ0()).GD[i] });
/*    */     (this.nI[1]).TS.sm(new zh0[] { (WB0.QJ0()).GD[j] });
/*    */     (this.nI[2]).TS.sm(new zh0[] { (WB0.QJ0()).GD[k] });
/*    */     (this.nI[3]).TS.sm(new zh0[] { (WB0.QJ0()).GD[m] });
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/A8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */