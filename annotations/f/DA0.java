/* 1 */ package f;public abstract class DA0 { public final EU SY; public int ik; public final boolean hasNext() { EU eU; if (this.ik == (eU = this.SY)
/* 2 */       .ir0)
/* 3 */     { int i; for (byte[] arrayOfByte = eU.JO; i-- > 0 && this[i] != 1;); return (i >= 0); }  throw new ConcurrentModificationException(); } public int Hb0; public DA0(EU paramEU) { this.SY = paramEU; this.ik = paramEU.size(); this.Hb0 = paramEU.FH(); } public void remove() { EU eU; if (this.ik == (eU = this.SY).ir0) try { eU.IC = true; eU.Id(this.Hb0); this.SY
/* 4 */           .IC = false; return; }
/* 5 */       finally { this.SY
/* 6 */           .IC = false; }
/* 7 */         throw new ConcurrentModificationException(); }
/*   */ 
/*   */   
/*   */   public final void K1() {
/*   */     EU eU;
/*   */     if (this.ik == (eU = this.SY).ir0) {
/*   */       int i;
/*   */       for (byte[] arrayOfByte = eU.JO; i-- > 0 && arrayOfByte[i] != 1;);
/*   */       this.Hb0 = i;
/*   */       if (i >= 0)
/*   */         return; 
/*   */       throw new NoSuchElementException();
/*   */     } 
/*   */     throw new ConcurrentModificationException();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/DA0.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */