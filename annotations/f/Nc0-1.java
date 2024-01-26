/*  1 */ package f;public final class Nc0 extends Kl0 { public final void sM() { this
/*  2 */       .aY = this.Ws.get();
/*    */     
/*  4 */     this.It0 = this.Ws.get();
/*    */     
/*  6 */     this.AC = this.Ws.get();
/*    */     
/*  8 */     this.dH0 = this.Ws.getShort();
/*    */     
/* 10 */     this.uq0 = this.Ws.getShort();
/*    */     
/* 12 */     this.G4 = this.Ws.get();
/*    */     
/* 14 */     this.Dm0 = this.Ws.get(); }
/*    */ 
/*    */   
/*    */   public byte aY;
/*    */   public byte It0;
/*    */   public byte AC;
/*    */   public short dH0;
/*    */   public short uq0;
/*    */   public byte G4;
/*    */   public byte Dm0;
/*    */   
/*    */   public Nc0(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramc4, paramByteBuffer);
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     byte b1 = this.aY;
/*    */     byte b2 = this.It0;
/*    */     byte b3 = this.AC;
/*    */     KI kI;
/*    */     if ((kI = km.a3.COm8(b1, b2, b3)) == null)
/*    */       return; 
/*    */     HV hV;
/*    */     if ((hV = kI.rH0()) == null)
/*    */       return; 
/*    */     NI0 nI0;
/*    */     if ((nI0 = hV.YE0((short)this.Dm0)) == null)
/*    */       return; 
/*    */     short s1 = this.dH0;
/*    */     short s2 = this.uq0;
/*    */     byte b4 = this.G4;
/*    */     xr0 xr0;
/*    */     if ((xr0 = kI.v50(s1, s2, b4)) == null)
/*    */       return; 
/*    */     nI0.Vy0(this.dH0);
/*    */     nI0.Jz0(this.uq0);
/*    */     nI0.FN(xr0.i00());
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Nc0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */