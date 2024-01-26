/* 1 */ package f;public final class vD extends IN { public final void V90(throws paramthrows) { float f1; float f2; if ((f1 = this.Yp) != (
/* 2 */       f2 = this.nB) && this.yW + 10L < 
/* 3 */       zm0.u20) { super
/* 4 */         .Nu(Math.min(f1 + 0.01F, f2));
/*   */       
/* 6 */       this.yW = zm0.u20; }  super.V90(paramthrows); }
/*   */ 
/*   */   
/*   */   public float nB = 0.0F;
/*   */   public long yW = 0L;
/*   */   
/*   */   public vD() {
/*   */     Nu(0.0F);
/*   */     Xu("smoothprogressbar");
/*   */   }
/*   */   
/*   */   public final void Nu(float paramFloat) {
/*   */     if (paramFloat == 0.0F)
/*   */       super.Nu(0.0F); 
/*   */     this.nB = paramFloat;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/vD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */