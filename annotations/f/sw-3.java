/*    */ package f;
/*  2 */ public final class sw extends Bi { public mJ EL0; public final Ue0 xR; public final short z5; public sw(mJ parammJ) { super(50); this.EL0 = parammJ; this.xR = this; this.z5 = c; this.ri0 = bool1; this.cOM1 = bool2; } public final int ri0; public final byte cOM1; public Y LK; public final void mL(c4 paramc4, ByteBuffer paramByteBuffer) { mJ mJ1; if ((mJ1 = this.EL0) == null) { i = 0; } else { i = i.md; i = (byte)(i.FI0 & 0xF | i << 4); }  paramByteBuffer.put(i);
/*    */ 
/*    */     
/*  5 */     paramByteBuffer.put(this.xR.Com7); int i;
/*  6 */     if ((i = this.xR.ordinal()) != 0) { if (i != 1) { if (i == 2 || i == 15) paramByteBuffer
/*  7 */             .putShort(this.z5);  } else { paramByteBuffer
/*    */           
/*  9 */           .putShort(this.z5);
/*    */         
/* 11 */         paramByteBuffer.putInt(this.ri0);
/*    */         
/* 13 */         paramByteBuffer
/*    */           
/* 15 */           .put(this.cOM1); }  } else { paramByteBuffer.putShort(this.z5); paramByteBuffer.put(this.cOM1); }
/*    */      }
/*    */ 
/*    */   
/*    */   public sw(mJ parammJ, Y paramY, int paramInt, byte paramByte) {
/*    */     super(50);
/*    */     this.EL0 = parammJ;
/*    */     this.xR = this;
/*    */     this.z5 = paramY.r00();
/*    */     this.ri0 = paramInt;
/*    */     this.cOM1 = paramByte;
/*    */     this.LK = paramY;
/*    */   }
/*    */   
/*    */   public sw(mJ parammJ, short paramShort, byte paramByte) {
/*    */     super(50);
/*    */     this.EL0 = parammJ;
/*    */     this.xR = this;
/*    */     this.z5 = paramShort;
/*    */     this.ri0 = 0;
/*    */     this.cOM1 = paramByte;
/*    */   }
/*    */   
/*    */   public sw(mJ parammJ, Ue0 paramUe0, short paramShort) {
/*    */     super(50);
/*    */     this.EL0 = parammJ;
/*    */     this.xR = paramUe0;
/*    */     this.z5 = paramShort;
/*    */     this.ri0 = 0;
/*    */     this.cOM1 = 0;
/*    */   }
/*    */   
/*    */   public sw(mJ parammJ, Ue0 paramUe0) {
/*    */     super(50);
/*    */     this.EL0 = parammJ;
/*    */     this.xR = paramUe0;
/*    */     this.z5 = 0;
/*    */     this.ri0 = 0;
/*    */     this.cOM1 = 0;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/sw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */