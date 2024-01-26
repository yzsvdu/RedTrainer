/* 1 */ package f;public final class lM extends Cd0 implements Iterable, Iterator { public final Object next() { if (this.zb0) { if (this.SJ) { LF0 lF0; long[] arrayOfLong = (lF0 = this.Mp).j3; int i; if ((i = this.EY) == -1) { this.ka.o10 = 0L; this.ka.Pn = lF0.uv; } else { this.ka.o10 = arrayOfLong[i]; this.ka.Pn = lF0.L8[i]; }  this.pF0 = i; hn(); return this.ka; }  throw new JU("#iterator() cannot be used nested."); }  throw new NoSuchElementException(); }
/*   */ 
/*   */   
/*   */   public final dq0 ka;
/*   */   
/*   */   public lM(LF0 paramLF0) {
/*   */     super(paramLF0);
/*   */     dq0 dq01;
/*   */     this();
/*   */     this.ka = this;
/*   */   }
/*   */   
/*   */   public final boolean hasNext() {
/*   */     if (this.SJ)
/*   */       return this.zb0; 
/*   */     throw new JU("#iterator() cannot be used nested.");
/*   */   }
/*   */   
/*   */   public final Iterator iterator() {
/*   */     return this;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/lM.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */