/*  1 */ package f;public class YA0 extends JG0 { public final SA Dv0; public boolean Ho0; public boolean TG0; public boolean WA0; public final nJ0 sa0() { return this.Dv0.RT; }
/*    */   public YA0() { this(); SA sA; this(this); }
/*  3 */   public YA0(SA paramSA) { this.Dv0 = paramSA; paramSA.r10(this); Xu(""); } public final void J8(JG0 paramJG0) { try(paramJG0); } public nJ0 try(JG0 paramJG0) { return this.Dv0.S7(paramJG0); } public final nJ0 ZE() { return this.Dv0.wP(); } public void d40() { float f7, f8, arrayOfFloat1[], arrayOfFloat2[], f14; SA sA; float f1 = ((YA0)(sA = this.Dv0).Vs).Kd;
/*  4 */     float f2 = ((YA0)(sA = this.Dv0).Vs).er0;
/*  5 */     float f3 = ((YA0)(sA = this.Dv0).Vs).xY;
/*  6 */     float f4 = ((YA0)(sA = this.Dv0).Vs).HC;
/*  7 */     JN jN = this.Dv0.BT; ArrayList<nJ0> arrayList1 = this.Dv0.XC; if (this.Dv0.iO) r3();  Ln ln1; if ((ln1 = this.g8) == null) { f5 = 0.0F; }
/*    */     else
/*  9 */     { f5 = f5.h80;
/* 10 */       JN.fl0.getClass(); }
/* 11 */      Ln ln3; if ((ln3 = this.zk) == null) { f7 = 0.0F; }
/*    */     else
/* 13 */     { f7 = f7.h80;
/* 14 */       JN.fl0.getClass(); }  float f5 = f7 + f5; Ln ln2;
/* 15 */     if ((ln2 = this.cOn) == null) { f6 = 0.0F; }
/*    */     else
/* 17 */     { f6 = f6.h80;
/* 18 */       JN.fl0.getClass(); }
/* 19 */      Ln ln5; if ((ln5 = this.gI0) == null) { f9 = 0.0F; }
/*    */     else
/* 21 */     { f9 = f9.h80;
/* 22 */       JN.fl0.getClass(); }  float f6 = f9 + f6, f9 = 0.0F, f11 = 0.0F; byte b3 = 0; while (b3 < this
/* 23 */       .Nb0) { f9 += this.zH0[b3]; b3++; }  for (b3 = 0; b3 < this.AJ; ) { f11 += this.RR[b3]; b3++; }  float f13, f15; if ((f15 = this.xx - (f13 = this.lC0)) == 0.0F) { arrayOfFloat1 = this.Gn; } else { float f; float[] arrayOfFloat; byte b; for (f = Math.min(f15, Math.max(0.0F, f3 - arrayOfFloat1)), arrayOfFloat = this.VT, this.VT = arrayOfFloat = ZP.iy(this.Nb0, arrayOfFloat), b = 0; b < this.Nb0; ) { float f18; arrayOfFloat[b] = (this.Py0[b] - (f18 = this.Gn[b])) / f15 * f + f18; b++; }  arrayOfFloat1 = arrayOfFloat; }  if ((f15 = this.C20 - this.Bg) == 0.0F) { arrayOfFloat2 = this.id0; } else { float[] arrayOfFloat; float f; byte b; for (arrayOfFloat = this.Z60, this.Z60 = arrayOfFloat = ZP.iy(this.AJ, arrayOfFloat), f = Math.min(arrayOfFloat2, Math.max(0.0F, f4 - this.Bg)), b = 0; b < this.AJ; ) { float f18; arrayOfFloat[b] = (this.qs[b] - (f18 = this.id0[b])) / arrayOfFloat2 * f + f18; b++; }  arrayOfFloat2 = arrayOfFloat; }  int m, n; for (m = 0, n = arrayList1.size(); m < n; ) { nJ0 nJ0; if (!(nJ0 = arrayList1.get(m)).nul.booleanValue()) { float f18; int i2, i3; for (f18 = 0.0F, i2 = nJ0.mh, i3 = nJ0.ss.intValue() + i2; i2 < i3; ) { f18 += arrayOfFloat1[i2]; i2++; }  float f19 = arrayOfFloat2[nJ0.VJ], f21 = ZP.VL0(nJ0.t00, nJ0), f23 = ZP.VL0(nJ0.Vs0, nJ0), f24 = ZP.qd(nJ0.Of0, nJ0), f25 = ZP.VL0(nJ0.d90, nJ0); float f20, f22; if ((f20 = ZP.qd(nJ0.WF0, nJ0)) < (f22 = ZP.qd(nJ0.Vr, nJ0))) f20 = f22;  if (f21 < f23) f21 = f23;  if (f24 <= 0.0F || f20 <= f24) f24 = f20;  if (f25 <= 0.0F || f21 <= f25) f25 = f21;  nJ0.rq0 = Math.min(f18 - nJ0.zv0 - nJ0.LH, f24); nJ0.Rq = Math.min(f19 - nJ0.ia - nJ0.It, f25); if (nJ0.ss.intValue() == 1) { int i4; this.DF0[i4] = Math.max(this.DF0[i4 = nJ0.mh], f18); }  int i1; this.fy[i1] = Math.max(this.fy[i1 = nJ0.VJ], f19); }  m++; }  if (f9 > 0.0F) { byte b4; for (f14 = f3 - f5, m = 0; m < this.Nb0; ) { f14 -= this.DF0[m]; m++; }  float f; byte b5; for (f = 0.0F, n = 0, b5 = 0; b5 < this.Nb0; ) { float f18; if ((f18 = this.zH0[b5]) != 0.0F) { f = f14 * f18 / f9; float[] arrayOfFloat3 = this.DF0; arrayOfFloat3[b5] = arrayOfFloat3[b5] + f; f += f; b4 = b5; }  b5++; }  f8 = arrayOfFloat[b4]; float[] arrayOfFloat; (arrayOfFloat = this.DF0)[b4] = f14 - f + f8; }  if (f11 > 0.0F) { int i1; byte b; for (f9 = f4 - f6, b = 0; b < this.AJ; ) { f9 -= this.fy[b]; b++; }  for (f14 = 0.0F, m = 0, n = 0; n < this.AJ; ) { float f; if ((f = this.RR[n]) != 0.0F) { f14 = f9 * f / f11; float[] arrayOfFloat3 = this.fy; arrayOfFloat3[n] = arrayOfFloat3[n] + f14; f14 += f14; i1 = n; }  n++; }  f9 = arrayOfFloat[i1]; float[] arrayOfFloat; (arrayOfFloat = this.fy)[i1] = f9 - f14 + f9; }  byte b2; int j; for (b2 = 0, j = arrayList1.size(); b2 < j; ) { nJ0 nJ0; if (!(nJ0 = arrayList1.get(b2)).nul.booleanValue() && nJ0.ss.intValue() != 1) { float f; int i1; for (f = 0.0F, n = nJ0.mh, i1 = nJ0.ss.intValue() + n; n < i1; ) { f = arrayOfFloat1[n] - this.DF0[n] + f; n++; }  if ((f = (f - Math.max(0.0F, nJ0.zv0 + nJ0.LH)) / nJ0.ss.intValue()) > 0.0F) for (int i2 = nJ0.mh; i2 < n; ) { this.DF0[i2] = this.DF0[i2] + f; i2++; }   }  b2++; }  float f10; for (b2 = 0, f10 = f5; b2 < this.Nb0; ) { f10 += this.DF0[b2]; b2++; }  float f12; for (b2 = 0, f12 = f6; b2 < this.AJ; ) { f12 += this.fy[b2]; b2++; }  Ln ln4; if ((ln4 = this.g8) == null) { f8 = 0.0F; }
/*    */     else
/* 25 */     { f8 = f8.h80;
/* 26 */       JN.fl0.getClass(); }  f8 += f1; int k;
/* 27 */     if (((k = this.Fh) & 0x10) != 0) { f8 = f3 - f10 + f8; } else if ((k & 0x8) == 0) { f8 = (f3 - f10) / 2.0F + f8; }  Ln ln6; if ((ln6 = this.cOn) == null) { f14 = 0.0F; }
/*    */     else
/* 29 */     { f14 = f14.h80;
/* 30 */       JN.fl0.getClass(); }  f14 += f2;
/* 31 */     if (((m = this.Fh) & 0x4) != 0) { f14 = f4 - f12 + f14; } else if ((m & 0x2) == 0) { f14 = (f4 - f12) / 2.0F + f14; }  float f16, f17; for (m = 0, n = arrayList1.size(), f17 = f14, f16 = f8; m < n; ) { nJ0 nJ0; if (!(nJ0 = arrayList1.get(m)).nul.booleanValue()) { float f18; int i1, i2; for (f18 = 0.0F, i1 = nJ0.mh, i2 = nJ0.ss.intValue() + i1; i1 < i2; ) { f18 += this.DF0[i1]; i1++; }  f18 -= (f16 = nJ0.zv0) + nJ0.LH; f16 += f16; nJ0.rq0 = Math.max(nJ0.X50.floatValue() * f18, ZP.VL0(nJ0.Vr, nJ0)); float f19; if (nJ0.X50.floatValue() > 0.0F && (f19 = ZP.qd(nJ0.Of0, nJ0)) > 0.0F) nJ0.rq0 = Math.min(nJ0.rq0, f19);  f19 = this.fy[nJ0.VJ]; nJ0.Rq = Math.max(nJ0.Q7.floatValue() * f19 - nJ0.ia - nJ0.It, ZP.VL0(nJ0.Vs0, nJ0)); if (nJ0.Q7.floatValue() > 0.0F && (f19 = ZP.VL0(nJ0.d90, nJ0)) > 0.0F) nJ0.Rq = Math.min(nJ0.Rq, f19);  if ((nJ0.tf.intValue() & 0x8) != 0) { nJ0.ik0 = f16; } else if ((nJ0.tf.intValue() & 0x10) != 0) { nJ0.ik0 = f16 + f18 - nJ0.rq0; } else { nJ0.ik0 = (f18 - nJ0.rq0) / 2.0F + f16; }  if ((nJ0.tf.intValue() & 0x2) != 0) { nJ0.Zo0 = f17 + nJ0.ia; } else if ((nJ0.tf.intValue() & 0x4) != 0) { nJ0.Zo0 = f17 + this.fy[nJ0.VJ] - nJ0.Rq - nJ0.It; } else { nJ0.Zo0 = (this.fy[nJ0.VJ] - nJ0.Rq + nJ0.ia - nJ0.It) / 2.0F + f17; }  if (nJ0.Sb0) { f17 += this.fy[nJ0.VJ]; f16 = f8; } else { f16 = f18 + nJ0.LH + f16; }  }  m++; }  if (this.C70 != 1) { jN.mL0(this); if ((m = this.C70) == 3 || m == 2) { jN.xA(this, 3, f1, f2, f3, f4); f1 = f10 - f5; f2 = f12 - f6; jN.xA(this, 3, f8, f14, f1, f2); }  byte b; int i1; for (b = 0, i1 = arrayList1.size(), f3 = f8; b < i1; ) { nJ0 nJ0; if (!(nJ0 = arrayList1.get(b)).nul.booleanValue()) { int i2; if ((i2 = this.C70) == 5 || i2 == 2) { float f18 = nJ0.ik0; f6 = nJ0.Zo0; f10 = nJ0.rq0; f12 = nJ0.Rq; jN.xA(this, 5, f18, f6, f10, f12); }  float f; int i3; int i4; for (f = 0.0F, i3 = nJ0.mh, i4 = nJ0.ss.intValue() + i3; i3 < i4; ) { f += this.DF0[i3]; i3++; }  f -= (f3 = nJ0.zv0) + nJ0.LH; f3 += f3; if ((i3 = this.C70) == 4 || i3 == 2) { float f18, f19 = f14 + (f18 = nJ0.ia); f18 = this.fy[nJ0.VJ] - f18 - nJ0.It; jN.xA(this, 4, f3, f19, f, f18); }  if (nJ0.Sb0) { f14 = f3 = f14 + this.fy[nJ0.VJ]; f3 = f8; } else { f3 = f + nJ0.LH + f3; }  }  b++; }  }
/* 32 */      byte b1 = 0; ArrayList<?> arrayList;
/* 33 */     for (int i = (arrayList = this.XC).size(); b1 < i; ) {
/*    */       nJ0 nJ0; Boolean bool;
/* 35 */       if (!(((bool = (nJ0 = (nJ0)get(b1)).nul) != null && bool.booleanValue() == true) ? 1 : 0))
/* 36 */       { ((JG0)nJ0.ZX)
/*    */ 
/*    */ 
/*    */           
/* 40 */           .Ol0((int)nJ0.ik0, (int)nJ0.Zo0);
/*    */ 
/*    */         
/* 43 */         ((JG0)nJ0.ZX).Tm((int)nJ0.rq0, (int)nJ0.Rq); }  b1++;
/*    */     }  }
/*    */ 
/*    */   
/*    */   public final int AW() {
/*    */     SA sA;
/*    */     if ((sA = this.Dv0).iO)
/*    */       r3(); 
/*    */     return (int)this.lC0;
/*    */   }
/*    */   
/*    */   public final int HY() {
/*    */     SA sA;
/*    */     if ((sA = this.Dv0).iO)
/*    */       r3(); 
/*    */     return (int)this.Bg;
/*    */   }
/*    */   
/*    */   public final int J50() {
/*    */     if (this.Ho0)
/*    */       return this.fr0.xY; 
/*    */     SA sA;
/*    */     if ((sA = this.Dv0).iO)
/*    */       r3(); 
/*    */     return (int)this.xx;
/*    */   }
/*    */   
/*    */   public final int tj0() {
/*    */     if (this.TG0)
/*    */       return this.fr0.HC; 
/*    */     SA sA;
/*    */     if ((sA = this.Dv0).iO)
/*    */       r3(); 
/*    */     return (int)this.C20;
/*    */   }
/*    */   
/*    */   public final void MJ0() {
/*    */     super.MJ0();
/*    */     this.Dv0.iO = true;
/*    */   }
/*    */   
/*    */   public final void ED0(throws paramthrows) {
/*    */     SA sA;
/*    */     (sA = this.Dv0).C70 = 1;
/*    */     this.Dv0.BT.mL0(this);
/*    */   }
/*    */   
/*    */   public final void R60(throws paramthrows) {
/*    */     super.R60(paramthrows);
/*    */     if (paramthrows.xQ) {
/*    */       int i;
/*    */       Aa aa = Aa.QQ;
/*    */       aa.getClass();
/*    */       F1 f11 = F1.IF0;
/*    */       em em;
/*    */       F1 f12;
/*    */       if ((f12 = (em = ((tw)paramthrows.IB0).Rq).WN) == f11) {
/*    */         byte b = 0;
/*    */         for (i = aa.bt0.Z8; b < i; ) {
/*    */           R50 r50;
/*    */           if ((r50 = (R50)aa.bt0.get(b)).Ro.Vs == this) {
/*    */             Color color = r50.ue;
/*    */             em.H5.set(color);
/*    */             float f1 = r50.dA, f2 = r50.zA0, f3 = r50.af, f4 = r50.sf0;
/*    */             F1 f13;
/*    */             em.E10(f13 = F1.IF0, F1.xn, 8);
/*    */             float f5 = em.H5.toFloatBits();
/*    */             if (em.WN == f13) {
/*    */               em.Jk0.nX(f5);
/*    */               em.Jk0.hd0(f1, f2);
/*    */               em.Jk0.nX(f5);
/*    */               em.Jk0.hd0(f3 = f1 + f3, f2);
/*    */               em.Jk0.nX(f5);
/*    */               em.Jk0.hd0(f3, f2);
/*    */               em.Jk0.nX(f5);
/*    */               em.Jk0.hd0(f3, f4 = f2 + f4);
/*    */               em.Jk0.nX(f5);
/*    */               em.Jk0.hd0(f3, f4);
/*    */               em.Jk0.nX(f5);
/*    */               em.Jk0.hd0(f1, f4);
/*    */               em.Jk0.nX(f5);
/*    */               em.Jk0.hd0(f1, f4);
/*    */               em.Jk0.nX(f5);
/*    */               em.Jk0.hd0(f1, f2);
/*    */             } else {
/*    */               em.Jk0.nX(f5);
/*    */               em.Jk0.hd0(f1, f2);
/*    */               em.Jk0.nX(f5);
/*    */               em.Jk0.hd0(f3 = f1 + f3, f2);
/*    */               em.Jk0.nX(f5);
/*    */               em.Jk0.hd0(f3, f4 = f2 + f4);
/*    */               em.Jk0.nX(f5);
/*    */               em.Jk0.hd0(f3, f4);
/*    */               em.Jk0.nX(f5);
/*    */               em.Jk0.hd0(f1, f4);
/*    */               em.Jk0.nX(f5);
/*    */               em.Jk0.hd0(f1, f2);
/*    */             } 
/*    */           } 
/*    */           b++;
/*    */         } 
/*    */       } else {
/*    */         if (i != null)
/*    */           throw new IllegalStateException("autoShapeType must be enabled."); 
/*    */         throw new IllegalStateException("begin must be called first.");
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void oU() {
/*    */     this.Ho0 = true;
/*    */     this.TG0 = true;
/*    */   }
/*    */   
/*    */   public boolean i2(oa0 paramoa0) {
/*    */     if (this.WA0 && B8.Wm0(paramoa0.cz0) && paramoa0.oO()) {
/*    */       if (h1.J20(paramoa0.GG0, BM.Oq)) {
/*    */         q0();
/*    */         return true;
/*    */       } 
/*    */       if (h1.J20(paramoa0.GG0, BM.M8)) {
/*    */         oZ();
/*    */         return true;
/*    */       } 
/*    */     } 
/*    */     return super.i2(paramoa0);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/YA0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */