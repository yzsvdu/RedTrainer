/*  1 */ package f;public final class Gf0 extends Bi { public final void mL(c4 paramc4, ByteBuffer paramByteBuffer) { e6.Ti(this.com7, paramByteBuffer); paramByteBuffer
/*  2 */       .put(this.rI.Xm0);
/*    */     
/*  4 */     paramByteBuffer.put(this.Sa0);
/*    */     
/*  6 */     paramByteBuffer.put(this.V8);
/*  7 */     if ((this.V8 & 0x8) != 0) paramByteBuffer
/*  8 */         .put(this.mk);  if ((this
/*  9 */       .V8 & 0x10) != 0) paramByteBuffer
/*    */         
/* 11 */         .put(this.Lx.y1);  if ((this
/* 12 */       .V8 & 0x20) != 0) paramByteBuffer
/* 13 */         .put(this.import);  if ((this
/* 14 */       .V8 & 0x40) != 0) paramByteBuffer
/* 15 */         .put(this.C00);  }
/*    */ 
/*    */   
/*    */   public final String com7;
/*    */   public final ky rI;
/*    */   public final byte V8;
/*    */   public final byte mk;
/*    */   public final DO Lx;
/*    */   public final byte import;
/*    */   public final byte C00;
/*    */   public final byte Sa0;
/*    */   
/*    */   public Gf0(String paramString, ky paramky, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, byte paramByte1, byte paramByte2, DO paramDO, byte paramByte3, byte paramByte4) {
/*    */     super(37);
/*    */     this.com7 = paramString;
/*    */     this.rI = paramky;
/*    */     this.mk = paramByte1;
/*    */     this.Lx = paramDO;
/*    */     this.import = paramByte3;
/*    */     this.C00 = paramByte2;
/*    */     this.Sa0 = paramByte4;
/*    */     byte b = 0;
/*    */     if (paramBoolean1)
/*    */       b = (byte)1; 
/*    */     if (paramBoolean2)
/*    */       b = (byte)(b | 0x2); 
/*    */     if (paramBoolean3)
/*    */       b = (byte)(b | 0x4); 
/*    */     if (paramByte1 > 0)
/*    */       b = (byte)(b | 0x8); 
/*    */     if (paramDO != null)
/*    */       b = (byte)(b | 0x10); 
/*    */     if (paramByte3 != 0)
/*    */       b = (byte)(b | 0x20); 
/*    */     if (paramByte2 > 0)
/*    */       b = (byte)(b | 0x40); 
/*    */     this.V8 = b;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Gf0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */