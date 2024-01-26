/*   */ package f;public abstract class WC extends JG0 implements Runnable { public final boolean i2(oa0 paramoa0) { int i;
/* 2 */     if ((i = Zk0.yE(paramoa0.cz0)) != 2 && i != 5) { if (i != 7)
/* 3 */       { if (B8.Pg(paramoa0.cz0)) return true; 
/* 4 */         return super.i2(paramoa0); }  return false; }
/*   */ 
/*   */ 
/*   */     
/* 8 */     lD0(paramoa0.aK - RS(), paramoa0.gk0 - e3()); return true; }
/*   */ 
/*   */   
/*   */   public pE Kk;
/*   */   public mX QC0;
/*   */   public boolean j8;
/*   */   
/*   */   public final void Xw(nY paramnY) {
/*   */     super.Xw(paramnY);
/*   */     this.QC0 = ((q80)paramnY).w2("cursor");
/*   */   }
/*   */   
/*   */   public abstract void lD0(int paramInt1, int paramInt2);
/*   */   
/*   */   public final void jA0() {
/*   */     super.jA0();
/*   */     pE pE1;
/*   */     if ((pE1 = this.Kk) != null) {
/*   */       pE1.destroy();
/*   */       this.Kk = null;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void run() {
/*   */     this.j8 = true;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/WC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */