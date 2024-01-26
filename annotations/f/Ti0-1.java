/* 1 */ package f;public final class Ti0 extends zA implements er { public Ti0(int paramInt, LPT6 paramLPT6) { this
/* 2 */       .COM8 = paramInt; }
/*   */ 
/*   */   
/*   */   public final int COM8;
/*   */   
/*   */   public final int cB0() {
/*   */     return 255;
/*   */   }
/*   */   
/*   */   public final int NC0() {
/*   */     return 0;
/*   */   }
/*   */   
/*   */   public final int getValue() {
/*   */     return this.mq.eT >> this.COM8 & 0xFF;
/*   */   }
/*   */   
/*   */   public final void Hr0(int paramInt) {
/*   */     int i = this.COM8;
/*   */     this.mq.Yy0(this.mq.eT & (255 << i ^ 0xFFFFFFFF) | paramInt << i);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ti0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */