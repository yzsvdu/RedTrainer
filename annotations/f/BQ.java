/*  1 */ package f;public final class BQ extends Bi { public final void mL(c4 paramc4, ByteBuffer paramByteBuffer) { paramByteBuffer.put(this.JL0); paramByteBuffer
/*    */       
/*  3 */       .put((byte)this.zD);
/*    */     
/*  5 */     paramByteBuffer.putInt(this.bD0);
/*    */     
/*  7 */     paramByteBuffer.putShort(this.F80);
/*    */     
/*  9 */     paramByteBuffer.putShort(this.hG0);
/* 10 */     if (this.zD) { paramByteBuffer
/* 11 */         .putInt(this.catch);
/*    */       
/* 13 */       paramByteBuffer.putShort(this.P3);
/*    */       
/* 15 */       paramByteBuffer.putShort(this.wl); }
/*    */      }
/*    */ 
/*    */   
/*    */   public byte JL0;
/*    */   public boolean zD = false;
/*    */   public int bD0;
/*    */   public short F80;
/*    */   public short hG0;
/*    */   public int catch;
/*    */   public short P3;
/*    */   public short wl;
/*    */   
/*    */   public BQ(Kr0 paramKr01, Kr0 paramKr02, byte paramByte) {
/*    */     super(45);
/*    */     this.JL0 = paramByte;
/*    */     this.bD0 = paramKr01.VC();
/*    */     this.F80 = paramKr01.nul();
/*    */     this.hG0 = paramKr01.zD();
/*    */     if (paramKr02 != null) {
/*    */       this.zD = true;
/*    */       this.catch = paramKr02.VC();
/*    */       this.P3 = paramKr02.nul();
/*    */       this.wl = paramKr02.zD();
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/BQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */