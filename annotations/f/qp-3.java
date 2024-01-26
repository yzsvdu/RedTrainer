/* 1 */ package f;public final class qp implements iq0 { public final void dispose() { if (!this.mg0) return;  byte b; int i; for (b = 0, i = this.xR.Z8; b < i; ) {
/* 2 */       for (Hc0 hc0 = ((iB0)this.xR.get(b)).Op.r30(); hc0.hasNext();) ((Ui0)hc0.next())
/* 3 */           .G3
/* 4 */           .dispose();  b++;
/*   */     }  }
/*   */ 
/*   */   
/*   */   public final fQ xR;
/*   */   public boolean mg0;
/*   */   
/*   */   public qp() {
/*   */     fQ fQ1;
/*   */     this(8);
/*   */     this.xR = this;
/*   */   }
/*   */   
/*   */   public qp(qp paramqp) {
/*   */     this.xR = new fQ(true, paramqp.xR.Z8);
/*   */     byte b = 0;
/*   */     int i = paramqp.xR.Z8;
/*   */     while (b < i) {
/*   */       this.xR.Com3(LpT6((iB0)paramqp.xR.get(b)));
/*   */       b++;
/*   */     } 
/*   */   }
/*   */   
/*   */   public static iB0 LpT6(iB0 paramiB0) {
/*   */     return new iB0(paramiB0);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/qp.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */