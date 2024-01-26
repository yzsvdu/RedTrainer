/* 1 */ package f;public abstract class lZ extends Un implements r60 { public final boolean i2(oa0 paramoa0) { int i; if (this.aJ0 && 
/* 2 */       B8.Wm0(paramoa0.cz0) && (
/* 3 */       i = paramoa0.GG0) >= 0 && i <= 255)
/* 4 */     { Ym0(i); this.aJ0 = false; Ln0 = null; return true; }  if (paramoa0
/* 5 */       .vl == 1 && paramoa0
/* 6 */       .cz0 == 4)
/* 7 */       Ym0(0);  return super.i2(paramoa0); }
/*   */ 
/*   */   
/*   */   public static lZ Ln0;
/*   */   public int dt0;
/*   */   public boolean aJ0 = false;
/*   */   
/*   */   public lZ(BM paramBM) {
/*   */     Xu("button");
/*   */     Ym0(paramBM.y0());
/*   */     tW(this::rI);
/*   */   }
/*   */   
/*   */   public final void rI() {
/*   */     lZ lZ1;
/*   */     if ((lZ1 = Ln0) != null) {
/*   */       lZ1.Ym0(-1);
/*   */       Ln0 = null;
/*   */       return;
/*   */     } 
/*   */     s6(Ml0.OH0(1323));
/*   */     this.aJ0 = true;
/*   */     Ln0 = this;
/*   */   }
/*   */   
/*   */   public final void GD() {
/*   */     if (this.aJ0) {
/*   */       Ym0(-1);
/*   */       this.aJ0 = false;
/*   */       Ln0 = null;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void ED0(throws paramthrows) {
/*   */     if (this.aJ0) {
/*   */       Ym0(-1);
/*   */       Ln0 = null;
/*   */     } 
/*   */     super.ED0(paramthrows);
/*   */   }
/*   */   
/*   */   public abstract void Ym0(int paramInt); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/lZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */