/* 1 */ package f;public class hk extends zv0 { public float NO = 14.0F; public float TP = -1.0F; public float og0 = -1.0F; public int Ft0 = -1; public int dQ; public final boolean LPt8(iW paramiW, float paramFloat1, float paramFloat2, int paramInt1, int paramInt2) { if (this.lpt9) return false;  int i; if (paramInt1 == 0 && (i = this.dQ) != -1 && paramInt2 != i) return false;  this.lpt9 = true; this.Ft0 = paramInt1; this.TP = paramFloat1; this.og0 = paramFloat2; this
/* 2 */       .PS = System.currentTimeMillis() + (long)100.0F; return true; } public boolean lpt9; public boolean sw; public long PS; public hk() {} public hk(int paramInt) { this.dQ = paramInt; } public final void Si(iW paramiW, float paramFloat1, float paramFloat2, int paramInt) { if (paramInt == this.Ft0) { if (!(this.lpt9 = ID0(paramiW.Kx, paramFloat1, paramFloat2))) { this
/* 3 */           .TP = -1.0F; this.og0 = -1.0F; }  return; }  } public final void ga(iW paramiW, float paramFloat1, float paramFloat2, int paramInt1, int paramInt2) { if (paramInt1 == this.Ft0) { boolean bool; int i; if ((bool = ID0(paramiW.Kx, paramFloat1, paramFloat2)) && paramInt1 == 0 && (i = this.dQ) != -1 && paramInt2 != i) bool = false;  if (bool) { System.nanoTime();
/* 4 */         uw0(); }  this.lpt9 = false; this.Ft0 = -1; }
/*   */      }
/*   */ 
/*   */   
/*   */   public final void HT(int paramInt) {
/*   */     if (paramInt == -1)
/*   */       this.sw = true; 
/*   */   }
/*   */   
/*   */   public final void zn0(int paramInt) {
/*   */     if (paramInt == -1)
/*   */       this.sw = false; 
/*   */   }
/*   */   
/*   */   public void uw0() {}
/*   */   
/*   */   public final boolean ID0(eF0 parameF0, float paramFloat1, float paramFloat2) {
/*   */     eF0 eF01;
/*   */     if ((eF01 = parameF0.QI0(paramFloat1, paramFloat2, true)) != null) {
/*   */       boolean bool;
/*   */       while (true) {
/*   */         if (eF01 == parameF0) {
/*   */           bool = true;
/*   */           break;
/*   */         } 
/*   */         if ((eF01 = eF01.rK0) == null) {
/*   */           bool = false;
/*   */           break;
/*   */         } 
/*   */       } 
/*   */       if (bool)
/*   */         return true; 
/*   */     } 
/*   */     float f;
/*   */     return (((f = this.TP) != -1.0F || this.og0 != -1.0F) && Math.abs(paramFloat1 - f) < this.NO && Math.abs(paramFloat2 - this.og0) < this.NO);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/hk.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */