/*  1 */ package f;public final class MU extends a10 { public final void sM() { this
/*  2 */       .bw = this.Ws.get();
/*    */     
/*  4 */     this.F = this.Ws.getShort();
/*    */     
/*  6 */     this.Tg = this.Ws.getInt();
/*    */     
/*  8 */     this.rX = this.Ws.getShort();
/*    */     
/* 10 */     this.UG = this.Ws.getShort();
/*    */     
/* 12 */     this.Zp = this.Ws.get(); }
/*    */ 
/*    */   
/*    */   public byte bw;
/*    */   public short F;
/*    */   public int Tg;
/*    */   public short rX;
/*    */   public short UG;
/*    */   public byte Zp;
/*    */   
/*    */   public MU(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramByteBuffer, paramc4);
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     byte b1 = this.bw;
/*    */     short s1 = this.F;
/*    */     int i = this.Tg;
/*    */     short s2 = this.rX, s3 = this.UG;
/*    */     byte b2 = this.Zp;
/*    */     ro ro;
/*    */     P4 p4;
/*    */     if ((p4 = (ro = r8()).Ld) != null) {
/*    */       if (p4.ad0) {
/*    */         Rd0 rd0;
/*    */         this(b2, i, s2, s3);
/*    */         p4.mR[b1][s1] = rd0;
/*    */         p4.U2 = true;
/*    */       } 
/*    */       if (b1 == p4.QO)
/*    */         ro.ow(); 
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/MU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */