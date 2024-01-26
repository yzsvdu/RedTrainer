/*  1 */ package f;public final class yD { public final fM ST; public final ArrayList pb0; public final ArrayList o4 = new ArrayList(); public final ArrayList A60 = new ArrayList(); public final StringBuilder RY = new StringBuilder(); public final int Cc0; public final int qR; public final int aD0; public final int Z0; public final boolean Q10; public int t0; public int gC0; public int xu0; public int Xb0; public int Ta; public int qL; public int ML; public int jy; public int Fq; public int VN; public int tl; public int kj; public int pn; public int St0; public int dd0; public int SF; public boolean eS; public boolean Oo; public boolean m00; public AuX YP; public String WM; public cR LT; public yD(f9 paramf9, fM paramfM, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) { this.ST = paramfM; ArrayList arrayList = paramfM.nA0; this.Cc0 = paramInt1; int i = Math.max(0, paramfM.iw0 - paramInt1 - paramInt2); this.aD0 = paramInt1; this.Z0 = paramInt2; this.Q10 = paramBoolean; this.gC0 = paramInt1; this.t0 = paramInt3; this.VN = paramInt1; this.tl = i; this.SF = i; this.YP = AuX.XT; if (RH0 || arrayList.isEmpty()) return;  throw new AssertionError(); } public final void lo() { int j = o70(this.qL); this.tl = Math.max(0, CQ(this.ML) - j); if (zs0()) this.gC0 = this.VN;  int i = sL(); this.SF = Math.min(this.SF, i); } public final int o70(int paramInt) { int i = this.Cc0; i = Math.max(0, paramInt - this.aD0) + i; byte b = 0; int j = this.o4.size(); while (b < j) { jT jT; i = (jT = this.o4.get(b)).mx + jT.iw0; i = Math.max(i, Math.max((this.o4.get(b)).li, paramInt) + i); b++; }  return i; } public final int CQ(int paramInt) { int i = this.Cc0 + this.qR - Math.max(0, paramInt - this.Z0); byte b = 0; int j = this.A60.size(); while (b < j) { jT jT; i = Math.min(i, (jT = this.A60.get(b)).mx - Math.max(jT.ZW, paramInt)); b++; }  return i; } public final int NC0(int paramInt) { return Math.max(this.jy, this.t0 + paramInt); } public final int sL() { return Math.max(0, this.tl - this.gC0 + this.VN); } public final boolean zs0() { return (this.xu0 == this.pb0.size()); } public final void yM(UG paramUG) { if (paramUG != UG.J10) { int i = -1; if (paramUG == UG.nC || paramUG == UG.Pz0) { byte b; int j; for (b = 0, j = this.o4.size(); b < j; ) { jT jT; int k; if ((k = (jT = this.o4.get(b)).RA0) != 32767) i = Math.max(i, jT.dF + k);  b++; }  }  if (paramUG == UG.n00 || paramUG == UG.Pz0) { byte b; int j; for (b = 0, j = this.A60.size(); b < j; ) { jT jT; i = Math.max(i, (jT = this.A60.get(b)).dF + jT.RA0); b++; }  }  OE0(false); if (i >= 0 && i > this.t0) { this.t0 = i;
/*    */         ArrayList<?> arrayList;
/*  3 */         for (i = (arrayList = this.o4).size(); i-- > 0;) { if (((jT)arrayList.get(i)).Ia() <= this.t0) arrayList.remove(i);  }
/*    */         
/*  5 */         for (i = (arrayList = this.A60).size(); i-- > 0;) { if (((jT)arrayList.get(i)).Ia() <= this.t0) arrayList.remove(i);  }
/*  6 */          lo(); }  }  } public final void pr(int paramInt1, int paramInt2, int paramInt3) { if (Math.max(0, CQ(paramInt3) - o70(paramInt2)) < paramInt1) { OE0(false); do { int i = Integer.MAX_VALUE; jT jT; if (!this.o4.isEmpty() && (jT = this.o4.get(this.o4.size() - 1)).RA0 != 32767) i = Math.min(i, jT.Ia());  if (!this.A60.isEmpty()) i = Math.min(i, ((jT)this.A60.get(this.A60.size() - 1)).Ia());  if (i == Integer.MAX_VALUE || i < this.t0) return;  this.t0 = i; ArrayList<?> arrayList; int j; for (j = (arrayList = this.o4).size(); j-- > 0;) { if (((jT)arrayList.get(j)).Ia() <= this.t0) arrayList.remove(j);  }  for (j = (arrayList = this.A60).size(); j-- > 0;) { if (((jT)arrayList.get(j)).Ia() <= this.t0) arrayList.remove(j);  }
/*  7 */          lo(); }
/*  8 */       while (Math.max(0, CQ(paramInt3) - o70(paramInt2)) < paramInt1); }  } public final boolean OE0(boolean paramBoolean) { if (zs0() && (this.Oo || !paramBoolean)) { this.Oo = paramBoolean ^ true; return false; }  int j = sL(); this.SF = Math.min(this.SF, j); j = this.t0; int k = this.pn; if (zs0()) { k = Math.max(k, this.kj); } else { for (int n = this.xu0; n < this.pb0.size(); ) { k = Math.max(k, ((jT)this.pb0.get(n)).RA0); n++; }  jT jT = this.pb0.get(this.pb0.size() - 1); int m = this.VN + this.tl - jT.mx + jT.iw0; int i1; if ((i1 = this.YP.ordinal()) != 1) { if (i1 != 2) { if (i1 == 3 && m < this.tl / 4) { byte b; for (i1 = this.pb0.size() - this.xu0, b = 1; b < i1; ) { int i2 = m * b / (i1 - 1); ((jT)this.pb0.get(this.xu0 + b)).mx += i2; b++; }  }  } else { for (m /= 2, i1 = this.xu0; i1 < this.pb0.size(); ) { ((jT)this.pb0.get(i1)).mx += m; i1++; }  }  } else { for (i1 = this.xu0; i1 < this.pb0.size(); ) { ((jT)this.pb0.get(i1)).mx += m; i1++; }  }  for (m = this.xu0; m < this.pb0.size(); ) { this.Kf.getClass(); jT jT1; e00 e00; switch (((Om0)(jT1 = this.pb0.get(m)).dM.X10.bw0(e00 = e00.VERTICAL_ALIGNMENT).rI(e00)).ordinal()) { case 3: jT1.dF = 0; jT1.RA0 = k; break;case 2: jT1.dF = k - jT1.RA0; break;case 1: jT1.dF = (k - jT1.RA0) / 2; break;
/*  9 */           case 0: jT1.dF = 0; break; }  j = Math.max(j, NC0(jT1.X90 - jT1.dF)); this.Fq = Math.max(this.Fq, jT1.Ia() - k); m++; }  for (m = this.xu0; m < this.pb0.size(); ) { ((jT)this.pb0.get(m)).dF += j; m++; }  }  Zg(j, k); this.pn = 0; this.xu0 = this.pb0.size(); this.Oo = paramBoolean ^ true; int i = j + k; this.jy = Math.max(this.jy, i + this.Fq); this.Fq = 0; this.Ta = 0; ArrayList<?> arrayList; for (j = (arrayList = this.o4).size(); j-- > 0;) { if (((jT)arrayList.get(j)).Ia() <= this.t0) arrayList.remove(j);  }
/*    */     
/* 11 */     for (j = (arrayList = this.A60).size(); j-- > 0;) { if (((jT)arrayList.get(j)).Ia() <= this.t0) arrayList.remove(j);  }
/* 12 */      lo(); return true; }
/*    */ 
/*    */   
/*    */   public final void T1() {
/*    */     OE0(false);
/*    */     yM(UG.Pz0);
/*    */     Zg(this.t0, 0);
/*    */     int i = this.RY.length();
/*    */     char[] arrayOfChar = new char[i];
/*    */     this.RY.getChars(0, i, arrayOfChar, 0);
/*    */   }
/*    */   
/*    */   public final void LpT2(cR paramcR, pe parampe, boolean paramBoolean) {
/*    */     if (parampe != null) {
/*    */       this.kj = ((t90)parampe).getLineHeight();
/*    */     } else {
/*    */       this.kj = 0;
/*    */     } 
/*    */     if (paramBoolean) {
/*    */       OE0(false);
/*    */       this.eS = true;
/*    */     } 
/*    */     if (paramBoolean || (!this.eS && zs0())) {
/*    */       e00 e001 = e00.MARGIN_LEFT;
/*    */       this.qL = Math.max(0, this.Kf.Gf(paramcR, e001, this.qR, 0));
/*    */       e001 = e00.MARGIN_RIGHT;
/*    */       this.ML = Math.max(0, this.Kf.Gf(paramcR, e001, this.qR, 0));
/*    */       this.Kf.getClass();
/*    */       this.YP = (AuX)paramcR.bw0(e001 = e00.HORIZONTAL_ALIGNMENT).rI(e001);
/*    */       lo();
/*    */       int i = this.VN;
/*    */       e00 e002 = e00.TEXT_INDENT;
/*    */       this.gC0 = Math.max(0, this.Kf.Gf(paramcR, e002, this.qR, 0) + i);
/*    */     } 
/*    */     e00 e00 = e00.MARGIN_TOP;
/*    */     this.Ta = Math.max(0, this.Kf.Gf(paramcR, this, this.qR, 0));
/*    */   }
/*    */   
/*    */   public final jT FF(xc paramxc) {
/*    */     this(paramxc);
/*    */     jT.dF = this.t0;
/*    */     jT.mx = this.Cc0;
/*    */     jT.iw0 = this.qR;
/*    */     this.ST.aA0.add(jT);
/*    */     jT jT;
/*    */     return jT = new jT();
/*    */   }
/*    */   
/*    */   public final void Zg(int paramInt1, int paramInt2) {
/*    */     while (this.Xb0 < this.ST.aA0.size()) {
/*    */       int i;
/*    */       this.Xb0 = (i = this.Xb0) + 1;
/*    */       jT jT;
/*    */       if ((jT = this.ST.aA0.get(i)).RA0 == 0) {
/*    */         jT.dF = paramInt1;
/*    */         jT.RA0 = paramInt2;
/*    */       } 
/*    */     } 
/*    */     if (this.xu0 > this.St0)
/*    */       this.RY.append(false).append((char)(this.xu0 - this.St0)); 
/*    */     if (paramInt1 > this.dd0)
/*    */       this.RY.append((char)paramInt1).append(false); 
/*    */     this.dd0 = paramInt1 += paramInt2;
/*    */     this.RY.append((char)paramInt1).append((char)(this.pb0.size() - this.xu0));
/*    */     this.St0 = this.pb0.size();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/yD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */