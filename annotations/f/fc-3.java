/* 1 */ package f;public final class fc extends Kl0 { public final void sM() { boolean bool; this
/* 2 */       .wm0 = this.Ws.getInt();
/*   */     
/* 4 */     this.DE0 = this.Ws.getShort();
/*   */     
/* 6 */     this.FB = this.Ws.get(); if (R00() != 0) { bool = true; } else { bool = false; }  this.vp0 = bool; }
/*   */ 
/*   */   
/*   */   public int wm0;
/*   */   public short DE0;
/*   */   public byte FB;
/*   */   public boolean vp0;
/*   */   
/*   */   public fc(c4 paramc4, ByteBuffer paramByteBuffer) {
/*   */     super(paramc4, paramByteBuffer);
/*   */   }
/*   */   
/*   */   public final void Cx() {
/*   */     vh0 vh0 = (r8()).Qa;
/*   */     int i = this.wm0;
/*   */     short s = this.DE0;
/*   */     byte b = this.FB;
/*   */     boolean bool = this.vp0;
/*   */     tc tc;
/*   */     Jo jo;
/*   */     if ((this.yD == i) ? ((jo = this.Ct) == null) : ((tc = (tc)((vh0)this).KO.get(Integer.valueOf(i))) == null))
/*   */       WC(s, bool, b); 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/fc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */