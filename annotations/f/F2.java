/* 1 */ package f;public final class F2 extends Kl0 { public final void sM() { this
/* 2 */       .Bm = this.Ws.get();
/*   */     
/* 4 */     this.DL = this.Ws.getShort();
/*   */     
/* 6 */     this.AH0 = this.Ws.get(); }
/*   */ 
/*   */   
/*   */   public byte Bm;
/*   */   public short DL;
/*   */   public byte AH0;
/*   */   
/*   */   public F2(c4 paramc4, ByteBuffer paramByteBuffer) {
/*   */     super(paramc4, paramByteBuffer);
/*   */   }
/*   */   
/*   */   public final void Cx() {
/*   */     boolean bool;
/*   */     VD0 vD0 = km.pm0;
/*   */     byte b = this.Bm;
/*   */     short s = this.DL;
/*   */     if (this.AH0 != 0) {
/*   */       bool = true;
/*   */     } else {
/*   */       bool = false;
/*   */     } 
/*   */     U00(b, s, bool, false);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/F2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */