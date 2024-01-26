/* 1 */ package f;public final class Z80 extends Kl0 { public final void sM() { boolean bool; this
/* 2 */       .Ma0 = this.Ws.get();
/* 3 */     if (this.Ws.get() == 1) { bool = true; } else { bool = false; }  this
/* 4 */       .Ux0 = bool; }
/*   */ 
/*   */   
/*   */   public byte Ma0;
/*   */   public boolean Ux0;
/*   */   
/*   */   public Z80(c4 paramc4, ByteBuffer paramByteBuffer) {
/*   */     super(paramc4, paramByteBuffer);
/*   */   }
/*   */   
/*   */   public final void Cx() {
/*   */     ro ro = r8();
/*   */     byte b = this.Ma0;
/*   */     KI kI;
/*   */     boolean bool;
/*   */     if ((bool = this.Ux0) && (kI = this.Qa.Jr0()) != null)
/*   */       this.lpT1 = bool; 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Z80.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */