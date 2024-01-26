/*   */ package f;
/*   */ public final class dN extends N50 {
/*   */   public final ZH ys0() {
/* 4 */     int i = this.Gz0.wJ.nz(uq.nj); s40 s401 = this.Gz0; ZH zH1 = this.KQ.wQ(aM0.Ij0.Fo0(1, i, s401)); Uc uc = Uc.xi0; this(16, 16, uc); ZH zH2; for (byte b = 0; b < 4; ) { byte b1, b2; if (b == 0 || b == 2) { b1 = 0; } else { b1 = 8; }  if (b == 2 || b == 3) { b2 = 8; } else { b2 = 0; }  for (byte b3 = 0; b3 < 8; ) { for (byte b4 = 0; b4 < 8; ) { int j = b3 + b1, k = b4 + b2, m = b * 8 + b4 + this.qj;
/* 5 */           m = zH1.Con.Fl(b3, m);
/* 6 */           zH2.Con.YO(j, k, m); b4++; }  b3++; }  b++; }  zH1
/* 7 */       .dispose();
/*   */     return zH2;
/*   */   }
/*   */   
/*   */   public dN(Wf paramWf, s40 params40, int paramInt) {}
/*   */ }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/dN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */