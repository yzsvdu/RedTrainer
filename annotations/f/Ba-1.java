/*  1 */ package f;public final class Ba extends Kl0 { public final void sM() { this
/*  2 */       .u10 = this.Ws.get();
/*    */     
/*  4 */     this.Lu0 = this.Ws.getShort();
/*  5 */     if ((this
/*  6 */       .Jh0 = this.Ws.get()) == 4) this
/*    */ 
/*    */ 
/*    */         
/* 10 */         .KD = new sF0(aq0.BQ(this.Ws.get()), this.Ws.getShort());  }
/*    */ 
/*    */   
/*    */   public byte u10;
/*    */   public short Lu0;
/*    */   public byte Jh0;
/*    */   public sF0 KD;
/*    */   
/*    */   public Ba(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramc4, paramByteBuffer);
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     Gp0 gp0;
/*    */     if ((gp0 = km.MR) != null) {
/*    */       byte b1 = this.u10;
/*    */       short s = this.Lu0;
/*    */       byte b2 = this.Jh0;
/*    */       sF0 sF01 = this.KD;
/*    */       gp0.W.add(new f5(b1, s, b2, sF01));
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ba.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */