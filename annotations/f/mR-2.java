/*  1 */ package f;public final class mR extends Mg { public final void rT(ByteBuffer paramByteBuffer) { e6.Ti(this.Ii0, paramByteBuffer); paramByteBuffer.put((byte)this.xG0); paramByteBuffer
/*    */       
/*  3 */       .put((byte)this.U2.length);
/*    */     
/*  5 */     paramByteBuffer.put(this.U2); nt nt1;
/*  6 */     if ((nt1 = this.tp0) != null && nt1
/*  7 */       .rw) { paramByteBuffer
/*  8 */         .put((byte)1);
/*    */ 
/*    */ 
/*    */       
/* 12 */       paramByteBuffer.put((byte)this.tp0.D8.length);
/*    */ 
/*    */       
/* 15 */       paramByteBuffer.put(this.tp0.D8); } else { paramByteBuffer
/* 16 */         .put((byte)0);
/* 17 */       e6.Ti(this.w6, paramByteBuffer);
/* 18 */       paramByteBuffer.put((byte)this.W60); }
/* 19 */      e6.Ti(h1.pB0, paramByteBuffer);
/* 20 */     paramByteBuffer.putInt(25385);
/*    */     
/* 22 */     paramByteBuffer.putInt(Pa0.vH0);
/*    */ 
/*    */     
/* 25 */     paramByteBuffer.put(yG.x3.kZ);
/*    */     
/* 27 */     paramByteBuffer.put((byte)km.n20.Is.length);
/*    */     
/* 29 */     paramByteBuffer.put(km.n20.Is); }
/*    */ 
/*    */   
/*    */   public String Ii0;
/*    */   public String w6;
/*    */   public boolean xG0;
/*    */   public boolean W60;
/*    */   public nt tp0;
/*    */   public byte[] U2;
/*    */   
/*    */   public mR(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, nt paramnt) {
/*    */     super(17);
/*    */     this.Ii0 = paramString1;
/*    */     this.w6 = paramString2;
/*    */     this.xG0 = paramBoolean1;
/*    */     this.W60 = paramBoolean2;
/*    */     this.tp0 = paramnt;
/*    */     this.U2 = km.iE0.Ml();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/mR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */