/* 1 */ package f;public final class y5 implements Iterable, Iterator { public final Object next() { int i; eM eM1; if ((i = this.HC) < (eM1 = this.A7).uJ0) { if (this.K6) { this.hE0.Lb = eM1.Jo[i]; this.HC = i + 1; this.hE0.mm = eM1.WD0[i]; return this.hE0; }  throw new JU("#iterator() cannot be used nested."); }  throw new NoSuchElementException(String.valueOf(this.HC)); }
/*   */ 
/*   */   
/*   */   public final eM A7;
/*   */   public yO hE0;
/*   */   public int HC;
/*   */   public boolean K6;
/*   */   
/*   */   public y5(eM parameM) {
/*   */     yO yO1;
/*   */     this();
/*   */     this.hE0 = this;
/*   */     this.K6 = true;
/*   */     this.A7 = parameM;
/*   */   }
/*   */   
/*   */   public final boolean hasNext() {
/*   */     if (this.K6)
/*   */       return (this.HC < this.A7.uJ0); 
/*   */     throw new JU("#iterator() cannot be used nested.");
/*   */   }
/*   */   
/*   */   public final Iterator iterator() {
/*   */     return this;
/*   */   }
/*   */   
/*   */   public final void remove() {
/*   */     int i = this.HC - 1;
/*   */     this.A7.SB(i);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/y5.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */