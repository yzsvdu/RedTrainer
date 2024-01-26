/* 1 */ package f;public final class ej { public static void Ap0(byte paramByte, z paramz) { int i, j, k = (j = CF[i = paramz.eA]) >> 3; if (((paramByte = (byte)(paramByte & 0xF)) & 0x1) != 0) k += j >> 2;  if ((paramByte & 0x2) != 0) k += j >> 1;  if ((paramByte & 0x4) != 0) k += j;  if ((paramByte & 0x8) != 0) { paramz.qh -= k; } else { paramz.qh += k; }  if (paramz.qh < -32768) paramz.qh = -32768;  if (paramz.qh > 32767) paramz.qh = 32767; 
/* 2 */     if ((paramz.eA = i + nu[paramByte & 0x7]) < 0) paramz
/* 3 */         .eA = 0;  if (paramz.eA > 88) paramz.eA = 88;  }
/*   */ 
/*   */   
/*   */   public static final int[] CF = new int[] { 
/*   */       7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 
/*   */       19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 
/*   */       50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 
/*   */       130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 
/*   */       337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 
/*   */       876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 
/*   */       2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 
/*   */       5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 
/*   */       15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767 };
/*   */   public static final int[] nu = new int[] { 
/*   */       -1, -1, -1, -1, 2, 4, 6, 8, -1, -1, 
/*   */       -1, -1, 2, 4, 6, 8 };
/*   */   public ByteBuffer Od0;
/*   */   public byte lV;
/*   */   public int pi0;
/*   */   public int LPT5;
/*   */   public int Bq0;
/*   */   public int b40;
/*   */   public int fv;
/*   */   public int Yx;
/*   */   
/*   */   public ej(ByteBuffer paramByteBuffer) {
/*   */     byte b1;
/*   */     this.lV = paramByteBuffer.get();
/*   */     paramByteBuffer.get();
/*   */     this.pi0 = paramByteBuffer.getShort() & 0xFFFF;
/*   */     paramByteBuffer.getShort();
/*   */     this.LPT5 = HB0(this.lV);
/*   */     this.Bq0 = (paramByteBuffer.getShort() & 0xFFFF) * 4;
/*   */     int i = paramByteBuffer.getInt() * 4;
/*   */     if (this.lV == 2) {
/*   */       b1 = 16;
/*   */       i = this.Bq0 + i - 4;
/*   */       this.fv = paramByteBuffer.getShort() & 0xFFFF;
/*   */       this.Yx = paramByteBuffer.get() & Byte.MAX_VALUE;
/*   */     } else {
/*   */       b1 = 12;
/*   */       i = this.Bq0 + i;
/*   */     } 
/*   */     if (this.lV == 2) {
/*   */       this.b40 = i * 4 + 2;
/*   */     } else {
/*   */       this.b40 = i / this.LPT5 / 8;
/*   */     } 
/*   */     this.Od0 = paramByteBuffer;
/*   */     (paramByteBuffer = paramByteBuffer.duplicate().order(paramByteBuffer.order())).position(b1);
/*   */     this.Od0.limit(b1 + i);
/*   */     this.Od0 = this.Od0.slice();
/*   */     byte b;
/*   */     if ((b = this.lV) == 2) {
/*   */       this.Bq0 = this.Bq0 * 2 - 8 + 1;
/*   */     } else if (b == 1) {
/*   */       this.Bq0 *= 2;
/*   */     } 
/*   */   }
/*   */   
/*   */   public static int HB0(int paramInt) {
/*   */     return (paramInt == 0) ? 8 : 16;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ej.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */