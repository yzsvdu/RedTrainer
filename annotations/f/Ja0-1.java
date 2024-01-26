/*   */ package f;public final class Ja0 implements I7 { public final int lh0() { throws throws;
/* 2 */     if ((throws = this.V00.Bo0) != null) { if (this
/* 3 */         .js) { this.js = false; this
/*   */           
/* 5 */           .OC0 = throws.fC; }
/*   */       
/* 7 */       return (int)(throws.fC - this.OC0) & Integer.MAX_VALUE; }  return 0; }
/*   */ 
/*   */   
/*   */   public final JG0 V00;
/*   */   public long OC0;
/*   */   public boolean js;
/*   */   
/*   */   public Ja0(JG0 paramJG0) {
/*   */     if (paramJG0 != null) {
/*   */       this.V00 = paramJG0;
/*   */       PI0();
/*   */       return;
/*   */     } 
/*   */     throw new NullPointerException("owner");
/*   */   }
/*   */   
/*   */   public final void PI0() {
/*   */     throws throws;
/*   */     if ((throws = this.V00.Bo0) != null) {
/*   */       this.OC0 = throws.fC;
/*   */       this.js = false;
/*   */     } else {
/*   */       this.js = true;
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ja0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */