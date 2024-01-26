/* 1 */ package f;public final class Tn0 extends Bi { public final void mL(c4 paramc4, ByteBuffer paramByteBuffer) { paramByteBuffer.put(this.Bb0); paramByteBuffer
/*   */       
/* 3 */       .put((byte)this.QB0.length); byte b = 0; byte[] arrayOfByte; while (b < (
/* 4 */       arrayOfByte = this.QB0).length) { paramByteBuffer
/* 5 */         .put(arrayOfByte[b]); b++; }
/*   */      }
/*   */ 
/*   */   
/*   */   public byte Bb0;
/*   */   public byte[] QB0;
/*   */   
/*   */   public Tn0(byte paramByte, byte[] paramArrayOfbyte) {
/*   */     super(40);
/*   */     this.Bb0 = paramByte;
/*   */     this.QB0 = paramArrayOfbyte;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Tn0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */