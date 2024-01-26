/*  1 */ package f;public final class k80 extends Bi { public final void mL(c4 paramc4, ByteBuffer paramByteBuffer) { paramByteBuffer.putShort(this.Am0); paramByteBuffer
/*    */ 
/*    */ 
/*    */       
/*  5 */       .putInt(this.HE0.t70.q10);
/*    */ 
/*    */ 
/*    */     
/*  9 */     paramByteBuffer.put(this.HE0.yn.nh);
/*    */     
/* 11 */     short[] arrayOfShort = this.HE0.Bl0; byte b = 0; while (b < this.length) {
/* 12 */       paramByteBuffer
/* 13 */         .putShort(this[b]); b++;
/*    */     }  }
/*    */ 
/*    */   
/*    */   public final short Am0;
/*    */   public final jH HE0;
/*    */   
/*    */   public k80(short paramShort, jH paramjH) {
/*    */     super(58);
/*    */     this.Am0 = paramShort;
/*    */     this.HE0 = paramjH;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/k80.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */