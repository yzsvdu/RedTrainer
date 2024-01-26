/*  1 */ package f;public final class Ea0 extends Ij implements r60 { public static final short[] S50 = new short[] { 5249, 5243, 5242, 5239, 5246, 5241, 5245, 5237, 5244, 5248, 5222, 5238, 5247, 5250, 5240, 5233, 5251 }; public static final short[] UA = new short[] { 5548, 5549, 5550, 5551, 5552, 5553, 5554, 5555, 5556, 5557, 5558, 5559, 5560, 5561, 5562, 5563, 5564 }; public ju0 Iz; public ju0 d50; public Ip AZ; public Ea0(Y paramY, int paramInt) { ju0 ju02; short s2; this.g50 = 0; TG0(this::ra0); this.LPt7 = paramInt; if (km.XU()) { Xu("mysterious-gem"); } else { Xu("seed-plant-dialog"); Lo(Ml0.OH0(101114)); }  this.AZ = new Ip(); this.Qv0 = new Un(Ml0.OH0(8574)); this.om0 = new Un(Ml0.OH0(53)); this.Qv0.tW(this::Wm); this.om0.tW(Ea0::pF0); this(this); this.Iz = new ju0(); short s1 = paramY.r00(); if (paramY.oD0() > 999) { s2 = 999; } else { s2 = paramY.oD0(); }  ju02.LPt2(paramY.super().eT(), s1, s2); this(this); this.d50 = ju01; ju0 ju01; (ju01 = new ju0()).bm0(this::C7); this.Lh0 = new ju0(this); this.CQ = new xo0("\n\n"); this.Lh0.wI0(false); this.CQ.wI0(false); U90 u90 = ip.d7().Aq(15); u90 = R10.aj0(this.AZ.mE0(), new JG0[] { this.Iz, this.d50 }, u90, 15); Ip ip; (ip = this.AZ)
/*    */ 
/*    */       
/*  4 */       .WN(R10.aj0(this.AZ.mE0(), new JG0[] { this.Lh0, this.CQ }, u90, 15).ee0(this.AZ.d7().Mg(new JG0[] { this.Qv0, this.om0 })).Em0()); this.AZ.rK0(this.AZ.mE0().ee0(this.AZ.d7().Em0().Ya(this.Iz).Em0().Ya(this.d50).Em0()).ee0(this.AZ.d7().Em0().Ya(this.Lh0).Em0().Ya(this.CQ).Em0()).ee0(this.AZ.mE0().Mg(new JG0[] { this.Qv0, this.om0 }))); J8(this.AZ); } public Un Qv0; public Un om0; public ju0 Lh0; public xo0 CQ; public int LPt7; public int g50; private void C7() { if (this.d50.p3()) { B3 b3; ArrayList<Y> arrayList; this(); zr0 zr0 = km.u4.gN(km.u4.jG0); this(); short[] arrayOfShort; byte b1, b2; for (arrayOfShort = S50, b1 = 17, b2 = 0; b2 < b1; ) { Y y; if ((y = zr0.Aq0(arrayOfShort[b2])) != null)
/*  5 */           arrayList.add(y);  b2++; }  Collections.sort(arrayList); for (Y y : arrayList) { vi vi; String str = y.Lh.Sf0 + "x " + y.JG0();
/*    */ 
/*    */         
/*  8 */         U70 u70 = wm0.y0.HR(y.Bp0, false);
/*  9 */         Runnable runnable = () -> this.d50.Tm0(paramY);
/* 10 */         this(str, u70, 3, 3, 24, 24, runnable, false);
/* 11 */         b3.aV.add(vi); }
/* 12 */        Un un = this.Qv0;
/* 13 */       if (b3.aV.size() < 1) b3
/* 14 */           .mD(Ml0.OH0(6007), null);  F7.om(b3, un, this.d50); }  } public final boolean i2(oa0 paramoa0) { Runnable runnable; if (B8.Wm0(paramoa0.cz0) && paramoa0.oO()) { BM bM; if (h1.J20(paramoa0.GG0, bM = BM.bC) && this.d50.p3()) { if ((runnable = this.d50.Tw0) != null) run();  return true; }  if (h1.J20(paramoa0.GG0, bM) && ((Ea0)super).Qv0.p3()) { hm.Fz0(((Ea0)super).Qv0.TG0.oh0); return true; }  if (h1.J20(paramoa0.GG0, BM.lc) || (
/*    */         
/* 16 */         h1.J20(paramoa0.GG0, bM) && ((Ea0)super).om0.p3()))
/*    */       
/*    */       { 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 27 */         hm.Fz0(((Ea0)super).om0.TG0.oh0); return true; }  if (h1.J20(paramoa0.GG0, BM.ni) || h1.J20(paramoa0.GG0, BM.Oq)) { q0(); if (((Ea0)super).Lh0.p3()) q0();  return true; }  if (h1.J20(paramoa0.GG0, BM.N70) || h1.J20(paramoa0.GG0, BM.M8)) { oZ(); if (((Ea0)super).Lh0.p3())
/* 28 */           oZ();  return true; }  }  return super.i2(paramoa0); }
/*    */ 
/*    */   
/*    */   public static void pF0() {
/*    */     pA pA;
/*    */     Ea0 ea0;
/*    */     if ((ea0 = (pA = pA.Dg0).L60) != null) {
/*    */       ea0.ra0();
/*    */       pA.L60 = null;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void Wm() {
/*    */     short s1 = this.Iz.hC0;
/*    */     int j = this.Iz.Lq;
/*    */     int i = this.d50.Lq;
/*    */     short s2 = (short)(byte)this.d50.op0;
/*    */     km.u4.tq0(s1, j, i, s2, (byte)-1);
/*    */     this.d50.Tm0(null);
/*    */     i = this.Iz.hC0;
/*    */     j = (short)Math.min(this.Iz.op0 - this.g50, 9999);
/*    */     this.Iz.LPt2((byte)0, i, j);
/*    */     if (this.Iz.op0 < 1)
/*    */       ra0(); 
/*    */   }
/*    */   
/*    */   public final void IG0() {
/*    */     this.d50.Tm0(y);
/*    */     int i;
/*    */     Y y;
/*    */     if ((i = this.LPt7) > 0 && (y = km.u4.Fe[1].u60(i)) != null && y.Lh.Sf0 > 1)
/*    */       return; 
/*    */     VA0.c90(this.d50);
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     if (km.XU()) {
/*    */       QI();
/*    */       this.AZ.js0(et.Wi0);
/*    */       this.AZ.Tm(500, 450);
/*    */     } else {
/*    */       super.d40();
/*    */       mM();
/*    */       qB0(et.Wi0);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void xw0(short paramShort) {
/*    */     if (paramShort < 1) {
/*    */       this.Lh0.wI0(false);
/*    */       this.CQ.wI0(false);
/*    */       return;
/*    */     } 
/*    */     LPT3 lPT3 = Of.eH.On0(paramShort);
/*    */     short s2 = this.Iz.op0;
/*    */     this.g50 = Math.min(this.d50.op0, s2);
/*    */     this.CQ.E1(lPT3.X50());
/*    */     short s1 = (short)(this.g50 * 10);
/*    */     this.Lh0.LPt2((byte)0, paramShort, s1);
/*    */     this.CQ.wI0(true);
/*    */     this.Lh0.wI0(true);
/*    */     if (km.XU()) {
/*    */       byte b = 50;
/*    */       paramShort = 25;
/*    */       this.Lh0.gc = b;
/*    */       this.Lh0.x80 = paramShort;
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ea0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */