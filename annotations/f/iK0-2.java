/* 1 */ package f;public final class iK0 implements Iterator { public final Object next() { this.NZ = c9; this.Qo0 = c9.Nk0; C9 c9; return c9 = this.Qo0; }
/*   */ 
/*   */   
/*   */   public C9 Qo0;
/*   */   public C9 NZ;
/*   */   
/*   */   public iK0(Sn0 paramSn0) {}
/*   */   
/*   */   public final boolean hasNext() {
/*   */     return (this.Qo0 != null);
/*   */   }
/*   */   
/*   */   public final void remove() {
/*   */     C9 c9;
/*   */     if ((c9 = this.NZ) != null) {
/*   */       Sn0 sn0;
/*   */       if (c9 == (sn0 = this.C7).iN) {
/*   */         sn0.iN = this.Qo0;
/*   */       } else {
/*   */         C9 c91 = c9.Jv0;
/*   */         this.Nk0 = c9;
/*   */         if ((c9 = this.Qo0) != null)
/*   */           c9.Jv0 = this; 
/*   */       } 
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/iK0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */