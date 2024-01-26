/* 1 */ package f;public final class zM { public static ZH Qz(byte[] paramArrayOfbyte, f1 paramf1) { Uc uc = Uc.xi0; this(8, 8, uc); ZH zH; int i, j; byte b; for (i = 0, j = 0, b = 0; b < paramArrayOfbyte.length; ) { int k = b1 >> 4 & 0xF; byte b1; int m; if ((m = (b1 = paramArrayOfbyte[b]) & 0xF) > 0)
/* 2 */       { m = paramf1.LPT2[m];
/* 3 */         zH.Con.YO(i, j, m); }  if (k > 0) { m = i + 1;
/*   */         
/* 5 */         k = paramf1.LPT2[k];
/* 6 */         zH.Con.YO(m, j, k); }  if ((i += 2) % 8 == 
/* 7 */         0) { if (++j % 8 == 0) { j -= 8; } else { i -= 8; }  if (i == 8) { i = j + 8; j = 0; i = j = i; }  }  b++; }  return zH; }
/*   */ 
/*   */   
/*   */   public final int Yb;
/*   */   public final ZH[][] Qs;
/*   */   
/*   */   public zM(ByteBuffer paramByteBuffer, int paramInt1, f1 paramf1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/*   */     this.Qs = new ZH[paramInt4][paramInt2];
/*   */     this.Yb = paramInt3;
/*   */     paramByteBuffer = paramByteBuffer.duplicate().order(byteOrder);
/*   */     ByteOrder byteOrder;
/*   */     ByteBuffer byteBuffer;
/*   */     (byteBuffer = paramByteBuffer.duplicate().order(byteOrder = ByteOrder.LITTLE_ENDIAN)).position(paramInt1);
/*   */     byte[] arrayOfByte = new byte[32];
/*   */     int[] arrayOfInt = new int[paramInt2];
/*   */     int i;
/*   */     for (i = 0; i < paramInt2; i++)
/*   */       arrayOfInt[i] = pN.tx0(byteBuffer.getInt()); 
/*   */     while (paramInt5 > 0) {
/*   */       int j;
/*   */       i = arrayOfInt[j = paramInt2 - 1];
/*   */       while (j > 0) {
/*   */         arrayOfInt[j] = arrayOfInt[j - 1];
/*   */         j--;
/*   */       } 
/*   */       arrayOfInt[0] = i;
/*   */       paramInt5--;
/*   */     } 
/*   */     for (paramInt5 = 0; paramInt5 < paramInt2; paramInt5++) {
/*   */       paramByteBuffer.position(arrayOfInt[paramInt5]);
/*   */       for (byte b = 0; b < paramInt4; b++) {
/*   */         paramByteBuffer.get(arrayOfByte);
/*   */         this.Qs[b][paramInt5] = Qz(arrayOfByte, paramf1);
/*   */       } 
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/zM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */