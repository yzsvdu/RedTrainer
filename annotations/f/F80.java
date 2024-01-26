/*   */ package f;public final class F80 { public final void Com3(int paramInt, ByteBuffer paramByteBuffer) {
/* 2 */     paramByteBuffer.put((byte)((fQ)this.Dx.MF(Integer.valueOf(paramInt), null)).Z8); for (Hc0 hc0 = ((fQ)this.Dx.MF(Integer.valueOf(paramInt), null)).r30(); hasNext(); ) { Tp0 tp0; paramByteBuffer.put((tp0 = (Tp0)next()).xr0); paramByteBuffer.putInt(tp0.cE0); }
/*   */   
/*   */   }
/*   */   
/*   */   public int lq;
/*   */   public int da;
/*   */   public byte Z0;
/*   */   public eM Dx;
/*   */   
/*   */   public F80(int paramInt1, int paramInt2) {
/*   */     eM eM1;
/*   */     this(4);
/*   */     this.Dx = this;
/*   */     this.lq = paramInt1;
/*   */     this.da = paramInt2;
/*   */     this.Z0 = 0;
/*   */   }
/*   */   
/*   */   public F80(ByteBuffer paramByteBuffer, int paramInt) {
/*   */     eM eM1;
/*   */     this(4);
/*   */     this.Dx = eM1;
/*   */     if (paramInt >= 3) {
/*   */       this.lq = paramByteBuffer.getInt();
/*   */     } else {
/*   */       this.lq = paramByteBuffer.get() & 0xFF;
/*   */     } 
/*   */     this.da = paramByteBuffer.getInt();
/*   */     if (((this.Z0 = paramByteBuffer.get()) & 0x1) != 0)
/*   */       zi0(0, paramByteBuffer); 
/*   */     if ((this.Z0 & 0x2) != 0)
/*   */       zi0(1, paramByteBuffer); 
/*   */     if ((this.Z0 & 0x4) != 0)
/*   */       zi0(2, paramByteBuffer); 
/*   */     if ((this.Z0 & 0x8) != 0)
/*   */       zi0(3, paramByteBuffer); 
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     return this.lq * 1000000 + this.da;
/*   */   }
/*   */   
/*   */   public final void zi0(int paramInt, ByteBuffer paramByteBuffer) {
/*   */     byte b = paramByteBuffer.get();
/*   */     this(b);
/*   */     fQ fQ;
/*   */     for (byte b1 = 0; b1 < b; b1++) {
/*   */       Tp0 tp0;
/*   */       byte b2 = paramByteBuffer.get();
/*   */       int i = paramByteBuffer.getInt();
/*   */       this(i, b2);
/*   */       fQ.Com3(tp0);
/*   */     } 
/*   */     this.Dx.Ed0(Integer.valueOf(paramInt), fQ);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/F80.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */