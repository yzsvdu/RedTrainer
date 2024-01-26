/* 1 */ package f;public final class Ps extends Kl0 { public final void sM() { this
/* 2 */       .Dx0 = this.Ws.get();
/*   */     
/* 4 */     this.px0 = this.Ws.get();
/*   */     
/* 6 */     this.v2 = this.Ws.get();
/*   */     
/* 8 */     this.COM3 = this.Ws.getShort(); }
/*   */ 
/*   */   
/*   */   public byte Dx0;
/*   */   public byte px0;
/*   */   public byte v2;
/*   */   public short COM3;
/*   */   
/*   */   public Ps(c4 paramc4, ByteBuffer paramByteBuffer) {
/*   */     super(paramc4, paramByteBuffer);
/*   */   }
/*   */   
/*   */   public final void Cx() {
/*   */     byte b1 = this.Dx0, b2 = this.px0, b3 = this.v2;
/*   */     KI kI;
/*   */     if ((kI = km.a3.COm8(b1, b2, b3)) == null)
/*   */       return; 
/*   */     if (kI instanceof IF0 && ((b2 = this.Dx0) == 0 || b2 == 1)) {
/*   */       fV fV = fV.Ca;
/*   */       ot ot;
/*   */       if ((ot = (ot)(this.sw[b2]).ob.Z90(this.COM3)) == null)
/*   */         return; 
/*   */       ((IF0)kI).f00(this.eR);
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ps.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */