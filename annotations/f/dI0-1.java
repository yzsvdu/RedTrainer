/* 1 */ package f;public final class dI0 implements Iterator { public final Object next() { eL eL1; if ((eL1 = this.ZC0) != null)
/* 2 */     { this
/*   */         
/* 4 */         .ZC0 = eL1.aF; return eL1.F2; }  throw new NoSuchElementException(); }
/*   */ 
/*   */   
/*   */   public eL ZC0;
/*   */   
/*   */   public dI0(eL parameL) {
/*   */     this.ZC0 = parameL;
/*   */   }
/*   */   
/*   */   public final boolean hasNext() {
/*   */     return (this.ZC0 != null);
/*   */   }
/*   */   
/*   */   public final void remove() {
/*   */     throw new UnsupportedOperationException("Not supported");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/dI0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */