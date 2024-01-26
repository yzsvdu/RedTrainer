/* 1 */ package f;public class F90 implements Iterator { public final zb0 gZ; public final zb0 sk; public F90(zb0 paramzb0) { this.sk = paramzb0; this
/*   */       
/* 3 */       .WJ = paramzb0.ir0; this.Go = paramzb0.FH(); this.gZ = paramzb0;
/* 4 */     this.kK0 = paramzb0; } public int WJ; public int Go; public final zb0 kK0; public Object r70(int paramInt) { Object object; return ((object = this.kK0.QG0[paramInt]) == zb0.IM || this == zb0.ET) ? null : this; } public final void NJ() { zb0 zb01; if (this.WJ == (zb01 = this.sk).ir0) try { zb01.IC = true; zb01.Cn0(this.Go); this.sk.IC = false; return; }
/* 5 */       finally { this.sk
/* 6 */           .IC = false; }
/* 7 */         throw new ConcurrentModificationException(); } public final Object i0() { if (this.WJ == this.sk.ir0) { int i; Object object; for (Object[] arrayOfObject = this.gZ.QG0; i-- > 0 && ((object = arrayOfObject[i]) == zb0.IM || object == zb0.ET);); this.Go = i; if (i >= 0) return r70(i);  throw new NoSuchElementException(); }  throw new ConcurrentModificationException(); }
/*   */ 
/*   */   
/*   */   public final boolean Ol0() {
/*   */     if (this.WJ == this.sk.ir0) {
/*   */       int i;
/*   */       Object object;
/*   */       for (Object[] arrayOfObject = this.gZ.QG0; i-- > 0 && ((object = this[i]) == zb0.IM || object == zb0.ET););
/*   */       return (i >= 0);
/*   */     } 
/*   */     throw new ConcurrentModificationException();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/F90.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */