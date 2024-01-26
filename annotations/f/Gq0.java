/*  1 */ package f;public final class Gq0 { public final yB fa; public final ArrayList mz; public final ArrayList lw = new ArrayList(); public final ArrayList ph = new ArrayList(); public final StringBuilder Yu = new StringBuilder(); public final int DL; public final int MU; public final int Ew0; public final int RJ0; public final boolean Jo; public int wa0; public int c5; public int L30; public int sB0; public int En; public int Ji0; public int D20; public int hK0; public int vR; public int Ph0; public int yl; public int L0; public int dM0; public int PB; public int Dz; public int De; public boolean cL0; public boolean kY; public boolean V4; public AuX kI0; public String rv0; public cR az; public Gq0(da paramda, yB paramyB, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) { this.fa = paramyB; ArrayList arrayList = paramyB.la0; this.DL = paramInt1; int i = Math.max(0, paramyB.J1 - paramInt1 - paramInt2); this.Ew0 = paramInt1; this.RJ0 = paramInt2; this.Jo = paramBoolean; this.c5 = paramInt1; this.wa0 = paramInt3; this.Ph0 = paramInt1; this.yl = i; this.De = i; this.kI0 = AuX.XT; if (nF || arrayList.isEmpty()) return;  throw new AssertionError(); } public final void f1() { int j = LD(this.Ji0); this.yl = Math.max(0, XS(this.D20) - j); if (Bz()) this.c5 = this.Ph0;  int i = zt0(); this.De = Math.min(this.De, i); } public final int LD(int paramInt) { int i = this.DL; i = Math.max(0, paramInt - this.Ew0) + i; byte b = 0; int j = this.lw.size(); while (b < j) { GC0 gC0; i = (gC0 = this.lw.get(b)).Iu + gC0.J1; i = Math.max(i, Math.max((this.lw.get(b)).WS, paramInt) + i); b++; }  return i; } public final int XS(int paramInt) { int i = this.DL + this.MU - Math.max(0, paramInt - this.RJ0); byte b = 0; int j = this.ph.size(); while (b < j) { GC0 gC0; i = Math.min(i, (gC0 = this.ph.get(b)).Iu - Math.max(gC0.dv0, paramInt)); b++; }  return i; } public final int qr0(int paramInt) { return Math.max(this.hK0, this.wa0 + paramInt); } public final int zt0() { return Math.max(0, this.yl - this.c5 + this.Ph0); } public final boolean Bz() { return (this.L30 == this.mz.size()); } public final void ok(UG paramUG) { if (paramUG != UG.J10) { int i = -1; if (paramUG == UG.nC || paramUG == UG.Pz0) { byte b; int j; for (b = 0, j = this.lw.size(); b < j; ) { GC0 gC0; int k; if ((k = (gC0 = this.lw.get(b)).tq0) != 32767) i = Math.max(i, gC0.Bm + k);  b++; }  }  if (paramUG == UG.n00 || paramUG == UG.Pz0) { byte b; int j; for (b = 0, j = this.ph.size(); b < j; ) { GC0 gC0; i = Math.max(i, (gC0 = this.ph.get(b)).Bm + gC0.tq0); b++; }  }  vA0(false); if (i >= 0 && i > this.wa0) { this.wa0 = i;
/*    */         ArrayList<?> arrayList;
/*  3 */         for (i = (arrayList = this.lw).size(); i-- > 0;) { if (((GC0)arrayList.get(i)).O80() <= this.wa0) arrayList.remove(i);  }
/*    */         
/*  5 */         for (i = (arrayList = this.ph).size(); i-- > 0;) { if (((GC0)arrayList.get(i)).O80() <= this.wa0) arrayList.remove(i);  }
/*  6 */          f1(); }  }  } public final void DF0(int paramInt1, int paramInt2, int paramInt3) { if (Math.max(0, XS(paramInt3) - LD(paramInt2)) < paramInt1) { vA0(false); do { int i = Integer.MAX_VALUE; GC0 gC0; if (!this.lw.isEmpty() && (gC0 = this.lw.get(this.lw.size() - 1)).tq0 != 32767) i = Math.min(i, gC0.O80());  if (!this.ph.isEmpty()) i = Math.min(i, ((GC0)this.ph.get(this.ph.size() - 1)).O80());  if (i == Integer.MAX_VALUE || i < this.wa0) return;  this.wa0 = i; ArrayList<?> arrayList; int j; for (j = (arrayList = this.lw).size(); j-- > 0;) { if (((GC0)arrayList.get(j)).O80() <= this.wa0) arrayList.remove(j);  }  for (j = (arrayList = this.ph).size(); j-- > 0;) { if (((GC0)arrayList.get(j)).O80() <= this.wa0) arrayList.remove(j);  }
/*  7 */          f1(); }
/*  8 */       while (Math.max(0, XS(paramInt3) - LD(paramInt2)) < paramInt1); }  } public final boolean vA0(boolean paramBoolean) { if (Bz() && (this.kY || !paramBoolean)) { this.kY = paramBoolean ^ true; return false; }  int j = zt0(); this.De = Math.min(this.De, j); j = this.wa0; int k = this.dM0; if (Bz()) { k = Math.max(k, this.L0); } else { for (int n = this.L30; n < this.mz.size(); ) { k = Math.max(k, ((GC0)this.mz.get(n)).tq0); n++; }  GC0 gC0 = this.mz.get(this.mz.size() - 1); int m = this.Ph0 + this.yl - gC0.Iu + gC0.J1; int i1; if ((i1 = this.kI0.ordinal()) != 1) { if (i1 != 2) { if (i1 == 3 && m < this.yl / 4) { byte b; for (i1 = this.mz.size() - this.L30, b = 1; b < i1; ) { int i2 = m * b / (i1 - 1); ((GC0)this.mz.get(this.L30 + b)).Iu += i2; b++; }  }  } else { for (m /= 2, i1 = this.L30; i1 < this.mz.size(); ) { ((GC0)this.mz.get(i1)).Iu += m; i1++; }  }  } else { for (i1 = this.L30; i1 < this.mz.size(); ) { ((GC0)this.mz.get(i1)).Iu += m; i1++; }  }  for (m = this.L30; m < this.mz.size(); ) { this.pH0.getClass(); GC0 gC01; e00 e00; switch (((Om0)(gC01 = this.mz.get(m)).pM.X10.bw0(e00 = e00.VERTICAL_ALIGNMENT).rI(e00)).ordinal()) { case 3: gC01.Bm = 0; gC01.tq0 = k; break;case 2: gC01.Bm = k - gC01.tq0; break;case 1: gC01.Bm = (k - gC01.tq0) / 2; break;
/*  9 */           case 0: gC01.Bm = 0; break; }  j = Math.max(j, qr0(gC01.Zq - gC01.Bm)); this.vR = Math.max(this.vR, gC01.O80() - k); m++; }  for (m = this.L30; m < this.mz.size(); ) { ((GC0)this.mz.get(m)).Bm += j; m++; }  }  Ng0(j, k); this.dM0 = 0; this.L30 = this.mz.size(); this.kY = paramBoolean ^ true; int i = j + k; this.hK0 = Math.max(this.hK0, i + this.vR); this.vR = 0; this.En = 0; ArrayList<?> arrayList; for (j = (arrayList = this.lw).size(); j-- > 0;) { if (((GC0)arrayList.get(j)).O80() <= this.wa0) arrayList.remove(j);  }
/*    */     
/* 11 */     for (j = (arrayList = this.ph).size(); j-- > 0;) { if (((GC0)arrayList.get(j)).O80() <= this.wa0) arrayList.remove(j);  }
/* 12 */      f1(); return true; }
/*    */ 
/*    */   
/*    */   public final void b60() {
/*    */     vA0(false);
/*    */     ok(UG.Pz0);
/*    */     Ng0(this.wa0, 0);
/*    */     int i = this.Yu.length();
/*    */     char[] arrayOfChar = new char[i];
/*    */     this.Yu.getChars(0, i, arrayOfChar, 0);
/*    */   }
/*    */   
/*    */   public final void PB0(cR paramcR, pe parampe, boolean paramBoolean) {
/*    */     if (parampe != null) {
/*    */       this.L0 = ((t90)parampe).getLineHeight();
/*    */     } else {
/*    */       this.L0 = 0;
/*    */     } 
/*    */     if (paramBoolean) {
/*    */       vA0(false);
/*    */       this.cL0 = true;
/*    */     } 
/*    */     if (paramBoolean || (!this.cL0 && Bz())) {
/*    */       e00 e001 = e00.MARGIN_LEFT;
/*    */       this.Ji0 = Math.max(0, this.pH0.QE0(paramcR, e001, this.MU, 0));
/*    */       e001 = e00.MARGIN_RIGHT;
/*    */       this.D20 = Math.max(0, this.pH0.QE0(paramcR, e001, this.MU, 0));
/*    */       this.pH0.getClass();
/*    */       this.kI0 = (AuX)paramcR.bw0(e001 = e00.HORIZONTAL_ALIGNMENT).rI(e001);
/*    */       f1();
/*    */       int i = this.Ph0;
/*    */       e00 e002 = e00.TEXT_INDENT;
/*    */       this.c5 = Math.max(0, this.pH0.QE0(paramcR, e002, this.MU, 0) + i);
/*    */     } 
/*    */     e00 e00 = e00.MARGIN_TOP;
/*    */     this.En = Math.max(0, this.pH0.QE0(paramcR, this, this.MU, 0));
/*    */   }
/*    */   
/*    */   public final GC0 Um(xc paramxc) {
/*    */     this(paramxc);
/*    */     gC0.Bm = this.wa0;
/*    */     gC0.Iu = this.DL;
/*    */     gC0.J1 = this.MU;
/*    */     this.fa.fi.add(gC0);
/*    */     GC0 gC0;
/*    */     return gC0 = new GC0();
/*    */   }
/*    */   
/*    */   public final void Ng0(int paramInt1, int paramInt2) {
/*    */     while (this.sB0 < this.fa.fi.size()) {
/*    */       int i;
/*    */       this.sB0 = (i = this.sB0) + 1;
/*    */       GC0 gC0;
/*    */       if ((gC0 = this.fa.fi.get(i)).tq0 == 0) {
/*    */         gC0.Bm = paramInt1;
/*    */         gC0.tq0 = paramInt2;
/*    */       } 
/*    */     } 
/*    */     if (this.L30 > this.PB)
/*    */       this.Yu.append(false).append((char)(this.L30 - this.PB)); 
/*    */     if (paramInt1 > this.Dz)
/*    */       this.Yu.append((char)paramInt1).append(false); 
/*    */     this.Dz = paramInt1 += paramInt2;
/*    */     this.Yu.append((char)paramInt1).append((char)(this.mz.size() - this.L30));
/*    */     this.PB = this.mz.size();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Gq0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */