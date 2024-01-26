/* 1 */ package f;public final class SG extends Kl0 { public final void sM() { boolean bool; if (R00() == 1) { bool = true; } else { bool = false; }  this.MY = bool; this
/* 2 */       .ZF = this.Ws.getLong(); if (!this.MY) this.Fn0 = au();  this.be0 = System.currentTimeMillis() - this.ZF; }
/*   */ 
/*   */   
/*   */   public boolean MY;
/*   */   public long ZF;
/*   */   public long be0;
/*   */   public String Fn0 = "";
/*   */   
/*   */   public SG(c4 paramc4, ByteBuffer paramByteBuffer) {
/*   */     super(paramc4, paramByteBuffer);
/*   */   }
/*   */   
/*   */   public final void Dl0() {
/*   */     if (this.MY) {
/*   */       dr0(new ce(this.ZF, true));
/*   */       return;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void Cx() {
/*   */     if (this.MY)
/*   */       return; 
/*   */     String str = Ml0.sB((this.Fn0.isEmpty() ^ true) + 6776, new String[] { this.be0 + "", this.Fn0 });
/*   */     r8().Sg(new Mv0(ZY.ih, 0, "", null, (byte)0, this));
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/SG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */