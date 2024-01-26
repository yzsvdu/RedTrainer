/*   */ package f;public final class e2 { public final String toString() {
/* 2 */     return B40.df("MS Left: ").append(this.jn0 - System.currentTimeMillis()).toString();
/*   */   }
/*   */   
/*   */   public int qi0;
/*   */   public long jn0 = 0L;
/*   */   
/*   */   public e2(int paramInt) {
/*   */     this.qi0 = paramInt;
/*   */   }
/*   */   
/*   */   public final synchronized boolean Po0() {
/*   */     if (System.currentTimeMillis() < this.jn0)
/*   */       return false; 
/*   */     this.jn0 = System.currentTimeMillis() + this.qi0;
/*   */     return true;
/*   */   }
/*   */   
/*   */   public final boolean By0() {
/*   */     if (System.currentTimeMillis() < this.jn0)
/*   */       return false; 
/*   */     this.jn0 = System.currentTimeMillis() + this.qi0;
/*   */     return true;
/*   */   }
/*   */   
/*   */   public final e2 T30() {
/*   */     this.jn0 = System.currentTimeMillis() + this.qi0;
/*   */     return this;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/e2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */