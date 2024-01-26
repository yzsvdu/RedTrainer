/*  1 */ package f;public final class XI extends Ij implements r60 { public final byte OB; public Lpt4[] LpT6; public Ip n3; public XI(byte paramByte) { this.OB = paramByte; TG0(this::g40); Xu("seed-plant-dialog"); Lo(Ml0.OH0(8560)); this.n3 = new Ip(); this.Lg = new Un(Ml0.OH0(8561)); this.MI0 = new Un(Ml0.OH0(53)); this.Lg.tW(this::ov); this.MI0.tW(this::g40); Lpt4[] arrayOfLpt4; for (this.LpT6 = new Lpt4[4], paramByte = 0; paramByte < (arrayOfLpt4 = this.LpT6).length; ) { this(this); arrayOfLpt4[paramByte] = lpt4; Lpt4 lpt4; (lpt4 = this.LpT6[paramByte]).bm0(new Z90(this, lpt4, paramByte)); paramByte++; }  (this.ML0 = new Lpt4(this)).lE(12, 10); this.DW = new xo0("\n\n"); this.ML0.wI0(false); this.DW.wI0(false); U90 u90 = this.n3.d7().Aq(15).ee0(this.n3.mE0().Mg((JG0[])this.LpT6)).Aq(15); this.n3
/*  2 */       .WN(R10.aj0(this.n3.mE0(), new JG0[] { this.ML0, this.DW }, u90, 15).ee0(this.n3.d7().Mg(new JG0[] { this.Lg, this.MI0 })).Em0()); this.n3.rK0(this.n3.mE0().ee0(this.n3.d7().Em0().Ya(this.LpT6[0]).Em0().Ya(this.LpT6[1]).Em0().Ya(this.LpT6[2]).Em0().Ya(this.LpT6[3]).Em0()).ee0(this.n3.d7().Em0().Mg(new JG0[] { this.ML0, this.DW }).Em0()).ee0(this.n3.mE0().Ya(this.Lg).Ya(this.MI0))); J8(this.n3); } public Un Lg; public Un MI0; public Lpt4 ML0; public xo0 DW; public final void ov() { zr0 zr0 = km.u4.Fe[1];
/*  3 */     this(); Bn bn; Lpt4[] arrayOfLpt4; int j; byte b; for (j = (arrayOfLpt4 = this.LpT6).length, b = 0; b < j; ) {
/*  4 */       short s; if ((s = (arrayOfLpt4[b]).hC0) >= 1) { s = 1; boolean bool = true;
/*  5 */         int i1 = -i1 - 1; bn.JD[i1] = (byte)(bn.JD[i1] + s); bn.JD[i1] = bool; bn.JO[i1]; if (!((i1 = bn.vA(s)) < 0)) bn.xt0(bn.iO);  }  b++;
/*  6 */     }  int i; if ((i = bn.ir0) < 1)
/*  7 */     { g40(); return; }  j = 1; short[] arrayOfShort1, arrayOfShort2; byte[] arrayOfByte; int m, n;
/*  8 */     for (arrayOfShort1 = new short[i], arrayOfByte = bn.JO, m = (arrayOfShort2 = bn.x20).length, n = 0; m-- > 0;) { if (arrayOfByte[m] == 1) { int i1 = n + 1; arrayOfShort1[n] = arrayOfShort2[m]; n = i1; }  }  int k; for (k = 0; k < i; )
/*  9 */     { short s; m = (short)(bn.K80(s = arrayOfShort1[k]) * 2);
/* 10 */       if (!zr0.vH0((byte)-1, s, m)) j = 0;  k++; }  if (j != 0) { Xe0 xe0; AD0 aD0; i = 2499;
/*    */       short[] arrayOfShort;
/* 12 */       for (arrayOfShort1 = new short[j = bn.ir0], arrayOfByte = bn.JO, m = (arrayOfShort = bn.x20).length, n = 0; m-- > 0;) { if (arrayOfByte[m] == 1) { int i1 = n + 1; arrayOfShort1[n] = arrayOfShort[m]; n = i1; }  }  for (byte b1 = 0; b1 < j; ) {
/* 13 */         short s1; int i1; if ((i1 = zr0.jW(s1 = arrayOfShort1[b1]) / bn.K80(s1)) < i) i = (short)i1;  b1++;
/* 14 */       }  short s; if ((s = this.ML0.hC0) < 1) {
/* 15 */         str = "???";
/*    */       } else {
/*    */         
/* 18 */         str = Ml0.OH0((Of.eH.On0(str)).Iu);
/* 19 */       }  String str = Ml0.Go(8563, str); this(this); this(str, i, xe0, this);
/* 20 */       js.vu0
/*    */         
/* 22 */         .si(aD0, js.vu0.Ub()); }
/* 23 */     else { R8 r8 = km.u4; byte b1 = this.OB; i = 1;
/* 24 */       i = 1; short[] arrayOfShort3; (arrayOfShort3 = new short[10])[0] = i; Lpt4[] arrayOfLpt41;
/*    */       byte b2;
/* 26 */       for (k = (arrayOfLpt41 = this.LpT6).length, b2 = 0; b2 < k; )
/* 27 */       { if ((m = (arrayOfLpt41[b2]).hC0) >= 1) { if ((n = i + 1) > arrayOfShort3.length)
/* 28 */           { arrayOfShort3 = new short[Math.max(arrayOfShort3.length << 1, n)]; int i1 = arrayOfShort3.length; System.arraycopy(arrayOfShort3, 0, arrayOfShort3, 0, i1); }  arrayOfShort3[i] = m;
/* 29 */           i = n; }  b2++; }  boolean bool = false;
/* 30 */       short[] arrayOfShort4 = new short[i]; if (i != 0) if (i > 0) {
/* 31 */           System.arraycopy(arrayOfShort3, bool, arrayOfShort4, 0, i);
/*    */         }
/*    */         else {
/*    */           
/* 35 */           throw new ArrayIndexOutOfBoundsException(bool);
/*    */         }  
/*    */       byte[] arrayOfByte1;
/*    */       for (ShortBuffer shortBuffer = ByteBuffer.wrap(arrayOfByte1 = new byte[i * 2]).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer(); b2 < i; ) {
/*    */         shortBuffer.put(arrayOfShort4[b2]);
/*    */         b2++;
/*    */       } 
/*    */       r8.N7(b1, arrayOfByte1);
/*    */       ra0(); }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void g40() {
/*    */     km.u4.lx0(this.OB, (byte)0);
/*    */     ra0();
/*    */   }
/*    */   
/*    */   public final void IG0() {
/*    */     VA0.c90(this.LpT6[0]);
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     super.d40();
/*    */     mM();
/*    */     qB0(et.Wi0);
/*    */   }
/*    */   
/*    */   public final boolean i2(oa0 paramoa0) {
/*    */     Runnable runnable;
/*    */     if (B8.Wm0(paramoa0.cz0) && paramoa0.oO()) {
/*    */       for (byte b = 0; b < this.LpT6.length; ) {
/*    */         if (h1.J20(paramoa0.GG0, BM.bC) && this.LpT6[b].p3()) {
/*    */           if ((runnable = (this.LpT6[b]).Tw0) != null)
/*    */             run(); 
/*    */           return true;
/*    */         } 
/*    */         b++;
/*    */       } 
/*    */       BM bM;
/*    */       if (h1.J20(paramoa0.GG0, bM = BM.bC) && ((XI)super).Lg.p3()) {
/*    */         hm.Fz0(((XI)super).Lg.TG0.oh0);
/*    */         return true;
/*    */       } 
/*    */       if (h1.J20(paramoa0.GG0, BM.lc) || (h1.J20(paramoa0.GG0, bM) && ((XI)super).MI0.p3())) {
/*    */         hm.Fz0(((XI)super).MI0.TG0.oh0);
/*    */         return true;
/*    */       } 
/*    */       if (h1.J20(paramoa0.GG0, BM.ni) || h1.J20(paramoa0.GG0, BM.Oq)) {
/*    */         q0();
/*    */         if (((XI)super).ML0.p3())
/*    */           q0(); 
/*    */         return true;
/*    */       } 
/*    */       if (h1.J20(paramoa0.GG0, BM.N70) || h1.J20(paramoa0.GG0, BM.M8)) {
/*    */         oZ();
/*    */         if (((XI)super).ML0.p3())
/*    */           oZ(); 
/*    */         return true;
/*    */       } 
/*    */     } 
/*    */     return super.i2(paramoa0);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/XI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */