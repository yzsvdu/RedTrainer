/*  1 */ package f;public final class Ey extends Kl0 { public final void sM() { this
/*  2 */       .jr0 = this.Ws.getShort();
/*    */     byte b;
/*  4 */     for (this.lF0 = this.Ws.get(), this.bo0 = new HS[R00()], b = 0; b < this.bo0.length; ) {
/*  5 */       HS hS; int i = this.Ws.getInt();
/*    */       
/*  7 */       DK dK = DK.com4(this.Ws.get());
/*  8 */       int j = this.Ws.getInt();
/*  9 */       int k = this.Ws.getInt(); byte b1; FV[] arrayOfFV;
/*    */       byte b2;
/* 11 */       for (arrayOfFV = new FV[b1 = this.Ws.get()], b2 = 0; b2 < b1; ) { arrayOfFV[b2] = k60(); b2++; }  this(i, dK, j, k, arrayOfFV); this.bo0[b] = hS; b++;
/*    */     }  }
/*    */ 
/*    */   
/*    */   public short jr0;
/*    */   public byte lF0;
/*    */   public HS[] bo0;
/*    */   
/*    */   public Ey(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramc4, paramByteBuffer);
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     ro ro = r8();
/*    */     short s = this.jr0;
/*    */     byte b = this.lF0;
/*    */     HS[] arrayOfHS = this.bo0;
/*    */     ve ve;
/*    */     if ((ve = ((R8)this).YG0.MH0.yq0) != null)
/*    */       kO(s, b, arrayOfHS); 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */