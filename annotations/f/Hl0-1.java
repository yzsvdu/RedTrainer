/*  1 */ package f;public final class Hl0 extends Ij implements r60 { public final byte F50; public tO Il0; public Ip OB; public Un Mv0; public Hl0(byte paramByte) { this.F50 = paramByte; TG0(this::kF); Xu("seed-plant-dialog"); Lo(Ml0.OH0(8582)); this.OB = new Ip(); this.Mv0 = new Un(Ml0.OH0(8574)); this.zj = new Un(Ml0.OH0(53)); this.Mv0.tW(this::si0); this.zj.tW(this::kF); this(this); this.Il0 = tO1; tO tO1; (tO1 = new tO()).bm0(this::f6); (this.Bq0 = new tO(this)).lE(12, 10); this.u1 = new xo0("\n\n"); this.Hs = new xo0(""); this.SE = new xo0(""); this.Bq0.wI0(false); this.u1.wI0(false); this.Hs.wI0(false); this.SE.wI0(false); U90 u90 = ip.d7().Aq(15).ee0(this.OB.mE0().Ya(this.Il0)).Aq(15); u90 = R10.aj0(this.OB.mE0(), new JG0[] { this.Bq0, this.u1 }, u90, 15); Ip ip; (ip = this.OB)
/*    */ 
/*    */       
/*  4 */       .WN(R10.aj0(this.OB.mE0(), new JG0[] { this.Hs, this.SE }, u90, 15).ee0(this.OB.d7().Mg(new JG0[] { this.Mv0, this.zj })).Em0()); this.OB.rK0(this.OB.mE0().ee0(this.OB.d7().Em0().Ya(this.Il0).Em0()).ee0(this.OB.d7().Em0().Mg(new JG0[] { this.Bq0, this.u1 }).Em0()).ee0(this.OB.d7().Em0().Mg(new JG0[] { this.Hs, this.SE }).Em0()).ee0(this.OB.mE0().Ya(this.Mv0).Ya(this.zj))); J8(this.OB); } public Un zj; public tO Bq0; public xo0 u1; public xo0 Hs; public xo0 SE; private void f6() { if (this.Il0.p3()) {
/*    */       B3 b3; ArrayList<Y> arrayList; Lw lw; this(); this(); this(); zr0 zr0; Y[] arrayOfY; int i; byte b; for (i = (arrayOfY = (zr0 = km.u4.Fe[1]).ro0()).length, b = 0; b < i; )
/*  6 */       { Y y; short s; if (!lw.Fb((y = arrayOfY[b]).Lh.p1) && (((
/*    */           
/*  8 */           s = y.Bp0.bj0) >= 5485 && s <= 5491))) { arrayList
/*  9 */             .add(y);
/*    */ 
/*    */           
/* 12 */           lw.Ye0(y.Lh.p1); }  b++; }  Collections.sort(arrayList); for (Y y : arrayList) { vi vi; V5 v5; this();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 19 */         this(this, y); StringBuilder stringBuilder; this((stringBuilder = new StringBuilder()).append(zr0.jW(y.Lh.p1)).append("x ").append(y.JG0()).toString(), wm0.y0.HR(y.Bp0, false), 3, 3, 24, 24, v5, true);
/* 20 */         b3.aV.add(vi); }
/* 21 */        Un un = this.Mv0;
/* 22 */       if (b3.aV.size() < 1)
/* 23 */       { be be; String str = Ml0.OH0(6007); this(); b3.mD(str, be); }  F7.om(b3, un, this.Il0);
/*    */     }  } public final boolean i2(oa0 paramoa0) { Runnable runnable; if (B8.Wm0(paramoa0.cz0) && paramoa0.oO()) { BM bM; if (h1.J20(paramoa0.GG0, bM = BM.bC) && this.Il0.p3()) { if ((runnable = this.Il0.Tw0) != null)
/*    */           run();  return true; }
/*    */        if (h1.J20(paramoa0.GG0, bM) && ((Hl0)super).Mv0.p3()) { hm.Fz0(((Hl0)super).Mv0.TG0.oh0); return true; }
/* 27 */        if (h1.J20(paramoa0.GG0, BM.lc) || (h1.J20(paramoa0.GG0, bM) && ((Hl0)super).zj.p3())) { hm.Fz0(((Hl0)super).zj.TG0.oh0); return true; }  if (h1.J20(paramoa0.GG0, BM.ni) || h1.J20(paramoa0.GG0, BM.Oq)) { q0(); if (((Hl0)super).Bq0.p3()) q0();  return true; }  if (h1.J20(paramoa0.GG0, BM.N70) || h1.J20(paramoa0.GG0, BM.M8)) { oZ(); if (((Hl0)super).Bq0.p3())
/* 28 */           oZ();  return true; }  }  return super.i2(paramoa0); }
/*    */ 
/*    */   
/*    */   public final void si0() {
/*    */     if (this.Bq0.hC0 < 1) {
/*    */       kF();
/*    */       return;
/*    */     } 
/*    */     R8 r8 = km.u4;
/*    */     byte b = this.F50;
/*    */     short[] arrayOfShort1 = new short[10];
/*    */     int i = 0;
/*    */     short s = this.Il0.hC0;
/*    */     int j;
/*    */     if ((j = i + 1) > arrayOfShort1.length) {
/*    */       arrayOfShort1 = new short[Math.max(arrayOfShort1.length << 1, j)];
/*    */       j = arrayOfShort1.length;
/*    */       System.arraycopy(arrayOfShort1, 0, arrayOfShort1, 0, j);
/*    */     } 
/*    */     arrayOfShort1[i++] = s;
/*    */     s = this.Il0.op0;
/*    */     if ((j = i + 1) > arrayOfShort1.length) {
/*    */       arrayOfShort1 = new short[Math.max(arrayOfShort1.length << 1, j)];
/*    */       j = arrayOfShort1.length;
/*    */       System.arraycopy(arrayOfShort1, 0, arrayOfShort1, 0, j);
/*    */     } 
/*    */     arrayOfShort1[i] = s;
/*    */     i = 0;
/*    */     short[] arrayOfShort2 = new short[j = i + 1];
/*    */     if (i + 1 != 0)
/*    */       if (j > 0) {
/*    */         System.arraycopy(arrayOfShort1, i, arrayOfShort2, 0, j);
/*    */       } else {
/*    */         throw new ArrayIndexOutOfBoundsException(i);
/*    */       }  
/*    */     byte[] arrayOfByte;
/*    */     ShortBuffer shortBuffer;
/*    */     byte b1;
/*    */     for (shortBuffer = ByteBuffer.wrap(arrayOfByte = new byte[arrayOfShort2.length * 2]).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer(), j = arrayOfShort2.length, b1 = 0; b1 < j; ) {
/*    */       shortBuffer.put(arrayOfShort2[b1]);
/*    */       b1++;
/*    */     } 
/*    */     r8.N7(b, arrayOfByte);
/*    */     ra0();
/*    */   }
/*    */   
/*    */   public final void kF() {
/*    */     km.u4.lx0(this.F50, (byte)0);
/*    */     ra0();
/*    */   }
/*    */   
/*    */   public final void IG0() {
/*    */     VA0.c90(this.Il0);
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     super.d40();
/*    */     mM();
/*    */     qB0(et.Wi0);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Hl0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */