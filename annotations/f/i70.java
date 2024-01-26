/* 1 */ package f;public final class i70 extends yp0 { public kf rT; public hm0 a; public hm0 Xf0; public hR Wa0; public final boolean Ie() { km.wI0.K7
/* 2 */       .getClass(); if (km.wI0.K7 instanceof r30)
/* 3 */       return true;  if (this
/* 4 */       .a == null && this.Xf0 == null) return true;  wb wb1; return ((wb1 = this.nL) != null && cw()); } public byte T6; public wb nL; public boolean T9; public i70(kf paramkf, hm0 paramhm01, hm0 paramhm02, hR paramhR, byte paramByte, boolean paramBoolean) { this.rT = paramkf; this.a = paramhm01; this.Xf0 = paramhm02; this.Wa0 = paramhR; this.T6 = paramByte; this.T9 = paramBoolean; } public final void wL() { if (this.a == null) this.a = this.Xf0;  km.wI0.K7.getClass(); if (km.wI0.K7 instanceof r30) return;  if (this.T9) { kf kf1 = this.rT; hR hR1 = this.Wa0; this.nL = (new Aj0(kf1, this.a)).SK(this.Xf0).pI0(hR1, this.T6); } else { hm0 hm01 = this.Xf0; Runnable runnable = () -> { if (this.Wa0 != null) UB0.Kg0.fN(());  }; this.nL = (new MY(hm01, 0.0F, runnable)).O3(); }
/* 5 */      km.wI0.K7
/*   */       
/* 7 */       .u4 = this.nL; }
/*   */ 
/*   */   
/*   */   public final int zE() {
/*   */     return 2;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/i70.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */