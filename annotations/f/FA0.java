/* 1 */ package f;public final class FA0 { public final void sV(int paramInt) { if (this.pF0 == paramInt) return;  throw new RuntimeException(B40.df("Header magic mismatch = ")
/* 2 */         .append(this.pF0).append(" vs expected ").append(paramInt).toString()); }
/*   */ 
/*   */   
/*   */   public int pF0;
/*   */   public int w6;
/*   */   public short gc0;
/*   */   public short ua0;
/*   */   
/*   */   public FA0(ByteBuffer paramByteBuffer) {
/*   */     this.pF0 = paramByteBuffer.getInt();
/*   */     paramByteBuffer.getShort();
/*   */     paramByteBuffer.getShort();
/*   */     this.w6 = paramByteBuffer.getInt();
/*   */     this.gc0 = paramByteBuffer.getShort();
/*   */     this.ua0 = paramByteBuffer.getShort();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/FA0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */