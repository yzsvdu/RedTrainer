/* 1 */ package f;public final class Ej0 extends Kl0 { public final void sM() { this
/* 2 */       .HZ = this.Ws.get();
/*   */     
/* 4 */     this.fc0 = this.Ws.getShort();
/*   */     
/* 6 */     this.rs = this.Ws.get(); }
/*   */ 
/*   */   
/*   */   public byte HZ;
/*   */   public short fc0;
/*   */   public byte rs;
/*   */   
/*   */   public Ej0(c4 paramc4, ByteBuffer paramByteBuffer) {
/*   */     super(paramc4, paramByteBuffer);
/*   */   }
/*   */   
/*   */   public final void Cx() {
/*   */     short s;
/*   */     if ((s = this.fc0) < 0) {
/*   */       km.pm0.NR();
/*   */       return;
/*   */     } 
/*   */     switch (this.rs) {
/*   */       default:
/*   */         return;
/*   */       case 3:
/*   */         D0.lPt1(s, 0.6F, 0.0F, true);
/*   */       case 2:
/*   */         D0.MJ0(s);
/*   */       case 1:
/*   */         km.pm0.Yt0(this.HZ, s);
/*   */       case 0:
/*   */         break;
/*   */     } 
/*   */     km.pm0.bL(this.HZ, s);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ej0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */