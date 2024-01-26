/* 1 */ package f;public final class DQ extends Bi { public final void mL(c4 paramc4, ByteBuffer paramByteBuffer) { paramByteBuffer.put(this.ze); if ((this
/* 2 */       .ze & 0x1) != 0) { paramByteBuffer
/* 3 */         .put(this.wj);
/* 4 */       e6.Ti(this.J2, paramByteBuffer); }  if ((this.ze & 0x2) != 0) { paramByteBuffer
/* 5 */         .put((byte)this.tF.length); byte[] arrayOfByte; int i; byte b;
/* 6 */       for (i = (arrayOfByte = this.tF).length, b = 0; b < i; ) { paramByteBuffer
/* 7 */           .put(this[b]); b++; }
/*   */        }
/*   */      }
/*   */ 
/*   */   
/*   */   public byte ze = 2;
/*   */   public final byte wj;
/*   */   public final String J2;
/*   */   public final byte[] tF;
/*   */   
/*   */   public DQ(byte[] paramArrayOfbyte) {
/*   */     super(28);
/*   */     this.tF = paramArrayOfbyte;
/*   */     this.wj = -1;
/*   */     this.J2 = "";
/*   */   }
/*   */   
/*   */   public DQ(byte paramByte, String paramString) {
/*   */     super(28);
/*   */     this.tF = new byte[0];
/*   */     this.wj = paramByte;
/*   */     this.J2 = paramString;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/DQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */