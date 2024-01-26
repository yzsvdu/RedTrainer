/* 1 */ package f;public final class kj extends Bi { public final void mL(c4 paramc4, ByteBuffer paramByteBuffer) { paramByteBuffer.put((byte)this.mh0.length); int arrayOfInt[], i; byte b;
/* 2 */     for (i = (arrayOfInt = this.mh0).length, b = 0; b < i; ) { paramByteBuffer
/* 3 */         .putInt(this[b]); b++; }
/*   */      }
/*   */ 
/*   */   
/*   */   public int[] mh0;
/*   */   
/*   */   public kj(int[] paramArrayOfint) {
/*   */     super(56);
/*   */     this.mh0 = paramArrayOfint;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/kj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */