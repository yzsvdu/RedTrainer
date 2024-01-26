/* 1 */ package f;public final class PG0 extends Bi { public final void mL(c4 paramc4, ByteBuffer paramByteBuffer) { paramByteBuffer.put((byte)this.g1); if (this
/* 2 */       .g1) { paramByteBuffer
/* 3 */         .putInt(this.SI);
/*   */       
/* 5 */       paramByteBuffer.putShort(this.Hg0); } else { paramByteBuffer
/*   */         
/* 7 */         .putInt(this.q9); }
/*   */      }
/*   */ 
/*   */   
/*   */   public boolean g1 = false;
/*   */   public int q9;
/*   */   public int SI;
/*   */   public short Hg0;
/*   */   
/*   */   public PG0(int paramInt) {
/*   */     super(76);
/*   */     this.q9 = paramInt;
/*   */   }
/*   */   
/*   */   public PG0(int paramInt, short paramShort) {
/*   */     super(76);
/*   */     this.SI = paramInt;
/*   */     this.Hg0 = paramShort;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/PG0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */