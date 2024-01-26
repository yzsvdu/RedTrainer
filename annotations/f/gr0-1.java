/* 1 */ package f;public final class gr0 { public final ln0 aU() { Z4 z4 = Z4.T0;
/*   */     
/* 3 */     return (ln0)this.V1
/* 4 */       .Ha0(this.vK0); }
/*   */ 
/*   */   
/*   */   public static final byte[] g6 = new byte[0];
/*   */   public byte vK0;
/*   */   public DG CA0;
/*   */   public byte[] mi;
/*   */   
/*   */   public gr0(ByteBuffer paramByteBuffer) {
/*   */     B9 b9;
/*   */     this.vK0 = paramByteBuffer.get();
/*   */     this.CA0 = DG.dM(paramByteBuffer.get());
/*   */     paramByteBuffer.get();
/*   */     this();
/*   */     for (byte b = 0; b < 3; b++) {
/*   */       byte b1;
/*   */       if ((b1 = paramByteBuffer.get()) != 0)
/*   */         b9.Be(b1); 
/*   */     } 
/*   */     this.mi = b9.m9();
/*   */     paramByteBuffer.position(paramByteBuffer.position() + 2);
/*   */     fz0();
/*   */   }
/*   */   
/*   */   public gr0(DG paramDG, byte[] paramArrayOfbyte) {
/*   */     this.vK0 = 0;
/*   */     this.CA0 = paramDG;
/*   */     this.mi = paramArrayOfbyte;
/*   */     fz0();
/*   */   }
/*   */   
/*   */   public final void fz0() {
/*   */     Arrays.sort(this.mi);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/gr0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */