/*  1 */ package f;public final class sx0 extends me { public final void Ic0(float paramFloat) { for (byte b = 0; b < Zo0.length; )
/*  2 */     { q q1; Matrix4 matrix4 = (q1 = this.Gk0[b]).yY.mh; matrix4.on0(eo1); float f1; eo eo1, eo2; float f2; if ((f1 = (eo1 = jr).z) < (f2 = (eo2 = q1.E50).z))
/*  3 */       { eo1
/*  4 */           .z = f1; if ((f1 = UB0.M60.Qy * 0.5F + f1) >= (f1 = eo2.z)) { eo1.z = f1; q1.yY.f2.hm.lV = 1; q1.u00.ZP(q1.Wk.Ka(), q1.Wk.hA0() + 1); }  } else if (f1 > f2)
/*  5 */       { eo1
/*  6 */           .z = f1; if ((f1 -= UB0.M60.Qy * 0.5F) <= (f1 = eo2.z)) { eo1.z = f1; q1.yY.f2.hm.lV = 1; q1.u00.ZP(q1.Wk.Ka(), q1.Wk.hA0() - 1); }  } else if ((f1 = eo1.x) < (f2 = eo2.x))
/*  7 */       { eo1
/*  8 */           .x = f1; if ((f1 = UB0.M60.Qy * 0.5F + f1) >= (f1 = eo2.x)) { eo1.x = f1; q1.yY.f2.hm.lV = 1; q1.u00.ZP(q1.Wk.Ka() + 1, q1.Wk.hA0()); }  } else if (f1 > f2)
/*  9 */       { eo1
/* 10 */           .x = f1; if ((f1 -= UB0.M60.Qy * 0.5F) <= (f1 = eo2.x)) { eo1.x = f1; q1.yY.f2.hm.lV = 1; q1.u00.ZP(q1.Wk.Ka() - 1, q1.Wk.hA0()); }  } else { q1.Z8 = false; }  q1.yY.mh.b8(eo1); b++; }  super
/* 11 */       .Ic0(paramFloat); }
/*    */ 
/*    */   
/*    */   public static final eo jr = new eo();
/*    */   public static final eo Hx = new eo();
/*    */   public static final short[][][] Zo0;
/*    */   public static final byte[] Ey = new byte[] { 0, 0, 0, 0, 1, 0, 0, 0, 0 };
/*    */   public static final byte[] HJ0 = new byte[] { 0, 0, 0, 2, 1, 0, 2, 0, 1 };
/*    */   public static final byte[][] Sy0;
/*    */   public static final short[][] I4;
/*    */   public q[] Gk0;
/*    */   public lpt1[] YP;
/*    */   
/*    */   public sx0(xV paramxV) {
/*    */     super(paramxV);
/*    */     lpt1 lpt11 = zp0.vY().In();
/*    */     lpt1 lpt12 = zp0.vY().FF0();
/*    */     this.Gk0 = new q[Zo0.length];
/*    */     byte b2;
/*    */     for (b2 = 0; b2 < Zo0.length; b2 = (byte)(b2 + 1)) {
/*    */       q q1;
/*    */       lpt1 lpt13;
/*    */       (lpt13 = lpt11.ro0()).Yr0 = false;
/*    */       lpt11.ro0().C50();
/*    */       kc(lpt11.ro0());
/*    */       this(this, b2, lpt13);
/*    */       this.Gk0[b2] = q1;
/*    */       short s;
/*    */       short[][] arrayOfShort1;
/*    */       for (s = 0; s < (arrayOfShort1 = Zo0[b2]).length; s = (byte)(s + 1)) {
/*    */         D8 d8;
/*    */         this(this, this.Gk0[b2], s);
/*    */         s = arrayOfShort1[s][0];
/*    */         paramxV.G1(s, arrayOfShort1[s][1]).wu0(d8);
/*    */       } 
/*    */     } 
/*    */     this.YP = new lpt1[I4.length];
/*    */     short[][] arrayOfShort;
/*    */     for (byte b1 = 0; b1 < (arrayOfShort = I4).length; b1 = (byte)(b1 + 1)) {
/*    */       lpt1 lpt13;
/*    */       (lpt13 = lpt12.ro0()).Yr0 = false;
/*    */       float f1 = arrayOfShort[b1][0] * 0.25F + 0.125F;
/*    */       float f2 = arrayOfShort[b1][1] * 0.25F + 0.125F;
/*    */       (lpt12.ro0()).mh.bb0(f1, 0.1F, f2);
/*    */       lpt12.ro0().C50();
/*    */       kc(lpt12.ro0());
/*    */       this.YP[b1] = lpt13;
/*    */     } 
/*    */   }
/*    */   
/*    */   static {
/*    */     byte[] arrayOfByte;
/*    */     (arrayOfByte = new byte[2])[0] = 8;
/*    */     (new byte[2])[1] = 4;
/*    */     (new byte[9][])[0] = arrayOfByte;
/*    */     (arrayOfByte = new byte[3])[0] = 1;
/*    */     (new byte[3])[1] = 3;
/*    */     (new byte[3])[2] = 2;
/*    */     (new byte[9][])[1] = arrayOfByte;
/*    */     (arrayOfByte = new byte[2])[0] = 1;
/*    */     (new byte[2])[1] = 2;
/*    */     (new byte[9][])[2] = arrayOfByte;
/*    */     (arrayOfByte = new byte[4])[0] = 8;
/*    */     (new byte[4])[1] = 12;
/*    */     (new byte[4])[2] = 12;
/*    */     (new byte[4])[3] = 4;
/*    */     (new byte[9][])[3] = arrayOfByte;
/*    */     (arrayOfByte = new byte[4])[0] = 9;
/*    */     (new byte[4])[1] = 5;
/*    */     (new byte[4])[2] = 10;
/*    */     (new byte[4])[3] = 6;
/*    */     (new byte[9][])[4] = arrayOfByte;
/*    */     (arrayOfByte = new byte[3])[0] = 1;
/*    */     (new byte[3])[1] = 10;
/*    */     (new byte[3])[2] = 4;
/*    */     (new byte[9][])[5] = arrayOfByte;
/*    */     (arrayOfByte = new byte[3])[0] = 20;
/*    */     (new byte[3])[1] = 25;
/*    */     (new byte[3])[2] = 2;
/*    */     (new byte[9][])[6] = arrayOfByte;
/*    */     (arrayOfByte = new byte[3])[0] = 8;
/*    */     (new byte[3])[1] = 12;
/*    */     (new byte[3])[2] = 4;
/*    */     (new byte[9][])[7] = arrayOfByte;
/*    */     (arrayOfByte = new byte[2])[0] = 1;
/*    */     (new byte[2])[1] = 2;
/*    */     Sy0 = new byte[][] { null, null, null, null, null, null, null, null, arrayOfByte };
/*    */     short[] arrayOfShort1;
/*    */     (arrayOfShort1 = new short[2])[0] = 20;
/*    */     (new short[2])[1] = 26;
/*    */     (new short[11][])[0] = arrayOfShort1;
/*    */     (arrayOfShort1 = new short[2])[0] = 3;
/*    */     (new short[2])[1] = 21;
/*    */     (new short[11][])[1] = arrayOfShort1;
/*    */     (arrayOfShort1 = new short[2])[0] = 8;
/*    */     (new short[2])[1] = 14;
/*    */     (new short[11][])[2] = arrayOfShort1;
/*    */     (arrayOfShort1 = new short[2])[0] = 8;
/*    */     (new short[2])[1] = 12;
/*    */     (new short[11][])[3] = arrayOfShort1;
/*    */     (arrayOfShort1 = new short[2])[0] = 8;
/*    */     (new short[2])[1] = 10;
/*    */     (new short[11][])[4] = arrayOfShort1;
/*    */     (arrayOfShort1 = new short[2])[0] = 12;
/*    */     (new short[2])[1] = 7;
/*    */     (new short[11][])[5] = arrayOfShort1;
/*    */     (arrayOfShort1 = new short[2])[0] = 20;
/*    */     (new short[2])[1] = 11;
/*    */     (new short[11][])[6] = arrayOfShort1;
/*    */     (arrayOfShort1 = new short[2])[0] = 19;
/*    */     (new short[2])[1] = 10;
/*    */     (new short[11][])[7] = arrayOfShort1;
/*    */     (arrayOfShort1 = new short[2])[0] = 22;
/*    */     (new short[2])[1] = 7;
/*    */     (new short[11][])[8] = arrayOfShort1;
/*    */     (arrayOfShort1 = new short[2])[0] = 12;
/*    */     (new short[2])[1] = 10;
/*    */     (new short[11][])[9] = arrayOfShort1;
/*    */     (arrayOfShort1 = new short[2])[0] = 23;
/*    */     (new short[2])[1] = 28;
/*    */     I4 = new short[][] { 
/*    */         null, null, null, null, null, null, null, null, null, null, 
/*    */         arrayOfShort1 };
/*    */   }
/*    */   
/*    */   public final void ZP(int paramInt1, int paramInt2) {
/*    */     short[][] arrayOfShort;
/*    */     for (byte b = 0; b < (arrayOfShort = I4).length; ) {
/*    */       Jr jr;
/*    */       lpt1 lpt12 = this.YP[b];
/*    */       short[] arrayOfShort1;
/*    */       if ((arrayOfShort1 = arrayOfShort[b])[0] != paramInt1 || arrayOfShort1[1] != paramInt2 || !this.UH.Ct(lpt12, true)) {
/*    */         b = (byte)(b + 1);
/*    */         continue;
/*    */       } 
/*    */       eo eo1;
/*    */       (this.YP[b]).mh.on0(eo1 = Hx);
/*    */       zp0 zp0;
/*    */       if ((zp0 = zp0.vY()).cOM5 == null) {
/*    */         eI eI = eI.Lj();
/*    */         int[] arrayOfInt;
/*    */         (arrayOfInt = new int[2])[0] = 168;
/*    */         (new int[2])[1] = 190;
/*    */         eI.getClass();
/*    */         lpt1 lpt13 = eI.L4(zp0.A6[3], 112, arrayOfInt);
/*    */         zp0.DW.Com3(lpt13.qY);
/*    */       } 
/*    */       lpt11.mh.b8(eo1);
/*    */       lpt11.C50();
/*    */       this.UH.Com3(lpt11);
/*    */       this(this, lpt11);
/*    */       lpt1 lpt11;
/*    */       (lpt11 = zp0.cOM5.ro0()).co0("gym07_woodbox", false, jr);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void Ad0(short[] paramArrayOfshort) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: arraylength
/*    */     //   2: iconst_1
/*    */     //   3: if_icmpge -> 7
/*    */     //   6: return
/*    */     //   7: aload_1
/*    */     //   8: iconst_0
/*    */     //   9: saload
/*    */     //   10: dup
/*    */     //   11: istore_2
/*    */     //   12: sipush #4468
/*    */     //   15: if_icmpeq -> 51
/*    */     //   18: iload_2
/*    */     //   19: sipush #4471
/*    */     //   22: if_icmpeq -> 28
/*    */     //   25: goto -> 72
/*    */     //   28: aload_0
/*    */     //   29: aload_1
/*    */     //   30: dup
/*    */     //   31: iconst_1
/*    */     //   32: saload
/*    */     //   33: istore_0
/*    */     //   34: iconst_2
/*    */     //   35: saload
/*    */     //   36: istore_1
/*    */     //   37: getfield Gk0 : [Lf/q;
/*    */     //   40: iload_0
/*    */     //   41: aaload
/*    */     //   42: iload_1
/*    */     //   43: i2b
/*    */     //   44: iconst_0
/*    */     //   45: invokevirtual ng0 : (BZ)V
/*    */     //   48: goto -> 72
/*    */     //   51: aload_0
/*    */     //   52: dup
/*    */     //   53: aload_1
/*    */     //   54: iconst_1
/*    */     //   55: saload
/*    */     //   56: istore_0
/*    */     //   57: getfield YP : [Lf/lpt1;
/*    */     //   60: iload_0
/*    */     //   61: aaload
/*    */     //   62: astore_0
/*    */     //   63: getfield UH : Lf/fQ;
/*    */     //   66: aload_0
/*    */     //   67: iconst_1
/*    */     //   68: invokevirtual Ct : (Ljava/lang/Object;Z)Z
/*    */     //   71: pop
/*    */     //   72: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 63
/*    */   }
/*    */   
/*    */   static {
/*    */     short[] arrayOfShort2;
/*    */     (arrayOfShort2 = new short[2])[0] = 15;
/*    */     (new short[2])[1] = 26;
/*    */     short[][] arrayOfShort;
/*    */     (arrayOfShort = new short[2][])[0] = arrayOfShort2;
/*    */     (arrayOfShort2 = new short[2])[0] = 19;
/*    */     (new short[2])[1] = 26;
/*    */     (new short[2][])[1] = arrayOfShort2;
/*    */     (new short[9][][])[0] = arrayOfShort;
/*    */     (arrayOfShort2 = new short[2])[0] = 21;
/*    */     (new short[2])[1] = 24;
/*    */     (arrayOfShort = new short[3][])[0] = arrayOfShort2;
/*    */     (arrayOfShort2 = new short[2])[0] = 21;
/*    */     (new short[2])[1] = 20;
/*    */     (new short[3][])[1] = arrayOfShort2;
/*    */     (arrayOfShort2 = new short[2])[0] = 21;
/*    */     (new short[2])[1] = 16;
/*    */     (new short[3][])[2] = arrayOfShort2;
/*    */     (new short[9][][])[1] = arrayOfShort;
/*    */     (arrayOfShort2 = new short[2])[0] = 20;
/*    */     (new short[2])[1] = 17;
/*    */     (arrayOfShort = new short[2][])[0] = arrayOfShort2;
/*    */     (arrayOfShort2 = new short[2])[0] = 20;
/*    */     (new short[2])[1] = 12;
/*    */     (new short[2][])[1] = arrayOfShort2;
/*    */     (new short[9][][])[2] = arrayOfShort;
/*    */     (arrayOfShort2 = new short[2])[0] = 9;
/*    */     (new short[2])[1] = 10;
/*    */     (arrayOfShort = new short[4][])[0] = arrayOfShort2;
/*    */     (arrayOfShort2 = new short[2])[0] = 13;
/*    */     (new short[2])[1] = 10;
/*    */     (new short[4][])[1] = arrayOfShort2;
/*    */     (arrayOfShort2 = new short[2])[0] = 16;
/*    */     (new short[2])[1] = 10;
/*    */     (new short[4][])[2] = arrayOfShort2;
/*    */     (arrayOfShort2 = new short[2])[0] = 18;
/*    */     (new short[2])[1] = 10;
/*    */     (new short[4][])[3] = arrayOfShort2;
/*    */     (new short[9][][])[3] = arrayOfShort;
/*    */     (arrayOfShort2 = new short[2])[0] = 3;
/*    */     (new short[2])[1] = 20;
/*    */     (arrayOfShort = new short[4][])[0] = arrayOfShort2;
/*    */     (arrayOfShort2 = new short[2])[0] = 8;
/*    */     (new short[2])[1] = 20;
/*    */     (new short[4][])[1] = arrayOfShort2;
/*    */     (arrayOfShort2 = new short[2])[0] = 3;
/*    */     (new short[2])[1] = 17;
/*    */     (new short[4][])[2] = arrayOfShort2;
/*    */     (arrayOfShort2 = new short[2])[0] = 8;
/*    */     (new short[2])[1] = 17;
/*    */     (new short[4][])[3] = arrayOfShort2;
/*    */     (new short[9][][])[4] = arrayOfShort;
/*    */     (arrayOfShort2 = new short[2])[0] = 4;
/*    */     (new short[2])[1] = 22;
/*    */     (arrayOfShort = new short[3][])[0] = arrayOfShort2;
/*    */     (arrayOfShort2 = new short[2])[0] = 4;
/*    */     (new short[2])[1] = 12;
/*    */     (new short[3][])[1] = arrayOfShort2;
/*    */     (arrayOfShort2 = new short[2])[0] = 7;
/*    */     (new short[2])[1] = 12;
/*    */     (new short[3][])[2] = arrayOfShort2;
/*    */     (new short[9][][])[5] = arrayOfShort;
/*    */     (arrayOfShort2 = new short[2])[0] = 7;
/*    */     (new short[2])[1] = 14;
/*    */     (arrayOfShort = new short[3][])[0] = arrayOfShort2;
/*    */     (arrayOfShort2 = new short[2])[0] = 3;
/*    */     (new short[2])[1] = 14;
/*    */     (new short[3][])[1] = arrayOfShort2;
/*    */     (arrayOfShort2 = new short[2])[0] = 3;
/*    */     (new short[2])[1] = 10;
/*    */     (new short[3][])[2] = arrayOfShort2;
/*    */     (new short[9][][])[6] = arrayOfShort;
/*    */     (arrayOfShort2 = new short[2])[0] = 8;
/*    */     (new short[2])[1] = 7;
/*    */     (arrayOfShort = new short[3][])[0] = arrayOfShort2;
/*    */     (arrayOfShort2 = new short[2])[0] = 11;
/*    */     (new short[2])[1] = 7;
/*    */     (new short[3][])[1] = arrayOfShort2;
/*    */     (arrayOfShort2 = new short[2])[0] = 21;
/*    */     (new short[2])[1] = 7;
/*    */     (new short[3][])[2] = arrayOfShort2;
/*    */     (new short[9][][])[7] = arrayOfShort;
/*    */     (arrayOfShort2 = new short[2])[0] = 23;
/*    */     (new short[2])[1] = 27;
/*    */     (arrayOfShort = new short[2][])[0] = arrayOfShort2;
/*    */     (arrayOfShort2 = new short[2])[0] = 23;
/*    */     (new short[2])[1] = 11;
/*    */     (new short[2][])[1] = arrayOfShort2;
/*    */     Zo0 = new short[][][] { null, null, null, null, null, null, null, null, arrayOfShort };
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/sx0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */