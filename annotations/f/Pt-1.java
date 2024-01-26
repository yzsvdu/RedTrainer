/* 1 */ package f;public final class Pt extends Bi { public final void mL(c4 paramc4, ByteBuffer paramByteBuffer) { paramByteBuffer.put((byte)this.BO.length); byte b = 0; int[] arrayOfInt; while (b < (
/* 2 */       arrayOfInt = this.BO).length) { paramByteBuffer
/* 3 */         .putInt(arrayOfInt[b]); b++; }
/*   */      }
/*   */ 
/*   */   
/*   */   public int[] BO;
/*   */   
/*   */   public Pt(int[] paramArrayOfint) {
/*   */     super(158);
/*   */     this.BO = paramArrayOfint;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Pt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */