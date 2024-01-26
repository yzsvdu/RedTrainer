/* 1 */ package f;public final class zd extends Bi { public final void mL(c4 paramc4, ByteBuffer paramByteBuffer) { paramByteBuffer.put(this.Rp0); paramByteBuffer
/*   */       
/* 3 */       .put((byte)this.Ws0);
/* 4 */     if (this.Ws0) { paramByteBuffer
/* 5 */         .putShort(this.X4); } else { paramByteBuffer
/*   */         
/* 7 */         .putInt(this.ZL0); }
/*   */      }
/*   */ 
/*   */   
/*   */   public byte Rp0;
/*   */   public int ZL0;
/*   */   public short X4;
/*   */   public boolean Ws0;
/*   */   
/*   */   public zd(byte paramByte, int paramInt, short paramShort, boolean paramBoolean) {
/*   */     super(48);
/*   */     this.Rp0 = paramByte;
/*   */     this.ZL0 = paramInt;
/*   */     this.X4 = paramShort;
/*   */     this.Ws0 = paramBoolean;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/zd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */