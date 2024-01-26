/* 1 */ package f;public final class a0 extends hO { public final YA0 mG0; public mc[] sR; public p30 kK0; public final boolean RW(int paramInt) { mc mc1; if (h1.J20(paramInt, BM.M8)) { int j; if (((j = this.gn0) + 1) % this.cV != 0) this.gn0 = j + 1;  } else if (h1.J20(paramInt, BM.Oq)) { int j; if (((j = this.gn0) + 1) % this.cV != 1) this.gn0 = j - 1;  } else if (h1.J20(paramInt, BM.ni)) { int j; int k; if ((j = this.gn0) - (k = this.cV) >= 0) this.gn0 = j - k;  } else { int j; int k; if (h1.J20(paramInt, BM.N70) && (j = this.gn0) + (k = this.cV) < this.sR.length) this.gn0 = j + k;  }  int i; mc[] arrayOfMc; if ((i = this.gn0) >= 0 && i < (arrayOfMc = this.sR).length) VA0.c90(arrayOfMc[i]);  if (h1.J20(paramInt, BM.bC) && p3()) { if ((mc1 = this.sR[this.gn0]).kN)
/*   */       {
/*   */         
/* 4 */         hm.Fz0(this.TG0.oh0); }  return true; }
/* 5 */      if (h1.J20(paramInt, BM.lc)) C40((byte)-1);  return true; } public int gn0; public int cV; public a0(byte paramByte, j40 paramj40) { super(paramByte, Aq.hE0); this(); this.mG0 = yA0; this.cV = 2; Xu("messagebox"); YA0 yA0; (yA0 = new YA0()).Xu("msgbox-move-selection-panel"); (new YA0()).Zf0(true); this.sR = new mc[4]; byte b; mc[] arrayOfMc; for (b = 0; b < (arrayOfMc = this.sR).length; b = (byte)(b + 1)) { mc mc1; this("", ""); arrayOfMc[b] = mc1; this.sR[b].Xu("msgbox-move-selection-button"); this.sR[b].C70(et.COM2); }  for (b = 0; b < this.sR.length; b = (byte)(b + 1)) { WD wD = yk0.cw().mP(paramj40.eC().Fp0(b)); if (paramj40.eC().Fp0(b) < 1 || wD == null) { this.sR[b].s6("--"); this.sR[b].Ep0(""); this.sR[b].sk0(false); this.sR[b].CW().H(); this.sR[b].Gq0(null); } else { this.sR[b].sk0(true); this.sR[b].Ep0(rG0.oV(wD)); this.sR[b].s6(wD.cW()); this.sR[b].CW().Pn(new pe0[] { interface.ZZ().xk0(wD.Fn(paramj40.eC()).oI()) }); if (km.XU()) { this.sR[b].CW().zT(193, 18); this.sR[b].CW().Ii0(2.0F); } else { this.sR[b].CW().zT(182, 10); this.sR[b].Gq0(w50.Ii0(wD, paramj40)); }  this.sR[b].tW(() -> C40((byte)(paramByte + 1))); }  }  if (km.XU()) { p30 p301; this("", 80, 80); this.kK0 = p301; } else { this.kK0 = new p30(Ml0.OH0(53), 106, 30); }  this.kK0.Xu("msgbox-return"); this.kK0.tW(() -> C40((byte)-1)); this.mG0.ZE().fA0(this.sR[0]); this.mG0.J8(this.sR[1]); this.mG0.ZE().fA0(this.sR[2]); this.mG0.J8(this.sR[3]); this.mG0.J8(this.kK0); if (km.XU()) { this.mG0.Dv0.F(4.0F); this.mG0.Dv0.Ve0(4.0F); this.mG0.Dv0.to(10.0F); this.mG0.Dv0.Ty0(10.0F); } else { this.mG0.Dv0.Dl0(10.0F); }  J8(this.mG0); } public final boolean Cs0() { return false; } public final void d40() { if (km.Nr()) { this.kK0.uh0(106, 24); } else { this.kK0.Tm(72, 72); }  mM(); this.mG0.mM(); ME(km.wI0.dG() / 2 - this.xY / 2, km.wI0.k1() / 2 - this.HC / 2); }
/*   */ 
/*   */   
/*   */   public final boolean Eq() {
/*   */     return false;
/*   */   }
/*   */   
/*   */   public final void SB0(int paramInt1, int paramInt2) {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/a0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */