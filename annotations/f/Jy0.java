/* 1 */ package f;public final class Jy0 implements Iterator, Iterable { public final Object next() { this.yg = bM01; bM0 bM01; if ((bM01 = this.Qk) != null) { this.Qk = bM01.H7; return bM01; }  throw new NoSuchElementException(); }
/*   */ 
/*   */   
/*   */   public bM0 Qk;
/*   */   public bM0 yg;
/*   */   
/*   */   public Jy0(bM0 parambM0) {
/*   */     this.Qk = parambM0.Rr0;
/*   */   }
/*   */   
/*   */   public final boolean hasNext() {
/*   */     return (this.Qk != null);
/*   */   }
/*   */   
/*   */   public final void remove() {
/*   */     bM0 bM01;
/*   */     bM0 bM02;
/*   */     if ((bM02 = (bM01 = this.yg).Go0) == null) {
/*   */       bM01 = this.CO;
/*   */       bM01.Rr0 = bM02;
/*   */       if ((bM02 = bM01.H7) != null)
/*   */         bM02.Go0 = null; 
/*   */     } else {
/*   */       bM02.H7 = bM01.H7;
/*   */       if ((bM01 = bM01.H7) != null)
/*   */         bM01.Go0 = bM02; 
/*   */     } 
/*   */     this.CO.LG--;
/*   */   }
/*   */   
/*   */   public final Iterator iterator() {
/*   */     return this;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Jy0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */