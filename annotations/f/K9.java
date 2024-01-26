/* 1 */ package f;public final class K9 implements Iterator { public final Object next() { long l; if ((l = this.xo0.getAndIncrement()) <= this.V30) { int i = (int)l;
/* 2 */       return new o80(i); }
/* 3 */      throw new NoSuchElementException(); }
/*   */ 
/*   */   
/*   */   public final AtomicLong xo0;
/*   */   public final long V30;
/*   */   
/*   */   public K9(Gi0 paramGi0) {
/*   */     this.xo0 = new AtomicLong(paramGi0.PRN.lpt9());
/*   */     this.V30 = paramGi0.Jd0.lpt9();
/*   */   }
/*   */   
/*   */   public final void remove() {
/*   */     throw new UnsupportedOperationException();
/*   */   }
/*   */   
/*   */   public final boolean hasNext() {
/*   */     return (this.xo0.get() <= this.V30);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/K9.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */