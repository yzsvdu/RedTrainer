/*  1 */ package f;public final class Dw extends vO { public final void rf0(ByteBuffer paramByteBuffer) { long l; if (((l = this.lt) & 0x20000000L) != 0L) { this.p00 = (int)(l & 0xFFFFL); } else { paramByteBuffer.position(this.Vk + (int)(l & 0xFFFFL)); if (((l = this.lt) & 0x40000000L) != 0L) { if ((l & 0x80000000L) != 0L) { b = 4; } else { b = 2; }  } else { b = 1; }  int i, arrayOfInt[]; byte b; for (arrayOfInt = new int[i = (int)(((l & 0x1FFF0000L) >> 16L) / b)], b = 0; b < i; ) { arrayOfInt[b] = paramByteBuffer.getShort() & 0xFFFF; b++; }  this
/*  2 */         .Ck0 = arrayOfInt; }  if (((l = this.UW) & 0x20000000L) != 0L) { this.Nn = (int)(l & 0xFFFFL); } else { paramByteBuffer.position(this.Vk + (int)(l & 0xFFFFL)); if (((l = this.UW) & 0x40000000L) != 0L) { if ((l & 0x80000000L) != 0L) { b = 4; } else { b = 2; }  } else { b = 1; }
/*  3 */        int i, arrayOfInt[]; byte b; for (arrayOfInt = new int[i = (int)(((l & 0x1FFF0000L) >> 16L) / b)], b = 0; b < i; ) { arrayOfInt[b] = paramByteBuffer.getShort() & 0xFFFF; b++; }  this
/*  4 */         .uh = arrayOfInt; }  if (((l = this.II) & 0x20000000L) != 0L) { this.RF0 = (int)(l & 0xFFFFL); } else { paramByteBuffer.position(this.Vk + (int)(l & 0xFFFFL)); if (((l = this.II) & 0x40000000L) != 0L) { if ((l & 0x80000000L) != 0L) { b = 4; } else { b = 2; }  } else { b = 1; }
/*  5 */        int i, arrayOfInt[]; byte b; for (arrayOfInt = new int[i = (int)(((l & 0x1FFF0000L) >> 16L) / b)], b = 0; b < i; ) { arrayOfInt[b] = paramByteBuffer.getShort() & 0xFFFF; b++; }  this
/*  6 */         .lPT3 = arrayOfInt; }  if (((l = this.G0) & 0x20000000L) != 0L) { this.T00 = (int)(l & 0xFFFFL); } else { paramByteBuffer.position(this.Vk + (int)(l & 0xFFFFL)); if (((l = this.G0) & 0x40000000L) != 0L) { if ((l & 0x80000000L) != 0L) { b = 4; } else { b = 2; }  } else { b = 1; }
/*  7 */        int i, arrayOfInt[]; byte b; for (arrayOfInt = new int[i = (int)(((l & 0x1FFF0000L) >> 16L) / b)], b = 0; b < i; ) { arrayOfInt[b] = paramByteBuffer.getShort() & 0xFFFF; b++; }  this
/*  8 */         .sL = arrayOfInt; }  if (((l = this.ow0) & 0x20000000L) != 0L) { this.XB0 = (byte)(int)(l & 0xFFFFL); } else { paramByteBuffer.position(this.Vk + (int)(l & 0xFFFFL)); if (((l = this.ow0) & 0x40000000L) != 0L) { if ((l & 0x80000000L) != 0L) { b = 4; } else { b = 2; }  } else { b = 1; }
/*  9 */        int i, arrayOfInt[]; byte b; for (arrayOfInt = new int[i = (int)(((l & 0x1FFF0000L) >> 16L) / b)], b = 0; b < i; ) { arrayOfInt[b] = paramByteBuffer.get(); b++; }  this
/* 10 */         .Yv0 = arrayOfInt; }
/*    */      }
/*    */ 
/*    */   
/*    */   public long lt;
/*    */   public long UW;
/*    */   public long II;
/*    */   public long G0;
/*    */   public long ow0;
/*    */   public int p00;
/*    */   public int Nn;
/*    */   public int RF0;
/*    */   public int T00;
/*    */   public byte XB0;
/*    */   public int[] Ck0;
/*    */   public int[] uh;
/*    */   public int[] lPT3;
/*    */   public int[] sL;
/*    */   public int[] Yv0;
/*    */   
/*    */   public static int ge(int paramInt1, int paramInt2, long paramLong, int[] paramArrayOfint) {
/*    */     if ((paramLong & 0x20000000L) == 0L)
/*    */       if ((paramLong & 0xC0000000L) == 0L) {
/*    */         if (paramArrayOfint.length <= paramInt2)
/*    */           return paramInt1; 
/*    */         paramInt1 = paramArrayOfint[paramInt2];
/*    */       } else if ((paramLong & 0x40000000L) != 0L) {
/*    */         if ((paramInt2 & 0x1) != 0) {
/*    */           if (paramInt2 > (paramLong &= 0x1FFF0000L) >> 16L) {
/*    */             paramInt1 = paramArrayOfint[(int)(((paramLong & 0x1FFF0000L) >> 16L >> 1L) + 1L)];
/*    */           } else {
/*    */             paramInt1 = (paramArrayOfint[paramInt1 = paramInt2 >> 1] + paramArrayOfint[paramInt1 + 1]) / 2;
/*    */           } 
/*    */         } else {
/*    */           paramInt1 = paramArrayOfint[paramInt2 >> 1];
/*    */         } 
/*    */       } else if ((paramLong & 0x80000000L) != 0L) {
/*    */         if ((paramInt1 = paramInt2 & 0x3) != 0) {
/*    */           if (paramInt2 > (paramLong = (paramLong & 0x1FFF0000L & 0x1FFF0000L) >> 16L)) {
/*    */             paramInt1 = paramArrayOfint[(int)((paramLong >> 2L) + paramInt1)];
/*    */           } else if ((paramInt2 & 0x1) != 0) {
/*    */             if ((paramInt2 & 0x2) != 0) {
/*    */               paramInt2 = (paramInt1 = paramInt2 >> 2) + 1;
/*    */             } else {
/*    */               paramInt1 = (paramInt2 >>= 2) + 1;
/*    */             } 
/*    */             paramInt1 = paramArrayOfint[paramInt1];
/*    */             paramInt1 = (paramArrayOfint[paramInt2] + (paramInt2 = paramArrayOfint[paramInt2]) + paramInt2 + paramInt1) / 4;
/*    */           } else {
/*    */             paramInt1 = (paramArrayOfint[paramInt1 = paramInt2 >> 2] + paramArrayOfint[paramInt1 + 1]) / 2;
/*    */           } 
/*    */         } else {
/*    */           paramInt1 = paramArrayOfint[paramInt2 >> 2];
/*    */         } 
/*    */       } else {
/*    */         paramInt1 = -1;
/*    */       }  
/*    */     return paramInt1;
/*    */   }
/*    */   
/*    */   public final void we0(ByteBuffer paramByteBuffer, int... paramVarArgs) {
/*    */     this.Vk = 0;
/*    */     this.lt = paramByteBuffer.getInt();
/*    */     this.UW = paramByteBuffer.getInt();
/*    */     this.II = paramByteBuffer.getInt();
/*    */     this.G0 = paramByteBuffer.getInt();
/*    */     this.ow0 = paramByteBuffer.getInt();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Dw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */