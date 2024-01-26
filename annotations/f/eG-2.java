/* 1 */ package f;public final class eG extends wJ { public final void Yb(int paramInt1, int paramInt2) { this.Mg0 = paramInt1; this.v2 = paramInt2; this
/* 2 */       .e60 = Math.min(paramInt1, paramInt2); this.Rh0 = Math.max(paramInt1, paramInt2); this.Va.clear(); this.Va.set(this.e60, this.Rh0 + 1); }
/*   */ 
/*   */   
/*   */   public final BitSet Va;
/*   */   public int e60;
/*   */   public int Rh0;
/*   */   
/*   */   public eG() {
/*   */     BitSet bitSet;
/*   */     this();
/*   */     this.Va = this;
/*   */     this.e60 = Integer.MAX_VALUE;
/*   */     this.Rh0 = Integer.MIN_VALUE;
/*   */   }
/*   */   
/*   */   public final void uh(int paramInt) {
/*   */     if (this.Va.get(paramInt)) {
/*   */       this.Va.clear(paramInt);
/*   */       int i;
/*   */       if (paramInt == (i = this.e60) && (this.e60 = this.Va.nextSetBit(i + 1)) < 0) {
/*   */         this.e60 = Integer.MAX_VALUE;
/*   */         this.Rh0 = Integer.MIN_VALUE;
/*   */         return;
/*   */       } 
/*   */       if (paramInt == this.Rh0)
/*   */         do {
/*   */           this.Rh0 = paramInt;
/*   */         } while ((paramInt = this.Rh0 - 1) >= this.e60 && !this.Va.get(paramInt)); 
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/eG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */