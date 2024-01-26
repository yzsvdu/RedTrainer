/* 1 */ package f;public final class lpT7 implements qd0 { public final eo J1; public boolean K; public final eo K10; public boolean ZU; public final void reset() { this.J1.TG0(0.0F, 0.0F, 0.0F); this.K10.TG0(0.0F, 1.0F, 0.0F); this.bE0.set(1.0F, 1.0F, 1.0F, 1.0F); float f = 0.0F; this.Oe0.x = 0.0F; this.Oe0
/* 2 */       .y = f; } public final Color bE0; public boolean XR; public final NC0 Oe0; public boolean nB0; public lpT7() { eo eo1; Color color; NC0 nC0; this(); this.J1 = this; this(0.0F, 1.0F, 0.0F); this.K10 = this; this(1.0F, 1.0F, 1.0F, 1.0F); this.bE0 = this; this(); this.Oe0 = this; } public final lpT7 Ma(eo parameo1, eo parameo2) { boolean bool1, bool2; reset(); if (parameo1 != null) { bool2 = true; } else { bool2 = false; }  this.K = bool2; if (bool2) { eo1.getClass(); float f1 = parameo1.x, f2 = parameo1.y, f3 = parameo1.z; eo eo1; (eo1 = this.J1).TG0(f1, f2, f3); }  if (parameo2 != null) { bool1 = true; } else { bool1 = false; }  this.ZU = bool1; if (bool1) { eo1.getClass();
/* 3 */       float f1 = parameo2.x, f2 = parameo2.y, f3 = parameo2.z; eo eo1; (eo1 = this.K10).TG0(f1, f2, f3); }  this
/* 4 */       .XR = false; this.nB0 = false;
/*   */     return this; }
/*   */ 
/*   */   
/*   */   public final lpT7 u(float paramFloat1, float paramFloat2) {
/*   */     this.Oe0.x = paramFloat1;
/*   */     this.Oe0.y = paramFloat2;
/*   */     this.nB0 = true;
/*   */     return this;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/lpT7.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */