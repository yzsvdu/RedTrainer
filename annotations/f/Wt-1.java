/* 1 */ package f;public final class Wt implements Iterator { public final Object next() { long l; if ((l = this.kf.getAndIncrement()) < this.rt) return this.tk.XW.vo0(l);  throw new NoSuchElementException(); }
/*   */ 
/*   */   
/*   */   public AtomicLong kf = new AtomicLong(0L);
/*   */   public long rt;
/*   */   
/*   */   public Wt(Hi paramHi) {
/*   */     this.rt = paramHi.Fk0().longValueExact();
/*   */   }
/*   */   
/*   */   public final void remove() {
/*   */     throw new UnsupportedOperationException();
/*   */   }
/*   */   
/*   */   public final boolean hasNext() {
/*   */     return (this.kf.get() < this.rt);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Wt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */