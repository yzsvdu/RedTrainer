/* 1 */ package f;public final class yN extends Bi { public final void mL(c4 paramc4, ByteBuffer paramByteBuffer) { paramByteBuffer.put((byte)this.S1.length); int arrayOfInt[], i; byte b;
/* 2 */     for (i = (arrayOfInt = this.S1).length, b = 0; b < i; ) { paramByteBuffer
/* 3 */         .putInt(arrayOfInt[b]); b++; }  paramByteBuffer
/*   */       
/* 5 */       .put(this.X00); }
/*   */ 
/*   */   
/*   */   public int[] S1;
/*   */   public byte X00;
/*   */   
/*   */   public yN(byte paramByte, int[] paramArrayOfint) {
/*   */     super(27);
/*   */     this.S1 = paramArrayOfint;
/*   */     this.X00 = paramByte;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/yN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */