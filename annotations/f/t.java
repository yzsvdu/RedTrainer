/* 1 */ package f;public final class t extends Bi { public final void mL(c4 paramc4, ByteBuffer paramByteBuffer) { paramByteBuffer
/* 2 */       .putShort(this.vE0.mm);
/*   */ 
/*   */     
/* 5 */     paramByteBuffer.putShort(this.vE0.Yu0);
/*   */     
/* 7 */     byte b = this.vE0.g50;
/* 8 */     if (this.FC0) b = (byte)(b | 0x80);  if (this.tl) b = (byte)(b | 0x40);  paramByteBuffer
/* 9 */       .put(b); }
/*   */ 
/*   */   
/*   */   public final G5 vE0;
/*   */   public final boolean FC0;
/*   */   public final boolean tl;
/*   */   
/*   */   public t(G5 paramG5, boolean paramBoolean1, boolean paramBoolean2) {
/*   */     super(6);
/*   */     this.vE0 = paramG5;
/*   */     this.FC0 = paramBoolean1;
/*   */     this.tl = paramBoolean2;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/t.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */